/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.beastsofunburden.client.renderer.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BouModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BouModEntities.PARROT_VILLAGER.get(), ParrotVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_PARROT_VILLAGER.get(), BabyParrotVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.FOX_VILLAGER.get(), FoxVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.WOLF_VILLAGER.get(), WolfVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.AXOLOTL_VILLAGER.get(), AxolotlVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.HORSE_VILLAGER.get(), HorseVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.CAT_VILLAGER.get(), CatVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.COW_VILLAGER.get(), CowVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.LLAMA_VILLAGER.get(), LlamaVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BEAR_VILLAGER.get(), BearVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.PIG_VILLAGER.get(), PigVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.CHICKEN_VILLAGER.get(), ChickenVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.RABBIT_VILLAGER.get(), RabbitVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.SHEEP_VILLAGER.get(), SheepVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.TURTLE_VILLAGER.get(), TurtleVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BEE_VILLAGER.get(), BeeVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.SPIDER_VILLAGER.get(), SpiderVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.SQUID_VILLAGER.get(), SquidVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.HUMAN_VILLAGER.get(), HumanVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.DRAGON_VILLAGER.get(), DragonVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_FOX_VILLAGER.get(), BabyFoxVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_WOLF_VILLAGER.get(), BabyWolfVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_SHEEP_VILLAGER.get(), BabySheepVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_TURTLE_VILLAGER.get(), BabyTurtleVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_AXOLOTL_VILLAGER.get(), BabyAxolotlVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_CAT_VILLAGER.get(), BabyCatVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_COW_VILLAGER.get(), BabyCowVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_HORSE_VILLAGER.get(), BabyHorseVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_LLAMA_VILLAGER.get(), BabyLlamaVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_BEAR_VILLAGER.get(), BabyBearVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_PIG_VILLAGER.get(), BabyPigVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_CHICKEN_VILLAGER.get(), BabyChickenVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_RABBIT_VILLAGER.get(), BabyRabbitVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_SPIDER_VILLAGER.get(), BabySpiderVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.BABY_DRAGON_VILLAGER.get(), BabyDragonVillagerRenderer::new);
		event.registerEntityRenderer(BouModEntities.ANIMAL_CHEST_ENTITY.get(), AnimalChestEntityRenderer::new);
		event.registerEntityRenderer(BouModEntities.TOP_ANIMAL_CHEST_ENTITY.get(), TopAnimalChestEntityRenderer::new);
		event.registerEntityRenderer(BouModEntities.CHEST_ENTITY.get(), ChestEntityRenderer::new);
		event.registerEntityRenderer(BouModEntities.ANIMAL_SHOP_STALL.get(), AnimalShopStallRenderer::new);
	}
}