package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BeeVillagerEntity;

public class BeeOrchidProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BeeVillagerEntity _datEntI ? _datEntI.getEntityData().get(BeeVillagerEntity.DATA_variant) : 0) == 3;
	}
}