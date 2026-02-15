package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabySpiderVillagerEntity;

import java.util.Random;

public class BabySpiderVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabySpiderVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabySpiderVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 7));
	}
}