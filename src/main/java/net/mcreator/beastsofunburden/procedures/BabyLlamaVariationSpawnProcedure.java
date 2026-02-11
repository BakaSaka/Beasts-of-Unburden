package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyLlamaVillagerEntity;

import java.util.Random;

public class BabyLlamaVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyLlamaVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyLlamaVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 10));
	}
}