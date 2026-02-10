package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.CatVillagerEntity;

public class CatShorthairProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof CatVillagerEntity _datEntI ? _datEntI.getEntityData().get(CatVillagerEntity.DATA_variant) : 0) == 12;
	}
}