package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabySpiderVillagerEntity;

public class BabySpiderDesertProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabySpiderVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabySpiderVillagerEntity.DATA_variant) : 0) == 2;
	}
}