/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.Block;

import net.mcreator.beastsofunburden.block.AnimalChestInactiveBlock;
import net.mcreator.beastsofunburden.block.AnimalChestBlock;
import net.mcreator.beastsofunburden.BouMod;

@Mod.EventBusSubscriber
public class BouModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BouMod.MODID);
	public static final RegistryObject<Block> ANIMAL_CHEST;
	public static final RegistryObject<Block> ANIMAL_CHEST_INACTIVE;
	static {
		ANIMAL_CHEST = REGISTRY.register("animal_chest", AnimalChestBlock::new);
		ANIMAL_CHEST_INACTIVE = REGISTRY.register("animal_chest_inactive", AnimalChestInactiveBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AnimalChestBlock.registerRenderLayer();
			AnimalChestInactiveBlock.registerRenderLayer();
		}
	}

	@SubscribeEvent
	public static void onNoteBlockPlay(NoteBlockEvent.Play event) {
		Block below = event.getWorld().getBlockState(event.getPos().below()).getBlock();
		if (below == BouModBlocks.ANIMAL_CHEST.get()) {
			event.setInstrument(NoteBlockInstrument.BANJO);
		} else if (below == BouModBlocks.ANIMAL_CHEST_INACTIVE.get()) {
			event.setInstrument(NoteBlockInstrument.BANJO);
		}
	}
}