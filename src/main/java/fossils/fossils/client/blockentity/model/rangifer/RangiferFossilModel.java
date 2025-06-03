package fossils.fossils.client.blockentity.model.rangifer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RangiferFossilModel extends SkullModelBase {
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

	public RangiferFossilModel(ModelPart root) {
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
		this.tail3 = this.tail.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 4.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5553F, 8.3073F, -0.1571F, 0.0F, -0.2618F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 65).addBox(0.0F, -0.1F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.509F, -1.1252F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 96).addBox(0.0F, -1.0201F, -1.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-1.1156F, -0.1514F, -0.5086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -1.7719F, -0.2709F, -0.8218F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(-1.0245F, -0.9821F, 0.2594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -0.4508F, -0.5068F, -0.379F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-1.9165F, -2.0114F, -0.8215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -2.1321F, -0.168F, -1.3954F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 37).mirror().addBox(-1.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -0.518F, -0.2903F, -1.1684F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2553F, 3.2518F, 4.067F, -0.7856F, -0.1966F, -0.7868F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.2371F, -0.3589F, -0.5993F, 0.1007F, -0.6811F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 48).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.2371F, -0.3589F, 0.0572F, -0.1406F, -0.3173F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-0.2904F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.7426F, -0.2171F, -0.561F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 47).mirror().addBox(-0.2904F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.6228F, -0.2103F, -0.3213F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-0.3837F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.0966F, 0.0684F, -0.5622F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.3837F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -1.0566F, 0.0684F, -0.5622F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.3837F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.4021F, 0.0684F, -0.5622F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 41).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8295F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 69).addBox(0.1156F, -0.1514F, -0.5086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -1.7719F, 0.2709F, 0.8218F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(69, 3).addBox(0.0245F, -0.9821F, 0.2594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -0.4508F, 0.5068F, 0.379F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 26).addBox(0.9165F, -2.0114F, -0.8215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -2.1321F, 0.168F, 1.3954F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 37).addBox(0.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -0.518F, 0.2903F, 1.1684F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2553F, 3.2518F, 4.067F, -0.7856F, 0.1966F, 0.7868F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 75).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.2371F, -0.3589F, -0.5993F, -0.1007F, 0.6811F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 48).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.2371F, -0.3589F, 0.0572F, 0.1406F, 0.3173F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(39, 48).addBox(-0.7096F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.7426F, 0.2171F, 0.561F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 47).addBox(-0.7096F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.6228F, 0.2103F, 0.3213F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(91, 23).addBox(-0.6163F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.0966F, -0.0684F, 0.5622F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 92).addBox(-0.6163F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -1.0566F, -0.0684F, 0.5622F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 88).addBox(-0.6163F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.4021F, -0.0684F, 0.5622F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(48, 41).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(90, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8295F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.7008F, 1.3755F, -1.817F, -0.3189F, -0.2756F));

		PartDefinition cube_r32 = leftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 66).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(59, 73).addBox(-1.0F, -0.6047F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 82).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 81).addBox(-1.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(82, 91).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(71, 81).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(41, 58).addBox(-1.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 22).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 2.2895F, 0.1653F, 0.143F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(38, 77).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(84, 21).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 15).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(80, 69).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(14, 75).addBox(-1.9F, 0.0521F, -0.9979F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.428F, 0.2695F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 75).addBox(-1.9F, -1.0479F, -0.9979F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 90).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2856F, -1.2868F, -1.5794F, 0.0011F, 0.1309F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(36, 81).addBox(-1.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(11, 38).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(21, 45).addBox(-0.6F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 8.7492F, -0.7306F, 1.4994F, -0.2073F, -0.0684F));

		PartDefinition cube_r49 = leftLeg4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(74, 65).addBox(6.6299F, -0.5F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r50 = leftLeg4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(77, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, 0.2142F, -5.3932F));

		PartDefinition cube_r51 = leftLeg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(52, 69).addBox(8.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r52 = leftLeg5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(24, 70).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r53 = leftLeg5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(19, 78).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r54 = leftLeg5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 77).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.7008F, 1.3755F, -1.5026F, -0.1211F, -0.8046F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(31, 66).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 73).addBox(-1.0F, -0.6047F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 83).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 54).addBox(0.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(87, 91).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(82, 46).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 58).addBox(-0.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(59, 58).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 1.8435F, 0.1261F, 0.0352F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(52, 77).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 30).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 81).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 72).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 75).addBox(0.9F, 0.0521F, -0.9979F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 5.428F, 0.2695F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(76, 12).addBox(0.9F, -1.0479F, -0.9979F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(90, 81).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2856F, -1.2868F, -1.3612F, 0.0015F, -0.0055F));

		PartDefinition cube_r70 = rightLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(81, 41).addBox(0.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(16, 38).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(45, 43).addBox(-0.4F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 8.7492F, -0.7306F, 2.2686F, 0.0978F, -0.0795F));

		PartDefinition cube_r72 = rightLeg4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 75).addBox(-7.6299F, -0.5F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r73 = rightLeg4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(77, 22).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2142F, -5.3932F));

		PartDefinition cube_r74 = rightLeg5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 69).addBox(-9.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r75 = rightLeg5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(70, 51).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r76 = rightLeg5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 77).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r77 = rightLeg5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 77).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(95, 94).addBox(0.0F, -1.0751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 0).addBox(0.0F, -0.9577F, -1.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(8, 95).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(47, 94).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(88, 11).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.044F, 0.0809F, -0.7587F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(88, 15).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0635F, 0.0668F, -1.0208F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0871F, 0.03F, -1.5F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(8, 95).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(47, 22).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(47, 94).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(88, 11).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.044F, -0.0809F, 0.7587F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(88, 15).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0635F, -0.0668F, 1.0208F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(56, 20).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0871F, -0.03F, 1.5F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(17, 96).addBox(-0.5753F, -0.9995F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(95, 10).addBox(-0.4485F, -1.2943F, -0.4457F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.4806F, -7.4243F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8926F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(82, 89).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.0527F, 0.1564F, -0.66F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(89, 87).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.0101F, 0.1647F, -0.9251F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 16).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0677F, 0.1506F, -1.411F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.0344F, 0.1516F, -0.6108F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(91, 17).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0063F, 0.1553F, -0.8758F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(32, 24).mirror().addBox(-9.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0777F, 0.1347F, -1.3605F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(90, 72).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.0634F, 0.1715F, -0.6062F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(19, 6).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, -0.0703F, 0.1689F, -1.3594F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.0164F, 0.1821F, -0.8719F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 89).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.0527F, -0.1564F, 0.66F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(89, 87).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.0101F, -0.1647F, 0.9251F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(43, 16).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0677F, -0.1506F, 1.411F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 91).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.0344F, -0.1516F, 0.6108F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(91, 17).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0063F, -0.1553F, 0.8758F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(32, 24).addBox(3.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0777F, -0.1347F, 1.3605F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(90, 72).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.0634F, -0.1715F, 0.6062F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(19, 6).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, -0.0703F, -0.1689F, 1.3594F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(90, 85).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.0164F, -0.1821F, 0.8719F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(5, 95).addBox(0.0F, -1.1938F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(95, 80).addBox(0.0F, -1.3938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(23, 95).addBox(0.0F, -1.9698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, -0.0449F, -0.156F, -0.0693F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(24, 60).addBox(0.0F, -3.0966F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4078F, -2.0187F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(87, 68).addBox(0.0F, -3.9854F, -0.9869F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(13, 19).addBox(0.0F, -4.4854F, 0.0131F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8812F, -5.6454F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(55, 81).addBox(0.0F, -4.816F, 0.0852F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7402F, -7.5587F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-1.0233F, -0.621F, 0.7555F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.1024F, 0.2233F, 0.1018F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(26, 31).mirror().addBox(-0.5F, -1.4045F, 3.3411F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.1578F, -0.1909F, 0.2114F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(-0.5F, -0.9749F, 7.0511F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.1054F, -0.1909F, 0.2114F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-0.5F, 0.7405F, 6.6419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.5592F, -0.1909F, 0.2114F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(91, 32).mirror().addBox(-0.5F, -6.4838F, 3.0838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 0.4422F, -0.1909F, 0.2114F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(63, 52).mirror().addBox(-0.5F, -1.1036F, 5.1161F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(13, 32).mirror().addBox(-0.5F, -0.5286F, -0.5007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.4196F, -0.1909F, 0.2114F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, 0.6039F, 3.1797F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.7512F, -0.1909F, 0.2114F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(89, 89).mirror().addBox(-0.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4753F, 10.2955F, -6.3735F, -0.0179F, 0.0628F, -2.7221F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0641F, 0.2032F, -1.3058F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(87, 56).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0384F, 0.2095F, -0.8153F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0919F, 0.1923F, -0.5487F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-8.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0615F, 0.2205F, -1.3402F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.049F, 0.2235F, -0.8479F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1059F, 0.2032F, -0.5808F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(68, 63).mirror().addBox(-6.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, -0.0318F, 0.4104F, -1.68F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.1711F, 0.3761F, -1.1608F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 13).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.2643F, 0.3192F, -0.8888F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-7.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, -0.0458F, 0.3241F, -1.4931F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 89).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.1141F, 0.3073F, -0.9879F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(82, 87).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.191F, 0.2673F, -0.718F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(63, 87).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.1059F, 0.2032F, -0.6681F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 87).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.049F, 0.2235F, -0.9352F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-0.4727F, -0.1425F, -0.4341F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.2927F, -0.6396F, -2.6792F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(21, 43).mirror().addBox(-0.4727F, -0.1425F, -0.4341F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.1053F, -0.3887F, -2.9786F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(43, 18).mirror().addBox(-0.2641F, -0.0723F, -0.3563F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.8667F, -0.261F, -0.1636F, -0.1234F, -2.8349F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(43, 20).mirror().addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 10.2402F, -1.8168F, -0.1779F, -0.146F, -2.7596F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-0.6F, 0.0F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4373F, 10.3609F, -2.6322F, 0.1109F, 0.0656F, -2.8672F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(-0.1F, 0.0F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4925F, 10.3519F, -3.6539F, -0.108F, 0.0328F, -2.8068F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-8.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0615F, 0.2205F, -1.4275F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(32, 10).mirror().addBox(-0.5F, -0.1239F, -0.253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.245F, -0.1909F, 0.2114F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -1.0596F, 2.7156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 0.9222F, -0.1909F, 0.2114F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(-0.5F, -0.4813F, 4.6909F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.0443F, -0.1909F, 0.2114F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(19, 0).addBox(0.0233F, -0.621F, 0.7555F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.1024F, -0.2233F, -0.1018F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5F, -1.4045F, 3.3411F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.1578F, 0.1909F, -0.2114F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(62, 89).addBox(-0.5F, -0.9749F, 7.0511F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.1054F, 0.1909F, -0.2114F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(90, 4).addBox(-0.5F, 0.7405F, 6.6419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.5592F, 0.1909F, -0.2114F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(91, 32).addBox(-0.5F, -6.4838F, 3.0838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 0.4422F, 0.1909F, -0.2114F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(63, 52).addBox(-0.5F, -1.1036F, 5.1161F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(13, 32).addBox(-0.5F, -0.5286F, -0.5007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.4196F, 0.1909F, -0.2114F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 0.6039F, 3.1797F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.7512F, 0.1909F, -0.2114F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(89, 89).addBox(-1.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4753F, 10.2955F, -6.3735F, -0.0179F, -0.0628F, 2.7221F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(19, 8).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0641F, -0.2032F, 1.3058F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(87, 56).addBox(2.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0384F, -0.2095F, 0.8153F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(70, 55).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0919F, -0.1923F, 0.5487F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 14).addBox(3.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0615F, -0.2205F, 1.3402F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 89).addBox(2.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.049F, -0.2235F, 0.8479F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(12, 89).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1059F, -0.2032F, 0.5808F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(68, 63).addBox(3.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, -0.0318F, -0.4104F, 1.68F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(55, 88).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.1711F, -0.3761F, 1.1608F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(88, 13).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.2643F, -0.3192F, 0.8888F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(54, 46).addBox(3.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, -0.0458F, -0.3241F, 1.4931F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(24, 89).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.1141F, -0.3073F, 0.9879F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(82, 87).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.191F, -0.2673F, 0.718F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(63, 87).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.1059F, -0.2032F, 0.6681F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(70, 87).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.049F, -0.2235F, 0.9352F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(32, 22).addBox(-5.5273F, -0.1425F, -0.4341F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.2927F, 0.6396F, 2.6792F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(21, 43).addBox(-4.5273F, -0.1425F, -0.4341F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.1053F, 0.3887F, 2.9786F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(43, 18).addBox(-4.7359F, -0.0723F, -0.3563F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.8667F, -0.261F, -0.1636F, 0.1234F, 2.8349F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(43, 20).addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 10.2402F, -1.8168F, -0.1779F, 0.146F, 2.7596F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(57, 33).addBox(-3.4F, 0.0F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4373F, 10.3609F, -2.6322F, 0.1109F, -0.0656F, 2.8672F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(20, 95).addBox(-0.005F, -4.7862F, -0.7504F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4839F, -9.1701F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(51, 91).addBox(0.0F, -2.8836F, -0.1044F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4839F, -9.1701F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(68, 33).addBox(-2.9F, 0.0F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4925F, 10.3519F, -3.6539F, -0.108F, -0.0328F, 2.8068F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(43, 12).addBox(3.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0615F, -0.2205F, 1.4275F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(32, 10).addBox(-0.5F, -0.1239F, -0.253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.245F, 0.1909F, -0.2114F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.0596F, 2.7156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 0.9222F, 0.1909F, -0.2114F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(18, 50).addBox(-0.5F, -0.4813F, 4.6909F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.0443F, 0.1909F, -0.2114F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(32, 16).addBox(-1.1328F, -0.9549F, 0.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9219F, -2.4363F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 19).addBox(-1.1328F, -0.9549F, -5.0595F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.1855F, -6.9515F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 9.6885F, -6.2172F, 0.8208F, 0.2729F, -0.2264F));

		PartDefinition cube_r191 = leftarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(75, 46).addBox(-0.0018F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 1.4398F, 0.0014F, -0.001F));

		PartDefinition cube_r192 = leftarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(36, 90).addBox(0.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.1535F, 0.4938F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r193 = leftarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(77, 54).addBox(0.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(41, 91).addBox(0.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(91, 26).addBox(0.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.1867F, 2.6698F, -1.8619F, -0.2253F, 0.0314F));

		PartDefinition cube_r196 = leftarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 93).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.8729F, -0.2661F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r197 = leftarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(14, 64).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.9713F, -0.6163F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r198 = leftarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(83, 0).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r199 = leftarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(19, 87).addBox(-0.018F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r200 = leftarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 87).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r201 = leftarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(92, 74).addBox(0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.8515F, 0.9635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r202 = leftarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(48, 81).addBox(-1.9973F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.1856F, 0.9517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.9886F, 0.7915F, 1.8839F, 0.6739F, 0.3438F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(26, 81).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4098F, 0.485F, 1.0523F, 0.2167F, 0.3644F));

		PartDefinition cube_r203 = leftArm4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(73, 69).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r204 = leftArm4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(38, 73).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r205 = leftArm4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(31, 71).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r206 = leftArm4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r207 = leftArm4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(31, 89).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r208 = leftArm4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(67, 89).addBox(5.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8233F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 9.6885F, -6.2172F, 1.1802F, 0.0196F, -0.3164F));

		PartDefinition cube_r209 = rightarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(76, 8).addBox(-0.9982F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 1.4398F, -0.0014F, 0.001F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(55, 90).addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5119F, -0.1535F, 0.4938F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(59, 77).addBox(-1.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(91, 58).addBox(-1.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 29).addBox(-1.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.1867F, 2.6698F, -1.8586F, -0.4113F, -0.3602F));

		PartDefinition cube_r214 = rightarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(93, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 0.8729F, -0.2661F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r215 = rightarm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(19, 64).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.9713F, -0.6163F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r216 = rightarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(58, 83).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(45, 87).addBox(-0.982F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(87, 52).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r219 = rightarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(92, 91).addBox(-1.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -0.8515F, 0.9635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(64, 81).addBox(-0.0027F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.1856F, 0.9517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(27, 57).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.9886F, 0.7915F, 1.9647F, 0.586F, -0.1994F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(31, 81).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4098F, 0.485F, 0.1988F, -0.2454F, -0.0153F));

		PartDefinition cube_r221 = rightArm4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(74, 42).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r222 = rightArm4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(52, 73).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r223 = rightArm4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(72, 38).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r224 = rightArm4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r225 = rightArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 45).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r226 = rightArm4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(72, 89).addBox(-6.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8233F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -8.9F, 0.2608F, -0.0226F, 0.0843F));

		PartDefinition cube_r227 = neck3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(11, 95).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r228 = neck3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(96, 19).addBox(0.0F, -1.8F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 31).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, 0.2789F, -0.3705F, 0.0321F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(95, 14).addBox(0.0F, -0.9681F, 1.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 49).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1565F, -1.5193F, -0.4073F, -0.3549F, 0.2899F));

		PartDefinition cube_r230 = neck.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(32, 38).addBox(0.0F, -0.8F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5928F, -0.5967F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(90, 68).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.4F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(14, 81).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2365F, -1.5677F, 1.0964F, -0.369F, 0.0471F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(81, 64).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9339F, -0.2194F, -0.9619F, -0.2085F, -0.0647F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(14, 60).addBox(-1.0F, -0.9982F, 0.0857F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.0776F, -3.1664F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(79, 38).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6515F, -2.9272F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(5, 59).addBox(-1.0F, -2.8F, 3.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.9811F, -8.7344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(48, 31).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.3647F, -4.5291F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(38, 69).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.8836F, -5.5368F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(45, 69).addBox(-1.0F, -4.0F, 3.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8811F, -8.7344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6766F, -6.453F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(41, 84).addBox(-1.0F, -0.5633F, -1.1538F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 53).addBox(-0.5F, -0.5367F, -0.8462F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.0817F, -7.429F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(81, 12).addBox(-1.0F, 0.4563F, -0.4907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.069F, -6.9484F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(76, 0).addBox(-1.0F, -0.0115F, -0.7021F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.3811F, -5.9138F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(36, 53).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7794F, -4.5096F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(32, 62).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(21, 38).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7275F, -3.1132F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(41, 62).addBox(-0.5F, 0.7F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -1.2871F, -1.218F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(61, 26).addBox(-2.5F, 0.0118F, -0.9657F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2569F, -1.5231F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(39, 26).addBox(-2.5F, -0.0454F, -1.9657F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.7873F, -2.2512F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, -0.0454F, 0.0343F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1318F, -4.7641F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(45, 77).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7503F, -0.1104F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(84, 24).addBox(-1.0F, 0.0079F, -0.0229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5064F, -0.6503F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(5, 83).addBox(-1.0F, 0.5079F, -1.0229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(38, 66).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.2078F, -1.604F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0665F, -1.7566F, -1.3789F, 0.0511F, 0.0068F, -0.8018F));

		PartDefinition cube_r255 = leftHorn.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(63, 0).addBox(-1.5286F, -0.2081F, 0.0032F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2308F, -5.9743F, 5.164F, -0.2883F, -0.6234F, -0.6265F));

		PartDefinition cube_r256 = leftHorn.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(56, 17).addBox(-0.8898F, -0.0163F, -1.5538F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(16.8397F, -6.7013F, 9.1235F, 1.3857F, -1.4734F, -2.2967F));

		PartDefinition cube_r257 = leftHorn.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(56, 14).addBox(0.8004F, -0.3034F, -0.3475F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(15.2308F, -5.9743F, 5.164F, -0.3561F, -0.8471F, -0.5261F));

		PartDefinition cube_r258 = leftHorn.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 9).addBox(-0.1522F, 0.0055F, -1.2119F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(16.8397F, -6.7013F, 9.1235F, 0.5823F, -1.406F, -1.4827F));

		PartDefinition cube_r259 = leftHorn.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(56, 8).addBox(-3.4662F, 0.0055F, 0.1312F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(16.8397F, -6.7013F, 9.1235F, 0.1761F, 1.03F, -0.7553F));

		PartDefinition cube_r260 = leftHorn.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(56, 11).addBox(0.8127F, -0.312F, -0.5325F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2308F, -5.9743F, 5.164F, -0.4454F, -0.9906F, -0.4128F));

		PartDefinition cube_r261 = leftHorn.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(67, 17).addBox(2.8923F, -0.3034F, 0.9436F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2308F, -5.9743F, 5.164F, -0.2478F, -0.3455F, -0.7124F));

		PartDefinition cube_r262 = leftHorn.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(67, 14).addBox(0.7904F, -0.3034F, -0.6872F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2308F, -5.9743F, 5.164F, -0.3369F, -0.7979F, -0.5522F));

		PartDefinition cube_r263 = leftHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(5, 63).addBox(-1.5293F, -0.2081F, -0.5058F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2308F, -5.9743F, 5.164F, -0.2883F, -0.6234F, -0.6265F));

		PartDefinition cube_r264 = leftHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(56, 66).addBox(-0.4F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(17.5385F, -9.4076F, 2.4334F, -0.7062F, -0.8065F, -0.3143F));

		PartDefinition cube_r265 = leftHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(63, 39).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(16.6293F, -8.3526F, 2.4148F, -0.4731F, -0.1697F, -0.78F));

		PartDefinition cube_r266 = leftHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(63, 42).addBox(-1.0F, -0.5F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(16.2043F, -8.4965F, 1.585F, -0.4964F, -0.3397F, -0.6877F));

		PartDefinition cube_r267 = leftHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(32, 0).addBox(3.1489F, 1.4734F, -7.0338F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(10.8538F, -2.6052F, 4.5023F, -0.5014F, -0.2673F, -0.728F));

		PartDefinition cube_r268 = leftHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(48, 84).addBox(2.5824F, -0.2201F, 0.2248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.4764F, 0.53F, -1.1485F));

		PartDefinition cube_r269 = leftHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(50, 27).addBox(1.7189F, -0.2201F, -2.7205F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.449F, -0.4238F, -0.6977F));

		PartDefinition cube_r270 = leftHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(66, 48).addBox(0.26F, -0.2428F, -0.7216F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.4169F, 0.2145F, -0.9872F));

		PartDefinition cube_r271 = leftHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(65, 45).addBox(0.1854F, -0.2428F, -1.4533F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.4071F, 0.0385F, -0.9098F));

		PartDefinition cube_r272 = leftHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(49, 5).addBox(2.9827F, -1.5849F, -2.4087F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.0911F, 0.514F, -0.7889F));

		PartDefinition cube_r273 = leftHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(84, 18).addBox(0.4046F, -1.5849F, -3.603F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.0795F, 0.0792F, -0.7503F));

		PartDefinition cube_r274 = leftHorn.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(13, 26).addBox(-2.6177F, -0.2602F, -3.6417F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.4097F, -0.3017F, -0.6325F));

		PartDefinition cube_r275 = leftHorn.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(50, 22).addBox(1.2593F, -1.4389F, -8.7034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.0625F, 0.243F, -0.637F));

		PartDefinition cube_r276 = leftHorn.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(27, 52).addBox(-0.4211F, -1.4389F, -6.5774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.0607F, -0.0357F, -0.6197F));

		PartDefinition cube_r277 = leftHorn.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 52).addBox(1.3755F, -1.4389F, 4.1686F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.237F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -3.0741F, 0.4537F, 2.5493F));

		PartDefinition cube_r278 = leftHorn.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(54, 0).addBox(-1.211F, -1.4389F, -6.5388F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.0614F, -0.1576F, -0.6123F));

		PartDefinition cube_r279 = leftHorn.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5522F, -0.2602F, -3.9418F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -0.3903F, -0.0281F, -0.7493F));

		PartDefinition cube_r280 = leftHorn.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(66, 35).addBox(3.8187F, -1.404F, -0.7666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -2.6977F, 1.4192F, 2.9301F));

		PartDefinition cube_r281 = leftHorn.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(60, 5).addBox(3.0303F, -1.404F, -0.1621F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(15.2388F, -8.8527F, -0.7043F, -2.9758F, 1.1669F, 2.6433F));

		PartDefinition cube_r282 = leftHorn.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(67, 8).addBox(-0.4F, -0.6F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.9026F, -1.0349F, 8.205F, 1.5599F, -0.8881F, -1.6503F));

		PartDefinition cube_r283 = leftHorn.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(67, 11).addBox(-0.1F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.9005F, -0.8375F, 5.3834F, 1.5381F, -1.3593F, -1.6267F));

		PartDefinition cube_r284 = leftHorn.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(65, 66).addBox(-0.7049F, -0.5612F, -0.3649F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.2148F, 0.1591F, 3.4998F, 0.623F, -0.952F, -0.7859F));

		PartDefinition cube_r285 = leftHorn.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 32).addBox(3.1144F, 0.5718F, 1.136F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(10.8538F, -2.6052F, 4.5023F, -0.5308F, 0.8377F, -1.2029F));

		PartDefinition cube_r286 = leftHorn.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(26, 26).addBox(-0.1158F, 0.2706F, -2.7615F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(13.0138F, -4.5604F, 5.8992F, -0.1572F, 0.7283F, -0.8614F));

		PartDefinition cube_r287 = leftHorn.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(34, 43).addBox(-0.0905F, 0.0242F, 0.0112F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(10.8538F, -2.6052F, 4.5023F, 0.0907F, 0.4013F, -0.6287F));

		PartDefinition cube_r288 = leftHorn.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 43).addBox(-0.0905F, 0.0242F, 0.0112F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(10.8538F, -2.6052F, 4.5023F, 0.0529F, 0.1421F, -0.6306F));

		PartDefinition cube_r289 = leftHorn.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(36, 5).addBox(0.216F, -0.0796F, -0.9574F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.7538F, -0.7052F, 4.2023F, 0.2611F, -0.2851F, -0.5715F));

		PartDefinition cube_r290 = leftHorn.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(84, 27).addBox(-0.4349F, -0.5612F, -0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.2148F, 0.1591F, 3.4998F, 0.4135F, -0.5695F, -0.4887F));

		PartDefinition cube_r291 = leftHorn.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(84, 33).addBox(-1.8655F, -0.5097F, -0.3258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.2148F, 0.1591F, 3.4998F, 0.5958F, -0.8895F, -0.5791F));

		PartDefinition cube_r292 = leftHorn.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(47, 66).addBox(-0.224F, -0.6424F, -0.231F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2538F, 0.4948F, 0.4023F, -0.0306F, -0.6592F, 0.1945F));

		PartDefinition cube_r293 = leftHorn.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 62).addBox(-1.1F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.2F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftHorn.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(63, 84).addBox(0.2557F, -0.4145F, -0.5838F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.8938F, 0.1971F, -4.6583F, 2.5294F, 1.4795F, -2.8182F));

		PartDefinition cube_r295 = leftHorn.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(90, 94).addBox(1.9636F, -0.4014F, -0.6147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.8938F, 0.1971F, -4.6583F, 2.2748F, 1.385F, -3.0135F));

		PartDefinition cube_r296 = leftHorn.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(84, 49).addBox(-0.3609F, -0.9292F, -0.498F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.8921F, -1.7958F, -6.2581F, -1.6302F, 0.6291F, -0.4199F));

		PartDefinition cube_r297 = leftHorn.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(38, 87).addBox(-1.6664F, -0.9316F, -0.489F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.8921F, -1.7958F, -6.2581F, -1.5904F, 0.229F, -0.3906F));

		PartDefinition cube_r298 = leftHorn.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(86, 65).addBox(-1.6617F, -0.124F, -0.5055F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.8921F, -1.7958F, -6.2581F, -1.6102F, 0.5948F, -0.4106F));

		PartDefinition cube_r299 = leftHorn.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(12, 86).addBox(-0.7747F, -0.2194F, -0.4963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.8921F, -1.7958F, -6.2581F, -1.6632F, 0.9072F, -0.452F));

		PartDefinition cube_r300 = leftHorn.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(42, 94).addBox(1.7481F, 0.3988F, -0.6963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.8938F, 0.1971F, -4.6583F, -1.7441F, 1.1117F, -0.7816F));

		PartDefinition cube_r301 = leftHorn.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(94, 55).addBox(-0.391F, 0.1435F, -0.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(6.3147F, -0.8613F, -7.6509F, -1.601F, 1.0133F, -0.3786F));

		PartDefinition cube_r302 = leftHorn.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5401F, 0.1329F, -0.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.3147F, -0.8613F, -7.6509F, -1.6632F, 1.3968F, -0.444F));

		PartDefinition cube_r303 = leftHorn.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(95, 3).addBox(0.0358F, -0.7556F, -0.5038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(6.3147F, -0.8613F, -7.6509F, -1.5585F, 0.5268F, -0.3809F));

		PartDefinition cube_r304 = leftHorn.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(70, 84).addBox(-1.4812F, -0.8606F, -0.5038F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.3147F, -0.8613F, -7.6509F, -1.5534F, 0.9107F, -0.3733F));

		PartDefinition cube_r305 = leftHorn.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(68, 23).addBox(-0.2273F, -0.401F, -0.6008F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.8938F, 0.1971F, -4.6583F, -1.6546F, 0.4093F, -0.6612F));

		PartDefinition cube_r306 = leftHorn.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 78).addBox(0.2146F, 0.1673F, -0.5814F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.8938F, 0.1971F, -4.6583F, -1.6609F, 0.5484F, -0.6749F));

		PartDefinition cube_r307 = leftHorn.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(68, 20).addBox(-0.0128F, -0.5868F, -0.5779F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.8938F, 0.1971F, -4.6583F, -1.7618F, 1.1544F, -0.8028F));

		PartDefinition cube_r308 = leftHorn.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(5, 86).addBox(3.3928F, 0.7963F, -0.6138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, 1.9873F, 1.3798F, 2.7665F));

		PartDefinition cube_r309 = leftHorn.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(57, 30).addBox(-0.294F, -0.1491F, -0.6237F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, 1.8071F, 1.1264F, 2.505F));

		PartDefinition cube_r310 = leftHorn.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(85, 94).addBox(5.1861F, 0.5391F, -0.4159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, 1.9818F, 1.2829F, 2.8234F));

		PartDefinition cube_r311 = leftHorn.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(75, 94).addBox(1.6332F, 4.7266F, -0.7451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6665F, 0.6615F, -0.845F));

		PartDefinition cube_r312 = leftHorn.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(94, 44).addBox(3.0536F, 3.624F, -0.7451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.721F, 1.0427F, -0.9161F));

		PartDefinition cube_r313 = leftHorn.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(80, 94).addBox(5.115F, 0.9012F, -0.4366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -2.1459F, 1.3855F, -1.3236F));

		PartDefinition cube_r314 = leftHorn.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(54, 94).addBox(4.5645F, 2.9743F, -0.4366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.7643F, 1.0224F, -0.922F));

		PartDefinition cube_r315 = leftHorn.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(86, 36).addBox(2.0731F, 3.8826F, -0.784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.5833F, 0.0203F, -0.8104F));

		PartDefinition cube_r316 = leftHorn.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(84, 59).addBox(2.9332F, 3.021F, -0.6944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6062F, 0.2285F, -0.8149F));

		PartDefinition cube_r317 = leftHorn.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(31, 86).addBox(1.8732F, 2.93F, -0.8057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.5782F, 0.3522F, -0.8128F));

		PartDefinition cube_r318 = leftHorn.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(83, 84).addBox(2.62F, 1.5556F, -0.6944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6129F, 0.6122F, -0.8311F));

		PartDefinition cube_r319 = leftHorn.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(85, 75).addBox(2.1902F, 4.2795F, -0.8233F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6042F, 0.2111F, -0.8144F));

		PartDefinition cube_r320 = leftHorn.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(86, 42).addBox(2.4025F, 3.0008F, -0.8233F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6102F, 0.5948F, -0.8295F));

		PartDefinition cube_r321 = leftHorn.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(24, 86).addBox(3.6759F, 3.5442F, -0.6138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6696F, 0.6787F, -0.8471F));

		PartDefinition cube_r322 = leftHorn.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(86, 39).addBox(3.5046F, 1.7625F, -0.6138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.7285F, 1.0598F, -0.9227F));

		PartDefinition cube_r323 = leftHorn.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(59, 62).addBox(0.2921F, 1.8988F, -0.6138F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.6609F, 0.5484F, -0.832F));

		PartDefinition cube_r324 = leftHorn.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(50, 62).addBox(1.8276F, 0.9479F, -0.6138F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, -1.7618F, 1.1544F, -0.9599F));

		PartDefinition cube_r325 = leftHorn.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(68, 57).addBox(-0.0437F, -0.5408F, -0.6237F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -3.1623F, 1.8819F, 1.2357F, 2.5857F));

		PartDefinition cube_r326 = leftHorn.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(68, 30).addBox(-0.1964F, -0.1657F, 0.0308F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8391F, -0.78F, -0.5623F, -2.6614F, 1.3064F, -2.0932F));

		PartDefinition cube_r327 = leftHorn.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(45, 53).addBox(-0.8071F, -0.4341F, -2.9455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.1576F, 0.6955F, -2.3197F, -0.2888F, -0.4179F, 0.0428F));

		PartDefinition cube_r328 = leftHorn.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(54, 41).addBox(-0.8071F, -0.4341F, -2.5455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9051F, 0.1227F, -0.4777F, 0.2169F, -0.6092F, 0.0613F));

		PartDefinition cube_r329 = leftHorn.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(68, 60).addBox(-0.2071F, -0.5341F, -0.3455F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5538F, -0.2052F, -0.3977F, -0.0058F, -0.3097F, 0.2401F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0665F, -1.7566F, -1.3789F, 0.0511F, -0.0068F, 0.8018F));

		PartDefinition cube_r330 = rightHorn.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-1.4714F, -0.2081F, 0.0032F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2308F, -5.9743F, 5.164F, -0.2883F, 0.6234F, 0.6265F));

		PartDefinition cube_r331 = rightHorn.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-3.3679F, -0.1681F, -1.6565F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-16.8322F, -6.5674F, 8.8371F, 1.3857F, 1.4734F, 2.2967F));

		PartDefinition cube_r332 = rightHorn.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-4.8004F, -0.3034F, -0.3475F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-15.2308F, -5.9743F, 5.164F, -0.3561F, 0.8471F, 0.5261F));

		PartDefinition cube_r333 = rightHorn.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(43, 9).mirror().addBox(-5.1151F, -0.1482F, -1.2823F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-16.8322F, -6.5674F, 8.8371F, 0.5823F, 1.406F, 1.4827F));

		PartDefinition cube_r334 = rightHorn.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-0.3685F, -0.1482F, 0.3527F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-16.8322F, -6.5674F, 8.8371F, 0.1761F, -1.03F, 0.7553F));

		PartDefinition cube_r335 = rightHorn.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(56, 11).mirror().addBox(-4.8127F, -0.312F, -0.5325F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2308F, -5.9743F, 5.164F, -0.4454F, 0.9906F, 0.4128F));

		PartDefinition cube_r336 = rightHorn.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(67, 17).mirror().addBox(-5.8923F, -0.3034F, 0.9436F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2308F, -5.9743F, 5.164F, -0.2478F, 0.3455F, 0.7124F));

		PartDefinition cube_r337 = rightHorn.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(67, 14).mirror().addBox(-3.7904F, -0.3034F, -0.6872F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2308F, -5.9743F, 5.164F, -0.3369F, 0.7979F, 0.5522F));

		PartDefinition cube_r338 = rightHorn.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(5, 63).mirror().addBox(-1.4707F, -0.2081F, -0.5058F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2308F, -5.9743F, 5.164F, -0.2883F, 0.6234F, 0.6265F));

		PartDefinition cube_r339 = rightHorn.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(-2.6F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-17.5385F, -9.4076F, 2.4334F, -0.7062F, 0.8065F, 0.3143F));

		PartDefinition cube_r340 = rightHorn.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-16.6293F, -8.3526F, 2.4148F, -0.4731F, 0.1697F, 0.78F));

		PartDefinition cube_r341 = rightHorn.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-2.0F, -0.5F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-16.2043F, -8.4965F, 1.585F, -0.4964F, 0.3397F, 0.6877F));

		PartDefinition cube_r342 = rightHorn.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-6.1489F, 1.4734F, -7.0338F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-10.8538F, -2.6052F, 4.5023F, -0.5014F, 0.2673F, 0.728F));

		PartDefinition cube_r343 = rightHorn.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(48, 84).mirror().addBox(-4.5824F, -0.2201F, 0.2248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.4764F, -0.53F, 1.1485F));

		PartDefinition cube_r344 = rightHorn.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-5.7189F, -0.2201F, -2.7205F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.449F, 0.4238F, 0.6977F));

		PartDefinition cube_r345 = rightHorn.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-3.26F, -0.2428F, -0.7216F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.4169F, -0.2145F, 0.9872F));

		PartDefinition cube_r346 = rightHorn.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(-3.1854F, -0.2428F, -1.4533F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.4071F, -0.0385F, 0.9098F));

		PartDefinition cube_r347 = rightHorn.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(49, 5).mirror().addBox(-6.9827F, -1.5849F, -2.4087F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.0911F, -0.514F, 0.7889F));

		PartDefinition cube_r348 = rightHorn.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(84, 18).mirror().addBox(-2.4046F, -1.5849F, -3.603F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.0795F, -0.0792F, 0.7503F));

		PartDefinition cube_r349 = rightHorn.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(0.6177F, -0.2602F, -3.6417F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.4097F, 0.3017F, 0.6325F));

		PartDefinition cube_r350 = rightHorn.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-2.2593F, -1.4389F, -8.7034F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.0625F, -0.243F, 0.637F));

		PartDefinition cube_r351 = rightHorn.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(27, 52).mirror().addBox(-0.5789F, -1.4389F, -6.5774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.0607F, 0.0357F, 0.6197F));

		PartDefinition cube_r352 = rightHorn.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.3755F, -1.4389F, 4.1686F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.237F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -3.0741F, -0.4537F, -2.5493F));

		PartDefinition cube_r353 = rightHorn.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(0.211F, -1.4389F, -6.5388F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.0614F, 0.1576F, 0.6123F));

		PartDefinition cube_r354 = rightHorn.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.4478F, -0.2602F, -3.9418F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -0.3903F, 0.0281F, 0.7493F));

		PartDefinition cube_r355 = rightHorn.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(66, 35).mirror().addBox(-6.8187F, -1.404F, -0.7666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -2.6977F, -1.4192F, -2.9301F));

		PartDefinition cube_r356 = rightHorn.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(60, 5).mirror().addBox(-6.0303F, -1.404F, -0.1621F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-15.2388F, -8.8527F, -0.7043F, -2.9758F, -1.1669F, -2.6433F));

		PartDefinition cube_r357 = rightHorn.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-2.6F, -0.6F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.9026F, -1.0349F, 8.205F, 1.5599F, 0.8881F, 1.6503F));

		PartDefinition cube_r358 = rightHorn.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(67, 11).mirror().addBox(-2.9F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.9005F, -0.8375F, 5.3834F, 1.5381F, 1.3593F, 1.6267F));

		PartDefinition cube_r359 = rightHorn.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(-2.2951F, -0.5612F, -0.3649F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.2148F, 0.1591F, 3.4998F, 0.623F, 0.952F, 0.7859F));

		PartDefinition cube_r360 = rightHorn.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-6.1144F, 0.5718F, 1.136F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-10.8538F, -2.6052F, 4.5023F, -0.5308F, -0.8377F, 1.2029F));

		PartDefinition cube_r361 = rightHorn.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(-2.8842F, 0.2706F, -2.7615F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-13.0138F, -4.5604F, 5.8992F, -0.1572F, -0.7283F, 0.8614F));

		PartDefinition cube_r362 = rightHorn.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(34, 43).mirror().addBox(-2.9095F, 0.0242F, 0.0112F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-10.8538F, -2.6052F, 4.5023F, 0.0907F, -0.4013F, 0.6287F));

		PartDefinition cube_r363 = rightHorn.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-2.9095F, 0.0242F, 0.0112F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-10.8538F, -2.6052F, 4.5023F, 0.0529F, -0.1421F, 0.6306F));

		PartDefinition cube_r364 = rightHorn.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-4.216F, -0.0796F, -0.9574F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.7538F, -0.7052F, 4.2023F, 0.2611F, 0.2851F, 0.5715F));

		PartDefinition cube_r365 = rightHorn.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(84, 27).mirror().addBox(-1.5651F, -0.5612F, -0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.2148F, 0.1591F, 3.4998F, 0.4135F, 0.5695F, 0.4887F));

		PartDefinition cube_r366 = rightHorn.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-0.1345F, -0.5097F, -0.3258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.2148F, 0.1591F, 3.4998F, 0.5958F, 0.8895F, 0.5791F));

		PartDefinition cube_r367 = rightHorn.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(47, 66).mirror().addBox(-2.776F, -0.6424F, -0.231F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2538F, 0.4948F, 0.4023F, -0.0306F, 0.6592F, -0.1945F));

		PartDefinition cube_r368 = rightHorn.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.9F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.2F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightHorn.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-2.2557F, -0.4145F, -0.5838F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.8938F, 0.1971F, -4.6583F, 2.5294F, -1.4795F, 2.8182F));

		PartDefinition cube_r370 = rightHorn.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 94).mirror().addBox(-2.9636F, -0.4014F, -0.6147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8938F, 0.1971F, -4.6583F, 2.2748F, -1.385F, 3.0135F));

		PartDefinition cube_r371 = rightHorn.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(84, 49).mirror().addBox(-1.6391F, -0.9292F, -0.498F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.8921F, -1.7958F, -6.2581F, -1.6302F, -0.6291F, 0.4199F));

		PartDefinition cube_r372 = rightHorn.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(-0.3336F, -0.9316F, -0.489F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.8921F, -1.7958F, -6.2581F, -1.5904F, -0.229F, 0.3906F));

		PartDefinition cube_r373 = rightHorn.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(86, 65).mirror().addBox(-0.3383F, -0.124F, -0.5055F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.8921F, -1.7958F, -6.2581F, -1.6102F, -0.5948F, 0.4106F));

		PartDefinition cube_r374 = rightHorn.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(-1.2253F, -0.2194F, -0.4963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.8921F, -1.7958F, -6.2581F, -1.6632F, -0.9072F, 0.452F));

		PartDefinition cube_r375 = rightHorn.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-2.7481F, 0.3988F, -0.6963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8938F, 0.1971F, -4.6583F, -1.7441F, -1.1117F, 0.7816F));

		PartDefinition cube_r376 = rightHorn.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(94, 55).mirror().addBox(-0.609F, 0.1435F, -0.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-6.3147F, -0.8613F, -7.6509F, -1.601F, -1.0133F, 0.3786F));

		PartDefinition cube_r377 = rightHorn.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.4599F, 0.1329F, -0.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.3147F, -0.8613F, -7.6509F, -1.6632F, -1.3968F, 0.444F));

		PartDefinition cube_r378 = rightHorn.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-1.0358F, -0.7556F, -0.5038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-6.3147F, -0.8613F, -7.6509F, -1.5585F, -0.5268F, 0.3809F));

		PartDefinition cube_r379 = rightHorn.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-0.5188F, -0.8606F, -0.5038F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.3147F, -0.8613F, -7.6509F, -1.5534F, -0.9107F, 0.3733F));

		PartDefinition cube_r380 = rightHorn.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(68, 23).mirror().addBox(-2.7727F, -0.401F, -0.6008F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.8938F, 0.1971F, -4.6583F, -1.6546F, -0.4093F, 0.6612F));

		PartDefinition cube_r381 = rightHorn.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-2.2146F, 0.1673F, -0.5814F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.8938F, 0.1971F, -4.6583F, -1.6609F, -0.5484F, 0.6749F));

		PartDefinition cube_r382 = rightHorn.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(68, 20).mirror().addBox(-2.9872F, -0.5868F, -0.5779F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.8938F, 0.1971F, -4.6583F, -1.7618F, -1.1544F, 0.8028F));

		PartDefinition cube_r383 = rightHorn.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-5.2967F, -1.2375F, -0.355F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, 2.5468F, -1.4274F, 3.024F));

		PartDefinition cube_r384 = rightHorn.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-7.7557F, -0.107F, 0.0951F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -2.665F, -1.3706F, 1.8159F));

		PartDefinition cube_r385 = rightHorn.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(86, 42).mirror().addBox(-4.5712F, 5.7319F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -1.6388F, -0.1754F, 0.8003F));

		PartDefinition cube_r386 = rightHorn.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(24, 86).mirror().addBox(-9.0125F, 3.7796F, -0.3488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -1.7447F, -0.7438F, 0.884F));

		PartDefinition cube_r387 = rightHorn.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-8.6864F, 0.7308F, -0.3488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -1.8662F, -1.1182F, 1.0328F));

		PartDefinition cube_r388 = rightHorn.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(-7.1056F, 0.971F, -0.426F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -1.8287F, -1.0593F, 0.9988F));

		PartDefinition cube_r389 = rightHorn.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-4.6239F, -0.8517F, -0.4034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -2.4018F, -1.4195F, 1.6812F));

		PartDefinition cube_r390 = rightHorn.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-2.8934F, -0.1231F, 0.042F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8648F, -0.8007F, -0.4679F, -2.1387F, -1.1494F, 1.5692F));

		PartDefinition cube_r391 = rightHorn.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(45, 53).mirror().addBox(-0.1929F, -0.4341F, -2.9455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.1576F, 0.6955F, -2.3197F, -0.2888F, 0.4179F, -0.0428F));

		PartDefinition cube_r392 = rightHorn.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(54, 41).mirror().addBox(-0.1929F, -0.4341F, -2.5455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9051F, 0.1227F, -0.4777F, 0.2169F, 0.6092F, -0.0613F));

		PartDefinition cube_r393 = rightHorn.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-2.7929F, -0.5341F, -0.3455F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5538F, -0.2052F, -0.3977F, -0.0058F, 0.3097F, -0.2401F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.5361F, -8.5987F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(93, 35).addBox(-0.179F, -0.5F, -1.3198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.5F, 0.5329F, 0.3038F, 0.1747F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(21, 74).addBox(-0.4359F, -0.5F, -0.0701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.0F, -0.4576F, 1.0627F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(91, 49).addBox(-0.4359F, -0.2F, 0.0799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(46, 91).addBox(-0.4359F, -0.2F, -0.1701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.0F, -2.1171F, 1.5383F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 73).addBox(-0.4359F, -0.5F, -0.0701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2145F)), PartPose.offsetAndRotation(0.0F, -0.4576F, 1.0627F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(18, 55).addBox(-0.4359F, -0.5F, -0.9701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.5F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 79).addBox(-0.2705F, -0.3504F, -0.3459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9963F, -4.3131F, 7.3715F, -0.3036F, -0.6835F, 0.2825F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(77, 34).addBox(-0.4987F, -0.4182F, -1.7246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.6521F, 6.257F, 0.4719F, 0.0424F, 0.0308F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(7, 79).addBox(0.1802F, -0.5687F, -0.5841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7137F, -3.7192F, 6.393F, 0.4101F, -0.2719F, 0.0644F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(77, 50).addBox(-0.5F, -0.4233F, -1.6412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.6521F, 6.257F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(9, 54).addBox(-0.4F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0105F, -2.9073F, 4.0175F, 0.7407F, 0.6389F, 0.2967F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(77, 30).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.005F, -2.7042F, 4.8928F, 1.0373F, 0.4118F, 0.6001F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(76, 4).addBox(-0.6106F, -0.466F, -1.3504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3354F, -2.9876F, 4.8743F, 0.9151F, 0.4118F, 0.6001F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(32, 58).addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5538F, -4.7388F, 4.6295F, -2.2949F, 0.4382F, 0.0683F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(93, 38).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5641F, -3.85F, 4.9495F, 0.5861F, 0.1753F, 0.1153F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(83, 81).addBox(-2.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5629F, -4.7052F, 5.175F, -2.8883F, 0.4382F, 0.0683F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(83, 8).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 5).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6744F, -4.6153F, 4.946F, -2.8883F, 0.4382F, 0.0683F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(57, 48).addBox(-0.8629F, 0.6224F, -1.8848F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7137F, -3.7192F, 6.393F, -2.3739F, -0.0167F, -0.1834F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(57, 35).addBox(-1.5839F, -0.5764F, -1.6625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.641F, -4.7324F, 5.1548F, -2.6001F, -0.3546F, -0.4771F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(77, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4921F, -4.0054F, 5.4654F, 1.8045F, 0.1978F, 0.0632F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.5361F, -8.5987F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-0.821F, -0.5F, -1.3198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 1.5F, 0.5329F, -0.3038F, -0.1747F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(21, 74).mirror().addBox(-0.5641F, -0.5F, -0.0701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4576F, 1.0627F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-0.5641F, -0.2F, 0.0799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(46, 91).mirror().addBox(-0.5641F, -0.2F, -0.1701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1171F, 1.5383F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(-0.5641F, -0.5F, -0.0701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2145F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4576F, 1.0627F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-0.5641F, -0.5F, -0.9701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 1.5F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.7295F, -0.3504F, -0.3459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9963F, -4.3131F, 7.3715F, -0.3036F, 0.6835F, -0.2825F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.5013F, -0.4182F, -1.7246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.6521F, 6.257F, 0.4719F, -0.0424F, -0.0308F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-1.1802F, -0.5687F, -0.5841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7137F, -3.7192F, 6.393F, 0.4101F, 0.2719F, -0.0644F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.5F, -0.4233F, -1.6412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.6521F, 6.257F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(9, 54).mirror().addBox(-0.6F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0105F, -2.9073F, 4.0175F, 0.7407F, -0.6389F, -0.2967F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.005F, -2.7042F, 4.8928F, 1.0373F, -0.4118F, -0.6001F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-0.3894F, -0.466F, -1.3504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3354F, -2.9876F, 4.8743F, 0.9151F, -0.4118F, -0.6001F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5538F, -4.7388F, 4.6295F, -2.2949F, -0.4382F, -0.0683F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5641F, -3.85F, 4.9495F, 0.5861F, -0.1753F, -0.1153F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(83, 81).mirror().addBox(0.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5629F, -4.7052F, 5.175F, -2.8883F, -0.4382F, -0.0683F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 5).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6744F, -4.6153F, 4.946F, -2.8883F, -0.4382F, -0.0683F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-1.1371F, 0.6224F, -1.8848F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7137F, -3.7192F, 6.393F, -2.3739F, 0.0167F, 0.1834F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(57, 35).mirror().addBox(-0.4161F, -0.5764F, -1.6625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.641F, -4.7324F, 5.1548F, -2.6001F, 0.3546F, 0.4771F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4921F, -4.0054F, 5.4654F, 1.8045F, -0.1978F, -0.0632F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4917F, -1.5909F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-0.35F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(91, 19).mirror().addBox(-0.35F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5575F, 3.8512F, -4.2645F, -1.4871F, -0.0914F, -0.0856F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(92, 77).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3738F, 4.1009F, -5.5517F, -1.5241F, -0.2652F, -0.0884F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-0.6856F, 0.5812F, 4.9977F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, -2.329F, -3.1353F, -1.2965F, -0.083F, -0.1083F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(-0.5175F, 1.129F, 4.5411F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, -2.329F, -3.1353F, -0.982F, -0.0415F, -0.0696F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.2393F, -1.7891F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.671F, -3.1353F, -0.982F, -0.0415F, -0.0696F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(32, 94).mirror().addBox(-0.35F, 0.0118F, -0.7861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(70, 93).mirror().addBox(-0.35F, 0.5142F, -0.2282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(-0.35F, -0.0061F, -1.0043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.2628F, 0.3655F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.5442F, -0.9451F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.0987F, 0.4793F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(77, 86).mirror().addBox(-0.2393F, -0.0642F, -1.0175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9974F, 3.9104F, -1.9059F, -1.331F, -0.0463F, -0.0666F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.35F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 94).mirror().addBox(-0.35F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(22, 91).mirror().addBox(-0.35F, -0.0757F, -0.9414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 0.4767F, 0.2431F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(10, 91).addBox(-0.65F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 19).addBox(-0.65F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(92, 52).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5575F, 3.8512F, -4.2645F, -1.4871F, 0.0914F, 0.0856F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(15, 93).addBox(-0.5F, -0.3878F, -0.8473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.8962F, -6.2895F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(27, 93).addBox(-0.5F, -0.8645F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.8962F, -6.2895F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(92, 77).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3738F, 4.1009F, -5.5517F, -1.5241F, 0.2652F, 0.0884F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(95, 67).addBox(0.6856F, 0.5812F, 4.9977F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, -2.329F, -3.1353F, -1.2965F, 0.083F, 0.1083F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(21, 71).addBox(0.5175F, 1.129F, 4.5411F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, -2.329F, -3.1353F, -0.982F, 0.0415F, 0.0696F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(93, 0).addBox(-0.7607F, -1.7891F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.671F, -3.1353F, -0.982F, 0.0415F, 0.0696F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(32, 94).addBox(-0.65F, 0.0118F, -0.7861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(70, 93).addBox(-0.65F, 0.5142F, -0.2282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(93, 41).addBox(-0.65F, -0.0061F, -1.0043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.55F, 1.2628F, 0.3655F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(93, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4F, 2.5442F, -0.9451F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3F, 3.0987F, 0.4793F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(77, 86).addBox(-0.7607F, -0.0642F, -1.0175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9974F, 3.9104F, -1.9059F, -1.331F, 0.0463F, 0.0666F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(65, 93).addBox(-0.65F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 94).addBox(-0.65F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(22, 91).addBox(-0.65F, -0.0757F, -0.9414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.55F, 0.4767F, 0.2431F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2262F, 2.7023F, -0.721F, -0.2364F, -0.3195F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(70, 26).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.5411F, 0.0F, 0.0F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(48, 36).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9804F, 4.529F, -0.8949F, 0.2838F, -0.336F));

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