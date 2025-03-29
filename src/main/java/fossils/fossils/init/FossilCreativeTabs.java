package fossils.fossils.init;

import fossils.fossils.FossilMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FossilCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FossilMod.MOD_ID);

	public static final RegistryObject<CreativeModeTab> FOSSIL_SLABS = REGISTER.register("fossil_slab_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(FossilBlocks.TROPAEUM.get().asItem()))
			.title(Component.translatable("itemGroup.fossil_slab_tab"))
			.withSearchBar()
			.displayItems((pParameters, pOutput) -> {
				for (var block: FossilItems.SLAB_REGISTER.getEntries()) {
					pOutput.accept(block.get());
				}
			}).build());

	public static final RegistryObject<CreativeModeTab> FOSSIL_BLOCKS = REGISTER.register("fossil_blocks_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(FossilBlocks.NEOGENE_FOSSIL_ORE.get().asItem()))
			.title(Component.translatable("itemGroup.fossil_blocks_tab"))
			.withSearchBar()
			.displayItems((pParameters, pOutput) -> {
				for (var block: FossilItems.BLOCK_REGISTER.getEntries()) {
					pOutput.accept(block.get());
				}
			}).build());

	public static final RegistryObject<CreativeModeTab> FOSSIL_SKELETONS = REGISTER.register("fossil_skeleton_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(FossilBlocks.GUANLONG.get().asItem()))
			.title(Component.translatable("itemGroup.fossil_skeleton_tab"))
			.withSearchBar()
			.displayItems((pParameters, pOutput) -> {
				for (var block: FossilItems.SKELETON_REGISTER.getEntries()) {
					pOutput.accept(block.get());
				}
			}).build());
	
}
