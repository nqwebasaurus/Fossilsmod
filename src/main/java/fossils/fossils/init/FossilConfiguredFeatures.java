package fossils.fossils.init;

import java.util.List;

import fossils.fossils.FossilMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class FossilConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> PRECAMBRIAN_FOSSILS = registerConfiguredFeature("configured_precambrian_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CAMBRIAN_FOSSILS = registerConfiguredFeature("configured_cambrian_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ORDOVICIAN_FOSSILS = registerConfiguredFeature("configured_ordovician_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SILURIAN_FOSSILS = registerConfiguredFeature("configured_silurian_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> DEVONIAN_FOSSILS = registerConfiguredFeature("configured_devonian_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CARBONIFEROUS_FOSSILS = registerConfiguredFeature("configured_carboniferous_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PERMIAN_FOSSILS = registerConfiguredFeature("configured_permian_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> TRIASSIC_FOSSILS = registerConfiguredFeature("configured_triassic_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> JURASSIC_FOSSILS = registerConfiguredFeature("configured_jurassic_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> EARLY_CRETACEOUS_FOSSILS = registerConfiguredFeature("configured_early_cretaceous_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LATE_CRETACEOUS_FOSSILS = registerConfiguredFeature("configured_late_cretaceous_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PALEOGENE_FOSSILS = registerConfiguredFeature("configured_paleogene_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NEOGENE_FOSSILS = registerConfiguredFeature("configured_neogene_fossils");
	public static final ResourceKey<ConfiguredFeature<?, ?>> QUATERNARY_FOSSILS = registerConfiguredFeature("configured_quaternary_fossils");

	public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> bootstapContext) {
		RuleTest ruletest1 = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest ruletest2 = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		List<OreConfiguration.TargetBlockState> list = List.of(OreConfiguration.target(ruletest2, FossilBlocks.PRECAMBRIAN_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list1 = List.of(OreConfiguration.target(ruletest2, FossilBlocks.CAMBRIAN_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list2 = List.of(OreConfiguration.target(ruletest2, FossilBlocks.ORDOVICIAN_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list3 = List.of(OreConfiguration.target(ruletest2, FossilBlocks.SILURIAN_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list4 = List.of(OreConfiguration.target(ruletest2, FossilBlocks.DEVONIAN_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list5 = List.of(OreConfiguration.target(ruletest2, FossilBlocks.CARBONIFEROUS_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list6 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.PERMIAN_FOSSIL_ORE.get().defaultBlockState()), OreConfiguration.target(ruletest2, FossilBlocks.PERMIAN_DEEPSLATE_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list7 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.TRIASSIC_FOSSIL_ORE.get().defaultBlockState()), OreConfiguration.target(ruletest2, FossilBlocks.TRIASSIC_DEEPSLATE_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list8 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.JURASSIC_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list9 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.EARLY_CRETACEOUS_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list10 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.LATE_CRETACEOUS_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list11 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.PALEOGENE_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list12 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.NEOGENE_FOSSIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> list13 = List.of(OreConfiguration.target(ruletest1, FossilBlocks.QUATERNARY_FOSSIL_ORE.get().defaultBlockState()));
		FeatureUtils.register(bootstapContext, PRECAMBRIAN_FOSSILS, Feature.ORE, new OreConfiguration(list, 5));
		FeatureUtils.register(bootstapContext, CAMBRIAN_FOSSILS, Feature.ORE, new OreConfiguration(list1, 5));
		FeatureUtils.register(bootstapContext, ORDOVICIAN_FOSSILS, Feature.ORE, new OreConfiguration(list2, 5));
		FeatureUtils.register(bootstapContext, SILURIAN_FOSSILS, Feature.ORE, new OreConfiguration(list3, 5));
		FeatureUtils.register(bootstapContext, DEVONIAN_FOSSILS, Feature.ORE, new OreConfiguration(list4, 5));
		FeatureUtils.register(bootstapContext, CARBONIFEROUS_FOSSILS, Feature.ORE, new OreConfiguration(list5, 5));
		FeatureUtils.register(bootstapContext, PERMIAN_FOSSILS, Feature.ORE, new OreConfiguration(list6, 5));
		FeatureUtils.register(bootstapContext, TRIASSIC_FOSSILS, Feature.ORE, new OreConfiguration(list7, 5));
		FeatureUtils.register(bootstapContext, JURASSIC_FOSSILS, Feature.ORE, new OreConfiguration(list8, 5));
		FeatureUtils.register(bootstapContext, EARLY_CRETACEOUS_FOSSILS, Feature.ORE, new OreConfiguration(list9, 5));
		FeatureUtils.register(bootstapContext, LATE_CRETACEOUS_FOSSILS, Feature.ORE, new OreConfiguration(list10, 5));
		FeatureUtils.register(bootstapContext, PALEOGENE_FOSSILS, Feature.ORE, new OreConfiguration(list11, 5));
		FeatureUtils.register(bootstapContext, NEOGENE_FOSSILS, Feature.ORE, new OreConfiguration(list12, 5));
		FeatureUtils.register(bootstapContext, QUATERNARY_FOSSILS, Feature.ORE, new OreConfiguration(list13, 5));
	}

	public static ResourceKey<ConfiguredFeature<?, ?>> registerConfiguredFeature(String id) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(FossilMod.MOD_ID, id));
	}

}
