package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.beastsofunburden.entity.ParrotVillagerEntity;
import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;
import net.mcreator.beastsofunburden.BouMod;

public class ParrotAndShopProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack vendor = ItemStack.EMPTY;
		ItemStack shop = ItemStack.EMPTY;
		if ((entity instanceof ParrotVillagerEntity _datEntS ? _datEntS.getEntityData().get(ParrotVillagerEntity.DATA_vendor) : "").contains("mod:vendor" + entity.getStringUUID() + "_"
				+ (entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0)) == (entity instanceof AnimalChestEntityEntity _datEntS
						? _datEntS.getEntityData().get(AnimalChestEntityEntity.DATA_shop)
						: "").contains("mod:shop" + entity.getStringUUID() + "_" + (entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0))) {
			{
				CompoundTag _nbtTag = shop.getTag();
				if (_nbtTag != null)
					vendor.setTag(_nbtTag.copy());
			}
		}
		BouMod.LOGGER.info(entity instanceof ParrotVillagerEntity _datEntS ? _datEntS.getEntityData().get(ParrotVillagerEntity.DATA_vendor) : "");
		BouMod.LOGGER.info(entity instanceof ParrotVillagerEntity _datEntS ? _datEntS.getEntityData().get(ParrotVillagerEntity.DATA_bound) : "");
		BouMod.LOGGER.info(entity instanceof ParrotVillagerEntity _datEntS ? _datEntS.getEntityData().get(ParrotVillagerEntity.DATA_owner) : "");
		BouMod.LOGGER.info(entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0);
		BouMod.LOGGER.info(entity instanceof AnimalChestEntityEntity _datEntS ? _datEntS.getEntityData().get(AnimalChestEntityEntity.DATA_shop) : "");
		BouMod.LOGGER.info(entity instanceof AnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(AnimalChestEntityEntity.DATA_variant) : 0);
	}
}