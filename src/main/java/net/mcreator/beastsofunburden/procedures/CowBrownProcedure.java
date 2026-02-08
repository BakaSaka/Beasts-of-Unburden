package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;

public class CowBrownProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0) == 1;
	}
}