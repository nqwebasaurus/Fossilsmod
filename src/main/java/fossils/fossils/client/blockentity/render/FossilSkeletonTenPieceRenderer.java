package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.arizonasaurus.ArizonasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.arizonasaurus.ArizonasaurusFossilModel;
import fossils.fossils.client.blockentity.model.dearc.DearcFossilFrameModel;
import fossils.fossils.client.blockentity.model.dearc.DearcFossilModel;
import fossils.fossils.client.blockentity.model.dimetrodongrandis.DimetrodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.dimetrodongrandis.DimetrodonFossilModel;
import fossils.fossils.client.blockentity.model.endothiodonbathystoma.EndothiodonbathystomaFossilFrameModel;
import fossils.fossils.client.blockentity.model.endothiodonbathystoma.EndothiodonbathystomaFossilModel;
import fossils.fossils.client.blockentity.model.guanlong.GuanlongFossilFrameModel;
import fossils.fossils.client.blockentity.model.guanlong.GuanlongFossilModel;
import fossils.fossils.client.blockentity.model.ichthyosaurus.IchthyosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ichthyosaurus.IchthyosaurusFossilModel;
import fossils.fossils.client.blockentity.model.kentrosaurus.KentrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kentrosaurus.KentrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.nasutoceratops.NasutoceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.nasutoceratops.NasutoceratopsFossilModel;
import fossils.fossils.client.blockentity.model.nigerpeton.NigerpetonFossilFrameModel;
import fossils.fossils.client.blockentity.model.nigerpeton.NigerpetonFossilModel;
import fossils.fossils.client.blockentity.model.piatnitzkysaurus.PiatnitzkysaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.piatnitzkysaurus.PiatnitzkysaurusFossilModel;
import fossils.fossils.client.blockentity.model.placerias.PlaceriasFossilFrameModel;
import fossils.fossils.client.blockentity.model.placerias.PlaceriasFossilModel;
import fossils.fossils.client.blockentity.model.poposaurus.PoposaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.poposaurus.PoposaurusFossilModel;
import fossils.fossils.client.blockentity.model.scelidosaurus.ScelidosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.scelidosaurus.ScelidosaurusFossilModel;
import fossils.fossils.client.blockentity.model.stagonolepis.StagonolepisFossilFrameModel;
import fossils.fossils.client.blockentity.model.stagonolepis.StagonolepisFossilModel;
import fossils.fossils.client.blockentity.model.stahleckeria.StahleckeriaFossilFrameModel;
import fossils.fossils.client.blockentity.model.stahleckeria.StahleckeriaFossilModel;
import fossils.fossils.client.blockentity.model.synthetoceras.SynthetocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.synthetoceras.SynthetocerasFossilModel;
import fossils.fossils.client.blockentity.model.tupandactylusnavigans.TupandactylusnavigansFossilFrameModel;
import fossils.fossils.client.blockentity.model.tupandactylusnavigans.TupandactylusnavigansFossilModel;
import fossils.fossils.common.block.FossilSkeletonTenPieceBlock;
import fossils.fossils.common.block.FossilSkeletonTenPieceBlock;
import fossils.fossils.common.entity.block.FossilSkeletonTenPieceBlockEntity;
import net.minecraft.Util;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FossilSkeletonTenPieceRenderer implements BlockEntityRenderer<FossilSkeletonTenPieceBlockEntity> {
	private final Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> skeletonModelByType;
	private final Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> frameModelByType;
	public static final Map<FossilSkeletonTenPieceBlock.Type, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kentrosaurus/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nasutoceratops/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/synthetoceras/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimetrodongrandis/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/endothiodonbathystoma/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigerpeton/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placerias/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/arizonasaurus/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/poposaurus/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stahleckeria/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stagonolepis/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/guanlong/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyosaurus/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scelidosaurus/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/piatnitzkysaurus/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.DEARC, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dearc/stage_0.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusnavigans/stage_0.png"));

	});
	public static final Map<FossilSkeletonTenPieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kentrosaurus/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nasutoceratops/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/synthetoceras/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimetrodongrandis/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/endothiodonbathystoma/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigerpeton/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placerias/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/arizonasaurus/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/poposaurus/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stahleckeria/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stagonolepis/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/guanlong/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyosaurus/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scelidosaurus/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/piatnitzkysaurus/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.DEARC, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dearc/frame.png"));
		type.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusnavigans/frame.png"));


	});
	public static Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonTenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new KentrosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.KENTROSAURUS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new NasutoceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.NASUTOCERATOPS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new SynthetocerasFossilModel(p_173662_.bakeLayer(ClientEvents.SYNTHETOCERAS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS, new DimetrodonFossilModel(p_173662_.bakeLayer(ClientEvents.DIMETRODONGRANDIS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new EndothiodonbathystomaFossilModel(p_173662_.bakeLayer(ClientEvents.ENDOTHIODONBATHYSTOMA)));
		builder.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new NigerpetonFossilModel(p_173662_.bakeLayer(ClientEvents.NIGERPETON)));
		builder.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new PlaceriasFossilModel(p_173662_.bakeLayer(ClientEvents.PLACERIAS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ArizonasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ARIZONASAURUS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new PoposaurusFossilModel(p_173662_.bakeLayer(ClientEvents.POPOSAURUS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new StahleckeriaFossilModel(p_173662_.bakeLayer(ClientEvents.STAHLECKERIA)));
		builder.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new StagonolepisFossilModel(p_173662_.bakeLayer(ClientEvents.STAGONOLEPIS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new GuanlongFossilModel(p_173662_.bakeLayer(ClientEvents.GUANLONG)));
		builder.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new IchthyosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ICHTHYOSAURUS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ScelidosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SCELIDOSAURUS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new PiatnitzkysaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PIATNITZKYSAURUS)));
		builder.put(FossilSkeletonTenPieceBlock.Types.DEARC, new DearcFossilModel(p_173662_.bakeLayer(ClientEvents.DEARC)));
		builder.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new TupandactylusnavigansFossilModel(p_173662_.bakeLayer(ClientEvents.TUPANDACTYLUSNAVIGANS)));
		return builder.build();
	}

	public static Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonTenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new KentrosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KENTROSAURUS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new NasutoceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NASUTOCERATOPS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new SynthetocerasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SYNTHETOCERAS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS, new DimetrodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIMETRODONGRANDIS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new EndothiodonbathystomaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ENDOTHIODONBATHYSTOMA_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new NigerpetonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NIGERPETON_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new PlaceriasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLACERIAS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ArizonasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ARIZONASAURUS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new PoposaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.POPOSAURUS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new StahleckeriaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STAHLECKERIA_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new StagonolepisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STAGONOLEPIS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new GuanlongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GUANLONG_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new IchthyosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ICHTHYOSAURUS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ScelidosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SCELIDOSAURUS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new PiatnitzkysaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PIATNITZKYSAURUS_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.DEARC, new DearcFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DEARC_FRAME)));
		builder.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new TupandactylusnavigansFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TUPANDACTYLUSNAVIGANS_FRAME)));
		return builder.build();
	}

	public FossilSkeletonTenPieceRenderer(BlockEntityRendererProvider.Context p_173660_) {
		this.skeletonModelByType = createFossilRenderers(p_173660_.getModelSet());
		this.frameModelByType = createFossilFrameRenderers(p_173660_.getModelSet());
	}

	public void render(FossilSkeletonTenPieceBlockEntity p_112534_, float p_112535_, PoseStack p_112536_, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
		float f = 0;
		BlockState blocktate = p_112534_.getBlockState();
		int i = blocktate.getValue(FossilSkeletonTenPieceBlock.ROTATION);
		float f1 = RotationSegment.convertToDegrees(i);
		FossilSkeletonTenPieceBlock.Type skullblock$type = ((FossilSkeletonTenPieceBlock)blocktate.getBlock()).getType();
		SkullModelBase skullmodelbase = this.skeletonModelByType.get(skullblock$type);
		SkullModelBase frameBase = this.frameModelByType.get(skullblock$type);
		int fossilLevel = blocktate.getValue(FossilSkeletonTenPieceBlock.FOSSIL_LEVEL);
		RenderType rendertype = getSkeletonRenderType(skullblock$type, fossilLevel);
		RenderType frameRendertype = getFrameRenderType(skullblock$type);
		if (blocktate.getValue(FossilSkeletonTenPieceBlock.FRAME)) {
			renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, frameBase, frameRendertype);
		}
		renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, skullmodelbase, rendertype);
	}

	public static void renderFossilSkeleton(BlockState p_112534_, float p_173665_, float p_173666_, PoseStack p_173667_, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
		p_173667_.pushPose();
		FossilSkeletonTenPieceBlock.Type FossilSkeletonTenPieceBlock$type = ((FossilSkeletonTenPieceBlock)p_112534_.getBlock()).getType();
		p_173667_.translate(0.5F, 1.0F, 0.5F);
		if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.KENTROSAURUS) {
			p_173667_.scale(-0.8F, -0.8F, 0.8F);
			p_173667_.translate(0F, -0.26F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS) {
			p_173667_.scale(-0.8F, -0.8F, 0.8F);
			p_173667_.translate(0F, -0.26F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS) {
			p_173667_.scale(-0.64F, -0.64F, 0.64F);
			p_173667_.translate(0F, 0.07F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS) {
			p_173667_.scale(-0.8F, -0.8F, 0.8F);
			p_173667_.translate(0F, -0.23F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA) {
			p_173667_.scale(-0.715F, -0.715F, 0.715F);
			p_173667_.translate(0F, -0.1F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.NIGERPETON) {
			p_173667_.scale(-0.88F, -0.88F, 0.88F);
			p_173667_.translate(0F, -0.36F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PLACERIAS) {
			p_173667_.scale(-0.7F, -0.7F, 0.7F);
			p_173667_.translate(0F, -0.07F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS) {
			p_173667_.scale(-0.615F, -0.615F, 0.615F);
			p_173667_.translate(0F, 0.13F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.POPOSAURUS) {
			p_173667_.scale(-0.785F, -0.785F, 0.785F);
			p_173667_.translate(0F, -0.225F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.STAHLECKERIA) {
			p_173667_.scale(-0.65F, -0.65F, 0.65F);
			p_173667_.translate(0F, 0.05F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS) {
			p_173667_.scale(-0.7F, -0.7F, 0.7F);
			p_173667_.translate(0F, -0.06F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.GUANLONG) {
			p_173667_.scale(-0.68F, -0.68F, 0.68F);
			p_173667_.translate(0F, -0.03F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS) {
			p_173667_.scale(-0.695F, -0.695F, 0.695F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS) {
			p_173667_.scale(-0.71F, -0.71F, 0.71F);
			p_173667_.translate(0F, -0.09F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS) {
			p_173667_.scale(-0.7F, -0.7F, 0.7F);
			p_173667_.translate(0F, -0.05F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DEARC) {
			p_173667_.scale(-0.48F, -0.48F, 0.48F);
			p_173667_.translate(0F, -0F, 0F);
		} else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS) {
			p_173667_.scale(-0.42F, -0.42F, 0.42F);
			p_173667_.translate(0F, -0F, 0F);
		} else p_173667_.scale(-1.0F, -1.0F, 1.0F);
		VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
		p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
		p_173670_.renderToBuffer(p_173667_, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		p_173667_.popPose();
	}

	public static RenderType getSkeletonRenderType(FossilSkeletonTenPieceBlock.Type type , int fossilLevel) {
		ResourceLocation resourceLocation;
		if (type == FossilSkeletonTenPieceBlock.Types.KENTROSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kentrosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nasutoceratops/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/synthetoceras/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.DIMETRODONGRANDIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimetrodongrandis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/endothiodonbathystoma/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.NIGERPETON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigerpeton/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.PLACERIAS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placerias/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/arizonasaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.POPOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/poposaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.STAHLECKERIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stahleckeria/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stagonolepis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.GUANLONG) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/guanlong/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scelidosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/piatnitzkysaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.DEARC) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dearc/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusnavigans/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonTenPieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
