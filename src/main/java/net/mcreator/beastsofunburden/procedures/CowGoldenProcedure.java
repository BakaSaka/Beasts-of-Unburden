package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.CowVillagerEntity;

public class CowGoldenProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof CowVillagerEntity _datEntI ? _datEntI.getEntityData().get(CowVillagerEntity.DATA_variant) : 0) == 4;
	}
}