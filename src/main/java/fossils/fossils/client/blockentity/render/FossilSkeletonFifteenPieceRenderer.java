package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.abyssosaurus.AbyssosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.abyssosaurus.AbyssosaurusFossilModel;
import fossils.fossils.client.blockentity.model.bisonlatifrons.BisonlatifronsFossilFrameModel;
import fossils.fossils.client.blockentity.model.bisonlatifrons.BisonlatifronsFossilModel;
import fossils.fossils.client.blockentity.model.brachytrachelopan.BrachytrachelopanFossilFrameModel;
import fossils.fossils.client.blockentity.model.brachytrachelopan.BrachytrachelopanFossilModel;
import fossils.fossils.client.blockentity.model.camptosaurus.CamptosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.camptosaurus.CamptosaurusFossilModel;
import fossils.fossils.client.blockentity.model.ceratosaurusdentisulcatus.CeratosaurusdentisulcatusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ceratosaurusdentisulcatus.CeratosaurusdentisulcatusFossilModel;
import fossils.fossils.client.blockentity.model.cryolophosaurus.CryolophosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cryolophosaurus.CryolophosaurusFossilModel;
import fossils.fossils.client.blockentity.model.decennatherium.DecennatheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.decennatherium.DecennatheriumFossilModel;
import fossils.fossils.client.blockentity.model.deinonychus.DeinonychusFossilFrameModel;
import fossils.fossils.client.blockentity.model.deinonychus.DeinonychusFossilModel;
import fossils.fossils.client.blockentity.model.dilophosaurus.DilophosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dilophosaurus.DilophosaurusFossilModel;
import fossils.fossils.client.blockentity.model.eoabelisaurus.EoabelisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eoabelisaurus.EoabelisaurusFossilModel;
import fossils.fossils.client.blockentity.model.huaxiazhoulong.HuaxiazhoulongFossilFrameModel;
import fossils.fossils.client.blockentity.model.huaxiazhoulong.HuaxiazhoulongFossilModel;
import fossils.fossils.client.blockentity.model.koolasuchus.KoolasuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.koolasuchus.KoolasuchusFossilModel;
import fossils.fossils.client.blockentity.model.kubanochoerus.KubanochoerusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kubanochoerus.KubanochoerusFossilModel;
import fossils.fossils.client.blockentity.model.muttaburrasaurus.MuttaburrasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.muttaburrasaurus.MuttaburrasaurusFossilModel;
import fossils.fossils.client.blockentity.model.oviraptor.OviraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.oviraptor.OviraptorFossilModel;
import fossils.fossils.client.blockentity.model.patagosaurus.PatagosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.patagosaurus.PatagosaurusFossilModel;
import fossils.fossils.client.blockentity.model.platecarpus.PlatecarpusFossilFrameModel;
import fossils.fossils.client.blockentity.model.platecarpus.PlatecarpusFossilModel;
import fossils.fossils.client.blockentity.model.rajasaurus.RajasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.rajasaurus.RajasaurusFossilModel;
import fossils.fossils.client.blockentity.model.regaliceratops.RegaliceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.regaliceratops.RegaliceratopsFossilModel;
import fossils.fossils.client.blockentity.model.sauropelta.SauropeltaFossilFrameModel;
import fossils.fossils.client.blockentity.model.sauropelta.SauropeltaFossilModel;
import fossils.fossils.client.blockentity.model.smilosuchus.SmilosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.smilosuchus.SmilosuchusFossilModel;
import fossils.fossils.client.blockentity.model.tethyshadros.TethyshadrosFossilFrameModel;
import fossils.fossils.client.blockentity.model.tethyshadros.TethyshadrosFossilModel;
import fossils.fossils.client.blockentity.model.velociraptor.VelociraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.velociraptor.VelociraptorFossilModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilModel;
import fossils.fossils.client.blockentity.model.yingshanosaurus.YingshanosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yingshanosaurus.YingshanosaurusFossilModel;
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
		type.put(FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/smilosuchus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cryolophosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dilophosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ceratosaurusdentisulcatus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yingshanosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/patagosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eoabelisaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/camptosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/koolasuchus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sauropelta/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/abyssosaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/muttaburrasaurus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinonychus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brachytrachelopan/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tethyshadros/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/regaliceratops/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/huaxiazhoulong/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/velociraptor/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kubanochoerus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/decennatherium/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/platecarpus/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oviraptor/stage_0.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rajasaurus/stage_0.png"));
	});
	public static final Map<FossilSkeletonFifteenPieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wuerhosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bisonlatifrons/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/smilosuchus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cryolophosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dilophosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ceratosaurusdentisulcatus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yingshanosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/patagosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eoabelisaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/camptosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/koolasuchus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sauropelta/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/abyssosaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/muttaburrasaurus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinonychus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brachytrachelopan/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tethyshadros/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/regaliceratops/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/huaxiazhoulong/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/velociraptor/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kubanochoerus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/decennatherium/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/platecarpus/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oviraptor/frame.png"));
		type.put(FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rajasaurus/frame.png"));
	});
	public static Map<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new WuerhosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.WUERHOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new BisonlatifronsFossilModel(p_173662_.bakeLayer(ClientEvents.BISONLATIFRONS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS, new SmilosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.SMILOSUCHUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS, new CryolophosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CRYOLOPHOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS, new DilophosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DILOPHOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS, new CeratosaurusdentisulcatusFossilModel(p_173662_.bakeLayer(ClientEvents.CERATOSAURUSDENTISULCATUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS, new YingshanosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.YINGSHANOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS, new PatagosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PATAGOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS, new EoabelisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EOABELISAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS, new CamptosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CAMPTOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS, new KoolasuchusFossilModel(p_173662_.bakeLayer(ClientEvents.KOOLASUCHUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA, new SauropeltaFossilModel(p_173662_.bakeLayer(ClientEvents.SAUROPELTA)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS, new AbyssosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ABYSSOSAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS, new MuttaburrasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MUTTABURRASAURUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS, new DeinonychusFossilModel(p_173662_.bakeLayer(ClientEvents.DEINONYCHUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN, new BrachytrachelopanFossilModel(p_173662_.bakeLayer(ClientEvents.BRACHYTRACHELOPAN)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS, new TethyshadrosFossilModel(p_173662_.bakeLayer(ClientEvents.TETHYSHADROS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS, new RegaliceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.REGALICERATOPS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG, new HuaxiazhoulongFossilModel(p_173662_.bakeLayer(ClientEvents.HUAXIAZHOULONG)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR, new VelociraptorFossilModel(p_173662_.bakeLayer(ClientEvents.VELOCIRAPTOR)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS, new KubanochoerusFossilModel(p_173662_.bakeLayer(ClientEvents.KUBANOCHOERUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM, new DecennatheriumFossilModel(p_173662_.bakeLayer(ClientEvents.DECENNATHERIUM)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS, new PlatecarpusFossilModel(p_173662_.bakeLayer(ClientEvents.PLATECARPUS)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR, new OviraptorFossilModel(p_173662_.bakeLayer(ClientEvents.OVIRAPTOR)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS, new RajasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.RAJASAURUS)));
		return builder.build();
	}

	public static Map<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonFifteenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS, new WuerhosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.WUERHOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS, new BisonlatifronsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BISONLATIFRONS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS, new SmilosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SMILOSUCHUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS, new CryolophosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CRYOLOPHOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS, new DilophosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DILOPHOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS, new CeratosaurusdentisulcatusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CERATOSAURUSDENTISULCATUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS, new YingshanosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YINGSHANOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS, new PatagosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PATAGOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS, new EoabelisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EOABELISAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS, new CamptosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CAMPTOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS, new KoolasuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KOOLASUCHUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA, new SauropeltaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SAUROPELTA_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS, new AbyssosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ABYSSOSAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS, new MuttaburrasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MUTTABURRASAURUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS, new DeinonychusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DEINONYCHUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN, new BrachytrachelopanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BRACHYTRACHELOPAN_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS, new TethyshadrosFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TETHYSHADROS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS, new RegaliceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.REGALICERATOPS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG, new HuaxiazhoulongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HUAXIAZHOULONG_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR, new VelociraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.VELOCIRAPTOR_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS, new KubanochoerusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KUBANOCHOERUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM, new DecennatheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DECENNATHERIUM_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS, new PlatecarpusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLATECARPUS_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR, new OviraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OVIRAPTOR_FRAME)));
		builder.put(FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS, new RajasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RAJASAURUS_FRAME)));
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
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS) {
			p_173667_.scale(-0.7735F, -0.7735F, 0.7735F);
			p_173667_.translate(0F, -0.22F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS) {
			p_173667_.scale(-0.8F, -0.8F, 0.8F);
			p_173667_.translate(0F, -0.24F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.45F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS) {
			p_173667_.scale(-0.87F, -0.87F, 0.87F);
			p_173667_.translate(0F, -0.35F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.49F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.52F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS) {
			p_173667_.scale(-0.65F, -0.65F, 0.65F);
			p_173667_.translate(0F, 0.045F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.6F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS) {
			p_173667_.scale(-0.6F, -0.6F, 0.6F);
			p_173667_.translate(0F, 0.18F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG) {
			p_173667_.scale(-1.43F, -1.43F, 1.43F);
			p_173667_.translate(0F, -0.8F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR) {
			p_173667_.scale(-0.46F, -0.46F, 0.46F);
			p_173667_.translate(0F, 0.7F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS) {
			p_173667_.scale(-0.89F, -0.89F, 0.89F);
			p_173667_.translate(0F, -0.38F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.51F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.51F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR) {
			p_173667_.scale(-0.56F, -0.56F, 0.56F);
			p_173667_.translate(0F, 0.3F, 0F);
		}  else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS) {
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
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/smilosuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cryolophosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dilophosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ceratosaurusdentisulcatus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yingshanosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/patagosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eoabelisaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/camptosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/koolasuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sauropelta/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/abyssosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/muttaburrasaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinonychus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brachytrachelopan/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tethyshadros/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/regaliceratops/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/huaxiazhoulong/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/velociraptor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kubanochoerus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/decennatherium/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/platecarpus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oviraptor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rajasaurus/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonFifteenPieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
