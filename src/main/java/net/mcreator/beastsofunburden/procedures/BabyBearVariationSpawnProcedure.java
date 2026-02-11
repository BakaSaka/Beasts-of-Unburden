package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyBearVillagerEntity;

import java.util.Random;

public class BabyBearVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyBearVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyBearVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 6));
	}
}