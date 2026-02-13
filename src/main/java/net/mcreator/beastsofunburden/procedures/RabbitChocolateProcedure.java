package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.RabbitVillagerEntity;

public class RabbitChocolateProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof RabbitVillagerEntity _datEntI ? _datEntI.getEntityData().get(RabbitVillagerEntity.DATA_variant) : 0) == 7;
	}
}