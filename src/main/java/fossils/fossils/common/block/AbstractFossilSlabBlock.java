package fossils.fossils.common.block;

import fossils.fossils.common.entity.block.FossilSlabBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractFossilSlabBlock extends BaseEntityBlock {
    private final Type fossilType;

    protected AbstractFossilSlabBlock(Type fossilType, Properties p_49224_) {
        super(p_49224_);
        this.fossilType = fossilType;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FossilSlabBlockEntity(blockPos, blockState);
    }

    public AbstractFossilSlabBlock.Type getType() {
        return this.fossilType;
    }

    public abstract float getYRotationDegrees(BlockState state);

    public interface Type{}

    public static enum Types implements Type {
        TROPAEUM,
        DICRANURUS,
        ALIENUM;
    }
}
