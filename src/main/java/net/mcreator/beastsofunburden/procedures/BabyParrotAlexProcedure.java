package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyParrotVillagerEntity;

public class BabyParrotAlexProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyParrotVillagerEntity.DATA_variant) : 0) == 6;
	}
}