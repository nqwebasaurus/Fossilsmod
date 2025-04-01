package fossils.fossils.client.blockentity.model.protoceratopsandrewsi;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProtoceratopsandrewsiFossilModel extends SkullModelBase {
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
	private final ModelPart rightFace;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ProtoceratopsandrewsiFossilModel(ModelPart root) {
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
		this.rightFace = this.head.getChild("rightFace");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -26.5F, -1.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -2.3002F, 0.507F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-0.5F, -0.3891F, -0.6517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.7417F, -2.3967F, -0.8901F, 0.2618F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 66).mirror().addBox(-0.5F, 0.2043F, 0.6837F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.7417F, -2.3967F, -0.3665F, 0.2618F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-0.5F, -0.4F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.4642F, -1.9347F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 88).mirror().addBox(-0.5F, 1.3F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6716F, 0.3434F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(89, 30).mirror().addBox(0.0F, -1.8036F, 10.8112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 68).mirror().addBox(0.0F, -1.8036F, 6.8112F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.7248F, 1.5219F, -0.8203F, 0.2618F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(0.0F, -0.7029F, -1.0172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.7248F, 1.5219F, -0.6981F, 0.2618F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 59).mirror().addBox(0.0F, -0.6F, 2.0141F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.7248F, 1.5219F, -0.6458F, 0.2618F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 16).mirror().addBox(0.0F, -0.212F, -2.918F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.7248F, 1.5219F, -0.4538F, 0.2618F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.1026F, 0.153F, -0.3418F, 0.0852F, -0.219F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-4.0F, -0.9843F, -6.5042F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 2.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -0.4F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 57).addBox(6.5F, -0.4F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -1.0439F, 4.9247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(24, 50).mirror().addBox(-0.5F, 0.026F, 0.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 50).addBox(6.5F, 0.026F, 0.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -2.043F, 5.8942F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 80).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 80).addBox(6.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -1.543F, 4.8942F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 30).mirror().addBox(-4.0F, -0.0601F, -2.9323F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(79, 64).mirror().addBox(-4.0F, -0.1087F, -3.0465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7F, 1.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-0.5F, -0.8473F, -4.4696F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -2.164F, -2.0223F, 0.1828F, 0.3006F, 0.0547F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, -0.8473F, -4.4696F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -2.164F, -2.0223F, 0.1828F, -0.3006F, -0.0547F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 64).addBox(3.0F, -0.1087F, -3.0465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, 1.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 30).addBox(3.0F, -0.0601F, -2.9323F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(89, 30).addBox(-1.0F, -1.8036F, 10.8112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 68).addBox(-1.0F, -1.8036F, 6.8112F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2F, 1.7248F, 1.5219F, -0.8203F, -0.2618F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 59).addBox(-1.0F, -0.6F, 2.0141F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 1.7248F, 1.5219F, -0.6458F, -0.2618F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 6).addBox(-1.0F, -0.7029F, -1.0172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2F, 1.7248F, 1.5219F, -0.6981F, -0.2618F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 16).addBox(-1.0F, -0.212F, -2.918F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 1.7248F, 1.5219F, -0.4538F, -0.2618F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 66).addBox(-0.5F, 0.2043F, 0.6837F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 0.7417F, -2.3967F, -0.3665F, -0.2618F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(88, 14).addBox(-0.5F, -0.3891F, -0.6517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.7417F, -2.3967F, -0.8901F, -0.2618F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(83, 77).addBox(-0.5F, -0.4F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.4642F, -1.9347F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 88).addBox(-0.5F, 1.3F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5F, -0.6716F, 0.3434F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(9, 62).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.1026F, 0.153F, -0.3418F, -0.0852F, 0.219F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(-1.0F, -0.4F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(41, 11).addBox(-1.0F, -0.4F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.6532F, 0.5342F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(19, 39).addBox(3.0F, -0.9843F, -6.5042F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7F, 2.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(66, 0).addBox(0.0F, 7.2891F, -3.9534F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.9F, 0.0033F, 0.2206F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftleg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(75, 39).addBox(-0.5F, -7.0F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(16, 72).addBox(-0.5F, -4.0F, -0.3F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(49, 66).addBox(-0.5F, -4.0F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 4.63F, -1.9704F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftleg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(65, 33).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 3.8209F, -1.3106F, -0.6283F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.3948F, -2.5816F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftleg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 87).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(11, 70).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftleg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(62, 78).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftleg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(88, 72).addBox(-0.601F, 8.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(51, 76).addBox(-0.601F, -0.5F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftleg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(46, 76).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7246F, 5.8116F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftleg3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 84).addBox(-0.602F, -0.5F, -0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(86, 0).addBox(-0.602F, 1.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7F, -1.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftfoot.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(11, 56).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(45, 28).addBox(-1.499F, -0.5851F, -4.8428F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3686F, -1.7616F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(36, 26).addBox(-2.0F, 7.2891F, -3.9534F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-3.9F, 0.0033F, 0.2206F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightleg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 17).addBox(-1.5F, -7.0F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(34, 71).addBox(-1.5F, -4.0F, -0.3F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(42, 66).addBox(-1.5F, -4.0F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.63F, -1.9704F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(49, 45).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 3.8209F, -1.3106F, -0.6283F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.3948F, -2.5816F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightleg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(86, 9).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(67, 66).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 2.4884F, 1.9379F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightleg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(77, 74).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightleg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(88, 67).addBox(-0.399F, 8.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(41, 76).addBox(-0.399F, -0.5F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 74).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 5.4507F, 3.7989F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7246F, 5.8116F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightleg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(82, 43).addBox(-1.398F, -0.5F, -0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(77, 85).addBox(-1.398F, 1.5F, 0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7F, -1.6F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightfoot.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(55, 53).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(44, 21).addBox(-1.501F, -0.5851F, -4.8428F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3686F, -1.7616F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -3.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(13, 92).addBox(0.0F, -2.5853F, -0.3285F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8935F, -0.6435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 91).addBox(0.0F, -2.9401F, 0.0603F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4935F, -2.7435F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 89).addBox(0.0F, -3.6418F, 1.9276F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 91).addBox(0.0F, -3.0418F, -0.0724F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7065F, -6.6435F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-3.6959F, -2.752F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -2.1754F, 0.0589F, 0.2596F, -1.581F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 23).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -2.1754F, 0.1821F, 0.1951F, -1.0473F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(8, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -2.1754F, 0.2925F, 0.0557F, -0.5161F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(28, 11).mirror().addBox(-9.6959F, -2.752F, -0.5375F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5156F, -6.0754F, 0.081F, 0.4145F, -1.3637F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(3, 64).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5156F, -6.0754F, 0.2832F, 0.3171F, -0.8116F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8156F, -4.1754F, 0.0743F, 0.3625F, -1.4535F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8156F, -4.1754F, 0.2493F, 0.2759F, -0.9087F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8156F, -4.1754F, 0.3899F, 0.0928F, -0.3861F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(38, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5156F, -6.0754F, 0.4387F, 0.1124F, -0.2938F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(8, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -2.1754F, 0.2925F, -0.0557F, 0.5161F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(56, 23).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -2.1754F, 0.1821F, -0.1951F, 1.0473F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 8).addBox(2.6959F, -2.752F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -2.1754F, 0.0589F, -0.2596F, 1.581F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8156F, -4.1754F, 0.3899F, -0.0928F, 0.3861F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(22, 57).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8156F, -4.1754F, 0.2493F, -0.2759F, 0.9087F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(45, 35).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8156F, -4.1754F, 0.0743F, -0.3625F, 1.4535F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(28, 11).addBox(2.6959F, -2.752F, -0.5375F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5156F, -6.0754F, 0.081F, -0.4145F, 1.3637F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(3, 64).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5156F, -6.0754F, 0.2832F, -0.3171F, 0.8116F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(38, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5156F, -6.0754F, 0.4387F, -0.1124F, 0.2938F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -1.5F, -7.6F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.2705F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -7.6F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(21, 89).addBox(0.0F, -5.6238F, 3.3493F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 89).addBox(0.0F, -6.6238F, 5.1493F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 89).addBox(0.0F, -4.3238F, 1.6493F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 91).addBox(0.0F, -3.0238F, -0.0507F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7412F, -5.8097F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(31, 64).mirror().addBox(0.0F, 1.0205F, 4.4906F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 6.3464F, -3.0228F, 1.3875F, 0.0F, 0.1047F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(16, 17).mirror().addBox(0.0F, -0.9639F, -0.094F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 6.3464F, -3.0228F, 0.9861F, 0.0F, 0.1047F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(0.0F, -1.6442F, -2.9434F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 6.2956F, -3.3725F, 1.0503F, -0.2796F, -0.4487F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.1969F, -3.0241F, -3.538F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, 8.7956F, -3.3725F, 1.1685F, -0.4365F, -0.7823F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 6).addBox(1.4F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 10.397F, -4.0605F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(11, 39).mirror().addBox(-1.0F, -0.8638F, -0.0779F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(11, 39).addBox(1.4F, -0.8638F, -0.0779F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 11.497F, -2.2605F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, 0.0012F, -0.4674F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 10.497F, 2.5395F, 1.0391F, -0.6112F, -0.6721F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.5F, 0.0012F, -0.1674F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 10.497F, 2.5395F, 0.9145F, -0.8641F, -0.6957F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(23, 50).mirror().addBox(-0.5F, 0.0012F, -0.5674F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 10.497F, 2.5395F, 1.2322F, -0.9684F, -1.0286F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 15).mirror().addBox(-10.6959F, -2.752F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0156F, -1.5754F, 0.1191F, 0.568F, -1.3457F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(45, 37).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0156F, -1.5754F, 0.4019F, 0.4288F, -0.7682F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(45, 37).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.1754F, 0.3611F, 0.3921F, -0.7845F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(15, 15).mirror().addBox(-10.6959F, -2.752F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.1754F, 0.1057F, 0.5169F, -1.3526F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(41, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3156F, -0.1754F, 0.5399F, 0.1421F, -0.281F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0156F, -1.5754F, 0.5909F, 0.1564F, -0.2734F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-9.6959F, -2.752F, -0.5375F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2156F, -3.3754F, 0.1489F, 0.6699F, -1.3633F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(41, 5).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2156F, -3.3754F, 0.6934F, 0.1838F, -0.2909F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(10, 33).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2156F, -3.3754F, 0.4876F, 0.5001F, -0.7647F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(41, 19).mirror().addBox(-8.6959F, -2.752F, -0.5375F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.3156F, -4.9754F, 0.076F, 0.7367F, -1.4011F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.3156F, -4.9754F, 0.7286F, 0.2637F, -0.2738F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.3156F, -4.9754F, 0.4802F, 0.5868F, -0.7592F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.3156F, -4.9754F, 0.7286F, -0.2637F, 0.2738F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 48).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.3156F, -4.9754F, 0.4802F, -0.5868F, 0.7592F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(41, 19).addBox(2.6959F, -2.752F, -0.5375F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.3156F, -4.9754F, 0.076F, -0.7367F, 1.4011F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(41, 5).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2156F, -3.3754F, 0.6934F, -0.1838F, 0.2909F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 33).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2156F, -3.3754F, 0.4876F, -0.5001F, 0.7647F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(15, 0).addBox(2.6959F, -2.752F, -0.5375F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2156F, -3.3754F, 0.1489F, -0.6699F, 1.3633F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0156F, -1.5754F, 0.5909F, -0.1564F, 0.2734F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 15).addBox(2.6959F, -2.752F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0156F, -1.5754F, 0.1191F, -0.568F, 1.3457F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(45, 37).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0156F, -1.5754F, 0.4019F, -0.4288F, 0.7682F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.1754F, 0.5399F, -0.1421F, 0.281F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(15, 15).addBox(2.6959F, -2.752F, -0.5375F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.1754F, 0.1057F, -0.5169F, 1.3526F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 37).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3156F, -0.1754F, 0.3611F, -0.3921F, 0.7845F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(31, 64).addBox(-1.0F, 1.0205F, 4.4906F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 6.3464F, -3.0228F, 1.3875F, 0.0F, -0.1047F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 13).addBox(-0.8031F, -3.0241F, -3.538F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 8.7956F, -3.3725F, 1.1685F, 0.4365F, 0.7823F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -1.6442F, -2.9434F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 6.2956F, -3.3725F, 1.0503F, 0.2796F, 0.4487F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(16, 17).addBox(-1.0F, -0.9639F, -0.094F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 6.3464F, -3.0228F, 0.9861F, 0.0F, -0.1047F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, 0.0012F, -0.4674F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 10.497F, 2.5395F, 1.0391F, 0.6112F, 0.6721F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, 0.0012F, -0.1674F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 10.497F, 2.5395F, 0.9145F, 0.8641F, 0.6957F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(23, 50).addBox(-0.5F, 0.0012F, -0.5674F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 10.497F, 2.5395F, 1.2322F, 0.9684F, 1.0286F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, -1.0F, -7.4F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 10.4651F, -2.3441F, -0.691F, -0.0998F, -0.4052F));

		PartDefinition cube_r114 = leftarm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(21, 39).addBox(-0.5F, -3.2879F, -0.9088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5275F, 1.2379F, 0.3485F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r115 = leftarm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(90, 22).addBox(-0.5F, -0.7746F, -0.5854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5275F, 1.2379F, 0.3485F, 0.7085F, -0.5672F, -0.0056F));

		PartDefinition cube_r116 = leftarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(16, 86).addBox(-0.8569F, -2.6154F, 0.1885F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3569F, 0.278F, 0.1937F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftarm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(7, 89).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.2209F, 2.7038F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(84, 87).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9029F, 3.0896F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5796F, 7.2904F, 4.4653F, 0.3665F, -0.3596F, 0.4729F));

		PartDefinition cube_r119 = leftarm2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(23, 81).addBox(-0.801F, -2.5F, 0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 80).addBox(0.499F, -3.5F, 0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 5.6076F, -2.1054F, 1.1522F, -0.0377F, -0.2007F));

		PartDefinition cube_r120 = lefthand.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.399F, -0.1486F, -1.1751F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r121 = lefthand.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(62, 40).addBox(-1.5F, -1.2F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.899F, 0.3514F, -2.6751F, -0.8096F, 0.2026F, -0.2301F));

		PartDefinition cube_r122 = lefthand.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(84, 83).addBox(-0.5F, -1.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.001F, 0.2514F, -2.8751F, -0.802F, -0.1742F, 0.1964F));

		PartDefinition cube_r123 = lefthand.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(16, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.499F, -0.2486F, -1.3751F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 10.4651F, -2.3441F, -0.0436F, 0.0F, 0.2618F));

		PartDefinition cube_r124 = rightarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, -3.2879F, -0.9088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5275F, 1.2379F, 0.3485F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r125 = rightarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(89, 87).addBox(-0.5F, -0.7746F, -0.5854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5275F, 1.2379F, 0.3485F, 0.7085F, 0.5672F, 0.0056F));

		PartDefinition cube_r126 = rightarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 49).addBox(-0.1431F, -2.6154F, 0.1885F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3569F, 0.278F, 0.1937F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.2209F, 2.7038F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(41, 87).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9029F, 3.0896F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5796F, 7.2904F, 4.4653F, 0.2356F, 0.3596F, -0.4729F));

		PartDefinition cube_r129 = rightarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(36, 80).addBox(-0.199F, -2.5F, 0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 79).addBox(-1.499F, -3.5F, 0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 5.6076F, -2.1054F, 0.6286F, 0.0377F, 0.2007F));

		PartDefinition cube_r130 = righthand.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 52).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.399F, -0.1486F, -1.1751F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r131 = righthand.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(61, 23).addBox(-1.5F, -1.2F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.899F, 0.3514F, -2.6751F, -0.8096F, -0.2026F, 0.2301F));

		PartDefinition cube_r132 = righthand.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(61, 84).addBox(-1.5F, -1.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.001F, 0.2514F, -2.8751F, -0.802F, 0.1742F, -0.1964F));

		PartDefinition cube_r133 = righthand.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(9, 49).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.499F, -0.2486F, -1.3751F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1F, -5.9F, -0.076F, 0.1815F, 0.0844F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(62, 92).addBox(0.0F, -2.4F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 63).addBox(0.0F, -2.4F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 37).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r135 = neck2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(24, 48).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1559F, 0.8707F, -1.5968F));

		PartDefinition cube_r136 = neck2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.435F, 0.7928F, -0.8161F));

		PartDefinition cube_r137 = neck2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.8041F, 0.4603F, -0.2749F));

		PartDefinition cube_r138 = neck2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r139 = neck2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r140 = neck2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(65, 12).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r141 = neck2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(89, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r142 = neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(89, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.8041F, -0.4603F, 0.2749F));

		PartDefinition cube_r143 = neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(69, 90).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.435F, -0.7928F, 0.8161F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(24, 48).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1559F, -0.8707F, 1.5968F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.0635F, 0.3148F, 0.1074F));

		PartDefinition cube_r145 = neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(69, 92).addBox(0.0F, -3.1F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 8).addBox(0.0F, -3.4F, -3.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(14, 48).addBox(-1.0F, -1.4F, -4.7F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(82, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -0.7754F, 0.5936F, 0.7337F, -0.9392F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r148 = neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(77, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition cube_r149 = neck.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(82, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -0.7754F, 0.5936F, -0.7337F, 0.9392F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, -0.0516F, 0.2709F, 0.1354F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(54, 45).addBox(-1.5F, -3.7845F, -0.0223F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7F, -4.6F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(35, 54).addBox(-1.0F, -6.067F, 0.0406F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9F, -10.0F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(72, 67).addBox(-1.0F, -2.5068F, -0.1324F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.3F, -8.1F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -3.1665F, -0.1596F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.7F, -9.9F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 50).addBox(-1.0F, -2.067F, 0.0361F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -11.2F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-0.2F, 0.2485F, -0.7493F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 56).mirror().addBox(-0.5F, -0.4515F, -0.7493F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3585F, -5.9219F, 0.3665F, -0.2094F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(59, 88).mirror().addBox(-0.5F, -0.4764F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3585F, -5.9219F, 0.2705F, -0.2094F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(59, 88).addBox(-0.5F, -0.4764F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 5.3585F, -5.9219F, 0.2705F, 0.2094F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 52).addBox(0.2F, 0.2485F, -0.7493F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(66, 56).addBox(-0.5F, -0.4515F, -0.7493F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 5.3585F, -5.9219F, 0.3665F, 0.2094F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(19, 29).addBox(-3.0F, -7.2F, 1.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -3.1F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, 2.2982F, -3.537F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r160 = leftCheek.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(41, 0).addBox(-0.8241F, 0.3034F, -0.5861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2079F, -0.6856F, 2.5085F, 1.11F, 0.9574F, 0.5916F));

		PartDefinition cube_r161 = leftCheek.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(9, 84).addBox(-0.8241F, -1.6702F, -0.2851F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2079F, -0.6856F, 2.5085F, 0.2373F, 0.9574F, 0.5916F));

		PartDefinition cube_r162 = leftCheek.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(85, 62).addBox(-0.8241F, -0.647F, 0.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2079F, -0.6856F, 2.5085F, 0.6737F, 0.9574F, 0.5916F));

		PartDefinition cube_r163 = leftCheek.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(46, 57).addBox(-1.0F, -1.3289F, -0.8534F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, -0.4982F, 0.437F, 0.4499F, 0.6816F, 0.4262F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, 2.2982F, -3.537F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r164 = rightCheek.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.1759F, 0.3034F, -0.5861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2079F, -0.6856F, 2.5085F, 1.11F, -0.9574F, -0.5916F));

		PartDefinition cube_r165 = rightCheek.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(9, 84).mirror().addBox(-0.1759F, -1.6702F, -0.2851F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2079F, -0.6856F, 2.5085F, 0.2373F, -0.9574F, -0.5916F));

		PartDefinition cube_r166 = rightCheek.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(85, 62).mirror().addBox(-0.1759F, -0.647F, 0.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2079F, -0.6856F, 2.5085F, 0.6737F, -0.9574F, -0.5916F));

		PartDefinition cube_r167 = rightCheek.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(46, 57).mirror().addBox(0.0F, -1.3289F, -0.8534F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, -0.4982F, 0.437F, 0.4499F, -0.6816F, -0.4262F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.5296F, 2.3472F, -10.2652F));

		PartDefinition cube_r168 = leftBeak.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(89, 40).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.083F, 0.0414F, 0.0833F));

		PartDefinition cube_r169 = leftBeak.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(23, 74).addBox(-1.0F, -0.2894F, -3.2941F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, 2.0696F, -0.3876F, 0.0699F, 0.0695F));

		PartDefinition cube_r170 = leftBeak.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(57, 59).addBox(-1.0F, 2.4261F, -5.2065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, 2.0696F, 0.3978F, 0.0699F, 0.0695F));

		PartDefinition cube_r171 = leftBeak.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 35).addBox(-1.0F, 5.9131F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 2).addBox(-1.0F, 3.9131F, -1.1748F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, 2.0696F, -0.44F, 0.0699F, 0.0695F));

		PartDefinition cube_r172 = leftBeak.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1023F, 1.4747F, 1.2986F, -0.0129F, 0.2532F, -0.0361F));

		PartDefinition cube_r173 = leftBeak.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(56, 72).addBox(-1.0F, 0.9744F, -4.1368F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, 2.0696F, 0.0662F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.5296F, 2.3472F, -10.2652F));

		PartDefinition cube_r174 = rightBeak.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.083F, -0.0414F, -0.0833F));

		PartDefinition cube_r175 = rightBeak.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(23, 74).mirror().addBox(0.0F, -0.2894F, -3.2941F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, 2.0696F, -0.3876F, -0.0699F, -0.0695F));

		PartDefinition cube_r176 = rightBeak.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(57, 59).mirror().addBox(0.0F, 2.4261F, -5.2065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, 2.0696F, 0.3978F, -0.0699F, -0.0695F));

		PartDefinition cube_r177 = rightBeak.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 35).mirror().addBox(0.0F, 5.9131F, -0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 2).mirror().addBox(0.0F, 3.9131F, -1.1748F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, 2.0696F, -0.44F, -0.0699F, -0.0695F));

		PartDefinition cube_r178 = rightBeak.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.8F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1023F, 1.4747F, 1.2986F, -0.0129F, -0.2532F, 0.0361F));

		PartDefinition cube_r179 = rightBeak.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(56, 72).mirror().addBox(0.0F, 0.9744F, -4.1368F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, 2.0696F, 0.0662F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 3.2F, -8.0F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 0.159F, -2.3262F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2705F, 0.192F, 0.0F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(36, 42).addBox(-2.0F, -4.6916F, 0.4171F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3665F, 0.192F, 0.0F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(82, 35).addBox(-1.0F, -1.3F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(82, 18).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.493F, -4.2042F, 2.2805F, 0.0873F, 0.192F, 0.0F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(26, 57).addBox(-1.0F, -5.3289F, -2.9534F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(77, 0).addBox(-1.9F, -5.3289F, -1.9534F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(9, 53).addBox(-0.9F, -5.4289F, -1.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 81).addBox(-1.36F, -5.3289F, -1.9534F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(81, 69).addBox(-1.69F, -5.3289F, -1.9534F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -1.4F, 5.0F, 0.6244F, 0.6816F, 0.4262F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(44, 49).addBox(-2.2F, -1.5012F, -0.0398F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -4.8497F, 3.2393F, 0.2024F, 0.3895F, 0.1022F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(74, 48).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -7.0687F, 3.1863F, 0.5384F, -0.2231F, -0.3209F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 9).addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -7.2554F, 4.2135F, 0.2294F, 0.1913F, -0.1604F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 3.2F, -8.0F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(0.0F, 0.159F, -2.3262F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2705F, -0.192F, 0.0F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(36, 42).mirror().addBox(0.0F, -4.6916F, 0.4171F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3665F, -0.192F, 0.0F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(82, 35).mirror().addBox(-1.0F, -1.3F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(82, 18).mirror().addBox(-1.0F, -0.7F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.493F, -4.2042F, 2.2805F, 0.0873F, -0.192F, 0.0F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(0.0F, -5.3289F, -2.9534F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 0).mirror().addBox(-0.1F, -5.3289F, -1.9534F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(9, 53).mirror().addBox(-0.1F, -5.4289F, -1.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 81).mirror().addBox(-0.64F, -5.3289F, -1.9534F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(81, 69).mirror().addBox(-0.31F, -5.3289F, -1.9534F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -1.4F, 5.0F, 0.6244F, -0.6816F, -0.4262F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(44, 49).mirror().addBox(0.2F, -1.5012F, -0.0398F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -4.8497F, 3.2393F, 0.2024F, -0.3895F, -0.1022F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -7.0687F, 3.1863F, 0.5384F, 0.2231F, 0.3209F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -7.2554F, 4.2135F, 0.2294F, -0.1913F, 0.1604F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r194 = frill.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(77, 26).addBox(0.0F, -5.5F, -0.4F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1802F, 1.7836F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r195 = frill.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(15, 2).addBox(-1.5F, -3.6969F, 0.0164F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 85).addBox(-1.0F, -6.6969F, 0.0164F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 5).addBox(-1.5F, -8.6969F, 0.0164F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.2F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.517F, -5.2636F, 3.2365F, 0.0175F, -0.6109F, 0.0F));

		PartDefinition cube_r196 = leftFrill.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(56, 66).addBox(-4.0229F, -0.0144F, 0.1309F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 2.6F, -1.4F, -0.2833F, 0.1781F, 0.4399F));

		PartDefinition cube_r197 = leftFrill.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(51, 0).addBox(-2.5F, -2.0F, 0.2F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9051F, 7.6849F, -2.4957F, -0.1531F, -0.1319F, -0.9492F));

		PartDefinition cube_r198 = leftFrill.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(64, 15).addBox(0.1F, -1.6969F, 0.0164F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 6).addBox(0.1F, 1.3031F, -0.9836F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 62).addBox(7.1F, -2.6969F, 0.0164F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.117F, 4.2636F, -1.7365F, -0.3318F, 0.033F, -0.0114F));

		PartDefinition cube_r199 = leftFrill.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(57, 28).addBox(-6.1876F, -3.1697F, -0.5302F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(10.883F, 4.7636F, -1.7365F, -0.3252F, -0.0749F, -0.3252F));

		PartDefinition cube_r200 = leftFrill.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(64, 45).addBox(-0.1849F, 0.125F, 0.0462F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7344F, 5.0104F, -3.2626F, -0.3342F, -0.24F, -0.268F));

		PartDefinition cube_r201 = leftFrill.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(71, 21).addBox(-4.0228F, -0.2386F, 0.475F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(10.983F, 1.6636F, -1.7365F, -0.2863F, 0.1732F, 0.4229F));

		PartDefinition cube_r202 = leftFrill.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(77, 58).addBox(-2.3F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4711F, 0.1461F, -0.0525F, -0.1623F, 0.2925F, 0.9476F));

		PartDefinition cube_r203 = leftFrill.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 14).addBox(-1.9F, -1.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6258F, -2.1385F, 0.8392F, -0.2705F, 0.1972F, 0.5083F));

		PartDefinition cube_r204 = leftFrill.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(29, 42).addBox(-0.9129F, -0.0545F, -0.0839F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8963F, 2.6863F, -1.2724F, -0.3012F, -0.145F, -0.5423F));

		PartDefinition cube_r205 = leftFrill.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(80, 26).addBox(-3.9501F, -0.9328F, 2.6239F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.483F, -4.1364F, -1.7365F, -0.333F, 0.0159F, -0.0609F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.517F, -5.2636F, 3.2365F, 0.0175F, 0.6109F, 0.0F));

		PartDefinition cube_r206 = rightFrill.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(0.0229F, -0.0144F, 0.1309F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.6F, -1.4F, -0.2833F, -0.1781F, -0.4399F));

		PartDefinition cube_r207 = rightFrill.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-3.5F, -2.0F, 0.2F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9051F, 7.6849F, -2.4957F, -0.1531F, 0.1319F, 0.9492F));

		PartDefinition cube_r208 = rightFrill.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-5.1F, -1.6969F, 0.0164F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 6).mirror().addBox(-5.1F, 1.3031F, -0.9836F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 62).mirror().addBox(-11.1F, -2.6969F, 0.0164F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.117F, 4.2636F, -1.7365F, -0.3318F, -0.033F, 0.0114F));

		PartDefinition cube_r209 = rightFrill.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(0.1876F, -3.1697F, -0.5302F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-10.883F, 4.7636F, -1.7365F, -0.3252F, 0.0749F, 0.3252F));

		PartDefinition cube_r210 = rightFrill.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-5.8151F, 0.125F, 0.0462F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7344F, 5.0104F, -3.2626F, -0.3342F, 0.24F, 0.268F));

		PartDefinition cube_r211 = rightFrill.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(0.0228F, -0.2386F, 0.475F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-10.983F, 1.6636F, -1.7365F, -0.2863F, -0.1732F, -0.4229F));

		PartDefinition cube_r212 = rightFrill.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-1.7F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4711F, 0.1461F, -0.0525F, -0.1623F, -0.2925F, -0.9476F));

		PartDefinition cube_r213 = rightFrill.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-2.1F, -1.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6258F, -2.1385F, 0.8392F, -0.2705F, -0.1972F, -0.5083F));

		PartDefinition cube_r214 = rightFrill.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(29, 42).mirror().addBox(-3.0871F, -0.0545F, -0.0839F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8963F, 2.6863F, -1.2724F, -0.3012F, 0.145F, 0.5423F));

		PartDefinition cube_r215 = rightFrill.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(80, 26).mirror().addBox(-0.0499F, -0.9328F, 2.6239F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.483F, -4.1364F, -1.7365F, -0.333F, -0.0159F, 0.0609F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 3.6F, 0.7F, 0.5958F, 0.0F, 0.0F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(28, 17).mirror().addBox(0.0F, 2.0989F, -1.387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.9917F, -3.394F, -1.2741F, -0.1745F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(0.2F, -0.3413F, -2.1971F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 26).mirror().addBox(0.0F, -0.3413F, -1.6971F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.9917F, -3.394F, -1.117F, -0.1745F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(70, 31).mirror().addBox(0.0F, -5.2641F, -0.241F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.3917F, -3.494F, -0.5877F, -0.4943F, -0.2576F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(0.0F, -3.4659F, -0.8772F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.3917F, -3.494F, -0.3112F, -0.6124F, 0.0013F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(0.0F, -4.6F, -0.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 4.3917F, -3.494F, -0.0843F, -0.6124F, 0.0013F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(28, 17).addBox(-1.0F, 2.0989F, -1.387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 4.9917F, -3.394F, -1.2741F, 0.1745F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(38, 89).addBox(-0.2F, -0.3413F, -2.1971F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 26).addBox(-1.0F, -0.3413F, -1.6971F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.9917F, -3.394F, -1.117F, 0.1745F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(70, 31).addBox(-1.0F, -5.2641F, -0.241F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.3917F, -3.494F, -0.5877F, 0.4943F, 0.2576F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -3.4659F, -0.8772F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 4.3917F, -3.494F, -0.3112F, 0.6124F, -0.0013F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(52, 8).addBox(-1.0F, -4.6F, -0.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.3917F, -3.494F, -0.0843F, 0.6124F, -0.0013F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.7917F, -5.994F, 0.0533F, 0.2018F, 0.2671F));

		PartDefinition cube_r226 = leftLowerbeak.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(41, 13).addBox(0.0F, -1.6148F, -0.6729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -0.9F, -5.0F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftLowerbeak.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -1.0796F, -0.0049F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, -0.9F, -1.8F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftLowerbeak.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(90, 59).addBox(0.0F, -2.0327F, -0.9224F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -0.2F, -4.3F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftLowerbeak.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 76).addBox(0.0F, -0.3784F, -0.2712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.0F, -0.9F, -3.7F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftLowerbeak.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(87, 48).addBox(0.0F, -1.8718F, -2.0239F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, -2.5F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftLowerbeak.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(87, 54).addBox(0.0F, -2.0037F, -2.041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 1.5F, -0.7F, -1.4661F, 0.0F, 0.0F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 5.7917F, -5.994F, 0.0533F, -0.2018F, -0.2671F));

		PartDefinition cube_r232 = rightLowerbeak.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(41, 13).mirror().addBox(-1.0F, -1.6148F, -0.6729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.9F, -5.0F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightLowerbeak.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.0F, -1.0796F, -0.0049F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.9F, -1.8F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightLowerbeak.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(90, 59).mirror().addBox(-1.0F, -2.0327F, -0.9224F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.2F, -4.3F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightLowerbeak.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(89, 76).mirror().addBox(-1.0F, -0.3784F, -0.2712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.9F, -3.7F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightLowerbeak.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-1.0F, -1.8718F, -2.0239F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.0F, -2.5F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightLowerbeak.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(87, 54).mirror().addBox(-1.0F, -2.0037F, -2.041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.5F, -0.7F, -1.4661F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 32).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0F, 6.7F, 0.2143F, -0.1685F, 0.0456F));

		PartDefinition cube_r238 = tail.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(59, 92).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0056F, 6.7693F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r239 = tail.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(91, 26).addBox(0.0F, 0.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 36).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9678F, 4.4457F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r240 = tail.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(91, 44).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1152F, 4.7698F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r241 = tail.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 81).addBox(0.0F, -1.9F, 2.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 92).addBox(0.0F, -1.5F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.2291F, -0.2608F, 0.0064F));

		PartDefinition cube_r242 = tail2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(32, 50).addBox(0.0F, -5.3F, 8.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(0.0F, -5.0F, 6.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 88).addBox(0.0F, -4.1F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 26).addBox(0.0F, -3.1F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 92).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 1.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r243 = tail2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(19, 29).addBox(0.0F, 5.6F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 57).addBox(0.0F, 4.5F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 6).addBox(0.0F, 3.5F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 66).addBox(0.0F, 2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9678F, -2.5543F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 3).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.2033F, -0.3441F, 0.0578F));

		PartDefinition cube_r244 = tail3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(46, 92).addBox(0.0F, -2.6F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 28).addBox(0.0F, -2.9F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 16).addBox(0.0F, -3.1F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 81).addBox(0.0F, -3.5F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 87).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r245 = tail3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(10, 26).addBox(0.0F, 12.1F, 18.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 10.7F, 16.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.0F, 9.3F, 14.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(0.0F, 7.8F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9678F, -12.5543F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 10.0F, -0.1947F, -0.343F, 0.0662F));

		PartDefinition cube_r246 = tail4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(6, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r247 = tail4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r248 = tail4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(6, 26).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.4F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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