package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.SheepVillagerEntity;

public class SheepBrownProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof SheepVillagerEntity _datEntI ? _datEntI.getEntityData().get(SheepVillagerEntity.DATA_variant) : 0) == 5;
	}
}