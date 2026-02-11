package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyHorseVillagerEntity;

import java.util.Random;

public class BabyHorseVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyHorseVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyHorseVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 7));
	}
}