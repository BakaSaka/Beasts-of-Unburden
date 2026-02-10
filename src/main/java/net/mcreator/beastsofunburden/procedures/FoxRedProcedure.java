package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.FoxVillagerEntity;

public class FoxRedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof FoxVillagerEntity _datEntI ? _datEntI.getEntityData().get(FoxVillagerEntity.DATA_variant) : 0) == 1;
	}
}