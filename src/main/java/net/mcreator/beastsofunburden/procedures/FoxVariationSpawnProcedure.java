package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.FoxVillagerEntity;

import java.util.Random;

public class FoxVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof FoxVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(FoxVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 5));
	}
}