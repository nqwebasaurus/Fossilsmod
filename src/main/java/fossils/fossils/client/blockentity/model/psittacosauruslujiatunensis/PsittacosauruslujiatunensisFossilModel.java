package fossils.fossils.client.blockentity.model.psittacosauruslujiatunensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PsittacosauruslujiatunensisFossilModel extends SkullModelBase {
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
	private final ModelPart rightLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PsittacosauruslujiatunensisFossilModel(ModelPart root) {
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
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -21.5F, -3.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.4196F, -2.7545F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.0085F, 2.3883F, -1.9785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.8359F, 0.2614F, 0.014F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 46).mirror().addBox(-0.5539F, -0.6432F, -0.6679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.6248F, -1.3781F, -0.4694F, 0.2614F, 0.014F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(-0.0878F, -0.5864F, 4.7999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -0.7324F, 0.2618F, -0.1699F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.0878F, -0.0754F, 0.8844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -0.6277F, 0.2618F, -0.1699F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(59, 68).mirror().addBox(-0.0737F, -0.6088F, -0.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -1.1531F, 0.2616F, -0.1839F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 3).mirror().addBox(-0.0737F, 0.0324F, -2.063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.6248F, 0.9219F, -0.4899F, 0.2616F, -0.1839F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 10).mirror().addBox(-0.8F, -2.1305F, -3.4063F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5243F, -1.5144F, -2.125F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.2905F, 0.0965F, -0.2143F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.8F, -1.9431F, 2.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 69).addBox(6.2F, -1.9431F, 2.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -1.8752F, 1.0219F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 40).mirror().addBox(-0.8F, 0.1819F, -0.6095F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(10, 40).addBox(6.2F, 0.1819F, -0.6095F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.2F, -1.8752F, 1.0219F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-0.6019F, -0.2165F, -4.1442F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -2.2752F, -1.6781F, 0.3422F, 0.2974F, 0.0708F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 12).mirror().addBox(-0.8F, -2.891F, -2.5088F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.5248F, 0.6219F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.8F, -0.0986F, -3.7676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(48, 0).addBox(6.2F, -0.0986F, -3.7676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.2F, -1.8752F, 4.2219F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.0F, -0.4F, -2.3F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(49, 18).addBox(-0.3981F, -0.2165F, -4.1442F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, -2.2752F, -1.6781F, 0.3422F, -0.2974F, -0.0708F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(56, 12).addBox(-0.2F, -2.891F, -2.5088F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 53).addBox(-0.9122F, -0.5864F, 4.7999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -0.7324F, -0.2618F, 0.1699F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 45).addBox(-0.9122F, -0.0754F, 0.8844F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -0.6277F, -0.2618F, 0.1699F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 68).addBox(-0.9263F, -0.6088F, -0.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -1.1531F, -0.2616F, 0.1839F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(56, 3).addBox(-0.9263F, 0.0324F, -2.063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.6248F, 0.9219F, -0.4899F, -0.2616F, 0.1839F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 46).addBox(-0.4461F, -0.6432F, -0.6679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2F, 2.6248F, -1.3781F, -0.4694F, -0.2614F, -0.014F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 63).addBox(-0.9915F, 2.3883F, -1.9785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.8359F, -0.2614F, -0.014F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(7, 47).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.4196F, -2.7545F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 13).addBox(-0.4757F, -1.5144F, -2.125F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.2905F, -0.0965F, 0.2143F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.4F, -2.3F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 10).addBox(-0.2F, -2.1305F, -3.4063F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2F, 0.5248F, 0.6219F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(8, 70).addBox(0.0F, -2.7976F, 7.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 12).addBox(0.0F, -2.4976F, 5.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 16).addBox(0.0F, -2.3976F, 3.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 70).addBox(0.0F, -2.1976F, 1.9302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 26).addBox(0.0F, -1.9976F, -0.0698F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 0.4033F, -0.4794F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftleg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(53, 36).addBox(0.5F, -0.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 6.2433F, -2.0003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftleg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 52).addBox(-0.5F, -7.0F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(59, 59).addBox(-0.5F, -4.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(60, 48).addBox(-0.5F, -4.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 5.4842F, -2.3173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftleg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(39, 2).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 3.0938F, -0.2613F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftleg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(59, 54).addBox(-0.5F, 0.0704F, 0.2516F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(64, 20).addBox(-0.5F, 0.0704F, -0.0484F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 4.2842F, -2.4173F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 8.749F, -2.6285F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftleg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 61).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(54, 55).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftleg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 49).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftleg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(12, 65).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 7.4423F, 4.3312F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftleg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(44, 57).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftleg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(22, 57).addBox(-0.601F, -0.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8246F, 4.3116F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftleg3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 41).addBox(-0.602F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(62, 0).addBox(-0.602F, 0.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7F, -1.2F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftfoot.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(14, 7).addBox(-1.0F, -1.0F, 2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(40, 17).addBox(-1.499F, -0.5851F, -2.8428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6686F, -0.7616F, 0.7679F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 0.4033F, -0.4794F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightleg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-2.5F, -0.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 6.2433F, -2.0003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightleg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(27, 52).mirror().addBox(-1.5F, -7.0F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(59, 59).mirror().addBox(-1.5F, -4.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(60, 48).mirror().addBox(-1.5F, -4.0F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.4842F, -2.3173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(39, 2).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0938F, -0.2613F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightleg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-1.5F, 0.0704F, 0.2516F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(64, 20).mirror().addBox(-1.5F, 0.0704F, -0.0484F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.2842F, -2.4173F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 8.749F, -2.6285F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightleg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(37, 61).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(54, 55).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightleg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(12, 65).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 7.4423F, 4.3312F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightleg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(44, 57).mirror().addBox(-0.5F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightleg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-0.399F, -0.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8246F, 4.3116F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightleg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 41).mirror().addBox(-1.398F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(62, 0).mirror().addBox(-1.398F, 0.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7F, -1.2F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightfoot.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(14, 7).mirror().addBox(-2.0F, -1.0F, 2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(40, 17).mirror().addBox(-1.501F, -0.5851F, -2.8428F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6686F, -0.7616F, 0.9425F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.3F, -0.3901F, 0.0999F, 0.0142F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 68).addBox(0.0F, -1.7929F, -1.2848F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8935F, -0.6435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 68).addBox(0.0F, -1.8478F, -0.896F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4935F, -2.7435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(69, 0).addBox(0.0F, -2.5999F, 0.9573F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 69).addBox(0.0F, -1.6999F, -1.0427F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7065F, -6.6435F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-1.98F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3273F, -1.2603F, 0.4135F, 0.1047F, -0.2965F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(34, 32).mirror().addBox(-2.6703F, -1.0713F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3273F, -1.2603F, 0.2643F, 0.298F, -0.8173F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(18, 40).mirror().addBox(-3.6429F, -2.7629F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7602F, -3.2129F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-3.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7602F, -3.2129F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 47).mirror().addBox(-1.98F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7602F, -3.2129F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-1.98F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1931F, -5.1655F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(65, 58).mirror().addBox(-3.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1931F, -5.1655F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-5.6429F, -2.7629F, -0.3222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1931F, -5.1655F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-6.7192F, -2.7479F, -0.4404F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6043F, -7.0204F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-3.7288F, -1.0202F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6043F, -7.0204F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-2.0058F, 0.026F, -0.4036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6043F, -7.0204F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 10).mirror().addBox(-7.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0156F, -8.8754F, 0.0889F, 0.4487F, -1.3604F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(67, 49).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0156F, -8.8754F, 0.3087F, 0.3423F, -0.8033F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0156F, -8.8754F, 0.4724F, 0.1224F, -0.2899F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(65, 33).addBox(-0.02F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3273F, -1.2603F, 0.4135F, -0.1047F, 0.2965F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(34, 32).addBox(1.6703F, -1.0713F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3273F, -1.2603F, 0.2643F, -0.298F, 0.8173F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(66, 47).addBox(-0.02F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7602F, -3.2129F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 53).addBox(1.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7602F, -3.2129F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(18, 40).addBox(2.6429F, -2.7629F, -0.3222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7602F, -3.2129F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(66, 55).addBox(-0.02F, -0.0437F, -0.2832F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1931F, -5.1655F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 58).addBox(1.6703F, -1.0713F, -0.3222F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1931F, -5.1655F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(48, 7).addBox(2.6429F, -2.7629F, -0.3222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1931F, -5.1655F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(39, 0).addBox(2.7192F, -2.7479F, -0.4404F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6043F, -7.0204F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 62).addBox(1.7288F, -1.0202F, -0.4404F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6043F, -7.0204F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(66, 60).addBox(0.0058F, 0.026F, -0.4036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6043F, -7.0204F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0156F, -8.8754F, 0.4724F, -0.1224F, 0.2899F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 49).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0156F, -8.8754F, 0.3087F, -0.3423F, 0.8033F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(30, 10).addBox(2.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0156F, -8.8754F, 0.0889F, -0.4487F, 1.3604F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(25, 28).addBox(0.0F, -1.3029F, -0.4582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0352F, -9.1473F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.0872F, -0.0017F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.6F, -9.6F, 0.2705F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, -9.6F, -0.195F, 0.0515F, 0.0362F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-7.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.8754F, 0.1238F, 0.585F, -1.3431F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.8754F, 0.4158F, 0.4409F, -0.7624F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.8754F, 0.6079F, 0.1611F, -0.2707F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3156F, -2.4754F, 0.6591F, 0.1749F, -0.2621F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(6, 68).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3156F, -2.4754F, 0.4584F, 0.4767F, -0.7435F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(10, 38).mirror().addBox(-7.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3156F, -2.4754F, 0.1385F, 0.636F, -1.3347F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4156F, -4.3754F, 0.1776F, 0.7544F, -1.3096F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4156F, -4.3754F, 0.5643F, 0.5571F, -0.6911F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(67, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4156F, -4.3754F, 0.7796F, 0.2052F, -0.2393F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 47).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4156F, -4.3754F, 0.1776F, -0.7544F, 1.3096F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 64).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4156F, -4.3754F, 0.5643F, -0.5571F, 0.6911F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(67, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4156F, -4.3754F, 0.7796F, -0.2052F, 0.2393F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(10, 38).addBox(2.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3156F, -2.4754F, 0.1385F, -0.636F, 1.3347F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(6, 68).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3156F, -2.4754F, 0.4584F, -0.4767F, 0.7435F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(66, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3156F, -2.4754F, 0.6591F, -0.1749F, 0.2621F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(64, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.8754F, 0.6079F, -0.1611F, 0.2707F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(21, 0).addBox(2.6959F, -2.752F, -0.5375F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.8754F, 0.1238F, -0.585F, 1.3431F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 5).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.8754F, 0.4158F, -0.4409F, 0.7624F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(39, 3).mirror().addBox(-0.119F, -0.0485F, -0.3974F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.597F, 0.0395F, 0.8705F, -0.6204F, -0.5809F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(28, 40).mirror().addBox(-0.1452F, 0.0669F, -0.4468F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.497F, -0.0605F, 1.0229F, -0.9632F, -0.741F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-0.4971F, -0.0955F, 0.1186F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 8.497F, 0.2395F, 1.703F, -1.0269F, -1.2746F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-1.0F, -0.7646F, -0.091F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(18, 37).addBox(1.4F, -0.7646F, -0.091F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 9.097F, -4.7605F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 15).mirror().addBox(-1.5051F, -1.1278F, -3.7955F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9137F, 5.2519F, -3.4028F, 1.0628F, -0.1349F, -0.7088F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(-0.972F, -0.8736F, 0.473F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9137F, 5.2519F, -3.4028F, 1.2388F, -0.0121F, -0.0692F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.972F, -0.9269F, -1.5417F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9137F, 5.2519F, -3.4028F, 1.0643F, -0.0121F, -0.0692F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(14, 0).addBox(-0.028F, -0.8736F, 0.473F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9137F, 5.2519F, -3.4028F, 1.2388F, 0.0121F, 0.0692F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(15, 15).addBox(0.5051F, -1.1278F, -3.7955F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9137F, 5.2519F, -3.4028F, 1.0628F, 0.1349F, 0.7088F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 0).addBox(-0.028F, -0.9269F, -1.5417F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9137F, 5.2519F, -3.4028F, 1.0643F, 0.0121F, 0.0692F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(39, 3).addBox(-0.881F, -0.0485F, -0.3974F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 8.597F, 0.0395F, 0.8705F, 0.6204F, 0.5809F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(28, 40).addBox(-0.8548F, 0.0669F, -0.4468F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 8.497F, -0.0605F, 1.0229F, 0.9632F, 0.741F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(50, 42).addBox(-0.5029F, -0.0955F, 0.1186F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 8.497F, 0.2395F, 1.703F, 1.0269F, 1.2746F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(14, 0).addBox(0.0F, -2.6968F, 3.8105F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 70).addBox(0.0F, -2.0968F, 1.8105F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 70).addBox(0.0F, -1.4968F, -0.1895F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.082F, -4.8807F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, -1.0F, -6.4F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 7.4651F, -1.7441F, 1.3044F, 0.2595F, -0.2968F));

		PartDefinition cube_r118 = leftarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(65, 29).addBox(-0.0096F, -1.9621F, -0.4622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0981F, 1.1202F, -0.7713F, -0.264F, -0.5618F, -0.083F));

		PartDefinition cube_r119 = leftarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(37, 66).addBox(-0.6461F, -1.6201F, -0.5898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0981F, 1.9202F, 0.5287F, 0.853F, -0.5618F, -0.083F));

		PartDefinition cube_r120 = leftarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(24, 65).addBox(-0.8569F, -3.2751F, -0.3549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0981F, 1.9202F, 0.5287F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2588F, 4.9522F, 2.063F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(19, 65).addBox(-0.5F, -4.3707F, -0.7539F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2588F, 5.545F, 3.1246F, 0.5498F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2384F, 5.9326F, 2.5003F, -0.639F, -0.977F, 1.3547F));

		PartDefinition cube_r123 = leftarm2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(49, 57).addBox(-0.801F, -2.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 57).addBox(0.499F, -3.5F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8077F, 1.7038F, -1.4863F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0913F, 4.351F, -1.1512F, 1.6322F, -0.0377F, -0.2007F));

		PartDefinition cube_r124 = lefthand.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(14, 28).addBox(-0.9F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.399F, -0.1486F, -1.1751F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 7.4651F, -1.7441F, 0.6292F, -0.2924F, 0.2127F));

		PartDefinition cube_r125 = rightarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-0.9904F, -1.9621F, -0.4622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.0981F, 1.1202F, -0.7713F, -0.264F, 0.5618F, 0.083F));

		PartDefinition cube_r126 = rightarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(37, 66).mirror().addBox(-0.3539F, -1.6201F, -0.5898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0981F, 1.9202F, 0.5287F, 0.853F, 0.5618F, 0.083F));

		PartDefinition cube_r127 = rightarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(24, 65).mirror().addBox(-0.1431F, -3.2751F, -0.3549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.0981F, 1.9202F, 0.5287F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2588F, 4.9522F, 2.063F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightarm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(19, 65).mirror().addBox(-0.5F, -4.3707F, -0.7539F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2588F, 5.545F, 3.1246F, 0.5498F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2384F, 5.9326F, 2.5003F, -0.9862F, 0.6201F, -1.8276F));

		PartDefinition cube_r130 = rightarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(49, 57).mirror().addBox(-0.199F, -2.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 57).mirror().addBox(-1.499F, -3.5F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8077F, 1.7038F, -1.4863F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0913F, 4.351F, -1.1512F, 1.6322F, 0.0377F, 0.2007F));

		PartDefinition cube_r131 = righthand.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(14, 28).mirror().addBox(-2.1F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.399F, -0.1486F, -1.1751F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -5.1F, 0.1078F, 0.1214F, 0.1001F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-5.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1505F, 0.7136F, -1.5929F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(37, 58).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.2975F, 0.6733F, -0.9084F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.639F, 0.4123F, -0.3448F));

		PartDefinition cube_r135 = neck2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(68, 7).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.5593F, 0.617F, -0.697F));

		PartDefinition cube_r136 = neck2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.0599F, 0.7994F, -1.3814F));

		PartDefinition cube_r137 = neck2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 0).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.0599F, -0.7994F, 1.3814F));

		PartDefinition cube_r138 = neck2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(68, 7).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.5593F, -0.617F, 0.697F));

		PartDefinition cube_r139 = neck2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(68, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.639F, -0.4123F, 0.3448F));

		PartDefinition cube_r140 = neck2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(37, 58).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.2975F, -0.6733F, 0.9084F));

		PartDefinition cube_r141 = neck2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 33).addBox(2.6959F, -2.752F, -0.5375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1505F, -0.7136F, 1.5929F));

		PartDefinition cube_r142 = neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 41).addBox(0.0F, -2.2F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 70).addBox(0.0F, -2.2F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 32).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.1628F, 0.0576F, 0.0782F));

		PartDefinition cube_r143 = neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -0.7754F, 0.6713F, 0.8394F, -0.8296F));

		PartDefinition cube_r144 = neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(28, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r145 = neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(28, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -0.7754F, 0.6713F, -0.8394F, 0.8296F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(50, 70).addBox(0.0F, -2.6F, -1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 37).addBox(0.0F, -2.7F, -4.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 28).addBox(-1.0F, -1.4F, -5.7F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.6F, 0.2F, -0.0174F, 0.0855F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-2.4F, -1.5F, -1.3031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 58).addBox(0.4F, -1.5F, -1.3031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 25).addBox(-2.5F, -0.8F, -0.3F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(41, 40).addBox(-2.5F, -1.8F, -1.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6213F, -4.8969F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(48, 10).addBox(-2.0F, -3.3562F, -0.2661F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 46).addBox(-1.0F, -0.8562F, -0.0661F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8923F, -9.7648F, -0.9948F, 0.0F, 0.0F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5296F, -0.6451F, -9.93F, -0.0704F, 0.1306F, -0.0092F));

		PartDefinition cube_r150 = leftBeak.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0153F, -2.8204F, -0.2499F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2704F, 2.4623F, -0.5343F, -0.3113F, -0.0868F, -0.0352F));

		PartDefinition cube_r151 = leftBeak.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(49, 24).addBox(-0.8975F, -0.0056F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2704F, 4.3623F, -0.9343F, 0.4011F, 0.0551F, -0.0555F));

		PartDefinition cube_r152 = leftBeak.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(42, 52).addBox(-0.9529F, -0.0073F, 0.0283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2704F, 3.3623F, -0.9343F, -0.0178F, 0.0551F, -0.0555F));

		PartDefinition cube_r153 = leftBeak.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(6, 0).addBox(-0.9962F, -0.8737F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4704F, 4.4623F, 0.1657F, -0.8091F, 0.3882F, -0.1163F));

		PartDefinition cube_r154 = leftBeak.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 2).addBox(-0.9776F, -2.2423F, -1.2408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4704F, 4.4623F, 0.1657F, -1.3449F, 0.361F, -0.1119F));

		PartDefinition cube_r155 = leftBeak.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(63, 25).addBox(-1.0259F, -0.0832F, -0.0654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2704F, 2.5623F, -0.7343F, -0.0153F, -0.0921F, -0.0232F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5296F, -0.6451F, -9.93F, -0.0704F, -0.1306F, 0.0092F));

		PartDefinition cube_r156 = rightBeak.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(0.0153F, -2.8204F, -0.2499F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.4623F, -0.5343F, -0.3113F, 0.0868F, 0.0352F));

		PartDefinition cube_r157 = rightBeak.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-0.1025F, -0.0056F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 4.3623F, -0.9343F, 0.4011F, -0.0551F, 0.0555F));

		PartDefinition cube_r158 = rightBeak.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(42, 52).mirror().addBox(-0.0471F, -0.0073F, 0.0283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 3.3623F, -0.9343F, -0.0178F, -0.0551F, 0.0555F));

		PartDefinition cube_r159 = rightBeak.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(6, 0).mirror().addBox(-0.0038F, -0.8737F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4704F, 4.4623F, 0.1657F, -0.8091F, -0.3882F, 0.1163F));

		PartDefinition cube_r160 = rightBeak.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 2).mirror().addBox(-0.0224F, -2.2423F, -1.2408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4704F, 4.4623F, 0.1657F, -1.3449F, -0.361F, 0.1119F));

		PartDefinition cube_r161 = rightBeak.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(63, 25).mirror().addBox(0.0259F, -0.0832F, -0.0654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2704F, 2.5623F, -0.7343F, -0.0153F, 0.0921F, 0.0232F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 7.2077F, -2.3648F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(45, 32).addBox(-5.3366F, -0.6446F, -0.5901F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5526F, -4.1098F, -5.7671F, 0.158F, 1.2003F, 1.7425F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(58, 30).addBox(-0.2482F, -0.154F, 1.6523F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4004F, -7.4843F, -3.7009F, 1.2597F, 0.4F, 2.9949F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(10, 40).addBox(2.3444F, 1.6501F, -0.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 12).addBox(2.3444F, 1.6501F, 0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(56, 17).addBox(1.5444F, 0.4501F, 0.0227F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6984F, -5.8031F, -4.0326F, 0.1911F, 0.5536F, 3.0546F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(64, 43).addBox(0.2F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -5.9689F, -0.4274F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(53, 64).addBox(0.0376F, 2.9318F, 0.0227F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6984F, -5.8031F, -4.0326F, -0.1733F, 0.5589F, 2.383F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(60, 64).addBox(2.6909F, 0.1427F, 0.0485F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(18, 50).addBox(-0.3091F, -0.4573F, 0.0485F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6984F, -5.8031F, -4.0326F, 0.0014F, 0.5815F, 2.641F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(36, 40).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4213F, -5.0777F, -3.4797F, 0.6602F, 0.8344F, 2.7079F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(62, 8).addBox(-1.6984F, -2.884F, -0.4976F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5526F, -4.1098F, -5.7671F, -0.7551F, 0.6033F, 0.7681F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(62, 35).addBox(-1.6286F, -1.9358F, 0.0035F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1474F, -4.7098F, -6.7671F, -0.5679F, 0.8795F, 1.1901F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 58).addBox(-0.7F, -3.5F, -2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0709F, -6.3329F, -5.0051F, -1.2851F, 0.1743F, -0.1388F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(36, 52).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0397F, -7.1675F, -4.7622F, -2.2289F, 0.3665F, -0.0786F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7276F, -3.9169F, -1.7293F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4291F, -6.3329F, -4.5051F, -1.269F, 0.3665F, -0.0786F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(52, 24).addBox(-0.5F, -1.1491F, -2.3773F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0745F, -7.5617F, -2.5892F, -1.4671F, -0.3192F, -0.4598F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, -1.258F, -0.1484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0745F, -7.5617F, -2.5892F, -1.9297F, -0.3192F, -0.4598F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 51).addBox(-1.2854F, -3.1772F, -0.4707F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4004F, -7.4843F, -3.7009F, -0.8414F, -0.3675F, -0.4651F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 26).addBox(-1.4772F, -0.3516F, 0.3314F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -10.129F, -0.8321F, -1.6958F, -0.3363F, -0.4594F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(12, 61).addBox(0.0F, -0.7F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3383F, -3.6308F, -5.6888F, 0.2867F, 0.2199F, -0.0149F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(45, 52).addBox(-0.5052F, -0.75F, -1.5459F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3964F, -3.8664F, -5.7644F, 0.1373F, 0.2641F, -0.1352F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 7.2077F, -2.3648F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(0.3366F, -0.6446F, -0.5901F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5526F, -4.1098F, -5.7671F, 0.158F, -1.2003F, -1.7425F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-1.7518F, -0.154F, 1.6523F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4004F, -7.4843F, -3.7009F, 1.2597F, -0.4F, -2.9949F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(10, 40).mirror().addBox(-3.3444F, 1.6501F, -0.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(40, 12).mirror().addBox(-3.3444F, 1.6501F, 0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(56, 17).mirror().addBox(-4.5444F, 0.4501F, 0.0227F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6984F, -5.8031F, -4.0326F, 0.1911F, -0.5536F, -3.0546F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(64, 43).mirror().addBox(-1.2F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -5.9689F, -0.4274F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(53, 64).mirror().addBox(-2.0376F, 2.9318F, 0.0227F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6984F, -5.8031F, -4.0326F, -0.1733F, -0.5589F, -2.383F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 64).mirror().addBox(-4.6909F, 0.1427F, 0.0485F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(18, 50).mirror().addBox(-2.6909F, -0.4573F, 0.0485F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6984F, -5.8031F, -4.0326F, 0.0014F, -0.5815F, -2.641F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(36, 40).mirror().addBox(-0.5F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4213F, -5.0777F, -3.4797F, 0.6602F, -0.8344F, -2.7079F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.3016F, -2.884F, -0.4976F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5526F, -4.1098F, -5.7671F, -0.7551F, -0.6033F, -0.7681F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(62, 35).mirror().addBox(-0.3714F, -1.9358F, 0.0035F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1474F, -4.7098F, -6.7671F, -0.5679F, -0.8795F, -1.1901F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(27, 58).mirror().addBox(-0.3F, -3.5F, -2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0709F, -6.3329F, -5.0051F, -1.2851F, -0.1743F, 0.1388F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(36, 52).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0397F, -7.1675F, -4.7622F, -2.2289F, -0.3665F, 0.0786F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.2724F, -3.9169F, -1.7293F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4291F, -6.3329F, -4.5051F, -1.269F, -0.3665F, 0.0786F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 24).mirror().addBox(-0.5F, -1.1491F, -2.3773F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0745F, -7.5617F, -2.5892F, -1.4671F, 0.3192F, 0.4598F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.5F, -1.258F, -0.1484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0745F, -7.5617F, -2.5892F, -1.9297F, 0.3192F, 0.4598F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.2854F, -3.1772F, -0.4707F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4004F, -7.4843F, -3.7009F, -0.8414F, 0.3675F, 0.4651F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(0.4772F, -0.3516F, 0.3314F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -10.129F, -0.8321F, -1.6958F, 0.3363F, 0.4594F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(12, 61).mirror().addBox(0.0F, -0.7F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3383F, -3.6308F, -5.6888F, 0.2867F, -0.2199F, 0.0149F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(45, 52).mirror().addBox(-0.4948F, -0.75F, -1.5459F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3964F, -3.8664F, -5.7644F, 0.1373F, -0.2641F, 0.1352F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 2.2077F, -2.8648F, -0.1033F, 0.0F, 0.0F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(48, 64).mirror().addBox(-0.1701F, -3.7526F, 0.1499F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0092F, 3.0104F, -5.3678F, -0.8203F, -0.1745F, 0.0F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.0911F, -3.0024F, 0.0178F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7189F, 0.4224F, -2.6086F, -1.4081F, -0.3477F, -0.0317F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(-0.5F, -1.6F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.064F, 1.0875F, -0.5915F, -1.0647F, -0.3491F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(31, 69).mirror().addBox(-0.0628F, -3.2261F, 0.3348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 13).mirror().addBox(-0.0628F, -6.2261F, 1.1348F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0092F, 3.7104F, -4.7678F, -0.733F, -0.3491F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-0.8126F, -0.9093F, -1.9685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0092F, 3.5104F, -1.6678F, -0.6226F, -0.1593F, -0.0716F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-0.3784F, -1.8156F, -1.9112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0092F, 4.6104F, -4.1678F, -1.4312F, -0.1745F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(48, 64).addBox(-0.8299F, -3.7526F, 0.1499F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4092F, 3.0104F, -5.3678F, -0.8203F, 0.1745F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-0.1308F, -3.3947F, -1.9283F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5092F, 3.7104F, -4.7678F, -1.2566F, -0.1745F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(23, 71).mirror().addBox(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.735F, 2.6815F, -4.2581F, -0.8116F, -0.1745F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(71, 20).addBox(0.1308F, -3.3947F, -1.9283F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0908F, 3.7104F, -4.7678F, -1.2566F, 0.1745F, 0.0F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(23, 71).addBox(0.0F, -1.0F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.135F, 2.6815F, -4.2581F, -0.8116F, 0.1745F, 0.0F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 38).addBox(-0.9089F, -3.0024F, 0.0178F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1189F, 0.4224F, -2.6086F, -1.4081F, 0.3477F, 0.0317F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(32, 63).addBox(-0.5F, -1.6F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.464F, 1.0875F, -0.5915F, -1.0647F, 0.3491F, 0.0F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(31, 69).addBox(-0.9372F, -3.2261F, 0.3348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 13).addBox(-0.9372F, -6.2261F, 1.1348F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4092F, 3.7104F, -4.7678F, -0.733F, 0.3491F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(32, 58).addBox(-0.1874F, -0.9093F, -1.9685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4092F, 3.5104F, -1.6678F, -0.6226F, 0.1593F, 0.0716F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(58, 22).addBox(-0.6216F, -1.8156F, -1.9112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4092F, 4.6104F, -4.1678F, -1.4312F, 0.1745F, 0.0F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2199F, 4.0806F, -5.2395F, 0.162F, 0.3848F, 0.3593F));

		PartDefinition cube_r214 = leftLowerbeak.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5801F, -1.0148F, -0.8285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6386F, -0.4538F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftLowerbeak.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(43, 65).addBox(-0.5801F, -1.2894F, -0.3159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.1614F, -0.7538F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftLowerbeak.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(12, 69).addBox(-0.5801F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5529F, 0.5121F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftLowerbeak.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(69, 9).addBox(-0.5801F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.1044F, 0.7728F, -1.3352F, 0.0F, 0.0F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3801F, 4.0806F, -5.2395F, 0.162F, -0.3848F, -0.3593F));

		PartDefinition cube_r218 = rightLowerbeak.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-0.4199F, -1.0148F, -0.8285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6386F, -0.4538F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightLowerbeak.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(43, 65).mirror().addBox(-0.4199F, -1.2894F, -0.3159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1614F, -0.7538F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightLowerbeak.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(12, 69).mirror().addBox(-0.4199F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5529F, 0.5121F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightLowerbeak.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-0.4199F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1044F, 0.7728F, -1.3352F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 44).addBox(-1.0F, -0.8F, 3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(32, 46).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.7F, -0.2833F, -0.1677F, 0.0486F));

		PartDefinition cube_r222 = tail.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(44, 69).addBox(0.0F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 69).addBox(0.0F, -2.2F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 70).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 1.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(29, 65).addBox(0.0F, 1.9F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 68).addBox(0.0F, 0.3F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 36).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.948F, 2.4245F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 3).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition cube_r224 = tail2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(40, 17).addBox(0.0F, -3.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 28).addBox(0.0F, -3.4F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 8).addBox(0.0F, -3.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(6, 13).addBox(0.0F, 4.191F, 5.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 71).addBox(0.0F, 2.191F, 3.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 45).addBox(0.0F, 1.091F, 1.8808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 45).addBox(0.0F, 0.391F, -0.1192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0607F, 2.0987F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(69, 35).addBox(0.0F, -1.7512F, -0.1747F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.3F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(41, 69).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.1465F, 0.0413F, 0.029F));

		PartDefinition cube_r228 = tail3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(15, 15).addBox(0.0F, -3.2F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 15).addBox(0.0F, -2.4F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, -1.5F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 26).addBox(0.0F, -0.8F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r229 = tail3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 5.091F, 7.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 1).addBox(0.0F, 7.291F, 11.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(0.0F, 6.191F, 9.8808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0607F, -7.9013F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 10.0F, 0.3357F, 0.2708F, 0.1805F));

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