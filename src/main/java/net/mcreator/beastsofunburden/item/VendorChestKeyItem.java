package net.mcreator.beastsofunburden.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.beastsofunburden.procedures.ChestKeyJoinChestBlockProcedure;

public class VendorChestKeyItem extends Item {
	public VendorChestKeyItem() {
		super(new Item.Properties().tab(null).fireResistant());
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChestKeyJoinChestBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}