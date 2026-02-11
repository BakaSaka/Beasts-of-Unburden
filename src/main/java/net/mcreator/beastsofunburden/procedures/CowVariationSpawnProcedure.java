package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.CowVillagerEntity;

import java.util.Random;

public class CowVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof CowVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(CowVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 7));
	}
}