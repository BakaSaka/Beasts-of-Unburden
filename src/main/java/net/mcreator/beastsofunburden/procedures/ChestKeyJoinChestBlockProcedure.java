package net.mcreator.beastsofunburden.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.init.BouModEntities;
import net.mcreator.beastsofunburden.init.BouModBlocks;
import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;

import java.util.Comparator;

public class ChestKeyJoinChestBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Direction block_direction = Direction.NORTH;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BouModBlocks.ANIMAL_CHEST_INACTIVE.get()) {
			block_direction = getDirectionFromBlockState((world.getBlockState(new BlockPos(x, y, z))));
			if (block_direction == Direction.NORTH) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AnimalChestEntityEntity(BouModEntities.ANIMAL_CHEST_ENTITY.get(), _level);
					entityToSpawn.moveTo(x, y, z, 180, 0);
					entityToSpawn.setYBodyRot(180);
					entityToSpawn.setYHeadRot(180);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (block_direction == Direction.SOUTH) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AnimalChestEntityEntity(BouModEntities.ANIMAL_CHEST_ENTITY.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (block_direction == Direction.EAST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AnimalChestEntityEntity(BouModEntities.ANIMAL_CHEST_ENTITY.get(), _level);
					entityToSpawn.moveTo(x, y, z, -90, 0);
					entityToSpawn.setYBodyRot(-90);
					entityToSpawn.setYHeadRot(-90);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (block_direction == Direction.WEST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AnimalChestEntityEntity(BouModEntities.ANIMAL_CHEST_ENTITY.get(), _level);
					entityToSpawn.moveTo(x, y, z, 90, 0);
					entityToSpawn.setYBodyRot(90);
					entityToSpawn.setYHeadRot(90);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if ((findEntityInWorldRange(world, AnimalChestEntityEntity.class, x, y, z, 1)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
				_toTame.tame(_owner);
		}
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		Property<?> prop = blockState.getBlock().getStateDefinition().getProperty("facing");
		if (prop instanceof DirectionProperty dp)
			return blockState.getValue(dp);
		prop = blockState.getBlock().getStateDefinition().getProperty("axis");
		return prop instanceof EnumProperty ep && ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}