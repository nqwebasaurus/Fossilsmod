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
	public static final RegistryObject<FossilSlabBlock> TROPAEUM = REGISTER.register("tropaeum_fossil", () -> new FossilSlabBlock(FossilSlabBlock.Types.TROPAEUM, Properties.of().strength(2.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().noOcclusion()));
	public static final RegistryObject<FossilSlabBlock> ALIENUM = REGISTER.register("alienum_fossil", () -> new FossilSlabBlock(FossilSlabBlock.Types.ALIENUM, Properties.of().strength(2.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().noOcclusion()));
	
	//Five
	public static final RegistryObject<FossilSkeletonFivePieceBlock> EUNOTOSAURUS = REGISTER.register("eunotosaurus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> PELECANIMIMUS = REGISTER.register("pelecanimimus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> ACANTHOSTEGA = REGISTER.register("acanthostega_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> STENOKRANIO = REGISTER.register("stenokranio_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.STENOKRANIO, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> HENODUS = REGISTER.register("henodus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.HENODUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> PROTOCERAS = REGISTER.register("protoceras_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.PROTOCERAS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> DIPLOCAULUSMAGNICORNIS = REGISTER.register("diplocaulusmagnicornis_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> TIKTAALIK = REGISTER.register("tiktaalik_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.TIKTAALIK, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> SUMINIA = REGISTER.register("suminia_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.SUMINIA, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> MEGALANCOSAURUS = REGISTER.register("megalancosaurus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> RIOJASUCHUS = REGISTER.register("riojasuchus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> DREPANOSAURUS = REGISTER.register("drepanosaurus_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> MANIDENS = REGISTER.register("manidens_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.MANIDENS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFivePieceBlock> DASYCEPS = REGISTER.register("dasyceps_fossil", () -> new FossilSkeletonFivePieceBlock(FossilSkeletonFivePieceBlock.Types.DASYCEPS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));


	//Ten
	public static final RegistryObject<FossilSkeletonTenPieceBlock> KENTROSAURUS = REGISTER.register("kentrosaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> NASUTOCERATOPS = REGISTER.register("nasutoceratops_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> SYNTHETOCERAS = REGISTER.register("synthetoceras_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> DIMETRODONGRANDIS = REGISTER.register("dimetrodongrandis_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> ENDOTHIODONBATHYSTOMA = REGISTER.register("endothiodonbathystoma_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> NIGERPETON = REGISTER.register("nigerpeton_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.NIGERPETON, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> PLACERIAS = REGISTER.register("placerias_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.PLACERIAS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> ARIZONASAURUS = REGISTER.register("arizonasaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> POPOSAURUS = REGISTER.register("poposaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> STAHLECKERIA = REGISTER.register("stahleckeria_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> STAGONOLEPIS = REGISTER.register("stagonolepis_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> GUANLONG = REGISTER.register("guanlong_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.GUANLONG, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> ICHTHYOSAURUS = REGISTER.register("ichthyosaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> SCELIDOSAURUS = REGISTER.register("scelidosaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> PIATNITZKYSAURUS = REGISTER.register("piatnitzkysaurus_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTenPieceBlock> DEARC = REGISTER.register("dearc_fossil", () -> new FossilSkeletonTenPieceBlock(FossilSkeletonTenPieceBlock.Types.DEARC, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));


	//Fifteen
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> WUERHOSAURUS = REGISTER.register("wuerhosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> BISONLATIFRONS = REGISTER.register("bisonlatifrons_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> SMILOSUCHUS = REGISTER.register("smilosuchus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> CRYOLOPHOSAURUS = REGISTER.register("cryolophosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> DILOPHOSAURUS = REGISTER.register("dilophosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> CERATOSAURUSDENTISULCATUS = REGISTER.register("ceratosaurusdentisulcatus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> YINGSHANOSAURUS = REGISTER.register("yingshanosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> PATAGOSAURUS = REGISTER.register("patagosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> EOABELISAURUS = REGISTER.register("eoabelisaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonFifteenPieceBlock> CAMPTOSAURUS = REGISTER.register("camptosaurus_fossil", () -> new FossilSkeletonFifteenPieceBlock(FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	
	//Twenty
	public static final RegistryObject<FossilSkeletonTwentyPieceBlock> UTAHRAPTOR = REGISTER.register("utahraptor_fossil", () -> new FossilSkeletonTwentyPieceBlock(FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTwentyPieceBlock> SHONISAURUS = REGISTER.register("shonisaurus_fossil", () -> new FossilSkeletonTwentyPieceBlock(FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTwentyPieceBlock> APATOSAURUS = REGISTER.register("apatosaurus_fossil", () -> new FossilSkeletonTwentyPieceBlock(FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));
	public static final RegistryObject<FossilSkeletonTwentyPieceBlock> BRACHIOSAURUS = REGISTER.register("brachiosaurus_fossil", () -> new FossilSkeletonTwentyPieceBlock(FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS, Properties.of().strength(2.0F, 3.0F).sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops().noOcclusion().noCollission()));

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
