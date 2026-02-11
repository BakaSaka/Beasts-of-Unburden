package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BearVillagerEntity;

public class BearGrizzlyProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BearVillagerEntity _datEntI ? _datEntI.getEntityData().get(BearVillagerEntity.DATA_variant) : 0) == 3;
	}
}