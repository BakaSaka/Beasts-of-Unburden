package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyCatVillagerEntity;

public class BabyCatRedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyCatVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCatVillagerEntity.DATA_variant) : 0) == 9;
	}
}