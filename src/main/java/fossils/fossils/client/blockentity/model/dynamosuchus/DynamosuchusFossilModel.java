package fossils.fossils.client.blockentity.model.dynamosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DynamosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public DynamosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.bone = this.hip.getChild("bone");
		this.bone4 = this.hip.getChild("bone4");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hip.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.leftArm = this.chest2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone3 = this.chest2.getChild("bone3");
		this.neck2 = this.chest2.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, -14.3F, 3.3F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 97).addBox(-0.5F, -1.6594F, -0.0776F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 1.6F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -2.0281F, -0.0926F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -0.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 0).addBox(-0.996F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.004F, -4.0246F, -1.0741F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-2.0F, 0.3F, 0.9F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 53).addBox(1.0F, 0.3F, 0.9F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 22).addBox(0.0F, -0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone = hip.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9507F, -0.8655F, 0.5377F, 0.0F, 0.0F, 0.4276F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 72).addBox(-0.5497F, -0.6101F, 0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4799F, 1.1697F, 0.1222F, 0.0F, -0.2967F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0954F, -1.2754F, 1.4237F, -0.1745F, 0.0F, -0.2967F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(84, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, -1.421F, 0.4333F, -0.1222F, 0.0F, -0.2967F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(84, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0583F, -1.4275F, 0.438F, -1.5184F, 0.0F, -0.2967F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.068F, -1.3651F, -0.5541F, -0.2094F, 0.0F, -0.2967F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 69).addBox(-0.5F, -0.35F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, -0.3652F, 0.2014F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 29).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0777F, 1.1056F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4F, -0.0046F, -0.9815F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(83, 82).addBox(-0.5F, -1.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4F, 0.3F, 0.4F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 25).addBox(-0.1511F, -0.535F, -0.6157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(39, 66).addBox(-0.1511F, -0.5611F, -0.6567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1819F, 0.9405F, -1.6646F, -2.1311F, 0.0407F, 0.338F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 5).addBox(-0.3776F, -0.5759F, 0.8538F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1819F, 0.9405F, -1.6646F, -2.1371F, 0.0149F, 0.1213F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 60).addBox(-0.3015F, -0.5487F, 1.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 57).addBox(-0.3015F, -0.5487F, 1.2134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1739F, 3.041F, -3.2102F, -1.919F, 0.0149F, -0.1405F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 65).addBox(-0.3015F, -0.7415F, -0.2728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1739F, 3.041F, -3.2102F, -2.0499F, 0.0149F, -0.1405F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(83, 43).addBox(-0.1155F, -0.1346F, -1.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 40).addBox(-0.1155F, -0.6346F, -1.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0819F, 1.1655F, -1.8146F, 3.1046F, 0.0633F, 0.2089F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 83).addBox(-0.1155F, -0.6829F, -0.8063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0819F, 1.1655F, -1.8146F, -3.0913F, 0.0633F, 0.2089F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 0).addBox(-0.1079F, -0.4692F, -2.661F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.3708F, 2.6067F, 2.1014F, 2.4207F, 0.0808F, 0.017F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(55, 51).addBox(-0.1079F, -0.4724F, -2.681F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3708F, 2.6067F, 2.1014F, 2.2244F, 0.0808F, 0.017F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(55, 46).addBox(-0.1806F, -0.3381F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3708F, 2.8067F, 2.1014F, 2.2849F, -0.0926F, 0.2871F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(82, 28).addBox(-1.0F, -1.3567F, -0.7002F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.85F, 1.0F, 0.4F, 1.597F, 0.0F, 0.2182F));

		PartDefinition bone4 = hip.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9507F, -0.8655F, 0.5377F, 0.0F, 0.0F, -0.4276F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-0.4503F, -0.6101F, 0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4799F, 1.1697F, 0.1222F, 0.0F, 0.2967F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0954F, -1.2754F, 1.4237F, -0.1745F, 0.0F, 0.2967F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, -1.421F, 0.4333F, -0.1222F, 0.0F, 0.2967F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0583F, -1.4275F, 0.438F, -1.5184F, 0.0F, 0.2967F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.068F, -1.3651F, -0.5541F, -0.2094F, 0.0F, 0.2967F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.5F, -0.35F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3652F, 0.2014F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 29).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0777F, 1.1056F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0046F, -0.9815F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(83, 82).mirror().addBox(-0.5F, -1.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3F, 0.4F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 25).mirror().addBox(-0.8489F, -0.535F, -0.6157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(39, 66).mirror().addBox(-0.8489F, -0.5611F, -0.6567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1819F, 0.9405F, -1.6646F, -2.1311F, -0.0407F, -0.338F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(67, 5).mirror().addBox(-0.6224F, -0.5759F, 0.8538F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1819F, 0.9405F, -1.6646F, -2.1371F, -0.0149F, -0.1213F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(83, 60).mirror().addBox(-0.6985F, -0.5487F, 1.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(83, 57).mirror().addBox(-0.6985F, -0.5487F, 1.2134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1739F, 3.041F, -3.2102F, -1.919F, -0.0149F, 0.1405F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-0.6985F, -0.7415F, -0.2728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1739F, 3.041F, -3.2102F, -2.0499F, -0.0149F, 0.1405F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-0.8845F, -0.1346F, -1.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(83, 40).mirror().addBox(-0.8845F, -0.6346F, -1.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0819F, 1.1655F, -1.8146F, 3.1046F, -0.0633F, -0.2089F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-0.8845F, -0.6829F, -0.8063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0819F, 1.1655F, -1.8146F, -3.0913F, -0.0633F, -0.2089F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.8921F, -0.4692F, -2.661F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.3708F, 2.6067F, 2.1014F, 2.4207F, -0.0808F, -0.017F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(55, 51).mirror().addBox(-0.8921F, -0.4724F, -2.681F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3708F, 2.6067F, 2.1014F, 2.2244F, -0.0808F, -0.017F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(55, 46).mirror().addBox(-0.8194F, -0.3381F, -0.0422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3708F, 2.8067F, 2.1014F, 2.2849F, 0.0926F, -0.2871F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(0.0F, -1.3567F, -0.7002F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 1.0F, 0.4F, 1.597F, 0.0F, -0.2182F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, 0.0673F, 0.5503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 59).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 4.9963F, -0.8353F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 84).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8474F, -1.9647F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 84).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 6.8467F, -1.9298F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(59, 69).addBox(-0.5F, 0.05F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.4287F, -1.219F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(84, 32).addBox(0.0F, 1.0003F, -0.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.587F, -1.7302F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 66).addBox(0.0F, -0.0997F, -0.7321F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, 1.2933F, 0.3986F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(14, 69).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.2083F, -0.6454F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 0.2092F, -0.689F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 17).addBox(0.0F, -0.875F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.1125F, -0.4205F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(84, 14).addBox(0.0F, 0.05F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6498F, 0.4229F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(78, 94).addBox(0.0F, -0.475F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(46, 84).addBox(-1.0F, -0.2F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 7.8533F, -1.0231F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 85).addBox(0.0F, -0.2108F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(51, 85).addBox(0.0F, -0.2108F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 0.0752F, -0.3786F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 49).addBox(0.0F, -1.4358F, -0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(85, 46).addBox(0.0F, -1.1108F, -0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 1.3F, -0.4F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 20).addBox(0.0F, -1.8358F, -0.1507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3F, -0.4F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 0).addBox(0.0F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.8391F, -0.0386F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(29, 85).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 2.4284F, -0.3898F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(17, 85).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8366F, -0.2908F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(33, 42).addBox(0.0F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 2.5F, 0.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 25).addBox(-1.0F, 0.575F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5184F, -0.7976F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(84, 74).addBox(-0.5F, -0.9F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.2274F, -0.1139F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 71).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 1.0512F, 0.9902F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.8F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(50, 41).addBox(-1.0F, -0.2F, -2.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 12).addBox(-2.0F, -0.2F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.6891F, 0.9363F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(32, 14).addBox(-1.0F, -0.5F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 40).addBox(-2.0F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3342F, -2.606F, -0.4102F, 0.0F, 0.0F));

		PartDefinition rightLeg = hip.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 0.0673F, 0.5503F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(38, 80).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 4.9963F, -0.8353F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(83, 85).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8474F, -1.9647F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(78, 85).addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 6.8467F, -1.9298F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(21, 70).addBox(-0.5F, 0.05F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 6.4287F, -1.219F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(73, 85).addBox(-1.0F, 1.0003F, -0.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.587F, -1.7302F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.0997F, -0.7321F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.2933F, 0.3986F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(66, 69).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 1.2083F, -0.6454F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(85, 66).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 0.2092F, -0.689F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(85, 63).addBox(-1.0F, -0.875F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.1125F, -0.4205F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 85).addBox(-1.0F, 0.05F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6498F, 0.4229F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(83, 94).addBox(-1.0F, -0.475F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -0.2F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 7.8533F, -1.0231F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(87, 77).addBox(-1.0F, -0.2108F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(66, 87).addBox(-1.0F, -0.2108F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 0.0752F, -0.3786F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(87, 52).addBox(-1.0F, -1.4358F, -0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(44, 87).addBox(-1.0F, -1.1108F, -0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 1.3F, -0.4F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 80).addBox(-1.0F, -1.8358F, -0.1507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3F, -0.4F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(43, 80).addBox(-1.0F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.8391F, -0.0386F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(39, 87).addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 2.4284F, -0.3898F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(87, 35).addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8366F, -0.2908F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(14, 77).addBox(-1.0F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 2.5F, 0.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(34, 63).addBox(0.0F, 0.575F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(34, 87).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5184F, -0.7976F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(87, 28).addBox(-0.5F, -0.9F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.2274F, -0.1139F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(22, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 1.0512F, 0.9902F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 0.8F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -0.2F, -2.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(55, 56).addBox(1.0F, -0.2F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.6891F, 0.9363F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.5F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F))
				.texOffs(41, 20).addBox(1.0F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3342F, -2.606F, -0.4102F, 0.0F, 0.0F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -1.7F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(20, 95).addBox(-0.5F, -2.711F, -0.0029F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.8F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(88, 3).addBox(-0.5F, -2.2512F, -0.0119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -2.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(30, 65).addBox(-0.5F, -2.4149F, -0.0219F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(-2.0862F, -0.6507F, -0.4588F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.091F, 0.014F, -0.9574F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(80, 53).mirror().addBox(-1.2575F, -0.1532F, -0.4849F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.0934F, -0.0029F, -0.5388F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 49).mirror().addBox(-1.438F, -0.24F, -0.4766F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.2306F, 0.0731F, -0.4983F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-2.2157F, -0.8033F, -0.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.1858F, 0.1391F, -0.9144F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-3.6975F, -1.635F, -0.4471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.1133F, 0.2025F, -1.3347F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-4.8891F, -1.5907F, -0.5169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.1265F, 0.2531F, -1.3141F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-2.3728F, -0.6848F, -0.5169F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.2187F, 0.1801F, -0.8916F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 75).mirror().addBox(-1.5319F, -0.0682F, -0.5493F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.277F, 0.0975F, -0.4767F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(93, 59).addBox(1.0862F, -0.6507F, -0.4588F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.091F, -0.014F, 0.9574F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(80, 53).addBox(-0.7425F, -0.1532F, -0.4849F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.0934F, 0.0029F, 0.5388F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 49).addBox(-0.562F, -0.24F, -0.4766F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.2306F, -0.0731F, 0.4983F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(97, 26).addBox(1.2158F, -0.8033F, -0.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.1858F, -0.1391F, 0.9144F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(56, 17).addBox(1.6975F, -1.635F, -0.4471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.1133F, -0.2025F, 1.3347F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(32, 20).addBox(1.8891F, -1.5907F, -0.5169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.1265F, -0.2531F, 1.3141F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(63, 32).addBox(1.3728F, -0.6848F, -0.5169F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.2187F, -0.1801F, 0.8916F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(77, 75).addBox(-0.4681F, -0.0682F, -0.5493F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.277F, -0.0975F, 0.4767F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -2.2F, -3.6F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1803F, -1.4347F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(13, 36).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8188F, -3.4727F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(52, 19).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.5145F, -6.4365F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.7F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -5.8F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(87, 97).addBox(0.0F, -2.0743F, -0.0425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-6.8825F, -1.4719F, -0.5574F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.1074F, 0.2407F, -1.2328F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-2.3184F, -0.579F, -0.5574F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.1964F, 0.1763F, -0.8096F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-1.4384F, 0.0062F, -0.5881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.2552F, 0.103F, -0.3929F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(41, 26).mirror().addBox(-5.9726F, -1.4472F, -0.5756F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.1184F, 0.2742F, -1.2478F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(3, 97).mirror().addBox(-2.3907F, -0.5198F, -0.5756F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.2202F, 0.2025F, -0.8228F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-1.48F, 0.0896F, -0.6075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.2875F, 0.1175F, -0.4072F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-1.9283F, 0.0694F, -0.6533F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.3232F, 0.1228F, -0.4368F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(96, 96).mirror().addBox(-2.793F, -0.7205F, -0.6119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.2512F, 0.2217F, -0.8502F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(73, 57).mirror().addBox(-5.2585F, -1.7942F, -0.6119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.1389F, 0.3042F, -1.2759F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(54, 10).addBox(1.8825F, -1.4719F, -0.5574F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.1074F, -0.2407F, 1.2328F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(13, 97).addBox(1.3184F, -0.579F, -0.5574F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.1964F, -0.1763F, 0.8096F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(82, 26).addBox(-0.5616F, 0.0062F, -0.5881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.2552F, -0.103F, 0.3929F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(41, 26).addBox(1.9726F, -1.4472F, -0.5756F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.1184F, -0.2742F, 1.2478F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(3, 97).addBox(1.3907F, -0.5198F, -0.5756F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.2202F, -0.2025F, 0.8228F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(82, 24).addBox(-0.52F, 0.0896F, -0.6075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.2875F, -0.1175F, 0.4072F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(81, 6).addBox(-0.0717F, 0.0694F, -0.6533F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.3232F, -0.1228F, 0.4368F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(96, 96).addBox(1.793F, -0.7205F, -0.6119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.2512F, -0.2217F, 0.8502F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(73, 57).addBox(2.2585F, -1.7942F, -0.6119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.1389F, -0.3042F, 1.2759F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(93, 96).addBox(0.0F, -2.0276F, -0.0086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 97).addBox(0.0F, -1.8053F, -0.1733F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -4.7F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.6632F, 0.7092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.4577F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(33, 53).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8386F, -0.5818F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.5F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, 5.5884F, -6.3849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8991F, -4.775F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r137 = chest2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(17, 15).addBox(-2.5F, -2.0F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.635F, 1.7202F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(95, 61).addBox(0.0F, -1.8641F, -0.0293F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(95, 43).addBox(0.0F, -1.6107F, -0.0488F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -4.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-6.9298F, -1.4921F, -0.5892F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.505F, 0.1462F, 0.2661F, -1.3418F));

		PartDefinition cube_r141 = chest2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(94, 24).mirror().addBox(-2.3699F, -0.5782F, -0.5892F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.505F, 0.2418F, 0.1841F, -0.9201F));

		PartDefinition cube_r142 = chest2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(73, 80).mirror().addBox(-1.4844F, 0.0277F, -0.6209F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.505F, 0.2994F, 0.0921F, -0.5073F));

		PartDefinition cube_r143 = chest2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 55).mirror().addBox(-1.441F, -0.0205F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.505F, 0.2772F, 0.0969F, -0.459F));

		PartDefinition cube_r144 = chest2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(93, 84).mirror().addBox(-2.3096F, -0.6043F, -0.5408F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.505F, 0.2192F, 0.1796F, -0.8738F));

		PartDefinition cube_r145 = chest2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(-6.8641F, -1.4915F, -0.5408F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.505F, 0.1271F, 0.2529F, -1.2963F));

		PartDefinition cube_r146 = chest2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(54, 8).addBox(1.9298F, -1.4921F, -0.5892F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.505F, 0.1462F, -0.2661F, 1.3418F));

		PartDefinition cube_r147 = chest2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(94, 24).addBox(1.3699F, -0.5782F, -0.5892F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.505F, 0.2418F, -0.1841F, 0.9201F));

		PartDefinition cube_r148 = chest2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(73, 80).addBox(-0.5156F, 0.0277F, -0.6209F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.505F, 0.2994F, -0.0921F, 0.5073F));

		PartDefinition cube_r149 = chest2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(80, 55).addBox(-0.559F, -0.0205F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.505F, 0.2772F, -0.0969F, 0.459F));

		PartDefinition cube_r150 = chest2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 84).addBox(1.3096F, -0.6043F, -0.5408F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.505F, 0.2192F, -0.1796F, 0.8738F));

		PartDefinition cube_r151 = chest2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(54, 6).addBox(1.8641F, -1.4915F, -0.5408F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.505F, 0.1271F, -0.2529F, 1.2963F));

		PartDefinition cube_r152 = chest2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(11, 54).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5884F, -6.3849F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(28, 22).addBox(-0.5F, -0.5F, -10.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(78, 46).addBox(-1.0F, 0.0F, 3.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(26, 36).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7676F, -4.9939F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftArm = chest2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(68, 77).addBox(-1.0F, -0.5496F, 3.9258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(28, 70).addBox(-0.5F, -0.5496F, 1.9258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(77, 72).addBox(-1.0F, -0.5496F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1411F, 5.7441F, -5.9386F, -1.4258F, 0.284F, -0.2058F));

		PartDefinition cube_r155 = leftArm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(35, 70).addBox(0.1F, -1.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7755F, 0.4504F, 2.285F, 0.0F, 0.2007F, 0.0F));

		PartDefinition cube_r156 = leftArm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(70, 33).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 0.4504F, 0.9258F, 0.0F, -0.3665F, 0.0F));

		PartDefinition cube_r157 = leftArm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 88).addBox(-0.325F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2993F, -0.0496F, 4.1422F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r158 = leftArm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 88).addBox(-0.1F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.0496F, 4.4258F, 0.0F, 1.0036F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(70, 37).addBox(-0.1864F, -0.4404F, -0.2021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 70).addBox(-1.2864F, -0.4404F, -0.2021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3597F, -0.104F, 5.3574F, 0.5753F, -0.2839F, -0.0695F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(61, 34).addBox(-1.1F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7864F, -0.2086F, 1.405F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(61, 38).addBox(-1.1F, -0.6F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7079F, -1.4886F, -0.6021F, 0.0025F, 0.0013F));

		PartDefinition rightArm = chest2.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(75, 77).addBox(-1.0F, -0.5496F, 3.9258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(71, 43).addBox(-0.5F, -0.5496F, 1.9258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(19, 78).addBox(-1.0F, -0.5496F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1411F, 5.7441F, -5.9386F, -0.5095F, -0.284F, 0.2058F));

		PartDefinition cube_r159 = rightArm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(71, 60).addBox(-1.1F, -1.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7755F, 0.4504F, 2.285F, 0.0F, -0.2007F, 0.0F));

		PartDefinition cube_r160 = rightArm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(71, 47).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 0.4504F, 0.9258F, 0.0F, 0.3665F, 0.0F));

		PartDefinition cube_r161 = rightArm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 38).addBox(-0.675F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2993F, -0.0496F, 4.1422F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r162 = rightArm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(27, 88).addBox(-0.9F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.0496F, 4.4258F, 0.0F, -1.0036F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(72, 9).addBox(-0.8136F, -0.4404F, -0.2021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 15).addBox(0.2864F, -0.4404F, -0.2021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3597F, -0.104F, 5.3574F, 0.4444F, 0.2839F, 0.0695F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(61, 42).addBox(-0.9F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7864F, -0.2086F, 1.405F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(53, 61).addBox(-0.9F, -0.6F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7079F, -1.4886F, -0.8203F, -0.0025F, -0.0013F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 6.9862F, -6.635F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -6.4282F, 3.3187F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r164 = bone2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(49, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -3.5919F, 0.3261F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r165 = bone2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(13, 29).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8F, -5.2019F, 1.7074F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r166 = bone2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(5, 73).addBox(-1.2F, 1.2792F, -0.9737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, -0.7532F, 0.1766F, 0.4081F));

		PartDefinition cube_r167 = bone2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(68, 80).addBox(-1.2F, 0.0392F, -1.6241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(80, 67).addBox(-1.2F, 0.0392F, -0.9741F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, 0.1369F, 0.1766F, 0.4081F));

		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(42, 72).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2292F, -2.2093F, -0.279F, -2.2368F, 0.1766F, 0.4081F));

		PartDefinition cube_r169 = bone2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(80, 63).addBox(-1.2F, 0.3621F, 0.7338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.65F, -3.2478F, 0.7346F, -1.4514F, 0.1766F, 0.4081F));

		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(88, 41).addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F))
				.texOffs(78, 82).addBox(-0.5F, -0.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.1001F, -1.6712F, 0.2535F, 3.1301F, 0.1766F, 0.4081F));

		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(72, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8948F, -1.0209F, 0.6381F, -0.3306F, -0.523F, 0.0504F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 6.9862F, -6.635F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r172 = bone3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -6.4282F, 3.3187F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r173 = bone3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -3.5919F, 0.3261F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bone3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(13, 29).mirror().addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -5.2019F, 1.7074F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bone3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(0.2F, 1.2792F, -0.9737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, -0.7532F, -0.1766F, -0.4081F));

		PartDefinition cube_r176 = bone3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(68, 80).mirror().addBox(0.2F, 0.0392F, -1.6241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(80, 67).mirror().addBox(0.2F, 0.0392F, -0.9741F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, 0.1369F, -0.1766F, -0.4081F));

		PartDefinition cube_r177 = bone3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(42, 72).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2292F, -2.2093F, -0.279F, -2.2368F, -0.1766F, -0.4081F));

		PartDefinition cube_r178 = bone3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(0.2F, 0.3621F, 0.7338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.65F, -3.2478F, 0.7346F, -1.4514F, -0.1766F, -0.4081F));

		PartDefinition cube_r179 = bone3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false)
				.texOffs(78, 82).mirror().addBox(-0.5F, -0.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.1001F, -1.6712F, 0.2535F, 3.1301F, -0.1766F, -0.4081F));

		PartDefinition cube_r180 = bone3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8948F, -1.0209F, 0.6381F, -0.3306F, 0.523F, -0.0504F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, -0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(30, 96).addBox(0.0F, -1.6215F, 0.0228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(94, 92).addBox(0.0F, -1.9084F, -0.3257F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-2.9135F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.605F, 0.1374F, 0.505F, -1.2889F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.605F, 0.347F, 0.4244F, -0.8281F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(73, 51).mirror().addBox(-4.757F, -1.4473F, -0.5831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -0.505F, 0.0274F, 0.3043F, -1.5453F));

		PartDefinition cube_r186 = neck2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(94, 32).mirror().addBox(-2.1938F, -0.6076F, -0.5831F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -0.505F, 0.1516F, 0.2662F, -1.1103F));

		PartDefinition cube_r187 = neck2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-1.3356F, -0.0707F, -0.6112F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -0.505F, 0.2521F, 0.2028F, -0.6843F));

		PartDefinition cube_r188 = neck2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 81).addBox(0.9136F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.605F, 0.1374F, -0.505F, 1.2889F));

		PartDefinition cube_r189 = neck2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(95, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.605F, 0.347F, -0.4244F, 0.8281F));

		PartDefinition cube_r190 = neck2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 51).addBox(1.757F, -1.4473F, -0.5831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -0.505F, 0.0274F, -0.3043F, 1.5453F));

		PartDefinition cube_r191 = neck2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(94, 32).addBox(1.1938F, -0.6076F, -0.5831F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -0.505F, 0.1516F, -0.2662F, 1.1103F));

		PartDefinition cube_r192 = neck2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(80, 80).addBox(-0.6644F, -0.0707F, -0.6112F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -0.505F, 0.2521F, -0.2028F, 0.6843F));

		PartDefinition cube_r193 = neck2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(39, 29).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1109F, -4.0549F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r194 = neck2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(39, 41).addBox(-0.5F, -0.5F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, -0.0951F, 0.218F, 0.0077F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(41, 96).addBox(0.0F, -1.6698F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(38, 96).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(52, 24).addBox(-0.51F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.49F, -2.3121F, -3.0384F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -2.705F, 0.2894F, 0.8525F, -1.1919F));

		PartDefinition cube_r199 = neck.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -2.705F, 0.6627F, 0.6751F, -0.6609F));

		PartDefinition cube_r200 = neck.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -0.705F, 0.5001F, 0.5613F, -0.7554F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-2.9135F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0904F, -0.705F, 0.2062F, 0.6884F, -1.2501F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(33, 96).addBox(0.9136F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -2.705F, 0.2894F, -0.8525F, 1.1919F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(96, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -2.705F, 0.6627F, -0.6751F, 0.6609F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(95, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.705F, 0.5001F, -0.5613F, 0.7554F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(81, 4).addBox(0.9136F, -0.4062F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.705F, 0.2062F, -0.6884F, 1.2501F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -0.5F, -4.95F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0039F, -2.9767F, -0.2822F, 0.3048F, -0.0192F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 81).addBox(0.0F, -1.2F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(52, 29).addBox(-1.0F, -1.225F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8082F, -1.889F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(60, 96).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0057F, -1.7283F, 0.6627F, 0.6751F, -0.6609F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0057F, -1.7283F, 0.2894F, 0.8525F, -1.1919F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(96, 86).addBox(0.9136F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0057F, -1.7283F, 0.2894F, -0.8525F, 1.1919F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 96).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0057F, -1.7283F, 0.6627F, -0.6751F, 0.6609F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0961F, -3.6233F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(69, 91).addBox(-1.0F, -1.9961F, 0.6047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.7755F, -8.241F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(57, 91).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.624F, -8.6911F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 77).addBox(-1.0F, 0.5137F, 0.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(73, 82).addBox(-1.0F, 0.0137F, 0.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.3755F, -8.191F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(63, 81).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.004F, -0.1787F, -6.3724F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(64, 57).addBox(-2.0F, -0.9863F, 0.0197F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.496F, -1.6329F, -0.6771F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(19, 81).addBox(-0.5F, 1.0F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 78).addBox(-1.0F, 0.0F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 63).addBox(-1.0F, -4.0F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8858F, -4.7982F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(62, 61).addBox(-1.5F, -2.575F, 0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5553F, -2.7126F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(43, 62).addBox(-1.5F, 0.0F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-1.5F, 0.0F, -1.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7104F, -0.0245F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(64, 54).addBox(-2.0F, -0.8864F, 0.0197F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4085F, -1.5581F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(63, 21).addBox(-2.0F, -1.9863F, 0.0197F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4783F, -2.5557F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(64, 51).addBox(-2.0F, 0.0137F, 0.0197F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.4783F, -2.5557F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(26, 78).addBox(-0.9976F, 0.0663F, 0.2178F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.504F, -1.1827F, -3.5296F, -0.8253F, 0.09F, 0.0828F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(64, 46).addBox(-2.0F, 0.0137F, 0.0197F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, -1.2008F, -3.5331F, -1.2305F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9926F, 1.716F, 1.285F, -0.1746F, -0.0344F, 0.0061F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(52, 91).addBox(-0.7021F, -0.8517F, 0.9772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, -2.7053F, 0.2618F, 0.1309F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(47, 91).addBox(-0.7021F, -1.8385F, 0.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 2.9671F, 0.2618F, 0.1309F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(25, 91).addBox(-0.7735F, -0.5627F, 0.395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 2.0206F, 0.1915F, 0.042F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(94, 89).addBox(-0.4978F, -0.5242F, -0.3342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7369F, 1.1135F, -8.9384F, -1.8298F, 0.2502F, 0.0001F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(88, 94).addBox(-0.4978F, -0.1489F, -0.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7369F, 1.1135F, -8.9384F, -1.1317F, 0.2502F, 0.0001F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(15, 91).addBox(-0.4978F, 0.0289F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7369F, 1.1135F, -8.9384F, -0.6954F, 0.2502F, 0.0001F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(82, 37).addBox(-0.4978F, -0.5629F, -0.4289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.7369F, 1.1135F, -8.9384F, 0.8754F, 0.2502F, 0.0001F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 9).addBox(-0.4978F, 0.0448F, -0.3423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7369F, 1.1135F, -8.9384F, 2.1408F, 0.2502F, 0.0001F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(5, 91).addBox(-0.7735F, -1.0665F, 0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 2.3435F, 0.1915F, 0.042F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(58, 81).addBox(-0.791F, -1.2479F, -0.1718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 2.6138F, 0.2179F, 0.0834F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(91, 3).addBox(-0.714F, -0.7258F, 0.8373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 3.1166F, 0.2442F, 0.1682F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(90, 64).addBox(-0.6379F, -1.6134F, -0.6435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 2.523F, 0.2791F, 0.1672F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(64, 90).addBox(-0.766F, -0.7479F, -0.5718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6154F, 1.2987F, -8.2225F, 2.599F, 0.1733F, 0.0069F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(27, 58).addBox(-0.4422F, -0.5161F, -0.5217F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.269F, -1.2752F, -5.3743F, -1.0587F, 0.2008F, 0.0517F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(75, 29).addBox(-0.7F, -0.75F, -0.575F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4359F, -1.4336F, -5.2126F, -0.785F, 0.8695F, 0.5395F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(18, 58).addBox(-0.9823F, -0.8672F, -0.059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.0996F, 0.2182F, 0.0698F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(53, 81).addBox(-0.5005F, 2.1614F, -1.4043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.269F, -1.2752F, -5.3743F, -0.3664F, 0.1776F, 0.0423F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(65, 12).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4018F, 2.0189F, -5.2898F, -2.7924F, 0.1776F, 0.0423F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7648F, 2.4371F, -7.2116F, -1.3525F, 0.1776F, 0.0423F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(90, 61).addBox(-0.5021F, -1.4167F, -0.5128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0655F, 0.1472F, -5.7104F, -1.8002F, 0.2182F, 0.0343F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(90, 47).addBox(-0.5021F, -0.5235F, -1.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(90, 44).addBox(-0.5021F, -0.9735F, -1.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0655F, 0.1472F, -5.7104F, -2.4983F, 0.2182F, 0.0343F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(42, 90).addBox(-0.5021F, -0.4231F, 0.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(37, 90).addBox(-0.5021F, -0.4231F, -0.0421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(89, 69).addBox(-0.5021F, -0.4231F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-0.0655F, 0.1472F, -5.7104F, -2.5419F, 0.2182F, 0.0343F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(75, 25).addBox(-0.5021F, -0.8187F, -0.9267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0655F, 0.1472F, -5.7104F, -2.9783F, 0.2182F, 0.0343F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(32, 90).addBox(-0.5021F, -0.4185F, -1.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(89, 72).addBox(-0.5021F, -0.4185F, -0.8493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.0655F, 0.1472F, -5.7104F, -2.411F, 0.2182F, 0.0343F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(89, 31).addBox(-0.5979F, -0.9598F, -0.4055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0655F, 0.1472F, -5.7104F, -1.582F, 0.2182F, 0.0343F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(33, 74).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.141F, 3.0425F, -8.3811F, -0.4292F, 0.0334F, 0.0151F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(59, 65).addBox(-0.3757F, -0.678F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0153F, 2.9669F, -8.3793F, -0.3318F, 0.1432F, 0.0464F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(26, 74).addBox(-0.4999F, 1.0983F, -1.2261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(19, 74).addBox(-0.4999F, 0.2983F, -0.8261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 4).addBox(-0.4999F, -0.5017F, -0.8261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2555F, 1.947F, -5.2679F, -0.8865F, 0.1572F, 0.0513F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 73).addBox(-0.4999F, -1.3168F, -0.8269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(73, 68).addBox(-0.4999F, -2.1168F, -0.9269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2555F, 1.947F, -5.2679F, -0.9737F, 0.1572F, 0.0513F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(16, 63).addBox(-0.5005F, 0.3367F, 0.6366F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.269F, -1.2752F, -5.3743F, -1.3176F, 0.1776F, 0.0423F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(73, 64).addBox(-0.9863F, -0.2532F, 1.4783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -0.925F, 0.2182F, 0.0698F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(89, 23).addBox(-0.9823F, -2.7992F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.4137F, 0.2182F, 0.0698F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(63, 73).addBox(-0.9863F, -1.8545F, -0.1751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.2392F, 0.2182F, 0.0698F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(89, 20).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.317F, -1.6124F, -3.8434F, -1.4486F, 0.2182F, 0.0698F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(9, 58).addBox(-0.5004F, -0.7401F, -1.5625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, -1.7657F, 0.2795F, 0.0505F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(20, 89).addBox(-0.5004F, -0.6143F, -1.5715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(89, 17).addBox(-0.5004F, -0.6143F, -1.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, 2.3795F, 0.2795F, 0.0505F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(89, 14).addBox(-0.5004F, -1.6653F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, -2.682F, 0.2795F, 0.0505F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(89, 11).addBox(-0.5004F, -1.6802F, -0.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, -2.9874F, 0.2795F, 0.0505F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5004F, -0.6348F, 0.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(89, 8).addBox(-0.5004F, -0.6348F, 0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, -2.0275F, 0.2795F, 0.0505F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(56, 73).addBox(-0.5004F, -0.5701F, -1.4178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, -1.6784F, 0.2795F, 0.0505F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5004F, 0.1784F, -1.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4917F, -0.9159F, -2.9711F, -2.3765F, 0.2795F, 0.0505F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.2339F, -0.917F, -3.9892F, -2.0159F, 0.2182F, 0.0698F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(86, 88).addBox(-0.35F, -0.1F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.234F, -2.1037F, -4.4319F, -0.8378F, 0.2182F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(88, 83).addBox(-0.8387F, -1.1487F, 0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3325F, -1.6021F, -5.4365F, -0.8378F, 0.2182F, 0.0698F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(81, 88).addBox(-0.5F, -0.825F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(88, 80).addBox(-0.5F, -0.825F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0019F, -1.2936F, -5.192F, -0.7941F, 0.2182F, 0.0698F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(76, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1063F, -1.4089F, -4.7413F, -0.4887F, 0.2182F, 0.0698F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(71, 88).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2355F, -2.2056F, -4.2889F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(59, 88).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1043F, -1.8556F, -4.8807F, -1.0472F, 0.2182F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 53).addBox(-0.9863F, -1.5927F, 1.6173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.2741F, 0.2182F, 0.0698F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(31, 81).addBox(-0.764F, -4.604F, -1.6767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.6842F, 0.2182F, 0.0698F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(88, 58).addBox(-0.989F, -3.7274F, -1.5536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.7191F, 0.2182F, 0.0698F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 55).addBox(-0.989F, -3.1335F, 0.1824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.1432F, 0.2182F, 0.0698F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(44, 57).addBox(-0.9863F, -2.5235F, 0.2191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(78, 41).addBox(-0.9863F, -4.9857F, 2.3766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -1.405F, 0.2182F, 0.0698F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(54, 88).addBox(-0.9863F, -4.7147F, -1.6894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -2.2689F, 0.2182F, 0.0698F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(23, 65).addBox(-0.9863F, -3.694F, -2.0093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, -2.3562F, 0.2182F, 0.0698F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(65, 0).addBox(-0.9863F, -1.6977F, -3.7301F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3075F, -1.8521F, -5.3615F, 3.1154F, 0.2182F, 0.0698F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9926F, 1.716F, 1.285F, -0.1746F, 0.0344F, -0.0061F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(52, 91).mirror().addBox(-0.2979F, -0.8517F, 0.9772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, -2.7053F, -0.2618F, -0.1309F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(47, 91).mirror().addBox(-0.2979F, -1.8385F, 0.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 2.9671F, -0.2618F, -0.1309F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(25, 91).mirror().addBox(-0.2265F, -0.5627F, 0.395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 2.0206F, -0.1915F, -0.042F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.5022F, -0.5242F, -0.3342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7369F, 1.1135F, -8.9384F, -1.8298F, -0.2502F, -0.0001F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(88, 94).mirror().addBox(-0.5022F, -0.1489F, -0.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.7369F, 1.1135F, -8.9384F, -1.1317F, -0.2502F, -0.0001F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-0.5022F, 0.0289F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7369F, 1.1135F, -8.9384F, -0.6954F, -0.2502F, -0.0001F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-0.5022F, -0.5629F, -0.4289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.7369F, 1.1135F, -8.9384F, 0.8754F, -0.2502F, -0.0001F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-0.5022F, 0.0448F, -0.3423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7369F, 1.1135F, -8.9384F, 2.1408F, -0.2502F, -0.0001F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.2265F, -1.0665F, 0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 2.3435F, -0.1915F, -0.042F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(58, 81).mirror().addBox(-0.209F, -1.2479F, -0.1718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 2.6138F, -0.2179F, -0.0834F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(91, 3).mirror().addBox(-0.286F, -0.7258F, 0.8373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 3.1166F, -0.2442F, -0.1682F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(-0.3622F, -1.6134F, -0.6435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 2.523F, -0.2791F, -0.1672F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(64, 90).mirror().addBox(-0.234F, -0.7479F, -0.5718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6154F, 1.2987F, -8.2225F, 2.599F, -0.1733F, -0.0069F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(27, 58).mirror().addBox(-0.5578F, -0.5161F, -0.5217F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.269F, -1.2752F, -5.3743F, -1.0587F, -0.2008F, -0.0517F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(-1.3F, -0.75F, -0.575F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4359F, -1.4336F, -5.2126F, -0.785F, -0.8695F, -0.5395F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.0177F, -0.8672F, -0.059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.0996F, -0.2182F, -0.0698F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(53, 81).mirror().addBox(-0.4995F, 2.1614F, -1.4043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.269F, -1.2752F, -5.3743F, -0.3664F, -0.1776F, -0.0423F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4018F, 2.0189F, -5.2898F, -2.7924F, -0.1776F, -0.0423F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(52, 65).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.7648F, 2.4371F, -7.2116F, -1.3525F, -0.1776F, -0.0423F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(90, 61).mirror().addBox(-0.4979F, -1.4167F, -0.5128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.1472F, -5.7104F, -1.8002F, -0.2182F, -0.0343F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(90, 47).mirror().addBox(-0.4979F, -0.5235F, -1.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(90, 44).mirror().addBox(-0.4979F, -0.9735F, -1.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.1472F, -5.7104F, -2.4983F, -0.2182F, -0.0343F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(42, 90).mirror().addBox(-0.4979F, -0.4231F, 0.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(37, 90).mirror().addBox(-0.4979F, -0.4231F, -0.0421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(89, 69).mirror().addBox(-0.4979F, -0.4231F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.1472F, -5.7104F, -2.5419F, -0.2182F, -0.0343F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(-0.4979F, -0.8187F, -0.9267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.1472F, -5.7104F, -2.9783F, -0.2182F, -0.0343F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(32, 90).mirror().addBox(-0.4979F, -0.4185F, -1.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(89, 72).mirror().addBox(-0.4979F, -0.4185F, -0.8493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.1472F, -5.7104F, -2.411F, -0.2182F, -0.0343F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(89, 31).mirror().addBox(-0.4021F, -0.9598F, -0.4055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0655F, 0.1472F, -5.7104F, -1.582F, -0.2182F, -0.0343F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(33, 74).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.141F, 3.0425F, -8.3811F, -0.4292F, -0.0334F, -0.0151F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(59, 65).mirror().addBox(-0.6243F, -0.678F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0153F, 2.9669F, -8.3793F, -0.3318F, -0.1432F, -0.0464F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(26, 74).mirror().addBox(-0.5001F, 1.0983F, -1.2261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(19, 74).mirror().addBox(-0.5001F, 0.2983F, -0.8261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 4).mirror().addBox(-0.5001F, -0.5017F, -0.8261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2555F, 1.947F, -5.2679F, -0.8865F, -0.1572F, -0.0513F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-0.5001F, -1.3168F, -0.8269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(73, 68).mirror().addBox(-0.5001F, -2.1168F, -0.9269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2555F, 1.947F, -5.2679F, -0.9737F, -0.1572F, -0.0513F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(16, 63).mirror().addBox(-0.4995F, 0.3367F, 0.6366F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.269F, -1.2752F, -5.3743F, -1.3176F, -0.1776F, -0.0423F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.0137F, -0.2532F, 1.4783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -0.925F, -0.2182F, -0.0698F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-0.0177F, -2.7992F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.4137F, -0.2182F, -0.0698F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-0.0137F, -1.8545F, -0.1751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.2392F, -0.2182F, -0.0698F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.317F, -1.6124F, -3.8434F, -1.4486F, -0.2182F, -0.0698F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.4996F, -0.7401F, -1.5625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, -1.7657F, -0.2795F, -0.0505F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.4996F, -0.6143F, -1.5715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(89, 17).mirror().addBox(-0.4996F, -0.6143F, -1.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, 2.3795F, -0.2795F, -0.0505F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(89, 14).mirror().addBox(-0.4996F, -1.6653F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, -2.682F, -0.2795F, -0.0505F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(89, 11).mirror().addBox(-0.4996F, -1.6802F, -0.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, -2.9874F, -0.2795F, -0.0505F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.4996F, -0.6348F, 0.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(89, 8).mirror().addBox(-0.4996F, -0.6348F, 0.0093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, -2.0275F, -0.2795F, -0.0505F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(56, 73).mirror().addBox(-0.4996F, -0.5701F, -1.4178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, -1.6784F, -0.2795F, -0.0505F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.4996F, 0.1784F, -1.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4917F, -0.9159F, -2.9711F, -2.3765F, -0.2795F, -0.0505F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.2339F, -0.917F, -3.9892F, -2.0159F, -0.2182F, -0.0698F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 88).mirror().addBox(-0.65F, -0.1F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.234F, -2.1037F, -4.4319F, -0.8378F, -0.2182F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.1613F, -1.1487F, 0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3325F, -1.6021F, -5.4365F, -0.8378F, -0.2182F, -0.0698F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 88).mirror().addBox(-0.5F, -0.825F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(88, 80).mirror().addBox(-0.5F, -0.825F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0019F, -1.2936F, -5.192F, -0.7941F, -0.2182F, -0.0698F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(76, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1063F, -1.4089F, -4.7413F, -0.4887F, -0.2182F, -0.0698F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(71, 88).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2355F, -2.2056F, -4.2889F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(59, 88).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1043F, -1.8556F, -4.8807F, -1.0472F, -0.2182F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-0.0137F, -1.5927F, 1.6173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.2741F, -0.2182F, -0.0698F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-0.236F, -4.604F, -1.6767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.6842F, -0.2182F, -0.0698F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(88, 58).mirror().addBox(-0.011F, -3.7274F, -1.5536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.7191F, -0.2182F, -0.0698F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-0.011F, -3.1335F, 0.1824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.1432F, -0.2182F, -0.0698F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(44, 57).mirror().addBox(-0.0137F, -2.5235F, 0.2191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(78, 41).mirror().addBox(-0.0137F, -4.9857F, 2.3766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -1.405F, -0.2182F, -0.0698F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(54, 88).mirror().addBox(-0.0137F, -4.7147F, -1.6894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -2.2689F, -0.2182F, -0.0698F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(23, 65).mirror().addBox(-0.0137F, -3.694F, -2.0093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, -2.3562F, -0.2182F, -0.0698F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.0137F, -1.6977F, -3.7301F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3075F, -1.8521F, -5.3615F, 3.1154F, -0.2182F, -0.0698F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2895F, 1.0899F, 1.2553F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(12, 82).mirror().addBox(-0.224F, -1.4203F, -0.7059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 1.1694F, -0.2356F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-0.224F, -1.3672F, -0.8038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 1.4748F, -0.2356F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(50, 94).mirror().addBox(-0.4204F, -0.455F, 2.9339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.8271F, -0.3054F, 0.0175F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(45, 94).mirror().addBox(-0.2517F, -0.2349F, -2.9662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.2443F, -0.2356F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-0.4556F, -1.1875F, 4.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.7573F, -0.3054F, 0.0175F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-0.4587F, -0.9661F, 2.5072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 21).mirror().addBox(-0.4204F, -0.5122F, 2.3373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.8097F, -0.3054F, 0.0175F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(0.5517F, -1.1259F, 5.0487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.7435F, -0.096F, 0.0168F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(77, 16).mirror().addBox(-0.2354F, -0.7128F, 0.7837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.7387F, -0.2353F, 0.0116F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-0.224F, -0.8133F, 0.7424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.9671F, -0.2356F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(94, 18).mirror().addBox(-0.1534F, 6.3835F, -4.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -1.3056F, -0.2007F, 0.0165F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(94, 15).mirror().addBox(0.5517F, 0.6682F, 4.3256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 3.0664F, -0.096F, 0.0168F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.4204F, 4.0732F, -0.8024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -1.8242F, -0.3054F, 0.0175F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-0.4204F, -0.6154F, -4.4954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.297F, -0.3054F, 0.0175F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(77, 8).mirror().addBox(0.5517F, -0.5551F, -6.9367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.2934F, -0.096F, 0.0168F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(94, 9).mirror().addBox(-0.1534F, 0.2825F, -7.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.4155F, -0.2007F, 0.0165F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-0.1534F, -1.3752F, -8.0374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(94, 0).mirror().addBox(-0.1534F, -1.0752F, -7.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(93, 81).mirror().addBox(-0.1534F, -1.0752F, -7.8874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.1886F, -0.2007F, 0.0165F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(0.5517F, -1.0817F, -6.654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.1886F, -0.096F, 0.0168F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(0.6194F, 6.5347F, -1.7372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(93, 78).mirror().addBox(0.6194F, 4.9347F, -1.4122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(0.6194F, 5.7347F, -1.5372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -1.7736F, -0.0982F, -0.005F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-0.425F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3209F, -2.1797F, -7.4497F, -1.3798F, 0.0745F, -0.1096F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(1.9099F, 6.5988F, -4.4138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.375F, 0.2719F, 0.2732F, -1.4315F, -0.0132F, -0.2599F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(62, 93).mirror().addBox(2.9952F, 1.3565F, -7.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -0.5236F, 0.192F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(2.9952F, 5.1945F, -5.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(93, 53).mirror().addBox(2.9952F, 5.1945F, -5.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -1.1694F, 0.192F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(93, 40).mirror().addBox(-0.1534F, 5.6404F, -5.5505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -1.166F, -0.2007F, 0.0165F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-0.1534F, 6.6818F, 2.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(93, 37).mirror().addBox(-0.1534F, 6.3818F, 2.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, -2.1783F, -0.2007F, 0.0165F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(-0.1534F, -1.1768F, 6.4092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.8396F, -0.2007F, 0.0165F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(0.5735F, -0.634F, 6.0097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.9256F, -0.0964F, -0.0081F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(0.5735F, -0.4746F, 5.4816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.9517F, -0.0964F, -0.0081F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(0.5735F, -0.971F, 4.8884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.8645F, -0.0964F, -0.0081F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(92, 34).mirror().addBox(0.5735F, -1.0138F, 4.2541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(92, 26).mirror().addBox(0.5735F, -1.4138F, 4.2541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.7772F, -0.0964F, -0.0081F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-0.3988F, -1.867F, 3.7402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.6917F, -0.3058F, -0.0085F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(34, 58).mirror().addBox(-0.4175F, -1.3251F, 2.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.7224F, -0.3054F, 0.0175F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(-0.4175F, -2.0678F, 2.4815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.6351F, -0.3054F, 0.0175F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.3954F, -1.7631F, 2.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.7341F, -0.3011F, 0.0537F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.2089F, -1.5281F, 1.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 2.8415F, -0.234F, 0.0271F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.2089F, -2.1845F, -1.2783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 1.4016F, -0.234F, 0.0271F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(91, 86).mirror().addBox(-0.2089F, -1.7412F, -1.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 1.5674F, -0.234F, 0.0271F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(84, 91).mirror().addBox(-0.229F, -1.2269F, -0.9555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(79, 91).mirror().addBox(-0.229F, -0.9269F, -0.9555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 1.6581F, -0.2356F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(74, 91).mirror().addBox(-0.224F, -0.0743F, -0.4331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.35F, 0.2719F, 0.2732F, 0.2182F, -0.2356F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(12, 82).addBox(-0.776F, -1.4203F, -0.7059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 1.1694F, 0.2356F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(55, 94).addBox(-0.776F, -1.3672F, -0.8038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 1.4748F, 0.2356F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(50, 94).addBox(-0.5796F, -0.455F, 2.9339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.8271F, 0.3054F, -0.0175F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(45, 94).addBox(-0.7483F, -0.2349F, -2.9662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.2443F, 0.2356F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(94, 29).addBox(-0.5444F, -1.1875F, 4.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.7573F, 0.3054F, -0.0175F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(77, 33).addBox(-0.5413F, -0.9661F, 2.5072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 21).addBox(-0.5796F, -0.5122F, 2.3373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.8097F, 0.3054F, -0.0175F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(25, 94).addBox(-1.5517F, -1.1259F, 5.0487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.7435F, 0.096F, -0.0168F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(77, 16).addBox(-0.7646F, -0.7128F, 0.7837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.7387F, 0.2353F, -0.0116F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(77, 12).addBox(-0.776F, -0.8133F, 0.7424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.9671F, 0.2356F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(94, 18).addBox(-0.8466F, 6.3835F, -4.5391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -1.3056F, 0.2007F, -0.0165F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(94, 15).addBox(-1.5517F, 0.6682F, 4.3256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 3.0664F, 0.096F, -0.0168F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(15, 94).addBox(-0.5796F, 4.0732F, -0.8024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -1.8242F, 0.3054F, -0.0175F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(94, 12).addBox(-0.5796F, -0.6154F, -4.4954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.297F, 0.3054F, -0.0175F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(77, 8).addBox(-1.5517F, -0.5551F, -6.9367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.2934F, 0.096F, -0.0168F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(94, 9).addBox(-0.8466F, 0.2825F, -7.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.4155F, 0.2007F, -0.0165F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(94, 6).addBox(-0.8466F, -1.3752F, -8.0374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(94, 0).addBox(-0.8466F, -1.0752F, -7.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(93, 81).addBox(-0.8466F, -1.0752F, -7.8874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.1886F, 0.2007F, -0.0165F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(5, 94).addBox(-1.5517F, -1.0817F, -6.654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.1886F, 0.096F, -0.0168F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(7, 77).addBox(-1.6194F, 6.5347F, -1.7372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(93, 78).addBox(-1.6194F, 4.9347F, -1.4122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 77).addBox(-1.6194F, 5.7347F, -1.5372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -1.7736F, 0.0982F, 0.005F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(47, 76).addBox(-0.575F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3209F, -2.1797F, -7.4497F, -1.3798F, -0.0745F, 0.1096F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(40, 76).addBox(-2.9099F, 6.5988F, -4.4138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.375F, 0.2719F, 0.2732F, -1.4315F, 0.0132F, 0.2599F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(62, 93).addBox(-3.9951F, 1.3565F, -7.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -0.5236F, -0.192F, 0.0F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(93, 56).addBox(-3.9951F, 5.1945F, -5.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(93, 53).addBox(-3.9951F, 5.1945F, -5.2883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -1.1694F, -0.192F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(93, 40).addBox(-0.8466F, 5.6404F, -5.5505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -1.166F, 0.2007F, -0.0165F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(40, 93).addBox(-0.8466F, 6.6818F, 2.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(93, 37).addBox(-0.8466F, 6.3818F, 2.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, -2.1783F, 0.2007F, -0.0165F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(35, 93).addBox(-0.8466F, -1.1768F, 6.4092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.8396F, 0.2007F, -0.0165F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(30, 93).addBox(-1.5735F, -0.634F, 6.0097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.9256F, 0.0964F, 0.0081F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(92, 75).addBox(-1.5735F, -0.4746F, 5.4816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.9517F, 0.0964F, 0.0081F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(92, 50).addBox(-1.5735F, -0.971F, 4.8884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.8645F, 0.0964F, 0.0081F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(92, 34).addBox(-1.5735F, -1.0138F, 4.2541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(92, 26).addBox(-1.5735F, -1.4138F, 4.2541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.7772F, 0.0964F, 0.0081F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(20, 92).addBox(-0.6012F, -1.867F, 3.7402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.6917F, 0.3058F, 0.0085F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(34, 58).addBox(-0.5826F, -1.3251F, 2.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.7224F, 0.3054F, -0.0175F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(75, 37).addBox(-0.5826F, -2.0678F, 2.4815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.6351F, 0.3054F, -0.0175F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(10, 92).addBox(-0.6046F, -1.7631F, 2.0735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.7341F, 0.3011F, -0.0537F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(0, 92).addBox(-0.7911F, -1.5281F, 1.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 2.8415F, 0.234F, -0.0271F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(89, 91).addBox(-0.7911F, -2.1845F, -1.2783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 1.4016F, 0.234F, -0.0271F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(91, 86).addBox(-0.7911F, -1.7412F, -1.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 1.5674F, 0.234F, -0.0271F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(84, 91).addBox(-0.771F, -1.2269F, -0.9555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(79, 91).addBox(-0.771F, -0.9269F, -0.9555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 1.6581F, 0.2356F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(74, 91).addBox(-0.776F, -0.0743F, -0.4331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.35F, 0.2719F, 0.2732F, 0.2182F, 0.2356F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(22, 54).addBox(0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 54).mirror().addBox(-2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 48).addBox(-0.5F, -2.595F, -0.1555F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.4F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r413 = tail.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(23, 97).addBox(0.0F, -1.775F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r414 = tail.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(67, 94).addBox(0.0F, 1.0F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r415 = tail.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(90, 97).addBox(0.0F, -2.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(26, 97).addBox(0.0F, -1.675F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.1329F, -0.173F, 0.023F));

		PartDefinition cube_r416 = tail2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(47, 97).addBox(0.0F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r417 = tail2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(44, 97).addBox(0.0F, -1.85F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r418 = tail2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(75, 94).addBox(0.0F, 3.6F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 67).addBox(0.0F, 2.1F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -4.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(32, 0).addBox(-0.996F, -0.075F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.496F, -1.9779F, -0.4222F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r420 = tail2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r421 = tail2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(11, 42).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9935F, 4.9253F, -0.128F, -0.3031F, 0.0384F));

		PartDefinition cube_r422 = tail3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(33, 98).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r423 = tail3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(97, 92).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r424 = tail3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(50, 97).addBox(0.0F, 6.4F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 49).addBox(0.0F, 5.5F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -9.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r425 = tail3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(70, 94).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -3.3676F, 3.2548F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(22, 48).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1333F, -0.7384F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(22, 42).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0823F, -0.3045F, -0.0247F));

		PartDefinition cube_r427 = tail4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(56, 97).addBox(0.0F, -1.3717F, 0.0195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r428 = tail4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(10, 95).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r429 = tail4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(61, 77).addBox(-0.5F, -0.575F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.2359F, 2.9552F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r430 = tail4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(54, 77).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.487F, 1.1516F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r431 = tail4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(53, 97).addBox(0.0F, 7.7F, 12.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -13.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(43, 7).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2464F, -0.127F, -0.0318F));

		PartDefinition cube_r432 = tail5.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(78, 97).addBox(0.0F, -1.2257F, 0.0076F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r433 = tail5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(70, 97).addBox(0.0F, -0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 67).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3378F, 0.4437F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(98, 34).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r435 = tail5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -0.075F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8F, 0.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(45, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0079F, 3.9715F, 0.1276F, 0.1298F, 0.0166F));

		PartDefinition cube_r436 = tail6.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(98, 38).addBox(0.0F, -0.7007F, 0.0076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r437 = tail6.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(97, 75).addBox(0.0F, 0.8F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 70).addBox(0.0F, 0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2077F, 0.7083F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail6.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(39, 63).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r439 = tail6.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, -0.0513F, -0.2554F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.4178F, 0.3251F, -0.0916F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0191F, 3.9725F, 0.1006F, 0.304F, 0.0302F));

		PartDefinition cube_r440 = tail7.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(98, 44).addBox(0.0F, -0.4F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.975F, 1.025F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail7.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(98, 41).addBox(0.0F, 1.3F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1886F, -3.2643F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r442 = tail7.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(50, 35).addBox(-0.5F, -0.2755F, -0.1876F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8656F, 0.1072F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(33, 47).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0017F, 4.0095F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.0038F, 0.1156F, 0.3926F, 0.0108F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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