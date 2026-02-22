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
		event.registerLayerDefinition(Modelbaby_panda_villager.LAYER_LOCATION, Modelbaby_panda_villager::createBodyLayer);
		event.registerLayerDefinition(Modelturtle_villager.LAYER_LOCATION, Modelturtle_villager::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_villager.LAYER_LOCATION, Modelwolf_villager::createBodyLayer);
		event.registerLayerDefinition(Modelaxolotl_villager.LAYER_LOCATION, Modelaxolotl_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_rabbit_villager.LAYER_LOCATION, Modelbaby_rabbit_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_horse_villager.LAYER_LOCATION, Modelbaby_horse_villager::createBodyLayer);
		event.registerLayerDefinition(Modelllama_villager.LAYER_LOCATION, Modelllama_villager::createBodyLayer);
		event.registerLayerDefinition(Modelparrot_villager.LAYER_LOCATION, Modelparrot_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_llama_villager.LAYER_LOCATION, Modelbaby_llama_villager::createBodyLayer);
		event.registerLayerDefinition(Modelsquid_villager.LAYER_LOCATION, Modelsquid_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_axolotl_villager.LAYER_LOCATION, Modelbaby_axolotl_villager::createBodyLayer);
		event.registerLayerDefinition(Modelspider_villager.LAYER_LOCATION, Modelspider_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_turtle_villager.LAYER_LOCATION, Modelbaby_turtle_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_wolf_villager.LAYER_LOCATION, Modelbaby_wolf_villager::createBodyLayer);
		event.registerLayerDefinition(Modelchicken_villager.LAYER_LOCATION, Modelchicken_villager::createBodyLayer);
		event.registerLayerDefinition(Modeldragon_villager.LAYER_LOCATION, Modeldragon_villager::createBodyLayer);
		event.registerLayerDefinition(Modelcow_villager.LAYER_LOCATION, Modelcow_villager::createBodyLayer);
		event.registerLayerDefinition(Modelpig_villager.LAYER_LOCATION, Modelpig_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_parrot_villager.LAYER_LOCATION, Modelbaby_parrot_villager::createBodyLayer);
		event.registerLayerDefinition(Modelhorse_villager.LAYER_LOCATION, Modelhorse_villager::createBodyLayer);
		event.registerLayerDefinition(Modelcat_villager.LAYER_LOCATION, Modelcat_villager::createBodyLayer);
		event.registerLayerDefinition(Modelsheep_villager.LAYER_LOCATION, Modelsheep_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_chicken_villager.LAYER_LOCATION, Modelbaby_chicken_villager::createBodyLayer);
		event.registerLayerDefinition(Modelfox_villager.LAYER_LOCATION, Modelfox_villager::createBodyLayer);
		event.registerLayerDefinition(Modelpanda_villager.LAYER_LOCATION, Modelpanda_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_fox_villager.LAYER_LOCATION, Modelbaby_fox_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_pig_villager.LAYER_LOCATION, Modelbaby_pig_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbee_villager.LAYER_LOCATION, Modelbee_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_sheep_villager.LAYER_LOCATION, Modelbaby_sheep_villager::createBodyLayer);
		event.registerLayerDefinition(Modelrabbit_villager.LAYER_LOCATION, Modelrabbit_villager::createBodyLayer);
		event.registerLayerDefinition(Modelanimal_chest_entity_top.LAYER_LOCATION, Modelanimal_chest_entity_top::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_cat_villager.LAYER_LOCATION, Modelbaby_cat_villager::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_spider_villager.LAYER_LOCATION, Modelbaby_spider_villager::createBodyLayer);
		event.registerLayerDefinition(Modelanimal_chest_entity.LAYER_LOCATION, Modelanimal_chest_entity::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_cow_villager.LAYER_LOCATION, Modelbaby_cow_villager::createBodyLayer);
	}
}