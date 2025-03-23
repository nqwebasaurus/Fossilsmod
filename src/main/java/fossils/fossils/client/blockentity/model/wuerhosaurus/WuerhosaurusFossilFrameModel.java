package fossils.fossils.client.blockentity.model.wuerhosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

@SuppressWarnings("unused")
public class WuerhosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body2;
	private final ModelPart upperbody;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart bone;
	private final ModelPart neck3;

	public WuerhosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body2 = this.body.getChild("body2");
		this.upperbody = this.body2.getChild("upperbody");
		this.neck = this.upperbody.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck2 = this.neck4.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.bone = this.neck5.getChild("bone");
		this.neck3 = this.neck5.getChild("neck3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -30.0F, 6.4F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(1.4F, -1.5F, -0.5F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -24.5F, -18.0F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-9.0F, -7.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -24.5F, -18.0F, 0.0698F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.5F, -10.0F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -33.0F, 6.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.5118F, 6.8041F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.4358F, 0.381F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3139F, -3.369F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.163F, 7.4237F, 0.0337F, -0.1307F, 0.007F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, 0.2711F, 0.2702F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0972F, -0.1185F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.539F, 10.1153F, -0.1077F, -0.0879F, -0.0037F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 31).addBox(-0.5F, 0.067F, -0.2727F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1919F, 0.0825F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6483F, 9.5885F, -0.0437F, 0.2182F, 0.0F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 44).addBox(-0.5F, -0.0878F, 0.0652F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5704F, -0.0912F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2742F, 8.1296F, -0.1671F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 86).addBox(-0.5F, -0.2709F, -0.4162F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6479F, 0.2589F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 44).addBox(-0.5F, 0.3487F, -0.3982F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5025F, 5.8263F, -0.0548F, 0.3891F, -0.0542F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(48, 15).addBox(-0.5F, 0.1889F, -0.3591F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1593F, 9.8982F, -0.3914F, -0.0807F, 0.0333F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.0767F, -3.0647F, 0.0877F, -0.0869F, -0.0076F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, 0.1F, -0.05F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1608F, -12.5096F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2592F, -12.6204F, -0.0877F, -0.0435F, 0.0038F));

		PartDefinition cube_r10 = upperbody.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 62).addBox(-0.5F, 0.1137F, -4.721F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1786F, 0.0355F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r11 = upperbody.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(65, 80).addBox(-0.5F, 0.1232F, -7.7945F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.5166F, -4.3828F, 0.5934F, 0.0F, 0.0F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.7011F, -9.8326F, -0.1309F, -0.1298F, 0.017F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 86).addBox(-0.5F, 0.0907F, -0.9765F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.3903F, -4.3944F, 0.7243F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.2903F, -4.4944F, -0.0894F, -0.2173F, 0.0193F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(78, 103).addBox(-0.5F, -0.9272F, -4.9582F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.6F, 0.5501F, -0.0298F, -0.0182F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6258F, -3.7937F, 0.055F, -0.1213F, -0.224F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4952F, -6.7774F, 0.0F, -0.0873F, 0.0F));

		PartDefinition bone = neck5.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(104, 70).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 0.0F, -5.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 33).addBox(-0.5F, -0.5293F, -0.3201F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8097F, 4.8824F, 0.0F, 0.0873F, 0.0F));

		PartDefinition neck3 = neck5.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.1439F, -0.0432F, -0.0063F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(31, 120).addBox(-0.5F, 0.05F, -1.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3828F, -2.4827F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
