package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.ChickenVillagerEntity;

public class ChickenGoldenProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof ChickenVillagerEntity _datEntI ? _datEntI.getEntityData().get(ChickenVillagerEntity.DATA_variant) : 0) == 7;
	}
}