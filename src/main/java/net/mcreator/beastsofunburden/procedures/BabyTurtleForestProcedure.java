package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyTurtleVillagerEntity;

public class BabyTurtleForestProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyTurtleVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyTurtleVillagerEntity.DATA_variant) : 0) == 2;
	}
}