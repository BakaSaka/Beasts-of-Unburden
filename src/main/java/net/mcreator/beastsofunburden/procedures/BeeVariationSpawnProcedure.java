package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BeeVillagerEntity;

import java.util.Random;

public class BeeVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BeeVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BeeVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 4));
	}
}