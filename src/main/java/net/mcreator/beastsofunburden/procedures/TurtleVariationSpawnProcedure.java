package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.TurtleVillagerEntity;

import java.util.Random;

public class TurtleVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof TurtleVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(TurtleVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 5));
	}
}