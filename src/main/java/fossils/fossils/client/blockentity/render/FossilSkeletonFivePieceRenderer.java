package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilModel;
import fossils.fossils.common.block.FossilSkeletonFivePieceBlock;
import fossils.fossils.common.entity.block.FossilSkeletonFivePieceBlockEntity;
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
public class FossilSkeletonFivePieceRenderer implements BlockEntityRenderer<FossilSkeletonFivePieceBlockEntity> {
	private final Map<FossilSkeletonFivePieceBlock.Type, SkullModelBase> skeletonModelByType;
	private final Map<FossilSkeletonFivePieceBlock.Type, SkullModelBase> frameModelByType;
	public static final Map<FossilSkeletonFivePieceBlock.Type, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eunotosaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pelecanimimus/stage_0.png"));
	});
	public static final Map<FossilSkeletonFivePieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eunotosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pelecanimimus/frame.png"));
	});
	public static Map<FossilSkeletonFivePieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFivePieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new PelecanimimusFossilModel(p_173662_.bakeLayer(ClientEvents.PELECANIMIMUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new EunotosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EUNOTOSAURUS)));
		return builder.build();
	}

	public static Map<FossilSkeletonFivePieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFivePieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new PelecanimimusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PELECANIMIMUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new EunotosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUNOTOSAURUS_FRAME)));
		return builder.build();
	}

	public FossilSkeletonFivePieceRenderer(BlockEntityRendererProvider.Context p_173660_) {
		this.skeletonModelByType = createFossilRenderers(p_173660_.getModelSet());
		this.frameModelByType = createFossilFrameRenderers(p_173660_.getModelSet());
	}

	public void render(FossilSkeletonFivePieceBlockEntity p_112534_, float p_112535_, PoseStack p_112536_, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
		float f = 0;
		BlockState blocktate = p_112534_.getBlockState();
		int i = blocktate.getValue(FossilSkeletonFivePieceBlock.ROTATION);
		float f1 = RotationSegment.convertToDegrees(i);
		FossilSkeletonFivePieceBlock.Type skullblock$type = ((FossilSkeletonFivePieceBlock)blocktate.getBlock()).getType();
		SkullModelBase skullmodelbase = this.skeletonModelByType.get(skullblock$type);
		SkullModelBase frameBase = this.frameModelByType.get(skullblock$type);
		int fossilLevel = blocktate.getValue(FossilSkeletonFivePieceBlock.FOSSIL_LEVEL);
		RenderType rendertype = getSkeletonRenderType(skullblock$type, fossilLevel);
		RenderType frameRendertype = getFrameRenderType(skullblock$type);
		if (blocktate.getValue(FossilSkeletonFivePieceBlock.FRAME)) {
			renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, frameBase, frameRendertype);
		}
		renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, skullmodelbase, rendertype);
	}

	public static void renderFossilSkeleton(BlockState p_112534_, float p_173665_, float p_173666_, PoseStack p_173667_, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
		p_173667_.pushPose();
		FossilSkeletonFivePieceBlock.Type FossilSkeletonFivePieceBlock$type = ((FossilSkeletonFivePieceBlock)p_112534_.getBlock()).getType();
		p_173667_.translate(0.5F, 1.0F, 0.5F);
		if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS) {
			p_173667_.scale(-0.238F, -0.238F, 0.238F);
			p_173667_.translate(0F, 2.7F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS) {
			p_173667_.scale(-0.62F, -0.62F, 0.62F);
			p_173667_.translate(0F, 0.1F, 0F);
		} else p_173667_.scale(-1.0F, -1.0F, 1.0F);
		VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
		p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
		p_173670_.renderToBuffer(p_173667_, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		p_173667_.popPose();
	}

	public static RenderType getSkeletonRenderType(FossilSkeletonFivePieceBlock.Type type , int fossilLevel) {
		ResourceLocation resourceLocation;
		if (type == FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eunotosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pelecanimimus/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonFivePieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
