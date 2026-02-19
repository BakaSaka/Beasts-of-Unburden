package net.mcreator.beastsofunburden.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.world.inventory.AnimalChestGUIMenu;
import net.mcreator.beastsofunburden.procedures.WandOfVariationEntityHitProcedure;
import net.mcreator.beastsofunburden.procedures.DragonVariationSpawnProcedure;
import net.mcreator.beastsofunburden.init.BouModEntities;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.Set;

import io.netty.buffer.Unpooled;

@Mod.EventBusSubscriber
public class BabyDragonVillagerEntity extends Animal {
	public static final EntityDataAccessor<Integer> DATA_variant = SynchedEntityData.defineId(BabyDragonVillagerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.defineId(BabyDragonVillagerEntity.class, EntityDataSerializers.INT);
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("plains"), new ResourceLocation("crimson_forest"), new ResourceLocation("end_barrens"), new ResourceLocation("end_highlands"),
			new ResourceLocation("end_midlands"), new ResourceLocation("mushroom_fields"), new ResourceLocation("nether_wastes"), new ResourceLocation("soul_sand_valley"), new ResourceLocation("sunflower_plains"), new ResourceLocation("the_end"),
			new ResourceLocation("the_void"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MISC).add(new MobSpawnSettings.SpawnerData(BouModEntities.BABY_DRAGON_VILLAGER.get(), 20, 1, 3));
	}

	public BabyDragonVillagerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(BouModEntities.BABY_DRAGON_VILLAGER.get(), world);
	}

	public BabyDragonVillagerEntity(EntityType<BabyDragonVillagerEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.9f;
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		refreshDimensions();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_variant, 12);
		this.entityData.define(DATA_timer, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(4, new FloatGoal(this));
		this.goalSelector.addGoal(5, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(6, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(7, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(8, new BreedGoal(this, 1));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource == DamageSource.FALL)
			return false;
		if (damagesource == DamageSource.LIGHTNING_BOLT)
			return false;
		if (damagesource == DamageSource.DRAGON_BREATH)
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		DragonVariationSpawnProcedure.execute(this);
		return retval;
	}

	private final ItemStackHandler inventory = new ItemStackHandler(17);
	private final CombinedInvWrapper combined = new CombinedInvWrapper(inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this));

	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
		if (this.isAlive() && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && side == null)
			return LazyOptional.of(() -> combined).cast();
		return super.getCapability(capability, side);
	}

	@Override
	protected void dropEquipment() {
		super.dropEquipment();
		for (int i = 0; i < inventory.getSlots(); ++i) {
			ItemStack itemstack = inventory.getStackInSlot(i);
			if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
				this.spawnAtLocation(itemstack);
			}
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datavariant", this.entityData.get(DATA_variant));
		compound.putInt("Datatimer", this.entityData.get(DATA_timer));
		compound.put("InventoryCustom", inventory.serializeNBT());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datavariant"))
			this.entityData.set(DATA_variant, compound.getInt("Datavariant"));
		if (compound.contains("Datatimer"))
			this.entityData.set(DATA_timer, compound.getInt("Datatimer"));
		if (compound.get("InventoryCustom") instanceof CompoundTag inventoryTag)
			inventory.deserializeNBT(inventoryTag);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		if (sourceentity instanceof ServerPlayer serverPlayer) {
			NetworkHooks.openGui(serverPlayer, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return new TextComponent("Whelp Villager");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
					packetBuffer.writeBlockPos(sourceentity.blockPosition());
					packetBuffer.writeByte(0);
					packetBuffer.writeVarInt(BabyDragonVillagerEntity.this.getId());
					return new AnimalChestGUIMenu(id, inventory, packetBuffer);
				}
			}, buf -> {
				buf.writeBlockPos(sourceentity.blockPosition());
				buf.writeByte(0);
				buf.writeVarInt(this.getId());
			});
		}
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		WandOfVariationEntityHitProcedure.execute(entity);
		return retval;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		BabyDragonVillagerEntity retval = BouModEntities.BABY_DRAGON_VILLAGER.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(Items.COOKIE)).test(stack);
	}

	@Override
	public EntityDimensions getDimensions(Pose pose) {
		return super.getDimensions(pose).scale(1.2f);
	}

	public static void init() {
		SpawnPlacements.register(BouModEntities.BABY_DRAGON_VILLAGER.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}