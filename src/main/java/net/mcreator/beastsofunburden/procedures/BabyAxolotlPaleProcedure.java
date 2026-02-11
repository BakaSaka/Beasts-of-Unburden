package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyAxolotlVillagerEntity;

public class BabyAxolotlPaleProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyAxolotlVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyAxolotlVillagerEntity.DATA_variant) : 0) == 1;
	}
}