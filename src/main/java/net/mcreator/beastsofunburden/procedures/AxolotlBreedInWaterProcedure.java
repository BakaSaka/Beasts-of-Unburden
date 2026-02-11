package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class AxolotlBreedInWaterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SEAGRASS.asItem()) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) {
				world.gameEvent(sourceentity, GameEvent.MOB_INTERACT, new BlockPos(x, y, z));
			} else {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			}
		}
	}
}