package fossils.fossils.init;

import fossils.fossils.FossilMod;
import fossils.fossils.common.entity.block.FossilSkeletonFifteenPieceBlockEntity;
import fossils.fossils.common.entity.block.FossilSkeletonFivePieceBlockEntity;
import fossils.fossils.common.entity.block.FossilSkeletonTenPieceBlockEntity;
import fossils.fossils.common.entity.block.FossilSkeletonTwentyPieceBlockEntity;
import fossils.fossils.common.entity.block.FossilSlabBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FossilBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FossilMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<FossilSlabBlockEntity>> FOSSIL_SLAB = REGISTER.register("fossil_slab", () -> BlockEntityType.Builder.of(FossilSlabBlockEntity::new, FossilBlocks.TROPAEUM.get(), FossilBlocks.ALIENUM.get()).build(null));
    public static final RegistryObject<BlockEntityType<FossilSkeletonFivePieceBlockEntity>> FOSSIL_SKELETON_FIVE_PIECE = REGISTER.register("fossil_skeleton_five_piece", () -> BlockEntityType.Builder.of(FossilSkeletonFivePieceBlockEntity::new, FossilBlocks.EUNOTOSAURUS.get(), FossilBlocks.ACANTHOSTEGA.get(), FossilBlocks.STENOKRANIO.get(), FossilBlocks.HENODUS.get(), FossilBlocks.PROTOCERAS.get(), FossilBlocks.PELECANIMIMUS.get()).build(null));
    public static final RegistryObject<BlockEntityType<FossilSkeletonTenPieceBlockEntity>> FOSSIL_SKELETON_TEN_PIECE = REGISTER.register("fossil_skeleton_ten_piece", () -> BlockEntityType.Builder.of(FossilSkeletonTenPieceBlockEntity::new, FossilBlocks.NASUTOCERATOPS.get(), FossilBlocks.SYNTHETOCERAS.get(), FossilBlocks.KENTROSAURUS.get()).build(null));
    public static final RegistryObject<BlockEntityType<FossilSkeletonFifteenPieceBlockEntity>> FOSSIL_SKELETON_FIFTEEN_PIECE = REGISTER.register("fossil_skeleton_fifteen_piece", () -> BlockEntityType.Builder.of(FossilSkeletonFifteenPieceBlockEntity::new, FossilBlocks.BISONLATIFRONS.get(), FossilBlocks.WUERHOSAURUS.get()).build(null));
    public static final RegistryObject<BlockEntityType<FossilSkeletonTwentyPieceBlockEntity>> FOSSIL_SKELETON_TWENTY_PIECE = REGISTER.register("fossil_skeleton_twenty_piece", () -> BlockEntityType.Builder.of(FossilSkeletonTwentyPieceBlockEntity::new, FossilBlocks.UTAHRAPTOR.get()).build(null));
	
}
