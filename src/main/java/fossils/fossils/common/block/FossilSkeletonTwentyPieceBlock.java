package fossils.fossils.common.block;

import fossils.fossils.common.entity.block.FossilSkeletonTwentyPieceBlockEntity;
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
import net.minecraft.world.item.TooltipFlag;
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

import javax.annotation.Nullable;
import java.util.List;

public class FossilSkeletonTwentyPieceBlock extends BaseEntityBlock implements SimpleWaterloggedBlock {
	public static final int MAX = RotationSegment.getMaxSegmentIndex();
	private static final int ROTATIONS = MAX + 1;
	public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
	public static final IntegerProperty FOSSIL_LEVEL = IntegerProperty.create("fossil_level", 0, 19);
	public static final BooleanProperty FRAME = BooleanProperty.create("frame");
	private final FossilSkeletonTwentyPieceBlock.Type type;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	int fossilLevel;

	public FossilSkeletonTwentyPieceBlock(FossilSkeletonTwentyPieceBlock.Type type, Properties p_49224_) {
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
		return new FossilSkeletonTwentyPieceBlockEntity(p_153215_, p_153216_);
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
		} else if (item == FossilItems.UTAHRAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.UTAHRAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SHONISAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.SHONISAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.APATOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.APATOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BRACHIOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.BRACHIOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.IGUANODON.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.IGUANODON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.AMARGASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.AMARGASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.NIGERSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.NIGERSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SARCOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.SARCOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PLIOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PLIOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HATZEGOPTERYX.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.HATZEGOPTERYX) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CARCHARODONTOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.CARCHARODONTOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.EDMONTOSAURUSANNECTENS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.EDMONTOSAURUSANNECTENS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TYRANNOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.TYRANNOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SPINOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.SPINOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MEGACEROPS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.MEGACEROPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.EREMOTHERIUM.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.EREMOTHERIUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PANTHERATIGRIS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PANTHERATIGRIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.COTYLORHYNCHUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.COTYLORHYNCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ALLOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.ALLOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LIVYATAN.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.LIVYATAN) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.THERIZINOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.THERIZINOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ARISTONECTES.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.ARISTONECTES) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.STEGOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.STEGOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PARASAUROLOPHUSWALKERI.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PARASAUROLOPHUSWALKERI) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ARCHELON.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.ARCHELON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DEINOTHERIUM.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.DEINOTHERIUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ANTEOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.ANTEOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DOEDICURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.DOEDICURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PARACERATHERIUMTRANSOURALICUM.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PARACERATHERIUMTRANSOURALICUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PACHYRHINOSAURUSCANADENSIS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PACHYRHINOSAURUSCANADENSIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ANKYLOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.ANKYLOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SIVATHERIUMGIGANTEUM.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.SIVATHERIUMGIGANTEUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BARYONYX.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.BARYONYX) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.YANGCHUANOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.YANGCHUANOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CERATOTHERIUM.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.CERATOTHERIUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SMILODON.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.SMILODON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DEINOCHEIRUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.DEINOCHEIRUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ACROCANTHOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.ACROCANTHOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BASILOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.BASILOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PTERANODONSTERNBERGI.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PTERANODONSTERNBERGI) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TRICERATOPSHORRIDUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.TRICERATOPSHORRIDUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MAMMUTHUSCOLUMBI.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.MAMMUTHUSCOLUMBI) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CAMARASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.CAMARASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIPLODOCUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.DIPLODOCUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.YUTYRANNUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.YUTYRANNUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MAMENCHISAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.MAMENCHISAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LESSEMSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.LESSEMSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PURUSSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PURUSSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.VARANUSPRISCUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.VARANUSPRISCUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SCUTOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.SCUTOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIMETRODONGRANDIS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.DIMETRODONGRANDIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.INOSTRANCEVIA.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.INOSTRANCEVIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MOSCHOPS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.MOSCHOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DASPLETOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.DASPLETOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.GIRAFFATITAN.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.GIRAFFATITAN) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HERRERASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.HERRERASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PLATEOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PLATEOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PRESTOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PRESTOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LISOWICIA.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.LISOWICIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PRIONOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.PRIONOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.JONKERIA.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.JONKERIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MASTODONSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.MASTODONSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CORYTHOSAURUSCASUARIUS.get() && state.getValue(FOSSIL_LEVEL) != 19 && type == Types.CORYTHOSAURUSCASUARIUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else return super.use(state, world, pos, player, hand, hit);
	}

	public FossilSkeletonTwentyPieceBlock.Type getType() {
		return this.type;
	}

	public interface Type{}

	public static enum Types implements Type {
		SHONISAURUS,
		APATOSAURUS,
		BRACHIOSAURUS,
		IGUANODON,
		AMARGASAURUS,
		NIGERSAURUS,
		SARCOSUCHUS,
		PLIOSAURUS,
		HATZEGOPTERYX,
		CARCHARODONTOSAURUS,
		EDMONTOSAURUSANNECTENS,
		TYRANNOSAURUS,
		SPINOSAURUS,
		MEGACEROPS,
		EREMOTHERIUM,
		PANTHERATIGRIS,
		COTYLORHYNCHUS,
		ALLOSAURUS,
		LIVYATAN,
		THERIZINOSAURUS,
		ARISTONECTES,
		STEGOSAURUS,
		PARASAUROLOPHUSWALKERI,
		ARCHELON,
		DEINOTHERIUM,
		ANTEOSAURUS,
		DOEDICURUS,
		PARACERATHERIUMTRANSOURALICUM,
		PACHYRHINOSAURUSCANADENSIS,
		ANKYLOSAURUS,
		SIVATHERIUMGIGANTEUM,
		BARYONYX,
		YANGCHUANOSAURUS,
		CERATOTHERIUM,
		SMILODON,
		DEINOCHEIRUS,
		ACROCANTHOSAURUS,
		BASILOSAURUS,
		PTERANODONSTERNBERGI,
		TRICERATOPSHORRIDUS,
		MAMMUTHUSCOLUMBI,
		CAMARASAURUS,
		DIPLODOCUS,
		YUTYRANNUS,
		MAMENCHISAURUS,
		LESSEMSAURUS,
		PURUSSAURUS,
		VARANUSPRISCUS,
		SCUTOSAURUS,
		DIMETRODONGRANDIS,
		INOSTRANCEVIA,
		MOSCHOPS,
		DASPLETOSAURUS,
		GIRAFFATITAN,
		HERRERASAURUS,
		PLATEOSAURUS,
		PRESTOSUCHUS,
		LISOWICIA,
		PRIONOSUCHUS,
		JONKERIA,
		MASTODONSAURUS,
		CORYTHOSAURUSCASUARIUS,
		UTAHRAPTOR;
	}

}
