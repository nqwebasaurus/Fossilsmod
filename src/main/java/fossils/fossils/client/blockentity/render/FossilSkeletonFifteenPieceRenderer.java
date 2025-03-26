package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.bisonlatifrons.BisonlatifronsFossilFrameModel;
import fossils.fossils.client.blockentity.model.bisonlatifrons.BisonlatifronsFossilModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilModel;
import fossils.fossils.common.block.FossilSkeletonFifteenPieceBlock;
import fossils.fossils.common.entity.block.FossilSkeletonFifteenPieceBlockEntity;
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
public class FossilSkeletonFifteenPieceRenderer implements BlockEntityRenderer<FossilSkeletonFifteenPieceBlockEntity> {
	private final Map<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> skeletonModelByType;
	private final Map<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> frameModelByType;
	public static final Map<FossilSkeletonFifteenPieceBlock.Type, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wuerhosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bisonlatifrons/stage_0.png"));
	});
	public static final Map<FossilSkeletonFifteenPieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wuerhosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bisonlatifrons/frame.png"));
	});
	public static Map<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new WuerhosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.WUERHOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new BisonlatifronsFossilModel(p_173662_.bakeLayer(ClientEvents.BISONLATIFRONS)));
		return builder.build();
	}

	public static Map<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new WuerhosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.WUERHOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new BisonlatifronsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BISONLATIFRONS_FRAME)));
		return builder.build();
	}

	public FossilSkeletonFifteenPieceRenderer(BlockEntityRendererProvider.Context p_173660_) {
		this.skeletonModelByType = createFossilRenderers(p_173660_.getModelSet());
		this.frameModelByType = createFossilFrameRenderers(p_173660_.getModelSet());
	}

	public void render(FossilSkeletonFifteenPieceBlockEntity p_112534_, float p_112535_, PoseStack p_112536_, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
		float f = 0;
		BlockState blocktate = p_112534_.getBlockState();
		int i = blocktate.getValue(FossilSkeletonFifteenPieceBlock.ROTATION);
		float f1 = RotationSegment.convertToDegrees(i);
		FossilSkeletonFifteenPieceBlock.Type skullblock$type = ((FossilSkeletonFifteenPieceBlock)blocktate.getBlock()).getType();
		SkullModelBase skullmodelbase = this.skeletonModelByType.get(skullblock$type);
		SkullModelBase frameBase = this.frameModelByType.get(skullblock$type);
		int fossilLevel = blocktate.getValue(FossilSkeletonFifteenPieceBlock.FOSSIL_LEVEL);
		RenderType rendertype = getSkeletonRenderType(skullblock$type, fossilLevel);
		RenderType frameRendertype = getFrameRenderType(skullblock$type);
		if (blocktate.getValue(FossilSkeletonFifteenPieceBlock.FRAME)) {
			renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, frameBase, frameRendertype);
		}
		renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, skullmodelbase, rendertype);
	}

	public static void renderFossilSkeleton(BlockState p_112534_, float p_173665_, float p_173666_, PoseStack p_173667_, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
		p_173667_.pushPose();
		FossilSkeletonFifteenPieceBlock.Type FossilSkeletonFifteenPieceBlock$type = ((FossilSkeletonFifteenPieceBlock)p_112534_.getBlock()).getType();
		p_173667_.translate(0.5F, 1.0F, 0.5F);
		if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else p_173667_.scale(-1.0F, -1.0F, 1.0F);
		VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
		p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
		p_173670_.renderToBuffer(p_173667_, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		p_173667_.popPose();
	}

	public static RenderType getSkeletonRenderType(FossilSkeletonFifteenPieceBlock.Type type , int fossilLevel) {
		ResourceLocation resourceLocation;
		if (type == FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wuerhosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bisonlatifrons/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonFifteenPieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
