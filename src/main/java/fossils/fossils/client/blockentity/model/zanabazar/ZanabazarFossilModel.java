package fossils.fossils.client.blockentity.model.zanabazar;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZanabazarFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart Neckend;
	private final ModelPart Neckend2;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightToes;
	private final ModelPart bone;
	private final ModelPart bone3;

	public ZanabazarFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.Neckend = this.neck2.getChild("Neckend");
		this.Neckend2 = this.Neckend.getChild("Neckend2");
		this.Head = this.Neckend2.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.leftArm1 = this.Bodyfront.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.Bodyfront.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.leftLeg1 = this.Hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.Hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.bone = this.Hips.getChild("bone");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -19.6F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.4386F, -3.6841F, -0.2993F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(8, 86).addBox(0.0F, -3.35F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 85).addBox(0.0F, -3.7F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 27).addBox(-0.5F, -2.8F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(30, 85).addBox(0.0F, -1.1F, -0.5018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -2.5158F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(58, 44).addBox(-0.5F, -0.1481F, -1.9527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7298F, -2.0647F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(46, 51).addBox(0.01F, -1.4785F, -2.9513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 65).addBox(0.01F, -1.4888F, -0.9461F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.1175F, -3.9538F, 0.0936F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0903F, 1.5917F, 0.0885F, 0.0974F, -0.6327F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 66).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0403F, -0.4083F, 0.075F, 0.1081F, -0.7638F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(81, 33).mirror().addBox(-1.8817F, -0.4515F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0403F, -0.4083F, 0.012F, 0.1541F, -1.237F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0403F, -2.4083F, 0.2247F, 0.1598F, -0.674F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 25).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0403F, -2.4083F, 0.1231F, 0.2676F, -1.1439F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(84, 77).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0903F, 1.5917F, 0.0885F, -0.0974F, 0.6327F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 66).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0403F, -0.4083F, 0.075F, -0.1081F, 0.7638F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(81, 33).addBox(0.8817F, -0.4515F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0403F, -0.4083F, 0.012F, -0.1541F, 1.237F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 85).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0403F, -2.4083F, 0.2247F, -0.1598F, 0.674F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 25).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0403F, -2.4083F, 0.1231F, -0.2676F, 1.1439F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(47, 20).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2057F, -5.4245F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(15, 27).addBox(-1.49F, -2.1454F, 0.664F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1775F, -4.3983F, -0.4102F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2726F, -2.9502F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(49, 45).addBox(-0.99F, -2.0356F, 0.5484F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8049F, -3.6481F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 23).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2195F, -1.3833F, 0.1519F, 0.2673F, -1.135F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2195F, -1.3833F, 0.2497F, 0.1471F, -0.6689F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2195F, -1.3833F, -0.0115F, 0.3064F, -1.6983F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1195F, -3.3833F, 0.3819F, 0.1953F, -0.5746F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 14).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1195F, -3.3833F, 0.2521F, 0.3685F, -1.0319F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1195F, -3.3833F, 0.0154F, 0.443F, -1.6167F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(85, 22).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2195F, -1.3833F, -0.0115F, -0.3064F, 1.6983F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(36, 20).addBox(-0.49F, -2.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9265F, -2.3995F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 23).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2195F, -1.3833F, 0.1519F, -0.2673F, 1.135F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 24).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2195F, -1.3833F, 0.2497F, -0.1471F, 0.6689F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 20).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1195F, -3.3833F, 0.3819F, -0.1953F, 0.5746F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 14).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1195F, -3.3833F, 0.2521F, -0.3685F, 1.0319F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(68, 12).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1195F, -3.3833F, 0.0154F, -0.443F, 1.6167F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(36, 85).addBox(0.01F, -1.0513F, 0.0078F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5515F, -1.9343F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(85, 35).addBox(0.01F, -1.35F, 2.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0765F, -6.2995F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0928F, -4.0258F, 0.1286F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(59, 12).addBox(0.01F, -1.65F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 56).addBox(0.01F, -1.5F, -3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-0.49F, -0.75F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3544F, -0.1136F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-2.1F, 0.0F, -0.375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 4.5773F, -1.1846F, 0.484F, -0.1412F, 0.2574F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-3.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0298F, 4.8032F, -0.2496F, 0.7704F, 0.8322F, 0.387F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1956F, -3.4522F, 0.4848F, 0.2238F, -0.5865F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1956F, -3.4522F, 0.3371F, 0.4381F, -1.0318F));

		PartDefinition cube_r27 = Bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1956F, -3.4522F, 0.0447F, 0.5444F, -1.6361F));

		PartDefinition cube_r28 = Bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 23).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0956F, -1.4522F, 0.38F, 0.1988F, -0.5226F));

		PartDefinition cube_r29 = Bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 17).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0956F, -1.4522F, 0.011F, 0.4432F, -1.5662F));

		PartDefinition cube_r30 = Bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0956F, -1.4522F, 0.2487F, 0.3709F, -0.9807F));

		PartDefinition cube_r31 = Bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(54, 15).mirror().addBox(-2.5F, -0.5F, -0.9F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0298F, 4.8032F, -0.2496F, 0.2409F, 0.6615F, -0.1064F));

		PartDefinition cube_r32 = Bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(85, 18).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1956F, -3.4522F, 0.4848F, -0.2238F, 0.5865F));

		PartDefinition cube_r33 = Bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 68).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1956F, -3.4522F, 0.3371F, -0.4381F, 1.0318F));

		PartDefinition cube_r34 = Bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 10).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1956F, -3.4522F, 0.0447F, -0.5444F, 1.6361F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 23).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0956F, -1.4522F, 0.38F, -0.1988F, 0.5226F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 17).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0956F, -1.4522F, 0.011F, -0.4432F, 1.5662F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 8).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0956F, -1.4522F, 0.2487F, -0.3709F, 0.9807F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(53, 63).addBox(-1.3398F, -0.0513F, -0.0283F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8498F, 4.1232F, -2.893F, 1.0626F, -0.0022F, -0.0375F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 29).addBox(0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0498F, 4.8032F, -0.2496F, 0.7704F, -0.8322F, -0.387F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 47).addBox(0.1F, 0.0F, -0.375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1419F, 4.5773F, -1.1846F, 0.484F, 0.1412F, -0.2574F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 15).addBox(-0.5F, -0.5F, -0.9F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0498F, 4.8032F, -0.2496F, 0.2409F, -0.6615F, 0.1064F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3776F, -4.7026F, -0.3504F, 0.112F, 0.0517F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(85, 53).addBox(0.01F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7626F, -0.4191F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neckbase.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(29, 57).addBox(-0.49F, -1.0987F, 1.4368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0065F, -3.5368F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckend_r1 = Neckbase.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(58, 66).mirror().addBox(-0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0925F, -0.7496F, -0.5073F, -0.298F, 0.0385F));

		PartDefinition Neckend_r2 = Neckbase.addOrReplaceChild("Neckend_r2", CubeListBuilder.create().texOffs(58, 66).addBox(0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0925F, -0.7496F, -0.5073F, 0.298F, -0.0385F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2899F, -1.865F, -0.5061F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(85, 38).addBox(0.01F, -0.882F, -1.2524F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(56, 0).addBox(-0.49F, -0.682F, -2.2524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1892F, 0.2374F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckend_r3 = neck.addOrReplaceChild("Neckend_r3", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.3213F, -0.9714F, -0.1476F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r4 = neck.addOrReplaceChild("Neckend_r4", CubeListBuilder.create().texOffs(0, 68).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.3213F, -0.9714F, -0.1476F, 0.1304F, 0.0115F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0313F, -1.828F, -0.5843F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r2 = Neckmiddle.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(9, 49).addBox(0.01F, -0.8329F, -0.4025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(56, 4).addBox(-0.49F, -0.6828F, -1.4025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2485F, -0.5597F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neckend_r5 = Neckmiddle.addOrReplaceChild("Neckend_r5", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-0.0008F, -0.3781F, -0.0003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4104F, -0.9493F, -0.0516F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r6 = Neckmiddle.addOrReplaceChild("Neckend_r6", CubeListBuilder.create().texOffs(39, 85).addBox(0.0008F, -0.3781F, -0.0003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4104F, -0.9493F, -0.0516F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3684F, -1.7889F, -0.2992F, 0.0803F, 0.1551F));

		PartDefinition cube_r42 = neck2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 86).addBox(0.01F, -0.725F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 85).addBox(0.01F, -0.725F, -2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0064F, -0.0747F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r7 = neck2.addOrReplaceChild("Neckend_r7", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.5235F, -0.9872F, 0.1927F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r8 = neck2.addOrReplaceChild("Neckend_r8", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.2786F, -2.5619F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r9 = neck2.addOrReplaceChild("Neckend_r9", CubeListBuilder.create().texOffs(42, 85).addBox(0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.5235F, -0.9872F, 0.1927F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r10 = neck2.addOrReplaceChild("Neckend_r10", CubeListBuilder.create().texOffs(85, 41).addBox(0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.2786F, -2.5619F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck2.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.0315F, -2.5258F, 0.6859F, -0.243F, 0.3158F));

		PartDefinition Neckend_r11 = Neckend.addOrReplaceChild("Neckend_r11", CubeListBuilder.create().texOffs(85, 47).addBox(0.0F, -0.8987F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(22, 57).addBox(-0.5F, -0.5987F, 0.8668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.9935F, -2.7351F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Neckend_r12 = Neckend.addOrReplaceChild("Neckend_r12", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(0.0F, -0.4097F, 0.0006F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8314F, -1.877F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r13 = Neckend.addOrReplaceChild("Neckend_r13", CubeListBuilder.create().texOffs(85, 44).addBox(0.0F, -0.4097F, 0.0006F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8314F, -1.877F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition Neckend2 = Neckend.addOrReplaceChild("Neckend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4602F, -1.8099F, 0.5298F, 0.225F, 0.2256F));

		PartDefinition Neckend_r14 = Neckend2.addOrReplaceChild("Neckend_r14", CubeListBuilder.create().texOffs(85, 85).addBox(0.0F, -1.0487F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(49, 50).addBox(-0.5F, -0.5987F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0406F, -2.6469F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Neckend_r15 = Neckend2.addOrReplaceChild("Neckend_r15", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(0.0F, -0.4097F, 0.0006F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8785F, -1.7888F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r16 = Neckend2.addOrReplaceChild("Neckend_r16", CubeListBuilder.create().texOffs(85, 82).addBox(0.0F, -0.4097F, 0.0006F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8785F, -1.7888F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition Head = Neckend2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7489F, -2.4678F, 0.6402F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(75, 26).addBox(-0.2F, -0.5911F, -0.253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3F, -0.7936F, -0.4747F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(63, 20).addBox(-1.5F, -0.0161F, -0.678F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.7936F, -0.4747F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(7, 57).addBox(-1.5F, -1.8961F, -1.0246F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.4064F, -1.3747F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(63, 17).addBox(-1.5F, -0.0127F, 0.0068F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.5245F, -1.3137F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(43, 31).addBox(-1.5F, -0.3377F, -0.9932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.2064F, -0.2747F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(75, 23).addBox(-0.5F, -0.1604F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(75, 20).addBox(-0.5F, -0.1604F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.8936F, -2.0747F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(63, 5).addBox(-1.5F, 0.0F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -1.2487F, -0.7293F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(30, 76).addBox(-1.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 1.877F, -8.8007F, -1.4923F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(76, 29).addBox(-1.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.3766F, -8.4696F, -0.5847F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(25, 76).addBox(-1.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.0197F, -7.7536F, 0.4625F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(75, 73).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6532F, -6.8232F, 0.3752F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(59, 8).addBox(-1.5F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -0.0122F, -5.0435F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(75, 70).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3868F, -4.1163F, 0.384F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(64, 75).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.6777F, -3.5916F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(63, 27).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1003F, -2.6853F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(0, 59).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3759F, -1.724F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(58, 52).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.3759F, -1.724F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(58, 63).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5273F, -2.5854F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(56, 55).addBox(-1.0F, -1.3F, -0.175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.806F, -2.566F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create().texOffs(5, 80).addBox(0.1F, 0.1826F, -2.9736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 80).addBox(0.1F, -0.4243F, -3.584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(5, 80).mirror().addBox(-1.1F, 0.1826F, -2.9736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 80).mirror().addBox(-1.1F, -0.4243F, -3.584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8199F, -0.3533F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.5F, -0.2279F, -0.1924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 74).addBox(0.7F, -0.2279F, -0.1924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.3495F, -1.4813F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(-0.5F, -0.5F, -0.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(50, 31).addBox(0.7F, -0.5F, -0.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.6F, 0.4154F, -2.7986F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-0.19F, -0.2318F, -1.2791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, -0.2094F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(80, 35).mirror().addBox(-0.24F, -0.7801F, -5.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(80, 68).mirror().addBox(-0.24F, -0.9551F, -2.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 60).mirror().addBox(-0.24F, -0.9551F, -2.6352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 57).mirror().addBox(-0.24F, -0.9551F, -3.2352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 54).mirror().addBox(-0.24F, -0.9801F, -3.8352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 47).mirror().addBox(-0.24F, -0.9801F, -4.4352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 44).mirror().addBox(-0.24F, -0.9551F, -5.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 24).mirror().addBox(-0.24F, -0.7801F, -4.7352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(36, 60).mirror().addBox(-0.24F, -0.7801F, -4.2352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, 0.1396F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(-0.24F, -0.2203F, -4.2701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, 0.0F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-0.19F, -0.6038F, -2.7677F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, 0.1309F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-0.19F, -0.9283F, -2.7751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(20, 80).mirror().addBox(-0.19F, -0.9283F, -1.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, 0.2182F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(80, 15).mirror().addBox(-0.19F, -0.8825F, -0.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, 0.1134F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(15, 74).addBox(0.7F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6F, -0.0147F, -2.9507F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(10, 74).addBox(0.688F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.594F, -0.3838F, -2.0473F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(5, 74).addBox(0.7F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6F, -0.3794F, -1.4513F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-0.5F, 0.2F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(85, 12).mirror().addBox(-0.5F, -0.2F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 15).addBox(0.7F, 0.2F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(85, 12).addBox(0.7F, -0.2F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.1353F, -0.2972F, 1.3439F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(80, 41).mirror().addBox(-0.62F, -0.551F, -1.7462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 38).mirror().addBox(-0.62F, -0.551F, -2.1462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 41).addBox(0.82F, -0.551F, -1.7462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 38).addBox(0.82F, -0.551F, -2.1462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 0.599F, -1.6345F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(73, 67).mirror().addBox(-0.31F, -0.3868F, -0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, 0.0175F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.19F, -0.2936F, -0.7403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 0.4653F, -3.3821F, -0.1004F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.5F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 12).addBox(0.7F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.9835F, -2.7774F, -0.0131F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 80).addBox(0.7F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.7034F, -1.0107F, -1.2479F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-0.5F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 9).addBox(0.7F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.8537F, -1.5916F, -1.3177F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-0.5F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(54, 73).addBox(0.7F, -0.801F, -0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6F, 0.9835F, -2.1774F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Lowerjawbase.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(56, 19).mirror().addBox(-0.3222F, -0.6741F, -0.3641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7039F, -2.4478F, -0.1535F, -0.3134F, -0.0227F));

		PartDefinition cube_r44 = Lowerjawbase.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(-0.632F, -0.2829F, 0.9191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7039F, -2.4478F, 0.153F, -0.0547F, 0.0188F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-0.5F, -0.6299F, -1.0234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(73, 53).addBox(0.7F, -0.6299F, -1.0234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.6F, 0.299F, -0.0345F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.5F, -0.2029F, -0.1924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(80, 3).addBox(0.7F, -0.2029F, -0.1924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6F, -0.2699F, -0.8861F, -0.2574F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(80, 21).addBox(-0.81F, -0.2318F, -1.2791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, -0.2094F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(80, 35).addBox(-0.76F, -0.7801F, -5.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(80, 68).addBox(-0.76F, -0.9551F, -2.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 60).addBox(-0.76F, -0.9551F, -2.6352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 57).addBox(-0.76F, -0.9551F, -3.2352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 54).addBox(-0.76F, -0.9801F, -3.8352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 47).addBox(-0.76F, -0.9801F, -4.4352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 44).addBox(-0.76F, -0.9551F, -5.0352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 24).addBox(-0.76F, -0.7801F, -4.7352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(36, 60).addBox(-0.76F, -0.7801F, -4.2352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, 0.1396F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(56, 59).addBox(-0.76F, -0.2203F, -4.2701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, 0.0F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(59, 35).addBox(-0.81F, -0.6038F, -2.7677F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, 0.1309F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(59, 31).addBox(-0.81F, -0.9283F, -2.7751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F))
				.texOffs(20, 80).addBox(-0.81F, -0.9283F, -1.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, 0.2182F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(80, 15).addBox(-0.81F, -0.8825F, -0.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, 0.1134F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(73, 67).addBox(-0.69F, -0.3868F, -0.8012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, 0.0175F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(80, 18).addBox(-0.81F, -0.2936F, -0.7403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.91F, 0.4653F, -3.3821F, -0.1004F, 0.1222F, 0.0F));

		PartDefinition cube_r45 = Lowerjawbase.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6778F, -0.6741F, -0.3641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.7039F, -2.4478F, -0.1535F, 0.3134F, 0.0227F));

		PartDefinition cube_r46 = Lowerjawbase.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(28, 61).addBox(-0.368F, -0.2829F, 0.9191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.7039F, -2.4478F, 0.153F, 0.0547F, -0.0188F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.7936F, -0.4747F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(83, 63).addBox(-0.75F, -0.25F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 50).addBox(-0.75F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.673F, 2.6665F, -8.3155F, 0.925F, 0.1178F, 0.0F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(20, 83).addBox(-0.775F, -0.0795F, -5.6023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(70, 82).addBox(-0.875F, -0.1795F, -5.2023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 0.0524F, 0.1178F, 0.0F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(80, 82).addBox(-0.3F, -0.625F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6718F, 2.6121F, -4.7224F, 0.384F, 0.1178F, 0.0F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(70, 79).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.624F, 2.6361F, -5.1259F, 0.3316F, 0.1178F, 0.0F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(75, 82).addBox(-0.3F, -0.55F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 79).addBox(-0.3F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4893F, 2.9992F, -6.2641F, 0.2443F, 0.1178F, 0.0F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(5, 83).addBox(-0.35F, -0.65F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 0).addBox(-0.325F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3504F, 3.2076F, -7.4377F, 0.0436F, 0.1178F, 0.0F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(15, 83).addBox(-0.725F, -0.3649F, -4.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -2.8194F, 0.1745F, 0.1178F, 0.0F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(50, 82).addBox(-0.925F, -0.7649F, -4.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 0.1745F, 0.1178F, 0.0F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(14, 59).addBox(-1.025F, -1.1165F, -3.6022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 0.2443F, 0.1178F, 0.0F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(25, 79).addBox(-1.025F, -1.2418F, -1.5881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 0.3229F, 0.1178F, 0.0F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(39, 34).addBox(-0.525F, -0.3F, -3.45F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.749F, 0.7122F, -3.4195F, 0.3752F, 0.1178F, 0.0F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(40, 79).addBox(-0.85F, -0.15F, -1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(35, 79).addBox(-0.85F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(0.8608F, 1.6792F, -6.729F, 0.3752F, 0.1178F, 0.0F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(50, 36).addBox(-1.6638F, -0.4137F, -0.314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.453F, 0.3705F, -3.5216F, 0.4048F, -0.3419F, -0.2963F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(33, 40).addBox(-1.6818F, -0.4131F, -2.6309F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.453F, 0.3705F, -3.5216F, 0.4097F, 0.2564F, -0.0364F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.749F, 0.7122F, -3.4195F, 0.5061F, 0.1178F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(69, 75).addBox(-1.025F, -1.0156F, -0.9255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 0.0262F, 0.1178F, 0.0F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(40, 73).addBox(-0.665F, -2.9029F, 0.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F))
				.texOffs(35, 73).addBox(-0.665F, -3.2029F, 0.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F))
				.texOffs(30, 73).addBox(-0.665F, -3.5029F, 0.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 1.8937F, 0.1178F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(60, 72).addBox(-0.665F, -3.8531F, 0.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F))
				.texOffs(0, 72).addBox(-0.665F, -5.2585F, 0.3394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3496F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 1.8239F, 0.1178F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(65, 72).addBox(-0.665F, -3.3466F, 1.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 2.2777F, 0.1178F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(73, 8).addBox(-0.665F, 1.3032F, 2.3684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.343F))
				.texOffs(71, 30).addBox(-0.665F, 1.8755F, 3.6617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -2.5831F, 0.1178F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(25, 73).addBox(-0.665F, 0.6006F, 2.189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -2.8449F, 0.1178F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(70, 72).addBox(-0.665F, 1.2072F, 2.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -2.618F, 0.1178F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(73, 0).addBox(-0.665F, 2.238F, -0.2989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.343F))
				.texOffs(70, 50).addBox(-0.665F, 4.0465F, 0.294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -1.7104F, 0.1178F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(49, 72).addBox(-0.665F, -3.7076F, -3.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 0.8203F, 0.1178F, 0.0F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(71, 33).addBox(-0.665F, -3.667F, 3.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, 2.522F, 0.1178F, 0.0F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(70, 64).addBox(-0.8F, 0.6211F, -0.6113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -2.2122F, 0.1178F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(55, 70).addBox(-0.8F, 0.5061F, -1.2596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -1.4094F, 0.1178F, 0.0F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(70, 61).addBox(-0.8F, 0.4844F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(70, 58).addBox(-0.8F, 1.0594F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -1.1126F, 0.1178F, 0.0F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(70, 47).addBox(-0.8F, -0.012F, -2.3568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -0.5192F, 0.1178F, 0.0F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(45, 66).addBox(-0.8F, -0.3802F, -1.8344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -1.1476F, 0.1178F, 0.0F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(35, 76).addBox(-0.4F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.93F, 0.7804F, -3.1885F, -1.117F, 0.0F, 0.0F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(79, 76).addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.93F, -0.2591F, -0.6233F, -1.6624F, 0.0F, 0.0F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(75, 79).addBox(-0.5F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.93F, -0.1422F, -0.1629F, -1.8195F, 0.0F, 0.0F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(78, 0).addBox(-0.4F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.93F, -0.1366F, -1.6055F, -1.7235F, 0.0F, 0.0F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(0, 78).addBox(-0.4F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.93F, 0.2081F, -1.4025F, -1.0385F, 0.0F, 0.0F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(20, 77).addBox(-0.4F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.93F, 0.7196F, -1.089F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(15, 77).addBox(-0.4F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.93F, 1.2992F, -1.2443F, 1.309F, 0.0F, 0.0F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(10, 77).addBox(-0.4F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.93F, 1.7907F, -1.5884F, 2.5307F, 0.0F, 0.0F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(5, 77).addBox(-0.4F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.93F, 1.869F, -2.1833F, -3.0107F, 0.0F, 0.0F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(74, 76).addBox(-0.4F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.93F, 1.7137F, -2.7629F, -1.8326F, 0.0F, 0.0F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(55, 78).addBox(-0.4F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.93F, 1.7202F, -2.8429F, -1.7279F, 0.0F, 0.0F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(60, 78).addBox(-0.4F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(78, 51).addBox(-0.4F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.93F, 1.7774F, -3.1374F, -1.3788F, 0.0F, 0.0F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(45, 78).addBox(-0.4F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.93F, 1.3696F, -3.2544F, -0.5061F, 0.0F, 0.0F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(50, 76).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.93F, 1.2959F, -2.8365F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(40, 76).addBox(-0.4F, -0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 32).addBox(-0.4F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.93F, 0.1108F, -2.8603F, -0.4625F, 0.0F, 0.0F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(78, 6).addBox(-0.62F, -0.1932F, -0.6421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(75, 17).addBox(-0.62F, -0.1932F, -0.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.15F, -0.1686F, -2.3382F, 0.48F, 0.0F, 0.0F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(44, 70).addBox(-0.435F, 0.0569F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(75, 14).addBox(-0.66F, 0.0569F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.93F, 0.8876F, -1.6188F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(78, 65).addBox(-0.4F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(75, 11).addBox(-0.4F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.97F, 1.7586F, -0.5059F, -1.5795F, 0.0F, 0.0F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(65, 78).addBox(-0.53F, -0.425F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(75, 3).addBox(-0.53F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1F, 1.1252F, -0.3597F, -1.7977F, 0.0F, 0.0F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(0, 75).addBox(-0.53F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.1F, 1.1252F, -0.3597F, -1.3614F, 0.0F, 0.0F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(68, 0).addBox(0.5F, -0.925F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.0F, 1.8086F, 0.1219F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(70, 44).addBox(-0.8F, 0.608F, -0.8724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.325F, 2.2161F, -3.0194F, -2.186F, 0.1178F, 0.0F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(5, 70).addBox(0.5F, -0.2161F, -0.778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.7936F, -0.4747F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(-0.25F, -0.25F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(83, 50).mirror().addBox(-0.25F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.673F, 2.6665F, -8.3155F, 0.925F, -0.1178F, 0.0F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.225F, -0.0795F, -5.6023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 82).mirror().addBox(-0.125F, -0.1795F, -5.2023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 0.0524F, -0.1178F, 0.0F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-0.7F, -0.625F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6718F, 2.6121F, -4.7224F, 0.384F, -0.1178F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(70, 79).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.624F, 2.6361F, -5.1259F, 0.3316F, -0.1178F, 0.0F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.7F, -0.55F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 79).mirror().addBox(-0.7F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4893F, 2.9992F, -6.2641F, 0.2443F, -0.1178F, 0.0F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.65F, -0.65F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 0).mirror().addBox(-0.675F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3504F, 3.2076F, -7.4377F, 0.0436F, -0.1178F, 0.0F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.275F, -0.3649F, -4.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -2.8194F, 0.1745F, -0.1178F, 0.0F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.075F, -0.7649F, -4.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 0.1745F, -0.1178F, 0.0F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(0.025F, -1.1165F, -3.6022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 0.2443F, -0.1178F, 0.0F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(0.025F, -1.2418F, -1.5881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 0.3229F, -0.1178F, 0.0F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(39, 34).mirror().addBox(-0.475F, -0.3F, -3.45F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.749F, 0.7122F, -3.4195F, 0.3752F, -0.1178F, 0.0F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.15F, -0.15F, -1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(35, 79).mirror().addBox(-0.15F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)).mirror(false), PartPose.offsetAndRotation(-0.8608F, 1.6792F, -6.729F, 0.3752F, -0.1178F, 0.0F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(50, 36).mirror().addBox(-0.3362F, -0.4137F, -0.314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.453F, 0.3705F, -3.5216F, 0.4048F, 0.3419F, 0.2963F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(33, 40).mirror().addBox(-0.3182F, -0.4131F, -2.6309F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.453F, 0.3705F, -3.5216F, 0.4097F, -0.2564F, 0.0364F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.749F, 0.7122F, -3.4195F, 0.5061F, -0.1178F, 0.0F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(0.025F, -1.0156F, -0.9255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 0.0262F, -0.1178F, 0.0F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.335F, -2.9029F, 0.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false)
				.texOffs(35, 73).mirror().addBox(-0.335F, -3.2029F, 0.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false)
				.texOffs(30, 73).mirror().addBox(-0.335F, -3.5029F, 0.4795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 1.8937F, -0.1178F, 0.0F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(60, 72).mirror().addBox(-0.335F, -3.8531F, 0.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false)
				.texOffs(0, 72).mirror().addBox(-0.335F, -5.2585F, 0.3394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3496F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 1.8239F, -0.1178F, 0.0F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(65, 72).mirror().addBox(-0.335F, -3.3466F, 1.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 2.2777F, -0.1178F, 0.0F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-0.335F, 1.3032F, 2.3684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.343F)).mirror(false)
				.texOffs(71, 30).mirror().addBox(-0.335F, 1.8755F, 3.6617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -2.5831F, -0.1178F, 0.0F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-0.335F, 0.6006F, 2.189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -2.8449F, -0.1178F, 0.0F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.335F, 1.2072F, 2.135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -2.618F, -0.1178F, 0.0F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.335F, 2.238F, -0.2989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.343F)).mirror(false)
				.texOffs(70, 50).mirror().addBox(-0.335F, 4.0465F, 0.294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -1.7104F, -0.1178F, 0.0F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(49, 72).mirror().addBox(-0.335F, -3.7076F, -3.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 0.8203F, -0.1178F, 0.0F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(71, 33).mirror().addBox(-0.335F, -3.667F, 3.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, 2.522F, -0.1178F, 0.0F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-0.2F, 0.6211F, -0.6113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -2.2122F, -0.1178F, 0.0F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(-0.2F, 0.5061F, -1.2596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -1.4094F, -0.1178F, 0.0F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(70, 61).mirror().addBox(-0.2F, 0.4844F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(70, 58).mirror().addBox(-0.2F, 1.0594F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -1.1126F, -0.1178F, 0.0F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(70, 47).mirror().addBox(-0.2F, -0.012F, -2.3568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -0.5192F, -0.1178F, 0.0F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(45, 66).mirror().addBox(-0.2F, -0.3802F, -1.8344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -1.1476F, -0.1178F, 0.0F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.6F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 0.7804F, -3.1885F, -1.117F, 0.0F, 0.0F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -0.2591F, -0.6233F, -1.6624F, 0.0F, 0.0F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(75, 79).mirror().addBox(-0.5F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -0.1422F, -0.1629F, -1.8195F, 0.0F, 0.0F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.6F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.93F, -0.1366F, -1.6055F, -1.7235F, 0.0F, 0.0F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.6F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 0.2081F, -1.4025F, -1.0385F, 0.0F, 0.0F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.6F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 0.7196F, -1.089F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.6F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.2992F, -1.2443F, 1.309F, 0.0F, 0.0F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.6F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.7907F, -1.5884F, 2.5307F, 0.0F, 0.0F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.6F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.869F, -2.1833F, -3.0107F, 0.0F, 0.0F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-0.6F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.7137F, -2.7629F, -1.8326F, 0.0F, 0.0F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(55, 78).mirror().addBox(-0.6F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.7202F, -2.8429F, -1.7279F, 0.0F, 0.0F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(60, 78).mirror().addBox(-0.6F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(78, 51).mirror().addBox(-0.6F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.7774F, -3.1374F, -1.3788F, 0.0F, 0.0F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.6F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.3696F, -3.2544F, -0.5061F, 0.0F, 0.0F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 1.2959F, -2.8365F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-0.6F, -0.05F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 32).mirror().addBox(-0.6F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 0.1108F, -2.8603F, -0.4625F, 0.0F, 0.0F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.38F, -0.1932F, -0.6421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(75, 17).mirror().addBox(-0.38F, -0.1932F, -0.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -0.1686F, -2.3382F, 0.48F, 0.0F, 0.0F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(44, 70).mirror().addBox(-0.565F, 0.0569F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(75, 14).mirror().addBox(-0.34F, 0.0569F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.93F, 0.8876F, -1.6188F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.6F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(75, 11).mirror().addBox(-0.6F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.97F, 1.7586F, -0.5059F, -1.5795F, 0.0F, 0.0F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(65, 78).mirror().addBox(-0.47F, -0.425F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(75, 3).mirror().addBox(-0.47F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1252F, -0.3597F, -1.7977F, 0.0F, 0.0F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.47F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1252F, -0.3597F, -1.3614F, 0.0F, 0.0F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-1.5F, -0.925F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8086F, 0.1219F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-0.2F, 0.608F, -0.8724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 2.2161F, -3.0194F, -2.186F, -0.1178F, 0.0F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-1.5F, -0.2161F, -0.778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftArm1 = Bodyfront.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(17, 51).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6217F, 2.0897F, -3.1411F, 0.2539F, 0.4127F, -0.4474F));

		PartDefinition cube_r47 = leftArm1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 30).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1029F, 5.0824F, -0.655F, -1.5756F, -0.4026F, 0.2376F));

		PartDefinition cube_r48 = leftArm2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(48, 61).addBox(-1.75F, -1.4982F, -0.968F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 3.35F, 0.5F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftArm2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(65, 44).addBox(-1.75F, -2.4F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.8646F, 0.7088F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftArm2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftArm2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 22).addBox(-0.5F, -0.5991F, -0.513F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(29, 52).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(36, 45).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(36, 53).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 4.5F, -0.5F, 0.7836F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(22, 45).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = Bodyfront.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(41, 51).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6017F, 2.0897F, -3.1411F, 0.1851F, -0.037F, 0.4149F));

		PartDefinition cube_r52 = rightArm1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 34).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1029F, 5.0824F, -0.655F, -1.3171F, 0.2071F, -0.0705F));

		PartDefinition cube_r53 = rightArm2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 63).addBox(0.75F, -1.4982F, -0.968F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 3.35F, 0.5F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightArm2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(65, 49).addBox(0.75F, -2.4F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 1.8646F, 0.7088F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightArm2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 12).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightArm2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(43, 61).addBox(-0.5F, -0.5991F, -0.513F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(0, 54).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(51, 0).addBox(0.0F, 1.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(54, 8).addBox(0.0F, 1.7F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.5F, 0.7836F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(29, 45).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.2197F, 1.7629F, -3.9964F));

		PartDefinition cube_r57 = bone2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0403F, -2.1142F, 5.0004F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bone2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(21, 61).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0403F, -1.9217F, 3.3113F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r59 = bone2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(58, 48).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0403F, -1.5538F, 1.6516F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(25, 82).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0403F, -1.2635F, 1.0146F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 52).addBox(-0.35F, 0.0F, -1.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8903F, -0.4872F, 0.9289F, 0.7232F, 0.7214F, 0.641F));

		PartDefinition cube_r62 = bone2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 36).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8903F, -0.4872F, 0.9289F, 0.5847F, 0.0F, 0.0F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.1997F, 1.7629F, -3.9964F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0403F, -2.1142F, 5.0004F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(21, 61).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0403F, -1.9217F, 3.3113F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0403F, -1.5538F, 1.6516F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0403F, -1.2635F, 1.0146F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-0.65F, 0.0F, -1.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8903F, -0.4872F, 0.9289F, 0.7232F, -0.7214F, -0.641F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(75, 36).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8903F, -0.4872F, 0.9289F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.9337F, 0.4519F, 0.1081F, 0.071F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(14, 86).addBox(0.0F, -0.4245F, 0.2185F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8698F, 4.2594F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(33, 85).addBox(0.0F, -0.4484F, -0.0979F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4698F, 2.3594F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(41, 45).addBox(0.0F, -0.1362F, -0.0641F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 0.1594F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(13, 34).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.1302F, -0.0406F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(13, 34).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1302F, -0.0406F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Bodyfront_r4 = Tailbase.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(85, 68).addBox(0.0F, 0.25F, 6.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 86).addBox(0.0F, 0.15F, 2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 59).addBox(0.0F, 0.2F, 4.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1581F, -2.7435F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 5.8363F, 0.2733F, 0.1261F, 0.0352F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(26, 34).mirror().addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1509F, 0.0886F, 0.0524F, 0.0523F, 0.0027F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(26, 34).addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1509F, 0.0886F, 0.0524F, -0.0523F, -0.0027F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(21, 10).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(79, 85).addBox(0.0F, 0.475F, 17.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 85).addBox(0.0F, 0.475F, 15.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 85).addBox(0.0F, 0.45F, 13.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0241F, -13.6156F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailmiddlebase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.112F, 5.0814F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailmiddlebase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(73, 85).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2866F, 3.0124F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailmiddlebase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(85, 71).addBox(0.0F, -0.35F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3937F, 0.8696F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1405F, 6.9912F, 0.3626F, 0.0816F, 0.0309F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0037F, 0.5038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tailmiddleend.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(85, 79).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0672F, 0.2775F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5347F, 8.931F, 0.1696F, -0.086F, -0.0147F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3105F, 8.969F, 0.3189F, -0.0769F, -0.0413F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2726F, 7.9543F, -0.1453F, -0.0873F, 0.0013F));

		PartDefinition Tailend_r3 = Tailend3.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(21, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = Hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(24, 65).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 0.7522F, -1.1159F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(75, 48).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9807F, -0.265F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(75, 45).addBox(-0.5F, -0.85F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2052F, -0.5638F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.4619F, 2.3812F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(75, 42).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.6812F, 1.3033F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.0368F, 0.5712F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(34, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.1458F, -0.08F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(68, 68).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(75, 39).addBox(-0.9F, -0.0054F, -0.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(7, 37).addBox(-0.9F, 0.9946F, -0.022F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 8.6176F, 2.796F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(17, 40).addBox(-0.5F, -2.5F, -0.8F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 84).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(55, 84).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6F, 1.0532F, 0.8149F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 82).addBox(-0.5F, -0.35F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(75, 62).addBox(-0.5F, -0.95F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 59).addBox(-0.5F, -0.35F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6F, 0.3765F, 0.4656F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 60).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.2001F, -0.0423F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(59, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4F, -0.0054F, -0.022F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -0.65F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(75, 56).addBox(-0.5F, -0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.6702F, -0.7593F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.2067F, -0.6088F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.212F, 0.1638F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.152F, -0.2773F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(45, 10).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.5672F, 0.3054F, 0.0F));

		PartDefinition cube_r82 = leftSickleClaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(63, 55).addBox(0.0F, -1.7F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, 0.4376F, -3.3478F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(0.5F, -0.9376F, -2.1522F));

		PartDefinition rightLeg1 = Hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(29, 65).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 0.7522F, -1.1159F, -1.1762F, 0.1042F, 0.0905F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(81, 27).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9807F, -0.265F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.85F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2052F, -0.5638F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 79).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.4619F, 2.3812F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.6812F, 1.3033F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.0368F, 0.5712F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.1458F, -0.08F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(10, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.2443F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(81, 30).addBox(-0.1F, -0.0054F, -0.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(12, 40).addBox(-0.1F, 0.9946F, -0.022F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 8.6176F, 2.796F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 40).addBox(-0.5F, -2.5F, -0.8F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 74).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(65, 84).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6F, 1.0532F, 0.8149F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 6).addBox(-0.5F, -0.35F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(65, 81).addBox(-0.5F, -0.95F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 81).addBox(-0.5F, -0.35F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6F, 0.3765F, 0.4656F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(65, 64).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 2.2001F, -0.0423F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4F, -0.0054F, -0.022F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -0.65F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(45, 81).addBox(-0.5F, -0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6702F, -0.7593F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(38, 10).addBox(-1.0F, -0.2067F, -0.6088F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.212F, 0.1638F, -1.8326F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(40, 5).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.152F, -0.2773F, 1.309F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(45, 15).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.9599F, -0.3054F, 0.0F));

		PartDefinition cube_r96 = rightSickleClaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(35, 64).addBox(0.0F, -1.7F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(43, 26).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.6222F, -2.8362F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(45, 84).addBox(-0.5F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9634F, 4.5206F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 25).addBox(-0.5F, -0.0682F, -0.0066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0554F, -2.5789F, 2.351F, -0.0175F, -0.0349F, 0.0F));

		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(61, 23).addBox(-0.5F, -0.5F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9456F, 3.3833F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(35, 82).addBox(-0.5F, -1.15F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5964F, -0.7141F, -0.2777F, 0.7679F, -0.2094F, 0.0F));

		PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(7, 61).addBox(-0.5F, -0.05F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4626F, -2.5468F, 0.3518F, 0.2182F, -0.2094F, 0.0F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 40).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6113F, -1.8075F, -0.3479F, 0.1047F, -0.2094F, 0.0F));

		PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(58, 40).addBox(-0.5F, -0.0682F, -2.2816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0035F, -2.5789F, 2.5445F, 0.0349F, -0.2094F, 0.0F));

		PartDefinition Basin_r1 = bone.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 1.823F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = bone.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(63, 68).addBox(-0.5F, -1.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2661F, 1.4651F, 0.8552F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = bone.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -2.425F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.4207F, 0.2935F, -1.405F, 0.0F, 0.0F));

		PartDefinition Basin_r4 = bone.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(50, 68).addBox(-0.5F, -2.525F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.6372F, -0.1996F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Basin_r5 = bone.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(85, 9).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0209F, 2.3705F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Basin_r6 = bone.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(19, 65).addBox(-0.4661F, -2.5421F, -0.3666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3335F, 3.1052F, -2.4112F, -0.211F, 0.2442F));

		PartDefinition Basin_r7 = bone.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(85, 3).addBox(-0.1616F, -2.3883F, 0.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 39).addBox(-0.1616F, -1.7883F, 0.0922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.961F, 1.6978F, 4.4649F, -1.5919F, -0.0402F, 0.0823F));

		PartDefinition Basin_r8 = bone.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(20, 70).addBox(-0.1616F, -1.7863F, -0.3137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.961F, 1.6978F, 4.4649F, -1.8537F, -0.0402F, 0.0823F));

		PartDefinition Basin_r9 = bone.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(5, 65).addBox(-0.5F, -2.175F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0347F, 0.711F, 2.998F, -2.6109F, -0.2601F, 0.1908F));

		PartDefinition Basin_r10 = bone.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(25, 70).addBox(-0.1173F, 2.563F, 1.1685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(70, 20).addBox(-0.1173F, 3.163F, 1.1685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8617F, 3.7866F, 1.3969F, -0.4162F, 0.0F, 0.1047F));

		PartDefinition Basin_r11 = bone.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(39, 70).addBox(-0.1173F, 2.3449F, -2.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(70, 38).addBox(-0.1173F, 2.8449F, -2.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8617F, 3.7866F, 1.3969F, 0.7357F, 0.0F, 0.1047F));

		PartDefinition Basin_r12 = bone.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(70, 41).addBox(-0.5F, -8.525F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0383F, 8.3321F, 1.562F, 0.2645F, 0.0F, 0.0F));

		PartDefinition Basin_r13 = bone.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(70, 27).addBox(-0.1173F, 3.4973F, -1.1744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.8617F, 3.7866F, 1.3969F, 0.2645F, 0.0F, 0.1047F));

		PartDefinition Basin_r14 = bone.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(40, 66).addBox(-0.1173F, 1.7338F, -0.2444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8617F, 3.7866F, 1.3969F, 0.0027F, 0.0F, 0.1047F));

		PartDefinition Basin_r15 = bone.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -1.2212F, -0.552F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0383F, 0.8866F, 1.3969F, -0.0323F, 0.0F, 0.1745F));

		PartDefinition Basin_r16 = bone.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(51, 55).addBox(-0.1173F, -0.2842F, -0.4487F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.8617F, 3.7866F, 1.3969F, 0.1074F, 0.0F, 0.1047F));

		PartDefinition Basin_r17 = bone.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(46, 55).addBox(-0.5F, -0.8893F, -0.7715F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0383F, 0.8866F, 1.3969F, 0.1074F, 0.0F, 0.1745F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.5598F, -3.184F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-0.5F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.901F, 4.8684F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(-0.5F, -0.0682F, -0.0066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0554F, -3.5165F, 2.6987F, -0.0175F, 0.0349F, 0.0F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(61, 23).mirror().addBox(-0.5F, -0.5F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8832F, 3.731F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.5F, -1.15F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5964F, -1.6516F, 0.0701F, 0.7679F, 0.2094F, 0.0F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(-0.5F, -0.05F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4626F, -3.4844F, 0.6996F, 0.2182F, 0.2094F, 0.0F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(49, 40).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6113F, -2.7451F, -0.0001F, 0.1047F, 0.2094F, 0.0F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(58, 40).mirror().addBox(-0.5F, -0.0682F, -2.2816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0035F, -3.5165F, 2.8922F, 0.0349F, 0.2094F, 0.0F));

		PartDefinition Basin_r18 = bone3.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9391F, 2.1707F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Basin_r19 = bone3.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(63, 68).mirror().addBox(-0.5F, -1.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2037F, 1.8129F, 0.8552F, 0.0F, 0.0F));

		PartDefinition Basin_r20 = bone3.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.5F, -2.425F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5169F, 0.6412F, -1.405F, 0.0F, 0.0F));

		PartDefinition Basin_r21 = bone3.addOrReplaceChild("Basin_r21", CubeListBuilder.create().texOffs(50, 68).mirror().addBox(-0.5F, -2.525F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3004F, 0.1481F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Basin_r22 = bone3.addOrReplaceChild("Basin_r22", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9167F, 2.7183F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Basin_r23 = bone3.addOrReplaceChild("Basin_r23", CubeListBuilder.create().texOffs(19, 65).mirror().addBox(-0.5339F, -2.5421F, -0.3666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6041F, 3.4529F, -2.4112F, 0.211F, -0.2442F));

		PartDefinition Basin_r24 = bone3.addOrReplaceChild("Basin_r24", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-0.8384F, -2.3883F, 0.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 39).mirror().addBox(-0.8384F, -1.7883F, 0.0922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.961F, 0.7603F, 4.8127F, -1.5919F, 0.0402F, -0.0823F));

		PartDefinition Basin_r25 = bone3.addOrReplaceChild("Basin_r25", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.8384F, -1.7863F, -0.3137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.961F, 0.7603F, 4.8127F, -1.8537F, 0.0402F, -0.0823F));

		PartDefinition Basin_r26 = bone3.addOrReplaceChild("Basin_r26", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-0.5F, -2.175F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0347F, -0.2266F, 3.3457F, -2.6109F, 0.2601F, -0.1908F));

		PartDefinition Basin_r27 = bone3.addOrReplaceChild("Basin_r27", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.8828F, 2.563F, 1.1685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(70, 20).mirror().addBox(-0.8828F, 3.163F, 1.1685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.8617F, 2.849F, 1.7446F, -0.4162F, 0.0F, -0.1047F));

		PartDefinition Basin_r28 = bone3.addOrReplaceChild("Basin_r28", CubeListBuilder.create().texOffs(39, 70).mirror().addBox(-0.8828F, 2.3449F, -2.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(70, 38).mirror().addBox(-0.8828F, 2.8449F, -2.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8617F, 2.849F, 1.7446F, 0.7357F, 0.0F, -0.1047F));

		PartDefinition Basin_r29 = bone3.addOrReplaceChild("Basin_r29", CubeListBuilder.create().texOffs(70, 41).mirror().addBox(-0.5F, -8.525F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0383F, 7.3945F, 1.9098F, 0.2645F, 0.0F, 0.0F));

		PartDefinition Basin_r30 = bone3.addOrReplaceChild("Basin_r30", CubeListBuilder.create().texOffs(70, 27).mirror().addBox(-0.8828F, 3.4973F, -1.1744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.8617F, 2.849F, 1.7446F, 0.2645F, 0.0F, -0.1047F));

		PartDefinition Basin_r31 = bone3.addOrReplaceChild("Basin_r31", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.8828F, 1.7338F, -0.2444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8617F, 2.849F, 1.7446F, 0.0027F, 0.0F, -0.1047F));

		PartDefinition Basin_r32 = bone3.addOrReplaceChild("Basin_r32", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5F, -1.2212F, -0.552F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0383F, -0.051F, 1.7446F, -0.0323F, 0.0F, -0.1745F));

		PartDefinition Basin_r33 = bone3.addOrReplaceChild("Basin_r33", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(-0.8828F, -0.2842F, -0.4487F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.8617F, 2.849F, 1.7446F, 0.1074F, 0.0F, -0.1047F));

		PartDefinition Basin_r34 = bone3.addOrReplaceChild("Basin_r34", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-0.5F, -0.8893F, -0.7715F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0383F, -0.051F, 1.7446F, 0.1074F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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