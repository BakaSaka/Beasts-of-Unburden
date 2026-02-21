package net.mcreator.beastsofunburden.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.beastsofunburden.init.BouModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class KeyringGUIMenu extends AbstractContainerMenu implements BouModMenus.MenuAccessor {
	public final Map<String, Object> menuState = new HashMap<>() {
		@Override
		public Object put(String key, Object value) {
			if (!this.containsKey(key) && this.size() >= 151)
				return null;
			return super.put(key, value);
		}
	};
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public KeyringGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(BouModMenus.KEYRING_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(150);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, -6, -23) {
			private final int slot = 0;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 12, -23) {
			private final int slot = 1;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 30, -23) {
			private final int slot = 2;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 48, -23) {
			private final int slot = 3;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 66, -23) {
			private final int slot = 4;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 84, -23) {
			private final int slot = 5;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 102, -23) {
			private final int slot = 6;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 120, -23) {
			private final int slot = 7;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 138, -23) {
			private final int slot = 8;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 156, -23) {
			private final int slot = 9;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 174, -23) {
			private final int slot = 10;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 192, -23) {
			private final int slot = 11;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 210, -23) {
			private final int slot = 12;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 228, -23) {
			private final int slot = 13;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 246, -23) {
			private final int slot = 14;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, -6, -5) {
			private final int slot = 15;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 12, -5) {
			private final int slot = 16;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 30, -5) {
			private final int slot = 17;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 48, -5) {
			private final int slot = 18;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 66, -5) {
			private final int slot = 19;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 84, -5) {
			private final int slot = 20;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 102, -5) {
			private final int slot = 21;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 120, -5) {
			private final int slot = 22;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 138, -5) {
			private final int slot = 23;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 156, -5) {
			private final int slot = 24;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 174, -5) {
			private final int slot = 25;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 192, -5) {
			private final int slot = 26;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 210, -5) {
			private final int slot = 27;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 228, -5) {
			private final int slot = 28;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 246, -5) {
			private final int slot = 29;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, -6, 13) {
			private final int slot = 30;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 12, 13) {
			private final int slot = 31;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 30, 13) {
			private final int slot = 32;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 48, 13) {
			private final int slot = 33;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 66, 13) {
			private final int slot = 34;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 84, 13) {
			private final int slot = 35;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 102, 13) {
			private final int slot = 36;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 120, 13) {
			private final int slot = 37;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 138, 13) {
			private final int slot = 38;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 156, 13) {
			private final int slot = 39;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 174, 13) {
			private final int slot = 40;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 192, 13) {
			private final int slot = 41;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 210, 13) {
			private final int slot = 42;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 228, 13) {
			private final int slot = 43;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 246, 13) {
			private final int slot = 44;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, -6, 31) {
			private final int slot = 45;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 12, 31) {
			private final int slot = 46;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 30, 31) {
			private final int slot = 47;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 48, 31) {
			private final int slot = 48;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 66, 31) {
			private final int slot = 49;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 84, 31) {
			private final int slot = 50;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 102, 31) {
			private final int slot = 51;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 120, 31) {
			private final int slot = 52;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 138, 31) {
			private final int slot = 53;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 156, 31) {
			private final int slot = 54;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 174, 31) {
			private final int slot = 55;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 192, 31) {
			private final int slot = 56;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 210, 31) {
			private final int slot = 57;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 228, 31) {
			private final int slot = 58;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 246, 31) {
			private final int slot = 59;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, -6, 49) {
			private final int slot = 60;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 12, 49) {
			private final int slot = 61;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 30, 49) {
			private final int slot = 62;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 48, 49) {
			private final int slot = 63;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 66, 49) {
			private final int slot = 64;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 84, 49) {
			private final int slot = 65;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 102, 49) {
			private final int slot = 66;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 120, 49) {
			private final int slot = 67;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 138, 49) {
			private final int slot = 68;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 156, 49) {
			private final int slot = 69;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 174, 49) {
			private final int slot = 70;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 192, 49) {
			private final int slot = 71;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 210, 49) {
			private final int slot = 72;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 228, 49) {
			private final int slot = 73;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 246, 49) {
			private final int slot = 74;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, -6, 67) {
			private final int slot = 75;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 12, 67) {
			private final int slot = 76;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 30, 67) {
			private final int slot = 77;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 48, 67) {
			private final int slot = 78;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 66, 67) {
			private final int slot = 79;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 84, 67) {
			private final int slot = 80;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 102, 67) {
			private final int slot = 81;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 120, 67) {
			private final int slot = 82;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 138, 67) {
			private final int slot = 83;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 156, 67) {
			private final int slot = 84;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 174, 67) {
			private final int slot = 85;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 192, 67) {
			private final int slot = 86;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 210, 67) {
			private final int slot = 87;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 228, 67) {
			private final int slot = 88;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 246, 67) {
			private final int slot = 89;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, -6, 85) {
			private final int slot = 90;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 12, 85) {
			private final int slot = 91;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 30, 85) {
			private final int slot = 92;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 48, 85) {
			private final int slot = 93;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 66, 85) {
			private final int slot = 94;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 84, 85) {
			private final int slot = 95;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 102, 85) {
			private final int slot = 96;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 120, 85) {
			private final int slot = 97;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 138, 85) {
			private final int slot = 98;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 156, 85) {
			private final int slot = 99;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 174, 85) {
			private final int slot = 100;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 192, 85) {
			private final int slot = 101;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 210, 85) {
			private final int slot = 102;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 228, 85) {
			private final int slot = 103;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 246, 85) {
			private final int slot = 104;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, -6, 103) {
			private final int slot = 105;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 12, 103) {
			private final int slot = 106;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 30, 103) {
			private final int slot = 107;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 48, 103) {
			private final int slot = 108;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 66, 103) {
			private final int slot = 109;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 84, 103) {
			private final int slot = 110;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 102, 103) {
			private final int slot = 111;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 120, 103) {
			private final int slot = 112;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 138, 103) {
			private final int slot = 113;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 156, 103) {
			private final int slot = 114;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 174, 103) {
			private final int slot = 115;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 192, 103) {
			private final int slot = 116;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 210, 103) {
			private final int slot = 117;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 228, 103) {
			private final int slot = 118;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 246, 103) {
			private final int slot = 119;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, -6, 121) {
			private final int slot = 120;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 12, 121) {
			private final int slot = 121;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 30, 121) {
			private final int slot = 122;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 48, 121) {
			private final int slot = 123;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 66, 121) {
			private final int slot = 124;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 84, 121) {
			private final int slot = 125;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 102, 121) {
			private final int slot = 126;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 120, 121) {
			private final int slot = 127;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 138, 121) {
			private final int slot = 128;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 156, 121) {
			private final int slot = 129;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 174, 121) {
			private final int slot = 130;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 192, 121) {
			private final int slot = 131;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 210, 121) {
			private final int slot = 132;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 228, 121) {
			private final int slot = 133;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 246, 121) {
			private final int slot = 134;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, -6, 139) {
			private final int slot = 135;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 12, 139) {
			private final int slot = 136;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 30, 139) {
			private final int slot = 137;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 48, 139) {
			private final int slot = 138;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 66, 139) {
			private final int slot = 139;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 84, 139) {
			private final int slot = 140;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 102, 139) {
			private final int slot = 141;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 120, 139) {
			private final int slot = 142;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 138, 139) {
			private final int slot = 143;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 156, 139) {
			private final int slot = 144;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 174, 139) {
			private final int slot = 145;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 192, 139) {
			private final int slot = 146;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 210, 139) {
			private final int slot = 147;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 228, 139) {
			private final int slot = 148;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 246, 139) {
			private final int slot = 149;
			private int x = KeyringGUIMenu.this.x;
			private int y = KeyringGUIMenu.this.y;

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 40 + 8 + sj * 18, 297 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 40 + 8 + si * 18, 297 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 150) {
				if (!this.moveItemStackTo(itemstack1, 150, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 150, false)) {
				if (index < 150 + 27) {
					if (!this.moveItemStackTo(itemstack1, 150 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 150, 150 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.isEmpty()) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.getStackInSlot(j), false);
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(j, ItemStack.EMPTY);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.getStackInSlot(i));
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(i, ItemStack.EMPTY);
				}
			}
		}
	}

	@Override
	public Map<Integer, Slot> getSlots() {
		return Collections.unmodifiableMap(customSlots);
	}

	@Override
	public Map<String, Object> getMenuState() {
		return menuState;
	}
}