package fossils.fossils.client.blockentity.model.amargasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AmargasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neckBoneLeft1;
	private final ModelPart neckBoneRight1;
	private final ModelPart neck2;
	private final ModelPart neckBoneLeft2;
	private final ModelPart neckBoneRight2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart throat;

	public AmargasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neckBoneLeft1 = this.neck1.getChild("neckBoneLeft1");
		this.neckBoneRight1 = this.neck1.getChild("neckBoneRight1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neckBoneLeft2 = this.neck2.getChild("neckBoneLeft2");
		this.neckBoneRight2 = this.neck2.getChild("neckBoneRight2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
		this.bone6 = this.jaw.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -29.5F, 11.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(113, 99).mirror().addBox(-0.2498F, -1.4431F, 5.651F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 28).mirror().addBox(-0.2498F, -1.0431F, -0.349F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 3.867F, 1.9805F, -0.7156F, 0.0F, -0.5411F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5918F, 3.4662F, -1.5458F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 5.867F, -1.2195F, -0.4363F, 0.0F, -0.4363F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(111, 88).mirror().addBox(-0.5918F, -0.3239F, -0.9338F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 5.867F, -1.2195F, -0.6109F, 0.0F, -0.4363F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 89).mirror().addBox(0.0F, 2.5592F, -5.7653F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -0.933F, 0.3805F, 0.3927F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, -0.232F, -2.7649F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -0.933F, 0.3805F, -0.3229F, 0.0F, -0.1745F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.2055F, -5.0028F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -3.5921F, 3.9516F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 98).mirror().addBox(-0.5F, -0.5F, -6.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 77).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(80, 58).mirror().addBox(0.5F, -0.5F, -3.4F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.6921F, -0.0484F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 88).mirror().addBox(-0.5F, -0.347F, -5.8292F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -6.0921F, -0.3484F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-0.5F, -0.1456F, -2.8866F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -1.1921F, 5.5516F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 88).addBox(-0.5F, -0.347F, -5.8292F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -6.0921F, -0.3484F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.2055F, -5.0028F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -3.5921F, 3.9516F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(104, 44).addBox(-0.5F, -0.1456F, -2.8866F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -1.1921F, 5.5516F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 79).addBox(-0.4082F, 3.4662F, -1.5458F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 5.867F, -1.2195F, -0.4363F, 0.0F, 0.4363F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(111, 88).addBox(-0.4082F, -0.3239F, -0.9338F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 5.867F, -1.2195F, -0.6109F, 0.0F, 0.4363F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 89).addBox(-1.0F, 2.5592F, -5.7653F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -0.933F, 0.3805F, 0.3927F, 0.0F, 0.1745F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.232F, -2.7649F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5F, -0.933F, 0.3805F, -0.3229F, 0.0F, 0.1745F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(113, 99).addBox(-0.7502F, -1.4431F, 5.651F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 28).addBox(-0.7502F, -1.0431F, -0.349F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 3.867F, 1.9805F, -0.7156F, 0.0F, 0.5411F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 58).addBox(-3.5F, -0.5F, -3.4F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(52, 77).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(96, 98).addBox(-0.5F, -0.5F, -6.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.6921F, -0.0484F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 61).addBox(-1.5F, -0.1813F, 0.9724F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.602F, -6.5203F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(123, 5).addBox(-1.1679F, -1.45F, -0.8192F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.4896F, -3.8663F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(88, 84).mirror().addBox(0.7256F, -3.7159F, -1.5566F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.4896F, -3.8663F, -0.5429F, -0.409F, -0.8408F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(88, 84).addBox(-1.7256F, -3.7159F, -1.5566F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -5.4896F, -3.8663F, -0.5429F, 0.409F, 0.8408F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 84).addBox(-1.1679F, -5.8846F, -0.7782F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -5.4896F, -3.8663F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -3.3902F, -0.5288F, 1.0F, 12.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(118, 80).addBox(-1.5F, -3.6288F, 2.3296F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(118, 85).addBox(-1.5F, -3.6288F, 0.5296F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.1695F, 4.7285F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(138, 17).addBox(-1.0F, 0.3819F, 2.3879F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(21, 138).addBox(-1.0F, 0.3819F, 0.4879F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.1695F, 4.7285F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(138, 34).addBox(-1.0F, -6.4357F, -1.2401F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0695F, -0.0715F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(134, 138).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -6.598F, -3.5656F, -0.161F, 0.1252F, -0.1051F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(66, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -6.598F, -3.5656F, -0.0598F, 0.1947F, 0.51F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -6.598F, -3.5656F, 0.0642F, 0.143F, 1.706F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(134, 138).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -6.598F, -3.5656F, -0.161F, -0.1252F, 0.1051F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(66, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -6.598F, -3.5656F, -0.0598F, -0.1947F, -0.51F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(36, 73).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -6.598F, -3.5656F, 0.0642F, -0.143F, -1.706F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(118, 90).addBox(-1.5F, -10.4612F, -1.1353F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 100).addBox(-0.5F, -10.2226F, -2.1938F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.0695F, -0.0715F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(76, 102).addBox(-0.5F, -7.155F, -0.8486F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.0695F, -0.0715F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(75, 80).addBox(-1.1679F, -10.4121F, -0.8257F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(118, 95).addBox(-2.1679F, -10.8507F, 0.1328F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.4896F, -3.8663F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 138).addBox(-1.6679F, -6.8371F, 0.0245F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.4896F, -3.8663F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 0.45F, 0.4F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 98).addBox(-1.1F, -2.1399F, -8.566F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(47, 44).addBox(-2.1F, -1.1162F, -13.3177F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 55).addBox(-2.5F, -6.0068F, -15.1983F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3149F, 0.5895F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.3997F, -15.7619F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(13, 103).addBox(-2.5F, -4.9704F, -20.0489F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(62, 80).addBox(-2.5F, -4.6261F, -27.6329F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 79).addBox(0.1F, -2.3052F, -27.345F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.1833F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.703F, -9.3647F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 35).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(86, 0).addBox(-4.0F, -1.415F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg8.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(84, 48).addBox(-4.1915F, -3.5662F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, -0.01F, 0.1917F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 0.45F, 0.4F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 0).addBox(0.1F, -2.1399F, -8.566F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(46, 0).addBox(-0.9F, -1.1162F, -13.3177F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 95).addBox(-1.5F, -6.0068F, -15.1983F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3149F, 0.5895F, 0.3578F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.3997F, -15.7619F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 101).addBox(0.5F, -4.9704F, -20.0489F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -4.6261F, -27.6329F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(37, 77).addBox(-2.1F, -2.3052F, -27.345F, 2.0F, 1.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.9992F, 17.6566F, 0.1833F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offset(0.0F, 1.703F, -9.3647F));

		PartDefinition cube_r52 = rightLeg4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 35).addBox(-3.0F, -20.8973F, -19.9354F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(85, 20).addBox(-4.0F, -1.415F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7558F, 25.838F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg8.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 68).addBox(-3.8085F, -3.5662F, -30.0624F, 8.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9658F, 27.9074F, 0.0514F, 0.01F, -0.1917F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, 5.7F, -0.4396F, 0.1186F, -0.0556F));

		PartDefinition cube_r55 = tail1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(47, 89).addBox(-1.0F, 0.0F, 6.9F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(84, 37).addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.918F, 0.0389F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(129, 65).addBox(-0.5F, -4.7556F, -1.498F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.264F, 14.4441F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(125, 82).addBox(-1.5F, -1.5F, -0.4F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.714F, 14.6837F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 137).addBox(-1.0F, -0.8059F, -0.7747F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.364F, 14.2441F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 117).addBox(-0.5F, -2.1705F, -0.1278F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.064F, 12.8441F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(13, 11).addBox(-0.5F, 0.181F, -1.5476F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.3062F, 11.5432F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(139, 65).addBox(-1.0F, -0.4044F, -0.2954F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3062F, 11.5432F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(117, 71).addBox(-1.5F, -4.8301F, 0.7395F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3062F, 10.3432F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -4.6361F, -0.3171F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.3062F, 10.3432F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(11, 23).addBox(-0.5F, -4.6361F, -0.3171F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.1062F, 8.3432F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 77).addBox(-0.5F, 0.181F, -1.5476F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -5.1062F, 9.5432F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(32, 118).addBox(-1.5F, -4.7301F, 0.7395F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1062F, 8.3432F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(139, 68).addBox(-1.0F, -0.2044F, -0.2954F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1062F, 9.5432F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 80).addBox(-0.5F, 1.8464F, -2.0311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.8556F, 7.1335F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(139, 99).addBox(-1.0F, -0.6561F, -0.3969F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8556F, 7.1335F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(125, 86).addBox(-1.5F, -5.4017F, 0.3781F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8556F, 7.1335F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 54).addBox(-1.5F, -2.5017F, -0.5219F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8556F, 7.1335F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5766F, -1.5104F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.8556F, 7.1335F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(113, 65).addBox(-0.5F, -2.4536F, -0.0991F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.6556F, 6.8335F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(99, 113).addBox(-0.5F, -2.7268F, -0.2339F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.4556F, 5.9335F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, 1.3703F, -1.9865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.2778F, 4.1515F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(22, 23).addBox(-0.5F, -5.1478F, -1.7556F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.2778F, 4.1515F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(135, 132).addBox(0.0F, 3.6F, 6.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 136).addBox(0.0F, 2.0F, 4.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 136).addBox(0.0F, 0.5F, 2.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 132).addBox(0.0F, -0.8F, 0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1976F, 3.4352F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(63, 106).addBox(-0.5F, -1.0548F, -1.5116F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -5.2778F, 4.1515F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(118, 62).addBox(-1.5F, -5.3447F, -0.8022F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2778F, 4.1515F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(137, 111).addBox(-1.0F, -1.5261F, -0.4853F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2778F, 4.1515F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 104).addBox(-0.5F, -0.5766F, -1.5104F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -6.2492F, 0.6713F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -4.7049F, -1.5753F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.2492F, 0.6713F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(80, 118).addBox(-1.5F, -4.9017F, -0.6219F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2492F, 0.6713F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(121, 137).addBox(-1.0F, -1.0561F, -0.3969F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2492F, 0.6713F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(9, 92).addBox(-0.5F, 1.6817F, 7.6769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.2092F, -8.5771F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.918F, 12.9389F, 0.0884F, 0.1739F, 0.0077F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -2.563F, -0.1949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2418F, 11.6043F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(137, 137).addBox(-0.5F, -0.3009F, -0.1935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.2418F, 11.6043F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(137, 76).addBox(-1.0F, -2.7076F, 0.2713F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2418F, 11.6043F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(8, 63).addBox(-0.5F, -2.5476F, -0.2425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 10.2543F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(137, 80).addBox(-1.0F, -2.6922F, 0.2237F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 10.2543F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(134, 99).addBox(-0.5F, -0.3362F, -0.1581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 10.1543F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -2.5476F, -0.2425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0418F, 8.4543F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 125).addBox(-1.5F, -2.6922F, 0.2237F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0418F, 8.4543F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 12).addBox(-1.0F, 0.1252F, 0.2902F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0418F, 8.4543F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(111, 134).addBox(-0.5F, -0.3362F, -0.1581F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.0418F, 8.4543F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 135).addBox(-0.5F, -0.5623F, -0.257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.1128F, 6.5623F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 12).addBox(-1.0F, -0.1018F, 0.1933F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1128F, 6.5623F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(125, 61).addBox(-1.5F, -2.9385F, 0.2383F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1128F, 6.5623F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(9, 72).addBox(-0.5F, -2.7939F, -0.2279F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1128F, 6.5623F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(26, 72).addBox(-0.5F, -2.7939F, -0.2279F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9128F, 4.8623F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(125, 70).addBox(-1.5F, -2.9385F, 0.2383F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9128F, 4.8623F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.1018F, 0.1933F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9128F, 4.8623F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(125, 127).addBox(-0.5F, -0.5623F, -0.257F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.9128F, 4.8623F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 84).addBox(-0.5F, -2.7392F, -0.7076F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.596F, 3.1448F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(131, 136).addBox(0.0F, 8.9F, 12.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 138).addBox(0.0F, 11.6F, 14.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 82).addBox(0.0F, 7.1F, 10.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 132).addBox(0.0F, 4.9F, 8.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1157F, -9.5037F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(125, 78).addBox(-1.5F, -2.8838F, -0.2414F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.596F, 3.1448F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(139, 31).addBox(-1.0F, -0.8059F, -0.7747F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5459F, 3.2052F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 127).addBox(-0.5F, -2.1705F, -0.1278F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 1.8052F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(20, 70).addBox(-1.0F, -0.2F, -0.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6819F, -0.0333F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4181F, 10.8667F, 0.1736F, 0.0841F, 0.0339F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(62, 64).addBox(-1.0F, -0.1F, -0.2F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.6564F, 0.0794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(32, 136).addBox(-0.5F, -1.507F, -0.8119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 13.1376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(121, 132).addBox(-0.5F, -0.8009F, -0.1935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 12.0376F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(37, 136).addBox(-0.5F, -1.507F, -0.8119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 11.1376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(42, 133).addBox(-0.5F, -0.8009F, -0.1935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 10.0376F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(47, 136).addBox(-0.5F, -1.507F, -0.8119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 9.1376F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(134, 23).addBox(-0.5F, -0.8009F, -0.1935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 8.0376F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(134, 65).addBox(-0.5F, -1.3009F, -0.1935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 6.0376F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(136, 57).addBox(-0.5F, -1.707F, -0.7119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 7.1376F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 136).addBox(-0.5F, -1.707F, -0.7119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 5.4376F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(72, 134).addBox(-0.5F, -1.3009F, -0.1935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 4.3376F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(139, 24).addBox(-1.0F, -2.7076F, 0.2713F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 2.8376F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(112, 15).addBox(0.0F, 20.95F, 24.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 43).addBox(0.0F, 18.45F, 22.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 93).addBox(0.0F, 16.85F, 20.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 138).addBox(0.0F, 15.35F, 18.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 138).addBox(0.0F, 13.6F, 16.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6976F, -20.3704F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(87, 134).addBox(-0.5F, -1.3009F, -0.1935F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.6598F, 2.5376F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(116, 136).addBox(-0.5F, -2.563F, -0.1949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3598F, 2.8376F, -0.384F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.9152F, -0.277F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0564F, 12.7794F, 0.4216F, 0.3677F, 0.135F));

		PartDefinition cube_r125 = tail4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 106).addBox(0.0F, -0.607F, -0.0119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 113).addBox(0.0F, -5.607F, 9.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 118).addBox(0.0F, -4.407F, 7.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 139).addBox(0.0F, -3.307F, 5.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 139).addBox(0.0F, -2.407F, 3.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 117).addBox(0.0F, -1.607F, 1.9881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6034F, 3.1582F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(85, 58).addBox(0.0F, 6.3F, 10.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 100).addBox(0.0F, 4.4F, 8.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 102).addBox(0.0F, 3.5F, 6.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 104).addBox(0.0F, 2.4F, 4.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 106).addBox(0.0F, 1.6F, 2.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 90).addBox(0.0F, 0.3F, 0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 120).addBox(0.0F, -1.0F, -1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4162F, 2.8283F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5152F, 16.723F, 0.1415F, -0.0114F, 0.0465F));

		PartDefinition cube_r127 = tail5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(91, 98).addBox(0.0F, -11.7768F, 22.8511F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 98).addBox(0.0F, -10.9737F, 21.026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 100).addBox(0.0F, -10.1192F, 19.2884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 103).addBox(0.0F, -9.2161F, 17.4633F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 106).addBox(0.0F, -8.3616F, 15.7257F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 65).addBox(0.0F, -7.707F, 13.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 29).addBox(0.0F, -6.807F, 11.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0882F, -13.5648F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(23, 72).addBox(0.0F, 13.2919F, 22.2937F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 0).addBox(0.0F, 12.232F, 20.5976F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 79).addBox(0.0F, 11.1722F, 18.9015F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 79).addBox(0.0F, 10.1124F, 17.2054F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 68).addBox(0.0F, 9.0525F, 15.5093F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 48).addBox(0.0F, 7.9927F, 13.8132F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 20).addBox(0.0F, 6.9329F, 12.1171F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9314F, -13.8947F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3603F, 0.0752F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7397F, 13.5752F, 0.0099F, -0.1383F, 0.0638F));

		PartDefinition cube_r130 = tail6.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2767F, 0.0761F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail6.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(92, 79).addBox(0.0F, -15.007F, 29.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 55).addBox(0.0F, -14.107F, 27.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 17).addBox(0.0F, -12.4081F, 24.3474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 17).addBox(0.0F, -13.207F, 25.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8255F, -27.1184F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail6.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(44, 58).addBox(0.0F, 20.9517F, 33.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 63).addBox(0.0F, 19.8517F, 31.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 17).addBox(0.0F, 18.5517F, 29.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(0.0F, 17.2517F, 27.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 72).addBox(0.0F, 15.8517F, 25.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 72).addBox(0.0F, 14.4517F, 23.9898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1941F, -27.4482F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.4476F, -0.0306F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.0233F, 16.7761F, -0.4796F, -0.2865F, 0.0843F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5249F, -0.2583F, 1.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0524F, 18.9694F, -0.3155F, -0.2494F, 0.0804F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7F, -6.4F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(126, 139).addBox(-1.6679F, -5.0538F, 0.666F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -1.7896F, 0.3337F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 57).addBox(-1.6679F, -0.9711F, 0.3139F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.5896F, 1.7337F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(118, 105).addBox(-2.1679F, -4.9789F, 0.271F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(79, 123).addBox(-1.1679F, -4.7403F, -0.1875F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -6.5896F, 1.7337F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(93, 117).addBox(-1.1679F, -4.2273F, 0.2063F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6679F, -2.7896F, -0.1663F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(61, 123).addBox(-1.1679F, -4.078F, 0.8908F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -2.7896F, -0.1663F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(0.5617F, -3.638F, -1.3038F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -1.2896F, 0.1337F, -0.4692F, -0.33F, -0.8675F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(107, 51).mirror().addBox(-2.5959F, -1.2324F, -0.8765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.5896F, -0.7663F, -0.4339F, -0.2899F, -0.8782F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(109, 71).mirror().addBox(-2.5959F, -1.2324F, -0.8765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.7896F, -3.4663F, -0.4339F, -0.2899F, -0.8782F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(111, 32).mirror().addBox(-2.5959F, -1.2324F, -0.8765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -6.1896F, -6.4663F, -0.388F, -0.2359F, -0.8902F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 111).mirror().addBox(-1.7272F, -1.8404F, -1.2577F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.2628F, -8.9713F, -0.3434F, -0.1814F, -0.8994F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(108, 22).mirror().addBox(-1.7272F, -1.8404F, -1.2577F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6679F, -5.4628F, -11.0713F, -0.3434F, -0.1814F, -0.8994F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(86, 7).addBox(-1.5617F, -3.638F, -1.3038F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -1.2896F, 0.1337F, -0.4692F, 0.33F, 0.8675F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(116, 15).addBox(-1.1679F, -1.2101F, -0.621F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -1.2896F, 0.1337F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 35).addBox(-1.1679F, 2.7269F, -1.2846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.5896F, -0.7663F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(107, 51).addBox(1.5959F, -1.2324F, -0.8765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -5.5896F, -0.7663F, -0.4339F, 0.2899F, 0.8782F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(7, 118).addBox(-0.5F, -2.7128F, -0.6744F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.1553F, -0.673F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(17, 63).addBox(-0.5F, -2.6111F, -1.0982F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.1553F, -0.673F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(33, 123).addBox(-0.5F, -4.8621F, -0.2525F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(118, 115).addBox(-1.5F, -5.1007F, 0.206F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7553F, -0.873F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(10, 57).addBox(-1.0F, -1.0924F, 0.2479F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7553F, -0.873F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 140).addBox(-1.0F, -2.5257F, -0.4658F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1553F, -0.673F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(39, 118).addBox(-0.5F, -7.5118F, -1.4103F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(119, 0).addBox(-1.5F, -7.7504F, -0.9518F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0553F, -3.473F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(28, 122).addBox(-0.5F, -3.0243F, -0.6199F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.0553F, -3.473F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(119, 32).addBox(-0.5F, -2.9273F, -1.0985F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.0553F, -3.473F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(16, 119).addBox(-1.1679F, 2.7269F, -1.2846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.7896F, -3.4663F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(109, 71).addBox(1.5959F, -1.2324F, -0.8765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -5.7896F, -3.4663F, -0.4339F, 0.2899F, 0.8782F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(140, 0).addBox(-1.0F, -2.8416F, -0.4524F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0553F, -3.473F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(61, 29).addBox(-1.0F, -3.7318F, -0.933F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0553F, -3.473F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(119, 45).addBox(-1.1679F, 2.7269F, -1.2846F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -6.4663F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(111, 32).addBox(1.5959F, -1.2324F, -0.8765F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -6.4663F, -0.388F, 0.2359F, 0.8902F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 106).addBox(-1.1679F, -5.4927F, -0.239F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 119).addBox(-2.1679F, -5.7313F, 0.2195F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -6.4663F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(65, 138).addBox(-1.6679F, -1.723F, 0.2559F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -6.1896F, -6.4663F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(38, 111).addBox(0.7272F, -1.8404F, -1.2577F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -5.2628F, -8.9713F, -0.3434F, 0.1814F, 0.8994F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(122, 26).addBox(-1.1679F, 1.6032F, -1.368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.2628F, -8.9713F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(94, 106).addBox(-0.5F, -3.2667F, -0.4798F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -8.5823F, -8.5132F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(138, 84).addBox(-1.0F, 0.505F, 0.0345F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5823F, -8.5132F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(105, 119).addBox(-1.5F, -3.5053F, -0.0213F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5823F, -8.5132F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 120).addBox(-1.5F, -1.4F, 0.2F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.9952F, -10.5425F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(88, 112).addBox(-1.1679F, -6.729F, 0.4281F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6679F, -5.4628F, -11.4713F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(140, 9).addBox(-1.0F, 0.0066F, -0.0522F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3827F, -10.4574F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(26, 140).addBox(-1.0F, -1.0F, 0.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3827F, -10.5574F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 91).addBox(-1.1679F, -1.3631F, 0.1165F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.6679F, -5.4628F, -11.4713F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(108, 22).addBox(0.7272F, -1.8404F, -1.2577F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6679F, -5.4628F, -11.0713F, -0.3434F, 0.1814F, 0.8994F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(119, 53).addBox(-1.1679F, 1.6032F, -1.368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6679F, -5.4628F, -11.0713F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.298F, 0.6344F, 0.0524F, 0.0565F, 1.7048F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 138).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.298F, 0.6344F, -0.0734F, 0.1338F, -0.0938F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.298F, 0.6344F, 0.0172F, 0.1516F, 0.5233F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(63, 17).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.698F, -1.6656F, 0.013F, 0.1173F, 0.0916F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(92, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.698F, -1.6656F, 0.0781F, 0.0886F, 0.7051F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(9, 91).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.698F, -1.6656F, 0.0174F, -0.0234F, 1.8788F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.898F, -4.0656F, -0.0107F, -0.0873F, 1.9676F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(27, 103).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.898F, -4.0656F, 0.0818F, 0.1034F, 0.1864F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(104, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.898F, -4.0656F, 0.1262F, 0.0379F, 0.7955F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(24, 103).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.598F, -6.6656F, 0.1504F, 0.089F, 0.2105F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 98).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.598F, -6.6656F, -0.0391F, -0.1512F, 1.9885F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(95, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.598F, -6.6656F, 0.1742F, -0.0128F, 0.8135F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -9.2656F, -0.0535F, -0.1831F, 1.9908F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -9.2656F, 0.1982F, -0.0382F, 0.8129F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -9.2656F, 0.1847F, 0.0817F, 0.2134F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(7, 100).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -11.2656F, 0.1847F, 0.0817F, 0.2134F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(101, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -11.2656F, 0.1982F, -0.0382F, 0.8129F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.898F, -11.2656F, -0.0535F, -0.1831F, 1.9908F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(75, 44).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.298F, 0.6344F, 0.0524F, -0.0565F, -1.7048F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(69, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.298F, 0.6344F, 0.0172F, -0.1516F, -0.5233F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(57, 138).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.298F, 0.6344F, -0.0734F, -0.1338F, 0.0938F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(9, 91).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.698F, -1.6656F, 0.0174F, 0.0234F, -1.8788F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(63, 17).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.698F, -1.6656F, 0.013F, -0.1173F, -0.0916F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(92, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.698F, -1.6656F, 0.0781F, -0.0886F, -0.7051F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(98, 37).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.898F, -4.0656F, -0.0107F, 0.0873F, -1.9676F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(104, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.898F, -4.0656F, 0.1262F, -0.0379F, -0.7955F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(27, 103).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.898F, -4.0656F, 0.0818F, -0.1034F, -0.1864F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(95, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.598F, -6.6656F, 0.1742F, 0.0128F, -0.8135F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(56, 98).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.598F, -6.6656F, -0.0391F, 0.1512F, -1.9885F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(24, 103).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.598F, -6.6656F, 0.1504F, -0.089F, -0.2105F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(98, 75).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -9.2656F, -0.0535F, 0.1831F, -1.9908F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(98, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -9.2656F, 0.1982F, 0.0382F, -0.8129F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(35, 0).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -9.2656F, 0.1847F, -0.0817F, -0.2134F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(99, 27).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -11.2656F, -0.0535F, 0.1831F, -1.9908F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(101, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -11.2656F, 0.1982F, 0.0382F, -0.8129F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(7, 100).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -3.898F, -11.2656F, 0.1847F, -0.0817F, -0.2134F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, 0.0679F, -0.0311F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5164F, -13.9618F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(44, 35).addBox(-8.5F, -2.8612F, -5.183F, 17.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.5F, -7.2F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(22, 23).addBox(-7.5F, -2.931F, -8.1827F, 15.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.5F, 0.8F, 0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -13.6F, 0.0436F, 0.0436F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.1295F, -6.9144F, -0.3346F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -3.1007F, -0.167F, -0.1053F, 0.1264F, -0.0669F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -1.5741F, -0.4826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -1.5741F, -2.4826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(33, 108).mirror().addBox(-0.2698F, -6.6196F, -0.7374F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -3.1007F, -2.467F, -0.0177F, 0.1348F, -0.0554F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(95, 7).mirror().addBox(-0.2698F, -6.2196F, -0.6374F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -2.7007F, -8.267F, -0.0177F, 0.1348F, -0.0903F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-0.1362F, -2.7132F, -0.2585F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -2.7007F, -8.267F, 0.1449F, 0.0431F, -0.1429F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(24, 63).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -1.5741F, -5.1826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(18, 110).mirror().addBox(-0.2698F, -6.2196F, -0.6374F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -3.1007F, -5.167F, -0.0177F, 0.1348F, -0.0903F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(40, 104).mirror().addBox(-0.8F, -0.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4099F, -4.9925F, -0.1222F, 0.0F, 0.4014F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(79, 58).mirror().addBox(-0.7F, -0.4F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4099F, -7.4925F, -0.2182F, 0.0F, 0.2618F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -1.5741F, -8.1826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(-2.289F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4403F, -1.3741F, -10.6826F, 1.3132F, -0.3161F, 0.7149F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(44, 35).mirror().addBox(-0.1362F, -2.7132F, -0.2585F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -2.5007F, -10.767F, 0.1449F, 0.0431F, -0.1429F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(7, 125).mirror().addBox(-0.2698F, -6.2196F, -0.6374F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6226F, -2.5007F, -10.767F, -0.0177F, 0.1348F, -0.0903F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(15, 79).addBox(-0.8705F, -6.9144F, -0.3346F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -3.1007F, -0.167F, -0.1053F, -0.1264F, 0.0669F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(45, 20).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -0.4826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(113, 109).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -0.4826F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(54, 20).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -2.4826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(33, 108).addBox(-0.7302F, -6.6196F, -0.7374F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -3.1007F, -2.467F, -0.0177F, -0.1348F, 0.0554F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 114).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -2.4826F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(24, 63).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -5.1826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(40, 104).addBox(-0.2F, -0.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.4099F, -4.9925F, -0.1222F, 0.0F, -0.4014F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(114, 49).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -5.1826F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(18, 110).addBox(-0.7302F, -6.2196F, -0.6374F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -3.1007F, -5.167F, -0.0177F, -0.1348F, 0.0903F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(95, 7).addBox(-0.7302F, -6.2196F, -0.6374F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -2.7007F, -8.267F, -0.0177F, -0.1348F, 0.0903F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(22, 44).addBox(-0.8638F, -2.7132F, -0.2585F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6226F, -2.7007F, -8.267F, 0.1449F, -0.0431F, 0.1429F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(68, 52).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -8.1826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(79, 58).addBox(-0.3F, -0.4F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.4099F, -7.4925F, -0.2182F, 0.0F, -0.2618F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(50, 114).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -1.5741F, -8.1826F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(7, 125).addBox(-0.7302F, -6.2196F, -0.6374F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6226F, -2.5007F, -10.767F, -0.0177F, -0.1348F, 0.0903F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(44, 35).addBox(-0.8638F, -2.7132F, -0.2585F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6226F, -2.5007F, -10.767F, 0.1449F, -0.0431F, 0.1429F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(115, 20).addBox(-0.9403F, -1.3358F, -0.8099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4403F, -1.3741F, -10.6826F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(36, 70).addBox(-0.711F, -0.4982F, -0.2793F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4403F, -1.3741F, -10.6826F, 1.3132F, 0.3161F, -0.7149F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8725F, 17.7701F, -3.7886F, 0.5307F, -0.0848F, -1.0396F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(109, 121).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8725F, 17.7701F, -3.7886F, 0.5579F, -0.3091F, -1.1776F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(12, 121).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9725F, 17.4701F, -3.5886F, 0.6672F, -0.2654F, -1.259F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9725F, 17.4701F, -3.5886F, 0.6411F, -0.0572F, -1.0979F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(115, 36).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5725F, 16.9701F, -3.5886F, 0.608F, 0.1005F, -0.9462F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(121, 73).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5725F, 16.9701F, -3.5886F, 0.609F, -0.1147F, -1.0955F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4725F, 16.6701F, -4.0886F, 0.8135F, 0.0902F, -0.9017F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(113, 75).mirror().addBox(-0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4725F, 16.6701F, -4.0886F, 0.8135F, -0.0902F, -1.0917F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(111, 80).mirror().addBox(0.0F, 1.5F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8992F, 15.6025F, -8.7911F, 1.6114F, -0.4584F, -1.535F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(62, 116).mirror().addBox(-0.4484F, -4.962F, -0.2245F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7837F, 9.4429F, -11.3078F, -0.279F, -0.0904F, -1.1776F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(0.0F, -1.976F, -4.6969F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-9.3F, 9.6938F, -4.937F, 1.6461F, -0.2079F, -0.3124F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(0.0229F, -2.6347F, -3.9729F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 13.5938F, -7.937F, 1.3622F, -0.4131F, -0.958F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(0.0F, -4.7126F, -5.136F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3F, 9.6938F, -4.937F, 1.1574F, -0.2079F, -0.3124F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-0.5F, -1.8F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 23).addBox(16.5F, -1.8F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-8.5F, 6.1938F, -3.437F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(99, 106).mirror().addBox(-0.5F, -0.024F, -0.1894F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(99, 106).addBox(16.5F, -0.024F, -0.1894F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-8.5F, 2.2938F, -3.337F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-0.5F, -3.0053F, 0.1178F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 73).addBox(16.5F, -3.0053F, 0.1178F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, 4.1938F, -1.037F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(68, 44).addBox(-1.0F, -1.976F, -4.6969F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(9.3F, 9.6938F, -4.937F, 1.6461F, 0.2079F, 0.3124F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(86, 7).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8725F, 17.7701F, -3.7886F, 0.5307F, 0.0848F, 1.0396F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(17, 64).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9725F, 17.4701F, -3.5886F, 0.6411F, 0.0572F, 1.0979F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(115, 36).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5725F, 16.9701F, -3.5886F, 0.608F, -0.1005F, 0.9462F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 93).addBox(0.7025F, -0.5072F, 2.3298F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4725F, 16.6701F, -4.0886F, 0.8135F, -0.0902F, 0.9017F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(113, 75).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4725F, 16.6701F, -4.0886F, 0.8135F, 0.0902F, 1.0917F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(121, 73).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5725F, 16.9701F, -3.5886F, 0.609F, 0.1147F, 1.0955F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(12, 121).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9725F, 17.4701F, -3.5886F, 0.6672F, 0.2654F, 1.259F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(109, 121).addBox(0.075F, -0.5072F, -0.5589F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8725F, 17.7701F, -3.7886F, 0.5579F, 0.3091F, 1.1776F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(111, 80).addBox(-1.0F, 1.5F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8992F, 15.6025F, -8.7911F, 1.6114F, 0.4584F, 1.535F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(63, 61).addBox(-1.0229F, -2.6347F, -3.9729F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 13.5938F, -7.937F, 1.3622F, 0.4131F, 0.958F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.398F, -0.6656F, -0.0829F, -0.2467F, 1.9447F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(58, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.398F, -0.6656F, 0.2463F, -0.0888F, 0.7575F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.398F, -0.6656F, 0.2531F, 0.0667F, 0.1661F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(60, 98).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.398F, -2.6656F, 0.2531F, 0.0667F, 0.1487F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.398F, -2.6656F, -0.0829F, -0.2467F, 1.9273F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(55, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -2.398F, -2.6656F, 0.2463F, -0.0888F, 0.74F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.898F, -4.8656F, 0.2872F, 0.0591F, 0.0635F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(124, 31).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.898F, -4.8656F, 0.2706F, -0.114F, 0.6503F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(22, 53).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.898F, -4.8656F, -0.0979F, -0.2785F, 1.8439F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.698F, -7.8656F, -0.123F, -0.3624F, 1.8519F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(19, 124).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.698F, -7.8656F, 0.341F, -0.1666F, 0.6405F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.698F, -7.8656F, 0.3744F, 0.0534F, 0.0684F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(84, 123).mirror().addBox(-5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.698F, -10.8656F, 0.3744F, 0.0534F, 0.0684F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.698F, -10.8656F, -0.123F, -0.3624F, 1.8519F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(-1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -1.698F, -10.8656F, 0.341F, -0.1666F, 0.6405F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(24, 0).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.698F, -10.8656F, -0.123F, 0.3624F, -1.8519F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(84, 123).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.698F, -10.8656F, 0.3744F, -0.0534F, -0.0684F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(123, 120).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.698F, -10.8656F, 0.341F, 0.1666F, -0.6405F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(10, 100).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.698F, -7.8656F, 0.3744F, -0.0534F, -0.0684F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(19, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.698F, -7.8656F, 0.341F, 0.1666F, -0.6405F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(31, 0).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.698F, -7.8656F, -0.123F, 0.3624F, -1.8519F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(22, 53).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.898F, -4.8656F, -0.0979F, 0.2785F, -1.8439F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(124, 31).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.898F, -4.8656F, 0.2706F, 0.114F, -0.6503F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(38, 0).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -1.898F, -4.8656F, 0.2872F, -0.0591F, -0.0635F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(63, 61).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.398F, -2.6656F, -0.0829F, 0.2467F, -1.9273F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(55, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.398F, -2.6656F, 0.2463F, 0.0888F, -0.74F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(60, 98).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.398F, -2.6656F, 0.2531F, -0.0667F, -0.1487F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(68, 44).addBox(-0.019F, -0.1757F, -0.6464F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.398F, -0.6656F, -0.0829F, 0.2467F, -1.9447F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(30, 99).addBox(5.1536F, 4.4585F, -0.8235F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.398F, -0.6656F, 0.2531F, -0.0667F, -0.1661F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(58, 124).addBox(1.6383F, 0.6321F, -0.8208F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1661F, -2.398F, -0.6656F, 0.2463F, 0.0888F, -0.7575F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(74, 20).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4879F, -11.3723F, 0.0583F, 0.0F, 0.0F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(62, 116).addBox(-0.5516F, -4.962F, -0.2245F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7837F, 9.4429F, -11.3078F, -0.279F, 0.0904F, 1.1776F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, -4.7126F, -5.136F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3F, 9.6938F, -4.937F, 1.1574F, 0.2079F, 0.3124F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(25, 54).addBox(-1.5F, -22.0F, -19.75F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 20.7F, 9.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 16.5424F, -6.4629F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftArm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(61, 20).addBox(-1.0F, -0.769F, -4.1748F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftArm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(105, 102).addBox(1.4938F, -1.7202F, -2.0809F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 0.9622F, -0.1663F, 0.2596F));

		PartDefinition cube_r311 = leftArm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(64, 91).addBox(1.4938F, -2.4302F, -7.0105F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 1.4072F, -0.1663F, 0.2596F));

		PartDefinition cube_r312 = leftArm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(44, 44).addBox(-1.0F, -1.5524F, -8.5818F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6412F, -0.6964F, 0.7617F, 1.3439F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 7.2547F, -1.9204F, -0.4737F, -0.0287F, 0.0041F));

		PartDefinition cube_r313 = leftArm2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(58, 91).addBox(0.3113F, -1.5823F, -6.966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(95, 7).addBox(0.8113F, -1.5823F, -12.766F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.12F))
				.texOffs(17, 84).addBox(0.1113F, -0.0823F, -12.866F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2333F, -4.5355F, 2.3754F, 0.4591F, 1.3759F, -1.1041F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 7.9632F, -1.8005F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftArm3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(17, 72).addBox(6.4672F, -1.1391F, -14.3965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1271F, -12.3962F, 3.6332F, 1.4318F, 0.1059F, 0.6471F));

		PartDefinition cube_r315 = leftArm3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(105, 3).addBox(1.8F, -1.1502F, -16.8157F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(43, 98).addBox(-1.7F, -2.1502F, -16.8157F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(83, 106).addBox(-2.2F, -1.1502F, -16.8157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 16.5424F, -6.4629F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightArm.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -0.769F, -4.1748F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightArm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(105, 15).addBox(-2.4938F, -1.7202F, -2.0809F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 0.9622F, 0.1663F, -0.2596F));

		PartDefinition cube_r318 = rightArm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 91).addBox(-2.4938F, -2.4302F, -7.0105F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 1.4072F, 0.1663F, -0.2596F));

		PartDefinition cube_r319 = rightArm.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(22, 44).addBox(-2.0F, -1.5524F, -8.5818F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6412F, -0.6964F, 0.7617F, 1.3439F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 7.2547F, -1.9204F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightArm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(85, 27).addBox(-2.3113F, -1.5823F, -6.966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(73, 94).addBox(-1.8113F, -1.5823F, -12.766F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.12F))
				.texOffs(75, 83).addBox(-2.1113F, -0.0823F, -12.866F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2333F, -4.5355F, 2.3754F, 0.4591F, -1.3759F, 1.1041F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 7.9632F, -1.8005F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightArm3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 72).addBox(-7.4672F, -1.1391F, -14.3965F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1271F, -12.3962F, 3.6332F, 1.4318F, -0.1059F, -0.6471F));

		PartDefinition cube_r322 = rightArm3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(104, 94).addBox(-2.8F, -1.1502F, -16.8157F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(98, 37).addBox(-2.3F, -2.1502F, -16.8157F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(106, 59).addBox(1.2F, -1.1502F, -16.8157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1271F, -12.3962F, 3.6332F, 1.3963F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(69, 20).addBox(-1.0F, -0.1F, -15.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7F, -11.0F, -0.4809F, 0.2161F, -0.0531F));

		PartDefinition cube_r323 = neck1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(99, 27).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -4.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r324 = neck1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(134, 104).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0083F, 1.9689F, -2.8193F, 1.7002F, 0.2285F, -0.598F));

		PartDefinition cube_r325 = neck1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(128, 10).mirror().addBox(-1.1756F, -1.1048F, -5.4555F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.5007F, -3.667F, 1.8061F, -0.2085F, -0.081F));

		PartDefinition cube_r326 = neck1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(104, 10).mirror().addBox(-5.3394F, -1.5221F, -1.0318F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.5007F, -3.667F, 1.6504F, 0.4124F, -1.3394F));

		PartDefinition cube_r327 = neck1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(98, 132).mirror().addBox(-2.4426F, -1.5601F, -2.0527F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.5007F, -3.667F, 1.8326F, 0.3308F, -0.8811F));

		PartDefinition cube_r328 = neck1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-0.4488F, -2.0323F, -1.3731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.5007F, -3.667F, 2.502F, 0.1759F, -0.3519F));

		PartDefinition cube_r329 = neck1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.7099F, -2.5067F, -1.0293F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.5007F, -3.667F, 2.5007F, -0.5057F, 0.3379F));

		PartDefinition cube_r330 = neck1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(44, 44).mirror().addBox(0.0486F, -2.6239F, -0.1697F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -1.6007F, -3.167F, 0.5237F, 0.1128F, -0.1654F));

		PartDefinition cube_r331 = neck1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(81, 112).mirror().addBox(-0.1483F, -0.5607F, 0.0844F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -2.5007F, -3.667F, 0.0887F, 0.1448F, -0.1829F));

		PartDefinition cube_r332 = neck1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(129, 101).mirror().addBox(-0.4896F, -2.7648F, -0.1042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, -3.7007F, -4.467F, 0.3157F, 0.1738F, -0.091F));

		PartDefinition cube_r333 = neck1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(103, 71).mirror().addBox(-0.4F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4713F, -6.5673F, -4.8027F, 0.3547F, 0.1921F, -0.0391F));

		PartDefinition cube_r334 = neck1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.2617F, -5.9275F, -1.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(135, 107).mirror().addBox(-0.2617F, -5.4275F, -1.5445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.9067F, -6.5253F, -0.0344F, 0.1633F, -0.1088F));

		PartDefinition cube_r335 = neck1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(136, 119).mirror().addBox(-0.6047F, -1.8332F, -0.2588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -4.0067F, -7.4253F, 0.1924F, 0.1614F, -0.1116F));

		PartDefinition cube_r336 = neck1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(22, 129).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8262F, 2.6246F, -5.2401F, 1.7171F, -0.2147F, -0.0623F));

		PartDefinition cube_r337 = neck1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(135, 3).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0083F, 2.3258F, -6.2121F, 1.8134F, 0.3006F, -0.5684F));

		PartDefinition cube_r338 = neck1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(120, 58).mirror().addBox(-5.0319F, -1.5608F, -0.9193F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.9067F, -6.5253F, 1.6293F, 0.3274F, -1.347F));

		PartDefinition cube_r339 = neck1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(105, 132).mirror().addBox(-2.2113F, -1.5983F, -1.8209F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.9067F, -6.5253F, 1.7751F, 0.263F, -0.8979F));

		PartDefinition cube_r340 = neck1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(-0.3668F, -1.9007F, -1.0822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.9067F, -6.5253F, 2.4192F, 0.1452F, -0.3651F));

		PartDefinition cube_r341 = neck1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.1194F, -0.828F, 0.1241F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -0.0067F, -6.5253F, 2.4081F, -0.4749F, 0.3815F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(113, 41).mirror().addBox(-0.1185F, -0.8584F, -0.054F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.9067F, -6.5253F, 0.0021F, 0.1284F, -0.1947F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(135, 124).mirror().addBox(-0.0324F, -1.3716F, 0.1491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.2067F, -6.7253F, 0.3327F, 0.095F, -0.1762F));

		PartDefinition cube_r344 = neck1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(38, 125).mirror().addBox(-0.0496F, -3.0798F, -0.2275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.2067F, -6.7253F, 0.2439F, 0.1294F, -0.1528F));

		PartDefinition cube_r345 = neck1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.0324F, -3.3871F, 0.3866F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0766F, -1.2067F, -6.7253F, 0.42F, 0.095F, -0.1762F));

		PartDefinition cube_r346 = neck1.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(135, 6).mirror().addBox(-1.1577F, -1.3361F, -3.1947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -0.2948F, -9.5465F, 1.6949F, 0.1437F, -0.3475F));

		PartDefinition cube_r347 = neck1.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-0.7209F, -1.7047F, -3.3843F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -0.2948F, -9.5465F, 1.6278F, -0.2193F, -0.0431F));

		PartDefinition cube_r348 = neck1.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(120, 67).mirror().addBox(-1.6F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.5008F, 1.4389F, -10.1301F, 1.5903F, 0.157F, -1.3564F));

		PartDefinition cube_r349 = neck1.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(34, 44).mirror().addBox(0.814F, -1.2883F, -0.3256F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -0.2948F, -9.5465F, -0.1698F, 0.0929F, -0.2137F));

		PartDefinition cube_r350 = neck1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(130, 90).mirror().addBox(0.3854F, -1.0012F, 0.3716F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -0.2948F, -9.5465F, 2.2319F, -0.4037F, 0.4566F));

		PartDefinition cube_r351 = neck1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7507F, -0.1942F, -10.4344F, 1.6658F, 0.1253F, -0.9191F));

		PartDefinition cube_r352 = neck1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(56, 44).mirror().addBox(-0.2801F, -2.6526F, -0.2123F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -5.9948F, -9.9465F, -0.2097F, 0.142F, -0.1355F));

		PartDefinition cube_r353 = neck1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(130, 106).mirror().addBox(0.0725F, -2.6874F, -0.1643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -3.3948F, -10.2465F, -0.1047F, 0.1219F, -0.1539F));

		PartDefinition cube_r354 = neck1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(130, 95).mirror().addBox(0.6001F, -2.3833F, -0.5143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -1.0948F, -9.5465F, 0.1398F, 0.1128F, -0.1654F));

		PartDefinition cube_r355 = neck1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(0.6121F, -2.745F, 0.1566F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -1.0948F, -9.5465F, 0.3683F, 0.0857F, -0.1808F));

		PartDefinition cube_r356 = neck1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(126, 135).mirror().addBox(0.6121F, -1.7081F, -0.1112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, -1.0948F, -9.5465F, 0.281F, 0.0857F, -0.1808F));

		PartDefinition cube_r357 = neck1.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(126, 53).mirror().addBox(0.0185F, -1.0203F, -0.4238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9343F, -0.6948F, -9.7465F, 2.2557F, 0.0812F, -0.3837F));

		PartDefinition cube_r358 = neck1.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(135, 96).mirror().addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8665F, 2.281F, -13.9323F, 1.5466F, 0.0888F, -0.3647F));

		PartDefinition cube_r359 = neck1.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(123, 16).mirror().addBox(-1.8014F, -0.6804F, 0.0955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8054F, 1.0736F, -13.6905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r360 = neck1.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(129, 25).mirror().addBox(-0.7F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 2.4052F, -13.0465F, 1.4668F, -0.2233F, -0.0077F));

		PartDefinition cube_r361 = neck1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(133, 10).mirror().addBox(-0.6F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7716F, -0.0744F, -13.9393F, 1.7025F, -0.1526F, -0.4986F));

		PartDefinition cube_r362 = neck1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(101, 15).mirror().addBox(-0.1376F, -0.1517F, -0.2681F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.769F, -0.2061F, -13.8119F, 2.1143F, 0.0629F, -0.2841F));

		PartDefinition cube_r363 = neck1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(49, 125).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.0264F, -13.6905F, 2.0829F, -0.3305F, 0.5102F));

		PartDefinition cube_r364 = neck1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(113, 56).mirror().addBox(-0.5F, -2.4419F, -1.3308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2463F, -12.2208F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r365 = neck1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(130, 126).mirror().addBox(-1.336F, -2.8623F, -0.2677F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.8853F, -11.7871F, -0.5568F, 0.0874F, -0.1756F));

		PartDefinition cube_r366 = neck1.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(44, 120).mirror().addBox(-1.3185F, -0.288F, -0.4526F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.8853F, -11.5871F, -0.3124F, 0.0874F, -0.1756F));

		PartDefinition cube_r367 = neck1.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6814F, -2.2363F, -12.3288F, 0.1449F, 0.0431F, -0.1953F));

		PartDefinition cube_r368 = neck1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(-0.2288F, -2.35F, -0.3049F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -1.3853F, -13.1871F, -0.0846F, 0.073F, -0.1863F));

		PartDefinition cube_r369 = neck1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(135, 128).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6814F, -2.2363F, -12.3288F, 0.0576F, 0.0431F, -0.1953F));

		PartDefinition cube_r370 = neck1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(81, 112).addBox(-0.8517F, -0.5607F, 0.0844F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -2.5007F, -3.667F, 0.0887F, -0.1448F, 0.1829F));

		PartDefinition cube_r371 = neck1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(129, 101).addBox(-0.5104F, -2.7648F, -0.1042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1226F, -3.7007F, -4.467F, 0.3157F, -0.1738F, 0.091F));

		PartDefinition cube_r372 = neck1.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(103, 71).addBox(-0.6F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4713F, -6.5673F, -4.8027F, 0.3547F, -0.1921F, 0.0391F));

		PartDefinition cube_r373 = neck1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(44, 44).addBox(-1.0486F, -2.6239F, -0.1697F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -1.6007F, -3.167F, 0.5237F, -0.1128F, 0.1654F));

		PartDefinition cube_r374 = neck1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 44).addBox(-1.7099F, -2.5067F, -1.0293F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1226F, -2.5007F, -3.667F, 2.5007F, 0.5057F, -0.3379F));

		PartDefinition cube_r375 = neck1.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5512F, -2.0323F, -1.3731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1226F, -2.5007F, -3.667F, 2.502F, -0.1759F, 0.3519F));

		PartDefinition cube_r376 = neck1.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(98, 132).addBox(0.4426F, -1.5601F, -2.0527F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -2.5007F, -3.667F, 1.8326F, -0.3308F, 0.8811F));

		PartDefinition cube_r377 = neck1.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(104, 10).addBox(2.3394F, -1.5221F, -1.0318F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1226F, -2.5007F, -3.667F, 1.6504F, -0.4124F, 1.3394F));

		PartDefinition cube_r378 = neck1.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(128, 10).addBox(0.1756F, -1.1048F, -5.4555F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1226F, -2.5007F, -3.667F, 1.8061F, 0.2085F, 0.081F));

		PartDefinition cube_r379 = neck1.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(134, 104).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0083F, 1.9689F, -2.8193F, 1.7002F, -0.2285F, 0.598F));

		PartDefinition cube_r380 = neck1.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(113, 41).addBox(-0.8815F, -0.8584F, -0.054F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -1.9067F, -6.5253F, 0.0021F, -0.1284F, 0.1947F));

		PartDefinition cube_r381 = neck1.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(135, 3).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0083F, 2.3258F, -6.2121F, 1.8134F, -0.3006F, 0.5684F));

		PartDefinition cube_r382 = neck1.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(22, 129).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8262F, 2.6246F, -5.2401F, 1.7171F, 0.2147F, 0.0623F));

		PartDefinition cube_r383 = neck1.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(120, 58).addBox(2.0319F, -1.5608F, -0.9193F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0766F, -1.9067F, -6.5253F, 1.6293F, -0.3274F, 1.347F));

		PartDefinition cube_r384 = neck1.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(105, 132).addBox(0.2113F, -1.5983F, -1.8209F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -1.9067F, -6.5253F, 1.7751F, -0.263F, 0.8979F));

		PartDefinition cube_r385 = neck1.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(126, 46).addBox(-0.6332F, -1.9007F, -1.0822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0766F, -1.9067F, -6.5253F, 2.4192F, -0.1452F, 0.3651F));

		PartDefinition cube_r386 = neck1.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(9, 44).addBox(-0.8806F, -0.828F, 0.1241F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0766F, -0.0067F, -6.5253F, 2.4081F, 0.4749F, -0.3815F));

		PartDefinition cube_r387 = neck1.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(0, 11).addBox(-0.9676F, -3.3871F, 0.3866F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -1.2067F, -6.7253F, 0.42F, -0.095F, 0.1762F));

		PartDefinition cube_r388 = neck1.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(135, 124).addBox(-0.9676F, -1.3716F, 0.1491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0766F, -1.2067F, -6.7253F, 0.3327F, -0.095F, 0.1762F));

		PartDefinition cube_r389 = neck1.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(38, 125).addBox(-0.9504F, -3.0798F, -0.2275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0766F, -1.2067F, -6.7253F, 0.2439F, -0.1294F, 0.1528F));

		PartDefinition cube_r390 = neck1.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(106, 0).addBox(-0.7383F, -5.9275F, -1.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(135, 107).addBox(-0.7383F, -5.4275F, -1.5445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0766F, -1.9067F, -6.5253F, -0.0344F, -0.1633F, 0.1088F));

		PartDefinition cube_r391 = neck1.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(136, 119).addBox(-0.3953F, -1.8332F, -0.2588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0766F, -4.0067F, -7.4253F, 0.1924F, -0.1614F, 0.1116F));

		PartDefinition cube_r392 = neck1.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(126, 135).addBox(-1.6121F, -1.7081F, -0.1112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6343F, -1.0948F, -9.5465F, 0.281F, -0.0857F, 0.1808F));

		PartDefinition cube_r393 = neck1.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(56, 44).addBox(-0.7199F, -2.6526F, -0.2123F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6343F, -5.9948F, -9.9465F, -0.2097F, -0.142F, 0.1355F));

		PartDefinition cube_r394 = neck1.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(130, 106).addBox(-1.0725F, -2.6874F, -0.1643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6343F, -3.3948F, -10.2465F, -0.1047F, -0.1219F, 0.1539F));

		PartDefinition cube_r395 = neck1.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(130, 95).addBox(-1.6001F, -2.3833F, -0.5143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6343F, -1.0948F, -9.5465F, 0.1398F, -0.1128F, 0.1654F));

		PartDefinition cube_r396 = neck1.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(46, 0).addBox(-1.6121F, -2.745F, 0.1566F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6343F, -1.0948F, -9.5465F, 0.3683F, -0.0857F, 0.1808F));

		PartDefinition cube_r397 = neck1.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(34, 44).addBox(-1.814F, -1.2883F, -0.3256F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6343F, -0.2948F, -9.5465F, -0.1698F, -0.0929F, 0.2137F));

		PartDefinition cube_r398 = neck1.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(130, 90).addBox(-1.3854F, -1.0012F, 0.3716F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6343F, -0.2948F, -9.5465F, 2.2319F, 0.4037F, -0.4566F));

		PartDefinition cube_r399 = neck1.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(126, 53).addBox(-1.0185F, -1.0203F, -0.4238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9343F, -0.6948F, -9.7465F, 2.2557F, -0.0812F, 0.3837F));

		PartDefinition cube_r400 = neck1.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(133, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7507F, -0.1942F, -10.4344F, 1.6658F, -0.1253F, 0.9191F));

		PartDefinition cube_r401 = neck1.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(120, 67).addBox(-1.4F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.5008F, 1.4389F, -10.1301F, 1.5903F, -0.157F, 1.3564F));

		PartDefinition cube_r402 = neck1.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(135, 6).addBox(-0.8423F, -1.3361F, -3.1947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6343F, -0.2948F, -9.5465F, 1.6949F, -0.1437F, 0.3475F));

		PartDefinition cube_r403 = neck1.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 129).addBox(-0.2791F, -1.7047F, -3.3843F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6343F, -0.2948F, -9.5465F, 1.6278F, 0.2193F, 0.0431F));

		PartDefinition cube_r404 = neck1.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(129, 25).addBox(-0.3F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6343F, 2.4052F, -13.0465F, 1.4668F, 0.2233F, 0.0077F));

		PartDefinition cube_r405 = neck1.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(135, 96).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8665F, 2.281F, -13.9323F, 1.5466F, -0.0888F, 0.3647F));

		PartDefinition cube_r406 = neck1.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(123, 16).addBox(-1.1986F, -0.6804F, 0.0955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8054F, 1.0736F, -13.6905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r407 = neck1.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(133, 10).addBox(-1.4F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7716F, -0.0744F, -13.9393F, 1.7025F, 0.1526F, 0.4986F));

		PartDefinition cube_r408 = neck1.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(101, 15).addBox(-0.8624F, -0.1517F, -0.2681F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.769F, -0.2061F, -13.8119F, 2.1143F, -0.0629F, 0.2841F));

		PartDefinition cube_r409 = neck1.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(49, 125).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.0264F, -13.6905F, 2.0829F, 0.3305F, -0.5102F));

		PartDefinition cube_r410 = neck1.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(113, 56).addBox(-0.5F, -2.4419F, -1.3308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.2463F, -12.2208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r411 = neck1.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(135, 128).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6814F, -2.2363F, -12.3288F, 0.0576F, -0.0431F, 0.1953F));

		PartDefinition cube_r412 = neck1.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6814F, -2.2363F, -12.3288F, 0.1449F, -0.0431F, 0.1953F));

		PartDefinition cube_r413 = neck1.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(5, 131).addBox(-0.7712F, -2.35F, -0.3049F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -1.3853F, -13.1871F, -0.0846F, -0.073F, 0.1863F));

		PartDefinition cube_r414 = neck1.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(130, 126).addBox(0.336F, -2.8623F, -0.2677F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.8853F, -11.7871F, -0.5568F, -0.0874F, 0.1756F));

		PartDefinition cube_r415 = neck1.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(44, 120).addBox(0.3185F, -0.288F, -0.4526F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.8853F, -11.5871F, -0.3124F, -0.0874F, 0.1756F));

		PartDefinition neckBoneLeft1 = neck1.addOrReplaceChild("neckBoneLeft1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -7.8309F, -10.3844F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neckBoneRight1 = neck1.addOrReplaceChild("neckBoneRight1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -7.8309F, -10.3844F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(69, 5).addBox(-1.0F, -0.8484F, -11.7843F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -14.8F, -0.3005F, 0.1926F, 0.0314F));

		PartDefinition cube_r416 = neck2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(27, 129).mirror().addBox(-0.5F, -1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.2331F, -2.0399F, 1.5205F, -0.2226F, -0.0195F));

		PartDefinition cube_r417 = neck2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(20, 135).mirror().addBox(-1.2595F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1264F, -2.2905F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r418 = neck2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1264F, -2.2905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r419 = neck2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.7339F, -2.5393F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r420 = neck2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(125, 37).mirror().addBox(-0.039F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -1.0061F, -3.3119F, 2.3272F, 0.162F, -0.1991F));

		PartDefinition cube_r421 = neck2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(125, 96).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.8264F, -3.1905F, 2.1813F, -0.3801F, 0.476F));

		PartDefinition cube_r422 = neck2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(115, 26).mirror().addBox(-0.5F, -2.4419F, -0.8308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0463F, -1.7208F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r423 = neck2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(11, 137).mirror().addBox(-0.7855F, -0.3215F, -0.8484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -5.4853F, -1.8871F, 0.5289F, 0.0431F, -0.1953F));

		PartDefinition cube_r424 = neck2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(120, 39).mirror().addBox(-0.6127F, 0.0357F, -1.7461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -1.7871F, 0.7352F, 0.0794F, -0.1837F));

		PartDefinition cube_r425 = neck2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(48, 131).mirror().addBox(-0.1835F, -2.7025F, -0.4012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2853F, -2.2871F, -0.0138F, 0.0605F, -0.1926F));

		PartDefinition cube_r426 = neck2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(37, 131).mirror().addBox(-1.064F, -0.3424F, -0.9006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.0853F, -2.0871F, 0.0699F, 0.1554F, -0.1199F));

		PartDefinition cube_r427 = neck2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(113, 115).mirror().addBox(-0.2074F, -5.357F, -0.6036F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.1853F, -2.4871F, 0.0353F, 0.107F, -0.1692F));

		PartDefinition cube_r428 = neck2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-1.1454F, -5.967F, -0.3278F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.1853F, -3.0871F, -0.1919F, 0.1192F, -0.1559F));

		PartDefinition cube_r429 = neck2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(125, 90).mirror().addBox(-1.5627F, -0.4875F, -0.6261F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -10.5853F, -2.1871F, -0.07F, 0.1372F, -0.1403F));

		PartDefinition cube_r430 = neck2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(130, 4).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.2331F, -6.0399F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r431 = neck2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(135, 48).mirror().addBox(-1.2595F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1264F, -6.2905F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r432 = neck2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(111, 95).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1264F, -6.2905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r433 = neck2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(128, 74).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.7339F, -6.5393F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r434 = neck2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(116, 7).mirror().addBox(-0.5F, -2.4419F, -0.8308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0463F, -5.7208F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r435 = neck2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(45, 111).mirror().addBox(-0.787F, -9.3696F, -0.597F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -6.6871F, -0.2439F, 0.1109F, -0.1619F));

		PartDefinition cube_r436 = neck2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(131, 50).mirror().addBox(-0.1835F, -2.7025F, -0.4012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2853F, -6.2871F, -0.0138F, 0.0605F, -0.1926F));

		PartDefinition cube_r437 = neck2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(137, 13).mirror().addBox(-0.7855F, -0.3215F, -0.8484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -5.4853F, -5.8871F, 0.5289F, 0.0431F, -0.1953F));

		PartDefinition cube_r438 = neck2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(57, 116).mirror().addBox(-0.6843F, -2.8204F, -0.2901F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -6.6871F, -0.1372F, 0.0762F, -0.185F));

		PartDefinition cube_r439 = neck2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(49, 120).mirror().addBox(-0.6127F, 0.0357F, -1.7461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -5.7871F, 0.7352F, 0.0794F, -0.1837F));

		PartDefinition cube_r440 = neck2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(125, 105).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.8264F, -7.1905F, 2.1813F, -0.3801F, 0.476F));

		PartDefinition cube_r441 = neck2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(125, 42).mirror().addBox(-0.039F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -1.0061F, -7.3119F, 2.3354F, 0.1155F, -0.1465F));

		PartDefinition cube_r442 = neck2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(131, 120).mirror().addBox(-1.2997F, -7.1087F, 0.416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.1853F, -9.9871F, -0.244F, 0.1153F, -0.1545F));

		PartDefinition cube_r443 = neck2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(116, 131).mirror().addBox(-0.6843F, -2.8204F, -0.2901F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -10.6871F, -0.3089F, 0.0431F, -0.1953F));

		PartDefinition cube_r444 = neck2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(87, 120).mirror().addBox(-1.155F, -4.9135F, -0.3106F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -7.1853F, -9.9871F, -0.4167F, 0.0812F, -0.1785F));

		PartDefinition cube_r445 = neck2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(25, 116).mirror().addBox(-0.5F, -2.4419F, -0.8308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0463F, -9.7208F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r446 = neck2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-0.1835F, -2.7025F, -0.7012F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2853F, -10.2871F, -0.0138F, 0.0605F, -0.1926F));

		PartDefinition cube_r447 = neck2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(120, 100).mirror().addBox(-0.6127F, 0.0357F, -1.7461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -4.7853F, -9.7871F, 0.7352F, 0.0794F, -0.1837F));

		PartDefinition cube_r448 = neck2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(16, 137).mirror().addBox(-0.7855F, -0.3215F, -0.8484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -5.4853F, -9.8871F, 0.5289F, 0.0431F, -0.1953F));

		PartDefinition cube_r449 = neck2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(125, 113).mirror().addBox(-0.039F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -1.0061F, -11.3119F, 2.3101F, 0.2307F, -0.2797F));

		PartDefinition cube_r450 = neck2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(12, 126).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.8264F, -11.1905F, 2.249F, -0.4113F, 0.4499F));

		PartDefinition cube_r451 = neck2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(130, 41).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1264F, -10.2905F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r452 = neck2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(129, 57).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.7339F, -10.5393F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r453 = neck2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(135, 54).mirror().addBox(-1.2595F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1264F, -10.2905F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r454 = neck2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(32, 130).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.2331F, -10.0399F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r455 = neck2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(27, 129).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.2331F, -2.0399F, 1.5205F, 0.2226F, 0.0195F));

		PartDefinition cube_r456 = neck2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(20, 135).addBox(-0.7405F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.1264F, -2.2905F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r457 = neck2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(95, 63).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.1264F, -2.2905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r458 = neck2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(125, 37).addBox(-0.961F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -1.0061F, -3.3119F, 2.3272F, -0.162F, 0.1991F));

		PartDefinition cube_r459 = neck2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(81, 0).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.7339F, -2.5393F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r460 = neck2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(115, 26).addBox(-0.5F, -2.4419F, -0.8308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -1.0463F, -1.7208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r461 = neck2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(48, 131).addBox(-0.8165F, -2.7025F, -0.4012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.2853F, -2.2871F, -0.0138F, -0.0605F, 0.1926F));

		PartDefinition cube_r462 = neck2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(125, 96).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.8264F, -3.1905F, 2.1813F, 0.3801F, -0.476F));

		PartDefinition cube_r463 = neck2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(11, 137).addBox(-0.2145F, -0.3215F, -0.8484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -5.4853F, -1.8871F, 0.5289F, -0.0431F, 0.1953F));

		PartDefinition cube_r464 = neck2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(120, 39).addBox(-0.3873F, 0.0357F, -1.7461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -1.7871F, 0.7352F, -0.0794F, 0.1837F));

		PartDefinition cube_r465 = neck2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(113, 115).addBox(-0.7926F, -5.357F, -0.6036F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.1853F, -2.4871F, 0.0353F, -0.107F, 0.1692F));

		PartDefinition cube_r466 = neck2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(37, 131).addBox(0.064F, -0.3424F, -0.9006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.0853F, -2.0871F, 0.0699F, -0.1554F, 0.1199F));

		PartDefinition cube_r467 = neck2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(125, 90).addBox(0.5627F, -0.4875F, -0.6261F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -10.5853F, -2.1871F, -0.07F, -0.1372F, 0.1403F));

		PartDefinition cube_r468 = neck2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(75, 113).addBox(0.1454F, -5.967F, -0.3278F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.1853F, -3.0871F, -0.1919F, -0.1192F, 0.1559F));

		PartDefinition cube_r469 = neck2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(45, 111).addBox(-0.213F, -9.3696F, -0.597F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -6.6871F, -0.2439F, -0.1109F, 0.1619F));

		PartDefinition cube_r470 = neck2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(57, 116).addBox(-0.3157F, -2.8204F, -0.2901F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -6.6871F, -0.1372F, -0.0762F, 0.185F));

		PartDefinition cube_r471 = neck2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(137, 13).addBox(-0.2145F, -0.3215F, -0.8484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -5.4853F, -5.8871F, 0.5289F, -0.0431F, 0.1953F));

		PartDefinition cube_r472 = neck2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(49, 120).addBox(-0.3873F, 0.0357F, -1.7461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -5.7871F, 0.7352F, -0.0794F, 0.1837F));

		PartDefinition cube_r473 = neck2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(131, 50).addBox(-0.8165F, -2.7025F, -0.4012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.2853F, -6.2871F, -0.0138F, -0.0605F, 0.1926F));

		PartDefinition cube_r474 = neck2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(116, 7).addBox(-0.5F, -2.4419F, -0.8308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -1.0463F, -5.7208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r475 = neck2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(125, 105).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.8264F, -7.1905F, 2.1813F, 0.3801F, -0.476F));

		PartDefinition cube_r476 = neck2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(125, 42).addBox(-0.961F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -1.0061F, -7.3119F, 2.3354F, -0.1155F, 0.1465F));

		PartDefinition cube_r477 = neck2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(128, 74).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.7339F, -6.5393F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r478 = neck2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(111, 95).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.1264F, -6.2905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r479 = neck2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(135, 48).addBox(-0.7405F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.1264F, -6.2905F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r480 = neck2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(130, 4).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.2331F, -6.0399F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r481 = neck2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(32, 130).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.2331F, -10.0399F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r482 = neck2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(135, 54).addBox(-0.7405F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.1264F, -10.2905F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r483 = neck2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(130, 41).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.1264F, -10.2905F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r484 = neck2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(129, 57).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.7339F, -10.5393F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r485 = neck2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(25, 116).addBox(-0.5F, -2.4419F, -0.8308F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -1.0463F, -9.7208F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r486 = neck2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(12, 126).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.8264F, -11.1905F, 2.249F, 0.4113F, -0.4499F));

		PartDefinition cube_r487 = neck2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(131, 120).addBox(0.2997F, -7.1087F, 0.416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.1853F, -9.9871F, -0.244F, -0.1153F, 0.1545F));

		PartDefinition cube_r488 = neck2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(87, 120).addBox(0.155F, -4.9135F, -0.3106F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -7.1853F, -9.9871F, -0.4167F, -0.0812F, 0.1785F));

		PartDefinition cube_r489 = neck2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(16, 137).addBox(-0.2145F, -0.3215F, -0.8484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.8461F, -5.4853F, -9.8871F, 0.5289F, -0.0431F, 0.1953F));

		PartDefinition cube_r490 = neck2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(116, 131).addBox(-0.3157F, -2.8204F, -0.2901F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -10.6871F, -0.3089F, -0.0431F, 0.1953F));

		PartDefinition cube_r491 = neck2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(112, 0).addBox(-0.8165F, -2.7025F, -0.7012F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.2853F, -10.2871F, -0.0138F, -0.0605F, 0.1926F));

		PartDefinition cube_r492 = neck2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(120, 100).addBox(-0.3873F, 0.0357F, -1.7461F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -4.7853F, -9.7871F, 0.7352F, -0.0794F, 0.1837F));

		PartDefinition cube_r493 = neck2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(125, 113).addBox(-0.961F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -1.0061F, -11.3119F, 2.3101F, -0.2307F, 0.2797F));

		PartDefinition neckBoneLeft2 = neck2.addOrReplaceChild("neckBoneLeft2", CubeListBuilder.create(), PartPose.offset(0.25F, -2.2793F, -5.4687F));

		PartDefinition neckBoneRight2 = neck2.addOrReplaceChild("neckBoneRight2", CubeListBuilder.create(), PartPose.offset(-0.25F, -2.2793F, -5.4687F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(68, 44).addBox(-1.0F, -0.7015F, -10.771F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1484F, -11.7843F, 0.3214F, 0.0913F, 0.1609F));

		PartDefinition cube_r494 = neck3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(61, 130).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.3815F, -1.8555F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r495 = neck3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(65, 135).mirror().addBox(-1.2595F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.022F, -2.1062F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r496 = neck3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(131, 36).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.022F, -2.1062F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r497 = neck3.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(130, 111).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.5855F, -2.3549F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r498 = neck3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(130, 131).mirror().addBox(-0.6072F, -10.9545F, -0.3533F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2369F, -1.4028F, -0.5205F, 0.0685F, -0.1626F));

		PartDefinition cube_r499 = neck3.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(72, 126).mirror().addBox(-0.338F, -8.2774F, -2.0261F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2369F, -1.4028F, -0.7264F, 0.0292F, -0.1764F));

		PartDefinition cube_r500 = neck3.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(112, 126).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.678F, -3.0062F, 2.0036F, -0.287F, 0.5344F));

		PartDefinition cube_r501 = neck3.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(120, 110).mirror().addBox(-0.5F, -1.4419F, -0.8308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -1.5365F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r502 = neck3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(10, 132).mirror().addBox(-0.2067F, -4.8786F, -1.4395F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2369F, -1.4028F, -0.5998F, -0.0155F, -0.1819F));

		PartDefinition cube_r503 = neck3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(15, 132).mirror().addBox(-0.2064F, -2.4837F, 0.0776F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2369F, -1.4028F, -0.0937F, -0.0155F, -0.1819F));

		PartDefinition cube_r504 = neck3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(107, 126).mirror().addBox(-0.2053F, -2.4187F, -1.2294F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2369F, -1.4028F, -0.493F, -0.0363F, -0.181F));

		PartDefinition cube_r505 = neck3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(118, 120).mirror().addBox(-0.1899F, -4.4883F, -0.6533F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, -2.2369F, -1.4028F, -0.4192F, -0.0804F, -0.172F));

		PartDefinition cube_r506 = neck3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(125, 117).mirror().addBox(-0.039F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.869F, -0.8577F, -3.1275F, 2.3367F, 0.017F, -0.1514F));

		PartDefinition cube_r507 = neck3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(77, 130).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7562F, 1.3815F, -5.8555F, 1.5921F, -0.2207F, -0.0353F));

		PartDefinition cube_r508 = neck3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(135, 73).mirror().addBox(-1.2595F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.022F, -6.1062F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r509 = neck3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(131, 116).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.022F, -6.1062F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r510 = neck3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(131, 45).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.5855F, -6.3549F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r511 = neck3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(121, 11).mirror().addBox(-0.5F, -1.4419F, -0.7308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -5.5365F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r512 = neck3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(127, 19).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.678F, -7.0062F, 2.0036F, -0.287F, 0.5344F));

		PartDefinition cube_r513 = neck3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(108, 109).mirror().addBox(-0.3607F, -11.5486F, -2.2202F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -2.3386F, -4.8958F, -0.8668F, 0.019F, -0.1295F));

		PartDefinition cube_r514 = neck3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(132, 15).mirror().addBox(-0.3163F, -4.3016F, -1.3944F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -2.3386F, -4.8958F, -0.6546F, -0.0088F, -0.1302F));

		PartDefinition cube_r515 = neck3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(137, 38).mirror().addBox(-0.3171F, -1.9769F, -0.3278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -2.3386F, -4.8958F, -0.0287F, 0.0155F, -0.1298F));

		PartDefinition cube_r516 = neck3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(126, 121).mirror().addBox(-0.3171F, -2.0217F, -0.8622F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -2.3386F, -4.8958F, -0.3254F, 0.0155F, -0.1298F));

		PartDefinition cube_r517 = neck3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(72, 121).mirror().addBox(-0.5F, -1.4419F, -0.7308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -8.5365F, -0.3236F, 0.0587F, -0.2254F));

		PartDefinition cube_r518 = neck3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(135, 90).mirror().addBox(-1.2595F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.022F, -9.1062F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r519 = neck3.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(27, 135).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7699F, 1.1842F, -8.8258F, 1.4175F, -0.2207F, -0.0353F));

		PartDefinition cube_r520 = neck3.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(132, 20).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, 0.022F, -9.1062F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r521 = neck3.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(132, 31).mirror().addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6528F, -0.5855F, -9.3549F, 1.5708F, 0.0F, -0.925F));

		PartDefinition cube_r522 = neck3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(127, 31).mirror().addBox(-0.1774F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.678F, -10.0062F, 2.0036F, -0.287F, 0.5344F));

		PartDefinition cube_r523 = neck3.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(43, 127).mirror().addBox(-0.5F, -3.4803F, -1.1021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -8.5365F, -0.6203F, 0.0587F, -0.1381F));

		PartDefinition cube_r524 = neck3.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(137, 42).mirror().addBox(-0.5F, -3.4419F, -0.1308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -8.5365F, -0.3236F, 0.0587F, -0.1381F));

		PartDefinition cube_r525 = neck3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(13, 110).mirror().addBox(-0.5F, -10.7757F, -1.8013F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8979F, -8.5365F, -0.8472F, 0.0587F, -0.1381F));

		PartDefinition cube_r526 = neck3.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(61, 130).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.3815F, -1.8555F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r527 = neck3.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(65, 135).addBox(-0.7405F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.022F, -2.1062F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r528 = neck3.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(131, 36).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.022F, -2.1062F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r529 = neck3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(130, 111).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.5855F, -2.3549F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r530 = neck3.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(120, 110).addBox(-0.5F, -1.4419F, -0.8308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -1.5365F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r531 = neck3.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(125, 117).addBox(-0.961F, -0.1558F, -0.2523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.869F, -0.8577F, -3.1275F, 2.3367F, -0.017F, 0.1514F));

		PartDefinition cube_r532 = neck3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(112, 126).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.678F, -3.0062F, 2.0036F, 0.287F, -0.5344F));

		PartDefinition cube_r533 = neck3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(118, 120).addBox(-0.8101F, -4.4883F, -0.6533F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.2369F, -1.4028F, -0.4192F, 0.0804F, 0.172F));

		PartDefinition cube_r534 = neck3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(15, 132).addBox(-0.7936F, -2.4837F, 0.0776F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.2369F, -1.4028F, -0.0937F, 0.0155F, 0.1819F));

		PartDefinition cube_r535 = neck3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(107, 126).addBox(-0.7947F, -2.4187F, -1.2294F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8461F, -2.2369F, -1.4028F, -0.493F, 0.0363F, 0.181F));

		PartDefinition cube_r536 = neck3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(130, 131).addBox(-0.3928F, -10.9545F, -0.3533F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.2369F, -1.4028F, -0.5205F, -0.0685F, 0.1626F));

		PartDefinition cube_r537 = neck3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(72, 126).addBox(-0.662F, -8.2774F, -2.0261F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.2369F, -1.4028F, -0.7264F, -0.0292F, 0.1764F));

		PartDefinition cube_r538 = neck3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(10, 132).addBox(-0.7933F, -4.8786F, -1.4395F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8461F, -2.2369F, -1.4028F, -0.5998F, 0.0155F, 0.1819F));

		PartDefinition cube_r539 = neck3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(77, 130).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7562F, 1.3815F, -5.8555F, 1.5921F, 0.2207F, 0.0353F));

		PartDefinition cube_r540 = neck3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(135, 73).addBox(-0.7405F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.022F, -6.1062F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r541 = neck3.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(131, 116).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.022F, -6.1062F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r542 = neck3.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(131, 45).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.5855F, -6.3549F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r543 = neck3.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(127, 19).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.678F, -7.0062F, 2.0036F, 0.287F, -0.5344F));

		PartDefinition cube_r544 = neck3.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(121, 11).addBox(-0.5F, -1.4419F, -0.7308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -5.5365F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r545 = neck3.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(126, 121).addBox(-0.6829F, -2.0217F, -0.8622F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.636F, -2.3386F, -4.8958F, -0.3254F, -0.0155F, 0.1298F));

		PartDefinition cube_r546 = neck3.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(137, 38).addBox(-0.6829F, -1.9769F, -0.3278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.636F, -2.3386F, -4.8958F, -0.0287F, -0.0155F, 0.1298F));

		PartDefinition cube_r547 = neck3.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(108, 109).addBox(-0.6393F, -11.5486F, -2.2202F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.636F, -2.3386F, -4.8958F, -0.8668F, -0.019F, 0.1295F));

		PartDefinition cube_r548 = neck3.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(132, 15).addBox(-0.6837F, -4.3016F, -1.3944F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.636F, -2.3386F, -4.8958F, -0.6546F, 0.0088F, 0.1302F));

		PartDefinition cube_r549 = neck3.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(13, 110).addBox(-0.5F, -10.7757F, -1.8013F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -8.5365F, -0.8472F, -0.0587F, 0.1381F));

		PartDefinition cube_r550 = neck3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(72, 121).addBox(-0.5F, -1.4419F, -0.7308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -8.5365F, -0.3236F, -0.0587F, 0.2254F));

		PartDefinition cube_r551 = neck3.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(137, 42).addBox(-0.5F, -3.4419F, -0.1308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -8.5365F, -0.3236F, -0.0587F, 0.1381F));

		PartDefinition cube_r552 = neck3.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(43, 127).addBox(-0.5F, -3.4803F, -1.1021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2F, -0.8979F, -8.5365F, -0.6203F, -0.0587F, 0.1381F));

		PartDefinition cube_r553 = neck3.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(127, 31).addBox(-0.8226F, -0.2563F, -0.0867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.678F, -10.0062F, 2.0036F, 0.287F, -0.5344F));

		PartDefinition cube_r554 = neck3.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(132, 31).addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6528F, -0.5855F, -9.3549F, 1.5708F, 0.0F, 0.925F));

		PartDefinition cube_r555 = neck3.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(132, 20).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, 0.022F, -9.1062F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r556 = neck3.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(27, 135).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7699F, 1.1842F, -8.8258F, 1.4175F, 0.2207F, 0.0353F));

		PartDefinition cube_r557 = neck3.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(135, 90).addBox(-0.7405F, -0.7418F, -1.3808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, 0.022F, -9.1062F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1985F, -10.571F, 0.4426F, 0.1546F, 0.0812F));

		PartDefinition cube_r558 = neck4.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(104, 135).mirror().addBox(-0.6F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7574F, 0.9701F, -0.7528F, 1.4265F, -0.2652F, -0.05F));

		PartDefinition cube_r559 = neck4.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-1.2595F, -0.7418F, -1.1808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1765F, -1.1352F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r560 = neck4.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(66, 132).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1765F, -1.1352F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r561 = neck4.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(138, 115).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.1765F, -1.1352F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r562 = neck4.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(132, 60).mirror().addBox(-0.1774F, -0.1563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.8765F, -1.8352F, 1.7617F, -0.1379F, 0.5857F));

		PartDefinition cube_r563 = neck4.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(82, 132).mirror().addBox(-0.1774F, -0.1563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.0765F, -4.5352F, 1.7324F, -0.1185F, 0.5895F));

		PartDefinition cube_r564 = neck4.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(135, 93).mirror().addBox(-1.2595F, -0.7418F, -1.1808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.3765F, -3.8352F, 1.5708F, 0.0F, -0.1658F));

		PartDefinition cube_r565 = neck4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(99, 135).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.771F, 0.5728F, -3.423F, 1.4175F, -0.2207F, -0.0353F));

		PartDefinition cube_r566 = neck4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(132, 70).mirror().addBox(-1.5014F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.3765F, -3.8352F, 1.603F, -0.0105F, -1.1914F));

		PartDefinition cube_r567 = neck4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(139, 21).mirror().addBox(-0.474F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.3765F, -3.8352F, 1.5708F, 0.0F, -0.5323F));

		PartDefinition cube_r568 = neck4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(92, 135).addBox(-0.7405F, -0.7418F, -1.1808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.1765F, -1.1352F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r569 = neck4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(104, 135).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7574F, 0.9701F, -0.7528F, 1.4265F, 0.2652F, 0.05F));

		PartDefinition cube_r570 = neck4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(66, 132).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.1765F, -1.1352F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r571 = neck4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(138, 115).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.1765F, -1.1352F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r572 = neck4.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(132, 60).addBox(-0.8226F, -0.1563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.8765F, -1.8352F, 1.7617F, 0.1379F, -0.5857F));

		PartDefinition cube_r573 = neck4.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(53, 132).addBox(-1.0F, -0.2701F, -0.1282F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -2.9193F, 0.7453F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r574 = neck4.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(122, 19).addBox(-1.0F, -4.7822F, -0.1759F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, -2.9193F, 0.8453F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r575 = neck4.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(82, 132).addBox(-0.8226F, -0.1563F, -0.0867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.0765F, -4.5352F, 1.7324F, 0.1185F, -0.5895F));

		PartDefinition cube_r576 = neck4.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(139, 21).addBox(-0.526F, -0.7488F, -0.1048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.3765F, -3.8352F, 1.5708F, 0.0F, 0.5323F));

		PartDefinition cube_r577 = neck4.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(132, 70).addBox(-0.4986F, -0.7804F, -0.1045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.3765F, -3.8352F, 1.603F, 0.0105F, 1.1914F));

		PartDefinition cube_r578 = neck4.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(135, 93).addBox(-0.7405F, -0.7418F, -1.1808F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.3765F, -3.8352F, 1.5708F, 0.0F, 0.1658F));

		PartDefinition cube_r579 = neck4.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(99, 135).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.771F, 0.5728F, -3.423F, 1.4175F, 0.2207F, 0.0353F));

		PartDefinition cube_r580 = neck4.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(23, 122).addBox(-1.0F, -4.7822F, -0.1759F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, -2.7193F, -2.3547F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r581 = neck4.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(132, 77).addBox(-1.0F, -1.9776F, -0.339F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.7193F, -3.8547F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r582 = neck4.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(88, 75).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2755F, -6.022F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1755F, -5.322F, 0.1905F, 0.0797F, 0.2092F));

		PartDefinition cube_r583 = head.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(-2.52F, -1.9349F, 0.7911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(91, 138).mirror().addBox(-2.32F, -1.9349F, -0.2089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(132, 82).mirror().addBox(-2.1F, -0.1349F, -1.6089F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(132, 82).addBox(0.5F, -0.1349F, -1.6089F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(55, 54).addBox(0.92F, -1.9349F, 0.7911F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 138).addBox(0.72F, -1.9349F, -0.2089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, -0.5874F, -2.8436F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r584 = head.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(27, 95).mirror().addBox(-2.52F, -1.0004F, -1.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(82, 80).mirror().addBox(-2.77F, -0.7004F, -1.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 94).mirror().addBox(-2.55F, -0.7004F, -1.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 80).addBox(0.77F, -0.7004F, -1.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 94).addBox(0.55F, -0.7004F, -1.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 95).addBox(0.52F, -1.0004F, -1.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.6874F, -0.8436F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r585 = head.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(73, 139).mirror().addBox(-2.52F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 139).addBox(0.52F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1158F, -0.5847F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r586 = head.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(137, 61).mirror().addBox(-2.52F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 61).addBox(0.52F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2874F, -2.2436F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r587 = head.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(60, 137).mirror().addBox(-2.5F, -0.2259F, -0.2226F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(60, 137).addBox(0.1F, -0.2259F, -0.2226F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.7F, -1.7874F, -3.5436F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r588 = head.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(52, 137).mirror().addBox(-2.5F, -1.8197F, -0.2703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 137).addBox(0.1F, -1.8197F, -0.2703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, -0.5874F, -5.8436F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r589 = head.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(67, 8).addBox(-2.0F, -1.3F, -0.9F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, -1.75F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r590 = head.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(98, 75).addBox(-1.5F, 0.0F, -3.35F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.25F, -2.75F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r591 = head.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(44, 61).addBox(-2.0F, -2.7F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(100, 65).addBox(-1.5F, -2.7F, -3.3F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -2.65F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r592 = head.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(63, 100).addBox(-1.5F, -2.0071F, -3.0626F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.85F, -4.35F, 0.3142F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -7.65F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r593 = bone.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(132, 87).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2506F, -1.4882F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r594 = bone.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(91, 132).addBox(-1.0F, -0.9947F, 0.0052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1319F, -0.7866F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r595 = bone.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(45, 70).addBox(-1.5F, -0.0706F, 0.0244F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r596 = bone.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(70, 61).addBox(-1.5F, -1.0233F, -0.9805F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r597 = bone.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(37, 84).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r598 = bone2.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(99, 84).addBox(-1.0F, 0.0821F, -3.9979F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r599 = bone3.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(22, 54).addBox(-1.0F, -0.05F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(44, 54).addBox(-1.5F, 0.1F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r600 = bone4.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(41, 89).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.5F, -0.7679F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -1.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(136, 51).mirror().addBox(-2.0F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 34).mirror().addBox(-2.0F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.011F)).mirror(false)
				.texOffs(136, 51).addBox(1.0F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 34).addBox(1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(0.0F, 0.1652F, 0.0567F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone6 = jaw.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r602 = bone6.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(95, 84).mirror().addBox(-2.0F, -1.0015F, -2.1092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(95, 84).addBox(1.0F, -1.0015F, -2.1092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.9F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r603 = bone6.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(82, 94).mirror().addBox(-2.0F, -0.1F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.011F)).mirror(false)
				.texOffs(82, 94).addBox(1.0F, -0.1F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r604 = bone7.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(134, 28).addBox(-1.0F, 1.05F, -4.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r605 = bone7.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(110, 10).mirror().addBox(-1.5F, -0.9829F, -0.0587F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(110, 10).addBox(0.5F, -0.9829F, -0.0587F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 1.4F, -2.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r606 = bone7.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(117, 127).mirror().addBox(-1.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.034F)).mirror(false)
				.texOffs(117, 127).addBox(0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.3F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r607 = bone7.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(91, 98).mirror().addBox(-1.5F, 0.0F, -2.93F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(91, 98).addBox(0.5F, 0.0F, -2.93F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r608 = bone7.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(99, 90).addBox(-1.5F, -0.2288F, -0.0783F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r609 = bone7.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(121, 50).addBox(-1.5F, -0.3203F, -0.8815F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.027F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.3F, -0.8639F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.75F, -4.0F, -0.0436F, 0.0F, 0.0F));

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