package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.PigVillagerEntity;

public class PigBlackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PigVillagerEntity _datEntI ? _datEntI.getEntityData().get(PigVillagerEntity.DATA_variant) : 0) == 4;
	}
}