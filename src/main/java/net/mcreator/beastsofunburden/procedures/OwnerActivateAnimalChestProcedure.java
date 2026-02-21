package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
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

public class OwnerActivateAnimalChestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity player = null;
		Entity chest_entity = null;
		Entity shopkeeper = null;
		String owner = "";
		String vendor = "";
		String chest_shop = "";
		player = sourceentity;
		if (entity instanceof AnimalChestEntityEntity _datEntSetS)
			_datEntSetS.getEntityData().set(AnimalChestEntityEntity.DATA_shop, chest_shop);
		if (hasEntityInInventory(sourceentity, new ItemStack(BouModItems.KEYRING_TOOL.get())) || hasEntityInInventory(sourceentity, new ItemStack(BouModItems.VENDOR_CHEST_KEY.get()))) {
			if (entity instanceof AnimalChestEntityEntity) {
				if (chest_entity instanceof AnimalChestEntityEntity _datEntSetS)
					_datEntSetS.getEntityData().set(AnimalChestEntityEntity.DATA_shop,
							(("mod:shop_" + sourceentity.getStringUUID()) + "" + ("_" + (chest_entity instanceof AnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(AnimalChestEntityEntity.DATA_variant) : 0))));
				chest_shop = entity instanceof AnimalChestEntityEntity _datEntS ? _datEntS.getEntityData().get(AnimalChestEntityEntity.DATA_shop) : "";
				new ItemStack(BouModItems.VENDOR_CHEST_KEY.get()).getOrCreateTag().putString("mod:keys",
						(("mod:keys_" + sourceentity.getStringUUID()) + "" + ("_" + (chest_entity instanceof AnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(AnimalChestEntityEntity.DATA_variant) : 0))));
				chest_shop = ("mod:vendor_" + sourceentity.getStringUUID()) + "" + ("_" + (chest_entity instanceof AnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(AnimalChestEntityEntity.DATA_variant) : 0));
				chest_shop = new ItemStack(BouModItems.VENDOR_CHEST_KEY.get()).getOrCreateTag().getString((entity instanceof AnimalChestEntityEntity _datEntS ? _datEntS.getEntityData().get(AnimalChestEntityEntity.DATA_shop) : ""));
			} else if ((sourceentity instanceof LivingEntity _entUseItem15 ? _entUseItem15.getUseItem() : ItemStack.EMPTY).getItem() == BouModItems.VENDOR_CHEST_KEY.get()) {
				if (chest_shop.matches(vendor) == true) {
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
					entity.getPersistentData().putString("owner", ("owner" + sourceentity.getDisplayName().getString()));
				} else if (chest_shop.matches(vendor) == false) {
					if (entity instanceof Player _player)
						_player.closeContainer();
				}
			}
		}
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