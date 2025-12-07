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
