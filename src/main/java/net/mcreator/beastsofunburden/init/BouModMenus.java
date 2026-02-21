/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.beastsofunburden.world.inventory.OwnAnimalChestGUIMenu;
import net.mcreator.beastsofunburden.world.inventory.KeyringGUIMenu;
import net.mcreator.beastsofunburden.world.inventory.AnimalChestGUIMenu;
import net.mcreator.beastsofunburden.network.MenuStateUpdateMessage;
import net.mcreator.beastsofunburden.BouMod;

import java.util.Map;

public class BouModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.CONTAINERS, BouMod.MODID);
	public static final RegistryObject<MenuType<AnimalChestGUIMenu>> ANIMAL_CHEST_GUI = REGISTRY.register("animal_chest_gui", () -> IForgeMenuType.create(AnimalChestGUIMenu::new));
	public static final RegistryObject<MenuType<OwnAnimalChestGUIMenu>> OWN_ANIMAL_CHEST_GUI = REGISTRY.register("own_animal_chest_gui", () -> IForgeMenuType.create(OwnAnimalChestGUIMenu::new));
	public static final RegistryObject<MenuType<KeyringGUIMenu>> KEYRING_GUI = REGISTRY.register("keyring_gui", () -> IForgeMenuType.create(KeyringGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				BouMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level.isClientSide) {
				if (Minecraft.getInstance().screen instanceof BouModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				BouMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}