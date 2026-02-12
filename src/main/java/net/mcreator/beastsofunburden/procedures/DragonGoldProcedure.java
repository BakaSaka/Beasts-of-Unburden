package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.DragonVillagerEntity;

public class DragonGoldProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof DragonVillagerEntity _datEntI ? _datEntI.getEntityData().get(DragonVillagerEntity.DATA_variant) : 0) == 6;
	}
}