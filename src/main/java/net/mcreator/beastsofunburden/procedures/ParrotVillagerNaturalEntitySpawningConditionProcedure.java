package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;

public class ParrotVillagerNaturalEntitySpawningConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("sparse_jungle")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("jungle"))
				|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("flower_forest"))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ParrotVillagerEntity(BouModEntities.PARROT_VILLAGER.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}