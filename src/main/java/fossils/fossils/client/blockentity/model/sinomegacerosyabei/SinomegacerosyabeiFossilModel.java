package fossils.fossils.client.blockentity.model.sinomegacerosyabei;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinomegacerosyabeiFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
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
	private final ModelPart bone;
	private final ModelPart bone3;
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

	public SinomegacerosyabeiFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
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
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.9546F, 13.2623F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 57).addBox(0.0F, -1.4F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 58).addBox(0.0F, -1.7201F, -1.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 58).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 89).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5958F, 1.6453F, 2.3425F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 41).addBox(0.1156F, -0.1514F, 0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7719F, 0.2709F, 0.8218F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 89).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1237F, 0.8615F, 1.6428F, -0.6151F, 0.4805F, 0.675F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(31, 33).addBox(-0.425F, -0.7F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9895F, 0.5175F, 0.9201F, 0.3782F, 0.5068F, 0.379F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 20).addBox(-0.525F, -0.3F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5777F, 1.7309F, 0.9835F, -2.0131F, 0.1311F, 1.3154F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(37, 26).addBox(0.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.518F, 0.2903F, 1.1684F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 81).addBox(-0.65F, -2.6F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6595F, 1.6065F, 1.7245F, -0.6389F, 0.2492F, 0.8582F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 4).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 0.5918F, -2.7014F, -0.5993F, -0.1007F, 0.6811F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(93, 9).addBox(-0.5F, 0.05F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8218F, 0.0979F, -0.1972F, -0.9464F, 0.1406F, 0.3173F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 32).addBox(-0.9721F, -1.1596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(47, 39).addBox(-0.9721F, -0.7596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7884F, 0.5918F, -2.7014F, -0.0737F, 0.1406F, 0.3173F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 49).addBox(-0.7096F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.7426F, 0.2171F, 0.561F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 25).addBox(-0.7096F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.6228F, 0.2103F, 0.3213F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(83, 91).addBox(-0.6163F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.0966F, -0.0684F, 0.5622F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(93, 82).addBox(-0.6163F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -1.0566F, -0.0684F, 0.5622F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 87).addBox(-0.6163F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.4021F, -0.0684F, 0.5622F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.5958F, 1.6453F, 2.3425F));

		PartDefinition cube_r22 = bone4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(67, 41).mirror().addBox(-1.1156F, -0.1514F, 0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7719F, -0.2709F, -0.8218F));

		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(61, 89).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1237F, 0.8615F, 1.6428F, -0.6151F, -0.4805F, -0.675F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-0.575F, -0.7F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9895F, 0.5175F, 0.9201F, 0.3782F, -0.5068F, -0.379F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-0.475F, -0.3F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5777F, 1.7309F, 0.9835F, -2.0131F, -0.1311F, -1.3154F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(37, 26).mirror().addBox(-1.4812F, 0.7002F, -2.0253F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.518F, -0.2903F, -1.1684F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 81).mirror().addBox(-0.35F, -2.6F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6595F, 1.6065F, 1.7245F, -0.6389F, -0.2492F, -0.8582F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.5918F, -2.7014F, -0.5993F, 0.1007F, -0.6811F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-0.5F, 0.05F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8218F, 0.0979F, -0.1972F, -0.9464F, -0.1406F, -0.3173F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.0279F, -1.1596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(47, 39).mirror().addBox(-0.0279F, -0.7596F, -0.0796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.5918F, -2.7014F, -0.0737F, -0.1406F, -0.3173F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(-0.2904F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.7426F, -0.2171F, -0.561F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-0.2904F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.6228F, -0.2103F, -0.3213F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 91).mirror().addBox(-0.3837F, -0.3979F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.0966F, 0.0684F, -0.5622F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-0.3837F, -0.594F, -0.92F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -1.0566F, 0.0684F, -0.5622F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 87).mirror().addBox(-0.3837F, -1.1911F, -1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.4021F, 0.0684F, -0.5622F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.933F, 1.2639F, -0.6329F, -0.0777F, -0.1054F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(56, 5).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(79, 34).addBox(-1.0F, 0.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(21, 69).addBox(-1.0F, -0.7047F, -0.5174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(46, 83).addBox(-1.0F, -0.0026F, 0.3896F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 69).addBox(-1.0F, -1.6026F, -1.0104F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(39, 92).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(82, 22).addBox(-1.0F, 0.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(39, 20).addBox(-1.5F, -0.4994F, -2.4845F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.1963F, 0.7935F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 63).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3416F, -0.6251F, 0.8795F, -0.0673F, 0.0556F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(12, 73).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 10).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(12, 81).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 48).addBox(-1.9F, -1.0479F, -0.9978F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 90).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1905F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6192F, -0.9751F, -1.273F, -0.0834F, -0.0256F));

		PartDefinition cube_r51 = leftLeg3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(31, 39).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(25, 50).addBox(-0.6F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 8.5595F, -0.8489F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 77).addBox(6.6299F, -0.5F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r54 = leftLeg4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 73).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, 0.2142F, -4.7932F));

		PartDefinition cube_r55 = leftLeg5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 75).addBox(8.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r56 = leftLeg5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 74).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r57 = leftLeg5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 38).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r58 = leftLeg5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.933F, 1.2639F, 0.2337F, -0.0305F, 0.1273F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(56, 35).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 79).addBox(-1.0F, 0.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 51).addBox(-1.0F, -0.7047F, -0.5174F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 54).addBox(0.0F, -0.0026F, 0.3896F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(7, 73).addBox(0.0F, -1.6026F, -1.0104F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 42).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(83, 51).addBox(-1.0F, 0.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F, -0.4994F, -2.4845F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.1963F, 0.7935F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 33).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7785F, 0.8234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3416F, -0.6251F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(33, 73).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(86, 30).addBox(-1.0F, -0.9955F, -0.0315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(19, 81).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(78, 48).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 49).addBox(0.9F, -1.0479F, -0.9978F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -1.9974F, -0.0981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1905F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6192F, -0.9751F, -1.5793F, -0.0446F, 0.0098F));

		PartDefinition cube_r74 = rightLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(36, 81).addBox(0.0F, -3.5136F, -1.1894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(11, 41).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(51, 51).addBox(-0.4F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 8.5595F, -0.8489F, 1.4588F, -0.0355F, -0.0798F));

		PartDefinition cube_r76 = rightLeg4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 44).addBox(-7.6299F, -0.5F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r77 = rightLeg4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(56, 73).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2142F, -4.7932F));

		PartDefinition cube_r78 = rightLeg5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(79, 0).addBox(-9.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r79 = rightLeg5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(33, 77).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r80 = rightLeg5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(61, 79).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r81 = rightLeg5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(79, 30).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(94, 94).addBox(0.0F, -1.5751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(44, 94).addBox(0.0F, -1.7577F, -1.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(94, 62).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(16, 41).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.1768F, -0.0455F, -0.7611F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.1593F, -0.0895F, -1.0197F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.1002F, -0.1528F, -1.4992F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 62).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 69).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(16, 41).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(88, 72).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.1768F, 0.0455F, 0.7611F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(89, 16).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.1593F, 0.0895F, 1.0197F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 30).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.1002F, 0.1528F, 1.4992F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 94).addBox(-0.5753F, -1.7995F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4553F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(64, 94).addBox(-0.4485F, -1.8943F, -0.4457F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.4806F, -7.4243F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(89, 7).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.044F, 0.0809F, -0.6714F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0635F, 0.0668F, -0.9336F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0871F, 0.03F, -1.4127F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.0056F, 0.1315F, -0.6149F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(27, 91).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0288F, 0.1284F, -0.8789F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 18).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0851F, 0.1006F, -1.3613F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.0344F, 0.1516F, -0.6108F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 16).mirror().addBox(-9.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0777F, 0.1347F, -1.3605F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0063F, 0.1553F, -0.8758F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(89, 7).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.044F, -0.0809F, 0.6714F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(89, 18).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0635F, -0.0668F, 0.9336F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 42).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0871F, -0.03F, 1.4127F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 91).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.0056F, -0.1315F, 0.6149F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(27, 91).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0288F, -0.1284F, 0.8789F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 18).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0851F, -0.1006F, 1.3613F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(90, 28).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.0344F, -0.1516F, 0.6108F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(30, 16).addBox(3.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0777F, -0.1347F, 1.3605F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(10, 91).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0063F, -0.1553F, 0.8758F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.3F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(94, 36).addBox(0.0F, -1.5938F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(88, 94).addBox(0.0F, -1.8938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(35, 93).addBox(0.0F, -2.5698F, -0.0541F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3529F, -6.8577F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(41, 86).addBox(0.0F, -3.398F, -0.0557F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2437F, -0.9064F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(80, 84).addBox(-0.005F, -5.0461F, 0.0097F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0485F, -8.0877F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(85, 94).addBox(0.0F, -0.7353F, -4.5625F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7485F, -3.7877F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(17, 91).addBox(-0.005F, -5.1427F, -0.5115F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 23).addBox(0.0F, -1.2463F, -0.1497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(86, 3).addBox(-0.005F, -6.1427F, -0.5115F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4485F, -4.6877F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -1.2463F, -0.1497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4485F, -4.6877F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(58, 84).addBox(-0.005F, -4.9505F, 0.0069F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4515F, -6.2877F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(82, 94).addBox(0.0F, -1.9424F, -0.2228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5485F, -6.2877F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.0541F, 0.1695F, -0.5555F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, -0.0757F, 0.1611F, -1.3079F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(51, 87).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.008F, 0.1776F, -0.8212F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-9.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, -0.0779F, 0.1526F, -1.3083F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(15, 87).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.002F, 0.1712F, -0.8222F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.0466F, 0.1648F, -0.5567F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(42, 37).mirror().addBox(-8.1981F, -2.5957F, -0.7812F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4485F, -3.7877F, -0.0935F, 0.0844F, -1.3451F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 54).mirror().addBox(-4.0565F, -0.8091F, -0.7812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4485F, -3.7877F, -0.0439F, 0.118F, -0.8638F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-2.1958F, -0.2492F, -0.7812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4485F, -3.7877F, -0.0117F, 0.1253F, -0.6001F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(87, 61).mirror().addBox(-5.1867F, -2.6424F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3485F, -8.0877F, -0.0717F, -0.0153F, -1.4971F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-4.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3485F, -8.0877F, -0.0707F, 0.0195F, -1.0184F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(87, 59).mirror().addBox(-2.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3485F, -8.0877F, -0.0632F, 0.0371F, -0.7571F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-2.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0485F, -5.9877F, -0.0517F, 0.0768F, -0.6902F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(44, 88).mirror().addBox(-3.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0485F, -5.9877F, -0.0699F, 0.0608F, -0.9521F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(17, 10).mirror().addBox(-0.5F, 0.0F, -0.6F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2192F, 10.3672F, -1.5477F, -0.3077F, -0.8532F, -2.5478F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3844F, 10.347F, -1.9084F, -0.1724F, -0.5804F, -2.7066F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 18).mirror().addBox(-0.9F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4894F, 10.3689F, -2.8794F, -0.0563F, -0.4392F, -2.803F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 12).mirror().addBox(-0.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1725F, 10.6001F, -4.6576F, 0.0077F, -0.3123F, -2.7272F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-0.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5148F, 10.3692F, -5.6344F, 0.3131F, -0.071F, -2.6275F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4958F, 10.1538F, -7.1357F, -0.015F, 0.2015F, -2.2876F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(56, 16).mirror().addBox(-7.0781F, -2.659F, -0.4744F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0485F, -5.9877F, -0.09F, 0.0218F, -1.4309F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 87).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.008F, -0.1776F, 0.8212F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(30, 14).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, -0.0757F, -0.1611F, 1.3079F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(86, 70).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.0541F, -0.1695F, 0.5555F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 12).addBox(3.1393F, -2.68F, -0.1571F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, -0.0779F, -0.1526F, 1.3083F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(15, 87).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.002F, -0.1712F, 0.8222F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(47, 10).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.0466F, -0.1648F, 0.5567F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(42, 37).addBox(3.1981F, -2.5957F, -0.7812F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4485F, -3.7877F, -0.0935F, -0.0844F, 1.3451F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(88, 54).addBox(2.0565F, -0.8091F, -0.7812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4485F, -3.7877F, -0.0439F, -0.118F, 0.8638F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(88, 56).addBox(0.1958F, -0.2492F, -0.7812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4485F, -3.7877F, -0.0117F, -0.1253F, 0.6001F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(87, 61).addBox(3.1867F, -2.6424F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3485F, -8.0877F, -0.0717F, 0.0153F, 1.4971F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(15, 89).addBox(2.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3485F, -8.0877F, -0.0707F, -0.0195F, 1.0184F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(87, 59).addBox(0.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3485F, -8.0877F, -0.0632F, -0.0371F, 0.7571F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(83, 87).addBox(0.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0485F, -5.9877F, -0.0517F, -0.0768F, 0.6902F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(44, 88).addBox(1.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0485F, -5.9877F, -0.0699F, -0.0608F, 0.9521F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(17, 10).addBox(-7.5F, 0.0F, -0.6F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2192F, 10.3672F, -1.5477F, -0.3077F, 0.8532F, 2.5478F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(19, 7).addBox(-6.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3844F, 10.347F, -1.9084F, -0.1724F, 0.5804F, 2.7066F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 18).addBox(-5.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4894F, 10.3689F, -2.8794F, -0.0563F, 0.4392F, 2.803F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(45, 12).addBox(-4.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1725F, 10.6001F, -4.6576F, 0.0077F, 0.3123F, 2.7272F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(58, 12).addBox(-3.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5148F, 10.3692F, -5.6344F, 0.3131F, 0.071F, 2.6275F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(56, 14).addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4958F, 10.1538F, -7.1357F, -0.015F, -0.2015F, 2.2876F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(56, 16).addBox(3.0781F, -2.659F, -0.4744F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0485F, -5.9877F, -0.09F, -0.0218F, 1.4309F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -0.8312F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(51, 56).addBox(-1.0F, 8.6478F, 0.4824F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7485F, -3.7877F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(36, 6).addBox(-1.1328F, -0.9549F, 0.0405F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 11.0705F, -5.324F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 8.3539F, -3.4322F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7485F, -3.7877F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.7357F, -5.7122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.7485F, -3.7877F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5444F, 4.1296F, -9.0505F, 0.4132F, 0.2464F, -0.2251F));

		PartDefinition cube_r177 = bone.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(26, 20).addBox(1.2624F, -4.3433F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.7401F, -0.3548F, 0.2451F));

		PartDefinition cube_r178 = bone.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 12).addBox(2.4F, -3.7259F, -3.8985F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r179 = bone.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(41, 81).addBox(-0.5F, -1.7F, 0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.041F, -1.3826F, 2.4728F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r180 = bone.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.041F, -3.7881F, 0.2813F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r181 = bone.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(50, 64).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.041F, 0.0234F, -0.7143F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r182 = bone.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.041F, 2.5902F, -2.2292F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r183 = bone.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(26, 26).addBox(2.4F, -4.0499F, -7.1635F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r184 = bone.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.35F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.041F, 1.3734F, -0.1392F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r185 = bone.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 8).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.041F, -1.143F, 2.8882F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r186 = bone.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(20, 33).addBox(2.4F, -1.9908F, -2.8662F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.7243F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5444F, 4.1296F, -9.0505F, 0.4132F, -0.2464F, 0.2251F));

		PartDefinition cube_r187 = bone3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(26, 20).mirror().addBox(-2.2624F, -4.3433F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.7401F, 0.3548F, -0.2451F));

		PartDefinition cube_r188 = bone3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(17, 12).mirror().addBox(-3.4F, -3.7259F, -3.8985F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r189 = bone3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(41, 81).mirror().addBox(-0.5F, -1.7F, 0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, -1.3826F, 2.4728F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r190 = bone3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, -3.7881F, 0.2813F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r191 = bone3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, 0.0234F, -0.7143F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r192 = bone3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(13, 27).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, 2.5902F, -2.2292F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r193 = bone3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(-3.4F, -4.0499F, -7.1635F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r194 = bone3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.5F, -0.35F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.3734F, -0.1392F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r195 = bone3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.041F, -1.143F, 2.8882F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r196 = bone3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 33).mirror().addBox(-3.4F, -1.9908F, -2.8662F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.7243F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 10.1767F, -10.3087F, 0.8547F, 0.0329F, -0.0286F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(83, 82).addBox(-0.0018F, -0.5429F, -0.9104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 0.8726F, 0.0007F, -0.0016F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 89).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0113F, -0.5974F, 1.1883F, -0.8989F, 0.0014F, -0.001F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(34, 89).addBox(0.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.1534F, 0.4938F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(57, 67).addBox(0.0F, 0.0539F, -0.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(9, 67).addBox(0.0F, -0.3961F, 0.2366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.872F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(93, 0).addBox(0.0F, -1.4F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(18, 64).addBox(0.0F, -0.6F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.7347F, 1.986F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(94, 3).addBox(-0.575F, -0.498F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1064F, 0.8729F, -0.2661F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(85, 25).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.9029F, -0.4284F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(24, 86).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 79).addBox(-0.018F, -2.4885F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.164F, 3.949F, 0.9053F, -1.5708F, 1.1956F, 1.5708F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(73, 79).addBox(-0.018F, -2.9884F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, -1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 87).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1236F, 0.3891F, 0.4131F, 1.5708F, 1.3439F, -1.5708F));

		PartDefinition cube_r209 = leftarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(59, 22).addBox(-1.9F, -0.75F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1236F, -1.0942F, 0.6968F, 1.5708F, -0.0611F, -1.5708F));

		PartDefinition cube_r210 = leftarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(54, 81).addBox(-1.9973F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.1856F, 0.9517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(36, 44).addBox(-0.5F, -0.7044F, -0.4286F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.5902F, 1.0043F, 1.7017F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1358F, 0.2548F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftArm4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(71, 28).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r212 = leftArm4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(37, 69).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r213 = leftArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(68, 59).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r214 = leftArm4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(67, 14).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r215 = leftArm4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(88, 82).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.8951F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r216 = leftArm4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 89).addBox(5.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8233F, 0.8951F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 10.1767F, -10.3087F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(75, 84).addBox(-0.9982F, -0.5429F, -0.9104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 0.8726F, -0.0007F, 0.0016F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(73, 89).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0113F, -0.5974F, 1.1883F, -0.8989F, -0.0014F, 0.001F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 63).addBox(-1.0F, -1.2F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.1534F, 0.4938F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r220 = rightarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 67).addBox(-1.0F, 0.0539F, -0.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(32, 67).addBox(-1.0F, -0.3961F, 0.2366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.872F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 93).addBox(-1.0F, -1.4F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 64).addBox(-1.0F, -0.6F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.7347F, 1.986F, -0.5916F, 0.0488F, 0.0724F));

		PartDefinition cube_r223 = rightarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(94, 20).addBox(-0.425F, -0.498F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1064F, 0.8729F, -0.2661F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r224 = rightarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(85, 45).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.9029F, -0.4284F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition cube_r225 = rightarm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(29, 86).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r226 = rightarm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(68, 79).addBox(-0.982F, -2.4885F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.164F, 3.949F, 0.9053F, -1.5708F, -1.1956F, -1.5708F));

		PartDefinition cube_r227 = rightarm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(78, 79).addBox(-0.982F, -2.9884F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, -1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r228 = rightarm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(10, 87).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1236F, 0.3891F, 0.4131F, 1.5708F, -1.3439F, 1.5708F));

		PartDefinition cube_r229 = rightarm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(62, 48).addBox(-1.1F, -0.75F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1236F, -1.0942F, 0.6968F, 1.5708F, 0.0611F, 1.5708F));

		PartDefinition cube_r230 = rightarm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 19).addBox(-0.0027F, -0.0113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.1856F, 0.9517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(41, 44).addBox(-0.5F, -0.7044F, -0.4286F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.5902F, 1.0043F, 1.1784F, -0.0236F, 0.057F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(82, 59).addBox(-0.5F, 0.3545F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1358F, 0.2548F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r232 = rightArm4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(44, 69).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 3.4573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r233 = rightArm4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 69).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r234 = rightArm4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(68, 18).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 3.4573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r235 = rightArm4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(89, 3).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.8951F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r236 = rightArm4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(89, 20).addBox(-6.7459F, -2.4069F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8233F, 0.8951F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5485F, -9.1877F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(91, 36).addBox(-0.005F, -3.9986F, -0.0084F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5935F, 0.3847F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(91, 94).addBox(0.0F, -2.1069F, 0.0627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7935F, -0.7153F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(56, 91).addBox(0.0F, -3.1F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(27, 45).addBox(0.0F, -2.4617F, -1.0261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(76, 94).addBox(0.0F, -1.8681F, -0.0721F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 39).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(5, 84).addBox(0.0F, -0.8F, -1.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2928F, -1.1967F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(86, 36).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(74, 12).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 54).addBox(0.0F, -4.0F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9365F, -2.1677F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.0F, -1.0F, -1.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -1.0F, -1.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6244F, -0.0227F, -1.4584F, -0.0566F, 0.2521F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, -0.9982F, -0.1143F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.4776F, -3.4664F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(62, 29).addBox(-1.0F, -0.975F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.9515F, -3.2272F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(59, 60).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 3.3586F, -5.1911F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(75, 63).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.1585F, -4.3122F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(57, 25).addBox(-1.0F, -2.7F, 3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.2811F, -9.0344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 51).addBox(-0.5F, -0.2542F, -0.2586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0424F, -6.2527F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, -0.2542F, -0.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.0164F, -7.5221F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(10, 93).addBox(-0.5F, -0.3542F, -0.1586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.5264F, -7.8537F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(61, 83).addBox(-1.0F, -0.636F, -2.3188F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 55).addBox(-0.5F, -0.7094F, -2.0112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.4264F, -6.7537F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(86, 13).addBox(-1.0F, -0.6001F, 0.1761F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1918F, -7.0665F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(10, 84).addBox(-1.0F, 0.7944F, -0.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -7.5F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(9, 63).addBox(-1.0F, 0.05F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(43, 0).addBox(-1.0F, -0.65F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.9387F, -5.6948F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 55).addBox(-1.0F, -0.1115F, -1.6021F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.2F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(23, 60).addBox(-1.0F, -0.45F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.3568F, -2.3304F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, 0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(34, 59).addBox(-0.5F, 0.8F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -1.2871F, -1.218F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(59, 18).addBox(-2.5F, 0.1296F, -1.2407F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.9491F, -2.3688F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(42, 32).addBox(-2.5F, 0.1546F, -0.2157F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.9491F, -2.3688F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(14, 59).addBox(-2.5F, 0.0418F, -1.0042F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.3965F, -3.5436F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(57, 44).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2609F, -3.6303F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(74, 67).addBox(-0.5F, -1.7019F, -0.8729F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.3F, 0.6196F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9738F, -1.439F, -3.4317F, -0.2225F, 0.4403F, -0.8508F));

		PartDefinition cube_r268 = leftHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 16).addBox(-1.6275F, -0.5348F, -0.4387F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.9306F, -5.087F, 13.0256F, 2.3436F, 0.4898F, 1.6619F));

		PartDefinition cube_r269 = leftHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(63, 37).addBox(-0.3581F, -1.0504F, 1.7191F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4645F, -3.2506F, 13.7733F, 1.0237F, 0.8811F, -0.0528F));

		PartDefinition cube_r270 = leftHorn.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(63, 8).addBox(-0.633F, -1.0504F, 1.4463F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(6.4645F, -3.2506F, 13.7733F, 0.7F, 0.567F, -0.5304F));

		PartDefinition cube_r271 = leftHorn.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(26, 73).addBox(-0.5F, -0.55F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6313F, -5.0579F, 15.5059F, 0.6061F, 0.3565F, -0.6812F));

		PartDefinition cube_r272 = leftHorn.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -0.5F, -1.05F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.347F, -4.0453F, 15.5116F, 0.6393F, -0.0579F, -0.7132F));

		PartDefinition cube_r273 = leftHorn.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(45, 14).addBox(-1.1429F, -1.0512F, 0.6616F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.7724F, -1.987F, 13.9657F, 0.8469F, -0.6813F, -1.1408F));

		PartDefinition cube_r274 = leftHorn.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 64).addBox(-4.4614F, -0.6466F, 3.6964F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.2462F, -3.2031F, 13.7843F, 0.8114F, -1.1107F, -1.2735F));

		PartDefinition cube_r275 = leftHorn.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(71, 47).addBox(0.1403F, -0.839F, -0.7188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.1497F, -0.9101F, 13.2887F, 1.034F, -0.903F, -1.4907F));

		PartDefinition cube_r276 = leftHorn.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(57, 64).addBox(1.6385F, 0.4412F, 8.7608F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.3295F, 0.0905F, -0.6273F));

		PartDefinition cube_r277 = leftHorn.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(16, 45).addBox(-0.9786F, -1.0872F, 0.0402F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7724F, -1.987F, 13.9657F, 0.6381F, 0.0122F, -0.6612F));

		PartDefinition cube_r278 = leftHorn.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(61, 86).addBox(-0.6329F, -0.5339F, -0.4153F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(7.9306F, -5.087F, 13.0256F, 0.6706F, 0.4543F, -0.8175F));

		PartDefinition cube_r279 = leftHorn.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 33).addBox(-0.1923F, -0.5339F, -0.1287F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.9306F, -5.087F, 13.0256F, 0.7783F, 0.6511F, -0.6139F));

		PartDefinition cube_r280 = leftHorn.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(82, 64).addBox(1.3871F, -1.3146F, 1.8703F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.7724F, -1.987F, 13.9657F, 0.7088F, -0.6211F, -1.0816F));

		PartDefinition cube_r281 = leftHorn.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(51, 84).addBox(-1.7942F, -0.8613F, 0.3425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(8.4033F, -7.2072F, 13.9089F, 0.5003F, 0.1649F, -1.1561F));

		PartDefinition cube_r282 = leftHorn.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(34, 86).addBox(0.3882F, -0.4281F, -0.5709F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(8.4033F, -7.2072F, 13.9089F, 0.5118F, 0.6739F, -0.991F));

		PartDefinition cube_r283 = leftHorn.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(81, 72).addBox(-1.1275F, -0.535F, -0.7405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(8.4033F, -7.2072F, 13.9089F, 0.5696F, 0.3385F, -0.9321F));

		PartDefinition cube_r284 = leftHorn.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 67).addBox(-1.2971F, -0.535F, -0.8816F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(8.4033F, -7.2072F, 13.9089F, 0.5407F, 0.1529F, -1.0505F));

		PartDefinition cube_r285 = leftHorn.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(17, 84).addBox(-0.6471F, 0.5704F, 11.0521F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.2404F, 0.9796F, -0.6121F));

		PartDefinition cube_r286 = leftHorn.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(66, 64).addBox(-1.525F, -0.5F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(8.6513F, -5.025F, 12.2208F, 0.3792F, 0.5819F, -0.4727F));

		PartDefinition cube_r287 = leftHorn.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(66, 25).addBox(2.3458F, 0.5663F, 9.805F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.3523F, 0.4596F, -0.5266F));

		PartDefinition cube_r288 = leftHorn.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 67).addBox(2.0722F, 0.4412F, 9.4461F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.3437F, 0.2966F, -0.554F));

		PartDefinition cube_r289 = leftHorn.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(46, 44).addBox(-0.4679F, -1.0504F, 0.1343F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.4645F, -3.2506F, 13.7733F, 0.6175F, 0.3524F, -0.7149F));

		PartDefinition cube_r290 = leftHorn.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(68, 84).addBox(4.3751F, 0.0219F, 6.6212F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.3508F, -0.3873F, -0.6676F));

		PartDefinition cube_r291 = leftHorn.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(66, 44).addBox(5.458F, 0.0219F, 3.4165F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.5135F, -0.8662F, -0.9361F));

		PartDefinition cube_r292 = leftHorn.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(41, 66).addBox(3.98F, -0.7709F, 0.5579F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 1.1438F, -1.3511F, -1.481F));

		PartDefinition cube_r293 = leftHorn.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(41, 63).addBox(3.771F, -0.8622F, 0.8128F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 0.7986F, -1.3159F, -1.1145F));

		PartDefinition cube_r294 = leftHorn.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(51, 48).addBox(0.205F, -1.2596F, -0.228F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.95F, 1.3579F, 4.7499F, 2.6585F, -1.458F, -2.913F));

		PartDefinition cube_r295 = leftHorn.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(5, 52).addBox(2.374F, -0.7887F, -0.6955F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.75F, 0.0579F, -0.9501F, -0.7819F, -1.2703F, 0.5152F));

		PartDefinition cube_r296 = leftHorn.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(72, 36).addBox(-1.0753F, -0.2498F, -2.1717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -0.2142F, 0.2076F, -0.1852F, 0.993F));

		PartDefinition cube_r297 = leftHorn.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(26, 77).addBox(0.5071F, -0.1809F, -4.3548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.1379F, -0.0171F, 0.5376F));

		PartDefinition cube_r298 = leftHorn.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(19, 73).addBox(-0.4397F, -0.6858F, -1.7394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -0.8674F, -0.1335F, 0.9242F));

		PartDefinition cube_r299 = leftHorn.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(78, 26).addBox(-0.3051F, -0.6858F, -1.7655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -0.8932F, -0.2448F, 1.0612F));

		PartDefinition cube_r300 = leftHorn.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(79, 4).addBox(-0.4707F, -0.1809F, -3.561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.1734F, -0.1773F, 0.8983F));

		PartDefinition cube_r301 = leftHorn.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(79, 12).addBox(-0.4047F, -0.1809F, -5.3844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 71).addBox(-0.3047F, -0.1809F, -3.5844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.208F, -0.2422F, 1.064F));

		PartDefinition cube_r302 = leftHorn.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(67, 67).addBox(-0.5005F, -0.1809F, -5.1587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 70).addBox(-0.3005F, -0.1809F, -3.6587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.2809F, -0.3266F, 1.3223F));

		PartDefinition cube_r303 = leftHorn.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(34, 54).addBox(-0.53F, -0.1809F, -3.826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.4776F, -0.4237F, 1.8477F));

		PartDefinition cube_r304 = leftHorn.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(72, 40).addBox(-0.3973F, -0.1809F, -4.8839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.3492F, -0.3753F, 1.5201F));

		PartDefinition cube_r305 = leftHorn.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(40, 77).addBox(-0.3344F, -0.6858F, -1.8799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.0648F, -0.5273F, 1.5059F));

		PartDefinition cube_r306 = leftHorn.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(69, 55).addBox(-0.3487F, -0.1809F, -3.6492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -3.7142F, -1.3327F, -0.3654F, 1.4745F));

		PartDefinition cube_r307 = leftHorn.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0196F, 0.9241F, -3.1132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3519F, 0.5067F, -0.2142F, -0.4828F, -0.1852F, 1.0786F));

		PartDefinition cube_r308 = leftHorn.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(86, 0).addBox(0.3931F, -0.4187F, 0.1664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.75F, 0.0579F, -0.9501F, -0.2507F, -0.9942F, -0.1925F));

		PartDefinition cube_r309 = leftHorn.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(83, 79).addBox(0.5191F, -0.4187F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0579F, -0.9501F, -0.3466F, -1.1613F, -0.084F));

		PartDefinition cube_r310 = leftHorn.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(85, 42).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4052F, 0.1999F, -0.0263F, 0.0872F, -0.0023F));

		PartDefinition cube_r311 = leftHorn.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(84, 75).addBox(-1.1F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9738F, -1.439F, -3.4317F, 0.0099F, -0.4671F, 0.6916F));

		PartDefinition cube_r312 = rightHorn.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(82, 16).mirror().addBox(-0.3725F, -0.5348F, -0.4387F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.9306F, -5.087F, 13.0256F, 2.3436F, -0.4898F, -1.6619F));

		PartDefinition cube_r313 = rightHorn.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(63, 37).mirror().addBox(-1.6419F, -1.0504F, 1.7191F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4645F, -3.2506F, 13.7733F, 1.0237F, -0.8811F, 0.0528F));

		PartDefinition cube_r314 = rightHorn.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-1.367F, -1.0504F, 1.4463F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-6.4645F, -3.2506F, 13.7733F, 0.7F, -0.567F, 0.5304F));

		PartDefinition cube_r315 = rightHorn.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.5F, -0.55F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.6313F, -5.0579F, 15.5059F, 0.6061F, -0.3565F, 0.6812F));

		PartDefinition cube_r316 = rightHorn.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-1.5F, -0.5F, -1.05F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.347F, -4.0453F, 15.5116F, 0.6393F, 0.0579F, 0.7132F));

		PartDefinition cube_r317 = rightHorn.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(-1.8571F, -1.0512F, 0.6616F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.7724F, -1.987F, 13.9657F, 0.8469F, 0.6813F, 1.1408F));

		PartDefinition cube_r318 = rightHorn.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(1.4614F, -0.6466F, 3.6964F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.2462F, -3.2031F, 13.7843F, 0.8114F, 1.1107F, 1.2735F));

		PartDefinition cube_r319 = rightHorn.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-1.1403F, -0.839F, -0.7188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.1497F, -0.9101F, 13.2887F, 1.034F, 0.903F, 1.4907F));

		PartDefinition cube_r320 = rightHorn.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(57, 64).mirror().addBox(-4.6385F, 0.4412F, 8.7608F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.3295F, -0.0905F, 0.6273F));

		PartDefinition cube_r321 = rightHorn.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(16, 45).mirror().addBox(-2.0214F, -1.0872F, 0.0402F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7724F, -1.987F, 13.9657F, 0.6381F, -0.0122F, 0.6612F));

		PartDefinition cube_r322 = rightHorn.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(61, 86).mirror().addBox(-1.3671F, -0.5339F, -0.4153F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-7.9306F, -5.087F, 13.0256F, 0.6706F, -0.4543F, 0.8175F));

		PartDefinition cube_r323 = rightHorn.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-1.8077F, -0.5339F, -0.1287F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.9306F, -5.087F, 13.0256F, 0.7783F, -0.6511F, 0.6139F));

		PartDefinition cube_r324 = rightHorn.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-3.3871F, -1.3146F, 1.8703F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.7724F, -1.987F, 13.9657F, 0.7088F, 0.6211F, 1.0816F));

		PartDefinition cube_r325 = rightHorn.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(51, 84).mirror().addBox(-0.2058F, -0.8613F, 0.3425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-8.4033F, -7.2072F, 13.9089F, 0.5003F, -0.1649F, 1.1561F));

		PartDefinition cube_r326 = rightHorn.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(34, 86).mirror().addBox(-2.3882F, -0.4281F, -0.5709F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-8.4033F, -7.2072F, 13.9089F, 0.5118F, -0.6739F, 0.991F));

		PartDefinition cube_r327 = rightHorn.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(81, 72).mirror().addBox(-0.8725F, -0.535F, -0.7405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-8.4033F, -7.2072F, 13.9089F, 0.5696F, -0.3385F, 0.9321F));

		PartDefinition cube_r328 = rightHorn.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(86, 67).mirror().addBox(-0.7029F, -0.535F, -0.8816F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-8.4033F, -7.2072F, 13.9089F, 0.5407F, -0.1529F, 1.0505F));

		PartDefinition cube_r329 = rightHorn.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(17, 84).mirror().addBox(-1.3529F, 0.5704F, 11.0521F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.2404F, -0.9796F, 0.6121F));

		PartDefinition cube_r330 = rightHorn.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-1.475F, -0.5F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-8.6513F, -5.025F, 12.2208F, 0.3792F, -0.5819F, 0.4727F));

		PartDefinition cube_r331 = rightHorn.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-5.3458F, 0.5663F, 9.805F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.3523F, -0.4596F, 0.5266F));

		PartDefinition cube_r332 = rightHorn.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-5.0722F, 0.4412F, 9.4461F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.3437F, -0.2966F, 0.554F));

		PartDefinition cube_r333 = rightHorn.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(46, 44).mirror().addBox(-2.5321F, -1.0504F, 0.1343F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.4645F, -3.2506F, 13.7733F, 0.6175F, -0.3524F, 0.7149F));

		PartDefinition cube_r334 = rightHorn.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(68, 84).mirror().addBox(-6.3751F, 0.0219F, 6.6212F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.3508F, 0.3873F, 0.6676F));

		PartDefinition cube_r335 = rightHorn.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-8.458F, 0.0219F, 3.4165F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.5135F, 0.8662F, 0.9361F));

		PartDefinition cube_r336 = rightHorn.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(41, 66).mirror().addBox(-6.98F, -0.7709F, 0.5579F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 1.1438F, 1.3511F, 1.481F));

		PartDefinition cube_r337 = rightHorn.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(41, 63).mirror().addBox(-6.771F, -0.8622F, 0.8128F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 0.7986F, 1.3159F, 1.1145F));

		PartDefinition cube_r338 = rightHorn.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(-4.205F, -1.2596F, -0.228F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3579F, 4.7499F, 2.6585F, 1.458F, 2.913F));

		PartDefinition cube_r339 = rightHorn.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-6.374F, -0.7887F, -0.6955F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0579F, -0.9501F, -0.7819F, 1.2703F, -0.5152F));

		PartDefinition cube_r340 = rightHorn.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(0.0753F, -0.2498F, -2.1717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -0.2142F, 0.2076F, 0.1852F, -0.993F));

		PartDefinition cube_r341 = rightHorn.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(26, 77).mirror().addBox(-1.5071F, -0.1809F, -4.3548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.1379F, 0.0171F, -0.5376F));

		PartDefinition cube_r342 = rightHorn.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-0.5603F, -0.6858F, -1.7394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -0.8674F, 0.1335F, -0.9242F));

		PartDefinition cube_r343 = rightHorn.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(-0.6949F, -0.6858F, -1.7655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -0.8932F, 0.2448F, -1.0612F));

		PartDefinition cube_r344 = rightHorn.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-0.5293F, -0.1809F, -3.561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.1734F, 0.1773F, -0.8983F));

		PartDefinition cube_r345 = rightHorn.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-0.5953F, -0.1809F, -5.3844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(67, 71).mirror().addBox(-0.6953F, -0.1809F, -3.5844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.208F, 0.2422F, -1.064F));

		PartDefinition cube_r346 = rightHorn.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(67, 67).mirror().addBox(-0.4995F, -0.1809F, -5.1587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.6995F, -0.1809F, -3.6587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.2809F, 0.3266F, -1.3223F));

		PartDefinition cube_r347 = rightHorn.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(34, 54).mirror().addBox(-0.47F, -0.1809F, -3.826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.4776F, 0.4237F, -1.8477F));

		PartDefinition cube_r348 = rightHorn.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(-0.6027F, -0.1809F, -4.8839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.3492F, 0.3753F, -1.5201F));

		PartDefinition cube_r349 = rightHorn.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.6656F, -0.6858F, -1.8799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.0648F, 0.5273F, -1.5059F));

		PartDefinition cube_r350 = rightHorn.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(69, 55).mirror().addBox(-0.6513F, -0.1809F, -3.6492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -3.7142F, -1.3327F, 0.3654F, -1.4745F));

		PartDefinition cube_r351 = rightHorn.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(0.0196F, 0.9241F, -3.1132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3519F, 0.5067F, -0.2142F, -0.4828F, 0.1852F, -1.0786F));

		PartDefinition cube_r352 = rightHorn.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-2.3931F, -0.4187F, 0.1664F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0579F, -0.9501F, -0.2507F, 0.9942F, 0.1925F));

		PartDefinition cube_r353 = rightHorn.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(83, 79).mirror().addBox(-2.5191F, -0.4187F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0579F, -0.9501F, -0.3466F, 1.1613F, 0.084F));

		PartDefinition cube_r354 = rightHorn.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4052F, 0.1999F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r355 = rightHorn.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-0.9F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, 0.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(25, 93).addBox(0.7509F, -0.688F, -1.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6359F, -0.4097F, 1.845F, 0.4969F, 0.3097F, 0.1638F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(63, 75).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0641F, -0.5701F, 0.6237F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(12, 77).addBox(0.2F, -1.488F, -0.619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F))
				.texOffs(76, 55).addBox(0.2F, -1.188F, -0.819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F))
				.texOffs(54, 0).addBox(0.2F, -0.688F, -1.819F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(-0.6359F, -0.4097F, 1.845F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(75, 59).addBox(-0.3413F, -0.8468F, -0.3468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1661F, -3.9271F, 7.4643F, 0.9011F, -0.5256F, -0.2787F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(47, 75).addBox(-0.5737F, -0.6767F, -1.6931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5374F, -3.5244F, 6.2597F, 0.8733F, 0.0308F, 0.0424F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(75, 22).addBox(-0.4978F, -0.3611F, -0.2451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.7521F, 6.057F, 0.4703F, -0.1031F, 0.0182F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(75, 18).addBox(-0.5F, -0.394F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.7137F, 6.0341F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(74, 71).addBox(-0.6136F, -0.9766F, -2.5832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8336F, -2.8265F, 4.7739F, 0.7104F, 0.4364F, 0.1028F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(16, 54).addBox(-0.6F, -0.6F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 30).addBox(-0.6F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.138F, -2.5594F, 4.7074F, 0.5476F, 0.2663F, 0.6698F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(63, 4).addBox(-1.7917F, -0.6961F, -0.3261F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1095F, -3.4662F, 3.1786F, -1.6218F, 0.4948F, 0.5643F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(60, 55).addBox(-0.9917F, -0.1961F, -0.3261F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1898F, 4.7038F, -2.3221F, 0.3869F, 0.3335F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(60, 51).addBox(-1.2914F, -0.2973F, -1.9862F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1148F, 4.6038F, -2.6649F, 0.0111F, -0.2506F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(20, 93).addBox(-0.5489F, -0.2222F, -1.6064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.1037F, -3.9898F, 5.2038F, 0.5814F, 0.4892F, 0.2996F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(50, 60).addBox(-1.1859F, -0.3337F, -1.1383F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1037F, -4.1148F, 4.6038F, -2.5266F, -0.3176F, -0.5013F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(19, 77).addBox(-0.0504F, -0.5738F, -0.4979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0209F, -2.8999F, 5.3271F, 1.9992F, 0.1838F, 0.0968F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(93, 12).addBox(-0.0504F, -0.7738F, -0.0979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1037F, -3.9898F, 5.2038F, 2.6013F, 0.1838F, 0.0968F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-1.7509F, -0.688F, -1.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6359F, -0.4097F, 1.845F, 0.4969F, -0.3097F, -0.1638F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, -0.5701F, 0.6237F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-1.2F, -1.488F, -0.619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(76, 55).mirror().addBox(-1.2F, -1.188F, -0.819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(54, 0).mirror().addBox(-1.2F, -0.688F, -1.819F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(0.6359F, -0.4097F, 1.845F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(75, 59).mirror().addBox(-0.6587F, -0.8468F, -0.3468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.9271F, 7.4643F, 0.9011F, 0.5256F, 0.2787F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(47, 75).mirror().addBox(-0.4263F, -0.6767F, -1.6931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5374F, -3.5244F, 6.2597F, 0.8733F, -0.0308F, -0.0424F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-0.5022F, -0.3611F, -0.2451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.7521F, 6.057F, 0.4703F, 0.1031F, -0.0182F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.5F, -0.394F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.7137F, 6.0341F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-0.3864F, -0.9766F, -2.5832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, -2.8265F, 4.7739F, 0.7104F, -0.4364F, -0.1028F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(16, 54).mirror().addBox(-0.4F, -0.6F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 30).mirror().addBox(-0.4F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.138F, -2.5594F, 4.7074F, 0.5476F, -0.2663F, -0.6698F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(63, 4).mirror().addBox(-0.2083F, -0.6961F, -0.3261F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1095F, -3.4662F, 3.1786F, -1.6218F, -0.4948F, -0.5643F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(60, 55).mirror().addBox(-1.0083F, -0.1961F, -0.3261F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1898F, 4.7038F, -2.3221F, -0.3869F, -0.3335F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(60, 51).mirror().addBox(-0.7086F, -0.2973F, -1.9862F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1148F, 4.6038F, -2.6649F, -0.0111F, 0.2506F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(-0.4511F, -0.2222F, -1.6064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -3.9898F, 5.2038F, 0.5814F, -0.4892F, -0.2996F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(-0.8141F, -0.3337F, -1.1383F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -4.1148F, 4.6038F, -2.5266F, 0.3176F, 0.5013F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(19, 77).mirror().addBox(-0.9496F, -0.5738F, -0.4979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0209F, -2.8999F, 5.3271F, 1.9992F, -0.1838F, -0.0968F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-0.9496F, -0.7738F, -0.0979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1037F, -3.9898F, 5.2038F, 2.6013F, -0.1838F, -0.0968F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.112F, -2.1418F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-0.35F, -0.7999F, -0.2352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(71, 93).mirror().addBox(-0.35F, -1.1999F, -0.2352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 93).addBox(2.25F, -1.1999F, -0.2352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 67).addBox(2.25F, -0.7999F, -0.2352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.45F, -0.1027F, -0.9395F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(-0.35F, -1.7999F, -1.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 93).addBox(2.25F, -1.7999F, -1.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 78).mirror().addBox(-0.35F, -1.0999F, -0.8352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(90, 78).addBox(2.25F, -1.0999F, -0.8352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(0.0F, -1.0012F, -0.9073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.8237F, -6.462F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(0.0F, -0.4005F, -0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(66, 91).mirror().addBox(0.0F, -0.8005F, -0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1135F, -5.9183F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(91, 74).mirror().addBox(-0.5161F, -0.9795F, -0.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0665F, 4.2999F, -5.4456F, -1.4916F, -0.1928F, -0.0456F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(67, 94).mirror().addBox(-0.0413F, -0.1831F, -0.3924F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0024F, 3.3499F, -2.4882F, -1.3281F, -0.1302F, -0.1715F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-0.1566F, 0.0654F, -0.3812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.901F, 3.7951F, -2.773F, -1.3228F, -0.2174F, -0.1605F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(-0.0276F, -1.3094F, -0.3476F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0024F, 3.3499F, -2.4882F, -1.0153F, -0.0875F, -0.1341F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(90, 45).mirror().addBox(-0.5F, -1.175F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7376F, 3.6734F, -1.9021F, -1.0905F, -0.1679F, -0.1431F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(49, 93).addBox(2.1F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3F, 2.5114F, -0.5638F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(78, 91).mirror().addBox(-0.35F, 0.4142F, -0.0032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 91).addBox(2.25F, 0.4142F, -0.0032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-0.35F, -0.0061F, -0.5043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(93, 33).addBox(2.25F, -0.0061F, -0.5043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(-0.35F, -0.0324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(90, 86).addBox(1.65F, -0.0324F, 0.6766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.15F, 1.5128F, -0.0675F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(44, 90).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 3.5622F, -1.9234F, -1.1516F, -0.1679F, -0.1431F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(93, 30).mirror().addBox(-0.35F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 93).mirror().addBox(-0.35F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 30).addBox(2.25F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 93).addBox(2.25F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-0.35F, -0.9757F, -0.4414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(90, 24).addBox(2.25F, -0.9757F, -0.4414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.45F, 1.5128F, -0.0675F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(91, 74).addBox(-0.4839F, -0.9795F, -0.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0665F, 4.2999F, -5.4456F, -1.4916F, 0.1928F, 0.0456F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(67, 94).addBox(0.0413F, -0.1831F, -0.3924F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0024F, 3.3499F, -2.4882F, -1.3281F, 0.1302F, 0.1715F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(90, 49).addBox(-0.8434F, 0.0654F, -0.3812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.901F, 3.7951F, -2.773F, -1.3228F, 0.2174F, 0.1605F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(75, 44).addBox(0.0276F, -1.3094F, -0.3476F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0024F, 3.3499F, -2.4882F, -1.0153F, 0.0875F, 0.1341F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(90, 45).addBox(-0.5F, -1.175F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7376F, 3.6734F, -1.9021F, -1.0905F, 0.1679F, 0.1431F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(44, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.75F, 3.5622F, -1.9234F, -1.1516F, 0.1679F, 0.1431F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(47, 5).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, 0.4189F, 0.0F, 0.0F));

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