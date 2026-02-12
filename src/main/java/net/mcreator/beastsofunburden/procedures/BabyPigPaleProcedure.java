package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyPigVillagerEntity;

public class BabyPigPaleProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyPigVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyPigVillagerEntity.DATA_variant) : 0) == 2;
	}
}