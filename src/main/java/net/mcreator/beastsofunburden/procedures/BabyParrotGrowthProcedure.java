package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BabyParrotGrowthProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double PosX = 0;
		double PosY = 0;
		double PosZ = 0;
		double Vx = 0;
		double Vy = 0;
		double Vz = 0;
		double yaw = 0;
		double pitch = 0;
		if (!world.isClientSide()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("babyparrotcyan")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ParrotVillagerEntity(BouModEntities.PARROT_VILLAGER.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof ParrotVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(ParrotVillagerEntity.DATA_variant, 1);
				entity.getPersistentData().putString("babyparrotcyan", "parrotcyan");
			}
		}
	}
}