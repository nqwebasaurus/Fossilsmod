package fossils.fossils.client.blockentity.render;

import java.util.Map;

import javax.annotation.Nullable;

import fossils.fossils.client.blockentity.model.DicranurusFossilSlabModel;
import org.joml.Quaternionf;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.TropaeumFossilSlabModel;
import fossils.fossils.client.blockentity.model.alienum.AlienumFossilSlabModel;
import fossils.fossils.common.block.FossilSlabBlock;
import fossils.fossils.common.block.FossilSlabWallBlock;
import fossils.fossils.common.entity.block.FossilSlabBlockEntity;
import net.minecraft.Util;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.WallSkullBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FossilSlabRenderer implements BlockEntityRenderer<FossilSlabBlockEntity> {
	private final Map<FossilSlabBlock.Type, SkullModelBase> modelByType;
	public static final Map<FossilSlabBlock.Type, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSlabBlock.Types.TROPAEUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/tropaeum.png"));
		type.put(FossilSlabBlock.Types.ALIENUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/alienum.png"));
		type.put(FossilSlabBlock.Types.DICRANURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/dicranurus.png"));
	});
	public static Map<FossilSlabBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSlabBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSlabBlock.Types.TROPAEUM, new TropaeumFossilSlabModel(p_173662_.bakeLayer(ClientEvents.TROPAEUM)));
		builder.put(FossilSlabBlock.Types.ALIENUM, new AlienumFossilSlabModel(p_173662_.bakeLayer(ClientEvents.ALIENUM)));
		builder.put(FossilSlabBlock.Types.DICRANURUS, new DicranurusFossilSlabModel(p_173662_.bakeLayer(ClientEvents.DICRANURUS)));
		return builder.build();
	}

	public FossilSlabRenderer(BlockEntityRendererProvider.Context p_173660_) {
		this.modelByType = createFossilRenderers(p_173660_.getModelSet());
	}

	public void render(FossilSlabBlockEntity p_112534_, float p_112535_, PoseStack p_112536_, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
		float f = 0;
		BlockState blocktate = p_112534_.getBlockState();
		boolean flag = blocktate.getBlock() instanceof FossilSlabBlock;
		int i = flag ? blocktate.getValue(FossilSlabBlock.ROTATION) : 0;
		Direction direction = flag ? null : blocktate.getValue(WallSkullBlock.FACING);
		float f1 = RotationSegment.convertToDegrees(i);
		FossilSlabBlock.Type skullblock$type;
		if (flag) skullblock$type = ((FossilSlabBlock)blocktate.getBlock()).getType();
		else skullblock$type = ((FossilSlabWallBlock)blocktate.getBlock()).getType();
		SkullModelBase skullmodelbase = this.modelByType.get(skullblock$type);
		RenderType rendertype = getRenderType(skullblock$type);
		renderFossilSlab(p_112534_, direction, f1, f, p_112536_, p_112537_, p_112538_, skullmodelbase, rendertype);
	}

	public static void renderFossilSlab(FossilSlabBlockEntity p_112534_, @Nullable Direction direction, float p_173665_, float p_173666_, PoseStack p_173667_, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
		p_173667_.pushPose();
		BlockState blocktate = p_112534_.getBlockState();
		boolean flag = blocktate.getBlock() instanceof FossilSlabBlock;
		FossilSlabBlock.Type fossilslabblock$type;
		if (flag) fossilslabblock$type = ((FossilSlabBlock)blocktate.getBlock()).getType();
		else fossilslabblock$type = ((FossilSlabWallBlock)blocktate.getBlock()).getType();
		p_173667_.translate(0.5F, 1.0F, 0.5F);
		if (fossilslabblock$type == FossilSlabBlock.Types.TROPAEUM) {
			p_173667_.scale(-0.68F, -0.68F, 0.68F);
		} else if (fossilslabblock$type == FossilSlabBlock.Types.ALIENUM) {
			if (!flag) {
				if (direction == Direction.SOUTH) {
					p_173667_.rotateAround(new Quaternionf(1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.1F, -0.1F, 0.1F);
					p_173667_.translate(0F, 1F, 2.5F);
				} else if (direction == Direction.NORTH) {
					p_173667_.rotateAround(new Quaternionf(-1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.1F, -0.1F, -0.1F);
					p_173667_.translate(0F, 1F, 2.5F);
				} else if (direction == Direction.EAST) {
					p_173667_.rotateAround(new Quaternionf(0, 1, 0, 1), 0, 0, 0);
					p_173667_.rotateAround(new Quaternionf(1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.05F, -0.05F, 0.05F);
					p_173667_.translate(0F, 1F, 2.5F);
				} else {
					p_173667_.rotateAround(new Quaternionf(0, 1, 0, 1), 0, 0, 0);
					p_173667_.rotateAround(new Quaternionf(-1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.05F, -0.05F, -0.05F);
					p_173667_.translate(0F, 1F, 2.5F);
				}
			} else {
				p_173667_.scale(-0.2F, -0.2F, 0.2F);
				p_173667_.translate(0F, 3.51F, 0F);
			}
		} else if (fossilslabblock$type == FossilSlabBlock.Types.DICRANURUS) {
			if (!flag) {
				if (direction == Direction.SOUTH) {
					p_173667_.rotateAround(new Quaternionf(1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.07F, -0.07F, -0.07F);
					p_173667_.translate(0F, 1F, -2.25F);
				} else if (direction == Direction.NORTH) {
					p_173667_.rotateAround(new Quaternionf(-1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.07F, -0.07F, 0.07F);
					p_173667_.translate(0F, 1F, -2.25F);
				} else if (direction == Direction.EAST) {
					p_173667_.rotateAround(new Quaternionf(0, 1, 0, 1), 0, 0, 0);
					p_173667_.rotateAround(new Quaternionf(1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.035F, -0.035F, -0.035F);
					p_173667_.translate(0F, 1F, -2.25F);
				} else {
					p_173667_.rotateAround(new Quaternionf(0, 1, 0, 1), 0, 0, 0);
					p_173667_.rotateAround(new Quaternionf(-1, 0, 0, 1), 0, 0, 0);
					p_173667_.scale(-0.035F, -0.035F, 0.035F);
					p_173667_.translate(0F, 1F, -2.25F);
				}
			} else {
				p_173667_.scale(-0.14F, -0.14F, 0.14F);
				p_173667_.translate(0F, 5.6F, 0F);
			}
		} else p_173667_.scale(-1.0F, -1.0F, 1.0F);
		VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
		p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
		p_173670_.renderToBuffer(p_173667_, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		p_173667_.popPose();
	}

	public static RenderType getRenderType(FossilSlabBlock.Type p_112524_) {
		ResourceLocation resourcelocation = SKIN_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
