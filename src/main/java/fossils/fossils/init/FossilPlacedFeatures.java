package fossils.fossils.init;

import java.util.List;

import fossils.fossils.FossilMod;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class FossilPlacedFeatures {
	public static final ResourceKey<PlacedFeature> PRECAMBRIAN_FOSSILS = registerPlacedFeature("placed_precambrian_fossils");
	public static final ResourceKey<PlacedFeature> CAMBRIAN_FOSSILS = registerPlacedFeature("placed_cambrian_fossils");
	public static final ResourceKey<PlacedFeature> ORDOVICIAN_FOSSILS = registerPlacedFeature("placed_ordovician_fossils");
	public static final ResourceKey<PlacedFeature> SILURIAN_FOSSILS = registerPlacedFeature("placed_silurian_fossils");
	public static final ResourceKey<PlacedFeature> DEVONIAN_FOSSILS = registerPlacedFeature("placed_devonian_fossils");
	public static final ResourceKey<PlacedFeature> CARBONIFEROUS_FOSSILS = registerPlacedFeature("placed_carboniferous_fossils");
	public static final ResourceKey<PlacedFeature> PERMIAN_FOSSILS = registerPlacedFeature("placed_permian_fossils");
	public static final ResourceKey<PlacedFeature> TRIASSIC_FOSSILS = registerPlacedFeature("placed_triassic_fossils");
	public static final ResourceKey<PlacedFeature> JURASSIC_FOSSILS = registerPlacedFeature("placed_juassic_fossils");
	public static final ResourceKey<PlacedFeature> EARLY_CRETACEOUS_FOSSILS = registerPlacedFeature("placed_early_cretaceous_fossils");
	public static final ResourceKey<PlacedFeature> LATE_CRETACEOUS_FOSSILS = registerPlacedFeature("placed_late_cretaceous_fossils");
	public static final ResourceKey<PlacedFeature> PALEOGENE_FOSSILS = registerPlacedFeature("placed_paleogene_fossils");
	public static final ResourceKey<PlacedFeature> NEOGENE_FOSSILS = registerPlacedFeature("placed_neogene_fossils");
	public static final ResourceKey<PlacedFeature> QUATERNARY_FOSSILS = registerPlacedFeature("placed_quaternary_fossils");

	public static void bootstrap(BootstapContext<PlacedFeature> bootstapContext) {
		HolderGetter<ConfiguredFeature<?, ?>> holderGetter = bootstapContext.lookup(Registries.CONFIGURED_FEATURE);
		PlacementUtils.register(bootstapContext, PRECAMBRIAN_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.PRECAMBRIAN_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-52))));
		PlacementUtils.register(bootstapContext, CAMBRIAN_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.CAMBRIAN_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute( -64), VerticalAnchor.absolute(-42))));
		PlacementUtils.register(bootstapContext, ORDOVICIAN_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.ORDOVICIAN_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-55), VerticalAnchor.absolute(-32))));
		PlacementUtils.register(bootstapContext, SILURIAN_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.SILURIAN_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute( -45), VerticalAnchor.absolute(-22))));
		PlacementUtils.register(bootstapContext, DEVONIAN_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.DEVONIAN_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-35), VerticalAnchor.absolute(-12))));
		PlacementUtils.register(bootstapContext, CARBONIFEROUS_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.CARBONIFEROUS_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-25), VerticalAnchor.absolute(-2))));
		PlacementUtils.register(bootstapContext, PERMIAN_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.PERMIAN_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(8))));
		PlacementUtils.register(bootstapContext, TRIASSIC_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.TRIASSIC_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(18))));
		PlacementUtils.register(bootstapContext, JURASSIC_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.JURASSIC_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(6), VerticalAnchor.absolute(28))));
		PlacementUtils.register(bootstapContext, EARLY_CRETACEOUS_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.EARLY_CRETACEOUS_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(16), VerticalAnchor.absolute(38))));
		PlacementUtils.register(bootstapContext, LATE_CRETACEOUS_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.LATE_CRETACEOUS_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(26), VerticalAnchor.absolute(48))));
		PlacementUtils.register(bootstapContext, PALEOGENE_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.PALEOGENE_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(36), VerticalAnchor.absolute(58))));
		PlacementUtils.register(bootstapContext, NEOGENE_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.NEOGENE_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(46), VerticalAnchor.absolute(68))));
		PlacementUtils.register(bootstapContext, QUATERNARY_FOSSILS, holderGetter.getOrThrow(FossilConfiguredFeatures.QUATERNARY_FOSSILS), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(56), VerticalAnchor.absolute(78))));
	}
	
	public static ResourceKey<PlacedFeature> registerPlacedFeature(String id) {
		return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(FossilMod.MOD_ID, id));
	}
	
	private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
		return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
	}
	
	private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
		return orePlacement(CountPlacement.of(p_195344_), p_195345_);
	}
	
}
