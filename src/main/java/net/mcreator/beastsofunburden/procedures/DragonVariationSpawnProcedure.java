package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.DragonVillagerEntity;

import java.util.Random;

public class DragonVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof DragonVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DragonVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 12));
	}
}