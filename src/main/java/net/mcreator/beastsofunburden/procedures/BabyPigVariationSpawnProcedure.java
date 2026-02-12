package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyPigVillagerEntity;

import java.util.Random;

public class BabyPigVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyPigVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyPigVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 6));
	}
}