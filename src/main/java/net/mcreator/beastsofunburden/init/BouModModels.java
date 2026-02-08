/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.beastsofunburden.client.model.Modelwolf_villager;
import net.mcreator.beastsofunburden.client.model.Modelparrot_villager;
import net.mcreator.beastsofunburden.client.model.Modelfox_villager;
import net.mcreator.beastsofunburden.client.model.Modelbaby_parrot_villager;
import net.mcreator.beastsofunburden.client.model.ModelAnimalChest;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BouModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelAnimalChest.LAYER_LOCATION, ModelAnimalChest::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_villager.LAYER_LOCATION, Modelwolf_villager::createBodyLayer);
		event.registerLayerDefinition(Modelfox_villager.LAYER_LOCATION, Modelfox_villager::createBodyLayer);
		event.registerLayerDefinition(Modelparrot_villager.LAYER_LOCATION, Modelparrot_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_parrot_villager.LAYER_LOCATION, Modelbaby_parrot_villager::createBodyLayer);
	}
}