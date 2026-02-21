package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.world.inventory.OwnAnimalChestGUIMenu;
import net.mcreator.beastsofunburden.init.BouModItems;
import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;

import java.util.List;

import io.netty.buffer.Unpooled;

public class OwnerUseAnimalChestProcedure {
	public static Entity execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return null;
		String owner = "";
		String vendor = "";
		Entity player = null;
		Entity chest_entity = null;
		player = sourceentity;
		chest_entity = entity;
		entity.getPersistentData().putString((entity instanceof AnimalChestEntityEntity _datEntS ? _datEntS.getEntityData().get(AnimalChestEntityEntity.DATA_shop) : ""), (vendor.replace("shop", "shop_" + sourceentity.getStringUUID())));
		vendor = entity instanceof AnimalChestEntityEntity _datEntS ? _datEntS.getEntityData().get(AnimalChestEntityEntity.DATA_shop) : "";
		if ((entity.getPersistentData().getString(vendor)).contains(sourceentity.getStringUUID()) && entity instanceof AnimalChestEntityEntity && hasEntityInInventory(sourceentity, new ItemStack(BouModItems.KEYRING_TOOL.get()))) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = new BlockPos(x, y, z);
				NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return new TextComponent("OwnAnimalChestGUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new OwnAnimalChestGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else if (!(entity.getPersistentData().getString(vendor)).contains(sourceentity.getStringUUID())) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		return entity;
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player) {
			Inventory inventory = player.getInventory();
			List<NonNullList<ItemStack>> compartments = com.google.common.collect.ImmutableList.of(inventory.items, inventory.armor, inventory.offhand);
			for (List<ItemStack> list : compartments) {
				for (ItemStack itemstack2 : list) {
					if (itemstack.sameItem(itemstack2)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}