package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Registry;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.world.inventory.OwnAnimalChestGUIMenu;
import net.mcreator.beastsofunburden.world.inventory.AnimalChestGUIMenu;
import net.mcreator.beastsofunburden.init.BouModItems;
import net.mcreator.beastsofunburden.BouMod;

import java.util.List;

import io.netty.buffer.Unpooled;

public class ChestCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity player = null;
		Entity chest_entity = null;
		String chest_shop = "";
		player = sourceentity;
		chest_entity = entity;
		chest_shop = entity.getPersistentData().getString("mod:vendor");
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mod:keys")))
				&& entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("mod:vendor")))) {
			if (hasEntityInInventory(sourceentity, new ItemStack(BouModItems.KEYRING_TOOL.get())) || hasEntityInInventory(sourceentity, new ItemStack(BouModItems.VENDOR_CHEST_KEY.get()))) {
				if (chest_shop.matches(sourceentity.getStringUUID()) == true) {
					if (sourceentity instanceof ServerPlayer _ent) {
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
				} else if (chest_shop.matches(sourceentity.getStringUUID()) == false) {
					if (sourceentity instanceof Player _player)
						_player.closeContainer();
				}
				entity.getPersistentData().putString("free", "bound");
				BouMod.LOGGER.info("owner check");
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				if (chest_shop.matches(sourceentity.getStringUUID()) == false) {
					if (sourceentity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("AnimalChestGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new AnimalChestGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				} else if (chest_shop.matches(sourceentity.getStringUUID()) == true) {
					if (sourceentity instanceof Player _player)
						_player.closeContainer();
					BouMod.LOGGER.info("customer check");
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