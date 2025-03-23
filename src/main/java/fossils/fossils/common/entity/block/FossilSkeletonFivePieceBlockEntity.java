package fossils.fossils.common.entity.block;

import fossils.fossils.init.FossilBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FossilSkeletonFivePieceBlockEntity extends BlockEntity  {

	public FossilSkeletonFivePieceBlockEntity(BlockPos p_155731_, BlockState p_155732_) {
		super(FossilBlockEntities.FOSSIL_SKELETON_FIVE_PIECE.get(), p_155731_, p_155732_);
	}

}
