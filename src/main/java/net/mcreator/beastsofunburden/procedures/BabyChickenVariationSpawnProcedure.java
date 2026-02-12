package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyChickenVillagerEntity;

import java.util.Random;

public class BabyChickenVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyChickenVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyChickenVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 9));
	}
}