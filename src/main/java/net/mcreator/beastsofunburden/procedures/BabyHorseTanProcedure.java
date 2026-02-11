package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyHorseVillagerEntity;

public class BabyHorseTanProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyHorseVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyHorseVillagerEntity.DATA_variant) : 0) == 2;
	}
}