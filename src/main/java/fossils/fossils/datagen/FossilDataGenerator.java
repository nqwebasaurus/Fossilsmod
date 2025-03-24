package fossils.fossils.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import fossils.fossils.FossilMod;
import fossils.fossils.init.FossilBiomeModifiers;
import fossils.fossils.init.FossilConfiguredFeatures;
import fossils.fossils.init.FossilPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

public class FossilDataGenerator extends DatapackBuiltinEntriesProvider {

	private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(Registries.CONFIGURED_FEATURE, ctx -> FossilConfiguredFeatures.bootstrap(ctx))
			.add(Registries.PLACED_FEATURE, FossilPlacedFeatures::bootstrap)
			.add(ForgeRegistries.Keys.BIOME_MODIFIERS, FossilBiomeModifiers::bootstrap);

	public FossilDataGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries, BUILDER, Set.of(FossilMod.MOD_ID));
	}
	
}
