package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.BabyParrotVillagerEntity;

import java.util.Random;

public class BabyParrotVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyParrotVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BabyParrotVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 13));
	}
}