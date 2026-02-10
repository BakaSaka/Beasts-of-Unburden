package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabySheepVillagerEntity;

public class BabySheepLimeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabySheepVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabySheepVillagerEntity.DATA_variant) : 0) == 9;
	}
}