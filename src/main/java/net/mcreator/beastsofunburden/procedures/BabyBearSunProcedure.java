package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyBearVillagerEntity;

public class BabyBearSunProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyBearVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyBearVillagerEntity.DATA_variant) : 0) == 4;
	}
}