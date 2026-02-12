package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.SquidVillagerEntity;

public class SquidGlowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof SquidVillagerEntity _datEntI ? _datEntI.getEntityData().get(SquidVillagerEntity.DATA_variant) : 0) == 2;
	}
}