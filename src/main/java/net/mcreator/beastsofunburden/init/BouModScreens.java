/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.beastsofunburden.client.gui.OwnAnimalChestGUIScreen;
import net.mcreator.beastsofunburden.client.gui.KeyringGUIScreen;
import net.mcreator.beastsofunburden.client.gui.CompleteKeyringGUIScreen;
import net.mcreator.beastsofunburden.client.gui.AnimalChestGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BouModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BouModMenus.ANIMAL_CHEST_GUI.get(), AnimalChestGUIScreen::new);
			MenuScreens.register(BouModMenus.OWN_ANIMAL_CHEST_GUI.get(), OwnAnimalChestGUIScreen::new);
			MenuScreens.register(BouModMenus.KEYRING_GUI.get(), KeyringGUIScreen::new);
			MenuScreens.register(BouModMenus.COMPLETE_KEYRING_GUI.get(), CompleteKeyringGUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}