package fossils.fossils.common.entity.block;

import fossils.fossils.init.FossilBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FossilSlabBlockEntity extends BlockEntity  {
	public FossilSlabBlockEntity(BlockPos pos, BlockState state) {
		super(FossilBlockEntities.FOSSIL_SLAB.get(), pos, state);
	}
}
