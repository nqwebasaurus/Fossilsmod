package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SemionotusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart gillL;
	private final ModelPart upperjaw;
	private final ModelPart lowerjaw;
	private final ModelPart body1;
	private final ModelPart pectoralfinL;
	private final ModelPart pelvicfinL;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart tail;

	public SemionotusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.head = this.bone.getChild("head");
		this.gillL = this.head.getChild("gillL");
		this.upperjaw = this.head.getChild("upperjaw");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.body1 = this.head.getChild("body1");
		this.pectoralfinL = this.body1.getChild("pectoralfinL");
		this.pelvicfinL = this.body1.getChild("pelvicfinL");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.tail = this.body3.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(-2.4F, 24.0F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(30, 24).addBox(-8.5F, -1.0F, 6.0F, 16.0F, 1.0F, 10.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(-7.6F, -1.0F, -11.3F, 20.0F, 1.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 49).addBox(-8.0774F, -0.5F, 0.0512F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -0.5F, -19.4F, 0.0F, 0.637F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 36).addBox(-5.6F, -0.5F, -6.7F, 12.0F, 1.0F, 11.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.5F, -0.5F, -14.5F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 45).addBox(-9.75F, -0.5F, -6.5F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 21.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 49).addBox(-1.125F, -0.5F, 2.15F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5681F, -0.5F, 19.5065F, 0.0F, -1.2348F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 24).addBox(-5.025F, -0.5F, 0.075F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(11.4F, -0.5F, 8.3F, 0.0F, -0.4494F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 12).addBox(-7.8F, -1.0F, -3.0F, 20.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1134F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7807F, -0.9389F, -7.7048F, 0.1307F, 0.0113F, -1.6129F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 17).addBox(-0.5F, -11.45F, -4.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 6.5589F, 6.2209F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -7.25F, -8.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 61).addBox(0.5F, -4.25F, -12.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.5589F, 6.2209F, -0.2618F, 0.0F, 0.0F));

		PartDefinition gillL = head.addOrReplaceChild("gillL", CubeListBuilder.create().texOffs(47, 73).addBox(-1.0F, -1.5F, -0.75F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3089F, -1.7791F, 0.0F, 0.1745F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0589F, -2.0291F));

		PartDefinition cube_r9 = upperjaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 24).addBox(0.5F, -2.25F, -14.65F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 6.5F, 8.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = upperjaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 29).addBox(-0.5F, -13.75F, -5.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 6.5F, 8.25F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = upperjaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -9.45F, -7.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(30, 36).addBox(-0.5F, -11.45F, -8.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 6.5F, 8.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r12 = upperjaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.52F, -0.1182F, -2.2839F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.3089F, -4.9291F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r13 = lowerjaw.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 24).addBox(0.5F, -1.25F, -14.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 4.25F, 11.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body1 = head.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(51, 2).addBox(1.0F, -4.5F, 0.25F, 1.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.175F, 0.5589F, 1.2209F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 57).addBox(0.5F, -10.9F, -3.875F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition pectoralfinL = body1.addOrReplaceChild("pectoralfinL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 1.675F, 1.5F, -1.0996F, -0.042F, 0.0101F));

		PartDefinition cube_r15 = pectoralfinL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 56).addBox(0.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, -0.25F, 3.5F, 0.0F, 0.0F, -3.0674F));

		PartDefinition pelvicfinL = body1.addOrReplaceChild("pelvicfinL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.175F, 3.5F, 7.5F, -0.6912F, -0.1022F, 0.1289F));

		PartDefinition cube_r16 = pelvicfinL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 77).addBox(0.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0F, 3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(64, 0).addBox(0.5F, -2.25F, -0.75F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.25F, 10.0F, 0.1309F, 0.0011F, 0.0087F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 34).addBox(0.0F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.815F, 3.5248F, 7.7255F, 0.4367F, 0.0395F, -3.1231F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(59, 61).addBox(0.0F, -2.5F, -3.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9881F, -4.6596F, 3.8571F, -3.098F, 0.0F, -3.1154F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 57).addBox(0.0F, -11.425F, 0.75F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.25F, -5.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(19, 69).addBox(0.0F, -1.9F, 4.8F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.25F, -5.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(68, 68).addBox(0.0F, -1.75F, -0.75F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(0.0F, 1.625F, 2.25F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, 0.0F, 5.0F, 0.1744F, -0.0066F, 0.0298F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.375F, 0.25F, 5.25F, -0.0501F, -0.0002F, -0.0072F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -5.5F, -4.5F, 0.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.25F, 3.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(73, 26).addBox(-0.5F, -0.5F, 15.25F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-0.5F, 1.5F, 15.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -15.25F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}