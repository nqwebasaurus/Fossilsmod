package fossils.fossils.client.blockentity.model.struthiomimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StruthiomimusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public StruthiomimusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.5F, -2.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 32).addBox(0.0F, -0.8F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8051F, -0.5079F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8544F, 4.4469F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 67).addBox(0.0F, -2.0657F, -0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1348F, 4.3511F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.535F, -5.6095F, -5.2365F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 1.5555F, 0.0869F, -0.2126F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 61).mirror().addBox(0.4064F, -1.0731F, -4.2111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, -1.0411F, 0.5382F, -0.0525F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(-1.1002F, 5.2852F, 1.9697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(46, 63).mirror().addBox(-1.1002F, 4.5852F, 2.9697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 0.4932F, 0.1213F, -0.2214F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(-0.535F, -2.3129F, -5.7835F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 1.0755F, 0.0869F, -0.2126F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 53).mirror().addBox(-1.1002F, 0.0909F, 2.3385F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 0.6328F, 0.1213F, -0.2214F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(47, 19).mirror().addBox(-0.535F, -2.0511F, -2.0934F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 0.9359F, 0.0869F, -0.2126F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 60).mirror().addBox(0.9562F, -5.3804F, -3.4681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 0.1482F, 0.8392F, 0.222F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 31).mirror().addBox(-1.2342F, -5.5616F, -3.2572F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, 0.2338F, 0.3289F, 0.3127F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-2.9954F, -4.6333F, -1.8708F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, -0.0771F, 0.0409F, 0.618F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-1.2817F, -3.9781F, -1.4801F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, -0.2356F, 0.0F, 0.1309F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.3266F, -3.4029F, 0.8721F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, -0.0964F, -0.0121F, 0.4352F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 10).mirror().addBox(-3.3057F, -4.6212F, 1.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0183F, 2.7272F, -1.525F, -0.2662F, 0.009F, 0.7794F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 10).addBox(2.3057F, -4.6212F, 1.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, -0.2662F, -0.009F, -0.7794F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(1.3266F, -3.4029F, 0.8721F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, -0.0964F, 0.0121F, -0.4352F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 0).addBox(0.2817F, -3.9781F, -1.4801F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, -0.2356F, 0.0F, -0.1309F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 25).addBox(1.9954F, -4.6333F, -1.8708F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, -0.0771F, -0.0409F, -0.618F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 31).addBox(0.2342F, -5.5616F, -3.2572F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 0.2338F, -0.3289F, -0.3127F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(56, 61).addBox(-1.4064F, -1.0731F, -4.2111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, -1.0411F, -0.5382F, 0.0525F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 60).addBox(-1.9562F, -5.3804F, -3.4681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 0.1482F, -0.8392F, -0.222F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 8).addBox(-0.465F, -5.6095F, -5.2365F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 1.5555F, -0.0869F, 0.2126F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 32).addBox(-0.465F, -2.3129F, -5.7835F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 1.0755F, -0.0869F, 0.2126F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 19).addBox(-0.465F, -2.0511F, -2.0934F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 0.9359F, -0.0869F, 0.2126F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(56, 5).addBox(0.1002F, 5.2852F, 1.9697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(46, 63).addBox(0.1002F, 4.5852F, 2.9697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 0.4932F, -0.1213F, 0.2214F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 53).addBox(0.1002F, 0.0909F, 2.3385F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0183F, 2.7272F, -1.525F, 0.6328F, -0.1213F, 0.2214F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.3F, -4.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(51, 61).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6038F, 1.2632F, 0.029F, -1.0457F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, 0.0352F, -0.0236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(9, 8).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(5, 49).addBox(-0.9F, 2.9946F, -0.022F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.6052F, 1.9362F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 48).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 54).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1946F, 0.378F, -1.4399F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(38, 43).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9934F, -0.3088F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(10, 49).addBox(-2.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(59, 30).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6237F, 1.1126F, 0.0582F, -0.4696F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 53).addBox(-0.5F, 0.0352F, -0.0236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(9, 0).addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(0, 49).addBox(-0.1F, 2.9946F, -0.022F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.6052F, 1.9362F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 47).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 16).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1946F, 0.378F, -0.7873F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(25, 42).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9934F, -0.3088F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(19, 12).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 67).addBox(0.0F, -0.7F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 67).addBox(0.0F, -0.7F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(0.0F, -0.6F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 68).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3869F, -7.3207F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(28, 12).mirror().addBox(-3.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1887F, -1.3818F, -0.0147F, -0.2088F, -1.726F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1887F, -1.3818F, -0.156F, -0.0565F, -0.589F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1887F, -1.3818F, -0.1126F, -0.122F, -1.0665F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(35, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2887F, -3.3818F, 0.0082F, 0.003F, -0.4887F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 5).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2887F, -3.3818F, 0.0059F, 0.0064F, -0.9686F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(-3.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2887F, -3.3818F, 0.0008F, -0.0349F, -1.6232F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-4.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -5.3818F, 0.0084F, 0.052F, -1.4835F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -5.3818F, 0.065F, 0.0707F, -0.8267F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -5.3818F, 0.0902F, 0.0328F, -0.3476F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -7.3818F, 0.1231F, 0.0447F, -0.3114F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(62, 46).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -7.3818F, 0.0887F, 0.0964F, -0.7898F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 18).mirror().addBox(-5.0074F, -2.1238F, -0.4124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -7.3818F, 0.0114F, 0.0868F, -1.4484F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 57).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1887F, -1.3818F, -0.1126F, 0.122F, 1.0665F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(12, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1887F, -1.3818F, -0.156F, 0.0565F, 0.589F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 12).addBox(2.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1887F, -1.3818F, -0.0147F, 0.2088F, 1.726F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 49).addBox(2.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2887F, -3.3818F, 0.0008F, 0.0349F, 1.6232F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 5).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2887F, -3.3818F, 0.0059F, -0.0064F, 0.9686F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2887F, -3.3818F, 0.0082F, -0.003F, 0.4887F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -5.3818F, 0.0902F, -0.0328F, 0.3476F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 62).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -5.3818F, 0.065F, -0.0707F, 0.8267F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 42).addBox(2.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -5.3818F, 0.0084F, -0.052F, 1.4835F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(42, 18).addBox(2.0074F, -2.1238F, -0.4124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -7.3818F, 0.0114F, -0.0868F, 1.4484F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 46).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -7.3818F, 0.0887F, -0.0964F, 0.7898F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(50, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -7.3818F, 0.1231F, -0.0447F, 0.3114F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -2.9871F, -0.0996F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.4F, -9.2F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(12, 31).addBox(-1.0F, 0.0235F, -0.0471F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -8.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -8.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(29, 68).addBox(0.0F, -1.2F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 41).addBox(0.0F, -1.1F, -2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 68).addBox(0.0F, -1.0F, -4.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 68).addBox(0.0F, -0.9F, -6.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-0.5F, -0.4F, -6.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-6.0074F, -2.1238F, -0.4124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -0.3818F, 0.016F, 0.1389F, -1.4479F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 13).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -0.3818F, 0.1246F, 0.1348F, -0.7857F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -0.3818F, 0.1724F, 0.0624F, -0.3088F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 18).mirror().addBox(-5.0074F, -2.1238F, -0.4124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2113F, -2.3818F, 0.0207F, 0.1911F, -1.482F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 44).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2113F, -2.3818F, 0.1608F, 0.173F, -0.8151F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2113F, -2.3818F, 0.2219F, 0.0799F, -0.3402F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(63, 20).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4113F, -4.3818F, 0.2474F, 0.2612F, -0.8836F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4113F, -4.3818F, 0.3379F, 0.1201F, -0.4158F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(60, 40).mirror().addBox(-4.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4113F, -4.3818F, 0.0321F, 0.3128F, -1.5664F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 13).mirror().addBox(-4.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6113F, -6.3818F, 0.0561F, 0.5386F, -1.7484F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6113F, -6.3818F, 0.4205F, 0.4191F, -1.0176F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6113F, -6.3818F, 0.5564F, 0.1899F, -0.5739F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(50, 13).addBox(2.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6113F, -6.3818F, 0.0561F, -0.5386F, 1.7484F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(56, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6113F, -6.3818F, 0.5564F, -0.1899F, 0.5739F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 63).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6113F, -6.3818F, 0.4205F, -0.4191F, 1.0176F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(64, 50).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4113F, -4.3818F, 0.3379F, -0.1201F, 0.4158F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(63, 20).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4113F, -4.3818F, 0.2474F, -0.2612F, 0.8836F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(60, 40).addBox(2.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4113F, -4.3818F, 0.0321F, -0.3128F, 1.5664F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2113F, -2.3818F, 0.2219F, -0.0799F, 0.3402F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(63, 44).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2113F, -2.3818F, 0.1608F, -0.173F, 0.8151F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(30, 18).addBox(2.0074F, -2.1238F, -0.4124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2113F, -2.3818F, 0.0207F, -0.1911F, 1.482F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(64, 13).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -0.3818F, 0.1246F, -0.1348F, 0.7857F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(44, 38).addBox(2.0074F, -2.1238F, -0.4124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -0.3818F, 0.016F, -0.1389F, 1.4479F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(66, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -0.3818F, 0.1724F, -0.0624F, 0.3088F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(30, 23).addBox(-3.0F, -1.9737F, -2.9986F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9F, -0.3F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 42).mirror().addBox(-0.5F, -0.1452F, 0.393F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.4749F, -4.913F, -0.2487F, -0.4188F, 0.7142F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-0.5F, -0.1452F, -0.207F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.4749F, -4.913F, -0.135F, -0.8032F, 0.7511F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(55, 40).mirror().addBox(-0.5F, -0.1452F, -0.207F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.4749F, -4.913F, 0.1835F, -1.0782F, 0.6279F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-1.5F, -0.8F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 49).addBox(0.5F, -0.8F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5251F, -4.9361F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(0.0F, -1.032F, -2.0755F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4671F, -5.8185F, 0.799F, -0.4989F, -0.457F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(-0.5F, -1.032F, -0.0755F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(50, 45).addBox(4.5F, -1.032F, -0.0755F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.5F, 3.4671F, -5.8185F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-0.5F, 0.0594F, 0.0007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 8).addBox(4.5F, 0.0594F, 0.0007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.7671F, -4.2185F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(49, 40).mirror().addBox(-0.5F, 0.0594F, 0.1007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(49, 40).addBox(4.5F, 0.0594F, 0.1007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.5F, 0.7671F, -4.2185F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 30).addBox(-1.0F, -1.032F, -2.0755F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 3.4671F, -5.8185F, 0.799F, 0.4989F, 0.457F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(10, 42).addBox(-0.5F, -0.1452F, 0.393F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.4749F, -4.913F, -0.2487F, 0.4188F, -0.7142F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, -0.1452F, -0.207F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.4749F, -4.913F, -0.135F, 0.8032F, -0.7511F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(55, 40).addBox(-0.5F, -0.1452F, -0.207F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.4749F, -4.913F, 0.1835F, 1.0782F, -0.6279F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(45, 48).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0474F, 4.9395F, -5.9157F, 0.2437F, 0.7906F, -1.4185F));

		PartDefinition cube_r100 = leftArm1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(35, 62).addBox(0.0F, -2.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftArm1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 35).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(61, 25).addBox(-0.55F, -0.55F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0941F, 7.1353F, 0.0525F, -0.9167F, 0.0387F, -0.0202F));

		PartDefinition cube_r102 = leftArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(61, 15).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 59).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(30, 59).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(55, 35).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(32, 0).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 8).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 4.5F, -0.5F, 0.5691F, -0.1498F, 0.0196F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(40, 48).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0474F, 4.9395F, -5.9157F, 0.4094F, -0.9531F, 1.0091F));

		PartDefinition cube_r105 = rightArm1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(17, 42).addBox(-1.0F, -2.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightArm1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(12, 62).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(61, 0).addBox(-0.45F, -0.55F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0941F, 7.1353F, 0.0525F, -1.004F, -0.0387F, 0.0202F));

		PartDefinition cube_r107 = rightArm2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(7, 60).addBox(0.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightArm2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(42, 10).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightArm2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(25, 59).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(54, 25).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(24, 31).addBox(0.0F, 1.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 0).addBox(0.0F, 1.7F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.5F, 0.5254F, 0.1498F, -0.0196F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(36, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -6.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(9, 69).addBox(-0.5F, -1.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 69).addBox(-0.5F, -1.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = neck4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(62, 52).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -1.5818F, 0.4419F, 0.714F, -1.0317F));

		PartDefinition cube_r112 = neck4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(54, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -1.5818F, 0.7115F, 0.4463F, -0.5506F));

		PartDefinition cube_r113 = neck4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -3.5818F, 0.745F, 0.8267F, -0.74F));

		PartDefinition cube_r114 = neck4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(62, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -3.5818F, 0.745F, -0.8267F, 0.74F));

		PartDefinition cube_r115 = neck4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 52).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -1.5818F, 0.4419F, -0.714F, 1.0317F));

		PartDefinition cube_r116 = neck4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(54, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -1.5818F, 0.7115F, -0.4463F, 0.5506F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -5.7F, -0.6149F, -0.1071F, 0.0754F));

		PartDefinition cube_r117 = neck3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(17, 42).addBox(-1.0F, -1.0462F, -0.0047F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -2.2F, -4.4F, -0.6021F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -3.9F, -0.0439F, 0.0421F, -0.0113F));

		PartDefinition cube_r118 = neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.0145F, 0.058F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1F, -3.6F, -1.0559F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.7F, -3.8F, 0.3079F, 0.1248F, 0.0396F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 50).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.6F, -0.2793F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(66, 61).addBox(-0.3F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(66, 61).mirror().addBox(-0.7F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -2.7F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -0.8549F, -0.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(66, 0).addBox(0.24F, -0.8549F, -0.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.37F, 0.4926F, -1.5908F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 64).mirror().addBox(-0.5F, -0.134F, -0.123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 64).addBox(0.24F, -0.134F, -0.123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.37F, 0.0926F, -2.1908F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 65).mirror().addBox(-0.5F, -0.1233F, -0.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(60, 65).addBox(0.24F, -0.1233F, -0.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.37F, -0.6074F, -1.8908F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-0.5F, -0.1376F, -0.1527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(5, 65).addBox(0.24F, -0.1376F, -0.1527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.37F, -0.4648F, -0.457F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.07F)).mirror(false)
				.texOffs(67, 3).mirror().addBox(-0.56F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 3).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 67).addBox(0.34F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-0.47F, -0.2139F, -1.2532F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-0.5F, -0.1001F, -0.1386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(65, 22).addBox(0.24F, -0.1001F, -0.1386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.37F, -0.9074F, -1.0908F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-0.4F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(66, 25).addBox(0.14F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.37F, -0.1074F, -1.1908F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-1.0F, -0.9877F, -0.3513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(49, 66).addBox(-0.6F, -0.9877F, -0.3513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 0.6804F, -1.33F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-0.5F, -0.3022F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 64).mirror().addBox(-0.5F, -1.1022F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 30).mirror().addBox(-0.5F, -0.7022F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.51F, 0.0496F, -0.235F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(-1.0F, -0.0546F, -0.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(66, 15).addBox(-0.6F, -0.0546F, -0.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, -1.1F, -0.1F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(64, 54).mirror().addBox(-0.5F, -0.0144F, 0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(64, 54).addBox(-0.1F, -0.0144F, 0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, -1.0178F, -1.0941F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(66, 58).mirror().addBox(-1.0F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(66, 58).addBox(-0.6F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3F, -0.3F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(10, 66).mirror().addBox(-1.0F, -0.146F, -0.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(10, 66).addBox(-0.6F, -0.146F, -0.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, -1.1F, -0.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(54, 66).mirror().addBox(-1.0F, -0.11F, -0.9091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 66).addBox(-0.6F, -0.11F, -0.9091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3F, -1.1F, -1.6F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 65).addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.3178F, -1.2941F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-0.5F, 0.0198F, -0.9844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(40, 64).addBox(-0.1F, 0.0198F, -0.9844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, -0.7178F, -1.9941F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(13, 58).mirror().addBox(-0.5F, -0.2232F, -0.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(13, 58).addBox(0.1F, -0.2232F, -0.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.3F, 1.0676F, -2.9352F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 59).addBox(0.1F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.7676F, -2.1352F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-0.53F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(67, 9).mirror().addBox(-0.53F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6126F, -2.4594F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(66, 33).mirror().addBox(-0.53F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(36, 66).mirror().addBox(-0.53F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7662F, -2.183F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-0.9F, -0.0919F, -1.8415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(45, 58).addBox(-0.7F, -0.0919F, -1.8415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.3F, -0.5F, -2.2F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(44, 66).mirror().addBox(-1.0F, -0.2102F, -0.638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(44, 66).addBox(-0.8F, -0.2102F, -0.638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.9804F, -3.23F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(31, 66).mirror().addBox(-0.31F, -0.5223F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(22, 64).mirror().addBox(-0.31F, -0.7223F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.181F, -4.146F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(-1.0F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)).mirror(false)
				.texOffs(50, 55).addBox(-0.8F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4F, 1.3754F, -2.9356F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(58, 21).addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 1.9952F, -3.8849F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(38, 58).addBox(-0.1F, -0.1276F, -1.9953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.4F, 0.9804F, -3.23F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(22, 64).addBox(-0.69F, -0.7223F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(31, 66).addBox(-0.69F, -0.5223F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, 2.181F, -4.146F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 33).addBox(-0.47F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(36, 66).addBox(-0.47F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 0.7662F, -2.183F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(67, 6).addBox(-0.47F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(67, 9).addBox(-0.47F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 0.6126F, -2.4594F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(27, 64).addBox(-0.5F, -1.1022F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 30).addBox(-0.5F, -0.7022F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 38).addBox(-0.5F, -0.3022F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.51F, 0.0496F, -0.235F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(64, 30).mirror().addBox(-0.45F, -0.4651F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 30).mirror().addBox(-0.45F, -0.4651F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.31F, -0.9549F, -0.3833F, 0.0F, 0.1484F, 1.5708F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 30).addBox(-0.55F, -0.4651F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 30).addBox(-0.55F, -0.4651F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.31F, -0.9549F, -0.3833F, 0.0F, -0.1484F, -1.5708F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(55, 57).addBox(0.0F, -0.1457F, -1.4331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F))
				.texOffs(55, 57).mirror().addBox(-0.8F, -0.1457F, -1.4331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-0.2F, -0.3585F, -1.6534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.499F, -1.1231F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-1.0F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1543F, -0.1331F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-0.1F, -1.6659F, -3.3382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.499F, -1.1231F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-0.2F, -0.6443F, -3.1884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(57, 11).mirror().addBox(-0.3F, -0.6443F, -1.6884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 43).addBox(0.0F, -0.6443F, -3.1884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(57, 11).addBox(0.1F, -0.6443F, -1.6884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.3F, 0.499F, -1.1231F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(57, 48).addBox(-0.8F, -0.3585F, -1.6534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6F, 0.499F, -1.1231F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(57, 53).addBox(0.0F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1543F, -0.1331F, 0.2793F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 5.2F, 0.217F, -0.1298F, 0.0172F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -1.251F, -0.0406F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 7.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(20, 67).addBox(0.0F, -1.3294F, -0.0601F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(23, 67).addBox(0.0F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 67).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(37, 4).addBox(0.0F, 1.5F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 41).addBox(0.0F, 1.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 0).addBox(0.0F, -0.2F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 5).addBox(0.0F, -0.6F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4544F, -0.7531F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(50, 50).addBox(0.0F, -0.8041F, 6.0125F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 49).addBox(0.0F, -0.8041F, 8.0125F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.9F, 0.3169F, -0.2609F, -0.0296F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(32, 69).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 68).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 30).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(30, 23).addBox(0.0F, 4.8F, 18.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 31).addBox(0.0F, 4.6F, 16.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 31).addBox(0.0F, 4.2F, 14.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 12).addBox(0.0F, 3.5F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 0).addBox(0.0F, 2.0F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4544F, -9.6531F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(44, 23).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 42).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.9F, 0.4565F, -0.1081F, 0.0617F));

		PartDefinition cube_r164 = tail3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 29).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.9F, 0.4584F, -0.1677F, 0.0486F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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