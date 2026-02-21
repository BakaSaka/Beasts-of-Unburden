package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.TopAnimalChestEntityEntity;

public class TopChestWhiteProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof TopAnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(TopAnimalChestEntityEntity.DATA_variant) : 0) == 10;
	}
}