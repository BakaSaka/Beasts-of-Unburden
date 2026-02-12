package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.ChickenVillagerEntity;

import java.util.Random;

public class ChickenVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof ChickenVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(ChickenVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 9));
	}
}