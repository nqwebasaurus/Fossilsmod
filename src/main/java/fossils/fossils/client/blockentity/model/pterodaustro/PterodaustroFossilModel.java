package fossils.fossils.client.blockentity.model.pterodaustro;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PterodaustroFossilModel extends SkullModelBase {
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

	public PterodaustroFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.1678F, 5.6209F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.8F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.8565F, -0.0147F, 0.343F, 0.2106F, -0.0573F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(-1.1095F, -0.6005F, -1.4961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3824F, -0.0892F, -0.3691F, 0.3184F, 0.0921F, -0.1407F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 25).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9866F, -0.2465F, 0.3853F, 0.1161F, 0.2106F, -0.0573F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 6).mirror().addBox(-0.8F, -0.4F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.8565F, -0.0147F, -0.1457F, 0.2106F, -0.0573F));

		PartDefinition body3_r1 = main.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 39).addBox(0.7F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.7599F, 0.2194F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 49).addBox(-0.2F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8F, -0.8565F, -0.0147F, 0.343F, -0.2106F, 0.0573F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 6).addBox(-0.2F, -0.4F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -0.8565F, -0.0147F, -0.1457F, -0.2106F, 0.0573F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 25).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9866F, -0.2465F, 0.3853F, 0.1161F, -0.2106F, 0.0573F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 16).addBox(-1.5F, -0.2F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.0583F, -1.2005F, 0.9987F, 0.0F, 0.0F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 49).addBox(0.1095F, -0.6005F, -1.4961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3824F, -0.0892F, -0.3691F, 0.3184F, -0.0921F, 0.1407F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 38).addBox(-0.5F, -0.1622F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(50, 11).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 6).addBox(-0.5F, 2.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.5F, -0.6F, 0.275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(36, 44).addBox(-0.5F, 0.1723F, -0.2294F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 55).addBox(-0.5F, -0.4277F, -0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.238F, -0.1567F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(17, 12).addBox(-1.0F, -0.2869F, -3.5877F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.9601F, 0.2718F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(51, 25).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 52).addBox(-0.5F, 2.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.5F, -0.6F, 0.275F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(41, 44).addBox(-0.5F, 0.1723F, -0.2294F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 55).addBox(-0.5F, -0.4277F, -0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.238F, -0.1567F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.2869F, -3.5877F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.9601F, 0.2718F, -0.4792F, -0.0114F, -0.1304F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, 1.3F, -0.6151F, -0.3042F, 0.0275F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(41, 11).addBox(-0.5F, -0.7522F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.3133F, 0.1049F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.0004F, -0.2617F, -0.0058F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 6).addBox(-1.0F, -0.1938F, -0.1463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5F, -0.467F, -2.5778F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0688F, -0.432F, 0.0036F, -0.0063F, -0.7243F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-0.5628F, -1.6375F, -1.0622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6202F, 1.3835F, -4.0652F, 0.2659F, 0.7262F, -0.3708F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-1.4366F, -1.0715F, -0.5417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6202F, 0.6835F, -4.7652F, 0.1069F, 0.4749F, 0.0655F));

		PartDefinition chest_r2 = body.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0688F, -2.132F, 0.0036F, -0.0063F, -0.7243F));

		PartDefinition chest_r3 = body.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0688F, -2.132F, 0.0059F, -0.0042F, -1.1606F));

		PartDefinition chest_r4 = body.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2312F, -4.132F, 0.1346F, 0.2831F, -1.1425F));

		PartDefinition chest_r5 = body.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(45, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2312F, -4.132F, 0.242F, 0.2001F, -0.701F));

		PartDefinition chest_r6 = body.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(35, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0688F, -0.432F, 0.0036F, 0.0063F, 0.7243F));

		PartDefinition chest_r7 = body.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(0, 56).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0688F, -2.132F, 0.0059F, 0.0042F, 1.1606F));

		PartDefinition chest_r8 = body.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(10, 56).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0688F, -2.132F, 0.0036F, 0.0063F, 0.7243F));

		PartDefinition chest_r9 = body.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(45, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2312F, -4.132F, 0.242F, -0.2001F, 0.701F));

		PartDefinition chest_r10 = body.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(55, 55).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2312F, -4.132F, 0.1346F, -0.2831F, 1.1425F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 43).addBox(0.4366F, -1.0715F, -0.5417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6202F, 0.6835F, -4.7652F, 0.1069F, -0.4749F, -0.0655F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 51).addBox(-0.4372F, -1.6375F, -1.0622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6202F, 1.3835F, -4.0652F, 0.2659F, -0.7262F, 0.3708F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 25).addBox(-2.1202F, 0.1053F, -0.4808F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6202F, 1.3835F, -4.0652F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 52).addBox(-1.1202F, 0.1984F, -1.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6202F, 1.3835F, -4.0652F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 34).addBox(-1.0F, -0.7366F, -0.2978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.533F, -4.8778F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftwing7 = body.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4599F, 0.2404F, -4.1854F, 0.2651F, -0.7585F, -0.0165F));

		PartDefinition cube_r20 = leftwing7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 30).addBox(-0.2F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 1.5708F, -0.3665F, 0.0F));

		PartDefinition cube_r21 = leftwing7.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6242F, 0.4493F, -0.2248F, 1.2678F, 0.948F, 1.8759F));

		PartDefinition cube_r22 = leftwing8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 19).addBox(-2.0988F, -0.0103F, -0.4211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.9654F, -0.1608F, -0.5313F, -0.0603F, -0.1824F, -0.0265F));

		PartDefinition cube_r23 = leftwing8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(17, 0).addBox(-3.5F, -0.45F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 12).addBox(-3.5F, -1.05F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1788F, 0.1892F, 0.4651F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftwing9 = leftwing8.addOrReplaceChild("leftwing9", CubeListBuilder.create().texOffs(34, 0).addBox(-3.978F, -0.1807F, -0.5886F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 51).addBox(-4.578F, -0.1807F, -0.5886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.4115F, -0.0206F, -0.1872F, 3.0786F, 0.4335F, -2.5914F));

		PartDefinition leftmembrane = leftwing9.addOrReplaceChild("leftmembrane", CubeListBuilder.create().texOffs(0, 6).addBox(-6.75F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.9771F, 0.3716F, -0.502F, 2.8158F, -0.3912F, -2.9774F));

		PartDefinition leftWing10 = leftmembrane.addOrReplaceChild("leftWing10", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.45F, 0.0F, 0.0F, 0.0574F, 0.0265F, -0.0502F));

		PartDefinition cube_r24 = leftWing10.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-6.9096F, -0.1799F, -0.765F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.6F, 0.0F, -0.3F, 0.0141F, -0.3837F, -0.0469F));

		PartDefinition cube_r25 = leftWing10.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(17, 6).addBox(-7.9F, -0.5F, -0.4F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0132F, -0.087F, -0.0428F));

		PartDefinition lefthand = leftwing9.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1563F, 0.2752F, -0.0881F, 2.8822F, -0.109F, -3.0031F));

		PartDefinition cube_r26 = lefthand.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 49).addBox(-4.85F, -0.5F, 0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.9925F, -0.0112F, 1.2443F, 0.0F, -0.4363F, 0.0F));

		PartDefinition rightwing7 = body.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4599F, 0.2404F, -4.1854F, -0.0316F, 0.3982F, -0.4698F));

		PartDefinition cube_r27 = rightwing7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 33).addBox(-1.8F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 1.5708F, 0.3665F, 0.0F));

		PartDefinition cube_r28 = rightwing7.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 37).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6242F, 0.4493F, -0.2248F, 0.716F, -0.9014F, -1.4154F));

		PartDefinition cube_r29 = rightwing8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 22).addBox(-0.9012F, -0.0103F, -0.4211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.9654F, -0.1608F, -0.5313F, -0.0603F, 0.1824F, 0.0265F));

		PartDefinition cube_r30 = rightwing8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(17, 3).addBox(-3.5F, -0.45F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 15).addBox(-3.5F, -1.05F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.1788F, 0.1892F, 0.4651F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightwing9 = rightwing8.addOrReplaceChild("rightwing9", CubeListBuilder.create().texOffs(34, 3).addBox(-0.022F, -0.1807F, -0.5886F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 0).addBox(3.578F, -0.1807F, -0.5886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.4115F, -0.0206F, -0.1872F, 3.1411F, -0.6374F, 2.6134F));

		PartDefinition rightmembrane = rightwing9.addOrReplaceChild("rightmembrane", CubeListBuilder.create().texOffs(0, 9).addBox(-0.25F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.9771F, 0.3716F, -0.502F, 2.8158F, 0.3912F, 2.9774F));

		PartDefinition rightWing10 = rightmembrane.addOrReplaceChild("rightWing10", CubeListBuilder.create(), PartPose.offsetAndRotation(6.45F, 0.0F, 0.0F, 0.0574F, -0.0265F, 0.0502F));

		PartDefinition cube_r31 = rightWing10.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 3).addBox(-0.0904F, -0.1799F, -0.765F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.6F, 0.0F, -0.3F, 0.0141F, 0.3837F, 0.0469F));

		PartDefinition cube_r32 = rightWing10.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(17, 9).addBox(0.9F, -0.5F, -0.4F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0132F, 0.087F, 0.0428F));

		PartDefinition righthand = rightwing9.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1563F, 0.2752F, -0.0881F, 2.8822F, 0.109F, 3.0031F));

		PartDefinition cube_r33 = righthand.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 49).addBox(3.85F, -0.5F, 0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.9925F, -0.0112F, 1.2443F, 0.0F, 0.4363F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1657F, -4.8299F, 0.5247F, -0.1298F, -0.0172F));

		PartDefinition cube_r34 = neck.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(33, 29).addBox(-0.5F, -0.1553F, -0.0295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -0.3727F, -2.7539F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0023F, -2.4039F, -0.1275F, -0.3045F, 0.0497F));

		PartDefinition cube_r35 = neck2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 39).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2494F, -2.5366F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1006F, -2.5366F, -0.1677F, -0.2577F, -0.2509F));

		PartDefinition cube_r36 = neck3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 18).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.5F, 0.404F, -2.574F, 0.0349F, 0.0F, 0.0F));

		PartDefinition throat = neck3.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.054F, 0.226F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.5645F, -1.8582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2019F, -2.4568F, -0.3996F, -0.2271F, 0.2362F));

		PartDefinition cube_r37 = neck4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(42, 34).addBox(0.5F, -0.85F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.2855F, -1.6582F, -0.1571F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1395F, -3.6582F, 1.2097F, 0.0659F, 0.178F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, -0.0491F, -1.7164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -1.1378F, -0.2162F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(18, 45).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -4.5681F, -11.8198F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(42, 29).addBox(-0.5F, -0.6438F, -2.6582F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.4324F, -9.9554F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 40).addBox(-0.5F, -0.2974F, -2.6098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.8324F, -7.6554F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, -0.7801F, -3.6845F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.7378F, -4.4162F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.8F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5378F, -1.8162F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.645F, -0.5577F, -0.2423F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(55, 12).addBox(-0.445F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 9).addBox(-0.555F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(5, 55).addBox(-0.9F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(40, 54).addBox(-0.8F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(53, 49).addBox(-0.6F, -0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, -0.3508F, -1.472F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(53, 46).addBox(0.47F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 52).addBox(0.3F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.145F, -0.1801F, 0.926F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(50, 55).addBox(-1.0F, -0.1069F, -0.8804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.155F, -0.2986F, 0.9232F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 36).addBox(-1.0F, -0.1284F, -0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.155F, 0.5014F, 1.2232F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(52, 3).addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.155F, 0.5014F, 0.7232F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(46, 44).addBox(0.2F, -0.8901F, -0.1107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.145F, 0.1199F, -1.174F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(50, 52).addBox(-0.5F, -0.8984F, -0.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.345F, 0.4199F, -0.374F, -1.0297F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.645F, -0.5577F, -0.2423F));

		PartDefinition cube_r52 = rightFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-0.555F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(55, 9).mirror().addBox(-0.445F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.1F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(40, 54).mirror().addBox(-0.2F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(53, 49).mirror().addBox(-0.4F, -0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, -0.3508F, -1.472F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-1.47F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 52).mirror().addBox(-1.3F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.145F, -0.1801F, 0.926F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(0.0F, -0.1069F, -0.8804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.155F, -0.2986F, 0.9232F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(0.0F, -0.1284F, -0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.155F, 0.5014F, 1.2232F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.155F, 0.5014F, 0.7232F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(46, 44).mirror().addBox(-1.2F, -0.8901F, -0.1107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.145F, 0.1199F, -1.174F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-0.5F, -0.8984F, -0.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.345F, 0.4199F, -0.374F, -1.0297F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5696F, -0.1994F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 53).mirror().addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 43).mirror().addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.049F, -5.433F, -12.0165F, -0.7096F, -0.1896F, 0.024F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.2904F, 0.3102F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(22, 53).mirror().addBox(-0.2904F, -0.2898F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.3161F, -5.2771F, -11.2464F, -0.8492F, -0.1896F, 0.024F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(11, 32).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3161F, -3.5771F, -10.3464F, -0.6572F, -0.1896F, 0.024F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(12, 53).mirror().addBox(-1.0F, -0.6723F, -1.099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 53).mirror().addBox(-1.0F, -0.6723F, -0.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.9016F, -12.5608F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-0.4F, -0.713F, -0.3904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -4.8016F, -12.5608F, -1.1568F, -0.104F, 0.0933F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(40, 39).mirror().addBox(-0.4F, -0.0768F, 0.8809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -4.8016F, -12.5608F, -0.6681F, -0.104F, 0.0933F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.2722F, -0.1669F, -0.191F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -4.1651F, -9.525F, -0.3543F, -0.0603F, -0.1163F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(13, 18).mirror().addBox(-0.0756F, -1.6855F, -3.7394F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -1.1651F, -7.025F, -0.4415F, -0.0603F, -0.1163F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.0F, -0.6421F, -0.3322F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1546F, -10.1127F, -0.3927F, -0.0175F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-1.0F, 0.2203F, 2.9019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1546F, -10.1127F, -0.1222F, -0.0175F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(17, 53).mirror().addBox(-1.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 16).mirror().addBox(-1.0F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(17, 53).addBox(0.2F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 16).addBox(0.2F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, -0.76F, -0.3735F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-1.0F, -0.3F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(30, 12).addBox(0.2F, -0.3F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.1F, -0.76F, -0.3735F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(27, 53).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 43).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.049F, -5.433F, -12.0165F, -0.7096F, 0.1896F, -0.024F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(53, 22).addBox(-0.7096F, 0.3102F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(22, 53).addBox(-0.7096F, -0.2898F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.3161F, -5.2771F, -11.2464F, -0.8492F, 0.1896F, -0.024F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(11, 32).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3161F, -3.5771F, -10.3464F, -0.6572F, 0.1896F, -0.024F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(12, 53).addBox(0.0F, -0.6723F, -1.099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 53).addBox(0.0F, -0.6723F, -0.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -4.9016F, -12.5608F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(7, 48).addBox(-0.6F, -0.713F, -0.3904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, -4.8016F, -12.5608F, -1.1568F, 0.104F, -0.0933F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(40, 39).addBox(-0.6F, -0.0768F, 0.8809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, -4.8016F, -12.5608F, -0.6681F, 0.104F, -0.0933F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 24).addBox(-0.7278F, -0.1669F, -0.191F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8F, -4.1651F, -9.525F, -0.3543F, 0.0603F, 0.1163F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(13, 18).addBox(-0.9244F, -1.6855F, -3.7394F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -1.1651F, -7.025F, -0.4415F, 0.0603F, 0.1163F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, -0.6421F, -0.3322F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.1546F, -10.1127F, -0.3927F, 0.0175F, 0.0F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(11, 25).mirror().addBox(-0.0702F, -0.7987F, -0.2895F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0921F, -6.7695F, -0.1904F, -0.0249F, -0.1285F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(-0.1672F, -0.5297F, -0.1954F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6921F, -6.7695F, -0.2769F, -0.0192F, -0.1307F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 25).addBox(-0.9298F, -0.7987F, -0.2895F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, -2.0921F, -6.7695F, -0.1904F, 0.0249F, 0.1285F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(24, 18).addBox(-0.8328F, -0.5297F, -0.1954F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.6921F, -6.7695F, -0.2769F, 0.0192F, 0.1307F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(22, 31).addBox(0.0F, 0.2203F, 2.9019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.1546F, -10.1127F, -0.1222F, 0.0175F, 0.0F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(46, 48).mirror().addBox(-0.0868F, -0.163F, -0.4718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.36F, -3.3735F, -0.0583F, 0.1139F, -0.1983F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(29, 44).mirror().addBox(-0.0752F, -0.8266F, -0.3804F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.36F, -3.3735F, -0.4654F, 0.0609F, -0.2029F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-0.0538F, -0.972F, 1.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.36F, -3.3735F, -0.5691F, 0.0475F, -0.2006F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(46, 48).addBox(-0.9132F, -0.163F, -0.4718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.36F, -3.3735F, -0.0583F, -0.1139F, 0.1983F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 19).addBox(-0.9462F, -0.972F, 1.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.36F, -3.3735F, -0.5691F, -0.0475F, 0.2006F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(29, 44).addBox(-0.9248F, -0.8266F, -0.3804F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.36F, -3.3735F, -0.4654F, -0.0609F, 0.2029F));

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