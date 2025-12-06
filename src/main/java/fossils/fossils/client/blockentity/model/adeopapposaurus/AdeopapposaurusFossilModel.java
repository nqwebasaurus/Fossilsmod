package fossils.fossils.client.blockentity.model.adeopapposaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AdeopapposaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Adeopapposaurus;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public AdeopapposaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Adeopapposaurus = this.fossil.getChild("Adeopapposaurus");
		this.bone = this.Adeopapposaurus.getChild("bone");
		this.bone4 = this.Adeopapposaurus.getChild("bone4");
		this.Body = this.Adeopapposaurus.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Body2 = this.body4.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Adeopapposaurus.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.RLeg = this.Adeopapposaurus.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Adeopapposaurus.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Adeopapposaurus = fossil.addOrReplaceChild("Adeopapposaurus", CubeListBuilder.create().texOffs(17, 42).addBox(-0.5F, -0.7891F, -2.2147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(58, 48).addBox(0.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(58, 48).mirror().addBox(-1.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -24.5358F, 5.379F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Adeopapposaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 65).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 2.7853F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Adeopapposaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 64).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 0.7853F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Adeopapposaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 22).addBox(0.0F, -2.35F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8891F, -0.3147F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone = Adeopapposaurus.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1471F, -2.0999F, 2.4084F, -0.0175F, -0.0027F, 0.0523F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 69).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.2427F, -0.6964F, -0.533F, 0.1222F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 89).addBox(-0.9F, -3.2914F, 1.8948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.4F, 0.6447F, -1.6271F, -0.384F, 0.0F, -0.1745F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 63).addBox(-0.9F, -0.922F, -0.3233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.025F))
				.texOffs(89, 14).addBox(-0.9F, -1.8352F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.4F, 0.6447F, -1.6271F, 0.3054F, 0.0F, -0.1745F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 99).addBox(-0.2072F, 3.7284F, 0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.4554F, 7.6957F, -3.6954F, -0.4303F, -0.0352F, 0.0135F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 81).addBox(-0.2072F, 3.9322F, -0.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(84, 16).addBox(-0.2072F, 2.4322F, -0.5878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4554F, 7.6957F, -3.6954F, -0.0376F, -0.0352F, 0.0135F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 74).addBox(-0.2072F, -0.2256F, -0.2167F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.4554F, 7.6957F, -3.6954F, -0.1772F, -0.0352F, 0.0135F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 35).addBox(-0.5F, -1.5F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8138F, 5.369F, -3.3058F, -0.7441F, 0.0542F, 0.1486F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 81).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1706F, 6.2836F, 2.7452F, 1.1929F, -0.0352F, 0.1531F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 4).addBox(-0.5F, 0.125F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(89, 50).addBox(-0.5F, -0.275F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8498F, 4.6058F, 1.0089F, 0.5209F, -0.0352F, 0.1531F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 43).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.8216F, 4.608F, 0.2094F, 1.5681F, -0.0352F, 0.1531F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 85).addBox(-0.5F, -1.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.8216F, 4.608F, 0.2094F, 0.6082F, -0.0352F, 0.1531F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(79, 16).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.8216F, 4.608F, 0.2094F, 1.1754F, -0.0352F, 0.1531F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(81, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8138F, 5.369F, -3.3058F, -0.247F, -0.0352F, 0.1531F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(52, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.54F, 3.7791F, -4.1041F, 0.4598F, -0.0352F, 0.1531F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 22).addBox(-0.5F, -0.6F, 0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2335F, 1.5798F, -3.1814F, -0.4565F, -0.0352F, 0.1531F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(89, 17).addBox(-0.9F, -1.8547F, -1.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(15, 89).addBox(-0.9F, -1.8547F, -0.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.4F, 0.6447F, -1.6271F, 0.4974F, 0.0F, -0.1745F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 89).addBox(-0.9F, -1.6227F, -0.5341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.4F, 0.6447F, -1.6271F, 0.9599F, 0.0F, -0.1745F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 66).addBox(-0.5F, 0.075F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-0.5728F, 3.17F, 0.4238F, -1.2382F, -0.1034F, 0.1928F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 84).addBox(-0.5F, -1.575F, -1.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.2846F, 1.9023F, -1.1842F, -2.9234F, 0.0F, 0.1571F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -1.3F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.6463F, 4.1862F, -1.3454F, -1.2217F, 0.0F, 0.1571F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 28).addBox(-1.1F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.4789F, 0.9174F, 0.7275F, -0.1296F, -0.0182F, 0.0186F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(10, 89).addBox(-1.1F, -0.7063F, 0.1905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.55F, 0.4685F, -0.6655F, -0.8727F, 0.0F, 0.1571F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(17, 85).addBox(-1.1F, -0.3063F, 0.0405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(75, 41).addBox(-1.1F, 0.0187F, -1.8595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.55F, 0.4685F, -0.6655F, -0.3054F, 0.0F, 0.1571F));

		PartDefinition bone4 = Adeopapposaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1471F, -2.8314F, 2.2429F, -0.0175F, 0.0027F, -0.0523F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(42, 69).mirror().addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.2427F, 0.0351F, -0.3675F, 0.1222F, 0.0F, 0.1745F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.1F, -3.2914F, 1.8948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, -0.384F, 0.0F, 0.1745F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(-0.1F, -0.922F, -0.3233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)).mirror(false)
				.texOffs(89, 14).mirror().addBox(-0.1F, -1.8352F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.3054F, 0.0F, 0.1745F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-0.7928F, 3.7284F, 0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.4554F, 8.4272F, -3.5299F, -0.4303F, 0.0352F, -0.0135F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(-0.7928F, 3.9322F, -0.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(84, 16).mirror().addBox(-0.7928F, 2.4322F, -0.5878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4554F, 8.4272F, -3.5299F, -0.0376F, 0.0352F, -0.0135F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-0.7928F, -0.2256F, -0.2167F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.4554F, 8.4272F, -3.5299F, -0.1772F, 0.0352F, -0.0135F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-0.5F, -1.5F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8138F, 6.1005F, -3.1403F, -0.7441F, -0.0542F, -0.1486F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.1706F, 7.0151F, 2.9108F, 1.1929F, 0.0352F, -0.1531F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-0.5F, 0.125F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(89, 50).mirror().addBox(-0.5F, -0.275F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8498F, 5.3373F, 1.1744F, 0.5209F, 0.0352F, -0.1531F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.8216F, 5.3395F, 0.3749F, 1.5681F, 0.0352F, -0.1531F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 85).mirror().addBox(-0.5F, -1.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.8216F, 5.3395F, 0.3749F, 0.6082F, 0.0352F, -0.1531F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(-0.5F, -0.9F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.8216F, 5.3395F, 0.3749F, 1.1754F, 0.0352F, -0.1531F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 24).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8138F, 6.1005F, -3.1403F, -0.247F, 0.0352F, -0.1531F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.54F, 4.5106F, -3.9386F, 0.4598F, 0.0352F, -0.1531F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-0.5F, -0.6F, 0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2335F, 2.3113F, -3.0159F, -0.4565F, 0.0352F, -0.1531F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(89, 17).mirror().addBox(-0.1F, -1.8547F, -1.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(15, 89).mirror().addBox(-0.1F, -1.8547F, -0.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.4974F, 0.0F, 0.1745F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-0.1F, -1.6227F, -0.5341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.9599F, 0.0F, 0.1745F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.5F, 0.075F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(0.5728F, 3.9015F, 0.5894F, -1.2382F, 0.1034F, -0.1928F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.5F, -1.575F, -1.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.2846F, 2.6338F, -1.0187F, -2.9234F, 0.0F, -0.1571F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, -1.3F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.6463F, 4.9177F, -1.1799F, -1.2217F, 0.0F, -0.1571F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(0.1F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.4789F, 1.6489F, 0.8931F, -0.1296F, 0.0182F, -0.0186F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(0.1F, -0.7063F, 0.1905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.5F, -0.8727F, 0.0F, -0.1571F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(17, 85).mirror().addBox(0.1F, -0.3063F, 0.0405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(75, 41).mirror().addBox(0.1F, 0.0187F, -1.8595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.5F, -0.3054F, 0.0F, -0.1571F));

		PartDefinition Body = Adeopapposaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(5, 91).addBox(0.0F, -2.594F, 0.0168F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6845F, -1.1374F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 90).addBox(0.0F, -2.494F, 0.0168F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0619F, -3.1041F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(30, 89).addBox(0.0F, -2.2231F, 0.0214F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4794F, -5.0749F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(28, 56).addBox(-0.5F, -0.9495F, -0.2087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(89, 102).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1018F, -0.0605F, -1.2872F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1173F, -0.016F, -0.8879F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 102).mirror().addBox(-2.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.0334F, 0.0793F, -1.6113F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(74, 102).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0019F, 0.086F, -1.191F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(102, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0354F, 0.0784F, -0.7883F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(69, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.1022F, 0.0819F, -0.6853F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(102, 67).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0621F, 0.1153F, -1.0873F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0096F, 0.1305F, -1.5092F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(89, 102).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1018F, 0.0605F, 1.2872F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(84, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1173F, 0.016F, 0.8879F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(79, 102).addBox(1.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.0334F, -0.0793F, 1.6113F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(74, 102).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0019F, -0.086F, 1.191F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(102, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0354F, -0.0784F, 0.7883F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.1022F, -0.0819F, 0.6853F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(102, 67).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0621F, -0.1153F, 1.0873F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(27, 87).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0096F, -0.1305F, 1.5092F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -4.3809F, -4.0139F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 10.5978F, -2.127F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(54, 76).addBox(0.0F, -2.0826F, -0.1004F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3019F, -1.9804F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(9, 70).addBox(0.0F, -2.0607F, -0.0827F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1019F, -3.9804F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.1882F, 0.1426F, -0.641F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 102).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.1177F, 0.2046F, -1.0438F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(79, 14).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.023F, 0.2345F, -1.4721F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(71, 52).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.033F, 0.3212F, -1.417F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 102).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.1641F, 0.2793F, -0.9803F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.26F, 0.1936F, -0.5766F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(64, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.1882F, -0.1426F, 0.641F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -3.483F, -6.0895F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 11.7268F, 2.9131F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(59, 102).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.1177F, -0.2046F, 1.0438F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(79, 14).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.023F, -0.2345F, 1.4721F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 52).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.033F, -0.3212F, 1.417F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(54, 102).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.1641F, -0.2793F, 0.9803F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(49, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.26F, -0.1936F, 0.5766F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(54, 56).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(32, 49).addBox(-1.0F, 9.846F, -3.0584F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r87 = body4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 101).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1885F, -3.0555F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(31, 101).addBox(0.0F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3281F, -1.0603F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(58, 54).mirror().addBox(-7.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5375F, 0.0321F, 0.3037F, -1.3649F));

		PartDefinition cube_r90 = body4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5375F, 0.1556F, 0.2638F, -0.9303F));

		PartDefinition cube_r91 = body4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(16, 101).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5375F, 0.2461F, 0.1826F, -0.5269F));

		PartDefinition cube_r92 = body4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(11, 101).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -2.5375F, 0.2615F, 0.1913F, -0.524F));

		PartDefinition cube_r93 = body4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(23, 79).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -2.5375F, 0.1665F, 0.2778F, -0.9274F));

		PartDefinition cube_r94 = body4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-8.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -2.5375F, 0.0359F, 0.3208F, -1.3638F));

		PartDefinition cube_r95 = body4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(58, 54).addBox(1.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5375F, 0.0321F, -0.3037F, 1.3649F));

		PartDefinition cube_r96 = body4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(101, 24).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5375F, 0.1556F, -0.2638F, 0.9303F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(16, 101).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5375F, 0.2461F, -0.1826F, 0.5269F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(11, 101).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -2.5375F, 0.2615F, -0.1913F, 0.524F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(23, 79).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -2.5375F, 0.1665F, -0.2778F, 0.9274F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(48, 8).addBox(1.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -2.5375F, 0.0359F, -0.3208F, 1.3638F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(37, 63).addBox(-0.5F, -0.9F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body4.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4905F, -4.0274F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r102 = Body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(37, 102).addBox(0.0F, -1.7566F, -0.0708F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4033F, -0.8968F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(102, 35).addBox(0.0F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1147F, -2.9347F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(34, 102).addBox(0.0F, -1.6F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1826F, -4.8113F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 33).mirror().addBox(-0.423F, 0.1907F, -0.1588F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5947F, 10.1157F, -3.0656F, 0.1038F, -0.4982F, 0.3849F));

		PartDefinition cube_r106 = Body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(0.0959F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-1.5959F, 10.6013F, -5.1552F, -0.229F, 0.3065F, -0.0702F));

		PartDefinition cube_r107 = Body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(102, 33).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.3483F, 0.2532F, -0.5394F));

		PartDefinition cube_r108 = Body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(102, 31).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.2229F, 0.3679F, -0.944F));

		PartDefinition cube_r109 = Body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(61, 5).mirror().addBox(-7.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.0463F, 0.4252F, -1.3945F));

		PartDefinition cube_r110 = Body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(-0.423F, 0.1907F, -0.7588F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5947F, 10.1157F, -3.0656F, 0.3244F, -0.7921F, 0.2816F));

		PartDefinition cube_r111 = Body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0369F, 10.1526F, -3.4884F, 0.3729F, -0.9564F, 0.5942F));

		PartDefinition cube_r112 = Body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.2565F, 0.1991F, -0.4726F));

		PartDefinition cube_r113 = Body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(101, 101).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.1586F, 0.283F, -0.8772F));

		PartDefinition cube_r114 = Body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(-8.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.0264F, 0.3223F, -1.3144F));

		PartDefinition cube_r115 = Body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5101F, 0.2615F, 0.1913F, -0.524F));

		PartDefinition cube_r116 = Body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 27).mirror().addBox(-9.5955F, -1.1381F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5101F, 0.0359F, 0.3208F, -1.3638F));

		PartDefinition cube_r117 = Body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(101, 26).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5101F, 0.1665F, 0.2778F, -0.9274F));

		PartDefinition cube_r118 = Body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(102, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.3483F, -0.2532F, 0.5394F));

		PartDefinition cube_r119 = Body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(102, 31).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.2229F, -0.3679F, 0.944F));

		PartDefinition cube_r120 = Body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(61, 5).addBox(1.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.0463F, -0.4252F, 1.3945F));

		PartDefinition cube_r121 = Body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(36, 33).addBox(-0.577F, 0.1907F, -0.1588F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5947F, 10.1157F, -3.0656F, 0.1038F, 0.4982F, -0.3849F));

		PartDefinition cube_r122 = Body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(46, 20).addBox(-0.577F, 0.1907F, -0.7588F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5947F, 10.1157F, -3.0656F, 0.3244F, 0.7921F, -0.2816F));

		PartDefinition cube_r123 = Body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0369F, 10.1526F, -3.4884F, 0.3729F, 0.9564F, -0.5942F));

		PartDefinition cube_r124 = Body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(69, 69).addBox(-1.0959F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.5959F, 10.6013F, -5.1552F, -0.229F, -0.3065F, 0.0702F));

		PartDefinition cube_r125 = Body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5959F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.0959F, 10.6013F, -5.1552F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(65, 7).addBox(-1.5959F, -1.0F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0959F, 10.0013F, -6.1944F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.2565F, -0.1991F, 0.4726F));

		PartDefinition cube_r128 = Body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(101, 101).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.1586F, -0.283F, 0.8772F));

		PartDefinition cube_r129 = Body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(48, 10).addBox(1.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.0264F, -0.3223F, 1.3144F));

		PartDefinition cube_r130 = Body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(101, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5101F, 0.2615F, -0.1913F, 0.524F));

		PartDefinition cube_r131 = Body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(46, 27).addBox(1.5955F, -1.1381F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5101F, 0.0359F, -0.3208F, 1.3638F));

		PartDefinition cube_r132 = Body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(101, 26).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5101F, 0.1665F, -0.2778F, 0.9274F));

		PartDefinition cube_r133 = Body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(45, 49).addBox(-0.5F, -1.1F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 6.8675F, -5.3488F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 41).addBox(-0.5F, -0.3754F, -2.802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.3965F, 3.9746F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(80, 35).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -4.6313F, 5.1464F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r136 = bone2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(87, 31).addBox(-0.5F, -0.75F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.5F, -5.4309F, 4.7203F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(71, 99).addBox(-0.5F, -1.6143F, 0.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -4.3965F, 3.9746F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(26, 63).addBox(-0.1887F, 0.1357F, -1.6606F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-1.7286F, 0.2605F, -0.4452F, 1.4918F, 0.1394F, 0.493F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(28, 76).addBox(-0.1887F, -1.9267F, 0.0934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.7286F, 0.2605F, -0.4452F, -2.5224F, 0.1394F, 0.493F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 56).addBox(-0.1887F, -0.4013F, -1.5908F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0243F)), PartPose.offsetAndRotation(-1.7286F, 0.2605F, -0.4452F, -1.737F, 0.1394F, 0.493F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(76, 54).addBox(-0.1887F, -2.1438F, -0.6718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0257F)), PartPose.offsetAndRotation(-1.7286F, 0.2605F, -0.4452F, 0.3312F, 0.1394F, 0.493F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(36, 41).addBox(-0.5F, -0.8424F, -5.2481F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.5F, -4.3965F, 3.9746F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 47).addBox(-0.5F, -1.1434F, -1.7139F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, -4.3965F, 3.9746F, 0.925F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 6.8675F, -5.3488F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r144 = bone3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-0.5F, -0.3754F, -2.802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.3965F, 3.9746F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(80, 35).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.6313F, 5.1464F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r146 = bone3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-0.5F, -0.75F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.5F, -5.4309F, 4.7203F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r147 = bone3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(71, 99).mirror().addBox(-0.5F, -1.6143F, 0.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.3965F, 3.9746F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r148 = bone3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 63).mirror().addBox(-0.8113F, 0.1357F, -1.6606F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(1.7286F, 0.2605F, -0.4452F, 1.4918F, -0.1394F, -0.493F));

		PartDefinition cube_r149 = bone3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-0.8113F, -1.9267F, 0.0934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.7286F, 0.2605F, -0.4452F, -2.5224F, -0.1394F, -0.493F));

		PartDefinition cube_r150 = bone3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-0.8113F, -0.4013F, -1.5908F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0243F)).mirror(false), PartPose.offsetAndRotation(1.7286F, 0.2605F, -0.4452F, -1.737F, -0.1394F, -0.493F));

		PartDefinition cube_r151 = bone3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-0.8113F, -2.1438F, -0.6718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0257F)).mirror(false), PartPose.offsetAndRotation(1.7286F, 0.2605F, -0.4452F, 0.3312F, -0.1394F, -0.493F));

		PartDefinition cube_r152 = bone3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 41).mirror().addBox(-0.5F, -0.8424F, -5.2481F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.3965F, 3.9746F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r153 = bone3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.5F, -1.1434F, -1.7139F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.3965F, 3.9746F, 0.925F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5099F, -4.6814F, 0.3058F, 0.0403F, 0.0167F));

		PartDefinition cube_r154 = Neck.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(79, 22).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1321F, -3.4354F, 0.0604F, 0.3024F, -1.5618F));

		PartDefinition cube_r155 = Neck.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1321F, -3.4354F, 0.1804F, 0.2513F, -1.1293F));

		PartDefinition cube_r156 = Neck.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(102, 93).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1321F, -3.4354F, 0.2635F, 0.1617F, -0.7293F));

		PartDefinition cube_r157 = Neck.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(66, 29).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.0588F, 0.1279F, -1.4225F));

		PartDefinition cube_r158 = Neck.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(102, 46).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.1058F, 0.0929F, -1.0025F));

		PartDefinition cube_r159 = Neck.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(44, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.1336F, 0.0443F, -0.603F));

		PartDefinition cube_r160 = Neck.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(102, 93).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1321F, -3.4354F, 0.2635F, -0.1617F, 0.7293F));

		PartDefinition cube_r161 = Neck.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(103, 0).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1321F, -3.4354F, 0.1804F, -0.2513F, 1.1293F));

		PartDefinition cube_r162 = Neck.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 22).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1321F, -3.4354F, 0.0604F, -0.3024F, 1.5618F));

		PartDefinition cube_r163 = Neck.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(66, 29).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.0588F, -0.1279F, 1.4225F));

		PartDefinition cube_r164 = Neck.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(102, 46).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.1058F, -0.0929F, 1.0025F));

		PartDefinition cube_r165 = Neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.1336F, -0.0443F, 0.603F));

		PartDefinition cube_r166 = Neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(103, 56).addBox(0.0F, -2.2477F, -1.0402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 39).addBox(0.0F, -2.3477F, 0.9598F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 50).addBox(-0.5F, -0.9727F, -2.0402F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6272F, -4.6387F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(103, 95).addBox(0.0F, -1.0843F, -0.1001F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2537F, -0.7881F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(103, 80).addBox(0.0F, -0.55F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 41).addBox(-0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9471F, -6.6802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-2.8054F, -0.126F, -0.3696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0179F, -2.5495F, 0.1956F, 0.7472F, -1.1803F));

		PartDefinition cube_r170 = Neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-3.0902F, 0.0115F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.248F, -0.6768F, 0.2879F, 0.5961F, -1.1289F));

		PartDefinition cube_r171 = Neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(79, 10).addBox(0.0902F, 0.0115F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.248F, -0.6768F, 0.2879F, -0.5961F, 1.1289F));

		PartDefinition cube_r172 = Neck2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(79, 12).addBox(-0.1946F, -0.126F, -0.3696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0179F, -2.5495F, 0.1956F, -0.7472F, 1.1803F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.883F, -4.8502F, -0.2862F, 0.1088F, 0.053F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(104, 43).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 28).addBox(0.0F, -0.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(0.2675F, -0.4583F, -1.2706F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 70).mirror().addBox(-3.0439F, 0.1082F, -0.3687F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6541F, -0.0317F, -0.888F, 0.2703F, 1.0779F, -1.1423F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(79, 29).addBox(-3.2675F, -0.4583F, -1.2706F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 70).addBox(0.0439F, 0.1082F, -0.3687F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6541F, -0.0317F, -0.888F, 0.2703F, -1.0779F, 1.1423F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(13, 57).addBox(-0.5F, -0.5227F, -4.8813F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(103, 77).addBox(0.0F, -0.8477F, -2.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2698F, -4.902F, -0.4163F, 0.1332F, 0.0838F));

		PartDefinition cube_r176 = Neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-3.1213F, 0.0229F, -0.5197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1408F, -2.7407F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r177 = Neck3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(78, 72).addBox(0.1213F, 0.0229F, -0.5197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1408F, -2.7407F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(53, 29).addBox(-0.5F, -0.5227F, -4.8813F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(44, 104).addBox(0.0F, -0.8227F, -0.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 104).addBox(0.0F, -0.7227F, -3.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0276F, -4.7779F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Neck5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(1.762F, -0.6294F, -1.4999F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 44).mirror().addBox(-1.3134F, -0.1164F, -0.6521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1684F, 0.0372F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r179 = Neck5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(84, 20).addBox(-3.762F, -0.6294F, -1.4999F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 44).addBox(-0.6866F, -0.1164F, -0.6521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1684F, 0.0372F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(41, 56).addBox(-0.5F, -0.5227F, -4.8813F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(104, 48).addBox(0.0F, -0.7227F, -2.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0242F, -4.903F, 0.3429F, 0.2004F, 0.0845F));

		PartDefinition cube_r180 = Neck6.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(0.6398F, -0.4441F, -1.1531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1684F, 0.0372F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r181 = Neck6.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(5, 85).addBox(-2.6397F, -0.4441F, -1.1531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1684F, 0.0372F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5F, -0.5227F, -5.8813F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(50, 104).addBox(0.0F, -0.7227F, -1.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0149F, -4.9265F, 0.4021F, 0.1117F, 0.2004F));

		PartDefinition cube_r182 = Neck7.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(69, 86).addBox(0.0F, -0.8F, -2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Neck7.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(1.9644F, -0.6706F, -1.4049F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 84).mirror().addBox(-0.2573F, -0.2924F, -0.9457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1684F, 0.0372F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r184 = Neck7.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(80, 84).addBox(-1.7427F, -0.2924F, -0.9457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 63).addBox(-3.9644F, -0.6706F, -1.4049F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1684F, 0.0372F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0406F, -4.5147F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(90, 84).addBox(-1.5F, -0.0448F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7064F, -3.5167F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(84, 90).addBox(-1.5F, -0.0547F, -0.0433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -1.7033F, -3.4783F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(92, 34).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(33, 92).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.0187F, -5.8907F, -0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(92, 31).addBox(-0.5F, -0.3157F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.2819F, -5.6145F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(79, 90).addBox(-0.5F, -0.2112F, -0.8054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.6868F, -4.4845F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(21, 92).addBox(-0.5F, -0.2122F, -0.7982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.5118F, -5.0595F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, 0.95F, 0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -2.1267F, -2.862F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(82, 50).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.5F, -1.7963F, -0.6651F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(12, 82).addBox(-1.5F, 0.975F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.6899F, -0.5455F, -1.6232F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.2278F, -5.1282F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(92, 46).addBox(-1.0055F, -0.9415F, -0.4366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0156F)), PartPose.offsetAndRotation(0.4052F, 0.0217F, 2.6916F, 0.0875F, 0.1151F, 0.0059F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(93, 10).addBox(-0.8704F, -1.6156F, -1.3601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.2052F, 0.0217F, 1.2916F, 0.35F, 0.2373F, 0.006F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(95, 3).addBox(-0.8F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.2395F, -0.8183F, -0.6939F, 0.3674F, 0.2373F, 0.006F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(94, 74).addBox(-0.7704F, -0.5089F, -2.3827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(93, 0).addBox(-0.8704F, -0.609F, -1.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(92, 90).addBox(-0.8704F, -0.609F, -1.8827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.2052F, 0.0217F, 1.2916F, -0.2609F, 0.2373F, 0.006F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(93, 53).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4573F, -1.5636F, 2.6041F, 0.0343F, 0.2096F, -0.0015F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(93, 56).addBox(-0.8018F, 0.0279F, -1.0416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0616F, -1.5578F, 1.7019F, 0.0643F, 0.1914F, -0.0304F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(93, 59).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.074F, -1.2967F, 0.0851F, 0.3897F, 0.2321F, 0.0187F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(88, 53).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0616F, -1.4629F, 0.6455F, 0.285F, 0.2321F, 0.0187F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(98, 9).addBox(-0.5F, -0.5F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(8, 98).addBox(-0.5F, -0.5F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.1813F, -0.5088F, 1.8846F, -0.4885F, 0.1151F, 0.0059F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(98, 0).addBox(-0.5F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(97, 93).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.1674F, -0.7881F, 1.7499F, -0.8114F, 0.1151F, 0.0059F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(94, 19).addBox(-0.499F, -0.4144F, -0.3696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(94, 16).addBox(-0.499F, -0.4144F, -0.4696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F))
				.texOffs(94, 13).addBox(-0.499F, -0.4144F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, 0.0621F, 0.2504F, 0.006F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(57, 88).addBox(-0.499F, -0.2858F, -0.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, -0.3742F, 0.2504F, 0.006F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(92, 93).addBox(-0.499F, -0.559F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(78, 93).addBox(-0.499F, -0.0193F, -0.4119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, -1.5523F, 0.2504F, 0.006F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(83, 93).addBox(-0.499F, -0.7586F, -0.5881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F))
				.texOffs(93, 81).addBox(-0.499F, -0.7586F, -0.888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, -2.4425F, 0.2504F, 0.006F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(88, 56).addBox(-0.499F, -0.2647F, -0.7409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, 2.8633F, 0.2504F, 0.006F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(93, 78).addBox(-0.499F, -0.427F, -0.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, 1.6591F, 0.2504F, 0.006F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(13, 98).addBox(-0.499F, -0.686F, -0.6573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, 0.2977F, 0.2504F, 0.006F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(62, 88).addBox(-0.499F, -0.1761F, -0.7709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0334F, -1.0326F, 0.6585F, -0.924F, 0.2504F, 0.006F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(88, 59).addBox(-0.5F, -0.525F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.1674F, -0.7881F, 1.7499F, -1.5532F, 0.1151F, 0.0059F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(65, 93).addBox(-0.5F, -0.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1174F, -0.7881F, 1.7499F, -0.8114F, 0.1151F, 0.0059F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(38, 93).addBox(-1.0055F, -1.4663F, -1.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0157F)), PartPose.offsetAndRotation(0.4052F, 0.0217F, 2.6916F, 0.0613F, 0.1151F, 0.0059F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(93, 28).addBox(-1.025F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0467F, -1.238F, 0.3715F, 0.1312F, 0.2156F, 0.0031F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(94, 49).addBox(-0.5F, -0.575F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(94, 43).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3841F, 0.06F, -0.0814F, -0.2609F, 0.2373F, 0.006F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(26, 94).addBox(-0.9701F, -0.3073F, -1.6219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4802F, 0.0217F, 1.4916F, -0.0863F, 0.2373F, 0.006F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(18, 98).addBox(-0.6442F, -0.4801F, 0.2681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.137F, 0.1916F, 1.4633F, 0.1225F, 0.1325F, 0.0059F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(94, 71).addBox(-0.6442F, -0.5242F, -0.3291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.137F, 0.1916F, 1.4633F, 0.0003F, 0.1325F, 0.0059F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(94, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1037F, 0.1651F, 1.0806F, -0.0427F, 0.2373F, 0.006F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(92, 68).addBox(-0.9701F, -0.9074F, -1.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.2052F, 0.0217F, 1.2916F, -0.0863F, 0.2373F, 0.006F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(67, 90).addBox(-1.0055F, -0.8834F, -1.4503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.4052F, 0.0217F, 2.6916F, -0.0173F, 0.1151F, 0.0059F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(76, 99).addBox(-0.85F, -0.9275F, -0.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4823F, -1.0618F, 3.0189F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(88, 78).addBox(-0.85F, -0.6224F, -0.9126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4823F, -1.0618F, 3.0189F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(91, 99).addBox(-0.375F, -0.55F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 99).addBox(-0.55F, -0.55F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2073F, -0.8516F, 3.1173F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(99, 74).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1323F, -0.3532F, 3.6019F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(99, 71).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0573F, -1.2862F, 5.082F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(99, 71).addBox(-0.575F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1323F, -1.0523F, 4.5272F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(99, 71).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1323F, -1.3431F, 3.6105F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(23, 100).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1323F, -1.4405F, 2.9173F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(74, 88).addBox(-0.85F, -0.4584F, -0.1294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4823F, -1.0618F, 3.0189F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(97, 90).addBox(-0.35F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(0.1073F, 0.2762F, 4.5409F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(81, 99).addBox(-0.35F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1073F, -0.6594F, 5.4128F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(97, 68).addBox(-0.35F, -0.275F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 96).addBox(-0.35F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.1073F, 0.2762F, 4.5409F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(90, 65).addBox(0.25F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6427F, 0.3508F, 3.5312F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(90, 62).addBox(0.25F, -0.875F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6427F, 0.1194F, 2.9501F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 97).addBox(-0.75F, -0.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(0.6323F, -0.4899F, 4.5739F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(97, 34).addBox(-0.75F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(97, 31).addBox(-0.75F, -0.6F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(93, 96).addBox(-0.75F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6323F, -0.7526F, 4.614F, -3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(97, 46).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(0.3823F, 0.186F, 3.4116F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(97, 40).addBox(-0.5F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(97, 37).addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(0.3823F, 0.0106F, 3.605F, -2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(63, 79).addBox(-1.35F, -0.1646F, -0.2765F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.0427F, -1.0927F, 5.056F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(83, 4).addBox(-1.35F, -0.1646F, -0.1515F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0427F, -1.2677F, 5.059F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(83, 7).addBox(-1.35F, -0.1646F, -0.1765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0427F, -1.5636F, 4.4524F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(44, 92).addBox(-0.75F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5323F, -0.2519F, 4.3912F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(39, 90).addBox(-0.75F, -0.875F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5323F, -0.2003F, 3.7328F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(92, 40).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.2823F, -0.18F, 3.6901F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(92, 37).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2823F, 0.3426F, 3.9066F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(90, 7).addBox(-0.75F, -0.35F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.5323F, 0.0276F, 4.2432F, -1.5272F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.2278F, -5.1282F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(0.0055F, -0.9415F, -0.4366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0156F)).mirror(false), PartPose.offsetAndRotation(-0.4052F, 0.0217F, 2.6916F, 0.0875F, -0.1151F, -0.0059F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(93, 10).mirror().addBox(-0.1296F, -1.6156F, -1.3601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.2052F, 0.0217F, 1.2916F, 0.35F, -0.2373F, -0.006F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-0.2F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.2395F, -0.8183F, -0.6939F, 0.3674F, -0.2373F, -0.006F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(94, 74).mirror().addBox(-0.2296F, -0.5089F, -2.3827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(93, 0).mirror().addBox(-0.1296F, -0.609F, -1.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(92, 90).mirror().addBox(-0.1296F, -0.609F, -1.8827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.2052F, 0.0217F, 1.2916F, -0.2609F, -0.2373F, -0.006F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4573F, -1.5636F, 2.6041F, 0.0343F, -0.2096F, 0.0015F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-0.1982F, 0.0279F, -1.0416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0616F, -1.5578F, 1.7019F, 0.0643F, -0.1914F, 0.0304F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.074F, -1.2967F, 0.0851F, 0.3897F, -0.2321F, -0.0187F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0616F, -1.4629F, 0.6455F, 0.285F, -0.2321F, -0.0187F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-0.5F, -0.5F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(8, 98).mirror().addBox(-0.5F, -0.5F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.1813F, -0.5088F, 1.8846F, -0.4885F, -0.1151F, -0.0059F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-0.5F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(97, 93).mirror().addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-0.1674F, -0.7881F, 1.7499F, -0.8114F, -0.1151F, -0.0059F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(94, 19).mirror().addBox(-0.501F, -0.4144F, -0.3696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(94, 16).mirror().addBox(-0.501F, -0.4144F, -0.4696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false)
				.texOffs(94, 13).mirror().addBox(-0.501F, -0.4144F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, 0.0621F, -0.2504F, -0.006F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(-0.501F, -0.2858F, -0.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, -0.3742F, -0.2504F, -0.006F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-0.501F, -0.559F, -0.2935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(78, 93).mirror().addBox(-0.501F, -0.0193F, -0.4119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, -1.5523F, -0.2504F, -0.006F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(-0.501F, -0.7586F, -0.5881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false)
				.texOffs(93, 81).mirror().addBox(-0.501F, -0.7586F, -0.888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, -2.4425F, -0.2504F, -0.006F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-0.501F, -0.2647F, -0.7409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, 2.8633F, -0.2504F, -0.006F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(93, 78).mirror().addBox(-0.501F, -0.427F, -0.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, 1.6591F, -0.2504F, -0.006F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(13, 98).mirror().addBox(-0.501F, -0.686F, -0.6573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, 0.2977F, -0.2504F, -0.006F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(62, 88).mirror().addBox(-0.501F, -0.1761F, -0.7709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0334F, -1.0326F, 0.6585F, -0.924F, -0.2504F, -0.006F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(88, 59).mirror().addBox(-0.5F, -0.525F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.1674F, -0.7881F, 1.7499F, -1.5532F, -0.1151F, -0.0059F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.5F, -0.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1174F, -0.7881F, 1.7499F, -0.8114F, -0.1151F, -0.0059F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(38, 93).mirror().addBox(0.0055F, -1.4663F, -1.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0157F)).mirror(false), PartPose.offsetAndRotation(-0.4052F, 0.0217F, 2.6916F, 0.0613F, -0.1151F, -0.0059F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(93, 28).mirror().addBox(0.025F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.0467F, -1.238F, 0.3715F, 0.1312F, -0.2156F, -0.0031F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 49).mirror().addBox(-0.5F, -0.575F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 43).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3841F, 0.06F, -0.0814F, -0.2609F, -0.2373F, -0.006F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(26, 94).mirror().addBox(-0.0299F, -0.3073F, -1.6219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.0217F, 1.4916F, -0.0863F, -0.2373F, -0.006F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(18, 98).mirror().addBox(-0.3558F, -0.4801F, 0.2681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.137F, 0.1916F, 1.4633F, 0.1225F, -0.1325F, -0.0059F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-0.3558F, -0.5242F, -0.3291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.137F, 0.1916F, 1.4633F, 0.0003F, -0.1325F, -0.0059F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(94, 22).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1037F, 0.1651F, 1.0806F, -0.0427F, -0.2373F, -0.006F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(-0.0299F, -0.9074F, -1.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.2052F, 0.0217F, 1.2916F, -0.0863F, -0.2373F, -0.006F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(67, 90).mirror().addBox(0.0055F, -0.8834F, -1.4503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.4052F, 0.0217F, 2.6916F, -0.0173F, -0.1151F, -0.0059F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-0.15F, -0.9275F, -0.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4823F, -1.0618F, 3.0189F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(88, 78).mirror().addBox(-0.15F, -0.6224F, -0.9126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4823F, -1.0618F, 3.0189F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(91, 99).mirror().addBox(-0.625F, -0.55F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 99).mirror().addBox(-0.45F, -0.55F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2073F, -0.8516F, 3.1173F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(99, 74).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1323F, -0.3532F, 3.6019F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(99, 71).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.0573F, -1.2862F, 5.082F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(99, 71).mirror().addBox(-0.425F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.1323F, -1.0523F, 4.5272F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(99, 71).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.1323F, -1.3431F, 3.6105F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(23, 100).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1323F, -1.4405F, 2.9173F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 88).mirror().addBox(-0.15F, -0.4584F, -0.1294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4823F, -1.0618F, 3.0189F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(97, 90).mirror().addBox(-0.65F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(-0.1073F, 0.2762F, 4.5409F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(81, 99).mirror().addBox(-0.65F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1073F, -0.6594F, 5.4128F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-0.65F, -0.275F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 96).mirror().addBox(-0.65F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.1073F, 0.2762F, 4.5409F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(90, 65).mirror().addBox(-1.25F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.6427F, 0.3508F, 3.5312F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-1.25F, -0.875F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6427F, 0.1194F, 2.9501F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(26, 97).mirror().addBox(-0.25F, -0.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(-0.6323F, -0.4899F, 4.5739F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(97, 34).mirror().addBox(-0.25F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(97, 31).mirror().addBox(-0.25F, -0.6F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(93, 96).mirror().addBox(-0.25F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6323F, -0.7526F, 4.614F, -3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(-0.3823F, 0.186F, 3.4116F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(97, 40).mirror().addBox(-0.5F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(97, 37).mirror().addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(-0.3823F, 0.0106F, 3.605F, -2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(-0.65F, -0.1646F, -0.2765F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -1.0927F, 5.056F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-0.65F, -0.1646F, -0.1515F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -1.2677F, 5.059F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(-0.65F, -0.1646F, -0.1765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -1.5636F, 4.4524F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(44, 92).mirror().addBox(-0.25F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5323F, -0.2519F, 4.3912F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(39, 90).mirror().addBox(-0.25F, -0.875F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5323F, -0.2003F, 3.7328F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.2823F, -0.18F, 3.6901F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2823F, 0.3426F, 3.9066F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(-0.25F, -0.35F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.5323F, 0.0276F, 4.2432F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(98, 28).addBox(0.175F, -0.3883F, -0.444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(98, 28).mirror().addBox(-1.375F, -0.3883F, -0.444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.5482F, -0.3966F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(61, 99).mirror().addBox(-0.55F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(61, 99).addBox(1.15F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9F, -0.2976F, -1.8665F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(56, 99).mirror().addBox(-0.525F, -0.05F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(56, 99).addBox(1.075F, -0.05F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.875F, 0.079F, -2.2357F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-0.3F, -0.9882F, -0.2336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(99, 49).mirror().addBox(-0.3F, -1.1882F, 0.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(36, 99).mirror().addBox(-0.3F, -1.1882F, -0.2336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.7715F, -1.9712F, 2.9147F, -0.1571F, 0.0F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(43, 95).mirror().addBox(-0.2934F, -0.5335F, -2.2822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 0.0785F, -0.2269F, 0.0F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(100, 6).mirror().addBox(-0.2934F, -2.0919F, -1.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 3).mirror().addBox(-0.2934F, -2.2669F, -1.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 0.9948F, -0.2269F, 0.0F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(31, 95).mirror().addBox(-0.2934F, -2.7297F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(21, 95).mirror().addBox(-0.2934F, -2.4797F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 1.6493F, -0.2269F, 0.0F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(16, 95).mirror().addBox(-0.2934F, -0.5515F, 1.1333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(95, 87).mirror().addBox(-0.2434F, -0.2984F, 1.1623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 3.0456F, -0.2269F, 0.0F));

		PartDefinition cube_r311 = Jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(48, 96).mirror().addBox(-0.2934F, -0.677F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 31).mirror().addBox(-0.2934F, -0.677F, -0.2592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 2.9583F, -0.2269F, 0.0F));

		PartDefinition cube_r312 = Jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(3, 96).mirror().addBox(-0.2434F, -0.2F, 1.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(11, 95).mirror().addBox(-0.2934F, -0.6809F, 0.9863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 3.0892F, -0.2269F, 0.0F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 84).mirror().addBox(-0.2434F, -0.3857F, 0.5706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 2.9932F, -0.2269F, 0.0F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-0.2434F, -0.4795F, -0.0235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 2.906F, -0.2269F, 0.0F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(58, 96).mirror().addBox(-0.25F, -0.8207F, -0.1134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 62).mirror().addBox(-0.25F, -0.8207F, 0.4866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.7715F, -1.9712F, 2.906F, -0.1571F, 0.0F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(51, 99).mirror().addBox(-0.3F, -0.8973F, 0.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.7715F, -1.9712F, 3.0456F, -0.1571F, 0.0F));

		PartDefinition cube_r317 = Jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-0.2934F, -0.749F, 0.5896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 3.0369F, -0.2269F, 0.0F));

		PartDefinition cube_r318 = Jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(96, 25).mirror().addBox(-0.2934F, -0.8541F, 0.1532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 96).mirror().addBox(-0.2934F, -0.8541F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(36, 96).mirror().addBox(-0.2934F, -0.8541F, -0.2468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8708F, -0.7038F, -3.154F, 2.9147F, -0.2269F, 0.0F));

		PartDefinition cube_r319 = Jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(99, 21).addBox(1.05F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.875F, 0.1485F, -1.8417F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r320 = Jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(99, 18).mirror().addBox(-0.5F, -0.475F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 99).addBox(1.05F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(99, 18).addBox(1.05F, -0.475F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.875F, -0.2075F, -1.4021F, 3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r321 = Jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(99, 15).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(99, 15).addBox(1.05F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.875F, -0.145F, -1.007F, 2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r322 = Jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(98, 58).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(98, 58).addBox(1.05F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.875F, 0.3498F, -0.7328F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(98, 52).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(98, 52).addBox(1.05F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-0.875F, 0.4227F, -0.3395F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(41, 98).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(41, 98).addBox(1.05F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.875F, 0.3225F, 0.0478F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(31, 98).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(31, 98).addBox(1.05F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.875F, 0.1432F, 0.2009F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(46, 99).mirror().addBox(-0.3F, -0.2512F, -0.997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.7715F, -1.9712F, 0.1222F, -0.1571F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.7715F, -1.9712F, 0.2443F, -0.1571F, 0.0F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 99).addBox(1.05F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.875F, -0.6781F, -1.5823F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(98, 96).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(98, 96).addBox(1.05F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.875F, -0.5186F, -1.2154F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(98, 80).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(98, 80).addBox(1.05F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.875F, -0.3401F, -0.8575F, -2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(98, 77).mirror().addBox(-0.5F, -0.425F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(98, 77).addBox(1.05F, -0.425F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.875F, 0.1179F, -0.5284F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(98, 55).mirror().addBox(-0.5F, -0.525F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(98, 55).addBox(1.05F, -0.525F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.875F, 0.1179F, -0.5284F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(88, 96).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(88, 96).addBox(1.05F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.875F, 0.1266F, -0.3285F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(99, 43).addBox(-0.7F, -0.9882F, -0.2336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(99, 49).addBox(-0.7F, -1.1882F, 0.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(36, 99).addBox(-0.7F, -1.1882F, -0.2336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.875F, -0.7715F, -1.9712F, 2.9147F, 0.1571F, 0.0F));

		PartDefinition cube_r335 = Jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(43, 95).addBox(-0.7066F, -0.5335F, -2.2822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 0.0785F, 0.2269F, 0.0F));

		PartDefinition cube_r336 = Jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(100, 6).addBox(-0.7066F, -2.0919F, -1.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 3).addBox(-0.7066F, -2.2669F, -1.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 0.9948F, 0.2269F, 0.0F));

		PartDefinition cube_r337 = Jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(31, 95).addBox(-0.7066F, -2.7297F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(21, 95).addBox(-0.7066F, -2.4797F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 1.6493F, 0.2269F, 0.0F));

		PartDefinition cube_r338 = Jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(16, 95).addBox(-0.7066F, -0.5515F, 1.1333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(95, 87).addBox(-0.7566F, -0.2984F, 1.1623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 3.0456F, 0.2269F, 0.0F));

		PartDefinition cube_r339 = Jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(48, 96).addBox(-0.7066F, -0.677F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 31).addBox(-0.7066F, -0.677F, -0.2592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 2.9583F, 0.2269F, 0.0F));

		PartDefinition cube_r340 = Jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(3, 96).addBox(-0.7566F, -0.2F, 1.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(11, 95).addBox(-0.7066F, -0.6809F, 0.9863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 3.0892F, 0.2269F, 0.0F));

		PartDefinition cube_r341 = Jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(95, 84).addBox(-0.7566F, -0.3857F, 0.5706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 2.9932F, 0.2269F, 0.0F));

		PartDefinition cube_r342 = Jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(95, 65).addBox(-0.7566F, -0.4795F, -0.0235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 2.906F, 0.2269F, 0.0F));

		PartDefinition cube_r343 = Jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(58, 96).addBox(-0.75F, -0.8207F, -0.1134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 62).addBox(-0.75F, -0.8207F, 0.4866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.875F, -0.7715F, -1.9712F, 2.906F, 0.1571F, 0.0F));

		PartDefinition cube_r344 = Jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(51, 99).addBox(-0.7F, -0.8973F, 0.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.875F, -0.7715F, -1.9712F, 3.0456F, 0.1571F, 0.0F));

		PartDefinition cube_r345 = Jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(95, 6).addBox(-0.7066F, -0.749F, 0.5896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 3.0369F, 0.2269F, 0.0F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(96, 25).addBox(-0.7066F, -0.8541F, 0.1532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 96).addBox(-0.7066F, -0.8541F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(36, 96).addBox(-0.7066F, -0.8541F, -0.2468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6708F, -0.7038F, -3.154F, 2.9147F, 0.2269F, 0.0F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(46, 99).addBox(-0.7F, -0.2512F, -0.997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.875F, -0.7715F, -1.9712F, 0.1222F, 0.1571F, 0.0F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(99, 12).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.875F, -0.7715F, -1.9712F, 0.2443F, 0.1571F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(100, 83).addBox(-0.0771F, -2.1553F, 4.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9641F, 8.2188F, -5.0165F, -1.4225F, 0.2752F, -0.265F));

		PartDefinition cube_r349 = RArm.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(81, 0).addBox(0.0F, -0.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0771F, -0.5418F, 2.7527F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r350 = RArm.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(71, 31).addBox(0.0F, -0.15F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0771F, -0.5418F, 2.7527F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r351 = RArm.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(90, 87).addBox(0.0F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0771F, -0.0907F, 1.3221F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r352 = RArm.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(35, 76).addBox(0.0F, -1.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0771F, 1.4356F, 0.7448F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r353 = RArm.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(46, 29).addBox(-0.5F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4229F, 0.4525F, 0.2124F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r354 = RArm.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(76, 58).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(19, 26).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(74, 18).addBox(0.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0771F, -2.4592F, 4.8869F, 0.9728F, 0.1946F, -0.4967F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(28, 69).addBox(-0.9F, -0.01F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9035F, 4.9363F, 0.1026F, -0.0436F, 0.0F, 0.2618F));

		PartDefinition cube_r355 = RHand.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(74, 0).addBox(-0.91F, -0.01F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.99F, 0.0F, 0.0F, -0.303F, -0.0393F, -0.1249F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create().texOffs(100, 86).addBox(-0.9229F, -2.1553F, 4.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9641F, 8.2188F, -5.0165F, -1.4584F, -0.1308F, 0.7452F));

		PartDefinition cube_r356 = RArm3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(23, 81).addBox(-1.0F, -0.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0771F, -0.5418F, 2.7527F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r357 = RArm3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(71, 36).addBox(-1.0F, -0.15F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0771F, -0.5418F, 2.7527F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r358 = RArm3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(78, 96).addBox(-1.0F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0771F, -0.0907F, 1.3221F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r359 = RArm3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(47, 76).addBox(-1.0F, -1.05F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0771F, 1.4356F, 0.7448F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r360 = RArm3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(74, 25).addBox(-0.5F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4229F, 0.4525F, 0.2124F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r361 = RArm3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(76, 62).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(74, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(42, 74).addBox(-1.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0771F, -2.4592F, 4.8869F, 0.9127F, 0.1711F, 0.9484F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(35, 69).addBox(-0.1F, -0.01F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9035F, 4.9363F, 0.1026F, -0.0436F, 0.0F, -0.2618F));

		PartDefinition cube_r362 = RHand2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(64, 74).addBox(-1.09F, -0.01F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.99F, 0.0F, 0.0F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition Tail = Adeopapposaurus.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, -0.6013F, -0.0611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, -0.0087F, -0.0436F, -0.0015F));

		PartDefinition cube_r363 = Tail.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(8, 101).addBox(0.0F, -1.85F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 6.9389F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Tail.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(28, 100).addBox(0.0F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 4.9389F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Tail.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(53, 91).addBox(0.0F, -2.225F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 2.9389F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Tail.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(50, 91).addBox(0.0F, 0.4591F, -0.1051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3987F, 7.6389F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Tail.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(28, 50).addBox(0.0F, -0.1118F, -0.0885F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 5.4389F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Tail.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(32, 42).addBox(0.0F, 0.024F, -0.1487F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 3.1389F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Tail.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(91, 20).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 0.9389F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Tail.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1013F, 0.9389F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r371 = Tail.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1013F, 0.9389F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.6584F, -0.0376F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0958F, 8.9416F, 0.0972F, -0.1296F, -0.0183F));

		PartDefinition cube_r372 = Tail2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(11, 103).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 7.9624F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Tail2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(5, 103).addBox(0.0F, -1.275F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 5.9624F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Tail2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(97, 102).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 3.9624F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Tail2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(94, 102).addBox(0.0F, -1.625F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 1.9624F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Tail2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(102, 89).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, -0.0376F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Tail2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(25, 23).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1584F, -0.0376F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r378 = Tail2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(25, 23).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1584F, -0.0376F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r379 = Tail2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(72, 91).addBox(0.0F, 0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0287F, 8.2777F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Tail2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(62, 91).addBox(0.0F, 0.4896F, -0.0633F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2772F, 5.5834F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Tail2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(59, 91).addBox(0.0F, 0.3592F, -0.1559F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.4F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Tail2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(56, 91).addBox(0.0F, 0.0957F, -0.4997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, -0.0345F, -0.1307F, -0.0069F));

		PartDefinition cube_r383 = Tail3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 104).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3147F, 10.0474F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r384 = Tail3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(103, 103).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 8.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r385 = Tail3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(100, 103).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 6.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r386 = Tail3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(20, 103).addBox(0.0F, -1.25F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2147F, 4.1474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r387 = Tail3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(17, 103).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2147F, 2.0474F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r388 = Tail3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(14, 103).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2147F, 0.0474F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r389 = Tail3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(5, 99).addBox(0.0F, 1.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 92).addBox(0.0F, -0.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5768F, 5.7819F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r390 = Tail3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(8, 92).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3723F, 7.3207F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r391 = Tail3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(75, 91).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2041F, 2.913F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r392 = Tail3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(91, 73).addBox(0.0F, 0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0572F, 0.6352F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F))
				.texOffs(104, 15).addBox(0.0F, -1.0897F, 1.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 21).addBox(0.0F, -0.9147F, 5.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 104).addBox(0.0F, -0.7397F, 7.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.044F, 10.9706F, -0.0699F, 0.0435F, -0.003F));

		PartDefinition cube_r393 = Tail4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(104, 18).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 3.0474F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r394 = Tail4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(103, 9).addBox(0.0F, 17.0F, 28.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 82).addBox(0.0F, 16.0F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 12).addBox(0.0F, 15.0F, 24.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 52).addBox(0.0F, 13.0F, 22.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 103).addBox(0.0F, 12.1F, 20.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0366F, 10.9354F, -0.2023F, 0.1687F, -0.0499F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, -0.2388F, 0.2086F, -0.0698F));

		PartDefinition RLeg = Adeopapposaurus.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 0.2293F, 1.014F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r395 = RLeg.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(80, 46).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.0421F, 1.8243F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r396 = RLeg.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(83, 58).addBox(1.0F, 0.3015F, 0.2961F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 7.5918F, -0.1642F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r397 = RLeg.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(100, 61).addBox(1.0F, 0.019F, 0.0159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 9.5094F, 0.4039F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r398 = RLeg.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(87, 69).addBox(1.0F, 0.019F, 0.0159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 7.5918F, -0.1642F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r399 = RLeg.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(64, 83).addBox(1.0F, 0.0982F, 0.0969F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.5918F, -0.3642F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r400 = RLeg.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(88, 0).addBox(1.0F, 0.0376F, -0.0598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.5918F, -0.3642F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r401 = RLeg.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(86, 24).addBox(1.0F, -0.35F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2145F, 0.7003F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r402 = RLeg.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(16, 92).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7145F, -0.1657F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r403 = RLeg.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(11, 92).addBox(1.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, -0.3725F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r404 = RLeg.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(91, 25).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, -0.3725F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r405 = RLeg.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(82, 39).addBox(1.0F, -2.0F, -1.325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 1.5067F, 0.9421F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r406 = RLeg.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -2.0F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, 4.7814F, 0.4346F, -0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r407 = RLeg.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(34, 88).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, 3.5918F, -0.3642F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r408 = RLeg.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(85, 65).addBox(1.0F, -0.675F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, -0.3579F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r409 = RLeg.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(22, 85).addBox(1.0F, 0.05F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, -0.3579F, -0.096F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 10.5589F, 2.1111F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r410 = RLeg2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(5, 76).addBox(0.0F, -6.4F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(35, 84).addBox(0.0F, -4.9F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 64).addBox(0.0F, -4.9F, -0.8F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(76, 80).addBox(-1.0F, -6.15F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(59, 63).addBox(-1.0F, -5.2F, -0.65F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r411 = RLeg2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(71, 74).addBox(0.0F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 3.2081F, 1.4996F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r412 = RLeg2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(42, 81).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.5F, 3.6534F, 0.0128F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r413 = RLeg2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(66, 31).addBox(-0.5F, -4.0F, -0.375F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-0.5F, 7.2091F, 0.576F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r414 = RLeg2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(12, 76).addBox(-1.0F, -0.05F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.6437F, 1.9524F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r415 = RLeg2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(87, 39).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, 0.237F, 1.0389F, -0.4189F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(51, 69).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.7767F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, -0.2324F, -0.1046F, 0.009F));

		PartDefinition cube_r416 = digit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(58, 75).addBox(-0.2826F, -0.4019F, -0.5086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.1745F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5808F, 4.3039F, 0.6057F, -2.5972F, 0.2635F, 0.1564F));

		PartDefinition cube_r417 = digit2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(40, 86).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.1464F, -0.0084F, 0.9333F, 1.789F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(61, 12).addBox(-0.9F, -0.8827F, -2.4239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4782F, 5.2271F, 0.089F, 0.4802F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(53, 36).addBox(-0.9F, -0.5827F, -2.9239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.3837F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Adeopapposaurus.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 0.2293F, 1.014F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r418 = RLeg4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(47, 80).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.0421F, 1.8243F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r419 = RLeg4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(59, 83).addBox(-2.0F, 0.3015F, 0.2961F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 7.5918F, -0.1642F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r420 = RLeg4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(100, 64).addBox(-2.0F, 0.019F, 0.0159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 9.5094F, 0.4039F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r421 = RLeg4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 88).addBox(-2.0F, 0.019F, 0.0159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 7.5918F, -0.1642F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r422 = RLeg4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(83, 79).addBox(-2.0F, 0.0982F, 0.0969F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.5918F, -0.3642F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r423 = RLeg4.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(88, 10).addBox(-2.0F, 0.0376F, -0.0598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.5918F, -0.3642F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r424 = RLeg4.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(85, 86).addBox(-2.0F, -0.35F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2145F, 0.7003F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r425 = RLeg4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(73, 96).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.7145F, -0.1657F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r426 = RLeg4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(68, 96).addBox(-2.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.6629F, -0.3725F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r427 = RLeg4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(63, 96).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6629F, -0.3725F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r428 = RLeg4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(54, 82).addBox(-2.0F, -2.0F, -1.325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 1.5067F, 0.9421F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r429 = RLeg4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(83, 53).addBox(-0.5F, -2.0F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, 4.7814F, 0.4346F, -0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r430 = RLeg4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(45, 88).addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 3.5918F, -0.3642F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r431 = RLeg4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(80, 86).addBox(-2.0F, -0.675F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 1.6067F, -0.3579F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r432 = RLeg4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(86, 74).addBox(-2.0F, 0.05F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.6067F, -0.3579F, -0.096F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 10.5589F, 2.1111F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r433 = RLeg5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(76, 5).addBox(-1.0F, -6.4F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(47, 84).addBox(-1.0F, -4.9F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 63).addBox(-1.0F, -4.9F, -0.8F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(5, 81).addBox(0.0F, -6.15F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(13, 64).addBox(0.0F, -5.2F, -0.65F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r434 = RLeg5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(18, 75).addBox(-1.0F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 3.2081F, 1.4996F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r435 = RLeg5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(70, 81).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 3.6534F, 0.0128F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r436 = RLeg5.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(23, 69).addBox(-0.5F, -4.0F, -0.375F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.5F, 7.2091F, 0.576F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r437 = RLeg5.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(76, 74).addBox(0.0F, -0.05F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.6437F, 1.9524F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r438 = RLeg5.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(87, 46).addBox(0.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, 0.237F, 1.0389F, -0.4189F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create().texOffs(69, 62).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.6458F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, -0.2324F, 0.1046F, -0.009F));

		PartDefinition cube_r439 = digit3.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 76).addBox(-0.7174F, -0.4019F, -0.5086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.1745F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5808F, 4.3039F, 0.6057F, -2.5972F, -0.2635F, -0.1564F));

		PartDefinition cube_r440 = digit4.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(-0.1464F, -0.0084F, 0.9333F, 1.789F, 0.0F, 0.0F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create().texOffs(61, 17).addBox(-2.1F, -0.8827F, -2.4239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4782F, 5.2271F, 0.089F, 0.3057F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create().texOffs(61, 0).addBox(-2.1F, -0.5827F, -2.9239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, 0.009F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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