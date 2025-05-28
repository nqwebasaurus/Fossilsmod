package fossils.fossils.common.block;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import fossils.fossils.common.entity.block.FossilSlabBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FossilSlabWallBlock extends AbstractFossilSlabBlock implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	private static final Map<Direction, VoxelShape> AABBS = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH, Block.box(4.0D, 4.0D, 8.0D, 12.0D, 12.0D, 16.0D), Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 8.0D), Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 8.0D, 12.0D, 12.0D), Direction.WEST, Block.box(8.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D)));
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public FossilSlabWallBlock(AbstractFossilSlabBlock.Type type, BlockBehaviour.Properties properties) {
		super(type, properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public float getYRotationDegrees(BlockState state) {
		return state.getValue(FACING).toYRot();
	}

	public VoxelShape getShape(BlockState p_58114_, BlockGetter p_58115_, BlockPos p_58116_, CollisionContext p_58117_) {
		return AABBS.get(p_58114_.getValue(FACING));
	}

	public BlockState getStateForPlacement(BlockPlaceContext p_58104_) {
		FluidState fluidstate = p_58104_.getLevel().getFluidState(p_58104_.getClickedPos());
		BlockState blockstate = this.defaultBlockState();
		BlockGetter blockgetter = p_58104_.getLevel();
		BlockPos blockpos = p_58104_.getClickedPos();
		Direction[] adirection = p_58104_.getNearestLookingDirections();

		for(Direction direction : adirection) {
			if (direction.getAxis().isHorizontal()) {
				Direction direction1 = direction.getOpposite();
				blockstate = blockstate.setValue(FACING, direction1);
				if (!blockgetter.getBlockState(blockpos.relative(direction)).canBeReplaced(p_58104_)) {
					return blockstate.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
				}
			}
		}

		return null;
	}

	public BlockState rotate(BlockState p_58109_, Rotation p_58110_) {
		return p_58109_.setValue(FACING, p_58110_.rotate(p_58109_.getValue(FACING)));
	}

	@SuppressWarnings("deprecation")
	public BlockState mirror(BlockState p_58106_, Mirror p_58107_) {
		return p_58106_.rotate(p_58107_.getRotation(p_58106_.getValue(FACING)));
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

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_58112_) {
		p_58112_.add(FACING, WATERLOGGED);
	}

	@SuppressWarnings("deprecation")
	public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
		ItemStack stack = player.getItemInHand(hand);
		if (stack.isEmpty() ) {
			if (player.isShiftKeyDown()) {
				BlockState blockState = state;
				Direction initial = state.getValue(FACING);
				for (Direction dir = blockState.getValue(FACING); dir != initial; dir = dir.getCounterClockWise()) {
					BlockState blockState2 = blockState.setValue(FACING, dir);
					if (blockState2.canSurvive(world, pos)) {
						blockState = blockState2;
					}
				}

				if (state != blockState) {
					world.setBlockAndUpdate(pos, state.setValue(FACING, state.getValue(FACING).getClockWise()));
					return InteractionResult.sidedSuccess(world.isClientSide);
				} else {
					return InteractionResult.PASS;
				}
			} else {
				BlockState blockState = state;
				Direction initial = state.getValue(FACING);
				for (Direction dir = blockState.getValue(FACING); dir != initial; dir = dir.getClockWise()) {
					BlockState blockState2 = blockState.setValue(FACING, dir);
					if (blockState2.canSurvive(world, pos)) {
						blockState = blockState2;
					}
				}

				if (state != blockState) {
					world.setBlockAndUpdate(pos, state.setValue(FACING, state.getValue(FACING).getClockWise()));
					return InteractionResult.sidedSuccess(world.isClientSide);
				} else {
					return InteractionResult.PASS;
				}
			}
		} else return super.use(state, world, pos, player, hand, hit);
	}

}
