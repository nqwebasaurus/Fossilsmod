package fossils.fossils.common.block;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;

public class RotatableFossilEntity extends BaseEntityBlock implements SimpleWaterloggedBlock {
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    /// the last index for rotations, which is 15
    public static final int MAX_ROTATION_INDEX = RotationSegment.getMaxSegmentIndex();
    private static final int ROTATIONS = MAX_ROTATION_INDEX + 1;

    private final FossilType fossilType;

    public RotatableFossilEntity(FossilType fossilType, Properties props) {
        super(props);
        this.fossilType = fossilType;
        this.registerDefaultState(this.stateDefinition.any().setValue(ROTATION, Integer.valueOf(0)).setValue(WATERLOGGED, false));
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FossilSlabBlockEntity(blockPos, blockState);
    }

    public float getRotationDegrees(BlockState state) {
        return RotationSegment.convertToDegrees(state.getValue(ROTATION));
    }

    public RotatableFossilEntity.FossilType getFossilType() {
        return this.fossilType;
    }

    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(ROTATION, Integer.valueOf(rotation.rotate(state.getValue(ROTATION), ROTATIONS)));
    }

    public BlockState mirror(BlockState p_56323_, Mirror mirror) {
        return p_56323_.setValue(ROTATION, Integer.valueOf(mirror.mirror(p_56323_.getValue(ROTATION), ROTATIONS)));
    }

    public boolean isPathfindable(BlockState p_53306_, BlockGetter p_53307_, BlockPos p_53308_, PathComputationType p_53309_) {
        return false;
    }

    public BlockState updateShape(BlockState blockState, Direction facing, BlockState facingState, LevelAccessor levelAccessor, BlockPos currentPos, BlockPos facingPos) {
        if (blockState.getValue(WATERLOGGED)) {
            levelAccessor.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        }
        return blockState;
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, ROTATION, WATERLOGGED);
    }

    /// allows for placement on the floor, walls, and ceiling
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        FluidState fluidstate = ctx.getLevel().getFluidState(ctx.getClickedPos());
        BlockState blockstate = this.defaultBlockState();
        BlockGetter blockgetter = ctx.getLevel();
        BlockPos blockpos = ctx.getClickedPos();
        Direction[] adirection = ctx.getNearestLookingDirections();

        for(Direction direction : adirection) {
            blockstate = blockstate.setValue(FACING, direction);
            if (!blockgetter.getBlockState(blockpos.relative(direction)).canBeReplaced(ctx)) {
                return blockstate.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            }
        }

        return null;
    }

    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.isEmpty() ) {
            if (player.isShiftKeyDown()) { // rotate counter-clockwise
                int rotation = state.getValue(ROTATION);
                world.setBlockAndUpdate(pos, state.setValue(ROTATION, (rotation + ROTATIONS - 1) % -ROTATIONS));
                return InteractionResult.sidedSuccess(world.isClientSide);
            } else { // rotate clockwise
                int rotation = state.getValue(ROTATION);
                world.setBlockAndUpdate(pos, state.setValue(ROTATION, (rotation + 1) % ROTATIONS));
                return InteractionResult.sidedSuccess(world.isClientSide);
            }
        } else return super.use(state, world, pos, player, hand, hit);
    }

    public interface FossilType {}
    public static enum Types implements FossilType {
        TROPAEUM,
        DICRANURUS,
        ALIENUM,
        CHARNIA,
        DICKINSONIA,
        OTTOIA,
        OPABINIA,
        WAPTIA,
        MOBULAVERMIS,
        HALLUCIGENIA,
        NECTOCARIS,
        HAIKOUICHTHYS,
        PIKAIA,
        CANADASPIS,
        KERYGMACHELA,
        BALHUTICARIS,
        CAMBRORASTER,
        EOREDLICHIA,
        YAWUNIK,
        MARRELLA,
        YOHOIA,
        SANCTACARIS,
        SKEEMELLA,
        PHANTASPIS,
        KLEPTOTHULE,
        ISOXYS,
        CAPINATATOR,
        HADRANAX,
        PAMBDELURION,
        SIDNEYIA,
        TUZOIA,
        VETULICOLA,
        AEGIROCASSIS,
        APHETOCERAS,
        HUNGIOIDES,
        CYRTOCERAS,
        PLATYPELTOIDES,
        LITUITES,
        COTHURNOCYSTIS,
        ORTHOCERAS,
        ARANDASPIS,
        SACABAMBASPIS,
        DIDYMOGRAPTUS,
        GONIOCERAS,
        ENDOCERAS,
        CONODONT,
        PRICYCLOPYGE,
        VILLEBRUNASTER,
        CALVAPILOSA,
        TREMAGLASPIS,
        EURYPTERUS,
        CIURCOPTERUS,
        GUIYU,
        BOHEMOHARPES,
        DUNYU,
        CROTALOCEPHALUS,
        POLYBRANCHIASPIS,
        CARCINOSOMA,
        FURCASTER,
        JAMOYTIUS,
        BIRKENIA,
        AINIKTOZOON,
        ARCTINURUS,
        PLATYLOMASPIS,
        PHRAGMOCERAS,
        SLIMONIA,
        MICROPHYMASPIS,
        PRISCOMYZON,
        BETHESDAICHTHYS,
        BRAZILICHTHYS,
        MAMULICHTHYS,
        THELODUS,
        WARNETICARIS,
        SCLERODUS,
        ROTACIURCA,
        CAMANCHIA,
        TRIMERUS,
        ARCHAEOPTERYX,
        MECOCHIRUS,
        CAIHONG,
        LONGISQUAMA,
        ERYMA,
        PHYLLOCERAS,
        TITANITES,
        LEEDSICHTHYS,
        PALAEONISCUM,
        PARANAICHTHYS,
        COOPEROCERAS,
        STENOPROTOME,
        RHYNCHODERCETIS,
        HARRANAHYNCHUS,
        PROTOZOEA,
        ANGUILLAVUS,
        KAYKAY,
        PRIONOLEPIS,
        SIGMAPYCNODUS,
        MARALDICHTHYS,
        HENSODON,
        BOBASATRANIA,
        HARPAGOFUTUTOR,
        PARAMETEORASPIS,
        CLADOSELACHE,
        HYDROPESSUM,
        MIMETASTER,
        HELIANTHASTER,
        FLAGELLOPANTOPUS,
        STENSIOELLA,
        LUNGMENSHANASPIS,
        DORYASPIS,
        GANTAROSTRATASPIS,
        FURCACAUDA,
        ANGELACANTHUS,
        OSTEOLEPIS,
        SEMIONOTUS,
        HIBBERTOPTERUS,
        EUSTHENOPTERON,
        JAEKELOPTERUS,
        PRAEARCTURUS,
        XENACANTHUS,
        SANTANMANTIS,
        BUNDENBACHIELLUS,
        HELIOPELTIS,
        PSYCHOPYGE,
        ATTERCOPUS,
        GIGATITAN,
        FOREYIA,
        GOSFORDIA,
        DIPTERONOTUS,
        BELANTSEA,
        BANDRINGA,
        TYRANNOPHONTES,
        VESTINAUTILUS,
        ECHINOCHIMAERA,
        SQUATINACTIS,
        ALLENYPTERUS,
        GROENLANDASPIS,
        CYCLOMEDUSA,
        HADRONECTOR,
        SENEKICHTHYS,
        BELLINYMPHA,
        AEGER,
        GREGORIUS,
        ANGUSTIDONTUS,
        ZENASPIS,
        BROCHOADMONES,
        RHINOPTERASPIS,
        GEMUENDINA,
        PAREXUS,
        SCAUMENACIA,
        DREPANASPIS,
        FALCATUS,
        ANOMALOCARIS,
        TULLIMONSTRUM,
        SCHINDERHANNES,
        ROSTROPYCNODUS,
    }
}
