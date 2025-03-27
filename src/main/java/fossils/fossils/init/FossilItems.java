package fossils.fossils.init;

import fossils.fossils.FossilMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FossilItems {
	public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);

	//Slabs
	public static final RegistryObject<BlockItem> TROPAEUM = REGISTER.register("tropaeum_fossil", () -> new BlockItem(FossilBlocks.TROPAEUM.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ALIENUM = REGISTER.register("alienum_fossil", () -> new BlockItem(FossilBlocks.ALIENUM.get(), new Item.Properties()));
	
	//Five
	public static final RegistryObject<BlockItem> EUNOTOSAURUS = REGISTER.register("eunotosaurus_fossil", () -> new BlockItem(FossilBlocks.EUNOTOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PELECANIMIMUS = REGISTER.register("pelecanimimus_fossil", () -> new BlockItem(FossilBlocks.PELECANIMIMUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ACANTHOSTEGA = REGISTER.register("acanthostega_fossil", () -> new BlockItem(FossilBlocks.ACANTHOSTEGA.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STENOKRANIO = REGISTER.register("stenokranio_fossil", () -> new BlockItem(FossilBlocks.STENOKRANIO.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> HENODUS = REGISTER.register("henodus_fossil", () -> new BlockItem(FossilBlocks.HENODUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PROTOCERAS = REGISTER.register("protoceras_fossil", () -> new BlockItem(FossilBlocks.PROTOCERAS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DIPLOCAULUSMAGNICORNIS = REGISTER.register("diplocaulusmagnicornis_fossil", () -> new BlockItem(FossilBlocks.DIPLOCAULUSMAGNICORNIS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> TIKTAALIK = REGISTER.register("tiktaalik_fossil", () -> new BlockItem(FossilBlocks.TIKTAALIK.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SUMINIA = REGISTER.register("suminia_fossil", () -> new BlockItem(FossilBlocks.SUMINIA.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MEGALANCOSAURUS = REGISTER.register("megalancosaurus_fossil", () -> new BlockItem(FossilBlocks.MEGALANCOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> RIOJASUCHUS = REGISTER.register("riojasuchus_fossil", () -> new BlockItem(FossilBlocks.RIOJASUCHUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DREPANOSAURUS = REGISTER.register("drepanosaurus_fossil", () -> new BlockItem(FossilBlocks.DREPANOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MANIDENS = REGISTER.register("manidens_fossil", () -> new BlockItem(FossilBlocks.MANIDENS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));

	//Ten
	public static final RegistryObject<BlockItem> KENTROSAURUS = REGISTER.register("kentrosaurus_fossil", () -> new BlockItem(FossilBlocks.KENTROSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> NASUTOCERATOPS = REGISTER.register("nasutoceratops_fossil", () -> new BlockItem(FossilBlocks.NASUTOCERATOPS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SYNTHETOCERAS = REGISTER.register("synthetoceras_fossil", () -> new BlockItem(FossilBlocks.SYNTHETOCERAS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DIMETRODONGRANDIS = REGISTER.register("dimetrodongrandis_fossil", () -> new BlockItem(FossilBlocks.DIMETRODONGRANDIS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ENDOTHIODONBATHYSTOMA = REGISTER.register("endothiodonbathystoma_fossil", () -> new BlockItem(FossilBlocks.ENDOTHIODONBATHYSTOMA.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> NIGERPETON = REGISTER.register("nigerpeton_fossil", () -> new BlockItem(FossilBlocks.NIGERPETON.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PLACERIAS = REGISTER.register("placerias_fossil", () -> new BlockItem(FossilBlocks.PLACERIAS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ARIZONASAURUS = REGISTER.register("arizonasaurus_fossil", () -> new BlockItem(FossilBlocks.ARIZONASAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> POPOSAURUS = REGISTER.register("poposaurus_fossil", () -> new BlockItem(FossilBlocks.POPOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STAHLECKERIA = REGISTER.register("stahleckeria_fossil", () -> new BlockItem(FossilBlocks.STAHLECKERIA.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STAGONOLEPIS = REGISTER.register("stagonolepis_fossil", () -> new BlockItem(FossilBlocks.STAGONOLEPIS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> GUANLONG = REGISTER.register("guanlong_fossil", () -> new BlockItem(FossilBlocks.GUANLONG.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ICHTHYOSAURUS = REGISTER.register("ichthyosaurus_fossil", () -> new BlockItem(FossilBlocks.ICHTHYOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SCELIDOSAURUS = REGISTER.register("scelidosaurus_fossil", () -> new BlockItem(FossilBlocks.SCELIDOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));


	//Fifteen
	public static final RegistryObject<BlockItem> WUERHOSAURUS = REGISTER.register("wuerhosaurus_fossil", () -> new BlockItem(FossilBlocks.WUERHOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> BISONLATIFRONS = REGISTER.register("bisonlatifrons_fossil", () -> new BlockItem(FossilBlocks.BISONLATIFRONS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SMILOSUCHUS = REGISTER.register("smilosuchus_fossil", () -> new BlockItem(FossilBlocks.SMILOSUCHUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));

	//Twenty
	public static final RegistryObject<BlockItem> UTAHRAPTOR = REGISTER.register("utahraptor_fossil", () -> new BlockItem(FossilBlocks.UTAHRAPTOR.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SHONISAURUS = REGISTER.register("shonisaurus_fossil", () -> new BlockItem(FossilBlocks.SHONISAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
		
	public static final RegistryObject<BlockItem> PRECAMBRIAN_FOSSIL_ORE = REGISTER.register("precambrian_fossil_ore", () -> new BlockItem(FossilBlocks.PRECAMBRIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CAMBRIAN_FOSSIL_ORE = REGISTER.register("cambrian_fossil_ore", () -> new BlockItem(FossilBlocks.CAMBRIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ORDOVICIAN_FOSSIL_ORE = REGISTER.register("ordovician_fossil_ore", () -> new BlockItem(FossilBlocks.ORDOVICIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> SILURIAN_FOSSIL_ORE = REGISTER.register("silurian_fossil_ore", () -> new BlockItem(FossilBlocks.SILURIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> DEVONIAN_FOSSIL_ORE = REGISTER.register("devonian_fossil_ore", () -> new BlockItem(FossilBlocks.DEVONIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CARBONIFEROUS_FOSSIL_ORE = REGISTER.register("carboniferous_fossil_ore", () -> new BlockItem(FossilBlocks.CARBONIFEROUS_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> PERMIAN_FOSSIL_ORE = REGISTER.register("permian_fossil_ore", () -> new BlockItem(FossilBlocks.PERMIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> PERMIAN_DEEPSLATE_FOSSIL_ORE = REGISTER.register("permian_deepslate_fossil_ore", () -> new BlockItem(FossilBlocks.PERMIAN_DEEPSLATE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> TRIASSIC_FOSSIL_ORE = REGISTER.register("triassic_fossil_ore", () -> new BlockItem(FossilBlocks.TRIASSIC_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> TRIASSIC_DEEPSLATE_FOSSIL_ORE = REGISTER.register("triassic_deepslate_fossil_ore", () -> new BlockItem(FossilBlocks.TRIASSIC_DEEPSLATE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> JURASSIC_FOSSIL_ORE = REGISTER.register("jurassic_fossil_ore", () -> new BlockItem(FossilBlocks.JURASSIC_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> EARLY_CRETACEOUS_FOSSIL_ORE = REGISTER.register("early_cretaceous_fossil_ore", () -> new BlockItem(FossilBlocks.EARLY_CRETACEOUS_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> LATE_CRETACEOUS_FOSSIL_ORE = REGISTER.register("late_cretaceous_fossil_ore", () -> new BlockItem(FossilBlocks.LATE_CRETACEOUS_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> PALEOGENE_FOSSIL_ORE = REGISTER.register("paleogene_fossil_ore", () -> new BlockItem(FossilBlocks.PALEOGENE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> NEOGENE_FOSSIL_ORE = REGISTER.register("neogene_fossil_ore", () -> new BlockItem(FossilBlocks.NEOGENE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> QUATERNARY_FOSSIL_ORE = REGISTER.register("quaternary_fossil_ore", () -> new BlockItem(FossilBlocks.QUATERNARY_FOSSIL_ORE.get(), new Item.Properties()));
	
}
