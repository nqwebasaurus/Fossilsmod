package fossils.fossils.init;

import fossils.fossils.FossilMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FossilItems {
	public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, FossilMod.MOD_ID);

	//Slabs
	public static final RegistryObject<BlockItem> TROPAEUM = REGISTER.register("tropaeum_fossil", () -> new BlockItem(FossilBlocks.TROPAEUM.get(), new Item.Properties()));
	
	//Five
	public static final RegistryObject<BlockItem> EUNOTOSAURUS = REGISTER.register("eunotosaurus_fossil", () -> new BlockItem(FossilBlocks.EUNOTOSAURUS.get(), new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<BlockItem> PELECANIMIMUS = REGISTER.register("pelecanimimus_fossil", () -> new BlockItem(FossilBlocks.PELECANIMIMUS.get(), new Item.Properties().rarity(Rarity.COMMON)));

	//Ten
	public static final RegistryObject<BlockItem> KENTROSAURUS = REGISTER.register("kentrosaurus_fossil", () -> new BlockItem(FossilBlocks.KENTROSAURUS.get(), new Item.Properties().rarity(Rarity.UNCOMMON)));

	//Fifteen
	public static final RegistryObject<BlockItem> WUERHOSAURUS = REGISTER.register("wuerhosaurus_fossil", () -> new BlockItem(FossilBlocks.WUERHOSAURUS.get(), new Item.Properties().rarity(Rarity.RARE)));

	//Twenty
	public static final RegistryObject<BlockItem> UTAHRAPTOR = REGISTER.register("utahraptor_fossil", () -> new BlockItem(FossilBlocks.UTAHRAPTOR.get(), new Item.Properties().rarity(Rarity.EPIC)));
		
}
