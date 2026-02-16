package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;

import java.util.Random;

public class ChestVariationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		boolean growth = false;
		if (entity instanceof AnimalChestEntityEntity _datEntSetI)
			_datEntSetI.getEntityData().set(AnimalChestEntityEntity.DATA_variant, Mth.nextInt(new Random(), 1, 11));
	}
}