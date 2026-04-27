package fossils.fossils.client.blockentity.model.piatnitzkysaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PiatnitzkysaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart tail1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public PiatnitzkysaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail = this.tail1.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail10 = this.tail7.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.1612F, -0.3825F, 0.1744F, 0.0015F, 0.043F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 105).addBox(0.0F, 1.6F, -0.825F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6645F, 8.5319F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 37).addBox(-0.006F, -0.2F, -9.7F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.18F, 7.705F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-2.0F, 0.0F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4633F, 5.7464F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(91, 65).mirror().addBox(-2.5F, -1.0322F, 11.3974F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 65).addBox(0.5F, -1.0322F, 11.3974F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 39).addBox(0.0F, 0.0F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4633F, 5.7464F, -0.0792F, 0.1305F, -0.0103F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9988F, 3.631F, 0.392F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(81, 75).addBox(-0.5827F, 3.7931F, -6.4175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5815F, -8.6405F, 5.3682F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 95).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(102, 15).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6085F, -8.869F, 0.7867F, -0.0736F, -0.0321F, -0.4016F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 68).addBox(-0.5F, -0.875F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6111F, -6.5703F, 1.7478F, 0.6439F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 47).addBox(-0.5F, -3.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F))
				.texOffs(27, 97).addBox(-0.5F, -2.4F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2469F, -5.4363F, 5.3715F, 0.0942F, -0.0327F, -0.4104F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(127, 81).addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(18, 125).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6106F, -8.5464F, 4.7703F, -0.1894F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(110, 124).addBox(-1.2397F, 3.69F, -0.5607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2338F, -0.2616F, 6.5291F, 0.8661F, 0.0657F, -0.1063F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(105, 124).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0427F, 3.0316F, 9.5981F, -0.0502F, 0.0657F, -0.1063F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(127, 84).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1615F, 3.6771F, 10.3524F, 1.7824F, 0.0657F, -0.1063F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(100, 124).addBox(-1.2397F, 4.4365F, 0.1837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2338F, -0.2616F, 6.5291F, 0.7352F, 0.0657F, -0.1063F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 124).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.133F, 2.999F, 11.0902F, 1.5032F, 0.0657F, -0.1063F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(13, 118).addBox(-0.5F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0035F, 2.2196F, 10.3016F, 1.5208F, 0.0561F, -0.0988F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(75, 116).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0712F, 1.6277F, 8.1733F, 0.8851F, 0.0257F, -0.1124F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 110).addBox(-1.0923F, 0.1179F, -1.0364F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2338F, -0.4616F, 6.0291F, 1.0422F, 0.0241F, -0.1112F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 107).addBox(-0.5F, -0.9964F, -0.3994F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0479F, -0.6249F, 3.1878F, 2.451F, -0.0703F, 0.1391F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 116).addBox(-0.5F, -0.8736F, -1.0872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0479F, -0.6249F, 3.1878F, 2.2329F, -0.0703F, 0.1391F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 110).addBox(-0.9953F, -3.5657F, -0.8983F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2338F, -0.2616F, 6.0291F, 0.945F, -0.1097F, 0.1358F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(107, 109).addBox(-0.2969F, -5.8786F, -2.1746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2338F, -0.4116F, 5.3291F, 0.5931F, 0.0601F, 0.0329F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(92, 81).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3998F, -3.5547F, 2.9858F, 0.3313F, 0.0601F, 0.0329F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 100).addBox(-0.5F, -1.6F, -1.15F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0885F, -1.2154F, 0.1348F, -1.4927F, 0.0639F, 0.0248F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(95, 117).addBox(-0.5F, -0.825F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4834F, 8.58F, -3.0595F, -2.0092F, 0.0891F, -0.1553F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 117).addBox(-0.3869F, 0.2805F, 0.9886F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 6.6663F, -4.6279F, -0.8311F, 0.0891F, -0.1553F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5F, -1.175F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4662F, 8.8771F, -3.764F, -1.4419F, 0.0891F, -0.1553F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(95, 123).addBox(-0.3869F, 0.0481F, 0.1361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.073F, 6.6663F, -4.6279F, -0.3598F, 0.0891F, -0.1553F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(117, 88).addBox(-0.3869F, -0.0935F, 0.1604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.073F, 6.6663F, -4.6279F, 0.0852F, 0.0891F, -0.1553F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3145F, 4.7022F, -4.3071F, -0.1065F, 0.0837F, -0.1583F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(60, 116).addBox(-0.5F, -1.65F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0989F, 0.5771F, -2.8218F, -0.5241F, 0.0643F, 0.0237F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(115, 83).addBox(-0.5F, -1.675F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1408F, 0.6711F, -3.4383F, -0.1314F, 0.0643F, 0.0237F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(115, 99).addBox(-0.4901F, 2.0448F, -1.3866F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.073F, -0.1337F, -2.5279F, -0.0878F, 0.0643F, 0.0237F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 79).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0494F, -2.8919F, -3.6974F, -0.0005F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(101, 84).addBox(-0.5F, -1.55F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0921F, -3.9748F, -2.7956F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(78, 45).addBox(-0.3844F, -0.3139F, -1.6767F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1504F, -4.4868F, -0.272F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(85, 117).addBox(-0.9929F, -2.1917F, -2.565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-0.369F, -8.8088F, -3.7788F, 1.7877F, -0.3802F, -0.4091F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(53, 103).addBox(-1.0F, -0.6F, 0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0787F, -5.1086F, -3.4003F, 1.3794F, -0.3278F, -0.3906F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(101, 78).addBox(-0.9929F, -3.062F, -3.4175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.369F, -8.8088F, -3.7788F, 2.2153F, -0.3802F, -0.4091F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 127).addBox(-0.9859F, 1.187F, -1.5517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.369F, -8.8088F, -3.7788F, -0.1235F, -0.3802F, -0.4091F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(21, 117).addBox(-0.9859F, -0.2579F, -1.9365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.369F, -8.8088F, -3.7788F, 0.6619F, -0.3802F, -0.4091F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(115, 94).addBox(-0.9819F, -0.039F, -0.9676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.369F, -8.8088F, -3.7788F, 0.4263F, -0.3802F, -0.4091F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 101).addBox(0.2F, 0.15F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.186F, -8.8019F, -2.3068F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(53, 96).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6099F, -8.9443F, -0.2145F, 0.0747F, -0.0321F, -0.4016F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9988F, 3.631F, 0.392F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-0.4173F, 3.7931F, -6.4175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -8.6405F, 5.3682F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(68, 95).mirror().addBox(-0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 15).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6085F, -8.869F, 0.7867F, -0.0736F, 0.0321F, 0.4016F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-0.5F, -0.875F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6111F, -6.5703F, 1.7478F, 0.6439F, 0.0327F, 0.4104F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(100, 47).mirror().addBox(-0.5F, -3.0F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(27, 97).mirror().addBox(-0.5F, -2.4F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -5.4363F, 5.3715F, 0.0942F, 0.0327F, 0.4104F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(127, 81).mirror().addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(18, 125).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6106F, -8.5464F, 4.7703F, -0.1894F, 0.0391F, 0.4053F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(110, 124).mirror().addBox(0.2397F, 3.69F, -0.5607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2338F, -0.2616F, 6.5291F, 0.8661F, -0.0657F, 0.1063F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(105, 124).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0427F, 3.0316F, 9.5981F, -0.0502F, -0.0657F, 0.1063F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(127, 84).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1615F, 3.6771F, 10.3524F, 1.7824F, -0.0657F, 0.1063F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(100, 124).mirror().addBox(0.2397F, 4.4365F, 0.1837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2338F, -0.2616F, 6.5291F, 0.7352F, -0.0657F, 0.1063F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(52, 124).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.133F, 2.999F, 11.0902F, 1.5032F, -0.0657F, 0.1063F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(13, 118).mirror().addBox(-0.5F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0035F, 2.2196F, 10.3016F, 1.5208F, -0.0561F, 0.0988F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(75, 116).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0712F, 1.6277F, 8.1733F, 0.8851F, -0.0257F, 0.1124F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 110).mirror().addBox(0.0923F, 0.1179F, -1.0364F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2338F, -0.4616F, 6.0291F, 1.0422F, -0.0241F, 0.1112F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 107).mirror().addBox(-0.5F, -0.9964F, -0.3994F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0479F, -0.6249F, 3.1878F, 2.451F, 0.0703F, -0.1391F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(80, 116).mirror().addBox(-0.5F, -0.8736F, -1.0872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0479F, -0.6249F, 3.1878F, 2.2329F, 0.0703F, -0.1391F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(38, 110).mirror().addBox(-0.0047F, -3.5657F, -0.8983F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2338F, -0.2616F, 6.0291F, 0.945F, 0.1097F, -0.1358F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(107, 109).mirror().addBox(-0.7031F, -5.8786F, -2.1746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2338F, -0.4116F, 5.3291F, 0.5931F, -0.0601F, -0.0329F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(92, 81).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3998F, -3.5547F, 2.9858F, 0.3313F, -0.0601F, -0.0329F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.5F, -1.6F, -1.15F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0885F, -1.2154F, 0.1348F, -1.4927F, -0.0639F, -0.0248F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(95, 117).mirror().addBox(-0.5F, -0.825F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4834F, 8.58F, -3.0595F, -2.0092F, -0.0891F, 0.1553F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(90, 117).mirror().addBox(-0.6131F, 0.2805F, 0.9886F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.6663F, -4.6279F, -0.8311F, -0.0891F, 0.1553F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(5, 116).mirror().addBox(-0.5F, -1.175F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4662F, 8.8771F, -3.764F, -1.4419F, -0.0891F, 0.1553F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(95, 123).mirror().addBox(-0.6131F, 0.0481F, 0.1361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.6663F, -4.6279F, -0.3598F, -0.0891F, 0.1553F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(117, 88).mirror().addBox(-0.6131F, -0.0935F, 0.1604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.073F, 6.6663F, -4.6279F, 0.0852F, -0.0891F, 0.1553F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3145F, 4.7022F, -4.3071F, -0.1065F, -0.0837F, 0.1583F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 116).mirror().addBox(-0.5F, -1.65F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0989F, 0.5771F, -2.8218F, -0.5241F, -0.0643F, -0.0237F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(115, 83).mirror().addBox(-0.5F, -1.675F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1408F, 0.6711F, -3.4383F, -0.1314F, -0.0643F, -0.0237F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(115, 99).mirror().addBox(-0.5099F, 2.0448F, -1.3866F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, -0.1337F, -2.5279F, -0.0878F, -0.0643F, -0.0237F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 79).mirror().addBox(-0.5F, 0.0F, -0.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0494F, -2.8919F, -3.6974F, -0.0005F, -0.0639F, -0.0248F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 84).mirror().addBox(-0.5F, -1.55F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0921F, -3.9748F, -2.7956F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-0.6156F, -0.3139F, -1.6767F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1504F, -4.4868F, -0.272F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(85, 117).mirror().addBox(-0.0071F, -2.1917F, -2.565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(0.369F, -8.8088F, -3.7788F, 1.7877F, 0.3802F, 0.4091F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(53, 103).mirror().addBox(0.0F, -0.6F, 0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0787F, -5.1086F, -3.4003F, 1.3794F, 0.3278F, 0.3906F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(101, 78).mirror().addBox(-0.0071F, -3.062F, -3.4175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.369F, -8.8088F, -3.7788F, 2.2153F, 0.3802F, 0.4091F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(83, 127).mirror().addBox(-0.0141F, 1.187F, -1.5517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.369F, -8.8088F, -3.7788F, -0.1235F, 0.3802F, 0.4091F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(21, 117).mirror().addBox(-0.0141F, -0.2579F, -1.9365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.369F, -8.8088F, -3.7788F, 0.6619F, 0.3802F, 0.4091F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(115, 94).mirror().addBox(-0.0181F, -0.039F, -0.9676F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.369F, -8.8088F, -3.7788F, 0.4263F, 0.3802F, 0.4091F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(67, 101).mirror().addBox(-1.2F, 0.15F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.186F, -8.8019F, -2.3068F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6099F, -8.9443F, -0.2145F, 0.0747F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.1746F, 0.8558F, -0.0087F, 0.0008F, 0.0873F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 68).addBox(-0.6F, -2.0957F, -2.1902F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.615F, -0.0005F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 107).addBox(-5.1F, -1.2214F, 0.2676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 7.6851F, -1.4601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(101, 90).addBox(-5.1F, -1.3057F, -2.443F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6F, 11.6054F, 0.2955F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(115, 27).addBox(-1.0F, -0.45F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 11.9957F, -0.7721F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(60, 107).addBox(-5.1F, -2.132F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 35).addBox(-5.1F, -1.132F, -0.7183F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 10.6777F, -1.6694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(114, 13).addBox(-1.0F, -1.0F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 12.5417F, -1.9203F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(27, 102).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.0341F, -2.2887F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(116, 112).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.9105F, 0.673F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(116, 32).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 3.9105F, 0.673F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(93, 7).addBox(-5.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 2.0287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(7, 101).addBox(-5.1F, -3.8363F, -0.2445F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 5.5302F, -1.3348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(68, 90).addBox(-1.5F, -1.9F, -1.35F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1116F, 1.0643F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(30, 90).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 1.0127F, 0.3215F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 15.1098F, -1.2486F, 0.6366F, -0.0259F, 0.0351F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(102, 52).addBox(0.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(108, 25).addBox(0.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(30, 84).addBox(-0.1F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(95, 35).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 25).addBox(-0.1F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 91).addBox(-0.1F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(90, 89).addBox(-0.1F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(107, 104).addBox(-0.1F, 1.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(39, 96).addBox(-0.1F, -8.4F, -0.75F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(11, 93).addBox(-0.1F, -6.0F, -0.75F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 110).addBox(-0.1F, -3.0F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 76).addBox(-1.1F, -6.6F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(74, 107).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.5528F, 0.4883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(63, 78).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 1.4197F, -0.1418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(82, 0).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.2209F, -1.5237F, -1.0005F, -0.1014F, -0.1668F));

		PartDefinition cube_r111 = rightLeg3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(118, 37).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r112 = rightLeg3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(48, 110).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(40, 55).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(46, 23).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.1746F, 0.8558F, -0.9615F, 0.1436F, 0.0995F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 91).addBox(-2.4F, -2.0957F, -2.1902F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 12.615F, -0.0005F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(109, 45).addBox(3.1F, -1.2214F, 0.2676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 7.6851F, -1.4601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(98, 104).addBox(3.1F, -1.3057F, -2.443F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.6F, 11.6054F, 0.2955F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(116, 60).addBox(-1.0F, -0.45F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 11.9957F, -0.7721F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(109, 34).addBox(3.1F, -2.132F, 0.1317F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 104).addBox(3.1F, -1.132F, -0.7183F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 10.6777F, -1.6694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(115, 23).addBox(-1.0F, -1.0F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 12.5417F, -1.9203F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.0341F, -2.2887F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(116, 116).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.9105F, 0.673F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(70, 116).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 3.9105F, 0.673F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(77, 95).addBox(3.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 2.0287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(101, 65).addBox(3.1F, -3.8363F, -0.2445F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 5.5302F, -1.3348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(39, 91).addBox(-1.5F, -1.9F, -1.35F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.1116F, 1.0643F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(91, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.0127F, 0.3215F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 15.1098F, -1.2486F, 1.0726F, 0.045F, -0.0116F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(46, 104).addBox(-2.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(109, 55).addBox(-2.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(79, 89).addBox(-1.9F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(26, 115).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(89, 47).addBox(-1.9F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(19, 92).addBox(-1.9F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 60).addBox(-1.9F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 109).addBox(-1.9F, 1.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(46, 96).addBox(-1.9F, -8.4F, -0.75F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 96).addBox(-1.9F, -6.0F, -0.75F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(31, 110).addBox(-1.9F, -3.0F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(7, 76).addBox(-0.9F, -6.6F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(109, 50).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.5528F, 0.4883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(14, 79).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 1.4197F, -0.1418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(84, 16).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.2209F, -1.5237F, -1.2655F, -0.0285F, -0.0547F));

		PartDefinition cube_r140 = leftLeg3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(90, 123).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r141 = leftLeg3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 115).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5554F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(61, 53).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 1.9286F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(46, 30).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.3017F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6701F, 8.6594F, -0.2289F, 0.1373F, 0.0129F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(10, 123).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5584F, 8.4647F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(116, 43).addBox(0.5F, -0.0129F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2596F, 1.3785F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(109, 118).addBox(0.5F, 0.5871F, -0.1754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0163F, 3.1935F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(41, 116).addBox(0.5F, -0.0129F, -0.8754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9422F, 5.5156F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(106, 118).addBox(0.5F, -3.3823F, -0.1162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6788F, 4.7199F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(103, 118).addBox(0.5F, -3.2573F, -0.1162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.005F, 6.7158F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(38, 116).addBox(0.5F, -3.6073F, -0.4162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.3513F, 3.061F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 116).addBox(0.497F, -3.8323F, -1.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0933F, 1.6709F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8351F, -0.1687F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r151 = tail1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(38, 47).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8351F, -0.1687F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r152 = tail1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0695F, -0.1267F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(18, 118).addBox(-1.0F, -4.4335F, 3.7591F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 118).addBox(-1.0F, -4.6335F, 5.7591F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.346F, 8.6298F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0382F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(59, 37).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0382F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(100, 118).addBox(0.0F, -0.7051F, -0.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.452F, 7.0799F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 118).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(49, 122).addBox(0.0F, 0.4F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(49, 116).addBox(0.5F, -2.9823F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 71).addBox(0.5F, -3.0073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, 0.0262F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1351F, 0.0783F, 0.0583F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(29, 125).addBox(0.0F, -3.0561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(26, 125).addBox(0.0F, -2.9561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(23, 125).addBox(0.0F, -2.8061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(41, 123).addBox(0.0F, -2.7811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(48, 10).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(48, 0).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(36, 97).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6142F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(7, 96).addBox(0.0F, -0.8F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0918F, 6.721F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 84).addBox(0.0F, 0.3F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.297F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(59, 45).mirror().addBox(-1.6F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4738F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r170 = tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(59, 45).addBox(-0.4F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4738F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0283F, 0.084F, 0.0497F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 61).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(27, 12).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(95, 27).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9161F, 9.0728F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(69, 125).addBox(0.0F, 0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4125F, 5.5576F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(66, 125).addBox(0.0F, 0.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(63, 125).addBox(0.0F, -0.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail8.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(60, 125).addBox(0.0F, -2.3811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8984F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail8.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(57, 125).addBox(0.0F, -2.4561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.9983F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail8.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(44, 125).addBox(0.0F, -2.5061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail8.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 125).addBox(0.0F, -2.4561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8984F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0087F, -0.0436F, 0.0004F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(89, 130).addBox(0.0F, -1.9128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 130).addBox(0.0F, -2.2128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(83, 130).addBox(0.0F, -1.9628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(130, 77).addBox(0.0F, -1.9628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(43, 130).addBox(0.0F, -1.9128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(131, 28).addBox(0.0F, -0.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 131).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1891F, 4.5675F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(15, 129).addBox(0.0F, -0.1F, -1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(38, 37).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r189 = tail3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(38, 37).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r190 = tail3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.1232F, -0.1299F, 0.016F));

		PartDefinition cube_r191 = tail9.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail9.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(131, 112).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(95, 130).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail9.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(131, 47).addBox(0.0F, -0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 43).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0346F, 2.4336F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail9.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(46, 131).addBox(0.0F, 0.6F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4331F, -3.9955F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail9.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(92, 130).addBox(0.0F, -1.325F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0528F, -0.1307F, 0.0069F));

		PartDefinition cube_r197 = tail4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(10, 132).addBox(0.0F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 5.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(126, 131).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(131, 67).addBox(0.0F, -0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 51).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9603F, 3.28F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(49, 131).addBox(0.0F, 0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5957F, -3.3981F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(123, 131).addBox(0.0F, -0.9F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 17).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(67, 9).addBox(-0.5F, -0.5855F, -0.0233F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(132, 19).addBox(0.0F, -1.2605F, 0.9767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 22).addBox(0.0F, -1.1855F, 2.9767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 5.9912F, -0.1491F, -0.1665F, 0.0683F));

		PartDefinition cube_r203 = tail5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 132).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5855F, 4.9767F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(132, 97).addBox(0.0F, 1.0F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 94).addBox(0.0F, 0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 87).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4659F, 1.7866F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(69, 25).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(80, 132).addBox(0.0F, -0.575F, 0.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 81).addBox(0.0F, -0.525F, 2.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 84).addBox(0.0F, -0.425F, 4.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5213F, 5.8768F, -0.0738F, -0.0839F, 0.0498F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(34, 69).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.95F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(49, 70).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1226F, -0.0866F, 0.0107F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(17, 62).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -9.1792F, 7.4882F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7628F, -3.1022F, -0.0019F, 0.0436F, -0.0418F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(88, 105).addBox(-0.503F, -3.8022F, -1.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6661F, -3.8595F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(109, 12).addBox(-0.503F, -3.7022F, -2.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7708F, -5.8568F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(109, 5).addBox(-0.503F, -3.7522F, -0.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5266F, -1.8644F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.0865F, -9.7807F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 25).addBox(-2.5F, -5.0018F, 0.1704F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.6057F, -8.7537F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1135F, -6.9807F, -0.0312F, 0.1272F, -1.52F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(121, 104).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1135F, -6.9807F, 0.0456F, 0.1228F, -0.9218F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(92, 121).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1135F, -6.9807F, 0.0933F, 0.092F, -0.484F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(114, 17).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4635F, -0.9807F, -0.0817F, -0.1167F, -1.0776F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(108, 30).mirror().addBox(-5.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4635F, -0.9807F, -0.0021F, -0.1424F, -1.6757F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 121).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4635F, -0.9807F, -0.1233F, -0.0713F, -0.6417F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(103, 32).mirror().addBox(-6.74F, -2.3355F, -0.4915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2385F, -3.9807F, -0.0203F, 0.0312F, -1.6747F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(56, 89).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2385F, -3.9807F, 0.0006F, 0.0372F, -1.0809F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(121, 57).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2385F, -3.9807F, 0.0163F, 0.0335F, -0.6443F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 45).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1135F, -6.9807F, -0.0312F, -0.1272F, 1.52F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(121, 104).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1135F, -6.9807F, 0.0456F, -0.1228F, 0.9218F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(92, 121).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1135F, -6.9807F, 0.0933F, -0.092F, 0.484F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(114, 17).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4635F, -0.9807F, -0.0817F, 0.1167F, 1.0776F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(108, 30).addBox(2.74F, -2.3355F, -0.4915F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4635F, -0.9807F, -0.0021F, 0.1424F, 1.6757F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(85, 121).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4635F, -0.9807F, -0.1233F, 0.0713F, 0.6417F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(103, 32).addBox(2.74F, -2.3355F, -0.4915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2385F, -3.9807F, -0.0203F, -0.0312F, 1.6747F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(56, 89).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2385F, -3.9807F, 0.0006F, -0.0372F, 1.0809F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(121, 57).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2385F, -3.9807F, 0.0163F, -0.0335F, 0.6443F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(25, 25).addBox(-0.5F, -1.0808F, -9.0002F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.078F, -7.7812F, 0.1051F, 0.0868F, 0.0091F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(93, 100).addBox(0.0F, -3.6122F, -1.0627F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0703F, -1.8946F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(26, 108).addBox(0.0F, -3.0072F, 0.1331F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.98F, -9.0951F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(34, 62).addBox(0.0F, -3.6583F, 0.0355F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0071F, -5.9953F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(119, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0808F, -1.9002F, 0.0759F, 0.0486F, -0.4172F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(26, 119).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0808F, -1.9002F, 0.0483F, 0.0761F, -0.8536F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(27, 23).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0808F, -1.9002F, -0.0027F, 0.0901F, -1.4489F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1308F, -7.9002F, 0.0409F, 0.2583F, -1.3589F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(118, 41).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1308F, -7.9002F, 0.1798F, 0.1909F, -0.7535F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(117, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1308F, -7.9002F, 0.2428F, 0.0979F, -0.3225F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4308F, -4.9002F, 0.1465F, 0.0558F, -0.3641F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(124, 29).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4308F, -4.9002F, 0.1094F, 0.1123F, -0.7984F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(69, 33).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4308F, -4.9002F, 0.0276F, 0.1542F, -1.3958F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(119, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0808F, -1.9002F, 0.0759F, -0.0486F, 0.4172F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -3.0429F, -6.018F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.4319F, -2.1305F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(26, 119).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0808F, -1.9002F, 0.0483F, -0.0761F, 0.8536F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(27, 23).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0808F, -1.9002F, -0.0027F, -0.0901F, 1.4489F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(48, 20).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1308F, -7.9002F, 0.0409F, -0.2583F, 1.3589F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(118, 41).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1308F, -7.9002F, 0.1798F, -0.1909F, 0.7535F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(117, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1308F, -7.9002F, 0.2428F, -0.0979F, 0.3225F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(78, 124).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4308F, -4.9002F, 0.1465F, -0.0558F, 0.3641F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(124, 29).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4308F, -4.9002F, 0.1094F, -0.1123F, 0.7984F));

		PartDefinition cube_r249 = body2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(69, 33).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4308F, -4.9002F, 0.0276F, -0.1542F, 1.3958F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0104F, -8.8483F, 0.1228F, 0.0861F, 0.0144F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(108, 64).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1001F, -1.9386F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(112, 118).addBox(0.0F, -2.8525F, -0.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8999F, -1.8386F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(75, 125).addBox(0.0F, -2.4967F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8999F, -3.9386F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(78, 35).addBox(-4.9595F, 0.1454F, -1.4401F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 8.5359F, -7.1516F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(41, 89).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -7.3386F, 0.0715F, 0.3191F, -1.4772F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(120, 63).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -7.3386F, 0.2399F, 0.224F, -0.8682F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(120, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -7.3386F, 0.3105F, 0.1036F, -0.4427F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(120, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -5.3386F, 0.2317F, 0.0667F, -0.3618F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(119, 92).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -5.3386F, 0.1827F, 0.1579F, -0.7914F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(19, 53).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2001F, -5.3386F, 0.0626F, 0.2328F, -1.392F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(119, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0999F, -3.4386F, 0.1463F, 0.0505F, -0.3309F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(119, 69).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0999F, -3.4386F, 0.1115F, 0.1075F, -0.7649F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(19, 51).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0999F, -3.4386F, 0.0321F, 0.1514F, -1.3619F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(61, 59).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1499F, -1.4386F, 0.0169F, 0.1377F, -1.3113F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(119, 47).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1499F, -1.4386F, 0.0912F, 0.1046F, -0.7143F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(119, 45).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1499F, -1.4386F, 0.1268F, 0.0564F, -0.2791F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-1.5322F, 0.3608F, -5.6557F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, 8.5359F, -7.1516F, -0.6592F, -0.3904F, 0.2867F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9587F, 8.9549F, -7.8668F, -0.6874F, 1.1705F, 0.5564F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.841F, 9.3784F, -7.0466F, -0.3664F, 1.1538F, 0.2343F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-6.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4626F, 9.574F, -7.1748F, -0.0182F, 1.1534F, 0.0652F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(41, 89).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -7.3386F, 0.0715F, -0.3191F, 1.4772F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(120, 63).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -7.3386F, 0.2399F, -0.224F, 0.8682F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(120, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -7.3386F, 0.3105F, -0.1036F, 0.4427F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(125, 73).addBox(0.0F, -2.5926F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5999F, -7.7386F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(120, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -5.3386F, 0.2317F, -0.0667F, 0.3618F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(119, 92).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -5.3386F, 0.1827F, -0.1579F, 0.7914F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(19, 53).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2001F, -5.3386F, 0.0626F, -0.2328F, 1.392F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(119, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0999F, -3.4386F, 0.1463F, -0.0505F, 0.3309F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(119, 69).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0999F, -3.4386F, 0.1115F, -0.1075F, 0.7649F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(19, 51).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0999F, -3.4386F, 0.0321F, -0.1514F, 1.3619F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(61, 59).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1499F, -1.4386F, 0.0169F, -0.1377F, 1.3113F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(119, 47).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1499F, -1.4386F, 0.0912F, -0.1046F, 0.7143F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(19, 55).addBox(-3.0F, -1.975F, -3.975F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.0762F, -1.14F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(119, 45).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1499F, -1.4386F, 0.1268F, -0.0564F, 0.2791F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(72, 125).addBox(0.0F, -2.3927F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5999F, -5.7386F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(76, 61).addBox(-0.4678F, 0.3608F, -5.6557F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, 8.5359F, -7.1516F, -0.6592F, 0.3904F, -0.2867F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(69, 35).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9587F, 8.9549F, -7.8668F, -0.6874F, -1.1705F, -0.5564F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(90, 33).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.841F, 9.3784F, -7.0466F, -0.3664F, -1.1538F, -0.2343F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(84, 31).addBox(0.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4626F, 9.574F, -7.1748F, -0.0182F, -1.1534F, -0.0652F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(68, 78).addBox(-2.9595F, 0.3608F, -5.2405F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 8.5359F, -7.1516F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9999F, -2.0387F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5628F, 4.5373F, -4.4038F, -0.5153F, 0.0981F, -0.1959F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(59, 61).addBox(-0.9453F, -0.8636F, -2.1843F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.104F, -0.0148F, -0.0092F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(110, 88).addBox(-0.9453F, -2.9503F, 2.7387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 0.6589F, -0.0148F, -0.0092F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(99, 27).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4313F, -5.7981F, 0.3259F, 1.549F, 0.0027F, -0.0172F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(125, 65).addBox(-0.5F, -1.05F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4342F, -5.7598F, 1.1594F, 0.7199F, 0.0027F, -0.0172F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(64, 70).addBox(-0.5F, -0.65F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4785F, -2.9295F, -0.4872F, 1.069F, 0.0027F, -0.0172F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(108, 78).addBox(-0.5F, -0.525F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5205F, -0.2964F, -2.0634F, 0.8028F, 0.003F, -0.0172F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(125, 40).addBox(-0.425F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3469F, 2.073F, -2.6448F, 1.466F, 0.1346F, 0.2175F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(82, 9).addBox(-0.0183F, 0.3759F, -1.812F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2562F, 2.9744F, -5.112F, -0.1913F, 0.2062F, 1.1672F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(68, 84).addBox(-0.2061F, -0.311F, -1.812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2562F, 2.9744F, -5.112F, -0.2496F, 0.1291F, 0.8218F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(109, 60).addBox(-0.2061F, -1.4535F, -1.1258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2562F, 2.9744F, -5.112F, 0.4922F, 0.1291F, 0.8218F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(108, 73).addBox(-0.2061F, -0.7209F, 0.1784F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2562F, 2.9744F, -5.112F, 1.1467F, 0.1291F, 0.8218F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(102, 58).addBox(-0.5F, -0.725F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4876F, 1.4018F, -3.6783F, 0.5276F, 0.0827F, 0.2417F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5628F, 4.5373F, -4.4038F, -0.5153F, -0.0981F, 0.1959F));

		PartDefinition cube_r303 = bone5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(59, 61).mirror().addBox(-0.0547F, -0.8636F, -2.1843F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.104F, 0.0148F, 0.0092F));

		PartDefinition cube_r304 = bone5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(110, 88).mirror().addBox(-0.0547F, -2.9503F, 2.7387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 0.6589F, 0.0148F, 0.0092F));

		PartDefinition cube_r305 = bone5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4313F, -5.7981F, 0.3259F, 1.549F, -0.0027F, 0.0172F));

		PartDefinition cube_r306 = bone5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(125, 65).mirror().addBox(-0.5F, -1.05F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4342F, -5.7598F, 1.1594F, 0.7199F, -0.0027F, 0.0172F));

		PartDefinition cube_r307 = bone5.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(64, 70).mirror().addBox(-0.5F, -0.65F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4785F, -2.9295F, -0.4872F, 1.069F, -0.0027F, 0.0172F));

		PartDefinition cube_r308 = bone5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(108, 78).mirror().addBox(-0.5F, -0.525F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5205F, -0.2964F, -2.0634F, 0.8028F, -0.003F, 0.0172F));

		PartDefinition cube_r309 = bone5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(125, 40).mirror().addBox(-0.575F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3469F, 2.073F, -2.6448F, 1.466F, -0.1346F, -0.2175F));

		PartDefinition cube_r310 = bone5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(82, 9).mirror().addBox(-0.9817F, 0.3759F, -1.812F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2562F, 2.9744F, -5.112F, -0.1913F, -0.2062F, -1.1672F));

		PartDefinition cube_r311 = bone5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(68, 84).mirror().addBox(-0.7939F, -0.311F, -1.812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2562F, 2.9744F, -5.112F, -0.2496F, -0.1291F, -0.8218F));

		PartDefinition cube_r312 = bone5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(109, 60).mirror().addBox(-0.7939F, -1.4535F, -1.1258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2562F, 2.9744F, -5.112F, 0.4922F, -0.1291F, -0.8218F));

		PartDefinition cube_r313 = bone5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(108, 73).mirror().addBox(-0.7939F, -0.7209F, 0.1784F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2562F, 2.9744F, -5.112F, 1.1467F, -0.1291F, -0.8218F));

		PartDefinition cube_r314 = bone5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(102, 58).mirror().addBox(-0.5F, -0.725F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4876F, 1.4018F, -3.6783F, 0.5276F, -0.0827F, -0.2417F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7132F, 7.6185F, -8.0887F, 0.8505F, -0.0905F, -0.4486F));

		PartDefinition cube_r315 = leftArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(67, 130).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6037F, -0.0814F, 0.1503F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r316 = leftArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(125, 125).addBox(-0.5F, -1.9F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 122).addBox(-0.5F, -1.2F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2706F, 1.0418F, -0.9192F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r317 = leftArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(120, 77).addBox(-0.5F, -0.9F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 1.0418F, -0.9192F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r318 = leftArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(120, 73).addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0859F, 0.9795F, -0.0708F, -0.2022F, -0.0786F, -0.067F));

		PartDefinition cube_r319 = leftArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(125, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1575F, -1.4165F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(120, 65).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.6652F, -0.9186F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(21, 111).addBox(-0.5F, -3.0F, -0.725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.45F, -0.1223F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(34, 102).addBox(-0.8F, -0.2307F, 0.2266F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 95).addBox(-0.8F, 0.5693F, -1.3734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2572F, 6.928F, -1.4237F, -1.5736F, 0.0156F, 0.0164F));

		PartDefinition cube_r322 = leftArm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(115, 64).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 3.3693F, -1.1734F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0911F, 6.2218F, 0.8012F, 0.034F, -0.0396F, 0.2015F));

		PartDefinition cube_r323 = leftHand.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(45, 78).addBox(0.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftHand.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(61, 92).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2031F, -1.2796F, -0.3142F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7132F, 7.6185F, -8.0887F, 0.3269F, 0.1256F, 0.2197F));

		PartDefinition cube_r325 = rightArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(72, 130).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6037F, -0.0814F, 0.1503F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r326 = rightArm1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(130, 64).addBox(-0.5F, -1.9F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 130).addBox(-0.5F, -1.2F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2706F, 1.0418F, -0.9192F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r327 = rightArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(85, 123).addBox(-0.5F, -0.9F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 1.0418F, -0.9192F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r328 = rightArm1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(123, 59).addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0859F, 0.9795F, -0.0708F, -0.2022F, 0.0786F, 0.067F));

		PartDefinition cube_r329 = rightArm1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(57, 130).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1575F, -1.4165F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightArm1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(123, 36).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.6652F, -0.9186F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightArm1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -3.0F, -0.725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.45F, -0.1223F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(21, 103).addBox(-0.2F, -0.2307F, 0.2266F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 73).addBox(-0.2F, 0.5693F, -1.3734F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2572F, 6.928F, -1.4237F, -2.02F, 0.3594F, -0.3225F));

		PartDefinition cube_r332 = rightArm2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(115, 78).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 3.3693F, -1.1734F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0911F, 6.2218F, 0.8012F, 0.034F, 0.0396F, -0.2015F));

		PartDefinition cube_r333 = rightHand.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(54, 78).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightHand.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(92, 73).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2031F, -1.2796F, -0.2705F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0309F, -7.769F, -0.5542F, -0.1783F, -0.0491F));

		PartDefinition cube_r335 = neck1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(126, 6).addBox(0.0F, -2.4459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.8756F, 0.3979F, -0.5097F));

		PartDefinition cube_r337 = neck1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(120, 81).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.6804F, 0.7081F, -0.8741F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 71).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0549F, 0.9381F, -1.6998F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(120, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.8756F, -0.3979F, 0.5097F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(120, 81).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.6804F, -0.7081F, 0.8741F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(101, 71).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0549F, -0.9381F, 1.6998F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(93, 15).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3239F, -0.0839F, -0.0241F));

		PartDefinition cube_r343 = neck2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(130, 128).addBox(0.0F, -1.8733F, -0.1083F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -2.7163F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(130, 120).addBox(0.0F, -1.7816F, -0.0991F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(110, 92).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1878F, -2.5629F, 0.0978F, 0.7775F, -1.4152F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(121, 112).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1878F, -2.5629F, 0.4691F, 0.6515F, -0.8578F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(92, 87).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.3886F, 0.5921F, -1.2628F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(120, 85).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.596F, 0.3822F, -0.8276F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(121, 112).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1878F, -2.5629F, 0.4691F, -0.6515F, 0.8578F));

		PartDefinition cube_r350 = neck2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(110, 92).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1878F, -2.5629F, 0.0978F, -0.7775F, 1.4152F));

		PartDefinition cube_r351 = neck2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(92, 87).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.3886F, -0.5921F, 1.2628F));

		PartDefinition cube_r352 = neck2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(120, 85).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.596F, -0.3822F, 0.8276F));

		PartDefinition cube_r353 = neck2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(18, 97).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4816F, -2.6317F, -0.1542F, 0.0952F, 0.0214F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(93, 39).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(120, 96).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3903F, -2.0742F, 0.3656F, 0.9178F, -0.9056F));

		PartDefinition cube_r356 = neck5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(120, 94).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3903F, -2.0742F, -0.2399F, 0.9469F, -1.6474F));

		PartDefinition cube_r357 = neck5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(120, 96).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3903F, -2.0742F, 0.3656F, -0.9178F, 0.9056F));

		PartDefinition cube_r358 = neck5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(120, 94).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3903F, -2.0742F, -0.2399F, -0.9469F, 1.6474F));

		PartDefinition cube_r359 = neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(98, 130).addBox(0.0F, -1.5109F, -0.1253F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0059F, -1.8414F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.101F, -2.8797F, -0.0616F, 0.0863F, -0.0129F));

		PartDefinition cube_r360 = neck4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(120, 100).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.5127F, -0.1481F, 1.1589F, -1.5587F));

		PartDefinition cube_r361 = neck4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(120, 98).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.5127F, 0.7004F, 1.0265F, -0.6193F));

		PartDefinition cube_r362 = neck4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(120, 100).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.5127F, -0.1481F, -1.1589F, 1.5587F));

		PartDefinition cube_r363 = neck4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(120, 98).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.5127F, 0.7004F, -1.0265F, 0.6193F));

		PartDefinition cube_r364 = neck4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(126, 11).addBox(0.0F, -1.3677F, 0.5418F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(93, 53).addBox(-0.5F, 1.4F, 1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1979F, -3.0696F, 0.2182F, 0.0435F, 0.0038F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7268F, -0.4594F, 0.0607F, 1.0025F, -1.5106F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(115, 120).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.7268F, -0.4594F, 0.6228F, 0.8482F, -0.8189F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(122, 27).mirror().addBox(-3.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5268F, -2.3594F, 0.0276F, 0.8802F, -1.5875F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(120, 102).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5268F, -2.3594F, 0.4926F, 0.7632F, -0.9631F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 121).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7268F, -0.4594F, 0.0607F, -1.0025F, 1.5106F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(115, 120).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7268F, -0.4594F, 0.6228F, -0.8482F, 0.8189F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(122, 27).addBox(1.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5268F, -2.3594F, 0.0276F, -0.8802F, 1.5875F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(120, 102).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5268F, -2.3594F, 0.4926F, -0.7632F, 0.9631F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(104, 130).addBox(0.5F, -1.1256F, -0.036F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.7722F, -1.804F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(101, 130).addBox(0.5F, -1.2646F, -0.1941F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7604F, 0.0871F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(82, 53).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.8902F, 2.1636F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6501F, -3.6359F, -0.5764F, 0.0366F, -0.0238F));

		PartDefinition cube_r377 = neck.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(121, 110).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4031F, -0.642F, 1.4298F, 1.1396F, -0.2241F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(121, 108).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4031F, -0.642F, -0.1508F, 1.5114F, -1.8177F));

		PartDefinition cube_r379 = neck.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(121, 2).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3031F, -2.142F, -0.0034F, 1.4252F, -1.671F));

		PartDefinition cube_r380 = neck.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3031F, -2.142F, 1.2364F, 1.1128F, -0.3988F));

		PartDefinition cube_r381 = neck.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(121, 108).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4031F, -0.642F, -0.1508F, -1.5114F, 1.8177F));

		PartDefinition cube_r382 = neck.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(121, 110).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4031F, -0.642F, 1.4298F, -1.1396F, 0.2241F));

		PartDefinition cube_r383 = neck.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(121, 2).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3031F, -2.142F, -0.0034F, -1.4252F, 1.671F));

		PartDefinition cube_r384 = neck.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(131, 15).addBox(0.5F, -1.4207F, 0.8986F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6758F, -1.9101F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(107, 130).addBox(0.5F, -1.4512F, -0.1099F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6758F, -2.9101F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(90, 94).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.2983F, 0.0104F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(121, 0).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3031F, -2.142F, 1.2364F, -1.1128F, 0.3988F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4744F, -2.8711F, 0.3621F, 0.1722F, 0.1593F));

		PartDefinition cube_r388 = neck6.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(104, 45).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4089F, -1.111F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r389 = neck6.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(121, 4).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4089F, -1.111F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r390 = neck6.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(104, 45).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4089F, -1.111F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r391 = neck6.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(110, 130).addBox(0.5F, -1.6317F, 0.0418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0501F, -2.0398F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r392 = neck6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(108, 83).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.5863F, 0.1415F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(121, 4).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4089F, -1.111F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.205F, -1.8883F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r394 = neck7.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(131, 90).addBox(0.5F, -0.458F, -1.8258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 124).addBox(0.5F, -1.558F, -0.0258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0501F, -1.9398F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r395 = neck7.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(81, 82).addBox(0.0F, 1.3815F, -4.2683F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5863F, 0.1415F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r396 = neck7.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(121, 106).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4089F, -1.111F, 0.5592F, 0.7771F, -0.9624F));

		PartDefinition cube_r397 = neck7.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(121, 106).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4089F, -1.111F, 0.5592F, -0.7771F, 0.9624F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9922F, -2.8538F, 0.0145F, 0.2674F, -0.1665F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(104, 21).addBox(-1.5067F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.5067F, -1.4174F, -2.2987F, -1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(100, 10).addBox(-1.0F, -0.0224F, -0.0355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.3269F, -3.2711F, -1.4181F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(100, 5).addBox(-1.0F, -1.0293F, -0.0224F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.0483F, -5.2196F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0F, 0.9103F, -0.0875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0483F, -5.2196F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(81, 112).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.956F, -11.403F, -0.8334F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(74, 112).addBox(-0.5F, -0.0064F, -0.0691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.4267F, -10.6196F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(108, 99).addBox(-0.5F, 3.6236F, -0.6099F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0483F, -5.2196F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(112, 69).addBox(-0.5F, 2.765F, -0.4078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -1.0483F, -5.2196F, -1.261F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(127, 22).addBox(-0.505F, 0.0078F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6267F, -12.1196F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(127, 19).addBox(-0.505F, 0.0011F, -0.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.5267F, -12.5696F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(67, 112).addBox(-0.5F, -0.0162F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.4457F, -1.766F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(60, 112).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9817F, -1.5973F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(19, 86).addBox(-0.5F, -1.45F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.392F, -8.2795F, 0.1999F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(99, 99).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.9055F, -5.6441F, 0.2087F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(30, 77).addBox(-1.0F, -1.625F, -1.65F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.8688F, -4.0472F, 0.1127F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(74, 103).addBox(-1.5F, -1.35F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0807F, -2.6149F, -0.3642F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(99, 94).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9379F, -1.577F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -1.0F, -1.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0189F, -0.7571F, 1.5446F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.299F, -0.7902F, -5.7129F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(5, 127).addBox(-0.325F, -2.725F, -1.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5154F, -2.5463F, 4.4125F, 2.8491F, 1.1384F, 0.0631F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(15, 71).addBox(-1.7109F, -0.7839F, -6.3858F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2084F, 0.0788F, 0.0537F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 127).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.675F, 1.6168F, -5.549F, -2.3528F, 0.0555F, 0.1419F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(120, 126).addBox(-0.4989F, 1.6505F, -2.1569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.867F, 1.955F, -2.1706F, -0.9732F, 0.07F, 0.1354F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(115, 126).addBox(-0.4989F, -2.0026F, -1.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.867F, 1.955F, -2.1706F, 0.5104F, 0.07F, 0.1354F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(121, 53).addBox(-0.4989F, -1.9011F, -0.0806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.75F, 2.3374F, -3.0872F, 0.4056F, 0.07F, 0.1354F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(121, 49).addBox(-0.4602F, -2.0173F, 0.6509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.75F, 2.3374F, -3.0872F, 0.2669F, 0.0858F, 0.1163F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(108, 94).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.1599F, -0.0142F, -2.0607F, 1.7591F, 0.0838F, 0.1181F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(88, 127).addBox(-0.5033F, -0.8297F, -0.2229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.3717F, 0.0328F, 0.1794F, 2.3964F, 0.0922F, 0.1959F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(93, 127).addBox(-0.5033F, -0.6039F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.3717F, 0.0328F, 0.1794F, -2.4032F, 0.0922F, 0.1959F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(127, 87).addBox(-0.5033F, -0.2477F, -0.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.3717F, 0.0328F, 0.1794F, -2.8395F, 0.0922F, 0.1959F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(7, 112).addBox(-0.5033F, -0.7064F, -0.7453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.3717F, 0.0328F, 0.1794F, -2.0541F, 0.0922F, 0.1959F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(10, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4205F, 3.6308F, -6.8517F, 1.1539F, 0.1049F, 0.0336F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(126, 114).addBox(-0.5F, -0.375F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3754F, 4.1008F, -7.1303F, 0.2813F, 0.1049F, 0.0336F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(14, 109).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6966F, 4.4757F, -3.9887F, -0.0285F, 0.1049F, 0.0336F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(13, 122).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.805F, 4.3338F, -3.0048F, 0.146F, 0.1049F, 0.0336F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(44, 121).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9146F, 4.1062F, -2.0373F, 0.2333F, 0.1049F, 0.0336F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(111, 39).addBox(-0.9093F, -2.9576F, -1.8231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.3336F, 0.1049F, 0.0336F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(95, 21).addBox(-0.9093F, -3.5513F, -3.6912F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.5082F, 0.1049F, 0.0336F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(99, 73).addBox(-0.9093F, -3.8546F, -6.2543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.5954F, 0.1049F, 0.0336F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(121, 32).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.635F, 4.5155F, -6.3524F, 0.2464F, 0.1049F, 0.0336F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(31, 121).addBox(-0.5F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7148F, 5.0341F, -5.4283F, 0.1242F, 0.1049F, 0.0336F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(26, 121).addBox(-0.5F, -1.575F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7734F, 5.1184F, -4.3673F, 0.0893F, 0.1049F, 0.0336F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(21, 121).addBox(-0.5F, -1.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8778F, 4.4758F, -3.5814F, 0.2638F, 0.1049F, 0.0336F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(121, 14).addBox(-0.9093F, -1.7673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9439F, 2.7773F, 2.0888F, 0.4558F, 0.1049F, 0.0336F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(121, 10).addBox(-0.9093F, -1.8369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9439F, 2.7773F, 2.0888F, 0.5256F, 0.1049F, 0.0336F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(121, 6).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2009F, 3.4666F, -0.8364F, 0.482F, 0.1049F, 0.0336F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(126, 91).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3204F, 3.3316F, 0.2559F, 0.4384F, 0.1049F, 0.0336F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(93, 108).addBox(-0.5F, -1.825F, 0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8937F, 3.9941F, -2.2425F, 0.3685F, 0.1049F, 0.0336F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(121, 114).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2158F, 3.1992F, 0.5619F, 0.2551F, 0.1049F, 0.0336F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(116, 55).addBox(-0.9093F, -2.7358F, -0.9104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.1242F, 0.1049F, 0.0336F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(80, 120).addBox(-0.8948F, -2.6624F, -0.0327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6939F, 2.8773F, 1.0888F, 0.2531F, -0.0349F, 0.0F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(14, 103).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3425F, 1.0745F, 1.9925F, -0.0349F, 0.0349F, -0.0002F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(98, 127).addBox(-1.0F, 0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(127, 97).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8626F, -0.5921F, 2.3642F, -1.3614F, -0.0004F, -0.014F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(78, 126).addBox(-0.5F, 0.95F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.5322F, 2.4638F, -0.0087F, -0.0175F, -0.0176F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(103, 127).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3218F, -0.6703F, 3.5343F, 0.9948F, -0.0349F, -0.0175F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(126, 68).addBox(-0.5F, 1.0F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2526F, -1.9114F, 4.8971F, 0.1658F, -0.0349F, -0.0175F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(127, 100).addBox(-0.5F, -0.625F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(127, 94).addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2906F, 0.6461F, 5.0856F, -0.7854F, -0.0349F, -0.0175F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(126, 52).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3062F, 0.1673F, 4.4008F, 0.0436F, -0.0349F, -0.0175F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(116, 50).addBox(-0.5F, -3.0F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3365F, 2.9953F, 4.9447F, 0.2269F, -0.0349F, -0.0175F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(122, 23).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 128).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4185F, 2.7516F, 3.6919F, -2.9452F, -0.0349F, -0.0175F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(128, 3).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4459F, 2.4296F, 2.7455F, -1.898F, -0.0349F, -0.0175F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(128, 0).addBox(-0.5F, -1.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(127, 117).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4168F, 0.8303F, 2.7804F, -1.5926F, -0.0349F, -0.0175F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(108, 127).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3821F, 0.0243F, 3.3714F, -0.6327F, -0.0349F, -0.0175F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(128, 34).addBox(-0.5F, -1.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(126, 49).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3844F, 1.0811F, 3.8338F, -0.1091F, -0.0349F, -0.0175F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(129, 9).addBox(-0.5F, -0.15F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(129, 6).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7605F, 3.2582F, -5.3332F, -2.2495F, 0.1049F, 0.0336F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(125, 128).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6841F, 3.3906F, -6.0164F, -1.3768F, 0.1049F, 0.0336F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(128, 109).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6826F, 2.4519F, -6.3306F, -0.4605F, 0.1049F, 0.0336F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(128, 106).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.7556F, 2.0415F, -5.7683F, 0.6303F, 0.1049F, 0.0336F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(128, 103).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.8316F, 1.7303F, -5.1459F, 2.0353F, 0.1049F, 0.0336F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(126, 46).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8316F, 1.7303F, -5.1459F, -2.9301F, 0.1049F, 0.0336F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(53, 114).addBox(-0.5076F, -0.6887F, -1.224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1777F, 1.5085F, -0.9451F, -3.0174F, 0.1049F, 0.0336F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(128, 74).addBox(-0.5076F, -1.3347F, -0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1777F, 1.5085F, -0.9451F, -2.2756F, 0.1049F, 0.0336F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(115, 122).addBox(-0.5076F, -0.7162F, 0.2591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1777F, 1.5085F, -0.9451F, -1.6211F, 0.1049F, 0.0336F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(122, 87).addBox(-0.5076F, -0.2262F, -0.705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1777F, 1.5085F, -0.9451F, -1.0103F, 0.1049F, 0.0336F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(128, 71).addBox(-0.5076F, -0.6955F, 0.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1777F, 1.5085F, -0.9451F, 0.6914F, 0.1049F, 0.0336F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(126, 43).addBox(-0.5076F, 0.0901F, 0.3839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1777F, 1.5085F, -0.9451F, 1.3896F, 0.1049F, 0.0336F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(126, 31).addBox(-0.4606F, -6.1956F, 1.5922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(126, 16).addBox(-0.6855F, -6.1956F, 1.5922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0439F, 1.7273F, 7.3888F, 1.7453F, 0.0524F, 0.0F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(128, 61).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.5573F, 0.4357F, 2.1011F, 0.4797F, 0.0516F, -0.0091F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(128, 58).addBox(-0.5F, -0.375F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5306F, 0.6895F, 1.5389F, 1.4397F, 0.0516F, -0.0091F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(14, 114).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5753F, 1.9986F, 2.1747F, 1.7451F, 0.0516F, -0.0091F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(128, 55).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.517F, 1.9989F, 1.0449F, 2.356F, 0.0516F, -0.0091F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(47, 128).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4993F, 1.2262F, 0.8383F, -2.88F, 0.0516F, -0.0091F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(128, 37).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.492F, 0.4262F, 0.8385F, -1.571F, 0.0516F, -0.0091F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(13, 126).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5191F, 0.2117F, 1.4004F, -0.4802F, 0.0516F, -0.0091F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(65, 116).addBox(-0.9399F, -2.9203F, 0.3997F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(44, 116).addBox(-0.9399F, -2.9203F, -0.2003F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8439F, 3.1273F, 3.0888F, 0.0872F, -0.0356F, -0.0159F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.299F, -0.7902F, -5.7129F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(5, 127).mirror().addBox(-0.675F, -2.725F, -1.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5154F, -2.5463F, 4.4125F, 2.8491F, -1.1384F, -0.0631F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(0.7109F, -0.7839F, -6.3858F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2084F, -0.0788F, -0.0537F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.675F, 1.6168F, -5.549F, -2.3528F, -0.0555F, -0.1419F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(120, 126).mirror().addBox(-0.5011F, 1.6505F, -2.1569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.867F, 1.955F, -2.1706F, -0.9732F, -0.07F, -0.1354F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(115, 126).mirror().addBox(-0.5011F, -2.0026F, -1.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.867F, 1.955F, -2.1706F, 0.5104F, -0.07F, -0.1354F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(121, 53).mirror().addBox(-0.5011F, -1.9011F, -0.0806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 2.3374F, -3.0872F, 0.4056F, -0.07F, -0.1354F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(121, 49).mirror().addBox(-0.5398F, -2.0173F, 0.6509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 2.3374F, -3.0872F, 0.2669F, -0.0858F, -0.1163F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(108, 94).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.1599F, -0.0142F, -2.0607F, 1.7591F, -0.0838F, -0.1181F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(88, 127).mirror().addBox(-0.4967F, -0.8297F, -0.2229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.3717F, 0.0328F, 0.1794F, 2.3964F, -0.0922F, -0.1959F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(93, 127).mirror().addBox(-0.4967F, -0.6039F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.3717F, 0.0328F, 0.1794F, -2.4032F, -0.0922F, -0.1959F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(127, 87).mirror().addBox(-0.4967F, -0.2477F, -0.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3717F, 0.0328F, 0.1794F, -2.8395F, -0.0922F, -0.1959F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(7, 112).mirror().addBox(-0.4967F, -0.7064F, -0.7453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3717F, 0.0328F, 0.1794F, -2.0541F, -0.0922F, -0.1959F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(10, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4205F, 3.6308F, -6.8517F, 1.1539F, -0.1049F, -0.0336F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(126, 114).mirror().addBox(-0.5F, -0.375F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3754F, 4.1008F, -7.1303F, 0.2813F, -0.1049F, -0.0336F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(14, 109).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6966F, 4.4757F, -3.9887F, -0.0285F, -0.1049F, -0.0336F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(13, 122).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.805F, 4.3338F, -3.0048F, 0.146F, -0.1049F, -0.0336F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(44, 121).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9146F, 4.1062F, -2.0373F, 0.2333F, -0.1049F, -0.0336F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(111, 39).mirror().addBox(-0.0907F, -2.9576F, -1.8231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.3336F, -0.1049F, -0.0336F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(95, 21).mirror().addBox(-0.0907F, -3.5513F, -3.6912F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.5082F, -0.1049F, -0.0336F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(99, 73).mirror().addBox(-0.0907F, -3.8546F, -6.2543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.5954F, -0.1049F, -0.0336F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(121, 32).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.635F, 4.5155F, -6.3524F, 0.2464F, -0.1049F, -0.0336F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(31, 121).mirror().addBox(-0.5F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7148F, 5.0341F, -5.4283F, 0.1242F, -0.1049F, -0.0336F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(26, 121).mirror().addBox(-0.5F, -1.575F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7734F, 5.1184F, -4.3673F, 0.0893F, -0.1049F, -0.0336F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(21, 121).mirror().addBox(-0.5F, -1.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8778F, 4.4758F, -3.5814F, 0.2638F, -0.1049F, -0.0336F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(121, 14).mirror().addBox(-0.0907F, -1.7673F, -5.4549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9439F, 2.7773F, 2.0888F, 0.4558F, -0.1049F, -0.0336F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(121, 10).mirror().addBox(-0.0907F, -1.8369F, -4.4138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9439F, 2.7773F, 2.0888F, 0.5256F, -0.1049F, -0.0336F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(121, 6).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2009F, 3.4666F, -0.8364F, 0.482F, -0.1049F, -0.0336F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(126, 91).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3204F, 3.3316F, 0.2559F, 0.4384F, -0.1049F, -0.0336F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(93, 108).mirror().addBox(-0.5F, -1.825F, 0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8937F, 3.9941F, -2.2425F, 0.3685F, -0.1049F, -0.0336F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(121, 114).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2158F, 3.1992F, 0.5619F, 0.2551F, -0.1049F, -0.0336F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(116, 55).mirror().addBox(-0.0907F, -2.7358F, -0.9104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.1242F, -0.1049F, -0.0336F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(80, 120).mirror().addBox(-0.1052F, -2.6624F, -0.0327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6939F, 2.8773F, 1.0888F, 0.2531F, 0.0349F, 0.0F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(14, 103).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3425F, 1.0745F, 1.9925F, -0.0349F, -0.0349F, 0.0002F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(98, 127).mirror().addBox(0.0F, 0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(127, 97).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8626F, -0.5921F, 2.3642F, -1.3614F, 0.0004F, 0.014F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(78, 126).mirror().addBox(-0.5F, 0.95F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3442F, -1.5322F, 2.4638F, -0.0087F, 0.0175F, 0.0176F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(103, 127).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3218F, -0.6703F, 3.5343F, 0.9948F, 0.0349F, 0.0175F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(126, 68).mirror().addBox(-0.5F, 1.0F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2526F, -1.9114F, 4.8971F, 0.1658F, 0.0349F, 0.0175F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(127, 100).mirror().addBox(-0.5F, -0.625F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(127, 94).mirror().addBox(-0.5F, -0.625F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2906F, 0.6461F, 5.0856F, -0.7854F, 0.0349F, 0.0175F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3062F, 0.1673F, 4.4008F, 0.0436F, 0.0349F, 0.0175F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(116, 50).mirror().addBox(-0.5F, -3.0F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3365F, 2.9953F, 4.9447F, 0.2269F, 0.0349F, 0.0175F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(122, 23).mirror().addBox(-0.5F, 0.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 128).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4185F, 2.7516F, 3.6919F, -2.9452F, 0.0349F, 0.0175F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(128, 3).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4459F, 2.4296F, 2.7455F, -1.898F, 0.0349F, 0.0175F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-0.5F, -1.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(127, 117).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4168F, 0.8303F, 2.7804F, -1.5926F, 0.0349F, 0.0175F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(108, 127).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3821F, 0.0243F, 3.3714F, -0.6327F, 0.0349F, 0.0175F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(128, 34).mirror().addBox(-0.5F, -1.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(126, 49).mirror().addBox(-0.5F, -1.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3844F, 1.0811F, 3.8338F, -0.1091F, 0.0349F, 0.0175F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(129, 9).mirror().addBox(-0.5F, -0.15F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(129, 6).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7605F, 3.2582F, -5.3332F, -2.2495F, -0.1049F, -0.0336F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(125, 128).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6841F, 3.3906F, -6.0164F, -1.3768F, -0.1049F, -0.0336F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(128, 109).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6826F, 2.4519F, -6.3306F, -0.4605F, -0.1049F, -0.0336F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(128, 106).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.7556F, 2.0415F, -5.7683F, 0.6303F, -0.1049F, -0.0336F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(128, 103).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.8316F, 1.7303F, -5.1459F, 2.0353F, -0.1049F, -0.0336F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8316F, 1.7303F, -5.1459F, -2.9301F, -0.1049F, -0.0336F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(53, 114).mirror().addBox(-0.4924F, -0.6887F, -1.224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1777F, 1.5085F, -0.9451F, -3.0174F, -0.1049F, -0.0336F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(128, 74).mirror().addBox(-0.4924F, -1.3347F, -0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1777F, 1.5085F, -0.9451F, -2.2756F, -0.1049F, -0.0336F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(115, 122).mirror().addBox(-0.4924F, -0.7162F, 0.2591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1777F, 1.5085F, -0.9451F, -1.6211F, -0.1049F, -0.0336F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(122, 87).mirror().addBox(-0.4924F, -0.2262F, -0.705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1777F, 1.5085F, -0.9451F, -1.0103F, -0.1049F, -0.0336F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(128, 71).mirror().addBox(-0.4924F, -0.6955F, 0.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1777F, 1.5085F, -0.9451F, 0.6914F, -0.1049F, -0.0336F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(126, 43).mirror().addBox(-0.4924F, 0.0901F, 0.3839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1777F, 1.5085F, -0.9451F, 1.3896F, -0.1049F, -0.0336F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(126, 31).mirror().addBox(-0.5394F, -6.1956F, 1.5922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(126, 16).mirror().addBox(-0.3144F, -6.1956F, 1.5922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.0439F, 1.7273F, 7.3888F, 1.7453F, -0.0524F, 0.0F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.5573F, 0.4357F, 2.1011F, 0.4797F, -0.0516F, 0.0091F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(128, 58).mirror().addBox(-0.5F, -0.375F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5306F, 0.6895F, 1.5389F, 1.4397F, -0.0516F, 0.0091F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(14, 114).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5753F, 1.9986F, 2.1747F, 1.7451F, -0.0516F, 0.0091F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(128, 55).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.517F, 1.9989F, 1.0449F, 2.356F, -0.0516F, 0.0091F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(47, 128).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4993F, 1.2262F, 0.8383F, -2.88F, -0.0516F, 0.0091F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(128, 37).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.492F, 0.4262F, 0.8385F, -1.571F, -0.0516F, 0.0091F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(13, 126).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5191F, 0.2117F, 1.4004F, -0.4802F, -0.0516F, 0.0091F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(65, 116).mirror().addBox(-0.0601F, -2.9203F, 0.3997F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(44, 116).mirror().addBox(-0.0601F, -2.9203F, -0.2003F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8439F, 3.1273F, 3.0888F, 0.0872F, 0.0356F, 0.0159F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3941F, -0.1863F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(52, 130).mirror().addBox(0.2084F, 0.9836F, -4.8492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -0.0436F, -0.0916F, 0.0F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(130, 40).mirror().addBox(0.007F, 1.4709F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(129, 12).mirror().addBox(0.007F, 1.4741F, -1.7096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(120, 122).mirror().addBox(0.007F, 0.4709F, -0.792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -0.2618F, -0.144F, 0.0F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(38, 130).mirror().addBox(-0.7F, -1.6F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(38, 130).addBox(1.7907F, -1.6F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0454F, 1.9798F, -5.183F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(33, 130).mirror().addBox(-0.077F, -0.1231F, -2.6685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -0.0718F, -0.1449F, -0.0307F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(28, 130).mirror().addBox(-0.077F, -0.4589F, -3.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 130).mirror().addBox(-0.077F, -0.4089F, -4.2926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0591F, -0.1449F, -0.0307F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(36, 123).mirror().addBox(0.1301F, -0.337F, -5.0425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0139F, -0.0925F, -0.0305F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(5, 130).mirror().addBox(0.1301F, 0.1855F, -5.8082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 123).mirror().addBox(0.1301F, -0.0145F, -6.6082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -0.0297F, -0.0925F, -0.0305F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(0.1301F, -0.4104F, -7.4475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0226F, -0.0925F, -0.0305F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(84, 100).mirror().addBox(0.2084F, 0.6429F, -7.906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0262F, -0.0916F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(0.0F, 0.9857F, -3.8975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -0.0436F, -0.144F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(109, 114).mirror().addBox(0.0F, 1.2307F, -3.6134F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -0.1309F, -0.144F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(118, 129).mirror().addBox(0.2084F, -0.9433F, 7.1665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(113, 129).mirror().addBox(0.2084F, -0.9433F, 6.8415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -3.0543F, -0.0916F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(78, 129).mirror().addBox(0.2084F, 5.8453F, 0.542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, -1.5708F, -0.0916F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(129, 25).mirror().addBox(0.2084F, 0.542F, -5.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0F, -0.0916F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(114, 108).mirror().addBox(0.2084F, -0.0984F, -5.8994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.1309F, -0.0916F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(114, 104).mirror().addBox(0.0F, -0.1047F, -3.9723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.1309F, -0.144F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(102, 114).mirror().addBox(0.0F, 0.6F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(95, 113).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0785F, -0.144F, 0.0F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(122, 118).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(122, 118).addBox(1.5407F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0204F, -0.9128F, -2.9677F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7278F, -4.2043F, 0.1612F, -0.0875F, 0.0775F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(100, 108).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7278F, -4.2043F, -0.1372F, -0.3027F, 0.0411F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(73, 121).mirror().addBox(-0.5F, -2.0F, -0.7094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(73, 121).addBox(1.5407F, -2.0F, -0.7094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.0204F, 1.5686F, -3.4493F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(68, 121).mirror().addBox(-0.5F, -2.0074F, -0.9409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(68, 121).addBox(1.5407F, -2.0074F, -0.9409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-1.0204F, 1.5451F, -2.5496F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(114, 9).mirror().addBox(0.2F, -0.6371F, -1.9311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false)
				.texOffs(114, 9).addBox(2.2407F, -0.6371F, -1.9311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.0419F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(52, 127).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0156F)).mirror(false)
				.texOffs(52, 127).addBox(1.5407F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0156F)), PartPose.offsetAndRotation(-1.0204F, 1.5278F, -1.5761F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(114, 5).mirror().addBox(0.2F, -0.6655F, -0.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(114, 5).addBox(2.2407F, -0.6655F, -0.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.0419F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(63, 121).mirror().addBox(0.1301F, -1.4214F, -8.252F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.1535F, -0.0925F, -0.0305F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(35, 127).mirror().addBox(-0.218F, 1.3498F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5273F, -0.9808F, -3.9588F, 0.0087F, -0.144F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(58, 121).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(58, 121).addBox(1.5407F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0204F, -0.765F, -1.9787F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(88, 113).mirror().addBox(0.2F, -0.0357F, -2.7729F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(88, 113).addBox(2.2407F, -0.0357F, -2.7729F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.0419F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(113, 19).mirror().addBox(0.2F, -0.5903F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(113, 19).addBox(2.2407F, -0.5903F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.7204F, 0.463F, 0.0419F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(109, 0).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7278F, -4.2043F, 0.1612F, 0.0875F, -0.0775F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(100, 108).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7278F, -4.2043F, -0.1372F, 0.3027F, -0.0411F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(129, 12).addBox(-1.007F, 1.4741F, -1.7096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(130, 40).addBox(-1.007F, 1.4709F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(120, 122).addBox(-1.007F, 0.4709F, -0.792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -0.2618F, 0.144F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(33, 130).addBox(-0.923F, -0.1231F, -2.6685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -0.0718F, 0.1449F, 0.0307F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(28, 130).addBox(-0.923F, -0.4589F, -3.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 130).addBox(-0.923F, -0.4089F, -4.2926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0591F, 0.1449F, 0.0307F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(36, 123).addBox(-1.1301F, -0.337F, -5.0425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0139F, 0.0925F, 0.0305F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(5, 130).addBox(-1.1301F, 0.1855F, -5.8082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 123).addBox(-1.1301F, -0.0145F, -6.6082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -0.0297F, 0.0925F, 0.0305F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(0, 123).addBox(-1.1301F, -0.4104F, -7.4475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0226F, 0.0925F, 0.0305F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(63, 121).addBox(-1.1301F, -1.4214F, -8.252F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.1535F, 0.0925F, 0.0305F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(35, 127).addBox(-0.782F, 1.3498F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0087F, 0.144F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(102, 114).addBox(-1.0F, 0.6F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(95, 113).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0785F, 0.144F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(118, 129).addBox(-1.2084F, -0.9433F, 7.1665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(113, 129).addBox(-1.2084F, -0.9433F, 6.8415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -3.0543F, 0.0916F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(78, 129).addBox(-1.2084F, 5.8453F, 0.542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -1.5708F, 0.0916F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(129, 25).addBox(-1.2084F, 0.542F, -5.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0F, 0.0916F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(114, 108).addBox(-1.2084F, -0.0984F, -5.8994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.1309F, 0.0916F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(84, 100).addBox(-1.2084F, 0.6429F, -7.906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.0262F, 0.0916F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(52, 130).addBox(-1.2084F, 0.9836F, -4.8492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -0.0436F, 0.0916F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(0, 130).addBox(-1.0F, 0.9857F, -3.8975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -0.0436F, 0.144F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(109, 114).addBox(-1.0F, 1.2307F, -3.6134F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, -0.1309F, 0.144F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(114, 104).addBox(-1.0F, -0.1047F, -3.9723F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5273F, -0.9808F, -3.9588F, 0.1309F, 0.144F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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