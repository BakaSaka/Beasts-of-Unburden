package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyFoxVillagerEntity;

import java.util.Random;

public class BabyFoxVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyFoxVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyFoxVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 5));
	}
}