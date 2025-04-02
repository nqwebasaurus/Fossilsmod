package fossils.fossils.client.blockentity.model.decennatherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DecennatheriumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart leftFrontossicone;
	private final ModelPart rightFrontossicone;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public DecennatheriumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.leftFrontossicone = this.head.getChild("leftFrontossicone");
		this.rightFrontossicone = this.head.getChild("rightFrontossicone");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.0F, 10.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -1.8986F, 0.6389F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(0.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.7674F, 0.4389F, -0.4953F, 0.4376F, -0.225F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 57).mirror().addBox(-1.0F, -0.7F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2044F, 1.9523F, 1.6158F, 2.4142F, -1.0745F, 1.341F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8638F, 1.8398F, 0.7641F, 2.7786F, -0.2404F, 1.0971F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-1.5735F, -0.5011F, -0.6589F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0662F, 2.9059F, 3.0786F, 1.2043F, -1.1899F, 2.7233F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 65).mirror().addBox(-0.0735F, -0.5011F, -0.4589F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0662F, 2.9059F, 3.0786F, 0.3558F, -0.6117F, -2.5652F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-0.5434F, -0.5011F, -1.3504F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0662F, 2.9059F, 3.0786F, 0.5621F, -1.0062F, -2.8439F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(84, 54).mirror().addBox(-2.4217F, -0.7302F, -0.1298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8769F, 2.2492F, 3.0357F, -3.0836F, -1.0745F, 1.341F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-1.0F, -0.8F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.705F, -1.7992F, -3.1355F, -1.1572F, -0.5848F, 0.3911F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 84).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3352F, -0.6141F, -0.9251F, -1.9544F, -0.8769F, 1.097F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-0.1F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3352F, -0.6141F, -0.9251F, -2.2592F, -0.6952F, 1.5227F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 88).mirror().addBox(-0.0302F, -0.5782F, -0.0951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2112F, -3.8606F, -1.3014F, 3.0315F, -1.0088F, 1.5915F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3352F, -0.6141F, -0.9251F, -2.385F, -0.5276F, 1.7407F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-2.1631F, 0.1227F, -1.3236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7739F, -2.1552F, -2.0967F, -1.3483F, -0.4065F, -0.0829F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 66).mirror().addBox(-1.5649F, -0.2099F, -0.1301F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4882F, -3.5518F, -2.0012F, -1.058F, -0.9392F, -0.4321F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2112F, -2.8606F, -1.4014F, 0.1702F, -1.2178F, -1.8033F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(5, 90).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8638F, 1.8398F, 0.7641F, 2.7786F, 0.2404F, -1.0971F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 0).addBox(-0.4265F, -0.5011F, -0.6589F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0662F, 2.9059F, 3.0786F, 1.2043F, 1.1899F, -2.7233F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(82, 65).addBox(-1.9265F, -0.5011F, -0.4589F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0662F, 2.9059F, 3.0786F, 0.3558F, 0.6117F, 2.5652F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(82, 62).addBox(-1.4566F, -0.5011F, -1.3504F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0662F, 2.9059F, 3.0786F, 0.5621F, 1.0062F, 2.8439F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 57).addBox(-1.0F, -0.7F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2044F, 1.9523F, 1.6158F, 2.4142F, 1.0745F, -1.341F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(84, 54).addBox(0.4217F, -0.7302F, -0.1298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8769F, 2.2492F, 3.0357F, -3.0836F, 1.0745F, -1.341F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 36).addBox(-2.9F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3352F, -0.6141F, -0.9251F, -2.2592F, 0.6952F, -1.5227F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 84).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3352F, -0.6141F, -0.9251F, -1.9544F, 0.8769F, -1.097F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 16).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3352F, -0.6141F, -0.9251F, -2.385F, 0.5276F, -1.7407F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 6).addBox(-2.0F, -0.8F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.705F, -1.7992F, -3.1355F, -1.1572F, 0.5848F, -0.3911F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(66, 55).addBox(0.1631F, 0.1227F, -1.3236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7739F, -2.1552F, -2.0967F, -1.3483F, 0.4065F, 0.0829F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 66).addBox(-0.4351F, -0.2099F, -0.1301F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4882F, -3.5518F, -2.0012F, -1.058F, 0.9392F, 0.4321F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(16, 88).addBox(-0.9698F, -0.5782F, -0.0951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2112F, -3.8606F, -1.3014F, 3.0315F, 1.0088F, -1.5915F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(51, 66).mirror().addBox(-0.8F, -0.5F, 0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1914F, -2.4636F, -1.1725F, 2.9929F, -1.1646F, 1.635F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 66).addBox(-0.2F, -0.5F, 0.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1914F, -2.4636F, -1.1725F, 2.9929F, 1.1646F, -1.635F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2112F, -2.8606F, -1.4014F, 0.1702F, 1.2178F, 1.8033F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(88, 46).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8197F, 1.4375F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(80, 33).addBox(-2.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0F, 2.7674F, 0.4389F, -0.4953F, -0.4376F, 0.225F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 31).addBox(-2.0F, -1.2F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.7674F, 0.4389F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 15).addBox(-2.0F, -1.0F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.0835F, -3.0825F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(17, 35).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 2.9733F, 3.3561F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 2).addBox(-2.0F, -4.4F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 21).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 43).addBox(-0.5F, -0.0653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 39).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(33, 51).addBox(-1.0F, -15.8937F, -4.9715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 76).addBox(-0.5F, -0.0474F, -1.0052F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -0.5822F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(23, 76).addBox(-0.5F, -0.0858F, -0.1059F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.6822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.815F, -0.099F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(84, 3).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(64, 64).addBox(-1.0F, -0.8F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(82, 75).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.1131F, 0.2596F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(29, 67).addBox(-0.5F, -0.0381F, -1.0332F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7131F, 0.5596F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 82).addBox(-1.4F, 0.0338F, 0.1561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 1.5475F, -0.6467F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0111F, -1.5073F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 75).addBox(0.0F, -3.9857F, -1.9115F, 0.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(56, 74).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5705F, -0.278F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 8).addBox(-0.5F, -3.4F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4557F, -0.6179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(71, 10).addBox(-0.5F, -0.5634F, -1.7119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0505F, -0.9549F, 0.6196F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.8045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(88, 49).addBox(9.1919F, -0.3399F, -0.3563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 71).addBox(9.1919F, -0.3399F, 0.2437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-10.0F, -0.2405F, -0.0924F, -0.3934F, 0.0319F, -0.0416F));

		PartDefinition cube_r52 = leftLeg5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 92).addBox(9.1919F, -0.2645F, -0.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(87, 92).addBox(9.1919F, -0.2645F, 0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-10.0F, -0.2405F, -0.0924F, -0.8908F, 0.0319F, -0.0416F));

		PartDefinition cube_r53 = leftLeg5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 45).addBox(8.9661F, -1.812F, -2.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 87).addBox(8.9661F, -1.812F, -2.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-10.3F, -0.2405F, -0.0924F, -0.4094F, -0.1582F, 0.2095F));

		PartDefinition cube_r54 = leftLeg5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(90, 6).addBox(8.9661F, -0.3416F, -2.7578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(90, 28).addBox(8.9661F, -0.3416F, -3.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-10.3F, -0.2405F, -0.0924F, -0.9068F, -0.1582F, 0.2095F));

		PartDefinition cube_r55 = leftLeg5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 89).addBox(-0.4054F, -0.5964F, -0.2005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 60).addBox(-0.4054F, -0.5964F, -0.8005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.2405F, -0.0924F, -0.3934F, -0.0319F, 0.0416F));

		PartDefinition cube_r56 = leftLeg5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 92).addBox(-0.4054F, -0.2779F, -0.3273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(51, 93).addBox(-0.4054F, -0.2779F, -0.9273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2F, -0.2405F, -0.0924F, -0.8908F, -0.0319F, 0.0416F));

		PartDefinition cube_r57 = leftLeg5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 92).addBox(-0.5F, -0.2752F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(31, 92).addBox(-0.5F, -0.2752F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5F, -0.2405F, -0.0924F, -0.9068F, 0.1582F, -0.2095F));

		PartDefinition cube_r58 = leftLeg5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(47, 90).addBox(-0.5F, -0.5438F, -0.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 90).addBox(-0.5F, -0.5438F, -0.7095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.2405F, -0.0924F, -0.4094F, 0.1582F, -0.2095F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 2.9733F, 3.3561F, -0.2745F, -0.1681F, 0.0471F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(57, 18).addBox(-1.0F, -4.4F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 64).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 81).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 81).addBox(-0.5F, -0.0653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(91, 15).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 55).addBox(-1.0F, -15.8937F, -4.9715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(76, 49).addBox(-0.5F, -0.0474F, -1.0052F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -0.5822F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 76).addBox(-0.5F, -0.0858F, -0.1059F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.6822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.815F, -0.099F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(5, 84).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(9, 65).addBox(-1.0F, -0.8F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(17, 83).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.1131F, 0.2596F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(18, 69).addBox(-0.5F, -0.0381F, -1.0332F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7131F, 0.5596F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(12, 83).addBox(0.4F, 0.0338F, 0.1561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 1.5475F, -0.6467F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0111F, -1.5073F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(7, 78).addBox(0.0F, -3.9857F, -1.9115F, 0.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(63, 75).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5705F, -0.278F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(25, 57).addBox(-0.5F, -3.4F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4557F, -0.6179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, -0.5634F, -1.7119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0505F, -0.9549F, 0.925F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.8045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(32, 89).addBox(-10.1919F, -0.3399F, -0.3563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 89).addBox(-10.1919F, -0.3399F, 0.2437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.0F, -0.2405F, -0.0924F, -0.3934F, -0.0319F, 0.0416F));

		PartDefinition cube_r73 = rightLeg5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 93).addBox(-10.1919F, -0.2645F, -0.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(21, 93).addBox(-10.1919F, -0.2645F, 0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(10.0F, -0.2405F, -0.0924F, -0.8908F, -0.0319F, 0.0416F));

		PartDefinition cube_r74 = rightLeg5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 48).addBox(-9.9661F, -1.812F, -2.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 33).addBox(-9.9661F, -1.812F, -2.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.3F, -0.2405F, -0.0924F, -0.4094F, 0.1582F, -0.2095F));

		PartDefinition cube_r75 = rightLeg5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(90, 9).addBox(-9.9661F, -0.3416F, -2.7578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(90, 36).addBox(-9.9661F, -0.3416F, -3.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(10.3F, -0.2405F, -0.0924F, -0.9068F, 0.1582F, -0.2095F));

		PartDefinition cube_r76 = rightLeg5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(77, 89).addBox(-0.5946F, -0.5964F, -0.2005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 89).addBox(-0.5946F, -0.5964F, -0.8005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.2405F, -0.0924F, -0.3934F, 0.0319F, -0.0416F));

		PartDefinition cube_r77 = rightLeg5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(10, 93).addBox(-0.5946F, -0.2779F, -0.3273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(56, 93).addBox(-0.5946F, -0.2779F, -0.9273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, -0.2405F, -0.0924F, -0.8908F, 0.0319F, -0.0416F));

		PartDefinition cube_r78 = rightLeg5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, -0.2752F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(92, 92).addBox(-0.5F, -0.2752F, -0.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5F, -0.2405F, -0.0924F, -0.9068F, -0.1582F, 0.2095F));

		PartDefinition cube_r79 = rightLeg5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(91, 42).addBox(-0.5F, -0.5438F, -0.1095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(16, 91).addBox(-0.5F, -0.5438F, -0.7095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.2405F, -0.0924F, -0.4094F, -0.1582F, 0.2095F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4F, -3.5F, 0.348F, -0.2055F, -0.0739F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(96, 0).addBox(0.0F, 0.4F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 34).addBox(0.0F, 0.1F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2966F, -5.8386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-1.5607F, -0.2631F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, -0.218F, -3.4137F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(84, 31).addBox(-0.4393F, -0.2631F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, -0.218F, -3.4137F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(32, 35).addBox(-1.0F, -0.1512F, 8.7474F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4656F, -13.1997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7124F, -4.7618F, -0.2901F, -0.2884F, -0.0468F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(-0.799F, -0.6129F, 0.9296F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5733F, 10.4549F, -2.4576F, 0.6425F, -1.0973F, -0.5015F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(56, 50).mirror().addBox(-0.4357F, 0.0411F, -0.4535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5733F, 10.4549F, -4.4576F, 1.1196F, -1.1989F, -0.8512F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(27, 9).mirror().addBox(-5.8649F, 0.1122F, -0.1659F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.2413F, -7.5134F, -0.0406F, 0.2845F, 0.1652F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(42, 24).mirror().addBox(-5.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 11.3413F, -9.2134F, -0.0096F, 0.1824F, 0.2754F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-1.2F, -0.8003F, 0.0569F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.7267F, -6.7823F, 0.3327F, -0.4743F, -0.0768F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(75, 55).mirror().addBox(-8.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.5644F, -0.4574F, 0.0212F, -1.498F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(75, 31).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.5644F, -0.3573F, 0.2927F, -0.8831F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 75).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.5644F, -0.4177F, 0.1932F, -1.1328F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -2.5644F, -0.2982F, 0.3596F, -0.8641F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(73, 67).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -2.5644F, -0.3794F, 0.2721F, -1.1239F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -4.6644F, -0.2893F, 0.3999F, -0.7584F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -4.6644F, -0.3819F, 0.3131F, -1.0222F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -4.6644F, -0.4685F, 0.1455F, -1.3974F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(73, 65).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -6.5644F, -0.4021F, 0.3048F, -0.9772F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(73, 63).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -6.5644F, -0.3118F, 0.3968F, -0.716F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -6.5644F, -0.4835F, 0.1308F, -1.3484F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(44, 6).mirror().addBox(-11.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7794F, -8.5644F, -0.4894F, 0.1322F, -1.3148F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7794F, -8.5644F, -0.4073F, 0.3083F, -0.9444F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7794F, -8.5644F, -0.316F, 0.4015F, -0.6833F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -2.5644F, -0.4511F, 0.1082F, -1.4976F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(58, 34).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9794F, -10.4644F, -0.5027F, 0.0815F, -1.3162F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 41).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9794F, -10.4644F, -0.4391F, 0.2657F, -0.9534F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9794F, -10.4644F, -0.3595F, 0.3681F, -0.6996F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(28, 75).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.5644F, -0.4177F, -0.1932F, 1.1328F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(75, 31).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.5644F, -0.3573F, -0.2927F, 0.8831F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(75, 55).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.5644F, -0.4574F, -0.0212F, 1.498F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(72, 73).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -2.5644F, -0.2982F, -0.3596F, 0.8641F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(73, 67).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -2.5644F, -0.3794F, -0.2721F, 1.1239F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(66, 61).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -2.5644F, -0.4511F, -0.1082F, 1.4976F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(14, 76).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -4.6644F, -0.2893F, -0.3999F, 0.7584F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(75, 57).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -4.6644F, -0.3819F, -0.3131F, 1.0222F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 24).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -4.6644F, -0.4685F, -0.1455F, 1.3974F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(73, 65).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -6.5644F, -0.4021F, -0.3048F, 0.9772F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(73, 63).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -6.5644F, -0.3118F, -0.3968F, 0.716F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(57, 0).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -6.5644F, -0.4835F, -0.1308F, 1.3484F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(58, 34).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9794F, -10.4644F, -0.5027F, -0.0815F, 1.3162F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(76, 41).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9794F, -10.4644F, -0.4391F, -0.2657F, 0.9534F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(76, 39).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9794F, -10.4644F, -0.3595F, -0.3681F, 0.6996F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 6).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7794F, -8.5644F, -0.4894F, -0.1322F, 1.3148F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(63, 73).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7794F, -8.5644F, -0.4073F, -0.3083F, 0.9444F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(71, 34).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7794F, -8.5644F, -0.316F, -0.4015F, 0.6833F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(8, 96).addBox(0.0F, -2.0522F, 0.0128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.604F, -7.457F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(87, 95).addBox(-0.001F, -2.0275F, 0.0402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.296F, -6.757F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(93, 95).addBox(0.0F, -1.7408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -1.157F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(90, 95).addBox(0.0F, -1.8594F, -0.0812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -3.057F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 88).addBox(0.0F, -2.1938F, -0.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.596F, -4.957F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(95, 76).addBox(-0.001F, -2.0275F, 0.0402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.696F, -8.557F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 95).addBox(0.0F, -2.0522F, 0.0128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.204F, -9.257F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 95).addBox(-0.001F, -3.9651F, -0.4241F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.104F, -10.957F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(95, 72).addBox(0.0F, -2.0163F, -0.0806F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.104F, -10.957F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(81, 48).addBox(-0.201F, -0.6129F, 0.9296F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5733F, 10.4549F, -2.4576F, 0.6425F, 1.0973F, 0.5015F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(56, 50).addBox(-0.5643F, 0.0411F, -0.4535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5733F, 10.4549F, -4.4576F, 1.1196F, 1.1989F, 0.8512F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 26).addBox(0.2F, -0.8003F, 0.0569F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.7267F, -6.7823F, 0.3327F, 0.4743F, 0.0768F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(27, 9).addBox(-0.1351F, 0.1122F, -0.1659F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.2413F, -7.5134F, -0.0406F, -0.2845F, -0.1652F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(42, 24).addBox(-0.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.3413F, -9.2134F, -0.0096F, -0.1824F, -0.2754F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(15, 44).addBox(-1.0F, -0.9399F, 0.0545F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.7267F, -10.7823F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -10.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2023F, -10.6837F, -0.2872F, -0.1633F, -0.0851F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(95, 25).addBox(0.0F, -1.4226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3146F, -2.3706F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(10, 88).addBox(-0.001F, -4.2691F, -0.5696F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3146F, -2.3706F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(87, 75).addBox(-0.001F, -3.0764F, -0.04F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8146F, -4.5706F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(71, 95).addBox(0.0F, -1.8226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -4.1706F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(47, 70).addBox(0.0F, -3.0352F, -0.0576F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -5.9706F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(27, 11).mirror().addBox(-5.4221F, -0.0215F, -0.3479F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 9.6451F, 1.6806F, 0.1116F, 0.2508F, 0.2621F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-4.6056F, 0.1044F, -0.0939F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 8.9451F, -0.5194F, -0.2559F, 0.2682F, 0.1478F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(66, 59).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.5451F, -3.1194F, -0.1646F, 0.2374F, 0.67F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8648F, -5.335F, -0.4323F, 0.4608F, -1.1679F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8648F, -5.335F, -0.2953F, 0.5547F, -0.8878F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1648F, -3.335F, -0.1219F, 0.5494F, -0.6458F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1648F, -3.335F, -0.2712F, 0.4978F, -0.9426F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(18, 67).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1648F, -3.335F, -0.4445F, 0.355F, -1.3557F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4648F, -1.735F, -0.4186F, 0.3849F, -1.2965F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4648F, -1.735F, -0.232F, 0.5154F, -0.8738F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4648F, -1.735F, -0.0774F, 0.5561F, -0.5727F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(21, 14).mirror().addBox(-5.0F, -1.2226F, 1.0217F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 14).addBox(4.0F, -1.2226F, 1.0217F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.647F, -2.14F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(32, 43).mirror().addBox(-5.0F, -0.265F, -0.0325F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 43).addBox(4.0F, -0.265F, -0.0325F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.947F, -3.24F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-5.8752F, -2.8317F, 1.75F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.647F, -2.14F, 1.6096F, 0.4507F, 0.0552F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-5.0F, -0.8881F, 1.0297F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 14).addBox(4.0F, -0.8881F, 1.0297F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.647F, -2.14F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(71, 29).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8648F, -5.335F, -0.4323F, -0.4608F, 1.1679F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 27).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8648F, -5.335F, -0.2953F, -0.5547F, 0.8878F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(71, 25).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1648F, -3.335F, -0.1219F, -0.5494F, 0.6458F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(70, 23).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1648F, -3.335F, -0.2712F, -0.4978F, 0.9426F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(18, 67).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1648F, -3.335F, -0.4445F, -0.355F, 1.3557F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(51, 32).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4648F, -1.735F, -0.4186F, -0.3849F, 1.2965F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(70, 21).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4648F, -1.735F, -0.232F, -0.5154F, 0.8738F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4648F, -1.735F, -0.0774F, -0.5561F, 0.5727F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 26).addBox(3.8752F, -2.8317F, 1.75F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.647F, -2.14F, 1.6096F, -0.4507F, -0.0552F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(67, 44).addBox(-1.0F, 0.6661F, 4.6948F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.9823F, -3.3798F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 11).addBox(-0.5779F, -0.0215F, -0.3479F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 9.6451F, 1.6806F, 0.1116F, -0.2508F, -0.2621F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 22).addBox(-0.3944F, 0.1044F, -0.0939F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 8.9451F, -0.5194F, -0.2559F, -0.2682F, -0.1478F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(66, 59).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.5451F, -3.1194F, -0.1646F, -0.2374F, -0.67F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -0.0036F, -0.1282F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.9823F, -3.3798F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(19, 26).addBox(-1.0F, -1.908F, 4.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3854F, -10.0706F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4F, 8.5973F, -1.2591F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(62, 10).addBox(-0.5F, -1.0117F, -2.8194F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 7.2673F, 4.1378F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 49).addBox(-0.5F, -0.2F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.2961F, -0.0244F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 80).addBox(-0.011F, -0.8746F, 0.0689F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.8673F, -0.8622F, 0.4624F, 0.0014F, -0.001F));

		PartDefinition cube_r179 = leftarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(69, 79).addBox(-0.0077F, 0.0237F, -0.1126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.6673F, 0.2378F, 0.7766F, 0.0014F, -0.001F));

		PartDefinition cube_r180 = leftarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(38, 80).addBox(0.0F, -0.0478F, -0.9659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.6524F, 2.1282F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(85, 6).addBox(0.0F, -0.0542F, 0.047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.6524F, 0.1282F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(84, 84).addBox(0.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.4524F, 0.4282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.932F, 2.6305F, -1.1727F, -0.1611F, -0.0674F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(92, 31).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.11F, 0.6564F, 1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(77, 18).addBox(-0.9F, 0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -1.9461F, 0.4201F, 1.5708F, -1.0647F, -1.5708F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(17, 78).addBox(-0.9851F, 0.0003F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, 1.0298F, 1.1549F, -1.5708F, -1.4486F, 1.5708F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(12, 78).addBox(-1.0256F, -1.4299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.0702F, 1.5549F, -1.5708F, -1.2566F, 1.5708F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(21, 90).addBox(-0.0418F, -0.0123F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 8.6954F, 0.8336F, 1.5708F, -1.1694F, -1.5708F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 43).addBox(0.0552F, 0.0127F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 4.7954F, -0.1664F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 69).addBox(-0.0335F, -0.1622F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, -0.0046F, -0.6664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(20, 57).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 9.3893F, 1.7239F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(80, 26).addBox(-0.5F, 0.0601F, -0.6907F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.904F, 0.3209F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftArm4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(90, 22).addBox(1.5759F, -0.4234F, -1.2481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 83).addBox(1.5759F, -0.4234F, -0.6481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 1.1067F, 0.2201F, 0.143F));

		PartDefinition cube_r191 = leftArm4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(91, 3).addBox(1.5759F, 0.0877F, -1.2382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(91, 0).addBox(1.5759F, 0.0877F, -0.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 0.6092F, 0.2201F, 0.143F));

		PartDefinition cube_r192 = leftArm4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 69).addBox(1.1438F, -0.7789F, -1.2639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 93).addBox(1.1438F, -0.7789F, -1.8639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 1.0915F, -0.0442F, -0.0282F));

		PartDefinition cube_r193 = leftArm4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(94, 86).addBox(1.1438F, 0.069F, -1.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(95, 6).addBox(1.1438F, 0.069F, -1.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 0.594F, -0.0442F, -0.0282F));

		PartDefinition cube_r194 = leftArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(90, 77).addBox(0.6524F, -0.7056F, -1.737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 12).addBox(0.6524F, -0.7056F, -1.137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 1.0915F, 0.0442F, 0.0282F));

		PartDefinition cube_r195 = leftArm4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(95, 12).addBox(0.6524F, 0.0729F, -1.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(94, 80).addBox(0.6524F, 0.0729F, -1.2025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 0.594F, 0.0442F, 0.0282F));

		PartDefinition cube_r196 = leftArm4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(82, 91).addBox(0.1287F, -0.7858F, -1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 63).addBox(0.1287F, -0.7858F, -1.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 1.1067F, -0.2201F, -0.143F));

		PartDefinition cube_r197 = leftArm4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(86, 43).addBox(0.1287F, 0.0687F, -1.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(27, 87).addBox(0.1287F, 0.0687F, -1.9627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4616F, 2.109F, 0.0075F, 0.6092F, -0.2201F, -0.143F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4F, 8.5973F, -1.2591F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(62, 26).addBox(-1.5F, -1.0117F, -2.8194F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.2673F, 4.1378F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(22, 51).addBox(-1.5F, -0.2F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5119F, -0.2961F, -0.0244F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r200 = rightarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(80, 11).addBox(-0.989F, -0.8746F, 0.0689F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.8673F, -0.8622F, 0.4624F, -0.0014F, 0.001F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 6).addBox(-0.9923F, 0.0237F, -0.1126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.6673F, 0.2378F, 0.7766F, -0.0014F, 0.001F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(22, 82).addBox(-1.0F, -0.0478F, -0.9659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.6524F, 2.1282F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(85, 19).addBox(-1.0F, -0.0542F, 0.047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.6524F, 0.1282F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r204 = rightarm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(85, 10).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.4524F, 0.4282F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.932F, 2.6305F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(41, 93).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -0.11F, 0.6564F, 1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(77, 59).addBox(-1.1F, 0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -1.9461F, 0.4201F, 1.5708F, 1.0647F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(59, 79).addBox(-0.0149F, 0.0003F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, 1.0298F, 1.1549F, -1.5708F, 1.4486F, -1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(54, 78).addBox(0.0256F, -1.4299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.0702F, 1.5549F, -1.5708F, 1.2566F, -1.5708F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(90, 25).addBox(-0.9582F, -0.0123F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 8.6954F, 0.8336F, 1.5708F, 1.1694F, 1.5708F));

		PartDefinition cube_r210 = rightarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(28, 77).addBox(-1.0552F, 0.0127F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 4.7954F, -0.1664F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r211 = rightarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(51, 69).addBox(-0.9665F, -0.1622F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, -0.0046F, -0.6664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(30, 57).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 9.3893F, 1.7239F, 0.8639F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(43, 82).addBox(-0.5F, 0.0601F, -0.6907F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.904F, 0.3209F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightArm4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(26, 90).addBox(-2.5759F, -0.4234F, -1.2481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 86).addBox(-2.5759F, -0.4234F, -0.6481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 1.1067F, -0.2201F, -0.143F));

		PartDefinition cube_r213 = rightArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 66).addBox(-2.5759F, 0.0877F, -1.2382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(91, 55).addBox(-2.5759F, 0.0877F, -0.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 0.6092F, -0.2201F, -0.143F));

		PartDefinition cube_r214 = rightArm4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(94, 58).addBox(-2.1438F, -0.7789F, -1.2639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 94).addBox(-2.1438F, -0.7789F, -1.8639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 1.0915F, 0.0442F, 0.0282F));

		PartDefinition cube_r215 = rightArm4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(94, 89).addBox(-2.1438F, 0.069F, -1.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(95, 9).addBox(-2.1438F, 0.069F, -1.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 0.594F, 0.0442F, 0.0282F));

		PartDefinition cube_r216 = rightArm4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(91, 52).addBox(-1.6524F, -0.7056F, -1.737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 19).addBox(-1.6524F, -0.7056F, -1.137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 1.0915F, -0.0442F, -0.0282F));

		PartDefinition cube_r217 = rightArm4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(95, 18).addBox(-1.6524F, 0.0729F, -1.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(82, 94).addBox(-1.6524F, 0.0729F, -1.2025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 0.594F, -0.0442F, -0.0282F));

		PartDefinition cube_r218 = rightArm4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 92).addBox(-1.1287F, -0.7858F, -1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 80).addBox(-1.1287F, -0.7858F, -1.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 1.1067F, 0.2201F, 0.143F));

		PartDefinition cube_r219 = rightArm4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 86).addBox(-1.1287F, 0.0687F, -1.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(42, 87).addBox(-1.1287F, 0.0687F, -1.9627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4616F, 2.109F, 0.0075F, 0.6092F, 0.2201F, 0.143F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4854F, -5.2706F, 0.1131F, -0.3311F, -0.2863F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(28, 44).addBox(0.0F, -1.0F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8185F, -1.5478F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(31, 95).addBox(0.0F, -1.1F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4688F, -3.4393F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4131F, -5.6998F, 0.2464F, -0.2219F, -0.1244F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(34, 95).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3196F, -0.173F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(95, 38).addBox(0.0F, -2.4F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 96).addBox(0.0F, -2.1F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 9).addBox(-1.0F, -1.1F, -0.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -1.1F, -5.9F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, 0.2262F, -0.3153F, -0.1554F));

		PartDefinition cube_r225 = neck3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(35, 65).addBox(0.0F, -1.5041F, -1.5284F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4244F, -1.6688F, 0.288F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.9F, -2.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offset(0.0F, -0.2F, -5.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0F, 0.1F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 36).addBox(-2.5F, -0.9F, -0.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0422F, -1.1567F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(73, 6).addBox(-0.5F, -0.1835F, -0.3084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.4097F, -6.6437F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(51, 26).addBox(-1.0F, -0.0245F, -2.7863F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0097F, -4.4437F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(42, 17).addBox(-2.5F, 1.3606F, -5.0004F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -5.0F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(44, 0).addBox(-2.5F, -2.0712F, -0.0081F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 4.5742F, -1.5729F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(68, 2).addBox(-1.5F, -0.3107F, -0.0195F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 5.1709F, -2.201F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(56, 45).addBox(-1.5F, -1.9794F, -1.9627F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.4168F, -2.2453F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(67, 40).addBox(-1.5F, -0.8F, 0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9168F, -3.3453F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(33, 77).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1234F, -5.3129F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(35, 57).addBox(-1.5F, -0.3612F, -1.8898F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 5.1709F, -2.201F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(56, 40).addBox(-1.4F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 6.1961F, -4.5221F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(55, 55).addBox(-1.5F, -0.1141F, -0.0752F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9656F, -3.8244F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(68, 18).addBox(-1.0F, -0.4837F, 0.0372F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(67, 52).addBox(-1.0F, -0.4837F, -0.2628F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -3.1F, -1.6F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(35, 61).addBox(-1.0F, -0.4837F, -1.6628F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.6F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(9, 61).addBox(-1.0F, -0.2238F, -1.8128F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.9F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(55, 60).addBox(-1.0F, -0.3075F, -0.9171F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.9F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(9, 56).addBox(-1.0F, 0.0925F, -1.9171F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.9F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8126F, -0.5412F, -3.1566F, -1.668F, 0.6564F, -1.0893F));

		PartDefinition cube_r243 = leftHorn.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(5, 87).addBox(2.094F, 0.3113F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.6802F, -0.5055F, -0.4031F, 0.0956F, 0.4187F, -0.7252F));

		PartDefinition cube_r244 = leftHorn.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(62, 90).addBox(1.9793F, -0.0394F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 90).addBox(2.3793F, -0.0394F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(57, 90).addBox(2.7793F, -0.0394F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.6802F, -0.5055F, -0.4031F, 0.1186F, 0.4131F, -0.6683F));

		PartDefinition cube_r245 = leftHorn.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(84, 88).addBox(2.054F, 1.2344F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 87).addBox(2.454F, 1.2344F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(4.6802F, -0.5055F, -0.4031F, -0.0469F, 0.4264F, -1.0698F));

		PartDefinition cube_r246 = leftHorn.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(47, 40).addBox(-0.4545F, -0.6876F, -0.5624F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.6802F, -0.5055F, -0.4031F, 0.2509F, 0.3515F, -0.3168F));

		PartDefinition cube_r247 = leftHorn.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(79, 86).addBox(1.4984F, -0.0552F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.6802F, -0.5055F, -0.4031F, 0.1485F, 0.4038F, -0.5929F));

		PartDefinition cube_r248 = leftHorn.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(84, 68).addBox(-0.2855F, -0.4148F, -0.483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6802F, -0.5055F, -0.4031F, 0.2109F, 0.3959F, -0.4069F));

		PartDefinition cube_r249 = leftHorn.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(90, 74).addBox(-0.0001F, -0.5413F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.513F, -0.3975F, -0.5759F, 0.1556F, 0.4023F, -0.4792F));

		PartDefinition cube_r250 = leftHorn.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(67, 90).addBox(-0.9991F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.513F, -0.3975F, -0.5759F, 0.1629F, 0.3996F, -0.4605F));

		PartDefinition cube_r251 = leftHorn.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(46, 93).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2106F, 0.1737F, -0.0616F, 0.2704F, 0.2429F, -0.2483F));

		PartDefinition cube_r252 = leftHorn.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(94, 83).addBox(-0.9938F, -0.5218F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5974F, 0.3451F, 0.2916F, 0.3422F, -0.0671F, 0.1994F));

		PartDefinition cube_r253 = leftHorn.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(61, 93).addBox(-0.0156F, -0.5012F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5974F, 0.3451F, 0.2916F, 0.3482F, -0.0138F, 0.0515F));

		PartDefinition cube_r254 = leftHorn.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(94, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0464F, 0.328F, 0.1854F, 0.3242F, 0.2073F, -0.1318F));

		PartDefinition cube_r255 = leftHorn.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(67, 84).addBox(-0.1702F, 0.019F, -0.5543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6802F, -0.5055F, -0.0031F, 0.3056F, 0.2343F, -0.2168F));

		PartDefinition cube_r256 = leftHorn.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(77, 69).addBox(-0.0014F, -0.4477F, -0.5546F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6802F, -0.5055F, -0.0031F, 0.3342F, 0.1904F, -0.0812F));

		PartDefinition cube_r257 = leftHorn.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(81, 72).addBox(-2.0204F, -0.9555F, -0.3358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1F, 0.0F, 0.3268F, 0.169F, -0.4608F));

		PartDefinition cube_r258 = leftHorn.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(78, 36).addBox(-1.9815F, -0.1318F, -0.6584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, -0.8F, 0.0F, 0.2514F, -0.2696F, 0.8035F));

		PartDefinition cube_r259 = leftHorn.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(81, 51).addBox(0.0F, 0.0336F, -0.6584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3624F, -0.0561F, 0.1468F));

		PartDefinition cube_r260 = leftHorn.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(60, 84).addBox(-1.7339F, -0.0143F, -0.73F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7F, -1.0F, 0.0F, 0.3551F, -0.0929F, 0.2451F));

		PartDefinition cube_r261 = leftHorn.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(89, 89).addBox(0.0177F, -0.9758F, -0.1567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.6F, 0.0F, 0.3663F, 0.0125F, -0.0326F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8126F, -0.5412F, -3.1566F, -1.668F, -0.6564F, 1.0893F));

		PartDefinition cube_r262 = rightHorn.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-3.094F, 0.3113F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, -0.5055F, -0.4031F, 0.0956F, -0.4187F, 0.7252F));

		PartDefinition cube_r263 = rightHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(-2.9793F, -0.0394F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 90).mirror().addBox(-3.3793F, -0.0394F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(57, 90).mirror().addBox(-3.7793F, -0.0394F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, -0.5055F, -0.4031F, 0.1186F, -0.4131F, 0.6683F));

		PartDefinition cube_r264 = rightHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-3.054F, 1.2344F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 87).mirror().addBox(-3.454F, 1.2344F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, -0.5055F, -0.4031F, -0.0469F, -0.4264F, 1.0698F));

		PartDefinition cube_r265 = rightHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-2.5455F, -0.6876F, -0.5624F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, -0.5055F, -0.4031F, 0.2509F, -0.3515F, 0.3168F));

		PartDefinition cube_r266 = rightHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(-2.4984F, -0.0552F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, -0.5055F, -0.4031F, 0.1485F, -0.4038F, 0.5929F));

		PartDefinition cube_r267 = rightHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(84, 68).mirror().addBox(-1.7145F, -0.4148F, -0.483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6802F, -0.5055F, -0.4031F, 0.2109F, -0.3959F, 0.4069F));

		PartDefinition cube_r268 = rightHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-0.9999F, -0.5413F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.513F, -0.3975F, -0.5759F, 0.1556F, -0.4023F, 0.4792F));

		PartDefinition cube_r269 = rightHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(67, 90).mirror().addBox(-0.0009F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.513F, -0.3975F, -0.5759F, 0.1629F, -0.3996F, 0.4605F));

		PartDefinition cube_r270 = rightHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(46, 93).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2106F, 0.1737F, -0.0616F, 0.2704F, -0.2429F, 0.2483F));

		PartDefinition cube_r271 = rightHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 83).mirror().addBox(-0.0062F, -0.5218F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5974F, 0.3451F, 0.2916F, 0.3422F, 0.0671F, -0.1994F));

		PartDefinition cube_r272 = rightHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(61, 93).mirror().addBox(-0.9844F, -0.5012F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5974F, 0.3451F, 0.2916F, 0.3482F, 0.0138F, -0.0515F));

		PartDefinition cube_r273 = rightHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(94, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0464F, 0.328F, 0.1854F, 0.3242F, -0.2073F, 0.1318F));

		PartDefinition cube_r274 = rightHorn.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(-1.8298F, 0.019F, -0.5543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6802F, -0.5055F, -0.0031F, 0.3056F, -0.2343F, 0.2168F));

		PartDefinition cube_r275 = rightHorn.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-1.9986F, -0.4477F, -0.5546F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6802F, -0.5055F, -0.0031F, 0.3342F, -0.1904F, 0.0812F));

		PartDefinition cube_r276 = rightHorn.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(81, 72).mirror().addBox(0.0204F, -0.9555F, -0.3358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1F, 0.0F, 0.3268F, -0.169F, 0.4608F));

		PartDefinition cube_r277 = rightHorn.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(78, 36).mirror().addBox(-0.0185F, -0.1318F, -0.6584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.8F, 0.0F, 0.2514F, 0.2696F, -0.8035F));

		PartDefinition cube_r278 = rightHorn.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-2.0F, 0.0336F, -0.6584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3624F, 0.0561F, -0.1468F));

		PartDefinition cube_r279 = rightHorn.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(60, 84).mirror().addBox(-0.2661F, -0.0143F, -0.73F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.0F, 0.0F, 0.3551F, 0.0929F, -0.2451F));

		PartDefinition cube_r280 = rightHorn.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(89, 89).mirror().addBox(-1.0177F, -0.9758F, -0.1567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.6F, 0.0F, 0.3663F, -0.0125F, 0.0326F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 7.9742F, -2.7729F));

		PartDefinition cube_r281 = leftMaxilla.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(34, 71).addBox(-0.5F, -0.3609F, -1.3726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7F, -0.2178F, -2.8689F, 1.0472F, 0.0F, -0.0698F));

		PartDefinition cube_r282 = leftMaxilla.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(47, 34).addBox(-0.5F, -0.5586F, -1.6067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.2178F, -2.8689F, 1.2566F, 0.0F, -0.0698F));

		PartDefinition cube_r283 = leftMaxilla.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(45, 43).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1026F, -2.6022F, 1.1035F, -0.0632F, -0.1246F));

		PartDefinition cube_r284 = leftMaxilla.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(57, 87).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(63, 69).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6449F, 1.5516F, -3.5793F, 1.1638F, 0.0971F, 0.2435F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 7.9742F, -2.7729F));

		PartDefinition cube_r285 = rightMaxilla.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(34, 71).mirror().addBox(-0.5F, -0.3609F, -1.3726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.2178F, -2.8689F, 1.0472F, 0.0F, 0.0698F));

		PartDefinition cube_r286 = rightMaxilla.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(47, 34).mirror().addBox(-0.5F, -0.5586F, -1.6067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.2178F, -2.8689F, 1.2566F, 0.0F, 0.0698F));

		PartDefinition cube_r287 = rightMaxilla.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(45, 43).mirror().addBox(-0.5F, -0.6F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1026F, -2.6022F, 1.1035F, 0.0632F, 0.1246F));

		PartDefinition cube_r288 = rightMaxilla.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(57, 87).mirror().addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(63, 69).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6449F, 1.5516F, -3.5793F, 1.1638F, -0.0971F, -0.2435F));

		PartDefinition leftFrontossicone = head.addOrReplaceChild("leftFrontossicone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6989F, 1.2987F, -4.1355F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r289 = leftFrontossicone.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(85, 27).addBox(0.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0F, 0.1621F, 0.0217F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftFrontossicone.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(85, 23).addBox(0.5F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.0F, 0.1621F, 0.0217F, 1.4661F, 0.0F, 0.0F));

		PartDefinition rightFrontossicone = head.addOrReplaceChild("rightFrontossicone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6989F, 1.2987F, -4.1355F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r291 = rightFrontossicone.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-1.5F, -0.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1621F, 0.0217F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightFrontossicone.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-1.5F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1621F, 0.0217F, 1.4661F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(0.9F, 1.0856F, -1.9235F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7778F, 0.3998F, -1.2865F, 1.4097F, -0.2709F, -1.0252F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(70, 69).addBox(-0.9718F, -0.2735F, -0.0693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5383F, -0.9097F, 1.3443F, 1.4986F, -0.8858F, -0.7773F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(37, 76).addBox(-0.1564F, -0.1401F, -0.2093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6716F, -0.1036F, -0.3114F, 0.7123F, -0.2636F, 0.479F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(47, 87).addBox(-0.5F, -0.7093F, -0.1721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1435F, -1.6126F, 0.9599F, 0.0F, 0.4538F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5F, -0.7183F, -1.8255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1435F, -1.6126F, 1.4661F, 0.0F, 0.4538F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(67, 48).addBox(-1.0F, 0.4F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6716F, -0.1036F, -0.9114F, 1.201F, -0.2636F, 0.479F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(9, 70).addBox(-2.5984F, -1.6968F, -0.7528F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -0.5F, 0.0F, 1.1148F, -0.111F, -0.2941F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-0.9F, 1.0856F, -1.9235F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7778F, 0.3998F, -1.2865F, 1.4097F, 0.2709F, 1.0252F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-0.0282F, -0.2735F, -0.0693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5383F, -0.9097F, 1.3443F, 1.4986F, 0.8858F, 0.7773F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(37, 76).mirror().addBox(-0.8436F, -0.1401F, -0.2093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6716F, -0.1036F, -0.3114F, 0.7123F, 0.2636F, -0.479F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(47, 87).mirror().addBox(-0.5F, -0.7093F, -0.1721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1435F, -1.6126F, 0.9599F, 0.0F, -0.4538F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.5F, -0.7183F, -1.8255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1435F, -1.6126F, 1.4661F, 0.0F, -0.4538F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(-1.0F, 0.4F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6716F, -0.1036F, -0.9114F, 1.201F, 0.2636F, -0.479F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(0.5984F, -1.6968F, -0.7528F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.5F, 0.0F, 1.1148F, 0.111F, 0.2941F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.3771F, -1.1007F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(28, 49).addBox(-0.5F, -0.2469F, 0.3555F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 3.9214F, -10.4054F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(0.4F, -0.5F, 0.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 3.593F, -10.1236F, -1.4967F, -0.0462F, 0.5568F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(37, 95).mirror().addBox(-0.0577F, -0.247F, -0.2965F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9426F, 3.495F, -4.4086F, -1.6429F, -0.2085F, 0.0152F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.3429F, 0.0131F, 0.0941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9426F, 3.495F, -4.4086F, -1.7104F, -0.2094F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(0.0F, -0.5577F, -0.9176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 4.5669F, -5.1257F, -1.606F, -0.1745F, 0.0019F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(0.0F, 0.2423F, -0.9176F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 4.5669F, -5.1257F, -1.6065F, -0.2443F, 0.0044F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 21).mirror().addBox(-0.0574F, -2.3714F, -0.2308F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 21).addBox(2.7426F, -2.3714F, -0.2308F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9426F, 3.495F, -4.3086F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-1.0F, -0.1119F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(64, 79).addBox(1.2F, -0.1119F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 2.9669F, -2.1257F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-1.0F, 0.009F, -0.9582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(85, 36).addBox(1.2F, 0.009F, -0.9582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2F, 4.6669F, -3.2257F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(37, 85).mirror().addBox(-1.0F, -0.2195F, -0.9153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(37, 85).addBox(1.2F, -0.2195F, -0.9153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 4.1669F, -1.5257F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(77, 2).mirror().addBox(-1.0F, -0.0689F, -0.1572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(77, 2).addBox(2.2F, -0.0689F, -0.1572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.7F, 0.6669F, 0.2743F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(27, 83).mirror().addBox(-1.0F, -1.7196F, -0.0127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(27, 83).addBox(2.2F, -1.7196F, -0.0127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7F, 2.8669F, -2.1257F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(-1.0F, -0.0187F, -0.9433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 80).addBox(2.2F, -0.0187F, -0.9433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 3.9669F, 0.0743F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-1.0F, -0.9F, 0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(56, 69).addBox(2.2F, -0.9F, 0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7F, 1.5669F, -1.3257F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.6F, 0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 95).addBox(2.8F, 0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2F, -0.664F, 0.4144F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(32, 85).mirror().addBox(-1.1F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(32, 85).addBox(2.3F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, 0.0669F, -0.9257F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-1.0F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(33, 80).addBox(2.2F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7F, 0.0669F, -0.8257F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(59, 6).addBox(-1.4F, -0.5F, 0.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.593F, -10.1236F, -1.4967F, 0.0462F, -0.5568F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(37, 95).addBox(0.0577F, -0.247F, -0.2965F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7426F, 3.495F, -4.4086F, -1.6429F, 0.2085F, -0.0152F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 85).addBox(-0.6571F, 0.0131F, 0.0941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7426F, 3.495F, -4.4086F, -1.7104F, 0.2094F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(85, 40).addBox(-1.0F, -0.5577F, -0.9176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 4.5669F, -5.1257F, -1.606F, 0.1745F, -0.0019F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(42, 70).addBox(-1.0F, 0.2423F, -0.9176F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 4.5669F, -5.1257F, -1.6065F, 0.2443F, -0.0044F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(67, 87).addBox(-1.0F, 0.6172F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 87).addBox(-1.0F, 0.1172F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 4.4669F, -8.9257F, -1.4835F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(73, 14).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5464F, 1.6845F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 61).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0347F, 1.9387F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(11, 50).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0037F, 2.8952F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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