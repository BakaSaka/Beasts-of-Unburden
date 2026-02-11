package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.HorseVillagerEntity;

import java.util.Random;

public class HorseVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof HorseVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(HorseVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 7));
	}
}