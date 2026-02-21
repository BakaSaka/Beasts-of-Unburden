package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.world.inventory.KeyringGUIMenu;
import net.mcreator.beastsofunburden.init.BouModMenus;
import net.mcreator.beastsofunburden.init.BouModItems;
import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;

import io.netty.buffer.Unpooled;

public class BindAnimalChestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstackiterator) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack keyID = ItemStack.EMPTY;
		if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
			_toTame.tame(_owner);
		new ItemStack(BouModItems.VENDOR_CHEST_KEY.get()).shrink(1);
		if (sourceentity instanceof ServerPlayer _ent) {
			BlockPos _bpos = new BlockPos(x, y, z);
			NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return new TextComponent("KeyringGUI");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new KeyringGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
		keyID = itemstackiterator.copy();
		if ((entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0) == 1) {
			{
				CompoundTag _nbtTag = keyID.getTag();
				if (_nbtTag != null)
					new ItemStack(BouModItems.PARROT_1.get()).setTag(_nbtTag.copy());
			}
			if (sourceentity instanceof Player _player && _player.containerMenu instanceof BouModMenus.MenuAccessor _menu) {
				ItemStack _setstack6 = new ItemStack(BouModItems.PARROT_1.get()).copy();
				_setstack6.setCount(1);
				_menu.getSlots().get(83).set(_setstack6);
				_player.containerMenu.broadcastChanges();
			}
			keyID.setHoverName(new TextComponent((entity instanceof ParrotVillagerEntity _datEntS ? _datEntS.getEntityData().get(ParrotVillagerEntity.DATA_vendor) : "")));
		}
		if ((entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0) == 2) {
			{
				CompoundTag _nbtTag = keyID.getTag();
				if (_nbtTag != null)
					new ItemStack(BouModItems.PARROT_2.get()).setTag(_nbtTag.copy());
			}
			if (sourceentity instanceof Player _player && _player.containerMenu instanceof BouModMenus.MenuAccessor _menu) {
				ItemStack _setstack11 = new ItemStack(BouModItems.PARROT_2.get()).copy();
				_setstack11.setCount(1);
				_menu.getSlots().get(80).set(_setstack11);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}