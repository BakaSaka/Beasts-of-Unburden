package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import net.mcreator.beastsofunburden.init.BouModItems;
import net.mcreator.beastsofunburden.entity.*;

public class WandOfVariationEntityHitProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity player = null;
		Entity vendor = null;
		if ((entity.getPersistentData().getString("bound")).contains("bound")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("This entity works for " + entity.getPersistentData().getString("owner"))), false);
		} else if ((entity.getPersistentData().getString("bound")).contains("free") || (entity instanceof ParrotVillagerEntity _datEntS ? _datEntS.getEntityData().get(ParrotVillagerEntity.DATA_bound) : "").contains("free")) {
			if (sourceentity instanceof Player && getEntityGameType(sourceentity) == GameType.SURVIVAL && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BouModItems.WAND_OF_VARIATION.get()) {
				if (entity instanceof ParrotVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(ParrotVillagerEntity.DATA_variant, (int) ((entity instanceof ParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(ParrotVillagerEntity.DATA_variant) : 0) % 13 + 1));
				if (entity instanceof BabyParrotVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyParrotVillagerEntity.DATA_variant, (int) ((entity instanceof BabyParrotVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyParrotVillagerEntity.DATA_variant) : 0) % 13 + 1));
				if (entity instanceof FoxVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(FoxVillagerEntity.DATA_variant, (int) ((entity instanceof FoxVillagerEntity _datEntI ? _datEntI.getEntityData().get(FoxVillagerEntity.DATA_variant) : 0) % 5 + 1));
				if (entity instanceof BabyFoxVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyFoxVillagerEntity.DATA_variant, (int) ((entity instanceof BabyFoxVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyFoxVillagerEntity.DATA_variant) : 0) % 5 + 1));
				if (entity instanceof WolfVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(WolfVillagerEntity.DATA_variant, (int) ((entity instanceof WolfVillagerEntity _datEntI ? _datEntI.getEntityData().get(WolfVillagerEntity.DATA_variant) : 0) % 10 + 1));
				if (entity instanceof BabyWolfVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyWolfVillagerEntity.DATA_variant, (int) ((entity instanceof BabyWolfVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyWolfVillagerEntity.DATA_variant) : 0) % 10 + 1));
				if (entity instanceof AxolotlVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(AxolotlVillagerEntity.DATA_variant, (int) ((entity instanceof AxolotlVillagerEntity _datEntI ? _datEntI.getEntityData().get(AxolotlVillagerEntity.DATA_variant) : 0) % 8 + 1));
				if (entity instanceof BabyAxolotlVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyAxolotlVillagerEntity.DATA_variant, (int) ((entity instanceof BabyAxolotlVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyAxolotlVillagerEntity.DATA_variant) : 0) % 8 + 1));
				if (entity instanceof HorseVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(HorseVillagerEntity.DATA_variant, (int) ((entity instanceof HorseVillagerEntity _datEntI ? _datEntI.getEntityData().get(HorseVillagerEntity.DATA_variant) : 0) % 7 + 1));
				if (entity instanceof BabyHorseVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyHorseVillagerEntity.DATA_variant, (int) ((entity instanceof BabyHorseVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyHorseVillagerEntity.DATA_variant) : 0) % 7 + 1));
				if (entity instanceof CatVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(CatVillagerEntity.DATA_variant, (int) ((entity instanceof CatVillagerEntity _datEntI ? _datEntI.getEntityData().get(CatVillagerEntity.DATA_variant) : 0) % 12 + 1));
				if (entity instanceof BabyCatVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyCatVillagerEntity.DATA_variant, (int) ((entity instanceof BabyCatVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCatVillagerEntity.DATA_variant) : 0) % 12 + 1));
				if (entity instanceof CowVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(CowVillagerEntity.DATA_variant, (int) ((entity instanceof CowVillagerEntity _datEntI ? _datEntI.getEntityData().get(CowVillagerEntity.DATA_variant) : 0) % 7 + 1));
				if (entity instanceof BabyCowVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyCowVillagerEntity.DATA_variant, (int) ((entity instanceof BabyCowVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyCowVillagerEntity.DATA_variant) : 0) % 7 + 1));
				if (entity instanceof LlamaVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LlamaVillagerEntity.DATA_variant, (int) ((entity instanceof LlamaVillagerEntity _datEntI ? _datEntI.getEntityData().get(LlamaVillagerEntity.DATA_variant) : 0) % 10 + 1));
				if (entity instanceof BabyLlamaVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyLlamaVillagerEntity.DATA_variant, (int) ((entity instanceof BabyLlamaVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyLlamaVillagerEntity.DATA_variant) : 0) % 10 + 1));
				if (entity instanceof BearVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BearVillagerEntity.DATA_variant, (int) ((entity instanceof BearVillagerEntity _datEntI ? _datEntI.getEntityData().get(BearVillagerEntity.DATA_variant) : 0) % 6 + 1));
				if (entity instanceof BabyBearVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyBearVillagerEntity.DATA_variant, (int) ((entity instanceof BabyBearVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyBearVillagerEntity.DATA_variant) : 0) % 6 + 1));
				if (entity instanceof PigVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PigVillagerEntity.DATA_variant, (int) ((entity instanceof PigVillagerEntity _datEntI ? _datEntI.getEntityData().get(PigVillagerEntity.DATA_variant) : 0) % 6 + 1));
				if (entity instanceof BabyPigVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyPigVillagerEntity.DATA_variant, (int) ((entity instanceof BabyPigVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyPigVillagerEntity.DATA_variant) : 0) % 6 + 1));
				if (entity instanceof ChickenVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(ChickenVillagerEntity.DATA_variant, (int) ((entity instanceof ChickenVillagerEntity _datEntI ? _datEntI.getEntityData().get(ChickenVillagerEntity.DATA_variant) : 0) % 9 + 1));
				if (entity instanceof BabyChickenVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyChickenVillagerEntity.DATA_variant, (int) ((entity instanceof BabyChickenVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyChickenVillagerEntity.DATA_variant) : 0) % 9 + 1));
				if (entity instanceof RabbitVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(RabbitVillagerEntity.DATA_variant, (int) ((entity instanceof RabbitVillagerEntity _datEntI ? _datEntI.getEntityData().get(RabbitVillagerEntity.DATA_variant) : 0) % 8 + 1));
				if (entity instanceof BabyRabbitVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyRabbitVillagerEntity.DATA_variant, (int) ((entity instanceof BabyRabbitVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyRabbitVillagerEntity.DATA_variant) : 0) % 8 + 1));
				if (entity instanceof SheepVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(SheepVillagerEntity.DATA_variant, (int) ((entity instanceof SheepVillagerEntity _datEntI ? _datEntI.getEntityData().get(SheepVillagerEntity.DATA_variant) : 0) % 16 + 1));
				if (entity instanceof BabySheepVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabySheepVillagerEntity.DATA_variant, (int) ((entity instanceof BabySheepVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabySheepVillagerEntity.DATA_variant) : 0) % 16 + 1));
				if (entity instanceof TurtleVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(TurtleVillagerEntity.DATA_variant, (int) ((entity instanceof TurtleVillagerEntity _datEntI ? _datEntI.getEntityData().get(TurtleVillagerEntity.DATA_variant) : 0) % 5 + 1));
				if (entity instanceof BabyTurtleVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyTurtleVillagerEntity.DATA_variant, (int) ((entity instanceof BabyTurtleVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyTurtleVillagerEntity.DATA_variant) : 0) % 5 + 1));
				if (entity instanceof BeeVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BeeVillagerEntity.DATA_variant, (int) ((entity instanceof BeeVillagerEntity _datEntI ? _datEntI.getEntityData().get(BeeVillagerEntity.DATA_variant) : 0) % 4 + 1));
				if (entity instanceof SpiderVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(SpiderVillagerEntity.DATA_variant, (int) ((entity instanceof SpiderVillagerEntity _datEntI ? _datEntI.getEntityData().get(SpiderVillagerEntity.DATA_variant) : 0) % 7 + 1));
				if (entity instanceof BabySpiderVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabySpiderVillagerEntity.DATA_variant, (int) ((entity instanceof BabySpiderVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabySpiderVillagerEntity.DATA_variant) : 0) % 7 + 1));
				if (entity instanceof DragonVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(DragonVillagerEntity.DATA_variant, (int) ((entity instanceof DragonVillagerEntity _datEntI ? _datEntI.getEntityData().get(DragonVillagerEntity.DATA_variant) : 0) % 12 + 1));
				if (entity instanceof SquidVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(SquidVillagerEntity.DATA_variant, (int) ((entity instanceof SquidVillagerEntity _datEntI ? _datEntI.getEntityData().get(SquidVillagerEntity.DATA_variant) : 0) % 5 + 1));
				if (entity instanceof AnimalChestEntityEntity _datEntSetI)
					_datEntSetI.getEntityData().set(AnimalChestEntityEntity.DATA_variant, (int) ((entity instanceof AnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(AnimalChestEntityEntity.DATA_variant) : 0) % 11 + 1));
				if (entity instanceof TopAnimalChestEntityEntity _datEntSetI)
					_datEntSetI.getEntityData().set(TopAnimalChestEntityEntity.DATA_variant, (int) ((entity instanceof TopAnimalChestEntityEntity _datEntI ? _datEntI.getEntityData().get(TopAnimalChestEntityEntity.DATA_variant) : 0) % 11 + 1));
				if (entity instanceof DragonVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(DragonVillagerEntity.DATA_variant, (int) ((entity instanceof DragonVillagerEntity _datEntI ? _datEntI.getEntityData().get(DragonVillagerEntity.DATA_variant) : 0) % 12 + 1));
				if (entity instanceof BabyDragonVillagerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BabyDragonVillagerEntity.DATA_variant, (int) ((entity instanceof BabyDragonVillagerEntity _datEntI ? _datEntI.getEntityData().get(BabyDragonVillagerEntity.DATA_variant) : 0) % 12 + 1));
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level.isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}