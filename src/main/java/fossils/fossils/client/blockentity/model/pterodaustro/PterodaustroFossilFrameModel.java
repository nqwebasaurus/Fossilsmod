package fossils.fossils.client.blockentity.model.pterodaustro;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PterodaustroFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart tail;
	private final ModelPart body;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftwing9;
	private final ModelPart leftmembrane;
	private final ModelPart leftWing10;
	private final ModelPart lefthand;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightwing9;
	private final ModelPart rightmembrane;
	private final ModelPart rightWing10;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart throat;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public PterodaustroFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.tail = this.main.getChild("tail");
		this.body = this.main.getChild("body");
		this.leftwing7 = this.body.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftwing9 = this.leftwing8.getChild("leftwing9");
		this.leftmembrane = this.leftwing9.getChild("leftmembrane");
		this.leftWing10 = this.leftmembrane.getChild("leftWing10");
		this.lefthand = this.leftwing9.getChild("lefthand");
		this.rightwing7 = this.body.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightwing9 = this.rightwing8.getChild("rightwing9");
		this.rightmembrane = this.rightwing9.getChild("rightmembrane");
		this.rightWing10 = this.rightmembrane.getChild("rightWing10");
		this.righthand = this.rightwing9.getChild("righthand");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.throat = this.neck3.getChild("throat");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(0.6F, -9.0F, 0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(2, 1).addBox(-0.5F, -8.0F, 5.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.1678F, 5.6209F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 37).addBox(-0.2F, -0.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.5245F, -0.0563F, -1.929F, -1.4962F, 1.9299F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(11, 38).addBox(-0.5F, 0.2378F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -0.6F, 0.275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.238F, -0.1567F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9601F, 0.2718F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -0.6F, 0.275F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.238F, -0.1567F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9601F, 0.2718F, -0.4792F, -0.0114F, -0.1304F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, 1.3F, -0.6151F, -0.3042F, 0.0275F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 11).addBox(-0.5F, -0.3522F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.3133F, 0.1049F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.0004F, -0.2617F, -0.0058F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 6).addBox(-1.0F, 0.2062F, -0.1463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.467F, -2.5778F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 33).addBox(-1.1F, -0.3F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4641F, -3.6665F, 1.5708F, -1.3788F, -1.5708F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 34).addBox(-1.0F, -0.3366F, -0.2978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.533F, -4.8778F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftwing7 = body.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4599F, 0.2404F, -4.1854F, 0.2651F, -0.7585F, -0.0165F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6242F, 0.4493F, -0.2248F, 1.2678F, 0.948F, 1.8759F));

		PartDefinition leftwing9 = leftwing8.addOrReplaceChild("leftwing9", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4115F, -0.0206F, -0.1872F, 3.0786F, 0.4335F, -2.5914F));

		PartDefinition leftmembrane = leftwing9.addOrReplaceChild("leftmembrane", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9771F, 0.3716F, -0.502F, 2.8158F, -0.3912F, -2.9774F));

		PartDefinition leftWing10 = leftmembrane.addOrReplaceChild("leftWing10", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.45F, 0.0F, 0.0F, 0.0574F, 0.0265F, -0.0502F));

		PartDefinition lefthand = leftwing9.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1563F, 0.2752F, -0.0881F, 2.8822F, -0.109F, -3.0031F));

		PartDefinition rightwing7 = body.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4599F, 0.2404F, -4.1854F, -0.0316F, 0.3982F, -0.4698F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6242F, 0.4493F, -0.2248F, 0.716F, -0.9014F, -1.4154F));

		PartDefinition rightwing9 = rightwing8.addOrReplaceChild("rightwing9", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4115F, -0.0206F, -0.1872F, 3.1411F, -0.6374F, 2.6134F));

		PartDefinition rightmembrane = rightwing9.addOrReplaceChild("rightmembrane", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9771F, 0.3716F, -0.502F, 2.8158F, 0.3912F, 2.9774F));

		PartDefinition rightWing10 = rightmembrane.addOrReplaceChild("rightWing10", CubeListBuilder.create(), PartPose.offsetAndRotation(6.45F, 0.0F, 0.0F, 0.0574F, -0.0265F, 0.0502F));

		PartDefinition righthand = rightwing9.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1563F, 0.2752F, -0.0881F, 2.8822F, 0.109F, 3.0031F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1657F, -4.8299F, 0.5247F, -0.1298F, -0.0172F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 29).addBox(-0.5F, 0.2447F, -0.1295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.3727F, -2.7539F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0023F, -2.4039F, -0.1275F, -0.3045F, 0.0497F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 39).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.2494F, -2.5366F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1006F, -2.5366F, -0.1677F, -0.2577F, -0.2509F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 20).addBox(0.0F, -0.4F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 18).addBox(0.0F, -0.4F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.404F, -2.574F, 0.0349F, 0.0F, 0.0F));

		PartDefinition throat = neck3.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.054F, 0.226F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.1645F, -1.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.2019F, -2.4568F, -0.3996F, -0.2271F, 0.2362F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 33).addBox(0.5F, -0.55F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0F, 0.2855F, -1.6582F, -0.1571F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1395F, -3.6582F, 1.2097F, 0.0659F, 0.178F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.645F, -0.5577F, -0.2423F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.645F, -0.5577F, -0.2423F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5696F, -0.1994F, 0.4102F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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