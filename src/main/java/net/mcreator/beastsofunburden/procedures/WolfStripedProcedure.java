package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.WolfVillagerEntity;

public class WolfStripedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof WolfVillagerEntity _datEntI ? _datEntI.getEntityData().get(WolfVillagerEntity.DATA_variant) : 0) == 9;
	}
}