package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.Deinotherium.DeinotheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.Deinotherium.DeinotheriumFossilModel;
import fossils.fossils.client.blockentity.model.acrocanthosaurus.AcrocanthosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.acrocanthosaurus.AcrocanthosaurusFossilModel;
import fossils.fossils.client.blockentity.model.allosaurus.AllosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.allosaurus.AllosaurusFossilModel;
import fossils.fossils.client.blockentity.model.amargasaurus.AmargasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.amargasaurus.AmargasaurusFossilModel;
import fossils.fossils.client.blockentity.model.ankylosaurus.AnkylosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ankylosaurus.AnkylosaurusFossilModel;
import fossils.fossils.client.blockentity.model.anteosaurus.AnteosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.anteosaurus.AnteosaurusFossilModel;
import fossils.fossils.client.blockentity.model.apatosaurus.ApatosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.apatosaurus.ApatosaurusFossilModel;
import fossils.fossils.client.blockentity.model.archelon.ArchelonFossilFrameModel;
import fossils.fossils.client.blockentity.model.archelon.ArchelonFossilModel;
import fossils.fossils.client.blockentity.model.aristonectes.AristonectesFossilFrameModel;
import fossils.fossils.client.blockentity.model.aristonectes.AristonectesFossilModel;
import fossils.fossils.client.blockentity.model.baryonyx.BaryonyxFossilFrameModel;
import fossils.fossils.client.blockentity.model.baryonyx.BaryonyxFossilModel;
import fossils.fossils.client.blockentity.model.basilosaurus.BasilosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.basilosaurus.BasilosaurusFossilModel;
import fossils.fossils.client.blockentity.model.brachiosaurus.BrachiosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.brachiosaurus.BrachiosaurusFossilModel;
import fossils.fossils.client.blockentity.model.camarasaurus.CamarasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.camarasaurus.CamarasaurusFossilModel;
import fossils.fossils.client.blockentity.model.carcharodontosaurus.CarcharodontosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.carcharodontosaurus.CarcharodontosaurusFossilModel;
import fossils.fossils.client.blockentity.model.ceratotherium.CeratotheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.ceratotherium.CeratotheriumFossilModel;
import fossils.fossils.client.blockentity.model.corythosauruscasuarius.CorythosauruscasuariusFossilFrameModel;
import fossils.fossils.client.blockentity.model.corythosauruscasuarius.CorythosauruscasuariusFossilModel;
import fossils.fossils.client.blockentity.model.cotylorhynchus.CotylorhynchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cotylorhynchus.CotylorhynchusFossilModel;
import fossils.fossils.client.blockentity.model.daspletosaurus.DaspletosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.daspletosaurus.DaspletosaurusFossilModel;
import fossils.fossils.client.blockentity.model.deinocheirus.DeinocheirusFossilFrameModel;
import fossils.fossils.client.blockentity.model.deinocheirus.DeinocheirusFossilModel;
import fossils.fossils.client.blockentity.model.dimetrodongrandis.DimetrodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.dimetrodongrandis.DimetrodonFossilModel;
import fossils.fossils.client.blockentity.model.diplodocus.DiplodocusFossilFrameModel;
import fossils.fossils.client.blockentity.model.diplodocus.DiplodocusFossilModel;
import fossils.fossils.client.blockentity.model.doedicurus.DoedicurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.doedicurus.DoedicurusFossilModel;
import fossils.fossils.client.blockentity.model.edmontosaurusannectens.EdmontosaurusannectensFossilFrameModel;
import fossils.fossils.client.blockentity.model.edmontosaurusannectens.EdmontosaurusannectensFossilModel;
import fossils.fossils.client.blockentity.model.eremotherium.EremotheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.eremotherium.EremotheriumFossilModel;
import fossils.fossils.client.blockentity.model.giraffatitan.GiraffatitanFossilFrameModel;
import fossils.fossils.client.blockentity.model.giraffatitan.GiraffatitanFossilModel;
import fossils.fossils.client.blockentity.model.hatzegopteryx.HatzegopteryxFossilFrameModel;
import fossils.fossils.client.blockentity.model.hatzegopteryx.HatzegopteryxFossilModel;
import fossils.fossils.client.blockentity.model.herrerasaurus.HerrerasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.herrerasaurus.HerrerasaurusFossilModel;
import fossils.fossils.client.blockentity.model.iguanodon.IguanodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.iguanodon.IguanodonFossilModel;
import fossils.fossils.client.blockentity.model.inostrancevia.InostranceviaFossilFrameModel;
import fossils.fossils.client.blockentity.model.inostrancevia.InostranceviaFossilModel;
import fossils.fossils.client.blockentity.model.jonkeria.JonkeriaFossilFrameModel;
import fossils.fossils.client.blockentity.model.jonkeria.JonkeriaFossilModel;
import fossils.fossils.client.blockentity.model.kamuysaurus.KamuysaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kamuysaurus.KamuysaurusFossilModel;
import fossils.fossils.client.blockentity.model.lessemsaurus.LessemsaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.lessemsaurus.LessemsaurusFossilModel;
import fossils.fossils.client.blockentity.model.lisowicia.LisowiciaFossilFrameModel;
import fossils.fossils.client.blockentity.model.lisowicia.LisowiciaFossilModel;
import fossils.fossils.client.blockentity.model.livyatan.LivyatanFossilFrameModel;
import fossils.fossils.client.blockentity.model.livyatan.LivyatanFossilModel;
import fossils.fossils.client.blockentity.model.mamenchisaurus.MamenchisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.mamenchisaurus.MamenchisaurusFossilModel;
import fossils.fossils.client.blockentity.model.mammuthuscolumbi.MammuthuscolumbiFossilFrameModel;
import fossils.fossils.client.blockentity.model.mammuthuscolumbi.MammuthuscolumbiFossilModel;
import fossils.fossils.client.blockentity.model.mastodonsaurus.MastodonsaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.mastodonsaurus.MastodonsaurusFossilModel;
import fossils.fossils.client.blockentity.model.megacerops.MegaceropsFossilFrameModel;
import fossils.fossils.client.blockentity.model.megacerops.MegaceropsFossilModel;
import fossils.fossils.client.blockentity.model.moschops.MoschopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.moschops.MoschopsFossilModel;
import fossils.fossils.client.blockentity.model.nigersaurus.NigersaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nigersaurus.NigersaurusFossilModel;
import fossils.fossils.client.blockentity.model.pachyrhinosauruscanadensis.PachyrhinosauruscanadensisFossilFrameModel;
import fossils.fossils.client.blockentity.model.pachyrhinosauruscanadensis.PachyrhinosauruscanadensisFossilModel;
import fossils.fossils.client.blockentity.model.pantheratigris.PantheratigrisFossilFrameModel;
import fossils.fossils.client.blockentity.model.pantheratigris.PantheratigrisFossilModel;
import fossils.fossils.client.blockentity.model.paraceratheriumtransouralicum.ParaceratheriumtransouralicumFossilFrameModel;
import fossils.fossils.client.blockentity.model.paraceratheriumtransouralicum.ParaceratheriumtransouralicumFossilModel;
import fossils.fossils.client.blockentity.model.parasaurolophuswalkeri.ParasaurolophuswalkeriFossilFrameModel;
import fossils.fossils.client.blockentity.model.parasaurolophuswalkeri.ParasaurolophuswalkeriFossilModel;
import fossils.fossils.client.blockentity.model.plateosaurus.PlateosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.plateosaurus.PlateosaurusFossilModel;
import fossils.fossils.client.blockentity.model.pliosaurus.PliosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pliosaurus.PliosaurusFossilModel;
import fossils.fossils.client.blockentity.model.prestosuchus.PrestosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.prestosuchus.PrestosuchusFossilModel;
import fossils.fossils.client.blockentity.model.prionosuchus.PrionosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.prionosuchus.PrionosuchusFossilModel;
import fossils.fossils.client.blockentity.model.pteranodonsternbergi.PteranodonsternbergiFossilFrameModel;
import fossils.fossils.client.blockentity.model.pteranodonsternbergi.PteranodonsternbergiFossilModel;
import fossils.fossils.client.blockentity.model.purussaurus.PurussaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.purussaurus.PurussaurusFossilModel;
import fossils.fossils.client.blockentity.model.sarcosuchus.SarcosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.sarcosuchus.SarcosuchusFossilModel;
import fossils.fossils.client.blockentity.model.scutosaurus.ScutosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.scutosaurus.ScutosaurusFossilModel;
import fossils.fossils.client.blockentity.model.shonisaurus.ShonisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.shonisaurus.ShonisaurusFossilModel;
import fossils.fossils.client.blockentity.model.sivatheriumgiganteum.SivatheriumgiganteumFossilFrameModel;
import fossils.fossils.client.blockentity.model.sivatheriumgiganteum.SivatheriumgiganteumFossilModel;
import fossils.fossils.client.blockentity.model.smilodon.SmilodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.smilodon.SmilodonFossilModel;
import fossils.fossils.client.blockentity.model.spinosaurus.SpinosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.spinosaurus.SpinosaurusFossilModel;
import fossils.fossils.client.blockentity.model.stegosaurus.StegosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.stegosaurus.StegosaurusFossilModel;
import fossils.fossils.client.blockentity.model.therizinosaurus.TherizinosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.therizinosaurus.TherizinosaurusFossilModel;
import fossils.fossils.client.blockentity.model.triceratopshorridus.TriceratopshorridusFossilFrameModel;
import fossils.fossils.client.blockentity.model.triceratopshorridus.TriceratopshorridusFossilModel;
import fossils.fossils.client.blockentity.model.tyrannosaurus.TyrannosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tyrannosaurus.TyrannosaurusFossilModel;
import fossils.fossils.client.blockentity.model.utahraptor.UtahraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.utahraptor.UtahraptorFossilModel;
import fossils.fossils.client.blockentity.model.varanuspriscus.VaranuspriscusFossilFrameModel;
import fossils.fossils.client.blockentity.model.varanuspriscus.VaranuspriscusFossilModel;
import fossils.fossils.client.blockentity.model.yangchuanosaurus.YangchuanosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yangchuanosaurus.YangchuanosaurusFossilModel;
import fossils.fossils.client.blockentity.model.yutyrannus.YutyrannusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yutyrannus.YutyrannusFossilModel;
import fossils.fossils.common.block.FossilSkeletonTwentyPieceBlock;
import fossils.fossils.common.entity.block.FossilSkeletonTwentyPieceBlockEntity;
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
public class FossilSkeletonTwentyPieceRenderer implements BlockEntityRenderer<FossilSkeletonTwentyPieceBlockEntity> {
	private final Map<FossilSkeletonTwentyPieceBlock.Type, SkullModelBase> skeletonModelByType;
	private final Map<FossilSkeletonTwentyPieceBlock.Type, SkullModelBase> frameModelByType;
	public static final Map<FossilSkeletonTwentyPieceBlock.Type, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/utahraptor/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shonisaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/apatosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brachiosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.IGUANODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/iguanodon/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.AMARGASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/amargasaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.NIGERSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigersaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SARCOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sarcosuchus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PLIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pliosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.HATZEGOPTERYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hatzegopteryx/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CARCHARODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/carcharodontosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.EDMONTOSAURUSANNECTENS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/edmontosaurusannectens/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.TYRANNOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tyrannosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SPINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spinosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MEGACEROPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megacerops/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.EREMOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eremotherium/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PANTHERATIGRIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pantheratigris/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.COTYLORHYNCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cotylorhynchus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ALLOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/allosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.LIVYATAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/livyatan/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.THERIZINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/therizinosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ARISTONECTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/aristonectes/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.STEGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stegosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PARASAUROLOPHUSWALKERI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/parasaurolophuswalkeri/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ARCHELON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/archelon/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DEINOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinotherium/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ANTEOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anteosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DOEDICURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/doedicurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PARACERATHERIUMTRANSOURALICUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/paraceratheriumtransouralicum/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PACHYRHINOSAURUSCANADENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pachyrhinosauruscanadensis/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ANKYLOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ankylosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SIVATHERIUMGIGANTEUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sivatheriumgiganteum/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.BARYONYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/baryonyx/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.YANGCHUANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yangchuanosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CERATOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ceratotherium/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SMILODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/smilodon/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DEINOCHEIRUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinocheirus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ACROCANTHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acrocanthosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.BASILOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/basilosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PTERANODONSTERNBERGI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pteranodonsternbergi/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.TRICERATOPSHORRIDUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/triceratopshorridus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MAMMUTHUSCOLUMBI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mammuthuscolumbi/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CAMARASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/camarasaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DIPLODOCUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplodocus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.YUTYRANNUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yutyrannus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MAMENCHISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mamenchisaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.LESSEMSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lessemsaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PURUSSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/purussaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.VARANUSPRISCUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/varanuspriscus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SCUTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scutosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DIMETRODONGRANDIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimetrodongrandis/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.INOSTRANCEVIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/inostrancevia/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MOSCHOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/moschops/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DASPLETOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daspletosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.GIRAFFATITAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/giraffatitan/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.HERRERASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/herrerasaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PLATEOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/plateosaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PRESTOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prestosuchus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.LISOWICIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lisowicia/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PRIONOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prionosuchus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.JONKERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jonkeria/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MASTODONSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mastodonsaurus/stage_0.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CORYTHOSAURUSCASUARIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/corythosauruscasuarius/stage_0.png"));
	});
	public static final Map<FossilSkeletonTwentyPieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
		type.put(FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/utahraptor/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shonisaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/apatosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brachiosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.IGUANODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/iguanodon/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.AMARGASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/amargasaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.NIGERSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigersaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SARCOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sarcosuchus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PLIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pliosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.HATZEGOPTERYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hatzegopteryx/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CARCHARODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/carcharodontosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.EDMONTOSAURUSANNECTENS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/edmontosaurusannectens/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.TYRANNOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tyrannosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SPINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spinosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MEGACEROPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megacerops/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.EREMOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eremotherium/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PANTHERATIGRIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pantheratigris/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.COTYLORHYNCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cotylorhynchus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ALLOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/allosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.LIVYATAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/livyatan/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.THERIZINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/therizinosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ARISTONECTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/aristonectes/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.STEGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stegosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PARASAUROLOPHUSWALKERI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/parasaurolophuswalkeri/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ARCHELON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/archelon/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DEINOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinotherium/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ANTEOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anteosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DOEDICURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/doedicurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PARACERATHERIUMTRANSOURALICUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/paraceratheriumtransouralicum/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PACHYRHINOSAURUSCANADENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pachyrhinosauruscanadensis/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ANKYLOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ankylosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SIVATHERIUMGIGANTEUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sivatheriumgiganteum/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.BARYONYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/baryonyx/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.YANGCHUANOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yangchuanosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CERATOTHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ceratotherium/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SMILODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/smilodon/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DEINOCHEIRUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinocheirus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.ACROCANTHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acrocanthosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.BASILOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/basilosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PTERANODONSTERNBERGI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pteranodonsternbergi/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.TRICERATOPSHORRIDUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/triceratopshorridus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MAMMUTHUSCOLUMBI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mammuthuscolumbi/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CAMARASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/camarasaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DIPLODOCUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplodocus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.YUTYRANNUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yutyrannus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MAMENCHISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mamenchisaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.LESSEMSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lessemsaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PURUSSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/purussaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.VARANUSPRISCUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/varanuspriscus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.SCUTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scutosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DIMETRODONGRANDIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimetrodongrandis/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.INOSTRANCEVIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/inostrancevia/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MOSCHOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/moschops/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.DASPLETOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daspletosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.GIRAFFATITAN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/giraffatitan/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.HERRERASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/herrerasaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PLATEOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/plateosaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PRESTOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prestosuchus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.LISOWICIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lisowicia/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.PRIONOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prionosuchus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.JONKERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jonkeria/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.MASTODONSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mastodonsaurus/frame.png"));
		type.put(FossilSkeletonTwentyPieceBlock.Types.CORYTHOSAURUSCASUARIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/corythosauruscasuarius/frame.png"));

	});
	public static Map<FossilSkeletonTwentyPieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonTwentyPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR, new UtahraptorFossilModel(p_173662_.bakeLayer(ClientEvents.UTAHRAPTOR)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS, new ShonisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SHONISAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS, new ApatosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.APATOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS, new BrachiosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.BRACHIOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.IGUANODON, new IguanodonFossilModel(p_173662_.bakeLayer(ClientEvents.IGUANODON)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.AMARGASAURUS, new AmargasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.AMARGASAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.NIGERSAURUS, new NigersaurusFossilModel(p_173662_.bakeLayer(ClientEvents.NIGERSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SARCOSUCHUS, new SarcosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.SARCOSUCHUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PLIOSAURUS, new PliosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PLIOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.HATZEGOPTERYX, new HatzegopteryxFossilModel(p_173662_.bakeLayer(ClientEvents.HATZEGOPTERYX)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CARCHARODONTOSAURUS, new CarcharodontosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CARCHARODONTOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.EDMONTOSAURUSANNECTENS, new EdmontosaurusannectensFossilModel(p_173662_.bakeLayer(ClientEvents.EDMONTOSAURUSANNECTENS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.TYRANNOSAURUS, new TyrannosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.TYRANNOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SPINOSAURUS, new SpinosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SPINOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MEGACEROPS, new MegaceropsFossilModel(p_173662_.bakeLayer(ClientEvents.MEGACEROPS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.EREMOTHERIUM, new EremotheriumFossilModel(p_173662_.bakeLayer(ClientEvents.EREMOTHERIUM)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PANTHERATIGRIS, new PantheratigrisFossilModel(p_173662_.bakeLayer(ClientEvents.PANTHERATIGRIS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.COTYLORHYNCHUS, new CotylorhynchusFossilModel(p_173662_.bakeLayer(ClientEvents.COTYLORHYNCHUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ALLOSAURUS, new AllosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ALLOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.LIVYATAN, new LivyatanFossilModel(p_173662_.bakeLayer(ClientEvents.LIVYATAN)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.THERIZINOSAURUS, new TherizinosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.THERIZINOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ARISTONECTES, new AristonectesFossilModel(p_173662_.bakeLayer(ClientEvents.ARISTONECTES)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.STEGOSAURUS, new StegosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.STEGOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PARASAUROLOPHUSWALKERI, new ParasaurolophuswalkeriFossilModel(p_173662_.bakeLayer(ClientEvents.PARASAUROLOPHUSWALKERI)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ARCHELON, new ArchelonFossilModel(p_173662_.bakeLayer(ClientEvents.ARCHELON)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DEINOTHERIUM, new DeinotheriumFossilModel(p_173662_.bakeLayer(ClientEvents.DEINOTHERIUM)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ANTEOSAURUS, new AnteosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ANTEOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DOEDICURUS, new DoedicurusFossilModel(p_173662_.bakeLayer(ClientEvents.DOEDICURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PARACERATHERIUMTRANSOURALICUM, new ParaceratheriumtransouralicumFossilModel(p_173662_.bakeLayer(ClientEvents.PARACERATHERIUMTRANSOURALICUM)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PACHYRHINOSAURUSCANADENSIS, new PachyrhinosauruscanadensisFossilModel(p_173662_.bakeLayer(ClientEvents.PACHYRHINOSAURUSCANADENSIS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ANKYLOSAURUS, new AnkylosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ANKYLOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SIVATHERIUMGIGANTEUM, new SivatheriumgiganteumFossilModel(p_173662_.bakeLayer(ClientEvents.SIVATHERIUMGIGANTEUM)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.BARYONYX, new BaryonyxFossilModel(p_173662_.bakeLayer(ClientEvents.BARYONYX)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.YANGCHUANOSAURUS, new YangchuanosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.YANGCHUANOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CERATOTHERIUM, new CeratotheriumFossilModel(p_173662_.bakeLayer(ClientEvents.CERATOTHERIUM)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SMILODON, new SmilodonFossilModel(p_173662_.bakeLayer(ClientEvents.SMILODON)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DEINOCHEIRUS, new DeinocheirusFossilModel(p_173662_.bakeLayer(ClientEvents.DEINOCHEIRUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ACROCANTHOSAURUS, new AcrocanthosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ACROCANTHOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.BASILOSAURUS, new BasilosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.BASILOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PTERANODONSTERNBERGI, new PteranodonsternbergiFossilModel(p_173662_.bakeLayer(ClientEvents.PTERANODONSTERNBERGI)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.TRICERATOPSHORRIDUS, new TriceratopshorridusFossilModel(p_173662_.bakeLayer(ClientEvents.TRICERATOPSHORRIDUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MAMMUTHUSCOLUMBI, new MammuthuscolumbiFossilModel(p_173662_.bakeLayer(ClientEvents.MAMMUTHUSCOLUMBI)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CAMARASAURUS, new CamarasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CAMARASAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DIPLODOCUS, new DiplodocusFossilModel(p_173662_.bakeLayer(ClientEvents.DIPLODOCUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.YUTYRANNUS, new YutyrannusFossilModel(p_173662_.bakeLayer(ClientEvents.YUTYRANNUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MAMENCHISAURUS, new MamenchisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MAMENCHISAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.LESSEMSAURUS, new LessemsaurusFossilModel(p_173662_.bakeLayer(ClientEvents.LESSEMSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PURUSSAURUS, new PurussaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PURUSSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.VARANUSPRISCUS, new VaranuspriscusFossilModel(p_173662_.bakeLayer(ClientEvents.VARANUSPRISCUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SCUTOSAURUS, new ScutosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SCUTOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DIMETRODONGRANDIS, new DimetrodonFossilModel(p_173662_.bakeLayer(ClientEvents.DIMETRODONGRANDIS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.INOSTRANCEVIA, new InostranceviaFossilModel(p_173662_.bakeLayer(ClientEvents.INOSTRANCEVIA)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MOSCHOPS, new MoschopsFossilModel(p_173662_.bakeLayer(ClientEvents.MOSCHOPS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DASPLETOSAURUS, new DaspletosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DASPLETOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.GIRAFFATITAN, new GiraffatitanFossilModel(p_173662_.bakeLayer(ClientEvents.GIRAFFATITAN)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.HERRERASAURUS, new HerrerasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.HERRERASAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PLATEOSAURUS, new PlateosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PLATEOSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PRESTOSUCHUS, new PrestosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.PRESTOSUCHUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.LISOWICIA, new LisowiciaFossilModel(p_173662_.bakeLayer(ClientEvents.LISOWICIA)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PRIONOSUCHUS, new PrionosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.PRIONOSUCHUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.JONKERIA, new JonkeriaFossilModel(p_173662_.bakeLayer(ClientEvents.JONKERIA)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MASTODONSAURUS, new MastodonsaurusFossilModel(p_173662_.bakeLayer(ClientEvents.MASTODONSAURUS)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CORYTHOSAURUSCASUARIUS, new CorythosauruscasuariusFossilModel(p_173662_.bakeLayer(ClientEvents.CORYTHOSAURUSCASUARIUS)));
		return builder.build();
	}

	public static Map<FossilSkeletonTwentyPieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
		ImmutableMap.Builder<FossilSkeletonTwentyPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
		builder.put(FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR, new UtahraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.UTAHRAPTOR_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS, new ShonisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SHONISAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS, new ApatosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.APATOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS, new BrachiosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BRACHIOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.IGUANODON, new IguanodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.IGUANODON_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.AMARGASAURUS, new AmargasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.AMARGASAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.NIGERSAURUS, new NigersaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NIGERSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SARCOSUCHUS, new SarcosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SARCOSUCHUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PLIOSAURUS, new PliosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLIOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.HATZEGOPTERYX, new HatzegopteryxFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HATZEGOPTERYX_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CARCHARODONTOSAURUS, new CarcharodontosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CARCHARODONTOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.EDMONTOSAURUSANNECTENS, new EdmontosaurusannectensFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EDMONTOSAURUSANNECTENS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.TYRANNOSAURUS, new TyrannosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TYRANNOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SPINOSAURUS, new SpinosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SPINOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MEGACEROPS, new MegaceropsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEGACEROPS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.EREMOTHERIUM, new EremotheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EREMOTHERIUM_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PANTHERATIGRIS, new PantheratigrisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PANTHERATIGRIS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.COTYLORHYNCHUS, new CotylorhynchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.COTYLORHYNCHUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ALLOSAURUS, new AllosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ALLOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.LIVYATAN, new LivyatanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LIVYATAN_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.THERIZINOSAURUS, new TherizinosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.THERIZINOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ARISTONECTES, new AristonectesFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ARISTONECTES_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.STEGOSAURUS, new StegosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STEGOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PARASAUROLOPHUSWALKERI, new ParasaurolophuswalkeriFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PARASAUROLOPHUSWALKERI_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ARCHELON, new ArchelonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ARCHELON_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DEINOTHERIUM, new DeinotheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DEINOTHERIUM_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ANTEOSAURUS, new AnteosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANTEOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DOEDICURUS, new DoedicurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DOEDICURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PARACERATHERIUMTRANSOURALICUM, new ParaceratheriumtransouralicumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PARACERATHERIUMTRANSOURALICUM_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PACHYRHINOSAURUSCANADENSIS, new PachyrhinosauruscanadensisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PACHYRHINOSAURUSCANADENSIS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ANKYLOSAURUS, new AnkylosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANKYLOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SIVATHERIUMGIGANTEUM, new SivatheriumgiganteumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SIVATHERIUMGIGANTEUM_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.BARYONYX, new BaryonyxFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BARYONYX_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.YANGCHUANOSAURUS, new YangchuanosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YANGCHUANOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CERATOTHERIUM, new CeratotheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CERATOTHERIUM_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SMILODON, new SmilodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SMILODON_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DEINOCHEIRUS, new DeinocheirusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DEINOCHEIRUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.ACROCANTHOSAURUS, new AcrocanthosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ACROCANTHOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.BASILOSAURUS, new BasilosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BASILOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PTERANODONSTERNBERGI, new PteranodonsternbergiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PTERANODONSTERNBERGI_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.TRICERATOPSHORRIDUS, new TriceratopshorridusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TRICERATOPSHORRIDUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MAMMUTHUSCOLUMBI, new MammuthuscolumbiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MAMMUTHUSCOLUMBI_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CAMARASAURUS, new CamarasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CAMARASAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DIPLODOCUS, new DiplodocusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIPLODOCUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.YUTYRANNUS, new YutyrannusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YUTYRANNUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MAMENCHISAURUS, new MamenchisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MAMENCHISAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.LESSEMSAURUS, new LessemsaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LESSEMSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PURUSSAURUS, new PurussaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PURUSSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.VARANUSPRISCUS, new VaranuspriscusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.VARANUSPRISCUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.SCUTOSAURUS, new ScutosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SCUTOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DIMETRODONGRANDIS, new DimetrodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIMETRODONGRANDIS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.INOSTRANCEVIA, new InostranceviaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.INOSTRANCEVIA_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MOSCHOPS, new MoschopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MOSCHOPS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.DASPLETOSAURUS, new DaspletosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DASPLETOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.GIRAFFATITAN, new GiraffatitanFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GIRAFFATITAN_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.HERRERASAURUS, new HerrerasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HERRERASAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PLATEOSAURUS, new PlateosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLATEOSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PRESTOSUCHUS, new PrestosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PRESTOSUCHUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.LISOWICIA, new LisowiciaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LISOWICIA_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.PRIONOSUCHUS, new PrionosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PRIONOSUCHUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.JONKERIA, new JonkeriaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.JONKERIA_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.MASTODONSAURUS, new MastodonsaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MASTODONSAURUS_FRAME)));
		builder.put(FossilSkeletonTwentyPieceBlock.Types.CORYTHOSAURUSCASUARIUS, new CorythosauruscasuariusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CORYTHOSAURUSCASUARIUS_FRAME)));
		return builder.build();
	}

	public FossilSkeletonTwentyPieceRenderer(BlockEntityRendererProvider.Context p_173660_) {
		this.skeletonModelByType = createFossilRenderers(p_173660_.getModelSet());
		this.frameModelByType = createFossilFrameRenderers(p_173660_.getModelSet());
	}

	public void render(FossilSkeletonTwentyPieceBlockEntity p_112534_, float p_112535_, PoseStack p_112536_, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
		float f = 0;
		BlockState blocktate = p_112534_.getBlockState();
		int i = blocktate.getValue(FossilSkeletonTwentyPieceBlock.ROTATION);
		float f1 = RotationSegment.convertToDegrees(i);
		FossilSkeletonTwentyPieceBlock.Type skullblock$type = ((FossilSkeletonTwentyPieceBlock)blocktate.getBlock()).getType();
		SkullModelBase skullmodelbase = this.skeletonModelByType.get(skullblock$type);
		SkullModelBase frameBase = this.frameModelByType.get(skullblock$type);
		int fossilLevel = blocktate.getValue(FossilSkeletonTwentyPieceBlock.FOSSIL_LEVEL);
		RenderType rendertype = getSkeletonRenderType(skullblock$type, fossilLevel);
		RenderType frameRendertype = getFrameRenderType(skullblock$type);
		if (blocktate.getValue(FossilSkeletonTwentyPieceBlock.FRAME)) {
			renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, frameBase, frameRendertype);
		}
		renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, skullmodelbase, rendertype);
	}

	public static void renderFossilSkeleton(BlockState p_112534_, float p_173665_, float p_173666_, PoseStack p_173667_, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
		p_173667_.pushPose();
		FossilSkeletonTwentyPieceBlock.Type FossilSkeletonTwentyPieceBlock$type = ((FossilSkeletonTwentyPieceBlock)p_112534_.getBlock()).getType();
		p_173667_.translate(0.5F, 1.0F, 0.5F);
		if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS) {
			p_173667_.scale(-1.24F, -1.24F, 1.24F);
			p_173667_.translate(0F, -2.F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.52F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS) {
			p_173667_.scale(-0.85F, -0.85F, 0.85F);
			p_173667_.translate(0F, -0.3F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.IGUANODON) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.55F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.AMARGASAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.49F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.NIGERSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.52F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.SARCOSUCHUS) {
			p_173667_.scale(-0.94F, -0.94F, 0.94F);
			p_173667_.translate(0F, -0.43F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PLIOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -1F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.HATZEGOPTERYX) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.CARCHARODONTOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.EDMONTOSAURUSANNECTENS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.TYRANNOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.52F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.SPINOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.MEGACEROPS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.EREMOTHERIUM) {
			p_173667_.scale(-0.89F, -0.89F, 0.89F);
			p_173667_.translate(0F, -0.4F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PANTHERATIGRIS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.4F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.COTYLORHYNCHUS) {
			p_173667_.scale(-1.041F, -1.041F, 1.041F);
			p_173667_.translate(0F, -0.56F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.ALLOSAURUS) {
			p_173667_.scale(-0.9F, -0.9F, 0.9F);
			p_173667_.translate(0F, -0.38F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.LIVYATAN) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -2F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.THERIZINOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.47F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.ARISTONECTES) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -2F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.STEGOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.48F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PARASAUROLOPHUSWALKERI) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.ARCHELON) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -2.1F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.DEINOTHERIUM) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.ANTEOSAURUS) {
			p_173667_.scale(-0.86F, -0.86F, 0.86F);
			p_173667_.translate(0F, -0.35F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.DOEDICURUS) {
			p_173667_.scale(-0.82F, -0.82F, 0.82F);
			p_173667_.translate(0F, -0.27F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PARACERATHERIUMTRANSOURALICUM) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PACHYRHINOSAURUSCANADENSIS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.ANKYLOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.SIVATHERIUMGIGANTEUM) {
			p_173667_.scale(-0.76F, -0.76F, 0.76F);
			p_173667_.translate(0F, -0.16F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.BARYONYX) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.YANGCHUANOSAURUS) {
			p_173667_.scale(-0.9F, -0.9F, 0.9F);
			p_173667_.translate(0F, -0.45F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.CERATOTHERIUM) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.48F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.SMILODON) {
			p_173667_.scale(-0.64F, -0.64F, 0.64F);
			p_173667_.translate(0F, 0.05F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.DEINOCHEIRUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.ACROCANTHOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.53F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.BASILOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -3F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PTERANODONSTERNBERGI) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.53F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.TRICERATOPSHORRIDUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.48F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.MAMMUTHUSCOLUMBI) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.CAMARASAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.48F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.DIPLODOCUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.45F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.YUTYRANNUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.51F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.MAMENCHISAURUS) {
			p_173667_.scale(-1.15F, -1.15F, 1.15F);
			p_173667_.translate(0F, -0.62F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.LESSEMSAURUS) {
			p_173667_.scale(-0.89F, -0.89F, 0.89F);
			p_173667_.translate(0F, -0.38F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PURUSSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.48F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.VARANUSPRISCUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.SCUTOSAURUS) {
			p_173667_.scale(-0.96F, -0.96F, 0.96F);
			p_173667_.translate(0F, -0.45F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.DIMETRODONGRANDIS) {
			p_173667_.scale(-0.8F, -0.8F, 0.8F);
			p_173667_.translate(0F, -0.23F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.INOSTRANCEVIA) {
			p_173667_.scale(-0.775F, -0.775F, 0.775F);
			p_173667_.translate(0F, -0.2F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.MOSCHOPS) {
			p_173667_.scale(-0.9F, -0.9F, 0.9F);
			p_173667_.translate(0F, -0.38F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.DASPLETOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.4F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.GIRAFFATITAN) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.4F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.HERRERASAURUS) {
			p_173667_.scale(-0.65F, -0.65F, 0.65F);
			p_173667_.translate(0F, 0.03F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PLATEOSAURUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PRESTOSUCHUS) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.53F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.LISOWICIA) {
			p_173667_.scale(-1F, -1F, 1F);
			p_173667_.translate(0F, -0.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.PRIONOSUCHUS) {
			p_173667_.scale(-0.83F, -0.83F, 0.83F);
			p_173667_.translate(0F, -1.5F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.JONKERIA) {
			p_173667_.scale(-1.01F, -1.01F, 1.01F);
			p_173667_.translate(0F, -0.52F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.MASTODONSAURUS) {
			p_173667_.scale(-1.04F, -1.04F, 1.04F);
			p_173667_.translate(0F, -0.53F, 0F);
		} else if (FossilSkeletonTwentyPieceBlock$type == FossilSkeletonTwentyPieceBlock.Types.CORYTHOSAURUSCASUARIUS) {
			p_173667_.scale(-0.87F, -0.87F, 0.87F);
			p_173667_.translate(0F, -0.3F, 0F);
		} else p_173667_.scale(-1.0F, -1.0F, 1.0F);
		VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
		p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
		p_173670_.renderToBuffer(p_173667_, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		p_173667_.popPose();
	}

	public static RenderType getSkeletonRenderType(FossilSkeletonTwentyPieceBlock.Type type , int fossilLevel) {
		ResourceLocation resourceLocation;
		if (type == FossilSkeletonTwentyPieceBlock.Types.UTAHRAPTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/utahraptor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.SHONISAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shonisaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.APATOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/apatosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.BRACHIOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/brachiosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.IGUANODON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/iguanodon/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.AMARGASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/amargasaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.NIGERSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigersaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.SARCOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sarcosuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.PLIOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pliosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.HATZEGOPTERYX) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hatzegopteryx/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.CARCHARODONTOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/carcharodontosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.EDMONTOSAURUSANNECTENS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/edmontosaurusannectens/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.TYRANNOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tyrannosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.SPINOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spinosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.MEGACEROPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megacerops/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.EREMOTHERIUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eremotherium/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.PANTHERATIGRIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pantheratigris/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.COTYLORHYNCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cotylorhynchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.ALLOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/allosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.LIVYATAN) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/livyatan/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.THERIZINOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/therizinosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.ARISTONECTES) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/aristonectes/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.STEGOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stegosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.PARASAUROLOPHUSWALKERI) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/parasaurolophuswalkeri/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.ARCHELON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/archelon/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.DEINOTHERIUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinotherium/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.ANTEOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anteosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.DOEDICURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/doedicurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.PARACERATHERIUMTRANSOURALICUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/paraceratheriumtransouralicum/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.PACHYRHINOSAURUSCANADENSIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pachyrhinosauruscanadensis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.ANKYLOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ankylosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.SIVATHERIUMGIGANTEUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sivatheriumgiganteum/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.BARYONYX) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/baryonyx/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.YANGCHUANOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yangchuanosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.CERATOTHERIUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ceratotherium/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.SMILODON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/smilodon/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.DEINOCHEIRUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deinocheirus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.ACROCANTHOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acrocanthosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.BASILOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/basilosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.PTERANODONSTERNBERGI) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pteranodonsternbergi/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.TRICERATOPSHORRIDUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/triceratopshorridus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.MAMMUTHUSCOLUMBI) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mammuthuscolumbi/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.CAMARASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/camarasaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.DIPLODOCUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplodocus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonTwentyPieceBlock.Types.YUTYRANNUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yutyrannus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.MAMENCHISAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mamenchisaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.LESSEMSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lessemsaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.PURUSSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/purussaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.VARANUSPRISCUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/varanuspriscus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.SCUTOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scutosaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.DIMETRODONGRANDIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimetrodongrandis/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.INOSTRANCEVIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/inostrancevia/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.MOSCHOPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/moschops/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.DASPLETOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daspletosaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.GIRAFFATITAN) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/giraffatitan/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.HERRERASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/herrerasaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.PLATEOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/plateosaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.PRESTOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prestosuchus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.LISOWICIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lisowicia/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.PRIONOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prionosuchus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.JONKERIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jonkeria/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.MASTODONSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mastodonsaurus/stage_" + fossilLevel + ".png");
		}  else if (type == FossilSkeletonTwentyPieceBlock.Types.CORYTHOSAURUSCASUARIUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/corythosauruscasuarius/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonTwentyPieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
