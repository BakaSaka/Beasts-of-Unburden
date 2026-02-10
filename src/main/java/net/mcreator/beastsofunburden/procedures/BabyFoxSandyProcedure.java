package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyFoxVillagerEntity;

public class BabyFoxSandyProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyFoxVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyFoxVillagerEntity.DATA_variant) : 0) == 3;
	}
}