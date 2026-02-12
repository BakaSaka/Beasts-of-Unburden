/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.beastsofunburden.item.VendorChestKeyItem;
import net.mcreator.beastsofunburden.item.OneShotterItem;
import net.mcreator.beastsofunburden.BouMod;

public class BouModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BouMod.MODID);
	public static final RegistryObject<Item> PARROT_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_PARROT_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> FOX_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> WOLF_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> AXOLOTL_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> HORSE_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> CAT_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> COW_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> LLAMA_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BEAR_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> PIG_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> CHICKEN_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> RABBIT_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> SHEEP_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> TURTLE_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BEE_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> SPIDER_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> SQUID_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> HUMAN_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> DRAGON_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_AXOLOTL_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_CAT_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_COW_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_HORSE_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_LLAMA_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_BEAR_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_PIG_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_CHICKEN_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> BABY_RABBIT_VILLAGER_SPAWN_EGG;
	public static final RegistryObject<Item> ANIMAL_CHEST;
	public static final RegistryObject<Item> ANIMAL_CHEST_INACTIVE;
	public static final RegistryObject<Item> ONE_SHOTTER;
	public static final RegistryObject<Item> VENDOR_CHEST_KEY;
	static {
		PARROT_VILLAGER_SPAWN_EGG = REGISTRY.register("parrot_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.PARROT_VILLAGER, -15952116, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_PARROT_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_parrot_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_PARROT_VILLAGER, -15952116, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		FOX_VILLAGER_SPAWN_EGG = REGISTRY.register("fox_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.FOX_VILLAGER, -3381760, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		WOLF_VILLAGER_SPAWN_EGG = REGISTRY.register("wolf_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.WOLF_VILLAGER, -1118482, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		AXOLOTL_VILLAGER_SPAWN_EGG = REGISTRY.register("axolotl_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.AXOLOTL_VILLAGER, -610594, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		HORSE_VILLAGER_SPAWN_EGG = REGISTRY.register("horse_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.HORSE_VILLAGER, -1119153, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		CAT_VILLAGER_SPAWN_EGG = REGISTRY.register("cat_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.CAT_VILLAGER, -2383539, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		COW_VILLAGER_SPAWN_EGG = REGISTRY.register("cow_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.COW_VILLAGER, -13754093, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		LLAMA_VILLAGER_SPAWN_EGG = REGISTRY.register("llama_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.LLAMA_VILLAGER, -1991161, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BEAR_VILLAGER_SPAWN_EGG = REGISTRY.register("bear_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BEAR_VILLAGER, -15330028, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		PIG_VILLAGER_SPAWN_EGG = REGISTRY.register("pig_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.PIG_VILLAGER, -1462103, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		CHICKEN_VILLAGER_SPAWN_EGG = REGISTRY.register("chicken_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.CHICKEN_VILLAGER, -9171956, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		RABBIT_VILLAGER_SPAWN_EGG = REGISTRY.register("rabbit_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.RABBIT_VILLAGER, -9552611, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		SHEEP_VILLAGER_SPAWN_EGG = REGISTRY.register("sheep_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.SHEEP_VILLAGER, -13108, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		TURTLE_VILLAGER_SPAWN_EGG = REGISTRY.register("turtle_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.TURTLE_VILLAGER, -16737895, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BEE_VILLAGER_SPAWN_EGG = REGISTRY.register("bee_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BEE_VILLAGER, -11776, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		SPIDER_VILLAGER_SPAWN_EGG = REGISTRY.register("spider_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.SPIDER_VILLAGER, -14868171, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		SQUID_VILLAGER_SPAWN_EGG = REGISTRY.register("squid_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.SQUID_VILLAGER, -14139336, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		HUMAN_VILLAGER_SPAWN_EGG = REGISTRY.register("human_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.HUMAN_VILLAGER, -3298419, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		DRAGON_VILLAGER_SPAWN_EGG = REGISTRY.register("dragon_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.DRAGON_VILLAGER, -13171384, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_AXOLOTL_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_axolotl_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_AXOLOTL_VILLAGER, -610594, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_CAT_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_cat_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_CAT_VILLAGER, -2383539, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_COW_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_cow_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_COW_VILLAGER, -13754093, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_HORSE_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_horse_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_HORSE_VILLAGER, -1119153, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_LLAMA_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_llama_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_LLAMA_VILLAGER, -1991161, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_BEAR_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_bear_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_BEAR_VILLAGER, -15330028, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_PIG_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_pig_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_PIG_VILLAGER, -1462103, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_CHICKEN_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_chicken_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_CHICKEN_VILLAGER, -9171956, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		BABY_RABBIT_VILLAGER_SPAWN_EGG = REGISTRY.register("baby_rabbit_villager_spawn_egg", () -> new ForgeSpawnEggItem(BouModEntities.BABY_RABBIT_VILLAGER, -9552611, -5997981, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		ANIMAL_CHEST = block(BouModBlocks.ANIMAL_CHEST, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS));
		ANIMAL_CHEST_INACTIVE = block(BouModBlocks.ANIMAL_CHEST_INACTIVE, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS));
		ONE_SHOTTER = REGISTRY.register("one_shotter", OneShotterItem::new);
		VENDOR_CHEST_KEY = REGISTRY.register("vendor_chest_key", VendorChestKeyItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> blockCMT(RegistryObject<Block> block, CreativeModeTab tab) {
		return block(block, new Item.Properties().tab(tab));
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}