package fossils.fossils.client.blockentity.model.sinclairomeryx;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinclairomeryxFossilModel extends SkullModelBase {
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
	private final ModelPart leftFace;
	private final ModelPart leftHorn;
	private final ModelPart rightFace;
	private final ModelPart rightHorn;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;

	public SinclairomeryxFossilModel(ModelPart root) {
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
		this.leftFace = this.head.getChild("leftFace");
		this.leftHorn = this.leftFace.getChild("leftHorn");
		this.rightFace = this.head.getChild("rightFace");
		this.rightHorn = this.rightFace.getChild("rightHorn");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 4.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.28F, 8.1369F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 49).addBox(0.0F, -0.1F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.509F, -1.1252F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(-0.6905F, -2.0445F, -0.5691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -1.6993F, -0.1936F, -0.8385F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.0478F, -1.405F, 1.8827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.3419F, -0.4656F, -0.4299F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(61, 62).mirror().addBox(-1.8419F, -3.7596F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -2.1138F, -0.0648F, -1.3975F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 29).mirror().addBox(-1.1186F, -0.0007F, -0.2518F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.4763F, -0.1937F, -1.1784F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-1.4393F, -3.1559F, 2.6537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.7112F, -0.122F, -0.7986F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-0.9729F, -0.2178F, -0.6486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.5169F, 0.1662F, -0.6702F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 41).mirror().addBox(-0.9883F, -0.3596F, -0.7757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, 0.1572F, -0.1073F, -0.3296F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 40).mirror().addBox(-0.7082F, 0.3153F, -2.8706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.6528F, -0.1606F, -0.5779F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 39).mirror().addBox(-1.0346F, -0.0985F, -3.1896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.5219F, -0.1763F, -0.3407F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(0.0018F, -1.5855F, -3.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.0074F, 0.1239F, -0.5536F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 83).mirror().addBox(0.0018F, 1.1159F, -3.5669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.9673F, 0.1239F, -0.5536F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 74).mirror().addBox(0.0018F, -1.4459F, -4.5091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7679F, 0.7623F, 0.4298F, -0.3128F, 0.1239F, -0.5536F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 53).addBox(-0.3095F, -2.0445F, -0.5691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -1.6993F, 0.1936F, 0.8385F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 53).addBox(-0.9522F, -1.405F, 1.8827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.3419F, 0.4656F, 0.4299F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(61, 62).addBox(0.8419F, -3.7596F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -2.1138F, 0.0648F, 1.3975F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 29).addBox(0.1186F, -0.0007F, -0.2518F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.4763F, 0.1937F, 1.1784F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(5, 75).addBox(0.4393F, -3.1559F, 2.6537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.7112F, 0.122F, 0.7986F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(58, 24).addBox(-0.0271F, -0.2178F, -0.6486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.5169F, -0.1662F, 0.6702F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 41).addBox(-0.0117F, -0.3596F, -0.7757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, 0.1572F, 0.1073F, 0.3296F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(19, 40).addBox(-0.2918F, 0.3153F, -2.8706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.6528F, 0.1606F, 0.5779F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 39).addBox(0.0346F, -0.0985F, -3.1896F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.5219F, 0.1763F, 0.3407F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(80, 50).addBox(-1.0018F, -1.5855F, -3.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.0074F, -0.1239F, 0.5536F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 83).addBox(-1.0018F, 1.1159F, -3.5669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.9673F, -0.1239F, 0.5536F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 74).addBox(-1.0018F, -1.4459F, -4.5091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7679F, 0.7623F, 0.4298F, -0.3128F, -0.1239F, 0.5536F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 13).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.0765F, 1.5178F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(7, 57).addBox(-1.0F, -0.6047F, -0.4173F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 42).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 70).addBox(-1.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.996F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(51, 82).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(35, 58).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(60, 70).addBox(-1.5F, -0.9994F, -1.4845F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 46).addBox(-1.5F, -0.3994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 45).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9944F, 0.2414F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 64).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(27, 72).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(65, 36).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(83, 18).addBox(-1.9F, 3.5521F, -0.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(12, 61).addBox(-1.9F, 0.0521F, -0.9978F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.428F, 0.2695F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 61).addBox(-1.9F, -1.0479F, -0.9978F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 15).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2047F, -1.8569F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 57).addBox(-1.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(49, 58).addBox(-0.6F, -0.1857F, -1.7932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 8.7492F, -0.7306F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(21, 57).addBox(6.6299F, -0.5F, 0.0021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r47 = leftLeg4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r48 = leftLeg4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.1857F, -1.7932F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.5893F, -2.4816F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(28, 53).addBox(8.0001F, 0.2042F, 1.1492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.5103F, -0.4353F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r50 = leftLeg5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 54).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.5103F, -0.4353F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r51 = leftLeg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(17, 65).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.5103F, -0.4353F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r52 = leftLeg5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(63, 53).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.5103F, -0.4353F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.0765F, 1.5178F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(7, 50).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 20).addBox(-1.0F, -0.6047F, -0.4173F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(5, 70).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(71, 10).addBox(0.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.996F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 82).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(42, 58).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 70).addBox(-0.5F, -0.9994F, -1.4845F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(9, 46).addBox(-0.5F, -0.3994F, -1.9845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.1963F, 0.7935F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 2).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9944F, 0.2414F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(72, 31).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 28).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 4).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(38, 83).addBox(0.9F, 3.5521F, -0.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(45, 62).addBox(0.9F, 0.0521F, -0.9978F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 5.428F, 0.2695F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(61, 10).addBox(0.9F, -1.0479F, -0.9978F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 19).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1904F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2047F, -1.8569F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 35).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 61).addBox(-0.4F, -0.1857F, -1.7932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 8.7492F, -0.7306F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(57, 49).addBox(-7.6299F, -0.5F, 0.0021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r71 = rightLeg4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(63, 28).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r72 = rightLeg4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(83, 47).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.1857F, -1.7932F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.5893F, -2.4816F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(53, 34).addBox(-9.0001F, 0.2042F, 1.1492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.5103F, -0.4353F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r74 = rightLeg5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(42, 54).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.5103F, -0.4353F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r75 = rightLeg5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 32).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.5103F, -0.4353F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r76 = rightLeg5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 47).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.5103F, -0.4353F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 86).addBox(0.0F, -1.4751F, 0.983F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -1.9002F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(10, 87).addBox(0.0F, -1.5751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -1.9002F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 39).addBox(0.0F, -1.3577F, -1.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -3.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(38, 86).mirror().addBox(-0.1349F, -0.5038F, -2.2771F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 86).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -2.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(58, 85).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -4.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(28, 86).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -6.4553F, -2.9115F, 0.0828F, -2.2244F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(38, 86).addBox(0.1349F, -0.5038F, -2.2771F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 86).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -2.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(58, 85).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -4.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(28, 86).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -6.4553F, -2.9115F, -0.0828F, 2.2244F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(13, 87).addBox(-0.5753F, -0.9995F, -0.4826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -6.4553F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, 0.1048F, -0.0434F, -0.0046F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(79, 2).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0707F, -0.4048F, 0.0416F, 0.1566F, -0.6097F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2707F, -2.4048F, -0.0659F, 0.0809F, -0.6225F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2707F, -2.4048F, -0.0846F, 0.0611F, -0.8842F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2707F, -2.4048F, -0.1032F, 0.0152F, -1.3624F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -4.4048F, -0.0231F, 0.1113F, -0.6184F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -4.4048F, -0.0923F, 0.0664F, -1.3619F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -4.4048F, -0.0512F, 0.1015F, -0.8815F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(79, 2).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0707F, -0.4048F, 0.0416F, -0.1566F, 0.6097F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 23).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2707F, -2.4048F, -0.0659F, -0.0809F, 0.6225F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(79, 25).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2707F, -2.4048F, -0.0846F, -0.0611F, 0.8842F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(79, 4).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2707F, -2.4048F, -0.1032F, -0.0152F, 1.3624F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 0).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -4.4048F, -0.0231F, -0.1113F, 0.6184F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 0).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -4.4048F, -0.0923F, -0.0664F, 1.3619F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(44, 78).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -4.4048F, -0.0512F, -0.1015F, 0.8815F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(86, 24).addBox(0.0F, -0.8939F, -0.146F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -0.8045F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(87, 53).addBox(0.0F, -1.0938F, -0.046F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -2.8596F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(41, 86).addBox(0.0F, -1.2698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -4.9596F, 0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(0.1F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4443F, 11.4316F, -2.4528F, -0.3096F, -0.576F, -2.1593F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(0.4F, 0.0F, 0.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4443F, 11.4316F, -2.4528F, -0.427F, -0.5991F, -1.9694F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(21, 9).mirror().addBox(0.1F, 0.0F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4443F, 11.4316F, -2.4528F, -0.2131F, -0.4472F, -2.3437F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(28, 25).mirror().addBox(-0.3F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4443F, 11.4316F, -2.4528F, -0.0987F, -0.3243F, -2.5923F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0617F, 0.174F, -0.5542F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0141F, 0.184F, -0.8201F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(34, 2).mirror().addBox(-8.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, -0.0734F, 0.1695F, -1.3076F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9004F, 3.1997F, -7.7094F, -0.1917F, -0.1369F, 0.2495F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(-0.2955F, -2.705F, -1.3063F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 0.9685F, 0.2346F, 0.0713F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(-0.8608F, -3.6747F, 1.3817F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.0281F, -0.162F, 0.2342F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(75, 72).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2365F, 3.9559F, -6.7822F, 1.1154F, -0.162F, 0.2342F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-0.8608F, -6.5116F, -0.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 9.0839F, -6.6869F, 0.3125F, -0.162F, 0.2342F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0698F, 4.2724F, -8.2241F, 1.4644F, -0.162F, 0.2342F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.8608F, -2.3739F, 2.8247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.6215F, -0.162F, 0.2342F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(11, 29).mirror().addBox(-0.8608F, -3.2286F, -1.8058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.2899F, -0.162F, 0.2342F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.293F, 11.0035F, -8.4018F, 0.1111F, -0.1679F, -2.737F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(15, 27).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, -0.0499F, 0.2537F, -1.3026F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, 0.0754F, 0.2475F, -0.8069F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, 0.1377F, 0.2194F, -0.5393F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(28, 23).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -4.4F, -0.0574F, 0.2375F, -1.3393F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -4.4F, 0.0609F, 0.2366F, -0.8452F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -4.4F, 0.1208F, 0.2127F, -0.5778F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-6.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -9.5F, -0.0161F, 0.2715F, -1.6747F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(27, 75).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -9.5F, 0.1138F, 0.2476F, -1.1784F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -9.5F, 0.1745F, 0.2097F, -0.9124F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(34, 4).mirror().addBox(-8.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3F, -7.5F, -0.0554F, 0.2023F, -1.4956F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3F, -7.5F, 0.0456F, 0.2047F, -1.0053F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(74, 70).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3F, -7.5F, 0.0975F, 0.1859F, -0.7391F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(74, 42).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, -5.6F, 0.0919F, 0.1923F, -0.6708F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, -5.6F, 0.0384F, 0.2095F, -0.9375F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-0.5F, 0.0F, -0.7F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4443F, 11.4316F, -2.4528F, -0.043F, -0.1612F, -2.7659F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(46, 39).mirror().addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4188F, 11.4614F, -4.9011F, -0.0281F, -0.2778F, -2.9979F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4958F, 11.3367F, -6.4173F, 0.0631F, -0.1785F, -3.0225F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(28, 21).mirror().addBox(-9.1795F, -2.6157F, -0.785F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, -5.6F, -0.0641F, 0.2032F, -1.428F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.8608F, -2.5562F, -2.0072F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 1.1154F, -0.162F, 0.2342F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(-0.8608F, -2.8097F, 0.2803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 0.7925F, -0.162F, 0.2342F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.8608F, -2.5151F, 2.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 8.0839F, -6.6869F, 0.9147F, -0.162F, 0.2342F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(34, 2).addBox(3.1393F, -2.68F, -0.1571F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, -0.0734F, -0.1695F, 1.3076F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 7).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0141F, -0.184F, 0.8201F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(72, 37).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0617F, -0.174F, 0.5542F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(35, 84).addBox(0.0F, -1.4965F, -0.0068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0271F, -1.0821F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 79).addBox(0.0F, -2.2965F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8078F, -3.0187F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 80).addBox(0.0F, -2.6854F, -0.0869F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.464F, -4.6849F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(80, 56).addBox(0.0F, -2.7854F, 0.013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2812F, -6.5454F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(20, 84).addBox(0.0F, -2.816F, 0.0852F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1401F, -8.4587F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(15, 21).addBox(-0.7045F, -2.705F, -1.3063F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 0.9685F, -0.2346F, -0.0713F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 49).addBox(-0.1392F, -3.6747F, 1.3817F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.0281F, 0.162F, -0.2342F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 72).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2365F, 3.9559F, -6.7822F, 1.1154F, 0.162F, -0.2342F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(83, 15).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9004F, 3.1997F, -7.7094F, -0.1917F, 0.1369F, -0.2495F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(83, 9).addBox(-0.1392F, -6.5116F, -0.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.1F, 9.0839F, -6.6869F, 0.3125F, 0.162F, -0.2342F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(10, 77).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0698F, 4.2724F, -8.2241F, 1.4644F, 0.162F, -0.2342F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 77).addBox(-0.1392F, -2.3739F, 2.8247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.6215F, 0.162F, -0.2342F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(11, 29).addBox(-0.1392F, -3.2286F, -1.8058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.2899F, 0.162F, -0.2342F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(76, 13).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.293F, 11.0035F, -8.4018F, 0.1111F, 0.1679F, 2.737F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(15, 27).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, -0.0499F, -0.2537F, 1.3026F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(73, 59).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, 0.0754F, -0.2475F, 0.8069F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 68).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.8F, 0.1377F, -0.2194F, 0.5393F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 23).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.4F, -0.0574F, -0.2375F, 1.3393F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(76, 11).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.4F, 0.0609F, -0.2366F, 0.8452F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 54).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.4F, 0.1208F, -0.2127F, 0.5778F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 55).addBox(3.1795F, -2.6157F, -0.785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -9.5F, -0.0161F, -0.2715F, 1.6747F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(27, 75).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -9.5F, 0.1138F, -0.2476F, 1.1784F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(10, 75).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -9.5F, 0.1745F, -0.2097F, 0.9124F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(34, 4).addBox(3.1795F, -2.6157F, -0.785F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -7.5F, -0.0554F, -0.2023F, 1.4956F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 9).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -7.5F, 0.0456F, -0.2047F, 1.0053F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(74, 70).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, -7.5F, 0.0975F, -0.1859F, 0.7391F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(74, 42).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -5.6F, 0.0919F, -0.1923F, 0.6708F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(74, 44).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -5.6F, 0.0384F, -0.2095F, 0.9375F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(21, 0).addBox(-8.1F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4443F, 11.4316F, -2.4528F, -0.3096F, 0.576F, 2.1593F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(19, 11).addBox(-10.4F, 0.0F, 0.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4443F, 11.4316F, -2.4528F, -0.427F, 0.5991F, 1.9694F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(21, 9).addBox(-7.1F, 0.0F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4443F, 11.4316F, -2.4528F, -0.2131F, 0.4472F, 2.3437F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(28, 25).addBox(-5.7F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4443F, 11.4316F, -2.4528F, -0.0987F, 0.3243F, 2.5923F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(34, 6).addBox(-4.5F, 0.0F, -0.7F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4443F, 11.4316F, -2.4528F, -0.043F, 0.1612F, 2.7659F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(46, 39).addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4188F, 11.4614F, -4.9011F, -0.0281F, 0.2778F, 2.9979F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(71, 86).addBox(-0.005F, -2.78F, -0.4764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9839F, -9.9701F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(23, 87).addBox(0.0F, -0.8672F, -0.2888F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9839F, -9.9701F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 0).addBox(-2.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4958F, 11.3367F, -6.4173F, 0.0631F, 0.1785F, 3.0225F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(28, 21).addBox(3.1795F, -2.6157F, -0.785F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -5.6F, -0.0641F, -0.2032F, 1.428F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 29).addBox(-0.1392F, -2.5562F, -2.0072F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 1.1154F, 0.162F, -0.2342F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(19, 35).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(28, 57).addBox(-0.1392F, -2.8097F, 0.2803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 0.7925F, 0.162F, -0.2342F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(82, 53).addBox(-0.1392F, -2.5151F, 2.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9F, 8.0839F, -6.6869F, 0.9147F, 0.162F, -0.2342F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(33, 27).addBox(-1.1328F, 1.5592F, 4.5028F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 9.9332F, -10.237F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(21, 2).addBox(-1.1328F, -0.0306F, 0.0782F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 9.9332F, -10.237F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1855F, -8.9515F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9956F, 10.3173F, -9.2559F, 1.1067F, 0.2752F, 0.0168F));

		PartDefinition cube_r191 = leftarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(64, 16).addBox(-0.0018F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 1.4398F, 0.0014F, -0.001F));

		PartDefinition cube_r192 = leftarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(65, 77).addBox(0.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.1535F, 0.4938F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r193 = leftarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(66, 10).addBox(0.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 75).addBox(0.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.1867F, 2.6698F, -1.9354F, 0.0305F, 0.1273F));

		PartDefinition cube_r196 = leftarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(85, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.8729F, -0.2661F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r197 = leftarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 58).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.9713F, -0.6163F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r198 = leftarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(17, 72).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r199 = leftarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(28, 35).addBox(-0.018F, -1.9885F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, 1.5708F, 1.4661F, -1.5708F));

		PartDefinition cube_r200 = leftarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(38, 80).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r201 = leftarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(83, 12).addBox(0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, 0.1485F, 0.6635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r202 = leftarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 62).addBox(-1.9973F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -1.1856F, 0.6517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(43, 17).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.0123F, 0.575F, 1.7453F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4862F, 0.1163F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftArm4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(56, 54).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3232F, 3.4573F, -0.4036F, 0.8793F, 0.1517F, 0.0866F));

		PartDefinition cube_r204 = leftArm4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3232F, 3.4573F, -0.4036F, 0.5302F, 0.1517F, 0.0866F));

		PartDefinition cube_r205 = leftArm4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 45).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.4036F, 0.8793F, -0.1517F, -0.0866F));

		PartDefinition cube_r206 = leftArm4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(55, 41).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.4036F, 0.5302F, -0.1517F, -0.0866F));

		PartDefinition cube_r207 = leftArm4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(53, 75).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r208 = leftArm4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(34, 75).addBox(5.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8232F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r209 = leftArm4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(81, 41).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.125F, -0.8136F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftArm4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(39, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3545F, -0.1306F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9956F, 10.3173F, -9.2559F, 0.7209F, -0.0583F, 0.1173F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(64, 20).addBox(-0.9982F, -0.0429F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 1.4398F, -0.0014F, 0.001F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.1535F, 0.4938F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(31, 66).addBox(-1.0F, 0.1039F, 0.0366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 27).addBox(-1.0F, -1.3F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(81, 6).addBox(-1.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.1867F, 2.6698F, -0.7573F, -0.0305F, -0.1273F));

		PartDefinition cube_r216 = rightarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(85, 81).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 0.8729F, -0.2661F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(60, 33).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.9713F, -0.6163F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(22, 72).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r219 = rightarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 73).addBox(-0.982F, -1.9885F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, 1.5708F, -1.4661F, 1.5708F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(43, 80).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r221 = rightarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(30, 83).addBox(-1.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, 0.1485F, 0.6635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r222 = rightarm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(69, 39).addBox(-0.0027F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -1.1856F, 0.6517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(44, 26).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.0123F, 0.575F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4862F, 0.1163F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightArm4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3232F, 3.4573F, -0.4036F, 0.8793F, -0.1517F, -0.0866F));

		PartDefinition cube_r224 = rightArm4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(57, 16).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3232F, 3.4573F, -0.4036F, 0.5302F, -0.1517F, -0.0866F));

		PartDefinition cube_r225 = rightArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(56, 29).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.4036F, 0.8793F, 0.1517F, 0.0866F));

		PartDefinition cube_r226 = rightArm4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(56, 2).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.4036F, 0.5302F, 0.1517F, 0.0866F));

		PartDefinition cube_r227 = rightArm4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(75, 61).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.895F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r228 = rightArm4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(75, 50).addBox(-6.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8232F, 0.895F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r229 = rightArm4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(63, 81).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.125F, -0.8136F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightArm4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(75, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3545F, -0.1306F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7063F, -10.8368F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r231 = neck3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(87, 27).addBox(0.0F, -1.1F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(44, 86).addBox(0.0F, -1.6836F, -0.1044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6601F, -0.4975F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(33, 33).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, -0.2791F, -0.3295F, -0.0368F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(28, 69).addBox(0.0F, -0.6681F, 0.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 38).addBox(0.0F, -0.6681F, 2.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 39).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1565F, -1.5193F, -0.085F, -0.359F, -0.3449F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(78, 46).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.4F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(43, 68).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2365F, -1.5677F, 1.1375F, -0.4789F, -0.12F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(70, 51).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(36, 70).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6246F, -0.0123F, -0.8287F, -0.2125F, -0.0491F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, -2.3054F, -1.8855F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.4777F, -2.5664F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(5, 83).addBox(-1.2F, -1.528F, -1.0539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.7F, 1.9594F, -6.6725F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(81, 69).addBox(-0.5F, -0.8499F, -1.9303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2609F, -7.2414F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 69).addBox(-1.0F, -0.334F, -0.8969F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 69).addBox(-1.0F, -0.334F, -1.4969F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8833F, -6.7751F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(68, 81).addBox(-0.5F, -0.6863F, -1.4098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2609F, -7.2414F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 56).addBox(-1.0F, -0.5656F, -2.4576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 61).addBox(-0.5F, -0.539F, -2.1501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.4817F, -6.829F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(50, 49).addBox(-0.5F, -1.739F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.9245F, -7.2806F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(17, 61).addBox(-1.0F, -0.3321F, -2.4708F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9653F, -4.843F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(45, 13).addBox(-1.0F, -0.0082F, -1.5033F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9737F, -4.8882F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(27, 49).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.8871F, -0.618F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(62, 43).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.9187F, -2.3089F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(60, 6).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.331F, -1.4998F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(71, 65).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(19, 45).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.2133F, -1.4718F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(46, 41).addBox(-0.5F, -0.9036F, -1.4697F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9395F, -2.7322F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(72, 24).addBox(-0.5F, -1.2177F, -1.0578F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.0275F, -3.6132F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(49, 25).addBox(-0.5F, 0.2F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -0.8871F, -0.618F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(51, 9).addBox(-2.5F, -0.0882F, 0.0343F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0342F, -1.6182F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(71, 18).addBox(-2.5F, -0.5226F, -1.8445F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -0.117F, -3.1526F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(48, 71).addBox(-2.5F, -0.3792F, -1.9084F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, -0.7731F, -2.3979F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(34, 13).addBox(-2.5F, -0.0454F, -1.9657F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.1477F, -1.4707F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -0.3295F, -0.9245F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7965F, -4.0595F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(71, 15).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3502F, 0.4896F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(16, 87).addBox(0.0F, -0.0123F, -1.0197F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0324F, 0.2633F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 78).addBox(-0.006F, -0.0268F, -1.966F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.81F, -0.7568F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(41, 73).addBox(-1.0F, 0.0079F, 0.0208F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8598F, -0.3954F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(62, 39).addBox(-1.0F, -0.9F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2261F, 0.2029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(51, 6).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.814F, -0.3716F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 4.4013F, -7.8154F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(61, 84).addBox(-0.7538F, -0.4361F, -0.3252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.2F, 0.4788F, 0.3125F, 0.1582F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(42, 8).addBox(-0.6359F, -1.6782F, -2.1989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.0F, -0.4576F, 1.0627F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(38, 62).addBox(-0.6359F, -0.4776F, -1.6736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2145F)), PartPose.offsetAndRotation(0.0F, -1.9338F, 0.6523F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(84, 33).addBox(-0.6359F, -1.0282F, -1.4399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)), PartPose.offsetAndRotation(0.0F, -1.5193F, 0.3727F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 30).addBox(-0.6359F, -1.1528F, -1.3443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)), PartPose.offsetAndRotation(0.0F, -1.0778F, 0.138F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(84, 36).addBox(-0.5F, -0.5336F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)), PartPose.offsetAndRotation(-0.1359F, 0.2058F, -1.5026F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(80, 61).addBox(-0.6359F, -0.9244F, -1.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)), PartPose.offsetAndRotation(0.0F, -0.7171F, -0.0617F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(10, 35).addBox(-0.6359F, -1.8361F, -0.5389F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(0.0F, -0.4118F, 0.5818F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(37, 44).addBox(-0.6359F, -0.4361F, 0.1612F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.2F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4215F, -5.0414F, 7.2541F, 0.2263F, -0.7257F, -0.095F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(64, 66).addBox(-0.5522F, -0.6253F, -0.2037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1921F, -3.8054F, 5.9654F, 0.8634F, -0.273F, -0.0595F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(85, 50).addBox(-0.5F, -0.6F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 85).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 85).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1641F, -3.2334F, 5.4097F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(66, 84).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1641F, -3.5496F, 5.4149F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(28, 44).addBox(-0.2F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.16F, -2.5772F, 3.0209F, 0.5866F, 0.2075F, -0.0664F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(65, 24).addBox(-0.5F, -0.5008F, -1.0122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.7133F, -2.9724F, 4.5202F, 0.386F, 0.6747F, 0.2515F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(23, 84).addBox(-0.7638F, -0.4267F, 0.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1641F, -1.1177F, 1.8786F, 0.1571F, 0.2793F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(20, 77).addBox(-0.7638F, -1.443F, -0.8384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1641F, -1.1177F, 1.8786F, 0.0262F, 0.2793F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(25, 77).addBox(-0.6072F, -1.3416F, -1.6479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.074F, -1.9437F, 4.1123F, 0.473F, -0.029F, -0.1704F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(49, 29).addBox(-0.6018F, -1.5968F, -0.8876F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.074F, -1.9437F, 4.1123F, 0.784F, 0.0078F, -0.1873F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(78, 84).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1966F, -0.7391F, 3.291F, 0.3337F, 0.0535F, -0.1419F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(83, 84).addBox(-0.7638F, -0.0832F, 0.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 85).addBox(-0.7638F, -0.0832F, -0.7815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1641F, -1.1177F, 1.8786F, 0.0524F, 0.2793F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(51, 79).addBox(-0.6072F, -0.1552F, -1.1681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.074F, -1.9437F, 4.1123F, 0.7872F, -0.029F, -0.1704F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(61, 58).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7133F, -2.9724F, 4.5202F, 0.2639F, 0.6747F, 0.2515F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(48, 17).addBox(-1.7F, -0.8F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8862F, -4.5956F, 3.6325F, -2.0331F, 0.4382F, 0.0683F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(24, 65).addBox(-0.5083F, -0.596F, -0.461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2641F, -3.75F, 4.2495F, 0.5861F, 0.1753F, 0.1153F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(10, 72).addBox(-1.3725F, -0.74F, -1.4309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6744F, -4.7153F, 4.046F, -3.0812F, 0.4429F, -0.0142F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(72, 34).addBox(-1.0571F, -0.6728F, -1.0045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3744F, -4.7153F, 4.046F, -2.7925F, 0.4304F, 0.1087F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(71, 21).addBox(-1.1697F, -0.5908F, -0.8507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3744F, -4.5153F, 3.846F, -2.6035F, 0.4048F, 0.1855F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(34, 17).addBox(-0.9027F, -0.7264F, -2.0649F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2914F, -4.8455F, 4.4346F, -2.7168F, -0.0749F, -0.1005F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(18, 49).addBox(-0.7228F, -0.6978F, -1.0872F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2914F, -4.8455F, 4.4346F, -2.6531F, -0.4481F, -0.2625F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(85, 59).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.251F, -3.9881F, 5.1147F, 2.5675F, 0.1727F, 0.1156F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(36, 66).addBox(-0.5062F, -0.0781F, -1.2026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1921F, -4.1054F, 4.6654F, 1.7821F, 0.1727F, 0.1156F));

		PartDefinition leftHorn = leftFace.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.837F, -4.6665F, 4.793F, 1.2502F, 0.1545F, -0.9242F));

		PartDefinition cube_r297 = leftHorn.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(67, 7).addBox(-0.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.022F, -0.3373F, 0.008F, 0.343F, -0.1317F, 0.3524F));

		PartDefinition cube_r298 = leftHorn.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(20, 81).addBox(0.4295F, -0.1527F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(15, 81).addBox(-0.2705F, -0.1527F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(3.589F, -2.2167F, -0.7103F, -0.0861F, 0.3567F, -1.6736F));

		PartDefinition cube_r299 = leftHorn.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(80, 78).addBox(1.1299F, -0.4991F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.5236F, -0.4429F, -0.0325F, 0.0301F, 0.3653F, -1.3471F));

		PartDefinition cube_r300 = leftHorn.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(10, 81).addBox(0.4871F, -0.7664F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(3.5236F, -0.4429F, -0.0325F, 0.1212F, 0.3468F, -1.1394F));

		PartDefinition cube_r301 = leftHorn.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(80, 81).addBox(-0.2F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.5236F, -0.4429F, -0.0325F, 0.1868F, 0.3172F, -0.9387F));

		PartDefinition cube_r302 = leftHorn.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(25, 81).addBox(-0.2F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(3.0598F, 0.0466F, 0.1553F, 0.2491F, 0.2717F, -0.8123F));

		PartDefinition cube_r303 = leftHorn.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(75, 80).addBox(-0.1F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.2969F, 0.2901F, 0.2488F, 0.3322F, 0.1578F, -0.4273F));

		PartDefinition cube_r304 = leftHorn.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(7, 67).addBox(-1.5F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.9371F, 0.0802F, 0.1682F, 0.3665F, 0.0031F, -0.0081F));

		PartDefinition cube_r305 = leftHorn.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(80, 72).addBox(0.0F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.5174F, 0.4581F, 0.3133F, 0.3579F, 0.0807F, -0.2123F));

		PartDefinition cube_r306 = leftHorn.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(48, 68).addBox(0.0F, 0.2336F, -0.6584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3624F, -0.0561F, 0.1468F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 4.4013F, -7.8154F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(61, 84).mirror().addBox(-0.2462F, -0.4361F, -0.3252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -2.2F, 0.4788F, -0.3125F, -0.1582F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(42, 8).mirror().addBox(-0.3641F, -1.6782F, -2.1989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4576F, 1.0627F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-0.3641F, -0.4776F, -1.6736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2145F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9338F, 0.6523F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-0.3641F, -1.0282F, -1.4399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5193F, 0.3727F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-0.3641F, -1.1528F, -1.3443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0778F, 0.138F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-0.5F, -0.5336F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)).mirror(false), PartPose.offsetAndRotation(0.1359F, 0.2058F, -1.5026F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-0.3641F, -0.9244F, -1.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2145F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7171F, -0.0617F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(10, 35).mirror().addBox(-0.3641F, -1.8361F, -0.5389F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4118F, 0.5818F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(37, 44).mirror().addBox(-0.3641F, -0.4361F, 0.1612F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -2.2F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4215F, -5.0414F, 7.2541F, 0.2263F, 0.7257F, 0.095F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-0.4478F, -0.6253F, -0.2037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1921F, -3.8054F, 5.9654F, 0.8634F, 0.273F, 0.0595F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-0.5F, -0.6F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 85).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 85).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1641F, -3.2334F, 5.4097F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(66, 84).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1641F, -3.5496F, 5.4149F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(28, 44).mirror().addBox(-0.8F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.16F, -2.5772F, 3.0209F, 0.5866F, -0.2075F, 0.0664F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-0.5F, -0.5008F, -1.0122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.7133F, -2.9724F, 4.5202F, 0.386F, -0.6747F, -0.2515F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(23, 84).mirror().addBox(-0.2362F, -0.4267F, 0.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -1.1177F, 1.8786F, 0.1571F, -0.2793F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.2362F, -1.443F, -0.8384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -1.1177F, 1.8786F, 0.0262F, -0.2793F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(-0.3928F, -1.3416F, -1.6479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.074F, -1.9437F, 4.1123F, 0.473F, 0.029F, 0.1704F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(49, 29).mirror().addBox(-0.3982F, -1.5968F, -0.8876F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.074F, -1.9437F, 4.1123F, 0.784F, -0.0078F, 0.1873F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(78, 84).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1966F, -0.7391F, 3.291F, 0.3337F, -0.0535F, 0.1419F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-0.2362F, -0.0832F, 0.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 85).mirror().addBox(-0.2362F, -0.0832F, -0.7815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -1.1177F, 1.8786F, 0.0524F, -0.2793F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(51, 79).mirror().addBox(-0.3928F, -0.1552F, -1.1681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.074F, -1.9437F, 4.1123F, 0.7872F, 0.029F, 0.1704F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7133F, -2.9724F, 4.5202F, 0.2639F, -0.6747F, -0.2515F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(48, 17).mirror().addBox(-0.3F, -0.8F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8862F, -4.5956F, 3.6325F, -2.0331F, -0.4382F, -0.0683F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(24, 65).mirror().addBox(-0.4917F, -0.596F, -0.461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2641F, -3.75F, 4.2495F, 0.5861F, -0.1753F, -0.1153F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-0.6275F, -0.74F, -1.4309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6744F, -4.7153F, 4.046F, -3.0812F, -0.4429F, 0.0142F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(72, 34).mirror().addBox(-0.9429F, -0.6728F, -1.0045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3744F, -4.7153F, 4.046F, -2.7925F, -0.4304F, -0.1087F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-0.8303F, -0.5908F, -0.8507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3744F, -4.5153F, 3.846F, -2.6035F, -0.4048F, -0.1855F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(34, 17).mirror().addBox(-1.0973F, -0.7264F, -2.0649F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2914F, -4.8455F, 4.4346F, -2.7168F, 0.0749F, 0.1005F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(-1.2772F, -0.6978F, -1.0872F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2914F, -4.8455F, 4.4346F, -2.6531F, 0.4481F, 0.2625F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.251F, -3.9881F, 5.1147F, 2.5675F, -0.1727F, -0.1156F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(36, 66).mirror().addBox(-0.4938F, -0.0781F, -1.2026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1921F, -4.1054F, 4.6654F, 1.7821F, -0.1727F, -0.1156F));

		PartDefinition rightHorn = rightFace.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.837F, -4.6665F, 4.793F, 1.2502F, -0.1545F, 0.9242F));

		PartDefinition cube_r339 = rightHorn.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(67, 7).mirror().addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.022F, -0.3373F, 0.008F, 0.343F, 0.1317F, -0.3524F));

		PartDefinition cube_r340 = rightHorn.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-1.4295F, -0.1527F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(15, 81).mirror().addBox(-0.7295F, -0.1527F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-3.589F, -2.2167F, -0.7103F, -0.0861F, -0.3567F, 1.6736F));

		PartDefinition cube_r341 = rightHorn.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(80, 78).mirror().addBox(-2.1299F, -0.4991F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.5236F, -0.4429F, -0.0325F, 0.0301F, -0.3653F, 1.3471F));

		PartDefinition cube_r342 = rightHorn.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-1.4871F, -0.7664F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-3.5236F, -0.4429F, -0.0325F, 0.1212F, -0.3468F, 1.1394F));

		PartDefinition cube_r343 = rightHorn.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.8F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.5236F, -0.4429F, -0.0325F, 0.1868F, -0.3172F, 0.9387F));

		PartDefinition cube_r344 = rightHorn.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.8F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-3.0598F, 0.0466F, 0.1553F, 0.2491F, -0.2717F, 0.8123F));

		PartDefinition cube_r345 = rightHorn.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(-0.9F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.2969F, 0.2901F, 0.2488F, 0.3322F, -0.1578F, 0.4273F));

		PartDefinition cube_r346 = rightHorn.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-0.5F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.9371F, 0.0802F, 0.1682F, 0.3665F, -0.0031F, 0.0081F));

		PartDefinition cube_r347 = rightHorn.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(-1.0F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.5174F, 0.4581F, 0.3133F, 0.3579F, -0.0807F, 0.2123F));

		PartDefinition cube_r348 = rightHorn.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(48, 68).mirror().addBox(-2.0F, 0.2336F, -0.6584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3624F, 0.0561F, -0.1468F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0568F, -1.3894F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.35F, -1.4999F, -0.2352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(30, 79).addBox(2.45F, -1.4999F, -0.2352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.55F, -0.3991F, -0.7343F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.35F, -1.8999F, -1.0352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 31).mirror().addBox(-0.35F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(5, 79).addBox(2.45F, -1.8999F, -1.0352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 31).addBox(2.45F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(73, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.542F, 4.6379F, -4.1282F, -1.6093F, -0.0914F, -0.0856F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(83, 64).mirror().addBox(-0.5392F, -0.5743F, 0.0941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5575F, 3.8512F, -4.2645F, -1.4871F, -0.0914F, -0.0856F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-0.5F, -3.1465F, -0.1656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(60, 73).mirror().addBox(-0.5F, -2.9465F, -0.1656F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2962F, -8.4895F, -1.5708F, -0.1222F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.4187F, -1.1016F, -1.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3054F, 4.9974F, -5.5112F, -1.6812F, -0.2652F, -0.0884F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.5187F, -0.2016F, -0.209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.3738F, 4.1009F, -5.5517F, -1.2623F, -0.2652F, -0.0884F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-0.4187F, -1.1016F, -0.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3738F, 4.1009F, -5.5517F, -1.5241F, -0.2652F, -0.0884F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(86, 67).mirror().addBox(0.2267F, -1.1542F, -0.6953F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0212F, 4.3185F, -4.5756F, -1.4431F, -0.1869F, -0.1216F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(14, 50).mirror().addBox(0.0158F, -1.584F, -0.3506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 8).mirror().addBox(0.0158F, -0.584F, -0.3506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1839F, 3.6827F, -3.0636F, -1.2438F, -0.0415F, -0.0696F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-0.2752F, -2.5642F, 0.3806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.671F, -3.1353F, -0.982F, -0.0415F, -0.0696F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-0.35F, 0.0118F, -0.7861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(86, 21).addBox(2.45F, 0.0118F, -0.7861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(31, 62).mirror().addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 62).addBox(2.3F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 2.5935F, 0.221F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(85, 75).addBox(2.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4F, 1.8186F, 0.1994F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -0.3535F, -0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(86, 0).addBox(2.3F, -0.3535F, -0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4F, 2.5442F, -0.9451F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(78, 65).addBox(2.1F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3F, 3.1299F, 0.8597F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(58, 78).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(58, 78).addBox(2.1F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3F, 3.6208F, -0.5343F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(74, 3).mirror().addBox(-0.2728F, -1.9427F, -1.0188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9491F, 4.7834F, -1.6924F, -1.1303F, -0.0463F, -0.0666F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.2728F, 0.0573F, -1.0188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9491F, 4.7834F, -1.6924F, -1.3485F, -0.0463F, -0.0666F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-0.2729F, -0.0427F, -0.4188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9974F, 3.9104F, -1.9059F, -1.331F, -0.0463F, -0.0666F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.35F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 6).mirror().addBox(-0.35F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 86).addBox(2.45F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 6).addBox(2.45F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.55F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-0.35F, -0.0757F, -0.8414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(79, 35).addBox(2.45F, -0.0757F, -0.8414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.55F, 0.4767F, 0.2431F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(73, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.542F, 4.6379F, -4.1282F, -1.6093F, 0.0914F, 0.0856F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(83, 64).addBox(-0.4608F, -0.5743F, 0.0941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5575F, 3.8512F, -4.2645F, -1.4871F, 0.0914F, 0.0856F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(85, 72).addBox(-0.5F, 0.9092F, -2.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.8962F, -6.2895F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(86, 3).addBox(-0.5F, -3.1465F, -0.1656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(60, 73).addBox(-0.5F, -2.9465F, -0.1656F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.2962F, -8.4895F, -1.5708F, 0.1222F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5813F, -1.1016F, -1.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3054F, 4.9974F, -5.5112F, -1.6812F, 0.2652F, 0.0884F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(10, 84).addBox(-0.4813F, -0.2016F, -0.209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.3738F, 4.1009F, -5.5517F, -1.2623F, 0.2652F, 0.0884F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(83, 56).addBox(-0.5813F, -1.1016F, -0.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3738F, 4.1009F, -5.5517F, -1.5241F, 0.2652F, 0.0884F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(86, 67).addBox(-0.2267F, -1.1542F, -0.6953F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0212F, 4.3185F, -4.5756F, -1.4431F, 0.1869F, 0.1216F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(14, 50).addBox(-0.0158F, -1.584F, -0.3506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 8).addBox(-0.0158F, -0.584F, -0.3506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1839F, 3.6827F, -3.0636F, -1.2438F, 0.0415F, 0.0696F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(77, 27).addBox(-0.7248F, -2.5642F, 0.3806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.671F, -3.1353F, -0.982F, 0.0415F, 0.0696F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(74, 3).addBox(-0.7271F, -1.9427F, -1.0188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9491F, 4.7834F, -1.6924F, -1.1303F, 0.0463F, 0.0666F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 74).addBox(-0.7271F, 0.0573F, -1.0188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9491F, 4.7834F, -1.6924F, -1.3485F, 0.0463F, 0.0666F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(70, 73).addBox(-0.7271F, -0.0427F, -0.4188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9974F, 3.9104F, -1.9059F, -1.331F, 0.0463F, 0.0666F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 54).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2262F, 2.7023F, -0.4418F, 0.1646F, -0.1326F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(54, 12).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0331F, 1.8714F, -0.192F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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