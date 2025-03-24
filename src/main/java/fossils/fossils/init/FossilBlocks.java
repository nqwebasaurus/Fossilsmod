package fossils.fossils.init;

import fossils.fossils.FossilMod;
import fossils.fossils.common.block.FossilSkeletonFifteenPieceBlock;
import fossils.fossils.common.block.FossilSkeletonFivePieceBlock;
import fossils.fossils.common.block.FossilSkeletonTenPieceBlock;
import fossils.fossils.common.block.FossilSkeletonTwentyPieceBlock;
import fossils.fossils.common.block.FossilSlabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

	public static final RegistryObject<Block> PRECAMBRIAN_FOSSIL_ORE = REGISTER.register("precambrian_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> CAMBRIAN_FOSSIL_ORE = REGISTER.register("cambrian_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> ORDOVICIAN_FOSSIL_ORE = REGISTER.register("ordovician_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> SILURIAN_FOSSIL_ORE = REGISTER.register("silurian_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> DEVONIAN_FOSSIL_ORE = REGISTER.register("devonian_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> CARBONIFEROUS_FOSSIL_ORE = REGISTER.register("carboniferous_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> PERMIAN_FOSSIL_ORE = REGISTER.register("permian_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> PERMIAN_DEEPSLATE_FOSSIL_ORE = REGISTER.register("permian_deepslate_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> TRIASSIC_FOSSIL_ORE = REGISTER.register("triassic_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> TRIASSIC_DEEPSLATE_FOSSIL_ORE = REGISTER.register("triassic_deepslate_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> JURASSIC_FOSSIL_ORE = REGISTER.register("jurassic_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> EARLY_CRETACEOUS_FOSSIL_ORE = REGISTER.register("early_cretaceous_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> LATE_CRETACEOUS_FOSSIL_ORE = REGISTER.register("late_cretaceous_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> PALEOGENE_FOSSIL_ORE = REGISTER.register("paleogene_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> NEOGENE_FOSSIL_ORE = REGISTER.register("neogene_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> QUATERNARY_FOSSIL_ORE = REGISTER.register("quaternary_fossil_ore", () -> new Block(Properties.copy(Blocks.STONE)));

	
}
