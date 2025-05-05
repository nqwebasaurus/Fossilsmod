package fossils.fossils.client.blockentity.model.archelon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArchelonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart FrontFlipperEndR5;
	private final ModelPart Tail;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart FrontFlipperMiddleR4;
	private final ModelPart FrontFlipperEndR4;

	public ArchelonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.FrontFlipperR3 = this.Hips.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR5 = this.Hips.getChild("FrontFlipperR5");
		this.FrontFlipperMiddleR5 = this.FrontFlipperR5.getChild("FrontFlipperMiddleR5");
		this.FrontFlipperEndR5 = this.FrontFlipperMiddleR5.getChild("FrontFlipperEndR5");
		this.Tail = this.Hips.getChild("Tail");
		this.tail3 = this.Tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR4 = this.Chest.getChild("FrontFlipperR4");
		this.FrontFlipperMiddleR4 = this.FrontFlipperR4.getChild("FrontFlipperMiddleR4");
		this.FrontFlipperEndR4 = this.FrontFlipperMiddleR4.getChild("FrontFlipperEndR4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.5612F, -8.1508F, 0.0666F, -0.021F, 0.3047F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 74).addBox(-1.0F, -1.0022F, -0.1149F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 0).addBox(-1.5F, -0.1142F, -0.1322F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.4F, 3.7F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 52).mirror().addBox(-3.5F, -0.53F, 1.8241F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2779F, 1.7037F, -0.1491F, 0.0096F, -0.1568F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 52).addBox(0.5F, -0.53F, 1.8241F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2779F, 1.7037F, -0.1491F, -0.0096F, 0.1568F));

		PartDefinition FrontFlipperR3 = Hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.119F, 2.9484F, 17.2872F, -0.0327F, -0.098F, 0.3324F));

		PartDefinition cube_r5 = FrontFlipperR3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 116).addBox(-1.9F, -0.5F, -0.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.6695F, -0.1811F, -2.0454F, 0.0F, 0.0087F, 0.0F));

		PartDefinition cube_r6 = FrontFlipperR3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 96).addBox(-1.0272F, -1.4737F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2499F, 0.2925F, 0.2735F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r7 = FrontFlipperR3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 118).addBox(-1.9527F, -1.4181F, -0.947F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2474F, 0.237F, -0.8021F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r8 = FrontFlipperR3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(115, 0).addBox(-2.4159F, -0.5F, 1.7035F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0426F, -0.1811F, 1.7569F, 0.0F, -2.3998F, 0.0F));

		PartDefinition cube_r9 = FrontFlipperR3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(121, 122).addBox(-0.8F, -1.0F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5626F, -0.1811F, 0.3174F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r10 = FrontFlipperR3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 123).addBox(1.8F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(47, 92).addBox(-2.7F, -0.5F, -1.6F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9332F, -0.1811F, -1.1761F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r11 = FrontFlipperR3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 123).addBox(-2.2953F, -0.5F, -0.0306F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9332F, -0.1811F, -1.7761F, 0.0F, -0.637F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(128, 115).addBox(6.8077F, -0.3972F, -1.8393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1563F, -0.2839F, -1.4716F, -0.0754F, -1.0456F, 0.0871F));

		PartDefinition cube_r12 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(113, 6).addBox(-3.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9649F, 0.1028F, -1.3954F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r13 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 129).addBox(3.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(116, 57).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3107F, 0.1028F, 0.3443F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r14 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 133).addBox(-0.7F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4076F, 0.1028F, 2.1387F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r15 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(135, 0).addBox(-0.5F, -0.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5649F, 0.1028F, -0.2954F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r16 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(101, 59).addBox(-4.8F, 0.0F, -3.7F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.3758F, 0.1032F, -1.5442F, -0.0014F, 0.2879F, -0.004F));

		PartDefinition cube_r17 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(117, 21).addBox(-3.1F, 0.0F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.6041F, 0.1146F, 2.1891F, -0.0014F, -0.2357F, -0.0033F));

		PartDefinition cube_r18 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(112, 67).addBox(-3.5F, 0.0F, 0.3F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0266F, 0.11F, -0.0642F, -0.0013F, -0.1048F, -0.0035F));

		PartDefinition cube_r19 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(99, 57).addBox(-3.5F, 0.0F, -0.2F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9597F, 0.1084F, -1.4774F, -0.0013F, 0.1133F, -0.0038F));

		PartDefinition cube_r20 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(99, 34).addBox(-3.5F, 0.0F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9406F, 0.1063F, -3.1293F, -0.0014F, 0.2442F, -0.0039F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1028F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r21 = FrontFlipperEndR3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 98).addBox(-11.4F, 0.0F, 0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.972F, 0.0119F, 0.8857F, -0.0018F, 0.1133F, -0.0036F));

		PartDefinition cube_r22 = FrontFlipperEndR3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(66, 107).addBox(-2.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3145F, 0.0413F, 1.5331F, -0.0018F, -0.1485F, -0.0031F));

		PartDefinition cube_r23 = FrontFlipperEndR3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(115, 4).addBox(-5.9F, 0.0F, 2.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3712F, 0.0141F, -2.8714F, -0.0018F, -0.1921F, -0.0031F));

		PartDefinition cube_r24 = FrontFlipperEndR3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(111, 92).addBox(-3.0F, 0.0F, 0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8957F, 0.023F, -4.4739F, -0.0018F, -0.0612F, -0.0033F));

		PartDefinition FrontFlipperR5 = Hips.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.119F, 2.9484F, 17.2872F, -0.0327F, 0.098F, -0.3324F));

		PartDefinition cube_r25 = FrontFlipperR5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(116, 30).addBox(-1.1F, -0.5F, -0.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.6695F, -0.1811F, -2.0454F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r26 = FrontFlipperR5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(133, 87).addBox(0.0272F, -1.4737F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2499F, 0.2925F, 0.2735F, 0.0F, 1.5272F, 0.0F));

		PartDefinition cube_r27 = FrontFlipperR5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 119).addBox(-0.0473F, -1.4181F, -0.947F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2474F, 0.237F, -0.8021F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r28 = FrontFlipperR5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(115, 15).addBox(-0.5841F, -0.5F, 1.7035F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.0426F, -0.1811F, 1.7569F, 0.0F, 2.3998F, 0.0F));

		PartDefinition cube_r29 = FrontFlipperR5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 123).addBox(-1.2F, -1.0F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5626F, -0.1811F, 0.3174F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r30 = FrontFlipperR5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(123, 60).addBox(-3.8F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 92).addBox(-2.3F, -0.5F, -1.6F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9332F, -0.1811F, -1.1761F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r31 = FrontFlipperR5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(123, 111).addBox(0.2953F, -0.5F, -0.0306F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.9332F, -0.1811F, -1.7761F, 0.0F, 0.637F, 0.0F));

		PartDefinition FrontFlipperMiddleR5 = FrontFlipperR5.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create().texOffs(92, 129).addBox(-7.8077F, -0.3972F, -1.8393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.1563F, -0.2839F, -1.4716F, -0.519F, 0.8982F, -0.3289F));

		PartDefinition cube_r32 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(113, 9).addBox(-2.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9649F, 0.1028F, -1.3954F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r33 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 130).addBox(-4.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 117).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3107F, 0.1028F, 0.3443F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r34 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(133, 8).addBox(-0.3F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.4076F, 0.1028F, 2.1387F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r35 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(135, 16).addBox(-0.5F, -0.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5649F, 0.1028F, -0.2954F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r36 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(102, 21).addBox(-1.2F, 0.0F, -3.7F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.3758F, 0.1032F, -1.5442F, -0.0014F, -0.2879F, 0.004F));

		PartDefinition cube_r37 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(123, 52).addBox(-0.9F, 0.0F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.6041F, 0.1146F, 2.1891F, -0.0014F, 0.2357F, 0.0033F));

		PartDefinition cube_r38 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(114, 103).addBox(-1.5F, 0.0F, 0.3F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0266F, 0.11F, -0.0642F, -0.0013F, 0.1048F, 0.0035F));

		PartDefinition cube_r39 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(99, 69).addBox(-3.5F, 0.0F, -0.2F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9597F, 0.1084F, -1.4774F, -0.0013F, -0.1133F, 0.0038F));

		PartDefinition cube_r40 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(99, 36).addBox(-3.5F, 0.0F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9406F, 0.1063F, -3.1293F, -0.0014F, -0.2442F, 0.0039F));

		PartDefinition FrontFlipperEndR5 = FrontFlipperMiddleR5.addOrReplaceChild("FrontFlipperEndR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1028F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r41 = FrontFlipperEndR5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 100).addBox(9.4F, 0.0F, 0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.972F, 0.0119F, 0.8857F, -0.0018F, -0.1133F, 0.0036F));

		PartDefinition cube_r42 = FrontFlipperEndR5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(115, 109).addBox(-1.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3145F, 0.0413F, 1.5331F, -0.0018F, 0.1485F, 0.0031F));

		PartDefinition cube_r43 = FrontFlipperEndR5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(115, 19).addBox(0.9F, 0.0F, 2.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3712F, 0.0141F, -2.8714F, -0.0018F, 0.1921F, 0.0031F));

		PartDefinition cube_r44 = FrontFlipperEndR5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(112, 55).addBox(-2.0F, 0.0F, 0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8957F, 0.023F, -4.4739F, -0.0018F, 0.0612F, 0.0033F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(103, 122).mirror().addBox(-0.5F, 0.4F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4623F, 0.4734F, 6.1108F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r46 = Tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(36, 126).mirror().addBox(0.3096F, 1.2159F, 0.1929F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0009F, 4.2288F, 4.6478F, 1.3069F, -0.5545F, 0.3467F));

		PartDefinition cube_r47 = Tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(120, 131).mirror().addBox(-0.1424F, -1.3114F, -1.7318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9117F, 0.9339F, 6.6385F, 2.04F, -0.5873F, 0.1957F));

		PartDefinition cube_r48 = Tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 126).mirror().addBox(-0.7708F, 1.2073F, 0.3513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0009F, 4.2288F, 4.6478F, 1.0741F, -0.3747F, 0.8464F));

		PartDefinition cube_r49 = Tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(113, 131).mirror().addBox(-0.3842F, 0.1481F, -1.241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(73, 136).mirror().addBox(-1.3842F, 0.1481F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5317F, 4.1199F, 6.7388F, 0.3335F, -0.248F, -0.0848F));

		PartDefinition cube_r50 = Tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 131).mirror().addBox(-1.2411F, 0.7019F, -6.3624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7259F, 4.1288F, 4.6478F, 0.4269F, 0.093F, 0.8905F));

		PartDefinition cube_r51 = Tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(44, 113).mirror().addBox(-1.099F, 0.4941F, -2.0553F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1715F, 4.5734F, 4.3479F, 0.3269F, 0.3032F, 0.0145F));

		PartDefinition cube_r52 = Tail.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(68, 136).mirror().addBox(-0.2187F, 0.9515F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7259F, 4.1288F, 4.6478F, 0.3195F, 0.2204F, -0.0142F));

		PartDefinition cube_r53 = Tail.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-1.2346F, 0.7019F, -2.6289F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.7259F, 4.1288F, 4.6478F, 0.4298F, -0.1454F, 0.782F));

		PartDefinition cube_r54 = Tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-0.9024F, 0.7019F, -6.3124F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7259F, 4.1288F, 4.6478F, 0.425F, 0.0135F, 0.8544F));

		PartDefinition cube_r55 = Tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(39, 100).mirror().addBox(0.8086F, 0.7019F, -5.8134F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7259F, 4.1288F, 4.6478F, 0.5566F, 0.6757F, 1.2194F));

		PartDefinition cube_r56 = Tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(31, 27).mirror().addBox(0.7582F, -3.5613F, -5.9429F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1F, 12.0263F, 2.5135F, 0.8366F, -0.9521F, -0.7342F));

		PartDefinition cube_r57 = Tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(0.0569F, -0.5431F, -8.4386F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1F, 12.0263F, -4.4865F, 1.7338F, -1.1193F, -1.7516F));

		PartDefinition cube_r58 = Tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-2.1628F, -0.1394F, -0.2675F, 11.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1F, 8.5263F, 1.9135F, 1.5007F, -0.9501F, -1.0765F));

		PartDefinition cube_r59 = Tail.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-7.1929F, 0.1356F, 0.0633F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1F, 8.5263F, 1.9135F, 2.074F, -1.1728F, -1.7176F));

		PartDefinition cube_r60 = Tail.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(88, 44).mirror().addBox(0.0569F, -1.0431F, -0.4386F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-9.1F, 12.0263F, -4.4865F, 1.3725F, -1.1162F, -1.3508F));

		PartDefinition cube_r61 = Tail.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 123).mirror().addBox(-0.0737F, -0.9101F, -1.0739F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-9.1F, 8.8263F, 1.9135F, 1.0884F, -1.024F, -1.0313F));

		PartDefinition cube_r62 = Tail.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(125, 54).mirror().addBox(-2.1207F, -1.1464F, -2.3044F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0263F, 10.3135F, 0.7166F, -0.6128F, -0.4645F));

		PartDefinition cube_r63 = Tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 123).mirror().addBox(-6.6096F, -1.1464F, -1.7598F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0263F, 10.3135F, 0.8635F, -0.7857F, -0.6912F));

		PartDefinition cube_r64 = Tail.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 102).mirror().addBox(-5.721F, -1.1464F, 0.2603F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0263F, 10.3135F, 1.2314F, -0.9645F, -1.165F));

		PartDefinition cube_r65 = Tail.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(113, 26).mirror().addBox(-2.9392F, -1.1464F, -1.3035F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0263F, 10.3135F, 0.9765F, -0.8652F, -0.8448F));

		PartDefinition cube_r66 = Tail.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 100).mirror().addBox(-0.162F, -1.1464F, -2.2903F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0263F, 10.3135F, 0.7561F, -0.6711F, -0.5303F));

		PartDefinition cube_r67 = Tail.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.7685F, 6.3047F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r68 = Tail.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(100, 24).mirror().addBox(-2.0F, 1.6564F, 8.4121F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5752F, -8.7253F, 0.1004F, 0.0586F, -0.1458F));

		PartDefinition cube_r69 = Tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(125, 54).addBox(-0.8793F, -1.1464F, -2.3044F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.0F, 4.0263F, 10.3135F, 0.7166F, 0.6128F, 0.4645F));

		PartDefinition cube_r70 = Tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 20).addBox(-8.8372F, -0.1394F, -0.2675F, 11.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 8.5263F, 1.9135F, 1.5007F, 0.9501F, 1.0765F));

		PartDefinition cube_r71 = Tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(31, 27).addBox(-10.7582F, -3.5613F, -5.9429F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 12.0263F, 2.5135F, 0.8366F, 0.9521F, 0.7342F));

		PartDefinition cube_r72 = Tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 27).addBox(-7.0569F, -0.5431F, -8.4386F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 12.0263F, -4.4865F, 1.7338F, 1.1193F, 1.7516F));

		PartDefinition cube_r73 = Tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(35, 0).addBox(0.1929F, 0.1356F, 0.0633F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 8.5263F, 1.9135F, 2.074F, 1.1728F, 1.7176F));

		PartDefinition cube_r74 = Tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 44).addBox(-7.0569F, -1.0431F, -0.4386F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(9.1F, 12.0263F, -4.4865F, 1.3725F, 1.1162F, 1.3508F));

		PartDefinition cube_r75 = Tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 123).addBox(-3.9263F, -0.9101F, -1.0739F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(9.1F, 8.8263F, 1.9135F, 1.0884F, 1.024F, 1.0313F));

		PartDefinition cube_r76 = Tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(36, 123).addBox(2.6095F, -1.1464F, -1.7598F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.0F, 4.0263F, 10.3135F, 0.8635F, 0.7857F, 0.6912F));

		PartDefinition cube_r77 = Tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(78, 102).addBox(2.721F, -1.1464F, 0.2603F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.0263F, 10.3135F, 1.2314F, 0.9645F, 1.165F));

		PartDefinition cube_r78 = Tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(113, 26).addBox(-0.0608F, -1.1464F, -1.3035F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0F, 4.0263F, 10.3135F, 0.9765F, 0.8652F, 0.8448F));

		PartDefinition cube_r79 = Tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(88, 100).addBox(-2.838F, -1.1464F, -2.2903F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.0263F, 10.3135F, 0.7561F, 0.6711F, 0.5303F));

		PartDefinition cube_r80 = Tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 8).addBox(-7.5F, -1.1464F, -0.5416F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0F, 4.0263F, 10.3135F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(44, 113).addBox(-0.901F, 0.4941F, -2.0553F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1715F, 4.5734F, 4.3479F, 0.3269F, -0.3032F, -0.0145F));

		PartDefinition cube_r82 = Tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(113, 131).addBox(-0.6158F, 0.1481F, -1.241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(73, 136).addBox(0.3842F, 0.1481F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5317F, 4.1199F, 6.7388F, 0.3335F, 0.248F, 0.0848F));

		PartDefinition cube_r83 = Tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(103, 122).addBox(-0.5F, 0.4F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4623F, 0.4734F, 6.1108F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r84 = Tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(120, 131).addBox(-0.8576F, -1.3114F, -1.7318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9117F, 0.9339F, 6.6385F, 2.04F, 0.5873F, -0.1957F));

		PartDefinition cube_r85 = Tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(36, 126).addBox(-1.3096F, 1.2159F, 0.1929F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0009F, 4.2288F, 4.6478F, 1.3069F, 0.5545F, -0.3467F));

		PartDefinition cube_r86 = Tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 126).addBox(-0.2292F, 1.2073F, 0.3513F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0009F, 4.2288F, 4.6478F, 1.0741F, 0.3747F, -0.8464F));

		PartDefinition cube_r87 = Tail.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(68, 136).addBox(-0.7813F, 0.9515F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7259F, 4.1288F, 4.6478F, 0.3195F, -0.2204F, 0.0142F));

		PartDefinition cube_r88 = Tail.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(99, 51).addBox(-0.7654F, 0.7019F, -2.6289F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.7259F, 4.1288F, 4.6478F, 0.4298F, 0.1454F, -0.782F));

		PartDefinition cube_r89 = Tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 131).addBox(0.2411F, 0.7019F, -6.3624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7259F, 4.1288F, 4.6478F, 0.4269F, -0.093F, -0.8905F));

		PartDefinition cube_r90 = Tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 94).addBox(-1.0976F, 0.7019F, -6.3124F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7259F, 4.1288F, 4.6478F, 0.425F, -0.0135F, -0.8544F));

		PartDefinition cube_r91 = Tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 100).addBox(-2.8086F, 0.7019F, -5.8134F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7259F, 4.1288F, 4.6478F, 0.5566F, -0.6757F, -1.2194F));

		PartDefinition cube_r92 = Tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.7386F, 0.1386F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.3243F, -0.0106F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.4F, -0.7685F, 6.3047F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r94 = Tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 9).addBox(-1.5F, -0.049F, 0.0077F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1757F, 3.7894F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(97, 71).addBox(-1.0F, -0.1386F, -0.0614F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6757F, -0.1106F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(100, 24).addBox(0.0F, 1.6564F, 8.4121F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5752F, -8.7253F, 0.1004F, -0.0586F, 0.1458F));

		PartDefinition cube_r97 = Tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(58, 25).addBox(0.7399F, 3.5889F, 17.1429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9167F, -10.6485F, 0.3738F, -0.1396F, 0.5023F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, 0.6747F, 0.0275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3658F, 9.6224F, 0.0613F, 0.0871F, 0.0053F));

		PartDefinition cube_r98 = tail3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 137).addBox(0.0F, -2.1975F, -0.0752F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 70).addBox(0.0F, -2.3976F, 1.9248F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6242F, 2.9815F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 0).addBox(0.0F, -0.215F, 0.0948F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3102F, 1.0327F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(44, 107).addBox(-0.5F, -0.9495F, 0.046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6242F, 2.9815F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(63, 61).addBox(-0.5F, -0.5259F, -0.135F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3533F, 6.8627F, 0.2721F, 0.1619F, -0.0897F));

		PartDefinition cube_r101 = tail4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(101, 138).addBox(-0.5F, -0.9583F, 0.0798F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5492F, 5.8078F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(98, 138).addBox(-0.5F, -0.8035F, 0.0892F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6442F, 3.8001F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(138, 93).addBox(-0.5F, -0.9473F, 0.0743F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5396F, 1.8028F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(138, 90).addBox(-0.5F, -1.091F, 0.0594F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4349F, -0.1944F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0517F, 7.8498F, -0.0054F, 0.1753F, -0.1299F));

		PartDefinition cube_r105 = tail5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(104, 138).addBox(0.0F, -0.8F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 103).addBox(0.0F, -0.8F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5094F, 1.4396F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0175F, 6.9181F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(64, 25).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 98).addBox(-1.0F, -0.0049F, -0.0549F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(-4.425F, -0.5473F, -5.9972F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4567F, -1.9888F, -0.0517F, -0.0082F, -0.1569F));

		PartDefinition cube_r109 = Body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(17, 83).mirror().addBox(-4.0F, -0.4792F, -2.0149F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4567F, -1.9888F, -0.0866F, -0.0082F, -0.1569F));

		PartDefinition cube_r110 = Body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(17, 83).addBox(0.0F, -0.4792F, -2.0149F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4567F, -1.9888F, -0.0866F, 0.0082F, 0.1569F));

		PartDefinition cube_r111 = Body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(83, 24).addBox(0.425F, -0.5473F, -5.9972F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4567F, -1.9888F, -0.0517F, 0.0082F, 0.1569F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(62, 96).addBox(-1.0F, -0.2142F, -0.0603F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -7.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0367F, -8.0011F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(110, 71).addBox(-0.5F, -0.1F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(37, 130).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.8788F, -4.4408F, -0.0946F, 0.7395F, -0.0638F));

		PartDefinition cube_r115 = Chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-4.225F, -2.1826F, -9.7917F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4199F, 6.0124F, 0.2255F, 0.0177F, -0.1561F));

		PartDefinition cube_r116 = Chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 74).mirror().addBox(-0.6739F, -0.1401F, -0.1729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1636F, -0.3017F, 13.8176F, -0.3533F, -0.8089F, 0.0033F));

		PartDefinition cube_r117 = Chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(22, 112).mirror().addBox(-0.4007F, -0.1401F, -0.2701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1636F, -0.3017F, 13.8176F, -0.3873F, -0.8862F, 0.0487F));

		PartDefinition cube_r118 = Chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(-0.9446F, -0.7635F, 3.6247F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1636F, -0.3017F, 13.8176F, -0.4542F, -0.7762F, -0.0854F));

		PartDefinition cube_r119 = Chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-1.3041F, -0.6753F, 3.6972F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3636F, -0.5267F, 11.5426F, -0.6098F, -0.9071F, 0.0925F));

		PartDefinition cube_r120 = Chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(112, 111).mirror().addBox(-0.4491F, -0.0238F, -0.1656F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.3636F, -0.5267F, 11.5426F, -0.6607F, -1.052F, 0.3547F));

		PartDefinition cube_r121 = Chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(102, 77).mirror().addBox(-1.1248F, -0.0238F, -0.0977F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3636F, -0.5267F, 11.5426F, -0.5332F, -0.929F, 0.2026F));

		PartDefinition cube_r122 = Chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(11, 105).mirror().addBox(-0.963F, -1.177F, 0.1864F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2024F, 0.1537F, 8.1678F, -0.2254F, -1.1611F, -0.181F));

		PartDefinition cube_r123 = Chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(112, 61).mirror().addBox(-0.2576F, -1.177F, 0.1295F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.2024F, 0.1537F, 8.1678F, -0.2898F, -1.254F, -0.1122F));

		PartDefinition cube_r124 = Chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(23, 41).mirror().addBox(-0.8159F, -1.8743F, 3.926F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2024F, 0.1537F, 8.1678F, -0.792F, -1.1032F, 0.2558F));

		PartDefinition cube_r125 = Chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(121, 69).mirror().addBox(-0.6F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.8322F, 5.6506F, -5.065F, 1.1411F, -0.0334F, -0.3914F));

		PartDefinition cube_r126 = Chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 80).mirror().addBox(-1.9302F, -0.2265F, -3.2447F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.909F, 8.866F, -2.3114F, 0.0684F, 0.2378F, 0.2938F));

		PartDefinition cube_r127 = Chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 124).mirror().addBox(-1.8688F, -0.5F, -1.212F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(34, 91).mirror().addBox(-0.6948F, -0.5F, -4.7123F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5776F, 6.0631F, -5.1377F, 1.1904F, -0.2077F, -0.7948F));

		PartDefinition cube_r128 = Chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-0.7582F, -0.5F, -0.224F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5776F, 6.0631F, -5.1377F, 1.2586F, 0.3021F, 0.4261F));

		PartDefinition cube_r129 = Chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(31, 34).mirror().addBox(-6.2896F, -0.4925F, -6.7561F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3731F, 10.3287F, 2.1526F, 3.1171F, -0.6989F, -3.141F));

		PartDefinition cube_r130 = Chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-6.9436F, 0.111F, -0.9501F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3731F, 9.7287F, 2.1526F, 3.0333F, -1.3962F, -2.7447F));

		PartDefinition cube_r131 = Chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.913F, 0.111F, -1.4493F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3731F, 9.7287F, 2.1526F, 0.6352F, -1.3059F, -0.3136F));

		PartDefinition cube_r132 = Chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(33, 10).mirror().addBox(-5.8303F, -0.4979F, -8.3701F, 6.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.7731F, 10.3287F, 2.1526F, 0.0722F, -1.3074F, -0.0848F));

		PartDefinition cube_r133 = Chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(113, 12).mirror().addBox(-4.9167F, -1.0F, -0.1099F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.7731F, 9.8287F, 7.0526F, 1.9642F, -1.4574F, -1.9665F));

		PartDefinition cube_r134 = Chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(-4.9554F, -0.9851F, -0.3557F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-8.7731F, 10.3287F, 2.1526F, 3.0333F, -1.3962F, -3.0501F));

		PartDefinition cube_r135 = Chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(97, 65).mirror().addBox(0.2005F, -0.5619F, 2.1101F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.074F, 9.8217F, -6.1449F, -3.0122F, -0.9998F, 3.0325F));

		PartDefinition cube_r136 = Chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(47, 96).mirror().addBox(-4.0606F, -0.5619F, -1.6238F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.074F, 9.8217F, -6.1449F, -0.0743F, -0.3482F, 0.0254F));

		PartDefinition cube_r137 = Chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(13, 95).mirror().addBox(-5.1104F, -0.5619F, -1.3342F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.074F, 9.8217F, -6.1449F, -0.0755F, 0.3917F, -0.0289F));

		PartDefinition cube_r138 = Chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(43, 134).mirror().addBox(-0.5F, -0.5F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9413F, -0.1817F, 16.699F, -2.9202F, -0.7902F, 2.8135F));

		PartDefinition cube_r139 = Chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(57, 127).mirror().addBox(-0.9705F, -0.1031F, 1.5689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0347F, -0.5334F, 16.4646F, -0.2438F, -0.1406F, -0.0397F));

		PartDefinition cube_r140 = Chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(126, 81).mirror().addBox(-0.698F, 0.0548F, -0.1955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0347F, -0.5334F, 16.4646F, -0.1089F, -0.3672F, -0.1138F));

		PartDefinition cube_r141 = Chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(31, 118).mirror().addBox(0.0068F, 0.0548F, -1.4739F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0347F, -0.5334F, 16.4646F, -0.1298F, -0.6705F, -0.0721F));

		PartDefinition cube_r142 = Chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(128, 20).mirror().addBox(-0.6521F, -0.1031F, 1.4902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0347F, -0.5334F, 16.4646F, -0.2475F, -0.221F, -0.0192F));

		PartDefinition cube_r143 = Chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(89, 17).mirror().addBox(-1.2058F, -0.7251F, 3.3052F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0347F, -0.5334F, 16.4646F, -0.3997F, -0.0788F, -0.1098F));

		PartDefinition cube_r144 = Chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-1.4011F, -0.9627F, 5.1986F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1847F, -0.7084F, 15.0646F, -0.4228F, -0.6315F, -0.1123F));

		PartDefinition cube_r145 = Chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(112, 49).mirror().addBox(-0.6386F, -0.0594F, 1.3615F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1847F, -0.7084F, 15.0646F, -0.327F, -0.7454F, -0.0021F));

		PartDefinition cube_r146 = Chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-1.0461F, -0.0594F, 1.4334F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1847F, -0.7084F, 15.0646F, -0.305F, -0.6666F, -0.0359F));

		PartDefinition cube_r147 = Chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-0.4539F, 0.0552F, -1.4904F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1847F, -0.7084F, 15.0646F, -0.225F, -0.9791F, -0.0134F));

		PartDefinition cube_r148 = Chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(127, 30).mirror().addBox(-1.1324F, 0.0552F, -0.3497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1847F, -0.7084F, 15.0646F, -0.1606F, -0.6791F, -0.0997F));

		PartDefinition cube_r149 = Chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(16, 128).mirror().addBox(-0.8455F, 0.0552F, -1.532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1847F, -0.7084F, 15.0646F, -0.1281F, 0.229F, -0.2304F));

		PartDefinition cube_r150 = Chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(127, 101).mirror().addBox(-1.7207F, -0.3851F, -0.7176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6636F, -0.3017F, 13.8176F, -0.1284F, -0.8457F, -0.0577F));

		PartDefinition cube_r151 = Chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(132, 46).mirror().addBox(-1.1256F, -0.3851F, -0.6643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6636F, -0.3017F, 13.8176F, -0.2081F, -1.1471F, 0.0361F));

		PartDefinition cube_r152 = Chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(124, 127).mirror().addBox(-0.8455F, 0.0552F, -1.532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8847F, -0.7834F, 13.1896F, -0.1197F, 0.0607F, -0.2317F));

		PartDefinition cube_r153 = Chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(117, 127).mirror().addBox(-1.0416F, 0.0195F, -1.5483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8847F, -1.0834F, 10.7896F, -0.1565F, -0.1152F, -0.1944F));

		PartDefinition cube_r154 = Chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 131).mirror().addBox(0.0F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5891F, -0.7182F, 8.1319F, -3.1242F, -1.1865F, 2.8041F));

		PartDefinition cube_r155 = Chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-0.1362F, 0.0195F, -0.3116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(21, 132).mirror().addBox(-0.5362F, 0.0195F, -0.3116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8847F, -1.0834F, 10.7896F, -0.5974F, -1.2919F, 0.3667F));

		PartDefinition cube_r156 = Chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(110, 127).mirror().addBox(-1.2647F, 0.0195F, -0.2041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8847F, -1.0834F, 10.7896F, -0.2969F, -1.013F, 0.0414F));

		PartDefinition cube_r157 = Chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(71, 128).mirror().addBox(-1.7781F, -1.044F, 0.8035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7886F, -0.7482F, 7.5505F, -0.0128F, -1.0387F, -0.3103F));

		PartDefinition cube_r158 = Chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(42, 52).mirror().addBox(-0.5883F, -0.5F, -4.5093F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-12.403F, 3.4654F, 10.9248F, -0.7115F, -1.1078F, 0.1593F));

		PartDefinition cube_r159 = Chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(99, 131).mirror().addBox(-0.7229F, -1.044F, 0.8037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(58, 131).mirror().addBox(-0.3229F, -1.044F, 0.8037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7886F, -0.7482F, 7.5505F, -0.029F, -1.3441F, -0.2931F));

		PartDefinition cube_r160 = Chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(72, 132).mirror().addBox(0.0553F, -0.3577F, -0.8168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(14, 132).mirror().addBox(-0.3447F, -0.3577F, -0.8168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9886F, -0.4482F, 4.1505F, 0.2455F, -1.3618F, -0.5777F));

		PartDefinition cube_r161 = Chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(133, 80).mirror().addBox(0.5828F, -0.1153F, -0.6702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0886F, -0.4232F, 0.9505F, 2.5639F, -1.3331F, -2.8536F));

		PartDefinition cube_r162 = Chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-0.7808F, -0.0669F, -0.1969F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.1455F, 1.3861F, 2.1362F, 0.0505F, -1.4843F, -0.6551F));

		PartDefinition cube_r163 = Chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(0.1172F, -1.2948F, 4.8431F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9886F, -0.4482F, 4.1505F, -0.7088F, -1.3101F, 0.153F));

		PartDefinition cube_r164 = Chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.3926F, -1.2948F, 4.8426F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9886F, -0.4482F, 4.1505F, -0.6148F, -1.2756F, 0.0553F));

		PartDefinition cube_r165 = Chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(101, 111).mirror().addBox(0.0687F, -0.4923F, 1.0323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9886F, -0.4482F, 4.1505F, 0.0094F, -1.3552F, -0.4378F));

		PartDefinition cube_r166 = Chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-0.6273F, -0.4923F, 1.217F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9886F, -0.4482F, 4.1505F, 0.0066F, -1.2592F, -0.4348F));

		PartDefinition cube_r167 = Chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(131, 127).mirror().addBox(-0.9301F, -0.3577F, -0.6282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9886F, -0.4482F, 4.1505F, 0.1033F, -1.0602F, -0.4276F));

		PartDefinition cube_r168 = Chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.9474F, -0.0669F, -0.0451F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-10.1455F, 1.3861F, 2.1362F, 0.0439F, -1.4712F, -0.6485F));

		PartDefinition cube_r169 = Chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(0.2186F, 0.2752F, -0.0177F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.5886F, -0.4232F, 0.9505F, 0.2973F, -1.5175F, -0.6804F));

		PartDefinition cube_r170 = Chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.2401F, 0.1836F, 0.0519F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5886F, -0.4232F, 0.9505F, 0.1027F, -1.44F, -0.5289F));

		PartDefinition cube_r171 = Chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 118).mirror().addBox(-0.3576F, -0.1153F, -1.166F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0886F, -0.4232F, 0.9505F, 1.1276F, -1.428F, -1.4003F));

		PartDefinition cube_r172 = Chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(0.0552F, 0.853F, 0.5093F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.5886F, 0.9518F, -2.2495F, 1.9994F, -1.293F, -2.5733F));

		PartDefinition cube_r173 = Chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.2655F, 0.853F, 0.5102F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-9.5886F, 0.9518F, -2.2495F, 1.8515F, -1.3082F, -2.4199F));

		PartDefinition cube_r174 = Chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(11, 111).mirror().addBox(1.0239F, -0.321F, -0.4531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.1886F, 0.9518F, -2.6495F, 1.822F, -1.2526F, -2.2778F));

		PartDefinition cube_r175 = Chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(79, 109).mirror().addBox(0.1473F, -0.321F, -0.3857F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1886F, 0.9518F, -2.6495F, 1.287F, -1.2497F, -1.7158F));

		PartDefinition cube_r176 = Chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 125).mirror().addBox(-0.0183F, -0.7387F, -0.3304F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6886F, 0.9518F, -2.6495F, 1.1042F, -1.1697F, -1.3842F));

		PartDefinition cube_r177 = Chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(0.7354F, -1.7763F, 2.8366F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.1886F, 2.8518F, -5.2495F, 2.2095F, -1.0971F, -2.7561F));

		PartDefinition cube_r178 = Chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(105, 43).mirror().addBox(0.0087F, -1.4237F, -0.7778F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1886F, 2.8518F, -5.2495F, 1.7614F, -1.1851F, -2.1621F));

		PartDefinition cube_r179 = Chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(34, 83).mirror().addBox(1.1566F, -1.7763F, 2.7898F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1886F, 2.8518F, -5.2495F, 2.274F, -1.0699F, -2.8291F));

		PartDefinition cube_r180 = Chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(104, 105).mirror().addBox(0.8193F, -1.4237F, -0.8153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.1886F, 2.8518F, -5.2495F, 2.1298F, -1.12F, -2.5641F));

		PartDefinition cube_r181 = Chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(124, 90).mirror().addBox(-1.1157F, -0.2113F, -0.5573F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0886F, 0.9518F, -4.7495F, 1.4198F, -1.1748F, -1.6755F));

		PartDefinition cube_r182 = Chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.9F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9425F, 1.4932F, -6.528F, 0.3919F, 0.058F, -0.1394F));

		PartDefinition cube_r183 = Chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(66, 88).mirror().addBox(-5.9354F, -0.296F, -0.961F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0203F, 2.6767F, 24.5543F, 3.1112F, 0.0101F, 2.8662F));

		PartDefinition cube_r184 = Chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(102, 83).mirror().addBox(-15.578F, 0.1576F, -10.2702F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-18.0102F, 5.5498F, 11.4658F, 3.1104F, 0.2729F, 2.893F));

		PartDefinition cube_r185 = Chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(100, 88).mirror().addBox(-15.1371F, 0.1576F, -3.0627F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-18.0102F, 5.5498F, 11.4658F, 3.0987F, 0.7961F, 2.8708F));

		PartDefinition cube_r186 = Chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-11.5544F, 0.1576F, -1.6738F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-18.0102F, 5.5498F, 11.4658F, 3.0916F, 0.9269F, 2.8615F));

		PartDefinition cube_r187 = Chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-6.0459F, 0.1576F, -0.0373F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-18.0102F, 5.5498F, 11.4658F, 3.0513F, 1.2317F, 2.8163F));

		PartDefinition cube_r188 = Chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(-18.6294F, -0.2589F, -5.0228F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-15.9102F, 7.0498F, -7.5342F, 2.7077F, 1.3774F, 2.474F));

		PartDefinition cube_r189 = Chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(83, 88).mirror().addBox(-13.2095F, -0.2589F, -3.3316F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.9102F, 7.0498F, -7.5342F, 2.0768F, 1.4783F, 1.8378F));

		PartDefinition cube_r190 = Chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(17, 89).mirror().addBox(-7.7383F, -0.2589F, -1.685F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-15.9102F, 7.0498F, -7.5342F, 0.4394F, 1.3798F, 0.1916F));

		PartDefinition cube_r191 = Chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(124, 26).mirror().addBox(-10.277F, -3.7541F, 2.0331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4199F, 6.0124F, 1.6301F, -1.1788F, -1.7983F));

		PartDefinition cube_r192 = Chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(80, 71).mirror().addBox(-11.8513F, -3.7541F, -7.7277F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4199F, 6.0124F, 0.5604F, -0.7707F, -0.5755F));

		PartDefinition cube_r193 = Chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(124, 77).mirror().addBox(-2.2073F, -0.2589F, -0.901F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.9102F, 7.0498F, -7.5342F, 0.15F, 0.9997F, -0.1144F));

		PartDefinition cube_r194 = Chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(76, 124).mirror().addBox(-0.3706F, -0.5F, -1.2136F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.9102F, 7.0498F, -6.8342F, 0.3821F, 0.3932F, -0.1032F));

		PartDefinition cube_r195 = Chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(91, 105).mirror().addBox(-12.1122F, -1.0582F, -0.5489F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.725F, 2.65F, -10.5F, 0.5107F, 0.2323F, -0.4262F));

		PartDefinition cube_r196 = Chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(66, 109).mirror().addBox(-8.1808F, 0.0016F, -0.5489F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.725F, 2.65F, -10.5F, 0.5336F, 0.167F, -0.3105F));

		PartDefinition cube_r197 = Chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(78, 105).mirror().addBox(-4.0665F, 0.7428F, -0.5489F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.725F, 2.65F, -10.5F, 0.552F, 0.0766F, -0.16F));

		PartDefinition cube_r198 = Chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(77, 115).mirror().addBox(-1.765F, -0.3757F, 1.0469F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.65F, -9.2F, 0.7936F, -0.7661F, -0.8346F));

		PartDefinition cube_r199 = Chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(107, 94).mirror().addBox(-2.8849F, -0.3757F, -0.1847F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.65F, -9.2F, 0.5893F, -0.3916F, -0.4705F));

		PartDefinition cube_r200 = Chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(68, 80).addBox(-0.0698F, -0.2265F, -3.2447F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.909F, 8.866F, -2.3114F, 0.0684F, -0.2378F, -0.2938F));

		PartDefinition cube_r201 = Chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(55, 107).addBox(-0.5F, 0.1436F, -3.9738F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(77, 115).addBox(-1.235F, -0.3757F, 1.0469F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.325F, 2.65F, -9.2F, 0.7936F, 0.7661F, 0.8346F));

		PartDefinition cube_r203 = Chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(66, 88).addBox(-0.0646F, -0.296F, -0.961F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0203F, 2.6767F, 24.5543F, 3.1112F, -0.0101F, -2.8662F));

		PartDefinition cube_r204 = Chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(102, 83).addBox(11.578F, 0.1576F, -10.2702F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(18.0102F, 5.5498F, 11.4658F, 3.1104F, -0.2729F, -2.893F));

		PartDefinition cube_r205 = Chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(100, 88).addBox(11.137F, 0.1576F, -3.0627F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0102F, 5.5498F, 11.4658F, 3.0987F, -0.7961F, -2.8708F));

		PartDefinition cube_r206 = Chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(85, 80).addBox(5.5544F, 0.1576F, -1.6738F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(18.0102F, 5.5498F, 11.4658F, 3.0916F, -0.9269F, -2.8615F));

		PartDefinition cube_r207 = Chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 87).addBox(0.0459F, 0.1576F, -0.0373F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0102F, 5.5498F, 11.4658F, 3.0513F, -1.2317F, -2.8163F));

		PartDefinition cube_r208 = Chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(49, 88).addBox(12.6294F, -0.2589F, -5.0228F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(15.9102F, 7.0498F, -7.5342F, 2.7077F, -1.3774F, -2.474F));

		PartDefinition cube_r209 = Chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(83, 88).addBox(7.2095F, -0.2589F, -3.3316F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.9102F, 7.0498F, -7.5342F, 2.0768F, -1.4783F, -1.8378F));

		PartDefinition cube_r210 = Chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(17, 89).addBox(1.7383F, -0.2589F, -1.685F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(15.9102F, 7.0498F, -7.5342F, 0.4394F, -1.3798F, -0.1916F));

		PartDefinition cube_r211 = Chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(124, 77).addBox(0.2073F, -0.2589F, -0.901F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.9102F, 7.0498F, -7.5342F, 0.15F, -0.9997F, 0.1144F));

		PartDefinition cube_r212 = Chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 124).addBox(-1.6294F, -0.5F, -1.2136F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.9102F, 7.0498F, -6.8342F, 0.3821F, -0.3932F, 0.1032F));

		PartDefinition cube_r213 = Chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 105).addBox(8.1122F, -1.0582F, -0.5489F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.725F, 2.65F, -10.5F, 0.5107F, -0.2323F, 0.4262F));

		PartDefinition cube_r214 = Chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 109).addBox(4.1808F, 0.0016F, -0.5489F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.725F, 2.65F, -10.5F, 0.5336F, -0.167F, 0.3105F));

		PartDefinition cube_r215 = Chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(78, 105).addBox(0.0665F, 0.7428F, -0.5489F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.725F, 2.65F, -10.5F, 0.552F, -0.0766F, 0.16F));

		PartDefinition cube_r216 = Chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(107, 94).addBox(-1.1151F, -0.3757F, -0.1847F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 2.65F, -9.2F, 0.5893F, 0.3916F, 0.4705F));

		PartDefinition cube_r217 = Chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(124, 26).addBox(8.277F, -3.7541F, 2.0331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4199F, 6.0124F, 1.6301F, 1.1788F, 1.7983F));

		PartDefinition cube_r218 = Chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(89, 17).addBox(0.2058F, -0.7251F, 3.3052F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0347F, -0.5334F, 16.4646F, -0.3997F, 0.0788F, 0.1098F));

		PartDefinition cube_r219 = Chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(128, 20).addBox(-0.3479F, -0.1031F, 1.4902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0347F, -0.5334F, 16.4646F, -0.2475F, 0.221F, 0.0192F));

		PartDefinition cube_r220 = Chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(31, 118).addBox(-1.0068F, 0.0548F, -1.4739F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0347F, -0.5334F, 16.4646F, -0.1298F, 0.6705F, 0.0721F));

		PartDefinition cube_r221 = Chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(126, 81).addBox(-0.302F, 0.0548F, -0.1955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0347F, -0.5334F, 16.4646F, -0.1089F, 0.3672F, 0.1138F));

		PartDefinition cube_r222 = Chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 127).addBox(-0.0295F, -0.1031F, 1.5689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0347F, -0.5334F, 16.4646F, -0.2438F, 0.1406F, 0.0397F));

		PartDefinition cube_r223 = Chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(16, 128).addBox(-0.1545F, 0.0552F, -1.532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1847F, -0.7084F, 15.0646F, -0.1281F, -0.229F, 0.2304F));

		PartDefinition cube_r224 = Chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(127, 30).addBox(0.1324F, 0.0552F, -0.3497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1847F, -0.7084F, 15.0646F, -0.1606F, 0.6791F, 0.0997F));

		PartDefinition cube_r225 = Chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(43, 134).addBox(-0.5F, -0.5F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9413F, -0.1817F, 16.699F, -2.9202F, 0.7902F, -2.8135F));

		PartDefinition cube_r226 = Chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(101, 38).addBox(-2.5461F, 0.0552F, -1.4904F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1847F, -0.7084F, 15.0646F, -0.225F, 0.9791F, 0.0134F));

		PartDefinition cube_r227 = Chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(104, 0).addBox(0.0461F, -0.0594F, 1.4334F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1847F, -0.7084F, 15.0646F, -0.305F, 0.6666F, 0.0359F));

		PartDefinition cube_r228 = Chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(112, 49).addBox(-0.3614F, -0.0594F, 1.3615F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1847F, -0.7084F, 15.0646F, -0.327F, 0.7454F, 0.0021F));

		PartDefinition cube_r229 = Chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(83, 9).addBox(0.4011F, -0.9627F, 5.1986F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1847F, -0.7084F, 15.0646F, -0.4228F, 0.6315F, 0.1123F));

		PartDefinition cube_r230 = Chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(124, 127).addBox(-0.1545F, 0.0552F, -1.532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8847F, -0.7834F, 13.1896F, -0.1197F, -0.0607F, 0.2317F));

		PartDefinition cube_r231 = Chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(132, 46).addBox(0.1256F, -0.3851F, -0.6643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.6636F, -0.3017F, 13.8176F, -0.2081F, 1.1471F, -0.0361F));

		PartDefinition cube_r232 = Chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(34, 74).addBox(-0.0554F, -0.7635F, 3.6247F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1636F, -0.3017F, 13.8176F, -0.4542F, 0.7762F, 0.0854F));

		PartDefinition cube_r233 = Chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(22, 112).addBox(-0.5993F, -0.1401F, -0.2701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.1636F, -0.3017F, 13.8176F, -0.3873F, 0.8862F, -0.0487F));

		PartDefinition cube_r234 = Chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(51, 74).addBox(-0.3261F, -0.1401F, -0.1729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1636F, -0.3017F, 13.8176F, -0.3533F, 0.8089F, -0.0033F));

		PartDefinition cube_r235 = Chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(127, 101).addBox(0.7207F, -0.3851F, -0.7176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6636F, -0.3017F, 13.8176F, -0.1284F, 0.8457F, 0.0577F));

		PartDefinition cube_r236 = Chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(117, 127).addBox(0.0416F, 0.0195F, -1.5483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8847F, -1.0834F, 10.7896F, -0.1565F, 0.1152F, 0.1944F));

		PartDefinition cube_r237 = Chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(110, 127).addBox(0.2647F, 0.0195F, -0.2041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8847F, -1.0834F, 10.7896F, -0.2969F, 1.013F, -0.0414F));

		PartDefinition cube_r238 = Chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(102, 77).addBox(0.1248F, -0.0238F, -0.0977F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3636F, -0.5267F, 11.5426F, -0.5332F, 0.929F, -0.2026F));

		PartDefinition cube_r239 = Chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(112, 111).addBox(-0.5509F, -0.0238F, -0.1656F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.3636F, -0.5267F, 11.5426F, -0.6607F, 1.052F, -0.3547F));

		PartDefinition cube_r240 = Chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(65, 35).addBox(0.3041F, -0.6753F, 3.6972F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3636F, -0.5267F, 11.5426F, -0.6098F, 0.9071F, -0.0925F));

		PartDefinition cube_r241 = Chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 132).addBox(-0.4638F, 0.0195F, -0.3116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(0, 131).addBox(-0.8638F, 0.0195F, -0.3116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.8847F, -1.0834F, 10.7896F, -0.5974F, 1.2919F, -0.3667F));

		PartDefinition cube_r242 = Chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(106, 131).addBox(-1.0F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5891F, -0.7182F, 8.1319F, -3.1242F, 1.1865F, -2.8041F));

		PartDefinition cube_r243 = Chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(58, 131).addBox(-0.6771F, -1.044F, 0.8037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(99, 131).addBox(-0.2771F, -1.044F, 0.8037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7886F, -0.7482F, 7.5505F, -0.029F, 1.3441F, 0.2931F));

		PartDefinition cube_r244 = Chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(23, 41).addBox(-0.1841F, -1.8743F, 3.926F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2024F, 0.1537F, 8.1678F, -0.792F, 1.1032F, -0.2558F));

		PartDefinition cube_r245 = Chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(42, 52).addBox(-0.4117F, -0.5F, -4.5093F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(12.403F, 3.4654F, 10.9248F, -0.7115F, 1.1078F, -0.1593F));

		PartDefinition cube_r246 = Chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(112, 61).addBox(-0.7424F, -1.177F, 0.1295F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.2024F, 0.1537F, 8.1678F, -0.2898F, 1.254F, 0.1122F));

		PartDefinition cube_r247 = Chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(11, 105).addBox(-0.037F, -1.177F, 0.1864F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2024F, 0.1537F, 8.1678F, -0.2254F, 1.1611F, 0.181F));

		PartDefinition cube_r248 = Chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(71, 128).addBox(0.7781F, -1.044F, 0.8035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7886F, -0.7482F, 7.5505F, -0.0128F, 1.0387F, 0.3103F));

		PartDefinition cube_r249 = Chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(14, 132).addBox(-0.6553F, -0.3577F, -0.8168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(72, 132).addBox(-1.0553F, -0.3577F, -0.8168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.9886F, -0.4482F, 4.1505F, 0.2455F, 1.3618F, 0.5777F));

		PartDefinition cube_r250 = Chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(131, 127).addBox(-0.0699F, -0.3577F, -0.6282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9886F, -0.4482F, 4.1505F, 0.1033F, 1.0602F, 0.4276F));

		PartDefinition cube_r251 = Chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(33, 106).addBox(-0.3727F, -0.4923F, 1.217F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9886F, -0.4482F, 4.1505F, 0.0066F, 1.2592F, 0.4348F));

		PartDefinition cube_r252 = Chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(101, 111).addBox(-1.0687F, -0.4923F, 1.0323F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.9886F, -0.4482F, 4.1505F, 0.0094F, 1.3552F, 0.4378F));

		PartDefinition cube_r253 = Chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(21, 63).addBox(-0.6074F, -1.2948F, 4.8426F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.9886F, -0.4482F, 4.1505F, -0.6148F, 1.2756F, -0.0553F));

		PartDefinition cube_r254 = Chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(21, 52).addBox(-1.1172F, -1.2948F, 4.8431F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9886F, -0.4482F, 4.1505F, -0.7088F, 1.3101F, -0.153F));

		PartDefinition cube_r255 = Chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(133, 80).addBox(-1.5828F, -0.1153F, -0.6702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.0886F, -0.4232F, 0.9505F, 2.5639F, 1.3331F, 2.8536F));

		PartDefinition cube_r256 = Chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(40, 118).addBox(-0.6424F, -0.1153F, -1.166F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0886F, -0.4232F, 0.9505F, 1.1276F, 1.428F, 1.4003F));

		PartDefinition cube_r257 = Chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 110).addBox(-0.7599F, 0.1836F, 0.0519F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5886F, -0.4232F, 0.9505F, 0.1027F, 1.44F, 0.5289F));

		PartDefinition cube_r258 = Chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(33, 112).addBox(-1.2186F, 0.2752F, -0.0177F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.5886F, -0.4232F, 0.9505F, 0.2973F, 1.5175F, 0.6804F));

		PartDefinition cube_r259 = Chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(44, 41).addBox(-0.2192F, -0.0669F, -0.1969F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1455F, 1.3861F, 2.1362F, 0.0505F, 1.4843F, 0.6551F));

		PartDefinition cube_r260 = Chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 48).addBox(-0.0526F, -0.0669F, -0.0451F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(10.1455F, 1.3861F, 2.1362F, 0.0439F, 1.4712F, 0.6485F));

		PartDefinition cube_r261 = Chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(94, 125).addBox(-1.9817F, -0.7387F, -0.3304F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6886F, 0.9518F, -2.6495F, 1.1042F, 1.1697F, 1.3842F));

		PartDefinition cube_r262 = Chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(79, 109).addBox(-1.1473F, -0.321F, -0.3857F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1886F, 0.9518F, -2.6495F, 1.287F, 1.2497F, 1.7158F));

		PartDefinition cube_r263 = Chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(11, 111).addBox(-2.0239F, -0.321F, -0.4531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.1886F, 0.9518F, -2.6495F, 1.822F, 1.2526F, 2.2778F));

		PartDefinition cube_r264 = Chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 59).addBox(-0.7345F, 0.853F, 0.5102F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(9.5886F, 0.9518F, -2.2495F, 1.8515F, 1.3082F, 2.4199F));

		PartDefinition cube_r265 = Chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(42, 63).addBox(-1.0552F, 0.853F, 0.5093F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5886F, 0.9518F, -2.2495F, 1.9994F, 1.293F, 2.5733F));

		PartDefinition cube_r266 = Chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(84, 30).addBox(-1.7354F, -1.7763F, 2.8366F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.1886F, 2.8518F, -5.2495F, 2.2095F, 1.0971F, 2.7561F));

		PartDefinition cube_r267 = Chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(34, 83).addBox(-2.1566F, -1.7763F, 2.7898F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1886F, 2.8518F, -5.2495F, 2.274F, 1.0699F, 2.8291F));

		PartDefinition cube_r268 = Chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(105, 43).addBox(-1.0087F, -1.4237F, -0.7778F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1886F, 2.8518F, -5.2495F, 1.7614F, 1.1851F, 2.1621F));

		PartDefinition cube_r269 = Chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(104, 105).addBox(-1.8193F, -1.4237F, -0.8153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.1886F, 2.8518F, -5.2495F, 2.1298F, 1.12F, 2.5641F));

		PartDefinition cube_r270 = Chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(124, 90).addBox(-0.8843F, -0.2113F, -0.5573F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0886F, 0.9518F, -4.7495F, 1.4198F, 1.1748F, 1.6755F));

		PartDefinition cube_r271 = Chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(80, 71).addBox(8.8513F, -3.7541F, -7.7277F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -0.4199F, 6.0124F, 0.5604F, 0.7707F, 0.5755F));

		PartDefinition cube_r272 = Chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(51, 80).addBox(-1.1F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9425F, 1.4932F, -6.528F, 0.3919F, -0.058F, 0.1394F));

		PartDefinition cube_r273 = Chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(113, 12).addBox(-0.0833F, -1.0F, -0.1099F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.7731F, 9.8287F, 7.0526F, 1.9642F, 1.4574F, 1.9665F));

		PartDefinition cube_r274 = Chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 0).addBox(-5.087F, 0.111F, -1.4493F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3731F, 9.7287F, 2.1526F, 0.6352F, 1.3059F, 0.3136F));

		PartDefinition cube_r275 = Chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 10).addBox(-0.0564F, 0.111F, -0.9501F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3731F, 9.7287F, 2.1526F, 3.0333F, 1.3962F, 2.7447F));

		PartDefinition cube_r276 = Chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(31, 34).addBox(-1.7104F, -0.4925F, -6.7561F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3731F, 10.3287F, 2.1526F, 3.1171F, 0.6989F, 3.141F));

		PartDefinition cube_r277 = Chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(33, 10).addBox(-0.1697F, -0.4979F, -8.3701F, 6.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.7731F, 10.3287F, 2.1526F, 0.0722F, 1.3074F, 0.0848F));

		PartDefinition cube_r278 = Chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(113, 23).addBox(-0.0446F, -0.9851F, -0.3557F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.7731F, 10.3287F, 2.1526F, 3.0333F, 1.3962F, 3.0501F));

		PartDefinition cube_r279 = Chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(97, 65).addBox(-5.2005F, -0.5619F, 2.1101F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.074F, 9.8217F, -6.1449F, -3.0122F, 0.9998F, -3.0325F));

		PartDefinition cube_r280 = Chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(47, 96).addBox(-0.9394F, -0.5619F, -1.6238F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.074F, 9.8217F, -6.1449F, -0.0743F, 0.3482F, -0.0254F));

		PartDefinition cube_r281 = Chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(13, 95).addBox(0.1104F, -0.5619F, -1.3342F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.074F, 9.8217F, -6.1449F, -0.0755F, -0.3917F, 0.0289F));

		PartDefinition cube_r282 = Chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(37, 130).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 9.8788F, -4.4408F, -0.0946F, -0.7395F, 0.0638F));

		PartDefinition cube_r283 = Chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(63, 71).addBox(-4.574F, -0.5619F, 0.704F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F))
				.texOffs(65, 47).addBox(-8.074F, -0.5619F, -1.296F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.074F, 9.8217F, -6.1449F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r284 = Chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(85, 124).addBox(-0.1312F, -0.5F, -1.212F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(34, 91).addBox(-0.3052F, -0.5F, -4.7123F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5776F, 6.0631F, -5.1377F, 1.1904F, 0.2077F, 0.7948F));

		PartDefinition cube_r285 = Chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(84, 51).addBox(-0.2418F, -0.5F, -0.224F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5776F, 6.0631F, -5.1377F, 1.2586F, -0.3021F, -0.4261F));

		PartDefinition cube_r286 = Chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(121, 69).addBox(-0.4F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.8322F, 5.6506F, -5.065F, 1.1411F, 0.0334F, 0.3914F));

		PartDefinition cube_r287 = Chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -0.2564F, -5.9738F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r288 = Chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(84, 38).addBox(0.225F, -2.1826F, -9.7917F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4199F, 6.0124F, 0.2255F, -0.0177F, 0.1561F));

		PartDefinition cube_r289 = Chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(75, 96).addBox(-1.0F, -0.0247F, 0.0884F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -4.1F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0712F, 2.2485F, -6.9064F, 0.9525F, -0.0104F, 0.0027F));

		PartDefinition cube_r290 = Neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(62, 4).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0712F, -0.1174F, -1.5038F, 0.1978F, -0.0452F, -0.0475F));

		PartDefinition cube_r291 = Neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(110, 117).addBox(-1.4288F, -0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3169F, -2.4772F, -0.304F, -0.2447F, -0.198F));

		PartDefinition cube_r292 = Neck3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(18, 120).addBox(-0.9288F, -1.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 34).addBox(-1.4288F, -0.9F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0002F, 0.156F, -1.7867F, -0.5094F, -0.2463F, 0.178F));

		PartDefinition cube_r293 = Neck4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(138, 87).addBox(-0.929F, -1.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 138).addBox(-0.929F, -1.4F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 61).addBox(-1.429F, -0.9F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0818F, -3.5058F, -0.3056F, -0.0872F, 0.0038F));

		PartDefinition cube_r294 = Head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(23, 36).addBox(-0.429F, 0.0217F, -0.0195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1492F, -3.8382F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(135, 19).addBox(-0.429F, 0.1117F, -0.6297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(28, 95).addBox(-0.429F, 0.1117F, -1.6297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1492F, -4.2382F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(83, 136).addBox(-0.4978F, -0.7777F, -0.4145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4991F, 2.2197F, -10.3167F, 1.3221F, -0.0021F, -0.0031F));

		PartDefinition cube_r297 = Head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(58, 135).addBox(-0.4978F, -0.8461F, 0.0484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4991F, 2.2197F, -10.3167F, 1.0995F, -0.0021F, -0.0031F));

		PartDefinition cube_r298 = Head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(118, 135).addBox(-0.5022F, -0.8343F, -0.6939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4991F, 2.2197F, -10.3167F, 1.6362F, -0.0024F, -0.0109F));

		PartDefinition cube_r299 = Head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(135, 116).addBox(-0.5022F, -0.9214F, -1.067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4991F, 2.2197F, -10.3167F, 1.8413F, -0.0024F, -0.0109F));

		PartDefinition cube_r300 = Head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(53, 135).addBox(-0.5F, 0.0448F, -0.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4642F, -9.8108F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r301 = Head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(130, 123).addBox(-0.5F, -0.425F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6554F, -8.2175F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r302 = Head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(48, 135).addBox(-0.5F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 0.7642F, -8.9108F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r303 = Head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(133, 105).addBox(-0.429F, -0.0381F, -2.0557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(93, 133).addBox(-0.429F, -0.0381F, -1.0557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6492F, -5.7382F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4F, 2.0497F, -8.8515F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 138).addBox(-0.2394F, -0.528F, -1.4609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7082F, -0.2097F, 0.1937F, -0.0007F, 0.7256F, -0.1588F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(24, 138).addBox(-0.3025F, -0.5564F, -0.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7082F, -0.2097F, 0.1937F, 0.021F, 0.5967F, -0.1604F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(14, 136).addBox(-0.4829F, -0.191F, -0.3826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.3558F, -0.1993F, -1.3938F, 0.2727F, 0.7605F, 0.0706F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(60, 35).addBox(0.6F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(28, 134).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.329F, -3.3214F, 2.1266F, 0.397F, -0.0612F, 0.1448F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(50, 126).addBox(0.0F, -0.0381F, -1.0557F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -3.6989F, 3.1132F, 0.3987F, -0.0476F, 0.1125F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(63, 136).addBox(-0.4829F, -0.5963F, -0.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(44, 130).addBox(-0.4829F, -0.2963F, -1.0197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.3558F, -0.1993F, -1.3938F, 0.6654F, 0.7605F, 0.0706F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(94, 120).addBox(0.0F, -0.5F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7F, -1.3792F, 1.0652F, 0.1445F, 0.2592F, 0.0373F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(13, 99).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9991F, -0.6706F, 3.3442F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(13, 99).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.9991F, -0.6706F, 3.3442F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(13, 99).addBox(-2.8204F, -2.1498F, -3.2752F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, 0.06F, 0.4792F, 0.0451F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(134, 134).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.665F, -1.5189F, 0.6193F, 0.5374F, 0.2918F, 0.1058F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(19, 136).addBox(-0.4829F, -0.5963F, -0.6197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.5558F, -0.1993F, -1.3938F, 0.6654F, 0.7605F, 0.0706F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(98, 135).addBox(-1.0F, 0.0147F, -1.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -1.7856F, 0.0406F, 0.2695F, 0.2549F, 0.0602F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(103, 135).addBox(-0.961F, -0.0341F, -0.9942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4856F, -0.8844F, 0.8383F, 0.464F, 0.1683F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(79, 132).addBox(0.0496F, -1.8731F, -2.1103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.4F, 2.2F, -0.1551F, 0.3949F, -0.1896F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(112, 122).addBox(-0.2282F, -0.5213F, -0.0389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7082F, -0.2097F, 0.1937F, -0.1396F, 0.2917F, -0.1796F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(123, 135).addBox(-1.4248F, -3.9847F, -2.8241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -0.5244F, 0.1731F, -0.0062F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(126, 6).addBox(-0.8532F, 0.9631F, -2.5111F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -2.3854F, -0.0971F, -0.0712F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(33, 134).addBox(-0.5F, -0.975F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.335F, -1.8882F, 1.7263F, 0.8991F, 0.16F, 0.1715F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(23, 128).addBox(-0.8532F, -1.3872F, -3.7124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -1.5564F, -0.0971F, -0.0712F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(78, 136).addBox(-1.4544F, -3.4657F, -2.5292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -0.7776F, -0.0088F, 0.0981F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(88, 136).addBox(-1.4544F, -3.9847F, -2.5635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -0.5158F, -0.0088F, 0.0981F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(128, 135).addBox(-1.7581F, -4.6596F, -2.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -0.1259F, 0.2077F, 0.0709F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(130, 68).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0217F, -3.5014F, 6.7972F, -0.1425F, 0.3451F, 0.0327F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(133, 24).addBox(-2.3288F, -5.0331F, -3.0345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(133, 76).addBox(-1.3288F, -5.0331F, -3.0345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.235F, 1.0197F, 7.4389F, 0.1154F, 0.4868F, 0.1441F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(132, 109).addBox(-1.4544F, -4.6596F, -2.6482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, -0.1231F, -0.0088F, 0.0981F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(108, 135).addBox(-0.4F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4734F, -3.3727F, 4.0791F, 0.2872F, -0.8977F, -0.2247F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(123, 48).addBox(-1.0F, 0.0F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1336F, -3.9743F, 4.9911F, 0.1639F, 0.5112F, 0.1092F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(99, 117).addBox(-2.9512F, -4.3576F, 1.0245F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, 0.1479F, -1.1196F, 0.0134F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(130, 119).addBox(-2.2525F, -2.0554F, -0.1104F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4481F, -1.4444F, 3.077F, 1.2247F, -0.8186F, -1.245F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(131, 94).addBox(-3.219F, -5.192F, 0.4768F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, 0.567F, -0.878F, -0.5601F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(135, 113).addBox(-0.9343F, -3.5446F, -2.5271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 137).addBox(-1.1093F, -3.5446F, -2.5271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 137).addBox(-1.1593F, -4.0446F, -2.0271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(38, 137).addBox(-1.1593F, -3.0446F, -2.0271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, 0.1587F, 0.5196F, -0.0707F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(93, 137).addBox(-1.1593F, -4.5105F, -1.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(137, 67).addBox(-1.1593F, -4.5105F, -1.2901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, 0.5514F, 0.5196F, -0.0707F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(137, 119).addBox(-1.1593F, -2.5663F, -3.301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, -0.4958F, 0.5196F, -0.0707F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(48, 138).addBox(-1.1593F, -2.2621F, -4.2179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(29, 138).addBox(-1.1593F, -2.2621F, -3.5679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, -0.186F, 0.5196F, -0.0707F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(137, 122).addBox(-1.1593F, -3.2752F, -0.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, 0.5339F, 0.5196F, -0.0707F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(132, 72).addBox(-0.9225F, -1.8297F, -2.0917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.235F, 1.0197F, 7.4389F, 0.0375F, 0.1814F, -0.083F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(22, 106).addBox(-0.8699F, -1.7246F, -3.9378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, -0.0703F, 0.5442F, -0.1788F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(28, 98).addBox(-1.1843F, -3.6873F, -4.6358F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 5.3389F, -0.0595F, 0.5196F, -0.0707F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 125).addBox(-0.8033F, -4.0554F, -1.4833F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.835F, 1.0197F, 8.1389F, 0.0486F, -0.0883F, -0.0993F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(132, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.329F, -3.8359F, 3.5376F, 0.2253F, -0.0274F, 0.1191F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(126, 11).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0386F, -1.6547F, 5.792F, 0.0408F, 0.443F, -0.0723F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(124, 86).addBox(-2.7194F, -4.289F, 0.8565F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.235F, 1.0197F, 7.4389F, 0.1013F, -1.1678F, -0.0834F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(90, 109).addBox(-2.1F, -0.5F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.7306F, 6.0721F, 0.05F, -0.1309F, -0.0038F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(9, 120).addBox(-0.3F, -0.5F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1F, -2.7306F, 6.0721F, 0.052F, -0.3052F, -0.0129F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2579F, 2.0497F, -8.8515F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 138).mirror().addBox(-0.7606F, -0.528F, -1.4609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7082F, -0.2097F, 0.1937F, -0.0007F, -0.7256F, 0.1588F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(24, 138).mirror().addBox(-0.6975F, -0.5564F, -0.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7082F, -0.2097F, 0.1937F, 0.021F, -0.5967F, 0.1604F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(14, 136).mirror().addBox(-0.5171F, -0.191F, -0.3826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(1.3558F, -0.1993F, -1.3938F, 0.2727F, -0.7605F, -0.0706F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-1.6F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(28, 134).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.329F, -3.3214F, 2.1266F, 0.397F, 0.0612F, -0.1448F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(50, 126).mirror().addBox(-2.0F, -0.0381F, -1.0557F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, -3.6989F, 3.1132F, 0.3987F, 0.0476F, -0.1125F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(63, 136).mirror().addBox(-0.5171F, -0.5963F, -0.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(44, 130).mirror().addBox(-0.5171F, -0.2963F, -1.0197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(1.3558F, -0.1993F, -1.3938F, 0.6654F, -0.7605F, -0.0706F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(94, 120).mirror().addBox(-1.0F, -0.5F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7F, -1.3792F, 1.0652F, 0.1445F, -0.2592F, -0.0373F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(13, 99).mirror().addBox(0.8204F, -2.1498F, -3.2752F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, 0.06F, -0.4792F, -0.0451F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(134, 134).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.665F, -1.5189F, 0.6193F, 0.5374F, -0.2918F, -0.1058F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(19, 136).mirror().addBox(-0.5171F, -0.5963F, -0.6197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.5558F, -0.1993F, -1.3938F, 0.6654F, -0.7605F, -0.0706F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(98, 135).mirror().addBox(0.0F, 0.0147F, -1.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.7856F, 0.0406F, 0.2695F, -0.2549F, -0.0602F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(103, 135).mirror().addBox(-0.039F, -0.0341F, -0.9942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.4856F, -0.8844F, 0.8383F, -0.464F, -0.1683F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(79, 132).mirror().addBox(-1.0496F, -1.8731F, -2.1103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.4F, 2.2F, -0.1551F, -0.3949F, 0.1896F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(112, 122).mirror().addBox(-0.7717F, -0.5213F, -0.0389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7082F, -0.2097F, 0.1937F, -0.1396F, -0.2917F, 0.1796F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(123, 135).mirror().addBox(0.4248F, -3.9847F, -2.8241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -0.5244F, -0.1731F, 0.0062F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(126, 6).mirror().addBox(-0.1468F, 0.9631F, -2.5111F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -2.3854F, 0.0971F, 0.0712F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(33, 134).mirror().addBox(-0.5F, -0.975F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.335F, -1.8882F, 1.7263F, 0.8991F, -0.16F, -0.1715F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(23, 128).mirror().addBox(-0.1468F, -1.3872F, -3.7124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -1.5564F, 0.0971F, 0.0712F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(78, 136).mirror().addBox(0.4544F, -3.4657F, -2.5292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -0.7776F, 0.0088F, -0.0981F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(88, 136).mirror().addBox(0.4544F, -3.9847F, -2.5635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -0.5158F, 0.0088F, -0.0981F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(128, 135).mirror().addBox(0.7581F, -4.6596F, -2.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -0.1259F, -0.2077F, -0.0709F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(130, 68).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0217F, -3.5014F, 6.7972F, -0.1425F, -0.3451F, -0.0327F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(133, 24).mirror().addBox(1.3288F, -5.0331F, -3.0345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 76).mirror().addBox(0.3288F, -5.0331F, -3.0345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.235F, 1.0197F, 7.4389F, 0.1154F, -0.4868F, -0.1441F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(132, 109).mirror().addBox(0.4544F, -4.6596F, -2.6482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, -0.1231F, 0.0088F, -0.0981F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(108, 135).mirror().addBox(-0.6F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4734F, -3.3727F, 4.0791F, 0.2872F, 0.8977F, 0.2247F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(123, 48).mirror().addBox(-1.0F, 0.0F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1336F, -3.9743F, 4.9911F, 0.1639F, -0.5112F, -0.1092F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(99, 117).mirror().addBox(-1.0488F, -4.3576F, 1.0245F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, 0.1479F, 1.1196F, -0.0134F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(130, 119).mirror().addBox(0.2525F, -2.0554F, -0.1104F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4481F, -1.4444F, 3.077F, 1.2247F, 0.8186F, 1.245F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(131, 94).mirror().addBox(1.219F, -5.192F, 0.4768F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, 0.567F, 0.878F, 0.5601F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(135, 113).mirror().addBox(-0.0657F, -3.5446F, -2.5271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 137).mirror().addBox(0.1093F, -3.5446F, -2.5271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 137).mirror().addBox(0.1593F, -4.0446F, -2.0271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(38, 137).mirror().addBox(0.1593F, -3.0446F, -2.0271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, 0.1587F, -0.5196F, 0.0707F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(93, 137).mirror().addBox(0.1593F, -4.5105F, -1.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(137, 67).mirror().addBox(0.1593F, -4.5105F, -1.2901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, 0.5514F, -0.5196F, 0.0707F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(137, 119).mirror().addBox(0.1593F, -2.5663F, -3.301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, -0.4958F, -0.5196F, 0.0707F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(48, 138).mirror().addBox(0.1593F, -2.2621F, -4.2179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(29, 138).mirror().addBox(0.1593F, -2.2621F, -3.5679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, -0.186F, -0.5196F, 0.0707F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(137, 122).mirror().addBox(0.1593F, -3.2752F, -0.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, 0.5339F, -0.5196F, 0.0707F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(132, 72).mirror().addBox(-0.0775F, -1.8297F, -2.0917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.235F, 1.0197F, 7.4389F, 0.0375F, -0.1814F, 0.083F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(22, 106).mirror().addBox(-0.1301F, -1.7246F, -3.9378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, -0.0703F, -0.5442F, 0.1788F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(28, 98).mirror().addBox(0.1843F, -3.6873F, -4.6358F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 5.3389F, -0.0595F, -0.5196F, 0.0707F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-0.1967F, -4.0554F, -1.4833F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.835F, 1.0197F, 8.1389F, 0.0486F, 0.0883F, 0.0993F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(132, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.329F, -3.8359F, 3.5376F, 0.2253F, 0.0274F, -0.1191F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(126, 11).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0386F, -1.6547F, 5.792F, 0.0408F, -0.443F, 0.0723F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(124, 86).mirror().addBox(-0.2806F, -4.289F, 0.8565F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.235F, 1.0197F, 7.4389F, 0.1013F, 1.1678F, 0.0834F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 109).mirror().addBox(0.1F, -0.5F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -2.7306F, 6.0721F, 0.05F, 0.1309F, 0.0038F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(9, 120).mirror().addBox(-1.7F, -0.5F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -2.7306F, 6.0721F, 0.052F, 0.3052F, 0.0129F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.4765F, -1.5936F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(85, 128).mirror().addBox(-0.2281F, -0.1628F, -3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3929F, 0.5948F, -4.9178F, -0.5735F, -0.6425F, 0.0113F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(103, 127).mirror().addBox(-0.2281F, -1.9275F, -3.1197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.3929F, 0.5948F, -4.9178F, -0.0238F, -0.6425F, 0.0113F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(134, 53).mirror().addBox(-0.2281F, -0.4427F, -2.3911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3929F, 0.5948F, -4.9178F, -0.6957F, -0.6425F, 0.0113F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(134, 36).mirror().addBox(-0.3464F, -0.4319F, -3.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8929F, 0.5948F, 0.8822F, -0.3702F, -0.184F, 0.0275F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(134, 100).mirror().addBox(-0.3464F, -0.4245F, -2.9294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(134, 39).mirror().addBox(-0.3545F, -0.119F, -2.9862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(134, 97).mirror().addBox(-0.3464F, -0.4245F, -3.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(38, 134).mirror().addBox(-0.3545F, -0.119F, -3.5862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(133, 137).mirror().addBox(-0.3464F, -0.9245F, -3.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-4.8929F, 0.5948F, 0.8822F, -0.1957F, -0.184F, 0.0275F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 135).mirror().addBox(-0.1305F, -1.0787F, -0.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(134, 42).mirror().addBox(-0.1386F, -0.7732F, -0.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-4.4929F, 0.5948F, -2.5178F, -0.1794F, -0.7124F, 0.014F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(134, 64).mirror().addBox(-0.3464F, 1.6739F, -1.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8929F, 0.5948F, 0.8822F, -1.4697F, -0.184F, 0.0275F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(134, 50).mirror().addBox(-0.3428F, 1.6938F, -0.6337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.8929F, 0.5948F, 0.8822F, -1.5573F, -0.1823F, 0.0293F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(116, 43).mirror().addBox(-0.1305F, -0.9346F, -3.3339F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-4.4929F, 0.5948F, -2.5178F, -0.162F, -0.7124F, 0.014F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(128, 16).mirror().addBox(-0.1877F, -1.3007F, -1.7148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-2.3929F, 0.5948F, -4.9178F, -0.1219F, -0.6039F, -0.0004F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(126, 105).mirror().addBox(-0.1877F, -0.8008F, -1.7646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(65, 132).mirror().addBox(-0.1877F, -1.7749F, -1.7274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3929F, 0.5948F, -4.9178F, -0.1263F, -0.6039F, -0.0004F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(22, 118).mirror().addBox(-0.1386F, -0.8794F, -3.3455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4929F, 0.5948F, -2.5178F, 0.0126F, -0.7124F, 0.014F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(27, 123).mirror().addBox(-0.1305F, -1.5998F, -3.2965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-4.4929F, 0.5948F, -2.5178F, -0.0572F, -0.7124F, 0.014F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(134, 131).mirror().addBox(-0.1305F, -1.5755F, -0.7703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4929F, 0.5948F, -2.5178F, -0.1096F, -0.7124F, 0.014F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(133, 91).mirror().addBox(-0.3464F, -0.6908F, -2.72F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-4.8929F, 0.5948F, 0.8822F, -0.2567F, -0.184F, 0.0275F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(127, 57).mirror().addBox(-0.1468F, -0.6972F, -0.8036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-4.5929F, 0.593F, 0.8811F, 0.6009F, 0.0715F, -0.0175F));

		PartDefinition cube_r408 = Jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(78, 128).mirror().addBox(-0.1468F, -0.8133F, -2.1855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5929F, 0.593F, 0.8811F, -0.1714F, 0.0715F, -0.0175F));

		PartDefinition cube_r409 = Jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(64, 127).mirror().addBox(-0.1805F, -0.3526F, -2.2214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-4.5929F, 0.593F, 0.8811F, -0.1415F, 0.0544F, -0.1343F));

		PartDefinition cube_r410 = Jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(85, 128).addBox(-0.7719F, -0.1628F, -3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.535F, 0.5948F, -4.9178F, -0.5735F, 0.6425F, -0.0113F));

		PartDefinition cube_r411 = Jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(103, 127).addBox(-0.7719F, -1.9275F, -3.1197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.535F, 0.5948F, -4.9178F, -0.0238F, 0.6425F, -0.0113F));

		PartDefinition cube_r412 = Jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(134, 53).addBox(-0.7719F, -0.4427F, -2.3911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.535F, 0.5948F, -4.9178F, -0.6957F, 0.6425F, -0.0113F));

		PartDefinition cube_r413 = Jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(86, 133).addBox(-1.5505F, -0.425F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.6215F, -0.9015F, -7.093F, -0.6719F, 0.0025F, 0.0013F));

		PartDefinition cube_r414 = Jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(113, 135).addBox(-0.5F, -0.65F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0699F, -0.9976F, -7.5824F, -0.6719F, 0.0025F, 0.0013F));

		PartDefinition cube_r415 = Jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(133, 84).addBox(-1.5505F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6215F, -0.9015F, -7.093F, -0.192F, 0.0025F, 0.0013F));

		PartDefinition cube_r416 = Jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(134, 36).addBox(-0.6536F, -0.4319F, -3.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.035F, 0.5948F, 0.8822F, -0.3702F, 0.184F, -0.0275F));

		PartDefinition cube_r417 = Jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(134, 100).addBox(-0.6536F, -0.4245F, -2.9294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(134, 39).addBox(-0.6455F, -0.119F, -2.9862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(134, 97).addBox(-0.6536F, -0.4245F, -3.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(38, 134).addBox(-0.6455F, -0.119F, -3.5862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(133, 137).addBox(-0.6536F, -0.9245F, -3.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(5.035F, 0.5948F, 0.8822F, -0.1957F, 0.184F, -0.0275F));

		PartDefinition cube_r418 = Jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 135).addBox(-0.8695F, -1.0787F, -0.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(134, 42).addBox(-0.8614F, -0.7732F, -0.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(4.635F, 0.5948F, -2.5178F, -0.1794F, 0.7124F, -0.014F));

		PartDefinition cube_r419 = Jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(134, 64).addBox(-0.6536F, 1.6739F, -1.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.035F, 0.5948F, 0.8822F, -1.4697F, 0.184F, -0.0275F));

		PartDefinition cube_r420 = Jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(134, 50).addBox(-0.6572F, 1.6938F, -0.6337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.035F, 0.5948F, 0.8822F, -1.5573F, 0.1823F, -0.0293F));

		PartDefinition cube_r421 = Jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(116, 43).addBox(-0.8695F, -0.9346F, -3.3339F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(4.635F, 0.5948F, -2.5178F, -0.162F, 0.7124F, -0.014F));

		PartDefinition cube_r422 = Jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(128, 16).addBox(-0.8123F, -1.3007F, -1.7148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(2.535F, 0.5948F, -4.9178F, -0.1219F, 0.6039F, 0.0004F));

		PartDefinition cube_r423 = Jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(126, 105).addBox(-0.8123F, -0.8008F, -1.7646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(65, 132).addBox(-0.8123F, -1.7749F, -1.7274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.535F, 0.5948F, -4.9178F, -0.1263F, 0.6039F, 0.0004F));

		PartDefinition cube_r424 = Jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(22, 118).addBox(-0.8614F, -0.8794F, -3.3455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.635F, 0.5948F, -2.5178F, 0.0126F, 0.7124F, -0.014F));

		PartDefinition cube_r425 = Jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(27, 123).addBox(-0.8695F, -1.5998F, -3.2965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(4.635F, 0.5948F, -2.5178F, -0.0572F, 0.7124F, -0.014F));

		PartDefinition cube_r426 = Jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(134, 131).addBox(-0.8695F, -1.5755F, -0.7703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.635F, 0.5948F, -2.5178F, -0.1096F, 0.7124F, -0.014F));

		PartDefinition cube_r427 = Jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(133, 91).addBox(-0.6536F, -0.6908F, -2.72F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(5.035F, 0.5948F, 0.8822F, -0.2567F, 0.184F, -0.0275F));

		PartDefinition cube_r428 = Jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(127, 57).addBox(-0.8532F, -0.6972F, -0.8036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(4.735F, 0.593F, 0.8811F, 0.6009F, -0.0715F, 0.0175F));

		PartDefinition cube_r429 = Jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(78, 128).addBox(-0.8532F, -0.8133F, -2.1855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.735F, 0.593F, 0.8811F, -0.1714F, -0.0715F, 0.0175F));

		PartDefinition cube_r430 = Jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(64, 127).addBox(-0.8195F, -0.3526F, -2.2214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(4.735F, 0.593F, 0.8811F, -0.1415F, -0.0544F, 0.1343F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.0436F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6269F, 7.0981F, -3.049F, 0.5477F, 0.8231F, 0.2208F));

		PartDefinition cube_r431 = FrontFlipperR2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(85, 0).addBox(-1.0F, -0.5F, -0.8F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2412F, -0.1811F, -1.7191F, 0.0F, 0.2705F, 0.0F));

		PartDefinition cube_r432 = FrontFlipperR2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(127, 131).addBox(3.7F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(5.2607F, -0.1811F, -1.7777F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r433 = FrontFlipperR2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(55, 113).addBox(-2.6F, -1.5F, 1.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.6215F, 0.3189F, 0.8991F, 3.1407F, 0.4363F, -3.1397F));

		PartDefinition cube_r434 = FrontFlipperR2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(58, 118).addBox(-1.8673F, -1.0F, -2.225F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.4833F, -0.1811F, -0.8534F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r435 = FrontFlipperR2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(113, 77).addBox(-18.1684F, 2.1028F, -0.5567F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.8934F, -3.2839F, -18.3595F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r436 = FrontFlipperR2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(134, 28).addBox(-1.0272F, -1.4737F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7501F, 0.2925F, 0.2735F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r437 = FrontFlipperR2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(49, 118).addBox(-1.9527F, -1.4181F, -0.947F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7526F, 0.237F, -0.8021F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r438 = FrontFlipperR2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(115, 105).addBox(-2.7159F, -0.5F, 0.0035F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.0426F, -0.1811F, 1.7569F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r439 = FrontFlipperR2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(114, 38).addBox(-2.7148F, -1.5F, 0.1334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4426F, 0.3189F, 3.2569F, 0.0F, -2.6616F, 0.0F));

		PartDefinition cube_r440 = FrontFlipperR2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(52, 102).addBox(-0.7F, -1.5F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1426F, 0.3189F, 0.2569F, 0.0F, -2.0071F, 0.0F));

		PartDefinition cube_r441 = FrontFlipperR2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(85, 84).addBox(-2.7F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9332F, -0.1811F, -1.176F, 0.0F, 0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(97, 61).addBox(1.9649F, -0.3972F, -2.3954F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.2544F, -0.2839F, -0.3736F, 0.0216F, -0.5826F, 0.6319F));

		PartDefinition cube_r442 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(115, 82).addBox(-0.8F, -0.5F, 1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5351F, 0.1028F, -1.3954F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r443 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(120, 94).addBox(-5.1F, -0.5F, -1.8F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 97).addBox(-1.1F, -0.5F, -2.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9649F, 0.1028F, 2.5046F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r444 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(133, 4).addBox(-0.6F, -0.5F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3666F, 0.1028F, 6.6646F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r445 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(125, 38).addBox(-1.3F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8507F, 0.1028F, 6.3188F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r446 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(53, 138).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2649F, 0.1028F, 4.9046F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r447 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(101, 100).addBox(-1.2F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0036F, 0.1028F, 2.4902F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r448 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(7, 125).addBox(-0.5F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5649F, 0.1028F, -0.2954F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r449 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(66, 22).addBox(-3.5F, 0.0F, -2.8F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.3758F, 0.1032F, -1.5442F, -0.0014F, 0.2879F, -0.004F));

		PartDefinition cube_r450 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(77, 94).addBox(-3.9F, 0.0F, -0.6F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.666F, 0.1102F, 4.5361F, -0.0013F, 0.0261F, -0.0036F));

		PartDefinition cube_r451 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(82, 69).addBox(-4.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.8002F, 0.1066F, 2.1862F, -0.0013F, 0.157F, -0.0038F));

		PartDefinition cube_r452 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(99, 30).addBox(-4.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.9958F, 0.1031F, 0.0763F, -0.0014F, 0.2442F, -0.0039F));

		PartDefinition cube_r453 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(77, 92).addBox(-3.7F, 0.0F, 0.2F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.3062F, 0.1021F, -2.5418F, -0.0014F, 0.3315F, -0.0041F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1028F, -0.0341F, -0.1264F, 0.264F));

		PartDefinition cube_r454 = FrontFlipperEndR2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(66, 18).addBox(-7.0F, 0.0F, 2.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 21).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.972F, 0.0119F, 0.8857F, -0.0018F, 0.1133F, -0.0036F));

		PartDefinition cube_r455 = FrontFlipperEndR2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(35, 7).addBox(-7.0F, 0.0F, -0.3F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3344F, 0.0085F, -2.2502F, -0.0018F, 0.2006F, -0.0038F));

		PartDefinition cube_r456 = FrontFlipperEndR2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(35, 25).addBox(-7.0F, 0.0F, -2.2F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2647F, 0.0069F, -3.2477F, -0.0019F, 0.2879F, -0.0039F));

		PartDefinition FrontFlipperR4 = Chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6269F, 7.0981F, -3.049F, 0.536F, -0.6119F, -0.6308F));

		PartDefinition cube_r457 = FrontFlipperR4.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(85, 4).addBox(-6.0F, -0.5F, -0.8F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.2412F, -0.1811F, -1.7191F, 0.0F, -0.2705F, 0.0F));

		PartDefinition cube_r458 = FrontFlipperR4.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(132, 57).addBox(-5.7F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-5.2607F, -0.1811F, -1.7777F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r459 = FrontFlipperR4.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(66, 113).addBox(-0.4F, -1.5F, 1.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-6.6215F, 0.3189F, 0.8991F, 3.1407F, -0.4363F, 3.1397F));

		PartDefinition cube_r460 = FrontFlipperR4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(119, 117).addBox(-0.1327F, -1.0F, -2.225F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.4833F, -0.1811F, -0.8534F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r461 = FrontFlipperR4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(113, 87).addBox(15.1684F, 2.1028F, -0.5567F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.8934F, -3.2839F, -18.3595F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r462 = FrontFlipperR4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(134, 32).addBox(0.0272F, -1.4737F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7501F, 0.2925F, 0.2735F, 0.0F, 1.5272F, 0.0F));

		PartDefinition cube_r463 = FrontFlipperR4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(85, 119).addBox(-0.0473F, -1.4181F, -0.947F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7526F, 0.237F, -0.8021F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r464 = FrontFlipperR4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(116, 34).addBox(-0.2841F, -0.5F, 0.0035F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.0426F, -0.1811F, 1.7569F, 0.0F, 2.0944F, 0.0F));

		PartDefinition cube_r465 = FrontFlipperR4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(114, 98).addBox(-0.2852F, -1.5F, 0.1334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4426F, 0.3189F, 3.2569F, 0.0F, 2.6616F, 0.0F));

		PartDefinition cube_r466 = FrontFlipperR4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(65, 102).addBox(-3.3F, -1.5F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.1426F, 0.3189F, 0.2569F, 0.0F, 2.0071F, 0.0F));

		PartDefinition cube_r467 = FrontFlipperR4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(86, 47).addBox(-3.3F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9332F, -0.1811F, -1.176F, 0.0F, -0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR4 = FrontFlipperR4.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create().texOffs(98, 12).addBox(-6.9649F, -0.3972F, -2.3954F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.2544F, -0.2839F, -0.3736F, 0.1709F, 0.7562F, -0.6091F));

		PartDefinition cube_r468 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(88, 115).addBox(-2.2F, -0.5F, 1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5351F, 0.1028F, -1.3954F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r469 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(121, 74).addBox(1.1F, -0.5F, -1.8F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 0).addBox(-0.9F, -0.5F, -2.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.9649F, 0.1028F, 2.5046F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r470 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(133, 12).addBox(-0.4F, -0.5F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3666F, 0.1028F, 6.6646F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r471 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(125, 64).addBox(-0.7F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8507F, 0.1028F, 6.3188F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r472 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(58, 138).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.2649F, 0.1028F, 4.9046F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r473 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(102, 16).addBox(-1.8F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0036F, 0.1028F, 2.4902F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r474 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(125, 42).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5649F, 0.1028F, -0.2954F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r475 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(80, 78).addBox(-5.5F, 0.0F, -2.8F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.3758F, 0.1032F, -1.5442F, -0.0014F, -0.2879F, 0.004F));

		PartDefinition cube_r476 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(94, 92).addBox(-3.1F, 0.0F, -0.6F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.666F, 0.1102F, 4.5361F, -0.0013F, -0.0261F, 0.0036F));

		PartDefinition cube_r477 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(84, 59).addBox(-3.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.8002F, 0.1066F, 2.1862F, -0.0013F, -0.157F, 0.0038F));

		PartDefinition cube_r478 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(99, 32).addBox(-2.8F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.9958F, 0.1031F, 0.0763F, -0.0014F, -0.2442F, 0.0039F));

		PartDefinition cube_r479 = FrontFlipperMiddleR4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(13, 93).addBox(-3.3F, 0.0F, 0.2F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.3062F, 0.1021F, -2.5418F, -0.0014F, -0.3315F, 0.0041F));

		PartDefinition FrontFlipperEndR4 = FrontFlipperMiddleR4.addOrReplaceChild("FrontFlipperEndR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1028F, -0.0285F, 0.1278F, -0.22F));

		PartDefinition cube_r480 = FrontFlipperEndR4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(66, 20).addBox(-3.0F, 0.0F, 2.0F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 23).addBox(-7.0F, 0.0F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.972F, 0.0119F, 0.8857F, -0.0018F, -0.1133F, 0.0036F));

		PartDefinition cube_r481 = FrontFlipperEndR4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(35, 19).addBox(-7.0F, 0.0F, -0.3F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3344F, 0.0085F, -2.2502F, -0.0018F, -0.2006F, 0.0038F));

		PartDefinition cube_r482 = FrontFlipperEndR4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(65, 45).addBox(-3.0F, 0.0F, -2.2F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2647F, 0.0069F, -3.2477F, -0.0019F, -0.2879F, 0.0039F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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