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
	
	//Five
	public static final RegistryObject<BlockItem> EUNOTOSAURUS = REGISTER.register("eunotosaurus_fossil", () -> new BlockItem(FossilBlocks.EUNOTOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));
	public static final RegistryObject<BlockItem> PELECANIMIMUS = REGISTER.register("pelecanimimus_fossil", () -> new BlockItem(FossilBlocks.PELECANIMIMUS.get(), new Item.Properties().rarity(FossilRarities.FIVE_PIECE_FOSSIL)));

	//Ten
	public static final RegistryObject<BlockItem> KENTROSAURUS = REGISTER.register("kentrosaurus_fossil", () -> new BlockItem(FossilBlocks.KENTROSAURUS.get(), new Item.Properties().rarity(FossilRarities.TEN_PIECE_FOSSIL)));

	//Fifteen
	public static final RegistryObject<BlockItem> WUERHOSAURUS = REGISTER.register("wuerhosaurus_fossil", () -> new BlockItem(FossilBlocks.WUERHOSAURUS.get(), new Item.Properties().rarity(FossilRarities.FIFTEEN_PIECE_FOSSIL)));

	//Twenty
	public static final RegistryObject<BlockItem> UTAHRAPTOR = REGISTER.register("utahraptor_fossil", () -> new BlockItem(FossilBlocks.UTAHRAPTOR.get(), new Item.Properties().rarity(FossilRarities.TWENTY_PIECE_FOSSIL)));
		
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
