package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.entity.CatVillagerEntity;
import net.mcreator.beastsofunburden.entity.BabyCatVillagerEntity;

import java.util.Comparator;

public class BabyCatGrowthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof BabyCatVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCatVillagerEntity.DATA_timer) : 0) < 2000) {
			if (entity instanceof BabyCatVillagerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(BabyCatVillagerEntity.DATA_timer, (int) ((entity instanceof BabyCatVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCatVillagerEntity.DATA_timer) : 0) + 1));
		} else {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CatVillagerEntity(BouModEntities.CAT_VILLAGER.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			if ((findEntityInWorldRange(world, CatVillagerEntity.class, x, y, z, 1)) instanceof CatVillagerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(CatVillagerEntity.DATA_variant, (int) (entity instanceof BabyCatVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCatVillagerEntity.DATA_variant) : 0));
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}