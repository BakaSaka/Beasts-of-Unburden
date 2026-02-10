package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.TurtleVillagerEntity;

public class TurtleRiverProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof TurtleVillagerEntity _datEntI ? _datEntI.getEntityData().get(TurtleVillagerEntity.DATA_variant) : 0) == 3;
	}
}