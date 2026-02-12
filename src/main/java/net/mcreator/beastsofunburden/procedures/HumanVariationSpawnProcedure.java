package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.HumanVillagerEntity;

import java.util.Random;

public class HumanVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof HumanVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(HumanVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 4));
	}
}