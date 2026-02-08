package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;

import java.util.Random;

public class ParrotVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		boolean growth = false;
		if (entity instanceof ParrotVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(ParrotVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 13));
	}
}