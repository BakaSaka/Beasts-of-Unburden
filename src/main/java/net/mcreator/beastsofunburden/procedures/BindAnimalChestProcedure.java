package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.InteractionHand;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.beastsofunburden.BouMod;

import javax.annotation.Nullable;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class BindAnimalChestProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		BouMod.PACKET_HANDLER.sendToServer(new BindAnimalChestMessage());
		execute();
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class BindAnimalChestMessage {
		public BindAnimalChestMessage() {
		}

		public BindAnimalChestMessage(FriendlyByteBuf buffer) {
		}

		public static void buffer(BindAnimalChestMessage message, FriendlyByteBuf buffer) {
		}

		public static void handler(BindAnimalChestMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getSender().level.hasChunkAt(context.getSender().blockPosition()))
					return;
				execute();
			});
			context.setPacketHandled(true);
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			BouMod.addNetworkMessage(BindAnimalChestMessage.class, BindAnimalChestMessage::buffer, BindAnimalChestMessage::new, BindAnimalChestMessage::handler);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}