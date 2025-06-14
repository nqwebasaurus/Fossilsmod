package fossils.fossils.client.blockentity.model.triceratopshorridus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TriceratopshorridusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart leftHand3;
	private final ModelPart leftHand2;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart rightHand3;
	private final ModelPart rightHand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart frill;
	private final ModelPart frillInside;
	private final ModelPart frillInside2;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;

	public TriceratopshorridusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.leftHand3 = this.lefthand.getChild("leftHand3");
		this.leftHand2 = this.lefthand.getChild("leftHand2");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.rightHand3 = this.righthand.getChild("rightHand3");
		this.rightHand2 = this.righthand.getChild("rightHand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.frill = this.head.getChild("frill");
		this.frillInside = this.frill.getChild("frillInside");
		this.frillInside2 = this.frill.getChild("frillInside2");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(58, 26).addBox(-1.0F, -1.1928F, 0.3466F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -40.5666F, 13.0442F, -0.5186F, 0.1138F, -0.0647F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(91, 11).addBox(0.0F, 0.5662F, 8.8793F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(0.0F, 0.0662F, 0.0793F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6808F, -7.32F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, -2.1338F, 2.2484F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9808F, -2.92F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(135, 155).addBox(-0.006F, -8.2276F, -0.5896F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9625F, -7.9721F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 40).addBox(-1.0F, 0.0364F, -9.9709F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2292F, 0.3175F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 26).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.004F))
				.texOffs(37, 53).addBox(1.0F, 0.8038F, 0.0069F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(37, 53).mirror().addBox(-3.0F, 0.8038F, 0.0069F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9527F, 9.274F, -0.2552F, 0.1267F, -0.033F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(177, 106).addBox(0.0F, -0.3422F, -0.0676F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 177).addBox(0.0F, 1.0578F, 1.8324F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8972F, 8.0283F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 140).addBox(0.0F, -2.0271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 6.8702F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(141, 15).addBox(0.0F, -3.3553F, -0.034F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 10.0394F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(81, 174).addBox(0.0F, -3.9688F, -0.0069F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 8.0394F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 174).addBox(0.0F, -4.2636F, 0.1029F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 5.8394F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 116).addBox(0.0F, -4.5957F, -0.0527F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.0394F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 174).addBox(0.0F, -4.6909F, 0.022F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1643F, 2.0245F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(152, 170).addBox(0.0F, -4.8579F, -0.068F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2643F, -0.0755F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(44, 80).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(51, 98).addBox(0.6F, -0.1697F, 0.6915F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(51, 98).mirror().addBox(-2.6F, -0.1697F, 0.6915F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.038F, 10.8772F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(79, 155).addBox(0.0F, -1.8525F, 0.0039F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2209F, 6.9414F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 155).addBox(0.0F, -2.0605F, 0.0415F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2209F, 4.8414F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(145, 34).addBox(0.0F, -2.3443F, 0.0821F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2209F, 2.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(106, 177).addBox(0.0F, -3.1547F, 0.0262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(34, 177).addBox(0.0F, 2.3F, 5.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 137).addBox(0.0F, 1.3F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 177).addBox(0.0F, 0.2F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4685F, 0.5421F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.004F))
				.texOffs(17, 178).addBox(0.0F, -1.503F, 6.9834F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9193F, 7.6894F, 0.1929F, 0.1302F, 0.0138F));

		PartDefinition cube_r18 = tail3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 178).addBox(0.0F, -1.291F, -0.0511F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2119F, 5.0345F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(88, 160).addBox(0.0F, -1.291F, 0.0489F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2119F, 2.9345F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 134).addBox(0.0F, 5.8F, 11.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 39).addBox(0.0F, 5.0F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(177, 58).addBox(0.0F, 3.1F, 7.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3878F, -7.1473F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(92, 151).addBox(0.0F, -1.591F, 0.0489F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2119F, 0.9345F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(99, 94).addBox(-0.5F, -0.2498F, 0.0085F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(71, 178).addBox(0.0F, -0.6498F, 5.0085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0884F, 7.6065F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(178, 52).addBox(0.0F, -0.7544F, 0.0508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1954F, 2.9577F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(87, 178).addBox(0.0F, 1.7F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 178).addBox(0.0F, 1.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 43).addBox(0.0F, 0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8869F, 0.5657F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(178, 38).addBox(0.0F, -1.2044F, 0.0508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1954F, 0.9577F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, -0.2497F, 0.0085F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0179F, 6.8998F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r25 = tail5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(178, 98).addBox(0.0F, 2.4F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 95).addBox(0.0F, 2.2F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 92).addBox(0.0F, 1.9F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8585F, -5.9343F, 0.2443F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(141, 8).addBox(-0.5F, -0.2497F, 0.0085F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0167F, 7.0028F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(157, 80).addBox(-0.5F, -0.2498F, 0.0085F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0254F, 5.0249F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(70, 105).addBox(-2.0F, 17.1178F, -6.61F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.9F, 1.7447F, 0.5979F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftleg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(118, 85).addBox(-1.5F, -2.3F, -1.3F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 17.245F, -6.1923F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftleg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(114, 112).addBox(-1.5F, 0.0F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.7922F, -1.412F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftleg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 114).addBox(-1.5F, 0.0F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.1429F, 1.5169F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftleg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(119, 29).addBox(-1.5F, -1.8F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftleg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(94, 115).addBox(-0.5F, -9.1075F, -0.0404F, 3.0F, 9.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 9.0299F, -5.0473F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftleg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(121, 8).addBox(-0.5F, 7.7925F, -3.0404F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(118, 120).addBox(-0.5F, 7.7925F, -2.3404F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftleg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(75, 120).addBox(-0.5F, -0.1075F, -2.1404F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 2.2114F, 0.1013F, -0.3098F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0278F, -6.1546F, -0.0749F, -0.0623F, 0.1632F));

		PartDefinition cube_r33 = leftleg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 122).addBox(-0.3F, -0.7382F, 0.3721F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 1.844F, 0.5254F, -0.0873F, 0.0F, 0.0436F));

		PartDefinition cube_r34 = leftleg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(130, 145).addBox(-0.3F, 1.4618F, 0.4721F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3F, 1.844F, 0.5254F, 0.2182F, 0.0F, 0.0436F));

		PartDefinition cube_r35 = leftleg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(41, 123).addBox(-2.0F, -0.0773F, 0.3893F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3862F, 1.1985F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftleg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 120).addBox(-2.0F, -2.1773F, -0.0107F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.1944F, -0.842F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftleg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(124, 63).addBox(-1.5F, -1.7F, -2.1F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 12.9791F, 5.4418F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftleg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(115, 158).addBox(-1.0F, -1.6F, -0.7F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 3.8218F, 2.2614F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftleg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(144, 99).addBox(-1.0F, -2.6F, -0.6F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 4.9848F, 2.1292F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftleg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(154, 46).addBox(-1.0F, -2.0F, -1.025F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 9.7788F, 4.0982F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftleg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(11, 154).addBox(-1.101F, 0.0011F, -0.9792F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.499F, 7.9873F, 3.0117F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftleg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(133, 81).addBox(-1.101F, -1.7989F, 0.4208F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 4.8533F, -0.1152F, 0.4625F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.4746F, 4.142F, 0.0173F, 0.0023F, -0.1309F));

		PartDefinition cube_r43 = leftleg3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 91).addBox(-1.602F, -2.4938F, -0.4569F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 1.979F, -1.1583F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2271F, -0.625F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftfoot.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(146, 125).addBox(-1.5F, -3.1989F, 1.99F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 4.4261F, -0.8059F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.066F, -2.5667F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftfoot2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(144, 80).addBox(-2.0F, -1.1999F, -4.8175F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.4146F, 1.6921F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r46 = leftfoot2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 113).addBox(-1.0F, -1.1999F, -4.7175F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.4146F, 1.6921F, 0.0F, -0.2618F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 106).addBox(-2.0F, 17.1178F, -6.61F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.9F, 1.7447F, 0.5979F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightleg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(119, 0).addBox(-2.5F, -2.3F, -1.3F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 17.245F, -6.1923F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightleg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(45, 115).addBox(-2.5F, 0.0F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.7922F, -1.412F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(114, 104).addBox(-2.5F, 0.0F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -1.1429F, 1.5169F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightleg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(119, 36).addBox(-2.5F, -1.8F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 116).addBox(-2.5F, -9.1075F, -0.0404F, 3.0F, 9.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 9.0299F, -5.0473F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(11, 122).addBox(-2.5F, 7.7925F, -3.0404F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(0, 122).addBox(-2.5F, 7.7925F, -2.3404F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(121, 52).addBox(-2.5F, -0.1075F, -2.1404F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 2.2114F, 0.1013F, -0.3098F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0278F, -6.1546F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightleg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(168, 162).addBox(-0.7F, -0.7382F, 0.3721F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 1.844F, 0.5254F, -0.0873F, 0.0F, -0.0436F));

		PartDefinition cube_r55 = rightleg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(145, 150).addBox(-0.7F, 1.4618F, 0.4721F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.3F, 1.844F, 0.5254F, 0.2182F, 0.0F, -0.0436F));

		PartDefinition cube_r56 = rightleg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(123, 43).addBox(-2.0F, -0.0773F, 0.3893F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3862F, 1.1985F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightleg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(120, 74).addBox(-2.0F, -2.1773F, -0.0107F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.1944F, -0.842F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightleg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(129, 130).addBox(-2.5F, -1.7F, -2.1F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.9791F, 5.4418F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightleg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(159, 66).addBox(-2.0F, -1.6F, -0.7F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 3.8218F, 2.2614F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightleg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(145, 15).addBox(-2.0F, -2.6F, -0.6F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 4.9848F, 2.1292F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightleg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(68, 155).addBox(-2.0F, -2.0F, -1.025F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 9.7788F, 4.0982F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightleg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 155).addBox(-1.899F, 0.0011F, -0.9792F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.499F, 7.9873F, 3.0117F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightleg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(35, 137).addBox(-1.899F, -1.7989F, 0.4208F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 4.8533F, -0.1152F, 0.4625F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.4746F, 4.142F, -0.1613F, 0.1947F, -0.0915F));

		PartDefinition cube_r64 = rightleg3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(136, 137).addBox(-2.398F, -2.4938F, -0.4569F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 1.979F, -1.1583F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2271F, -0.625F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightfoot.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(154, 24).addBox(-2.5F, -3.1989F, 1.99F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 4.4261F, -0.8059F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.066F, -2.5667F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightfoot2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(83, 144).addBox(0.0F, -1.1999F, -4.8175F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.4146F, 1.6921F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r67 = rightfoot2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(77, 113).addBox(-3.0F, -1.1999F, -4.7175F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.4146F, 1.6921F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.2995F, 4.197F, 6.9752F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(95, 173).addBox(0.4902F, 10.0963F, 9.5653F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -0.3101F, 0.0079F, 0.1688F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(173, 94).addBox(0.4902F, 7.2009F, 12.8484F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -0.5719F, 0.0079F, 0.1688F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 150).addBox(-0.1F, -1.2F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7539F, -6.7302F, -9.2779F, -0.6471F, 0.0481F, 0.0237F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 45).addBox(-2.5F, -0.5F, -3.5F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -7.8434F, -5.3176F, -0.0493F, 0.0526F, 0.1109F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(129, 109).addBox(-1.3F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.5102F, -6.9799F, 4.7316F, -0.2251F, -0.1176F, 0.1497F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(129, 102).addBox(-2.2965F, 0.2087F, -0.1005F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2305F, -8.2422F, 2.5682F, -0.2238F, 0.0526F, 0.1109F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(156, 19).addBox(-2.048F, 0.4701F, -0.2486F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(5.7305F, -7.8422F, 0.1682F, 0.1849F, -0.4202F, 0.0258F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(146, 75).addBox(-2.5F, -0.075F, -0.625F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2305F, -7.5422F, 0.1682F, 0.1689F, 0.0526F, 0.1109F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(56, 127).addBox(-2.5F, -0.075F, -3.025F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2305F, -7.5422F, 0.1682F, -0.1802F, 0.0526F, 0.1109F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(46, 149).addBox(-1.2F, -0.5F, -2.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1085F, -6.487F, -16.8845F, 0.4016F, 0.0273F, 0.2012F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(149, 34).addBox(-0.975F, -0.5608F, -3.4383F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4718F, -7.802F, -12.8644F, 0.2329F, -0.0839F, 0.1171F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(144, 130).addBox(-2.6F, -0.475F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9538F, -8.0265F, -9.416F, 0.0086F, -0.0429F, 0.1273F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(168, 80).addBox(-1.0F, -0.6308F, 0.4587F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4718F, -7.802F, -12.8644F, 0.1014F, -0.0414F, 0.1272F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(101, 77).addBox(-1.9F, -0.1F, -5.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3285F, -8.2228F, -10.1772F, 0.1949F, 0.1965F, 0.2044F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(149, 40).addBox(-1.3833F, -0.5F, -2.0466F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4715F, -6.3144F, -17.5027F, 0.4176F, -0.2846F, 0.0184F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(168, 106).addBox(-0.825F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.6828F, -6.5675F, 7.5836F, -0.0264F, -0.1221F, 0.0032F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(162, 118).addBox(0.7005F, -0.3828F, -1.2043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, -6.7F, 7.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(173, 74).addBox(2.6568F, -1.3833F, 0.049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3F, -6.7F, 7.0F, -0.7024F, -0.271F, 0.2228F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(168, 158).addBox(0.7005F, -1.3833F, 1.2405F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, -6.7F, 7.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(86, 120).addBox(0.4902F, 8.3521F, 7.6425F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -0.1443F, 0.0079F, 0.1688F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(33, 153).addBox(0.2811F, -3.8437F, 8.1256F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -1.1628F, 0.0267F, 0.1676F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(101, 163).addBox(-0.024F, -1.3047F, 5.9818F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -0.8716F, 0.027F, 0.1229F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 173).addBox(0.2303F, 0.0024F, -1.2005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, 1.9375F, -0.042F, 0.1023F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(132, 21).addBox(0.2041F, -0.3907F, 1.0364F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -0.7241F, -0.042F, 0.1023F));

		PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(115, 164).addBox(0.2041F, 0.1359F, -2.1729F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.225F, -0.4F, -3.1F, -0.3053F, -0.042F, 0.1023F));

		PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(157, 107).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5299F, 1.4992F, -8.0903F, -0.3774F, -0.1637F, 0.0262F));

		PartDefinition cube_r94 = bone.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(7, 173).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7069F, 0.4449F, -8.9943F, -0.8574F, -0.1637F, 0.0262F));

		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(105, 115).addBox(0.7408F, -0.5995F, -2.343F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -1.3F, -7.1F, 0.7945F, -0.0501F, -0.0153F));

		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 163).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3624F, 0.2361F, -18.8255F, 0.6195F, -0.0521F, 0.005F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(169, 132).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.387F, -2.4011F, -19.0428F, 1.0558F, -0.0521F, 0.005F));

		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 169).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.387F, -2.4011F, -19.0428F, 0.5758F, -0.0521F, 0.005F));

		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(11, 161).addBox(0.8007F, -1.6103F, -10.5483F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(23, 77).addBox(0.8007F, -0.4103F, -7.7483F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4F, -0.9F, -9.9F, -0.035F, -0.0521F, 0.005F));

		PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(46, 142).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8441F, -2.2563F, -8.65F, 1.2287F, 0.002F, 0.0919F));

		PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(78, 167).addBox(-0.5F, -1.8F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8196F, -0.9677F, -8.3052F, 0.4886F, -0.0521F, 0.005F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(102, 25).addBox(1.2045F, -0.5866F, -0.1641F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, -0.4F, -17.7F, 0.0522F, -0.0521F, 0.005F));

		PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 143).addBox(0.9386F, -0.0015F, -5.1361F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, -1.4F, -12.5F, -0.2096F, -0.0521F, 0.005F));

		PartDefinition cube_r104 = bone.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 83).addBox(0.1422F, -6.4802F, -5.0133F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.4F, -0.137F, -0.0656F, 0.1266F));

		PartDefinition cube_r105 = bone.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 55).addBox(-1.5F, 0.4F, -5.0F, 3.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7995F, -4.9195F, -3.6774F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition cube_r106 = bone.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5F, -1.9815F, -7.9642F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4005F, -4.0168F, 8.812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(171, 0).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4005F, -5.3168F, 9.212F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(117, 151).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1005F, -6.0813F, -0.9417F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r109 = bone.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(92, 66).addBox(0.6005F, -2.5822F, 0.0698F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.9F, -4.4F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.2995F, 4.197F, 6.9752F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(95, 173).mirror().addBox(-1.4902F, 10.0963F, 9.5653F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -0.3101F, -0.0079F, -0.1688F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(173, 94).mirror().addBox(-1.4902F, 7.2009F, 12.8484F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -0.5719F, -0.0079F, -0.1688F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.9F, -1.2F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7539F, -6.7302F, -9.2779F, -0.6471F, -0.0481F, -0.0237F));

		PartDefinition cube_r113 = bone3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-2.5F, -0.5F, -3.5F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -7.8434F, -5.3176F, -0.0493F, -0.0526F, -0.1109F));

		PartDefinition cube_r114 = bone3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(129, 109).mirror().addBox(-0.7F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5102F, -6.9799F, 4.7316F, -0.2251F, 0.1176F, -0.1497F));

		PartDefinition cube_r115 = bone3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(129, 102).mirror().addBox(0.2965F, 0.2087F, -0.1005F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2305F, -8.2422F, 2.5682F, -0.2238F, -0.0526F, -0.1109F));

		PartDefinition cube_r116 = bone3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(156, 19).mirror().addBox(0.048F, 0.4701F, -0.2486F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-5.7305F, -7.8422F, 0.1682F, 0.1849F, 0.4202F, -0.0258F));

		PartDefinition cube_r117 = bone3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(146, 75).mirror().addBox(-0.5F, -0.075F, -0.625F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2305F, -7.5422F, 0.1682F, 0.1689F, -0.0526F, -0.1109F));

		PartDefinition cube_r118 = bone3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(56, 127).mirror().addBox(-2.5F, -0.075F, -3.025F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2305F, -7.5422F, 0.1682F, -0.1802F, -0.0526F, -0.1109F));

		PartDefinition cube_r119 = bone3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(46, 149).mirror().addBox(-0.8F, -0.5F, -2.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1085F, -6.487F, -16.8845F, 0.4016F, -0.0273F, -0.2012F));

		PartDefinition cube_r120 = bone3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(149, 34).mirror().addBox(-1.025F, -0.5608F, -3.4383F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4718F, -7.802F, -12.8644F, 0.2329F, 0.0839F, -0.1171F));

		PartDefinition cube_r121 = bone3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(144, 130).mirror().addBox(-2.4F, -0.475F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9538F, -8.0265F, -9.416F, 0.0086F, 0.0429F, -0.1273F));

		PartDefinition cube_r122 = bone3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(168, 80).mirror().addBox(-1.0F, -0.6308F, 0.4587F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4718F, -7.802F, -12.8644F, 0.1014F, 0.0414F, -0.1272F));

		PartDefinition cube_r123 = bone3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(101, 77).mirror().addBox(-1.1F, -0.1F, -5.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3285F, -8.2228F, -10.1772F, 0.1949F, -0.1965F, -0.2044F));

		PartDefinition cube_r124 = bone3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(149, 40).mirror().addBox(-0.6167F, -0.5F, -2.0466F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4715F, -6.3144F, -17.5027F, 0.4176F, 0.2846F, -0.0184F));

		PartDefinition cube_r125 = bone3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(168, 106).mirror().addBox(-1.175F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6828F, -6.5675F, 7.5836F, -0.0264F, 0.1221F, -0.0032F));

		PartDefinition cube_r126 = bone3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(162, 118).mirror().addBox(-2.7005F, -0.3828F, -1.2043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -6.7F, 7.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r127 = bone3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(173, 74).mirror().addBox(-3.6568F, -1.3833F, 0.049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -6.7F, 7.0F, -0.7024F, 0.271F, -0.2228F));

		PartDefinition cube_r128 = bone3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(168, 158).mirror().addBox(-2.7005F, -1.3833F, 1.2405F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -6.7F, 7.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r129 = bone3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(86, 120).mirror().addBox(-1.4902F, 8.3521F, 7.6425F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -0.1443F, -0.0079F, -0.1688F));

		PartDefinition cube_r130 = bone3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(33, 153).mirror().addBox(-1.2811F, -3.8437F, 8.1256F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -1.1628F, -0.0267F, -0.1676F));

		PartDefinition cube_r131 = bone3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(101, 163).mirror().addBox(-0.9761F, -1.3047F, 5.9818F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -0.8716F, -0.027F, -0.1229F));

		PartDefinition cube_r132 = bone3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(31, 173).mirror().addBox(-1.2303F, 0.0024F, -1.2005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, 1.9375F, 0.042F, -0.1023F));

		PartDefinition cube_r133 = bone3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(132, 21).mirror().addBox(-1.2041F, -0.3907F, 1.0364F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -0.7241F, 0.042F, -0.1023F));

		PartDefinition cube_r134 = bone3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(115, 164).mirror().addBox(-1.2041F, 0.1359F, -2.1729F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.225F, -0.4F, -3.1F, -0.3053F, 0.042F, -0.1023F));

		PartDefinition cube_r135 = bone3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(157, 107).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5299F, 1.4992F, -8.0903F, -0.3774F, 0.1637F, -0.0262F));

		PartDefinition cube_r136 = bone3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(7, 173).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7069F, 0.4449F, -8.9943F, -0.8574F, 0.1637F, -0.0262F));

		PartDefinition cube_r137 = bone3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(105, 115).mirror().addBox(-1.7408F, -0.5995F, -2.343F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -1.3F, -7.1F, 0.7945F, 0.0501F, 0.0153F));

		PartDefinition cube_r138 = bone3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 163).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3624F, 0.2361F, -18.8255F, 0.6195F, 0.0521F, -0.005F));

		PartDefinition cube_r139 = bone3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(169, 132).mirror().addBox(-0.5F, 0.3F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.387F, -2.4011F, -19.0428F, 1.0558F, 0.0521F, -0.005F));

		PartDefinition cube_r140 = bone3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 169).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.387F, -2.4011F, -19.0428F, 0.5758F, 0.0521F, -0.005F));

		PartDefinition cube_r141 = bone3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(11, 161).mirror().addBox(-1.8007F, -1.6103F, -10.5483F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(23, 77).mirror().addBox(-1.8007F, -0.4103F, -7.7483F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.9F, -9.9F, -0.035F, 0.0521F, -0.005F));

		PartDefinition cube_r142 = bone3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(46, 142).mirror().addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8441F, -2.2563F, -8.65F, 1.2287F, -0.002F, -0.0919F));

		PartDefinition cube_r143 = bone3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(78, 167).mirror().addBox(-0.5F, -1.8F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8196F, -0.9677F, -8.3052F, 0.4886F, 0.0521F, -0.005F));

		PartDefinition cube_r144 = bone3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(102, 25).mirror().addBox(-2.2045F, -0.5866F, -0.1641F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.4F, -17.7F, 0.0522F, 0.0521F, -0.005F));

		PartDefinition cube_r145 = bone3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 143).mirror().addBox(-1.9386F, -0.0015F, -5.1361F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.4F, -12.5F, -0.2096F, 0.0521F, -0.005F));

		PartDefinition cube_r146 = bone3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-1.1422F, -6.4802F, -5.0133F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -4.4F, -0.137F, 0.0656F, -0.1266F));

		PartDefinition cube_r147 = bone3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.5F, 0.4F, -5.0F, 3.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7995F, -4.9195F, -3.6774F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition cube_r148 = bone3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.5F, -1.9815F, -7.9642F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4005F, -4.0168F, 8.812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r149 = bone3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(171, 0).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4005F, -5.3168F, 9.212F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r150 = bone3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(117, 151).mirror().addBox(-0.5F, -0.3F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, -6.0813F, -0.9417F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r151 = bone3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(92, 66).mirror().addBox(-1.6005F, -2.5822F, 0.0698F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.9F, -4.4F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1554F, -8.7886F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(110, 155).addBox(0.0F, -8.7939F, 0.9989F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9936F, -2.816F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(166, 149).addBox(-0.5F, -2.7341F, 0.0304F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(156, 165).addBox(0.0F, -8.7341F, 0.0304F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0936F, -4.816F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(124, 166).addBox(-0.5F, -2.7282F, -0.9946F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 164).addBox(0.0F, -8.7282F, -0.9946F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9936F, -6.816F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(175, 162).mirror().addBox(-2.9592F, -0.2719F, -0.3429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -3.3081F, -0.6628F, -0.2171F, -0.2287F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 176).mirror().addBox(-4.3898F, -1.7708F, -0.4086F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -3.3081F, -0.5238F, -0.5211F, -0.7164F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(166, 156).mirror().addBox(-4.831F, -4.126F, -0.2316F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5327F, -4.9081F, -0.0904F, -0.2936F, -1.3759F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(165, 49).mirror().addBox(-4.7447F, -4.8989F, -0.3422F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3673F, -6.2081F, -0.0686F, 0.0529F, -1.3978F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(76, 172).mirror().addBox(-7.6058F, -4.8989F, -1.1633F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3673F, -6.2081F, -0.0703F, 0.227F, -1.41F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-15.8528F, -3.7368F, -4.2281F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.0703F, 0.227F, -1.41F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(175, 67).mirror().addBox(-2.9592F, -0.2719F, -0.3429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.3035F, -0.122F, -0.29F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(176, 50).mirror().addBox(-4.3898F, -1.7708F, -0.4086F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.2401F, -0.2637F, -0.8265F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(133, 91).mirror().addBox(-10.4442F, -3.7368F, -2.4493F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.0686F, 0.0529F, -1.3978F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(165, 51).mirror().addBox(-6.8322F, -3.7284F, -0.8291F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.0698F, -0.1908F, -1.3809F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(168, 110).mirror().addBox(-3.6412F, -2.7181F, -0.4331F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.8683F, -3.4255F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(150, 66).mirror().addBox(-3.8822F, -2.391F, -1.6108F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.1683F, -5.4255F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(76, 172).addBox(4.6058F, -4.8989F, -1.1633F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3673F, -6.2081F, -0.0703F, -0.227F, 1.41F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(165, 49).addBox(0.7447F, -4.8989F, -0.3422F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3673F, -6.2081F, -0.0686F, -0.0529F, 1.3978F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(166, 156).addBox(0.831F, -4.126F, -0.2316F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5327F, -4.9081F, -0.0904F, 0.2936F, 1.3759F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(84, 176).addBox(2.3898F, -1.7708F, -0.4086F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -3.3081F, -0.5238F, 0.5211F, 0.7164F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(175, 162).addBox(0.9591F, -0.2719F, -0.3429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -3.3081F, -0.6628F, 0.2171F, 0.2287F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(165, 51).addBox(2.8322F, -3.7284F, -0.8291F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.0698F, 0.1908F, 1.3809F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 95).addBox(9.8528F, -3.7368F, -4.2281F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.0703F, -0.227F, 1.41F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(133, 91).addBox(6.4442F, -3.7368F, -2.4493F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.0686F, -0.0529F, 1.3978F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(176, 50).addBox(2.3898F, -1.7708F, -0.4086F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.2401F, 0.2637F, 0.8265F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(175, 67).addBox(0.9591F, -0.2719F, -0.3429F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9327F, -6.6081F, -0.3035F, 0.122F, 0.29F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(168, 110).addBox(0.6412F, -2.7181F, -0.4331F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.8683F, -3.4255F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(150, 66).addBox(0.8822F, -2.391F, -1.6108F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.1683F, -5.4255F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 38).addBox(-1.0F, -1.3073F, -8.6534F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.3064F, 0.784F, -0.0087F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3934F, -7.8073F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(167, 19).addBox(-0.5F, -3.1243F, -1.9754F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(140, 155).addBox(0.0F, -8.1243F, -1.9754F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0393F, -4.0009F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(170, 70).mirror().addBox(-3.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.0411F, -5.1021F, 0.1384F, 0.0177F, -0.3135F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(31, 24).mirror().addBox(-22.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.0411F, -5.1021F, 0.017F, 0.1065F, -1.3804F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(124, 72).mirror().addBox(-6.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.0411F, -5.1021F, 0.0681F, 0.0837F, -0.8548F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-17.312F, -3.5594F, -2.5705F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -2.0752F, -2.1587F, -0.0401F, 0.19F, -1.3671F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(58, 38).mirror().addBox(-10.5534F, -3.5569F, -1.1528F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -2.0752F, -2.1587F, -0.0394F, 0.0505F, -1.3616F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(138, 171).mirror().addBox(-5.1577F, -1.7067F, -0.4884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.9002F, -2.0087F, -0.1321F, -0.1475F, -0.8224F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(149, 141).mirror().addBox(-4.1906F, -2.5421F, -1.7158F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8393F, -0.0009F, 0.2366F, -0.12F, 0.5619F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(169, 39).mirror().addBox(-4.5759F, -2.9118F, -3.9039F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4393F, -0.9009F, 0.2366F, -0.12F, 0.5619F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(173, 72).mirror().addBox(-2.738F, -0.3084F, -0.3774F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.9002F, -2.0087F, -0.236F, -0.1027F, -0.2714F));

		PartDefinition cube_r190 = body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(170, 70).addBox(0.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0411F, -5.1021F, 0.1384F, -0.0177F, 0.3135F));

		PartDefinition cube_r191 = body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(31, 24).addBox(4.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0411F, -5.1021F, 0.017F, -0.1065F, 1.3804F));

		PartDefinition cube_r192 = body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(124, 72).addBox(2.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0411F, -5.1021F, 0.0681F, -0.0837F, 0.8548F));

		PartDefinition cube_r193 = body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(167, 12).addBox(-0.5F, -2.6588F, -1.9386F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 162).addBox(0.0F, -8.1588F, -1.9386F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8393F, -1.0009F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(149, 141).addBox(1.1906F, -2.5421F, -1.7158F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8393F, -0.0009F, 0.2366F, 0.12F, -0.5619F));

		PartDefinition cube_r195 = body2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(81, 35).addBox(10.312F, -3.5594F, -2.5705F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.775F, -2.0752F, -2.1587F, -0.0401F, -0.19F, 1.3671F));

		PartDefinition cube_r196 = body2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(58, 38).addBox(2.5535F, -3.5569F, -1.1528F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.775F, -2.0752F, -2.1587F, -0.0394F, -0.0505F, 1.3616F));

		PartDefinition cube_r197 = body2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(138, 171).addBox(2.1577F, -1.7067F, -0.4884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.9002F, -2.0087F, -0.1321F, 0.1475F, 0.8224F));

		PartDefinition cube_r198 = body2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(173, 72).addBox(-0.262F, -0.3084F, -0.3774F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.9002F, -2.0087F, -0.236F, 0.1027F, 0.2714F));

		PartDefinition cube_r199 = body2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(169, 39).addBox(1.5759F, -2.9118F, -3.9039F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4393F, -0.9009F, 0.2366F, 0.12F, -0.5619F));

		PartDefinition cube_r200 = body2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(101, 85).addBox(-1.0F, -0.1079F, -7.0367F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8393F, 0.9991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3344F, -5.6743F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(43, 167).addBox(-0.5F, -2.7229F, -1.9919F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(166, 123).addBox(0.0F, -8.2229F, -1.9919F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0197F, -3.954F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(38, 167).addBox(0.0F, -8.2477F, -2.032F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(31, 166).addBox(-0.5F, -3.2477F, -2.032F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5197F, -1.054F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(31, 22).mirror().addBox(-22.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.8755F, -2.0278F, 0.0038F, 0.0379F, -1.3813F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(169, 137).mirror().addBox(-3.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.8755F, -2.0278F, 0.072F, -0.0038F, -0.314F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(124, 70).mirror().addBox(-6.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.8755F, -2.0278F, 0.0223F, 0.0309F, -0.8575F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(168, 92).mirror().addBox(-3.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6755F, -4.9278F, 0.155F, 0.0231F, -0.3132F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(-6.5291F, -1.7821F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6755F, -4.9278F, 0.0796F, 0.0968F, -0.8538F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(31, 20).mirror().addBox(-22.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6755F, -4.9278F, 0.0204F, 0.1236F, -1.38F));

		PartDefinition cube_r209 = body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(34, 88).mirror().addBox(-4.6074F, -2.6071F, -1.6754F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9197F, -0.054F, 0.2366F, -0.12F, 0.5619F));

		PartDefinition cube_r210 = body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(167, 26).mirror().addBox(-4.3138F, -2.7685F, -3.8622F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5197F, -0.854F, 0.2366F, -0.12F, 0.5619F));

		PartDefinition cube_r211 = body3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(34, 88).addBox(1.6074F, -2.6071F, -1.6754F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9197F, -0.054F, 0.2366F, 0.12F, -0.5619F));

		PartDefinition cube_r212 = body3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(124, 70).addBox(2.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8755F, -2.0278F, 0.0223F, -0.0309F, 0.8575F));

		PartDefinition cube_r213 = body3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(169, 137).addBox(0.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8755F, -2.0278F, 0.072F, 0.0038F, 0.314F));

		PartDefinition cube_r214 = body3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(31, 22).addBox(4.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8755F, -2.0278F, 0.0038F, -0.0379F, 1.3813F));

		PartDefinition cube_r215 = body3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(31, 20).addBox(4.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6755F, -4.9278F, 0.0204F, -0.1236F, 1.38F));

		PartDefinition cube_r216 = body3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(120, 83).addBox(2.5291F, -1.7821F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6755F, -4.9278F, 0.0796F, -0.0968F, 0.8538F));

		PartDefinition cube_r217 = body3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(168, 92).addBox(0.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6755F, -4.9278F, 0.155F, -0.0231F, 0.3132F));

		PartDefinition cube_r218 = body3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(167, 26).addBox(1.3138F, -2.7685F, -3.8622F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5197F, -0.854F, 0.2366F, 0.12F, -0.5619F));

		PartDefinition cube_r219 = body3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(85, 56).addBox(-1.0F, -0.1079F, -8.0367F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9197F, 0.946F, 0.2182F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5039F, -6.6829F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(57, 167).addBox(-0.5F, -3.8813F, -0.0808F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 168).addBox(0.0F, -8.8813F, -0.0808F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6206F, -4.6449F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(50, 167).addBox(-0.5F, -3.9788F, -0.066F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(110, 167).addBox(0.0F, -8.9788F, -0.066F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3206F, -2.0449F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(23, 66).addBox(0.0F, -7.3756F, -0.1611F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6206F, -8.0449F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(167, 140).addBox(-0.5F, -3.1359F, -0.6327F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7206F, -6.2449F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(92, 172).addBox(0.0F, -8.4359F, -0.1327F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7206F, -6.2449F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.6988F, -0.0943F, -0.4268F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8942F, 21.1134F, 0.0716F, 0.5959F, -0.641F, -0.1462F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(-0.6988F, -0.0943F, 0.2732F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8942F, 21.1134F, 0.0716F, 0.5026F, -0.7374F, -0.0904F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.6988F, -0.0943F, -0.5268F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8942F, 21.1134F, 0.0716F, 0.4795F, -0.8157F, -0.0901F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.6988F, -0.0943F, -0.6268F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8942F, 21.1134F, 0.0716F, 0.3763F, -0.9109F, -0.0275F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(167, 147).mirror().addBox(-3.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3206F, -6.3449F, 0.5696F, 0.1505F, -0.2766F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(120, 81).mirror().addBox(-6.5291F, -1.7821F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3206F, -6.3449F, 0.3847F, 0.4136F, -0.7752F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-21.7563F, -4.8079F, -0.5178F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3206F, -6.3449F, 0.1134F, 0.5467F, -1.3487F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(31, 18).mirror().addBox(-22.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.2794F, -1.5449F, 0.0742F, 0.3846F, -1.3664F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(116, 102).mirror().addBox(-6.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.2794F, -1.5449F, 0.2612F, 0.2949F, -0.8182F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(144, 114).mirror().addBox(-3.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.2794F, -1.5449F, 0.4093F, 0.1035F, -0.297F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(100, 174).mirror().addBox(-3.2782F, -2.8342F, 1.9963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2528F, -2.3499F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(31, 16).mirror().addBox(-22.7563F, -4.8078F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5794F, -3.9449F, 0.092F, 0.4615F, -1.359F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(109, 74).mirror().addBox(-6.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5794F, -3.9449F, 0.3184F, 0.3517F, -0.8F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(123, 50).mirror().addBox(-3.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5794F, -3.9449F, 0.485F, 0.1261F, -0.2883F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(176, 27).mirror().addBox(-2.04F, 0.0958F, -0.7785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.4206F, -7.5449F, 0.8366F, 0.0638F, -0.2487F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(143, 57).mirror().addBox(-9.8056F, -2.7314F, -0.813F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.4206F, -7.5449F, 0.3806F, 0.7262F, -1.1895F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(176, 25).mirror().addBox(-3.7954F, -0.9627F, -0.813F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.4206F, -7.5449F, 0.6897F, 0.4514F, -0.6474F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-0.6988F, -0.0943F, -0.4268F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8942F, 21.1134F, 0.0716F, 0.4376F, -1.0213F, -0.1029F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(31, 160).mirror().addBox(-1.4F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 21.2538F, -0.3674F, -0.1392F, -0.346F, 0.0475F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(174, 45).mirror().addBox(-3.1782F, -2.4342F, 1.0963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9528F, -4.3499F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(43, 174).mirror().addBox(-3.2198F, -2.3856F, -2.7642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9528F, -3.3499F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(100, 174).addBox(1.2782F, -2.8342F, 1.9963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2528F, -2.3499F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(144, 114).addBox(0.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2794F, -1.5449F, 0.4093F, -0.1035F, 0.297F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(116, 102).addBox(2.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2794F, -1.5449F, 0.2612F, -0.2949F, 0.8182F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(31, 18).addBox(4.7563F, -4.8079F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2794F, -1.5449F, 0.0742F, -0.3846F, 1.3664F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 53).addBox(4.7563F, -4.8079F, -0.5178F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3206F, -6.3449F, 0.1134F, -0.5467F, 1.3487F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(120, 81).addBox(2.5291F, -1.7821F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3206F, -6.3449F, 0.3847F, -0.4136F, 0.7752F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(167, 147).addBox(0.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3206F, -6.3449F, 0.5696F, -0.1505F, 0.2766F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(31, 16).addBox(4.7563F, -4.8078F, -0.5178F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5794F, -3.9449F, 0.092F, -0.4615F, 1.359F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(109, 74).addBox(2.5291F, -1.782F, -0.5178F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5794F, -3.9449F, 0.3184F, -0.3517F, 0.8F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(123, 50).addBox(0.0862F, -0.2134F, -0.452F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5794F, -3.9449F, 0.485F, -0.1261F, 0.2883F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(176, 27).addBox(0.04F, 0.0958F, -0.7785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4206F, -7.5449F, 0.8366F, -0.0638F, 0.2487F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(143, 57).addBox(2.8056F, -2.7314F, -0.813F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4206F, -7.5449F, 0.3806F, -0.7262F, 1.1895F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(176, 25).addBox(1.7954F, -0.9627F, -0.813F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4206F, -7.5449F, 0.6897F, -0.4514F, 0.6474F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 17).addBox(-0.3012F, -0.0943F, -0.4268F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8942F, 21.1134F, 0.0716F, 0.5959F, 0.641F, 0.1462F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(27, 40).addBox(-0.3012F, -0.0943F, 0.2732F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8942F, 21.1134F, 0.0716F, 0.5026F, 0.7374F, 0.0904F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 32).addBox(-0.3012F, -0.0943F, -0.5268F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8942F, 21.1134F, 0.0716F, 0.4795F, 0.8157F, 0.0901F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(58, 0).addBox(-0.3012F, -0.0943F, -0.6268F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8942F, 21.1134F, 0.0716F, 0.3763F, 0.9109F, 0.0275F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(50, 69).addBox(-0.3012F, -0.0943F, -0.4268F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8942F, 21.1134F, 0.0716F, 0.4376F, 1.0213F, 0.1029F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(31, 160).addBox(0.4F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7F, 21.2538F, -0.3674F, -0.1392F, 0.346F, -0.0475F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(42, 162).addBox(-2.1737F, 0.6114F, -2.4179F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1737F, 20.0496F, -1.2781F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(131, 93).addBox(-2.6737F, -1.1705F, -4.0716F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1737F, 21.6496F, -3.5781F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(174, 45).addBox(1.1782F, -2.4342F, 1.0963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9528F, -4.3499F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(43, 174).addBox(1.2198F, -2.3856F, -2.7642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9528F, -3.3499F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(27, 65).addBox(-1.0F, -0.907F, 0.5333F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7206F, -8.2449F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7231F, 16.643F, -7.4654F, 0.6079F, 0.0774F, -0.4019F));

		PartDefinition cube_r270 = leftarm.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(132, 50).addBox(-0.0544F, -7.424F, -2.9389F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6512F, 5.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r271 = leftarm.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(159, 72).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.8552F, 5.8377F, -2.6054F, 1.7557F, -0.5672F, -0.0056F));

		PartDefinition cube_r272 = leftarm.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(55, 160).addBox(-0.5F, -1.7F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6885F, 3.0695F, -0.7982F, 0.9703F, -0.5672F, -0.0056F));

		PartDefinition cube_r273 = leftarm.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(87, 105).addBox(-1.5F, -4.0F, -2.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6414F, 2.0521F, 0.6065F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftarm.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(138, 39).addBox(-1.5F, -4.3F, -1.3F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6414F, 2.0521F, 0.6065F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftarm.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(108, 43).addBox(-1.5F, -1.5F, -2.9F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1414F, 8.6511F, 3.652F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftarm.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 133).addBox(-1.5F, -4.3552F, -1.6656F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1414F, 5.8023F, 2.2706F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftarm.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(92, 155).addBox(-1.0F, -4.2482F, -0.9965F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1414F, 5.8023F, 2.2706F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7272F, 10.9543F, 3.6173F, -0.556F, -0.5958F, 1.607F));

		PartDefinition cube_r278 = leftarm2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(159, 123).addBox(-0.6305F, -3.9914F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7137F, 6.2703F, -0.985F, -0.3011F, -0.0522F, -0.0793F));

		PartDefinition cube_r279 = leftarm2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(59, 142).addBox(-1.0F, -0.4F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4396F, -1.7629F, 1.5307F, -0.237F, 0.1945F, 0.6749F));

		PartDefinition cube_r280 = leftarm2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(108, 144).addBox(0.1067F, -7.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 6.1523F, -2.4156F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition cube_r281 = leftarm2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(150, 159).addBox(-1.7F, -1.1F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7988F, 7.5522F, -1.4523F, -0.2921F, 0.0905F, 0.2921F));

		PartDefinition cube_r282 = leftarm2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(114, 131).addBox(0.1067F, -7.4546F, 0.3397F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.192F, 6.1523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.311F, 9.5155F, -2.2489F, 1.855F, 0.9821F, -0.5813F));

		PartDefinition cube_r283 = lefthand.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(146, 69).addBox(-0.9935F, -2.3221F, 0.0007F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r284 = lefthand.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(117, 145).addBox(0.0183F, -2.3256F, -0.0025F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition leftHand3 = lefthand.addOrReplaceChild("leftHand3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -2.5899F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftHand3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(145, 144).addBox(-0.515F, -1.038F, -3.3582F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition leftHand2 = lefthand.addOrReplaceChild("leftHand2", CubeListBuilder.create(), PartPose.offset(-0.5013F, 0.5347F, -2.5899F));

		PartDefinition cube_r286 = leftHand2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(86, 127).addBox(-1.5137F, -1.0941F, -3.8931F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7231F, 16.643F, -7.4654F, 0.0882F, 0.0227F, 0.2588F));

		PartDefinition cube_r287 = rightarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(61, 132).addBox(-0.9456F, -7.424F, -2.9389F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.6512F, 5.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r288 = rightarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(159, 86).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.8552F, 5.8377F, -2.6054F, 1.7557F, 0.5672F, 0.0056F));

		PartDefinition cube_r289 = rightarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(79, 160).addBox(-0.5F, -1.7F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6885F, 3.0695F, -0.7982F, 0.9703F, 0.5672F, 0.0056F));

		PartDefinition cube_r290 = rightarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(22, 145).addBox(-0.5F, -4.0F, -2.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.6414F, 2.0521F, 0.6065F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(97, 138).addBox(-0.5F, -4.3F, -1.3F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.6414F, 2.0521F, 0.6065F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(109, 65).addBox(-1.5F, -1.5F, -2.9F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1414F, 8.6511F, 3.652F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(11, 133).addBox(-1.5F, -4.3552F, -1.6656F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1414F, 5.8023F, 2.2706F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(155, 98).addBox(-1.0F, -4.2482F, -0.9965F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1414F, 5.8023F, 2.2706F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7272F, 10.9543F, 3.6173F, -0.1788F, 0.8434F, -0.7877F));

		PartDefinition cube_r295 = rightarm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(159, 149).addBox(-0.3695F, -3.9914F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7137F, 6.2703F, -0.985F, -0.3011F, 0.0522F, 0.0793F));

		PartDefinition cube_r296 = rightarm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(143, 48).addBox(-2.0F, -0.4F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4396F, -1.7629F, 1.5307F, -0.237F, -0.1945F, -0.6749F));

		PartDefinition cube_r297 = rightarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(136, 144).addBox(-2.1067F, -7.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 6.1523F, -2.4156F, -0.303F, -0.0393F, -0.1249F));

		PartDefinition cube_r298 = rightarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(160, 0).addBox(-1.3F, -1.1F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.7988F, 7.5522F, -1.4523F, -0.2921F, -0.0905F, -0.2921F));

		PartDefinition cube_r299 = rightarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(132, 8).addBox(-2.1067F, -7.4546F, 0.3397F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.192F, 6.1523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.311F, 9.5155F, -2.2489F, 0.8514F, -0.9821F, 0.5813F));

		PartDefinition cube_r300 = righthand.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(33, 147).addBox(-2.0065F, -2.3221F, 0.0007F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r301 = righthand.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(146, 92).addBox(-3.0183F, -2.3256F, -0.0025F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition rightHand3 = righthand.addOrReplaceChild("rightHand3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5013F, 0.5347F, -2.5899F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightHand3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(147, 0).addBox(-2.485F, -1.038F, -3.3582F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition rightHand2 = righthand.addOrReplaceChild("rightHand2", CubeListBuilder.create(), PartPose.offset(0.5013F, 0.5347F, -2.5899F));

		PartDefinition cube_r303 = rightHand2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(35, 130).addBox(-1.4863F, -1.0941F, -3.8931F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 9.6298F, -11.4532F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(13, 143).addBox(1.2992F, 0.9125F, 2.5585F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2339F, 1.2618F, -0.6106F, 0.0968F, 0.1501F, 0.7512F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(106, 9).addBox(-0.5F, -1.8F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8056F, 5.838F, 1.1082F, 2.2785F, 0.1501F, 0.7512F));

		PartDefinition cube_r306 = bone2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(17, 111).addBox(1.2992F, 0.7469F, -4.0616F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2339F, 1.2618F, -0.6106F, 1.2749F, 0.1501F, 0.7512F));

		PartDefinition cube_r307 = bone2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(153, 114).addBox(1.5493F, 0.1079F, -1.6799F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2339F, 1.2618F, -0.6106F, 1.7238F, 0.0018F, 0.4728F));

		PartDefinition cube_r308 = bone2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(160, 133).addBox(0.7381F, -1.3014F, 13.0838F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 0.8686F, -0.1287F, -0.0524F));

		PartDefinition cube_r309 = bone2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(165, 43).addBox(0.7381F, 4.3394F, 11.9297F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 1.3485F, -0.1287F, -0.0524F));

		PartDefinition cube_r310 = bone2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(123, 137).addBox(0.3869F, 0.3798F, 9.3883F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 0.9177F, -0.106F, -0.0371F));

		PartDefinition cube_r311 = bone2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(134, 0).addBox(0.3869F, 1.5409F, 4.306F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 1.0399F, -0.106F, -0.0371F));

		PartDefinition cube_r312 = bone2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(105, 120).addBox(-1.0333F, 2.0771F, -1.7214F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 1.4546F, 0.0672F, 0.2251F));

		PartDefinition cube_r313 = bone2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(70, 12).addBox(0.3869F, 0.0162F, 4.3974F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 1.0137F, -0.106F, -0.0371F));

		PartDefinition cube_r314 = bone2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(73, 131).addBox(-1.0333F, -0.0544F, -0.3436F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 0.8372F, -0.5145F, 0.9921F, 0.0672F, 0.2251F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 9.6298F, -11.4532F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r315 = bone4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(13, 143).mirror().addBox(-2.2992F, 0.9125F, 2.5585F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2339F, 1.2618F, -0.6106F, 0.0968F, -0.1501F, -0.7512F));

		PartDefinition cube_r316 = bone4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-0.5F, -1.8F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8056F, 5.838F, 1.1082F, 2.2785F, -0.1501F, -0.7512F));

		PartDefinition cube_r317 = bone4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(17, 111).mirror().addBox(-2.2992F, 0.7469F, -4.0616F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2339F, 1.2618F, -0.6106F, 1.2749F, -0.1501F, -0.7512F));

		PartDefinition cube_r318 = bone4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(153, 114).mirror().addBox(-2.5493F, 0.1079F, -1.6799F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2339F, 1.2618F, -0.6106F, 1.7238F, -0.0018F, -0.4728F));

		PartDefinition cube_r319 = bone4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(160, 133).mirror().addBox(-1.7381F, -1.3014F, 13.0838F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 0.8686F, 0.1287F, 0.0524F));

		PartDefinition cube_r320 = bone4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(165, 43).mirror().addBox(-1.7381F, 4.3394F, 11.9297F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 1.3485F, 0.1287F, 0.0524F));

		PartDefinition cube_r321 = bone4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(123, 137).mirror().addBox(-1.3869F, 0.3798F, 9.3883F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 0.9177F, 0.106F, 0.0371F));

		PartDefinition cube_r322 = bone4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-1.3869F, 1.5409F, 4.306F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 1.0399F, 0.106F, 0.0371F));

		PartDefinition cube_r323 = bone4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(105, 120).mirror().addBox(0.0333F, 2.0771F, -1.7214F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 1.4546F, -0.0672F, -0.2251F));

		PartDefinition cube_r324 = bone4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-1.3869F, 0.0162F, 4.3974F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 1.0137F, 0.106F, 0.0371F));

		PartDefinition cube_r325 = bone4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(73, 131).mirror().addBox(0.0333F, -0.0544F, -0.3436F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.8372F, -0.5145F, 0.9921F, -0.0672F, -0.2251F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3164F, -7.3877F, 0.0268F, -0.2181F, -0.0058F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(28, 168).addBox(0.0F, -6.2703F, -0.1461F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8216F, -2.9034F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(23, 45).addBox(0.0F, -5.6962F, -0.0131F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0216F, -7.0034F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(27, 32).addBox(0.0F, -5.8049F, -0.098F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3216F, -4.9034F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(173, 78).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.694F, -6.7788F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(50, 130).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.694F, -6.7788F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(35, 128).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.294F, -4.7788F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(147, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.294F, -4.7788F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r333 = neck2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(17, 176).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.094F, -2.5788F, 0.6122F, 0.4033F, -0.3554F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(175, 164).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.094F, -2.5788F, 0.2772F, 0.6526F, -0.9208F));

		PartDefinition cube_r335 = neck2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(131, 99).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.094F, -2.5788F, -0.1498F, 0.6875F, -1.5925F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(50, 130).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.694F, -6.7788F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(173, 78).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.694F, -6.7788F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r338 = neck2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(35, 128).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.294F, -4.7788F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(147, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.294F, -4.7788F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r340 = neck2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(17, 176).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.094F, -2.5788F, 0.6122F, -0.4033F, 0.3554F));

		PartDefinition cube_r341 = neck2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(175, 164).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.094F, -2.5788F, 0.2772F, -0.6526F, 0.9208F));

		PartDefinition cube_r342 = neck2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(131, 99).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.094F, -2.5788F, -0.1498F, -0.6875F, 1.5925F));

		PartDefinition cube_r343 = neck2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(15, 88).addBox(-1.0F, -1.1F, -6.3F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2784F, -0.6034F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9881F, -6.7892F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(107, 169).addBox(0.0F, -6.1032F, 0.0233F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -5.9F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(14, 173).addBox(0.0F, -5.9506F, 0.0628F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.8F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(120, 170).addBox(0.0F, -5.7755F, 0.048F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.8F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r347 = neck.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(94, 113).mirror().addBox(-1.7792F, 0.2788F, 0.2614F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r348 = neck.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(94, 113).addBox(0.7792F, 0.2788F, 0.2614F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition cube_r349 = neck.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(104, 56).addBox(-1.0F, -1.4F, -5.7F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6244F, -5.8352F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(145, 24).addBox(0.0F, -5.9F, -4.4F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -1.4F, -8.7F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.6468F, -6.0301F, 0.6405F, 0.1457F, 0.5255F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(130, 174).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0733F, -18.7146F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(24, 177).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3862F, -16.7392F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(43, 177).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.0966F, -20.1204F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(29, 177).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0966F, -20.1204F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(173, 88).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.6212F, -21.0658F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(173, 84).addBox(-1.0F, -0.3F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9042F, -19.9505F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(165, 176).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.9831F, -19.5227F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(140, 176).addBox(-0.5F, 0.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.03F, -18.633F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(63, 174).addBox(-0.5F, -2.8574F, -0.7058F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.9775F, -21.3449F, -2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(50, 174).addBox(-0.5F, -2.8574F, -0.7058F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, -2.9775F, -21.3449F, -3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(79, 49).addBox(-0.5F, -0.75F, -0.715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -2.3448F, -20.5144F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(171, 128).addBox(-1.0F, -0.0975F, 0.138F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.5095F, -18.1701F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(176, 34).mirror().addBox(-0.2923F, -1.1196F, -0.1222F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.991F, -21.5703F, -0.9061F, 0.0518F, -0.1398F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(174, 139).mirror().addBox(-0.2923F, 0.8138F, -0.3578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.991F, -21.5703F, -0.6443F, 0.0518F, -0.1398F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(144, 134).mirror().addBox(-0.6F, -2.1475F, 0.013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(154, 53).mirror().addBox(-0.6F, -1.9475F, 0.013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(144, 134).addBox(-0.4F, -2.1475F, 0.013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(154, 53).addBox(-0.4F, -1.9475F, 0.013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.8588F, -24.2667F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(176, 34).addBox(-0.7077F, -1.1196F, -0.1222F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.991F, -21.5703F, -0.9061F, -0.0518F, 0.1398F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(174, 139).addBox(-0.7077F, 0.8138F, -0.3578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.991F, -21.5703F, -0.6443F, -0.0518F, 0.1398F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(142, 116).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.0437F, -21.3984F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(158, 141).addBox(-0.5F, -2.8F, -1.6F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 4.2231F, -16.8603F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(126, 158).addBox(-0.5F, -2.0F, -2.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0F, 5.4291F, -18.4369F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(83, 151).addBox(-0.5F, -4.3F, -1.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 2.2345F, -20.8627F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(81, 25).addBox(-2.5F, -1.5F, -5.1F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(156, 13).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.2834F, -13.593F, 2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 98).addBox(-4.0F, 0.1F, -4.6F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0F, 1.157F, -14.2882F, 0.9682F, 0.0249F, 0.0345F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(100, 35).addBox(-2.0F, -2.0F, -5.1F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F))
				.texOffs(160, 53).addBox(-1.5F, -2.0F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.7066F, -13.6782F, 1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(171, 123).addBox(-1.0F, -1.5F, -0.625F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.2569F, -16.647F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(73, 69).addBox(-2.5F, -2.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.7326F, -10.3966F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(22, 137).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0565F, -10.3732F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(64, 53).addBox(-3.5F, -7.8499F, -2.2251F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7F, -5.2577F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(31, 0).addBox(-3.5F, -4.5F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8277F, -2.1916F, 0.1658F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0325F, -2.1434F, -6.491F, -0.9894F, -0.4609F, -0.5684F));

		PartDefinition cube_r381 = leftCheek.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(96, 147).addBox(0.3F, -1.0F, -1.8F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1339F, -2.9084F, 1.2417F, -0.5829F, 0.3385F, 0.9265F));

		PartDefinition cube_r382 = leftCheek.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(164, 100).addBox(-0.7F, -0.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0999F, -0.3137F, 5.1106F, -2.0888F, -0.9134F, -0.3236F));

		PartDefinition cube_r383 = leftCheek.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(165, 6).addBox(-0.6134F, -0.1225F, -0.5685F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.483F, -0.4126F, 4.1962F, -0.9576F, 0.4306F, 0.8661F));

		PartDefinition cube_r384 = leftCheek.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(70, 149).addBox(-2.6134F, -0.4225F, -3.4685F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.483F, -0.4126F, 4.1962F, -0.434F, 0.4306F, 0.8661F));

		PartDefinition cube_r385 = leftCheek.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(177, 80).addBox(-0.3F, 0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0934F, 0.001F, 5.5898F, -0.0223F, -0.6431F, 1.1226F));

		PartDefinition cube_r386 = leftCheek.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(22, 153).addBox(-0.6134F, 1.2475F, -2.3596F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.483F, -0.4126F, 4.1962F, -0.0413F, 0.4306F, 0.8661F));

		PartDefinition cube_r387 = leftCheek.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(34, 91).addBox(-0.5F, 0.5F, -4.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4589F, -1.7922F, -0.1097F, 0.4563F, 0.2998F, 0.7282F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0325F, -2.1434F, -6.491F, -0.9894F, 0.4609F, 0.5684F));

		PartDefinition cube_r388 = rightCheek.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(96, 147).mirror().addBox(-1.3F, -1.0F, -1.8F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1339F, -2.9084F, 1.2417F, -0.5829F, -0.3385F, -0.9265F));

		PartDefinition cube_r389 = rightCheek.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(164, 100).mirror().addBox(-0.3F, -0.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0999F, -0.3137F, 5.1106F, -2.0888F, 0.9134F, 0.3236F));

		PartDefinition cube_r390 = rightCheek.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(165, 6).mirror().addBox(-0.3866F, -0.1225F, -0.5685F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.483F, -0.4126F, 4.1962F, -0.9576F, -0.4306F, -0.8661F));

		PartDefinition cube_r391 = rightCheek.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(70, 149).mirror().addBox(-0.3866F, -0.4225F, -3.4685F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.483F, -0.4126F, 4.1962F, -0.434F, -0.4306F, -0.8661F));

		PartDefinition cube_r392 = rightCheek.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(177, 80).mirror().addBox(-0.7F, 0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0934F, 0.001F, 5.5898F, -0.0223F, 0.6431F, -1.1226F));

		PartDefinition cube_r393 = rightCheek.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(22, 153).mirror().addBox(-0.3866F, 1.2475F, -2.3596F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.483F, -0.4126F, 4.1962F, -0.0413F, -0.4306F, -0.8661F));

		PartDefinition cube_r394 = rightCheek.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(34, 91).mirror().addBox(-0.5F, 0.5F, -4.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.459F, -1.7922F, -0.1097F, 0.4563F, -0.2998F, -0.7282F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.041F, 7.113F, -24.3223F, 0.0503F, 0.1188F, -0.0879F));

		PartDefinition cube_r395 = leftBeak.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(85, 172).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1989F, 0.2296F, 1.7456F, -2.482F, 0.0699F, 0.0695F));

		PartDefinition cube_r396 = leftBeak.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(175, 176).addBox(-0.3497F, -2.0239F, -0.9042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0857F, 0.6093F, 0.0728F, -1.4785F, 0.0699F, 0.0695F));

		PartDefinition cube_r397 = leftBeak.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(177, 158).addBox(-0.4152F, -1.0094F, -1.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0875F, 1.7212F, 0.3592F, -1.2952F, 0.0699F, 0.0695F));

		PartDefinition cube_r398 = leftBeak.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(170, 58).addBox(-0.5073F, -1.8437F, 0.0482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1145F, -0.3742F, -0.0224F, -0.1171F, 0.0699F, 0.0695F));

		PartDefinition cube_r399 = leftBeak.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(177, 155).addBox(-1.2852F, -1.1706F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8704F, 1.8066F, 1.7696F, 1.061F, 0.0699F, 0.0695F));

		PartDefinition cube_r400 = leftBeak.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(115, 177).addBox(-1.3697F, 1.0628F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8704F, 0.9066F, -0.3304F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.041F, 7.113F, -24.3223F, 0.0503F, -0.1188F, 0.0879F));

		PartDefinition cube_r401 = rightBeak.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(85, 172).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1989F, 0.2296F, 1.7456F, -2.482F, -0.0699F, -0.0695F));

		PartDefinition cube_r402 = rightBeak.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(175, 176).mirror().addBox(-0.6503F, -2.0239F, -0.9042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0857F, 0.6093F, 0.0728F, -1.4785F, -0.0699F, -0.0695F));

		PartDefinition cube_r403 = rightBeak.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(177, 158).mirror().addBox(-0.5848F, -1.0094F, -1.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0875F, 1.7212F, 0.3592F, -1.2952F, -0.0699F, -0.0695F));

		PartDefinition cube_r404 = rightBeak.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(170, 58).mirror().addBox(-0.4928F, -1.8437F, 0.0482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1145F, -0.3742F, -0.0224F, -0.1171F, -0.0699F, -0.0695F));

		PartDefinition cube_r405 = rightBeak.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(177, 155).mirror().addBox(0.2852F, -1.1706F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8704F, 1.8066F, 1.7696F, 1.061F, -0.0699F, -0.0695F));

		PartDefinition cube_r406 = rightBeak.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(115, 177).mirror().addBox(0.3697F, 1.0628F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8704F, 0.9066F, -0.3304F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(4.3F, 0.487F, -8.6F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(108, 138).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.743F, 2.1063F, -5.8813F, 2.2656F, 0.3175F, -0.1985F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(147, 170).addBox(-0.9792F, -8.6237F, -1.5103F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4382F, -1.2309F, -1.5206F, 2.1347F, 0.3175F, -0.1985F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(22, 160).addBox(-0.9792F, -3.7328F, -1.1891F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4382F, -1.2309F, -1.5206F, 2.2219F, 0.3175F, -0.1985F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(131, 167).addBox(-0.4672F, -0.3225F, 0.6908F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8382F, 0.6691F, -1.5206F, 1.5073F, 0.3072F, -0.1208F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(32, 103).addBox(-1.0F, -1.1F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9027F, -5.3865F, -1.3523F, 0.8296F, 0.1352F, 0.1426F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(19, 98).addBox(-1.1F, -2.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.025F, -6.8489F, 2.2673F, 0.3902F, 0.1827F, 0.0719F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(174, 20).addBox(-0.4885F, -0.792F, -0.2162F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2277F, -19.7488F, -26.7425F, 2.1025F, 0.0798F, -3.0318F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(161, 168).addBox(-3.5184F, -26.8691F, -4.3327F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.4639F, -8.8531F, 0.7827F, 1.8197F, 0.1063F, -3.0776F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(45, 103).addBox(-0.4931F, -1.8011F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 77).addBox(-0.4931F, -1.2011F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2277F, -19.7488F, -26.7425F, 2.3521F, 0.1063F, -3.1212F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(176, 132).addBox(-0.4931F, -1.8034F, -0.2718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(3.2277F, -19.7488F, -26.7425F, 2.2473F, 0.1063F, -3.1212F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(173, 100).addBox(-0.4931F, -0.7122F, -0.4551F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(3.2277F, -19.7488F, -26.7425F, 1.8459F, 0.1063F, -3.1212F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(76, 174).addBox(-0.4931F, -0.6623F, -0.2892F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2277F, -19.7488F, -26.7425F, 2.0903F, 0.1063F, -3.1212F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(82, 94).addBox(-2.0F, -2.3F, -2.7F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5585F, -7.8952F, 3.5822F, 1.8071F, -0.1231F, -3.1108F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(99, 104).addBox(-2.674F, -5.3118F, -2.7189F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.006F))
				.texOffs(135, 70).addBox(-2.1747F, -10.8794F, -0.9778F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 2.158F, 0.1739F, -3.0392F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(154, 6).addBox(-2.799F, -0.2159F, 0.5843F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, -3.0134F, -0.1461F, -2.9541F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(119, 19).addBox(-2.674F, -5.3159F, -0.5157F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 2.2453F, 0.1739F, -3.0392F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(59, 151).addBox(-2.176F, -16.5106F, -2.7241F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(86, 134).addBox(-2.1747F, -10.4597F, -4.0119F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.8962F, 0.1739F, -3.0392F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(150, 150).addBox(-2.176F, -16.1224F, -4.9262F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.809F, 0.1739F, -3.0392F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(168, 72).addBox(-1.1739F, -22.4184F, -1.5283F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.9121F, 0.175F, -3.0353F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(115, 170).addBox(-1.1739F, -20.9778F, -5.5101F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.7725F, 0.175F, -3.0353F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(162, 34).addBox(-1.1739F, -22.3362F, -3.8728F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.851F, 0.175F, -3.0353F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(170, 63).addBox(-3.1816F, -20.7317F, -5.4454F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.7761F, 0.1041F, -3.039F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(23, 168).addBox(-3.1816F, -22.1657F, -1.4985F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.9157F, 0.1041F, -3.039F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(161, 159).addBox(-3.1816F, -22.0857F, -3.8277F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1639F, -8.8531F, 0.7827F, 1.8546F, 0.1041F, -3.039F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(168, 84).addBox(-3.5494F, -28.0399F, -1.6573F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4639F, -8.8531F, 0.7827F, 1.8988F, 0.1038F, -3.0738F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(150, 59).addBox(-1.1875F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(162, 113).addBox(-1.8975F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(9, 168).addBox(-1.2275F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2457F, -5.4583F, -0.1441F, 0.4056F, 0.1484F, 0.0856F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(45, 106).addBox(0.2112F, 0.9587F, -3.8499F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2607F, 2.9178F, -2.215F, 0.2768F, 0.1711F, -0.0238F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(145, 177).addBox(-0.3899F, -0.2567F, -0.3969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.2101F, 5.4758F, -6.5639F, -3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(178, 0).addBox(-0.3899F, -1.5379F, -0.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2101F, 5.4758F, -6.5639F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(140, 163).addBox(-1.8619F, -0.2055F, -0.1232F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1335F, 6.9266F, -12.8621F, 1.9073F, 0.0613F, 0.0863F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(170, 176).addBox(-1.2103F, 0.1353F, 0.0306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.6335F, 4.1266F, -15.7621F, 0.46F, 0.191F, -0.112F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(135, 176).addBox(-1.2103F, 1.7127F, -1.2757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.6335F, 4.1266F, -15.7621F, 1.1145F, 0.191F, -0.112F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 157).addBox(-1.1214F, -0.7144F, 0.7032F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6335F, 4.1266F, -15.7621F, -0.4528F, 0.1568F, -0.1114F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(139, 60).addBox(-0.5756F, -2.8147F, 0.3864F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2607F, 2.9178F, -2.215F, 0.3137F, 0.1752F, 0.0054F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(22, 128).addBox(-0.5756F, -1.7889F, -4.5673F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2607F, 2.9178F, -2.215F, 0.3486F, 0.1752F, 0.0054F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(72, 140).addBox(-0.3616F, -0.4222F, -2.2392F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2281F, -8.4221F, 5.4655F, -0.1355F, 0.3182F, 0.047F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4752F, 0.3114F, -4.0391F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -9.8497F, 6.4393F, -0.0149F, 0.7188F, -0.509F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(106, 19).addBox(-1.3358F, -1.0583F, -2.1391F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2281F, -8.4221F, 5.4655F, 0.0859F, 0.3022F, 0.0966F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-4.3F, 0.487F, -8.6F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(108, 138).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.743F, 2.1063F, -5.8813F, 2.2656F, -0.3175F, 0.1985F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(147, 170).mirror().addBox(-0.0208F, -8.6237F, -1.5103F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4382F, -1.2309F, -1.5206F, 2.1347F, -0.3175F, 0.1985F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(22, 160).mirror().addBox(-0.0208F, -3.7328F, -1.1891F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4382F, -1.2309F, -1.5206F, 2.2219F, -0.3175F, 0.1985F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(131, 167).mirror().addBox(-0.5328F, -0.3225F, 0.6908F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.8382F, 0.6691F, -1.5206F, 1.5073F, -0.3072F, 0.1208F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(32, 103).mirror().addBox(-1.0F, -1.1F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9027F, -5.3865F, -1.3523F, 0.8296F, -0.1352F, -0.1426F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(19, 98).mirror().addBox(-0.9F, -2.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.025F, -6.8489F, 2.2673F, 0.3902F, -0.1827F, -0.0719F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(174, 20).mirror().addBox(-0.5115F, -0.792F, -0.2162F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2277F, -19.7488F, -26.7425F, 2.1025F, -0.0798F, 3.0318F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(161, 168).mirror().addBox(2.5184F, -26.8691F, -4.3327F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.4639F, -8.8531F, 0.7827F, 1.8197F, -0.1063F, 3.0776F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.5069F, -1.8011F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 77).mirror().addBox(-0.5069F, -1.2011F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2277F, -19.7488F, -26.7425F, 2.3521F, -0.1063F, 3.1212F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(176, 132).mirror().addBox(-0.5069F, -1.8034F, -0.2718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-3.2277F, -19.7488F, -26.7425F, 2.2473F, -0.1063F, 3.1212F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(173, 100).mirror().addBox(-0.5069F, -0.7122F, -0.4551F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-3.2277F, -19.7488F, -26.7425F, 1.8459F, -0.1063F, 3.1212F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(76, 174).mirror().addBox(-0.5069F, -0.6623F, -0.2892F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2277F, -19.7488F, -26.7425F, 2.0903F, -0.1063F, 3.1212F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(82, 94).mirror().addBox(-2.0F, -2.3F, -2.7F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5585F, -7.8952F, 3.5822F, 1.8071F, 0.1231F, 3.1108F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(99, 104).mirror().addBox(-0.326F, -5.3118F, -2.7189F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(135, 70).mirror().addBox(0.1747F, -10.8794F, -0.9778F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 2.158F, -0.1739F, 3.0392F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(154, 6).mirror().addBox(-0.201F, -0.2159F, 0.5843F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, -3.0134F, 0.1461F, 2.9541F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(119, 19).mirror().addBox(-0.326F, -5.3159F, -0.5157F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 2.2453F, -0.1739F, 3.0392F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(59, 151).mirror().addBox(0.176F, -16.5106F, -2.7241F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 134).mirror().addBox(0.1747F, -10.4597F, -4.0119F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.8962F, -0.1739F, 3.0392F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(0.176F, -16.1224F, -4.9262F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.809F, -0.1739F, 3.0392F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(168, 72).mirror().addBox(0.1739F, -22.4184F, -1.5283F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.9121F, -0.175F, 3.0353F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(115, 170).mirror().addBox(0.1739F, -20.9778F, -5.5101F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.7725F, -0.175F, 3.0353F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(162, 34).mirror().addBox(0.1739F, -22.3362F, -3.8728F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.851F, -0.175F, 3.0353F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(170, 63).mirror().addBox(2.1816F, -20.7317F, -5.4454F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.7761F, -0.1041F, 3.039F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(23, 168).mirror().addBox(2.1816F, -22.1657F, -1.4985F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.9157F, -0.1041F, 3.039F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(161, 159).mirror().addBox(2.1816F, -22.0857F, -3.8277F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.1639F, -8.8531F, 0.7827F, 1.8546F, -0.1041F, 3.039F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(168, 84).mirror().addBox(2.5494F, -28.0399F, -1.6573F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4639F, -8.8531F, 0.7827F, 1.8988F, -0.1038F, 3.0738F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(150, 59).mirror().addBox(-0.8125F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(162, 113).mirror().addBox(-1.1025F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(9, 168).mirror().addBox(-0.7725F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2458F, -5.4583F, -0.1441F, 0.4056F, -0.1484F, -0.0856F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.2112F, 0.9587F, -3.8499F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2607F, 2.9178F, -2.215F, 0.2768F, -0.1711F, 0.0238F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(145, 177).mirror().addBox(-0.6101F, -0.2567F, -0.3969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.2101F, 5.4758F, -6.5639F, -3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(178, 0).mirror().addBox(-0.6101F, -1.5379F, -0.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2101F, 5.4758F, -6.5639F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(140, 163).mirror().addBox(-0.1381F, -0.2055F, -0.1232F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1335F, 6.9266F, -12.8621F, 1.9073F, -0.0613F, -0.0863F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(170, 176).mirror().addBox(0.2103F, 0.1353F, 0.0306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.6335F, 4.1266F, -15.7621F, 0.46F, -0.191F, 0.112F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(135, 176).mirror().addBox(0.2103F, 1.7127F, -1.2757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.6335F, 4.1266F, -15.7621F, 1.1145F, -0.191F, 0.112F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(0, 157).mirror().addBox(0.1214F, -0.7144F, 0.7032F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.6335F, 4.1266F, -15.7621F, -0.4528F, -0.1568F, 0.1114F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(139, 60).mirror().addBox(-0.4244F, -2.8147F, 0.3864F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.2607F, 2.9178F, -2.215F, 0.3137F, -0.1752F, -0.0054F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(22, 128).mirror().addBox(-0.4244F, -1.7889F, -4.5673F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2607F, 2.9178F, -2.215F, 0.3486F, -0.1752F, -0.0054F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(72, 140).mirror().addBox(-0.6384F, -0.4222F, -2.2392F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2281F, -8.4221F, 5.4655F, -0.1355F, -0.3182F, -0.047F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.4752F, 0.3114F, -4.0391F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -9.8497F, 6.4393F, -0.0149F, -0.7188F, 0.509F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(106, 19).mirror().addBox(-0.6642F, -1.0583F, -2.1391F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2281F, -8.4221F, 5.4655F, 0.0859F, -0.3022F, -0.0966F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 2.6071F, -1.8145F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0918F, 7.4569F, -8.1613F, -0.562F, -0.0881F, -0.138F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(10, 177).mirror().addBox(-0.0038F, 0.7F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6701F, 5.0732F, -5.3894F, -0.8238F, -0.0881F, -0.138F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(56, 123).mirror().addBox(0.0F, -1.3F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6701F, 5.0732F, -5.3894F, -0.5183F, -0.0881F, -0.138F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(164, 94).mirror().addBox(-0.0159F, 1.7596F, -1.9995F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0451F, 9.9864F, -7.5198F, -0.4351F, -0.0782F, -0.2279F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(174, 143).mirror().addBox(-0.0473F, 0.2011F, 1.0361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0451F, 9.9864F, -7.5198F, -0.5126F, -0.0386F, -0.2463F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(-0.575F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8811F, 9.0932F, -6.1662F, -0.645F, -0.0735F, -0.1328F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(155, 174).mirror().addBox(-1.175F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3325F, 7.8756F, -7.0466F, -0.5562F, -0.0386F, -0.159F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(101, 155).mirror().addBox(-1.4F, -3.3F, -2.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3357F, 8.036F, -3.9712F, -0.565F, -0.0386F, -0.159F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(161, 58).mirror().addBox(0.0151F, -0.6107F, -1.2632F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0451F, 9.9864F, -7.5198F, -0.7673F, -0.07F, -0.216F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(38, 176).mirror().addBox(-0.5F, -0.9314F, 0.2554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0294F, 2.3399F, -2.058F, -1.4251F, -0.0836F, -0.1783F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(160, 175).mirror().addBox(0.0651F, -1.2389F, -0.6019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4565F, 1.7838F, -0.2886F, -0.4714F, 0.0471F, -0.0473F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-1.9349F, -2.024F, -0.2792F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4565F, 1.7838F, -0.2886F, -0.1223F, 0.0471F, -0.0473F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(55, 174).mirror().addBox(0.0651F, -0.0269F, -0.3227F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4565F, 1.7838F, -0.2886F, -1.4313F, 0.0471F, -0.0473F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(174, 29).mirror().addBox(0.057F, -1.6899F, -0.0036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(174, 42).mirror().addBox(-1.0561F, -1.9215F, -0.0036F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.4565F, 1.7838F, -0.2886F, -0.6197F, 0.0471F, -0.0473F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(71, 171).mirror().addBox(-0.7257F, -1.4632F, -0.0036F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.4565F, 1.7838F, -0.2886F, -0.6168F, -0.0797F, -0.2249F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(64, 162).mirror().addBox(-0.5F, -1.5F, -2.7F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.635F, 5.0914F, -1.7775F, -0.7263F, -0.0943F, -0.1729F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(169, 34).mirror().addBox(-0.0088F, 0.3918F, -1.0821F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.4565F, 1.7838F, -0.2886F, -0.5136F, 0.0365F, -0.0418F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(123, 131).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4312F, 6.2573F, -5.5837F, -0.7271F, -0.0502F, -0.209F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(166, 168).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.7699F, 2.0834F, -6.4684F, 0.2535F, -0.0855F, -0.1974F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(88, 164).mirror().addBox(-0.7338F, -3.2252F, -2.2587F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6164F, 3.4209F, -2.4255F, 0.7335F, -0.0855F, -0.1974F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(100, 43).mirror().addBox(-0.7338F, -3.334F, -0.4883F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6164F, 3.4209F, -2.4255F, 1.2745F, -0.0855F, -0.1974F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(61, 65).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8919F, 7.4569F, -8.1613F, -0.562F, 0.0881F, 0.138F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(10, 177).addBox(0.0038F, 0.7F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4702F, 5.0732F, -5.3894F, -0.8238F, 0.0881F, 0.138F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(56, 123).addBox(0.0F, -1.3F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4702F, 5.0732F, -5.3894F, -0.5183F, 0.0881F, 0.138F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(164, 94).addBox(-0.9841F, 1.7596F, -1.9995F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8452F, 9.9864F, -7.5198F, -0.4351F, 0.0782F, 0.2279F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(174, 143).addBox(-0.9527F, 0.2011F, 1.0361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8452F, 9.9864F, -7.5198F, -0.5126F, 0.0386F, 0.2463F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(60, 106).addBox(-0.425F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6812F, 9.0932F, -6.1662F, -0.645F, 0.0735F, 0.1328F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(155, 174).addBox(0.175F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1326F, 7.8756F, -7.0466F, -0.5562F, 0.0386F, 0.159F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(101, 155).addBox(0.4F, -3.3F, -2.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1358F, 8.036F, -3.9712F, -0.565F, 0.0386F, 0.159F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(161, 58).addBox(-1.0151F, -0.6107F, -1.2632F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8452F, 9.9864F, -7.5198F, -0.7673F, 0.07F, 0.216F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(38, 176).addBox(-0.5F, -0.9314F, 0.2554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8295F, 2.3399F, -2.058F, -1.4251F, 0.0836F, 0.1783F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(160, 175).addBox(-1.0651F, -1.2389F, -0.6019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2566F, 1.7838F, -0.2886F, -0.4714F, -0.0471F, 0.0473F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(58, 12).addBox(-1.0651F, -2.024F, -0.2792F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2566F, 1.7838F, -0.2886F, -0.1223F, -0.0471F, 0.0473F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(55, 174).addBox(-1.0651F, -0.0269F, -0.3227F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2566F, 1.7838F, -0.2886F, -1.4313F, -0.0471F, 0.0473F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(174, 29).addBox(-1.057F, -1.6899F, -0.0036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(174, 42).addBox(-0.9439F, -1.9215F, -0.0036F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2566F, 1.7838F, -0.2886F, -0.6197F, -0.0471F, 0.0473F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(71, 171).addBox(-0.2742F, -1.4632F, -0.0036F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2566F, 1.7838F, -0.2886F, -0.6168F, 0.0797F, 0.2249F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(64, 162).addBox(-0.5F, -1.5F, -2.7F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4351F, 5.0914F, -1.7775F, -0.7263F, 0.0943F, 0.1729F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(169, 34).addBox(-0.9912F, 0.3918F, -1.0821F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2566F, 1.7838F, -0.2886F, -0.5136F, -0.0365F, 0.0418F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(123, 131).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2313F, 6.2573F, -5.5837F, -0.7271F, 0.0502F, 0.209F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(166, 168).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.57F, 2.0834F, -6.4684F, 0.2535F, 0.0855F, 0.1974F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(88, 164).addBox(-0.2662F, -3.2252F, -2.2587F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4165F, 3.4209F, -2.4255F, 0.7335F, 0.0855F, 0.1974F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(100, 43).addBox(-0.2662F, -3.334F, -0.4883F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4165F, 3.4209F, -2.4255F, 1.2745F, 0.0855F, 0.1974F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4028F, 14.5349F, -11.1504F, 0.4796F, -0.0201F, 0.0387F));

		PartDefinition cube_r525 = leftLowerbeak.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(171, 53).addBox(-1.0F, -2.0953F, -0.8971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.1432F, 0.0873F, 0.0F));

		PartDefinition cube_r526 = leftLowerbeak.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(110, 175).addBox(-1.0F, -0.3797F, 0.208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -0.7786F, 0.9318F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r527 = leftLowerbeak.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(175, 63).addBox(-13.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.1491F, -0.7786F, -0.1141F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r528 = leftLowerbeak.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(0, 177).addBox(-1.3312F, -1.6997F, -0.2257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1947F, -1.3786F, -2.9682F, -2.234F, 0.0873F, 0.0F));

		PartDefinition cube_r529 = leftLowerbeak.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(159, 94).addBox(-1.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -0.6786F, 0.8318F, -1.9548F, 0.0873F, 0.0F));

		PartDefinition cube_r530 = leftLowerbeak.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(5, 177).addBox(-1.2615F, -1.9541F, -0.898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -0.0786F, -2.0682F, -2.1293F, 0.0873F, 0.0F));

		PartDefinition cube_r531 = leftLowerbeak.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(100, 169).addBox(-0.5F, -1.4F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3499F, 0.4919F, 0.2599F, -1.7735F, 0.0343F, -0.0455F));

		PartDefinition cube_r532 = leftLowerbeak.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(123, 176).addBox(-1.115F, -1.9301F, -1.1274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3892F, 1.3654F, 3.4174F, -0.9777F, 0.1796F, 0.0517F));

		PartDefinition cube_r533 = leftLowerbeak.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(64, 169).addBox(-1.09F, -3.3301F, -0.1274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4681F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7971F, 14.5349F, -11.1504F, 0.4796F, 0.0201F, -0.0387F));

		PartDefinition cube_r534 = rightLowerbeak.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(171, 53).mirror().addBox(0.0F, -2.0953F, -0.8971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.1432F, -0.0873F, 0.0F));

		PartDefinition cube_r535 = rightLowerbeak.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(110, 175).mirror().addBox(0.0F, -0.3797F, 0.208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.7786F, 0.9318F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r536 = rightLowerbeak.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(175, 63).mirror().addBox(12.0F, 0.8203F, -0.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1491F, -0.7786F, -0.1141F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r537 = rightLowerbeak.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(0, 177).mirror().addBox(0.3312F, -1.6997F, -0.2257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.3786F, -2.9682F, -2.234F, -0.0873F, 0.0F));

		PartDefinition cube_r538 = rightLowerbeak.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(159, 94).mirror().addBox(0.0F, 2.0724F, 0.5434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.6786F, 0.8318F, -1.9548F, -0.0873F, 0.0F));

		PartDefinition cube_r539 = rightLowerbeak.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(5, 177).mirror().addBox(0.2615F, -1.9541F, -0.898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.0786F, -2.0682F, -2.1293F, -0.0873F, 0.0F));

		PartDefinition cube_r540 = rightLowerbeak.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(100, 169).mirror().addBox(-0.5F, -1.4F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3499F, 0.4919F, 0.2599F, -1.7735F, -0.0343F, 0.0455F));

		PartDefinition cube_r541 = rightLowerbeak.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(123, 176).mirror().addBox(0.115F, -1.9301F, -1.1274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3892F, 1.3654F, 3.4174F, -0.9777F, -0.1796F, -0.0517F));

		PartDefinition cube_r542 = rightLowerbeak.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(64, 169).mirror().addBox(0.09F, -3.3301F, -0.1274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.4681F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offset(0.0F, -9.09F, -0.6378F));

		PartDefinition cube_r543 = frill.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(144, 87).addBox(-2.8803F, -0.5395F, -0.4605F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1197F, -9.3952F, 8.8557F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r544 = frill.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(108, 52).addBox(-2.0F, -1.0F, -0.225F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5175F, 7.4378F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r545 = frill.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(50, 65).addBox(-2.0F, -1.2F, -0.55F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1163F, 6.7088F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r546 = frill.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(154, 29).addBox(-2.0F, -2.9053F, -1.2353F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5114F, 5.0414F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r547 = frill.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(101, 129).addBox(-2.5F, -7.3959F, -0.0641F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0365F, -1.3087F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r548 = frill.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(123, 173).addBox(-1.3728F, -0.8113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1968F, -9.9436F, 9.2171F, -0.3067F, -0.211F, -0.6015F));

		PartDefinition cube_r549 = frill.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(174, 5).addBox(-0.6154F, -0.7966F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1968F, -9.9436F, 9.2171F, -0.2803F, 0.2454F, 0.6836F));

		PartDefinition cube_r550 = frill.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(176, 48).addBox(-1.0F, -4.062F, -0.1904F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0365F, -1.3087F, -1.1606F, 0.0F, 0.0F));

		PartDefinition frillInside = frill.addOrReplaceChild("frillInside", CubeListBuilder.create(), PartPose.offset(7.0985F, -1.9616F, 5.6114F));

		PartDefinition cube_r551 = frillInside.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(85, 49).addBox(-8.5F, -3.1F, -0.6F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8616F, 4.5592F, -2.2934F, -0.0327F, -0.8093F, -0.2796F));

		PartDefinition cube_r552 = frillInside.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(129, 125).addBox(-1.8064F, -1.2974F, -0.6003F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8791F, 1.0477F, -2.5389F, -0.5401F, -0.787F, -0.5033F));

		PartDefinition cube_r553 = frillInside.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(129, 116).addBox(-4.2038F, -3.1497F, -0.6216F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8791F, 1.0477F, -2.5389F, -0.9289F, -0.2146F, 0.2775F));

		PartDefinition cube_r554 = frillInside.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(149, 134).addBox(-2.9F, -3.0F, -0.75F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6125F, -2.2507F, 0.7116F, -0.8252F, -0.2421F, 0.254F));

		PartDefinition cube_r555 = frillInside.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(173, 119).addBox(0.8909F, -1.025F, 1.0526F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-5.701F, -7.1456F, 1.5712F, -0.3061F, -0.25F, -0.4785F));

		PartDefinition cube_r556 = frillInside.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(174, 8).addBox(-0.3341F, -3.0529F, 1.0526F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.701F, -7.1456F, 1.5712F, -0.3186F, 0.2337F, 0.7976F));

		PartDefinition cube_r557 = frillInside.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(173, 116).addBox(3.7863F, 0.5009F, 0.7454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-5.701F, -7.1456F, 1.5712F, -0.4035F, -0.2786F, -0.2786F));

		PartDefinition cube_r558 = frillInside.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(174, 11).addBox(1.7823F, -5.5494F, 0.7454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.701F, -7.1456F, 1.5712F, -0.3771F, 0.3141F, 0.9563F));

		PartDefinition cube_r559 = frillInside.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(173, 113).addBox(-1.6061F, -3.5084F, -0.1659F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.5391F, -2.8349F, 1.8941F, -0.5015F, -0.1069F, 0.132F));

		PartDefinition cube_r560 = frillInside.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(0, 174).addBox(0.4093F, -5.302F, 1.631F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7887F, -6.6892F, 1.1112F, -0.2737F, 0.4189F, 1.3819F));

		PartDefinition cube_r561 = frillInside.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(132, 60).addBox(6.2793F, 0.1965F, 0.6626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.7887F, -6.6892F, 1.1112F, -0.7199F, -0.1993F, 0.4088F));

		PartDefinition cube_r562 = frillInside.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(173, 173).addBox(2.0248F, -8.0492F, 0.6626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7887F, -6.6892F, 1.1112F, -0.4245F, 0.6287F, 1.5463F));

		PartDefinition cube_r563 = frillInside.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(65, 80).addBox(-1.3728F, -0.8113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(5.8233F, 1.1746F, 1.0984F, -0.5716F, 0.011F, 0.6322F));

		PartDefinition cube_r564 = frillInside.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(173, 170).addBox(-0.6154F, -0.7966F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.8233F, 1.1746F, 1.0984F, -0.1258F, 0.5592F, 1.952F));

		PartDefinition cube_r565 = frillInside.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(85, 66).addBox(-2.4767F, -2.464F, 0.0965F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(5.5182F, 5.9492F, -1.9243F, -0.6702F, 0.0327F, 1.0469F));

		PartDefinition cube_r566 = frillInside.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(173, 167).addBox(-2.4679F, -0.0766F, 0.0965F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.5182F, 5.9492F, -1.9243F, -0.1301F, 0.66F, 2.3663F));

		PartDefinition cube_r567 = frillInside.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(173, 149).addBox(-1.7159F, -0.8368F, -0.3398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(5.5887F, 7.3549F, -1.7687F, -0.6722F, 0.1298F, 1.127F));

		PartDefinition cube_r568 = frillInside.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(166, 173).addBox(-0.7146F, -0.4672F, -0.3398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.5887F, 7.3549F, -1.7687F, -0.0094F, 0.6826F, 2.5217F));

		PartDefinition cube_r569 = frillInside.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(138, 173).addBox(-1.4241F, -2.8239F, -0.9483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.7807F, 9.0778F, -4.1648F, -0.6806F, 0.4637F, 1.4876F));

		PartDefinition cube_r570 = frillInside.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(174, 17).addBox(-2.5914F, -1.1822F, -0.9483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7807F, 9.0778F, -4.1648F, 0.4253F, 0.7027F, -3.1182F));

		PartDefinition cube_r571 = frillInside.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(174, 14).addBox(-0.7552F, -2.4591F, -1.0414F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7807F, 9.0778F, -4.1648F, 0.44F, 0.6809F, -2.9536F));

		PartDefinition cube_r572 = frillInside.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(173, 152).addBox(0.2201F, -1.3076F, -1.0414F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.7807F, 9.0778F, -4.1648F, -0.6576F, 0.4773F, 1.6532F));

		PartDefinition frillInside2 = frill.addOrReplaceChild("frillInside2", CubeListBuilder.create(), PartPose.offset(-7.0985F, -1.9616F, 5.6114F));

		PartDefinition cube_r573 = frillInside2.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(-1.5F, -3.1F, -0.6F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8616F, 4.5592F, -2.2934F, -0.0327F, 0.8093F, 0.2796F));

		PartDefinition cube_r574 = frillInside2.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(129, 125).mirror().addBox(-5.1936F, -1.2974F, -0.6003F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8791F, 1.0477F, -2.5389F, -0.5401F, 0.787F, 0.5033F));

		PartDefinition cube_r575 = frillInside2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(129, 116).mirror().addBox(-0.7962F, -3.1497F, -0.6216F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8791F, 1.0477F, -2.5389F, -0.9289F, 0.2146F, -0.2775F));

		PartDefinition cube_r576 = frillInside2.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(149, 134).mirror().addBox(-1.1F, -3.0F, -0.75F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6124F, -2.2507F, 0.7116F, -0.8252F, 0.2421F, -0.254F));

		PartDefinition cube_r577 = frillInside2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(173, 119).mirror().addBox(-2.8909F, -1.025F, 1.0526F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(5.701F, -7.1456F, 1.5712F, -0.3061F, 0.25F, 0.4785F));

		PartDefinition cube_r578 = frillInside2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(174, 8).mirror().addBox(-1.666F, -3.0529F, 1.0526F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(5.701F, -7.1456F, 1.5712F, -0.3186F, -0.2337F, -0.7976F));

		PartDefinition cube_r579 = frillInside2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(173, 116).mirror().addBox(-5.7863F, 0.5009F, 0.7454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(5.701F, -7.1456F, 1.5712F, -0.4035F, 0.2786F, 0.2786F));

		PartDefinition cube_r580 = frillInside2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(174, 11).mirror().addBox(-3.7823F, -5.5494F, 0.7454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(5.701F, -7.1456F, 1.5712F, -0.3771F, -0.3141F, -0.9563F));

		PartDefinition cube_r581 = frillInside2.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(173, 113).mirror().addBox(-0.3939F, -3.5084F, -0.1659F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.5391F, -2.8349F, 1.8941F, -0.5015F, 0.1069F, -0.132F));

		PartDefinition cube_r582 = frillInside2.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(0, 174).mirror().addBox(-2.4093F, -5.302F, 1.631F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7887F, -6.6892F, 1.1112F, -0.2737F, -0.4189F, -1.3819F));

		PartDefinition cube_r583 = frillInside2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(132, 60).mirror().addBox(-8.2793F, 0.1965F, 0.6626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.7887F, -6.6892F, 1.1112F, -0.7199F, 0.1993F, -0.4088F));

		PartDefinition cube_r584 = frillInside2.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(173, 173).mirror().addBox(-4.0248F, -8.0492F, 0.6626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7887F, -6.6892F, 1.1112F, -0.4245F, -0.6287F, -1.5463F));

		PartDefinition cube_r585 = frillInside2.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(-0.6272F, -0.8113F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-5.8233F, 1.1746F, 1.0984F, -0.5716F, -0.011F, -0.6322F));

		PartDefinition cube_r586 = frillInside2.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(173, 170).mirror().addBox(-1.3846F, -0.7966F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.8233F, 1.1746F, 1.0984F, -0.1258F, -0.5592F, -1.952F));

		PartDefinition cube_r587 = frillInside2.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(85, 66).mirror().addBox(0.4767F, -2.464F, 0.0965F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-5.5182F, 5.9492F, -1.9243F, -0.6702F, -0.0327F, -1.0469F));

		PartDefinition cube_r588 = frillInside2.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(173, 167).mirror().addBox(0.4679F, -0.0766F, 0.0965F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.5182F, 5.9492F, -1.9243F, -0.1301F, -0.66F, -2.3663F));

		PartDefinition cube_r589 = frillInside2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(173, 149).mirror().addBox(-0.2841F, -0.8368F, -0.3398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-5.5887F, 7.3549F, -1.7687F, -0.6722F, -0.1298F, -1.127F));

		PartDefinition cube_r590 = frillInside2.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(166, 173).mirror().addBox(-1.2854F, -0.4672F, -0.3398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.5887F, 7.3549F, -1.7687F, -0.0094F, -0.6826F, -2.5217F));

		PartDefinition cube_r591 = frillInside2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(138, 173).mirror().addBox(-0.5759F, -2.8239F, -0.9483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.7807F, 9.0778F, -4.1648F, -0.6806F, -0.4637F, -1.4876F));

		PartDefinition cube_r592 = frillInside2.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(174, 17).mirror().addBox(0.5914F, -1.1822F, -0.9483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7807F, 9.0778F, -4.1648F, 0.4253F, -0.7027F, 3.1182F));

		PartDefinition cube_r593 = frillInside2.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(174, 14).mirror().addBox(-1.2448F, -2.4591F, -1.0414F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7807F, 9.0778F, -4.1648F, 0.44F, -0.6809F, 2.9536F));

		PartDefinition cube_r594 = frillInside2.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(173, 152).mirror().addBox(-2.2201F, -1.3076F, -1.0414F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.7807F, 9.0778F, -4.1648F, -0.6576F, -0.4773F, -1.6532F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4918F, 0.2295F, 8.3538F, -0.2641F, -0.2268F, 0.1616F));

		PartDefinition cube_r595 = leftFrill.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(144, 108).addBox(-0.0176F, -4.0514F, 0.0394F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1249F, 3.7581F, -4.6668F, 0.3729F, -0.2068F, -1.5716F));

		PartDefinition cube_r596 = leftFrill.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(92, 77).addBox(-1.2466F, -3.9431F, -0.3651F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.753F, 5.5129F, -4.6807F, 0.3687F, -0.2263F, -1.5191F));

		PartDefinition cube_r597 = leftFrill.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(147, 165).addBox(-0.2878F, -1.1219F, -0.9573F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7838F, 8.0535F, -5.8312F, 0.2194F, -0.3826F, -1.0631F));

		PartDefinition cube_r598 = leftFrill.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(165, 29).addBox(-2.3182F, -1.1638F, -0.9573F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7838F, 8.0535F, -5.8312F, 0.0482F, -0.4358F, -0.6385F));

		PartDefinition cube_r599 = leftFrill.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(116, 94).addBox(-2.9699F, -6.1024F, -0.9573F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7838F, 8.0535F, -5.8312F, 0.3247F, -0.2998F, -1.3754F));

		PartDefinition cube_r600 = leftFrill.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(134, 29).addBox(0.0F, 0.1F, -0.5F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6417F, -4.9359F, -2.2941F, -0.1681F, 0.2697F, 1.205F));

		PartDefinition cube_r601 = leftFrill.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(50, 132).addBox(2.6738F, -1.9005F, -0.0893F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.182F, -8.8803F, -1.6312F, -0.2047F, 0.2241F, 0.8765F));

		PartDefinition cube_r602 = leftFrill.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(27, 55).addBox(0.1682F, -0.184F, -0.0754F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.182F, -8.8803F, -1.6312F, -0.2304F, 0.0991F, 0.3401F));

		PartDefinition cube_r603 = leftFrill.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(70, 98).addBox(0.1497F, -0.1672F, 0.0155F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0944F, -9.3367F, -1.1712F, -0.2431F, 0.1388F, 0.1005F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4918F, 0.2295F, 8.3538F, -0.2641F, 0.2268F, -0.1616F));

		PartDefinition cube_r604 = rightFrill.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(144, 108).mirror().addBox(-4.9824F, -4.0514F, 0.0394F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1249F, 3.7581F, -4.6668F, 0.3729F, 0.2068F, 1.5716F));

		PartDefinition cube_r605 = rightFrill.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(92, 77).mirror().addBox(-1.7534F, -3.9431F, -0.3651F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.753F, 5.5129F, -4.6807F, 0.3687F, 0.2263F, 1.5191F));

		PartDefinition cube_r606 = rightFrill.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(147, 165).mirror().addBox(-2.7122F, -1.1219F, -0.9573F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7838F, 8.0535F, -5.8312F, 0.2194F, 0.3826F, 1.0631F));

		PartDefinition cube_r607 = rightFrill.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(165, 29).mirror().addBox(-0.6818F, -1.1638F, -0.9573F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7838F, 8.0535F, -5.8312F, 0.0482F, 0.4358F, 0.6385F));

		PartDefinition cube_r608 = rightFrill.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(116, 94).mirror().addBox(-3.0301F, -6.1024F, -0.9573F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7838F, 8.0535F, -5.8312F, 0.3247F, 0.2998F, 1.3754F));

		PartDefinition cube_r609 = rightFrill.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(134, 29).mirror().addBox(-4.0F, 0.1F, -0.5F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6417F, -4.9359F, -2.2941F, -0.1681F, -0.2697F, -1.205F));

		PartDefinition cube_r610 = rightFrill.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(50, 132).mirror().addBox(-6.6738F, -1.9005F, -0.0893F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.182F, -8.8803F, -1.6312F, -0.2047F, -0.2241F, -0.8765F));

		PartDefinition cube_r611 = rightFrill.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(27, 55).mirror().addBox(-3.1682F, -0.184F, -0.0754F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.182F, -8.8803F, -1.6312F, -0.2304F, -0.0991F, -0.3401F));

		PartDefinition cube_r612 = rightFrill.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(70, 98).mirror().addBox(-4.1497F, -0.1672F, 0.0155F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0944F, -9.3367F, -1.1712F, -0.2431F, -0.1388F, -0.1005F));

		return LayerDefinition.create(meshdefinition, 184, 184);
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