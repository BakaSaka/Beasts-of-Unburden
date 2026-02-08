package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NameBabyParrotVariationProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		BabyParrotVariationSpawnProcedure.execute(entity);
		if (variant == 1) {
			entity.setCustomName(new TextComponent("babyparrotcyan"));
		}
		if (variant == 2) {
			entity.setCustomName(new TextComponent("babyparrotred"));
		}
		if (variant == 3) {
			entity.setCustomName(new TextComponent("babyparrotgrey"));
		}
		if (variant == 4) {
			entity.setCustomName(new TextComponent("babyparrotgreen"));
		}
		if (variant == 5) {
			entity.setCustomName(new TextComponent("babyparrotblue"));
		}
		if (variant == 6) {
			entity.setCustomName(new TextComponent("babyparrotalex"));
		}
		if (variant == 7) {
			entity.setCustomName(new TextComponent("babyparrotblack"));
		}
		if (variant == 8) {
			entity.setCustomName(new TextComponent("babyparrotnavy"));
		}
		if (variant == 9) {
			entity.setCustomName(new TextComponent("babyparrotpink"));
		}
		if (variant == 10) {
			entity.setCustomName(new TextComponent("babyparrotpurple"));
		}
		if (variant == 11) {
			entity.setCustomName(new TextComponent("babyparrotwhite"));
		}
		if (variant == 12) {
			entity.setCustomName(new TextComponent("babyparrotrainbow"));
		}
		if (variant == 13) {
			entity.setCustomName(new TextComponent("babyparrotyellow"));
		}
	}
}