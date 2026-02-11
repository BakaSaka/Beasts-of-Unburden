package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BearVillagerEntity;

import java.util.Random;

public class BearVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BearVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BearVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 6));
	}
}