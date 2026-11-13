package fossils.fossils.client.blockentity.model.paradolichopithecus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParadolichopithecusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone3;
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
	private final ModelPart bone4;
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
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public ParadolichopithecusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
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
		this.bone4 = this.chest.getChild("bone4");
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
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.1911F, 6.5265F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(57, 45).addBox(0.0F, -0.6937F, -0.9061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 40).addBox(0.0F, -1.1201F, -0.5189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 46).addBox(-0.5F, -0.3957F, -0.255F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4546F, 3.4757F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 83).addBox(-0.5F, -0.3648F, -1.142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.4546F, 3.4757F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 2.7482F, 2.8721F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 23).addBox(-1.0741F, -0.4425F, -2.2892F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5319F, -3.5237F, -3.4867F, -0.4398F, 0.1961F, 0.7782F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 23).addBox(0.4581F, -0.157F, -2.4313F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F))
				.texOffs(50, 5).addBox(-0.0419F, -0.157F, -2.4313F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, -3.5237F, -3.4867F, -0.4679F, -0.259F, 0.4922F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 62).addBox(-1.5F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0219F, -2.8548F, -1.1285F, -2.4202F, 1.1398F, -1.3704F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(62, 38).addBox(-1.5F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0219F, -2.8548F, -1.1285F, -2.3523F, 1.1716F, -1.2962F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 5).addBox(-1.1547F, -0.3836F, -1.5691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, -3.5237F, -3.4867F, -2.6154F, 0.7224F, -1.8351F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 25).addBox(-3.1685F, -0.3573F, -0.804F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3281F, -3.3154F, -2.4287F, -2.4782F, 1.1062F, -1.4347F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 48).addBox(-0.3F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0137F, -1.8005F, 1.3131F, 0.0795F, 0.8705F, 1.2338F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 72).addBox(-0.275F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3481F, -1.0283F, 1.4917F, 3.0659F, 0.8282F, -2.0245F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 10).addBox(-1.9F, -0.1F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8948F, -0.8245F, 1.9708F, 1.5593F, 1.5196F, 2.7323F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5018F, 0.5716F, 0.5847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(86, 72).addBox(-0.5018F, 0.5716F, 0.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(86, 27).addBox(-0.5018F, 0.1466F, 0.5847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(87, 6).addBox(-0.5F, -0.55F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(5, 87).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(27, 86).addBox(-0.5F, -0.15F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0195F, -1.0707F, 4.0605F, -1.1165F, 1.4257F, 1.212F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 4).addBox(-0.5F, 0.2425F, -0.9646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0195F, -1.0707F, 4.0605F, -0.3311F, 1.4257F, 1.212F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 92).addBox(-1.2258F, -0.5F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7076F, 0.6164F, 2.7715F, 0.7239F, -0.3962F, -0.8335F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 74).addBox(-0.2728F, -0.5F, -0.5253F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7076F, 0.6164F, 2.7715F, 0.7567F, -0.4735F, -0.9114F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 85).addBox(0.1F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(68, 85).addBox(-0.7F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2667F, -0.5156F, 2.2634F, -3.1416F, -1.2654F, 2.3998F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 85).addBox(-0.7F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5616F, -0.7858F, 1.4634F, 0.0F, -1.5708F, -0.7418F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 48).addBox(0.15F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4853F, 0.1735F, 0.1853F, 0.0F, -1.1432F, -0.7418F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 51).addBox(-1.5F, -0.7F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, -0.7418F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 2.7482F, 2.8721F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(-0.9259F, -0.4425F, -2.2892F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5319F, -3.5237F, -3.4867F, -0.4398F, -0.1961F, -0.7782F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 23).mirror().addBox(-1.4581F, -0.157F, -2.4313F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(50, 5).mirror().addBox(-0.9581F, -0.157F, -2.4313F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5319F, -3.5237F, -3.4867F, -0.4679F, 0.259F, -0.4922F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(56, 62).mirror().addBox(-1.5F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0219F, -2.8548F, -1.1285F, -2.4202F, -1.1398F, 1.3704F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-1.5F, -0.5F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0219F, -2.8548F, -1.1285F, -2.3523F, -1.1716F, 1.2962F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(73, 5).mirror().addBox(-0.8453F, -0.3836F, -1.5691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5319F, -3.5237F, -3.4867F, -2.6154F, -0.7224F, 1.8351F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 25).mirror().addBox(0.1685F, -0.3573F, -0.804F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3281F, -3.3154F, -2.4287F, -2.4782F, -1.1062F, 1.4347F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-1.7F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0137F, -1.8005F, 1.3131F, 0.0795F, -0.8705F, -1.2338F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-1.725F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3481F, -1.0283F, 1.4917F, 3.0659F, -0.8282F, 2.0245F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-2.1F, -0.1F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8948F, -0.8245F, 1.9708F, 1.5593F, -1.5196F, -2.7323F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.4982F, 0.5716F, 0.5847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(86, 72).mirror().addBox(-0.4982F, 0.5716F, 0.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(86, 27).mirror().addBox(-0.4982F, 0.1466F, 0.5847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(87, 6).mirror().addBox(-0.5F, -0.55F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(5, 87).mirror().addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(27, 86).mirror().addBox(-0.5F, -0.15F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0195F, -1.0707F, 4.0605F, -1.1165F, -1.4257F, -1.212F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.5F, 0.2425F, -0.9646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0195F, -1.0707F, 4.0605F, -0.3311F, -1.4257F, -1.212F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(0.2258F, -0.5F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.7076F, 0.6164F, 2.7715F, 0.7239F, 0.3962F, 0.8335F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 74).mirror().addBox(-1.7272F, -0.5F, -0.5253F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.7076F, 0.6164F, 2.7715F, 0.7567F, 0.4735F, 0.9114F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(-1.1F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(68, 85).mirror().addBox(-0.3F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2667F, -0.5156F, 2.2634F, -3.1416F, 1.2654F, -2.3998F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 85).mirror().addBox(-0.3F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5616F, -0.7858F, 1.4634F, 0.0F, 1.5708F, 0.7418F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.15F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4853F, 0.1735F, 0.1853F, 0.0F, 1.1432F, 0.7418F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.5F, -0.7F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.7418F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 2.202F, 4.4067F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(38, 76).addBox(-0.5F, -1.5F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.0941F, -0.4448F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(76, 30).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.0941F, -0.4448F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 15).addBox(-1.0F, 0.0167F, -1.0088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 3.7666F, 0.0043F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 41).addBox(-0.5387F, -0.2192F, 0.0882F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6661F, -0.851F, 0.2481F, -2.0268F, 1.2756F, -1.3439F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(84, 66).addBox(-0.5387F, 0.0005F, -2.2228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.4211F, -1.0694F, 0.398F, -1.285F, 1.2756F, -1.3439F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(63, 65).addBox(-0.5387F, -1.5723F, -0.6388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4211F, -1.0694F, 0.398F, 2.45F, 1.2756F, -1.3439F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(43, 41).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5972F, 0.0477F, 0.1771F, 2.9912F, 1.3274F, -1.3708F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 49).addBox(-0.5387F, 0.5186F, -1.1408F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4211F, -1.0694F, 0.398F, -1.6777F, 1.2756F, -1.3439F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(27, 51).addBox(-1.0F, 0.0167F, -0.0088F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.6785F, -0.6766F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(86, 30).addBox(-1.0F, 8.7119F, -3.5774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.2785F, -1.1766F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(50, 13).addBox(-1.5F, 8.6307F, -2.6593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.2785F, -1.1766F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(9, 51).addBox(-1.5F, 8.0255F, 0.9218F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2785F, -1.1766F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0471F, -1.4721F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 28).addBox(-1.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(76, 35).addBox(-1.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(10, 55).addBox(-1.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(70, 57).addBox(-1.5F, -0.4F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 72).addBox(-1.9F, -0.1589F, 0.5196F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(33, 34).addBox(0.3F, -5.5F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.0556F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(16, 36).addBox(-1.9F, -0.0561F, 0.032F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(39, 23).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7051F, -1.8679F, -2.0218F, -0.1574F, 0.0758F));

		PartDefinition cube_r58 = leftLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 77).addBox(-1.0F, -1.6185F, -0.9027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.4586F, 0.2937F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 8).addBox(-1.2F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0F, 1.4557F, -0.1179F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(15, 9).addBox(-1.6F, -0.6629F, -3.9144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.3771F, 0.0705F, 1.5272F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -4.5144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 2.202F, 4.4067F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(76, 72).addBox(-0.5F, -1.5F, -1.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.0941F, -0.4448F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(62, 76).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.0941F, -0.4448F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 73).addBox(0.0F, 0.0167F, -1.0088F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.7666F, 0.0043F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(41, 5).addBox(-0.4613F, -0.2192F, 0.0882F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6661F, -0.851F, 0.2481F, -2.0268F, -1.2756F, 1.3439F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 75).addBox(-0.4613F, 0.0005F, -2.2228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.4211F, -1.0694F, 0.398F, -1.285F, -1.2756F, 1.3439F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(66, 0).addBox(-0.4613F, -1.5723F, -0.6388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4211F, -1.0694F, 0.398F, 2.45F, -1.2756F, 1.3439F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(21, 46).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5972F, 0.0477F, 0.1771F, 2.9912F, -1.3274F, 1.3708F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(56, 65).addBox(-0.4613F, 0.5186F, -1.1408F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4211F, -1.0694F, 0.398F, -1.6777F, -1.2756F, 1.3439F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(53, 51).addBox(0.0F, 0.0167F, -0.0088F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.6785F, -0.6766F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 90).addBox(0.0F, 8.7119F, -3.5774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.2785F, -1.1766F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 8.6307F, -2.6593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.2785F, -1.1766F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(18, 51).addBox(-0.5F, 8.0255F, 0.9218F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2785F, -1.1766F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0471F, -1.4721F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 33).addBox(-0.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(12, 77).addBox(-0.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(37, 55).addBox(-0.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 63).addBox(-0.5F, -0.4F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 73).addBox(0.9F, -0.1589F, 0.5196F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 36).addBox(-1.3F, -5.5F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.0556F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 34).addBox(0.9F, -0.0561F, 0.032F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(21, 40).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7051F, -1.8679F, -2.1069F, 0.1127F, -0.0667F));

		PartDefinition cube_r78 = rightLeg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(78, 21).addBox(0.0F, -1.6185F, -0.9027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, -0.4586F, 0.2937F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 70).addBox(0.2F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.0F, 1.4557F, -0.1179F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 17).addBox(-1.4F, -0.6629F, -3.9144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.3771F, 0.0705F, 1.442F, -0.0115F, 0.0158F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -4.5144F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, -0.4417F, 0.0562F, 0.1183F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(13, 94).addBox(0.0F, -1.2751F, -0.317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 94).addBox(0.0F, -1.1577F, -0.218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.7F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(22, 60).mirror().addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0026F, -2.8198F, -3.0241F, 0.0336F, -1.8481F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -0.3198F, -2.8726F, 0.076F, -1.8398F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 93).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -0.3198F, -2.8726F, -0.076F, 1.8398F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(22, 60).addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0026F, -2.8198F, -3.0241F, -0.0336F, 1.8481F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.1F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, -0.313F, 0.0269F, 0.083F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(39, 46).addBox(-0.45F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 6.6442F, -2.7734F, 0.2903F, 0.1255F, 0.0374F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(17, 7).mirror().addBox(-4.2355F, -0.2247F, -0.3836F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.0785F, -6.4032F, 0.2819F, 0.4211F, -0.2344F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 17).mirror().addBox(-4.637F, -2.1789F, -0.5071F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.0785F, -6.4032F, 0.0359F, 0.5329F, -0.7702F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-5.9263F, -4.2055F, -0.5071F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.0785F, -6.4032F, -0.2581F, 0.4728F, -1.3661F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(-1.3204F, -7.2346F, -0.5071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.0785F, -6.4032F, -0.5331F, 0.0309F, -2.3593F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-0.1396F, -6.2596F, -0.5071F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.0785F, -6.4032F, -0.4333F, -0.3225F, -3.0123F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-0.1397F, -6.2596F, -0.5071F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 0.7785F, -4.4032F, -0.3252F, -0.3512F, -3.0526F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-1.3204F, -7.2346F, -0.5071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 0.7785F, -4.4032F, -0.471F, -0.055F, -2.3646F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-4.637F, -2.1789F, -0.5071F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 0.7785F, -4.4032F, -0.0616F, 0.4702F, -0.8218F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-5.9263F, -4.2055F, -0.5071F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 0.7785F, -4.4032F, -0.2988F, 0.3736F, -1.3875F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(39, 29).mirror().addBox(-4.2355F, -0.2247F, -0.3836F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 0.7785F, -4.4032F, 0.1665F, 0.411F, -0.2856F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(28, 21).mirror().addBox(-4.7793F, -0.109F, -0.4436F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.4535F, -2.1032F, -0.2342F, 0.5221F, -0.5165F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-5.3117F, -4.6032F, -0.5846F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.4535F, -2.1032F, -0.5807F, 0.1173F, -1.5054F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(94, 46).mirror().addBox(-5.1696F, -2.3306F, -0.5846F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.4535F, -2.1032F, -0.4619F, 0.3831F, -1.0378F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(78, 19).mirror().addBox(-0.6685F, -6.9012F, -0.5846F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.4535F, -2.1032F, -0.423F, -0.4261F, -2.4246F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6745F, 6.3716F, 0.1303F, -0.1457F, -0.575F, -2.9892F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(70, 61).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4853F, 3.653F, 2.8544F, -0.4869F, -0.5776F, -2.1553F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(81, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4453F, 5.6785F, 0.8629F, -0.273F, -0.7465F, -2.5501F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-4.454F, -3.7158F, -0.5013F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3285F, -0.2282F, -0.6251F, 0.1173F, -1.3223F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(90, 44).mirror().addBox(-3.9831F, -1.991F, -0.5013F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3285F, -0.2282F, -0.5046F, 0.4028F, -0.8659F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-3.5697F, -0.3642F, -0.3995F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3285F, -0.2282F, -0.2627F, 0.5588F, -0.3428F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 12).addBox(-1.4303F, -0.3642F, -0.3995F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3285F, -0.2282F, -0.2627F, -0.5588F, 0.3428F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(90, 44).addBox(2.9831F, -1.991F, -0.5013F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3285F, -0.2282F, -0.5046F, -0.4028F, 0.8659F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(67, 77).addBox(2.454F, -3.7158F, -0.5013F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3285F, -0.2282F, -0.6251F, -0.1173F, 1.3223F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(81, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4453F, 5.6785F, 0.8629F, -0.273F, 0.7465F, 2.5501F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(70, 61).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4853F, 3.653F, 2.8544F, -0.4869F, 0.5776F, 2.1553F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(54, 10).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6745F, 6.3716F, 0.1303F, -0.1457F, 0.575F, 2.9892F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(78, 19).addBox(-1.3315F, -6.9012F, -0.5846F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.4535F, -2.1032F, -0.423F, 0.4261F, 2.4246F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(94, 46).addBox(4.1696F, -2.3306F, -0.5846F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.4535F, -2.1032F, -0.4619F, -0.3831F, 1.0378F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(78, 45).addBox(3.3117F, -4.6032F, -0.5846F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.4535F, -2.1032F, -0.5807F, -0.1173F, 1.5054F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 21).addBox(-1.2207F, -0.109F, -0.4436F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.4535F, -2.1032F, -0.2342F, -0.5221F, 0.5165F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(39, 29).addBox(-0.7645F, -0.2247F, -0.3836F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 0.7785F, -4.4032F, 0.1665F, -0.411F, 0.2856F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 10).addBox(2.9263F, -4.2055F, -0.5071F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 0.7785F, -4.4032F, -0.2988F, -0.3736F, 1.3875F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(42, 94).addBox(3.637F, -2.1789F, -0.5071F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 0.7785F, -4.4032F, -0.0616F, -0.4702F, 0.8218F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 61).addBox(-0.6796F, -7.2346F, -0.5071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 0.7785F, -4.4032F, -0.471F, 0.055F, 2.3646F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 43).addBox(-3.8604F, -6.2596F, -0.5071F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 0.7785F, -4.4032F, -0.3252F, 0.3512F, 3.0526F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(17, 7).addBox(-0.7645F, -0.2247F, -0.3836F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1336F, 1.0785F, -6.4032F, 0.2819F, -0.4211F, 0.2344F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 17).addBox(3.637F, -2.1789F, -0.5071F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1336F, 1.0785F, -6.4032F, 0.0359F, -0.5329F, 0.7702F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 8).addBox(2.9263F, -4.2055F, -0.5071F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1336F, 1.0785F, -6.4032F, -0.2581F, -0.4728F, 1.3661F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 54).addBox(-0.6796F, -7.2346F, -0.5071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1336F, 1.0785F, -6.4032F, -0.5331F, -0.0309F, 2.3593F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(52, 41).addBox(-3.8603F, -6.2596F, -0.5071F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1336F, 1.0785F, -6.4032F, -0.4333F, 0.3225F, 3.0123F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 94).addBox(0.0F, -1.321F, -1.234F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.3F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(22, 30).addBox(0.0F, -1.4769F, -0.728F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(16, 94).addBox(0.0F, -1.2938F, 0.054F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.8F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(39, 94).addBox(0.0F, -1.7698F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -6.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -6.8F, 0.1739F, -0.0151F, 0.0859F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 36).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8264F, 0.3552F, -0.324F, 0.0827F, -0.0278F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(36, 94).addBox(0.0F, -1.2476F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(33, 94).addBox(0.0F, -1.7815F, 0.0453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-2.9236F, 0.0571F, -0.416F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 1.0785F, -3.3032F, 0.3156F, 0.468F, -0.3237F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(-3.6086F, -1.3165F, -0.5039F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 1.0785F, -3.3032F, 0.0381F, 0.5887F, -0.873F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-5.4668F, -2.9444F, -0.5039F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 1.0785F, -3.3032F, -0.2925F, 0.5198F, -1.4864F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(93, 87).mirror().addBox(-0.3711F, -6.1769F, -0.5039F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 1.0785F, -3.3032F, -0.5885F, -0.0411F, -2.5737F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(1.1934F, -5.3006F, -0.5039F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, 1.0785F, -3.3032F, -0.4811F, -0.3555F, -3.1003F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(1.1954F, -6.1708F, -0.5076F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3785F, -1.3032F, -0.3299F, -0.3607F, 3.0601F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-1.755F, -6.7237F, -0.5076F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3785F, -1.3032F, -0.4805F, -0.0595F, -2.5362F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-5.7012F, -3.5736F, -0.5076F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3785F, -1.3032F, -0.3087F, 0.3788F, -1.5632F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(47, 94).mirror().addBox(-4.1261F, -1.7442F, -0.5076F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3785F, -1.3032F, -0.0671F, 0.4796F, -0.9964F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(-3.5809F, -0.0791F, -0.4018F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8336F, 0.3785F, -1.3032F, 0.1672F, 0.4215F, -0.4574F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(50, 17).addBox(-0.4191F, -0.0791F, -0.4018F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3785F, -1.3032F, 0.1672F, -0.4215F, 0.4574F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(47, 94).addBox(3.1261F, -1.7442F, -0.5076F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3785F, -1.3032F, -0.0671F, -0.4796F, 0.9964F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(70, 67).addBox(2.7012F, -3.5736F, -0.5076F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3785F, -1.3032F, -0.3087F, -0.3788F, 1.5632F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(80, 8).addBox(-0.245F, -6.7237F, -0.5076F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3785F, -1.3032F, -0.4805F, 0.0595F, 2.5362F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(78, 38).addBox(-3.1954F, -6.1708F, -0.5076F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8336F, 0.3785F, -1.3032F, -0.3299F, 0.3607F, -3.0601F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(65, 53).addBox(-0.0764F, 0.0571F, -0.416F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 1.0785F, -3.3032F, 0.3156F, -0.468F, 0.3237F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(92, 39).addBox(2.6086F, -1.3165F, -0.5039F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 1.0785F, -3.3032F, 0.0381F, -0.5887F, 0.873F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(70, 55).addBox(2.4668F, -2.9444F, -0.5039F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 1.0785F, -3.3032F, -0.2925F, -0.5198F, 1.4864F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(93, 87).addBox(-0.6289F, -6.1769F, -0.5039F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 1.0785F, -3.3032F, -0.5885F, 0.0411F, 2.5737F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(10, 80).addBox(-3.1934F, -5.3006F, -0.5039F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4336F, 1.0785F, -3.3032F, -0.4811F, 0.3555F, 3.1003F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.9889F, 0.9677F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 4.2619F, -1.2042F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r157 = bone.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 92).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0826F, 1.328F, -0.8928F, -0.9545F, -0.0323F, 0.0049F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 12).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5971F, -0.1537F, -1.6659F, -0.9406F, 0.0933F, -0.3889F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(71, 69).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.187F, -0.8531F, -0.9059F, -0.2799F, -0.3997F));

		PartDefinition cube_r160 = bone.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 6).addBox(-0.5462F, -0.6094F, -0.1622F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.1641F, 0.1032F, -0.2737F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5462F, -0.2025F, 0.1067F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.9721F, 0.1032F, -0.2737F));

		PartDefinition cube_r162 = bone.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5462F, -0.4874F, 1.1015F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.7888F, 0.1032F, -0.2737F));

		PartDefinition cube_r163 = bone.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 15).addBox(0.0273F, -0.4454F, -0.1139F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.1278F, -0.3514F, -0.1732F));

		PartDefinition cube_r164 = bone.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5462F, -0.0803F, 1.3282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.5131F, 0.1032F, -0.2737F));

		PartDefinition cube_r165 = bone.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(10, 59).addBox(-0.5462F, 3.1357F, 0.3567F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 2.1851F, 0.1032F, -0.2737F));

		PartDefinition cube_r166 = bone.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(59, 5).addBox(-0.5462F, 0.4339F, 3.142F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.487F, 0.1032F, -0.2737F));

		PartDefinition cube_r167 = bone.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(58, 50).addBox(-0.5462F, -1.1324F, 3.0345F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.1815F, 0.1032F, -0.2737F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 4.2619F, -1.2042F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r168 = bone4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0826F, 1.328F, -0.8928F, -0.9545F, 0.0323F, -0.0049F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5971F, -0.1537F, -1.6659F, -0.9406F, -0.0933F, 0.3889F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(71, 69).mirror().addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, -0.187F, -0.8531F, -0.9059F, 0.2799F, 0.3997F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-0.4538F, -0.6094F, -0.1622F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.1641F, -0.1032F, 0.2737F));

		PartDefinition cube_r172 = bone4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-0.4538F, -0.2025F, 0.1067F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.9721F, -0.1032F, 0.2737F));

		PartDefinition cube_r173 = bone4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.4538F, -0.4874F, 1.1015F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.7888F, -0.1032F, 0.2737F));

		PartDefinition cube_r174 = bone4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-1.0273F, -0.4454F, -0.1139F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.1278F, 0.3514F, 0.1732F));

		PartDefinition cube_r175 = bone4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.4538F, -0.0803F, 1.3282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.5131F, -0.1032F, 0.2737F));

		PartDefinition cube_r176 = bone4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(10, 59).mirror().addBox(-0.4538F, 3.1357F, 0.3567F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 2.1851F, -0.1032F, 0.2737F));

		PartDefinition cube_r177 = bone4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-0.4538F, 0.4339F, 3.142F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.487F, -0.1032F, 0.2737F));

		PartDefinition cube_r178 = bone4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(58, 50).mirror().addBox(-0.4538F, -1.1324F, 3.0345F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 1.1815F, -0.1032F, 0.2737F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.79F, 3.1656F, -0.7078F, 1.2361F, 0.1267F, -0.2174F));

		PartDefinition cube_r179 = leftarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 91).addBox(-0.5F, -0.625F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(62, 91).addBox(-0.5F, -0.125F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.012F, 0.0253F, -0.0717F, 0.6544F, 0.0014F, -0.001F));

		PartDefinition cube_r180 = leftarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(34, 85).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 24).addBox(-0.5F, -0.625F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.012F, 0.0253F, -0.0717F, 0.0872F, 0.0014F, -0.001F));

		PartDefinition cube_r181 = leftarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -0.325F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1652F, 5.4222F, -2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(29, 83).addBox(-0.5F, -0.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.1652F, 5.4222F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 85).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.1652F, 5.4222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(57, 33).addBox(0.0F, -4.8624F, -0.2206F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 7.0712F, 4.7357F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(33, 74).addBox(0.0F, -5.0389F, 0.3792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.61F, 1.956F, 0.5149F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0222F, 7.479F, 5.9152F, 0.0112F, 0.0658F, 0.2489F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(51, 59).addBox(-0.5296F, -0.339F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4064F, -0.8399F, 0.7271F, 1.5708F, -1.5446F, -1.5708F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(58, 55).addBox(-0.1296F, -4.839F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4064F, 4.048F, 0.1989F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 55).addBox(-0.6F, -0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.4064F, 4.0636F, 0.6731F, -1.5708F, -1.5621F, 1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(91, 59).addBox(-1.0223F, -0.0791F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7064F, 0.2149F, -0.3091F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r190 = leftarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(75, 25).addBox(-0.1F, -0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2064F, 7.4776F, -1.3114F, 1.5708F, -1.2828F, -1.5708F));

		PartDefinition cube_r191 = leftarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(45, 64).addBox(-1.6065F, 3.2752F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.7064F, 0.2149F, -0.3091F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r192 = leftarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(73, 0).addBox(-0.8303F, 0.7976F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7064F, 0.2149F, -0.3091F, -1.5708F, -1.4312F, 1.5708F));

		PartDefinition cube_r193 = leftarm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(32, 51).addBox(-0.8F, -4.0F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1064F, 7.448F, 0.999F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition cube_r194 = leftarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(44, 85).addBox(-1.0F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1764F, -0.8515F, 0.9635F, -1.5708F, -1.4573F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 10.1143F, -0.0009F, 0.2454F, -1.0502F, -0.082F));

		PartDefinition cube_r195 = leftArm3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(7, 72).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r196 = leftArm3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(43, 36).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7399F, -0.0221F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftArm4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 81).addBox(-0.8F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r198 = leftArm4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(41, 14).addBox(-0.8F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.79F, 3.1656F, -0.7078F, 1.2312F, -0.2091F, 0.2467F));

		PartDefinition cube_r199 = rightarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 71).addBox(-0.5F, -0.625F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(91, 68).addBox(-0.5F, -0.125F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.012F, 0.0253F, -0.0717F, 0.6544F, -0.0014F, 0.001F));

		PartDefinition cube_r200 = rightarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(85, 43).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 85).addBox(-0.5F, -0.625F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.012F, 0.0253F, -0.0717F, 0.0872F, -0.0014F, 0.001F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(22, 84).addBox(-0.5F, -0.325F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1652F, 5.4222F, -2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(83, 35).addBox(-0.5F, -0.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.1652F, 5.4222F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.1652F, 5.4222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r204 = rightarm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(46, 57).addBox(-1.0F, -4.8624F, -0.2206F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.0712F, 4.7357F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightarm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -5.0389F, 0.3792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.61F, 1.956F, 0.5149F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0222F, 7.479F, 5.9152F, -0.1634F, -0.0658F, -0.2489F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(17, 60).addBox(-0.4704F, -0.339F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4064F, -0.8399F, 0.7271F, 1.5708F, 1.5446F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(40, 59).addBox(-0.8704F, -4.839F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4064F, 4.048F, 0.1989F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(5, 55).addBox(-0.4F, -0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.4064F, 4.0636F, 0.6731F, -1.5708F, 1.5621F, -1.5708F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(92, 6).addBox(0.0223F, -0.0791F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7064F, 0.2149F, -0.3091F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r210 = rightarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(26, 75).addBox(-0.9F, -0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.2064F, 7.4776F, -1.3114F, 1.5708F, 1.2828F, 1.5708F));

		PartDefinition cube_r211 = rightarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(65, 59).addBox(0.6065F, 3.2752F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.7064F, 0.2149F, -0.3091F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r212 = rightarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(47, 73).addBox(-0.1697F, 0.7976F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7064F, 0.2149F, -0.3091F, -1.5708F, 1.4312F, -1.5708F));

		PartDefinition cube_r213 = rightarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(52, 33).addBox(-0.2F, -4.0F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1064F, 7.448F, 0.999F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r214 = rightarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(49, 85).addBox(0.0F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1764F, -0.8515F, 0.9635F, -1.5708F, 1.4573F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 10.1143F, -0.0009F, 0.435F, 0.7939F, -0.0078F));

		PartDefinition cube_r215 = rightArm3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(21, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r216 = rightArm3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 46).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7399F, -0.0221F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightArm4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(81, 29).addBox(-0.2F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r218 = rightArm4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(43, 31).addBox(-2.2F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.0873F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1586F, -4.8289F, 1.1634F, -0.0682F, 0.172F));

		PartDefinition cube_r219 = neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(47, 70).addBox(0.0F, -1.0342F, -0.2343F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2654F, -0.7675F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.65F, -3.05F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -1.85F, 0.2408F, 0.1928F, 0.1347F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(14, 64).addBox(0.0F, -0.0055F, -0.8398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8775F, 0.1258F, -0.9F, 0.4247F, 0.3161F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(39, 31).addBox(0.0F, -0.0055F, -0.8398F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8775F, 0.1258F, -0.9F, -0.4247F, -0.3161F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(58, 78).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6927F, 0.2972F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0185F, -1.6164F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(66, 22).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9428F, -4.5231F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(5, 77).addBox(-1.0F, -0.0624F, -0.8937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6811F, -6.8344F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(59, 12).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.2238F, -5.8573F, 2.378F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(31, 79).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.5281F, -6.5166F, 0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.1907F, -3.914F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(59, 86).addBox(-0.5F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.9747F, -4.2154F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(19, 55).addBox(-0.5F, -0.0162F, -1.3635F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.275F, -4.6F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(50, 69).addBox(-0.025F, -0.25F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 34).addBox(-0.375F, -0.25F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3F, 2.2426F, -7.575F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(69, 30).addBox(-0.2F, -0.225F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(86, 53).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 2.2426F, -7.575F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(86, 50).addBox(-0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 2.8376F, -8.0949F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(53, 78).addBox(0.0F, -0.55F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.2512F, -6.3457F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(37, 51).addBox(-1.5F, -0.2425F, 0.0192F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 29).addBox(-1.5F, 0.8546F, -4.5657F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.5F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(15, 15).addBox(-1.0F, -1.7F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, -1.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(62, 73).addBox(-2.0F, -1.0031F, -0.9968F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(1.0F, -0.4332F, 0.7318F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(66, 14).addBox(-2.0F, -0.0031F, -0.9718F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.1807F, 1.6522F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(63, 41).addBox(-2.0F, -0.0022F, 0.0083F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8891F, 1.0099F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(36, 66).addBox(-1.0F, -0.0022F, -0.0167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.4872F, -3.9802F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(50, 66).addBox(-1.0F, -1.0022F, -1.0167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5501F, -2.9211F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(29, 64).addBox(-1.5F, -0.0022F, -0.9917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -3.6571F, -2.7642F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(22, 64).addBox(-2.0F, -0.0022F, -0.9917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.7616F, -1.7697F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(7, 64).addBox(-2.0F, -0.0022F, -0.9917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -3.6919F, -0.7721F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(63, 55).addBox(-2.0F, -0.0022F, -0.9917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.484F, 0.206F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 63).addBox(-2.0F, -0.0022F, -0.9917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -2.8891F, 1.0099F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(77, 41).addBox(-1.0F, -0.3052F, 0.4427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 19).addBox(-1.0F, -0.3052F, 0.1426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(19, 77).addBox(-1.0F, -0.3052F, -0.2573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -3.0566F, 1.0506F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(77, 57).addBox(-1.0F, -0.2757F, -0.298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -3.2566F, 0.7506F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(48, 78).addBox(-1.0F, -0.297F, -0.6765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -3.2434F, 0.7233F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(43, 78).addBox(-1.0F, -0.397F, -0.2765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.499F, -3.4689F, -0.0408F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.8359F, 1.8361F, -9.8986F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0384F, -3.1425F, 5.5991F, 2.5512F, 1.1627F, -0.5099F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5708F, -1.0457F, -0.6928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4619F, -3.667F, 5.8503F, 3.0748F, 1.1627F, -0.5099F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(92, 84).addBox(-0.4F, 0.4376F, -1.2571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.8359F, 0.845F, 3.0642F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(82, 93).addBox(-0.5F, 0.9215F, -0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1359F, -0.151F, 2.567F, 0.4189F, 0.0873F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(77, 81).addBox(-0.5F, -2.7533F, 0.949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1359F, -0.151F, 2.567F, -1.117F, 0.0873F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 93).addBox(-0.5F, -2.4987F, -3.2662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1359F, -0.151F, 2.567F, -2.4696F, 0.0873F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(66, 18).addBox(-0.5F, 2.6336F, 1.9388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1359F, -0.151F, 2.567F, 1.0996F, 0.0873F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(48, 19).addBox(-0.5F, 1.3649F, -0.1786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 87).addBox(-0.5F, 1.3649F, 2.2214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.1359F, -0.151F, 2.567F, 0.4538F, 0.0873F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(24, 80).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2318F, -2.8967F, 10.583F, 0.6035F, -0.5265F, 1.9568F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(80, 25).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.981F, -2.1719F, 9.3692F, 0.3188F, -0.4087F, 1.8111F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(80, 10).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.981F, -2.1719F, 9.3692F, 0.9733F, -0.4087F, 1.8111F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(92, 55).addBox(-0.2654F, 0.2042F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4427F, -2.3432F, 8.3436F, 1.1503F, -0.2897F, 1.753F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(92, 36).addBox(-0.2712F, -0.6117F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4427F, -2.3432F, 8.3436F, -0.1258F, -1.1654F, -2.9497F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(15, 91).addBox(-0.3264F, 0.219F, -0.7491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3094F, -1.4689F, 7.91F, -1.8847F, -1.4666F, -1.1596F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(10, 91).addBox(-0.7738F, 0.3994F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2094F, -1.4689F, 6.81F, 1.7195F, -0.4128F, 1.6282F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(89, 90).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2094F, -1.4689F, 6.81F, -1.9302F, -1.1746F, -1.1197F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 90).addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.042F, -1.4168F, 6.2361F, -1.8382F, 0.1296F, -1.4318F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(91, 26).addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.042F, -1.4168F, 6.2361F, 2.5639F, 1.2527F, 2.7145F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(79, 90).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9017F, -1.519F, 5.6618F, -2.7035F, 1.2773F, -2.5122F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5F, -0.543F, -1.4123F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2183F, -2.0492F, 5.6778F, -1.7892F, 1.0585F, -0.5027F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(68, 26).addBox(-0.5F, -0.1662F, -0.7114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2183F, -2.0492F, 5.6778F, -0.5675F, 1.0585F, -0.5027F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(21, 68).addBox(-0.5F, -0.1912F, -0.6364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2183F, -2.0492F, 5.6778F, -1.1147F, 1.2886F, -1.0124F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(46, 51).addBox(-0.5F, -1.293F, -1.3623F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2183F, -2.0492F, 5.6778F, -2.434F, 1.2569F, -1.1144F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 67).addBox(-0.6087F, -1.3253F, -0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.743F, -4.2343F, 5.8294F, -1.873F, 1.2448F, -0.4968F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(83, 14).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0676F, -4.6316F, 6.4353F, -0.4038F, 0.4454F, 2.4366F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5209F, -0.7716F, -1.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.743F, -4.2343F, 5.8294F, -2.1204F, 1.1419F, 0.4551F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(50, 91).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2939F, -5.0352F, 6.2057F, -2.0145F, 0.2949F, 2.0609F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(84, 47).addBox(-0.5209F, 0.1373F, -0.5574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.743F, -4.2343F, 5.8294F, 2.9846F, 1.1419F, 0.4551F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(88, 20).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7811F, -5.262F, 5.96F, -1.9965F, 0.1514F, 1.7469F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(87, 38).addBox(-0.5209F, 0.1637F, -0.2926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.743F, -4.2343F, 5.8294F, -2.9495F, 1.1419F, 0.4551F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(91, 49).addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3226F, -5.2668F, 5.7366F, 2.7982F, -0.0419F, 1.3666F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(74, 90).addBox(-0.6069F, -0.292F, 0.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.243F, -4.2343F, 5.5294F, 2.1992F, 1.1419F, 0.4551F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(90, 9).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3742F, -5.0958F, 5.09F, 1.3059F, 1.1727F, 0.9622F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(81, 71).addBox(-0.4858F, -1.5614F, -0.5925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(-0.7547F, 2.7583F, 3.1213F, 0.1447F, 0.0643F, -0.1617F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(58, 81).addBox(-0.4858F, -1.5947F, -0.6047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(77, 93).addBox(-0.4858F, -0.2764F, -0.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.7547F, 2.7583F, 3.1213F, 0.2669F, 0.0643F, -0.1617F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(72, 81).addBox(-0.4858F, -1.5588F, -0.3955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7547F, 2.7583F, 3.1213F, 0.0487F, 0.0643F, -0.1617F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(72, 93).addBox(-0.4858F, -0.3021F, -0.61F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(93, 32).addBox(-0.4858F, 0.0979F, -0.61F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7547F, 2.7583F, 3.1213F, 0.616F, 0.0643F, -0.1617F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(64, 45).addBox(0.0F, -2.0022F, 0.0083F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3801F, -3.8029F, 9.7066F, 0.9081F, -0.1451F, -3.0292F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(77, 63).addBox(-1.0F, -2.0022F, 0.0083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0426F, -4.3546F, 10.4256F, 0.5034F, -0.8024F, -2.2245F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(41, 82).addBox(-1.0F, -0.0022F, 0.0083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -4.7252F, 10.9085F, -0.6707F, -0.6808F, -0.6707F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(46, 82).addBox(-1.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -5.5977F, 8.129F, 0.0675F, 0.0802F, -0.87F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(90, 3).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 90).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2637F, -2.2739F, 6.9784F, 0.1306F, -0.0212F, -1.641F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(57, 19).addBox(-3.0F, -1.0022F, -0.9917F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0699F, -4.9585F, 8.1962F, -0.0128F, 0.1039F, -1.6936F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(57, 22).addBox(-3.0F, -1.0022F, -0.9917F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0699F, -4.8867F, 9.0817F, 0.0085F, -0.0693F, -1.6933F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(10, 82).addBox(-1.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -5.528F, 9.1265F, -0.0449F, -0.0535F, -0.8715F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(14, 71).addBox(-2.0F, -1.0022F, -0.9917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0699F, -4.6913F, 9.971F, 0.0259F, -0.2079F, -1.6957F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(81, 51).addBox(-1.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -5.3201F, 10.1047F, -0.1358F, -0.16F, -0.8618F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(71, 38).addBox(-2.0F, -1.0022F, -0.9917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0426F, -4.2359F, 10.5464F, 0.0772F, -0.633F, -1.7008F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(82, 40).addBox(-1.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -4.7252F, 10.9085F, -0.4232F, -0.4914F, -0.8086F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(87, 81).addBox(-0.8F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(78, 87).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5359F, -0.4544F, 2.782F, 1.0687F, -0.1194F, -0.2137F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(57, 69).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1431F, -1.6297F, 4.9931F, 0.9007F, 0.1142F, 0.5966F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(28, 68).addBox(-0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7231F, -1.2054F, 5.3017F, 0.8431F, 0.3827F, 0.3655F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(35, 91).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6268F, 0.5384F, 2.762F, -0.5754F, -0.2842F, 0.4871F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3681F, -0.8399F, 4.1879F, 0.7336F, -0.2842F, 0.4871F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(30, 91).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.704F, 0.7781F, 2.22F, 0.1103F, 0.071F, 0.4841F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(91, 29).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1758F, 1.2067F, 2.8063F, 0.0729F, 0.109F, 0.074F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(45, 91).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6208F, 1.2569F, 3.4575F, 1.3126F, -0.913F, -1.2196F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(40, 91).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6268F, 0.5384F, 2.762F, 1.3851F, -0.5636F, -1.3255F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(11, 30).addBox(-0.4F, -0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8892F, -0.9403F, 4.8868F, 0.771F, 0.109F, 0.074F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(87, 84).addBox(-0.9049F, -0.091F, -0.0882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6541F, -1.0366F, 3.6382F, 2.17F, 1.0074F, -2.3714F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(73, 20).addBox(-0.9049F, -0.991F, -0.0882F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6432F, -1.6898F, 4.2573F, 1.1774F, 0.7307F, -2.1105F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 0).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3379F, -0.4689F, 2.8109F, 2.3402F, -0.5038F, -1.4661F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 62).addBox(-0.9F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3369F, -0.8846F, 3.0888F, 2.4021F, 0.6011F, -0.4738F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(87, 56).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.3358F, -1.3002F, 3.3667F, 2.4021F, 0.6011F, -0.4738F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(83, 87).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3358F, -1.3002F, 3.3667F, 2.0142F, -0.3714F, -1.3396F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(52, 29).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1884F, -4.6278F, 7.3026F, 0.0985F, 0.0256F, -1.7579F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(71, 45).addBox(-2.0F, -1.0022F, -0.9917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0699F, -4.8836F, 7.3384F, -0.0321F, 0.3213F, -1.672F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(51, 82).addBox(-1.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -5.4932F, 7.1345F, 0.2118F, 0.2455F, -0.8464F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(82, 56).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6591F, -5.3278F, 6.5142F, 0.0568F, -0.6132F, -0.0172F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(82, 63).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 81).addBox(-1.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6591F, -5.3278F, 6.5142F, 0.4408F, -0.6132F, -0.0172F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(93, 0).addBox(-0.9F, -1.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F))
				.texOffs(0, 93).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3269F, -2.0726F, 4.0405F, 2.1171F, 0.6929F, -0.7984F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(10, 88).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.3359F, 1.0015F, 1.8037F, 0.7224F, -0.3876F, -1.2002F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(88, 13).addBox(-1.1F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(15, 88).addBox(-1.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3359F, 1.0015F, 1.8037F, 0.7941F, 0.1353F, -1.7372F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(64, 69).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3359F, 1.0015F, 1.8037F, 0.7662F, 0.489F, -0.4541F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(92, 62).addBox(-0.85F, 0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 81).addBox(-0.85F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2488F, 1.0676F, 2.319F, -0.0466F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(5, 93).addBox(-0.1F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 12).addBox(-0.1F, -0.85F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5988F, 2.0932F, 1.7706F, -0.0632F, -0.7408F, 0.0427F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(67, 79).addBox(-0.9F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3269F, -1.9873F, 3.9595F, 2.0823F, 0.6551F, -0.8264F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(79, 47).addBox(-0.735F, -0.4689F, -0.2568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(78, 0).addBox(-0.235F, -0.4689F, -0.2568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.743F, -4.2343F, 5.8294F, 0.1537F, -0.3864F, -0.0718F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.8359F, 1.8361F, -9.8986F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0384F, -3.1425F, 5.5991F, 2.5512F, -1.1627F, 0.5099F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.4292F, -1.0457F, -0.6928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4619F, -3.667F, 5.8503F, 3.0748F, -1.1627F, 0.5099F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.6F, 0.4376F, -1.2571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8359F, 0.845F, 3.0642F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(82, 93).mirror().addBox(-0.5F, 0.9215F, -0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1359F, -0.151F, 2.567F, 0.4189F, -0.0873F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(-0.5F, -2.7533F, 0.949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1359F, -0.151F, 2.567F, -1.117F, -0.0873F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(-0.5F, -2.4987F, -3.2662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1359F, -0.151F, 2.567F, -2.4696F, -0.0873F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-0.5F, 2.6336F, 1.9388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1359F, -0.151F, 2.567F, 1.0996F, -0.0873F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-0.5F, 1.3649F, -0.1786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 87).mirror().addBox(-0.5F, 1.3649F, 2.2214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.1359F, -0.151F, 2.567F, 0.4538F, -0.0873F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(24, 80).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2318F, -2.8967F, 10.583F, 0.6035F, 0.5265F, -1.9568F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(80, 25).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.981F, -2.1719F, 9.3692F, 0.3188F, 0.4087F, -1.8111F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.981F, -2.1719F, 9.3692F, 0.9733F, 0.4087F, -1.8111F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-0.7346F, 0.2042F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.4427F, -2.3432F, 8.3436F, 1.1503F, 0.2897F, -1.753F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(92, 36).mirror().addBox(-0.7287F, -0.6117F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4427F, -2.3432F, 8.3436F, -0.1258F, 1.1654F, 2.9497F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-0.6736F, 0.219F, -0.7491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3094F, -1.4689F, 7.91F, -1.8847F, 1.4666F, 1.1596F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-0.2262F, 0.3994F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2094F, -1.4689F, 6.81F, 1.7195F, 0.4128F, -1.6282F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 90).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2094F, -1.4689F, 6.81F, -1.9302F, 1.1746F, 1.1197F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(84, 90).mirror().addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.042F, -1.4168F, 6.2361F, -1.8382F, -0.1296F, 1.4318F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.042F, -1.4168F, 6.2361F, 2.5639F, -1.2527F, -2.7145F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(79, 90).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9017F, -1.519F, 5.6618F, -2.7035F, -1.2773F, 2.5122F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(26, 59).mirror().addBox(-0.5F, -0.543F, -1.4123F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2183F, -2.0492F, 5.6778F, -1.7892F, -1.0585F, 0.5027F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(68, 26).mirror().addBox(-0.5F, -0.1662F, -0.7114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2183F, -2.0492F, 5.6778F, -0.5675F, -1.0585F, 0.5027F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.5F, -0.1912F, -0.6364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2183F, -2.0492F, 5.6778F, -1.1147F, -1.2886F, 1.0124F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(46, 51).mirror().addBox(-0.5F, -1.293F, -1.3623F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2183F, -2.0492F, 5.6778F, -2.434F, -1.2569F, 1.1144F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.3913F, -1.3253F, -0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.743F, -4.2343F, 5.8294F, -1.873F, -1.2448F, 0.4968F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0676F, -4.6316F, 6.4353F, -0.4038F, -0.4454F, -2.4366F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.4791F, -0.7716F, -1.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.743F, -4.2343F, 5.8294F, -2.1204F, -1.1419F, -0.4551F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(50, 91).mirror().addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2939F, -5.0352F, 6.2057F, -2.0145F, -0.2949F, -2.0609F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-0.4791F, 0.1373F, -0.5574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.743F, -4.2343F, 5.8294F, 2.9846F, -1.1419F, -0.4551F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(88, 20).mirror().addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7811F, -5.262F, 5.96F, -1.9965F, -0.1514F, -1.7469F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(87, 38).mirror().addBox(-0.4791F, 0.1637F, -0.2926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.743F, -4.2343F, 5.8294F, -2.9495F, -1.1419F, -0.4551F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3226F, -5.2668F, 5.7366F, 2.7982F, 0.0419F, -1.3666F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(74, 90).mirror().addBox(-0.3931F, -0.292F, 0.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.243F, -4.2343F, 5.5294F, 2.1992F, -1.1419F, -0.4551F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3742F, -5.0958F, 5.09F, 1.3059F, -1.1727F, -0.9622F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-0.5142F, -1.5614F, -0.5925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(0.7547F, 2.7583F, 3.1213F, 0.1447F, -0.0643F, 0.1617F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(58, 81).mirror().addBox(-0.5142F, -1.5947F, -0.6047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(77, 93).mirror().addBox(-0.5142F, -0.2764F, -0.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.7547F, 2.7583F, 3.1213F, 0.2669F, -0.0643F, 0.1617F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(72, 81).mirror().addBox(-0.5142F, -1.5588F, -0.3955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7547F, 2.7583F, 3.1213F, 0.0487F, -0.0643F, 0.1617F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(72, 93).mirror().addBox(-0.5142F, -0.3021F, -0.61F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(93, 32).mirror().addBox(-0.5142F, 0.0979F, -0.61F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7547F, 2.7583F, 3.1213F, 0.616F, -0.0643F, 0.1617F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-2.0F, -2.0022F, 0.0083F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3801F, -3.8029F, 9.7066F, 0.9081F, 0.1451F, 3.0292F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(0.0F, -2.0022F, 0.0083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0426F, -4.3546F, 10.4256F, 0.5034F, 0.8024F, 2.2245F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(41, 82).mirror().addBox(0.0F, -0.0022F, 0.0083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -4.7252F, 10.9085F, -0.6707F, 0.6808F, 0.6707F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(46, 82).mirror().addBox(0.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -5.5977F, 8.129F, 0.0675F, -0.0802F, 0.87F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(90, 3).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 90).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2637F, -2.2739F, 6.9784F, 0.1306F, 0.0212F, 1.641F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(57, 19).mirror().addBox(0.0F, -1.0022F, -0.9917F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0699F, -4.9585F, 8.1962F, -0.0128F, -0.1039F, 1.6936F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(0.0F, -1.0022F, -0.9917F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0699F, -4.8867F, 9.0817F, 0.0085F, 0.0693F, 1.6933F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(10, 82).mirror().addBox(0.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -5.528F, 9.1265F, -0.0449F, 0.0535F, 0.8715F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(0.0F, -1.0022F, -0.9917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0699F, -4.6913F, 9.971F, 0.0259F, 0.2079F, 1.6957F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(0.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -5.3201F, 10.1047F, -0.1358F, 0.16F, 0.8618F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(71, 38).mirror().addBox(0.0F, -1.0022F, -0.9917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0426F, -4.2359F, 10.5464F, 0.0772F, 0.633F, 1.7008F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(82, 40).mirror().addBox(0.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -4.7252F, 10.9085F, -0.4232F, 0.4914F, 0.8086F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-0.2F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(78, 87).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5359F, -0.4544F, 2.782F, 1.0687F, 0.1194F, 0.2137F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1431F, -1.6297F, 4.9931F, 0.9007F, -0.1142F, -0.5966F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(28, 68).mirror().addBox(-0.725F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7231F, -1.2054F, 5.3017F, 0.8431F, -0.3827F, -0.3655F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6268F, 0.5384F, 2.762F, -0.5754F, 0.2842F, -0.4871F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3681F, -0.8399F, 4.1879F, 0.7336F, 0.2842F, -0.4871F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.704F, 0.7781F, 2.22F, 0.1103F, -0.071F, -0.4841F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(91, 29).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1758F, 1.2067F, 2.8063F, 0.0729F, -0.109F, -0.074F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6208F, 1.2569F, 3.4575F, 1.3126F, 0.913F, 1.2196F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(40, 91).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6268F, 0.5384F, 2.762F, 1.3851F, 0.5636F, 1.3255F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(11, 30).mirror().addBox(-0.6F, -0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8892F, -0.9403F, 4.8868F, 0.771F, -0.109F, -0.074F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(-0.0951F, -0.091F, -0.0882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6541F, -1.0366F, 3.6382F, 2.17F, -1.0074F, 2.3714F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-0.0951F, -0.991F, -0.0882F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6432F, -1.6898F, 4.2573F, 1.1774F, -0.7307F, 2.1105F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3379F, -0.4689F, 2.8109F, 2.3402F, 0.5038F, 1.4661F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-0.1F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3369F, -0.8846F, 3.0888F, 2.4021F, -0.6011F, 0.4738F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(87, 56).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.3358F, -1.3002F, 3.3667F, 2.4021F, -0.6011F, 0.4738F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3358F, -1.3002F, 3.3667F, 2.0142F, 0.3714F, 1.3396F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(52, 29).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1884F, -4.6278F, 7.3026F, 0.0985F, -0.0256F, 1.7579F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(0.0F, -1.0022F, -0.9917F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0699F, -4.8836F, 7.3384F, -0.0321F, -0.3213F, 1.672F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(51, 82).mirror().addBox(0.0F, -0.0022F, -0.9917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -5.4932F, 7.1345F, 0.2118F, -0.2455F, 0.8464F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(82, 56).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6591F, -5.3278F, 6.5142F, 0.0568F, 0.6132F, 0.0172F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(82, 63).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 81).mirror().addBox(0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6591F, -5.3278F, 6.5142F, 0.4408F, 0.6132F, 0.0172F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.1F, -1.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3269F, -2.0726F, 4.0405F, 2.1171F, -0.6929F, 0.7984F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.3359F, 1.0015F, 1.8037F, 0.7224F, 0.3876F, 1.2002F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(88, 13).mirror().addBox(0.1F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(15, 88).mirror().addBox(0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3359F, 1.0015F, 1.8037F, 0.7941F, -0.1353F, 1.7372F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(64, 69).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3359F, 1.0015F, 1.8037F, 0.7662F, -0.489F, 0.4541F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(92, 62).mirror().addBox(-0.15F, 0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(92, 81).mirror().addBox(-0.15F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2488F, 1.0676F, 2.319F, -0.0466F, 0.0F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.9F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 12).mirror().addBox(-0.9F, -0.85F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5988F, 2.0932F, 1.7706F, -0.0632F, 0.7408F, -0.0427F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-0.1F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3269F, -1.9873F, 3.9595F, 2.0823F, -0.6551F, 0.8264F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.265F, -0.4689F, -0.2568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(78, 0).mirror().addBox(-0.765F, -0.4689F, -0.2568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.743F, -4.2343F, 5.8294F, 0.1537F, 0.3864F, 0.0718F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4284F, -0.6994F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.1F, 0.1883F, -0.858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, -0.1396F, -0.1745F, -0.1745F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-0.3F, -0.9634F, 0.3748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, -0.576F, -0.1745F, -0.1745F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5064F, -1.5359F, -0.5443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8862F, 3.5876F, -7.172F, -0.5681F, -0.0417F, 2.9773F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-0.5064F, -0.5674F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(91, 52).mirror().addBox(-0.5064F, -0.9674F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8862F, 3.5876F, -7.172F, -0.4372F, -0.0417F, 2.9773F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.5064F, -0.3627F, -0.7479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(90, 23).mirror().addBox(-0.5064F, 0.0373F, -0.7479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8862F, 3.5876F, -7.172F, -0.0008F, -0.0417F, 2.9773F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(90, 41).mirror().addBox(-0.5064F, -0.2862F, -0.586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.8862F, 3.5876F, -7.172F, -0.3499F, -0.0417F, 2.9773F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(1.0941F, -3.3736F, -4.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 69).mirror().addBox(1.0941F, -3.7736F, -4.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8562F, 4.9564F, -2.7635F, 0.477F, -0.0175F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.095F, 2.0525F, -0.641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, -0.2443F, -0.1745F, -0.1745F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-0.095F, 0.214F, -3.5026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, 1.021F, -0.1745F, -0.1745F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(70, 41).mirror().addBox(-0.0265F, -0.9929F, -0.5528F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.8565F, -1.2442F, 2.0364F, -0.261F, -0.1334F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-0.0265F, -0.6536F, 0.9297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.8565F, -1.2442F, -2.7808F, -0.261F, -0.1334F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(32, 88).mirror().addBox(-0.0115F, 0.9078F, -0.7166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(20, 93).mirror().addBox(-0.0115F, 2.4444F, -2.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, -1.3956F, -0.1745F, -0.0961F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(93, 19).mirror().addBox(-0.0115F, -0.5513F, -2.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 0.0879F, -0.1745F, -0.0961F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(0.2928F, -3.3401F, -1.6236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 1.2123F, -0.0702F, -0.0949F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(84, 78).mirror().addBox(0.2928F, -2.4328F, 2.8061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 84).mirror().addBox(0.2928F, -2.4328F, 3.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 2.5213F, -0.0702F, -0.0949F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(33, 59).mirror().addBox(-0.0115F, -0.455F, -2.1395F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(36, 81).mirror().addBox(-0.0115F, -0.655F, -2.4895F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, -1.1338F, -0.1745F, -0.0961F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(-0.0115F, 1.7193F, -1.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, -1.3084F, -0.1745F, -0.0961F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(42, 88).mirror().addBox(0.2928F, -1.4548F, -3.7403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 0.1215F, -0.0702F, -0.0949F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(47, 88).mirror().addBox(-0.0265F, 0.4105F, -2.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 89).mirror().addBox(-0.0265F, -0.5895F, -2.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.8565F, -1.2442F, -0.9482F, -0.261F, -0.1334F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-0.095F, 1.9416F, -0.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, -0.48F, -0.1745F, -0.1745F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.095F, -0.2111F, -1.3098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(64, 88).mirror().addBox(-0.095F, -0.3539F, -0.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, 1.309F, -0.1745F, -0.1745F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(69, 88).mirror().addBox(0.7441F, -4.3007F, -3.7875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 87).mirror().addBox(0.7441F, -3.9007F, -3.7875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8562F, 4.9564F, -2.7635F, 0.6515F, -0.0175F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-0.0115F, 1.404F, -2.3213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, -1.2647F, -0.1745F, -0.0961F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.095F, -1.0036F, -0.8677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2565F, -1.0442F, 0.6981F, -0.1745F, -0.1745F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(80, 4).mirror().addBox(-0.0115F, -0.1215F, -0.0568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, -2.7919F, -0.1745F, -0.0961F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1185F, 2.8804F, -2.2549F, -0.1962F, 0.4721F, 1.3061F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 78).mirror().addBox(-1.0F, -1.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9787F, 3.3962F, -2.5277F, 0.4354F, 0.2713F, 2.7664F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(1.0108F, -2.2321F, 3.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 2.526F, 0.1077F, 0.1538F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(1.6765F, 1.3646F, 3.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 3.0865F, 0.6216F, 1.4793F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(85, 10).mirror().addBox(1.0108F, -3.9033F, -0.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 1.5224F, 0.1077F, 0.1538F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(3.1614F, 1.3646F, -0.3535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5562F, 4.9564F, -2.7635F, 1.3201F, 1.5245F, -0.3103F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(90, 41).addBox(-0.4936F, -0.2862F, -0.586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.8862F, 3.5876F, -7.172F, -0.3499F, 0.0417F, -2.9773F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(90, 23).addBox(-0.4936F, 0.0373F, -0.7479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 90).addBox(-0.4936F, -0.3627F, -0.7479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.8862F, 3.5876F, -7.172F, -0.0008F, 0.0417F, -2.9773F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(88, 87).addBox(-1.7441F, -3.9007F, -3.7875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 88).addBox(-1.7441F, -4.3007F, -3.7875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8562F, 4.9564F, -2.7635F, 0.6515F, 0.0175F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(86, 69).addBox(-2.0941F, -3.7736F, -4.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 59).addBox(-2.0941F, -3.3736F, -4.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8562F, 4.9564F, -2.7635F, 0.477F, 0.0175F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(91, 52).addBox(-0.4936F, -0.9674F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(90, 16).addBox(-0.4936F, -0.5674F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8862F, 3.5876F, -7.172F, -0.4372F, 0.0417F, -2.9773F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(5, 80).addBox(-0.4936F, -1.5359F, -0.5443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8862F, 3.5876F, -7.172F, -0.5681F, 0.0417F, -2.9773F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(78, 15).addBox(-0.7F, -0.9634F, 0.3748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, -0.576F, 0.1745F, 0.1745F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(83, 21).addBox(-4.1614F, 1.3646F, -0.3535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 1.3201F, -1.5245F, 0.3103F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(85, 17).addBox(-2.6765F, 1.3646F, 3.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 3.0865F, -0.6216F, -1.4793F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(85, 10).addBox(-2.0108F, -3.9033F, -0.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 1.5224F, -0.1077F, -0.1538F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(85, 3).addBox(-2.0108F, -2.2321F, 3.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 2.526F, -0.1077F, -0.1538F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(82, 84).addBox(-1.2928F, -2.4328F, 3.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(84, 78).addBox(-1.2928F, -2.4328F, 2.8061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 2.5213F, 0.0702F, 0.0949F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(88, 33).addBox(-1.2928F, -3.3401F, -1.6236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 1.2123F, 0.0702F, 0.0949F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(93, 19).addBox(-0.9885F, -0.5513F, -2.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 0.0879F, 0.1745F, 0.0961F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(42, 88).addBox(-1.2928F, -1.4548F, -3.7403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, 0.1215F, 0.0702F, 0.0949F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(37, 88).addBox(-0.9885F, 1.7193F, -1.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, -1.3084F, 0.1745F, 0.0961F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(64, 88).addBox(-0.905F, -0.3539F, -0.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, 1.309F, 0.1745F, 0.1745F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(89, 46).addBox(-0.905F, -1.0036F, -0.8677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, 0.6981F, 0.1745F, 0.1745F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(0, 80).addBox(-0.905F, -0.2111F, -1.3098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, 0.0F, 0.1745F, 0.1745F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(89, 78).addBox(0.0F, -1.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(89, 75).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9787F, 3.3962F, -2.5277F, 0.4354F, -0.2713F, -2.7664F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(89, 65).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1185F, 2.8804F, -2.2549F, -0.1962F, -0.4721F, -1.3061F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(52, 88).addBox(-0.905F, 1.9416F, -0.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, -0.48F, 0.1745F, 0.1745F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(57, 89).addBox(-0.9735F, -0.5895F, -2.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 88).addBox(-0.9735F, 0.4105F, -2.0434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 3.8565F, -1.2442F, -0.9482F, 0.261F, 0.1334F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(20, 93).addBox(-0.9885F, 2.4444F, -2.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(32, 88).addBox(-0.9885F, 0.9078F, -0.7166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, -1.3956F, 0.1745F, 0.0961F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(25, 89).addBox(-0.9885F, 1.404F, -2.3213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, -1.2647F, 0.1745F, 0.0961F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(36, 81).addBox(-0.9885F, -0.655F, -2.4895F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(33, 59).addBox(-0.9885F, -0.455F, -2.1395F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, -1.1338F, 0.1745F, 0.0961F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(80, 4).addBox(-0.9885F, -0.1215F, -0.0568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5562F, 4.9564F, -2.7635F, -2.7919F, 0.1745F, 0.0961F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(79, 77).addBox(-0.9735F, -0.6536F, 0.9297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1F, 3.8565F, -1.2442F, -2.7808F, 0.261F, 0.1334F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(70, 41).addBox(-0.9735F, -0.9929F, -0.5528F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1F, 3.8565F, -1.2442F, 2.0364F, 0.261F, 0.1334F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(79, 67).addBox(-0.905F, 0.214F, -3.5026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, 1.021F, 0.1745F, 0.1745F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(35, 70).addBox(-0.905F, 2.0525F, -0.641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, -0.2443F, 0.1745F, 0.1745F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(59, 0).addBox(-0.9F, 0.1883F, -0.858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7F, 0.2565F, -1.0442F, -0.1396F, 0.1745F, 0.1745F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(48, 24).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3448F, 1.4809F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 46).addBox(-0.5F, -0.5315F, -0.3345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2704F, 3.0346F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4385F, 2.5405F, 0.0873F, 0.0F, 0.0F));

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