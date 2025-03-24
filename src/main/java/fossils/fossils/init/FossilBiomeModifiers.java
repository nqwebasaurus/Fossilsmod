package fossils.fossils.init;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jetbrains.annotations.NotNull;

import com.mojang.serialization.Codec;

import fossils.fossils.FossilMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FossilBiomeModifiers {
	public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, FossilMod.MOD_ID);

	public static final ResourceKey<BiomeModifier> ADD_FOSSILS = register("add_overworld_fossils");

	public static void bootstrap(BootstapContext<BiomeModifier> bootstapContext) {
		bootstapContext.register(ADD_FOSSILS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(getBiome(bootstapContext, BiomeTags.IS_OVERWORLD), getPlacedFeature(bootstapContext, FossilPlacedFeatures.PRECAMBRIAN_FOSSILS, FossilPlacedFeatures.CAMBRIAN_FOSSILS, FossilPlacedFeatures.ORDOVICIAN_FOSSILS, FossilPlacedFeatures.SILURIAN_FOSSILS, FossilPlacedFeatures.DEVONIAN_FOSSILS, FossilPlacedFeatures.CARBONIFEROUS_FOSSILS, FossilPlacedFeatures.PERMIAN_FOSSILS, FossilPlacedFeatures.TRIASSIC_FOSSILS, FossilPlacedFeatures.JURASSIC_FOSSILS, FossilPlacedFeatures.EARLY_CRETACEOUS_FOSSILS, FossilPlacedFeatures.LATE_CRETACEOUS_FOSSILS, FossilPlacedFeatures.PALEOGENE_FOSSILS, FossilPlacedFeatures.NEOGENE_FOSSILS, FossilPlacedFeatures.QUATERNARY_FOSSILS), GenerationStep.Decoration.UNDERGROUND_ORES));
	}
	
	private static HolderSet.Named<Biome> getBiome(BootstapContext<BiomeModifier> bootstapContex, TagKey<Biome> biome) {
		return bootstapContex.lookup(Registries.BIOME).getOrThrow(biome);
	}
	
	@SafeVarargs
	@NotNull
	private static HolderSet.Direct<PlacedFeature> getPlacedFeature(BootstapContext<BiomeModifier> context, ResourceKey<PlacedFeature>... placedFeature) {
		return HolderSet.direct(Stream.of(placedFeature).map(resourceKey -> context.lookup(Registries.PLACED_FEATURE).getOrThrow(resourceKey)).collect(Collectors.toList()));
	}
	
	@NotNull
	private static ResourceKey<BiomeModifier> register(String name) {
		return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FossilMod.MOD_ID, name));
	}
	
}
