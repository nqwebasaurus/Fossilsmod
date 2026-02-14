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
import fossils.fossils.client.blockentity.model.achelousaurus.AchelousaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.achelousaurus.AchelousaurusFossilModel;
import fossils.fossils.client.blockentity.model.altirhinus.AltirhinusFossilFrameModel;
import fossils.fossils.client.blockentity.model.altirhinus.AltirhinusFossilModel;
import fossils.fossils.client.blockentity.model.angulomastacator.AngulomastacatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.angulomastacator.AngulomastacatorFossilModel;
import fossils.fossils.client.blockentity.model.anthracosaurus.AnthracosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.anthracosaurus.AnthracosaurusFossilModel;
import fossils.fossils.client.blockentity.model.asfaltovenator.AsfaltovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.asfaltovenator.AsfaltovenatorFossilModel;
import fossils.fossils.client.blockentity.model.bajadasaurus.BajadasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.bajadasaurus.BajadasaurusFossilModel;
import fossils.fossils.client.blockentity.model.batrachotomus.BatrachotomusFossilFrameModel;
import fossils.fossils.client.blockentity.model.batrachotomus.BatrachotomusFossilModel;
import fossils.fossils.client.blockentity.model.bisonlatifrons.BisonlatifronsFossilFrameModel;
import fossils.fossils.client.blockentity.model.bisonlatifrons.BisonlatifronsFossilModel;
import fossils.fossils.client.blockentity.model.brachytrachelopan.BrachytrachelopanFossilFrameModel;
import fossils.fossils.client.blockentity.model.brachytrachelopan.BrachytrachelopanFossilModel;
import fossils.fossils.client.blockentity.model.brightstoneus.BrightstoneusFossilFrameModel;
import fossils.fossils.client.blockentity.model.brightstoneus.BrightstoneusFossilModel;
import fossils.fossils.client.blockentity.model.camptosaurus.CamptosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.camptosaurus.CamptosaurusFossilModel;
import fossils.fossils.client.blockentity.model.centrosaurus.CentrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.centrosaurus.CentrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.ceratosaurusdentisulcatus.CeratosaurusdentisulcatusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ceratosaurusdentisulcatus.CeratosaurusdentisulcatusFossilModel;
import fossils.fossils.client.blockentity.model.chasmosaurus.ChasmosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.chasmosaurus.ChasmosaurusFossilModel;
import fossils.fossils.client.blockentity.model.coelodonta.CoelodontaFossilFrameModel;
import fossils.fossils.client.blockentity.model.coelodonta.CoelodontaFossilModel;
import fossils.fossils.client.blockentity.model.concavenator.ConcavenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.concavenator.ConcavenatorFossilModel;
import fossils.fossils.client.blockentity.model.cryolophosaurus.CryolophosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cryolophosaurus.CryolophosaurusFossilModel;
import fossils.fossils.client.blockentity.model.daeodon.DaeodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.daeodon.DaeodonFossilModel;
import fossils.fossils.client.blockentity.model.dakosaurus.DakosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dakosaurus.DakosaurusFossilModel;
import fossils.fossils.client.blockentity.model.decennatherium.DecennatheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.decennatherium.DecennatheriumFossilModel;
import fossils.fossils.client.blockentity.model.deinonychus.DeinonychusFossilFrameModel;
import fossils.fossils.client.blockentity.model.deinonychus.DeinonychusFossilModel;
import fossils.fossils.client.blockentity.model.desmatosuchus.DesmatosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.desmatosuchus.DesmatosuchusFossilModel;
import fossils.fossils.client.blockentity.model.dilophosaurus.DilophosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dilophosaurus.DilophosaurusFossilModel;
import fossils.fossils.client.blockentity.model.elaphrosaurus.ElaphrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.elaphrosaurus.ElaphrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.eoabelisaurus.EoabelisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eoabelisaurus.EoabelisaurusFossilModel;
import fossils.fossils.client.blockentity.model.eocarcharia.EocarchariaFossilFrameModel;
import fossils.fossils.client.blockentity.model.eocarcharia.EocarchariaFossilModel;
import fossils.fossils.client.blockentity.model.erythrosuchus.ErythrosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.erythrosuchus.ErythrosuchusFossilModel;
import fossils.fossils.client.blockentity.model.estemmenosuchusmirabilis.EstemmenosuchusmirabilisFossilFrameModel;
import fossils.fossils.client.blockentity.model.estemmenosuchusmirabilis.EstemmenosuchusmirabilisFossilModel;
import fossils.fossils.client.blockentity.model.etjosuchus.EtjosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.etjosuchus.EtjosuchusFossilModel;
import fossils.fossils.client.blockentity.model.euhelopus.EuhelopusFossilFrameModel;
import fossils.fossils.client.blockentity.model.euhelopus.EuhelopusFossilModel;
import fossils.fossils.client.blockentity.model.eurhinosaurus.EurhinosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eurhinosaurus.EurhinosaurusFossilModel;
import fossils.fossils.client.blockentity.model.gaiasia.GaiasiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.gaiasia.GaiasiaFossilModel;
import fossils.fossils.client.blockentity.model.huaxiazhoulong.HuaxiazhoulongFossilFrameModel;
import fossils.fossils.client.blockentity.model.huaxiazhoulong.HuaxiazhoulongFossilModel;
import fossils.fossils.client.blockentity.model.ichthyovenator.IchthyovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.ichthyovenator.IchthyovenatorFossilModel;
import fossils.fossils.client.blockentity.model.inostrancevia.InostranceviaFossilFrameModel;
import fossils.fossils.client.blockentity.model.inostrancevia.InostranceviaFossilModel;
import fossils.fossils.client.blockentity.model.irritator.IrritatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.irritator.IrritatorFossilModel;
import fossils.fossils.client.blockentity.model.kamuysaurus.KamuysaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kamuysaurus.KamuysaurusFossilModel;
import fossils.fossils.client.blockentity.model.klamelisaurus.KlamelisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.klamelisaurus.KlamelisaurusFossilModel;
import fossils.fossils.client.blockentity.model.koolasuchus.KoolasuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.koolasuchus.KoolasuchusFossilModel;
import fossils.fossils.client.blockentity.model.kubanochoerus.KubanochoerusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kubanochoerus.KubanochoerusFossilModel;
import fossils.fossils.client.blockentity.model.liopleurodon.LiopleurodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.liopleurodon.LiopleurodonFossilModel;
import fossils.fossils.client.blockentity.model.luskhan.LuskhanFossilFrameModel;
import fossils.fossils.client.blockentity.model.luskhan.LuskhanFossilModel;
import fossils.fossils.client.blockentity.model.lusovenator.LusovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.lusovenator.LusovenatorFossilModel;
import fossils.fossils.client.blockentity.model.malawisaurus.MalawisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.malawisaurus.MalawisaurusFossilModel;
import fossils.fossils.client.blockentity.model.mantellisaurus.MantellisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.mantellisaurus.MantellisaurusFossilModel;
import fossils.fossils.client.blockentity.model.megalosaurus.MegalosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.megalosaurus.MegalosaurusFossilModel;
import fossils.fossils.client.blockentity.model.megaraptor.MegaraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.megaraptor.MegaraptorFossilModel;
import fossils.fossils.client.blockentity.model.monolophosaurus.MonolophosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.monolophosaurus.MonolophosaurusFossilModel;
import fossils.fossils.client.blockentity.model.muttaburrasaurus.MuttaburrasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.muttaburrasaurus.MuttaburrasaurusFossilModel;
import fossils.fossils.client.blockentity.model.nanotyrannus.NanotyrannusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nanotyrannus.NanotyrannusFossilModel;
import fossils.fossils.client.blockentity.model.neovenator.NeovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.neovenator.NeovenatorFossilModel;
import fossils.fossils.client.blockentity.model.nothosaurus.NothosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nothosaurus.NothosaurusFossilModel;
import fossils.fossils.client.blockentity.model.odontopteryx.OdontopteryxFossilFrameModel;
import fossils.fossils.client.blockentity.model.odontopteryx.OdontopteryxFossilModel;
import fossils.fossils.client.blockentity.model.olorotitan.OlorotitanFossilFrameModel;
import fossils.fossils.client.blockentity.model.olorotitan.OlorotitanFossilModel;
import fossils.fossils.client.blockentity.model.ophthalmothule.OphthalmothuleFossilFrameModel;
import fossils.fossils.client.blockentity.model.ophthalmothule.OphthalmothuleFossilModel;
import fossils.fossils.client.blockentity.model.ouranosaurus.OuranosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ouranosaurus.OuranosaurusFossilModel;
import fossils.fossils.client.blockentity.model.oviraptor.OviraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.oviraptor.OviraptorFossilModel;
import fossils.fossils.client.blockentity.model.palaeotherium.PalaeotheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.palaeotherium.PalaeotheriumFossilModel;
import fossils.fossils.client.blockentity.model.pan.PanFossilFrameModel;
import fossils.fossils.client.blockentity.model.pan.PanFossilModel;
import fossils.fossils.client.blockentity.model.patagosaurus.PatagosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.patagosaurus.PatagosaurusFossilModel;
import fossils.fossils.client.blockentity.model.pholiderpeton.PholiderpetonFossilFrameModel;
import fossils.fossils.client.blockentity.model.pholiderpeton.PholiderpetonFossilModel;
import fossils.fossils.client.blockentity.model.platecarpus.PlatecarpusFossilFrameModel;
import fossils.fossils.client.blockentity.model.platecarpus.PlatecarpusFossilModel;
import fossils.fossils.client.blockentity.model.probactrosaurus.ProbactrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.probactrosaurus.ProbactrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.proterosuchus.ProterosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.proterosuchus.ProterosuchusFossilModel;
import fossils.fossils.client.blockentity.model.pyrotherium.PyrotheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.pyrotherium.PyrotheriumFossilModel;
import fossils.fossils.client.blockentity.model.rajasaurus.RajasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.rajasaurus.RajasaurusFossilModel;
import fossils.fossils.client.blockentity.model.regaliceratops.RegaliceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.regaliceratops.RegaliceratopsFossilModel;
import fossils.fossils.client.blockentity.model.rhomaleosaurus.RhomaleosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.rhomaleosaurus.RhomaleosaurusFossilModel;
import fossils.fossils.client.blockentity.model.sauropelta.SauropeltaFossilFrameModel;
import fossils.fossils.client.blockentity.model.sauropelta.SauropeltaFossilModel;
import fossils.fossils.client.blockentity.model.shunosaurus.ShunosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.shunosaurus.ShunosaurusFossilModel;
import fossils.fossils.client.blockentity.model.sinoceratops.SinoceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.sinoceratops.SinoceratopsFossilModel;
import fossils.fossils.client.blockentity.model.sinomegacerosyabei.SinomegacerosyabeiFossilFrameModel;
import fossils.fossils.client.blockentity.model.sinomegacerosyabei.SinomegacerosyabeiFossilModel;
import fossils.fossils.client.blockentity.model.sinraptor.SinraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.sinraptor.SinraptorFossilModel;
import fossils.fossils.client.blockentity.model.smilosuchus.SmilosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.smilosuchus.SmilosuchusFossilModel;
import fossils.fossils.client.blockentity.model.spiclypeus.SpiclypeusFossilFrameModel;
import fossils.fossils.client.blockentity.model.spiclypeus.SpiclypeusFossilModel;
import fossils.fossils.client.blockentity.model.spicomellus.SpicomellusFossilFrameModel;
import fossils.fossils.client.blockentity.model.spicomellus.SpicomellusFossilModel;
import fossils.fossils.client.blockentity.model.stellasaurus.StellasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.stellasaurus.StellasaurusFossilModel;
import fossils.fossils.client.blockentity.model.suchomimus.SuchomimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.suchomimus.SuchomimusFossilModel;
import fossils.fossils.client.blockentity.model.suzhousaurus.SuzhousaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.suzhousaurus.SuzhousaurusFossilModel;
import fossils.fossils.client.blockentity.model.tanystropheus.TanystropheusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tanystropheus.TanystropheusFossilModel;
import fossils.fossils.client.blockentity.model.tapinocaninus.TapinocaninusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tapinocaninus.TapinocaninusFossilModel;
import fossils.fossils.client.blockentity.model.temnodontosaurus.TemnodontosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.temnodontosaurus.TemnodontosaurusFossilModel;
import fossils.fossils.client.blockentity.model.tenontosaurus.TenontosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tenontosaurus.TenontosaurusFossilModel;
import fossils.fossils.client.blockentity.model.tethyshadros.TethyshadrosFossilFrameModel;
import fossils.fossils.client.blockentity.model.tethyshadros.TethyshadrosFossilModel;
import fossils.fossils.client.blockentity.model.thalattosuchus.ThalattosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.thalattosuchus.ThalattosuchusFossilModel;
import fossils.fossils.client.blockentity.model.tuojiangosaurus.TuojiangosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tuojiangosaurus.TuojiangosaurusFossilModel;
import fossils.fossils.client.blockentity.model.tupandactylusimperator.TupandactylusimperatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.tupandactylusimperator.TupandactylusimperatorFossilModel;
import fossils.fossils.client.blockentity.model.tyrannotitan.TyrannotitanFossilFrameModel;
import fossils.fossils.client.blockentity.model.tyrannotitan.TyrannotitanFossilModel;
import fossils.fossils.client.blockentity.model.uranocentrodon.UranocentrodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.uranocentrodon.UranocentrodonFossilModel;
import fossils.fossils.client.blockentity.model.velociraptor.VelociraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.velociraptor.VelociraptorFossilModel;
import fossils.fossils.client.blockentity.model.wendiceratops.WendiceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.wendiceratops.WendiceratopsFossilModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilModel;
import fossils.fossils.client.blockentity.model.yingshanosaurus.YingshanosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yingshanosaurus.YingshanosaurusFossilModel;
import fossils.fossils.client.blockentity.model.yunnanosaurus.YunnanosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yunnanosaurus.YunnanosaurusFossilModel;
import fossils.fossils.client.blockentity.model.zarafasaura.ZarafasauraFossilFrameModel;
import fossils.fossils.client.blockentity.model.zarafasaura.ZarafasauraFossilModel;
import fossils.fossils.client.blockentity.model.zupaysaurus.ZupaysaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.zupaysaurus.ZupaysaurusFossilModel;
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
        type.put(FossilSkeletonFifteenPieceBlock.Types.ZARAFASAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zarafasaura/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TANYSTROPHEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tanystropheus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.OURANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ouranosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PYROTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pyrotherium/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MONOLOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/monolophosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.STELLASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stellasaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.COELODONTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/coelodonta/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ACHELOUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/achelousaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.KAMUYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kamuysaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SHUNOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shunosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MALAWISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/malawisaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ETJOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/etjosuchus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pan/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TAPINOCANINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tapinocaninus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ERYTHROSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/erythrosuchus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.CONCAVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/concavenator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.KLAMELISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/klamelisaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.YUNNANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yunnanosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.THALATTOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thalattosuchus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TUPANDACTYLUSIMPERATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusimperator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TENONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tenontosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SINOMEGACEROSYABEI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinomegacerosyabei/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MEGARAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megaraptor/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ALTIRHINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/altirhinus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ICHTHYOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyovenator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ASFALTOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/asfaltovenator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SUCHOMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suchomimus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.DAEODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daeodon/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.BAJADASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bajadasaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SINOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinoceratops/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PROBACTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/probactrosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SPICLYPEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spiclypeus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.BRIGHTSTONEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brightstoneus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.EUHELOPUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/euhelopus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.NEOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/neovenator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TYRANNOTITAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tyrannotitan/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.LUSKHAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/luskhan/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.DESMATOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/desmatosuchus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SUZHOUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suzhousaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MANTELLISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mantellisaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.CHASMOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chasmosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.CENTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/centrosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.LIOPLEURODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/liopleurodon/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.LUSOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lusovenator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PHOLIDERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pholiderpeton/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.EOCARCHARIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eocarcharia/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ANGULOMASTACATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/angulomastacator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ELAPHROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/elaphrosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MEGALOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.DAKOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dakosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.GAIASIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gaiasia/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TUOJIANGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tuojiangosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.BATRACHOTOMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/batrachotomus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.EURHINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eurhinosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.RHOMALEOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rhomaleosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ESTEMMENOSUCHUSMIRABILIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/estemmenosuchusmirabilis/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SPICOMELLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spicomellus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PALAEOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/palaeotherium/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ODONTOPTERYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/odontopteryx/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.NOTHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nothosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.OPHTHALMOTHULE, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophthalmothule/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PROTEROSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proterosuchus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.NANOTYRANNUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nanotyrannus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SINRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinraptor/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.IRRITATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/irritator/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ZUPAYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zupaysaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TEMNODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/temnodontosaurus/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.URANOCENTRODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/uranocentrodon/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.OLOROTITAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/olorotitan/stage_0.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.WENDICERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wendiceratops/stage_0.png"));
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
        type.put(FossilSkeletonFifteenPieceBlock.Types.ZARAFASAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zarafasaura/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TANYSTROPHEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tanystropheus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.OURANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ouranosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PYROTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pyrotherium/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MONOLOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/monolophosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.STELLASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stellasaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.COELODONTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/coelodonta/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ACHELOUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/achelousaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.KAMUYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kamuysaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SHUNOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shunosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MALAWISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/malawisaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ETJOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/etjosuchus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pan/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TAPINOCANINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tapinocaninus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ERYTHROSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/erythrosuchus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.CONCAVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/concavenator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.KLAMELISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/klamelisaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.YUNNANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yunnanosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.THALATTOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thalattosuchus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TUPANDACTYLUSIMPERATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusimperator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TENONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tenontosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SINOMEGACEROSYABEI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinomegacerosyabei/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MEGARAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megaraptor/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ALTIRHINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/altirhinus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ICHTHYOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyovenator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ASFALTOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/asfaltovenator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SUCHOMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suchomimus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.DAEODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daeodon/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.BAJADASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bajadasaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SINOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinoceratops/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PROBACTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/probactrosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SPICLYPEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spiclypeus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.BRIGHTSTONEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brightstoneus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.EUHELOPUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/euhelopus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.NEOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/neovenator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TYRANNOTITAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tyrannotitan/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.LUSKHAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/luskhan/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.DESMATOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/desmatosuchus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SUZHOUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suzhousaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MANTELLISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mantellisaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.CHASMOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chasmosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.CENTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/centrosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.LIOPLEURODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/liopleurodon/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.LUSOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lusovenator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PHOLIDERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pholiderpeton/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.EOCARCHARIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eocarcharia/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ANGULOMASTACATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/angulomastacator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ELAPHROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/elaphrosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.MEGALOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.DAKOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dakosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.GAIASIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gaiasia/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TUOJIANGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tuojiangosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.BATRACHOTOMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/batrachotomus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.EURHINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eurhinosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.RHOMALEOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rhomaleosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ESTEMMENOSUCHUSMIRABILIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/estemmenosuchusmirabilis/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SPICOMELLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spicomellus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PALAEOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/palaeotherium/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ODONTOPTERYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/odontopteryx/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.NOTHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nothosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.OPHTHALMOTHULE, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophthalmothule/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.PROTEROSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proterosuchus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.NANOTYRANNUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nanotyrannus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.SINRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinraptor/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.IRRITATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/irritator/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.ZUPAYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zupaysaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.TEMNODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/temnodontosaurus/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.URANOCENTRODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/uranocentrodon/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.OLOROTITAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/olorotitan/frame.png"));
        type.put(FossilSkeletonFifteenPieceBlock.Types.WENDICERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wendiceratops/frame.png"));
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
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ZARAFASAURA, new ZarafasauraFossilModel(p_173662_.bakeLayer(ClientEvents.ZARAFASAURA)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TANYSTROPHEUS, new TanystropheusFossilModel(p_173662_.bakeLayer(ClientEvents.TANYSTROPHEUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.OURANOSAURUS, new OuranosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.OURANOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PYROTHERIUM, new PyrotheriumFossilModel(p_173662_.bakeLayer(ClientEvents.PYROTHERIUM)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MONOLOPHOSAURUS, new MonolophosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MONOLOPHOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.STELLASAURUS, new StellasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.STELLASAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.COELODONTA, new CoelodontaFossilModel(p_173662_.bakeLayer(ClientEvents.COELODONTA)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ACHELOUSAURUS, new AchelousaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ACHELOUSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.KAMUYSAURUS, new KamuysaurusFossilModel(p_173662_.bakeLayer(ClientEvents.KAMUYSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SHUNOSAURUS, new ShunosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SHUNOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MALAWISAURUS, new MalawisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MALAWISAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ETJOSUCHUS, new EtjosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.ETJOSUCHUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PAN, new PanFossilModel(p_173662_.bakeLayer(ClientEvents.PAN)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TAPINOCANINUS, new TapinocaninusFossilModel(p_173662_.bakeLayer(ClientEvents.TAPINOCANINUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ERYTHROSUCHUS, new ErythrosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.ERYTHROSUCHUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.CONCAVENATOR, new ConcavenatorFossilModel(p_173662_.bakeLayer(ClientEvents.CONCAVENATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.KLAMELISAURUS, new KlamelisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.KLAMELISAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.YUNNANOSAURUS, new YunnanosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.YUNNANOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.THALATTOSUCHUS, new ThalattosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.THALATTOSUCHUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TUPANDACTYLUSIMPERATOR, new TupandactylusimperatorFossilModel(p_173662_.bakeLayer(ClientEvents.TUPANDACTYLUSIMPERATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TENONTOSAURUS, new TenontosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.TENONTOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SINOMEGACEROSYABEI, new SinomegacerosyabeiFossilModel(p_173662_.bakeLayer(ClientEvents.SINOMEGACEROSYABEI)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MEGARAPTOR, new MegaraptorFossilModel(p_173662_.bakeLayer(ClientEvents.MEGARAPTOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ALTIRHINUS, new AltirhinusFossilModel(p_173662_.bakeLayer(ClientEvents.ALTIRHINUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ICHTHYOVENATOR, new IchthyovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.ICHTHYOVENATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ASFALTOVENATOR, new AsfaltovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.ASFALTOVENATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SUCHOMIMUS, new SuchomimusFossilModel(p_173662_.bakeLayer(ClientEvents.SUCHOMIMUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.DAEODON, new DaeodonFossilModel(p_173662_.bakeLayer(ClientEvents.DAEODON)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.BAJADASAURUS, new BajadasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.BAJADASAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SINOCERATOPS, new SinoceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.SINOCERATOPS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PROBACTROSAURUS, new ProbactrosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PROBACTROSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SPICLYPEUS, new SpiclypeusFossilModel(p_173662_.bakeLayer(ClientEvents.SPICLYPEUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.BRIGHTSTONEUS, new BrightstoneusFossilModel(p_173662_.bakeLayer(ClientEvents.BRIGHTSTONEUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.EUHELOPUS, new EuhelopusFossilModel(p_173662_.bakeLayer(ClientEvents.EUHELOPUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.NEOVENATOR, new NeovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.NEOVENATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TYRANNOTITAN, new TyrannotitanFossilModel(p_173662_.bakeLayer(ClientEvents.TYRANNOTITAN)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.LUSKHAN, new LuskhanFossilModel(p_173662_.bakeLayer(ClientEvents.LUSKHAN)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.DESMATOSUCHUS, new DesmatosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.DESMATOSUCHUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SUZHOUSAURUS, new SuzhousaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SUZHOUSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MANTELLISAURUS, new MantellisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MANTELLISAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.CHASMOSAURUS, new ChasmosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CHASMOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.CENTROSAURUS, new CentrosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CENTROSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.LIOPLEURODON, new LiopleurodonFossilModel(p_173662_.bakeLayer(ClientEvents.LIOPLEURODON)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.LUSOVENATOR, new LusovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.LUSOVENATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PHOLIDERPETON, new PholiderpetonFossilModel(p_173662_.bakeLayer(ClientEvents.PHOLIDERPETON)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.EOCARCHARIA, new EocarchariaFossilModel(p_173662_.bakeLayer(ClientEvents.EOCARCHARIA)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ANGULOMASTACATOR, new AngulomastacatorFossilModel(p_173662_.bakeLayer(ClientEvents.ANGULOMASTACATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ELAPHROSAURUS, new ElaphrosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ELAPHROSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MEGALOSAURUS, new MegalosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MEGALOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.DAKOSAURUS, new DakosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DAKOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.GAIASIA, new GaiasiaFossilModel(p_173662_.bakeLayer(ClientEvents.GAIASIA)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TUOJIANGOSAURUS, new TuojiangosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.TUOJIANGOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.BATRACHOTOMUS, new BatrachotomusFossilModel(p_173662_.bakeLayer(ClientEvents.BATRACHOTOMUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.EURHINOSAURUS, new EurhinosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EURHINOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.RHOMALEOSAURUS, new RhomaleosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.RHOMALEOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ESTEMMENOSUCHUSMIRABILIS, new EstemmenosuchusmirabilisFossilModel(p_173662_.bakeLayer(ClientEvents.ESTEMMENOSUCHUSMIRABILIS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SPICOMELLUS, new SpicomellusFossilModel(p_173662_.bakeLayer(ClientEvents.SPICOMELLUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PALAEOTHERIUM, new PalaeotheriumFossilModel(p_173662_.bakeLayer(ClientEvents.PALAEOTHERIUM)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ODONTOPTERYX, new OdontopteryxFossilModel(p_173662_.bakeLayer(ClientEvents.ODONTOPTERYX)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.NOTHOSAURUS, new NothosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.NOTHOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.OPHTHALMOTHULE, new OphthalmothuleFossilModel(p_173662_.bakeLayer(ClientEvents.OPHTHALMOTHULE)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PROTEROSUCHUS, new ProterosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.PROTEROSUCHUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.NANOTYRANNUS, new NanotyrannusFossilModel(p_173662_.bakeLayer(ClientEvents.NANOTYRANNUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SINRAPTOR, new SinraptorFossilModel(p_173662_.bakeLayer(ClientEvents.SINRAPTOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.IRRITATOR, new IrritatorFossilModel(p_173662_.bakeLayer(ClientEvents.IRRITATOR)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ZUPAYSAURUS, new ZupaysaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ZUPAYSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TEMNODONTOSAURUS, new TemnodontosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.TEMNODONTOSAURUS)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.URANOCENTRODON, new UranocentrodonFossilModel(p_173662_.bakeLayer(ClientEvents.URANOCENTRODON)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.OLOROTITAN, new OlorotitanFossilModel(p_173662_.bakeLayer(ClientEvents.OLOROTITAN)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.WENDICERATOPS, new WendiceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.WENDICERATOPS)));
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
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ZARAFASAURA, new ZarafasauraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ZARAFASAURA_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TANYSTROPHEUS, new TanystropheusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TANYSTROPHEUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.OURANOSAURUS, new OuranosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OURANOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PYROTHERIUM, new PyrotheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PYROTHERIUM_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MONOLOPHOSAURUS, new MonolophosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MONOLOPHOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.STELLASAURUS, new StellasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STELLASAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.COELODONTA, new CoelodontaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.COELODONTA_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ACHELOUSAURUS, new AchelousaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ACHELOUSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.KAMUYSAURUS, new KamuysaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KAMUYSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SHUNOSAURUS, new ShunosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SHUNOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MALAWISAURUS, new MalawisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MALAWISAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ETJOSUCHUS, new EtjosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ETJOSUCHUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PAN, new PanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PAN_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TAPINOCANINUS, new TapinocaninusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TAPINOCANINUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ERYTHROSUCHUS, new ErythrosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ERYTHROSUCHUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.CONCAVENATOR, new ConcavenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CONCAVENATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.KLAMELISAURUS, new KlamelisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KLAMELISAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.YUNNANOSAURUS, new YunnanosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YUNNANOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.THALATTOSUCHUS, new ThalattosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.THALATTOSUCHUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TUPANDACTYLUSIMPERATOR, new TupandactylusimperatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TUPANDACTYLUSIMPERATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TENONTOSAURUS, new TenontosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TENONTOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SINOMEGACEROSYABEI, new SinomegacerosyabeiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SINOMEGACEROSYABEI_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MEGARAPTOR, new MegaraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEGARAPTOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ALTIRHINUS, new AltirhinusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ALTIRHINUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ICHTHYOVENATOR, new IchthyovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ICHTHYOVENATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ASFALTOVENATOR, new AsfaltovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ASFALTOVENATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SUCHOMIMUS, new SuchomimusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SUCHOMIMUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.DAEODON, new DaeodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DAEODON_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.BAJADASAURUS, new BajadasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BAJADASAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SINOCERATOPS, new SinoceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SINOCERATOPS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PROBACTROSAURUS, new ProbactrosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PROBACTROSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SPICLYPEUS, new SpiclypeusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SPICLYPEUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.BRIGHTSTONEUS, new BrightstoneusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BRIGHTSTONEUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.EUHELOPUS, new EuhelopusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUHELOPUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.NEOVENATOR, new NeovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NEOVENATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TYRANNOTITAN, new TyrannotitanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TYRANNOTITAN_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.LUSKHAN, new LuskhanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LUSKHAN_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.DESMATOSUCHUS, new DesmatosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DESMATOSUCHUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SUZHOUSAURUS, new SuzhousaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SUZHOUSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MANTELLISAURUS, new MantellisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MANTELLISAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.CHASMOSAURUS, new ChasmosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CHASMOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.CENTROSAURUS, new CentrosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CENTROSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.LIOPLEURODON, new LiopleurodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LIOPLEURODON_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.LUSOVENATOR, new LusovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LUSOVENATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PHOLIDERPETON, new PholiderpetonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PHOLIDERPETON_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.EOCARCHARIA, new EocarchariaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EOCARCHARIA_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ANGULOMASTACATOR, new AngulomastacatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANGULOMASTACATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ELAPHROSAURUS, new ElaphrosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ELAPHROSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.MEGALOSAURUS, new MegalosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEGALOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.DAKOSAURUS, new DakosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DAKOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.GAIASIA, new GaiasiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GAIASIA_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TUOJIANGOSAURUS, new TuojiangosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TUOJIANGOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.BATRACHOTOMUS, new BatrachotomusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BATRACHOTOMUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.EURHINOSAURUS, new EurhinosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EURHINOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.RHOMALEOSAURUS, new RhomaleosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RHOMALEOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ESTEMMENOSUCHUSMIRABILIS, new EstemmenosuchusmirabilisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ESTEMMENOSUCHUSMIRABILIS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SPICOMELLUS, new SpicomellusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SPICOMELLUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PALAEOTHERIUM, new PalaeotheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PALAEOTHERIUM_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ODONTOPTERYX, new OdontopteryxFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ODONTOPTERYX_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.NOTHOSAURUS, new NothosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NOTHOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.OPHTHALMOTHULE, new OphthalmothuleFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OPHTHALMOTHULE_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.PROTEROSUCHUS, new ProterosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PROTEROSUCHUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.NANOTYRANNUS, new NanotyrannusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NANOTYRANNUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.SINRAPTOR, new SinraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SINRAPTOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.IRRITATOR, new IrritatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.IRRITATOR_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.ZUPAYSAURUS, new ZupaysaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ZUPAYSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.TEMNODONTOSAURUS, new TemnodontosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TEMNODONTOSAURUS_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.URANOCENTRODON, new UranocentrodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.URANOCENTRODON_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.OLOROTITAN, new OlorotitanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OLOROTITAN_FRAME)));
        builder.put(FossilSkeletonFifteenPieceBlock.Types.WENDICERATOPS, new WendiceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.WENDICERATOPS_FRAME)));
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
        FossilSkeletonFifteenPieceBlock.Type skullblock$type = ((FossilSkeletonFifteenPieceBlock) blocktate.getBlock()).getType();
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

    public static void renderFossilSkeleton(BlockState p_112534_, float p_173665_, float p_173666_, PoseStack pose, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
        pose.pushPose();
        FossilSkeletonFifteenPieceBlock.Type FossilSkeletonFifteenPieceBlock$type = ((FossilSkeletonFifteenPieceBlock) p_112534_.getBlock()).getType();
        pose.translate(0.5F, 1.0F, 0.5F);
        if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.WUERHOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BISONLATIFRONS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SMILOSUCHUS) {
            float scale = 0.7735F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.22F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CRYOLOPHOSAURUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.24F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DILOPHOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.45F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CERATOSAURUSDENTISULCATUS) {
            float scale = 0.87F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.35F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.YINGSHANOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.49F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PATAGOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.52F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.EOABELISAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CAMPTOSAURUS) {
            float scale = 0.77F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.2F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.KOOLASUCHUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.6F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SAUROPELTA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ABYSSOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MUTTABURRASAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DEINONYCHUS) {
            float scale = 0.6F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.18F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BRACHYTRACHELOPAN) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TETHYSHADROS) {
            float scale = 0.44F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.75F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.REGALICERATOPS) {
            float scale = 1.2F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.67F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.HUAXIAZHOULONG) {
            float scale = 1.43F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.8F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.VELOCIRAPTOR) {
            float scale = 0.46F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.7F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.KUBANOCHOERUS) {
            float scale = 0.89F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.38F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DECENNATHERIUM) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.51F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PLATECARPUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.51F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.OVIRAPTOR) {
            float scale = 0.56F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.3F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.RAJASAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ZARAFASAURA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TANYSTROPHEUS) {
            float scale = 0.457F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.67F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.OURANOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.48F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PYROTHERIUM) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MONOLOPHOSAURUS) {
            float scale = 0.9F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.37F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.STELLASAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.COELODONTA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ACHELOUSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.KAMUYSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SHUNOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.52F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MALAWISAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ETJOSUCHUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.48F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PAN) {
            float scale = 0.32F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.63F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TAPINOCANINUS) {
            float scale = 0.86F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.32F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ERYTHROSUCHUS) {
            float scale = 0.785F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.22F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CONCAVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.51F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.KLAMELISAURUS) {
            float scale = 0.76F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.25F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.YUNNANOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.THALATTOSUCHUS) {
            float scale = 0.5913F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TUPANDACTYLUSIMPERATOR) {
            float scale = 0.94F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -2F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TENONTOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.49F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SINOMEGACEROSYABEI) {
            float scale = 0.72F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.11F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MEGARAPTOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ALTIRHINUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ICHTHYOVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.35F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ASFALTOVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SUCHOMIMUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DAEODON) {
            float scale = 0.87F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.39F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BAJADASAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SINOCERATOPS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PROBACTROSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.43F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SPICLYPEUS) {
            float scale = 1.2F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.66F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BRIGHTSTONEUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.49F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.EUHELOPUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.NEOVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.51F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TYRANNOTITAN) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.51F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.LUSKHAN) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -1.35F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DESMATOSUCHUS) {
            float scale = 0.727F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.12F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SUZHOUSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MANTELLISAURUS) {
            float scale = 1.1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.6F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CHASMOSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.51F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.CENTROSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.49F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.LIOPLEURODON) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.52F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.LUSOVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PHOLIDERPETON) {
            float scale = 0.628F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.EOCARCHARIA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ANGULOMASTACATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ELAPHROSAURUS) {
            float scale = 0.89F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.36F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.MEGALOSAURUS) {
            float scale = 0.65F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.05F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.DAKOSAURUS) {
            float scale = 0.85F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.05F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.GAIASIA) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.3F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TUOJIANGOSAURUS) {
            float scale = 0.92F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.43F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.BATRACHOTOMUS) {
            float scale = 0.98F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.48F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.EURHINOSAURUS) {
            float scale = 0.88F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.8F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.RHOMALEOSAURUS) {
            float scale = 1.02F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.3F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ESTEMMENOSUCHUSMIRABILIS) {
            float scale = 0.58F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.24F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SPICOMELLUS) {
            float scale = 0.97F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.47F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PALAEOTHERIUM) {
            float scale = 0.77F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.2F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ODONTOPTERYX) {
            float scale = 0.29F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.2F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.NOTHOSAURUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.8F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.OPHTHALMOTHULE) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.8F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.PROTEROSUCHUS) {
            float scale = 0.51F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.45F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.NANOTYRANNUS) {
            float scale = 0.83F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.3F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.SINRAPTOR) {
            float scale = 0.82F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.28F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.IRRITATOR) {
            float scale = 0.75F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.17F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.ZUPAYSAURUS) {
            float scale = 0.52F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.43F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.TEMNODONTOSAURUS) {
            float scale = 1.09F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -1F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.URANOCENTRODON) {
            float scale = 0.68F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.02F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.OLOROTITAN) {
            float scale = 0.87F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.34F, 0F);
        } else if (FossilSkeletonFifteenPieceBlock$type == FossilSkeletonFifteenPieceBlock.Types.WENDICERATOPS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else {
            float scale = 1.0F;
            pose.scale(-scale, -scale, scale);
        }
        VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
        p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
        p_173670_.renderToBuffer(pose, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pose.popPose();
    }

    public static RenderType getSkeletonRenderType(FossilSkeletonFifteenPieceBlock.Type type, int fossilLevel) {
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
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ZARAFASAURA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zarafasaura/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TANYSTROPHEUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tanystropheus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.OURANOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ouranosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.PYROTHERIUM) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pyrotherium/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.MONOLOPHOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/monolophosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.STELLASAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stellasaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.COELODONTA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/coelodonta/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ACHELOUSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/achelousaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.KAMUYSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kamuysaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SHUNOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shunosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.MALAWISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/malawisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ETJOSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/etjosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.PAN) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pan/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TAPINOCANINUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tapinocaninus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ERYTHROSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/erythrosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.CONCAVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/concavenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.KLAMELISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/klamelisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.YUNNANOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yunnanosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.THALATTOSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thalattosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TUPANDACTYLUSIMPERATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusimperator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TENONTOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tenontosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SINOMEGACEROSYABEI) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinomegacerosyabei/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.MEGARAPTOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megaraptor/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ALTIRHINUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/altirhinus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ICHTHYOVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ASFALTOVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/asfaltovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SUCHOMIMUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suchomimus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.DAEODON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daeodon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.BAJADASAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bajadasaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SINOCERATOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinoceratops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.PROBACTROSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/probactrosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SPICLYPEUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spiclypeus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.BRIGHTSTONEUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brightstoneus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.EUHELOPUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/euhelopus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.NEOVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/neovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TYRANNOTITAN) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tyrannotitan/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.LUSKHAN) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/luskhan/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.DESMATOSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/desmatosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SUZHOUSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/suzhousaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.MANTELLISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mantellisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.CHASMOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chasmosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.CENTROSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/centrosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.LIOPLEURODON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/liopleurodon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.LUSOVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lusovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.PHOLIDERPETON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pholiderpeton/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.EOCARCHARIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eocarcharia/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ANGULOMASTACATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/angulomastacator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ELAPHROSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/elaphrosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.MEGALOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.DAKOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dakosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.GAIASIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gaiasia/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TUOJIANGOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tuojiangosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.BATRACHOTOMUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/batrachotomus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.EURHINOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eurhinosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.RHOMALEOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rhomaleosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ESTEMMENOSUCHUSMIRABILIS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/estemmenosuchusmirabilis/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SPICOMELLUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spicomellus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.PALAEOTHERIUM) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/palaeotherium/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ODONTOPTERYX) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/odontopteryx/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.NOTHOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nothosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.OPHTHALMOTHULE) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophthalmothule/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.PROTEROSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proterosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.NANOTYRANNUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nanotyrannus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.SINRAPTOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinraptor/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.IRRITATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/irritator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.ZUPAYSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zupaysaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.TEMNODONTOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/temnodontosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.URANOCENTRODON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/uranocentrodon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.OLOROTITAN) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/olorotitan/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonFifteenPieceBlock.Types.WENDICERATOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/wendiceratops/stage_" + fossilLevel + ".png");
        } else resourceLocation = SKIN_BY_TYPE.get(type);
        return RenderType.entityCutoutNoCullZOffset(resourceLocation);


    }

    public static RenderType getFrameRenderType(FossilSkeletonFifteenPieceBlock.Type p_112524_) {
        ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
        return RenderType.entityCutoutNoCullZOffset(resourcelocation);
    }

}
