/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.beastsofunburden.client.model.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BouModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelAnimalChest.LAYER_LOCATION, ModelAnimalChest::createBodyLayer);
		event.registerLayerDefinition(Modelcat_villager.LAYER_LOCATION, Modelcat_villager::createBodyLayer);
		event.registerLayerDefinition(Modelturtle_villager.LAYER_LOCATION, Modelturtle_villager::createBodyLayer);
		event.registerLayerDefinition(Modelsheep_villager.LAYER_LOCATION, Modelsheep_villager::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_villager.LAYER_LOCATION, Modelwolf_villager::createBodyLayer);
		event.registerLayerDefinition(Modelfox_villager.LAYER_LOCATION, Modelfox_villager::createBodyLayer);
		event.registerLayerDefinition(Modelparrot_villager.LAYER_LOCATION, Modelparrot_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_fox_villager.LAYER_LOCATION, Modelbaby_fox_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_sheep_villager.LAYER_LOCATION, Modelbaby_sheep_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_cat_villager.LAYER_LOCATION, Modelbaby_cat_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_turtle_villager.LAYER_LOCATION, Modelbaby_turtle_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_wolf_villager.LAYER_LOCATION, Modelbaby_wolf_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_parrot_villager.LAYER_LOCATION, Modelbaby_parrot_villager::createBodyLayer);
	}
}