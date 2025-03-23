package fossils.fossils.init;

import fossils.fossils.FossilMod;
import fossils.fossils.common.block.FossilSkeletonFifteenPieceBlock;
import fossils.fossils.common.block.FossilSkeletonFivePieceBlock;
import fossils.fossils.common.block.FossilSkeletonTenPieceBlock;
import fossils.fossils.common.block.FossilSkeletonTwentyPieceBlock;
import fossils.fossils.common.block.FossilSlabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FossilBlocks {
	public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, FossilMod.MOD_ID);

	//Slabs
	public static final RegistryObject<FossilSlabBlock> TROPAEUM = REGISTER.register("tropaeum_fossil", () -> new FossilSlabBlock(FossilSlabBlock.Types.TROPAEUM, Properties.of().strength(2.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().noCollission().noOcclusion()));
	
	//Five
	public static final RegistryObject<FossilSkeletonFivePieceBlock> EUNOTOSAURUS = REGISTER.register("eunotosaurus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> PELECANIMIMUS = REGISTER.register("pelecanimimus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	
	//Ten
	public static final RegistryObject<FossilSkeletonTenPieceBlock> KENTROSAURUS = REGISTER.register("kentrosaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion().noCollission()));

	//Fifteen
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> WUERHOSAURUS = REGISTER.register("wuerhosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	
	//Twenty
	public static final RegistryObject<FossilSkeletonTwentyPieceBlock> UTAHRAPTOR = REGISTER.register("utahraptor_fossil", () -> new FossilSkeletonTwentyPieceBlock(FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR, Properties.of().strength(2.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().noOcclusion().noCollission()));

}
