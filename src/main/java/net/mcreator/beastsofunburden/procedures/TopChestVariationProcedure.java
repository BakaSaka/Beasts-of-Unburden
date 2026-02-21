package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.TopAnimalChestEntityEntity;

import java.util.Random;

public class TopChestVariationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		boolean growth = false;
		if (entity instanceof TopAnimalChestEntityEntity _datEntSetI)
			_datEntSetI.getEntityData().set(TopAnimalChestEntityEntity.DATA_variant, Mth.nextInt(new Random(), 1, 11));
	}
}