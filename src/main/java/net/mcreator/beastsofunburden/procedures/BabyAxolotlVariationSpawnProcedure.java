package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyAxolotlVillagerEntity;

import java.util.Random;

public class BabyAxolotlVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof BabyAxolotlVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyAxolotlVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 8));
	}
}