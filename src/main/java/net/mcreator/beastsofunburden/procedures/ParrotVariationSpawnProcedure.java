package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;
import net.mcreator.beastsofunburden.entity.BabyParrotVillagerEntity;
import net.mcreator.beastsofunburden.BouMod;

import java.util.Random;

public class ParrotVariationSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		boolean growth = false;
		BouMod.LOGGER.info(entity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby());
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.isBaby()) {
			BouMod.LOGGER.info(entity instanceof LivingEntity _livEnt2 && _livEnt2.isBaby());
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new BabyParrotVillagerEntity(BouModEntities.BABY_PARROT_VILLAGER.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			BouMod.LOGGER.info("boo");
			if (entity instanceof ParrotVillagerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ParrotVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 13));
		}
	}
}