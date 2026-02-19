package net.mcreator.beastsofunburden.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.procedures.WandOfVariationEntityHitProcedure;
import net.mcreator.beastsofunburden.procedures.BabyAxolotlVariationSpawnProcedure;
import net.mcreator.beastsofunburden.init.BouModEntities;

import javax.annotation.Nullable;

public class BabyAxolotlVillagerEntity extends Animal {
	public static final EntityDataAccessor<Integer> DATA_variant = SynchedEntityData.defineId(BabyAxolotlVillagerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_timer = SynchedEntityData.defineId(BabyAxolotlVillagerEntity.class, EntityDataSerializers.INT);

	public BabyAxolotlVillagerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(BouModEntities.BABY_AXOLOTL_VILLAGER.get(), world);
	}

	public BabyAxolotlVillagerEntity(EntityType<BabyAxolotlVillagerEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BabyAxolotlVillagerEntity.this.isInWater())
					BabyAxolotlVillagerEntity.this.setDeltaMovement(BabyAxolotlVillagerEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !BabyAxolotlVillagerEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BabyAxolotlVillagerEntity.this.getX();
					double dy = this.wantedY - BabyAxolotlVillagerEntity.this.getY();
					double dz = this.wantedZ - BabyAxolotlVillagerEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BabyAxolotlVillagerEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					BabyAxolotlVillagerEntity.this.setYRot(this.rotlerp(BabyAxolotlVillagerEntity.this.getYRot(), f, 10));
					BabyAxolotlVillagerEntity.this.yBodyRot = BabyAxolotlVillagerEntity.this.getYRot();
					BabyAxolotlVillagerEntity.this.yHeadRot = BabyAxolotlVillagerEntity.this.getYRot();
					if (BabyAxolotlVillagerEntity.this.isInWater()) {
						BabyAxolotlVillagerEntity.this.setSpeed((float) BabyAxolotlVillagerEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BabyAxolotlVillagerEntity.this.setXRot(this.rotlerp(BabyAxolotlVillagerEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BabyAxolotlVillagerEntity.this.getXRot() * (float) (Math.PI / 180.0));
						BabyAxolotlVillagerEntity.this.setZza(f3 * f1);
						BabyAxolotlVillagerEntity.this.setYya((float) (f1 * dy));
					} else {
						BabyAxolotlVillagerEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BabyAxolotlVillagerEntity.this.setSpeed(0);
					BabyAxolotlVillagerEntity.this.setYya(0);
					BabyAxolotlVillagerEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_variant, 8);
		this.entityData.define(DATA_timer, 0);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 2, 40));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(8, new MoveBackToVillageGoal(this, 0.6, false));
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.idle_air"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.idle_air")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource == DamageSource.DROWN)
			return false;
		if (damagesource.isExplosion())
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		BabyAxolotlVariationSpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datavariant", this.entityData.get(DATA_variant));
		compound.putInt("Datatimer", this.entityData.get(DATA_timer));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datavariant"))
			this.entityData.set(DATA_variant, compound.getInt("Datavariant"));
		if (compound.contains("Datatimer"))
			this.entityData.set(DATA_timer, compound.getInt("Datatimer"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
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
		BabyAxolotlVillagerEntity retval = BouModEntities.BABY_AXOLOTL_VILLAGER.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of().test(stack);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this;
		return true;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.25);
		return builder;
	}
}