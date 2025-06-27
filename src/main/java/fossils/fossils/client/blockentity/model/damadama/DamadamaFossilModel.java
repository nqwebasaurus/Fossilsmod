package fossils.fossils.client.blockentity.model.damadama;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DamadamaFossilModel extends SkullModelBase {
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

	public DamadamaFossilModel(ModelPart root) {
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -29.9546F, 12.7623F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 24).addBox(0.0F, -0.4F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 83).addBox(0.0F, -1.0201F, -1.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(-0.2904F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.7426F, -0.2171F, -0.561F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 25).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.2371F, -0.3589F, -0.5993F, 0.1007F, -0.6811F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.2371F, -0.3589F, 0.0572F, -0.1406F, -0.3173F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 66).mirror().addBox(-1.1156F, -0.1514F, -0.5086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -1.7719F, -0.2709F, -0.8218F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(-1.0245F, -0.9821F, 0.2594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -0.4508F, -0.5068F, -0.379F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 74).mirror().addBox(-1.9165F, -2.0114F, -0.8215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -2.1321F, -0.168F, -1.3954F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 30).mirror().addBox(-1.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -0.518F, -0.2903F, -1.1684F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 82).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2553F, 3.2518F, 4.067F, -0.7856F, -0.1966F, -0.7868F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.2904F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.6228F, -0.2103F, -0.3213F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-0.3837F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.0966F, 0.0684F, -0.5622F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-0.3837F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -1.0566F, 0.0684F, -0.5622F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(-0.3837F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.4021F, 0.0684F, -0.5622F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8295F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 66).addBox(0.1156F, -0.1514F, -0.5086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -1.7719F, 0.2709F, 0.8218F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(54, 65).addBox(0.0245F, -0.9821F, 0.2594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -0.4508F, 0.5068F, 0.379F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 74).addBox(0.9165F, -2.0114F, -0.8215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -2.1321F, 0.168F, 1.3954F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(43, 30).addBox(0.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -0.518F, 0.2903F, 1.1684F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(79, 82).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2553F, 3.2518F, 4.067F, -0.7856F, 0.1966F, 0.7868F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 25).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.2371F, -0.3589F, -0.5993F, -0.1007F, 0.6811F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 12).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.2371F, -0.3589F, 0.0572F, 0.1406F, 0.3173F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 47).addBox(-0.7096F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.7426F, 0.2171F, 0.561F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(44, 52).addBox(-0.7096F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.6228F, 0.2103F, 0.3213F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(88, 34).addBox(-0.6163F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.0966F, -0.0684F, 0.5622F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 23).addBox(-0.6163F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -1.0566F, -0.0684F, 0.5622F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(74, 82).addBox(-0.6163F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.4021F, -0.0684F, 0.5622F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 68).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(84, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8295F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.3878F, 1.1265F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(64, 57).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 69).addBox(-1.0F, -0.6047F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 78).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(27, 78).addBox(-1.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 78).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(58, 8).addBox(-1.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 46).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 70).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 18).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(74, 18).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 54).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(11, 46).addBox(-1.9F, -1.0479F, -0.9979F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(57, 85).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2281F, -0.6452F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(47, 77).addBox(-1.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(23, 42).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(53, 52).addBox(-0.6F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.214F, -0.5463F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 70).addBox(6.6299F, -0.5F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r49 = leftLeg4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(70, 32).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, 0.2142F, -5.3932F));

		PartDefinition cube_r50 = leftLeg5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 75).addBox(8.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r51 = leftLeg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 74).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r52 = leftLeg5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(75, 75).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r53 = leftLeg5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(75, 66).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.3878F, 1.1265F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 62).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(21, 70).addBox(-1.0F, -0.6047F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(78, 54).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(78, 49).addBox(0.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(52, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(78, 46).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(62, 50).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 46).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(82, 21).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 4).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 29).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(16, 46).addBox(0.9F, -1.0479F, -0.9979F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 86).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2281F, -0.6452F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(39, 42).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(54, 24).addBox(-0.4F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 9.214F, -0.5463F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(71, 54).addBox(-7.6299F, -0.5F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r71 = rightLeg4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(71, 50).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2142F, -5.3932F));

		PartDefinition cube_r72 = rightLeg5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 75).addBox(-9.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r73 = rightLeg5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 71).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r74 = rightLeg5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r75 = rightLeg5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(68, 75).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(18, 90).addBox(0.0F, -1.1751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(67, 21).addBox(0.0F, -0.9577F, -1.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.044F, 0.0809F, -0.7587F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(83, 61).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0635F, 0.0668F, -1.0208F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(58, 4).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0871F, 0.03F, -1.5F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(89, 85).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 79).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(89, 85).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 79).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(11, 79).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(83, 8).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.044F, -0.0809F, 0.7587F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(83, 61).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0635F, -0.0668F, 1.0208F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(58, 4).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0871F, -0.03F, 1.5F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(90, 44).addBox(-0.5753F, -0.9995F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(89, 89).addBox(-0.4485F, -1.2943F, -0.4457F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.4806F, -7.4243F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8926F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.0527F, 0.1564F, -0.66F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.0101F, 0.1647F, -0.9251F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(45, 8).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0677F, 0.1506F, -1.411F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(21, 87).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.0344F, 0.1516F, -0.6108F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0063F, 0.1553F, -0.8758F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-9.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0777F, 0.1347F, -1.3605F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 79).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.0634F, 0.1715F, -0.6062F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(13, 32).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, -0.0703F, 0.1689F, -1.3594F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 86).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.0164F, 0.1821F, -0.8719F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(83, 6).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.0527F, -0.1564F, 0.66F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(83, 39).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.0101F, -0.1647F, 0.9251F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 8).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0677F, -0.1506F, 1.411F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(21, 87).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.0344F, -0.1516F, 0.6108F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(35, 87).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0063F, -0.1553F, 0.8758F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(36, 2).addBox(3.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0777F, -0.1347F, 1.3605F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(85, 79).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.0634F, -0.1715F, 0.6062F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(13, 32).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, -0.0703F, -0.1689F, 1.3594F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(77, 86).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.0164F, -0.1821F, 0.8719F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(17, 17).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 81).addBox(0.0F, -1.1938F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(15, 90).addBox(0.0F, -1.3938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(6, 90).addBox(0.0F, -1.5698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, 0.0961F, -0.0434F, -0.0042F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -2.4966F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4078F, -2.0187F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(13, 26).addBox(0.0F, -3.5854F, -0.9869F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(5, 76).addBox(0.0F, -4.6854F, 0.0131F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8812F, -5.6454F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(8, 79).addBox(0.0F, -5.016F, 0.0852F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7402F, -7.5587F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-0.5F, -0.9723F, -2.0248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 2.9573F, -5.2178F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-0.5F, -0.0598F, 0.046F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(64, 37).addBox(5.3F, -0.0598F, 0.046F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 1.3139F, -8.128F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.4727F, -0.1425F, -0.4341F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.2927F, -0.6396F, -2.6792F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-0.4727F, -0.1425F, -0.4341F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.1053F, -0.3887F, -2.9786F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(-0.2641F, -0.0723F, -0.3563F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.8667F, -0.261F, -0.1636F, -0.1234F, -2.8349F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(45, 10).mirror().addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 10.2402F, -1.8168F, -0.1779F, -0.146F, -2.7596F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.2643F, 0.3192F, -0.8888F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(83, 2).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.1711F, 0.3761F, -1.1608F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-6.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, -0.0318F, 0.4104F, -1.68F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.191F, 0.2673F, -0.718F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.1141F, 0.3073F, -0.9879F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(55, 44).mirror().addBox(-7.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, -0.0458F, 0.3241F, -1.4931F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-0.7F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.169F, 3.4516F, -7.0374F, 0.97F, 0.3989F, -0.1601F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(34, 5).mirror().addBox(-0.5F, -1.9624F, 3.4135F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 84).mirror().addBox(-0.5F, -0.5687F, 5.576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(52, 84).addBox(5.3F, -0.5687F, 5.576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 5.0215F, -7.937F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.5F, -0.0987F, -0.8856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(30, 84).addBox(5.3F, -0.0987F, -0.8856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, -0.9002F, -6.7009F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(28, 88).mirror().addBox(-0.5F, -0.0628F, -0.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(28, 88).addBox(5.3F, -0.0628F, -0.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, -0.6262F, -7.5446F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-0.5F, 0.1819F, 3.5516F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(63, 32).addBox(5.3F, 0.1819F, 3.5516F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(34, 36).mirror().addBox(-0.5F, -1.0487F, -0.2864F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(34, 36).addBox(5.3F, -1.0487F, -0.2864F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 36).mirror().addBox(-0.5F, -0.6733F, -0.1323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 36).addBox(5.3F, -0.6733F, -0.1323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(28, 53).mirror().addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.8839F, -5.8869F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-0.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4753F, 10.2955F, -6.3735F, -0.0179F, 0.0628F, -2.7221F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0641F, 0.2032F, -1.3058F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(21, 54).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0384F, 0.2095F, -0.8153F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0919F, 0.1923F, -0.5487F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(45, 6).mirror().addBox(-8.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0615F, 0.2205F, -1.3402F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.049F, 0.2235F, -0.8479F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(11, 83).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1059F, 0.2032F, -0.5808F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.1059F, 0.2032F, -0.6681F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.049F, 0.2235F, -0.9352F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-0.6F, 0.0F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4373F, 10.3609F, -2.6322F, 0.1109F, 0.0656F, -2.8672F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-0.1F, 0.0F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4925F, 10.3519F, -3.6539F, -0.108F, 0.0328F, -2.8068F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(45, 4).mirror().addBox(-8.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0615F, 0.2205F, -1.4275F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(30, 30).addBox(-0.3F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.169F, 3.4516F, -7.0374F, 0.97F, -0.3989F, 0.1601F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(34, 5).addBox(-0.5F, -1.9624F, 3.4135F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9F, 6.8215F, -7.937F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 26).addBox(-1.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4753F, 10.2955F, -6.3735F, -0.0179F, -0.0628F, 2.7221F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(32, 22).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0641F, -0.2032F, 1.3058F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(21, 54).addBox(2.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0384F, -0.2095F, 0.8153F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(23, 34).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0919F, -0.1923F, 0.5487F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(45, 6).addBox(3.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0615F, -0.2205F, 1.3402F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 4).addBox(2.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.049F, -0.2235F, 0.8479F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(11, 83).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1059F, -0.2032F, 0.5808F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(67, 8).addBox(3.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, -0.0318F, -0.4104F, 1.68F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(83, 2).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.1711F, -0.3761F, 1.1608F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(82, 68).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.2643F, -0.3192F, 0.8888F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 44).addBox(3.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, -0.0458F, -0.3241F, 1.4931F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(83, 0).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.1141F, -0.3073F, 0.9879F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(82, 24).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.191F, -0.2673F, 0.718F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(67, 10).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.1059F, -0.2032F, 0.6681F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(82, 77).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.049F, -0.2235F, 0.9352F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(36, 0).addBox(-5.5273F, -0.1425F, -0.4341F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.2927F, 0.6396F, 2.6792F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(45, 19).addBox(-4.5273F, -0.1425F, -0.4341F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.1053F, 0.3887F, 2.9786F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(45, 17).addBox(-4.7359F, -0.0723F, -0.3563F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.8667F, -0.261F, -0.1636F, 0.1234F, 2.8349F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(45, 10).addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 10.2402F, -1.8168F, -0.1779F, 0.146F, 2.7596F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(58, 6).addBox(-3.4F, 0.0F, -0.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4373F, 10.3609F, -2.6322F, 0.1109F, -0.0656F, 2.8672F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(65, 15).addBox(-2.9F, 0.0F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4925F, 10.3519F, -3.6539F, -0.108F, -0.0328F, 2.8068F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 4).addBox(3.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0615F, -0.2205F, 1.4275F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(45, 24).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 21).addBox(-0.5F, -0.9723F, -2.0248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9F, 2.9573F, -5.2178F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 53).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9F, 1.8839F, -5.8869F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(51, 0).addBox(-1.6328F, 1.9558F, -6.19F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 38).addBox(-1.1328F, -0.9549F, 0.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9219F, -2.4363F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(17, 25).addBox(-1.1328F, -0.9549F, -5.0595F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.1855F, -6.9515F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 7.9941F, -8.0663F, 0.6761F, 0.1226F, -0.0132F));

		PartDefinition cube_r183 = leftarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(71, 58).addBox(-0.0018F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 1.4398F, 0.0014F, -0.001F));

		PartDefinition cube_r184 = leftarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(11, 85).addBox(0.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.1535F, 0.4938F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r185 = leftarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(55, 69).addBox(0.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(48, 66).addBox(0.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(87, 63).addBox(0.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.3217F, 2.4213F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(57, 89).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.8729F, -0.2661F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 70).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.9713F, -0.6163F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r190 = leftarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(81, 13).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r191 = leftarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(69, 82).addBox(-0.018F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r192 = leftarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 82).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r193 = leftarm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(88, 10).addBox(0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.8515F, 0.9635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r194 = leftarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(77, 26).addBox(-1.9973F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.1856F, 0.9517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(13, 34).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.0123F, 0.575F, 0.8727F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0963F, 0.3452F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftArm4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r196 = leftArm4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(14, 68).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r197 = leftArm4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(61, 67).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r198 = leftArm4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r199 = leftArm4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(83, 35).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r200 = leftArm4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(37, 83).addBox(5.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8233F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 7.9941F, -8.0663F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(19, 74).addBox(-0.9982F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 1.4398F, -0.0014F, 0.001F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(47, 85).addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5119F, -0.1535F, 0.4938F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r203 = rightarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r204 = rightarm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(87, 41).addBox(-1.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightarm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(87, 73).addBox(-1.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.3217F, 2.4213F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(89, 66).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 0.8729F, -0.2661F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(71, 36).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.9713F, -0.6163F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(20, 81).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(82, 73).addBox(-0.982F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r210 = rightarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(82, 64).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r211 = rightarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(88, 17).addBox(-1.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -0.8515F, 0.9635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r212 = rightarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(77, 32).addBox(-0.0027F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.1856F, 0.9517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(18, 34).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.0123F, 0.575F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0963F, 0.3452F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(69, 4).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r214 = rightArm4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(68, 67).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r215 = rightArm4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r216 = rightArm4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(67, 17).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r217 = rightArm4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(83, 57).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r218 = rightArm4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(83, 53).addBox(-6.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8233F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -8.9F, 0.9161F, -0.2628F, -0.1289F));

		PartDefinition cube_r219 = neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(90, 4).addBox(0.1849F, -4.2167F, -0.9081F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1899F, -1.0033F, -0.2355F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(33, 89).addBox(0.1899F, -2.3642F, -0.3862F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1899F, -1.0033F, -0.2355F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(3, 90).addBox(0.0F, -2.1F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(28, 42).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, 0.3026F, -0.1795F, -0.0107F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(90, 37).addBox(0.0F, -1.1681F, 1.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 76).addBox(0.0F, -1.1681F, -0.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.4303F, -0.3566F, 0.2878F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(78, 59).addBox(0.0F, -0.8F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2928F, -1.1967F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r225 = neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(32, 79).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9365F, -2.1677F, 1.1493F, -0.0349F, 0.248F));

		PartDefinition cube_r226 = neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(52, 79).mirror().addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r227 = neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(52, 79).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5494F, 0.0474F, -1.3916F, -0.0479F, -0.0799F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(76, 39).addBox(-1.0F, -0.5982F, -0.1143F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(55, 57).addBox(-1.0F, -0.9982F, -0.1143F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.0776F, -3.1664F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 70).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.5515F, -2.9272F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(45, 62).addBox(-1.0F, -2.1F, 3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 55).addBox(-1.0F, -3.7F, 3.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8811F, -8.7344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 62).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.7585F, -4.0122F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(56, 12).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.0941F, -7.78F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(45, 82).addBox(-1.0F, 0.0735F, -1.6076F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 56).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.2811F, -8.7344F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 42).addBox(-1.0F, -0.9437F, -0.9907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.1502F, -6.8709F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(78, 79).addBox(-1.0F, -0.9437F, 0.1093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1918F, -7.0665F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(64, 79).addBox(-1.0F, 0.1563F, -0.7907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -7.5F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(55, 39).addBox(-1.0F, -0.0115F, -1.9021F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.308F, -5.982F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(54, 34).addBox(-1.0F, -0.0115F, -1.9021F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.2F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 0.6F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -1.2871F, -1.218F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(9, 61).addBox(-2.5F, -0.0454F, -0.0657F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.9491F, -2.3688F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(44, 42).addBox(-2.5F, -0.0454F, -1.9657F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.9491F, -2.3688F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(27, 58).addBox(-1.5F, -0.0454F, -2.9657F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.5F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(60, 71).addBox(-0.5F, -1.5019F, -0.598F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.3F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(71, 79).addBox(-1.0F, 0.0079F, -0.1229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.003F, -0.5688F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(79, 29).addBox(-1.0F, 0.7079F, -1.0229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(58, 17).addBox(-2.0F, -1.0F, -1.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.0279F, -0.6778F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.33F, -2.3267F, -1.8342F, 0.0298F, -0.1063F, -0.5968F));

		PartDefinition cube_r248 = leftHorn.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(76, 36).addBox(-0.3064F, -0.2818F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.4011F, 0.0313F, -1.3722F, -0.4282F, 1.1046F, -0.8043F));

		PartDefinition cube_r249 = leftHorn.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(33, 76).addBox(-1.8873F, -0.2576F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.4011F, 0.0313F, -1.3722F, 0.5833F, 1.0588F, 0.316F));

		PartDefinition cube_r250 = leftHorn.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(62, 54).addBox(11.1215F, 2.7279F, -1.8109F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2094F, -0.2693F, -1.4048F));

		PartDefinition cube_r251 = leftHorn.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(58, 21).addBox(11.2089F, 1.0468F, 2.7888F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.1513F, 0.2014F, -1.1652F));

		PartDefinition cube_r252 = leftHorn.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(32, 17).addBox(9.3785F, 1.019F, -0.3571F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.1312F, 0.0236F, -1.1921F));

		PartDefinition cube_r253 = leftHorn.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(57, 82).addBox(10.2021F, 3.2482F, 3.5593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, -0.0945F, 0.3997F, -1.4388F));

		PartDefinition cube_r254 = leftHorn.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(81, 10).addBox(9.9286F, 1.193F, 3.121F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 5).addBox(7.7286F, 1.193F, 2.121F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, -0.0048F, 0.5497F, -1.2119F));

		PartDefinition cube_r255 = leftHorn.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(47, 21).addBox(6.9996F, 1.4951F, 4.5154F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, -0.0373F, 0.8809F, -1.2599F));

		PartDefinition cube_r256 = leftHorn.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 10).addBox(4.6395F, -0.2452F, 2.152F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.1949F, 0.5647F, -0.9692F));

		PartDefinition cube_r257 = leftHorn.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(19, 0).addBox(1.3534F, -1.5977F, 0.4547F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2804F, 0.2246F, -0.7877F));

		PartDefinition cube_r258 = leftHorn.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 64).addBox(-0.2911F, -1.9967F, -0.0494F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.3589F, -0.7971F, -0.8383F));

		PartDefinition cube_r259 = leftHorn.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(9, 56).addBox(0.6293F, 0.7277F, 10.5202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.4059F, 1.0825F, -0.805F));

		PartDefinition cube_r260 = leftHorn.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(34, 12).addBox(4.6387F, 0.7277F, 7.0626F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2484F, 0.7173F, -1.0026F));

		PartDefinition cube_r261 = leftHorn.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 50).addBox(-0.363F, 0.9606F, 9.3815F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.5409F, 1.0016F, -0.696F));

		PartDefinition cube_r262 = leftHorn.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 33).addBox(5.7583F, -0.3034F, 3.8735F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2226F, 0.2317F, -0.995F));

		PartDefinition cube_r263 = leftHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(44, 47).addBox(0.072F, -2.3133F, 1.0878F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.1543F, 0.1849F, -0.5724F));

		PartDefinition cube_r264 = leftHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(28, 48).addBox(-0.6401F, -0.4472F, 4.2901F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.6167F, 0.3287F, -0.4701F));

		PartDefinition cube_r265 = leftHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(41, 66).addBox(2.1073F, 2.7744F, 8.2656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.7543F, 0.5297F, -0.7475F));

		PartDefinition cube_r266 = leftHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(34, 66).addBox(2.1073F, -0.9879F, 7.105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.318F, 0.5297F, -0.7475F));

		PartDefinition cube_r267 = leftHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(19, 11).addBox(5.7232F, -1.1685F, -1.5803F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2349F, -0.3775F, -1.0151F));

		PartDefinition cube_r268 = leftHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(30, 25).addBox(2.0063F, -1.7509F, -1.6606F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2626F, -0.5788F, -0.9571F));

		PartDefinition cube_r269 = leftHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(8, 76).addBox(-0.3933F, -1.9967F, -0.2898F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.29F, 0.7061F, 0.6989F, 0.2676F, -0.381F, -0.6777F));

		PartDefinition cube_r270 = leftHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(76, 7).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.6441F, -0.0639F, 0.7609F, 0.2767F, 0.1574F, -0.5629F));

		PartDefinition cube_r271 = leftHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(63, 29).addBox(-0.2236F, 0.1099F, -0.4141F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2538F, 0.5948F, 0.3023F, 0.2595F, -0.0865F, -0.2688F));

		PartDefinition cube_r272 = leftHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 79).addBox(-1.1F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(18, 65).addBox(0.1813F, -0.7923F, -0.1085F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0684F, 1.1056F, -3.0153F, -1.3888F, 0.7462F, -0.9619F));

		PartDefinition cube_r274 = leftHorn.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(65, 12).addBox(-0.2235F, -0.2914F, -0.1085F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3245F, -0.0336F, -0.6473F, 1.5119F, 1.3477F, 1.8711F));

		PartDefinition cube_r275 = leftHorn.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(9, 65).addBox(-0.1749F, -0.7374F, -0.219F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8538F, 0.5948F, -0.4977F, 0.0289F, -0.2807F, 0.339F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.33F, -2.3267F, -1.8342F, 0.0252F, 0.1075F, 0.553F));

		PartDefinition cube_r276 = rightHorn.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-1.6936F, -0.2818F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.4011F, 0.0313F, -1.3722F, -0.4282F, -1.1046F, 0.8043F));

		PartDefinition cube_r277 = rightHorn.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(-0.1127F, -0.2576F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4011F, 0.0313F, -1.3722F, 0.5833F, -1.0588F, -0.316F));

		PartDefinition cube_r278 = rightHorn.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(62, 54).mirror().addBox(-14.1215F, 2.7279F, -1.8109F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2094F, 0.2693F, 1.4048F));

		PartDefinition cube_r279 = rightHorn.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-14.2089F, 1.0468F, 2.7888F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.1513F, -0.2014F, 1.1652F));

		PartDefinition cube_r280 = rightHorn.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(32, 17).mirror().addBox(-12.3785F, 1.019F, -0.3571F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.1312F, -0.0236F, 1.1921F));

		PartDefinition cube_r281 = rightHorn.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(57, 82).mirror().addBox(-12.2021F, 3.2482F, 3.5593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, -0.0945F, -0.3997F, 1.4388F));

		PartDefinition cube_r282 = rightHorn.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(81, 10).mirror().addBox(-11.9286F, 1.193F, 3.121F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 5).mirror().addBox(-10.7286F, 1.193F, 2.121F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, -0.0048F, -0.5497F, 1.2119F));

		PartDefinition cube_r283 = rightHorn.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-10.9996F, 1.4951F, 4.5154F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, -0.0373F, -0.8809F, 1.2599F));

		PartDefinition cube_r284 = rightHorn.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-8.6395F, -0.2452F, 2.152F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.1949F, -0.5647F, 0.9692F));

		PartDefinition cube_r285 = rightHorn.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-6.3534F, -1.5977F, 0.4547F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2804F, -0.2246F, 0.7877F));

		PartDefinition cube_r286 = rightHorn.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-2.7089F, -1.9967F, -0.0494F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.3589F, 0.7971F, 0.8383F));

		PartDefinition cube_r287 = rightHorn.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(9, 56).mirror().addBox(-1.6293F, 0.7277F, 10.5202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.4059F, -1.0825F, 0.805F));

		PartDefinition cube_r288 = rightHorn.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(34, 12).mirror().addBox(-7.6387F, 0.7277F, 7.0626F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2484F, -0.7173F, 1.0026F));

		PartDefinition cube_r289 = rightHorn.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.637F, 0.9606F, 9.3815F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.5409F, -1.0016F, 0.696F));

		PartDefinition cube_r290 = rightHorn.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-8.7583F, -0.3034F, 3.8735F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2226F, -0.2317F, 0.995F));

		PartDefinition cube_r291 = rightHorn.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-1.072F, -2.3133F, 1.0878F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.1543F, -0.1849F, 0.5724F));

		PartDefinition cube_r292 = rightHorn.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-0.3599F, -0.4472F, 4.2901F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.6167F, -0.3287F, 0.4701F));

		PartDefinition cube_r293 = rightHorn.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(41, 66).mirror().addBox(-3.1073F, 2.7744F, 8.2656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.7543F, -0.5297F, 0.7475F));

		PartDefinition cube_r294 = rightHorn.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(-3.1073F, -0.9879F, 7.105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.318F, -0.5297F, 0.7475F));

		PartDefinition cube_r295 = rightHorn.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(-8.7232F, -1.1685F, -1.5803F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2349F, 0.3775F, 1.0151F));

		PartDefinition cube_r296 = rightHorn.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(30, 25).mirror().addBox(-6.0063F, -1.7509F, -1.6606F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2626F, 0.5788F, 0.9571F));

		PartDefinition cube_r297 = rightHorn.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(8, 76).mirror().addBox(-1.6067F, -1.9967F, -0.2898F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.29F, 0.7061F, 0.6989F, 0.2676F, 0.381F, 0.6777F));

		PartDefinition cube_r298 = rightHorn.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(76, 7).mirror().addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.6441F, -0.0639F, 0.7609F, 0.2767F, -0.1574F, 0.5629F));

		PartDefinition cube_r299 = rightHorn.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-2.7764F, 0.1099F, -0.4141F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2538F, 0.5948F, 0.3023F, 0.2595F, 0.0865F, 0.2688F));

		PartDefinition cube_r300 = rightHorn.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(-0.9F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightHorn.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(18, 65).mirror().addBox(-3.1813F, -0.7923F, -0.1085F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0684F, 1.1056F, -3.0153F, -1.3888F, -0.7462F, 0.9619F));

		PartDefinition cube_r302 = rightHorn.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-2.7765F, -0.2914F, -0.1085F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3245F, -0.0336F, -0.6473F, 1.5119F, -1.3477F, -1.8711F));

		PartDefinition cube_r303 = rightHorn.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(9, 65).mirror().addBox(-2.8251F, -0.7374F, -0.219F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8538F, 0.5948F, -0.4977F, 0.0289F, 0.2807F, -0.339F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.8361F, -8.5987F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(41, 89).addBox(-0.179F, -0.5F, -1.3198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5329F, 0.3038F, 0.1747F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(46, 57).addBox(-0.4359F, -0.5F, -0.4701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.2424F, -0.4373F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(37, 57).addBox(-0.4359F, -0.5F, -0.9701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(12, 72).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1376F, -4.8468F, 7.6824F, -0.2025F, -0.7261F, 0.0918F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(73, 42).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.9521F, 6.757F, 0.8733F, 0.0336F, 0.0401F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(5, 72).addBox(-0.5F, -0.3369F, -0.3204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -4.2456F, 6.5439F, 0.6458F, -0.2793F, 0.0F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(67, 71).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.9521F, 6.757F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(54, 29).addBox(-0.8F, -0.4F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1336F, -3.1265F, 3.5739F, 0.7007F, 0.5733F, 0.2267F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(74, 10).addBox(-0.6F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(47, 73).addBox(-0.6F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.138F, -3.0594F, 5.1074F, 0.5476F, 0.2663F, 0.6698F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(18, 61).addBox(-1.6F, -0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4962F, -4.5862F, 5.0365F, -2.5043F, 0.4382F, 0.2603F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(27, 62).addBox(-1.6F, -0.5F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3404F, -5.0917F, 5.6297F, -2.3651F, 0.1165F, -0.2055F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(88, 55).addBox(-0.7F, -0.4985F, -0.3756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.9841F, -3.905F, 4.7875F, 0.3876F, 0.5329F, 0.2045F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(55, 61).addBox(-1.6F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.641F, -4.7324F, 5.2548F, -2.2562F, -0.1613F, -0.566F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(74, 14).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.1896F, 5.5829F, 1.9441F, 0.1978F, 0.0632F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.8361F, -8.5987F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(41, 89).mirror().addBox(-0.821F, -0.5F, -1.3198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5329F, -0.3038F, -0.1747F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(46, 57).mirror().addBox(-0.5641F, -0.5F, -0.4701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2424F, -0.4373F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(37, 57).mirror().addBox(-0.5641F, -0.5F, -0.9701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(12, 72).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1376F, -4.8468F, 7.6824F, -0.2025F, 0.7261F, -0.0918F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.9521F, 6.757F, 0.8733F, -0.0336F, -0.0401F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.5F, -0.3369F, -0.3204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -4.2456F, 6.5439F, 0.6458F, 0.2793F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.9521F, 6.757F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-0.2F, -0.4F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, -3.1265F, 3.5739F, 0.7007F, -0.5733F, -0.2267F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(74, 10).mirror().addBox(-0.4F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 73).mirror().addBox(-0.4F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.138F, -3.0594F, 5.1074F, 0.5476F, -0.2663F, -0.6698F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-0.4F, -0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4962F, -4.5862F, 5.0365F, -2.5043F, -0.4382F, -0.2603F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-0.4F, -0.5F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3404F, -5.0917F, 5.6297F, -2.3651F, -0.1165F, 0.2055F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-0.3F, -0.4985F, -0.3756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9841F, -3.905F, 4.7875F, 0.3876F, -0.5329F, -0.2045F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-0.4F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.641F, -4.7324F, 5.2548F, -2.2562F, 0.1613F, 0.566F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(74, 14).mirror().addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.1896F, 5.5829F, 1.9441F, -0.1978F, -0.0632F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(-0.1393F, -1.5891F, -0.5745F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 86).mirror().addBox(-0.2393F, -1.7891F, -0.1745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.871F, -2.7353F, -0.982F, -0.0415F, -0.0696F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.1101F, -0.3833F, -0.6978F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.871F, -2.7353F, -1.2965F, -0.083F, -0.1083F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(36, 89).mirror().addBox(0.0F, 1.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 52).mirror().addBox(0.0F, 2.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.827F, -2.7584F, -1.2623F, -0.2652F, -0.0884F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(67, 86).mirror().addBox(-0.25F, 0.2234F, 0.4284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(21, 89).mirror().addBox(-0.35F, 0.3142F, 0.1718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-0.35F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 89).mirror().addBox(-0.35F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-0.35F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 28).mirror().addBox(-0.35F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(-0.2162F, -0.0218F, -0.145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.871F, -2.7353F, -1.4348F, -0.0914F, -0.0856F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-0.2162F, 0.0323F, -0.2522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.871F, -2.7353F, -1.3824F, -0.0914F, -0.0856F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(16, 86).mirror().addBox(-0.35F, 0.0118F, -0.7861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(88, 58).mirror().addBox(-0.35F, -0.0061F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(-0.35F, -0.2324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(84, 82).mirror().addBox(-0.2393F, -1.8642F, -0.1175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.871F, -2.7353F, -1.2613F, -0.0415F, -0.0696F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.35F, -0.9757F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(62, 86).addBox(-0.65F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 28).addBox(-0.65F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(85, 45).addBox(-0.7838F, -0.0218F, -0.145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9629F, 3.871F, -2.7353F, -1.4348F, 0.0914F, 0.0856F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(46, 89).addBox(-1.0F, -0.9012F, -0.9073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 5.6237F, -7.662F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(77, 88).addBox(-1.0F, -0.4005F, -0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(88, 70).addBox(-1.0F, -0.8005F, -0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.9135F, -7.1183F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(36, 89).addBox(-1.0F, 1.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 52).addBox(-1.0F, 2.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.827F, -2.7584F, -1.2623F, 0.2652F, 0.0884F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(90, 0).addBox(0.1101F, -0.3833F, -0.6978F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.871F, -2.7353F, -1.2965F, 0.083F, 0.1083F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(42, 85).addBox(-0.7838F, 0.0323F, -0.2522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.871F, -2.7353F, -1.3824F, 0.0914F, 0.0856F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(62, 90).addBox(0.1393F, -1.5891F, -0.5745F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 86).addBox(-0.7607F, -1.7891F, -0.1745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.871F, -2.7353F, -0.982F, 0.0415F, 0.0696F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(16, 86).addBox(-0.65F, 0.0118F, -0.7861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(21, 89).addBox(-0.65F, 0.3142F, 0.1718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(88, 58).addBox(-0.65F, -0.0061F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(86, 13).addBox(-0.65F, -0.2324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(67, 86).addBox(-0.75F, 0.2234F, 0.4284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(84, 82).addBox(-0.7607F, -1.8642F, -0.1175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9629F, 3.871F, -2.7353F, -1.2613F, 0.0415F, 0.0696F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(89, 20).addBox(-0.65F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 89).addBox(-0.65F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 86).addBox(-0.65F, -0.9757F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.55F, 1.5128F, -0.0675F, 0.2967F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(45, 36).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.7F, -0.2628F, -0.0843F, 0.0226F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(66, 42).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.2466F, -0.2967F, 0.0735F));

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