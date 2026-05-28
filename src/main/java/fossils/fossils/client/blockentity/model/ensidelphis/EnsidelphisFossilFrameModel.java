package fossils.fossils.client.blockentity.model.ensidelphis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EnsidelphisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public EnsidelphisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.leftarm = this.body6.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.body6.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone2 = this.body6.getChild("bone2");
		this.bone3 = this.body6.getChild("bone3");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.neck2 = this.chest.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9898F, -25.5841F, -20.6614F, -0.0467F, 0.0082F, 0.1743F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, 0.518F, -0.057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 9).addBox(1.0F, -0.5F, -6.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.2639F, 3.1718F, -1.5708F, 0.0436F, 1.5708F));

		PartDefinition cube_r3 = body6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 16).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.1106F, 4.3104F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 16).addBox(-0.5F, 0.6F, -0.35F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftarm = body6.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8714F, 4.6703F, 4.0048F, -0.3489F, -0.1909F, -0.8742F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 5.6009F, 0.3221F, -0.057F, -0.0796F, 0.1357F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.7198F, 0.2813F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightarm = body6.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8715F, 4.6703F, 4.0048F, -0.2833F, 0.0457F, 0.7472F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 5.6009F, 0.3221F, -0.0573F, 0.0821F, -0.0921F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.7198F, 0.2813F, 0.384F, 0.0F, 0.0F));

		PartDefinition bone2 = body6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0829F, 3.6662F, 2.7884F, -0.1096F, -0.0293F, -0.2602F));

		PartDefinition bone3 = body6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0829F, 3.6662F, 2.7884F, -0.1096F, 0.0293F, 0.2602F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.3586F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 22).addBox(-0.5F, 0.7575F, 5.1296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 17).addBox(-0.5F, 0.7575F, -0.5704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3017F, 6.1651F, 0.0263F, -0.0436F, -0.0011F));

		PartDefinition cube_r6 = body5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2866F, 7.8023F, -0.1726F, -0.0505F, -0.0354F));

		PartDefinition cube_r7 = body4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 5).addBox(-0.5F, 0.675F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 0).addBox(-0.5F, 0.675F, -5.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 5.0896F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3504F, 6.8384F, 0.0713F, 0.0031F, -0.0435F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, 0.025F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7063F, -0.0002F, 0.0F, 0.0175F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2669F, 6.032F, 0.2437F, -0.064F, -0.1055F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 41).addBox(-0.5F, 1.5738F, 8.4474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 45).addBox(-0.5F, 1.5738F, 13.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.4503F, -0.0786F, -0.0379F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 30).addBox(-0.55F, 0.6585F, 5.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 25).addBox(-0.55F, 0.6585F, -0.2007F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.449F, -0.0787F, 0.0378F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 42).addBox(-0.55F, -0.175F, 0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, 0.1405F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(22, 30).addBox(-0.525F, -0.225F, 5.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 25).addBox(-0.525F, -0.225F, -0.375F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2304F, 5.8944F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(17, 33).addBox(-0.525F, 0.2F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4805F, -2.1145F, 0.4208F, 0.155F, -0.0264F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 104).addBox(-0.5F, 1.15F, 4.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4781F, -1.1117F, -0.7614F, -0.0188F, -0.1219F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.8F, 1.8933F, -5.1002F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.8F, 1.8933F, -5.1002F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.0063F, -1.7945F, 1.1694F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 122, 122);
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