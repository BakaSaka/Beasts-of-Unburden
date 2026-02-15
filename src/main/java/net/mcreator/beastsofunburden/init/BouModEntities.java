/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beastsofunburden.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.beastsofunburden.entity.*;
import net.mcreator.beastsofunburden.BouMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BouModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BouMod.MODID);
	public static final RegistryObject<EntityType<ParrotVillagerEntity>> PARROT_VILLAGER = register("parrot_villager",
			EntityType.Builder.<ParrotVillagerEntity>of(ParrotVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParrotVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabyParrotVillagerEntity>> BABY_PARROT_VILLAGER = register("baby_parrot_villager",
			EntityType.Builder.<BabyParrotVillagerEntity>of(BabyParrotVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyParrotVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AnimalChestEntityEntity>> ANIMAL_CHEST_ENTITY = register("animal_chest_entity", EntityType.Builder.<AnimalChestEntityEntity>of(AnimalChestEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(AnimalChestEntityEntity::new).fireImmune().sized(1f, 1.8f));
	public static final RegistryObject<EntityType<FoxVillagerEntity>> FOX_VILLAGER = register("fox_villager",
			EntityType.Builder.<FoxVillagerEntity>of(FoxVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FoxVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WolfVillagerEntity>> WOLF_VILLAGER = register("wolf_villager",
			EntityType.Builder.<WolfVillagerEntity>of(WolfVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WolfVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AxolotlVillagerEntity>> AXOLOTL_VILLAGER = register("axolotl_villager",
			EntityType.Builder.<AxolotlVillagerEntity>of(AxolotlVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AxolotlVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HorseVillagerEntity>> HORSE_VILLAGER = register("horse_villager", EntityType.Builder.<HorseVillagerEntity>of(HorseVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HorseVillagerEntity::new).fireImmune().sized(0.8f, 1.2f));
	public static final RegistryObject<EntityType<CatVillagerEntity>> CAT_VILLAGER = register("cat_villager",
			EntityType.Builder.<CatVillagerEntity>of(CatVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CatVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CowVillagerEntity>> COW_VILLAGER = register("cow_villager",
			EntityType.Builder.<CowVillagerEntity>of(CowVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CowVillagerEntity::new)

					.sized(0.8f, 2f));
	public static final RegistryObject<EntityType<LlamaVillagerEntity>> LLAMA_VILLAGER = register("llama_villager",
			EntityType.Builder.<LlamaVillagerEntity>of(LlamaVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LlamaVillagerEntity::new)

					.sized(0.8f, 2f));
	public static final RegistryObject<EntityType<BearVillagerEntity>> BEAR_VILLAGER = register("bear_villager",
			EntityType.Builder.<BearVillagerEntity>of(BearVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BearVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PigVillagerEntity>> PIG_VILLAGER = register("pig_villager",
			EntityType.Builder.<PigVillagerEntity>of(PigVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PigVillagerEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ChickenVillagerEntity>> CHICKEN_VILLAGER = register("chicken_villager",
			EntityType.Builder.<ChickenVillagerEntity>of(ChickenVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChickenVillagerEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<RabbitVillagerEntity>> RABBIT_VILLAGER = register("rabbit_villager",
			EntityType.Builder.<RabbitVillagerEntity>of(RabbitVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RabbitVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SheepVillagerEntity>> SHEEP_VILLAGER = register("sheep_villager",
			EntityType.Builder.<SheepVillagerEntity>of(SheepVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SheepVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TurtleVillagerEntity>> TURTLE_VILLAGER = register("turtle_villager",
			EntityType.Builder.<TurtleVillagerEntity>of(TurtleVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TurtleVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BeeVillagerEntity>> BEE_VILLAGER = register("bee_villager",
			EntityType.Builder.<BeeVillagerEntity>of(BeeVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeeVillagerEntity::new)

					.sized(1.2f, 0.6f));
	public static final RegistryObject<EntityType<SpiderVillagerEntity>> SPIDER_VILLAGER = register("spider_villager",
			EntityType.Builder.<SpiderVillagerEntity>of(SpiderVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderVillagerEntity::new)

					.sized(0.6f, 1.3f));
	public static final RegistryObject<EntityType<SquidVillagerEntity>> SQUID_VILLAGER = register("squid_villager", EntityType.Builder.<SquidVillagerEntity>of(SquidVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SquidVillagerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanVillagerEntity>> HUMAN_VILLAGER = register("human_villager",
			EntityType.Builder.<HumanVillagerEntity>of(HumanVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonVillagerEntity>> DRAGON_VILLAGER = register("dragon_villager", EntityType.Builder.<DragonVillagerEntity>of(DragonVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonVillagerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabyFoxVillagerEntity>> BABY_FOX_VILLAGER = register("baby_fox_villager",
			EntityType.Builder.<BabyFoxVillagerEntity>of(BabyFoxVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyFoxVillagerEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<BabyWolfVillagerEntity>> BABY_WOLF_VILLAGER = register("baby_wolf_villager",
			EntityType.Builder.<BabyWolfVillagerEntity>of(BabyWolfVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyWolfVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabySheepVillagerEntity>> BABY_SHEEP_VILLAGER = register("baby_sheep_villager",
			EntityType.Builder.<BabySheepVillagerEntity>of(BabySheepVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabySheepVillagerEntity::new)

					.sized(0.4f, 1f));
	public static final RegistryObject<EntityType<BabyTurtleVillagerEntity>> BABY_TURTLE_VILLAGER = register("baby_turtle_villager",
			EntityType.Builder.<BabyTurtleVillagerEntity>of(BabyTurtleVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyTurtleVillagerEntity::new)

					.sized(0.4f, 1.1f));
	public static final RegistryObject<EntityType<BabyAxolotlVillagerEntity>> BABY_AXOLOTL_VILLAGER = register("baby_axolotl_villager",
			EntityType.Builder.<BabyAxolotlVillagerEntity>of(BabyAxolotlVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyAxolotlVillagerEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<BabyCatVillagerEntity>> BABY_CAT_VILLAGER = register("baby_cat_villager",
			EntityType.Builder.<BabyCatVillagerEntity>of(BabyCatVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyCatVillagerEntity::new)

					.sized(0.4f, 1f));
	public static final RegistryObject<EntityType<BabyCowVillagerEntity>> BABY_COW_VILLAGER = register("baby_cow_villager",
			EntityType.Builder.<BabyCowVillagerEntity>of(BabyCowVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyCowVillagerEntity::new)

					.sized(0.5f, 1.1f));
	public static final RegistryObject<EntityType<BabyHorseVillagerEntity>> BABY_HORSE_VILLAGER = register("baby_horse_villager", EntityType.Builder.<BabyHorseVillagerEntity>of(BabyHorseVillagerEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyHorseVillagerEntity::new).fireImmune().sized(0.4f, 0.8f));
	public static final RegistryObject<EntityType<BabyLlamaVillagerEntity>> BABY_LLAMA_VILLAGER = register("baby_llama_villager",
			EntityType.Builder.<BabyLlamaVillagerEntity>of(BabyLlamaVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyLlamaVillagerEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<BabyBearVillagerEntity>> BABY_BEAR_VILLAGER = register("baby_bear_villager",
			EntityType.Builder.<BabyBearVillagerEntity>of(BabyBearVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyBearVillagerEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<BabyPigVillagerEntity>> BABY_PIG_VILLAGER = register("baby_pig_villager",
			EntityType.Builder.<BabyPigVillagerEntity>of(BabyPigVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyPigVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabyChickenVillagerEntity>> BABY_CHICKEN_VILLAGER = register("baby_chicken_villager",
			EntityType.Builder.<BabyChickenVillagerEntity>of(BabyChickenVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyChickenVillagerEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<BabyRabbitVillagerEntity>> BABY_RABBIT_VILLAGER = register("baby_rabbit_villager",
			EntityType.Builder.<BabyRabbitVillagerEntity>of(BabyRabbitVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyRabbitVillagerEntity::new)

					.sized(0.4f, 1f));
	public static final RegistryObject<EntityType<BabySpiderVillagerEntity>> BABY_SPIDER_VILLAGER = register("baby_spider_villager",
			EntityType.Builder.<BabySpiderVillagerEntity>of(BabySpiderVillagerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabySpiderVillagerEntity::new)

					.sized(0.5f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ParrotVillagerEntity.init();
			BabyParrotVillagerEntity.init();
			AnimalChestEntityEntity.init();
			FoxVillagerEntity.init();
			WolfVillagerEntity.init();
			AxolotlVillagerEntity.init();
			HorseVillagerEntity.init();
			CatVillagerEntity.init();
			CowVillagerEntity.init();
			LlamaVillagerEntity.init();
			BearVillagerEntity.init();
			PigVillagerEntity.init();
			ChickenVillagerEntity.init();
			RabbitVillagerEntity.init();
			SheepVillagerEntity.init();
			TurtleVillagerEntity.init();
			BeeVillagerEntity.init();
			SpiderVillagerEntity.init();
			SquidVillagerEntity.init();
			HumanVillagerEntity.init();
			DragonVillagerEntity.init();
			BabyFoxVillagerEntity.init();
			BabyWolfVillagerEntity.init();
			BabySheepVillagerEntity.init();
			BabyTurtleVillagerEntity.init();
			BabyAxolotlVillagerEntity.init();
			BabyCatVillagerEntity.init();
			BabyCowVillagerEntity.init();
			BabyHorseVillagerEntity.init();
			BabyLlamaVillagerEntity.init();
			BabyBearVillagerEntity.init();
			BabyPigVillagerEntity.init();
			BabyChickenVillagerEntity.init();
			BabyRabbitVillagerEntity.init();
			BabySpiderVillagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PARROT_VILLAGER.get(), ParrotVillagerEntity.createAttributes().build());
		event.put(BABY_PARROT_VILLAGER.get(), BabyParrotVillagerEntity.createAttributes().build());
		event.put(ANIMAL_CHEST_ENTITY.get(), AnimalChestEntityEntity.createAttributes().build());
		event.put(FOX_VILLAGER.get(), FoxVillagerEntity.createAttributes().build());
		event.put(WOLF_VILLAGER.get(), WolfVillagerEntity.createAttributes().build());
		event.put(AXOLOTL_VILLAGER.get(), AxolotlVillagerEntity.createAttributes().build());
		event.put(HORSE_VILLAGER.get(), HorseVillagerEntity.createAttributes().build());
		event.put(CAT_VILLAGER.get(), CatVillagerEntity.createAttributes().build());
		event.put(COW_VILLAGER.get(), CowVillagerEntity.createAttributes().build());
		event.put(LLAMA_VILLAGER.get(), LlamaVillagerEntity.createAttributes().build());
		event.put(BEAR_VILLAGER.get(), BearVillagerEntity.createAttributes().build());
		event.put(PIG_VILLAGER.get(), PigVillagerEntity.createAttributes().build());
		event.put(CHICKEN_VILLAGER.get(), ChickenVillagerEntity.createAttributes().build());
		event.put(RABBIT_VILLAGER.get(), RabbitVillagerEntity.createAttributes().build());
		event.put(SHEEP_VILLAGER.get(), SheepVillagerEntity.createAttributes().build());
		event.put(TURTLE_VILLAGER.get(), TurtleVillagerEntity.createAttributes().build());
		event.put(BEE_VILLAGER.get(), BeeVillagerEntity.createAttributes().build());
		event.put(SPIDER_VILLAGER.get(), SpiderVillagerEntity.createAttributes().build());
		event.put(SQUID_VILLAGER.get(), SquidVillagerEntity.createAttributes().build());
		event.put(HUMAN_VILLAGER.get(), HumanVillagerEntity.createAttributes().build());
		event.put(DRAGON_VILLAGER.get(), DragonVillagerEntity.createAttributes().build());
		event.put(BABY_FOX_VILLAGER.get(), BabyFoxVillagerEntity.createAttributes().build());
		event.put(BABY_WOLF_VILLAGER.get(), BabyWolfVillagerEntity.createAttributes().build());
		event.put(BABY_SHEEP_VILLAGER.get(), BabySheepVillagerEntity.createAttributes().build());
		event.put(BABY_TURTLE_VILLAGER.get(), BabyTurtleVillagerEntity.createAttributes().build());
		event.put(BABY_AXOLOTL_VILLAGER.get(), BabyAxolotlVillagerEntity.createAttributes().build());
		event.put(BABY_CAT_VILLAGER.get(), BabyCatVillagerEntity.createAttributes().build());
		event.put(BABY_COW_VILLAGER.get(), BabyCowVillagerEntity.createAttributes().build());
		event.put(BABY_HORSE_VILLAGER.get(), BabyHorseVillagerEntity.createAttributes().build());
		event.put(BABY_LLAMA_VILLAGER.get(), BabyLlamaVillagerEntity.createAttributes().build());
		event.put(BABY_BEAR_VILLAGER.get(), BabyBearVillagerEntity.createAttributes().build());
		event.put(BABY_PIG_VILLAGER.get(), BabyPigVillagerEntity.createAttributes().build());
		event.put(BABY_CHICKEN_VILLAGER.get(), BabyChickenVillagerEntity.createAttributes().build());
		event.put(BABY_RABBIT_VILLAGER.get(), BabyRabbitVillagerEntity.createAttributes().build());
		event.put(BABY_SPIDER_VILLAGER.get(), BabySpiderVillagerEntity.createAttributes().build());
	}
}