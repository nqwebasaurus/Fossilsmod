package fossils.fossils.client.blockentity.model.litocranius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LitocraniusFossilModel extends SkullModelBase {
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
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public LitocraniusFossilModel(ModelPart root) {
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
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.7925F, 11.909F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 60).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 70).addBox(0.0F, -1.0201F, -1.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 67).mirror().addBox(0.2634F, -2.5921F, -0.5584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 3.0206F, -1.3807F, -1.3985F, 0.1475F, -0.8456F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 66).mirror().addBox(0.9841F, -1.5411F, 2.0623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 3.0206F, -1.3807F, 0.0811F, -0.2426F, -0.5794F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-1.1345F, -4.5971F, -1.5723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 3.0206F, -1.3807F, -2.0323F, 0.3819F, -1.3843F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 34).mirror().addBox(-0.2377F, 0.0586F, 0.4043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 3.0206F, -1.3807F, -0.3034F, 0.2263F, -1.1755F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 83).mirror().addBox(-0.524F, -3.1169F, 3.1456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 3.0206F, -1.3807F, -0.3935F, 0.2038F, -0.7854F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-0.2691F, -0.6865F, 0.0549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 3.0206F, -1.3807F, -0.1292F, 0.4304F, -0.5539F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2939F, 2.087F, -0.283F, 0.1927F, 0.0448F, -0.3433F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-0.2258F, -0.4881F, -0.0125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.2206F, -2.8807F, -0.2038F, -0.5593F, -1.3117F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-0.5F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4506F, 1.5849F, -1.6687F, -0.3149F, -0.5021F, -1.2825F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-0.3837F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.0966F, 0.0684F, -0.5622F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-0.5249F, -0.7245F, -0.5848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.2206F, -2.8807F, -0.767F, 0.1517F, -0.1784F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1774F, 0.8633F, -2.7931F, 0.5399F, 0.5885F, -0.1005F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(-0.5F, 0.5373F, -2.0434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(83, 84).mirror().addBox(-0.5F, -0.4627F, -0.0434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.2055F, -0.5931F, -4.107F, -0.2891F, 0.5885F, -0.1005F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(86, 88).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(21, 71).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.4725F, -0.4778F, -4.5223F, -0.8564F, 0.5885F, -0.1005F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.0044F, -0.5487F, -5.3046F, -1.38F, 0.5885F, -0.1005F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.5F, -1.1253F, -1.4298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2055F, -0.5931F, -4.107F, -1.2927F, 0.5885F, -0.1005F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6098F, -0.8364F, -2.9345F, -0.9481F, 0.1974F, -0.1724F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 26).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(23, 67).addBox(-1.2634F, -2.5921F, -0.5584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3842F, 3.0206F, -1.3807F, -1.3985F, -0.1475F, 0.8456F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 66).addBox(-1.9841F, -1.5411F, 2.0623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3842F, 3.0206F, -1.3807F, 0.0811F, 0.2426F, 0.5794F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 73).addBox(0.1345F, -4.5971F, -1.5723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3842F, 3.0206F, -1.3807F, -2.0323F, -0.3819F, 1.3843F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(36, 34).addBox(-0.7623F, 0.0586F, 0.4043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 3.0206F, -1.3807F, -0.3034F, -0.2263F, 1.1755F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 83).addBox(-0.476F, -3.1169F, 3.1456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3842F, 3.0206F, -1.3807F, -0.3935F, -0.2038F, 0.7854F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(14, 73).addBox(-0.7309F, -0.6865F, 0.0549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 3.0206F, -1.3807F, -0.1292F, -0.4304F, 0.5539F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2939F, 2.087F, -0.283F, 0.1927F, -0.0448F, 0.3433F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(9, 55).addBox(-0.7742F, -0.4881F, -0.0125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.2206F, -2.8807F, -0.2038F, 0.5593F, 1.3117F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(55, 27).addBox(-0.5F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4506F, 1.5849F, -1.6687F, -0.3149F, 0.5021F, 1.2825F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(89, 20).addBox(-0.6163F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.0966F, -0.0684F, 0.5622F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(69, 90).addBox(-0.4751F, -0.7245F, -0.5848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3842F, 0.2206F, -2.8807F, -0.767F, -0.1517F, 0.1784F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1774F, 0.8633F, -2.7931F, 0.5399F, -0.5885F, 0.1005F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(71, 5).addBox(-0.5F, 0.5373F, -2.0434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F))
				.texOffs(83, 84).addBox(-0.5F, -0.4627F, -0.0434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.2055F, -0.5931F, -4.107F, -0.2891F, -0.5885F, 0.1005F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(86, 88).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(21, 71).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.4725F, -0.4778F, -4.5223F, -0.8564F, -0.5885F, 0.1005F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 40).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.0044F, -0.5487F, -5.3046F, -1.38F, -0.5885F, 0.1005F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(65, 70).addBox(-0.5F, -1.1253F, -1.4298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2055F, -0.5931F, -4.107F, -1.2927F, -0.5885F, 0.1005F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(58, 70).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6098F, -0.8364F, -2.9345F, -0.9481F, -0.1974F, 0.1724F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(47, 26).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(84, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 35).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.1919F, -0.583F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(65, 44).addBox(-1.0F, -2.8884F, -0.784F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2272F, -0.1974F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(14, 69).addBox(-1.0F, -0.6047F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 78).addBox(-1.0F, -0.0025F, -0.0278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.132F, -1.1969F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(73, 78).addBox(-1.0F, -0.0025F, -0.0278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 5.132F, -1.1969F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 84).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(79, 70).addBox(-1.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(88, 62).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.7182F, -0.9666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(74, 32).addBox(-1.0F, -0.7F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.7255F, -0.8428F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(70, 59).addBox(-1.5F, -1.9731F, -0.9303F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 9.1963F, -0.8065F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 32).addBox(-1.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 8.3963F, 1.0935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9785F, 1.1234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.4819F, 0.6655F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(74, 36).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 81).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(75, 21).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(74, 40).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(5, 30).addBox(-1.9F, -1.0479F, -0.9978F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(11, 86).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9508F, -1.9836F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 23).addBox(-1.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(31, 34).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(49, 55).addBox(-0.6F, -0.1857F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 11.6783F, -0.9325F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 87).addBox(6.6299F, -0.5F, 1.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r62 = leftLeg4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 87).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, 0.2143F, -5.3932F));

		PartDefinition cube_r63 = leftLeg5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(12, 77).addBox(8.0001F, 0.2042F, 1.1492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r64 = leftLeg5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(75, 17).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r65 = leftLeg5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(49, 76).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r66 = leftLeg5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(75, 13).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.1919F, -0.583F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -2.8884F, -0.784F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2272F, -0.1974F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(39, 69).addBox(-1.0F, -0.6047F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 27).addBox(0.0F, -0.0025F, -0.0278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.132F, -1.1969F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(19, 79).addBox(0.0F, -0.0025F, -0.0278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 5.132F, -1.1969F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(85, 3).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(24, 80).addBox(0.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(88, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.7182F, -0.9666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(42, 74).addBox(-1.0F, -0.7F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.7255F, -0.8428F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 24).addBox(-0.5F, -1.9731F, -0.9303F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 9.1963F, -0.8065F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 8).addBox(-0.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 8.3963F, 1.0935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(56, 4).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.9785F, 1.1234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.4819F, 0.6655F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(58, 74).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 66).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 51).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(74, 67).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(34, 12).addBox(0.9F, -1.0479F, -0.9978F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(34, 86).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9508F, -1.9836F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(26, 43).addBox(0.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(10, 35).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 56).addBox(-0.4F, -0.1857F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 11.6783F, -0.9325F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(19, 88).addBox(-7.6299F, -0.5F, 1.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r87 = rightLeg4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 87).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2143F, -5.3932F));

		PartDefinition cube_r88 = rightLeg5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(35, 77).addBox(-9.0001F, 0.2042F, 1.1492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r89 = rightLeg5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 76).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r90 = rightLeg5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r91 = rightLeg5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(21, 75).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(30, 92).addBox(0.0F, -1.1751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(91, 86).addBox(0.0F, -1.4577F, -1.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(88, 91).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(82, 91).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0074F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(21, 91).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.6021F, -5.4552F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.2914F, 0.3716F, -0.682F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 50).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.1824F, 0.4334F, -0.9586F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(88, 91).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 91).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0074F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(21, 91).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.6021F, -5.4552F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(7, 84).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.2914F, -0.3716F, 0.682F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 50).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.1824F, -0.4334F, 0.9586F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 92).addBox(-0.5753F, -1.6995F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.6021F, -5.4552F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(85, 91).addBox(-0.4485F, -1.7943F, -0.4457F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.4807F, -7.4242F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, -0.3908F, -0.0903F, -0.1044F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(84, 27).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.4659F, 0.4311F, -0.5376F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.3389F, 0.5343F, -0.8096F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.0229F, 0.6234F, -1.3758F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.4174F, 0.386F, -0.5073F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.3036F, 0.479F, -0.7771F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(58, 55).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.0266F, 0.5601F, -1.3241F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.2891F, 0.3154F, -0.5514F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, -0.0107F, 0.4244F, -1.3418F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.1966F, 0.3787F, -0.8217F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(84, 27).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.4659F, -0.4311F, 0.5376F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(84, 52).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.3389F, -0.5343F, 0.8096F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(84, 60).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.0229F, -0.6234F, 1.3758F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(85, 24).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.4174F, -0.386F, 0.5073F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(86, 0).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.3036F, -0.479F, 0.7771F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(58, 55).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.0266F, -0.5601F, 1.3241F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(84, 58).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.2891F, -0.3154F, 0.5514F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(42, 0).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, -0.0107F, -0.4244F, 1.3418F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(84, 69).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.1966F, -0.3787F, 0.8217F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 91).addBox(0.0F, -1.4939F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(24, 92).addBox(0.0F, -1.6938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(91, 90).addBox(0.0F, -2.0698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.096F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(16, 86).addBox(0.0F, -2.4966F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4078F, -2.0187F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 30).addBox(0.0F, -2.3862F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(32, 53).addBox(0.0F, -3.4094F, -0.1732F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.2F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(8, 86).addBox(0.0F, -3.2509F, -0.4133F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -8.3F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 86).addBox(0.0F, -3.6381F, -0.1656F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -6.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(31, 28).mirror().addBox(-2.3653F, -3.0884F, -6.1776F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.877F, 0.3835F, -0.1956F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(34, 2).mirror().addBox(-3.4F, -2.3812F, -4.3077F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(34, 2).addBox(2.4F, -2.3812F, -4.3077F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-3.4F, -2.5486F, -0.6907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(83, 80).addBox(2.4F, -2.5486F, -0.6907F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-3.4F, -3.0676F, 0.3735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(88, 65).addBox(2.4F, -3.0676F, 0.3735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(89, 17).mirror().addBox(-3.4F, -2.5575F, -3.1857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(89, 17).addBox(2.4F, -2.5575F, -3.1857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(46, 65).mirror().addBox(-3.4F, -3.9926F, -1.7605F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(46, 65).addBox(2.4F, -3.9926F, -1.7605F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(-0.5F, -1.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(53, 66).addBox(5.3F, -1.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.9F, 2.8272F, -5.0211F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(45, 50).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(45, 50).addBox(5.3F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, 5.2901F, -6.4554F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-0.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4753F, 10.2955F, -6.3735F, -0.0179F, 0.0628F, -2.7221F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(32, 26).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0022F, 0.4133F, -1.287F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.1979F, 0.3652F, -0.7699F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.2866F, 0.302F, -0.5008F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-8.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0186F, 0.3901F, -1.3273F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(81, 41).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1717F, 0.3526F, -0.813F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.2582F, 0.2964F, -0.5431F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(84, 56).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4F, -7.9F, 0.0942F, 0.2781F, -1.1682F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-5.1795F, -2.6157F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4F, -7.9F, -0.0486F, 0.2893F, -1.6684F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4F, -7.9F, 0.164F, 0.2442F, -0.8994F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-6.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4F, -6.2F, -0.0399F, 0.3937F, -1.491F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4F, -6.2F, 0.1553F, 0.3653F, -0.9743F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(34, 84).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4F, -6.2F, 0.2463F, 0.3128F, -0.7022F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(84, 29).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, -4.5F, 0.2201F, 0.2882F, -0.6403F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 54).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, -4.5F, 0.1366F, 0.335F, -0.911F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.1753F, 0.0465F, -0.3626F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 1.3086F, -0.8562F, -0.6643F, -1.8009F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.1753F, 0.0465F, -0.3626F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 1.3086F, -0.7356F, -0.6887F, -1.9584F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.1753F, 0.0465F, -0.3626F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 1.3086F, -0.5827F, -0.6981F, -2.178F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(27, 10).mirror().addBox(-0.7727F, -0.1425F, -0.4341F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.4777F, -0.6053F, -2.3481F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-0.5641F, -0.0723F, -0.3563F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.8667F, -0.261F, -0.2146F, -0.4999F, -2.7048F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 10).mirror().addBox(-0.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 10.2402F, -1.8168F, -0.2189F, -0.4128F, -2.6204F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(47, 43).mirror().addBox(-0.4F, 0.0F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4373F, 10.3609F, -2.6322F, 0.0675F, -0.2143F, -2.6745F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.1131F, -0.0431F, -0.8026F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4925F, 10.3519F, -4.0539F, -0.102F, -0.166F, -2.611F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(45, 6).mirror().addBox(-7.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, -4.5F, -0.0403F, 0.3586F, -1.4214F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(23, 53).mirror().addBox(-3.4F, -2.7597F, -6.7005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 53).addBox(2.4F, -2.7597F, -6.7005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-3.4F, -1.1961F, -5.1833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(60, 66).addBox(2.4F, -1.1961F, -5.1833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(-3.4F, -1.5793F, -3.1325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(50, 17).addBox(2.4F, -1.5793F, -3.1325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(31, 28).addBox(1.3653F, -3.0884F, -6.1776F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.7F, 0.877F, -0.3835F, 0.1956F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(84, 71).addBox(-1.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4753F, 10.2955F, -6.3735F, -0.0179F, -0.0628F, 2.7221F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(32, 26).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0022F, -0.4133F, 1.287F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 84).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.1979F, -0.3652F, 0.7699F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 8).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.2866F, -0.302F, 0.5008F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(39, 24).addBox(3.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0186F, -0.3901F, 1.3273F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 41).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1717F, -0.3526F, 0.813F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(83, 78).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.2582F, -0.2964F, 0.5431F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(84, 56).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -7.9F, 0.0942F, -0.2781F, 1.1682F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(84, 48).addBox(3.1795F, -2.6157F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -7.9F, -0.0486F, -0.2893F, 1.6684F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(84, 46).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -7.9F, 0.164F, -0.2442F, 0.8994F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 57).addBox(3.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -6.2F, -0.0399F, -0.3937F, 1.491F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(56, 84).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -6.2F, 0.1553F, -0.3653F, 0.9743F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(34, 84).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -6.2F, 0.2463F, -0.3128F, 0.7022F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(84, 29).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -4.5F, 0.2201F, -0.2882F, 0.6403F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(84, 54).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -4.5F, 0.1366F, -0.335F, 0.911F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 10).addBox(-11.8247F, 0.0465F, -0.3626F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 1.3086F, -0.8562F, 0.6643F, 1.8009F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(19, 0).addBox(-9.8247F, 0.0465F, -0.3626F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 1.3086F, -0.7356F, 0.6887F, 1.9584F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 21).addBox(-7.8247F, 0.0465F, -0.3626F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 1.3086F, -0.5827F, 0.6981F, 2.178F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(27, 10).addBox(-6.2273F, -0.1425F, -0.4341F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.4777F, 0.6053F, 2.3481F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(34, 8).addBox(-5.4359F, -0.0723F, -0.3563F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.8667F, -0.261F, -0.2146F, 0.4999F, 2.7048F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(44, 10).addBox(-4.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 10.2402F, -1.8168F, -0.2189F, 0.4128F, 2.6204F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(47, 43).addBox(-3.6F, 0.0F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4373F, 10.3609F, -2.6322F, 0.0675F, 0.2143F, 2.6745F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(14, 67).addBox(-2.8869F, -0.0431F, -0.8026F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4925F, 10.3519F, -4.0539F, -0.102F, 0.166F, 2.611F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(45, 6).addBox(3.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -4.5F, -0.0403F, -0.3586F, 1.4214F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(9, 50).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(39, 18).addBox(-1.1328F, -0.9549F, 0.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9219F, -2.4363F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(19, 21).addBox(-1.1328F, -0.9549F, -5.0595F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 12).addBox(-0.5F, -0.0938F, -6.9914F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.5847F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 7.1806F, -6.2392F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(74, 63).addBox(-0.0018F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 1.4398F, 0.0014F, -0.001F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(39, 86).addBox(0.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.1534F, 0.4938F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, 0.104F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(88, 31).addBox(0.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(74, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.4041F, 2.8932F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(24, 89).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.8729F, -0.2661F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(18, 50).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.9713F, -0.6163F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(14, 81).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(63, 83).addBox(-0.018F, -1.9885F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(46, 83).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(89, 11).addBox(0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.8515F, 0.9635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r209 = leftarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(78, 4).addBox(-1.9973F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.1856F, 0.9517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 10.9412F, 1.2244F, 1.693F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(63, 78).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.4827F, 0.1882F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftArm4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(46, 70).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r211 = leftArm4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(68, 12).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r212 = leftArm4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r213 = leftArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r214 = leftArm4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(86, 43).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r215 = leftArm4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(18, 59).addBox(5.7459F, -2.4069F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8233F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 7.1806F, -6.2392F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(72, 74).addBox(-0.9982F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 1.4398F, -0.0014F, 0.001F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(56, 86).addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.1534F, 0.4938F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(53, 70).addBox(-1.0F, 0.104F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(88, 37).addBox(-1.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(16, 91).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.4041F, 2.8932F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(29, 89).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 0.8729F, -0.2661F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r222 = rightarm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(35, 52).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.9713F, -0.6163F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r223 = rightarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(41, 81).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r224 = rightarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(68, 83).addBox(-0.982F, -1.9885F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r225 = rightarm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(51, 83).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r226 = rightarm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(89, 14).addBox(-1.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -0.8515F, 0.9635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r227 = rightarm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(78, 24).addBox(-0.0027F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.1856F, 0.9517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 10.9412F, 1.2244F, 0.8639F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(68, 78).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.4827F, 0.1882F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightArm4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(70, 53).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r229 = rightArm4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(68, 16).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r230 = rightArm4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(7, 69).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r231 = rightArm4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(67, 39).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r232 = rightArm4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(61, 87).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r233 = rightArm4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(86, 75).addBox(-6.7459F, -2.4069F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8233F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9705F, -8.433F, 0.6818F, -0.0064F, -0.0614F));

		PartDefinition cube_r234 = neck3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(27, 92).addBox(0.0F, -2.0106F, -0.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0935F, -2.9153F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r235 = neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(8, 92).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(39, 12).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(92, 5).addBox(0.0F, -1.9874F, -0.9871F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.1F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(14, 64).addBox(0.0F, -1.0138F, -0.9647F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2F, -2.4F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(23, 50).addBox(0.0F, -1.0701F, -0.9888F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -1.3F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.1681F, -3.0721F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.4807F, -3.9276F, -0.4684F, -0.238F, -0.1709F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(29, 80).mirror().addBox(0.0F, -1.0659F, -1.9411F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.8496F, -2.333F, 1.1393F, 0.2369F, 0.4714F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(29, 80).addBox(0.0F, -1.0659F, -1.9411F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8496F, -2.333F, 1.1393F, -0.2369F, -0.4714F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(71, 9).addBox(0.0F, -0.9881F, 0.0149F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -1.2F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(70, 63).addBox(0.0F, -0.9851F, -0.0943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.4F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(66, 5).addBox(-0.5F, -2.3753F, -0.4709F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1671F, -3.6119F, 0.9758F, -0.0985F, -0.1443F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3154F, -0.5954F, -0.9604F, -0.025F, 0.0357F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(88, 34).addBox(-1.0F, -1.0333F, 0.0265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.0776F, -3.4664F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(75, 9).addBox(-1.0F, -1.2982F, -0.1143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.0776F, -3.1664F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 15).addBox(-1.0F, -1.6F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.5515F, -2.9272F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(59, 12).addBox(-1.0F, -2.5F, 2.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.8811F, -8.7344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(7, 73).addBox(-1.0F, -2.0156F, 0.0276F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.8811F, -4.8344F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(54, 50).addBox(-1.0F, -3.7F, 3.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.9811F, -9.5344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(58, 40).addBox(-1.0F, -0.2112F, -0.1783F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.7941F, -6.68F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(65, 74).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.0941F, -7.78F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(40, 55).addBox(-0.5F, -0.2528F, -2.7027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.8811F, -7.8344F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(77, 60).addBox(-1.0F, -1.6437F, -0.5907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(77, 57).addBox(-1.0F, -0.8437F, -0.5907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.1502F, -6.8709F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(77, 54).addBox(-1.0F, -0.9437F, 0.1093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1918F, -7.0665F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(50, 12).addBox(-1.0F, -0.0115F, -1.9021F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.308F, -5.982F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(58, 57).addBox(-1.5F, -0.9712F, -1.9745F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.2721F, -1.1778F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(44, 28).addBox(-2.0F, -0.0535F, -0.9678F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6279F, -1.3778F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(47, 39).addBox(-2.5F, 0.0322F, 0.0332F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 0.0509F, -2.0688F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(36, 40).addBox(-2.5F, 0.0546F, -1.9657F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.9491F, -2.3688F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(72, 43).addBox(-1.0F, -0.0445F, -0.9996F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.7F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(15, 41).addBox(-1.5F, -0.01F, -1.9792F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -4.3F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(67, 66).addBox(-1.5F, 0.9395F, 0.5905F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.0279F, -1.0778F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(56, 78).addBox(-1.5F, -0.0367F, -0.0431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5279F, 0.4222F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(42, 78).addBox(-1.5F, 0.0997F, 2.3565F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0279F, -2.2778F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(56, 45).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.2572F, 0.2373F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(45, 2).addBox(-2.0F, 0.0246F, -0.193F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.7279F, -1.3778F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8329F, -2.4279F, -4.7166F, 0.039F, -0.1033F, -0.6845F));

		PartDefinition cube_r269 = leftHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(49, 91).addBox(-0.0187F, -1.0493F, 3.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.44F, 0.6877F, -0.1761F));

		PartDefinition cube_r270 = leftHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(91, 55).addBox(1.4058F, -1.0493F, 2.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.3399F, 0.1604F, -0.4101F));

		PartDefinition cube_r271 = leftHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(91, 49).addBox(2.3903F, -0.4808F, 1.5465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.3076F, -0.2899F, -0.8887F));

		PartDefinition cube_r272 = leftHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(82, 12).addBox(0.9031F, -0.4506F, 1.2915F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.3225F, -0.4144F, -0.9318F));

		PartDefinition cube_r273 = leftHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(81, 63).addBox(1.2784F, -0.4506F, 0.5226F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.3644F, -0.62F, -1.0162F));

		PartDefinition cube_r274 = leftHorn.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(82, 21).addBox(-0.3098F, -1.0403F, 0.7217F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.049F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.0698F, -0.8775F, -0.5714F));

		PartDefinition cube_r275 = leftHorn.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 86).addBox(0.4918F, -1.5403F, -0.5167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 30).addBox(-0.0082F, -1.5403F, -0.5167F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 18).addBox(-0.1082F, -1.0403F, -0.0167F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(4.9943F, -1.1042F, 1.1946F, 0.0899F, -1.0515F, -0.5958F));

		PartDefinition cube_r276 = leftHorn.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(58, 36).addBox(-0.9F, -0.2F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 0.3948F, -0.1999F, -0.0995F, -0.1144F, -0.2697F));

		PartDefinition cube_r277 = leftHorn.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(23, 58).addBox(-1.0F, 0.2F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.3948F, -0.1999F, -0.0518F, -0.1424F, -0.6382F));

		PartDefinition cube_r278 = leftHorn.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(15, 46).addBox(-0.2308F, -0.744F, -0.5831F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.15F))
				.texOffs(25, 62).addBox(-0.5308F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 49).addBox(0.0692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 61).addBox(0.6692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 64).addBox(1.2692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 25).addBox(1.8692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(18, 62).addBox(1.8692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(56, 61).addBox(1.2692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(32, 61).addBox(0.6692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(61, 20).addBox(0.0692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(0, 61).addBox(-0.5308F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.5056F, 0.5958F, -0.0054F, -0.0592F, -0.1282F, -0.2116F));

		PartDefinition cube_r279 = leftHorn.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(65, 0).addBox(2.2493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 64).addBox(1.6493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(36, 46).addBox(1.0493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 45).addBox(0.4493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(47, 33).addBox(-0.1507F, -1.5429F, -0.9064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 46).addBox(-0.1507F, -1.0429F, -0.4064F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.3944F, 0.1958F, 0.1946F, -0.0032F, -0.4524F, -0.4711F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8329F, -2.4279F, -4.7166F, 0.039F, 0.1033F, 0.6845F));

		PartDefinition cube_r280 = rightHorn.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(49, 91).mirror().addBox(-0.9813F, -1.0493F, 3.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.44F, -0.6877F, 0.1761F));

		PartDefinition cube_r281 = rightHorn.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-2.4058F, -1.0493F, 2.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.3399F, -0.1604F, 0.4101F));

		PartDefinition cube_r282 = rightHorn.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-3.3903F, -0.4808F, 1.5465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.3076F, 0.2899F, 0.8887F));

		PartDefinition cube_r283 = rightHorn.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-2.9031F, -0.4506F, 1.2915F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.3225F, 0.4144F, 0.9318F));

		PartDefinition cube_r284 = rightHorn.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(-3.2784F, -0.4506F, 0.5226F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.3644F, 0.62F, 1.0162F));

		PartDefinition cube_r285 = rightHorn.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-1.6902F, -1.0403F, 0.7217F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.049F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.0698F, 0.8775F, 0.5714F));

		PartDefinition cube_r286 = rightHorn.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-1.4918F, -1.5403F, -0.5167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 30).mirror().addBox(-0.9918F, -1.5403F, -0.5167F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(82, 18).mirror().addBox(-1.8918F, -1.0403F, -0.0167F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-4.9943F, -1.1042F, 1.1946F, 0.0899F, 1.0515F, 0.5958F));

		PartDefinition cube_r287 = rightHorn.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-1.1F, -0.2F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.3948F, -0.1999F, -0.0995F, 0.1144F, 0.2697F));

		PartDefinition cube_r288 = rightHorn.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(23, 58).mirror().addBox(-1.0F, 0.2F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.3948F, -0.1999F, -0.0518F, 0.1424F, 0.6382F));

		PartDefinition cube_r289 = rightHorn.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(15, 46).mirror().addBox(-2.7692F, -0.744F, -0.5831F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(25, 62).mirror().addBox(-0.4692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(63, 49).mirror().addBox(-1.0692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(63, 61).mirror().addBox(-1.6692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 64).mirror().addBox(-2.2692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 25).mirror().addBox(-2.8692F, -1.244F, -1.1831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(18, 62).mirror().addBox(-2.8692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(56, 61).mirror().addBox(-2.2692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(32, 61).mirror().addBox(-1.6692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(61, 20).mirror().addBox(-1.0692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-0.4692F, -1.244F, 0.0169F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.5056F, 0.5958F, -0.0054F, -0.0592F, 0.1282F, 0.2116F));

		PartDefinition cube_r290 = rightHorn.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-3.2493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 64).mirror().addBox(-2.6493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 46).mirror().addBox(-2.0493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 45).mirror().addBox(-1.4493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 33).mirror().addBox(-0.8493F, -1.5429F, -0.9064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 46).mirror().addBox(-2.8493F, -1.0429F, -0.4064F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3944F, 0.1958F, 0.1946F, -0.0032F, 0.4524F, 0.4711F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(91, 46).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(44, 91).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3291F, 0.368F, -0.782F, 0.6645F, 0.4881F, 0.3521F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(52, 22).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0641F, -0.5667F, 0.4627F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(81, 88).addBox(-0.5F, -0.2596F, -1.2841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(88, 80).addBox(-0.5F, -0.2596F, -0.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.0641F, -1.67F, 0.5882F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(70, 49).addBox(-0.5F, -0.2579F, -0.2337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0641F, -1.67F, 0.5882F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(72, 28).addBox(-0.4359F, -0.1857F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.6F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(72, 0).addBox(-0.4359F, -0.2732F, -1.7998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.6F, 0.5794F, 0.1024F, 0.0668F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(77, 47).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1376F, -3.4468F, 6.3824F, 0.2339F, -0.7261F, 0.0918F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(72, 70).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2789F, -2.7515F, 5.8897F, 0.6894F, -0.2793F, 0.0F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(90, 2).addBox(-0.5F, -0.3262F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 90).addBox(-0.5F, -0.3262F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3975F, -2.8234F, 5.4762F, 0.2443F, -0.2793F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(49, 80).addBox(-1.5F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 75).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 43).addBox(-1.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -2.2841F, 4.6771F, 0.5889F, 0.0132F, 0.2174F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(81, 35).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 81).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1289F, -2.4701F, 2.8467F, -1.4338F, -0.0054F, 0.0832F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(81, 32).addBox(-0.9796F, -0.3444F, -0.6316F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 38).addBox(-0.9796F, -0.3444F, 0.1684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 81).addBox(-0.9796F, -0.3444F, -0.2316F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.238F, -2.334F, 3.0845F, -0.6959F, 0.1956F, 0.0206F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(40, 60).addBox(-1.6F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.138F, -1.6594F, 3.8074F, 0.452F, 0.4137F, 0.3856F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(9, 60).addBox(-1.6F, 0.1F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4962F, -3.8862F, 3.7365F, -2.0244F, 0.4382F, 0.2603F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(59, 16).addBox(-1.3529F, -0.5601F, -1.6401F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.641F, -4.1324F, 3.9548F, -2.6327F, -1.1221F, -0.4088F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(34, 90).addBox(-0.5F, -0.3281F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(11, 90).addBox(-0.5F, -0.3281F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.576F, -3.5415F, 4.5088F, 1.9441F, 0.1978F, 0.0632F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(54, 90).addBox(-0.5F, -0.6445F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 90).addBox(-0.5F, -0.6445F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6215F, -2.8551F, 4.9518F, 1.4205F, 0.1978F, 0.0632F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(72, 94).addBox(-1.0F, 0.005F, -0.253F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(72, 94).addBox(-1.0F, 0.005F, -0.853F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0641F, -2.9583F, 4.1586F, -0.6632F, 0.2443F, 0.0F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(72, 94).addBox(-1.0F, -0.7229F, 0.0287F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(72, 94).addBox(-1.0F, -1.0229F, -0.2713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0641F, -2.9583F, 4.1586F, 0.1571F, 0.2443F, 0.0F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(72, 94).addBox(-1.0F, 0.0857F, -0.1914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0641F, -2.9583F, 4.1586F, 0.5411F, 0.2443F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(72, 94).addBox(-1.0F, -0.8987F, -0.365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0641F, -2.9583F, 4.1586F, 0.9599F, 0.2443F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 0).addBox(-1.5F, -0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.576F, -3.5415F, 4.5088F, 2.6859F, 0.1978F, 0.0632F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(91, 46).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(44, 91).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3291F, 0.368F, -0.782F, 0.6645F, -0.4881F, -0.3521F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -0.5667F, 0.4627F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(81, 88).mirror().addBox(-0.5F, -0.2596F, -1.2841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(88, 80).mirror().addBox(-0.5F, -0.2596F, -0.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -1.67F, 0.5882F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-0.5F, -0.2579F, -0.2337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -1.67F, 0.5882F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-0.5641F, -0.1857F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9F, 0.6F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.5641F, -0.2732F, -1.7998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 0.6F, 0.5794F, -0.1024F, -0.0668F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1376F, -3.4468F, 6.3824F, 0.2339F, 0.7261F, -0.0918F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2789F, -2.7515F, 5.8897F, 0.6894F, 0.2793F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-0.5F, -0.3262F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 90).mirror().addBox(-0.5F, -0.3262F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3975F, -2.8234F, 5.4762F, 0.2443F, 0.2793F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(49, 80).mirror().addBox(-0.5F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 75).mirror().addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 43).mirror().addBox(-0.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -2.2841F, 4.6771F, 0.5889F, -0.0132F, -0.2174F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 81).mirror().addBox(-1.0F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1289F, -2.4701F, 2.8467F, -1.4338F, 0.0054F, -0.0832F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-1.0204F, -0.3444F, -0.6316F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 38).mirror().addBox(-1.0204F, -0.3444F, 0.1684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 81).mirror().addBox(-1.0204F, -0.3444F, -0.2316F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -2.334F, 3.0845F, -0.6959F, -0.1956F, -0.0206F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-0.4F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.138F, -1.6594F, 3.8074F, 0.452F, -0.4137F, -0.3856F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-0.4F, 0.1F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4962F, -3.8862F, 3.7365F, -2.0244F, -0.4382F, -0.2603F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-0.6471F, -0.5601F, -1.6401F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.641F, -4.1324F, 3.9548F, -2.6327F, 1.1221F, 0.4088F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(34, 90).mirror().addBox(-0.5F, -0.3281F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(11, 90).mirror().addBox(-0.5F, -0.3281F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.576F, -3.5415F, 4.5088F, 1.9441F, -0.1978F, -0.0632F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(54, 90).mirror().addBox(-0.5F, -0.6445F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 90).mirror().addBox(-0.5F, -0.6445F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6215F, -2.8551F, 4.9518F, 1.4205F, -0.1978F, -0.0632F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(72, 94).mirror().addBox(-1.0F, 0.005F, -0.253F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(72, 94).mirror().addBox(-1.0F, 0.005F, -0.853F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -2.9583F, 4.1586F, -0.6632F, -0.2443F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(72, 94).mirror().addBox(-1.0F, -0.7229F, 0.0287F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(72, 94).mirror().addBox(-1.0F, -1.0229F, -0.2713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -2.9583F, 4.1586F, 0.1571F, -0.2443F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(72, 94).mirror().addBox(-1.0F, 0.0857F, -0.1914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -2.9583F, 4.1586F, 0.5411F, -0.2443F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(72, 94).mirror().addBox(-1.0F, -0.8987F, -0.365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -2.9583F, 4.1586F, 0.9599F, -0.2443F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 0).mirror().addBox(-0.5F, -0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.576F, -3.5415F, 4.5088F, 2.6859F, -0.1978F, -0.0632F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2983F, -2.4254F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-0.25F, -2.3109F, -1.0276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -0.3444F, -0.0706F, -0.1206F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-0.25F, -0.3999F, -0.6352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -0.0302F, -0.0706F, -0.1206F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(91, 68).mirror().addBox(-0.1389F, -4.6035F, 0.1377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.2049F, -0.1261F, -0.086F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-0.3712F, -1.6601F, -0.292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.4127F, -0.1118F, -0.0205F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(29, 85).mirror().addBox(-0.334F, -3.1482F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.4108F, -0.1229F, -0.0482F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(24, 85).mirror().addBox(-0.334F, -3.0651F, -0.1646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.2712F, -0.1229F, -0.0482F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.0407F, -4.1389F, -0.4626F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.2927F, -0.1177F, -0.1087F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(91, 58).mirror().addBox(-0.1389F, -3.8231F, -0.2064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.2921F, -0.1261F, -0.086F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(92, 23).mirror().addBox(-0.2532F, -5.0504F, 0.8984F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 71).mirror().addBox(-0.3532F, -5.2504F, 1.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -0.9796F, -0.0763F, -0.0698F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(44, 87).mirror().addBox(-0.25F, 0.0118F, -0.7861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -0.3967F, -0.0706F, -0.1206F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(91, 77).mirror().addBox(-0.25F, 0.3142F, 0.0718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -0.1873F, -0.0706F, -0.1206F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(91, 43).mirror().addBox(-0.25F, -0.0303F, -0.8526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, 0.8163F, -0.0706F, -0.1206F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(87, 7).mirror().addBox(-0.25F, -0.2324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -1.1821F, -0.0706F, -0.1206F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(49, 87).mirror().addBox(-0.15F, 0.0263F, 0.4599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -0.9378F, -0.0706F, -0.1206F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(91, 74).mirror().addBox(-0.3532F, -5.3571F, 0.5083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3374F, 3.8746F, -6.4779F, -1.1192F, -0.0763F, -0.0698F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(91, 52).mirror().addBox(-0.25F, -1.0469F, -0.4902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.5901F, -0.288F, -0.676F, -0.0706F, -0.1206F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(82, 7).addBox(-0.75F, -2.3109F, -1.0276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -0.3444F, 0.0706F, 0.1206F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(91, 26).addBox(-0.75F, -0.3999F, -0.6352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -0.0302F, 0.0706F, 0.1206F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(91, 68).addBox(-0.8611F, -4.6035F, 0.1377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.2049F, 0.1261F, 0.086F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(59, 90).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 90).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(64, 90).addBox(-0.1F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(59, 90).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 4.0789F, -7.177F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(40, 52).mirror().addBox(-0.5F, -0.3619F, -0.8071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(40, 52).addBox(-0.1F, -0.3619F, -0.8071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2F, 4.3894F, -6.5351F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(78, 83).addBox(-0.6288F, -1.6601F, -0.292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.4127F, 0.1118F, 0.0205F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(29, 85).addBox(-0.666F, -3.1482F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.4108F, 0.1229F, 0.0482F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(24, 85).addBox(-0.666F, -3.0651F, -0.1646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.2712F, 0.1229F, 0.0482F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 93).addBox(0.0407F, -4.1389F, -0.4626F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.2927F, 0.1177F, 0.1087F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(91, 58).addBox(-0.8611F, -3.8231F, -0.2064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.2921F, 0.1261F, 0.086F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(92, 23).addBox(0.2532F, -5.0504F, 0.8984F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 71).addBox(-0.6468F, -5.2504F, 1.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -0.9796F, 0.0763F, 0.0698F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(44, 87).addBox(-0.75F, 0.0118F, -0.7861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -0.3967F, 0.0706F, 0.1206F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(91, 77).addBox(-0.75F, 0.3142F, 0.0718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -0.1873F, 0.0706F, 0.1206F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(91, 43).addBox(-0.75F, -0.0303F, -0.8526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, 0.8163F, 0.0706F, 0.1206F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(87, 7).addBox(-0.75F, -0.2324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -1.1821F, 0.0706F, 0.1206F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(49, 87).addBox(-0.85F, 0.0263F, 0.4599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -0.9378F, 0.0706F, 0.1206F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(91, 74).addBox(-0.6468F, -5.3571F, 0.5083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3374F, 3.8746F, -6.4779F, -1.1192F, 0.0763F, 0.0698F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(91, 52).addBox(-0.75F, -1.0469F, -0.4902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.45F, 0.5901F, -0.288F, -0.676F, 0.0706F, 0.1206F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 48).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.4622F, 0.7082F, -0.4097F, -0.2815F, 0.1201F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, 0.4319F, -0.2387F, -0.1086F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 28).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.063F, 4.5763F, 0.5919F, -0.2188F, -0.1449F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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