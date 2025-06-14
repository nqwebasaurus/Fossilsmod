package fossils.fossils.client.blockentity.model.chasmosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChasmosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart browHorn;
	private final ModelPart rightFace;
	private final ModelPart browHorn2;
	private final ModelPart nasalHorn;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ChasmosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.browHorn = this.leftFace.getChild("browHorn");
		this.rightFace = this.head.getChild("rightFace");
		this.browHorn2 = this.rightFace.getChild("browHorn2");
		this.nasalHorn = this.head.getChild("nasalHorn");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.7F, 4.1F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.2F, -7.8F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4608F, 3.6806F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 97).addBox(0.0F, -1.5314F, -0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6608F, 6.8806F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3583F, 2.9078F, -6.325F, 0.6288F, 0.049F, 0.0184F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3733F, 2.9014F, -6.6321F, 1.6847F, 0.049F, 0.0184F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 47).mirror().addBox(-0.8198F, 0.3371F, -5.2287F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8995F, 3.0104F, 0.7805F, -0.6645F, 0.2555F, 0.0579F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-1.6104F, -4.924F, -2.8259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8995F, 3.0104F, 0.7805F, 0.8557F, 0.049F, 0.0184F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 61).mirror().addBox(-0.5F, -0.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2323F, 2.1154F, -4.0542F, 0.5502F, 0.049F, 0.0184F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-0.4911F, 3.2484F, 3.4166F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 1.9104F, 2.0805F, 0.1457F, 0.1779F, -0.1804F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(69, 92).mirror().addBox(-0.4911F, -1.8927F, 3.1686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 1.9104F, 2.0805F, -0.8404F, 0.1779F, -0.1804F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(-0.9154F, -0.0688F, -0.9181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 0.7104F, -0.0195F, -0.2913F, 0.2585F, 0.0419F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 71).mirror().addBox(-0.9154F, -1.5194F, -1.1355F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 0.7104F, -0.0195F, -0.8498F, 0.2585F, 0.0419F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-0.4221F, -0.5858F, -0.359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 1.9104F, 2.0805F, -0.4539F, 0.1733F, -0.1256F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(72, 58).mirror().addBox(-1.7005F, -0.981F, -0.0396F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(72, 58).addBox(5.2995F, -0.981F, -0.0396F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2995F, -1.0896F, 4.7805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(-1.7005F, -0.2212F, -0.0107F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(72, 22).addBox(5.2995F, -0.2212F, -0.0107F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2995F, -1.9896F, 0.7805F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.792F, -5.1237F, -4.4976F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, 3.0104F, 0.7805F, -0.1109F, 0.0689F, -0.1248F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.7377F, 0.5208F, -4.2728F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.6568F, 1.1618F, 0.0328F, -0.0119F, 0.3489F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 87).mirror().addBox(-1.7005F, -6.0289F, -5.3619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(69, 87).addBox(5.2995F, -6.0289F, -5.3619F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.2995F, 3.0104F, 0.7805F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.263F, -1.2166F, -6.8124F, 0.4239F, 0.3539F, 0.0136F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 60).mirror().addBox(-0.1F, -0.7F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7917F, -1.4016F, -6.2546F, 0.3797F, 0.163F, 0.0632F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7452F, -2.1992F, -4.558F, 0.3439F, 0.0083F, -0.033F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 45).mirror().addBox(0.587F, -0.0699F, -1.0487F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2354F, -3.0374F, -2.4279F, -0.0276F, -0.0498F, -0.0198F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-1.7005F, -0.1352F, -0.065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 82).addBox(5.2995F, -0.1352F, -0.065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2995F, -2.3896F, 5.7805F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-1.7005F, -1.5746F, -2.0615F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(73, 12).addBox(5.2995F, -1.5746F, -2.0615F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2995F, -1.0896F, 3.7805F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-1.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -2.1258F, 7.2374F, 0.0709F, 0.1741F, 0.0123F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-1.4877F, -0.9959F, -0.6402F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2995F, -1.9896F, 0.7805F, -0.0975F, -0.051F, -0.0163F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(63, 26).mirror().addBox(-0.7F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, -2.1659F, 3.7659F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(13, 39).mirror().addBox(-0.5759F, -0.0699F, -1.0739F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.2354F, -3.0374F, -2.4279F, -0.028F, -0.1719F, -0.0164F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 6).addBox(0.4877F, -0.9959F, -0.6402F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, -1.9896F, 0.7805F, -0.0975F, 0.051F, 0.0163F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(13, 39).addBox(-1.4241F, -0.0699F, -1.0739F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.2354F, -3.0374F, -2.4279F, -0.028F, 0.1719F, 0.0164F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 45).addBox(-1.587F, -0.0699F, -1.0487F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2354F, -3.0374F, -2.4279F, -0.0276F, 0.0498F, 0.0198F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(79, 55).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7452F, -2.1992F, -4.558F, 0.3439F, -0.0083F, 0.033F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(80, 5).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.263F, -1.2166F, -6.8124F, 0.4239F, -0.3539F, -0.0136F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 60).addBox(-0.9F, -0.7F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7917F, -1.4016F, -6.2546F, 0.3797F, -0.163F, -0.0632F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 26).addBox(-1.3F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, -2.1659F, 3.7659F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5089F, 3.2484F, 3.4166F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 1.9104F, 2.0805F, 0.1457F, -0.1779F, 0.1804F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 92).addBox(-0.5089F, -1.8927F, 3.1686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, 1.9104F, 2.0805F, -0.8404F, -0.1779F, 0.1804F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 41).addBox(-0.5779F, -0.5858F, -0.359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 1.9104F, 2.0805F, -0.4539F, -0.1733F, 0.1256F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 71).addBox(-0.0846F, -1.5194F, -1.1355F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2995F, 0.7104F, -0.0195F, -0.8498F, -0.2585F, -0.0419F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 85).addBox(-0.0846F, -0.0688F, -0.9181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 0.7104F, -0.0195F, -0.2913F, -0.2585F, -0.0419F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 47).addBox(-0.1802F, 0.3371F, -5.2287F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8995F, 3.0104F, 0.7805F, -0.6645F, -0.2555F, -0.0579F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(85, 67).addBox(0.6104F, -4.924F, -2.8259F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8995F, 3.0104F, 0.7805F, 0.8557F, -0.049F, -0.0184F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(53, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.3733F, 2.9014F, -6.6321F, 1.6847F, -0.049F, -0.0184F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(32, 55).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3583F, 2.9078F, -6.325F, 0.6288F, -0.049F, -0.0184F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(16, 61).addBox(-0.5F, -0.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2323F, 2.1154F, -4.0542F, 0.5502F, -0.049F, -0.0184F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 52).addBox(-0.208F, -5.1237F, -4.4976F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2995F, 3.0104F, 0.7805F, -0.1109F, -0.0689F, 0.1248F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 0).addBox(-1.2623F, 0.5208F, -4.2728F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.6568F, 1.1618F, 0.0328F, 0.0119F, -0.3489F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 87).addBox(0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, -2.1258F, 7.2374F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-3.0F, -0.9636F, -0.6709F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 25).addBox(1.0F, -0.9636F, -0.6709F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -1.9636F, -11.6709F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 7.3181F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(57, 78).addBox(-1.5F, 9.1833F, -4.9553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -0.1001F, -0.7448F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(29, 60).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftleg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 65).addBox(-0.5F, -0.1075F, -1.1404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(9, 71).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.1762F, -3.8099F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftleg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(28, 89).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(11, 82).addBox(-0.1F, -0.4382F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftleg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(41, 53).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftleg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(86, 74).addBox(-1.601F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 85).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4582F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftleg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(16, 82).addBox(-1.5F, -5.8767F, 0.9508F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4865F, 4.6725F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftleg3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 0).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(63, 32).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3596F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftfoot.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(88, 49).addBox(-1.0F, -2.1328F, 1.6482F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(39, 38).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(35, 78).addBox(-1.5F, 9.1833F, -4.9553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, -0.1001F, -0.7448F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 8).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(36, 67).addBox(-1.5F, -0.1075F, -1.1404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(43, 67).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.1762F, -3.8099F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightleg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(21, 89).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(6, 82).addBox(-0.9F, -0.4382F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightleg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(42, 20).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightleg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(86, 15).addBox(-0.399F, 4.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 83).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4582F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightleg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -5.8767F, 0.9508F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.4865F, 4.6725F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightleg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 78).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(61, 15).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightfoot.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 68).addBox(-2.0F, -2.1328F, 1.6482F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(37, 13).addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0227F, -3.8884F, 0.3319F, 0.0413F, 0.0142F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(16, 57).addBox(0.0F, -2.5616F, -4.6978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, 2.6968F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(72, 96).addBox(0.0F, -3.0324F, -0.2933F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0317F, -3.7032F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 67).addBox(0.0F, -3.9694F, -0.1443F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5683F, -9.8032F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(61, 95).addBox(0.0F, -3.3694F, -0.1443F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4317F, -7.8032F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(64, 95).addBox(0.0F, -3.0764F, -0.1077F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1317F, -5.8032F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-1.0F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, -0.3771F, -9.5665F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(93, 57).mirror().addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -1.2611F, -7.7786F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 60).mirror().addBox(-1.0F, 0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -1.6611F, -5.7786F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(95, 33).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(29, 11).mirror().addBox(-13.8804F, -3.7351F, -0.4699F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 31).mirror().addBox(-3.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(8, 55).mirror().addBox(-6.1529F, -3.869F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0415F, 0.2961F, -1.3735F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(29, 13).mirror().addBox(-11.0038F, -3.8478F, -1.5367F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0441F, 0.4531F, -1.3663F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 29).mirror().addBox(-6.8101F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0005F, 0.1778F, -1.3814F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-4.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0108F, 0.0177F, -0.8578F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-10.3996F, -3.7378F, -2.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0006F, 0.4222F, -1.3812F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 53).mirror().addBox(-8.1153F, -3.7578F, -2.4801F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0434F, 0.2688F, -1.3976F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0419F, 0.0421F, -1.3878F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(96, 10).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.1386F, -0.1535F, -0.8476F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.2446F, -0.1044F, -0.2967F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(94, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.5064F, -3.5127F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(69, 58).mirror().addBox(-2.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0554F, -0.0092F, -0.3139F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(91, 83).mirror().addBox(-2.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.2381F, 0.0499F, -0.3101F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(69, 58).addBox(0.9585F, -0.2821F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0554F, 0.0092F, 0.3139F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(91, 35).addBox(2.3843F, -1.7751F, -0.5064F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0108F, -0.0177F, 0.8578F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 7).addBox(6.3996F, -3.7378F, -2.5366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0006F, -0.4222F, 1.3812F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(31, 29).addBox(2.81F, -3.7294F, -0.9246F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7317F, -5.7032F, 0.0005F, -0.1778F, 1.3814F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(29, 13).addBox(6.0038F, -3.8478F, -1.5367F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0441F, -0.4531F, 1.3663F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(8, 55).addBox(2.1529F, -3.869F, -0.5849F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.0415F, -0.2961F, 1.3735F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(95, 31).addBox(1.8252F, -2.259F, -0.3935F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(91, 83).addBox(0.7287F, -0.981F, -0.3059F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6317F, -7.7032F, 0.2381F, -0.0499F, 0.3101F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(29, 11).addBox(2.8804F, -3.7351F, -0.4699F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(95, 33).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(95, 47).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7317F, -9.7032F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(28, 53).addBox(5.1153F, -3.7578F, -2.4801F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0434F, -0.2688F, 1.3976F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 74).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.0419F, -0.0421F, 1.3878F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(96, 10).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.1386F, 0.1535F, 0.8476F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(94, 7).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.5064F, -3.5127F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(39, 60).addBox(-1.0F, 0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -1.6611F, -5.7786F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(93, 57).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -1.2611F, -7.7786F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(93, 13).addBox(-1.0F, 0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, -0.3771F, -9.5665F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 96).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9317F, -3.5032F, -0.2446F, 0.1044F, 0.2967F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(36, 29).addBox(-1.0F, -1.96F, -0.1826F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.7683F, -9.8032F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 31).addBox(-1.0F, -1.3073F, -7.6534F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3683F, 2.6968F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7683F, -10.1032F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(48, 93).addBox(0.0F, -7.0823F, 3.3766F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 94).addBox(0.0F, -6.1823F, 1.6766F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1554F, -6.721F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -4.0288F, -0.0003F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4219F, -1.3496F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(75, 36).mirror().addBox(0.4375F, 0.4704F, -0.281F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, 0.3852F, -1.176F, -0.2027F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(32, 53).mirror().addBox(1.8144F, 0.6068F, -1.5466F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, 0.3761F, -1.246F, -0.3376F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(47, 53).mirror().addBox(2.6842F, 0.8728F, -0.0402F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, -0.0633F, -1.1529F, 0.208F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 15).mirror().addBox(1.0465F, -0.2187F, 2.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(54, 40).mirror().addBox(0.0465F, -0.2187F, -2.2369F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(51, 15).addBox(2.4465F, -0.2187F, 2.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(54, 40).addBox(2.4465F, -0.2187F, -2.2369F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(81, 10).mirror().addBox(0.0465F, 0.2368F, -5.1208F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 10).addBox(2.4465F, 0.2368F, -5.1208F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2465F, 8.9839F, -1.6419F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.7493F, -2.25F, -2.8849F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9446F, 5.812F, -4.2756F, 1.222F, -0.3868F, -0.8037F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(-0.7394F, -2.25F, -0.1133F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9446F, 5.812F, -4.2756F, 1.1152F, -0.2488F, -0.4656F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-1.6271F, 0.0812F, -1.6262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2466F, 2.2871F, -3.1515F, 0.4598F, -0.0672F, 0.0803F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-1.8532F, -1.8217F, -1.056F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2466F, 4.1871F, -2.0515F, 0.931F, -0.0672F, 0.0803F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3385F, -1.2242F, 0.4199F, 0.8961F, -0.0672F, 0.0803F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-1.8532F, -1.0852F, 3.8944F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2466F, 4.1871F, -2.0515F, 1.1056F, -0.0672F, 0.0803F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 15).addBox(-0.2507F, -2.25F, -2.8849F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9446F, 5.812F, -4.2756F, 1.222F, 0.3868F, 0.8037F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(75, 64).addBox(-0.2606F, -2.25F, -0.1133F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9446F, 5.812F, -4.2756F, 1.1152F, 0.2488F, 0.4656F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(66, 15).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.3385F, -1.2242F, 0.4199F, 0.8961F, 0.0672F, -0.0803F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(25, 67).addBox(0.8532F, -1.0852F, 3.8944F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2466F, 4.1871F, -2.0515F, 1.1056F, 0.0672F, -0.0803F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(56, 48).addBox(0.8532F, -1.8217F, -1.056F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2466F, 4.1871F, -2.0515F, 0.931F, 0.0672F, -0.0803F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 92).addBox(0.6271F, 0.0812F, -1.6262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2466F, 2.2871F, -3.1515F, 0.4598F, 0.0672F, -0.0803F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(32, 53).addBox(-2.8144F, 0.6068F, -1.5466F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2465F, 8.9839F, -1.6419F, 0.3761F, 1.246F, 0.3376F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(47, 53).addBox(-3.6841F, 0.8728F, -0.0402F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2465F, 8.9839F, -1.6419F, -0.0633F, 1.1529F, -0.208F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(75, 36).addBox(-1.4375F, 0.4704F, -0.281F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2465F, 8.9839F, -1.6419F, 0.3852F, 1.176F, 0.2027F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(93, 28).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(7, 93).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6124F, -2.8259F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 9).mirror().addBox(-12.6922F, -2.753F, -0.4665F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.5305F, -1.0993F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-11.6922F, -2.753F, -0.4665F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5305F, -2.7993F, 0.0972F, 0.4828F, -1.3567F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-3.708F, -1.0381F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2695F, -4.4993F, 0.4158F, 0.4409F, -0.7624F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(24, 41).mirror().addBox(-9.6922F, -2.753F, -0.4665F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2695F, -4.4993F, 0.1238F, 0.585F, -1.3431F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(95, 76).mirror().addBox(-3.708F, -1.0381F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5305F, -2.7993F, 0.3347F, 0.3673F, -0.7943F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(95, 89).mirror().addBox(-3.708F, -1.0381F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.5305F, -1.0993F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(94, 85).mirror().addBox(-1.9977F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.5305F, -1.0993F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-1.9977F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.5305F, -2.7993F, 0.5061F, 0.1323F, -0.2856F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(-1.9977F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2695F, -4.4993F, 0.6079F, 0.1611F, -0.2707F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(7, 93).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 28).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6124F, -2.8259F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(94, 37).addBox(-0.0023F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2695F, -4.4993F, 0.6079F, -0.1611F, 0.2707F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(75, 95).addBox(1.708F, -1.0381F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2695F, -4.4993F, 0.4158F, -0.4409F, 0.7624F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(24, 41).addBox(2.6922F, -2.753F, -0.4665F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2695F, -4.4993F, 0.1238F, -0.585F, 1.3431F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(40, 94).addBox(-0.0023F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5305F, -2.7993F, 0.5061F, -0.1323F, 0.2856F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(95, 76).addBox(1.708F, -1.0381F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5305F, -2.7993F, 0.3347F, -0.3673F, 0.7943F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(42, 0).addBox(2.6922F, -2.753F, -0.4665F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.5305F, -2.7993F, 0.0972F, -0.4828F, 1.3567F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(94, 85).addBox(-0.0023F, -0.0011F, -0.4289F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.5305F, -1.0993F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(95, 89).addBox(1.708F, -1.0381F, -0.4665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.5305F, -1.0993F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(40, 9).addBox(2.6922F, -2.753F, -0.4665F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.5305F, -1.0993F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -1.8282F, -0.1284F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1554F, -4.821F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 6.8213F, -3.6418F, -0.3578F, 0.0F, -0.1745F));

		PartDefinition cube_r155 = leftarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(62, 83).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r156 = leftarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(28, 94).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0289F, 3.3523F, -0.0969F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r157 = leftarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(48, 77).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(64, 47).addBox(-2.0F, -1.6F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(79, 78).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.0571F, 3.3001F, -0.3578F, -0.9534F, 0.9541F));

		PartDefinition cube_r160 = leftarm2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(23, 74).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 62).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4157F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 7.5086F, -2.6347F, 0.9759F, 0.9157F, -0.7626F));

		PartDefinition cube_r161 = lefthand.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(83, 25).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r162 = lefthand.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(69, 53).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r163 = lefthand.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(18, 47).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r164 = lefthand.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(88, 3).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 6.8213F, -3.6418F, 0.3403F, 0.0F, 0.1745F));

		PartDefinition cube_r165 = rightarm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 83).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r166 = rightarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(23, 94).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0289F, 3.3523F, -0.0969F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r167 = rightarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(76, 28).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r168 = rightarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(64, 39).addBox(-1.0F, -1.6F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(79, 18).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.0571F, 3.3001F, -0.7432F, 0.7451F, -1.2353F));

		PartDefinition cube_r170 = rightarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 73).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 0).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4157F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 1.0325F, -0.8347F, 0.8656F));

		PartDefinition cube_r171 = righthand.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 41).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r172 = righthand.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(11, 15).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.2254F, -0.0511F, 0.1759F));

		PartDefinition cube_r173 = righthand.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(9, 41).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r174 = righthand.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(86, 45).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4554F, -5.321F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition cube_r175 = neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(51, 94).addBox(-1.0F, -3.0162F, 0.0031F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7712F, -1.883F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r176 = neck2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(9, 7).addBox(-1.0F, -4.2029F, 0.9208F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 47).addBox(-2.0F, -2.0029F, -0.0792F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(24, 43).mirror().addBox(-7.9341F, -3.2083F, 2.6435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, -0.1559F, 0.8707F, -1.5968F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(-5.0111F, -0.8114F, 2.6435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.435F, 0.7928F, -0.8161F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-2.9367F, 0.9825F, 2.665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.8041F, 0.4603F, -0.2749F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-2.9605F, -1.12F, 0.9956F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.1251F, 0.9871F, -1.3303F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(95, 16).mirror().addBox(-2.2287F, 0.1136F, 1.0345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7288F, -4.383F, 0.7572F, 0.7313F, -0.573F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 47).addBox(1.9605F, -1.12F, 0.9956F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.1251F, -0.9871F, 1.3303F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(95, 16).addBox(0.2287F, 0.1136F, 1.0345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.7572F, -0.7313F, 0.573F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(95, 18).addBox(0.9367F, 0.9825F, 2.665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.8041F, -0.4603F, 0.2749F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(95, 22).addBox(3.0111F, -0.8114F, 2.6435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.435F, -0.7928F, 0.8161F));

		PartDefinition cube_r186 = neck2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(24, 43).addBox(3.9341F, -3.2083F, 2.6435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, -0.1559F, -0.8707F, 1.5968F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4132F, -4.5076F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r187 = neck.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(9, 64).addBox(0.0F, -3.4F, -2.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(51, 15).addBox(-1.0F, -1.4F, -4.7F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r188 = neck.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2156F, -2.6754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r189 = neck.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(95, 3).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2156F, -2.6754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.2F, 0.8578F, 0.1863F, 0.1756F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -3.8995F, -0.0206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9178F, -2.5273F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(59, 57).mirror().addBox(-2.5F, -4.9992F, 0.0693F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.3178F, -1.5273F, -1.5681F, -0.2591F, -0.0308F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(59, 57).addBox(-0.5F, -4.9992F, 0.0693F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3178F, -1.5273F, -1.5681F, 0.2591F, 0.0308F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -6.067F, 0.6406F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8178F, -7.1273F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(19, 51).addBox(-1.0F, -4.9702F, -0.068F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(10, 102).addBox(-1.0F, -1.9702F, -0.068F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3822F, -10.5273F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, 0.0298F, -0.068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3822F, -10.5273F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(9, 64).addBox(0.175F, 0.0527F, -1.5169F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8699F, 3.4209F, -5.7774F, 0.2769F, 0.1104F, 0.0089F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(26, 19).addBox(-2.0F, 0.0F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.898F, -5.4074F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(26, 19).addBox(-2.0F, -6.6F, -2.9F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 17).addBox(-2.0F, -7.2F, -1.9F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9822F, -0.2273F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(28, 45).addBox(-3.0F, -2.1F, -1.2F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2852F, 0.0574F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(28, 45).addBox(-4.4037F, -0.4562F, -1.3847F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4037F, -2.3822F, -0.3409F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, 0.3804F, -1.3643F, -1.5156F, 0.0302F, 0.0872F));

		PartDefinition cube_r201 = leftCheek.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(62, 91).addBox(-0.1154F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.4273F, 0.6184F, 0.3889F));

		PartDefinition cube_r202 = leftCheek.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(96, 78).addBox(-0.3284F, -0.7361F, 1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 79).addBox(-0.3284F, -0.7361F, -0.4957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.926F, 0.3018F, 2.237F, 1.0258F, 0.6816F, 0.4262F));

		PartDefinition cube_r203 = leftCheek.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(76, 90).addBox(-0.9604F, -2.0364F, -0.3402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.426F, 1.8018F, 1.437F, 1.0956F, 0.6816F, 0.4262F));

		PartDefinition cube_r204 = leftCheek.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(24, 61).addBox(-1.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 1.3018F, 0.437F, 0.4499F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, 0.3804F, -1.3643F, -1.5156F, -0.0302F, -0.0872F));

		PartDefinition cube_r205 = rightCheek.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(62, 91).mirror().addBox(-0.8846F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.4273F, -0.6184F, -0.3889F));

		PartDefinition cube_r206 = rightCheek.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(96, 78).mirror().addBox(-0.6716F, -0.7361F, 1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 79).mirror().addBox(-0.6716F, -0.7361F, -0.4957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.926F, 0.3018F, 2.237F, 1.0258F, -0.6816F, -0.4262F));

		PartDefinition cube_r207 = rightCheek.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-0.0396F, -2.0364F, -0.3402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.426F, 1.8018F, 1.437F, 1.0956F, -0.6816F, -0.4262F));

		PartDefinition cube_r208 = rightCheek.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(24, 61).mirror().addBox(0.642F, -2.1953F, -0.5305F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, 1.3018F, 0.437F, 0.4499F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.5296F, 4.4294F, -11.3925F));

		PartDefinition cube_r209 = leftBeak.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(83, 63).addBox(-1.2233F, -2.0411F, -0.0664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -1.6934F, -0.6304F, -0.8414F, 0.0699F, 0.0695F));

		PartDefinition cube_r210 = leftBeak.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(67, 96).addBox(-0.5341F, -1.8258F, 0.1729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4644F, 3.5663F, -0.2933F, 0.6421F, 0.0699F, 0.0695F));

		PartDefinition cube_r211 = leftBeak.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(43, 96).addBox(-0.5F, 0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.242F, 0.5713F, 0.3946F, -0.3004F, 0.0699F, 0.0695F));

		PartDefinition cube_r212 = leftBeak.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(36, 31).addBox(-0.5551F, -2.3582F, -3.0094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3875F, 3.4212F, 0.3592F, -1.0858F, 0.0699F, 0.0695F));

		PartDefinition cube_r213 = leftBeak.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(89, 30).mirror().addBox(-0.3F, 0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1687F, -0.6368F, 0.9343F, 0.0025F, -0.0881F, -0.0886F));

		PartDefinition cube_r214 = leftBeak.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(89, 30).addBox(-0.7F, 0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 29).addBox(-0.7F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1095F, -0.6368F, 0.9343F, 0.0025F, 0.0881F, 0.0886F));

		PartDefinition cube_r215 = leftBeak.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(91, 63).addBox(-1.4038F, -1.9769F, -0.0462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5704F, 0.1066F, -1.4304F, -0.44F, 0.0699F, 0.0695F));

		PartDefinition cube_r216 = leftBeak.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(13, 95).addBox(-1.5214F, -1.916F, -0.093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, 2.0066F, -1.2304F, 0.1011F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.5296F, 4.4294F, -11.3925F));

		PartDefinition cube_r217 = rightBeak.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(0.2233F, -2.0411F, -0.0664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.6934F, -0.6304F, -0.8414F, -0.0699F, -0.0695F));

		PartDefinition cube_r218 = rightBeak.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(67, 96).mirror().addBox(-0.4659F, -1.8258F, 0.1729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4644F, 3.5663F, -0.2933F, 0.6421F, -0.0699F, -0.0695F));

		PartDefinition cube_r219 = rightBeak.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.5F, 0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.242F, 0.5713F, 0.3946F, -0.3004F, -0.0699F, -0.0695F));

		PartDefinition cube_r220 = rightBeak.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(36, 31).mirror().addBox(-0.4449F, -2.3582F, -3.0094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3875F, 3.4212F, 0.3592F, -1.0858F, -0.0699F, -0.0695F));

		PartDefinition cube_r221 = rightBeak.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(88, 29).mirror().addBox(-0.3F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1095F, -0.6368F, 0.9343F, 0.0025F, -0.0881F, -0.0886F));

		PartDefinition cube_r222 = rightBeak.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(0.4038F, -1.9769F, -0.0462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 0.1066F, -1.4304F, -0.44F, -0.0699F, -0.0695F));

		PartDefinition cube_r223 = rightBeak.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(13, 95).mirror().addBox(0.5214F, -1.916F, -0.093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, 2.0066F, -1.2304F, 0.1011F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.0822F, -4.1273F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(82, 33).addBox(-0.5F, -0.3436F, -4.0831F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4301F, -1.6613F, -1.6501F, 0.3047F, 0.1256F, 0.0215F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(92, 70).addBox(-0.5F, -0.2921F, 1.5976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 83).addBox(-0.5F, -1.2921F, -1.1024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4301F, -1.6613F, -1.6501F, 0.2524F, 0.1256F, 0.0215F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(11, 30).mirror().addBox(-0.0256F, -1.4129F, 0.1354F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3102F, -3.8075F, -2.5271F, 0.4534F, -0.4702F, -0.2045F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(11, 30).addBox(-1.9744F, -1.4129F, 0.1354F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2898F, -3.8075F, -2.5271F, 0.4534F, 0.4702F, 0.2045F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(35, 89).addBox(-1.0F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7912F, -2.7393F, -3.3365F, 1.5457F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 8).addBox(-0.5F, 0.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 8).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -1.6769F, -3.8712F, 1.1705F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(89, 8).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -3.3877F, -3.0387F, 2.2613F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(56, 56).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -0.8186F, -5.1789F, -0.5836F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(38, 83).addBox(-1.2921F, 9.3174F, -2.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5079F, -10.8737F, -5.246F, 0.1145F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 91).addBox(-0.5F, -0.65F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -0.9272F, -5.7714F, 2.3573F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(42, 84).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-1.3F, -0.679F, -7.0173F, 0.612F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(11, 20).addBox(-0.5F, -0.8F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3983F, -4.9219F, 3.7384F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(11, 20).addBox(-1.37F, -1.15F, -3.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 47).addBox(-1.73F, -1.15F, -3.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(50, 60).addBox(-1.06F, -1.15F, -3.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 32).addBox(0.7582F, 0.027F, -0.8101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1037F, -7.7644F, 3.7863F, -0.0756F, 0.1584F, 0.0121F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(69, 83).addBox(-1.2087F, -0.7538F, -2.2141F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1037F, -7.7644F, 3.7863F, 0.281F, 0.3245F, -0.0782F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(58, 1).addBox(-0.5727F, -0.5439F, -0.273F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4147F, -7.9271F, 2.9611F, -0.0333F, 0.3442F, -0.2109F));

		PartDefinition browHorn = leftFace.addOrReplaceChild("browHorn", CubeListBuilder.create(), PartPose.offset(0.6227F, -6.9919F, -0.52F));

		PartDefinition cube_r240 = browHorn.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(89, 21).addBox(1.4227F, -1.6039F, -0.1513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9227F, 0.1339F, 0.1035F, 3.0974F, 0.0F, 0.0F));

		PartDefinition cube_r241 = browHorn.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(89, 21).addBox(-0.5F, -0.8946F, -0.2171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.3445F, -2.1386F, 0.0F, 0.0F));

		PartDefinition cube_r242 = browHorn.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 52).addBox(1.4227F, -0.8476F, -0.6429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.9227F, -1.3189F, -0.9603F, -2.2084F, 0.0F, 0.0F));

		PartDefinition cube_r243 = browHorn.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 52).addBox(1.4227F, -0.5588F, 0.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9227F, -1.3864F, -0.4452F, -3.1247F, 0.0F, 0.0F));

		PartDefinition cube_r244 = browHorn.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 52).addBox(1.4227F, 0.0336F, -1.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.9227F, 0.0458F, -1.0479F, -2.8368F, 0.0F, 0.0F));

		PartDefinition cube_r245 = browHorn.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 52).addBox(1.4227F, -0.9729F, -0.9464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9227F, -1.3523F, -0.173F, 2.2683F, 0.0F, 0.0F));

		PartDefinition cube_r246 = browHorn.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 52).addBox(1.4227F, -0.9071F, -0.7075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.9227F, -0.7308F, 0.5031F, 1.1251F, 0.0F, 0.0F));

		PartDefinition cube_r247 = browHorn.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.052F, 0.0427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.3445F, 1.4306F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.0822F, -4.1273F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-0.5F, -0.3436F, -4.0831F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4301F, -1.6613F, -1.6501F, 0.3047F, -0.1256F, -0.0215F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-0.5F, -0.2921F, 1.5976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 83).mirror().addBox(-0.5F, -1.2921F, -1.1024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4301F, -1.6613F, -1.6501F, 0.2524F, -0.1256F, -0.0215F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(11, 20).mirror().addBox(-1.5F, -0.8F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3983F, -4.9219F, 3.7384F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(11, 20).mirror().addBox(-0.63F, -1.15F, -3.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 47).mirror().addBox(-1.27F, -1.15F, -3.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(50, 60).mirror().addBox(-0.94F, -1.15F, -3.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.7838F, 2.6222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(68, 32).mirror().addBox(-1.7582F, 0.027F, -0.8101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1037F, -7.7644F, 3.7863F, -0.0756F, -0.1584F, -0.0121F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(69, 83).mirror().addBox(-1.7913F, -0.7538F, -2.2141F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1037F, -7.7644F, 3.7863F, 0.281F, -0.3245F, 0.0782F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(58, 1).mirror().addBox(-0.4273F, -0.5439F, -0.273F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4147F, -7.9271F, 2.9611F, -0.0333F, -0.3442F, 0.2109F));

		PartDefinition browHorn2 = rightFace.addOrReplaceChild("browHorn2", CubeListBuilder.create(), PartPose.offset(-0.6227F, -6.9919F, -0.52F));

		PartDefinition cube_r255 = browHorn2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-2.4227F, -1.6039F, -0.1513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9227F, 0.1339F, 0.1035F, 3.0974F, 0.0F, 0.0F));

		PartDefinition cube_r256 = browHorn2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-0.5F, -0.8946F, -0.2171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.3445F, -2.1386F, 0.0F, 0.0F));

		PartDefinition cube_r257 = browHorn2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.4227F, -0.8476F, -0.6429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.9227F, -1.3189F, -0.9603F, -2.2084F, 0.0F, 0.0F));

		PartDefinition cube_r258 = browHorn2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.4227F, -0.5588F, 0.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.9227F, -1.3864F, -0.4452F, -3.1247F, 0.0F, 0.0F));

		PartDefinition cube_r259 = browHorn2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.4227F, 0.0336F, -1.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.9227F, 0.0458F, -1.0479F, -2.8368F, 0.0F, 0.0F));

		PartDefinition cube_r260 = browHorn2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.4227F, -0.9729F, -0.9464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9227F, -1.3523F, -0.173F, 2.2683F, 0.0F, 0.0F));

		PartDefinition cube_r261 = browHorn2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.4227F, -0.9071F, -0.7075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.9227F, -0.7308F, 0.5031F, 1.1251F, 0.0F, 0.0F));

		PartDefinition cube_r262 = browHorn2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -0.052F, 0.0427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.3445F, 1.4306F, 0.0F, 0.0F));

		PartDefinition nasalHorn = head.addOrReplaceChild("nasalHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.7822F, -9.4273F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r263 = nasalHorn.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(45, 45).addBox(-1.0F, -0.8301F, -0.4883F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.4F, 0.4F, -1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r264 = nasalHorn.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(96, 39).addBox(-1.0F, 0.2455F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(90, 94).addBox(-1.0F, -0.1545F, -0.8598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.8F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r265 = nasalHorn.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(89, 37).addBox(-1.0F, -0.5507F, -1.8885F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, -2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r266 = nasalHorn.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(42, 89).mirror().addBox(-0.5783F, -1.9751F, -1.858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7478F, -1.7635F, 1.5077F, 1.8151F, -0.1309F, 0.0F));

		PartDefinition cube_r267 = nasalHorn.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(54, 96).mirror().addBox(-0.5F, 0.9695F, -0.8676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.249F, -0.9741F, 0.7156F, -0.1309F, 0.0F));

		PartDefinition cube_r268 = nasalHorn.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(42, 89).addBox(-0.4217F, -1.9751F, -1.858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2522F, -1.7635F, 1.5077F, 1.8151F, 0.1309F, 0.0F));

		PartDefinition cube_r269 = nasalHorn.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(54, 96).addBox(-0.5F, 0.9695F, -0.8676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.249F, -0.9741F, 0.7156F, 0.1309F, 0.0F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4178F, 4.1727F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r270 = frill.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(30, 74).addBox(-0.5F, -9.9021F, 0.0276F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.997F, -2.4303F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r271 = frill.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(16, 71).addBox(-1.0F, -8.8986F, 1.0216F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(83, 92).addBox(-1.0F, -10.8986F, 1.0216F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.997F, -2.4303F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8502F, 2.2281F, -1.2253F, -0.1933F, -0.2635F, 0.128F));

		PartDefinition cube_r272 = leftFrill.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(66, 0).addBox(-2.5F, -1.8F, -0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6884F, 1.942F, 0.1533F, -0.1555F, -0.2181F, -0.8919F));

		PartDefinition cube_r273 = leftFrill.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(55, 65).addBox(-4.1543F, -1.374F, -0.7644F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8137F, -0.1294F, 0.8288F, -0.1788F, 0.015F, 0.2247F));

		PartDefinition cube_r274 = leftFrill.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(55, 91).addBox(0.8444F, -0.4721F, -0.7304F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8137F, -0.1294F, 0.8288F, -0.222F, 0.0866F, 0.3378F));

		PartDefinition cube_r275 = leftFrill.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(81, 96).addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(8.0215F, -10.853F, 3.1785F, 0.0608F, 0.3411F, 1.911F));

		PartDefinition cube_r276 = leftFrill.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(7, 96).addBox(-0.0044F, -0.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.9657F, -10.9943F, 3.3088F, 0.3895F, -0.2684F, -2.3192F));

		PartDefinition cube_r277 = leftFrill.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(38, 96).addBox(-0.5912F, -1.0429F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.9657F, -10.9943F, 3.3088F, 0.4688F, 0.0165F, -2.9252F));

		PartDefinition cube_r278 = leftFrill.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(33, 96).addBox(-0.5912F, -1.0429F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.6657F, -11.0943F, 3.2088F, 0.3395F, 0.0694F, 3.108F));

		PartDefinition cube_r279 = leftFrill.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(95, 94).addBox(-0.0044F, -0.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.6657F, -11.0943F, 3.2088F, 0.313F, -0.1504F, -2.5476F));

		PartDefinition cube_r280 = leftFrill.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(79, 52).addBox(-7.9261F, -1.2172F, -0.4602F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4199F, -11.1207F, 2.7452F, 0.3383F, 0.0752F, 3.0915F));

		PartDefinition cube_r281 = leftFrill.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(48, 26).addBox(-0.9488F, -0.0458F, -0.6437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6644F, -10.6685F, 3.1501F, 0.2211F, -0.3041F, -2.7566F));

		PartDefinition cube_r282 = leftFrill.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(56, 26).addBox(-0.0514F, -1.0009F, -0.2978F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5801F, -11.1207F, 2.7452F, 0.3637F, -0.0888F, 2.8287F));

		PartDefinition cube_r283 = leftFrill.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(21, 26).addBox(-11.8285F, -0.217F, -0.5348F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.1388F, -0.393F, -0.3139F, 0.0217F, 0.2835F, 1.9682F));

		PartDefinition cube_r284 = leftFrill.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(91, 42).addBox(0.0F, -1.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 67).addBox(-2.6F, -1.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 2).addBox(-3.6F, -1.1F, -0.9F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.1417F, -7.4826F, 2.9006F, -0.0001F, 0.2321F, 1.8774F));

		PartDefinition cube_r285 = leftFrill.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, -3.0F, 0.1F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9346F, -3.2553F, 0.7154F, -0.1916F, 0.2348F, 1.1828F));

		PartDefinition cube_r286 = leftFrill.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(47, 31).addBox(-3.8512F, -1.7391F, -0.8152F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8137F, -0.1294F, 0.8288F, 0.128F, 0.316F, 1.7352F));

		PartDefinition cube_r287 = leftFrill.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(89, 87).addBox(-2.3285F, -2.1325F, -0.6215F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 0).addBox(-5.4285F, -2.1325F, -0.6215F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(56, 23).addBox(-7.4285F, -1.6325F, -0.6215F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.7801F, 0.68F, 0.2382F, -0.2109F, 0.2661F, 1.6097F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8502F, 2.2281F, -1.2253F, -0.1933F, 0.2635F, -0.128F));

		PartDefinition cube_r288 = rightFrill.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-2.5F, -1.8F, -0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 1.942F, 0.1533F, -0.1555F, 0.2181F, 0.8919F));

		PartDefinition cube_r289 = rightFrill.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-0.8457F, -1.374F, -0.7644F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8137F, -0.1294F, 0.8288F, -0.1788F, -0.015F, -0.2247F));

		PartDefinition cube_r290 = rightFrill.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-2.8444F, -0.4721F, -0.7304F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8137F, -0.1294F, 0.8288F, -0.222F, -0.0866F, -0.3378F));

		PartDefinition cube_r291 = rightFrill.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-8.0215F, -10.853F, 3.1785F, 0.0608F, -0.3411F, -1.911F));

		PartDefinition cube_r292 = rightFrill.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(7, 96).mirror().addBox(-0.9956F, -0.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.9657F, -10.9943F, 3.3088F, 0.3895F, 0.2684F, 2.3192F));

		PartDefinition cube_r293 = rightFrill.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-0.4088F, -1.0429F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.9657F, -10.9943F, 3.3088F, 0.4688F, -0.0165F, 2.9252F));

		PartDefinition cube_r294 = rightFrill.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.4088F, -1.0429F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.6657F, -11.0943F, 3.2088F, 0.3395F, -0.0694F, -3.108F));

		PartDefinition cube_r295 = rightFrill.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(95, 94).mirror().addBox(-0.9956F, -0.9219F, -0.6296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.6657F, -11.0943F, 3.2088F, 0.313F, 0.1504F, 2.5476F));

		PartDefinition cube_r296 = rightFrill.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(79, 52).mirror().addBox(2.9261F, -1.2172F, -0.4602F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4199F, -11.1207F, 2.7452F, 0.3383F, -0.0752F, -3.0915F));

		PartDefinition cube_r297 = rightFrill.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-0.0512F, -0.0458F, -0.6437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6644F, -10.6685F, 3.1501F, 0.2211F, 0.3041F, 2.7566F));

		PartDefinition cube_r298 = rightFrill.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-2.9486F, -1.0009F, -0.2978F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5801F, -11.1207F, 2.7452F, 0.3637F, 0.0888F, -2.8287F));

		PartDefinition cube_r299 = rightFrill.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(21, 26).mirror().addBox(-0.1715F, -0.217F, -0.5348F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1388F, -0.393F, -0.3139F, 0.0217F, -0.2835F, -1.9682F));

		PartDefinition cube_r300 = rightFrill.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-2.0F, -1.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 67).mirror().addBox(0.6F, -1.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 2).mirror().addBox(-4.4F, -1.1F, -0.9F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.1417F, -7.4826F, 2.9006F, -0.0001F, -0.2321F, -1.8774F));

		PartDefinition cube_r301 = rightFrill.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-2.0F, -3.0F, 0.1F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9346F, -3.2553F, 0.7154F, -0.1916F, -0.2348F, -1.1828F));

		PartDefinition cube_r302 = rightFrill.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-0.1488F, -1.7391F, -0.8152F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8137F, -0.1294F, 0.8288F, 0.128F, -0.316F, -1.7352F));

		PartDefinition cube_r303 = rightFrill.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(89, 87).mirror().addBox(0.3285F, -2.1325F, -0.6215F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(90, 0).mirror().addBox(3.4285F, -2.1325F, -0.6215F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(56, 23).mirror().addBox(0.4285F, -1.6325F, -0.6215F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7801F, 0.68F, 0.2382F, -0.2109F, -0.2661F, -1.6097F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.9389F, -3.1648F, 0.3136F, 0.0F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(52, 11).mirror().addBox(-1.0F, -0.2F, -0.1959F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, -1.6581F, -0.1745F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(23, 84).mirror().addBox(-1.0F, -0.5708F, -1.6465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, -0.8552F, -0.1745F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(37, 15).mirror().addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.81F, 0.7825F, 2.4141F, -0.6109F, -0.1745F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(21, 15).mirror().addBox(-1.0F, -0.4536F, 0.3282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.0349F, -0.1745F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(8, 57).mirror().addBox(-1.0F, 0.6222F, -2.4562F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.5236F, -0.1745F, 0.0F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(80, 68).mirror().addBox(-0.6F, 0.1249F, -4.4906F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.2793F, -0.192F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-0.3611F, -0.6928F, -0.233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.1676F, 4.0384F, -7.7F, -0.192F, -0.2967F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-0.3611F, -0.6628F, -0.2795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1676F, 4.0384F, -7.7F, -0.4014F, -0.2967F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(87, 57).mirror().addBox(-1.0F, -0.153F, -7.6694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.4189F, -0.1745F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(90, 53).mirror().addBox(-1.0F, 3.196F, -6.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, -0.0349F, -0.1745F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-1.0F, -1.5217F, -6.237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.7156F, -0.1745F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(61, 72).mirror().addBox(-1.0F, 0.4249F, -4.4906F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.2793F, -0.1745F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-1.0F, 1.0349F, -6.1486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8F, 0.7F, 0.3491F, -0.1745F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(90, 90).addBox(0.0F, -1.5217F, -6.237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.7156F, 0.1745F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(52, 11).addBox(0.0F, -0.2F, -0.1959F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, -1.6581F, 0.1745F, 0.0F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(37, 15).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.81F, 0.7825F, 2.4141F, -0.6109F, 0.1745F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(21, 15).addBox(0.0F, -0.4536F, 0.3282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(23, 84).addBox(0.0F, -0.5708F, -1.6465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, -0.8552F, 0.1745F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(80, 68).addBox(0.6F, 0.1249F, -4.4906F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.2793F, 0.192F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(61, 72).addBox(0.0F, 0.4249F, -4.4906F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.2793F, 0.1745F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(87, 57).addBox(0.0F, -0.153F, -7.6694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.4189F, 0.1745F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(70, 6).addBox(-0.6389F, -0.6928F, -0.233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.8324F, 4.0384F, -7.7F, -0.192F, 0.2967F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(57, 71).addBox(-0.6389F, -0.6628F, -0.2795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8324F, 4.0384F, -7.7F, -0.4014F, 0.2967F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(90, 53).addBox(0.0F, 3.196F, -6.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, -0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(72, 72).addBox(0.0F, 1.0349F, -6.1486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.3491F, 0.1745F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(8, 57).addBox(0.0F, 0.6222F, -2.4562F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.5236F, 0.1745F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 29).addBox(-1.0F, -0.1961F, 0.0069F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(33, 94).addBox(1.0F, 0.8039F, 1.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 74).addBox(1.0F, 0.8039F, 3.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 45).addBox(1.0F, 0.8039F, 5.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 94).mirror().addBox(-3.0F, 0.8039F, 1.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 74).mirror().addBox(-3.0F, 0.8039F, 3.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 45).mirror().addBox(-3.0F, 0.8039F, 5.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4645F, 7.5087F, -0.3894F, -0.1311F, 0.0291F));

		PartDefinition cube_r330 = tail.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 67).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0315F, 3.2718F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r331 = tail.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(78, 97).addBox(0.0F, -2.678F, 3.6023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 63).addBox(0.0F, -2.178F, 1.8023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 29).addBox(0.0F, -1.578F, -0.0977F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1643F, 1.1245F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(47, 23).addBox(-0.5F, -0.8697F, -0.1085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(93, 20).addBox(0.5F, -0.3697F, -0.1085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 61).addBox(0.4F, -0.3697F, 1.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 52).addBox(0.0F, -0.3697F, 3.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 20).mirror().addBox(-2.5F, -0.3697F, -0.1085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 61).mirror().addBox(-2.4F, -0.3697F, 1.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 52).mirror().addBox(-2.0F, -0.3697F, 3.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9695F, 7.0283F, 0.2568F, -0.1689F, -0.0441F));

		PartDefinition cube_r332 = tail2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(64, 47).addBox(0.0F, -2.0F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 53).addBox(0.0F, -1.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 96).addBox(0.0F, -0.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3697F, 0.3915F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r333 = tail2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(11, 15).addBox(0.0F, 3.7F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 12).addBox(0.0F, 1.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 22).addBox(0.0F, 1.2F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.062F, -3.7565F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F))
				.texOffs(72, 28).addBox(0.5F, 0.297F, -0.0166F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 64).addBox(0.2F, 0.297F, 1.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 63).addBox(-0.1F, 0.297F, 3.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 28).mirror().addBox(-1.5F, 0.297F, -0.0166F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 64).mirror().addBox(-1.2F, 0.297F, 1.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 63).mirror().addBox(-0.9F, 0.297F, 3.9834F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6721F, 5.671F, 0.2815F, 0.1258F, 0.0363F));

		PartDefinition cube_r334 = tail3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(42, 20).addBox(0.0F, -1.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 53).addBox(0.0F, -2.6F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 53).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 39).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.303F, -0.0166F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r335 = tail3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(11, 36).addBox(0.0F, 6.9F, 13.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(0.0F, 5.9F, 11.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 15).addBox(0.0F, 4.7F, 9.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7341F, -9.4274F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(25, 31).addBox(-0.5F, -0.5012F, -0.0752F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2549F, 7.942F, 0.2102F, 0.2991F, 0.0628F));

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