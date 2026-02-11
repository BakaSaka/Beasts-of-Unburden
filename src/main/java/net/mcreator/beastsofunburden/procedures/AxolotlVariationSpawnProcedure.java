package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.AxolotlVillagerEntity;

import java.util.Random;

public class AxolotlVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof AxolotlVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(AxolotlVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 8));
	}
}