package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyCowVillagerEntity;

public class BabyCowJerseyProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyCowVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCowVillagerEntity.DATA_variant) : 0) == 3;
	}
}