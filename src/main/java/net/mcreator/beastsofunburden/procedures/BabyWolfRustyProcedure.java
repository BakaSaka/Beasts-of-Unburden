package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyWolfVillagerEntity;

public class BabyWolfRustyProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyWolfVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyWolfVillagerEntity.DATA_variant) : 0) == 6;
	}
}