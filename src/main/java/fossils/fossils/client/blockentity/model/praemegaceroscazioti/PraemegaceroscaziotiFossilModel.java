package fossils.fossils.client.blockentity.model.praemegaceroscazioti;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PraemegaceroscaziotiFossilModel extends SkullModelBase {
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

	public PraemegaceroscaziotiFossilModel(ModelPart root) {
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

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 65).addBox(0.0F, -0.4F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 23).addBox(0.0F, -1.0201F, -1.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-1.1156F, -0.1514F, -0.5086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -1.7719F, -0.2709F, -0.8218F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-1.0245F, -0.9821F, 0.2594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -0.4508F, -0.5068F, -0.379F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(-1.9165F, -2.0114F, -0.8215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -2.1321F, -0.168F, -1.3954F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 38).mirror().addBox(-1.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5958F, 1.6453F, 2.3425F, -0.518F, -0.2903F, -1.1684F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2553F, 3.2518F, 4.067F, -0.7856F, -0.1966F, -0.7868F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 45).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.2371F, -0.3589F, -0.5993F, 0.1007F, -0.6811F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.2371F, -0.3589F, 0.0572F, -0.1406F, -0.3173F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 5).mirror().addBox(-0.2904F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.7426F, -0.2171F, -0.561F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.2904F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.6228F, -0.2103F, -0.3213F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(-0.3837F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.0966F, 0.0684F, -0.5622F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-0.3837F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -1.0566F, 0.0684F, -0.5622F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 87).mirror().addBox(-0.3837F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 0.0206F, -2.3807F, -0.4021F, 0.0684F, -0.5622F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 68).addBox(0.1156F, -0.1514F, -0.5086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -1.7719F, 0.2709F, 0.8218F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 68).addBox(0.0245F, -0.9821F, 0.2594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -0.4508F, 0.5068F, 0.379F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 75).addBox(0.9165F, -2.0114F, -0.8215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -2.1321F, 0.168F, 1.3954F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(31, 38).addBox(0.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5958F, 1.6453F, 2.3425F, -0.518F, 0.2903F, 1.1684F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(74, 87).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2553F, 3.2518F, 4.067F, -0.7856F, 0.1966F, 0.7868F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 45).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.2371F, -0.3589F, -0.5993F, -0.1007F, 0.6811F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 37).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.2371F, -0.3589F, 0.0572F, 0.1406F, 0.3173F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 5).addBox(-0.7096F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.7426F, 0.2171F, 0.561F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 0).addBox(-0.7096F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.6228F, 0.2103F, 0.3213F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(83, 93).addBox(-0.6163F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.0966F, -0.0684F, 0.5622F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 95).addBox(-0.6163F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -1.0566F, -0.0684F, 0.5622F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 87).addBox(-0.6163F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3842F, 0.0206F, -2.3807F, -0.4021F, -0.0684F, 0.5622F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(63, 16).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(89, 84).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 24).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.3207F, 1.8232F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 0).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(70, 19).addBox(-1.0F, -0.6048F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 82).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 82).addBox(-1.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 93).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 82).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 0).addBox(-1.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(18, 64).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(46, 72).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(86, 11).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(40, 80).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 20).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(47, 42).addBox(-1.9F, -1.0479F, -0.9978F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(27, 91).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7607F, -0.8835F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(81, 68).addBox(-1.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(32, 9).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(48, 10).addBox(-0.6F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.411F, -0.9085F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(5, 73).addBox(6.6299F, -0.5F, 0.0021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r49 = leftLeg4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(73, 4).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, 0.2143F, -5.3932F));

		PartDefinition cube_r50 = leftLeg5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 76).addBox(8.0001F, 0.2042F, 1.1492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r51 = leftLeg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(75, 60).addBox(8.0001F, -0.2275F, 1.2851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r52 = leftLeg5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(79, 53).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r53 = leftLeg5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 77).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.3207F, 1.8232F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(66, 5).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 70).addBox(-1.0F, -0.6048F, -0.4174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(10, 83).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 63).addBox(0.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(93, 93).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 60).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(50, 61).addBox(-0.5F, -0.7994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(41, 64).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 86).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 80).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(79, 57).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 48).addBox(0.9F, -1.0479F, -0.9978F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(91, 38).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7607F, -0.8835F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 6).addBox(0.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(26, 32).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(20, 51).addBox(-0.4F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 9.411F, -0.9085F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 73).addBox(-7.6299F, -0.5F, 0.0021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r71 = rightLeg4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 73).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2143F, -5.3932F));

		PartDefinition cube_r72 = rightLeg5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(76, 49).addBox(-9.0001F, 0.2042F, 1.1492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r73 = rightLeg5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(75, 64).addBox(-9.0001F, -0.2275F, 1.2851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r74 = rightLeg5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 73).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r75 = rightLeg5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(26, 78).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(33, 98).addBox(0.0F, -1.1751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(47, 20).addBox(0.0F, -0.9577F, -1.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 97).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(27, 89).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.0588F, 0.1764F, -0.7455F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.0106F, 0.1855F, -1.0115F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0771F, 0.1692F, -1.499F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(40, 97).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(20, 97).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(10, 97).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(27, 89).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.0588F, -0.1764F, 0.7455F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(89, 61).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.0106F, -0.1855F, 1.0115F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(89, 59).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0771F, -0.1692F, 1.499F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(98, 13).addBox(-0.5753F, -0.9995F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 49).addBox(-0.4485F, -1.2943F, -0.4457F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.4806F, -7.4243F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, -0.2182F, -0.0873F, 0.0015F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(34, 89).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.1374F, 0.22F, -0.6441F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(89, 80).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.075F, 0.248F, -0.9117F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 40).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0505F, 0.254F, -1.4075F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(91, 86).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.0344F, 0.1516F, -0.6108F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(93, 11).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0063F, 0.1553F, -0.8758F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-9.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0777F, 0.1347F, -1.3605F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.0634F, 0.1715F, -0.6062F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 30).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, -0.0703F, 0.1689F, -1.3594F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -5.4048F, 0.0164F, 0.1821F, -0.8719F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(34, 89).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.1374F, -0.22F, 0.6441F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(89, 80).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.075F, -0.248F, 0.9117F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(56, 40).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0505F, -0.254F, 1.4075F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(91, 86).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.0344F, -0.1516F, 0.6108F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(93, 11).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0063F, -0.1553F, 0.8758F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(37, 16).addBox(3.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0777F, -0.1347F, 1.3605F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(90, 51).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.0634F, -0.1715F, 0.6062F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(28, 30).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, -0.0703F, -0.1689F, 1.3594F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(91, 20).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -5.4048F, 0.0164F, -0.1821F, 0.8719F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 97).addBox(0.0F, -1.1939F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(98, 28).addBox(0.0F, -1.3938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(5, 98).addBox(0.0F, -1.5698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, -0.0342F, -0.0855F, -0.0174F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(37, 70).addBox(0.0F, -2.2965F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4078F, -2.0187F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(22, 36).addBox(0.0F, -2.9854F, -0.9869F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(14, 69).addBox(0.0F, -3.3854F, 0.013F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8812F, -5.6454F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(32, 91).addBox(0.0F, -3.416F, 0.0852F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7401F, -7.5587F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(28, 24).mirror().addBox(-0.7F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.169F, 3.4516F, -7.0374F, 0.97F, 0.3989F, -0.1601F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.5F, -1.9624F, 3.4134F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 32).addBox(5.3F, -1.9624F, 3.4134F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 89).mirror().addBox(-0.5F, -0.5687F, 5.576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(89, 89).addBox(5.3F, -0.5687F, 5.576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 5.0215F, -7.937F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(84, 89).mirror().addBox(-0.5F, -0.0987F, -0.8856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(84, 89).addBox(5.3F, -0.0987F, -0.8856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, -0.9002F, -6.7009F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(93, 76).mirror().addBox(-0.5F, -0.0628F, -0.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(93, 76).addBox(5.3F, -0.0628F, -0.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, -0.6262F, -7.5446F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-0.5F, -0.0598F, 0.046F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(65, 56).addBox(5.3F, -0.0598F, 0.046F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 1.3139F, -8.128F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 65).mirror().addBox(-0.5F, 0.1819F, 3.5516F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(34, 65).addBox(5.3F, 0.1819F, 3.5516F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(37, 4).mirror().addBox(-0.5F, -1.0488F, -0.2864F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(37, 4).addBox(5.3F, -1.0488F, -0.2864F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(89, 82).mirror().addBox(-0.6099F, -0.8916F, -0.3078F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4753F, 10.2955F, -6.3735F, -0.0179F, 0.0628F, -2.7221F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0641F, 0.2032F, -1.3058F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0384F, 0.2095F, -0.8153F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 44).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0919F, 0.1923F, -0.5487F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(32, 2).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0615F, 0.2205F, -1.3402F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.049F, 0.2235F, -0.8479F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(56, 89).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1059F, 0.2032F, -0.5808F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-7.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, -0.0318F, 0.4104F, -1.68F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.1711F, 0.3761F, -1.1608F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.2643F, 0.3192F, -0.8888F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-8.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, -0.0458F, 0.3241F, -1.4931F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.1141F, 0.3073F, -0.9879F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.191F, 0.2673F, -0.718F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.1059F, 0.2032F, -0.6681F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(88, 22).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.049F, 0.2235F, -0.9352F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(32, 21).mirror().addBox(-0.6814F, -1.1045F, -0.2579F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.2927F, -0.6396F, -2.6792F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-0.5303F, -1.1257F, -0.2606F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.6099F, 0.8086F, -0.1053F, -0.3887F, -2.9786F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-0.5267F, -1.0305F, -0.243F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 9.8667F, -0.261F, -0.1636F, -0.1234F, -2.8349F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-0.9247F, -0.9382F, -0.3805F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.459F, 10.2402F, -1.8168F, -0.1779F, -0.146F, -2.7596F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-0.8782F, -0.9064F, -0.3821F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4373F, 10.3609F, -2.6322F, 0.1109F, 0.0656F, -2.8672F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(-0.427F, -0.937F, -1.0775F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4925F, 10.3519F, -3.6539F, -0.108F, 0.0328F, -2.8068F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-9.1795F, -2.6157F, -0.785F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0615F, 0.2205F, -1.4275F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(11, 36).mirror().addBox(-0.5F, -0.6733F, -0.1323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 36).addBox(5.3F, -0.6733F, -0.1323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, 6.8215F, -7.937F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-0.5F, -0.9723F, -2.0248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(72, 12).addBox(5.3F, -0.9723F, -2.0248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.9F, 2.9573F, -5.2178F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(50, 18).addBox(5.3F, 0.2F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.9F, 1.8839F, -5.8869F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(28, 24).addBox(-0.3F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.169F, 3.4516F, -7.0374F, 0.97F, -0.3989F, 0.1601F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(89, 82).addBox(-1.3901F, -0.8916F, -0.3078F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4753F, 10.2955F, -6.3735F, -0.0179F, -0.0628F, 2.7221F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(19, 7).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0641F, -0.2032F, 1.3058F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(58, 30).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0384F, -0.2095F, 0.8153F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(35, 44).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0919F, -0.1923F, 0.5487F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(32, 2).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0615F, -0.2205F, 1.3402F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(88, 28).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.049F, -0.2235F, 0.8479F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(56, 89).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, 0.1059F, -0.2032F, 0.5808F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(54, 28).addBox(3.1795F, -2.6157F, -0.785F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, -0.0318F, -0.4104F, 1.68F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(88, 26).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.1711F, -0.3761F, 1.1608F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(10, 88).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -8.6F, 0.2643F, -0.3192F, 0.8888F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(37, 18).addBox(3.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, -0.0458F, -0.3241F, 1.4931F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(88, 24).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.1141F, -0.3073F, 0.9879F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(87, 9).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -6.6F, 0.191F, -0.2673F, 0.718F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(86, 14).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.1059F, -0.2032F, 0.6681F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(88, 22).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, 0.049F, -0.2235F, 0.9352F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(32, 21).addBox(-5.3186F, -1.1045F, -0.2579F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.2927F, 0.6396F, 2.6792F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(45, 30).addBox(-4.4697F, -1.1257F, -0.2606F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.6099F, 0.8086F, -0.1053F, 0.3887F, 2.9786F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(22, 44).addBox(-4.4733F, -1.0305F, -0.243F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 9.8667F, -0.261F, -0.1636F, 0.1234F, 2.8349F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(41, 28).addBox(-4.0753F, -0.9382F, -0.3805F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.459F, 10.2402F, -1.8168F, -0.1779F, 0.146F, 2.7596F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(56, 51).addBox(-3.1218F, -0.9064F, -0.3821F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4373F, 10.3609F, -2.6322F, 0.1109F, -0.0656F, 2.8672F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(66, 10).addBox(-2.573F, -0.937F, -1.0775F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4925F, 10.3519F, -3.6539F, -0.108F, -0.0328F, 2.8068F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(32, 0).addBox(3.1795F, -2.6157F, -0.785F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0615F, -0.2205F, 1.4275F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(22, 46).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(56, 32).addBox(-1.6328F, 2.5294F, -5.3708F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(31, 32).addBox(-1.1328F, 0.0449F, 0.058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9219F, -2.4363F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(19, 0).addBox(-1.1328F, -0.0152F, -4.7174F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.1855F, -6.9515F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 7.9941F, -8.0663F, 0.7757F, 0.2151F, -0.034F));

		PartDefinition cube_r180 = leftarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(23, 74).addBox(-0.0018F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 1.4398F, 0.0014F, -0.001F));

		PartDefinition cube_r181 = leftarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(63, 90).addBox(0.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.1535F, 0.4938F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r182 = leftarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(53, 72).addBox(0.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -1.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(93, 53).addBox(0.0F, 0.2433F, -0.3525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.9963F, 2.676F, -1.641F, -0.091F, 0.2166F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(96, 96).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.8729F, -0.2661F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(18, 68).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6064F, 3.9713F, -0.6163F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(84, 81).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(5, 48).addBox(-0.018F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(9, 57).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r190 = leftarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(76, 95).addBox(0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1236F, -0.8515F, 0.9635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r191 = leftarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(33, 83).addBox(-1.9973F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.1856F, 0.9517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(42, 32).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.0091F, 0.7904F, 1.6144F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5667F, 0.3535F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftArm4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(51, 78).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r193 = leftArm4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(77, 43).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r194 = leftArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(77, 16).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r195 = leftArm4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(58, 76).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r196 = leftArm4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(78, 91).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r197 = leftArm4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(92, 63).addBox(5.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8233F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 7.9941F, -8.0663F, 0.5192F, -0.0236F, 0.0668F));

		PartDefinition cube_r198 = rightarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(12, 75).addBox(-0.9982F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 1.4398F, -0.0014F, 0.001F));

		PartDefinition cube_r199 = rightarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 16).addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.1535F, 0.4938F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r200 = rightarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(70, 41).addBox(-1.0F, -1.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 56).addBox(-1.0F, 0.2433F, -0.3525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.9963F, 2.676F, -0.4575F, -0.0177F, -0.0622F));

		PartDefinition cube_r203 = rightarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 0.8729F, -0.2661F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r204 = rightarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(41, 68).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6064F, 3.9713F, -0.6163F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r205 = rightarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(22, 85).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(14, 52).addBox(-0.982F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(46, 87).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(15, 96).addBox(-1.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1236F, -0.8515F, 0.9635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 19).addBox(-0.0027F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.1856F, 0.9517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(42, 42).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.075F, 9.0091F, 0.7904F, 0.3905F, 0.0048F, -0.0231F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(65, 81).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5667F, 0.3535F, -0.5694F, -0.0013F, -0.0236F));

		PartDefinition cube_r210 = rightArm4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(12, 79).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r211 = rightArm4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(65, 77).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r212 = rightArm4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(77, 39).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r213 = rightArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r214 = rightArm4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 92).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r215 = rightArm4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 93).addBox(-6.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8233F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -8.9F, 0.0916F, -0.2588F, -0.0387F));

		PartDefinition cube_r216 = neck3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(63, 97).addBox(-0.005F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1949F, -0.3725F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(97, 62).addBox(0.0F, -2.8F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6839F, 0.2299F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(60, 97).addBox(0.0F, -2.1F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r219 = neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(47, 51).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4965F, -2.5277F, 0.0452F, -0.2615F, -0.0117F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 75).addBox(0.0F, -1.1681F, 1.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 61).addBox(-0.5F, -0.1681F, 1.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3533F, -1.0667F, -0.5361F, -0.3093F, -0.0522F));

		PartDefinition cube_r221 = neck.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(35, 91).addBox(0.0F, 0.2F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2928F, -1.1967F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9365F, -2.1677F, 1.1326F, -0.0864F, -0.0806F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(0.0F, -0.3F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, -0.3F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(57, 4).addBox(-1.5F, -2.4954F, -1.6255F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.3928F, 0.173F, -0.9686F, 0.2579F, -0.129F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 56).addBox(-1.0F, -0.9982F, -0.1143F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.4776F, -3.4664F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(59, 61).addBox(-1.0F, -0.975F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.9515F, -3.2272F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 12).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 3.3586F, -5.1911F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(7, 69).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.1585F, -4.3122F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -2.7F, 3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.2811F, -9.0344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(37, 10).addBox(-0.5F, -0.2292F, -0.1586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.5264F, -7.8537F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(34, 86).addBox(-1.0F, -0.636F, -3.3188F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 52).addBox(-0.5F, -0.7094F, -3.0112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.4264F, -6.7537F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(86, 68).addBox(-1.0F, -0.8937F, -0.9907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.4264F, -6.7537F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(27, 86).addBox(-1.0F, -0.6001F, 0.1761F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1918F, -7.0665F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(84, 44).addBox(-1.0F, 0.7944F, -0.5813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -7.5F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(56, 53).addBox(-1.0F, 0.05F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(47, 56).addBox(-1.0F, -0.65F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.9387F, -5.6948F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(5, 52).addBox(-1.0F, 0.0885F, -1.9021F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.2F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(9, 65).addBox(-1.0F, -0.45F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.3568F, -2.3304F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(56, 57).addBox(-1.0F, 0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(32, 57).addBox(-0.5F, 0.8F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -1.2871F, -1.218F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(9, 61).addBox(-2.5F, -0.2704F, -0.4407F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 8).addBox(-2.5F, -0.2704F, -0.0907F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.9491F, -2.3688F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(11, 42).addBox(-2.5F, 0.0418F, -0.1042F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -0.7491F, -4.1688F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 65).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2609F, -3.6303F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(83, 50).addBox(-0.5F, -1.0019F, -0.1979F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(83, 47).addBox(-0.5F, -1.4019F, -0.1979F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.3F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(40, 83).addBox(-1.0F, -0.5921F, -0.1229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.003F, -0.5688F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(83, 35).addBox(-1.0F, 0.7079F, -1.0229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1071F, -3.5212F, -1.9208F, 0.039F, -0.1033F, -0.6845F));

		PartDefinition cube_r246 = leftHorn.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(86, 77).addBox(11.4136F, -0.4787F, 0.3334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.6117F, -1.0251F, 0.2694F));

		PartDefinition cube_r247 = leftHorn.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(81, 23).addBox(8.6012F, -0.4787F, -5.5654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -1.7675F, -1.262F, 1.5063F));

		PartDefinition cube_r248 = leftHorn.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(93, 13).addBox(8.5802F, -0.4787F, -3.5743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -1.1093F, -1.2315F, 0.8148F));

		PartDefinition cube_r249 = leftHorn.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(86, 53).addBox(7.1805F, -0.4787F, -0.0436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.5395F, -0.9518F, 0.183F));

		PartDefinition cube_r250 = leftHorn.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(61, 22).addBox(11.6789F, 1.9179F, 7.0262F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3004F, -0.2598F, -0.6088F));

		PartDefinition cube_r251 = leftHorn.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(80, 0).addBox(4.0822F, 1.6261F, 13.6339F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2633F, 0.849F, -0.774F));

		PartDefinition cube_r252 = leftHorn.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(57, 83).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(20.6962F, -6.2888F, 1.9193F, 0.2562F, 0.907F, -0.2535F));

		PartDefinition cube_r253 = leftHorn.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(95, 22).addBox(16.8547F, 7.1105F, 10.3987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0685F, 0.6027F, -0.7344F));

		PartDefinition cube_r254 = leftHorn.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(5, 95).addBox(17.9079F, 7.1105F, 6.5143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0608F, 0.385F, -0.7504F));

		PartDefinition cube_r255 = leftHorn.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(84, 16).addBox(16.8993F, 2.046F, 7.9234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.2022F, 0.429F, -0.4362F));

		PartDefinition cube_r256 = leftHorn.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(95, 33).addBox(18.0156F, 6.4135F, 16.3388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(93, 73).addBox(18.0156F, 6.4135F, 15.5388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0586F, 0.6488F, -0.7015F));

		PartDefinition cube_r257 = leftHorn.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(76, 35).addBox(17.737F, 6.4135F, 17.0269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0656F, 0.7795F, -0.6908F));

		PartDefinition cube_r258 = leftHorn.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(10, 94).addBox(-11.4992F, 6.4135F, 21.2763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 3.0399F, 1.0936F, 2.3142F));

		PartDefinition cube_r259 = leftHorn.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(96, 39).addBox(3.3937F, 6.4135F, 23.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.3323F, 1.4273F, -0.4078F));

		PartDefinition cube_r260 = leftHorn.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(74, 69).addBox(22.2694F, 6.4135F, 6.6532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0489F, 0.3002F, -0.7225F));

		PartDefinition cube_r261 = leftHorn.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(93, 70).addBox(10.8013F, 6.4135F, 19.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(93, 67).addBox(10.8013F, 6.4135F, 18.8127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0761F, 0.91F, -0.6768F));

		PartDefinition cube_r262 = leftHorn.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(75, 8).addBox(15.9874F, 6.4135F, 12.8183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0568F, 0.6053F, -0.7046F));

		PartDefinition cube_r263 = leftHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(35, 95).addBox(17.4879F, 6.4135F, -11.6354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.054F, -0.5278F, -0.7642F));

		PartDefinition cube_r264 = leftHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 69).addBox(20.1105F, 6.4135F, 2.1312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.047F, 0.1259F, -0.731F));

		PartDefinition cube_r265 = leftHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(11, 47).addBox(6.1771F, 6.4135F, 19.6665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.1754F, 1.3002F, -0.5678F));

		PartDefinition cube_r266 = leftHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(95, 46).addBox(-1.142F, 7.359F, 23.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(95, 25).addBox(-1.142F, 7.359F, 22.4082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 2.8445F, 1.4041F, 2.0668F));

		PartDefinition cube_r267 = leftHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(25, 95).addBox(-8.8275F, 7.359F, 20.1795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 3.042F, 1.0601F, 2.2731F));

		PartDefinition cube_r268 = leftHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(72, 56).addBox(-3.307F, 7.359F, 19.9968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 2.9451F, 1.3193F, 2.1695F));

		PartDefinition cube_r269 = leftHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 25).addBox(9.5443F, 7.359F, 17.2545F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.1221F, 1.1604F, -0.6695F));

		PartDefinition cube_r270 = leftHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(61, 46).addBox(17.7643F, 6.4135F, 5.1968F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0504F, 0.3874F, -0.7179F));

		PartDefinition cube_r271 = leftHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(61, 42).addBox(15.1893F, 2.046F, 9.5079F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.2231F, 0.5997F, -0.3939F));

		PartDefinition cube_r272 = leftHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(32, 61).addBox(11.3178F, 0.7917F, 12.3842F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.2214F, 0.7798F, -0.3F));

		PartDefinition cube_r273 = leftHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(56, 36).addBox(10.2068F, 1.4312F, 11.6171F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.011F, 0.7203F, -0.5016F));

		PartDefinition cube_r274 = leftHorn.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(52, 47).addBox(3.6027F, 1.4312F, 14.4031F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(3.8027F, 1.4312F, 15.6031F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, 0.0172F, 1.0693F, -0.4938F));

		PartDefinition cube_r275 = leftHorn.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(29, 51).addBox(-6.6682F, 1.6261F, 15.7389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -1.0793F, 1.3745F, -1.6455F));

		PartDefinition cube_r276 = leftHorn.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(53, 68).addBox(-5.8444F, 1.6261F, 16.5353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -1.2922F, 1.391F, -1.8623F));

		PartDefinition cube_r277 = leftHorn.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(13, 31).addBox(-2.1136F, 1.6261F, 14.9984F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.465F, 1.1772F, -1.0082F));

		PartDefinition cube_r278 = leftHorn.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(79, 12).addBox(-7.5555F, 2.9987F, 16.8025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F))
				.texOffs(67, 69).addBox(-7.3207F, 2.9987F, 14.2568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.6636F, 1.1763F, -1.3576F));

		PartDefinition cube_r279 = leftHorn.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(94, 0).addBox(-2.9412F, 2.9987F, 17.3258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.4191F, 0.9499F, -1.08F));

		PartDefinition cube_r280 = leftHorn.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(77, 81).addBox(-17.1097F, 2.9987F, -1.2317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.7975F, 0.7929F, 2.6592F));

		PartDefinition cube_r281 = leftHorn.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(70, 84).addBox(-11.1533F, 2.9987F, 12.7156F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.9678F, 1.2792F, -1.6799F));

		PartDefinition cube_r282 = leftHorn.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(84, 86).addBox(-20.7476F, 2.9987F, 2.2852F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.6801F, 1.0102F, 2.8078F));

		PartDefinition cube_r283 = leftHorn.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(86, 56).addBox(-20.7321F, 2.9987F, -9.3388F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.8719F, 0.4763F, 2.5353F));

		PartDefinition cube_r284 = leftHorn.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(77, 84).addBox(-17.9407F, 2.9987F, -16.5804F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.9015F, 0.096F, 2.4327F));

		PartDefinition cube_r285 = leftHorn.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(81, 96).addBox(-9.6784F, 2.9987F, -21.086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.8952F, -0.243F, 2.3488F));

		PartDefinition cube_r286 = leftHorn.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(96, 42).addBox(-16.115F, 2.9987F, -16.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.9002F, 0.1383F, 2.4431F));

		PartDefinition cube_r287 = leftHorn.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(93, 30).addBox(-20.5722F, 2.9987F, -8.2679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.8584F, 0.5603F, 2.5627F));

		PartDefinition cube_r288 = leftHorn.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 95).addBox(-21.2185F, 2.9987F, -0.1553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.7339F, 0.931F, 2.7428F));

		PartDefinition cube_r289 = leftHorn.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(81, 29).addBox(-17.9967F, 2.9987F, 9.2174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.0255F, 1.3041F, -2.7722F));

		PartDefinition cube_r290 = leftHorn.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(67, 50).addBox(-17.1911F, 2.9987F, 7.0423F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.3644F, 1.2265F, -3.127F));

		PartDefinition cube_r291 = leftHorn.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(59, 65).addBox(4.0869F, 2.9987F, 14.6173F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(32, 4).addBox(6.7869F, 2.9987F, 15.2173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2613F, 0.412F, -0.8391F));

		PartDefinition cube_r292 = leftHorn.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(19, 78).addBox(-9.5398F, 0.9458F, 16.2647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -1.5162F, 1.3769F, -2.0571F));

		PartDefinition cube_r293 = leftHorn.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(96, 79).addBox(-2.5585F, 0.9458F, 17.8325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.4631F, 1.1257F, -0.9654F));

		PartDefinition cube_r294 = leftHorn.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(58, 72).addBox(-16.8464F, 0.9458F, 4.8244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -2.8259F, 0.9025F, 2.8506F));

		PartDefinition cube_r295 = leftHorn.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(45, 95).addBox(-10.6407F, 0.9458F, 14.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -1.9428F, 1.3628F, -2.4922F));

		PartDefinition cube_r296 = leftHorn.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(17, 18).addBox(4.3667F, 0.9458F, 12.6848F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2484F, 0.6722F, -0.6986F));

		PartDefinition cube_r297 = leftHorn.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 19).addBox(3.5212F, 2.2789F, 11.8216F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3171F, 0.4741F, -0.8627F));

		PartDefinition cube_r298 = leftHorn.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(41, 23).addBox(7.0159F, 1.9179F, 9.7197F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2938F, 0.158F, -0.7358F));

		PartDefinition cube_r299 = leftHorn.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(81, 26).addBox(9.375F, 1.9179F, 8.5283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2973F, -0.2181F, -0.6221F));

		PartDefinition cube_r300 = leftHorn.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 39).addBox(7.0828F, 1.9179F, 8.3688F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2901F, -0.0092F, -0.6855F));

		PartDefinition cube_r301 = leftHorn.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(65, 29).addBox(9.2687F, 1.3497F, 4.7215F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3444F, -0.5222F, -0.439F));

		PartDefinition cube_r302 = leftHorn.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 57).addBox(6.9591F, 1.3497F, 7.0341F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3004F, -0.1491F, -0.5701F));

		PartDefinition cube_r303 = leftHorn.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(65, 32).addBox(7.1791F, 0.2087F, 4.6892F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3412F, -0.4529F, -0.2803F));

		PartDefinition cube_r304 = leftHorn.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(65, 53).addBox(6.8937F, 0.2087F, 5.0689F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3236F, -0.3291F, -0.3265F));

		PartDefinition cube_r305 = leftHorn.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(80, 3).addBox(5.9903F, -0.4787F, 3.4855F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3416F, -0.474F, -0.1098F));

		PartDefinition cube_r306 = leftHorn.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(86, 74).addBox(5.1542F, 0.2131F, 1.0798F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.2179F, -0.8169F, -0.0267F));

		PartDefinition cube_r307 = leftHorn.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(65, 26).addBox(2.6699F, -0.2713F, -0.9748F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.3855F, -1.1387F, 0.3404F));

		PartDefinition cube_r308 = leftHorn.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(68, 16).addBox(-0.1878F, -0.377F, -0.4957F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2727F, 1.0879F, 0.4002F, -0.1872F, -0.9682F, 0.2632F));

		PartDefinition cube_r309 = leftHorn.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(84, 38).addBox(-0.875F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.3948F, -0.1999F, -0.0221F, -0.0141F, -0.5671F));

		PartDefinition cube_r310 = leftHorn.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(84, 41).addBox(-1.1F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftHorn.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(96, 82).addBox(4.5502F, 6.5912F, 0.3093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(19, 82).addBox(0.9684F, 7.1713F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, -1.6597F, -0.1724F, -0.7048F));

		PartDefinition cube_r312 = leftHorn.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(81, 32).addBox(0.3779F, 7.6596F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, -1.6694F, -0.4765F, -0.6747F));

		PartDefinition cube_r313 = leftHorn.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(87, 6).addBox(0.6859F, 6.9833F, -0.4298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.305F, 1.5882F, 2.0876F, -0.895F, -0.213F, -1.1214F));

		PartDefinition cube_r314 = leftHorn.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(70, 81).addBox(4.0707F, 4.1754F, -0.4298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.305F, 1.5882F, 2.0876F, -0.8448F, 0.4004F, -0.6204F));

		PartDefinition cube_r315 = leftHorn.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(52, 15).addBox(2.1693F, 1.0539F, -0.4298F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.305F, 1.5882F, 2.0876F, -0.5312F, 0.7826F, -0.0774F));

		PartDefinition cube_r316 = leftHorn.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(67, 38).addBox(-0.028F, -0.5437F, -0.4395F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.305F, 1.5882F, 2.0876F, 0.1784F, 0.9005F, 0.8434F));

		PartDefinition cube_r317 = leftHorn.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(15, 85).addBox(1.7191F, 6.3451F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, -1.6598F, 0.1753F, -0.7356F));

		PartDefinition cube_r318 = leftHorn.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(87, 3).addBox(3.5878F, 4.0369F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, -1.6946F, 0.783F, -0.8076F));

		PartDefinition cube_r319 = leftHorn.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(87, 0).addBox(3.6903F, 1.2049F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, -1.9885F, 1.3533F, -1.129F));

		PartDefinition cube_r320 = leftHorn.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(86, 71).addBox(2.246F, -1.3595F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, 1.7869F, 1.1505F, 2.6194F));

		PartDefinition cube_r321 = leftHorn.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(50, 65).addBox(-0.2235F, -0.2914F, -0.1085F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9245F, -0.0336F, -0.6473F, -0.4597F, 1.4607F, 0.4226F));

		PartDefinition cube_r322 = leftHorn.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(65, 35).addBox(-0.1749F, -0.7374F, -0.219F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8538F, 0.5948F, -0.4977F, 0.0289F, -0.2807F, 0.339F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1071F, -3.5212F, -1.9208F, 0.039F, 0.1033F, 0.6845F));

		PartDefinition cube_r323 = rightHorn.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 77).mirror().addBox(-13.4136F, -0.4787F, 0.3334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.6117F, 1.0251F, -0.2694F));

		PartDefinition cube_r324 = rightHorn.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(81, 23).mirror().addBox(-10.6012F, -0.4787F, -5.5654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -1.7675F, 1.262F, -1.5063F));

		PartDefinition cube_r325 = rightHorn.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-9.5802F, -0.4787F, -3.5743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -1.1093F, 1.2315F, -0.8148F));

		PartDefinition cube_r326 = rightHorn.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(86, 53).mirror().addBox(-9.1805F, -0.4787F, -0.0436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.5395F, 0.9518F, -0.183F));

		PartDefinition cube_r327 = rightHorn.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(61, 22).mirror().addBox(-13.6789F, 1.9179F, 7.0262F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3004F, 0.2598F, 0.6088F));

		PartDefinition cube_r328 = rightHorn.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-6.0822F, 1.6261F, 13.6339F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2633F, -0.849F, 0.774F));

		PartDefinition cube_r329 = rightHorn.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-20.6962F, -6.2888F, 1.9193F, 0.2562F, -0.907F, 0.2535F));

		PartDefinition cube_r330 = rightHorn.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(-17.8547F, 7.1105F, 10.3987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0685F, -0.6027F, 0.7344F));

		PartDefinition cube_r331 = rightHorn.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(-18.9079F, 7.1105F, 6.5143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0608F, -0.385F, 0.7504F));

		PartDefinition cube_r332 = rightHorn.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-18.8993F, 2.046F, 7.9234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.2022F, -0.429F, 0.4362F));

		PartDefinition cube_r333 = rightHorn.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(95, 33).mirror().addBox(-19.0156F, 6.4135F, 16.3388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(93, 73).mirror().addBox(-19.0156F, 6.4135F, 15.5388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0586F, -0.6488F, 0.7015F));

		PartDefinition cube_r334 = rightHorn.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-18.737F, 6.4135F, 17.0269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0656F, -0.7795F, 0.6908F));

		PartDefinition cube_r335 = rightHorn.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(10.4992F, 6.4135F, 21.2763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 3.0399F, -1.0936F, -2.3142F));

		PartDefinition cube_r336 = rightHorn.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(-4.3937F, 6.4135F, 23.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.3323F, -1.4273F, 0.4078F));

		PartDefinition cube_r337 = rightHorn.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-23.2694F, 6.4135F, 6.6532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0489F, -0.3002F, 0.7225F));

		PartDefinition cube_r338 = rightHorn.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(93, 70).mirror().addBox(-11.8013F, 6.4135F, 19.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(93, 67).mirror().addBox(-11.8013F, 6.4135F, 18.8127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0761F, -0.91F, 0.6768F));

		PartDefinition cube_r339 = rightHorn.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-16.9874F, 6.4135F, 12.8183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0568F, -0.6053F, 0.7046F));

		PartDefinition cube_r340 = rightHorn.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-18.4879F, 6.4135F, -11.6354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.054F, 0.5278F, 0.7642F));

		PartDefinition cube_r341 = rightHorn.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-21.1105F, 6.4135F, 2.1312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.047F, -0.1259F, 0.731F));

		PartDefinition cube_r342 = rightHorn.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(11, 47).mirror().addBox(-7.1771F, 6.4135F, 19.6665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.1754F, -1.3002F, 0.5678F));

		PartDefinition cube_r343 = rightHorn.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(95, 46).mirror().addBox(0.142F, 7.359F, 23.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(95, 25).mirror().addBox(0.142F, 7.359F, 22.4082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 2.8445F, -1.4041F, -2.0668F));

		PartDefinition cube_r344 = rightHorn.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(7.8275F, 7.359F, 20.1795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 3.042F, -1.0601F, -2.2731F));

		PartDefinition cube_r345 = rightHorn.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(2.307F, 7.359F, 19.9968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 2.9451F, -1.3193F, -2.1695F));

		PartDefinition cube_r346 = rightHorn.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-10.5443F, 7.359F, 17.2545F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.1221F, -1.1604F, 0.6695F));

		PartDefinition cube_r347 = rightHorn.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-19.7643F, 6.4135F, 5.1968F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0504F, -0.3874F, 0.7179F));

		PartDefinition cube_r348 = rightHorn.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-17.1893F, 2.046F, 9.5079F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.2231F, -0.5997F, 0.3939F));

		PartDefinition cube_r349 = rightHorn.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-13.3178F, 0.7917F, 12.3842F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.2214F, -0.7798F, 0.3F));

		PartDefinition cube_r350 = rightHorn.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-12.2068F, 1.4312F, 11.6171F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.011F, -0.7203F, 0.5016F));

		PartDefinition cube_r351 = rightHorn.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-5.6027F, 1.4312F, 14.4031F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 44).mirror().addBox(-6.8027F, 1.4312F, 15.6031F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, 0.0172F, -1.0693F, 0.4938F));

		PartDefinition cube_r352 = rightHorn.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(29, 51).mirror().addBox(5.6682F, 1.6261F, 15.7389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -1.0793F, -1.3745F, 1.6455F));

		PartDefinition cube_r353 = rightHorn.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(4.8444F, 1.6261F, 16.5353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -1.2922F, -1.391F, 1.8623F));

		PartDefinition cube_r354 = rightHorn.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(13, 31).mirror().addBox(-0.8864F, 1.6261F, 14.9984F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.465F, -1.1772F, 1.0082F));

		PartDefinition cube_r355 = rightHorn.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(6.5555F, 2.9987F, 16.8025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(67, 69).mirror().addBox(6.3207F, 2.9987F, 14.2568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.6636F, -1.1763F, 1.3576F));

		PartDefinition cube_r356 = rightHorn.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(1.9412F, 2.9987F, 17.3258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.4191F, -0.9499F, 1.08F));

		PartDefinition cube_r357 = rightHorn.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(15.1097F, 2.9987F, -1.2317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.7975F, -0.7929F, -2.6592F));

		PartDefinition cube_r358 = rightHorn.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(9.1533F, 2.9987F, 12.7156F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.9678F, -1.2792F, 1.6799F));

		PartDefinition cube_r359 = rightHorn.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(18.7476F, 2.9987F, 2.2852F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.6801F, -1.0102F, -2.8078F));

		PartDefinition cube_r360 = rightHorn.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(86, 56).mirror().addBox(18.7321F, 2.9987F, -9.3388F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.8719F, -0.4763F, -2.5353F));

		PartDefinition cube_r361 = rightHorn.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(15.9407F, 2.9987F, -16.5804F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.9015F, -0.096F, -2.4327F));

		PartDefinition cube_r362 = rightHorn.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(8.6784F, 2.9987F, -21.086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.8952F, 0.243F, -2.3488F));

		PartDefinition cube_r363 = rightHorn.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(96, 42).mirror().addBox(15.115F, 2.9987F, -16.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.9002F, -0.1383F, -2.4431F));

		PartDefinition cube_r364 = rightHorn.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(93, 30).mirror().addBox(19.5722F, 2.9987F, -8.2679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.8584F, -0.5603F, -2.5627F));

		PartDefinition cube_r365 = rightHorn.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(71, 95).mirror().addBox(20.2185F, 2.9987F, -0.1553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.7339F, -0.931F, -2.7428F));

		PartDefinition cube_r366 = rightHorn.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(15.9968F, 2.9987F, 9.2174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.0255F, -1.3041F, 2.7722F));

		PartDefinition cube_r367 = rightHorn.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(14.1911F, 2.9987F, 7.0423F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.3644F, -1.2265F, 3.127F));

		PartDefinition cube_r368 = rightHorn.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(59, 65).mirror().addBox(-7.0869F, 2.9987F, 14.6173F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(32, 4).mirror().addBox(-7.7869F, 2.9987F, 15.2173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2613F, -0.412F, 0.8391F));

		PartDefinition cube_r369 = rightHorn.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(19, 78).mirror().addBox(8.5397F, 0.9458F, 16.2647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -1.5162F, -1.3769F, 2.0571F));

		PartDefinition cube_r370 = rightHorn.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(1.5585F, 0.9458F, 17.8325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.4631F, -1.1257F, 0.9654F));

		PartDefinition cube_r371 = rightHorn.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(15.8464F, 0.9458F, 4.8244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -2.8259F, -0.9025F, -2.8506F));

		PartDefinition cube_r372 = rightHorn.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(9.6407F, 0.9458F, 14.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -1.9428F, -1.3628F, 2.4922F));

		PartDefinition cube_r373 = rightHorn.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(17, 18).mirror().addBox(-7.3667F, 0.9458F, 12.6848F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2484F, -0.6722F, 0.6986F));

		PartDefinition cube_r374 = rightHorn.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-6.5212F, 2.2789F, 11.8216F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3171F, -0.4741F, 0.8627F));

		PartDefinition cube_r375 = rightHorn.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(41, 23).mirror().addBox(-9.0159F, 1.9179F, 9.7197F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2938F, -0.158F, 0.7358F));

		PartDefinition cube_r376 = rightHorn.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-11.375F, 1.9179F, 8.5283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2973F, 0.2181F, 0.6221F));

		PartDefinition cube_r377 = rightHorn.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-9.0828F, 1.9179F, 8.3688F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2901F, 0.0092F, 0.6855F));

		PartDefinition cube_r378 = rightHorn.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-12.2687F, 1.3497F, 4.7215F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3444F, 0.5222F, 0.439F));

		PartDefinition cube_r379 = rightHorn.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-8.9591F, 1.3497F, 7.0341F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3004F, 0.1491F, 0.5701F));

		PartDefinition cube_r380 = rightHorn.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(-10.1791F, 0.2087F, 4.6892F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3412F, 0.4529F, 0.2803F));

		PartDefinition cube_r381 = rightHorn.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-9.8937F, 0.2087F, 5.0689F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3236F, 0.3291F, 0.3265F));

		PartDefinition cube_r382 = rightHorn.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-7.9903F, -0.4787F, 3.4855F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3416F, 0.474F, 0.1098F));

		PartDefinition cube_r383 = rightHorn.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(86, 74).mirror().addBox(-7.1542F, 0.2131F, 1.0798F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.2179F, 0.8169F, 0.0267F));

		PartDefinition cube_r384 = rightHorn.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-5.6699F, -0.2713F, -0.9748F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.3855F, 1.1387F, -0.3404F));

		PartDefinition cube_r385 = rightHorn.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(68, 16).mirror().addBox(-2.8122F, -0.377F, -0.4957F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2727F, 1.0879F, 0.4002F, -0.1872F, 0.9682F, -0.2632F));

		PartDefinition cube_r386 = rightHorn.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-1.125F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.3948F, -0.1999F, -0.0221F, 0.0141F, 0.5671F));

		PartDefinition cube_r387 = rightHorn.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-0.9F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r388 = rightHorn.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(-5.5502F, 6.5912F, 0.3093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(19, 82).mirror().addBox(-2.9684F, 7.1713F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, -1.6597F, 0.1724F, 0.7048F));

		PartDefinition cube_r389 = rightHorn.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-2.3779F, 7.6596F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, -1.6694F, 0.4765F, 0.6747F));

		PartDefinition cube_r390 = rightHorn.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-2.6859F, 6.9833F, -0.4298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.305F, 1.5882F, 2.0876F, -0.895F, 0.213F, 1.1214F));

		PartDefinition cube_r391 = rightHorn.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-6.0707F, 4.1754F, -0.4298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.305F, 1.5882F, 2.0876F, -0.8448F, -0.4004F, 0.6204F));

		PartDefinition cube_r392 = rightHorn.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(52, 15).mirror().addBox(-6.1693F, 1.0539F, -0.4298F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.305F, 1.5882F, 2.0876F, -0.5312F, -0.7826F, 0.0774F));

		PartDefinition cube_r393 = rightHorn.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-2.972F, -0.5437F, -0.4395F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.305F, 1.5882F, 2.0876F, 0.1784F, -0.9005F, -0.8434F));

		PartDefinition cube_r394 = rightHorn.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-3.7191F, 6.3451F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, -1.6598F, -0.1753F, 0.7356F));

		PartDefinition cube_r395 = rightHorn.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(-5.5878F, 4.0369F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, -1.6946F, -0.783F, 0.8076F));

		PartDefinition cube_r396 = rightHorn.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-5.6903F, 1.2049F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, -1.9885F, -1.3533F, 1.129F));

		PartDefinition cube_r397 = rightHorn.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(86, 71).mirror().addBox(-4.246F, -1.3595F, 0.3093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, 1.7869F, -1.1505F, -2.6194F));

		PartDefinition cube_r398 = rightHorn.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-2.7765F, -0.2914F, -0.1085F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9245F, -0.0336F, -0.6473F, -0.4597F, -1.4607F, -0.4226F));

		PartDefinition cube_r399 = rightHorn.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-2.8251F, -0.7374F, -0.219F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8538F, 0.5948F, -0.4977F, 0.0289F, 0.2807F, -0.339F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(91, 96).addBox(1.0509F, -0.688F, -2.8397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6359F, -0.4097F, 1.845F, 0.4969F, 0.3097F, 0.1638F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(14, 56).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0641F, -0.2998F, 0.3287F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(52, 42).addBox(0.2F, -0.688F, -2.819F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(-0.6359F, -0.4097F, 1.845F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(74, 31).addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0274F, -4.4708F, 8.0683F, 0.8715F, -0.5105F, -0.3073F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(30, 74).addBox(-0.5737F, -0.5767F, -0.2931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -2.6521F, 5.557F, 0.9431F, 0.0308F, 0.0424F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5081F, -0.4108F, -0.3313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.9521F, 6.357F, 0.5229F, -0.1039F, 0.0128F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(79, 77).addBox(-0.5F, -0.994F, -0.3167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -2.6521F, 5.557F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(52, 23).addBox(-0.6136F, -0.9766F, -2.6833F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8336F, -2.8265F, 4.7739F, 0.7104F, 0.4364F, 0.1028F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(47, 32).addBox(-0.6F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(33, 79).addBox(-0.6F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.138F, -2.7594F, 4.9074F, 0.5476F, 0.2663F, 0.6698F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(41, 60).addBox(-0.9917F, -0.1961F, -0.326F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1898F, 5.4038F, -2.3221F, 0.3869F, 0.3335F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(23, 60).addBox(-1.2914F, -0.2973F, -1.9862F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1898F, 5.4038F, -2.1972F, 0.1247F, -0.2182F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(86, 96).addBox(-0.5489F, -0.0222F, -1.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.1037F, -4.1898F, 5.4038F, 0.5814F, 0.4892F, 0.2996F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(59, 18).addBox(-1.1859F, -0.3337F, -1.1383F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1898F, 5.4038F, -2.1088F, -0.0663F, -0.5828F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(74, 23).addBox(-0.0504F, -0.7738F, -1.4979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1898F, 5.4038F, 2.1213F, 0.1838F, 0.0968F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(91, 96).mirror().addBox(-2.0509F, -0.688F, -2.8397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6359F, -0.4097F, 1.845F, 0.4969F, -0.3097F, -0.1638F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -0.2998F, 0.3287F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(52, 42).mirror().addBox(-1.2F, -0.688F, -2.819F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(0.6359F, -0.4097F, 1.845F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(74, 31).mirror().addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0274F, -4.4708F, 8.0683F, 0.8715F, 0.5105F, 0.3073F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-0.4263F, -0.5767F, -0.2931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -2.6521F, 5.557F, 0.9431F, -0.0308F, -0.0424F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.4919F, -0.4108F, -0.3313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.9521F, 6.357F, 0.5229F, 0.1039F, -0.0128F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-0.5F, -0.994F, -0.3167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -2.6521F, 5.557F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(52, 23).mirror().addBox(-0.3864F, -0.9766F, -2.6833F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, -2.8265F, 4.7739F, 0.7104F, -0.4364F, -0.1028F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(47, 32).mirror().addBox(-0.4F, -0.3F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(33, 79).mirror().addBox(-0.4F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.138F, -2.7594F, 4.9074F, 0.5476F, -0.2663F, -0.6698F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(41, 60).mirror().addBox(-1.0083F, -0.1961F, -0.326F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1898F, 5.4038F, -2.3221F, -0.3869F, -0.3335F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-0.7086F, -0.2973F, -1.9862F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1898F, 5.4038F, -2.1972F, -0.1247F, 0.2182F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(86, 96).mirror().addBox(-0.4511F, -0.0222F, -1.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1898F, 5.4038F, 0.5814F, -0.4892F, -0.2996F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(-0.8141F, -0.3337F, -1.1383F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1898F, 5.4038F, -2.1088F, 0.0663F, 0.5828F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-0.9496F, -0.7738F, -1.4979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1898F, 5.4038F, 2.1213F, -0.1838F, -0.0968F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(66, 95).addBox(0.0F, 1.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 6).addBox(0.0F, 2.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.827F, -2.7584F, -1.2623F, -0.2652F, -0.0884F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(51, 91).mirror().addBox(-0.35F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 91).mirror().addBox(-0.35F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(51, 91).addBox(2.25F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 91).addBox(2.25F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(41, 86).mirror().addBox(-0.35F, 0.0118F, -0.7861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(41, 86).addBox(2.25F, 0.0118F, -0.7861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-0.35F, 0.3142F, 0.1718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 61).addBox(2.25F, 0.3142F, 0.1718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-0.35F, -0.0061F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(57, 12).addBox(2.25F, -0.0061F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(17, 88).mirror().addBox(-0.35F, -0.2324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(17, 88).addBox(2.25F, -0.2324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-0.25F, 0.2234F, 0.4284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(87, 63).addBox(2.15F, 0.2234F, 0.4284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(96, 16).mirror().addBox(-0.35F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 94).mirror().addBox(-0.35F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 16).addBox(2.25F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 94).addBox(2.25F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-0.35F, -0.9757F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(91, 42).addBox(2.25F, -0.9757F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.2774F, -3.5389F, 0.4824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 19).mirror().addBox(-0.1774F, -3.3389F, 0.0824F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7247F, 4.2874F, -4.5452F, -0.9596F, -0.1679F, -0.1431F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(41, 90).mirror().addBox(-0.1566F, -1.8819F, -0.3216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7247F, 4.2874F, -4.5452F, -1.41F, -0.2174F, -0.1605F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(23, 98).mirror().addBox(-0.0561F, -2.2503F, -0.6187F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7247F, 4.2874F, -4.5452F, -1.269F, -0.2085F, -0.1834F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(-0.1566F, -1.8346F, -0.3312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7247F, 4.2874F, -4.5452F, -1.3577F, -0.2174F, -0.1605F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(79, 87).mirror().addBox(-0.2774F, -3.7273F, 0.0317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7247F, 4.2874F, -4.5452F, -1.2389F, -0.1679F, -0.1431F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(41, 90).addBox(-0.8434F, -1.8819F, -0.3216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7247F, 4.2874F, -4.5452F, -1.41F, 0.2174F, 0.1605F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(96, 59).addBox(-1.0F, -1.0012F, -0.9073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 5.6237F, -7.662F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(61, 94).addBox(-1.0F, -0.4005F, -0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(40, 94).addBox(-1.0F, -0.8005F, -0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.9135F, -7.1183F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(55, 95).addBox(-0.3951F, 1.2856F, -0.3376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5919F, 3.8947F, -3.3501F, -1.2701F, 0.1783F, 0.0867F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(94, 3).addBox(-1.0F, 2.7634F, -1.3988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.827F, -2.7584F, -1.2623F, 0.2652F, 0.0884F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(23, 98).addBox(0.0561F, -2.2503F, -0.6187F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7247F, 4.2874F, -4.5452F, -1.269F, 0.2085F, 0.1834F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(90, 34).addBox(-0.8434F, -1.8346F, -0.3312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7247F, 4.2874F, -4.5452F, -1.3577F, 0.2174F, 0.1605F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(98, 19).addBox(0.1774F, -3.3389F, 0.0824F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 90).addBox(-0.7227F, -3.5389F, 0.4824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7247F, 4.2874F, -4.5452F, -0.9596F, 0.1679F, 0.1431F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(79, 87).addBox(-0.7227F, -3.7273F, 0.0317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7247F, 4.2874F, -4.5452F, -1.2389F, 0.1679F, 0.1431F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 46).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(68, 65).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.2356F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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