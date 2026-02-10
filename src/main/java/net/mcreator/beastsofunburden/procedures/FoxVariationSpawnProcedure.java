package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.entity.FoxVillagerEntity;
import net.mcreator.beastsofunburden.entity.BabyParrotVillagerEntity;

import java.util.Random;

public class FoxVariationSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new BabyParrotVillagerEntity(BouModEntities.BABY_PARROT_VILLAGER.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (entity instanceof FoxVillagerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(FoxVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 5));
		}
	}
}