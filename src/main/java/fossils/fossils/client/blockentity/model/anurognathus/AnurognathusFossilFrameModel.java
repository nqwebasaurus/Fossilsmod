package fossils.fossils.client.blockentity.model.anurognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnurognathusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart neck;
	private final ModelPart Head;
	private final ModelPart lefFace;
	private final ModelPart lefFace2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;

	public AnurognathusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftWing = this.main.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.main.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.neck = this.main.getChild("neck");
		this.Head = this.neck.getChild("Head");
		this.lefFace = this.Head.getChild("lefFace");
		this.lefFace2 = this.Head.getChild("lefFace2");
		this.jaw = this.Head.getChild("jaw");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.75F, -2.5F, 0.3127F, 0.2033F, 0.6402F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 37).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.3693F, 7.1337F, -1.5708F, 1.3265F, -1.5708F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 38).addBox(-0.5F, 0.6996F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.05F, 6.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 8).addBox(-0.5F, 0.4941F, 2.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 6).addBox(-0.5F, 0.4941F, -0.5451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.25F, 3.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 6).addBox(-0.5F, 0.2941F, -0.0471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 30).addBox(-1.5F, 0.1F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.5785F, -0.503F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 35).addBox(-0.5F, -0.3368F, 0.0448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.85F, -1.525F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 51).addBox(-0.5F, -0.25F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 51).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, -2.7F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftWing = main.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4061F, -0.2488F, -1.5373F, 0.2834F, 0.1327F, -1.7233F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2412F, 5.8727F, -0.2435F, -0.6224F, -0.3717F, -0.1701F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3122F, 8.8961F, -0.1544F, 0.3552F, 0.0407F, 0.145F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5681F, 2.6135F, -0.4817F, 1.1191F, -0.0329F, -2.8332F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1275F, 2.7906F, -0.3423F, -1.0491F, 0.3686F, 0.2225F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3844F, -0.9491F, 10.6873F, 0.0826F, -0.2075F, -0.0505F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0697F, -1.7249F, 8.5816F, 0.4795F, -0.1455F, -0.0965F));

		PartDefinition rightWing = main.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4061F, -0.2488F, -1.5373F, 0.4111F, -0.2309F, 1.732F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2412F, 5.8727F, -0.2435F, -0.6224F, 0.3717F, 0.1701F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3122F, 8.8961F, -0.1544F, 0.3552F, -0.0407F, -0.145F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5681F, 2.6135F, -0.4817F, 1.1191F, 0.0329F, 2.8332F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1275F, 2.7906F, -0.3423F, -1.4505F, 0.0212F, -0.1733F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3844F, -0.9491F, 10.6873F, 0.0826F, 0.2075F, 0.0505F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0697F, -1.7249F, 8.5816F, 0.4795F, 0.1455F, 0.0965F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3529F, 0.2138F, 7.2672F, 0.4728F, 0.0378F, -1.1719F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.462F, 4.078F, -0.3473F, 0.4954F, -0.0413F, 0.3525F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.536F, 6.8471F, 0.3961F, 1.2482F, 0.0868F, -0.0091F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.3F, -0.288F, 0.103F, -1.2367F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0133F, -3.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3529F, 0.2138F, 7.2672F, 0.1673F, -0.0378F, 1.1719F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.462F, 4.078F, -0.3473F, 0.8444F, 0.0413F, -0.3525F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.536F, 6.8471F, 0.3961F, 0.9864F, -0.0868F, 0.0091F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5F, 0.3F, -0.288F, -0.103F, 1.2367F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0133F, -3.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition neck = main.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -2.525F, -1.0406F, -0.0869F, -0.1515F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 18).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4543F, -3.819F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.42F, 0.3604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 0).addBox(-0.5F, -0.42F, -0.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3431F, -0.7856F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 24).addBox(-0.5F, -0.2782F, -1.7438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2431F, -1.9856F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.1931F, -4.4106F, 0.7163F, -0.079F, -0.4783F));

		PartDefinition lefFace = Head.addOrReplaceChild("lefFace", CubeListBuilder.create(), PartPose.offset(-0.4672F, 0.8055F, -1.0576F));

		PartDefinition lefFace2 = Head.addOrReplaceChild("lefFace2", CubeListBuilder.create(), PartPose.offset(-0.5329F, 0.8055F, -1.0576F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4741F, -0.2871F, 1.7017F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(12, 47).addBox(-0.5F, 0.1412F, -0.6958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 47).addBox(-0.5F, 0.1412F, 0.4042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.0945F, 8.1607F, 0.2531F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, 0.2558F, 0.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.05F, 1.725F, 0.1745F, 0.0F, 0.0F));

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