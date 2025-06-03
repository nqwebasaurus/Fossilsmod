package fossils.fossils.client.blockentity.model.psittacosaurusmongoliensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PsittacosaurusmongoliensisFossilModel extends SkullModelBase {
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
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PsittacosaurusmongoliensisFossilModel(ModelPart root) {
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
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.5F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-1.0F, -0.4F, -2.3F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(-0.5539F, -0.6432F, -0.6679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.6248F, -1.3781F, -0.4694F, 0.2614F, 0.014F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 61).mirror().addBox(-0.0085F, 2.3883F, -1.9785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.8359F, 0.2614F, 0.014F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.4196F, -2.7545F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 46).mirror().addBox(-0.6019F, -0.2165F, -4.1442F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -2.2752F, -1.6781F, 0.3422F, 0.2974F, 0.0708F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-0.8F, -2.891F, -2.5088F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 29).mirror().addBox(-0.8F, -0.0986F, -3.7676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(45, 29).addBox(6.2F, -0.0986F, -3.7676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.2F, -1.8752F, 4.2219F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 40).mirror().addBox(-0.8F, 0.1819F, -0.6095F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(10, 40).addBox(6.2F, 0.1819F, -0.6095F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.2F, -1.8752F, 1.0219F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 67).mirror().addBox(-0.8F, -1.9431F, 2.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 67).addBox(6.2F, -1.9431F, 2.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -1.8752F, 1.0219F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 40).mirror().addBox(-0.8F, -2.1305F, -3.4063F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 15).mirror().addBox(-0.5243F, -1.5144F, -2.125F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.2905F, 0.0965F, -0.2143F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(-0.0737F, -0.6088F, -0.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -1.1531F, 0.2616F, -0.1839F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-0.0878F, -0.5864F, 4.7999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -0.7324F, 0.2618F, -0.1699F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(-0.0878F, -0.0754F, 0.8844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -0.6277F, 0.2618F, -0.1699F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.0737F, 0.0324F, -2.063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -0.4899F, 0.2616F, -0.1839F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 46).addBox(-0.3981F, -0.2165F, -4.1442F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, -2.2752F, -1.6781F, 0.3422F, -0.2974F, -0.0708F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(51, 19).addBox(-0.2F, -2.891F, -2.5088F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 14).addBox(-0.9122F, -0.5864F, 4.7999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -0.7324F, -0.2618F, 0.1699F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 0).addBox(-0.9122F, -0.0754F, 0.8844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -0.6277F, -0.2618F, 0.1699F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 67).addBox(-0.9263F, -0.6088F, -0.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -1.1531F, -0.2616F, 0.1839F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 51).addBox(-0.9263F, 0.0324F, -2.063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -0.4899F, -0.2616F, 0.1839F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 22).addBox(-0.4461F, -0.6432F, -0.6679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2F, 2.6248F, -1.3781F, -0.4694F, -0.2614F, -0.014F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 61).addBox(-0.9915F, 2.3883F, -1.9785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.8359F, -0.2614F, -0.014F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.4196F, -2.7545F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 15).addBox(-0.4757F, -1.5144F, -2.125F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.2905F, -0.0965F, 0.2143F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(18, 37).addBox(-1.0F, -0.4F, -2.3F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.1532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 40).addBox(-0.2F, -2.1305F, -3.4063F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 68).addBox(0.0F, -2.7976F, 7.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 68).addBox(0.0F, -2.4976F, 5.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 68).addBox(0.0F, -2.3976F, 3.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 41).addBox(0.0F, -2.1976F, 1.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 54).addBox(0.0F, -1.6976F, -0.0698F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 0.4033F, -0.4794F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftleg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(49, 38).addBox(0.5F, -0.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 6.2433F, -2.0003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftleg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 46).addBox(-0.5F, -7.0F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(57, 48).addBox(-0.5F, -4.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(58, 5).addBox(-0.5F, -4.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 5.4842F, -2.3173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftleg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 3.0938F, -0.2613F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftleg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(56, 56).addBox(-0.5F, 0.0704F, 0.2516F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(52, 61).addBox(-0.5F, 0.0704F, -0.0484F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 4.2842F, -2.4173F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 8.749F, -2.6285F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftleg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 59).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(18, 50).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftleg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(28, 47).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftleg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(59, 61).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 7.4423F, 4.3312F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftleg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(28, 53).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftleg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 52).addBox(-0.601F, -0.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8246F, 4.3116F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftleg3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(49, 52).addBox(-0.602F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(59, 17).addBox(-0.602F, 0.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7F, -1.2F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftfoot.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.0F, 2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(40, 17).addBox(-1.499F, -0.5851F, -2.8428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6686F, -0.7616F, 0.9425F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 0.4033F, -0.4794F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightleg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(-2.5F, -0.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 6.2433F, -2.0003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightleg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(-1.5F, -7.0F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(57, 48).mirror().addBox(-1.5F, -4.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(58, 5).mirror().addBox(-1.5F, -4.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.4842F, -2.3173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(30, 2).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0938F, -0.2613F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightleg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-1.5F, 0.0704F, 0.2516F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(52, 61).mirror().addBox(-1.5F, 0.0704F, -0.0484F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.2842F, -2.4173F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 8.749F, -2.6285F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightleg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(38, 59).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(18, 50).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightleg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 61).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 7.4423F, 4.3312F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightleg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(28, 53).mirror().addBox(-0.5F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightleg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.399F, -0.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8246F, 4.3116F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightleg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-1.398F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(59, 17).mirror().addBox(-1.398F, 0.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7F, -1.2F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightfoot.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-2.0F, -1.0F, 2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(40, 17).mirror().addBox(-1.501F, -0.5851F, -2.8428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6686F, -0.7616F, 0.7679F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.3F, -0.2633F, 0.1289F, -0.0229F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(27, 69).addBox(0.0F, -1.4929F, -1.2848F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8935F, -0.6435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(69, 45).addBox(0.0F, -1.3478F, -0.896F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4935F, -2.7435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(69, 66).addBox(0.0F, -2.1999F, 0.9573F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 4).addBox(0.0F, -1.4999F, -1.0427F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7065F, -6.6435F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-2.6703F, -1.0713F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3273F, -1.2603F, 0.2643F, 0.298F, -0.8173F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-1.98F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3273F, -1.2603F, 0.4135F, 0.1047F, -0.2965F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-3.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7602F, -3.2129F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(18, 40).mirror().addBox(-3.6429F, -2.7629F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7602F, -3.2129F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 16).mirror().addBox(-1.98F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7602F, -3.2129F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(-5.6429F, -2.7629F, -0.3222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1931F, -5.1655F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-3.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1931F, -5.1655F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(29, 65).mirror().addBox(-1.98F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1931F, -5.1655F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-6.7192F, -2.7479F, -0.4404F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6043F, -7.0204F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-3.7288F, -1.0202F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6043F, -7.0204F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-2.0058F, 0.026F, -0.4036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6043F, -7.0204F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0156F, -8.8754F, 0.4724F, 0.1224F, -0.2899F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0156F, -8.8754F, 0.3087F, 0.3423F, -0.8033F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-7.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0156F, -8.8754F, 0.0889F, 0.4487F, -1.3604F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 37).addBox(-0.02F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3273F, -1.2603F, 0.4135F, -0.1047F, 0.2965F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(34, 28).addBox(1.6703F, -1.0713F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3273F, -1.2603F, 0.2643F, -0.298F, 0.8173F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 16).addBox(-0.02F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7602F, -3.2129F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(64, 50).addBox(1.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7602F, -3.2129F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(18, 40).addBox(2.6429F, -2.7629F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7602F, -3.2129F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(29, 65).addBox(-0.02F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1931F, -5.1655F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 60).addBox(1.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1931F, -5.1655F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(58, 53).addBox(2.6429F, -2.7629F, -0.3222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1931F, -5.1655F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(45, 35).addBox(2.7192F, -2.7479F, -0.4404F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6043F, -7.0204F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 65).addBox(1.7288F, -1.0202F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6043F, -7.0204F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 65).addBox(0.0058F, 0.026F, -0.4036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6043F, -7.0204F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0156F, -8.8754F, 0.4724F, -0.1224F, 0.2899F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 65).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0156F, -8.8754F, 0.3087F, -0.3423F, 0.8033F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(21, 0).addBox(2.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0156F, -8.8754F, 0.0889F, -0.4487F, 1.3604F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(69, 0).addBox(0.0F, -1.0029F, -0.4582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0352F, -9.1473F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.0872F, -0.0017F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.6F, -9.6F, 0.2705F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, -9.6F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(-7.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.8754F, 0.1238F, 0.585F, -1.3431F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(66, 52).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.8754F, 0.4158F, 0.4409F, -0.7624F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.8754F, 0.6079F, 0.1611F, -0.2707F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3156F, -2.4754F, 0.6591F, 0.1749F, -0.2621F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3156F, -2.4754F, 0.4584F, 0.4767F, -0.7435F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(30, 9).mirror().addBox(-7.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3156F, -2.4754F, 0.1385F, 0.636F, -1.3347F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4156F, -4.3754F, 0.1776F, 0.7544F, -1.3096F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4156F, -4.3754F, 0.7796F, 0.2052F, -0.2393F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4156F, -4.3754F, 0.5643F, 0.5571F, -0.6911F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(48, 0).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4156F, -4.3754F, 0.1776F, -0.7544F, 1.3096F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(66, 18).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4156F, -4.3754F, 0.5643F, -0.5571F, 0.6911F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(66, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4156F, -4.3754F, 0.7796F, -0.2052F, 0.2393F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(30, 9).addBox(2.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3156F, -2.4754F, 0.1385F, -0.636F, 1.3347F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(66, 31).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3156F, -2.4754F, 0.4584F, -0.4767F, 0.7435F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(66, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3156F, -2.4754F, 0.6591F, -0.1749F, 0.2621F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(66, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.8754F, 0.6079F, -0.1611F, 0.2707F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 38).addBox(2.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.8754F, 0.1238F, -0.585F, 1.3431F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(66, 52).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.8754F, 0.4158F, -0.4409F, 0.7624F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.119F, -0.0485F, -0.3974F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.597F, 0.0395F, 0.8705F, -0.6204F, -0.5809F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(41, 40).mirror().addBox(-0.1452F, 0.0669F, -0.4468F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.497F, -0.0605F, 1.0229F, -0.9632F, -0.741F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.4971F, -0.0955F, 0.1186F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.497F, 0.2395F, 1.703F, -1.0269F, -1.2746F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(35, 33).mirror().addBox(-1.0F, -0.7646F, -0.091F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(35, 33).addBox(1.4F, -0.7646F, -0.091F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 9.097F, -4.7605F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.5051F, -1.1278F, -3.7955F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9137F, 5.2519F, -3.4028F, 1.0628F, -0.1349F, -0.7088F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.972F, -0.8736F, 0.473F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9137F, 5.2519F, -3.4028F, 1.2388F, -0.0121F, -0.0692F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.972F, -0.9269F, -1.5417F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9137F, 5.2519F, -3.4028F, 1.0643F, -0.0121F, -0.0692F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 0).addBox(-0.028F, -0.8736F, 0.473F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9137F, 5.2519F, -3.4028F, 1.2388F, 0.0121F, 0.0692F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 26).addBox(0.5051F, -1.1278F, -3.7955F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9137F, 5.2519F, -3.4028F, 1.0628F, 0.1349F, 0.7088F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 0).addBox(-0.028F, -0.9269F, -1.5417F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9137F, 5.2519F, -3.4028F, 1.0643F, 0.0121F, 0.0692F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 38).addBox(-0.881F, -0.0485F, -0.3974F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 8.597F, 0.0395F, 0.8705F, 0.6204F, 0.5809F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(41, 40).addBox(-0.8548F, 0.0669F, -0.4468F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 8.497F, -0.0605F, 1.0229F, 0.9632F, 0.741F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(7, 47).addBox(-0.5029F, -0.0955F, 0.1186F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 8.497F, 0.2395F, 1.703F, 1.0269F, 1.2746F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(10, 69).addBox(0.0F, -2.3968F, 3.8105F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 69).addBox(0.0F, -1.7968F, 1.8105F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 22).addBox(0.0F, -1.3968F, -0.1895F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.082F, -4.8807F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, -1.0F, -6.4F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 7.4651F, -1.7441F, 0.9554F, 0.2595F, -0.2968F));

		PartDefinition cube_r118 = leftarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(64, 22).addBox(-0.0096F, -1.9621F, -0.4622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0981F, 1.1202F, -0.7713F, -0.264F, -0.5618F, -0.083F));

		PartDefinition cube_r119 = leftarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 67).addBox(-0.6461F, -1.6201F, -0.5898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0981F, 1.9202F, 0.5287F, 0.853F, -0.5618F, -0.083F));

		PartDefinition cube_r120 = leftarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(4, 62).addBox(-0.8569F, -3.2751F, -0.3549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0981F, 1.9202F, 0.5287F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(61, 10).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2588F, 4.9522F, 2.063F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -4.3707F, -0.7539F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2588F, 5.545F, 3.1246F, 0.5498F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2384F, 5.9326F, 2.5003F, -0.844F, -0.8285F, 1.6147F));

		PartDefinition cube_r123 = leftarm2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(12, 57).addBox(-0.801F, -2.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 50).addBox(0.499F, -3.5F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8077F, 1.7038F, -1.4863F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0913F, 4.351F, -1.6512F, 1.894F, -0.0377F, -0.2007F));

		PartDefinition cube_r124 = lefthand.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(14, 28).addBox(-0.9F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.399F, -0.1486F, -1.1751F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 7.4651F, -1.7441F, 0.3445F, -0.2595F, 0.2968F));

		PartDefinition cube_r125 = rightarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-0.9904F, -1.9621F, -0.4622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.0981F, 1.1202F, -0.7713F, -0.264F, 0.5618F, 0.083F));

		PartDefinition cube_r126 = rightarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.3539F, -1.6201F, -0.5898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0981F, 1.9202F, 0.5287F, 0.853F, 0.5618F, 0.083F));

		PartDefinition cube_r127 = rightarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(4, 62).mirror().addBox(-0.1431F, -3.2751F, -0.3549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.0981F, 1.9202F, 0.5287F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2588F, 4.9522F, 2.063F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightarm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.5F, -4.3707F, -0.7539F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2588F, 5.545F, 3.1246F, 0.5498F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2384F, 5.9326F, 2.5003F, -0.9862F, 0.6201F, -1.8276F));

		PartDefinition cube_r130 = rightarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(12, 57).mirror().addBox(-0.199F, -2.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 50).mirror().addBox(-1.499F, -3.5F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8077F, 1.7038F, -1.4863F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0913F, 4.351F, -1.6512F, 1.8067F, 0.0377F, 0.2007F));

		PartDefinition cube_r131 = righthand.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(14, 28).mirror().addBox(-2.1F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.399F, -0.1486F, -1.1751F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -5.1F, 0.3597F, 0.1275F, 0.0296F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-5.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1505F, 0.7136F, -1.5929F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 35).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.2975F, 0.6733F, -0.9084F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.639F, 0.4123F, -0.3448F));

		PartDefinition cube_r135 = neck2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.0599F, 0.7994F, -1.3814F));

		PartDefinition cube_r136 = neck2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.5593F, 0.617F, -0.697F));

		PartDefinition cube_r137 = neck2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(63, 14).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.0599F, -0.7994F, 1.3814F));

		PartDefinition cube_r138 = neck2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.5593F, -0.617F, 0.697F));

		PartDefinition cube_r139 = neck2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.639F, -0.4123F, 0.3448F));

		PartDefinition cube_r140 = neck2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(63, 35).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.2975F, -0.6733F, 0.9084F));

		PartDefinition cube_r141 = neck2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 33).addBox(2.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1505F, -0.7136F, 1.5929F));

		PartDefinition cube_r142 = neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(24, 69).addBox(0.0F, -2.0F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 17).addBox(0.0F, -1.9F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 25).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.2782F, 0.5375F, -0.0286F));

		PartDefinition cube_r143 = neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(30, 11).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -0.7754F, 0.6713F, 0.8394F, -0.8296F));

		PartDefinition cube_r144 = neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r145 = neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(34, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 11).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -0.7754F, 0.6713F, -0.8394F, 0.8296F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(36, 40).addBox(0.0F, -2.3F, -1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 40).addBox(0.0F, -2.3F, -4.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 28).addBox(-1.0F, -1.4F, -5.7F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, -0.5114F, -0.0132F, -0.0477F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(40, 9).addBox(-1.5F, -3.9517F, -0.0726F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8594F, -4.4043F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(61, 27).addBox(-1.0F, -0.0889F, -0.2074F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4077F, -7.1648F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 59).addBox(-1.0F, -2.9889F, -0.1074F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4077F, -7.1648F, -1.1519F, 0.0F, 0.0F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5296F, 1.5549F, -8.03F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftBeak.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(46, 67).addBox(-0.9831F, -2.5296F, 0.5957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2704F, 2.4066F, -0.9304F, -0.0615F, -0.1181F, -0.0195F));

		PartDefinition cube_r152 = leftBeak.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(33, 56).addBox(-1.0153F, -2.5204F, -0.2499F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2704F, 2.4066F, -0.9304F, -0.3113F, -0.0868F, -0.0352F));

		PartDefinition cube_r153 = leftBeak.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(63, 42).addBox(-0.9517F, -0.0775F, 0.0754F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2704F, 2.8066F, -0.8304F, 0.4191F, 0.0734F, -0.027F));

		PartDefinition cube_r154 = leftBeak.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(29, 67).addBox(-0.9517F, -0.4205F, 1.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2704F, 2.8066F, -0.8304F, -0.3354F, 0.0987F, -0.073F));

		PartDefinition cube_r155 = leftBeak.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(37, 64).addBox(-1.1685F, -1.8606F, 1.4223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2704F, 2.0066F, -0.9304F, -0.8735F, 0.0726F, -0.0817F));

		PartDefinition cube_r156 = leftBeak.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(56, 12).addBox(-1.0203F, -0.1765F, -0.0298F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2704F, 2.0066F, -0.9304F, 0.3697F, -0.0767F, -0.0561F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5296F, 1.5549F, -8.03F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r157 = rightBeak.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-0.0169F, -2.5296F, 0.5957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.4066F, -0.9304F, -0.0615F, 0.1181F, 0.0195F));

		PartDefinition cube_r158 = rightBeak.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(0.0153F, -2.5204F, -0.2499F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.4066F, -0.9304F, -0.3113F, 0.0868F, 0.0352F));

		PartDefinition cube_r159 = rightBeak.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-0.0483F, -0.0775F, 0.0754F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.8066F, -0.8304F, 0.4191F, -0.0734F, 0.027F));

		PartDefinition cube_r160 = rightBeak.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(29, 67).mirror().addBox(-0.0483F, -0.4205F, 1.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.8066F, -0.8304F, -0.3354F, -0.0987F, 0.073F));

		PartDefinition cube_r161 = rightBeak.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(0.1685F, -1.8606F, 1.4223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.0066F, -0.9304F, -0.8735F, -0.0726F, 0.0817F));

		PartDefinition cube_r162 = rightBeak.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(56, 12).mirror().addBox(0.0203F, -0.1765F, -0.0298F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.0066F, -0.9304F, 0.3697F, 0.0767F, 0.0561F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 2.2077F, -2.3648F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(9, 52).addBox(-2.1234F, -0.8279F, -1.6627F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(52, 28).addBox(-2.326F, -0.8476F, -1.6724F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.6546F, -2.0799F, -2.0112F, 0.3716F, 0.081F, -0.0742F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(14, 6).addBox(-1.0F, -0.6F, -0.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.0737F, -1.4653F, -3.3381F, 0.4763F, 0.081F, -0.0742F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(50, 8).addBox(-0.9092F, -0.3476F, -0.1829F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.0264F, -0.9776F, -2.0802F, 3.0507F, 0.081F, -0.0742F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(35, 52).addBox(-0.9803F, -0.6012F, -1.8149F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0264F, -2.3776F, -1.6802F, 1.4624F, 0.081F, -0.0742F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(65, 5).addBox(-0.4593F, -0.3498F, -0.5011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0526F, -0.3098F, 0.7329F, -0.7479F, 1.4594F, 1.7949F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(64, 46).addBox(-0.9292F, -0.6637F, -0.5011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0526F, -0.3098F, 0.7329F, 1.4204F, 0.9958F, -2.293F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5384F, -0.4444F, -1.1304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0526F, 0.8902F, 0.7329F, -1.2838F, 0.9045F, 1.2786F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(5, 57).addBox(-1.7416F, -3.6834F, -0.0245F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8084F, -0.5811F, -3.824F, -1.0933F, 0.3873F, 0.9015F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(55, 2).addBox(-1.0598F, -0.8082F, -0.5518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, -1.8215F, -3.8109F, -0.9881F, -0.7341F, -0.4174F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(55, 24).addBox(-1.1567F, -1.3683F, -0.5518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.3F, -1.8215F, -3.8109F, -1.1008F, -0.4462F, -0.2175F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(19, 64).addBox(0.5F, -3.9517F, -0.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -3.0671F, -2.0395F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(55, 45).addBox(-1.0954F, -0.4499F, -0.5518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(-0.3F, -1.8215F, -3.8109F, -0.8522F, -0.9013F, -0.6028F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 13).addBox(-0.1F, -2.5F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.0371F, -2.3853F, -1.1587F, 0.0067F, -0.1877F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(49, 3).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2555F, 1.9624F, -0.6793F, 0.0718F, -0.1903F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(56, 33).addBox(-0.8685F, -0.8751F, -1.1924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9287F, -1.579F, 0.3279F, -1.1628F, 0.1383F, -0.5576F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(49, 56).addBox(-0.3835F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1435F, -2.1932F, -0.1393F, -1.403F, 0.1882F, -0.2828F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(28, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0435F, -2.1932F, -0.1393F, -1.403F, 0.1882F, -0.2828F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(55, 40).addBox(0.1165F, -0.257F, -2.2852F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8634F, 0.7435F, -1.524F, 0.5035F, 0.123F, -0.1048F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(59, 38).addBox(-0.4518F, -0.93F, -0.09F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8634F, 0.9435F, -1.524F, 0.2755F, -0.0128F, -0.1606F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(36, 40).addBox(-0.4835F, -0.757F, -2.3852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8634F, 0.7435F, -1.524F, 0.4994F, 0.0235F, -0.1594F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 2.2077F, -2.3648F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(0.1234F, -0.8279F, -1.6627F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(52, 28).mirror().addBox(0.326F, -0.8476F, -1.6724F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-0.6546F, -2.0799F, -2.0112F, 0.3716F, -0.081F, 0.0742F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(14, 6).mirror().addBox(-1.0F, -0.6F, -0.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(1.0737F, -1.4653F, -3.3381F, 0.4763F, -0.081F, 0.0742F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-1.0908F, -0.3476F, -0.1829F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(1.0264F, -0.9776F, -2.0802F, 3.0507F, -0.081F, 0.0742F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-1.0197F, -0.6012F, -1.8149F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0264F, -2.3776F, -1.6802F, 1.4624F, -0.081F, 0.0742F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-0.5407F, -0.3498F, -0.5011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0526F, -0.3098F, 0.7329F, -0.7479F, -1.4594F, -1.7949F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(-0.0708F, -0.6637F, -0.5011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0526F, -0.3098F, 0.7329F, 1.4204F, -0.9958F, 2.293F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.4616F, -0.4444F, -1.1304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0526F, 0.8902F, 0.7329F, -1.2838F, -0.9045F, -1.2786F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-0.2584F, -3.6834F, -0.0245F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8084F, -0.5811F, -3.824F, -1.0933F, -0.3873F, -0.9015F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-1.9402F, -0.8082F, -0.5518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.8215F, -3.8109F, -0.9881F, 0.7341F, 0.4174F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-1.8433F, -1.3683F, -0.5518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.8215F, -3.8109F, -1.1008F, 0.4462F, 0.2175F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(19, 64).mirror().addBox(-1.5F, -3.9517F, -0.2726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.3F, -3.0671F, -2.0395F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-1.9046F, -0.4499F, -0.5518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.151F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.8215F, -3.8109F, -0.8522F, 0.9013F, 0.6028F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.9F, -2.5F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, -0.0371F, -2.3853F, -1.1587F, -0.0067F, 0.1877F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 3).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2555F, 1.9624F, -0.6793F, -0.0718F, 0.1903F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 33).mirror().addBox(-0.1315F, -0.8751F, -1.1924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9287F, -1.579F, 0.3279F, -1.1628F, -0.1383F, 0.5576F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(49, 56).mirror().addBox(-0.6165F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1435F, -2.1932F, -0.1393F, -1.403F, -0.1882F, 0.2828F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0435F, -2.1932F, -0.1393F, -1.403F, -0.1882F, 0.2828F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(55, 40).mirror().addBox(-0.1165F, -0.257F, -2.2852F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8634F, 0.7435F, -1.524F, 0.5035F, -0.123F, 0.1048F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-0.5482F, -0.93F, -0.09F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8634F, 0.9435F, -1.524F, 0.2755F, 0.0128F, 0.1606F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(36, 40).mirror().addBox(-0.5165F, -0.757F, -2.3852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8634F, 0.7435F, -1.524F, 0.4994F, -0.0235F, 0.1594F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.4077F, -0.5648F, 0.6821F, 0.0F, 0.0F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-0.4826F, -2.2113F, 0.3124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0092F, 2.9915F, -3.2325F, -0.3073F, -0.1478F, -0.0932F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8752F, 3.5722F, -3.8922F, -1.0297F, -0.1745F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-0.1092F, -1.9789F, -0.0033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 2.3109F, -3.2939F, -1.2566F, -0.1745F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-0.0224F, -0.7615F, -0.3497F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.235F, 3.0109F, -3.7939F, -1.0297F, -0.1745F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(-1.1805F, 0.1218F, -0.3342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7445F, 0.5078F, 0.9511F, -1.094F, -0.3477F, -0.0317F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(-1.1805F, -0.6182F, -0.1081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7445F, 0.5078F, 0.9511F, -1.8619F, -0.3477F, -0.0317F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2202F, 1.4652F, 0.173F, -1.1519F, -0.3491F, 0.0F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(68, 11).mirror().addBox(-0.4951F, -0.73F, -1.9088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 64).mirror().addBox(-0.4951F, -2.73F, -1.1088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7445F, 3.9378F, -1.1484F, -0.733F, -0.3491F, 0.0F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-0.5868F, -1.0987F, -1.9532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0663F, 4.623F, -2.3084F, -1.0472F, -0.1745F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(61, 31).mirror().addBox(-0.4653F, -0.8154F, -1.993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0663F, 4.823F, -3.0084F, -1.3439F, -0.1745F, 0.0F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(31, 61).mirror().addBox(-0.3264F, -0.7797F, -1.7772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0663F, 4.923F, -3.8084F, -1.1694F, -0.1745F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(14, 64).addBox(-0.5174F, -2.2113F, 0.3124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5908F, 2.9915F, -3.2325F, -0.3073F, 0.1478F, 0.0932F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(63, 55).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7248F, 3.5722F, -3.8922F, -1.0297F, 0.1745F, 0.0F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(70, 33).addBox(0.1092F, -1.9789F, -0.0033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.365F, 2.3109F, -3.2939F, -1.2566F, 0.1745F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(40, 70).addBox(0.0224F, -0.7615F, -0.3497F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.365F, 3.0109F, -3.7939F, -1.0297F, 0.1745F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(28, 37).addBox(0.1805F, 0.1218F, -0.3342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1445F, 0.5078F, 0.9511F, -1.094F, 0.3477F, 0.0317F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(41, 67).addBox(0.1805F, -0.6182F, -0.1081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1445F, 0.5078F, 0.9511F, -1.8619F, 0.3477F, 0.0317F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6202F, 1.4652F, 0.173F, -1.1519F, 0.3491F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(68, 11).addBox(-0.5049F, -0.73F, -1.9088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 64).addBox(-0.5049F, -2.73F, -1.1088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1445F, 3.9378F, -1.1484F, -0.733F, 0.3491F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(45, 61).addBox(-0.4132F, -1.0987F, -1.9532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5337F, 4.623F, -2.3084F, -1.0472F, 0.1745F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 31).addBox(-0.5347F, -0.8154F, -1.993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5337F, 4.823F, -3.0084F, -1.3439F, 0.1745F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(31, 61).addBox(-0.6736F, -0.7797F, -1.7772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5337F, 4.923F, -3.8084F, -1.1694F, 0.1745F, 0.0F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7199F, 4.6617F, -4.9042F, 0.0462F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftLowerbeak.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5801F, -1.0148F, -0.8285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6386F, -0.4538F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftLowerbeak.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(24, 65).addBox(-0.5801F, -1.2894F, -0.3159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.1614F, -0.7538F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftLowerbeak.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(64, 67).addBox(-0.5801F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5529F, 0.5121F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftLowerbeak.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(5, 68).addBox(-0.5801F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.1044F, 0.7728F, -1.3352F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, -0.8F, 3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(20, 44).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.7F, -0.193F, -0.0839F, 0.0241F));

		PartDefinition cube_r229 = tail.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(7, 45).addBox(0.0F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 46).addBox(0.0F, -2.2F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 1.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(34, 67).addBox(0.0F, 1.9F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 67).addBox(0.0F, 0.3F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 28).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.948F, 2.4245F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 3).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.1806F, -0.2577F, -0.0465F));

		PartDefinition cube_r231 = tail2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(6, 26).addBox(0.0F, -3.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -3.4F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 28).addBox(0.0F, -3.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(14, 6).addBox(0.0F, 4.191F, 5.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 70).addBox(0.0F, 2.191F, 3.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(0.0F, 1.091F, 1.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(0.0F, 0.391F, -0.1192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0607F, 2.0987F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(39, 0).addBox(0.0F, -1.7512F, -0.1747F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.3F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r234 = tail2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.236F, -0.2181F, -0.0039F));

		PartDefinition cube_r235 = tail3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(15, 15).addBox(0.0F, -3.2F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 15).addBox(0.0F, -2.4F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 6).addBox(0.0F, -1.5F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, -0.8F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r236 = tail3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 5.091F, 7.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 40).addBox(0.0F, 7.291F, 11.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 13).addBox(0.0F, 6.191F, 9.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0607F, -7.9013F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 10.0F, 0.3604F, -0.3283F, -0.1209F));

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