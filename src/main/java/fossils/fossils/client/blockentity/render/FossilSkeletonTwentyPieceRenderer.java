package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.allosaurus.AllosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.allosaurus.AllosaurusFossilModel;
import fossils.fossils.client.blockentity.model.amargasaurus.AmargasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.amargasaurus.AmargasaurusFossilModel;
import fossils.fossils.client.blockentity.model.apatosaurus.ApatosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.apatosaurus.ApatosaurusFossilModel;
import fossils.fossils.client.blockentity.model.aristonectes.AristonectesFossilFrameModel;
import fossils.fossils.client.blockentity.model.aristonectes.AristonectesFossilModel;
import fossils.fossils.client.blockentity.model.brachiosaurus.BrachiosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.brachiosaurus.BrachiosaurusFossilModel;
import fossils.fossils.client.blockentity.model.carcharodontosaurus.CarcharodontosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.carcharodontosaurus.CarcharodontosaurusFossilModel;
import fossils.fossils.client.blockentity.model.cotylorhynchus.CotylorhynchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cotylorhynchus.CotylorhynchusFossilModel;
import fossils.fossils.client.blockentity.model.edmontosaurusannectens.EdmontosaurusannectensFossilFrameModel;
import fossils.fossils.client.blockentity.model.edmontosaurusannectens.EdmontosaurusannectensFossilModel;
import fossils.fossils.client.blockentity.model.eremotherium.EremotheriumFossilFrameModel;
import fossils.fossils.client.blockentity.model.eremotherium.EremotheriumFossilModel;
import fossils.fossils.client.blockentity.model.hatzegopteryx.HatzegopteryxFossilFrameModel;
import fossils.fossils.client.blockentity.model.hatzegopteryx.HatzegopteryxFossilModel;
import fossils.fossils.client.blockentity.model.iguanodon.IguanodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.iguanodon.IguanodonFossilModel;
import fossils.fossils.client.blockentity.model.livyatan.LivyatanFossilFrameModel;
import fossils.fossils.client.blockentity.model.livyatan.LivyatanFossilModel;
import fossils.fossils.client.blockentity.model.megacerops.MegaceropsFossilFrameModel;
import fossils.fossils.client.blockentity.model.megacerops.MegaceropsFossilModel;
import fossils.fossils.client.blockentity.model.nigersaurus.NigersaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nigersaurus.NigersaurusFossilModel;
import fossils.fossils.client.blockentity.model.pantheratigris.PantheratigrisFossilFrameModel;
import fossils.fossils.client.blockentity.model.pantheratigris.PantheratigrisFossilModel;
import fossils.fossils.client.blockentity.model.parasaurolophuswalkeri.ParasaurolophuswalkeriFossilFrameModel;
import fossils.fossils.client.blockentity.model.parasaurolophuswalkeri.ParasaurolophuswalkeriFossilModel;
import fossils.fossils.client.blockentity.model.pliosaurus.PliosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pliosaurus.PliosaurusFossilModel;
import fossils.fossils.client.blockentity.model.sarcosuchus.SarcosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.sarcosuchus.SarcosuchusFossilModel;
import fossils.fossils.client.blockentity.model.shonisaurus.ShonisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.shonisaurus.ShonisaurusFossilModel;
import fossils.fossils.client.blockentity.model.spinosaurus.SpinosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.spinosaurus.SpinosaurusFossilModel;
import fossils.fossils.client.blockentity.model.stegosaurus.StegosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.stegosaurus.StegosaurusFossilModel;
import fossils.fossils.client.blockentity.model.therizinosaurus.TherizinosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.therizinosaurus.TherizinosaurusFossilModel;
import fossils.fossils.client.blockentity.model.tyrannosaurus.TyrannosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tyrannosaurus.TyrannosaurusFossilModel;
import fossils.fossils.client.blockentity.model.utahraptor.UtahraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.utahraptor.UtahraptorFossilModel;
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
		} else resourceLocation = SKIN_BY_TYPE.get(type);
		return RenderType.entityCutoutNoCullZOffset(resourceLocation);
	}

	public static RenderType getFrameRenderType(FossilSkeletonTwentyPieceBlock.Type p_112524_) {
		ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
		return RenderType.entityCutoutNoCullZOffset(resourcelocation);
	}

}
