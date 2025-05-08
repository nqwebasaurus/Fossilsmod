package fossils.fossils.client.blockentity.model.halszkaraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HalszkaraptorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart halszkaraptor;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
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
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public HalszkaraptorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.halszkaraptor = this.fossil.getChild("halszkaraptor");
		this.bone = this.halszkaraptor.getChild("bone");
		this.bone2 = this.halszkaraptor.getChild("bone2");
		this.leftLeg1 = this.halszkaraptor.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.halszkaraptor.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.Tail1 = this.halszkaraptor.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.halszkaraptor.getChild("Body");
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
		this.neck = this.Neck1.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.Head = this.neck6.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -14.0F, 0.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -2.8F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, -11.8F, -9.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.3F, -1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -11.8F, -9.4F, 0.1745F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-3.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -11.0F, 1.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition halszkaraptor = fossil.addOrReplaceChild("halszkaraptor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.509F, 0.9777F, -0.0785F, 0.0F, 0.0F));

		PartDefinition basin_r1 = halszkaraptor.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-1.1F, 0.3438F, 0.8288F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -0.7F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = halszkaraptor.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1F, -0.0223F, 2.2214F));

		PartDefinition bone2 = halszkaraptor.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.1F, -0.0223F, 2.2214F));

		PartDefinition leftLeg1 = halszkaraptor.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 0.1707F, 0.2992F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7304F, -0.4718F, 0.8814F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9993F, 0.4279F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 4.0559F, -0.1179F, 0.3062F, -0.0082F, 0.0005F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4449F, -0.2224F, -0.0217F, -0.5859F, 0.2466F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, -1.5F));

		PartDefinition rightLeg1 = halszkaraptor.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 0.1707F, 0.2992F, 0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7304F, -0.4718F, 1.0559F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9993F, 0.4279F, -1.7453F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 4.0559F, -0.1179F, 1.3534F, 0.0082F, -0.0005F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4449F, -0.2224F, -0.0217F, -0.5859F, -0.2466F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail1 = halszkaraptor.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0502F, 2.575F, 0.1685F, -0.3014F, -0.0505F));

		PartDefinition cube_r4 = Tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 5).addBox(-0.5F, 0.1F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 0).addBox(-0.5F, 0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0001F, -0.225F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.1872F, -0.0981F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6815F, 5.4097F, -0.0293F, -0.1745F, 0.0051F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.1963F, 5.8019F, -0.1864F, -0.2575F, 0.048F));

		PartDefinition cube_r5 = Tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.1F, 1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 4.55F, -0.066F, 0.6534F, -0.0401F));

		PartDefinition cube_r6 = Tail4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 21).addBox(-1.0F, 0.6228F, 1.9937F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6723F, 3.547F, -0.1445F, 0.2592F, -0.0373F));

		PartDefinition cube_r7 = Tail5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 7).addBox(-1.0F, 0.6227F, 1.9937F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body = halszkaraptor.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5447F, -1.2965F, 0.0533F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 61).addBox(-1.0F, 0.4536F, -0.2064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.25F, -0.525F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 14).addBox(-1.0F, -0.4F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.7F, -0.0218F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -5.0999F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -0.1727F, -1.1833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.675F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftArm1 = Chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0936F, 2.8441F, -3.9682F, 1.3052F, 0.3427F, -0.0459F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.03F, 2.4282F, -1.155F, -2.5312F, -0.2236F, 0.0135F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1607F, 2.5598F, 0.2969F, 1.2186F, -0.331F, 0.2542F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0797F, -0.1647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm1 = Chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0936F, 2.8441F, -3.9682F, 1.6979F, -0.3427F, 0.0459F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.03F, 2.4282F, -1.155F, -2.5312F, 0.2236F, -0.0135F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1607F, 2.5598F, 0.2969F, 1.2186F, 0.331F, -0.2542F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0797F, -0.1647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6493F, -4.6507F, -0.0025F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 9).addBox(-0.5F, -0.4106F, 1.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 8).addBox(-0.5F, -0.4106F, 0.1841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -2.2332F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3721F, -1.3477F, 0.019F, 0.3926F, 0.0073F));

		PartDefinition cube_r12 = Neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 10).addBox(-0.5F, 1.1F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.8842F, -2.0138F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6168F, -2.1965F, -0.659F, 0.3391F, 0.0068F));

		PartDefinition cube_r13 = Neck1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(47, 55).addBox(-0.5F, 0.05F, 0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 55).addBox(-0.5F, 0.05F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -1.4508F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck = Neck1.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3316F, -0.759F, -0.3539F, 0.2172F, 0.1967F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 15).addBox(-0.5F, 0.199F, -2.6918F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0918F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3591F, -2.53F, 0.3646F, 0.2865F, 0.1074F));

		PartDefinition cube_r15 = neck4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 37).addBox(-0.5F, 0.199F, -1.9918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0919F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2653F, -1.6061F, -0.0869F, 0.0983F, 0.1228F));

		PartDefinition cube_r16 = neck5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 13).addBox(-0.5F, 0.199F, -1.7918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0919F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2427F, -1.6313F, 0.0226F, 0.0843F, 0.2628F));

		PartDefinition cube_r17 = neck6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 5).addBox(-0.5F, 0.199F, -2.6918F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0919F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head = neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5751F, -2.2048F, 0.0035F, 0.2305F, 0.3412F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4024F, -0.1939F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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