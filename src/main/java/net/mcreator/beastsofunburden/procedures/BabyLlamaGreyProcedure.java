package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyLlamaVillagerEntity;

public class BabyLlamaGreyProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyLlamaVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyLlamaVillagerEntity.DATA_variant) : 0) == 5;
	}
}