package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.BabyRabbitVillagerEntity;

public class BabyRabbitWhiteProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BabyRabbitVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyRabbitVillagerEntity.DATA_variant) : 0) == 4;
	}
}