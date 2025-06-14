package fossils.fossils.client.blockentity.model.compsognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CompsognathusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Compsognathus;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public CompsognathusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Compsognathus = this.fossil.getChild("Compsognathus");
		this.leftLeg1 = this.Compsognathus.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.Compsognathus.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.Tail1 = this.Compsognathus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.Compsognathus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.leftArm1 = this.Chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.Chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.Neck3 = this.Chest.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -14.0F, -0.3F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -3.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-2.6F, -12.0F, -8.4F, 0.0F, 0.5498F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.7F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6F, -12.0F, -8.4F, 0.5498F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.9F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -10.5F, 0.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Compsognathus = fossil.addOrReplaceChild("Compsognathus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0F, 0.3F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Compsognathus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 30).addBox(-1.1F, 0.2438F, 0.0288F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -0.7F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = Compsognathus.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, -0.0215F, 0.0481F, -0.851F, 0.0987F, 0.0862F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8941F, 0.4573F, 1.405F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4235F, 0.5195F, -1.6144F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.7439F, 0.0227F, -0.1289F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -1.4F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = Compsognathus.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, -0.0215F, 0.0481F, -0.1558F, -0.0204F, -0.1293F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8941F, 0.4573F, 1.0123F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4235F, 0.5195F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.3894F, 0.0308F, 0.1542F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Tail1 = Compsognathus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0502F, 2.575F, 0.3067F, -0.4426F, 0.0413F));

		PartDefinition cube_r4 = Tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 19).addBox(-0.5F, -0.1F, 7.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(21, 12).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0001F, -0.225F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.0128F, -0.0981F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0147F, 7.4254F, 0.1179F, -0.4731F, -0.0787F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.1872F, 8.8019F, 0.1776F, 0.1745F, 0.0005F));

		PartDefinition cube_r5 = Tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, -0.1F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 4.55F, -0.0931F, 0.3924F, 0.0145F));

		PartDefinition cube_r6 = Tail4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 22).addBox(-1.0F, 0.4227F, 1.7937F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2813F, 6.4913F, -0.2768F, 0.2101F, -0.0592F));

		PartDefinition cube_r7 = Tail5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.4227F, 1.7937F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body = Compsognathus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, 0.0539F, 0.2594F, 0.0569F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 27).addBox(-1.0F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(4, 27).addBox(-1.0F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(0, 23).addBox(-1.0F, -0.5F, -4.85F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.7F, -0.0218F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -4.9F, -0.0228F, 0.3065F, 0.0347F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 31).addBox(-1.0F, -0.2727F, -0.2833F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.875F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftArm1 = Chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9028F, 2.6817F, -1.8025F, 1.3349F, 0.3187F, -0.1359F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0419F, 2.011F, -0.6298F, -1.5712F, 0.0387F, -0.0202F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2277F, 1.6973F, -0.3243F, 0.0938F, -0.074F, 0.0559F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = Chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9028F, 2.6817F, -1.8025F, 1.1167F, -0.3187F, 0.1359F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0419F, 2.011F, -0.6298F, -1.833F, -0.0387F, 0.0202F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2277F, 1.6973F, -0.3243F, 0.0938F, 0.074F, -0.0559F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2385F, -3.1381F, -0.16F, 0.3404F, 0.1565F));

		PartDefinition cube_r10 = Neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 36).addBox(-0.5F, -0.4106F, 0.6841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7072F, -3.0332F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8721F, -2.1477F, 0.1202F, 0.5142F, 0.1353F));

		PartDefinition cube_r11 = Neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 9).addBox(-0.5F, 1.1F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 7).addBox(-0.5F, 1.1F, 0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.8842F, -2.0138F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6781F, -2.1136F, -0.1493F, 0.8279F, 0.3211F));

		PartDefinition cube_r12 = Neck1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 27).addBox(-0.5F, 0.199F, -1.6918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -0.8508F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Neck1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 21).addBox(-0.5F, 0.05F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 21).addBox(-0.5F, 0.05F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -1.4508F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0991F, -2.4459F, 0.2304F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1481F, 0.4497F, 0.1658F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 68, 68);
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