package fossils.fossils.init;

import fossils.fossils.FossilMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FossilItems {
	public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);
	public static final DeferredRegister<Item> ADVREGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);
	public static final DeferredRegister<Item> SKELETON_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);
	public static final DeferredRegister<Item> BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);
	public static final DeferredRegister<Item> SLAB_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);

	public static final RegistryObject<Item> ADVANCEMENT_LINE = ADVREGISTER.register("advancement_line", () -> new Item(new Item.Properties()));

	//Slabs
	public static final RegistryObject<BlockItem> TROPAEUM = SLAB_REGISTER.register("tropaeum_fossil", () -> new BlockItem(FossilBlocks.TROPAEUM.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ALIENUM = SLAB_REGISTER.register("alienum_fossil", () -> new BlockItem(FossilBlocks.ALIENUM.get(), new Item.Properties()));
	
	//Five
	public static final RegistryObject<BlockItem> EUNOTOSAURUS = SKELETON_REGISTER.register("eunotosaurus_fossil", () -> new BlockItem(FossilBlocks.EUNOTOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PELECANIMIMUS = SKELETON_REGISTER.register("pelecanimimus_fossil", () -> new BlockItem(FossilBlocks.PELECANIMIMUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ACANTHOSTEGA = SKELETON_REGISTER.register("acanthostega_fossil", () -> new BlockItem(FossilBlocks.ACANTHOSTEGA.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STENOKRANIO = SKELETON_REGISTER.register("stenokranio_fossil", () -> new BlockItem(FossilBlocks.STENOKRANIO.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> HENODUS = SKELETON_REGISTER.register("henodus_fossil", () -> new BlockItem(FossilBlocks.HENODUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PROTOCERAS = SKELETON_REGISTER.register("protoceras_fossil", () -> new BlockItem(FossilBlocks.PROTOCERAS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DIPLOCAULUSMAGNICORNIS = SKELETON_REGISTER.register("diplocaulusmagnicornis_fossil", () -> new BlockItem(FossilBlocks.DIPLOCAULUSMAGNICORNIS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> TIKTAALIK = SKELETON_REGISTER.register("tiktaalik_fossil", () -> new BlockItem(FossilBlocks.TIKTAALIK.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SUMINIA = SKELETON_REGISTER.register("suminia_fossil", () -> new BlockItem(FossilBlocks.SUMINIA.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MEGALANCOSAURUS = SKELETON_REGISTER.register("megalancosaurus_fossil", () -> new BlockItem(FossilBlocks.MEGALANCOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> RIOJASUCHUS = SKELETON_REGISTER.register("riojasuchus_fossil", () -> new BlockItem(FossilBlocks.RIOJASUCHUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DREPANOSAURUS = SKELETON_REGISTER.register("drepanosaurus_fossil", () -> new BlockItem(FossilBlocks.DREPANOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MANIDENS = SKELETON_REGISTER.register("manidens_fossil", () -> new BlockItem(FossilBlocks.MANIDENS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DASYCEPS = SKELETON_REGISTER.register("dasyceps_fossil", () -> new BlockItem(FossilBlocks.DASYCEPS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> AQUILOPS = SKELETON_REGISTER.register("aquilops_fossil", () -> new BlockItem(FossilBlocks.AQUILOPS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> BANNYKUS = SKELETON_REGISTER.register("bannykus_fossil", () -> new BlockItem(FossilBlocks.BANNYKUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> YUANYANGLONG = SKELETON_REGISTER.register("yuanyanglong_fossil", () -> new BlockItem(FossilBlocks.YUANYANGLONG.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MEI = SKELETON_REGISTER.register("mei_fossil", () -> new BlockItem(FossilBlocks.MEI.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ANATOSUCHUS = SKELETON_REGISTER.register("anatosuchus_fossil", () -> new BlockItem(FossilBlocks.ANATOSUCHUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> NQWEBASAURUS = SKELETON_REGISTER.register("nqwebasaurus_fossil", () -> new BlockItem(FossilBlocks.NQWEBASAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SHUVUUIA = SKELETON_REGISTER.register("shuvuuia_fossil", () -> new BlockItem(FossilBlocks.SHUVUUIA.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));

	//Ten
	public static final RegistryObject<BlockItem> KENTROSAURUS = SKELETON_REGISTER.register("kentrosaurus_fossil", () -> new BlockItem(FossilBlocks.KENTROSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> NASUTOCERATOPS = SKELETON_REGISTER.register("nasutoceratops_fossil", () -> new BlockItem(FossilBlocks.NASUTOCERATOPS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SYNTHETOCERAS = SKELETON_REGISTER.register("synthetoceras_fossil", () -> new BlockItem(FossilBlocks.SYNTHETOCERAS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DIMETRODONGRANDIS = SKELETON_REGISTER.register("dimetrodongrandis_fossil", () -> new BlockItem(FossilBlocks.DIMETRODONGRANDIS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ENDOTHIODONBATHYSTOMA = SKELETON_REGISTER.register("endothiodonbathystoma_fossil", () -> new BlockItem(FossilBlocks.ENDOTHIODONBATHYSTOMA.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> NIGERPETON = SKELETON_REGISTER.register("nigerpeton_fossil", () -> new BlockItem(FossilBlocks.NIGERPETON.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PLACERIAS = SKELETON_REGISTER.register("placerias_fossil", () -> new BlockItem(FossilBlocks.PLACERIAS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ARIZONASAURUS = SKELETON_REGISTER.register("arizonasaurus_fossil", () -> new BlockItem(FossilBlocks.ARIZONASAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> POPOSAURUS = SKELETON_REGISTER.register("poposaurus_fossil", () -> new BlockItem(FossilBlocks.POPOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STAHLECKERIA = SKELETON_REGISTER.register("stahleckeria_fossil", () -> new BlockItem(FossilBlocks.STAHLECKERIA.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STAGONOLEPIS = SKELETON_REGISTER.register("stagonolepis_fossil", () -> new BlockItem(FossilBlocks.STAGONOLEPIS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> GUANLONG = SKELETON_REGISTER.register("guanlong_fossil", () -> new BlockItem(FossilBlocks.GUANLONG.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ICHTHYOSAURUS = SKELETON_REGISTER.register("ichthyosaurus_fossil", () -> new BlockItem(FossilBlocks.ICHTHYOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SCELIDOSAURUS = SKELETON_REGISTER.register("scelidosaurus_fossil", () -> new BlockItem(FossilBlocks.SCELIDOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PIATNITZKYSAURUS = SKELETON_REGISTER.register("piatnitzkysaurus_fossil", () -> new BlockItem(FossilBlocks.PIATNITZKYSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DEARC = SKELETON_REGISTER.register("dearc_fossil", () -> new BlockItem(FossilBlocks.DEARC.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> TUPANDACTYLUSNAVIGANS = SKELETON_REGISTER.register("tupandactylusnavigans_fossil", () -> new BlockItem(FossilBlocks.TUPANDACTYLUSNAVIGANS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SKORPIOVENATOR = SKELETON_REGISTER.register("skorpiovenator_fossil", () -> new BlockItem(FossilBlocks.SKORPIOVENATOR.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PROTOCERATOPSANDREWSI = SKELETON_REGISTER.register("protoceratopsandrewsi_fossil", () -> new BlockItem(FossilBlocks.PROTOCERATOPSANDREWSI.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> STRUTHIOMIMUS = SKELETON_REGISTER.register("struthiomimus_fossil", () -> new BlockItem(FossilBlocks.STRUTHIOMIMUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MONTANOCERATOPS = SKELETON_REGISTER.register("montanoceratops_fossil", () -> new BlockItem(FossilBlocks.MONTANOCERATOPS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DORUDON = SKELETON_REGISTER.register("dorudon_fossil", () -> new BlockItem(FossilBlocks.DORUDON.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> GASTORNIS = SKELETON_REGISTER.register("gastornis_fossil", () -> new BlockItem(FossilBlocks.GASTORNIS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> KUTCHICETUS = SKELETON_REGISTER.register("kutchicetus_fossil", () -> new BlockItem(FossilBlocks.KUTCHICETUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PRODINOCERAS = SKELETON_REGISTER.register("prodinoceras_fossil", () -> new BlockItem(FossilBlocks.PRODINOCERAS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> THYLACOLEO = SKELETON_REGISTER.register("thylacoleo_fossil", () -> new BlockItem(FossilBlocks.THYLACOLEO.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SINCLAIROMERYX = SKELETON_REGISTER.register("sinclairomeryx_fossil", () -> new BlockItem(FossilBlocks.SINCLAIROMERYX.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DINOCROCUTA = SKELETON_REGISTER.register("dinocrocuta_fossil", () -> new BlockItem(FossilBlocks.DINOCROCUTA.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));


	//Fifteen
	public static final RegistryObject<BlockItem> WUERHOSAURUS = SKELETON_REGISTER.register("wuerhosaurus_fossil", () -> new BlockItem(FossilBlocks.WUERHOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> BISONLATIFRONS = SKELETON_REGISTER.register("bisonlatifrons_fossil", () -> new BlockItem(FossilBlocks.BISONLATIFRONS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SMILOSUCHUS = SKELETON_REGISTER.register("smilosuchus_fossil", () -> new BlockItem(FossilBlocks.SMILOSUCHUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> CRYOLOPHOSAURUS = SKELETON_REGISTER.register("cryolophosaurus_fossil", () -> new BlockItem(FossilBlocks.CRYOLOPHOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DILOPHOSAURUS = SKELETON_REGISTER.register("dilophosaurus_fossil", () -> new BlockItem(FossilBlocks.DILOPHOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> CERATOSAURUSDENTISULCATUS = SKELETON_REGISTER.register("ceratosaurusdentisulcatus_fossil", () -> new BlockItem(FossilBlocks.CERATOSAURUSDENTISULCATUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> YINGSHANOSAURUS = SKELETON_REGISTER.register("yingshanosaurus_fossil", () -> new BlockItem(FossilBlocks.YINGSHANOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PATAGOSAURUS = SKELETON_REGISTER.register("patagosaurus_fossil", () -> new BlockItem(FossilBlocks.PATAGOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> EOABELISAURUS = SKELETON_REGISTER.register("eoabelisaurus_fossil", () -> new BlockItem(FossilBlocks.EOABELISAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> CAMPTOSAURUS = SKELETON_REGISTER.register("camptosaurus_fossil", () -> new BlockItem(FossilBlocks.CAMPTOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> KOOLASUCHUS = SKELETON_REGISTER.register("koolasuchus_fossil", () -> new BlockItem(FossilBlocks.KOOLASUCHUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SAUROPELTA = SKELETON_REGISTER.register("sauropelta_fossil", () -> new BlockItem(FossilBlocks.SAUROPELTA.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> ABYSSOSAURUS = SKELETON_REGISTER.register("abyssosaurus_fossil", () -> new BlockItem(FossilBlocks.ABYSSOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MUTTABURRASAURUS = SKELETON_REGISTER.register("muttaburrasaurus_fossil", () -> new BlockItem(FossilBlocks.MUTTABURRASAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DEINONYCHUS = SKELETON_REGISTER.register("deinonychus_fossil", () -> new BlockItem(FossilBlocks.DEINONYCHUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> BRACHYTRACHELOPAN = SKELETON_REGISTER.register("brachytrachelopan_fossil", () -> new BlockItem(FossilBlocks.BRACHYTRACHELOPAN.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> TETHYSHADROS = SKELETON_REGISTER.register("tethyshadros_fossil", () -> new BlockItem(FossilBlocks.TETHYSHADROS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> REGALICERATOPS = SKELETON_REGISTER.register("regaliceratops_fossil", () -> new BlockItem(FossilBlocks.REGALICERATOPS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> HUAXIAZHOULONG = SKELETON_REGISTER.register("huaxiazhoulong_fossil", () -> new BlockItem(FossilBlocks.HUAXIAZHOULONG.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> VELOCIRAPTOR = SKELETON_REGISTER.register("velociraptor_fossil", () -> new BlockItem(FossilBlocks.VELOCIRAPTOR.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> KUBANOCHOERUS = SKELETON_REGISTER.register("kubanochoerus_fossil", () -> new BlockItem(FossilBlocks.KUBANOCHOERUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> DECENNATHERIUM = SKELETON_REGISTER.register("decennatherium_fossil", () -> new BlockItem(FossilBlocks.DECENNATHERIUM.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));

	//Twenty
	public static final RegistryObject<BlockItem> UTAHRAPTOR = SKELETON_REGISTER.register("utahraptor_fossil", () -> new BlockItem(FossilBlocks.UTAHRAPTOR.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SHONISAURUS = SKELETON_REGISTER.register("shonisaurus_fossil", () -> new BlockItem(FossilBlocks.SHONISAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> APATOSAURUS = SKELETON_REGISTER.register("apatosaurus_fossil", () -> new BlockItem(FossilBlocks.APATOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> BRACHIOSAURUS = SKELETON_REGISTER.register("brachiosaurus_fossil", () -> new BlockItem(FossilBlocks.BRACHIOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> IGUANODON = SKELETON_REGISTER.register("iguanodon_fossil", () -> new BlockItem(FossilBlocks.IGUANODON.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> AMARGASAURUS = SKELETON_REGISTER.register("amargasaurus_fossil", () -> new BlockItem(FossilBlocks.AMARGASAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> NIGERSAURUS = SKELETON_REGISTER.register("nigersaurus_fossil", () -> new BlockItem(FossilBlocks.NIGERSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SARCOSUCHUS = SKELETON_REGISTER.register("sarcosuchus_fossil", () -> new BlockItem(FossilBlocks.SARCOSUCHUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PLIOSAURUS = SKELETON_REGISTER.register("pliosaurus_fossil", () -> new BlockItem(FossilBlocks.PLIOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> HATZEGOPTERYX = SKELETON_REGISTER.register("hatzegopteryx_fossil", () -> new BlockItem(FossilBlocks.HATZEGOPTERYX.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> CARCHARODONTOSAURUS = SKELETON_REGISTER.register("carcharodontosaurus_fossil", () -> new BlockItem(FossilBlocks.CARCHARODONTOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> EDMONTOSAURUSANNECTENS = SKELETON_REGISTER.register("edmontosaurusannectens_fossil", () -> new BlockItem(FossilBlocks.EDMONTOSAURUSANNECTENS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> TYRANNOSAURUS = SKELETON_REGISTER.register("tyrannosaurus_fossil", () -> new BlockItem(FossilBlocks.TYRANNOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> SPINOSAURUS = SKELETON_REGISTER.register("spinosaurus_fossil", () -> new BlockItem(FossilBlocks.SPINOSAURUS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> MEGACEROPS = SKELETON_REGISTER.register("megacerops_fossil", () -> new BlockItem(FossilBlocks.MEGACEROPS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> EREMOTHERIUM = SKELETON_REGISTER.register("eremotherium_fossil", () -> new BlockItem(FossilBlocks.EREMOTHERIUM.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PANTHERATIGRIS = SKELETON_REGISTER.register("pantheratigris_fossil", () -> new BlockItem(FossilBlocks.PANTHERATIGRIS.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
		
	public static final RegistryObject<BlockItem> PRECAMBRIAN_FOSSIL_ORE = BLOCK_REGISTER.register("precambrian_fossil_ore", () -> new BlockItem(FossilBlocks.PRECAMBRIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CAMBRIAN_FOSSIL_ORE = BLOCK_REGISTER.register("cambrian_fossil_ore", () -> new BlockItem(FossilBlocks.CAMBRIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ORDOVICIAN_FOSSIL_ORE = BLOCK_REGISTER.register("ordovician_fossil_ore", () -> new BlockItem(FossilBlocks.ORDOVICIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> SILURIAN_FOSSIL_ORE = BLOCK_REGISTER.register("silurian_fossil_ore", () -> new BlockItem(FossilBlocks.SILURIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> DEVONIAN_FOSSIL_ORE = BLOCK_REGISTER.register("devonian_fossil_ore", () -> new BlockItem(FossilBlocks.DEVONIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CARBONIFEROUS_FOSSIL_ORE = BLOCK_REGISTER.register("carboniferous_fossil_ore", () -> new BlockItem(FossilBlocks.CARBONIFEROUS_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> PERMIAN_FOSSIL_ORE = BLOCK_REGISTER.register("permian_fossil_ore", () -> new BlockItem(FossilBlocks.PERMIAN_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> PERMIAN_DEEPSLATE_FOSSIL_ORE = BLOCK_REGISTER.register("permian_deepslate_fossil_ore", () -> new BlockItem(FossilBlocks.PERMIAN_DEEPSLATE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> TRIASSIC_FOSSIL_ORE = BLOCK_REGISTER.register("triassic_fossil_ore", () -> new BlockItem(FossilBlocks.TRIASSIC_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> TRIASSIC_DEEPSLATE_FOSSIL_ORE = BLOCK_REGISTER.register("triassic_deepslate_fossil_ore", () -> new BlockItem(FossilBlocks.TRIASSIC_DEEPSLATE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> JURASSIC_FOSSIL_ORE = BLOCK_REGISTER.register("jurassic_fossil_ore", () -> new BlockItem(FossilBlocks.JURASSIC_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> EARLY_CRETACEOUS_FOSSIL_ORE = BLOCK_REGISTER.register("early_cretaceous_fossil_ore", () -> new BlockItem(FossilBlocks.EARLY_CRETACEOUS_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> LATE_CRETACEOUS_FOSSIL_ORE = BLOCK_REGISTER.register("late_cretaceous_fossil_ore", () -> new BlockItem(FossilBlocks.LATE_CRETACEOUS_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> PALEOGENE_FOSSIL_ORE = BLOCK_REGISTER.register("paleogene_fossil_ore", () -> new BlockItem(FossilBlocks.PALEOGENE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> NEOGENE_FOSSIL_ORE = BLOCK_REGISTER.register("neogene_fossil_ore", () -> new BlockItem(FossilBlocks.NEOGENE_FOSSIL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> QUATERNARY_FOSSIL_ORE = BLOCK_REGISTER.register("quaternary_fossil_ore", () -> new BlockItem(FossilBlocks.QUATERNARY_FOSSIL_ORE.get(), new Item.Properties()));
	
}
