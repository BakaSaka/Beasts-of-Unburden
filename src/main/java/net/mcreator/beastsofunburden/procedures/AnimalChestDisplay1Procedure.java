package net.mcreator.beastsofunburden.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class AnimalChestDisplay1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		Entity inventory = null;
		inventory = entity;
		if (getBlockNBTLogic(world, new BlockPos(x, y, z), "mod:vendor")) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(_iitemhandlerref::set);
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						{
							ItemStack _isc = itemstack;
							final ItemStack _setstack = itemstackiterator.copy();
							final int _sltid = 300;
							_setstack.setCount(1);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
									itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
								}
							});
						}
						{
							ItemStack _isc = itemstack;
							final ItemStack _setstack = itemstackiterator.copy();
							final int _sltid = 301;
							_setstack.setCount(1);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
									itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
								}
							});
						}
						{
							ItemStack _isc = itemstack;
							final ItemStack _setstack = itemstackiterator.copy();
							final int _sltid = 302;
							_setstack.setCount(1);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
									itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
								}
							});
						}
						{
							ItemStack _isc = itemstack;
							final ItemStack _setstack = itemstackiterator.copy();
							final int _sltid = 303;
							_setstack.setCount(1);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
									itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
								}
							});
						}
					}
				}
			}
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getTileData().getBoolean(tag);
		return false;
	}
}