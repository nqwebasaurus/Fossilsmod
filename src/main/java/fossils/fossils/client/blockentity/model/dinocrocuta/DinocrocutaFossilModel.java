package fossils.fossils.client.blockentity.model.dinocrocuta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DinocrocutaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
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
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftCanine2;
	private final ModelPart rightCanine2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public DinocrocutaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
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
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftCanine2 = this.head.getChild("leftCanine2");
		this.rightCanine2 = this.head.getChild("rightCanine2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.0788F, 10.4604F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 70).addBox(0.0F, -0.8889F, -0.9992F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 70).addBox(0.0F, -1.4678F, -0.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 17).addBox(0.0F, -1.376F, -0.8558F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-1.1926F, -0.0074F, -0.4005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1048F, -0.7741F, 0.2724F, -0.3779F, -0.1626F, -0.2665F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 2).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(-1.0763F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-0.9F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1398F, -1.8887F, 0.1806F, -1.1392F, -0.1822F, -0.5156F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.9F, -0.1F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8167F, -0.8349F, 1.4749F, -0.6854F, -0.1822F, -0.5156F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 52).mirror().addBox(-0.9F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.603F, -0.4316F, 1.0855F, -0.737F, -0.263F, -0.2554F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-2.6637F, -2.7003F, 4.1966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.4809F, 1.5193F, -0.9275F, -0.8406F, -0.6625F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-0.8429F, -0.4456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, 3.0706F, 2.0402F, -0.651F, -0.7259F, -0.7733F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 42).mirror().addBox(-6.4098F, -1.1637F, -1.7938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.4809F, 1.5193F, -2.1371F, 0.0626F, -1.4272F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.602F, 1.4957F, 1.7502F, -0.3757F, -0.5747F, -0.4399F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 66).mirror().addBox(-0.8429F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3471F, 3.0706F, 2.0402F, -1.192F, -0.7259F, -0.7733F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 53).mirror().addBox(-0.5F, -1.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6778F, 0.5744F, -0.2729F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-0.9F, -0.6F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.603F, -0.4316F, 1.0855F, -1.2955F, -0.263F, -0.2554F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 61).addBox(-0.8074F, -0.0074F, -0.4005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1048F, -0.7741F, 0.2724F, -0.3779F, 0.1626F, 0.2665F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 2).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-0.9237F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 61).addBox(-0.1F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1398F, -1.8887F, 0.1806F, -1.1392F, 0.1822F, 0.5156F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(48, 0).addBox(-0.1F, -0.1F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.8167F, -0.8349F, 1.4749F, -0.6854F, 0.1822F, 0.5156F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 52).addBox(-0.1F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.603F, -0.4316F, 1.0855F, -0.737F, 0.263F, 0.2554F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 31).addBox(-0.1F, -0.6F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.603F, -0.4316F, 1.0855F, -1.2955F, 0.263F, 0.2554F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 53).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6778F, 0.5744F, -0.2729F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 66).addBox(-0.1571F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3471F, 3.0706F, 2.0402F, -1.192F, 0.7259F, 0.7733F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(43, 10).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.602F, 1.4957F, 1.7502F, -0.3757F, 0.5747F, 0.4399F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 42).addBox(5.4098F, -1.1637F, -1.7938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.4809F, 1.5193F, -2.1371F, -0.0626F, 1.4272F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(52, 35).addBox(-0.1571F, -0.4456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3471F, 3.0706F, 2.0402F, -0.651F, 0.7259F, 0.7733F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 19).addBox(1.6637F, -2.7003F, 4.1966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.4809F, 1.5193F, -0.9275F, 0.8406F, 0.6625F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.9264F, 2.5896F, -0.4999F, -0.217F, 0.0232F));

		PartDefinition cube_r29 = leftLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(66, 27).addBox(0.0F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0269F, -0.1126F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(43, 36).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 58).addBox(-0.5F, -1.2653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(69, 30).addBox(-0.5F, -2.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(41, 16).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.3641F, 0.0087F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(55, 2).addBox(-1.0F, -0.033F, -0.0653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 57).addBox(-0.5F, -0.0303F, 0.0125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.8268F, -0.0612F, 1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(43, 46).addBox(-1.3F, -0.8F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 33).addBox(-0.6F, -1.2938F, -4.1286F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.2131F, 3.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 31).addBox(-0.5F, -0.2938F, -0.9286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3F, 0.9131F, 0.9596F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(20, 44).addBox(-0.5F, -0.1222F, -0.0452F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 59).addBox(-1.4F, 0.0303F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 1.4409F, -0.6989F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(69, 5).addBox(-1.4F, 0.0303F, -0.1439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6477F, -0.1878F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 14).addBox(-0.5F, -1.4174F, -1.2004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2376F, 0.866F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(25, 43).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5459F, 0.6573F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(13, 16).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4366F, -0.7119F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.9264F, 2.5896F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-1.0F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0269F, -0.1126F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 36).mirror().addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.5F, -1.2653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.5F, -2.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-1.0F, -1.0F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3641F, 0.0087F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-1.0F, -0.033F, -0.0653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-0.5F, -0.0303F, 0.0125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.8268F, -0.0612F, 1.3653F, -0.2137F, 0.0442F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(43, 46).mirror().addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-0.4F, -1.2938F, -4.1286F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2131F, 3.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-0.5F, -0.2938F, -0.9286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.9131F, 0.9596F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(20, 44).mirror().addBox(-0.5F, -0.1222F, -0.0452F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(0.4F, 0.0303F, -0.0439F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.4409F, -0.6989F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(0.4F, 0.0303F, -0.1439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6477F, -0.1878F, -0.742F, 0.0012F, 0.004F));

		PartDefinition cube_r60 = rightLeg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-0.5F, -1.4174F, -1.2004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2376F, 0.866F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(25, 43).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0992F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5459F, 0.6573F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(13, 16).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4366F, -0.7119F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.5F, -0.2015F, 0.0855F, -0.0174F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 51).addBox(0.0F, -1.6846F, -0.9452F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6985F, -0.7046F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 70).addBox(0.0F, -1.3545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0985F, -2.6046F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(50, 63).mirror().addBox(-1.7472F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.08F, -1.3798F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.08F, -3.3798F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 63).addBox(-0.2528F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.08F, -1.3798F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 8).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.08F, -3.3798F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 27).addBox(-0.5F, -0.1512F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7069F, -3.6736F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-6.4429F, -1.7043F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.4406F, 0.2475F, -1.4958F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(5, 51).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.3141F, 0.3974F, -1.1024F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.1969F, 0.4641F, -0.8235F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.0995F, 0.5518F, -0.7761F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.2512F, 0.5057F, -1.0749F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(60, 43).mirror().addBox(-5.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.4308F, 0.3693F, -1.4928F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(-0.8222F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.2331F, 0.4473F, -0.7353F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(19, 54).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.3429F, 0.3725F, -1.0091F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-7.2581F, -1.8721F, -0.3159F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.4562F, 0.2143F, -1.3952F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5949F, -9.4528F, -0.4543F, 0.1952F, -1.3099F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5949F, -9.4528F, -0.3487F, 0.3541F, -0.9263F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 4).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5949F, -9.4528F, -0.2443F, 0.4311F, -0.6552F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(-7.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4894F, 0.1322F, -1.3148F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4073F, 0.3083F, -0.9444F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(-2.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.316F, 0.4015F, -0.6833F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 8).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.1969F, -0.4641F, 0.8235F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 51).addBox(0.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.3141F, -0.3974F, 1.1024F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 10).addBox(3.4429F, -1.7043F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.4406F, -0.2475F, 1.4958F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(64, 6).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.0995F, -0.5518F, 0.7761F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(48, 50).addBox(0.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.2512F, -0.5057F, 1.0749F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 43).addBox(3.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.4308F, -0.3693F, 1.4928F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(69, 59).addBox(-0.1778F, -0.2458F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.2331F, -0.4473F, 0.7353F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(19, 54).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.3429F, -0.3725F, 1.0091F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 44).addBox(3.2581F, -1.8721F, -0.3159F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.4562F, -0.2143F, 1.3952F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 0).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5949F, -9.4528F, -0.4543F, -0.1952F, 1.3099F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(52, 12).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5949F, -9.4528F, -0.3487F, -0.3541F, 0.9263F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 4).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5949F, -9.4528F, -0.2443F, -0.4311F, 0.6552F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(53, 52).addBox(4.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4894F, -0.1322F, 1.3148F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(14, 51).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.4073F, -0.3083F, 0.9444F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 51).addBox(0.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0949F, -7.3528F, -0.316F, -0.4015F, 0.6833F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(24, 70).addBox(0.0F, -1.7205F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -2.1528F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(45, 70).addBox(0.0F, -1.8594F, -0.0812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -3.9528F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(32, 66).addBox(0.0F, -2.1938F, -0.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, -5.8528F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 34).addBox(-0.001F, -2.8048F, -0.0871F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0949F, -7.8528F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(71, 27).addBox(0.0F, 0.137F, -0.0747F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0949F, -7.8528F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(15, 68).addBox(-0.001F, -3.8708F, -0.2054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9949F, -9.8528F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 24).addBox(0.0F, -0.9007F, -0.0552F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9949F, -9.8528F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.3759F, -4.9807F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -5.9528F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(15, 8).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7948F, -10.8655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(70, 67).addBox(-1.0F, -0.8037F, -0.0741F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1112F, -0.9421F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(67, 13).addBox(-1.001F, -3.677F, -0.3804F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1112F, -0.9421F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(61, 70).addBox(-0.001F, -3.2727F, -0.2609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8094F, -2.8777F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(32, 71).addBox(0.0F, -1.2891F, 0.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8094F, -2.8777F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(26, 16).mirror().addBox(-6.1F, -0.1F, -0.4F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2897F, 7.034F, 4.5823F, 0.6492F, 0.9935F, 0.8709F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(26, 18).mirror().addBox(-4.8F, -0.1F, -0.2F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7359F, 6.9734F, 4.3649F, 0.3421F, 0.8343F, 0.5048F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(32, 47).mirror().addBox(0.0783F, -0.0552F, 0.0013F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, -5.5418F, -0.6586F, 0.1393F, -0.087F, 0.1261F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-1.9184F, 0.1789F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -2.2421F, -0.3045F, 0.4159F, -0.7309F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-3.8993F, -0.3237F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -2.2421F, -0.4005F, 0.325F, -0.9945F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 39).mirror().addBox(-4.4834F, -1.8123F, -0.3655F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -2.2421F, -0.4894F, 0.1501F, -1.367F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 25).mirror().addBox(-6.8019F, -2.58F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.1112F, -0.5421F, -0.4849F, 0.1491F, -1.3141F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(39, 50).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.1112F, -0.5421F, -0.3965F, 0.3224F, -0.9411F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(55, 8).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.1112F, -0.5421F, -0.3012F, 0.4124F, -0.6775F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(24, 21).mirror().addBox(-0.5444F, -0.5858F, -0.0035F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.4582F, -0.8586F, 1.4804F, -0.2107F, 0.0554F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(42, 25).mirror().addBox(-0.5671F, -3.8135F, -2.0236F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 0.1582F, -0.2586F, -0.6529F, -0.1928F, 0.1019F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(43, 40).mirror().addBox(-0.5444F, -6.3236F, 2.4831F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 1.6582F, -1.1586F, 0.3245F, -0.1928F, 0.1019F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(0.2612F, -0.0837F, 0.0371F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, -3.3418F, -2.7586F, 0.7957F, -0.1928F, 0.1019F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.5444F, -0.8907F, 1.1905F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 1.6582F, -1.1586F, 1.7033F, -0.1928F, 0.1019F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5966F, -0.0244F, -3.0085F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0785F, -1.3099F, -0.8344F, 1.4047F, 0.2573F, 0.0434F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-0.5444F, -1.1403F, 0.0926F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9527F, 2.4582F, -0.8586F, 1.6724F, -0.2107F, 0.0554F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-3.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4559F, 6.8056F, 0.7276F, 0.2584F, 0.2636F, 0.3387F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-4.1F, -0.1F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7359F, 6.9734F, 4.3649F, 0.2696F, 0.3405F, 0.3623F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3315F, 6.9772F, 2.3811F, 0.2121F, 0.4515F, 0.2909F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 6).mirror().addBox(-2.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4839F, 5.9332F, -1.0674F, 0.2683F, 0.178F, 0.3891F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 64).addBox(-0.0816F, 0.1789F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -2.2421F, -0.3045F, -0.4159F, 0.7309F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 0).addBox(1.8993F, -0.3237F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -2.2421F, -0.4005F, -0.325F, 0.9945F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(70, 39).addBox(3.4834F, -1.8123F, -0.3655F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -2.2421F, -0.4894F, -0.1501F, 1.367F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(35, 25).addBox(4.8019F, -2.58F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.1112F, -0.5421F, -0.4849F, -0.1491F, 1.3141F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(39, 50).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.1112F, -0.5421F, -0.3965F, -0.3224F, 0.9411F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(55, 8).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.1112F, -0.5421F, -0.3012F, -0.4124F, 0.6775F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 21).addBox(-0.4556F, -0.5858F, -0.0035F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9527F, 2.4582F, -0.8586F, 1.4804F, 0.2107F, -0.0554F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(42, 25).addBox(-0.4329F, -3.8135F, -2.0236F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9527F, 0.1582F, -0.2586F, -0.6529F, 0.1928F, -0.1019F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(43, 40).addBox(-0.4556F, -6.3236F, 2.4831F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9527F, 1.6582F, -1.1586F, 0.3245F, 0.1928F, -0.1019F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(32, 47).addBox(-1.0783F, -0.0552F, 0.0013F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9527F, -5.5418F, -0.6586F, 0.1393F, 0.087F, -0.1261F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(30, 6).addBox(-1.2612F, -0.0837F, 0.0371F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9527F, -3.3418F, -2.7586F, 0.7957F, 0.1928F, -0.1019F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(17, 0).addBox(-0.4556F, -0.8907F, 1.1905F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9527F, 1.6582F, -1.1586F, 1.7033F, 0.1928F, -0.1019F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4034F, -0.0244F, -3.0085F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0785F, -1.3099F, -0.8344F, 1.4047F, -0.2573F, -0.0434F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 23).addBox(-0.4556F, -1.1403F, 0.0926F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9527F, 2.4582F, -0.8586F, 1.6724F, 0.2107F, -0.0554F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(9, 46).addBox(-0.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4559F, 6.8056F, 0.7276F, 0.2584F, -0.2636F, -0.3387F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 16).addBox(0.1F, -0.1F, -0.4F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2897F, 7.034F, 4.5823F, 0.6492F, -0.9935F, -0.8709F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(26, 18).addBox(-0.2F, -0.1F, -0.2F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7359F, 6.9734F, 4.3649F, 0.3421F, -0.8343F, -0.5048F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(30, 12).addBox(-0.9F, -0.1F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7359F, 6.9734F, 4.3649F, 0.2696F, -0.3405F, -0.3623F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(30, 14).addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3315F, 6.9772F, 2.3811F, 0.2121F, -0.4515F, -0.2909F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(55, 6).addBox(-0.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4839F, 5.9332F, -1.0674F, 0.2683F, -0.178F, -0.3891F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(35, 20).addBox(-0.5F, -1.0692F, -2.9583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.4581F, 0.9051F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, -0.7921F, -3.8146F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.3452F, 4.7113F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -1.9785F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0094F, -9.5777F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 3.3294F, -1.6256F, -0.0555F, 0.4412F, 0.0555F));

		PartDefinition cube_r156 = leftarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(59, 48).addBox(-1.0F, 2.0F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(33, 59).addBox(-1.0F, 2.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.6F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.2961F, -0.5244F, -0.3404F, 0.0014F, -0.001F));

		PartDefinition cube_r158 = leftarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(60, 39).addBox(-0.0077F, -0.082F, -0.0437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.1673F, -0.7622F, 0.7417F, 0.0014F, -0.001F));

		PartDefinition cube_r159 = leftarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(64, 31).addBox(-0.0087F, -0.0823F, -0.1698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.1673F, -0.7622F, -0.0263F, 0.0014F, -0.001F));

		PartDefinition cube_r160 = leftarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(15, 60).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0097F, 1.3297F, -0.9047F, 0.1308F, 0.0014F, -0.001F));

		PartDefinition cube_r161 = leftarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(62, 63).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.1668F, 0.8408F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(7, 64).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.1968F, 2.0023F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 63).addBox(0.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.1885F, 0.4014F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftarm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(69, 33).addBox(0.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.2115F, 2.1039F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftarm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(22, 64).addBox(-0.4F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.11F, 1.0564F, 1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r166 = leftarm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(33, 56).addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -1.9461F, 0.8201F, 1.5708F, -0.4102F, -1.5708F));

		PartDefinition cube_r167 = leftarm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(40, 56).addBox(-1.9256F, -0.8299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, -0.0702F, 1.9549F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition cube_r168 = leftarm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(49, 24).addBox(-0.0335F, 0.0378F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 3.7584F, 0.2624F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r169 = leftarm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 49).addBox(-1.2731F, 3.4152F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, -0.0046F, -0.4664F, 1.5708F, -1.2566F, -1.6232F));

		PartDefinition cube_r170 = leftarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(55, 39).addBox(-0.6346F, -0.1413F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1764F, -0.0046F, -0.4664F, 1.5708F, -1.4312F, -1.6232F));

		PartDefinition cube_r171 = leftarm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 56).addBox(-0.0335F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, -0.0046F, -0.2664F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 8.09F, 1.6564F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftArm3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 40).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 3.7946F, 0.37F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftArm4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(33, 27).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 3.3294F, -1.6256F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-1.0F, 2.0F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(33, 59).mirror().addBox(-1.0F, 2.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.5F, -0.6F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5119F, -0.2961F, -0.5244F, -0.3404F, -0.0014F, 0.001F));

		PartDefinition cube_r176 = rightarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 39).mirror().addBox(-0.9923F, -0.082F, -0.0437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.1673F, -0.7622F, 0.7417F, -0.0014F, 0.001F));

		PartDefinition cube_r177 = rightarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-0.9913F, -0.0823F, -0.1698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1673F, -0.7622F, -0.0263F, -0.0014F, 0.001F));

		PartDefinition cube_r178 = rightarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0097F, 1.3297F, -0.9047F, 0.1308F, -0.0014F, 0.001F));

		PartDefinition cube_r179 = rightarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1668F, 0.8408F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.1968F, 2.0023F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-1.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1885F, 0.4014F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r182 = rightarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(69, 33).mirror().addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.2115F, 2.1039F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.6F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.11F, 1.0564F, 1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r184 = rightarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(-0.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -1.9461F, 0.8201F, 1.5708F, 0.4102F, 1.5708F));

		PartDefinition cube_r185 = rightarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(40, 56).mirror().addBox(0.9256F, -0.8299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.136F, -0.0702F, 1.9549F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r186 = rightarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-0.9665F, 0.0378F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 3.7584F, 0.2624F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r187 = rightarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(0.2731F, 3.4152F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.0046F, -0.4664F, 1.5708F, 1.2566F, 1.6232F));

		PartDefinition cube_r188 = rightarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 39).mirror().addBox(-0.3654F, -0.1413F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.0046F, -0.4664F, 1.5708F, 1.4312F, 1.6232F));

		PartDefinition cube_r189 = rightarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.9665F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -0.0046F, -0.2664F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 8.09F, 1.6564F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightArm3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 40).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 3.7946F, 0.37F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightArm4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(33, 27).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3661F, -3.5483F, 0.108F, 0.4779F, 0.046F));

		PartDefinition cube_r192 = neck2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(53, 54).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9638F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(18, 68).addBox(0.0F, -1.7605F, -0.0674F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5873F, -0.9213F, 0.0611F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3943F, -1.9248F, -0.2675F, 0.3271F, 0.0546F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(55, 70).addBox(0.0F, -1.5127F, -1.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3196F, 0.227F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(71, 10).addBox(0.0F, -1.0368F, -1.0495F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6695F, -1.6993F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -1.1F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.5932F, -2.956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5493F, -3.7036F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition cube_r197 = neck3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(9, 48).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0932F, -1.456F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r198 = neck3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(57, 14).addBox(0.0F, -1.2F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7834F, -1.2808F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0922F, -2.8674F, -0.4422F, 0.1535F, 0.0354F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(46, 52).mirror().addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9874F, -0.6255F, 0.9992F, -0.169F, -0.2557F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(46, 52).addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.9874F, -0.6255F, 0.9992F, 0.169F, 0.2557F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(46, 52).addBox(-0.5F, 0.1F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(46, 52).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6138F, -0.9188F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(48, 5).addBox(-0.5F, 0.064F, -2.0622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0191F, -2.4229F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(11, 71).addBox(-0.502F, 0.0068F, -0.9833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9178F, -1.7297F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(8, 71).addBox(-0.502F, -0.1F, -1.0291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6422F, -2.2567F, 2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(39, 5).addBox(-1.0F, -0.5F, -2.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(16, 39).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 46).mirror().addBox(-0.9F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(52, 46).addBox(-0.1F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6686F, -2.6303F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(44, 20).addBox(-1.5F, 0.0528F, -1.3427F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.7546F, -4.1414F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(52, 58).addBox(-1.5F, -0.0472F, -0.0427F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6198F, -3.8933F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(55, 67).addBox(-1.0F, -0.1472F, -0.6427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.1477F, -4.6385F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(25, 33).addBox(-1.5F, -0.0472F, -1.6427F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 3.6198F, -3.8933F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(50, 68).addBox(-0.1F, -0.0373F, 1.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 5.4495F, -5.0505F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(5, 49).addBox(-1.4F, -0.4604F, -0.3896F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(59, 36).addBox(-1.9F, -0.9604F, -0.4896F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9F, 6.7816F, -4.2445F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(25, 60).addBox(-0.5F, -0.0547F, -0.9226F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0344F, -3.5244F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 71).addBox(0.5F, 0.003F, -0.975F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.3F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 53).addBox(0.498F, -0.1605F, -0.0697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.9171F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(61, 23).addBox(0.498F, -0.0605F, -0.8697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(61, 10).addBox(0.498F, -0.0605F, -1.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -3.0F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(22, 67).mirror().addBox(-1.9F, 0.6895F, 0.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(22, 67).addBox(-0.1F, 0.6895F, 0.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.8F, 0.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2887F, 6.6948F, -3.8857F, -0.0132F, -0.1647F, -0.1461F));

		PartDefinition cube_r217 = leftCanine.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(40, 65).addBox(1.0143F, 2.5061F, -7.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 18).addBox(1.0143F, 2.1061F, -7.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1856F, -5.2565F, 5.7651F, 0.4311F, 0.1853F, 0.0618F));

		PartDefinition cube_r218 = leftCanine.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(66, 10).addBox(1.0143F, -0.4768F, -8.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(66, 45).addBox(1.0143F, -0.8768F, -8.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1856F, -5.2565F, 5.7651F, 0.8151F, 0.1853F, 0.0618F));

		PartDefinition cube_r219 = leftCanine.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 67).addBox(-0.5273F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0228F, 0.67F, 0.6103F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2887F, 6.6948F, -3.8857F, -0.0132F, 0.1647F, 0.1461F));

		PartDefinition cube_r220 = rightCanine.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(-2.0143F, 2.5061F, -7.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 18).mirror().addBox(-2.0143F, 2.1061F, -7.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1856F, -5.2565F, 5.7651F, 0.4311F, -0.1853F, -0.0618F));

		PartDefinition cube_r221 = rightCanine.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(-2.0143F, -0.4768F, -8.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(66, 45).mirror().addBox(-2.0143F, -0.8768F, -8.2132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1856F, -5.2565F, 5.7651F, 0.8151F, -0.1853F, -0.0618F));

		PartDefinition cube_r222 = rightCanine.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-0.4727F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.67F, 0.6103F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition leftCanine2 = head.addOrReplaceChild("leftCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7976F, 6.8366F, -4.4388F, -0.3797F, -0.1647F, -0.1461F));

		PartDefinition cube_r223 = leftCanine2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(66, 48).addBox(1.0143F, -0.8768F, -8.1904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1856F, -5.2565F, 5.7651F, 0.8151F, 0.1853F, 0.0618F));

		PartDefinition cube_r224 = leftCanine2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(10, 68).addBox(-0.6273F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0417F, 0.3923F, 0.1949F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition cube_r225 = leftCanine2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 68).addBox(-0.6273F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0228F, 0.67F, 0.6103F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition cube_r226 = leftCanine2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(50, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0088F, 0.0841F, 0.2492F, 0.4404F, 0.0694F, 0.1044F));

		PartDefinition rightCanine2 = head.addOrReplaceChild("rightCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7976F, 6.8366F, -4.4388F, -0.3797F, 0.1647F, 0.1461F));

		PartDefinition cube_r227 = rightCanine2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-2.0143F, -0.8768F, -8.1904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1856F, -5.2565F, 5.7651F, 0.8151F, -0.1853F, -0.0618F));

		PartDefinition cube_r228 = rightCanine2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.3727F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0417F, 0.3923F, 0.1949F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition cube_r229 = rightCanine2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-0.3727F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.67F, 0.6103F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition cube_r230 = rightCanine2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0088F, 0.0841F, 0.2492F, 0.4404F, -0.0694F, -0.1044F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(40, 68).addBox(-1.0F, -0.0373F, 0.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3353F, -0.1501F, -0.1705F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(69, 2).addBox(-1.0F, -0.0537F, 0.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8414F, -0.1501F, -0.1705F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(27, 69).addBox(-0.7F, -0.9604F, 1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(59, 45).addBox(-1.4F, -0.9604F, 0.0104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 1.3321F, 0.806F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(16, 33).addBox(-0.2F, -1.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9F, -4.7497F, 3.779F, 0.3434F, 0.3089F, -0.3823F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 21).addBox(0.6F, -0.7F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 1.0248F, 1.9993F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(30, 62).addBox(1.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.1709F, 3.4759F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(54, 23).addBox(-0.5F, -0.9604F, 0.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.4553F, 2.6036F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 69).addBox(0.4F, -1.0205F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8F, -0.9266F, 4.0871F, 1.7453F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(40, 68).mirror().addBox(0.0F, -0.0373F, 0.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3353F, 0.1501F, 0.1705F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(69, 2).mirror().addBox(0.0F, -0.0537F, 0.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8414F, 0.1501F, 0.1705F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(27, 69).mirror().addBox(-0.3F, -0.9604F, 1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(59, 45).mirror().addBox(-0.6F, -0.9604F, 0.0104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.3321F, 0.806F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(16, 33).mirror().addBox(-0.8F, -1.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9F, -4.7497F, 3.779F, 0.3434F, -0.3089F, 0.3823F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-0.6F, -0.7F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 1.0248F, 1.9993F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-1.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.1709F, 3.4759F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-0.5F, -0.9604F, 0.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4553F, 2.6036F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.4F, -1.0205F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.9266F, 4.0871F, 1.7453F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(1.4F, 1.7856F, 3.4765F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(66, 21).addBox(-1.0F, -0.9F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.887F, -0.2803F, -2.8558F, 1.5487F, -1.1848F, -1.0216F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(25, 50).addBox(-0.5F, -0.319F, -0.9553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7193F, -0.3169F, -3.9785F, 0.1338F, -0.4148F, -0.1008F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(50, 15).addBox(-0.5F, -0.6835F, -0.9672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7193F, -0.3169F, -3.9785F, 0.2734F, -0.4148F, -0.1008F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(45, 67).addBox(-0.5F, -0.6796F, -0.3427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3605F, 1.3797F, -5.541F, 2.1133F, -0.0768F, 0.0596F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(67, 42).addBox(-0.5F, -0.2614F, -0.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3605F, 1.3797F, -5.541F, 1.3628F, -0.0768F, 0.0596F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(26, 56).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7118F, 0.2429F, -5.2545F, 0.9557F, -0.0953F, 0.3711F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7118F, 0.2429F, -5.2545F, 1.0779F, -0.0953F, 0.3711F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(34, 32).addBox(-1.0402F, 0.118F, -2.7559F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2934F, 0.6978F, -7.4904F, 2.1103F, -0.322F, 0.1236F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, 0.0396F, 0.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.3738F, -6.7007F, 1.1872F, -0.0645F, 0.2139F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(45, 64).addBox(-0.7F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1274F, 0.3725F, -7.2297F, 1.581F, -0.3374F, 0.4092F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(45, 56).addBox(-1.8077F, -0.0902F, -0.8267F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0989F, -0.9989F, -7.3115F, 1.2168F, 0.0436F, -0.0108F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 32).addBox(-1.4077F, -0.0902F, -0.2267F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3121F, -0.9677F, -7.3035F, 1.0928F, -0.1901F, -0.5379F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-1.4F, 1.7856F, 3.4765F));

		PartDefinition cube_r259 = rightOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(0.0F, -0.9F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.887F, -0.2803F, -2.8558F, 1.5487F, 1.1848F, 1.0216F));

		PartDefinition cube_r260 = rightOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(-0.5F, -0.319F, -0.9553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7193F, -0.3169F, -3.9785F, 0.1338F, 0.4148F, 0.1008F));

		PartDefinition cube_r261 = rightOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(-0.5F, -0.6835F, -0.9672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7193F, -0.3169F, -3.9785F, 0.2734F, 0.4148F, 0.1008F));

		PartDefinition cube_r262 = rightOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.5F, -0.6796F, -0.3427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3605F, 1.3797F, -5.541F, 2.1133F, 0.0768F, -0.0596F));

		PartDefinition cube_r263 = rightOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-0.5F, -0.2614F, -0.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3605F, 1.3797F, -5.541F, 1.3628F, 0.0768F, -0.0596F));

		PartDefinition cube_r264 = rightOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7118F, 0.2429F, -5.2545F, 0.9557F, 0.0953F, -0.3711F));

		PartDefinition cube_r265 = rightOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7118F, 0.2429F, -5.2545F, 1.0779F, 0.0953F, -0.3711F));

		PartDefinition cube_r266 = rightOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(34, 32).mirror().addBox(0.0402F, 0.118F, -2.7559F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2934F, 0.6978F, -7.4904F, 2.1103F, 0.322F, -0.1236F));

		PartDefinition cube_r267 = rightOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.5F, 0.0396F, 0.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3738F, -6.7007F, 1.1872F, 0.0645F, -0.2139F));

		PartDefinition cube_r268 = rightOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.3F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1274F, 0.3725F, -7.2297F, 1.581F, 0.3374F, -0.4092F));

		PartDefinition cube_r269 = rightOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(45, 56).mirror().addBox(-0.1923F, -0.0902F, -0.8267F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0989F, -0.9989F, -7.3115F, 1.2168F, -0.0436F, 0.0108F));

		PartDefinition cube_r270 = rightOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(43, 32).mirror().addBox(-0.5923F, -0.0902F, -0.2267F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3121F, -0.9677F, -7.3035F, 1.0928F, 0.1901F, 0.5379F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.0931F, -0.2739F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.7985F, -6.322F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.4795F, 0.302F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-1.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 56).addBox(1.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -0.8425F, -0.98F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(39, 47).mirror().addBox(-0.7F, 0.481F, -0.9786F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 54).mirror().addBox(-1.0F, -0.219F, -0.5786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.5483F, -2.2732F, -1.7104F, -0.1745F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(-0.674F, 1.5555F, -0.71F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 60).mirror().addBox(-1.0F, 1.5882F, -0.3122F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.5483F, -2.2732F, -1.8675F, -0.1745F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(60, 19).mirror().addBox(-1.0F, 1.5688F, 0.2679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.5483F, -2.2732F, -1.9373F, -0.1745F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(39, 52).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(67, 64).addBox(1.9F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 61).addBox(1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(39, 52).addBox(1.9F, -1.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8F, 1.8617F, -0.5626F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(-0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(35, 62).addBox(1.9F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, -0.5016F, 0.1503F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 67).addBox(1.9F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 1.7142F, 0.3692F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-1.0F, -0.2348F, -0.014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.5483F, -2.2732F, -1.7628F, -0.1745F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(61, 27).mirror().addBox(-1.0F, -2.8196F, -2.3127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(61, 27).addBox(1.4F, -2.8196F, -2.3127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3F, 4.6771F, -2.3852F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 64).addBox(1.9F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 2.7585F, -1.8593F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-1.1F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 36).addBox(1.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -0.2294F, -1.3322F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(12, 64).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(12, 64).addBox(1.4F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, -0.2795F, -1.4147F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(39, 47).addBox(0.7F, 0.481F, -0.9786F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 54).addBox(0.0F, -0.219F, -0.5786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.5483F, -2.2732F, -1.7104F, 0.1745F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(70, 13).addBox(0.674F, 1.5555F, -0.71F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 60).addBox(0.0F, 1.5882F, -0.3122F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5483F, -2.2732F, -1.8675F, 0.1745F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(60, 19).addBox(0.0F, 1.5688F, 0.2679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5483F, -2.2732F, -1.9373F, 0.1745F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(10, 60).addBox(0.0F, -0.2348F, -0.014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5483F, -2.2732F, -1.7628F, 0.1745F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.7F, 0.4795F, 0.302F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(66, 24).addBox(-0.6008F, -0.4332F, 0.045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.3523F, -5.5415F, -2.626F, -0.0955F, 0.1668F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 57).addBox(-1.5F, -0.2031F, -0.148F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.3523F, -5.5415F, -2.3213F, 0.0F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0776F, 0.8623F, -6.1163F, -0.77F, -0.1235F, -2.6798F));

		PartDefinition cube_r292 = leftCanine3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(65, 39).addBox(-0.2104F, -0.5847F, -0.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 58).addBox(-0.2104F, -0.9847F, -0.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.275F, 0.4917F, 0.5381F, 0.5533F, 0.1853F, 0.0618F));

		PartDefinition cube_r293 = leftCanine3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 66).addBox(-0.3104F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2259F, 0.6846F, 0.3202F, 0.9896F, 0.1853F, 0.0618F));

		PartDefinition cube_r294 = leftCanine3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(65, 53).addBox(-0.2104F, -0.694F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(35, 66).addBox(-0.2104F, -1.094F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2385F, 0.3192F, 0.6757F, 0.8151F, 0.1853F, 0.0618F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2776F, 0.8623F, -6.1163F, -0.77F, 0.1235F, 2.6798F));

		PartDefinition cube_r295 = rightCanine3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.7896F, -0.5847F, -0.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 58).mirror().addBox(-0.7896F, -0.9847F, -0.5409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.275F, 0.4917F, 0.5381F, 0.5533F, -0.1853F, -0.0618F));

		PartDefinition cube_r296 = rightCanine3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.6896F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2259F, 0.6846F, 0.3202F, 0.9896F, -0.1853F, -0.0618F));

		PartDefinition cube_r297 = rightCanine3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-0.7896F, -0.694F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(35, 66).mirror().addBox(-0.7896F, -1.094F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2385F, 0.3192F, 0.6757F, 0.8151F, -0.1853F, -0.0618F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r298 = tail.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(67, 70).addBox(0.0F, -0.7F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 2.786F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r299 = tail.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(64, 70).addBox(0.0F, -0.8F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3103F, 0.786F, 0.2967F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 37).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, -0.4498F, 0.2368F, -0.1128F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(25, 38).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, 0.3102F, 0.2917F, 0.0919F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0331F, 2.6833F, 0.4538F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 75);
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