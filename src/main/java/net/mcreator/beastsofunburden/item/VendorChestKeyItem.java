package net.mcreator.beastsofunburden.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

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
}