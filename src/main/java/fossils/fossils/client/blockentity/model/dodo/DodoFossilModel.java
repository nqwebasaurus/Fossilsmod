package fossils.fossils.client.blockentity.model.dodo;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DodoFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public DodoFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe = this.leftLeg3.getChild("toe");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 18.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.0506F, -9.3602F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 104).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(10, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.0389F, -1.7931F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.5541F, -0.9185F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(101, 101).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.0398F, -0.6094F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, 0.0F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 1.4632F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7332F, 2.0046F, 1.1604F, -0.5765F, -0.1274F, -0.1701F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.5F, -0.1F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9637F, -0.5801F, -0.6661F, 0.1726F, -0.1341F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 18).mirror().addBox(-6.7302F, -0.026F, -0.286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, -1.5666F, -2.0088F, -0.831F, 1.0175F, -1.0334F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-3.3317F, -0.1361F, -0.9506F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, -1.5666F, -2.0088F, -1.5508F, 1.1319F, -1.8504F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 16).mirror().addBox(-2.7F, -0.3F, 0.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1616F, -1.1183F, -3.923F, -1.5278F, 1.2168F, -2.1399F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 32).mirror().addBox(0.0F, -0.1F, 0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6608F, -1.8572F, -4.3738F, -0.3635F, 0.3052F, -0.906F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3675F, -3.3802F, -4.4614F, -0.2307F, 0.0438F, -0.8668F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 80).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.3999F, -3.0387F, -0.2339F, -0.7915F, -0.8116F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 44).mirror().addBox(-0.5F, -0.5F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7025F, 0.5378F, 3.1184F, -1.1887F, -0.7649F, 0.716F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(39, 46).mirror().addBox(-0.6F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7814F, 2.9585F, 5.7126F, -0.8049F, -0.7167F, 0.321F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 38).mirror().addBox(-2.6723F, -1.001F, 8.181F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 48).mirror().addBox(-2.6723F, -1.001F, 6.181F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0581F, -1.5666F, -2.0088F, -0.5776F, -0.0191F, -0.2489F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(30, 101).mirror().addBox(-0.6783F, -0.61F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3128F, 6.3578F, 9.0392F, -0.7683F, 0.2695F, -0.4421F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 24).mirror().addBox(-1.6638F, -0.9808F, 2.4677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1458F, 7.555F, 4.8474F, -0.8569F, 0.0519F, -0.4674F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-0.7537F, -0.9808F, -0.106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1458F, 7.555F, 4.8474F, -0.8735F, -0.1758F, -0.2018F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 75).mirror().addBox(-0.6732F, -0.666F, -2.7826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3128F, 6.3578F, 9.0392F, -0.9086F, 0.0132F, -0.2021F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(75, 60).mirror().addBox(-0.6732F, -1.01F, -3.3741F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3128F, 6.3578F, 9.0392F, -0.4286F, 0.0132F, -0.2021F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-0.5F, -1.4F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2785F, 3.225F, 1.7955F, -1.4922F, -0.152F, -0.0443F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.5953F, -0.2612F, 0.007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7311F, -0.8512F, -1.1345F, -0.8217F, -0.3089F, -0.0459F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(-0.5F, -1.6F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2517F, 1.9419F, 0.5832F, -0.2545F, -0.3089F, -0.0459F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.9287F, -1.2378F, 0.1503F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0311F, 3.4488F, 2.3655F, -1.053F, -0.3099F, 0.0383F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(33, 31).mirror().addBox(-0.8F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6221F, 3.8165F, 4.7315F, -0.7494F, -0.0531F, -0.1448F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(38, 8).mirror().addBox(0.0F, -1.9973F, 3.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.049F, -4.8424F, -0.3346F, -0.226F, -0.5725F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(17, 18).addBox(1.7302F, -0.026F, -0.286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, -1.5666F, -2.0088F, -0.831F, -1.0175F, 1.0334F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 38).addBox(-0.6683F, -0.1361F, -0.9506F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, -1.5666F, -2.0088F, -1.5508F, -1.1319F, 1.8504F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(49, 16).addBox(-0.3F, -0.3F, 0.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1616F, -1.1183F, -3.923F, -1.5278F, -1.2168F, 2.1399F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 32).addBox(-1.0F, -0.1F, 0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6608F, -1.8572F, -4.3738F, -0.3635F, -0.3052F, 0.906F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(89, 23).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3675F, -3.3802F, -4.4614F, -0.2307F, -0.0438F, 0.8668F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 80).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -4.3999F, -3.0387F, -0.2339F, 0.7915F, 0.8116F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(80, 80).addBox(-0.5F, -0.1F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9637F, -0.5801F, -0.6661F, -0.1726F, 0.1341F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(13, 44).addBox(-0.5F, -0.5F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7025F, 0.5378F, 3.1184F, -1.1887F, 0.7649F, -0.716F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(39, 46).addBox(-1.4F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7814F, 2.9585F, 5.7126F, -0.8049F, 0.7167F, -0.321F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(61, 38).addBox(0.6723F, -1.001F, 8.181F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 48).addBox(-1.3277F, -1.001F, 6.181F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0581F, -1.5666F, -2.0088F, -0.5776F, 0.0191F, 0.2489F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 101).addBox(-0.3217F, -0.61F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3128F, 6.3578F, 9.0392F, -0.7683F, -0.2695F, 0.4421F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 24).addBox(0.6638F, -0.9808F, 2.4677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1458F, 7.555F, 4.8474F, -0.8569F, -0.0519F, 0.4674F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 29).addBox(-0.2463F, -0.9808F, -0.106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1458F, 7.555F, 4.8474F, -0.8735F, 0.1758F, 0.2018F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(73, 75).addBox(-0.3267F, -0.666F, -2.7826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3128F, 6.3578F, 9.0392F, -0.9086F, -0.0132F, 0.2021F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(75, 60).addBox(-0.3267F, -1.01F, -3.3741F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3128F, 6.3578F, 9.0392F, -0.4286F, -0.0132F, 0.2021F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(89, 15).addBox(-0.5F, -1.4F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2785F, 3.225F, 1.7955F, -1.4922F, 0.152F, 0.0443F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(75, 0).addBox(-0.4047F, -0.2612F, 0.007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7311F, -0.8512F, -1.1345F, -0.8217F, 0.3089F, 0.0459F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 8).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7332F, 2.0046F, 1.1604F, -0.5765F, 0.1274F, 0.1701F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(32, 83).addBox(-0.5F, -1.6F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2517F, 1.9419F, 0.5832F, -0.2545F, 0.3089F, 0.0459F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 44).addBox(-0.0713F, -1.2378F, 0.1503F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0311F, 3.4488F, 2.3655F, -1.053F, 0.3099F, -0.0383F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(33, 31).addBox(-0.2F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6221F, 3.8165F, 4.7315F, -0.7494F, 0.0531F, 0.1448F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(14, 51).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.373F, 3.6172F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 68).addBox(-0.5F, 0.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6976F, 3.4603F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(38, 8).addBox(-1.0F, -1.9973F, 3.0176F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.049F, -4.8424F, -0.3346F, 0.226F, 0.5725F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(9, 68).addBox(-1.0F, -0.0973F, 0.0176F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -4.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 0.0295F, 0.4622F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 70).addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 83).addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.4946F, -0.3553F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(81, 65).addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.4946F, -0.3553F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(27, 79).addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 8.4946F, -0.3553F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(34, 68).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 2.2477F, 0.4023F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(18, 68).addBox(-4.5F, 0.0F, -2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 2.3F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(81, 32).addBox(-4.5F, -2.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5F, 2.3F, 0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(11, 63).addBox(-1.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 1.7426F, -0.8044F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(79, 49).addBox(-4.5F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.5F, -0.0396F, -1.5636F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 88).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.5F, -1.0244F, -1.7373F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(18, 76).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.9114F, -1.2755F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(96, 28).addBox(-4.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.0244F, -1.7373F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(14, 57).addBox(-1.5F, -1.0F, -1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.7F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(59, 52).addBox(-1.7F, 9.0746F, -1.6615F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(52, 52).addBox(-1.7F, 9.0764F, -2.2209F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.3F, 9.1596F, -0.1524F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(98, 57).addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 46).addBox(-2.5F, -3.507F, -2.3331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(32, 53).addBox(-2.5F, -7.9357F, -0.1453F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 9.1121F, -2.0756F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(22, 63).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -7.9751F, -0.9665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 9.0497F, -0.6949F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(79, 88).addBox(-5.7F, -3.0498F, -0.3321F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 70).addBox(-5.8F, -3.9498F, -1.3321F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(60, 99).addBox(-0.6532F, -0.294F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 0.9636F, 0.4564F, -0.3576F, 0.0073F, -0.0005F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(44, 63).addBox(-0.6532F, 1.4677F, -1.2621F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 0.9636F, 0.4564F, -0.0958F, 0.0073F, -0.0005F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(15, 31).addBox(-1.5F, -0.4447F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 18.1888F, -2.5424F, -1.0908F, 0.0F, 0.0F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5267F, 8.3523F, 0.7405F, 0.0873F, -0.3927F, 0.0F));

		PartDefinition cube_r71 = toe.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 97).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r72 = toe.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(95, 31).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(21, 9).addBox(-2.5F, -1.0F, -3.85F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6358F, 0.5498F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.5F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4893F, -3.806F, -0.258F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 0.0295F, 0.4622F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(18, 83).addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(86, 53).addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.4946F, -0.3553F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(82, 75).addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.4946F, -0.3553F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(80, 24).addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 8.4946F, -0.3553F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(68, 60).addBox(2.5F, 0.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.5F, 2.2477F, 0.4023F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(49, 68).addBox(2.5F, 0.0F, -2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 2.3F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 81).addBox(2.5F, -2.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.5F, 2.3F, 0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(33, 63).addBox(-0.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 1.7426F, -0.8044F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(80, 16).addBox(2.5F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.5F, -0.0396F, -1.5636F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(28, 88).addBox(2.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-4.5F, -1.0244F, -1.7373F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(91, 62).addBox(2.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -1.9114F, -1.2755F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(96, 73).addBox(2.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -1.0244F, -1.7373F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(39, 57).addBox(-0.5F, -1.0F, -1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, -0.7F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(62, 8).addBox(-0.3F, 9.0746F, -1.6615F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(25, 53).addBox(-0.3F, 9.0764F, -2.2209F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.3F, 9.1596F, -0.1524F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(71, 98).addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 31).addBox(0.5F, -3.507F, -2.3331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(59, 28).addBox(0.5F, -7.9357F, -0.1453F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 9.1121F, -2.0756F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(7, 51).addBox(0.5F, -7.9751F, -0.9665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 9.0497F, -0.6949F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(88, 85).addBox(3.7F, -3.0498F, -0.3321F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 74).addBox(2.8F, -3.9498F, -1.3321F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 100).addBox(-0.3468F, -0.294F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 0.9636F, 0.4564F, -0.3576F, -0.0073F, 0.0005F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 26).addBox(-0.3468F, 1.4677F, -1.2621F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.1F, 0.9636F, 0.4564F, -0.0958F, -0.0073F, 0.0005F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(24, 31).addBox(-0.5F, -0.4447F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 18.1888F, -2.5424F, -1.0036F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5267F, 8.3523F, 0.7405F, 0.0873F, 0.3927F, 0.0F));

		PartDefinition cube_r92 = toe2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(98, 53).addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r93 = toe2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 23).addBox(0.5F, 0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(17, 24).addBox(-1.5F, -1.0F, -3.85F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6358F, 0.5498F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -0.5F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4893F, -3.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(93, 19).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(70, 105).addBox(0.0F, -0.7056F, 0.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6914F, 6.5701F, -0.4548F, 0.276F, -0.1325F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 104).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 106).addBox(0.0F, -0.594F, 0.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3337F, 1.7626F, 0.1189F, 0.3034F, 0.0357F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 101).addBox(-0.5F, -0.4415F, -0.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0268F, 1.0231F, 0.264F, 0.1264F, 0.0341F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(40, 102).addBox(0.0F, -2.2822F, 0.4707F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 18).addBox(0.0F, -2.1822F, -3.7293F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, -0.0096F, -0.066F, -1.2764F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, -0.0413F, -0.0523F, -0.752F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, -0.0256F, -0.0421F, -0.2069F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, 1.2592F, 0.0633F, -0.0055F, -0.4448F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(100, 33).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, 1.2592F, -0.0132F, -0.0187F, -0.8839F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(71, 22).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, 1.2592F, -0.002F, -0.0228F, -1.4076F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(96, 101).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 43).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 101).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(69, 14).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, -0.0046F, -0.0664F, -1.425F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(95, 87).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, -0.0372F, -0.0552F, -0.9005F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, -0.0235F, -0.0467F, -0.3553F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, -0.0599F, -0.0493F, -0.2578F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, -0.067F, -0.0763F, -0.8028F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(21, 16).mirror().addBox(-8.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, -0.0198F, -0.0995F, -1.3279F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(71, 22).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, 1.2592F, -0.002F, 0.0228F, 1.4076F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(100, 33).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, 1.2592F, -0.0132F, 0.0187F, 0.8839F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(10, 105).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, 1.2592F, 0.0633F, 0.0055F, 0.4448F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(69, 14).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, -0.0046F, 0.0664F, 1.425F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(95, 87).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, -0.0372F, 0.0552F, 0.9005F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(82, 14).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, -0.0235F, 0.0467F, 0.3553F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(81, 37).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, -0.0256F, 0.0421F, 0.2069F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(79, 53).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, -0.0413F, 0.0523F, 0.752F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(68, 68).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, -0.0096F, 0.066F, 1.2764F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(44, 74).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, -0.0599F, 0.0493F, 0.2578F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(26, 44).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, -0.067F, 0.0763F, 0.8028F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(21, 16).addBox(2.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, -0.0198F, 0.0995F, 1.3279F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(46, 43).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 101).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 101).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -0.0506F, -2.0332F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0702F, -5.8129F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(75, 104).addBox(0.0F, -2.6468F, -1.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(103, 104).addBox(0.0F, -2.2008F, -1.0624F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(95, 104).addBox(0.0F, -1.7924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2345F, -6.6273F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(92, 104).addBox(0.0F, -2.3924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(100, 20).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 105).mirror().addBox(-0.9336F, -0.0313F, -0.4845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -4.1408F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(99, 44).mirror().addBox(-2.7823F, -0.5106F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -4.1408F, 0.0114F, -0.0564F, -0.8782F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(42, 95).mirror().addBox(-0.0562F, -5.1858F, -0.0701F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9996F, 8.4153F, -2.5645F, -0.9962F, 0.7648F, -1.2966F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(17, 93).mirror().addBox(0.5437F, -5.1858F, -0.0701F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 9.2862F, -2.0795F, -1.1058F, 0.5064F, -1.4793F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(0.2437F, -6.1858F, -0.0701F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 9.2862F, -2.0795F, -1.2304F, 0.2611F, -1.5783F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(41, 79).mirror().addBox(-0.4563F, -7.5858F, -0.0701F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 9.2862F, -2.0795F, -1.3519F, 0.2514F, -1.576F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(41, 68).mirror().addBox(-0.6562F, -9.6858F, 0.0299F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2958F, 9.937F, -1.8334F, -1.4545F, 0.2153F, -1.5711F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(-0.5F, -2.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.043F, 8.1678F, -3.7626F, -0.2763F, 1.2312F, -0.3422F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-0.5954F, -1.5216F, -1.011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.309F, 10.291F, -2.9809F, 0.3658F, 0.5367F, 0.1934F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-1.0486F, -1.5406F, -1.1768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.309F, 10.291F, -2.9809F, 0.4781F, 0.9571F, 0.3716F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-0.1562F, -4.8858F, -1.4701F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7695F, 11.1657F, -1.0986F, 1.0323F, 0.8958F, 1.0843F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(98, 49).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6308F, 14.4237F, 1.1276F, 1.9745F, 0.6571F, 1.4902F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-0.2F, -0.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6308F, 14.4237F, 1.1276F, 1.9321F, 0.4951F, 1.4126F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-0.8F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(35, 88).mirror().addBox(-0.4F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8335F, 13.8557F, -0.0359F, 1.3004F, 0.6836F, 1.115F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(94, 41).mirror().addBox(-0.8F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7196F, 12.5404F, -1.1547F, 1.1841F, 0.8113F, 1.1247F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(73, 93).mirror().addBox(-0.9362F, -1.5258F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6109F, 12.9628F, -2.0579F, 0.7339F, 0.877F, 0.5752F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(98, 61).mirror().addBox(-0.9154F, -1.7974F, -1.2609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7799F, 14.9468F, 1.2665F, 1.6798F, -0.0132F, 0.6919F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.363F, -1.497F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6109F, 12.9628F, -2.0579F, 0.5606F, 0.4948F, 0.2897F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-0.4F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7196F, 12.5404F, -1.1547F, 1.0257F, 1.0462F, 0.9286F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(66, 97).mirror().addBox(-0.9F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3911F, 14.8806F, -0.889F, 0.9268F, 0.2438F, 0.311F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-0.8204F, -0.3498F, -6.8018F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6846F, -6.2622F, 1.6996F, -0.0912F, -0.3767F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(78, 5).mirror().addBox(-0.311F, -0.6436F, -2.0153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6846F, -6.2622F, 1.7904F, -0.2153F, -0.1146F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(76, 101).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 74).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 68).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(89, 77).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0053F, 0.0376F, -1.3987F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(100, 18).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0234F, 0.0299F, -0.8748F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(98, 104).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.0725F, -0.0053F, -0.3313F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(47, 28).mirror().addBox(-6.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, 0.0038F, 0.0379F, -1.2941F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(100, 31).mirror().addBox(-2.9689F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, 0.0223F, 0.0309F, -0.7702F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(86, 58).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, 0.072F, -0.0038F, -0.2267F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(65, 101).mirror().addBox(-0.5F, -0.5869F, 0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 101).mirror().addBox(-0.5F, -0.5869F, -0.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.786F, -0.5404F, 0.1718F, -0.0624F, 0.1746F, 0.352F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.311F, -0.6987F, -4.8316F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6846F, -6.2622F, 1.2938F, -0.181F, 0.0143F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0142F, -0.3474F, -2.9035F, 0.172F, -0.005F, 0.3309F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(51, 83).mirror().addBox(-1.5768F, -0.6709F, 0.3293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4346F, -5.1622F, 0.161F, -0.4454F, -0.285F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(33, 39).mirror().addBox(-0.8204F, -0.5704F, -6.806F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6846F, -6.2622F, 1.8043F, -0.0912F, -0.3767F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(100, 93).mirror().addBox(-0.6391F, -1.051F, -0.5906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1862F, 15.5295F, 2.7079F, 2.0019F, 0.5432F, 1.3672F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(-0.3284F, -0.974F, -0.5034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1862F, 15.5295F, 2.7079F, 1.683F, 0.5334F, 0.6657F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8614F, 15.1456F, 0.5472F, 1.6902F, 0.4204F, 0.7423F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(76, 101).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 74).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 68).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(100, 20).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 105).addBox(-0.0664F, -0.0313F, -0.4845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -4.1408F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(99, 44).addBox(0.7823F, -0.5106F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -4.1408F, 0.0114F, 0.0564F, 0.8782F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(89, 77).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0053F, -0.0376F, 1.3987F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(100, 18).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0234F, -0.0299F, 0.8748F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(98, 104).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.0725F, 0.0053F, 0.3313F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(47, 28).addBox(2.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, 0.0038F, -0.0379F, 1.2941F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(100, 31).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, 0.0223F, -0.0309F, 0.7702F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(86, 58).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, 0.072F, 0.0038F, 0.2267F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(65, 101).addBox(-0.5F, -0.5869F, 0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 101).addBox(-0.5F, -0.5869F, -0.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.786F, -0.5404F, 0.1718F, -0.0624F, -0.1746F, -0.352F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 62).addBox(-0.689F, -0.6987F, -4.8316F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2F, 0.6846F, -6.2622F, 1.2938F, 0.181F, -0.0143F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0142F, -0.3474F, -2.9035F, 0.172F, 0.005F, -0.3309F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(78, 5).addBox(-0.689F, -0.6436F, -2.0153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.6846F, -6.2622F, 1.7904F, 0.2153F, 0.1146F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 83).addBox(0.5768F, -0.6709F, 0.3293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 7.4346F, -5.1622F, 0.161F, 0.4454F, 0.285F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(34, 24).addBox(-0.1796F, -0.3498F, -6.8018F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2F, 0.6846F, -6.2622F, 1.6996F, 0.0912F, 0.3767F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(33, 39).addBox(-0.1796F, -0.5704F, -6.806F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.6846F, -6.2622F, 1.8043F, 0.0912F, 0.3767F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(65, 104).addBox(-0.5F, -0.9524F, -0.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.9346F, 4.7378F, 1.3945F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(100, 93).addBox(-0.3609F, -1.051F, -0.5906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1862F, 15.5295F, 2.7079F, 2.0019F, -0.5432F, -1.3672F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 97).addBox(-0.6716F, -0.974F, -0.5034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1862F, 15.5295F, 2.7079F, 1.683F, -0.5334F, -0.6657F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(83, 97).addBox(-0.5F, -2.1348F, -0.0051F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.584F, 3.4736F, 1.4818F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -2.842F, -0.9783F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.9346F, 4.7378F, 1.2724F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(94, 79).addBox(-0.5F, -2.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.043F, 8.1678F, -3.7626F, -0.2763F, -1.2312F, 0.3422F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(42, 95).addBox(-0.9438F, -5.1858F, -0.0701F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9996F, 8.4153F, -2.5645F, -0.9962F, -0.7648F, 1.2966F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(17, 93).addBox(-1.5437F, -5.1858F, -0.0701F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 9.2862F, -2.0795F, -1.1058F, -0.5064F, 1.4793F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 89).addBox(-1.2437F, -6.1858F, -0.0701F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 9.2862F, -2.0795F, -1.2304F, -0.2611F, 1.5783F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(41, 79).addBox(-0.5437F, -7.5858F, -0.0701F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 9.2862F, -2.0795F, -1.3519F, -0.2514F, 1.576F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(41, 68).addBox(-0.3438F, -9.6858F, 0.0299F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2958F, 9.937F, -1.8334F, -1.4545F, -0.2153F, 1.5711F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(36, 76).addBox(-0.8438F, -4.8858F, -1.4701F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7695F, 11.1657F, -1.0986F, 1.0323F, -0.8958F, -1.0843F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(94, 8).addBox(0.0486F, -1.5406F, -1.1768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.309F, 10.291F, -2.9809F, 0.4781F, -0.9571F, -0.3716F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(25, 74).addBox(-2.809F, -1.4592F, -1.1219F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.309F, 10.291F, -2.9809F, 0.3124F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(78, 96).addBox(-0.4046F, -1.5216F, -1.011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.309F, 10.291F, -2.9809F, 0.3658F, -0.5367F, -0.1934F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(73, 93).addBox(-0.0638F, -1.5258F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6109F, 12.9628F, -2.0579F, 0.7339F, -0.877F, -0.5752F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(94, 41).addBox(-0.2F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7196F, 12.5404F, -1.1547F, 1.1841F, -0.8113F, -1.1247F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(94, 36).addBox(-0.6F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7196F, 12.5404F, -1.1547F, 1.0257F, -1.0462F, -0.9286F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(5, 97).addBox(-0.637F, -1.497F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6109F, 12.9628F, -2.0579F, 0.5606F, -0.4948F, -0.2897F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(9, 74).addBox(-2.2799F, -1.9622F, -2.6801F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7799F, 12.6468F, -0.3335F, 0.487F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(72, 39).addBox(-0.2F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(35, 88).addBox(-1.6F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8335F, 13.8557F, -0.0359F, 1.3004F, -0.6836F, -1.115F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 97).addBox(-0.1F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3911F, 14.8806F, -0.889F, 0.9268F, -0.2438F, -0.311F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 28).addBox(-2.2799F, -0.9974F, -1.879F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7799F, 13.9468F, -0.1335F, 0.8884F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(98, 61).addBox(-0.0846F, -1.7974F, -1.2609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.7799F, 14.9468F, 1.2665F, 1.6798F, 0.0132F, -0.6919F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(98, 49).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6308F, 14.4237F, 1.1276F, 1.9745F, -0.6571F, -1.4902F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 0).addBox(-0.8F, -0.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6308F, 14.4237F, 1.1276F, 1.9321F, -0.4951F, -1.4126F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(93, 97).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8614F, 15.1456F, 0.5472F, 1.6902F, -0.4204F, -0.7423F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(58, 84).addBox(-0.5F, -1.6461F, -0.0787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.3108F, 1.3988F, 1.7785F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(87, 5).addBox(-0.5F, -2.0461F, -0.0787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.1192F, -5.1588F, 0.1204F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(72, 84).addBox(-0.5F, -2.0461F, -0.0787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0563F, -4.6614F, 0.2513F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(65, 84).addBox(-0.5F, -2.0461F, -0.0787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.7066F, -3.5314F, 0.6004F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(84, 60).addBox(-0.5F, -2.0461F, -0.0787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.0731F, -2.0711F, 0.8186F, 0.0F, 0.0F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(89, 73).addBox(-0.5F, -1.0461F, -0.0787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.4654F, -1.1513F, 1.1676F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(89, 27).addBox(-0.5F, -1.0461F, -0.0787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.6408F, -0.1668F, 1.3945F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 10).addBox(-1.5F, 0.0631F, 0.0398F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.1269F, -0.4932F, 1.6476F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(71, 80).addBox(-1.5F, -0.36F, -0.5836F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4346F, -5.1622F, 0.4171F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(99, 36).addBox(-0.5F, -0.3205F, -0.6682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4346F, -5.1622F, 0.2426F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -1.3F, -5.9F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(56, 68).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.026F, 0.8657F, -5.4528F, 1.7515F, 0.2707F, 0.2717F));

		PartDefinition cube_r217 = leftArm1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(87, 37).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.0059F, -1.0265F, -1.154F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftArm1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(87, 10).addBox(0.0F, -1.7F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftArm1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(25, 96).addBox(0.0F, 0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.5059F, 4.2353F, -0.4475F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1392F, 6.992F, -0.7117F, -2.2923F, -0.3897F, -0.0257F));

		PartDefinition cube_r220 = leftArm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(35, 104).addBox(-0.5F, 0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 104).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 4.9912F, 0.2069F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftArm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(35, 96).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.05F, 2.4197F, 0.5912F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 104).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 104).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 0.1394F, 0.0913F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftArm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(30, 96).addBox(-0.5F, -1.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 1.1341F, 0.2348F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftArm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.05F, 2.4405F, -0.617F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftArm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(96, 13).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(86, 104).addBox(-0.5F, 3.45F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4193F, 6.6195F, -0.9465F, 1.0017F, -0.0692F, 0.0532F));

		PartDefinition cube_r226 = leftHand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(10, 89).addBox(0.0F, -0.8F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.75F, -0.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftHand.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(99, 76).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.452F, 1.5948F, 0.8182F, 0.3577F, 0.0495F, 0.0529F));

		PartDefinition cube_r228 = leftHand.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(101, 12).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(62, 77).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 2.4935F, 0.8102F, -0.0089F, 0.0495F, 0.0529F));

		PartDefinition cube_r229 = leftHand.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 2.0036F, 0.5274F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftHand.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(104, 8).addBox(-1.0F, 0.35F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(75, 65).addBox(-1.0F, -0.55F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftHand.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(56, 93).addBox(-1.0F, -0.35F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(68, 70).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.026F, 0.8657F, -5.4528F, 1.6206F, -0.2707F, -0.2717F));

		PartDefinition cube_r232 = rightArm1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(87, 80).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.0059F, -1.0265F, -1.154F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightArm1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(87, 42).addBox(-1.0F, -1.7F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightArm1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(45, 96).addBox(-1.0F, 0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5059F, 4.2353F, -0.4475F, -0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1392F, 6.992F, -0.7117F, -2.2923F, 0.3897F, 0.0257F));

		PartDefinition cube_r235 = rightArm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(43, 104).addBox(-0.5F, 0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 41).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 4.9912F, 0.2069F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightArm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(96, 68).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.05F, 2.4197F, 0.5912F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightArm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(104, 38).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 35).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.1394F, 0.0913F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(50, 96).addBox(-0.5F, -1.4F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 1.1341F, 0.2348F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightArm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(93, 51).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.05F, 2.4405F, -0.617F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(20, 96).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(89, 104).addBox(0.5F, 3.45F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4193F, 6.6195F, -0.9465F, 1.0017F, 0.0692F, -0.0532F));

		PartDefinition cube_r241 = rightHand.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(83, 104).addBox(0.0F, -0.8F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.75F, -0.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightHand.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(99, 80).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.452F, 1.5948F, 0.8182F, 0.3577F, -0.0495F, -0.0529F));

		PartDefinition cube_r243 = rightHand.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(101, 22).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(20, 101).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 2.4935F, 0.8102F, -0.0089F, -0.0495F, -0.0529F));

		PartDefinition cube_r244 = rightHand.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(99, 8).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 2.0036F, 0.5274F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightHand.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(15, 104).addBox(0.0F, 0.35F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(101, 15).addBox(0.0F, -0.55F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightHand.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(61, 93).addBox(0.0F, -0.35F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4237F, -6.7631F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(106, 11).addBox(0.0F, -2.6943F, -4.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 3).addBox(0.0F, -2.8943F, -2.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 0).addBox(-0.5F, -1.9943F, -5.1586F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.2F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(102, 87).mirror().addBox(-0.8982F, -1.4503F, -6.2308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 51).mirror().addBox(-1.0641F, -0.561F, -4.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4913F, 2.6223F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r249 = neck6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(102, 87).addBox(-0.1018F, -1.4503F, -6.2308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 51).addBox(0.0641F, -0.561F, -4.4471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4913F, 2.6223F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1759F, -4.0379F, -0.4456F, -0.1974F, 0.0934F));

		PartDefinition cube_r250 = neck5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(105, 92).addBox(0.0F, -1.5F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 89).addBox(0.0F, -1.5F, -4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-0.5F, -1.1F, -5.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, -0.1355F, -0.2595F, 0.035F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(36, 16).addBox(-1.0F, -2.0981F, -0.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -2.3F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(106, 22).addBox(0.0F, 1.9374F, 0.1433F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(106, 14).addBox(0.0F, -0.0626F, 0.0433F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(61, 62).addBox(-1.0F, 0.0773F, -1.9318F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5F, -1.2F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(100, 89).addBox(0.0F, 1.0061F, -0.9437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(61, 71).addBox(-1.0F, 0.9272F, -1.8396F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6269F, -1.8657F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(14, 84).addBox(0.0F, -1.4039F, -0.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 84).addBox(-1.0F, -0.1384F, 1.7138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.1F, 0.1162F, -0.4686F, -0.1694F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(49, 21).addBox(-3.0F, -0.0839F, -1.0609F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4893F, -0.6473F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(47, 24).addBox(-3.0F, 0.0161F, -1.9609F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.8912F, 0.0326F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(39, 52).addBox(-2.0F, -0.012F, -2.5658F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.7094F, -6.3158F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(35, 92).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3848F, -4.8965F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(50, 62).addBox(-1.5F, 0.988F, -1.9658F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(79, 85).addBox(-2.0F, -0.012F, -0.9658F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.6229F, -5.909F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 20).addBox(-2.0F, -0.012F, -0.9658F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.4216F, -5.3072F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(66, 52).addBox(-3.0F, -0.012F, -0.9658F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, -3.071F, -4.5468F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(65, 43).addBox(-3.0F, -0.012F, -0.9658F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.2532F, -3.5636F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(64, 5).addBox(-3.0F, -0.012F, -0.8658F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -2.9528F, -2.7152F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(18, 79).addBox(-1.5F, 1.988F, 0.2342F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(66, 55).addBox(-2.0F, -0.012F, 0.3342F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(65, 49).addBox(-3.0F, -1.012F, -0.6658F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.6614F, -3.8723F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(65, 46).addBox(-3.0F, -1.012F, -1.0658F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -1.2467F, -2.9623F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(49, 4).addBox(-3.0F, -0.012F, -0.2658F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -2.2F, -2.6F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(49, 0).addBox(-3.0F, -0.712F, -0.2658F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.2F, -2.6F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(52, 43).addBox(-2.0F, -3.2F, 0.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.8504F, -2.245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(86, 101).addBox(-0.5F, -3.0645F, -1.7738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.3F, -12.3F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, 0.0106F, 0.0163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.9155F, -14.264F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, 0.0106F, 0.0164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 4.7902F, -14.7489F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(102, 84).addBox(-0.5F, 0.0106F, 0.0164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.7561F, -15.0077F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(81, 101).addBox(-0.5F, 0.0106F, 0.0163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.7506F, -15.1122F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, 0.1087F, -2.1428F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 2.3746F, -11.5848F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(51, 8).addBox(-0.5F, 0.0343F, 0.0586F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0193F, -12.6496F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(95, 84).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 3.5188F, -13.3741F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(95, 65).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.2442F, -14.0625F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(21, 92).addBox(-1.0F, -2.1F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.2237F, -14.7635F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(95, 46).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(91, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.3663F, -12.5749F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(42, 91).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.8588F, -11.7133F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(91, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.2431F, -10.9253F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(66, 93).addBox(-0.5F, 0.0221F, -0.1319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1415F, -7.5315F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(79, 92).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 2.7582F, -4.2704F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(60, 103).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.1247F, -5.2008F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(103, 58).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 2.1846F, -6.3524F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(9, 79).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.0901F, -7.6486F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(72, 34).addBox(-0.5F, 0.0221F, -0.432F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.0F, 1.402F, -9.8055F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -7.1434F, -1.6146F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(78, 44).addBox(-0.5F, -0.4923F, 0.2249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.1721F, 8.7776F, -2.837F, 0.0698F, 0.0611F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(55, 103).addBox(-0.5F, -0.4412F, -0.4312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1721F, 8.7776F, -2.837F, 0.2269F, 0.0611F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(103, 52).addBox(-0.8177F, -0.3703F, -0.7849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1279F, 8.7776F, -3.137F, 0.0524F, 0.2356F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(65, 89).addBox(-0.8177F, -0.2872F, -2.4288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1279F, 8.7776F, -3.137F, -0.0698F, 0.2356F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 39).addBox(-0.6F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7F, 7.1775F, -4.7756F, 0.7712F, 0.1577F, 0.1514F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(70, 102).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(102, 65).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5804F, 6.0086F, -3.9775F, 1.0678F, 0.0531F, 0.1197F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(102, 46).addBox(-1.0F, -0.012F, -0.9658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 4.7218F, -3.6926F, 0.9562F, 0.2681F, 0.2936F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(101, 4).addBox(-0.5F, -3.3F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.2F, 8.9938F, -0.6304F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(10, 97).addBox(-0.5F, -3.6F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.2F, 8.9938F, -0.6304F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(28, 92).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 9.14F, 0.5607F, -0.1114F, 0.3471F, -0.038F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(58, 89).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 9.14F, 0.5607F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(86, 89).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2189F, 12.4397F, -9.4248F, 0.4396F, -0.1186F, -0.0556F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(103, 49).addBox(-1.0F, -0.7836F, -1.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, 10.5903F, -6.1888F, 0.48F, 0.1047F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(103, 28).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, 10.5903F, -6.1888F, 0.6981F, 0.1047F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(99, 40).addBox(-1.0F, -2.3124F, 1.1392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 10.5582F, -6.3032F, 0.5531F, 0.4758F, 0.3178F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(71, 16).addBox(-0.7F, -1.9806F, -1.1562F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 10.5582F, -6.3032F, 0.7009F, 0.2811F, 0.129F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(44, 86).addBox(-0.24F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 84).addBox(-0.55F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.41F, 7.0245F, -2.1698F, 0.2679F, 0.2106F, 0.0573F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -7.1434F, -1.6146F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-0.5F, -0.4923F, 0.2249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.1721F, 8.7776F, -2.837F, 0.0698F, -0.0611F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(55, 103).mirror().addBox(-0.5F, -0.4412F, -0.4312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1721F, 8.7776F, -2.837F, 0.2269F, -0.0611F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-0.1823F, -0.3703F, -0.7849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1279F, 8.7776F, -3.137F, 0.0524F, -0.2356F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.1823F, -0.2872F, -2.4288F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1279F, 8.7776F, -3.137F, -0.0698F, -0.2356F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-0.4F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 7.1775F, -4.7756F, 0.7712F, -0.1577F, -0.1514F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(102, 65).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5804F, 6.0086F, -3.9775F, 1.0678F, -0.0531F, -0.1197F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(102, 46).mirror().addBox(0.0F, -0.012F, -0.9658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.7218F, -3.6926F, 0.9562F, -0.2681F, -0.2936F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(101, 4).mirror().addBox(-0.5F, -3.3F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.9938F, -0.6304F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.5F, -3.6F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.9938F, -0.6304F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 9.14F, 0.5607F, -0.1114F, -0.3471F, 0.038F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 9.14F, 0.5607F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2189F, 12.4397F, -9.4248F, 0.4396F, 0.1186F, 0.0556F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(0.0F, -0.7836F, -1.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3F, 10.5903F, -6.1888F, 0.48F, -0.1047F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(103, 28).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3F, 10.5903F, -6.1888F, 0.6981F, -0.1047F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(99, 40).mirror().addBox(0.0F, -2.3124F, 1.1392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5F, 10.5582F, -6.3032F, 0.5531F, -0.4758F, -0.3178F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-0.3F, -1.9806F, -1.1562F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5F, 10.5582F, -6.3032F, 0.7009F, -0.2811F, -0.129F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(44, 86).mirror().addBox(-0.76F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 84).mirror().addBox(-0.45F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.41F, 7.0245F, -2.1698F, 0.2679F, -0.2106F, -0.0573F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.7583F, -0.0308F, 0.533F, 0.0F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-0.3913F, -0.2603F, -2.1004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, 2.2427F, -0.4189F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(72, 89).mirror().addBox(-0.3913F, 0.5369F, -0.6077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, 1.1519F, -0.4189F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(25, 101).mirror().addBox(-0.3913F, -0.1543F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.2007F, -0.4189F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(103, 97).mirror().addBox(-0.139F, 0.4102F, -2.1718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(103, 71).mirror().addBox(-0.139F, 0.4102F, -1.3718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -11.3596F, 0.288F, 0.0262F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(103, 55).mirror().addBox(-0.0959F, 0.9072F, -3.6626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -11.3596F, -0.1807F, -0.0352F, 0.0537F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 55).mirror().addBox(-0.3289F, 1.6215F, -3.6867F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -11.3596F, -0.4006F, -0.1052F, 0.063F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(49, 92).mirror().addBox(-0.139F, 0.1693F, -3.0788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -11.3596F, 0.1047F, 0.0262F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(103, 61).mirror().addBox(-0.139F, 0.2001F, -1.074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -11.3596F, 0.0785F, 0.0262F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(53, 78).mirror().addBox(-0.3099F, -0.4742F, -2.8907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -8.5596F, 0.2269F, -0.0611F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-0.3099F, 0.1385F, -3.0523F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6686F, -8.5596F, 0.1222F, -0.0611F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-0.4002F, -1.1092F, -5.2865F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.1065F, -0.0984F, 0.0359F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(93, 89).mirror().addBox(-0.4123F, -0.2822F, -3.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.0524F, -0.1047F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(0.1306F, -0.5635F, 0.8171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.2749F, -3.924F, -0.1473F, -0.1699F, 0.1255F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.2753F, 0.1456F, 2.112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.2749F, -3.924F, 0.1472F, 0.0027F, 0.1513F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(88, 47).mirror().addBox(0.3513F, -0.8104F, -0.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.2749F, -3.924F, -0.4067F, -0.3724F, 0.1812F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(86, 93).mirror().addBox(-0.4123F, -0.1531F, -1.8454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.1222F, -0.1047F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-0.4705F, -0.9903F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(51, 88).mirror().addBox(-0.4705F, -1.4903F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0906F, -0.6686F, -6.6596F, 2.9466F, -0.36F, 0.0382F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(55, 99).mirror().addBox(-0.4705F, -0.1637F, -0.7157F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0906F, -0.6686F, -6.6596F, -1.4865F, -0.36F, 0.0382F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(91, 101).mirror().addBox(-0.4002F, 4.0921F, -1.6559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -1.6075F, -0.0984F, 0.0359F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(104, 77).mirror().addBox(-0.4005F, -1.093F, -4.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.1674F, -0.0999F, 0.0316F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(-0.4123F, 0.0074F, -3.4488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(93, 93).mirror().addBox(-0.4123F, -0.7926F, -3.4488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.2531F, -0.1047F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(104, 80).mirror().addBox(-0.3F, -0.611F, -1.58F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 80).addBox(2.9F, -0.611F, -1.58F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(89, 69).mirror().addBox(-0.3913F, -0.8F, -0.7593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4238F, -1.6029F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(101, 25).addBox(-0.6087F, -0.2603F, -2.1004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, 2.2427F, 0.4189F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(72, 89).addBox(-0.6087F, 0.5369F, -0.6077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, 1.1519F, 0.4189F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(25, 101).addBox(-0.6087F, -0.1543F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -0.2007F, 0.4189F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(103, 97).addBox(-0.861F, 0.4102F, -2.1718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(103, 71).addBox(-0.861F, 0.4102F, -1.3718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -11.3596F, 0.288F, -0.0262F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(103, 55).addBox(-0.9041F, 0.9072F, -3.6626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -11.3596F, -0.1807F, 0.0352F, -0.0537F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(77, 55).addBox(-0.6711F, 1.6215F, -3.6867F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -11.3596F, -0.4006F, 0.1052F, -0.063F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(49, 92).addBox(-0.861F, 0.1693F, -3.0788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -11.3596F, 0.1047F, -0.0262F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(103, 61).addBox(-0.861F, 0.2001F, -1.074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -11.3596F, 0.0785F, -0.0262F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(53, 78).addBox(-0.6901F, -0.4742F, -2.8907F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -8.5596F, 0.2269F, 0.0611F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(44, 76).addBox(-0.6901F, 0.1385F, -3.0523F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4094F, -0.6686F, -8.5596F, 0.1222F, 0.0611F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(14, 88).addBox(-0.5998F, -1.1092F, -5.2865F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -0.1065F, 0.0984F, -0.0359F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(93, 89).addBox(-0.5877F, -0.2822F, -3.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -0.0524F, 0.1047F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(10, 93).addBox(-1.1306F, -0.5635F, 0.8171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.2749F, -3.924F, -0.1473F, 0.1699F, -0.1255F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 79).addBox(-0.7247F, 0.1456F, 2.112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.2749F, -3.924F, 0.1472F, -0.0027F, -0.1513F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(88, 47).addBox(-1.3514F, -0.8104F, -0.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.2749F, -3.924F, -0.4067F, 0.3724F, -0.1812F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(86, 93).addBox(-0.5877F, -0.1531F, -1.8454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -0.1222F, 0.1047F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(88, 65).addBox(-0.5295F, -0.9903F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(51, 88).addBox(-0.5295F, -1.4903F, -0.165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0906F, -0.6686F, -6.6596F, 2.9466F, 0.36F, -0.0382F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(55, 99).addBox(-0.5295F, -0.1637F, -0.7157F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0906F, -0.6686F, -6.6596F, -1.4865F, 0.36F, -0.0382F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(91, 101).addBox(-0.5998F, 4.0921F, -1.6559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -1.6075F, 0.0984F, -0.0359F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(104, 77).addBox(-0.5995F, -1.093F, -4.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -0.1674F, 0.0999F, -0.0316F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(94, 4).addBox(-0.5877F, 0.0074F, -3.4488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(93, 93).addBox(-0.5877F, -0.7926F, -3.4488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, -0.2531F, 0.1047F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(89, 69).addBox(-0.6087F, -0.8F, -0.7593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 0.4238F, -1.6029F, 0.0F, 0.4189F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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