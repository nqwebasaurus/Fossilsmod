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
import fossils.fossils.client.blockentity.model.acanthostomatops.AcanthostomatopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.acanthostomatops.AcanthostomatopsFossilModel;
import fossils.fossils.client.blockentity.model.anatosuchus.AnatosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.anatosuchus.AnatosuchusFossilModel;
import fossils.fossils.client.blockentity.model.anurognathus.AnurognathusFossilFrameModel;
import fossils.fossils.client.blockentity.model.anurognathus.AnurognathusFossilModel;
import fossils.fossils.client.blockentity.model.aquilops.AquilopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.aquilops.AquilopsFossilModel;
import fossils.fossils.client.blockentity.model.austriadactylus.AustriadactylusFossilFrameModel;
import fossils.fossils.client.blockentity.model.austriadactylus.AustriadactylusFossilModel;
import fossils.fossils.client.blockentity.model.bannykus.BannykusFossilFrameModel;
import fossils.fossils.client.blockentity.model.bannykus.BannykusFossilModel;
import fossils.fossils.client.blockentity.model.beelzebufo.BeelzebufoFossilFrameModel;
import fossils.fossils.client.blockentity.model.beelzebufo.BeelzebufoFossilModel;
import fossils.fossils.client.blockentity.model.berthasaura.BerthasauraFossilFrameModel;
import fossils.fossils.client.blockentity.model.berthasaura.BerthasauraFossilModel;
import fossils.fossils.client.blockentity.model.bothriolepis.BothriolepisFossilFrameModel;
import fossils.fossils.client.blockentity.model.bothriolepis.BothriolepisFossilModel;
import fossils.fossils.client.blockentity.model.buitreraptor.BuitreraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.buitreraptor.BuitreraptorFossilModel;
import fossils.fossils.client.blockentity.model.caiuajara.CaiuajaraFossilFrameModel;
import fossils.fossils.client.blockentity.model.caiuajara.CaiuajaraFossilModel;
import fossils.fossils.client.blockentity.model.callawayia.CallawayiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.callawayia.CallawayiaFossilModel;
import fossils.fossils.client.blockentity.model.cartorhynchus.CartorhynchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cartorhynchus.CartorhynchusFossilModel;
import fossils.fossils.client.blockentity.model.chaoyangopterus.ChaoyangopterusFossilFrameModel;
import fossils.fossils.client.blockentity.model.chaoyangopterus.ChaoyangopterusFossilModel;
import fossils.fossils.client.blockentity.model.columba.ColumbaFossilFrameModel;
import fossils.fossils.client.blockentity.model.columba.ColumbaFossilModel;
import fossils.fossils.client.blockentity.model.compsognathus.CompsognathusFossilFrameModel;
import fossils.fossils.client.blockentity.model.compsognathus.CompsognathusFossilModel;
import fossils.fossils.client.blockentity.model.convolosaurus.ConvolosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.convolosaurus.ConvolosaurusFossilModel;
import fossils.fossils.client.blockentity.model.dallasaurus.DallasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dallasaurus.DallasaurusFossilModel;
import fossils.fossils.client.blockentity.model.dasyceps.DasycepsFossilFrameModel;
import fossils.fossils.client.blockentity.model.dasyceps.DasycepsFossilModel;
import fossils.fossils.client.blockentity.model.diademodon.DiademodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.diademodon.DiademodonFossilModel;
import fossils.fossils.client.blockentity.model.dimorphodon.DimorphodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.dimorphodon.DimorphodonFossilModel;
import fossils.fossils.client.blockentity.model.diplocaulusmagnicornis.DiplocaulusmagnicornisFossilFrameModel;
import fossils.fossils.client.blockentity.model.diplocaulusmagnicornis.DiplocaulusmagnicornisFossilModel;
import fossils.fossils.client.blockentity.model.diplocaulusminimus.DiplocaulusminimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.diplocaulusminimus.DiplocaulusminimusFossilModel;
import fossils.fossils.client.blockentity.model.diploceraspis.DiploceraspisFossilFrameModel;
import fossils.fossils.client.blockentity.model.diploceraspis.DiploceraspisFossilModel;
import fossils.fossils.client.blockentity.model.dracoraptor.DracoraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.dracoraptor.DracoraptorFossilModel;
import fossils.fossils.client.blockentity.model.drepanosaurus.DrepanosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.drepanosaurus.DrepanosaurusFossilModel;
import fossils.fossils.client.blockentity.model.effigia.EffigiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.effigia.EffigiaFossilModel;
import fossils.fossils.client.blockentity.model.elginia.ElginiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.elginia.ElginiaFossilModel;
import fossils.fossils.client.blockentity.model.eocursor.EocursorFossilFrameModel;
import fossils.fossils.client.blockentity.model.eocursor.EocursorFossilModel;
import fossils.fossils.client.blockentity.model.eretmorhipis.EretmorhipisFossilFrameModel;
import fossils.fossils.client.blockentity.model.eretmorhipis.EretmorhipisFossilModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilModel;
import fossils.fossils.client.blockentity.model.europejara.EuropejaraFossilFrameModel;
import fossils.fossils.client.blockentity.model.europejara.EuropejaraFossilModel;
import fossils.fossils.client.blockentity.model.geikiaelginensis.GeikiaelginensisFossilFrameModel;
import fossils.fossils.client.blockentity.model.geikiaelginensis.GeikiaelginensisFossilModel;
import fossils.fossils.client.blockentity.model.halszkaraptor.HalszkaraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.halszkaraptor.HalszkaraptorFossilModel;
import fossils.fossils.client.blockentity.model.henodus.HenodusFossilFrameModel;
import fossils.fossils.client.blockentity.model.henodus.HenodusFossilModel;
import fossils.fossils.client.blockentity.model.hescheleria.HescheleriaFossilFrameModel;
import fossils.fossils.client.blockentity.model.hescheleria.HescheleriaFossilModel;
import fossils.fossils.client.blockentity.model.homunculus.HomunculusFossilFrameModel;
import fossils.fossils.client.blockentity.model.homunculus.HomunculusFossilModel;
import fossils.fossils.client.blockentity.model.hypuronector.HypuronectorFossilFrameModel;
import fossils.fossils.client.blockentity.model.hypuronector.HypuronectorFossilModel;
import fossils.fossils.client.blockentity.model.ikrandraco.IkrandracoFossilFrameModel;
import fossils.fossils.client.blockentity.model.ikrandraco.IkrandracoFossilModel;
import fossils.fossils.client.blockentity.model.incisivosaurus.IncisivosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.incisivosaurus.IncisivosaurusFossilModel;
import fossils.fossils.client.blockentity.model.jakapil.JakapilFossilFrameModel;
import fossils.fossils.client.blockentity.model.jakapil.JakapilFossilModel;
import fossils.fossils.client.blockentity.model.jianchangnathus.JianchangnathusFossilFrameModel;
import fossils.fossils.client.blockentity.model.jianchangnathus.JianchangnathusFossilModel;
import fossils.fossils.client.blockentity.model.kayentatherium.KayentatheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.kayentatherium.KayentatheriumFossilModel;
import fossils.fossils.client.blockentity.model.kranosaura.KranosauraFossilFrameModel;
import fossils.fossils.client.blockentity.model.kranosaura.KranosauraFossilModel;
import fossils.fossils.client.blockentity.model.lagosuchus.LagosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.lagosuchus.LagosuchusFossilModel;
import fossils.fossils.client.blockentity.model.leptictidium.LeptictidiumFossilFrameModel;
import fossils.fossils.client.blockentity.model.leptictidium.LeptictidiumFossilModel;
import fossils.fossils.client.blockentity.model.lesothosaurus.LesothosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.lesothosaurus.LesothosaurusFossilModel;
import fossils.fossils.client.blockentity.model.litargosuchus.LitargosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.litargosuchus.LitargosuchusFossilModel;
import fossils.fossils.client.blockentity.model.manidens.ManidensFossilFrameModel;
import fossils.fossils.client.blockentity.model.manidens.ManidensFossilModel;
import fossils.fossils.client.blockentity.model.megalancosaurus.MegalancosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.megalancosaurus.MegalancosaurusFossilModel;
import fossils.fossils.client.blockentity.model.megalibgwilia.MegalibgwiliaFossilFrameModel;
import fossils.fossils.client.blockentity.model.megalibgwilia.MegalibgwiliaFossilModel;
import fossils.fossils.client.blockentity.model.mei.MeiFossilFrameModel;
import fossils.fossils.client.blockentity.model.mei.MeiFossilModel;
import fossils.fossils.client.blockentity.model.meilifeilong.MeilifeilongFossilFrameModel;
import fossils.fossils.client.blockentity.model.meilifeilong.MeilifeilongFossilModel;
import fossils.fossils.client.blockentity.model.parmastega.ParmastegaFossilFrameModel;
import fossils.fossils.client.blockentity.model.parmastega.ParmastegaFossilModel;
import fossils.fossils.client.blockentity.model.psittacosauruslujiatunensis.PsittacosauruslujiatunensisFossilFrameModel;
import fossils.fossils.client.blockentity.model.psittacosauruslujiatunensis.PsittacosauruslujiatunensisFossilModel;
import fossils.fossils.client.blockentity.model.psittacosaurusmongoliensis.PsittacosaurusmongoliensisFossilFrameModel;
import fossils.fossils.client.blockentity.model.psittacosaurusmongoliensis.PsittacosaurusmongoliensisFossilModel;
import fossils.fossils.client.blockentity.model.sordes.SordesFossilFrameModel;
import fossils.fossils.client.blockentity.model.sordes.SordesFossilModel;
import fossils.fossils.client.blockentity.model.menoceras.MenocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.menoceras.MenocerasFossilModel;
import fossils.fossils.client.blockentity.model.nqwebasaurus.NqwebasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nqwebasaurus.NqwebasaurusFossilModel;
import fossils.fossils.client.blockentity.model.oksoko.OksokoFossilFrameModel;
import fossils.fossils.client.blockentity.model.oksoko.OksokoFossilModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilModel;
import fossils.fossils.client.blockentity.model.platyhystrix.PlatyhystrixFossilFrameModel;
import fossils.fossils.client.blockentity.model.platyhystrix.PlatyhystrixFossilModel;
import fossils.fossils.client.blockentity.model.protoceras.ProtocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.protoceras.ProtocerasFossilModel;
import fossils.fossils.client.blockentity.model.pterodactylus.PterodactylusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pterodactylus.PterodactylusFossilModel;
import fossils.fossils.client.blockentity.model.riojasuchus.RiojasuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.riojasuchus.RiojasuchusFossilModel;
import fossils.fossils.client.blockentity.model.shuvuuia.ShuvuuiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.shuvuuia.ShuvuuiaFossilModel;
import fossils.fossils.client.blockentity.model.silesaurus.SilesaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.silesaurus.SilesaurusFossilModel;
import fossils.fossils.client.blockentity.model.stegouros.StegourosFossilFrameModel;
import fossils.fossils.client.blockentity.model.stegouros.StegourosFossilModel;
import fossils.fossils.client.blockentity.model.stenokranio.StenokranioFossilFrameModel;
import fossils.fossils.client.blockentity.model.stenokranio.StenokranioFossilModel;
import fossils.fossils.client.blockentity.model.suminia.SuminiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.suminia.SuminiaFossilModel;
import fossils.fossils.client.blockentity.model.sylviornis.SylviornisFossilFrameModel;
import fossils.fossils.client.blockentity.model.sylviornis.SylviornisFossilModel;
import fossils.fossils.client.blockentity.model.tapejara.TapejaraFossilFrameModel;
import fossils.fossils.client.blockentity.model.tapejara.TapejaraFossilModel;
import fossils.fossils.client.blockentity.model.teraterpeton.TeraterpetonFossilFrameModel;
import fossils.fossils.client.blockentity.model.teraterpeton.TeraterpetonFossilModel;
import fossils.fossils.client.blockentity.model.tiktaalik.TiktaalikFossilFrameModel;
import fossils.fossils.client.blockentity.model.tiktaalik.TiktaalikFossilModel;
import fossils.fossils.client.blockentity.model.tockus.TockusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tockus.TockusFossilModel;
import fossils.fossils.client.blockentity.model.torukjara.TorukjaraFossilFrameModel;
import fossils.fossils.client.blockentity.model.torukjara.TorukjaraFossilModel;
import fossils.fossils.client.blockentity.model.yuanyanglong.YuanyanglongFossilFrameModel;
import fossils.fossils.client.blockentity.model.yuanyanglong.YuanyanglongFossilModel;
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
		type.put(FossilSkeletonFivePieceBlock.Types.AQUILOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/aquilops/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BANNYKUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bannykus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.YUANYANGLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yuanyanglong/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mei/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ANATOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anatosuchus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.NQWEBASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nqwebasaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SHUVUUIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shuvuuia/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SILESAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/silesaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BUITRERAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/buitreraptor/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SYLVIORNIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sylviornis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ANUROGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anurognathus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.COMPSOGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/compsognathus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.OKSOKO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oksoko/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.COLUMBA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/columba/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIMORPHODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimorphodon/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PTERODACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pterodactylus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BOTHRIOLEPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bothriolepis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PLATYHYSTRIX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/platyhystrix/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.JAKAPIL, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jakapil/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HALSZKARAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/halszkaraptor/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MENOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/menoceras/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SORDES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sordes/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HOMUNCULUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/homunculus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMINIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplocaulusminimus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HESCHELERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hescheleria/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ERETMORHIPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eretmorhipis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIADEMODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diademodon/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.KAYENTATHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kayentatherium/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEGALIBGWILIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalibgwilia/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LEPTICTIDIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leptictidium/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PARMASTEGA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/parmastega/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TORUKJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/torukjara/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CONVOLOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/convolosaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.EOCURSOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eocursor/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.AUSTRIADACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/austriadactylus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.JIANCHANGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jianchangnathus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.STEGOUROS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stegouros/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LESOTHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lesothosaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSMONGOLIENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosaurusmongoliensis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DRACORAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dracoraptor/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TERATERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/teraterpeton/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.INCISIVOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/incisivosaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LITARGOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/litargosuchus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DALLASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dallasaurus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.GEIKIAELGINENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/geikiaelginensis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.IKRANDRACO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ikrandraco/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LAGOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lagosuchus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.EFFIGIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/effigia/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BERTHASAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/berthasaura/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSLUJIATUNENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosauruslujiatunensis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CHAOYANGOPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chaoyangopterus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CAIUAJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/caiuajara/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CALLAWAYIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/callawayia/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TAPEJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tapejara/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TOCKUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tockus/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ELGINIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/elginia/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.EUROPEJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europejara/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.KRANOSAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kranosaura/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIPLOCERASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diploceraspis/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTOMATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acanthostomatops/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HYPURONECTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypuronector/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEILIFEILONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/meilifeilong/stage_0.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CARTORHYNCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cartorhynchus/stage_0.png"));
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
		type.put(FossilSkeletonFivePieceBlock.Types.AQUILOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/aquilops/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BANNYKUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bannykus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.YUANYANGLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yuanyanglong/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mei/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ANATOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anatosuchus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.NQWEBASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nqwebasaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SHUVUUIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shuvuuia/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SILESAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/silesaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BUITRERAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/buitreraptor/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SYLVIORNIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sylviornis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ANUROGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anurognathus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.COMPSOGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/compsognathus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.OKSOKO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oksoko/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.COLUMBA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/columba/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIMORPHODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimorphodon/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PTERODACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pterodactylus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BOTHRIOLEPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bothriolepis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PLATYHYSTRIX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/platyhystrix/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.JAKAPIL, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jakapil/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HALSZKARAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/halszkaraptor/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MENOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/menoceras/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.SORDES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sordes/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HOMUNCULUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/homunculus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMINIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplocaulusminimus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HESCHELERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hescheleria/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ERETMORHIPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eretmorhipis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIADEMODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diademodon/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.KAYENTATHERIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kayentatherium/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEGALIBGWILIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalibgwilia/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LEPTICTIDIUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leptictidium/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PARMASTEGA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/parmastega/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TORUKJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/torukjara/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CONVOLOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/convolosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.EOCURSOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eocursor/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.AUSTRIADACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/austriadactylus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.JIANCHANGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jianchangnathus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.STEGOUROS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stegouros/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LESOTHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lesothosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSMONGOLIENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosaurusmongoliensis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DRACORAPTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dracoraptor/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TERATERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/teraterpeton/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.INCISIVOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/incisivosaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LITARGOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/litargosuchus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DALLASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dallasaurus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.GEIKIAELGINENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/geikiaelginensis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.IKRANDRACO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ikrandraco/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.LAGOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lagosuchus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.EFFIGIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/effigia/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BERTHASAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/berthasaura/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSLUJIATUNENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosauruslujiatunensis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.BEELZEBUFO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/beelzebufo/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CHAOYANGOPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chaoyangopterus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CAIUAJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/caiuajara/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CALLAWAYIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/callawayia/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TAPEJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tapejara/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.TOCKUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tockus/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ELGINIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/elginia/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.EUROPEJARA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europejara/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.KRANOSAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kranosaura/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.DIPLOCERASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diploceraspis/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTOMATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acanthostomatops/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.HYPURONECTOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypuronector/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.MEILIFEILONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/meilifeilong/frame.png"));
		type.put(FossilSkeletonFivePieceBlock.Types.CARTORHYNCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cartorhynchus/frame.png"));
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
		builder.put(FossilSkeletonFivePieceBlock.Types.AQUILOPS, new AquilopsFossilModel(p_173662_.bakeLayer(ClientEvents.AQUILOPS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BANNYKUS, new BannykusFossilModel(p_173662_.bakeLayer(ClientEvents.BANNYKUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.YUANYANGLONG, new YuanyanglongFossilModel(p_173662_.bakeLayer(ClientEvents.YUANYANGLONG)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEI, new MeiFossilModel(p_173662_.bakeLayer(ClientEvents.MEI)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ANATOSUCHUS, new AnatosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.ANATOSUCHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.NQWEBASAURUS, new NqwebasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.NQWEBASAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SHUVUUIA, new ShuvuuiaFossilModel(p_173662_.bakeLayer(ClientEvents.SHUVUUIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SILESAURUS, new SilesaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SILESAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BUITRERAPTOR, new BuitreraptorFossilModel(p_173662_.bakeLayer(ClientEvents.BUITRERAPTOR)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SYLVIORNIS, new SylviornisFossilModel(p_173662_.bakeLayer(ClientEvents.SYLVIORNIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ANUROGNATHUS, new AnurognathusFossilModel(p_173662_.bakeLayer(ClientEvents.ANUROGNATHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.COMPSOGNATHUS, new CompsognathusFossilModel(p_173662_.bakeLayer(ClientEvents.COMPSOGNATHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.OKSOKO, new OksokoFossilModel(p_173662_.bakeLayer(ClientEvents.OKSOKO)));
		builder.put(FossilSkeletonFivePieceBlock.Types.COLUMBA, new ColumbaFossilModel(p_173662_.bakeLayer(ClientEvents.COLUMBA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIMORPHODON, new DimorphodonFossilModel(p_173662_.bakeLayer(ClientEvents.DIMORPHODON)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PTERODACTYLUS, new PterodactylusFossilModel(p_173662_.bakeLayer(ClientEvents.PTERODACTYLUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BOTHRIOLEPIS, new BothriolepisFossilModel(p_173662_.bakeLayer(ClientEvents.BOTHRIOLEPIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PLATYHYSTRIX, new PlatyhystrixFossilModel(p_173662_.bakeLayer(ClientEvents.PLATYHYSTRIX)));
		builder.put(FossilSkeletonFivePieceBlock.Types.JAKAPIL, new JakapilFossilModel(p_173662_.bakeLayer(ClientEvents.JAKAPIL)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HALSZKARAPTOR, new HalszkaraptorFossilModel(p_173662_.bakeLayer(ClientEvents.HALSZKARAPTOR)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MENOCERAS, new MenocerasFossilModel(p_173662_.bakeLayer(ClientEvents.MENOCERAS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SORDES, new SordesFossilModel(p_173662_.bakeLayer(ClientEvents.SORDES)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HOMUNCULUS, new HomunculusFossilModel(p_173662_.bakeLayer(ClientEvents.HOMUNCULUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMINIMUS, new DiplocaulusminimusFossilModel(p_173662_.bakeLayer(ClientEvents.DIPLOCAULUSMINIMUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HESCHELERIA, new HescheleriaFossilModel(p_173662_.bakeLayer(ClientEvents.HESCHELERIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ERETMORHIPIS, new EretmorhipisFossilModel(p_173662_.bakeLayer(ClientEvents.ERETMORHIPIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIADEMODON, new DiademodonFossilModel(p_173662_.bakeLayer(ClientEvents.DIADEMODON)));
		builder.put(FossilSkeletonFivePieceBlock.Types.KAYENTATHERIUM, new KayentatheriumFossilModel(p_173662_.bakeLayer(ClientEvents.KAYENTATHERIUM)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEGALIBGWILIA, new MegalibgwiliaFossilModel(p_173662_.bakeLayer(ClientEvents.MEGALIBGWILIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LEPTICTIDIUM, new LeptictidiumFossilModel(p_173662_.bakeLayer(ClientEvents.LEPTICTIDIUM)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PARMASTEGA, new ParmastegaFossilModel(p_173662_.bakeLayer(ClientEvents.PARMASTEGA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TORUKJARA, new TorukjaraFossilModel(p_173662_.bakeLayer(ClientEvents.TORUKJARA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CONVOLOSAURUS, new ConvolosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CONVOLOSAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EOCURSOR, new EocursorFossilModel(p_173662_.bakeLayer(ClientEvents.EOCURSOR)));
		builder.put(FossilSkeletonFivePieceBlock.Types.AUSTRIADACTYLUS, new AustriadactylusFossilModel(p_173662_.bakeLayer(ClientEvents.AUSTRIADACTYLUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.JIANCHANGNATHUS, new JianchangnathusFossilModel(p_173662_.bakeLayer(ClientEvents.JIANCHANGNATHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.STEGOUROS, new StegourosFossilModel(p_173662_.bakeLayer(ClientEvents.STEGOUROS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LESOTHOSAURUS, new LesothosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.LESOTHOSAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSMONGOLIENSIS, new PsittacosaurusmongoliensisFossilModel(p_173662_.bakeLayer(ClientEvents.PSITTACOSAURUSMONGOLIENSIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DRACORAPTOR, new DracoraptorFossilModel(p_173662_.bakeLayer(ClientEvents.DRACORAPTOR)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TERATERPETON, new TeraterpetonFossilModel(p_173662_.bakeLayer(ClientEvents.TERATERPETON)));
		builder.put(FossilSkeletonFivePieceBlock.Types.INCISIVOSAURUS, new IncisivosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.INCISIVOSAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LITARGOSUCHUS, new LitargosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.LITARGOSUCHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DALLASAURUS, new DallasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DALLASAURUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.GEIKIAELGINENSIS, new GeikiaelginensisFossilModel(p_173662_.bakeLayer(ClientEvents.GEIKIAELGINENSIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.IKRANDRACO, new IkrandracoFossilModel(p_173662_.bakeLayer(ClientEvents.IKRANDRACO)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LAGOSUCHUS, new LagosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.LAGOSUCHUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EFFIGIA, new EffigiaFossilModel(p_173662_.bakeLayer(ClientEvents.EFFIGIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BERTHASAURA, new BerthasauraFossilModel(p_173662_.bakeLayer(ClientEvents.BERTHASAURA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSLUJIATUNENSIS, new PsittacosauruslujiatunensisFossilModel(p_173662_.bakeLayer(ClientEvents.PSITTACOSAURUSLUJIATUNENSIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BEELZEBUFO, new BeelzebufoFossilModel(p_173662_.bakeLayer(ClientEvents.BEELZEBUFO)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CHAOYANGOPTERUS, new ChaoyangopterusFossilModel(p_173662_.bakeLayer(ClientEvents.CHAOYANGOPTERUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CAIUAJARA, new CaiuajaraFossilModel(p_173662_.bakeLayer(ClientEvents.CAIUAJARA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CALLAWAYIA, new CallawayiaFossilModel(p_173662_.bakeLayer(ClientEvents.CALLAWAYIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TAPEJARA, new TapejaraFossilModel(p_173662_.bakeLayer(ClientEvents.TAPEJARA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TOCKUS, new TockusFossilModel(p_173662_.bakeLayer(ClientEvents.TOCKUS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ELGINIA, new ElginiaFossilModel(p_173662_.bakeLayer(ClientEvents.ELGINIA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EUROPEJARA, new EuropejaraFossilModel(p_173662_.bakeLayer(ClientEvents.EUROPEJARA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.KRANOSAURA, new KranosauraFossilModel(p_173662_.bakeLayer(ClientEvents.KRANOSAURA)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIPLOCERASPIS, new DiploceraspisFossilModel(p_173662_.bakeLayer(ClientEvents.DIPLOCERASPIS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTOMATOPS, new AcanthostomatopsFossilModel(p_173662_.bakeLayer(ClientEvents.ACANTHOSTOMATOPS)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HYPURONECTOR, new HypuronectorFossilModel(p_173662_.bakeLayer(ClientEvents.HYPURONECTOR)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEILIFEILONG, new MeilifeilongFossilModel(p_173662_.bakeLayer(ClientEvents.MEILIFEILONG)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CARTORHYNCHUS, new CartorhynchusFossilModel(p_173662_.bakeLayer(ClientEvents.CARTORHYNCHUS)));
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
		builder.put(FossilSkeletonFivePieceBlock.Types.AQUILOPS, new AquilopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.AQUILOPS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BANNYKUS, new BannykusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BANNYKUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.YUANYANGLONG, new YuanyanglongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YUANYANGLONG_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEI, new MeiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEI_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ANATOSUCHUS, new AnatosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANATOSUCHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.NQWEBASAURUS, new NqwebasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NQWEBASAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SHUVUUIA, new ShuvuuiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SHUVUUIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SILESAURUS, new SilesaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SILESAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BUITRERAPTOR, new BuitreraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BUITRERAPTOR_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SYLVIORNIS, new SylviornisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SYLVIORNIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ANUROGNATHUS, new AnurognathusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANUROGNATHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.COMPSOGNATHUS, new CompsognathusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.COMPSOGNATHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.OKSOKO, new OksokoFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OKSOKO_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.COLUMBA, new ColumbaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.COLUMBA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIMORPHODON, new DimorphodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIMORPHODON_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PTERODACTYLUS, new PterodactylusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PTERODACTYLUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BOTHRIOLEPIS, new BothriolepisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BOTHRIOLEPIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PLATYHYSTRIX, new PlatyhystrixFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLATYHYSTRIX_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.JAKAPIL, new JakapilFossilFrameModel(p_173662_.bakeLayer(ClientEvents.JAKAPIL_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HALSZKARAPTOR, new HalszkaraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HALSZKARAPTOR_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MENOCERAS, new MenocerasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MENOCERAS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.SORDES, new SordesFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SORDES_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HOMUNCULUS, new HomunculusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HOMUNCULUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMINIMUS, new DiplocaulusminimusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIPLOCAULUSMINIMUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HESCHELERIA, new HescheleriaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HESCHELERIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ERETMORHIPIS, new EretmorhipisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ERETMORHIPIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIADEMODON, new DiademodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIADEMODON_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.KAYENTATHERIUM, new KayentatheriumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KAYENTATHERIUM_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEGALIBGWILIA, new MegalibgwiliaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEGALIBGWILIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LEPTICTIDIUM, new LeptictidiumFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LEPTICTIDIUM_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PARMASTEGA, new ParmastegaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PARMASTEGA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TORUKJARA, new TorukjaraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TORUKJARA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CONVOLOSAURUS, new ConvolosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CONVOLOSAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EOCURSOR, new EocursorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EOCURSOR_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.AUSTRIADACTYLUS, new AustriadactylusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.AUSTRIADACTYLUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.JIANCHANGNATHUS, new JianchangnathusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.JIANCHANGNATHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.STEGOUROS, new StegourosFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STEGOUROS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LESOTHOSAURUS, new LesothosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LESOTHOSAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSMONGOLIENSIS, new PsittacosaurusmongoliensisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PSITTACOSAURUSMONGOLIENSIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DRACORAPTOR, new DracoraptorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DRACORAPTOR_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TERATERPETON, new TeraterpetonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TERATERPETON_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.INCISIVOSAURUS, new IncisivosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.INCISIVOSAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LITARGOSUCHUS, new LitargosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LITARGOSUCHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DALLASAURUS, new DallasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DALLASAURUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.GEIKIAELGINENSIS, new GeikiaelginensisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GEIKIAELGINENSIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.IKRANDRACO, new IkrandracoFossilFrameModel(p_173662_.bakeLayer(ClientEvents.IKRANDRACO_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.LAGOSUCHUS, new LagosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LAGOSUCHUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EFFIGIA, new EffigiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EFFIGIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BERTHASAURA, new BerthasauraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BERTHASAURA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSLUJIATUNENSIS, new PsittacosauruslujiatunensisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PSITTACOSAURUSLUJIATUNENSIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.BEELZEBUFO, new BeelzebufoFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BEELZEBUFO_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CHAOYANGOPTERUS, new ChaoyangopterusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CHAOYANGOPTERUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CAIUAJARA, new CaiuajaraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CAIUAJARA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CALLAWAYIA, new CallawayiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CALLAWAYIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TAPEJARA, new TapejaraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TAPEJARA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.TOCKUS, new TockusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TOCKUS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ELGINIA, new ElginiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ELGINIA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.EUROPEJARA, new EuropejaraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUROPEJARA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.KRANOSAURA, new KranosauraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KRANOSAURA_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.DIPLOCERASPIS, new DiploceraspisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIPLOCERASPIS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.ACANTHOSTOMATOPS, new AcanthostomatopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ACANTHOSTOMATOPS_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.HYPURONECTOR, new HypuronectorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HYPURONECTOR_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.MEILIFEILONG, new MeilifeilongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEILIFEILONG_FRAME)));
		builder.put(FossilSkeletonFivePieceBlock.Types.CARTORHYNCHUS, new CartorhynchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CARTORHYNCHUS_FRAME)));
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
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.AQUILOPS) {
			p_173667_.scale(-0.26F, -0.26F, 0.26F);
			p_173667_.translate(0F, 2.35F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.BANNYKUS) {
			p_173667_.scale(-0.627F, -0.627F, 0.627F);
			p_173667_.translate(0F, 0.09F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.YUANYANGLONG) {
			p_173667_.scale(-0.34F, -0.34F, 0.34F);
			p_173667_.translate(0F, 1.47F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.MEI) {
			p_173667_.scale(-0.34F, -0.34F, 0.34F);
			p_173667_.translate(0F, 1.47F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.ANATOSUCHUS) {
			p_173667_.scale(-0.27F, -0.27F, 0.27F);
			p_173667_.translate(0F, 2.2F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.NQWEBASAURUS) {
			p_173667_.scale(-0.28F, -0.28F, 0.28F);
			p_173667_.translate(0F, 2.1F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.SHUVUUIA) {
			p_173667_.scale(-0.32F, -0.32F, 0.32F);
			p_173667_.translate(0F, 1.63F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.SILESAURUS) {
			p_173667_.scale(-0.45F, -0.45F, 0.45F);
			p_173667_.translate(0F, 0.73F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.BUITRERAPTOR) {
			p_173667_.scale(-0.4F, -0.4F, 0.4F);
			p_173667_.translate(0F, 1F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.SYLVIORNIS) {
			p_173667_.scale(-0.32F, -0.32F, 0.32F);
			p_173667_.translate(0F, 1.6F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.ANUROGNATHUS) {
			p_173667_.scale(-0.14F, -0.14F, 0.14F);
			p_173667_.translate(0F, 1.6F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.COMPSOGNATHUS) {
			p_173667_.scale(-0.35F, -0.35F, 0.35F);
			p_173667_.translate(0F, 1.36F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.OKSOKO) {
			p_173667_.scale(-0.54F, -0.54F, 0.54F);
			p_173667_.translate(0F, 0.35F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.COLUMBA) {
			p_173667_.scale(-0.2F, -0.2F, 0.2F);
			p_173667_.translate(0F, 3.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DIMORPHODON) {
			p_173667_.scale(-0.305F, -0.305F, 0.305F);
			p_173667_.translate(0F, 1.78F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PTERODACTYLUS) {
			p_173667_.scale(-0.35F, -0.35F, 0.35F);
			p_173667_.translate(0F, 1.35F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.BOTHRIOLEPIS) {
			p_173667_.scale(-0.4F, -0.4F, 0.4F);
			p_173667_.translate(0F, 0.98F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PLATYHYSTRIX) {
			p_173667_.scale(-0.5F, -0.5F, 0.5F);
			p_173667_.translate(0F, 0.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.JAKAPIL) {
			p_173667_.scale(-0.48F, -0.48F, 0.48F);
			p_173667_.translate(0F, 0.6F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.HALSZKARAPTOR) {
			p_173667_.scale(-0.24F, -0.24F, 0.24F);
			p_173667_.translate(0F, 2.67F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.MENOCERAS) {
			p_173667_.scale(-0.48F, -0.48F, 0.48F);
			p_173667_.translate(0F, 0.6F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.SORDES) {
			p_173667_.scale(-0.14F, -0.14F, 0.14F);
			p_173667_.translate(0F, 1.9F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.HOMUNCULUS) {
			p_173667_.scale(-0.13F, -0.13F, 0.13F);
			p_173667_.translate(0F, 6.15F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMINIMUS) {
			p_173667_.scale(-0.12F, -0.12F, 0.12F);
			p_173667_.translate(0F, 6.15F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.HESCHELERIA) {
			p_173667_.scale(-0.17F, -0.17F, 0.17F);
			p_173667_.translate(0F, 4F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.ERETMORHIPIS) {
			p_173667_.scale(-0.215F, -0.215F, 0.215F);
			p_173667_.translate(0F, 1F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DIADEMODON) {
			p_173667_.scale(-0.4F, -0.4F, 0.4F);
			p_173667_.translate(0F, 1F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.KAYENTATHERIUM) {
			p_173667_.scale(-0.75F, -0.75F, 0.75F);
			p_173667_.translate(0F, -0.16F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.MEGALIBGWILIA) {
			p_173667_.scale(-0.2F, -0.2F, 0.2F);
			p_173667_.translate(0F, 3.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.LEPTICTIDIUM) {
			p_173667_.scale(-0.31F, -0.31F, 0.31F);
			p_173667_.translate(0F, 1.75F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PARMASTEGA) {
			p_173667_.scale(-0.355F, -0.355F, 0.355F);
			p_173667_.translate(0F, 1.3F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.TORUKJARA) {
			p_173667_.scale(-0.61F, -0.61F, 0.61F);
			p_173667_.translate(0F, 0.16F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.CONVOLOSAURUS) {
			p_173667_.scale(-0.72F, -0.72F, 0.72F);
			p_173667_.translate(0F, -0.1F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.EOCURSOR) {
			p_173667_.scale(-0.25F, -0.25F, 0.25F);
			p_173667_.translate(0F, 2.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.AUSTRIADACTYLUS) {
			p_173667_.scale(-0.195F, -0.195F, 0.195F);
			p_173667_.translate(0F, 2.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.JIANCHANGNATHUS) {
			p_173667_.scale(-0.24F, -0.24F, 0.24F);
			p_173667_.translate(0F, 2.67F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.STEGOUROS) {
			p_173667_.scale(-0.64F, -0.64F, 0.64F);
			p_173667_.translate(0F, 0.08F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.LESOTHOSAURUS) {
			p_173667_.scale(-0.45F, -0.45F, 0.45F);
			p_173667_.translate(0F, 0.7F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSMONGOLIENSIS) {
			p_173667_.scale(-0.4F, -0.4F, 0.4F);
			p_173667_.translate(0F, 1.F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DRACORAPTOR) {
			p_173667_.scale(-0.45F, -0.45F, 0.45F);
			p_173667_.translate(0F, 0.72F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.TERATERPETON) {
			p_173667_.scale(-0.5686F, -0.5686F, 0.5686F);
			p_173667_.translate(0F, 0.26F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.INCISIVOSAURUS) {
			p_173667_.scale(-0.34F, -0.34F, 0.34F);
			p_173667_.translate(0F, 1.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.LITARGOSUCHUS) {
			p_173667_.scale(-0.28F, -0.28F, 0.28F);
			p_173667_.translate(0F, 2.08F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DALLASAURUS) {
			p_173667_.scale(-0.24F, -0.24F, 0.24F);
			p_173667_.translate(0F, 2.08F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.GEIKIAELGINENSIS) {
			p_173667_.scale(-0.2F, -0.2F, 0.2F);
			p_173667_.translate(0F, 3.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.IKRANDRACO) {
			p_173667_.scale(-0.36F, -0.36F, 0.36F);
			p_173667_.translate(0F, 0F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.LAGOSUCHUS) {
			p_173667_.scale(-0.145F, -0.145F, 0.145F);
			p_173667_.translate(0F, 5.45F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.EFFIGIA) {
			p_173667_.scale(-0.355F, -0.355F, 0.355F);
			p_173667_.translate(0F, 1.33F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.BERTHASAURA) {
			p_173667_.scale(-0.48F, -0.48F, 0.48F);
			p_173667_.translate(0F, 0.6F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSLUJIATUNENSIS) {
			p_173667_.scale(-0.4F, -0.4F, 0.4F);
			p_173667_.translate(0F, 1.F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.BEELZEBUFO) {
			p_173667_.scale(-0.089F, -0.089F, 0.089F);
			p_173667_.translate(0F, 9.75F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.CHAOYANGOPTERUS) {
			p_173667_.scale(-0.44F, -0.44F, 0.44F);
			p_173667_.translate(0F, 0.8F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.CAIUAJARA) {
			p_173667_.scale(-0.61F, -0.61F, 0.61F);
			p_173667_.translate(0F, -0.2F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.CALLAWAYIA) {
			p_173667_.scale(-0.6F, -0.6F, 0.6F);
			p_173667_.translate(0F, -0.25F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.TAPEJARA) {
			p_173667_.scale(-0.32F, -0.32F, 0.32F);
			p_173667_.translate(0F, 1.63F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.TOCKUS) {
			p_173667_.scale(-0.2F, -0.2F, 0.2F);
			p_173667_.translate(0F, 3.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.ELGINIA) {
			p_173667_.scale(-0.2F, -0.2F, 0.2F);
			p_173667_.translate(0F, 3.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.EUROPEJARA) {
			p_173667_.scale(-0.32F, -0.32F, 0.32F);
			p_173667_.translate(0F, 0F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.KRANOSAURA) {
			p_173667_.scale(-0.17F, -0.17F, 0.17F);
			p_173667_.translate(0F, 4.4F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.DIPLOCERASPIS) {
			p_173667_.scale(-0.175F, -0.175F, 0.175F);
			p_173667_.translate(0F, 2F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.ACANTHOSTOMATOPS) {
			p_173667_.scale(-0.283F, -0.283F, 0.283F);
			p_173667_.translate(0F, 2.02F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.HYPURONECTOR) {
			p_173667_.scale(-0.1F, -0.1F, 0.1F);
			p_173667_.translate(0F, 8.5F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.MEILIFEILONG) {
			p_173667_.scale(-0.48F, -0.48F, 0.48F);
			p_173667_.translate(0F, 0.58F, 0F);
		} else if (FossilSkeletonFivePieceBlock$type == FossilSkeletonFivePieceBlock.Types.CARTORHYNCHUS) {
			p_173667_.scale(-0.125F, -0.125F, 0.125F);
			p_173667_.translate(0F, 6.5F, 0F);
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
		} else if (type == FossilSkeletonFivePieceBlock.Types.AQUILOPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/aquilops/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.BANNYKUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bannykus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.YUANYANGLONG) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yuanyanglong/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.MEI) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mei/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.ANATOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anatosuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.NQWEBASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nqwebasaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.SHUVUUIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shuvuuia/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.SILESAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/silesaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.BUITRERAPTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/buitreraptor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.SYLVIORNIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sylviornis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.ANUROGNATHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anurognathus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.COMPSOGNATHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/compsognathus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.OKSOKO) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oksoko/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.COLUMBA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/columba/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DIMORPHODON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dimorphodon/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PTERODACTYLUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pterodactylus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.BOTHRIOLEPIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bothriolepis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PLATYHYSTRIX) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/platyhystrix/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.JAKAPIL) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jakapil/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.HALSZKARAPTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/halszkaraptor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.MENOCERAS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/menoceras/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.SORDES) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sordes/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.HOMUNCULUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/homunculus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DIPLOCAULUSMINIMUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diplocaulusminimus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.HESCHELERIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hescheleria/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.ERETMORHIPIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eretmorhipis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DIADEMODON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diademodon/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.KAYENTATHERIUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kayentatherium/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.MEGALIBGWILIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalibgwilia/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.LEPTICTIDIUM) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leptictidium/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PARMASTEGA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/parmastega/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.TORUKJARA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/torukjara/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.CONVOLOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/convolosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.EOCURSOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eocursor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.AUSTRIADACTYLUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/austriadactylus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.JIANCHANGNATHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jianchangnathus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.STEGOUROS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stegouros/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.LESOTHOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lesothosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSMONGOLIENSIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosaurusmongoliensis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.TERATERPETON) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/teraterpeton/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DRACORAPTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dracoraptor/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.INCISIVOSAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/incisivosaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.LITARGOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/litargosuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DALLASAURUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dallasaurus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.GEIKIAELGINENSIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/geikiaelginensis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.IKRANDRACO) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ikrandraco/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.LAGOSUCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lagosuchus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.EFFIGIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/effigia/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.BERTHASAURA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/berthasaura/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.PSITTACOSAURUSLUJIATUNENSIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosauruslujiatunensis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.BEELZEBUFO) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/beelzebufo/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.CHAOYANGOPTERUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chaoyangopterus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.CAIUAJARA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/caiuajara/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.CALLAWAYIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/callawayia/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.TAPEJARA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tapejara/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.TOCKUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tockus/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.ELGINIA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/elginia/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.EUROPEJARA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europejara/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.KRANOSAURA) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kranosaura/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.DIPLOCERASPIS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diploceraspis/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.ACANTHOSTOMATOPS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/acanthostomatops/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.HYPURONECTOR) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypuronector/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.MEILIFEILONG) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/meilifeilong/stage_" + fossilLevel + ".png");
		} else if (type == FossilSkeletonFivePieceBlock.Types.CARTORHYNCHUS) {
			resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cartorhynchus/stage_" + fossilLevel + ".png");
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonFivePieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
