package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyTurtleVillagerEntity;

import java.util.Random;

public class BabyTurtleVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyTurtleVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyTurtleVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 5));
	}
}