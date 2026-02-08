package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;

import java.util.Random;

public class SpiderVariationSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof ParrotVillagerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(ParrotVillagerEntity.DATA_variant, Mth.nextInt(new Random(), 1, 13));
		if (true) {
			if (variant == 1) {
				entity.getPersistentData().putString("1", "parrotcyan");
			}
			if (variant == 2) {
				entity.getPersistentData().putString("2", "parrotred");
			}
			if (variant == 3) {
				entity.getPersistentData().putString("3", "parrotgrey");
			}
			if (variant == 4) {
				entity.getPersistentData().putString("4", "parrotgreen");
			}
			if (variant == 5) {
				entity.getPersistentData().putString("5", "parrotblue");
			}
			if (variant == 6) {
				entity.getPersistentData().putString("6", "parrotalex");
			}
			if (variant == 7) {
				entity.getPersistentData().putString("7", "parrotblack");
			}
			if (variant == 8) {
				entity.getPersistentData().putString("8", "parrotnavy");
			}
			if (variant == 9) {
				entity.getPersistentData().putString("9", "parrotpink");
			}
			if (variant == 10) {
				entity.getPersistentData().putString("10", "parrotpurple");
			}
			if (variant == 11) {
				entity.getPersistentData().putString("11", "parrotwhite");
			}
			if (variant == 12) {
				entity.getPersistentData().putString("12", "parrotrainbow");
			}
			if (variant == 13) {
				entity.getPersistentData().putString("13", "parrotyellow");
			}
		}
	}
}