package fossils.fossils.common.block;

import fossils.fossils.common.entity.block.FossilSkeletonFivePieceBlockEntity;
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

public class FossilSkeletonFivePieceBlock extends BaseEntityBlock implements SimpleWaterloggedBlock {
	public static final int MAX = RotationSegment.getMaxSegmentIndex();
	private static final int ROTATIONS = MAX + 1;
	public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
	public static final IntegerProperty FOSSIL_LEVEL = IntegerProperty.create("fossil_level", 0, 4);
	public static final BooleanProperty FRAME = BooleanProperty.create("frame");
	private final FossilSkeletonFivePieceBlock.Type type;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	int fossilLevel;

	public FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Type type, Properties p_49224_) {
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
		return new FossilSkeletonFivePieceBlockEntity(p_153215_, p_153216_);
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
		} else if (item == FossilItems.EUNOTOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.EUNOTOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PELECANIMIMUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PELECANIMIMUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ACANTHOSTEGA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ACANTHOSTEGA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.STENOKRANIO.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.STENOKRANIO) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HENODUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HENODUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PROTOCERAS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PROTOCERAS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIPLOCAULUSMAGNICORNIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DIPLOCAULUSMAGNICORNIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TIKTAALIK.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TIKTAALIK) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SUMINIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.SUMINIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MEGALANCOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MEGALANCOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.RIOJASUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.RIOJASUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DREPANOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DREPANOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MANIDENS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MANIDENS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DASYCEPS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DASYCEPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.AQUILOPS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.AQUILOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BANNYKUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.BANNYKUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.YUANYANGLONG.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.YUANYANGLONG) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MEI.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MEI) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ANATOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ANATOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.NQWEBASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.NQWEBASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SHUVUUIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.SHUVUUIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SILESAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.SILESAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BUITRERAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.BUITRERAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SYLVIORNIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.SYLVIORNIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ANUROGNATHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ANUROGNATHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.COMPSOGNATHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.COMPSOGNATHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.OKSOKO.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.OKSOKO) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.COLUMBA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.COLUMBA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIMORPHODON.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DIMORPHODON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PTERODACTYLUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PTERODACTYLUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BOTHRIOLEPIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.BOTHRIOLEPIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PLATYHYSTRIX.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PLATYHYSTRIX) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.JAKAPIL.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.JAKAPIL) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HALSZKARAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HALSZKARAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MENOCERAS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MENOCERAS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.SORDES.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.SORDES) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HOMUNCULUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HOMUNCULUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIPLOCAULUSMINIMUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DIPLOCAULUSMINIMUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.HESCHELERIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HESCHELERIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ERETMORHIPIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ERETMORHIPIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIADEMODON.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DIADEMODON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.KAYENTATHERIUM.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.KAYENTATHERIUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.MEGALIBGWILIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MEGALIBGWILIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LEPTICTIDIUM.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LEPTICTIDIUM) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PARMASTEGA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PARMASTEGA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TORUKJARA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TORUKJARA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CONVOLOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CONVOLOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.EOCURSOR.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.EOCURSOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.AUSTRIADACTYLUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.AUSTRIADACTYLUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.JIANCHANGNATHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.JIANCHANGNATHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.STEGOUROS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.STEGOUROS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LESOTHOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LESOTHOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PSITTACOSAURUSMONGOLIENSIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PSITTACOSAURUSMONGOLIENSIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DRACORAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DRACORAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TERATERPETON.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TERATERPETON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.INCISIVOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.INCISIVOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LITARGOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LITARGOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DALLASAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DALLASAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.GEIKIAELGINENSIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.GEIKIAELGINENSIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.IKRANDRACO.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.IKRANDRACO) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.LAGOSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LAGOSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.EFFIGIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.EFFIGIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BERTHASAURA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.BERTHASAURA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.PSITTACOSAURUSLUJIATUNENSIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PSITTACOSAURUSLUJIATUNENSIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.BEELZEBUFO.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.BEELZEBUFO) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CHAOYANGOPTERUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CHAOYANGOPTERUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CAIUAJARA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CAIUAJARA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.CALLAWAYIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CALLAWAYIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TAPEJARA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TAPEJARA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.TOCKUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TOCKUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.ELGINIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ELGINIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.EUROPEJARA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.EUROPEJARA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.KRANOSAURA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.KRANOSAURA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else if (item == FossilItems.DIPLOCERASPIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DIPLOCERASPIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.ACANTHOSTOMATOPS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ACANTHOSTOMATOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.HYPURONECTOR.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HYPURONECTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.MEILIFEILONG.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MEILIFEILONG) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.CARTORHYNCHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CARTORHYNCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.HUAXIADRACO.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HUAXIADRACO) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.SHENZHOUPTERUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.SHENZHOUPTERUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.PROBURNETIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PROBURNETIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.MIXOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MIXOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.CAVIRAMUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CAVIRAMUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.ALOPECOGNATHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ALOPECOGNATHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.CYAMODUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CYAMODUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.HETERODONTOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HETERODONTOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.XINPUSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.XINPUSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.TIARAJUDENS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TIARAJUDENS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.ROBERTIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ROBERTIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.MELOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.MELOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.DATHEOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.DATHEOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.LLALLAWAVIS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LLALLAWAVIS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.CONFLICTO.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CONFLICTO) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.PROGANOCHELYS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PROGANOCHELYS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.HYPERODAPEDON.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HYPERODAPEDON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.HUPEHSUCHUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HUPEHSUCHUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.GERROTHORAX.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.GERROTHORAX) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.ICHTHYOSTEGA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ICHTHYOSTEGA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.TETRACERATOPS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TETRACERATOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.LABIDOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LABIDOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.TANYSTROPHEUSLONGOBARDICUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.TANYSTROPHEUSLONGOBARDICUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.LAGERPETON.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LAGERPETON) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.HIPPOSAURUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.HIPPOSAURUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.ISENGOPS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.ISENGOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.YI.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.YI) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.LAIDLERIA.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.LAIDLERIA) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.YINLONG.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.YINLONG) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.CACOPS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.CACOPS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.EORAPTOR.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.EORAPTOR) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.BUNGARTIUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.BUNGARTIUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		}  else if (item == FossilItems.PROTEROGYRINUS.get() && state.getValue(FOSSIL_LEVEL) != 4 && type == Types.PROTEROGYRINUS) {
			fossilLevel = state.getValue(FOSSIL_LEVEL);
			world.setBlockAndUpdate(pos, state.setValue(FOSSIL_LEVEL, fossilLevel + 1));
			world.playSound(player, pos, SoundEvents.BONE_BLOCK_PLACE, SoundSource.BLOCKS);
			if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.sidedSuccess(world.isClientSide);
		} else return super.use(state, world, pos, player, hand, hit);
	}

	public FossilSkeletonFivePieceBlock.Type getType() {
		return this.type;
	}

	public interface Type{}

	public static enum Types implements Type {
		EUNOTOSAURUS,
		ACANTHOSTEGA,
		STENOKRANIO,
		HENODUS,
		TIKTAALIK,
		SUMINIA,
		MANIDENS,
		MEGALANCOSAURUS,
		DREPANOSAURUS,
		PROTOCERAS,
		RIOJASUCHUS,
		DIPLOCAULUSMAGNICORNIS,
		DASYCEPS,
		AQUILOPS,
		BANNYKUS,
		YUANYANGLONG,
		MEI,
		ANATOSUCHUS,
		NQWEBASAURUS,
		SHUVUUIA,
		SILESAURUS,
		BUITRERAPTOR,
		SYLVIORNIS,
		ANUROGNATHUS,
		COMPSOGNATHUS,
		OKSOKO,
		COLUMBA,
		DIMORPHODON,
		PTERODACTYLUS,
		BOTHRIOLEPIS,
		PLATYHYSTRIX,
		JAKAPIL,
		HALSZKARAPTOR,
		MENOCERAS,
		SORDES,
		HOMUNCULUS,
		DIPLOCAULUSMINIMUS,
		HESCHELERIA,
		ERETMORHIPIS,
		DIADEMODON,
		KAYENTATHERIUM,
		MEGALIBGWILIA,
		LEPTICTIDIUM,
		PARMASTEGA,
		TORUKJARA,
		CONVOLOSAURUS,
		EOCURSOR,
		AUSTRIADACTYLUS,
		JIANCHANGNATHUS,
		STEGOUROS,
		LESOTHOSAURUS,
		PSITTACOSAURUSMONGOLIENSIS,
		DRACORAPTOR,
		TERATERPETON,
		INCISIVOSAURUS,
		LITARGOSUCHUS,
		DALLASAURUS,
		GEIKIAELGINENSIS,
		IKRANDRACO,
		LAGOSUCHUS,
		EFFIGIA,
		BERTHASAURA,
		PSITTACOSAURUSLUJIATUNENSIS,
		BEELZEBUFO,
		CHAOYANGOPTERUS,
		CAIUAJARA,
		CALLAWAYIA,
		TAPEJARA,
		TOCKUS,
		ELGINIA,
		EUROPEJARA,
		KRANOSAURA,
		DIPLOCERASPIS,
		ACANTHOSTOMATOPS,
		HYPURONECTOR,
		MEILIFEILONG,
		CARTORHYNCHUS,
		HUAXIADRACO,
		SHENZHOUPTERUS,
		PROBURNETIA,
		MIXOSAURUS,
		CAVIRAMUS,
		ALOPECOGNATHUS,
		CYAMODUS,
		HETERODONTOSAURUS,
		XINPUSAURUS,
		TIARAJUDENS,
		ROBERTIA,
		MELOSAURUS,
		DATHEOSAURUS,
		LLALLAWAVIS,
		CONFLICTO,
		PROGANOCHELYS,
		HYPERODAPEDON,
		HUPEHSUCHUS,
		GERROTHORAX,
		ICHTHYOSTEGA,
		TETRACERATOPS,
		LABIDOSAURUS,
		TANYSTROPHEUSLONGOBARDICUS,
		LAGERPETON,
		HIPPOSAURUS,
		ISENGOPS,
		YI,
		LAIDLERIA,
		YINLONG,
		CACOPS,
		EORAPTOR,
		BUNGARTIUS,
		PROTEROGYRINUS,
		PELECANIMIMUS;
	}

}
