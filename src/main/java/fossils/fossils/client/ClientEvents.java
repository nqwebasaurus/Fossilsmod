package fossils.fossils.client;

import fossils.fossils.FossilMod;
import fossils.fossils.client.blockentity.model.TropaeumFossilSlabModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eunotosaurus.EunotosaurusFossilModel;
import fossils.fossils.client.blockentity.model.kentrosaurus.KentrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kentrosaurus.KentrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.pelecanimimus.PelecanimimusFossilModel;
import fossils.fossils.client.blockentity.model.utahraptor.UtahraptorFossilFrameModel;
import fossils.fossils.client.blockentity.model.utahraptor.UtahraptorFossilModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.wuerhosaurus.WuerhosaurusFossilModel;
import fossils.fossils.client.blockentity.render.FossilSkeletonFifteenPieceRenderer;
import fossils.fossils.client.blockentity.render.FossilSkeletonFivePieceRenderer;
import fossils.fossils.client.blockentity.render.FossilSkeletonTenPieceRenderer;
import fossils.fossils.client.blockentity.render.FossilSkeletonTwentyPieceRenderer;
import fossils.fossils.client.blockentity.render.FossilSlabRenderer;
import fossils.fossils.init.FossilBlockEntities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = FossilMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

	@SubscribeEvent
	public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FossilBlockEntities.FOSSIL_SLAB.get(), FossilSlabRenderer::new);
		event.registerBlockEntityRenderer(FossilBlockEntities.FOSSIL_SKELETON_FIVE_PIECE.get(), FossilSkeletonFivePieceRenderer::new);
		event.registerBlockEntityRenderer(FossilBlockEntities.FOSSIL_SKELETON_TEN_PIECE.get(), FossilSkeletonTenPieceRenderer::new);
		event.registerBlockEntityRenderer(FossilBlockEntities.FOSSIL_SKELETON_FIFTEEN_PIECE.get(), FossilSkeletonFifteenPieceRenderer::new);
		event.registerBlockEntityRenderer(FossilBlockEntities.FOSSIL_SKELETON_TWENTY_PIECE.get(), FossilSkeletonTwentyPieceRenderer::new);
	}

	public static ModelLayerLocation TROPAEUM = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "tropaeum"), "tropaeum");
	public static ModelLayerLocation EUNOTOSAURUS = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "eunotosaurus"), "eunotosaurus");
	public static ModelLayerLocation EUNOTOSAURUS_FRAME = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "eunotosaurus_frame"), "eunotosaurus_frame");
	public static ModelLayerLocation PELECANIMIMUS = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "pelecanimimus"), "pelecanimimus");
	public static ModelLayerLocation PELECANIMIMUS_FRAME = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "pelecanimimus_frame"), "pelecanimimus_frame");
	public static ModelLayerLocation KENTROSAURUS = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "kentrosaurus"), "kentrosaurus");
	public static ModelLayerLocation KENTROSAURUS_FRAME = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "kentrosaurus_frame"), "kentrosaurus_frame");
	public static ModelLayerLocation WUERHOSAURUS = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "wuerhosaurus"), "wuerhosaurus");
	public static ModelLayerLocation WUERHOSAURUS_FRAME = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "wuerhosaurus_frame"), "wuerhosaurus_frame");
	public static ModelLayerLocation UTAHRAPTOR = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "utahraptor"), "utahraptor");
	public static ModelLayerLocation UTAHRAPTOR_FRAME = new ModelLayerLocation(new ResourceLocation(FossilMod.MOD_ID, "utahraptor_frame"), "utahraptor_frame");

	@SubscribeEvent
	public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(TROPAEUM, TropaeumFossilSlabModel::createBodyLayer);
		event.registerLayerDefinition(EUNOTOSAURUS, EunotosaurusFossilModel::createBodyLayer);
		event.registerLayerDefinition(EUNOTOSAURUS_FRAME, EunotosaurusFossilFrameModel::createBodyLayer);
		event.registerLayerDefinition(PELECANIMIMUS, PelecanimimusFossilModel::createBodyLayer);
		event.registerLayerDefinition(PELECANIMIMUS_FRAME, PelecanimimusFossilFrameModel::createBodyLayer);
		event.registerLayerDefinition(KENTROSAURUS, KentrosaurusFossilModel::createBodyLayer);
		event.registerLayerDefinition(KENTROSAURUS_FRAME, KentrosaurusFossilFrameModel::createBodyLayer);
		event.registerLayerDefinition(WUERHOSAURUS, WuerhosaurusFossilModel::createBodyLayer);
		event.registerLayerDefinition(WUERHOSAURUS_FRAME, WuerhosaurusFossilFrameModel::createBodyLayer);
		event.registerLayerDefinition(UTAHRAPTOR, UtahraptorFossilModel::createBodyLayer);
		event.registerLayerDefinition(UTAHRAPTOR_FRAME, UtahraptorFossilFrameModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void init(final FMLClientSetupEvent event) {
		ClientProxy.setupBlockRenders();
	}
	
}
