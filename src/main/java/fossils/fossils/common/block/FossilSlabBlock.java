package fossils.fossils.common.block;

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
import org.jetbrains.annotations.NotNull;

public class FossilSlabBlock extends AbstractFossilSlabBlock implements SimpleWaterloggedBlock {
    public static final int MAX = RotationSegment.getMaxSegmentIndex();
    private static final int ROTATIONS = MAX + 1;
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public FossilSlabBlock(AbstractFossilSlabBlock.Type type, Properties p_49224_) {
        super(type, p_49224_);
        this.registerDefaultState(this.stateDefinition.any().setValue(ROTATION, Integer.valueOf(0)).setValue(WATERLOGGED, false));
    }

    @Override
    public float getYRotationDegrees(BlockState state) {
        return RotationSegment.convertToDegrees(state.getValue(ROTATION));
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

    public BlockState mirror(BlockState p_56323_, Mirror p_56324_) {
        return p_56323_.setValue(ROTATION, Integer.valueOf(p_56324_.mirror(p_56323_.getValue(ROTATION), ROTATIONS)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_56329_) {
        p_56329_.add(ROTATION, WATERLOGGED);
    }

    @SuppressWarnings("deprecation")
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.isEmpty() ) {
            if (player.isShiftKeyDown()) {
                int rotation = state.getValue(ROTATION);
                if (rotation - 1 >= 0) world.setBlockAndUpdate(pos, state.setValue(ROTATION, rotation - 1));
                else world.setBlockAndUpdate(pos, state.setValue(ROTATION, 15));
                return InteractionResult.sidedSuccess(world.isClientSide);
            } else {
                int rotation = state.getValue(ROTATION);
                if (rotation + 1 <= 15) world.setBlockAndUpdate(pos, state.setValue(ROTATION, rotation + 1));
                else world.setBlockAndUpdate(pos, state.setValue(ROTATION, 0));
                return InteractionResult.sidedSuccess(world.isClientSide);
            }
        } else return super.use(state, world, pos, player, hand, hit);
    }
}
