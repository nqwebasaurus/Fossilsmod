package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.acanthostega.AcanthostegaFossilFrameModel;
import fossils.fossils.client.blockentity.model.acanthostega.AcanthostegaFossilModel;
import fossils.fossils.client.blockentity.model.dasyceps.DasycepsFossilFrameModel;
import fossils.fossils.client.blockentity.model.dasyceps.DasycepsFossilModel;
import fossils.fossils.client.blockentity.model.diplocaulusmagnicornis.DiplocaulusmagnicornisFossilFrameModel;
import fossils.fossils.client.blockentity.model.diplocaulusmagnicornis.DiplocaulusmagnicornisFossilModel;
import fossils.fossils.client.blockentity.model.drepanosaurus.DrepanosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.drepanosaurus.DrepanosaurusFossilModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilModel;
import fossils.fossils.client.blockentity.model.henodus.HenodusFossilFrameModel;
import fossils.fossils.client.blockentity.model.henodus.HenodusFossilModel;
import fossils.fossils.client.blockentity.model.manidens.ManidensFossilFrameModel;
import fossils.fossils.client.blockentity.model.manidens.ManidensFossilModel;
import fossils.fossils.client.blockentity.model.megalancosaurus.MegalancosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.megalancosaurus.MegalancosaurusFossilModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilModel;
import fossils.fossils.client.blockentity.model.protoceras.ProtocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.protoceras.ProtocerasFossilModel;
import fossils.fossils.client.blockentity.model.riojasuchus.RiojasuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.riojasuchus.RiojasuchusFossilModel;
import fossils.fossils.client.blockentity.model.stenokranio.StenokranioFossilFrameModel;
import fossils.fossils.client.blockentity.model.stenokranio.StenokranioFossilModel;
import fossils.fossils.client.blockentity.model.suminia.SuminiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.suminia.SuminiaFossilModel;
import fossils.fossils.client.blockentity.model.synthetoceras.SynthetocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.synthetoceras.SynthetocerasFossilModel;
import fossils.fossils.client.blockentity.model.tiktaalik.TiktaalikFossilFrameModel;
import fossils.fossils.client.blockentity.model.tiktaalik.TiktaalikFossilModel;
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
		type.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acanthostega/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.STENOKRANIO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stenokranio/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HENODUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/henodus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PROTOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/protoceras/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplocaulusmagnicornis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TIKTAALIK, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tiktaalik/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SUMINIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suminia/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalancosaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/riojasuchus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/drepanosaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MANIDENS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/manidens/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DASYCEPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dasyceps/stage_0.png"));
	});
	public static final Map<FossilSkeletonFivePieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eunotosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pelecanimimus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acanthostega/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.STENOKRANIO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stenokranio/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HENODUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/henodus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PROTOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/protoceras/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplocaulusmagnicornis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TIKTAALIK, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tiktaalik/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SUMINIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suminia/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalancosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/riojasuchus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/drepanosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MANIDENS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/manidens/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DASYCEPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dasyceps/frame.png"));
	});
	public static Map<FossilSkeletonFivePieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFivePieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new PelecanimimusFossilModel(p_173662_.bakeLayer(ClientEvents.PELECANIMIMUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA, new AcanthostegaFossilModel(p_173662_.bakeLayer(ClientEvents.ACANTHOSTEGA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new EunotosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EUNOTOSAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.STENOKRANIO, new StenokranioFossilModel(p_173662_.bakeLayer(ClientEvents.STENOKRANIO)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HENODUS, new HenodusFossilModel(p_173662_.bakeLayer(ClientEvents.HENODUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PROTOCERAS, new ProtocerasFossilModel(p_173662_.bakeLayer(ClientEvents.PROTOCERAS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS, new DiplocaulusmagnicornisFossilModel(p_173662_.bakeLayer(ClientEvents.DIPLOCAULUSMAGNICORNIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TIKTAALIK, new TiktaalikFossilModel(p_173662_.bakeLayer(ClientEvents.TIKTAALIK)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SUMINIA, new SuminiaFossilModel(p_173662_.bakeLayer(ClientEvents.SUMINIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS, new MegalancosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MEGALANCOSAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS, new RiojasuchusFossilModel(p_173662_.bakeLayer(ClientEvents.RIOJASUCHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS, new DrepanosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DREPANOSAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MANIDENS, new ManidensFossilModel(p_173662_.bakeLayer(ClientEvents.MANIDENS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DASYCEPS, new DasycepsFossilModel(p_173662_.bakeLayer(ClientEvents.DASYCEPS)));
		return builder.build();
	}

	public static Map<FossilSkeletonFivePieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFivePieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFivePieceBlock.Types.PELECANIMIMUS, new PelecanimimusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PELECANIMIMUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA, new AcanthostegaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ACANTHOSTEGA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EUNOTOSAURUS, new EunotosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUNOTOSAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.STENOKRANIO, new StenokranioFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STENOKRANIO_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HENODUS, new HenodusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HENODUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PROTOCERAS, new ProtocerasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PROTOCERAS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS, new DiplocaulusmagnicornisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIPLOCAULUSMAGNICORNIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TIKTAALIK, new TiktaalikFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TIKTAALIK_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SUMINIA, new SuminiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SUMINIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS, new MegalancosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEGALANCOSAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS, new RiojasuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RIOJASUCHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS, new DrepanosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DREPANOSAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MANIDENS, new ManidensFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MANIDENS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DASYCEPS, new DasycepsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DASYCEPS_FRAME)));
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
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA) {
			p_173667_.scale(-0.22F, -0.22F, 0.22F);
			p_173667_.translate(0F, 3.1F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.STENOKRANIO) {
			p_173667_.scale(-0.6F, -0.6F, 0.6F);
			p_173667_.translate(0F, 0.18F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.HENODUS) {
			p_173667_.scale(-0.45F, -0.45F, 0.45F);
			p_173667_.translate(0F, -0.18F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PROTOCERAS) {
			p_173667_.scale(-0.34F, -0.34F, 0.34F);
			p_173667_.translate(0F, 1.43F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS) {
			p_173667_.scale(-0.385F, -0.385F, 0.385F);
			p_173667_.translate(0F, 1.43F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.TIKTAALIK) {
			p_173667_.scale(-0.355F, -0.355F, 0.355F);
			p_173667_.translate(0F, 1.18F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.SUMINIA) {
			p_173667_.scale(-0.15F, -0.15F, 0.15F);
			p_173667_.translate(0F, 5.2F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS) {
			p_173667_.scale(-0.15F, -0.15F, 0.15F);
			p_173667_.translate(0F, 5.15F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS) {
			p_173667_.scale(-0.5F, -0.5F, 0.5F);
			p_173667_.translate(0F, 0.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS) {
			p_173667_.scale(-0.15F, -0.15F, 0.15F);
			p_173667_.translate(0F, 5.15F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.MANIDENS) {
			p_173667_.scale(-0.17F, -0.17F, 0.17F);
			p_173667_.translate(0F, 4.4F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DASYCEPS) {
			p_173667_.scale(-0.305F, -0.305F, 0.305F);
			p_173667_.translate(0F, 1.75F, 0F);
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
		} else if (type == FossilSkeletonFivePieceBlock.Types.ACANTHOSTEGA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acanthostega/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.STENOKRANIO) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stenokranio/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.HENODUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/henodus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PROTOCERAS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/protoceras/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMAGNICORNIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplocaulusmagnicornis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.TIKTAALIK) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tiktaalik/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.SUMINIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suminia/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.MEGALANCOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalancosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.RIOJASUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/riojasuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DREPANOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/drepanosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.MANIDENS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/manidens/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DASYCEPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dasyceps/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonFivePieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
