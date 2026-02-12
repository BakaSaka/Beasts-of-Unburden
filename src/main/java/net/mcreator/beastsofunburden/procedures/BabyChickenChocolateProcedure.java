package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyChickenVillagerEntity;

public class BabyChickenChocolateProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyChickenVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyChickenVillagerEntity.DATA_variant) : 0) == 6;
	}
}