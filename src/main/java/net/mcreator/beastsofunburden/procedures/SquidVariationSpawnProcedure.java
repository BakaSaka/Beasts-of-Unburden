package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.SquidVillagerEntity;

import java.util.Random;

public class SquidVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof SquidVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(SquidVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 3));
	}
}