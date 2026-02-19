package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.beastsofunburden.init.BouModItems;
import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.init.BouModBlocks;
import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;

import java.util.Comparator;

public class ChestBecomeEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BouModItems.VENDOR_CHEST_KEY.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BouModItems.KEYRING_TOOL.get()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BouModBlocks.ANIMAL_CHEST_INACTIVE.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AnimalChestEntityEntity(BouModEntities.ANIMAL_CHEST_ENTITY.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if ((findEntityInWorldRange(world, AnimalChestEntityEntity.class, x, y, z, 2)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
					_toTame.tame(_owner);
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("bou:new_shop_owner"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}