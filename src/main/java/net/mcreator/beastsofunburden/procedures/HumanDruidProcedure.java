package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.HumanVillagerEntity;

public class HumanDruidProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof HumanVillagerEntity _datEntI ? _datEntI.getEntityData().get(HumanVillagerEntity.DATA_variant) : 0) == 1;
	}
}