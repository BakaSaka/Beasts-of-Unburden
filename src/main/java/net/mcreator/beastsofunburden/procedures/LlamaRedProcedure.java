package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.LlamaVillagerEntity;

public class LlamaRedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LlamaVillagerEntity _datEntI ? _datEntI.getEntityData().get(LlamaVillagerEntity.DATA_variant) : 0) == 7;
	}
}