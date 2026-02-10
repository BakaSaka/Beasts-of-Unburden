package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.CatVillagerEntity;

import java.util.Random;

public class CatVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof CatVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(CatVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 12));
	}
}