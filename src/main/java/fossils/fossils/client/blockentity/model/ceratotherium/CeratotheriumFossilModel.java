package fossils.fossils.client.blockentity.model.ceratotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CeratotheriumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public CeratotheriumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.0258F, 15.6233F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 77).addBox(0.0F, -1.3125F, 0.0115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 67).addBox(0.0F, -1.0882F, 0.1327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -0.7F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 60).addBox(0.0F, -1.0986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -2.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3323F, -2.2263F, 0.2199F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 81).mirror().addBox(-1.8638F, -0.5F, -1.0647F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8243F, 4.4924F, 1.6929F, -2.2462F, -0.6123F, 1.969F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 60).mirror().addBox(-2.45F, -0.5F, -0.725F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.76F, 3.2974F, -0.3013F, -1.1609F, -0.7882F, 0.728F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.1F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2888F, 7.1996F, 6.8035F, -0.0654F, 1.2173F, -2.9259F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 63).mirror().addBox(-0.4F, 0.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2756F, 7.4581F, 5.9915F, -0.2442F, 1.477F, -3.1076F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-0.4F, -0.7F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.5939F, 5.5801F, 2.9908F, -0.1057F, -0.2182F, 0.6792F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 115).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6647F, 0.2F, 0.0F, -2.2902F, 0.9237F, 2.8013F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 53).mirror().addBox(-5.0261F, -2.8826F, -0.458F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6323F, 5.4491F, 2.5396F, -2.6649F, -0.8159F, 1.6078F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-1.672F, -0.5F, -0.0354F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8243F, 4.4924F, 1.6929F, -1.3F, -0.8462F, 0.6655F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(0.3645F, -0.0034F, -2.076F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.1663F, 5.0594F, 2.3783F, -0.5877F, 0.1238F, -0.6787F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0242F, -0.6971F, -0.0665F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0641F, 0.6136F, -2.4271F, -1.5425F, -0.7614F, 0.8068F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(117, 4).mirror().addBox(-2.3159F, -0.1027F, 2.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -1.8681F, 1.0766F, -2.9847F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(116, 66).mirror().addBox(-3.9399F, -0.1027F, 0.1802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -2.541F, 0.6394F, 2.4506F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-2.7195F, -0.6563F, -2.0929F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -2.622F, -0.0592F, 2.2115F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-3.2036F, -0.7347F, -0.7543F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1413F, 2.7344F, 0.3033F, -2.2173F, -0.4358F, 1.9086F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 60).mirror().addBox(-3.456F, -0.7347F, -0.0761F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1413F, 2.7344F, 0.3033F, -2.0135F, -0.6422F, 1.5173F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 95).mirror().addBox(-2.5745F, -0.3825F, -0.8126F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4278F, 7.125F, 7.5561F, 0.7931F, -0.4147F, -2.809F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(91, 34).mirror().addBox(-0.575F, -0.5F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9884F, 5.9331F, 7.4946F, -1.0296F, 1.477F, -3.1076F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 110).mirror().addBox(-0.4F, -0.7F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.5939F, 5.5801F, 2.9908F, 0.2163F, -0.8967F, 0.6264F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 102).mirror().addBox(1.9791F, -0.8188F, -1.1264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0598F, 5.5957F, 2.1474F, -0.0205F, -0.5325F, 0.6032F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5288F, -0.8188F, -5.0065F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0598F, 5.5957F, 2.1474F, -2.818F, -1.5153F, -2.8719F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(63, 110).mirror().addBox(-1.35F, -0.325F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9935F, 6.3205F, 4.7638F, 0.1698F, -0.9415F, 0.5914F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(104, 115).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -2.2902F, -0.9237F, -2.8013F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 53).addBox(4.0261F, -2.8826F, -0.458F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0324F, 5.4491F, 2.5396F, -2.6649F, 0.8159F, -1.6078F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(39, 60).addBox(-1.55F, -0.5F, -0.725F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0953F, 3.2974F, -0.3013F, -1.1609F, 0.7882F, -0.728F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(96, 81).addBox(-1.1362F, -0.5F, -1.0647F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1596F, 4.4924F, 1.6929F, -2.2462F, 0.6123F, -1.969F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 65).addBox(-1.328F, -0.5F, -0.0354F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1596F, 4.4924F, 1.6929F, -1.3F, 0.8462F, -0.6655F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(54, 0).addBox(-5.3645F, -0.0034F, -2.076F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.5016F, 5.0594F, 2.3783F, -0.5877F, -0.1238F, 0.6787F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 61).addBox(-4.0242F, -0.6971F, -0.0665F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3994F, 0.6136F, -2.4271F, -1.5425F, 0.7614F, -0.8068F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(117, 4).addBox(1.3159F, -0.1027F, 2.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -1.8681F, -1.0766F, 2.9847F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(116, 66).addBox(2.9399F, -0.1027F, 0.1802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -2.541F, -0.6394F, -2.4506F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(86, 72).addBox(0.7195F, -0.6563F, -2.0929F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -2.622F, 0.0592F, -2.2115F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(53, 69).addBox(0.2036F, -0.7347F, -0.7543F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4766F, 2.7344F, 0.3033F, -2.2173F, 0.4358F, -1.9086F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(13, 60).addBox(-0.544F, -0.7347F, -0.0761F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4766F, 2.7344F, 0.3033F, -2.0135F, 0.6422F, -1.5173F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 95).addBox(-0.4255F, -0.3825F, -0.8126F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7631F, 7.125F, 7.5561F, 0.7931F, 0.4147F, 2.809F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 80).addBox(-0.9F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3759F, 7.1996F, 6.8035F, -0.0654F, -1.2173F, 2.9259F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(79, 63).addBox(-0.6F, 0.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6109F, 7.4581F, 5.9915F, -0.2442F, -1.477F, 3.1076F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(91, 34).addBox(-2.425F, -0.5F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3237F, 5.9331F, 7.4946F, -1.0296F, -1.477F, 3.1076F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(5, 112).addBox(-1.6F, -0.7F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9292F, 5.5801F, 2.9908F, -0.1057F, 0.2182F, -0.6792F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(70, 110).addBox(-1.6F, -0.7F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9292F, 5.5801F, 2.9908F, 0.2163F, 0.8967F, -0.6264F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 102).addBox(-2.9791F, -0.8188F, -1.1264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3951F, 5.5957F, 2.1474F, -0.0205F, 0.5325F, -0.6032F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 48).addBox(-0.4712F, -0.8188F, -5.0065F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.3951F, 5.5957F, 2.1474F, -2.818F, 1.5153F, 2.8719F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(63, 110).addBox(-0.65F, -0.325F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3288F, 6.3205F, 4.7638F, 0.1698F, 0.9415F, -0.5914F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(93, 101).addBox(-0.5F, -0.4748F, 0.2262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3323F, 8.0805F, 4.309F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 10).addBox(-0.5F, -0.4681F, -2.7259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3323F, 8.0805F, 4.309F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8F, 6.5278F, 2.1848F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 58).addBox(-1.0F, -1.9F, -0.525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2944F, -0.5035F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(75, 21).addBox(-1.0F, -4.3F, -1.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5195F, 0.5806F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(113, 58).addBox(-2.1F, 0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2605F, 3.2575F, 1.0087F, -0.144F, 0.0507F, 0.5038F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(87, 81).addBox(-1.0F, -0.3F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5305F, 1.0897F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 107).addBox(-1.0F, 0.1067F, -1.1029F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0631F, -1.9958F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(87, 57).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5631F, 0.0042F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 76).addBox(-0.0927F, 0.7424F, -0.0504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1449F, -0.0575F, -0.3348F, -0.152F, -0.4106F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 78).addBox(-1.0F, -0.1135F, -0.0504F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.1449F, -0.0575F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(49, 102).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1395F, 0.4841F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(35, 101).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4722F, 0.0783F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(42, 102).addBox(-1.0F, 0.0F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.0889F, 0.169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 102).addBox(-1.0F, -0.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.3831F, -0.8219F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(14, 95).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.3936F, -0.7224F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(87, 9).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.2727F, -2.6462F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 90).addBox(-1.5F, -0.6057F, -0.3707F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9666F, -1.5055F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 86).addBox(-1.5F, -4.3498F, 0.0766F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.999F, 0.5068F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(67, 58).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.6307F, -1.4599F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 41).addBox(-1.5F, -18.3121F, -3.541F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 25.949F, 5.3194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 87).addBox(-1.0F, -0.9499F, 0.6645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8652F, -2.2822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2228F, -1.5964F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(57, 64).addBox(-1.5F, -0.8F, -1.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(30, 82).addBox(0.0F, -0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.3972F, 2.01F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(56, 82).addBox(-1.9F, -7.9918F, -1.048F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 70).addBox(-2.4F, -7.235F, 0.2314F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(49, 82).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(61, 16).addBox(-1.5F, -0.1443F, -1.1179F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.4924F, -0.072F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(112, 113).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.0643F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(94, 113).addBox(-0.5F, -2.4857F, -1.2115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.8414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(15, 41).addBox(-2.0F, -1.0696F, -2.9933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2955F, 0.2929F, 1.0996F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0304F, -2.6933F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(54, 11).addBox(-2.1F, -1.8F, 0.3F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8F, 6.5278F, 2.1848F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(78, 81).addBox(-1.0F, -1.9F, -0.525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2944F, -0.5035F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(75, 34).addBox(-1.0F, -4.3F, -1.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5195F, 0.5806F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 113).addBox(1.1F, 0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.2605F, 3.2575F, 1.0087F, -0.144F, -0.0507F, -0.5038F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(90, 26).addBox(-2.0F, -0.3F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5305F, 1.0897F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(107, 98).addBox(-1.0F, 0.1067F, -1.1029F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0631F, -1.9958F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 89).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5631F, 0.0042F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(93, 91).addBox(-0.9073F, 0.7424F, -0.0504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1449F, -0.0575F, -0.3348F, 0.152F, 0.4106F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 50).addBox(-1.0F, -0.1135F, -0.0504F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.1449F, -0.0575F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(107, 94).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1395F, 0.4841F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(101, 84).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4722F, 0.0783F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(107, 90).addBox(-1.0F, 0.0F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.0889F, 0.169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(107, 76).addBox(-1.0F, -0.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.3831F, -0.8219F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(86, 97).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.3936F, -0.7224F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(89, 51).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.2727F, -2.6462F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 91).addBox(-1.5F, -0.6057F, -0.3707F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9666F, -1.5055F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(47, 89).addBox(-1.5F, -4.3498F, 0.0766F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.999F, 0.5068F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(68, 63).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.6307F, -1.4599F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(9, 74).addBox(-1.5F, -18.3121F, -3.541F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 25.949F, 5.3194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(112, 8).addBox(-1.0F, -0.9499F, 0.6645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8652F, -2.2822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2228F, -1.5964F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 65).addBox(-1.5F, -0.8F, -1.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(35, 82).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.3972F, 2.01F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 83).addBox(-0.1F, -7.9918F, -1.048F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(11, 70).addBox(-0.6F, -7.235F, 0.2314F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(63, 82).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(64, 22).addBox(-1.5F, -0.1443F, -1.1179F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.4924F, -0.072F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(114, 27).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.0643F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(12, 114).addBox(-0.5F, -2.4857F, -1.2115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.8414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(43, 41).addBox(-2.0F, -1.0696F, -2.9933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2955F, 0.2929F, 1.0996F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0304F, -2.6933F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(26, 56).addBox(-1.9F, -1.8F, 0.3F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.6F, -0.0349F, 0.0436F, -0.0015F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(6, 119).addBox(0.0F, -1.2845F, -0.6103F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6064F, -0.259F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(3, 119).addBox(0.0F, -1.3545F, -0.0038F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.331F, -2.7389F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 119).addBox(0.0F, -2.0398F, -0.0023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.531F, -4.7389F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(106, 118).addBox(0.0F, -2.1115F, -0.0418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.031F, -6.6389F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(103, 118).addBox(0.0F, -2.0402F, 0.0197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5315F, -8.7301F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(100, 118).addBox(0.0F, -1.5904F, -0.0882F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9434F, -10.6974F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(49, 78).addBox(0.0F, -1.3057F, 0.0627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -12.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(114, 36).mirror().addBox(-2.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3F, -12.3F, -0.2005F, -0.0608F, -0.2906F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.4768F, -0.2399F, -1.6006F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(103, 55).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.5279F, -0.0445F, -1.2457F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(103, 47).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.523F, 0.0873F, -1.0194F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(108, 4).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5015F, 0.115F, -0.9648F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(107, 53).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5133F, -0.0128F, -1.1938F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.4741F, -0.2051F, -1.5489F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.48F, 0.1426F, -0.9097F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(103, 10).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.4988F, 0.0189F, -1.1414F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.4715F, -0.1703F, -1.497F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4689F, -0.1354F, -1.4625F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(103, 8).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4842F, 0.0507F, -1.106F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(100, 102).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4582F, 0.1701F, -0.8714F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(102, 70).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.4252F, 0.2112F, -0.8302F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(102, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.4623F, 0.0983F, -1.0694F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(33, 2).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.465F, -0.0832F, -1.428F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.4252F, 0.2112F, -0.8128F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(101, 88).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.4623F, 0.0983F, -1.052F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(25, 19).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.465F, -0.0832F, -1.4105F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(114, 36).addBox(0.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3F, -12.3F, -0.2005F, 0.0608F, 0.2906F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(98, 43).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.4768F, 0.2399F, 1.6006F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(103, 55).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.5279F, 0.0445F, 1.2457F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(103, 47).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.523F, -0.0873F, 1.0194F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(108, 4).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5015F, -0.115F, 0.9648F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 53).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5133F, 0.0128F, 1.1938F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(69, 56).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.4741F, 0.2051F, 1.5489F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(103, 45).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.48F, -0.1426F, 0.9097F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(103, 10).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.4988F, -0.0189F, 1.1414F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(61, 4).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.4715F, 0.1703F, 1.497F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 37).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4689F, 0.1354F, 1.4625F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(103, 8).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4842F, -0.0507F, 1.106F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(100, 102).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4582F, -0.1701F, 0.8714F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(102, 70).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.4252F, -0.2112F, 0.8302F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(102, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.4623F, -0.0983F, 1.0694F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(33, 2).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.465F, 0.0832F, 1.428F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(56, 102).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.4252F, -0.2112F, 0.8128F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(101, 88).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.4623F, -0.0983F, 1.052F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(25, 19).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.465F, 0.0832F, 1.4105F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1512F, -0.2526F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -13.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -13.5F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(65, 104).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1048F, -0.3643F, -0.2387F, 0.3506F, -0.6738F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(104, 63).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1048F, -0.3643F, -0.321F, 0.2778F, -0.9384F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1048F, -0.3643F, -0.4006F, 0.1343F, -1.3219F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1952F, -2.4643F, -0.4356F, 0.1279F, -1.2924F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1952F, -2.4643F, -0.357F, 0.2848F, -0.9144F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(104, 59).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1952F, -2.4643F, -0.2724F, 0.3663F, -0.6516F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 104).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2951F, -4.4643F, -0.2823F, 0.3638F, -0.6373F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(103, 57).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2951F, -4.4643F, -0.3656F, 0.28F, -0.8989F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2951F, -4.4643F, -0.4415F, 0.1204F, -1.2753F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(65, 104).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1048F, -0.3643F, -0.2387F, -0.3506F, 0.6738F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(104, 63).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1048F, -0.3643F, -0.321F, -0.2778F, 0.9384F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 21).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1048F, -0.3643F, -0.4006F, -0.1343F, 1.3219F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 19).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1952F, -2.4643F, -0.4356F, -0.1279F, 1.2924F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(104, 61).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1952F, -2.4643F, -0.357F, -0.2848F, 0.9144F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(104, 59).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1952F, -2.4643F, -0.2724F, -0.3663F, 0.6516F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(56, 104).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2951F, -4.4643F, -0.2823F, -0.3638F, 0.6373F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(103, 57).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2951F, -4.4643F, -0.3656F, -0.28F, 0.8989F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 17).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2951F, -4.4643F, -0.4415F, -0.1204F, 1.2753F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(33, 4).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0157F, -0.8999F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(15, 119).addBox(0.0F, -1.2725F, -0.1355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8742F, -0.9236F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(119, 51).addBox(0.0F, -1.4496F, -0.11F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7742F, -2.8236F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(119, 7).addBox(0.0F, -1.3748F, -0.259F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3242F, -4.7736F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(119, 55).addBox(-0.005F, -2.2315F, -0.0674F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3242F, -4.7736F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(100, 94).addBox(-3.5339F, -1.3304F, 0.4344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6339F, 10.0553F, -15.2489F, -1.1345F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6597F, -4.4198F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(42, 71).addBox(-0.01F, -3.8674F, -0.9752F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5949F, -5.6976F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(74, 113).addBox(0.0F, -3.8616F, -0.0706F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8051F, -7.7976F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(39, 56).addBox(0.0F, -1.9891F, 0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0051F, -2.5726F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(119, 47).addBox(-0.01F, -1.1705F, -1.0543F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1949F, -0.5726F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(17, 114).addBox(-0.01F, -2.1705F, -1.0543F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7949F, -2.3976F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(119, 38).addBox(0.0F, -1.9891F, 0.0256F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4051F, -4.3976F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(37, 91).addBox(-0.01F, -2.9704F, -0.9543F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5949F, -3.9976F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(20, 117).addBox(0.0F, -2.8892F, 0.0255F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6051F, -5.9976F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(109, 18).mirror().addBox(-0.7155F, -1.7345F, -4.906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(86, 108).mirror().addBox(-0.7155F, -2.1345F, -4.906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 1.6012F, -0.2111F, 0.3063F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(105, 113).mirror().addBox(-7.1256F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.362F, -8.7641F, -0.5261F, -0.138F, -1.4173F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(23, 107).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.362F, -8.7641F, -0.5078F, 0.1992F, -0.8432F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(100, 106).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.362F, -8.7641F, -0.5384F, 0.0678F, -1.0718F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(79, 106).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.562F, -6.7641F, -0.5078F, 0.1992F, -0.8432F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(106, 65).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.562F, -6.7641F, -0.5384F, 0.0678F, -1.0718F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.562F, -6.7641F, -0.5261F, -0.138F, -1.4173F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(7, 106).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.262F, -5.2641F, -0.5005F, 0.1367F, -1.068F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(105, 81).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.262F, -5.2641F, -0.4538F, 0.2575F, -0.8309F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(47, 39).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.262F, -5.2641F, -0.5141F, -0.0603F, -1.4185F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(28, 105).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.562F, -3.4641F, -0.4472F, 0.3022F, -0.719F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(100, 104).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.562F, -3.4641F, -0.505F, 0.1817F, -0.9586F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(33, 12).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.562F, -3.4641F, -0.5336F, -0.0196F, -1.3077F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(25, 21).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.038F, -1.5641F, -0.5225F, 0.0054F, -1.282F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(100, 108).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.038F, -1.5641F, -0.4855F, 0.2014F, -0.9292F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(108, 25).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.038F, -1.5641F, -0.4228F, 0.3168F, -0.6859F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(116, 105).mirror().addBox(-0.7562F, 2.4639F, -3.3499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, -2.0291F, -0.2111F, 0.3063F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(72, 94).mirror().addBox(-0.7155F, 2.8975F, -1.7178F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, -2.8582F, -0.2111F, 0.3063F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(114, 49).mirror().addBox(-0.7155F, 2.4962F, 1.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8488F, 2.2072F, -5.9681F, 1.8979F, -0.2111F, 0.3063F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(16, 78).mirror().addBox(-0.7155F, 0.8842F, -0.5986F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 2.4389F, -0.2111F, 0.3063F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(9, 78).mirror().addBox(-0.7155F, 1.0206F, -0.5519F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 2.8142F, -0.2111F, 0.3063F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(32, 32).mirror().addBox(-0.7155F, -1.035F, -3.6764F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 1.0339F, -0.2111F, 0.3063F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4654F, -0.061F, -6.8456F, 1.2783F, -0.2111F, 0.3063F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.1271F, -2.06F, -4.0942F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 1.4004F, 0.4061F, 0.1384F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(89, 113).mirror().addBox(-0.7155F, -2.7438F, -1.8958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 1.4005F, -0.2111F, 0.3063F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.9115F, 1.6469F, -7.2644F, 1.3917F, -0.2111F, 0.3063F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(113, 72).mirror().addBox(-0.7155F, -2.8898F, -0.5675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.1488F, 2.2072F, -5.9681F, 1.7408F, -0.2111F, 0.3063F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6269F, 4.3523F, -7.8883F, 1.6186F, -0.2111F, 0.3063F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.0852F, 5.844F, -7.9484F, 0.9641F, -0.2111F, 0.3063F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(108, 16).mirror().addBox(-2.9132F, -0.0437F, -0.6808F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0061F, 16.0376F, -3.1567F, -0.4611F, 0.833F, -0.5622F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(25, 17).mirror().addBox(-12.3529F, 1.7183F, -0.6808F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0061F, 16.0376F, -3.1567F, 0.3299F, 0.8805F, 0.447F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-10.6236F, 1.4102F, -0.6712F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2905F, 15.6992F, -3.3361F, 0.0694F, 0.7806F, 0.3911F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(-2.1453F, 0.1491F, -0.6712F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2905F, 15.6992F, -3.3361F, -0.4967F, 0.6331F, -0.4489F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(104, 74).mirror().addBox(-2.0986F, 0.0548F, -0.5136F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4245F, 15.9087F, -3.2567F, -0.3596F, 0.5006F, -0.3606F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(33, 14).mirror().addBox(-9.6431F, 1.3067F, -0.5136F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4245F, 15.9087F, -3.2567F, 0.0514F, 0.6054F, 0.3941F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-3.0957F, 0.133F, -0.5537F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.251F, 15.6349F, -3.7155F, -0.2511F, 0.3753F, -0.2019F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(64, 28).mirror().addBox(-8.3923F, 1.9693F, -0.5537F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.251F, 15.6349F, -3.7155F, 0.0399F, 0.4466F, 0.5009F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-2.4285F, 0.024F, -0.8932F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4448F, 15.1207F, -4.343F, -0.2231F, 0.2979F, -0.2043F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-6.925F, 1.4807F, -0.8932F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4448F, 15.1207F, -4.343F, 0.0083F, 0.3701F, 0.4766F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 104).mirror().addBox(-5.0731F, 1.4635F, -0.5701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4679F, 14.1884F, -6.025F, -0.021F, 0.3121F, 0.5291F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(-2.5364F, -0.0788F, -0.5701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4679F, 14.1884F, -6.025F, -0.208F, 0.2353F, -0.138F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(113, 62).mirror().addBox(-1.9079F, -0.065F, -0.7053F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2773F, 13.5777F, -7.4432F, -0.284F, 0.1047F, 0.0011F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-5.5629F, 1.0963F, -0.7053F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2773F, 13.5777F, -7.4432F, -0.1657F, 0.2539F, 0.6406F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 113).mirror().addBox(-1.6883F, 0.0986F, -0.3984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7339F, 11.6956F, -9.1291F, -0.3148F, 0.0565F, 0.0021F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-4.1241F, 1.2636F, -0.3984F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7339F, 11.6956F, -9.1291F, -0.1861F, 0.2615F, 0.7719F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(100, 106).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.362F, -8.7641F, -0.5384F, -0.0678F, 1.0718F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 107).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.362F, -8.7641F, -0.5078F, -0.1992F, 0.8432F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(105, 113).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.362F, -8.7641F, -0.5261F, 0.138F, 1.4173F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(84, 37).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.562F, -6.7641F, -0.5261F, 0.138F, 1.4173F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(106, 65).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.562F, -6.7641F, -0.5384F, -0.0678F, 1.0718F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(79, 106).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.562F, -6.7641F, -0.5078F, -0.1992F, 0.8432F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(7, 106).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.262F, -5.2641F, -0.5005F, -0.1367F, 1.068F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(105, 81).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.262F, -5.2641F, -0.4538F, -0.2575F, 0.8309F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(47, 39).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.262F, -5.2641F, -0.5141F, 0.0603F, 1.4185F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(28, 105).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.562F, -3.4641F, -0.4472F, -0.3022F, 0.719F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(100, 104).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.562F, -3.4641F, -0.505F, -0.1817F, 0.9586F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(33, 12).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.562F, -3.4641F, -0.5336F, 0.0196F, 1.3077F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(25, 21).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.038F, -1.5641F, -0.5225F, -0.0054F, 1.282F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(100, 108).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.038F, -1.5641F, -0.4855F, -0.2014F, 0.9292F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(108, 25).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.038F, -1.5641F, -0.4228F, -0.3168F, 0.6859F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(116, 105).addBox(-0.2438F, 2.4639F, -3.3499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, -2.0291F, 0.2111F, -0.3063F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(72, 94).addBox(-0.2845F, 2.8975F, -1.7178F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, -2.8582F, 0.2111F, -0.3063F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(114, 49).addBox(-0.2845F, 2.4962F, 1.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.8488F, 2.2072F, -5.9681F, 1.8979F, 0.2111F, -0.3063F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(16, 78).addBox(-0.2845F, 0.8842F, -0.5986F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 2.4389F, 0.2111F, -0.3063F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(9, 78).addBox(-0.2845F, 1.0206F, -0.5519F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 2.8142F, 0.2111F, -0.3063F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(109, 18).addBox(-0.2845F, -1.7345F, -4.906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(86, 108).addBox(-0.2845F, -2.1345F, -4.906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 1.6012F, 0.2111F, -0.3063F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(32, 32).addBox(-0.2845F, -1.035F, -3.6764F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 1.0339F, 0.2111F, -0.3063F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4654F, -0.061F, -6.8456F, 1.2783F, 0.2111F, -0.3063F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 23).addBox(-0.8729F, -2.06F, -4.0942F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 1.4004F, -0.4061F, -0.1384F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(89, 113).addBox(-0.2845F, -2.7438F, -1.8958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 1.4005F, 0.2111F, -0.3063F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 85).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.9115F, 1.6469F, -7.2644F, 1.3917F, 0.2111F, -0.3063F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(113, 72).addBox(-0.2845F, -2.8898F, -0.5675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.1488F, 2.2072F, -5.9681F, 1.7408F, 0.2111F, -0.3063F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(96, 8).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6269F, 4.3523F, -7.8883F, 1.6186F, 0.2111F, -0.3063F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(95, 68).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.0852F, 5.844F, -7.9484F, 0.9641F, 0.2111F, -0.3063F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(108, 16).addBox(-0.0868F, -0.0437F, -0.6808F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0061F, 16.0376F, -3.1567F, -0.4611F, -0.833F, 0.5622F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(25, 17).addBox(2.3529F, 1.7183F, -0.6808F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0061F, 16.0376F, -3.1567F, 0.3299F, -0.8805F, -0.447F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(33, 0).addBox(1.6236F, 1.4102F, -0.6712F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2905F, 15.6992F, -3.3361F, 0.0694F, -0.7806F, -0.3911F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(85, 19).addBox(0.1453F, 0.1491F, -0.6712F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2905F, 15.6992F, -3.3361F, -0.4967F, -0.6331F, 0.4489F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(104, 74).addBox(-0.9014F, 0.0548F, -0.5136F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4245F, 15.9087F, -3.2567F, -0.3596F, -0.5006F, 0.3606F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(33, 14).addBox(1.6431F, 1.3067F, -0.5136F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4245F, 15.9087F, -3.2567F, 0.0514F, -0.6054F, -0.3941F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(108, 6).addBox(0.0957F, 0.133F, -0.5537F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.251F, 15.6349F, -3.7155F, -0.2511F, -0.3753F, 0.2019F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(64, 28).addBox(2.3923F, 1.9693F, -0.5537F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.251F, 15.6349F, -3.7155F, 0.0399F, -0.4466F, -0.5009F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(76, 4).addBox(-0.5715F, 0.024F, -0.8932F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4448F, 15.1207F, -4.343F, -0.2231F, -0.2979F, 0.2043F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(72, 19).addBox(1.925F, 1.4807F, -0.8932F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4448F, 15.1207F, -4.343F, 0.0083F, -0.3701F, -0.4766F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(74, 104).addBox(2.0731F, 1.4635F, -0.5701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4679F, 14.1884F, -6.025F, -0.021F, -0.3121F, -0.5291F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(104, 72).addBox(-0.4636F, -0.0788F, -0.5701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4679F, 14.1884F, -6.025F, -0.208F, -0.2353F, 0.138F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(113, 62).addBox(-0.0921F, -0.065F, -0.7053F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2773F, 13.5777F, -7.4432F, -0.284F, -0.1047F, -0.0011F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(82, 55).addBox(1.5629F, 1.0963F, -0.7053F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2773F, 13.5777F, -7.4432F, -0.1657F, -0.2539F, -0.6406F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(57, 113).addBox(-0.3117F, 0.0986F, -0.3984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7339F, 11.6956F, -9.1291F, -0.3148F, -0.0565F, -0.0021F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(98, 53).addBox(1.1241F, 1.2636F, -0.3984F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7339F, 11.6956F, -9.1291F, -0.1861F, -0.2615F, -0.7719F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(43, 53).addBox(-3.1339F, -1.7582F, -0.0536F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6339F, 14.6956F, -8.1291F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(26, 61).addBox(-3.1339F, -0.6739F, 1.5411F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6339F, 9.3956F, -10.8291F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(109, 115).addBox(0.0F, -3.0191F, -1.0363F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4174F, -6.8997F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(64, 69).addBox(0.0F, -5.9062F, 0.0917F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8826F, -9.6997F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -0.0382F, -5.0655F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.7826F, -5.9997F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(19, 23).addBox(-1.0F, -1.908F, 4.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.1826F, -9.9997F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8202F, 8.0793F, -7.5659F, 0.9332F, 0.008F, -0.1307F));

		PartDefinition cube_r275 = leftarm.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(98, 40).addBox(-1.5002F, -0.9532F, -0.9937F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6002F, 7.5423F, 1.2873F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftarm.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(98, 37).addBox(-1.5002F, -0.6376F, 0.0559F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6002F, 6.4423F, 0.6873F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftarm.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(75, 68).addBox(-1.5002F, -0.0206F, -0.8839F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6002F, 6.4423F, 0.6873F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftarm.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(28, 98).addBox(-1.5002F, -0.7992F, -0.2088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6002F, 6.1423F, 0.8873F, -1.2995F, -0.0103F, 0.0048F));

		PartDefinition cube_r279 = leftarm.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(97, 65).addBox(-1.5002F, -0.8218F, -0.9495F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6002F, 6.1423F, 0.8873F, -0.9505F, -0.0103F, 0.0048F));

		PartDefinition cube_r280 = leftarm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(7, 91).addBox(-0.5044F, -1.4094F, -1.3435F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, -1.2827F, -0.1731F, 0.1736F));

		PartDefinition cube_r281 = leftarm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(7, 97).addBox(-0.5F, -1.4F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.6598F, -0.3625F, 0.1475F, -2.068F, -0.1739F, 0.1729F));

		PartDefinition cube_r282 = leftarm.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(117, 116).addBox(-0.5054F, -0.5052F, -2.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, -1.6753F, -0.1739F, 0.1729F));

		PartDefinition cube_r283 = leftarm.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(65, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.058F, -0.6231F, -1.8308F, -0.4798F, -0.1739F, 0.1729F));

		PartDefinition cube_r284 = leftarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(114, 38).addBox(0.1F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5894F, 0.3931F, -0.1931F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r285 = leftarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(86, 102).addBox(-1.0F, -1.5F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5894F, 1.7477F, -1.1445F, -0.1746F, 0.0014F, -0.001F));

		PartDefinition cube_r286 = leftarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(117, 15).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2627F, 3.1761F, -1.0937F, -0.4973F, -0.1731F, 0.1736F));

		PartDefinition cube_r287 = leftarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(53, 77).addBox(-0.5044F, 0.3633F, -1.5775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, 0.2619F, -0.1731F, 0.1736F));

		PartDefinition cube_r288 = leftarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(87, 85).addBox(-1.0F, -6.5475F, -0.3419F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.6F, 7.8209F, 2.2038F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r289 = leftarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(44, 97).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(23, 78).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 3.2083F, 0.4443F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8292F, 7.8651F, 0.1884F, -1.2975F, 0.0806F, 0.1003F));

		PartDefinition cube_r290 = leftarm2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 103).addBox(-0.1749F, 0.078F, -1.2076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7936F, 0.4361F, -0.5598F, 1.5708F, -1.3439F, -1.5097F));

		PartDefinition cube_r291 = leftarm2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(37, 96).addBox(-0.6306F, 4.8439F, -1.0308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7936F, 0.4361F, -0.5598F, 1.5272F, -1.4312F, -1.5097F));

		PartDefinition cube_r292 = leftarm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(84, 30).addBox(0.0507F, 0.8724F, -1.2076F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7936F, 0.4361F, -0.5598F, 0.0F, -1.5708F, 0.0611F));

		PartDefinition cube_r293 = leftarm2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(14, 85).addBox(-0.2F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, 7.5057F, 0.0963F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r294 = leftarm2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(101, 0).addBox(1.4F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, -1.5081F, 0.1246F, -1.5708F, -0.4014F, 1.5708F));

		PartDefinition cube_r295 = leftarm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(68, 68).addBox(0.2744F, -1.0299F, -1.4596F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.236F, 1.5425F, -0.1906F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r296 = leftarm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(91, 39).addBox(-0.4256F, -0.3299F, -1.4596F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.236F, 0.3298F, 1.2549F, -1.5708F, -1.3003F, 1.5708F));

		PartDefinition cube_r297 = leftarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(92, 4).addBox(-1.0129F, -1.2114F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, 0.2842F, 1.7913F, 1.5708F, -0.5236F, -1.5708F));

		PartDefinition cube_r298 = leftarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(91, 30).addBox(-0.087F, -1.4002F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2236F, 0.2842F, 1.7913F, 1.5708F, -0.2618F, -1.5708F));

		PartDefinition cube_r299 = leftarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(100, 28).addBox(0.7352F, -2.2852F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 0.2842F, 1.7913F, 1.5708F, -0.8727F, -1.5708F));

		PartDefinition cube_r300 = leftarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(65, 99).addBox(0.2356F, -2.8596F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2236F, 0.2842F, 1.7913F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(79, 99).addBox(-0.8292F, -1.487F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, 0.2842F, 1.7913F, -1.5708F, -0.829F, 1.5708F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(92, 13).addBox(-0.9F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 2.3915F, 1.2004F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(7, 108).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2236F, 5.6954F, 0.7336F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(69, 46).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5238F, 7.9011F, 0.192F, 0.3853F, -0.0809F, -0.0328F));

		PartDefinition cube_r304 = leftArm3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(116, 69).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7627F, 1.8244F, 0.8017F, -0.3446F, 0.4024F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(56, 53).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0031F, 0.4866F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.4035F, 0.0886F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftArm5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(15, 47).addBox(-2.3002F, -0.4959F, -0.915F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8202F, 8.0793F, -7.5659F, 0.1915F, -0.008F, 0.1307F));

		PartDefinition cube_r306 = rightarm.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(99, 25).addBox(-1.4998F, -0.9532F, -0.9937F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6002F, 7.5423F, 1.2873F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(99, 16).addBox(-1.4998F, -0.6376F, 0.0559F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6002F, 6.4423F, 0.6873F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(75, 72).addBox(-1.4998F, -0.0206F, -0.8839F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6002F, 6.4423F, 0.6873F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(99, 13).addBox(-1.4998F, -0.7992F, -0.2088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6002F, 6.1423F, 0.8873F, -1.2995F, 0.0103F, -0.0048F));

		PartDefinition cube_r310 = rightarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(98, 50).addBox(-1.4998F, -0.8218F, -0.9495F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6002F, 6.1423F, 0.8873F, -0.9505F, 0.0103F, -0.0048F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(21, 91).addBox(-0.4956F, -1.4094F, -1.3435F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, -1.2827F, 0.1731F, -0.1736F));

		PartDefinition cube_r312 = rightarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(58, 97).addBox(-0.5F, -1.4F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.6598F, -0.3625F, 0.1475F, -2.068F, 0.1739F, -0.1729F));

		PartDefinition cube_r313 = rightarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(118, 58).addBox(-0.4946F, -0.5052F, -2.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, -1.6753F, 0.1739F, -0.1729F));

		PartDefinition cube_r314 = rightarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(94, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.058F, -0.6231F, -1.8308F, -0.4798F, 0.1739F, -0.1729F));

		PartDefinition cube_r315 = rightarm.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(57, 115).addBox(-1.1F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5894F, 0.3931F, -0.1931F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r316 = rightarm.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(107, 40).addBox(-1.0F, -1.5F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5894F, 1.7477F, -1.1445F, -0.1746F, -0.0014F, 0.001F));

		PartDefinition cube_r317 = rightarm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(92, 117).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2627F, 3.1761F, -1.0937F, -0.4973F, 0.1731F, -0.1736F));

		PartDefinition cube_r318 = rightarm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(62, 77).addBox(-0.4956F, 0.3633F, -1.5775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, 0.2619F, 0.1731F, -0.1736F));

		PartDefinition cube_r319 = rightarm.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(89, 45).addBox(-1.0F, -6.5475F, -0.3419F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.6F, 7.8209F, 2.2038F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r320 = rightarm.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(51, 97).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(71, 81).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 3.2083F, 0.4443F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8292F, 7.8651F, 0.1884F, -0.163F, -0.0806F, -0.1003F));

		PartDefinition cube_r321 = rightarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(107, 49).addBox(-0.8251F, 0.078F, -1.2076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7936F, 0.4361F, -0.5598F, 1.5708F, 1.3439F, 1.5097F));

		PartDefinition cube_r322 = rightarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(97, 60).addBox(-0.3694F, 4.8439F, -1.0308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7936F, 0.4361F, -0.5598F, 1.5272F, 1.4312F, 1.5097F));

		PartDefinition cube_r323 = rightarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 85).addBox(-1.0507F, 0.8724F, -1.2076F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7936F, 0.4361F, -0.5598F, 0.0F, 1.5708F, -0.0611F));

		PartDefinition cube_r324 = rightarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(86, 68).addBox(-1.8F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, 7.5057F, 0.0963F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r325 = rightarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(28, 101).addBox(-2.4F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, -1.5081F, 0.1246F, -1.5708F, 0.4014F, -1.5708F));

		PartDefinition cube_r326 = rightarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(46, 69).addBox(-1.2744F, -1.0299F, -1.4596F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.236F, 1.5425F, -0.1906F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r327 = rightarm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5744F, -0.3299F, -1.4596F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.236F, 0.3298F, 1.2549F, -1.5708F, 1.3003F, -1.5708F));

		PartDefinition cube_r328 = rightarm2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(47, 93).addBox(-0.9871F, -1.2114F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, 0.2842F, 1.7913F, 1.5708F, 0.5236F, 1.5708F));

		PartDefinition cube_r329 = rightarm2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(92, 0).addBox(-1.913F, -1.4002F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2236F, 0.2842F, 1.7913F, 1.5708F, 0.2618F, 1.5708F));

		PartDefinition cube_r330 = rightarm2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(100, 76).addBox(-1.7352F, -2.2852F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 0.2842F, 1.7913F, 1.5708F, 0.8727F, 1.5708F));

		PartDefinition cube_r331 = rightarm2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(72, 99).addBox(-1.2356F, -2.8596F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2236F, 0.2842F, 1.7913F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition cube_r332 = rightarm2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(14, 100).addBox(-0.1708F, -1.487F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, 0.2842F, 1.7913F, -1.5708F, 0.829F, -1.5708F));

		PartDefinition cube_r333 = rightarm2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(93, 19).addBox(-0.1F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 2.3915F, 1.2004F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r334 = rightarm2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(108, 12).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2236F, 5.6954F, 0.7336F, 1.5708F, 1.1345F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(69, 51).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5238F, 7.9011F, 0.192F, -0.1383F, 0.0809F, 0.0328F));

		PartDefinition cube_r335 = rightArm3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(116, 102).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7627F, 1.8244F, 0.8017F, 0.3446F, -0.4024F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(58, 41).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0031F, 0.4866F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 1.4035F, 0.0886F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightArm5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(47, 31).addBox(-1.6998F, -0.4959F, -0.915F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6352F, -8.7849F, 0.4923F, 0.1155F, 0.0617F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(36, 119).addBox(0.0F, -2.5295F, -2.8119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6529F, -1.7763F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r338 = neck2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(97, 118).addBox(-0.003F, -3.021F, -1.0441F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6529F, -0.7763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(119, 27).addBox(0.0F, -2.0346F, 0.1202F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6529F, -2.8763F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(114, 42).mirror().addBox(-0.3234F, 0.2498F, -4.239F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 64).mirror().addBox(-1.4303F, 0.0502F, -2.3146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1406F, -0.4017F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r341 = neck2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(114, 42).addBox(-1.6766F, 0.2498F, -4.239F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 64).addBox(-0.5697F, 0.0502F, -2.3146F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1406F, -0.4017F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r342 = neck2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(36, 23).addBox(-1.0F, -0.1996F, -1.1026F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3927F, -5.6146F, 0.4054F, 0.0934F, -0.0336F));

		PartDefinition cube_r343 = neck.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(100, 110).addBox(0.0F, -0.5F, -1.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2659F, -2.5819F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(87, 13).mirror().addBox(-1.2F, -0.5F, 0.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0392F, -0.4714F, 1.5948F, -0.0295F, 2.7062F));

		PartDefinition cube_r345 = neck.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(87, 13).addBox(-0.8F, -0.5F, 0.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0392F, -0.4714F, 1.5948F, 0.0295F, -2.7062F));

		PartDefinition cube_r346 = neck.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(79, 27).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6489F, -3.2206F, 1.501F, 0.0F, -3.1416F));

		PartDefinition cube_r347 = neck.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(119, 75).addBox(0.0F, -0.9742F, -0.9916F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9296F, 0.1872F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r348 = neck.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -1.1F, -0.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9296F, -5.7128F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.407F, -5.6911F, -0.6428F, 0.0963F, -0.2353F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(31, 77).addBox(-2.0F, -0.0307F, -0.9613F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6F, -2.6F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 76).addBox(-2.0F, -0.0307F, -0.9613F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6F, -2.6F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(115, 84).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 12.5408F, -6.1484F, 1.9242F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(109, 22).addBox(-2.05F, -2.8366F, -1.2669F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.05F, 10.5347F, -4.4398F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(49, 110).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.389F, -6.5005F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(46, 117).addBox(-0.6541F, -0.8079F, -0.4192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1541F, 4.9264F, -9.6186F, 1.3221F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(117, 44).addBox(-0.6541F, -0.2935F, 0.4421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1541F, 5.7764F, -9.6186F, 1.3657F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(41, 117).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 4.563F, -10.2949F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(28, 117).addBox(-0.6541F, -0.7698F, -0.1495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.1541F, 5.7764F, -9.6186F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(117, 24).addBox(-0.6541F, -0.6336F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1541F, 4.9264F, -9.6186F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(116, 31).addBox(-0.5F, -1.8456F, -0.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.9486F, -17.5483F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(26, 113).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 6.4075F, -17.0227F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(23, 117).addBox(-0.5F, -1.109F, -0.0163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.9486F, -17.5483F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(56, 93).addBox(-2.0F, -1.5859F, -2.6615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 10.1028F, -6.9035F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(64, 36).addBox(-2.0F, -1.3143F, -1.5115F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 10.1028F, -6.9035F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(42, 110).addBox(-1.0F, 0.0101F, 0.0023F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.0F, -7.1F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(30, 49).addBox(-2.0F, -0.0259F, -2.0099F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(83, 15).addBox(-1.0F, -0.6626F, -2.383F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.1329F, -4.9709F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(112, 110).addBox(-1.0F, -0.5881F, -0.4879F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.1329F, -4.9709F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(112, 55).addBox(-1.0F, -0.6878F, 0.378F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.1329F, -4.9709F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(33, 71).addBox(-1.5F, -0.0542F, -3.0027F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(48, 16).addBox(-2.0F, -0.0542F, -2.0027F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.7F, -4.9F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(46, 64).addBox(-2.0F, 0.5855F, -1.3574F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.73F, -4.4746F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(95, 73).addBox(-1.5F, -1.0898F, -0.9811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -0.8729F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(100, 22).addBox(-1.5F, -0.6778F, -0.6669F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -1.6729F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(53, 73).addBox(-1.5F, -1.0584F, -0.0291F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 7.7104F, 0.4555F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(48, 4).addBox(-1.5F, -3.1377F, 0.4362F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.4742F, -0.0729F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(67, 10).addBox(-1.0F, -0.9742F, -3.0033F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.4104F, -0.5445F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(73, 30).addBox(-1.5F, -0.441F, -1.6452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.7104F, -0.2445F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(79, 94).addBox(-0.5F, -1.6627F, -2.0535F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 11.1107F, -2.4864F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(52, 113).addBox(-0.5F, -2.0085F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.6107F, -3.7864F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(42, 113).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7107F, -3.1864F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(23, 85).addBox(-1.55F, -2.2112F, -1.7763F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, 10.5347F, -4.4398F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(74, 6).addBox(-3.0F, -0.763F, -1.4701F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.1733F, -0.9103F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(61, 6).addBox(-3.0F, 0.6661F, 0.9756F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(72, 15).addBox(-3.0F, -1.0339F, 2.5756F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 1.4267F, -2.6103F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(80, 0).addBox(-3.5F, -0.9479F, -1.0217F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -1.9733F, -1.0102F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(56, 58).addBox(-2.5F, 1.9606F, -2.8004F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.6F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(100, 33).addBox(-1.5F, -0.1952F, 1.5931F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 116).addBox(-0.5F, -0.1808F, 1.8635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(107, 28).addBox(-1.0F, -0.0231F, 0.0591F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.2F, -4.4F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(105, 110).addBox(-1.0F, -0.0034F, -0.2131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(69, 0).addBox(-2.2F, -0.5F, -0.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6978F, 10.1639F, -2.4225F, 1.5965F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(43, 47).addBox(-2.2F, -0.4F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6978F, 8.4219F, -1.664F, 1.0292F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(10, 118).addBox(-0.5F, 0.1272F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.2F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(101, 4).addBox(-1.55F, -2.2706F, -1.3551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(58, 46).addBox(-1.55F, -1.2706F, -2.3551F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.05F, 10.5347F, -4.4398F, 1.1448F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(100, 19).addBox(-2.0F, 0.5513F, -0.2672F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.73F, -4.4746F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 1.096F, -0.1934F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.3F, -3.8F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(82, 40).addBox(-1.0F, -0.007F, -0.1576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.3F, -3.8F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(20, 74).addBox(-1.5F, -0.475F, -1.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0395F, 9.4186F, -5.946F, 0.9702F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, -3.4396F, -0.3317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5092F, 0.2745F, 2.4045F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(99, 115).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6967F, 9.4391F, -5.51F, 1.5423F, -0.3265F, 0.0891F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(84, 76).addBox(0.0371F, 0.0311F, -0.1568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(84, 21).addBox(0.4371F, 0.0311F, -0.1568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5092F, 1.1982F, -2.9027F, 1.7337F, -0.7717F, -0.1397F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(116, 21).addBox(0.0F, 0.0271F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(116, 18).addBox(0.4F, 0.0271F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5092F, -1.6149F, -3.2036F, 1.7549F, -0.7769F, -0.1298F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(82, 112).addBox(-0.6938F, -0.1394F, 1.8252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.0092F, -2.6018F, -3.3027F, 1.5675F, -0.4688F, 0.3702F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(100, 98).addBox(-0.7F, -0.25F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5247F, 8.6354F, -5.4558F, 0.9847F, -0.3045F, -0.0823F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(77, 112).addBox(-1.3651F, -2.0571F, -0.9447F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-2.0092F, 6.301F, -13.9062F, 1.0116F, 0.0415F, -0.0319F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(112, 44).addBox(-1.3492F, -2.9092F, -0.0271F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0092F, 7.701F, -14.6062F, 0.8284F, 0.0431F, -0.0297F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(14, 110).addBox(-0.566F, 1.6665F, -1.7531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(109, 106).addBox(-0.566F, 0.9665F, -1.7531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.855F, 4.1208F, -7.162F, 1.0461F, 0.0672F, -0.0688F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(109, 102).addBox(-0.566F, 0.4824F, -1.5789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-2.855F, 4.1208F, -7.162F, 0.9064F, 0.0672F, -0.0688F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(93, 109).addBox(-0.566F, 1.0431F, -1.2625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(109, 32).addBox(-0.566F, 0.3431F, -1.2625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F))
				.texOffs(114, 90).addBox(-0.566F, -0.9393F, -0.2539F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.855F, 4.1208F, -7.162F, 1.4824F, 0.0672F, -0.0688F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(21, 113).addBox(-0.6496F, -0.1463F, -1.7406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(114, 98).addBox(-0.6496F, -0.1463F, -1.1406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-2.855F, 3.4745F, -7.7463F, 0.9152F, 0.0756F, -0.0595F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(114, 94).addBox(-0.566F, -1.0633F, -0.6604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.855F, 4.1208F, -7.162F, 1.177F, 0.0672F, -0.0688F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(115, 80).addBox(-1.2417F, -2.0042F, -0.0292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-2.0092F, 9.001F, -13.0062F, 0.8895F, 0.0431F, -0.0297F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(40, 90).addBox(-0.951F, -6.2249F, -3.2229F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0092F, 9.001F, -6.0062F, 1.0989F, 0.0415F, -0.0319F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(85, 3).addBox(-0.9349F, -3.345F, -3.0847F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0092F, 9.001F, -6.0062F, 1.1387F, 0.0612F, 0.0077F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(117, 87).addBox(-0.951F, -7.2115F, -2.7048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(114, 76).addBox(-0.951F, -8.2115F, -1.8048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0092F, 9.001F, -6.0062F, 1.1338F, 0.0415F, -0.0319F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(86, 91).addBox(-1.1317F, -3.0372F, -1.9936F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.0092F, 7.501F, -9.2062F, 1.3956F, 0.0415F, -0.0319F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(37, 64).addBox(-0.9349F, -3.8996F, -1.2386F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0092F, 9.001F, -6.0062F, 1.6535F, 0.0612F, 0.0077F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(82, 118).addBox(-0.5786F, -2.534F, -0.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9592F, 9.4329F, -3.5425F, 1.7369F, -0.2646F, 0.3697F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(82, 115).addBox(-0.4002F, -2.6032F, -1.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9592F, 9.4329F, -3.5425F, 1.828F, -0.2584F, 0.5124F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(93, 105).addBox(-0.4541F, 1.6233F, -0.9365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.855F, 4.1208F, -7.162F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(30, 109).addBox(-0.4541F, 1.5743F, -2.3467F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.855F, 4.1208F, -7.162F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(100, 90).addBox(0.0402F, 0.6189F, -1.5377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.5092F, 1.6282F, -3.5774F, 1.2828F, -0.103F, -0.3341F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(31, 113).addBox(-0.587F, -0.1792F, -0.1842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.9592F, 8.7329F, -1.9425F, -0.4226F, 0.1074F, 0.2582F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(69, 113).addBox(-1.0502F, -0.538F, -0.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.9592F, 10.4329F, -1.9425F, -0.166F, 0.067F, 0.2533F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-0.5F, -3.4396F, -0.3317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5092F, 0.2745F, 2.4045F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(99, 115).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6967F, 9.4391F, -5.51F, 1.5423F, 0.3265F, -0.0891F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(84, 76).mirror().addBox(-1.0371F, 0.0311F, -0.1568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(84, 21).mirror().addBox(-1.4371F, 0.0311F, -0.1568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 1.1982F, -2.9027F, 1.7337F, 0.7717F, 0.1397F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(116, 21).mirror().addBox(-1.0F, 0.0271F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(116, 18).mirror().addBox(-1.4F, 0.0271F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5092F, -1.6149F, -3.2036F, 1.7549F, 0.7769F, 0.1298F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(82, 112).mirror().addBox(-1.3062F, -0.1394F, 1.8252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(3.0092F, -2.6018F, -3.3027F, 1.5675F, 0.4688F, -0.3702F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(100, 98).mirror().addBox(-0.3F, -0.25F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5247F, 8.6354F, -5.4558F, 0.9847F, 0.3045F, 0.0823F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(77, 112).mirror().addBox(0.3651F, -2.0571F, -0.9447F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 6.301F, -13.9062F, 1.0116F, -0.0415F, 0.0319F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(112, 44).mirror().addBox(0.3492F, -2.9092F, -0.0271F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 7.701F, -14.6062F, 0.8284F, -0.0431F, 0.0297F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(14, 110).mirror().addBox(-0.434F, 1.6665F, -1.7531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(109, 106).mirror().addBox(-0.434F, 0.9665F, -1.7531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.855F, 4.1208F, -7.162F, 1.0461F, -0.0672F, 0.0688F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(109, 102).mirror().addBox(-0.434F, 0.4824F, -1.5789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(2.855F, 4.1208F, -7.162F, 0.9064F, -0.0672F, 0.0688F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(93, 109).mirror().addBox(-0.434F, 1.0431F, -1.2625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(109, 32).mirror().addBox(-0.434F, 0.3431F, -1.2625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(114, 90).mirror().addBox(-0.434F, -0.9393F, -0.2539F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.855F, 4.1208F, -7.162F, 1.4824F, -0.0672F, 0.0688F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(21, 113).mirror().addBox(-0.3504F, -0.1463F, -1.7406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(114, 98).mirror().addBox(-0.3504F, -0.1463F, -1.1406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(2.855F, 3.4745F, -7.7463F, 0.9152F, -0.0756F, 0.0595F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(114, 94).mirror().addBox(-0.434F, -1.0633F, -0.6604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.855F, 4.1208F, -7.162F, 1.177F, -0.0672F, 0.0688F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(115, 80).mirror().addBox(0.2417F, -2.0042F, -0.0292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 9.001F, -13.0062F, 0.8895F, -0.0431F, 0.0297F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-0.049F, -6.2249F, -3.2229F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 9.001F, -6.0062F, 1.0989F, -0.0415F, 0.0319F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-0.0651F, -3.345F, -3.0847F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 9.001F, -6.0062F, 1.1387F, -0.0612F, -0.0077F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(117, 87).mirror().addBox(-0.049F, -7.2115F, -2.7048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(114, 76).mirror().addBox(-0.049F, -8.2115F, -1.8048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 9.001F, -6.0062F, 1.1338F, -0.0415F, 0.0319F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(86, 91).mirror().addBox(0.1317F, -3.0372F, -1.9936F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 7.501F, -9.2062F, 1.3956F, -0.0415F, 0.0319F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.0651F, -3.8996F, -1.2386F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 9.001F, -6.0062F, 1.6535F, -0.0612F, -0.0077F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(82, 118).mirror().addBox(-0.4214F, -2.534F, -0.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9592F, 9.4329F, -3.5425F, 1.7369F, 0.2646F, -0.3697F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(82, 115).mirror().addBox(-0.5998F, -2.6032F, -1.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9592F, 9.4329F, -3.5425F, 1.828F, 0.2584F, -0.5124F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(93, 105).mirror().addBox(-0.5459F, 1.6233F, -0.9365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(2.855F, 4.1208F, -7.162F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(30, 109).mirror().addBox(-0.5459F, 1.5743F, -2.3467F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.855F, 4.1208F, -7.162F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(100, 90).mirror().addBox(-1.0402F, 0.6189F, -1.5377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 1.6282F, -3.5774F, 1.2828F, 0.103F, 0.3341F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(31, 113).mirror().addBox(-0.413F, -0.1792F, -0.1842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.9592F, 8.7329F, -1.9425F, -0.4226F, -0.1074F, -0.2582F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(69, 113).mirror().addBox(0.0503F, -0.538F, -0.8618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.9592F, 10.4329F, -1.9425F, -0.166F, -0.067F, -0.2533F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0861F, 5.3156F, -0.9377F, 0.0F, 0.0F, 0.0262F));

		PartDefinition cube_r449 = leftOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(112, 117).addBox(-0.9214F, -0.394F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.331F, 0.6959F, -1.1136F, 0.5624F, 1.3187F, -0.7453F));

		PartDefinition cube_r450 = leftOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(44, 106).addBox(-0.2465F, -0.93F, -0.2452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1189F, 0.8909F, -0.271F, 2.0799F, 1.5091F, 0.7132F));

		PartDefinition cube_r451 = leftOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(37, 106).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0112F, -1.3845F, -0.3871F, 0.3657F, 1.2438F, -1.1648F));

		PartDefinition cube_r452 = leftOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(30, 41).addBox(-0.5F, -0.4F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3647F, -6.5672F, -1.507F, 3.0546F, 1.0647F, 1.2185F));

		PartDefinition cube_r453 = leftOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(62, 117).addBox(-0.5723F, -1.8067F, 1.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5139F, -1.8558F, -0.44F, -3.0463F, 1.3674F, 1.0888F));

		PartDefinition cube_r454 = leftOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(117, 113).addBox(-0.5723F, -1.7484F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5139F, -1.8558F, -0.44F, 1.8843F, 1.3674F, 1.0888F));

		PartDefinition cube_r455 = leftOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(51, 117).addBox(-0.5723F, -0.9402F, 0.11F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 67).addBox(-0.5723F, -2.9402F, 1.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5139F, -1.8558F, -0.44F, 2.9315F, 1.3674F, 1.0888F));

		PartDefinition cube_r456 = leftOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(14, 89).addBox(-0.8F, -1.5F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5539F, -3.944F, -0.9454F, 0.1166F, 1.2003F, -1.7382F));

		PartDefinition cube_r457 = leftOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(16, 106).addBox(-1.0522F, -0.93F, 0.0702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5014F, -0.6541F, -1.4358F, 0.2926F, 1.1612F, -1.2431F));

		PartDefinition cube_r458 = leftOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(108, 0).addBox(-0.14F, -0.93F, -0.249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1189F, 0.8909F, -0.271F, 2.8173F, 1.4011F, 1.4541F));

		PartDefinition cube_r459 = leftOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(56, 110).addBox(-0.075F, -0.2F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4451F, 0.8024F, -3.5077F, 1.9267F, -0.2196F, -2.2343F));

		PartDefinition cube_r460 = leftOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(118, 72).addBox(-0.05F, -0.2F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2893F, 1.5639F, -3.4221F, 1.9553F, 0.3752F, -1.3414F));

		PartDefinition cube_r461 = leftOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(88, 61).addBox(-1.1414F, -0.5F, -1.495F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.468F, 1.663F, -2.9658F, 2.324F, 0.1803F, -0.5007F));

		PartDefinition cube_r462 = leftOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(108, 83).addBox(-0.35F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7366F, 2.5568F, -2.0112F, 1.5254F, 0.348F, 2.0219F));

		PartDefinition cube_r463 = leftOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(79, 108).addBox(-1.0052F, 0.2082F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1597F, 1.2729F, -1.3898F, 0.8236F, 0.0133F, 0.5012F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0861F, 5.3156F, -0.9377F, 0.0F, 0.0F, -0.0262F));

		PartDefinition cube_r464 = rightOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(112, 117).mirror().addBox(-0.0786F, -0.394F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.331F, 0.6959F, -1.1136F, 0.5624F, -1.3187F, 0.7453F));

		PartDefinition cube_r465 = rightOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(44, 106).mirror().addBox(-0.7535F, -0.93F, -0.2452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 0.8909F, -0.271F, 2.0799F, -1.5091F, -0.7132F));

		PartDefinition cube_r466 = rightOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(37, 106).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0112F, -1.3845F, -0.3871F, 0.3657F, -1.2438F, 1.1648F));

		PartDefinition cube_r467 = rightOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(30, 41).mirror().addBox(-0.5F, -0.4F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3647F, -6.5672F, -1.507F, 3.0546F, -1.0647F, -1.2185F));

		PartDefinition cube_r468 = rightOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(62, 117).mirror().addBox(-0.4277F, -1.8067F, 1.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5139F, -1.8558F, -0.44F, -3.0463F, -1.3674F, -1.0888F));

		PartDefinition cube_r469 = rightOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(117, 113).mirror().addBox(-0.4277F, -1.7484F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5139F, -1.8558F, -0.44F, 1.8843F, -1.3674F, -1.0888F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(51, 117).mirror().addBox(-0.4277F, -0.9402F, 0.11F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 67).mirror().addBox(-0.4277F, -2.9402F, 1.11F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5139F, -1.8558F, -0.44F, 2.9315F, -1.3674F, -1.0888F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(14, 89).mirror().addBox(-0.2F, -1.5F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5539F, -3.944F, -0.9454F, 0.1166F, -1.2003F, 1.7382F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(16, 106).mirror().addBox(0.0522F, -0.93F, 0.0702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5014F, -0.6541F, -1.4358F, 0.2926F, -1.1612F, 1.2431F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.86F, -0.93F, -0.249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 0.8909F, -0.271F, 2.8173F, -1.4011F, -1.4541F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(56, 110).mirror().addBox(-1.925F, -0.2F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4451F, 0.8024F, -3.5077F, 1.9267F, 0.2196F, 2.2343F));

		PartDefinition cube_r475 = rightOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(118, 72).mirror().addBox(-0.95F, -0.2F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2893F, 1.5639F, -3.4221F, 1.9553F, -0.3752F, 1.3414F));

		PartDefinition cube_r476 = rightOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-0.8586F, -0.5F, -1.495F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.468F, 1.663F, -2.9658F, 2.324F, -0.1803F, 0.5007F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(108, 83).mirror().addBox(-0.65F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7366F, 2.5568F, -2.0112F, 1.5254F, -0.348F, -2.0219F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(79, 108).mirror().addBox(0.0052F, 0.2082F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1597F, 1.2729F, -1.3898F, 0.8236F, -0.0133F, -0.5012F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.1447F, -0.563F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(72, 106).addBox(-1.75F, 1.5311F, 0.7237F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(65, 106).addBox(-1.55F, 1.5311F, 0.7237F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 4.2441F, -8.1978F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(87, 117).mirror().addBox(-0.9416F, 0.38F, 0.9841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(36, 115).mirror().addBox(-0.9416F, 0.38F, 1.2842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.2441F, -8.1978F, -2.5157F, -0.1148F, 0.042F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(77, 117).mirror().addBox(-0.9416F, 0.3048F, 0.9416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.2441F, -8.1978F, -2.0794F, -0.1148F, 0.042F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(115, 11).mirror().addBox(-0.9416F, -0.519F, 0.2972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.2441F, -8.1978F, -2.5593F, -0.1148F, 0.042F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(5, 115).mirror().addBox(-0.9416F, 1.2166F, -0.7538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.2441F, -8.1978F, -1.8001F, -0.1148F, 0.042F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(119, 90).mirror().addBox(0.5F, 1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 119).mirror().addBox(0.1F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 90).addBox(2.3F, 1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 119).addBox(2.7F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.5308F, -8.2859F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(33, 117).mirror().addBox(-0.75F, -2.9956F, -0.038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 117).addBox(1.85F, -2.9956F, -0.038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.15F, 3.3441F, -7.1978F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(37, 110).mirror().addBox(-0.5F, -1.5F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(37, 110).addBox(1.7F, -1.5F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7F, 5.0646F, -4.4388F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.95F, -2.3429F, -0.3112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(65, 89).addBox(1.25F, -2.3429F, -0.3112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.25F, 4.2441F, -8.1978F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(80, 45).mirror().addBox(-2.0F, -0.0987F, -2.9946F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(80, 45).addBox(2.0F, -0.0987F, -2.9946F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 6.2551F, -1.9516F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(23, 109).mirror().addBox(-2.0F, -0.0692F, -2.0026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(23, 109).addBox(2.0F, -0.0692F, -2.0026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 5.7551F, -1.0516F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(21, 97).mirror().addBox(-0.95F, -2.0205F, -2.0482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 97).addBox(1.25F, -2.0205F, -2.0482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 6.8441F, -4.6978F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(70, 88).mirror().addBox(-0.95F, -2.936F, -2.053F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(70, 88).addBox(1.25F, -2.936F, -2.053F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.25F, 6.5441F, -7.5978F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(93, 96).mirror().addBox(-0.95F, -1.3002F, -0.0925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(93, 96).addBox(1.25F, -1.3002F, -0.0925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.25F, 4.2441F, -8.1978F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(107, 36).mirror().addBox(-1.0F, -0.0121F, -1.9809F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(107, 36).addBox(3.0F, -0.0121F, -1.9809F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.1F, 5.1079F, -0.2284F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(58, 106).mirror().addBox(-1.0F, -0.013F, -2.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(58, 106).addBox(3.0F, -0.013F, -2.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, 4.3079F, 0.3716F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 74).addBox(3.5F, -0.6F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 4.0511F, -2.1468F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(96, 55).mirror().addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(96, 55).addBox(3.0F, -1.2F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, 0.9F, 0.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(47, 113).mirror().addBox(-1.0F, -3.0908F, -1.3648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(47, 113).addBox(3.0F, -3.0908F, -1.3648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1F, 1.2997F, -1.6765F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(96, 45).mirror().addBox(-1.0F, 0.6546F, -0.4847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(96, 45).addBox(3.0F, 0.6546F, -0.4847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1F, 0.869F, -1.7436F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-1.0F, -1.5888F, -0.7923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(115, 0).addBox(3.0F, -1.5888F, -0.7923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, 1.2997F, -1.6765F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(67, 117).mirror().addBox(-0.5F, -1.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(67, 117).addBox(3.5F, -1.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, 3.6722F, 0.5488F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(51, 106).mirror().addBox(-0.5F, -0.1231F, -2.0228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(51, 106).addBox(3.5F, -0.1231F, -2.0228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.6F, 3.4293F, 0.6337F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(24, 67).mirror().addBox(-1.0F, -0.4F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(24, 67).addBox(3.0F, -0.4F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.1F, 0.9F, 0.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(87, 117).addBox(-0.0584F, 0.38F, 0.9841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(36, 115).addBox(-0.0584F, 0.38F, 1.2842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 4.2441F, -8.1978F, -2.5157F, 0.1148F, -0.042F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(77, 117).addBox(-0.0584F, 0.3048F, 0.9416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.05F, 4.2441F, -8.1978F, -2.0794F, 0.1148F, -0.042F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(115, 11).addBox(-0.0584F, -0.519F, 0.2972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.05F, 4.2441F, -8.1978F, -2.5593F, 0.1148F, -0.042F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(5, 115).addBox(-0.0584F, 1.2166F, -0.7538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.05F, 4.2441F, -8.1978F, -1.8001F, 0.1148F, -0.042F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 30).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(72, 119).addBox(0.0F, -0.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4726F, 1.7644F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(59, 119).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(51, 23).addBox(-0.5F, -0.5182F, -0.047F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3617F, 3.8924F, -0.288F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 64).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1415F, 4.898F, -0.4538F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(13, 53).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0615F, 3.6239F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 124, 124);
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