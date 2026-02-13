package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.SpiderVillagerEntity;

import java.util.Random;

public class SpiderVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof SpiderVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(SpiderVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 6));
	}
}