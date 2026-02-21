package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

public class OwnerUseAnimalChestProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		String owner = "";
		String vendor = "";
		Entity player = null;
		Entity chest_entity = null;
		player = sourceentity;
		chest_entity = entity;
		entity.getPersistentData().putString("vendor", ("vendor" + sourceentity.getStringUUID()));
	}
}