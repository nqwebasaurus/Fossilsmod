package fossils.fossils.client.blockentity.render;

import java.util.Map;

import javax.annotation.Nullable;

import com.mojang.math.Axis;
import fossils.fossils.client.blockentity.model.*;
import fossils.fossils.common.block.RotatableFossilEntity;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.joml.Quaternionf;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.alienum.AlienumFossilSlabModel;
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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FossilSlabRenderer implements BlockEntityRenderer<FossilSlabBlockEntity> {
    private final Map<RotatableFossilEntity.FossilType, SkullModelBase> modelByType;
    public static final Map<RotatableFossilEntity.FossilType, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
        type.put(RotatableFossilEntity.Types.TROPAEUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/tropaeum.png"));
        type.put(RotatableFossilEntity.Types.ALIENUM, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/alienum.png"));
        type.put(RotatableFossilEntity.Types.DICRANURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/dicranurus.png"));
        type.put(RotatableFossilEntity.Types.CHARNIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/charnia.png"));
        type.put(RotatableFossilEntity.Types.DICKINSONIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/dickinsonia.png"));
        type.put(RotatableFossilEntity.Types.OTTOIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/ottoia.png"));
        type.put(RotatableFossilEntity.Types.OPABINIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/opabinia.png"));
        type.put(RotatableFossilEntity.Types.WAPTIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/waptia.png"));
        type.put(RotatableFossilEntity.Types.MOBULAVERMIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/mobulavermis.png"));
        type.put(RotatableFossilEntity.Types.HALLUCIGENIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/hallucigenia.png"));
        type.put(RotatableFossilEntity.Types.NECTOCARIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/nectocaris.png"));
        type.put(RotatableFossilEntity.Types.HAIKOUICHTHYS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/haikouichthys.png"));
        type.put(RotatableFossilEntity.Types.PIKAIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/pikaia.png"));
        type.put(RotatableFossilEntity.Types.CANADASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/canadaspis.png"));
        type.put(RotatableFossilEntity.Types.KERYGMACHELA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/kerygmachela.png"));
        type.put(RotatableFossilEntity.Types.BALHUTICARIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/balhuticaris.png"));
        type.put(RotatableFossilEntity.Types.CAMBRORASTER, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/cambroraster.png"));
        type.put(RotatableFossilEntity.Types.EOREDLICHIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/eoredlichia.png"));
        type.put(RotatableFossilEntity.Types.YAWUNIK, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/yawunik.png"));
        type.put(RotatableFossilEntity.Types.MARRELLA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/marrella.png"));
        type.put(RotatableFossilEntity.Types.YOHOIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/yohoia.png"));
        type.put(RotatableFossilEntity.Types.SANCTACARIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/sanctacaris.png"));
        type.put(RotatableFossilEntity.Types.SKEEMELLA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/skeemella.png"));
        type.put(RotatableFossilEntity.Types.PHANTASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/phantaspis.png"));
        type.put(RotatableFossilEntity.Types.KLEPTOTHULE, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/kleptothule.png"));
        type.put(RotatableFossilEntity.Types.ISOXYS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/isoxys.png"));
        type.put(RotatableFossilEntity.Types.CAPINATATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/capinatator.png"));
        type.put(RotatableFossilEntity.Types.HADRANAX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/hadranax.png"));
        type.put(RotatableFossilEntity.Types.PAMBDELURION, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/pambdelurion.png"));
        type.put(RotatableFossilEntity.Types.SIDNEYIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/sidneyia.png"));
        type.put(RotatableFossilEntity.Types.TUZOIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/tuzoia.png"));
        type.put(RotatableFossilEntity.Types.VETULICOLA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/vetulicola.png"));
        type.put(RotatableFossilEntity.Types.AEGIROCASSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/aegirocassis.png"));
        type.put(RotatableFossilEntity.Types.APHETOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/aphetoceras.png"));
        type.put(RotatableFossilEntity.Types.HUNGIOIDES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/hungioides.png"));
        type.put(RotatableFossilEntity.Types.CYRTOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/cyrtoceras.png"));
        type.put(RotatableFossilEntity.Types.PLATYPELTOIDES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/platypeltoides.png"));
        type.put(RotatableFossilEntity.Types.LITUITES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/lituites.png"));
        type.put(RotatableFossilEntity.Types.COTHURNOCYSTIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/cothurnocystis.png"));
        type.put(RotatableFossilEntity.Types.ORTHOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/orthoceras.png"));
        type.put(RotatableFossilEntity.Types.ARANDASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/arandaspis.png"));
        type.put(RotatableFossilEntity.Types.SACABAMBASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/sacabambaspis.png"));
        type.put(RotatableFossilEntity.Types.DIDYMOGRAPTUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/didymograptus.png"));
        type.put(RotatableFossilEntity.Types.GONIOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/gonioceras.png"));
        type.put(RotatableFossilEntity.Types.ENDOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/endoceras.png"));
        type.put(RotatableFossilEntity.Types.CONODONT, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/conodont.png"));
        type.put(RotatableFossilEntity.Types.PRICYCLOPYGE, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/pricyclopyge.png"));
        type.put(RotatableFossilEntity.Types.VILLEBRUNASTER, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/villebrunaster.png"));
        type.put(RotatableFossilEntity.Types.CALVAPILOSA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/calvapilosa.png"));
        type.put(RotatableFossilEntity.Types.TREMAGLASPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/tremaglaspis.png"));
        type.put(RotatableFossilEntity.Types.EURYPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/slabs/eurypterus.png"));
    });

    public static Map<RotatableFossilEntity.FossilType, SkullModelBase> createFossilRenderers(EntityModelSet model) {
        ImmutableMap.Builder<RotatableFossilEntity.FossilType, SkullModelBase> builder = ImmutableMap.builder();
        builder.put(RotatableFossilEntity.Types.TROPAEUM, new TropaeumFossilSlabModel(model.bakeLayer(ClientEvents.TROPAEUM)));
        builder.put(RotatableFossilEntity.Types.ALIENUM, new AlienumFossilSlabModel(model.bakeLayer(ClientEvents.ALIENUM)));
        builder.put(RotatableFossilEntity.Types.DICRANURUS, new DicranurusFossilSlabModel(model.bakeLayer(ClientEvents.DICRANURUS)));
        builder.put(RotatableFossilEntity.Types.CHARNIA, new CharniaFossilSlabModel(model.bakeLayer(ClientEvents.CHARNIA)));
        builder.put(RotatableFossilEntity.Types.DICKINSONIA, new DickinsoniaFossilSlabModel(model.bakeLayer(ClientEvents.DICKINSONIA)));
        builder.put(RotatableFossilEntity.Types.OTTOIA, new OttoiaFossilSlabModel(model.bakeLayer(ClientEvents.OTTOIA)));
        builder.put(RotatableFossilEntity.Types.OPABINIA, new OpabiniaFossilSlabModel(model.bakeLayer(ClientEvents.OPABINIA)));
        builder.put(RotatableFossilEntity.Types.WAPTIA, new WaptiaFossilSlabModel(model.bakeLayer(ClientEvents.WAPTIA)));
        builder.put(RotatableFossilEntity.Types.MOBULAVERMIS, new MobulavermisFossilSlabModel(model.bakeLayer(ClientEvents.MOBULAVERMIS)));
        builder.put(RotatableFossilEntity.Types.HALLUCIGENIA, new HallucigeniaFossilSlabModel(model.bakeLayer(ClientEvents.HALLUCIGENIA)));
        builder.put(RotatableFossilEntity.Types.NECTOCARIS, new NectocarisFossilSlabModel(model.bakeLayer(ClientEvents.NECTOCARIS)));
        builder.put(RotatableFossilEntity.Types.HAIKOUICHTHYS, new HaikouichthysFossilSlabModel(model.bakeLayer(ClientEvents.HAIKOUICHTHYS)));
        builder.put(RotatableFossilEntity.Types.PIKAIA, new PikaiaFossilSlabModel(model.bakeLayer(ClientEvents.PIKAIA)));
        builder.put(RotatableFossilEntity.Types.CANADASPIS, new CanadaspisFossilSlabModel(model.bakeLayer(ClientEvents.CANADASPIS)));
        builder.put(RotatableFossilEntity.Types.KERYGMACHELA, new KerygmachelaFossilSlabModel(model.bakeLayer(ClientEvents.KERYGMACHELA)));
        builder.put(RotatableFossilEntity.Types.BALHUTICARIS, new BalhuticarisFossilSlabModel(model.bakeLayer(ClientEvents.BALHUTICARIS)));
        builder.put(RotatableFossilEntity.Types.CAMBRORASTER, new CambrorasterFossilSlabModel(model.bakeLayer(ClientEvents.CAMBRORASTER)));
        builder.put(RotatableFossilEntity.Types.EOREDLICHIA, new EoredlichiaFossilSlabModel(model.bakeLayer(ClientEvents.EOREDLICHIA)));
        builder.put(RotatableFossilEntity.Types.YAWUNIK, new YawunikFossilSlabModel(model.bakeLayer(ClientEvents.YAWUNIK)));
        builder.put(RotatableFossilEntity.Types.MARRELLA, new MarrellaFossilSlabModel(model.bakeLayer(ClientEvents.MARRELLA)));
        builder.put(RotatableFossilEntity.Types.YOHOIA, new YohoiaFossilSlabModel(model.bakeLayer(ClientEvents.YOHOIA)));
        builder.put(RotatableFossilEntity.Types.SANCTACARIS, new SanctacarisFossilSlabModel(model.bakeLayer(ClientEvents.SANCTACARIS)));
        builder.put(RotatableFossilEntity.Types.SKEEMELLA, new SkeemellaFossilSlabModel(model.bakeLayer(ClientEvents.SKEEMELLA)));
        builder.put(RotatableFossilEntity.Types.PHANTASPIS, new PhantaspisFossilSlabModel(model.bakeLayer(ClientEvents.PHANTASPIS)));
        builder.put(RotatableFossilEntity.Types.KLEPTOTHULE, new KleptothuleFossilSlabModel(model.bakeLayer(ClientEvents.KLEPTOTHULE)));
        builder.put(RotatableFossilEntity.Types.ISOXYS, new IsoxysFossilSlabModel(model.bakeLayer(ClientEvents.ISOXYS)));
        builder.put(RotatableFossilEntity.Types.CAPINATATOR, new CapinatatorFossilSlabModel(model.bakeLayer(ClientEvents.CAPINATATOR)));
        builder.put(RotatableFossilEntity.Types.HADRANAX, new HadranaxFossilSlabModel(model.bakeLayer(ClientEvents.HADRANAX)));
        builder.put(RotatableFossilEntity.Types.PAMBDELURION, new PambdelurionFossilSlabModel(model.bakeLayer(ClientEvents.PAMBDELURION)));
        builder.put(RotatableFossilEntity.Types.SIDNEYIA, new SidneyiaFossilSlabModel(model.bakeLayer(ClientEvents.SIDNEYIA)));
        builder.put(RotatableFossilEntity.Types.TUZOIA, new TuzoiaFossilSlabModel(model.bakeLayer(ClientEvents.TUZOIA)));
        builder.put(RotatableFossilEntity.Types.VETULICOLA, new VetulicolaFossilSlabModel(model.bakeLayer(ClientEvents.VETULICOLA)));
        builder.put(RotatableFossilEntity.Types.AEGIROCASSIS, new AegirocassisFossilSlabModel(model.bakeLayer(ClientEvents.AEGIROCASSIS)));
        builder.put(RotatableFossilEntity.Types.APHETOCERAS, new AphetocerasFossilSlabModel(model.bakeLayer(ClientEvents.APHETOCERAS)));
        builder.put(RotatableFossilEntity.Types.HUNGIOIDES, new HungioidesFossilSlabModel(model.bakeLayer(ClientEvents.HUNGIOIDES)));
        builder.put(RotatableFossilEntity.Types.CYRTOCERAS, new CyrtocerasFossilSlabModel(model.bakeLayer(ClientEvents.CYRTOCERAS)));
        builder.put(RotatableFossilEntity.Types.PLATYPELTOIDES, new PlatypeltoidesFossilSlabModel(model.bakeLayer(ClientEvents.PLATYPELTOIDES)));
        builder.put(RotatableFossilEntity.Types.LITUITES, new LituitesFossilSlabModel(model.bakeLayer(ClientEvents.LITUITES)));
        builder.put(RotatableFossilEntity.Types.COTHURNOCYSTIS, new CothurnocystisFossilSlabModel(model.bakeLayer(ClientEvents.COTHURNOCYSTIS)));
        builder.put(RotatableFossilEntity.Types.ORTHOCERAS, new OrthocerasFossilSlabModel(model.bakeLayer(ClientEvents.ORTHOCERAS)));
        builder.put(RotatableFossilEntity.Types.ARANDASPIS, new ArandaspisFossilSlabModel(model.bakeLayer(ClientEvents.ARANDASPIS)));
        builder.put(RotatableFossilEntity.Types.SACABAMBASPIS, new SacabambaspisFossilSlabModel(model.bakeLayer(ClientEvents.SACABAMBASPIS)));
        builder.put(RotatableFossilEntity.Types.DIDYMOGRAPTUS, new DidymograptusFossilSlabModel(model.bakeLayer(ClientEvents.DIDYMOGRAPTUS)));
        builder.put(RotatableFossilEntity.Types.GONIOCERAS, new GoniocerasFossilSlabModel(model.bakeLayer(ClientEvents.GONIOCERAS)));
        builder.put(RotatableFossilEntity.Types.ENDOCERAS, new EndocerasFossilSlabModel(model.bakeLayer(ClientEvents.ENDOCERAS)));
        builder.put(RotatableFossilEntity.Types.CONODONT, new ConodontFossilSlabModel(model.bakeLayer(ClientEvents.CONODONT)));
        builder.put(RotatableFossilEntity.Types.PRICYCLOPYGE, new PricyclopygeFossilSlabModel(model.bakeLayer(ClientEvents.PRICYCLOPYGE)));
        builder.put(RotatableFossilEntity.Types.VILLEBRUNASTER, new VillebrunasterFossilSlabModel(model.bakeLayer(ClientEvents.VILLEBRUNASTER)));
        builder.put(RotatableFossilEntity.Types.CALVAPILOSA, new CalvapilosaFossilSlabModel(model.bakeLayer(ClientEvents.CALVAPILOSA)));
        builder.put(RotatableFossilEntity.Types.TREMAGLASPIS, new TremaglaspisFossilSlabModel(model.bakeLayer(ClientEvents.TREMAGLASPIS)));
        builder.put(RotatableFossilEntity.Types.EURYPTERUS, new EurypterusFossilSlabModel(model.bakeLayer(ClientEvents.EURYPTERUS)));
        return builder.build();
    }

    public FossilSlabRenderer(BlockEntityRendererProvider.Context p_173660_) {
        this.modelByType = createFossilRenderers(p_173660_.getModelSet());
    }

    public void render(FossilSlabBlockEntity entity, float p_112535_, PoseStack stack, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
        float f = 0;
        BlockState blockstate = entity.getBlockState();
        int rotation = blockstate.getValue(RotatableFossilEntity.ROTATION);
        Direction direction = blockstate.getValue(BlockStateProperties.FACING);
        float rotationDegrees = ((RotatableFossilEntity) blockstate.getBlock()).getRotationDegrees(blockstate);
        RotatableFossilEntity.FossilType skullblock$type = ((RotatableFossilEntity) blockstate.getBlock()).getFossilType();
        SkullModelBase skullmodelbase = this.modelByType.get(skullblock$type);
        RenderType rendertype = getRenderType(skullblock$type);
        renderFossilSlab(entity, direction, rotationDegrees, f, stack, p_112537_, p_112538_, skullmodelbase, rendertype);
    }

    public static void renderFossilSlab(FossilSlabBlockEntity entity, Direction dir, float p_173665_, float p_173666_, PoseStack pose, MultiBufferSource p_173668_, int p_173669_, SkullModelBase base, RenderType p_173671_) {
        pose.pushPose();
        BlockState state = entity.getBlockState();
        RotatableFossilEntity.FossilType fossilBlock = ((RotatableFossilEntity) state.getBlock()).getFossilType();
        pose.translate(0.5F, 1.0F, 0.5F);
        if (fossilBlock == RotatableFossilEntity.Types.TROPAEUM) {
            float scale = 0.68F;
            pose.scale(-scale, -scale, scale);
        } else if (fossilBlock == RotatableFossilEntity.Types.ENDOCERAS) {
            float scale = 0.72F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.12F, 0F);
        } else if (fossilBlock == RotatableFossilEntity.Types.ALIENUM) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.50F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.50F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2.5F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2.5F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.DICRANURUS) {
            float scale = 0.14F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.50F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.50F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2.5F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2.5F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CHARNIA) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, -0.07F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, -0.79F, 0.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, -0.79F, -0.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-0.7F, -0.79F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(0.7F, -0.79F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.DICKINSONIA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, -0.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, -1F, 0.55F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, -1F, -0.55F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-0.55F, -1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(0.55F, -1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.OTTOIA) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.OPABINIA) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.WAPTIA) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.MOBULAVERMIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.HALLUCIGENIA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.NECTOCARIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.HAIKOUICHTHYS) {
            float scale = 0.05F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 18.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 8.46F, 9.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 8.46F, -9.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-8.46F, 8.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(9.2F, 8.46F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.PIKAIA) {
            float scale = 0.05F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 18.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 8.46F, 9.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 8.46F, -9.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-8.46F, 8.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(9.2F, 8.46F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CANADASPIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.KERYGMACHELA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.KERYGMACHELA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.BALHUTICARIS) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CAMBRORASTER) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.EOREDLICHIA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.YAWUNIK) {
            float scale = 0.1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 8.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 3.5F, 4.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 3.5F, -4.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-4.7F, 3.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(4.7F, 3.5F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.MARRELLA) {
            float scale = 0.1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 8.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 3.5F, 4.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 3.5F, -4.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-4.7F, 3.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(4.7F, 3.5F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.YOHOIA) {
            float scale = 0.1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 8.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 3.5F, 4.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 3.5F, -4.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-4.7F, 3.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(4.7F, 3.5F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.SANCTACARIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.SKEEMELLA) {
            float scale = 0.1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 8.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 3.5F, 4.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 3.5F, -4.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-4.7F, 3.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(4.7F, 3.5F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.PHANTASPIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.KLEPTOTHULE) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.ISOXYS) {
            float scale = 0.1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 8.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 3.5F, 4.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 3.5F, -4.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-4.7F, 3.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(4.7F, 3.5F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CAPINATATOR) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.HADRANAX) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.PAMBDELURION) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.SIDNEYIA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.TUZOIA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.VETULICOLA) {
            float scale = 0.1F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 8.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 3.5F, 4.7F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 3.5F, -4.7F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-4.7F, 3.5F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(4.7F, 3.5F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.AEGIROCASSIS) {
            float scale = 0.53F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 0.4F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, -0.56F, 0.9F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, -0.56F, -0.9F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-0.9F, -0.56F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(0.9F, -0.56F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.APHETOCERAS) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.HUNGIOIDES) {
            float scale = 0.53F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 0.4F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, -0.56F, 0.9F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, -0.56F, -0.9F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-0.9F, -0.56F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(0.9F, -0.56F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CYRTOCERAS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.PLATYPELTOIDES) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.LITUITES) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.COTHURNOCYSTIS) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 3.5F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1F, 2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1F, -2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-2.5F, 1F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(2.5F, 1F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.ORTHOCERAS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.ARANDASPIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.SACABAMBASPIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.DIDYMOGRAPTUS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.GONIOCERAS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CONODONT) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.PRICYCLOPYGE) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.VILLEBRUNASTER) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.CALVAPILOSA) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.TREMAGLASPIS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else if (fossilBlock == RotatableFossilEntity.Types.EURYPTERUS) {
            float scale = 0.15F;
            pose.scale(-scale, -scale, scale);
            switch (dir) {
                case DOWN -> {
                    pose.translate(0F, 5.15F, 0F);
                }
                case UP -> {
                    pose.mulPose(Axis.XP.rotationDegrees(180));
                    pose.translate(0F, -1.5F, 0F);
                }
                case NORTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(-90));
                    pose.translate(0F, 1.85F, 3.2F);
                }
                case SOUTH -> {
                    pose.mulPose(Axis.XP.rotationDegrees(90));
                    pose.translate(0F, 1.85F, -3.2F);
                }
                case WEST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(-90));
                    pose.translate(-3.2F, 1.85F, 0F);
                }
                case EAST -> {
                    pose.mulPose(Axis.ZP.rotationDegrees(90));
                    pose.translate(3.2F, 1.85F, 0F);
                }
            }
            ;
        } else pose.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
        base.setupAnim(p_173666_, p_173665_, 0.0F);
        base.renderToBuffer(pose, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pose.popPose();
    }

    public static RenderType getRenderType(RotatableFossilEntity.FossilType p_112524_) {
        ResourceLocation resourcelocation = SKIN_BY_TYPE.get(p_112524_);
        return RenderType.entityCutoutNoCullZOffset(resourcelocation);
    }
}
