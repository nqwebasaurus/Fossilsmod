package fossils.fossils.common.block;

import fossils.fossils.common.entity.block.FossilSkeletonFifteenPieceBlockEntity;
import fossils.fossils.init.FossilItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FossilSkeletonFifteenPieceBlock extends BaseEntityBlock implements SimpleWaterloggedBlock {
	public static final int MAX = RotationSegment.getMaxSegmentIndex();
	private static final int ROTATIONS = MAX + 1;
	public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
	public static final IntegerProperty FOSSIL_LEVEL = IntegerProperty.create("fossil_level", 0, 14);
	public static final BooleanProperty FRAME = BooleanProperty.create("frame");
	private final FossilSkeletonFifteenPieceBlock.Type type;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	int fossilLevel;

	public FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Type type, Properties p_49224_) {
		super(p_49224_);
		this.registerDefaultState(this.stateDefinition.any().setValue(ROTATION, Integer.valueOf(0)).setValue(FRAME, false).setValue(FOSSIL_LEVEL, Integer.valueOf(0)).setValue(WATERLOGGED, false));
		this.type = type;
	}

	public VoxelShape getVisualShape(BlockState p_48735_, BlockGetter p_48736_, BlockPos p_48737_, CollisionContext p_48738_) {
		return Shapes.empty();
	}

	public float getShadeBrightness(BlockState p_48731_, BlockGetter p_48732_, BlockPos p_48733_) {
		return 1.0F;
	}

	public boolean propagatesSkylightDown(BlockState p_48740_, BlockGetter p_48741_, BlockPos p_48742_) {
		return true;
	}

	public BlockState getStateForPlacement(BlockPlaceContext p_56321_) {
		FluidState fluidstate = p_56321_.getLevel().getFluidState(p_56321_.getClickedPos());
		return this.defaultBlockState().setValue(ROTATION, Integer.valueOf(RotationSegment.convertToSegment(p_56321_.getRotation()))).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
	}

	public boolean isPathfindable(BlockState p_53306_, BlockGetter p_53307_, BlockPos p_53308_, PathComputationType p_53309_) {
		return false;
	}

	public BlockState rotate(BlockState p_56326_, Rotation p_56327_) {
		return p_56326_.setValue(ROTATION, Integer.valueOf(p_56327_.rotate(p_56326_.getValue(ROTATION), ROTATIONS)));
	}

	public BlockState mirror(BlockState p_56323_, Mirror p_56324_) {
		return p_56323_.setValue(ROTATION, Integer.valueOf(p_56324_.mirror(p_56323_.getValue(ROTATION), ROTATIONS)));
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
		return new FossilSkeletonFifteenPieceBlockEntity(p_153215_, p_153216_);
	}

	public BlockState updateShape(BlockState p_154530_, Direction p_154531_, BlockState p_154532_, LevelAccessor p_154533_, BlockPos p_154534_, BlockPos p_154535_) {
		if (p_154530_.getValue(WATERLOGGED)) {
			p_154533_.scheduleTick(p_154534_, Fluids.WATER, Fluids.WATER.getTickDelay(p_154533_));
	      }
		return p_154530_;
	}

	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState p_52362_) {
		return p_52362_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_52362_);
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_56329_) {
		p_56329_.add(ROTATION, FOSSIL_LEVEL, FRAME, WATERLOGGED);
	}

	@SuppressWarnings("deprecation")
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		ItemStack stack = player.getItemInHand(hand);
		Item item = stack.getItem();
		if (stack.isEmpty() ) {
			if (player.isShiftKeyDown()) {
				if (state.getValue(FRAME)) {
					world.setBlockAndUpdate(pos, state.setValue(FRAME, false));
					if (!player.isCreative()) {
						player.setItemInHand(hand, new ItemStack(Items.IRON_BARS));
					}
					return InteractionResult.sidedSuccess(world.isClientSide);
				} else {
					int rotation = state.getValue(ROTATION);
					if (rotation - 1 >= 0) world.setBlockAndUpdate(pos, state.setValue(ROTATION, rotation - 1));
					else world.setBlockAndUpdate(pos, state.setValue(ROTATION, 15));
					return InteractionResult.sidedSuccess(world.isClientSide);
				}
			} else {
				int rotation = state.getValue(ROTATION);
				if (rotation + 1 <= 15) world.setBlockAndUpdate(pos, state.setValue(ROTATION, rotation + 1));
				else world.setBlockAndUpdate(pos, state.setValue(ROTATION, 0));
				return InteractionResult.sidedSuccess(world.isClientSide);
			}
		} else if (item == Items.IRON_BARS && !state.getValue(FRAME)) {
			world.setBlockAndUpdate(pos, state.setValue(FRAME, true));
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.WUERHOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.WUERHOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BISONLATIFRONS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.BISONLATIFRONS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SMILOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.SMILOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CRYOLOPHOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.CRYOLOPHOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DILOPHOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.DILOPHOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CERATOSAURUSDENTISULCATUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.CERATOSAURUSDENTISULCATUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.YINGSHANOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.YINGSHANOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PATAGOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.PATAGOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.EOABELISAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.EOABELISAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CAMPTOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.CAMPTOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.KOOLASUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.KOOLASUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SAUROPELTA.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.SAUROPELTA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ABYSSOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.ABYSSOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MUTTABURRASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.MUTTABURRASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DEINONYCHUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.DEINONYCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BRACHYTRACHELOPAN.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.BRACHYTRACHELOPAN) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TETHYSHADROS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.TETHYSHADROS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.REGALICERATOPS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.REGALICERATOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HUAXIAZHOULONG.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.HUAXIAZHOULONG) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.VELOCIRAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.VELOCIRAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.KUBANOCHOERUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.KUBANOCHOERUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DECENNATHERIUM.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.DECENNATHERIUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PLATECARPUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.PLATECARPUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.OVIRAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.OVIRAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.RAJASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 14 && type == Types.RAJASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(world.isClientSide);
		} else return super.use(state, world, pos, player, hand, hit);
	}

	public FossilSkeletonFifteenPieceBlock.Type getType() {
		return this.type;
	}

	public interface Type{}

	public static enum Types implements Type {
		BISONLATIFRONS,
		SMILOSUCHUS,
		CRYOLOPHOSAURUS,
		DILOPHOSAURUS,
		CERATOSAURUSDENTISULCATUS,
		YINGSHANOSAURUS,
		PATAGOSAURUS,
		EOABELISAURUS,
		CAMPTOSAURUS,
		KOOLASUCHUS,
		SAUROPELTA,
		ABYSSOSAURUS,
		MUTTABURRASAURUS,
		DEINONYCHUS,
		BRACHYTRACHELOPAN,
		TETHYSHADROS,
		REGALICERATOPS,
		HUAXIAZHOULONG,
		VELOCIRAPTOR,
		KUBANOCHOERUS,
		DECENNATHERIUM,
		PLATECARPUS,
		OVIRAPTOR,
		RAJASAURUS,
		WUERHOSAURUS;
	}

}
