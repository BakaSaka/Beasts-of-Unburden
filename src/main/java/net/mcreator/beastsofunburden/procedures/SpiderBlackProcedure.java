package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.SpiderVillagerEntity;

public class SpiderBlackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof SpiderVillagerEntity _datEntI ? _datEntI.getEntityData().get(SpiderVillagerEntity.DATA_variant) : 0) == 1;
	}
}