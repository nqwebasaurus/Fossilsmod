package fossils.fossils.client.blockentity.model.brachiosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrachiosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat1;
	private final ModelPart moveableFlesh;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;

	public BrachiosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.head = this.neck9.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat1 = this.jaw.getChild("throat1");
		this.moveableFlesh = this.jaw.getChild("moveableFlesh");
		this.leftArm = this.body2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm = this.body2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 1.45F, -25.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(-0.5F, -60.5F, 63.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 103).mirror().addBox(-1.0222F, 2.5921F, 9.8152F, 2.0F, 3.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5399F, 9.33F, 4.7411F, -0.6115F, -0.0179F, -0.4829F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-1.0222F, -1.1339F, -0.4283F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5399F, 9.33F, 4.7411F, -0.9256F, -0.0179F, -0.4829F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(194, 5).mirror().addBox(-1.0F, 12.6854F, 3.2054F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(140, 194).mirror().addBox(-1.0F, 2.6854F, 4.2054F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 7.15F, -3.8162F, -0.6694F, 0.458F, -0.4725F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 68).mirror().addBox(-1.0F, -1.9857F, -0.8812F, 2.0F, 10.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 7.15F, -3.8162F, 0.0375F, 0.458F, -0.4725F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 191).mirror().addBox(-0.9F, -4.0F, -0.2F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8648F, 9.726F, 0.0104F, 0.0351F, -0.292F, -0.4992F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(164, 68).mirror().addBox(-0.3F, -3.0F, -5.5F, 2.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 5.3342F, 0.7682F, -0.3286F, -0.0452F, -0.2615F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-1.0F, 0.0F, -9.8F, 2.0F, 5.0F, 15.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 131).addBox(16.0F, 0.0F, -9.8F, 2.0F, 5.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-8.0F, -2.1068F, 3.7214F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(154, 159).mirror().addBox(-9.5F, -0.3047F, -10.9496F, 2.0F, 7.0F, 11.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(154, 159).addBox(7.5F, -0.3047F, -10.9496F, 2.0F, 7.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -9.126F, 0.1776F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(117, 3).mirror().addBox(-3.0F, 0.1F, -7.5F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 3).addBox(6.0F, 0.1F, -7.5F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.5179F, 0.7188F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(112, 68).mirror().addBox(-9.5F, -3.1F, -5.0F, 2.0F, 5.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 68).addBox(7.5F, -3.1F, -5.0F, 2.0F, 5.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.526F, 1.5776F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(140, 194).addBox(-1.0F, 2.6854F, 4.2054F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(194, 5).addBox(-1.0F, 12.6854F, 3.2054F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3F, 7.15F, -3.8162F, -0.6694F, -0.458F, 0.4725F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 191).addBox(-1.1F, -4.0F, -0.2F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8648F, 9.726F, 0.0104F, 0.0351F, 0.292F, 0.4992F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 68).addBox(-1.0F, -1.9857F, -0.8812F, 2.0F, 10.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.3F, 7.15F, -3.8162F, 0.0375F, -0.458F, 0.4725F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(84, 103).addBox(-0.9778F, 2.5921F, 9.8152F, 2.0F, 3.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.5399F, 9.33F, 4.7411F, -0.6115F, 0.0179F, 0.4829F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 58).addBox(-0.9778F, -1.1339F, -0.4283F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5399F, 9.33F, 4.7411F, -0.9256F, 0.0179F, 0.4829F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(164, 68).addBox(-1.7F, -3.0F, -5.5F, 2.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 5.3342F, 0.7682F, -0.3286F, 0.0452F, 0.2615F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 208).addBox(-0.5F, -4.3F, -1.2F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -7.1121F, -3.1014F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(117, 3).addBox(-0.5F, -3.6F, -2.2F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -6.1274F, 0.7871F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 207).addBox(-0.5F, -3.0F, -2.9F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(157, 125).addBox(-0.5F, -3.0F, 0.3F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.7697F, 6.1328F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(86, 4).addBox(-2.0F, -2.1232F, -6.2257F, 5.0F, 5.0F, 20.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0111F, -3.4302F, -0.4712F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.25F, 8.2F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r21 = tail1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(82, 140).addBox(0.0F, -2.5F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7987F, 11.9454F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(150, 132).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7195F, 8.7841F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(86, 128).addBox(-1.0F, -0.4591F, -1.4913F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 1.3F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 174).addBox(-0.5F, -5.1F, 9.4F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(34, 214).addBox(-0.5F, -4.4F, 5.7F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(147, 170).addBox(-0.5F, -3.8F, 2.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(69, 173).addBox(-0.5F, -3.4F, -0.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7129F, 2.1936F, -0.3229F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(157, 125).addBox(-2.0F, -1.4555F, -0.0038F, 4.0F, 4.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.95F, 13.375F, -0.3099F, 0.1664F, -0.053F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(96, 103).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2409F, 10.1121F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(124, 111).addBox(0.0F, -2.1F, 2.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 126).addBox(0.0F, -3.5F, -0.3F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5768F, 6.4256F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(127, 111).addBox(0.0F, -3.2F, -0.1F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3286F, 3.1107F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 147).addBox(-0.5F, -2.5F, -1.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2789F, 6.2483F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 214).addBox(-0.5F, -2.9F, -0.7F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.321F, 1.9069F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1555F, 10.7962F, -0.3065F, 0.0832F, -0.0263F));

		PartDefinition cube_r30 = tail3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(95, 38).addBox(-1.0F, -0.1F, 0.175F, 3.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1614F, -0.3608F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 68).addBox(0.0F, -2.2F, 14.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(86, 36).addBox(0.0F, -2.2F, 11.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 36).addBox(0.0F, -2.2F, 8.4F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(112, 68).addBox(0.0F, -2.2F, 5.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(137, 23).addBox(0.0F, -2.2F, 1.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(151, 82).addBox(0.0F, -2.1F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7083F, 2.6796F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(9, 158).addBox(0.0F, 7.3F, 11.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 135).addBox(0.0F, 5.2F, 8.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 125).addBox(0.0F, 3.5F, 6.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 103).addBox(0.0F, 1.3F, 3.9F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(0.0F, -1.2F, 1.6F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 24).addBox(0.0F, -2.9F, -0.8F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9193F, 3.1514F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5614F, 19.6142F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition cube_r33 = tail4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(59, 97).addBox(-0.5F, 0.1F, -0.925F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1357F, 0.602F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(85, 126).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4821F, 18.5559F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(95, 126).addBox(0.0F, -3.0F, 12.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(142, 144).addBox(0.0F, -2.3F, 8.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(145, 0).addBox(0.0F, -2.1F, 5.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(151, 0).addBox(0.0F, -1.8F, 2.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(173, 89).addBox(0.0F, -1.6F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.32F, 2.0507F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(155, 46).addBox(0.0F, 20.9F, 25.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 162).addBox(0.0F, 18.6F, 22.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 40).addBox(0.0F, 16.5F, 20.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(164, 23).addBox(0.0F, 14.0F, 17.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 152).addBox(0.0F, 11.0F, 15.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 40).addBox(0.0F, 8.8F, 13.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7759F, -16.4886F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2643F, 19.577F, 0.1855F, 0.3435F, 0.0631F));

		PartDefinition cube_r37 = tail5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(32, 91).addBox(-0.5F, -0.1F, -0.325F, 2.0F, 2.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8186F, 0.1841F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -1.2F, 11.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 48).addBox(0.0F, -1.2F, 8.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 51).addBox(0.0F, -1.2F, 5.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 91).addBox(0.0F, -1.2F, 2.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3651F, -0.862F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(73, 3).addBox(0.0F, -0.5F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 91).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8749F, 17.9308F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(103, 13).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3719F, 15.2247F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, 4.3F, 6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 109).addBox(0.0F, 2.9F, 4.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 9).addBox(0.0F, 0.3F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 33).addBox(0.0F, -1.3F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.538F, 3.705F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(131, 100).addBox(0.0F, 22.5F, 27.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.893F, -35.9065F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5F, -0.4937F, -0.4528F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0186F, 20.6591F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 14).addBox(0.0F, 3.9F, 11.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 109).addBox(0.0F, 3.2F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 109).addBox(0.0F, 2.7F, 8.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 109).addBox(0.0F, 1.9F, 6.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 50).addBox(0.0F, 1.1F, 4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0998F, -2.7812F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2563F, 19.5472F, -0.0504F, -0.523F, 0.0252F));

		PartDefinition cube_r44 = tail7.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(144, 40).addBox(0.0F, 0.0585F, 0.075F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.7872F, -0.0769F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(139, 127).addBox(-0.5F, -0.3857F, -0.1616F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0887F, 14.9559F, -0.1181F, -0.7383F, 0.0797F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, -7.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-14.5F, -8.9752F, -13.4672F, 29.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 26.7396F, -24.1707F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 24).addBox(-12.5F, -4.5F, 2.0F, 25.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 22.0396F, -24.4707F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(121, 91).addBox(-3.0F, -0.3788F, 0.1209F, 5.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.2897F, -11.5791F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(190, 204).addBox(-1.5396F, -4.8359F, -1.6255F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -3.8911F, 0.647F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(204, 51).mirror().addBox(-3.0641F, 0.8549F, -0.8745F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -3.8911F, 0.647F, -0.5068F, 0.1984F, 0.3412F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(204, 55).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -6.1149F, -4.1538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(204, 192).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -8.8149F, -8.1538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(205, 3).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -12.4149F, -13.0538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(205, 7).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -17.0149F, -18.4538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(205, 152).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -20.6149F, -23.4538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(206, 38).mirror().addBox(-3.1585F, 0.7304F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -24.117F, -26.3577F, -0.7546F, 0.2765F, 0.2826F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(204, 51).addBox(-1.9359F, 0.8549F, -0.8745F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -3.8911F, 0.647F, -0.5068F, -0.1984F, -0.3412F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 152).addBox(-1.5396F, -6.1418F, -1.482F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -5.7149F, -4.1538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(58, 109).mirror().addBox(-7.975F, -0.2476F, 4.1889F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.0586F, -0.4653F, -1.398F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-14.8883F, -2.3193F, 0.8661F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.0349F, -0.3362F, -1.4073F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(-16.228F, -3.6236F, -3.0799F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.0202F, -0.2501F, -1.4115F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 168).mirror().addBox(-30.527F, -12.0956F, -0.1525F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -11.509F, -13.9441F, 0.0789F, -0.1941F, -1.4303F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(162, 51).mirror().addBox(-35.2205F, -14.0071F, -0.2746F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -15.509F, -19.9441F, 0.1325F, -0.1314F, -1.4314F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(160, 144).mirror().addBox(-39.2634F, -14.0062F, -0.5698F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -19.509F, -23.9441F, 0.1337F, -0.1228F, -1.4304F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 97).mirror().addBox(-43.0653F, -13.0135F, 0.0079F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1203F, -23.509F, -28.9441F, 0.2231F, -0.1177F, -1.4381F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(146, 102).mirror().addBox(-23.8859F, -2.3177F, 0.0079F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1203F, -23.509F, -28.9441F, 0.1443F, -0.2071F, -0.96F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(141, 60).mirror().addBox(-24.52F, -3.1068F, -0.5698F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -19.509F, -23.9441F, 0.0617F, -0.1706F, -0.9475F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(145, 14).mirror().addBox(-24.4823F, -3.1274F, -0.2746F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -15.509F, -19.9441F, 0.0566F, -0.1776F, -0.9477F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(23, 115).mirror().addBox(-21.196F, -2.5988F, -0.1245F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -11.509F, -13.9441F, -0.0209F, -0.2083F, -0.9405F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-4.5364F, -1.667F, -3.0519F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.1351F, -0.212F, -0.9197F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(188, 138).mirror().addBox(-3.6912F, -0.7229F, 0.8941F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.1901F, -0.2811F, -0.9062F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 159).mirror().addBox(-0.221F, -0.2535F, 4.2169F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.277F, -0.3831F, -0.8779F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(177, 54).mirror().addBox(4.374F, -2.1372F, 4.1291F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.4051F, -0.2664F, -0.4816F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 114).mirror().addBox(4.6286F, -2.7625F, 0.7994F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.2867F, -0.2041F, -0.5093F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(122, 55).mirror().addBox(5.2686F, -4.0633F, -3.1622F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, 2.2648F, -8.5543F, -0.2095F, -0.161F, -0.5233F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(12, 171).mirror().addBox(-6.7347F, -0.094F, -0.0208F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -11.509F, -13.9441F, -0.1034F, -0.2009F, -0.5394F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(203, 48).mirror().addBox(-6.28F, -0.8548F, -0.181F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -15.509F, -19.9441F, -0.0198F, -0.2023F, -0.5485F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(82, 176).mirror().addBox(-6.3118F, -0.8203F, -0.4756F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1203F, -19.509F, -23.9441F, -0.0123F, -0.1978F, -0.5489F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(201, 142).mirror().addBox(-5.4147F, -0.3356F, 0.0888F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1203F, -23.509F, -28.9441F, 0.0499F, -0.2629F, -0.5601F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(201, 142).addBox(-17.9852F, -10.1867F, -6.9253F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.0656F, 0.0767F, 0.5404F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(146, 102).addBox(-15.0729F, -4.7448F, -6.6821F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.0345F, 0.0793F, 0.9343F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(84, 97).addBox(1.2409F, -5.9504F, -6.6821F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, 0.0061F, 0.0863F, 1.4159F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(82, 176).addBox(-16.2547F, -7.0508F, -2.4074F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.0807F, 0.0857F, 0.5392F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(141, 60).addBox(-12.1997F, -2.5237F, -2.2041F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.045F, 0.0933F, 0.9334F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(160, 144).addBox(4.815F, -5.307F, -2.2041F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, 0.0034F, 0.1035F, 1.4157F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(203, 48).addBox(-14.5929F, -4.0216F, 2.2207F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.0882F, 0.0902F, 0.5385F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(145, 14).addBox(-9.4291F, -0.3754F, 2.3855F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.0502F, 0.1004F, 0.9329F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(162, 51).addBox(8.2646F, -4.6807F, 2.3855F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, 0.002F, 0.1121F, 1.4155F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(12, 171).addBox(-12.9444F, -0.9252F, 8.2973F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.1486F, 0.1258F, 0.532F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(23, 115).addBox(-6.6208F, 1.8354F, 8.4235F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.0922F, 0.1563F, 0.9275F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 168).addBox(8.2058F, -2.2444F, 8.3955F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -5.509F, -23.9441F, -0.009F, 0.1811F, 1.4139F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(204, 55).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -6.1149F, -4.1538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(204, 192).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -8.8149F, -8.1538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(143, 23).addBox(-1.5396F, -7.1418F, -1.482F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -8.4149F, -8.1538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(205, 3).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -12.4149F, -13.0538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 171).addBox(-1.5396F, -7.1418F, -1.482F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -12.0149F, -13.0538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(205, 7).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -17.0149F, -18.4538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(199, 204).addBox(-1.5396F, -7.1418F, -1.482F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -16.6149F, -18.4538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(205, 152).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -20.6149F, -23.4538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(37, 201).addBox(-1.5396F, -8.1418F, -1.482F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -20.2149F, -23.4538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(58, 109).addBox(-0.025F, -0.2476F, 4.1889F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.0586F, 0.4653F, 1.398F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 159).addBox(-4.779F, -0.2535F, 4.2169F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.277F, 0.3831F, 0.8779F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(177, 54).addBox(-10.374F, -2.1372F, 4.1291F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.4051F, 0.2664F, 0.4816F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(188, 138).addBox(-5.3088F, -0.7229F, 0.8941F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.1901F, 0.2811F, 0.9062F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 74).addBox(2.8883F, -2.3193F, 0.8661F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.0349F, 0.3362F, 1.4073F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(84, 114).addBox(-10.6286F, -2.7625F, 0.7994F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.2867F, 0.2041F, 0.5093F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(32, 82).addBox(3.228F, -3.6236F, -3.0799F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.0202F, 0.2501F, 1.4115F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(86, 48).addBox(-6.4636F, -1.667F, -3.0519F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.1351F, 0.212F, 0.9197F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(122, 55).addBox(-11.2686F, -4.0633F, -3.1622F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, 2.2648F, -8.5543F, -0.2095F, 0.161F, 0.5233F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(206, 38).addBox(-1.8415F, 0.7304F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -24.117F, -26.3577F, -0.7546F, -0.2765F, -0.2826F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(46, 201).addBox(-1.5F, -7.5F, -2.25F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -24.117F, -26.3577F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(38, 58).addBox(-2.0F, -0.0512F, -0.3866F, 5.0F, 5.0F, 27.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -26.2897F, -30.9791F, -0.7069F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.5F, -32.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(199, 32).mirror().addBox(-18.3625F, -0.0357F, 2.4841F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4521F, 38.7079F, -25.4358F, -0.2793F, 0.7305F, 0.155F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(23, 109).mirror().addBox(-17.332F, 3.7698F, -1.7009F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9521F, 36.4079F, -19.6358F, 0.1948F, 0.724F, 0.1364F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(163, 86).mirror().addBox(-21.332F, 3.7698F, -1.7009F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, 0.2596F, 0.7633F, 0.1116F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(117, 20).mirror().addBox(-30.332F, 3.7698F, -1.7009F, 24.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, 0.0708F, 1.126F, -0.0462F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(162, 48).mirror().addBox(-24.332F, 3.7698F, -1.7009F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, 0.1447F, 0.9432F, 0.017F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(84, 100).mirror().addBox(-27.332F, 3.7698F, -1.7009F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, 0.0629F, 1.0297F, -0.0551F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(193, 121).mirror().addBox(-7.4297F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, -0.8062F, 0.8854F, -0.9823F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(196, 0).mirror().addBox(-7.4297F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, -0.5591F, 0.7969F, -0.7981F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(199, 26).mirror().addBox(-7.4297F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, -0.3114F, 0.7206F, -0.6195F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(195, 20).mirror().addBox(-7.4297F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6521F, 37.0079F, -18.4358F, -0.6958F, 0.8219F, -0.9009F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(199, 23).mirror().addBox(-7.4297F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9521F, 36.4079F, -19.6358F, -0.3249F, 0.6598F, -0.5594F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(199, 29).mirror().addBox(-7.9292F, -4.9763F, 2.5597F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4521F, 38.7079F, -25.4358F, -0.6655F, 0.4554F, -0.4047F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(172, 141).mirror().addBox(-12.6639F, -0.3908F, -1.5725F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6373F, 36.4248F, -21.7023F, -0.4992F, 0.575F, -0.0031F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(145, 0).mirror().addBox(-3.5F, -1.0F, -1.0F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(190, 38).mirror().addBox(-1.5F, -1.0F, -8.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 31.6251F, -27.5594F, -0.6724F, 0.1654F, 0.2039F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(165, 153).mirror().addBox(-3.9F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 13.4415F, -37.3085F, -1.2345F, 0.3717F, 0.3077F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-10.7757F, -0.3829F, -0.8468F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, 11.6415F, -35.9085F, -1.1953F, 0.5763F, 0.393F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 118).mirror().addBox(-1.5F, -6.5F, -6.5F, 3.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.6893F, 21.968F, -31.2624F, -0.5087F, -0.8593F, -0.752F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(117, 113).mirror().addBox(-20.0F, 19.7569F, 4.0052F, 3.0F, 15.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -14.7F, -14.65F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(23, 183).mirror().addBox(-1.9F, -9.5611F, -3.345F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.5F, 10.26F, -16.6282F, -0.6724F, 0.1654F, 0.2039F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(146, 81).mirror().addBox(-0.5667F, -9.2443F, -8.1804F, 3.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.1177F, 3.1537F, -9.0395F, -0.62F, 0.3237F, 0.4191F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 118).addBox(-1.5F, -6.5F, -6.5F, 3.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.6893F, 21.968F, -31.2624F, -0.5087F, 0.8593F, 0.752F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(117, 113).addBox(17.0F, 19.7569F, 4.0052F, 3.0F, 15.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 82).addBox(-2.0F, -0.2431F, -0.4948F, 5.0F, 5.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.7F, -14.65F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(23, 183).addBox(-1.1F, -9.5611F, -3.345F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5F, 10.26F, -16.6282F, -0.6724F, -0.1654F, -0.2039F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(146, 81).addBox(-2.4333F, -9.2443F, -8.1804F, 3.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.1177F, 3.1537F, -9.0395F, -0.62F, -0.3237F, -0.4191F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(76, 81).addBox(-0.2243F, -0.3829F, -0.8468F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 11.6415F, -35.9085F, -1.1953F, -0.5763F, -0.393F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(165, 153).addBox(-0.1F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 13.4415F, -37.3085F, -1.2345F, -0.3717F, -0.3077F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(190, 95).addBox(-1.0F, -0.9073F, -0.1615F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 21.0489F, -36.3128F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(189, 51).addBox(-1.5F, 2.5F, -10.5F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 22.7273F, -32.5363F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(23, 109).addBox(6.332F, 3.7698F, -1.7009F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9521F, 36.4079F, -19.6358F, 0.1948F, -0.724F, -0.1364F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(199, 23).addBox(-1.5703F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9521F, 36.4079F, -19.6358F, -0.3249F, -0.6598F, 0.5594F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(193, 121).addBox(-1.5703F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, -0.8062F, -0.8854F, 0.9823F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(117, 20).addBox(6.332F, 3.7698F, -1.7009F, 24.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, 0.0708F, -1.126F, 0.0462F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(195, 20).addBox(-1.5703F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, -0.6958F, -0.8219F, 0.9009F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(84, 100).addBox(6.332F, 3.7698F, -1.7009F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, 0.0629F, -1.0297F, 0.0551F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(196, 0).addBox(-1.5703F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, -0.5591F, -0.7969F, 0.7981F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(162, 48).addBox(6.332F, 3.7698F, -1.7009F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, 0.1447F, -0.9432F, -0.017F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(199, 26).addBox(-1.5703F, 0.059F, -1.387F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, -0.3114F, -0.7206F, 0.6195F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(163, 86).addBox(6.332F, 3.7698F, -1.7009F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6521F, 37.0079F, -18.4358F, 0.2596F, -0.7633F, -0.1116F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(199, 32).addBox(9.3625F, -0.0357F, 2.4841F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4521F, 38.7079F, -25.4358F, -0.2793F, -0.7305F, -0.155F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(199, 29).addBox(-1.0708F, -4.9763F, 2.5597F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4521F, 38.7079F, -25.4358F, -0.6655F, -0.4554F, 0.4047F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(172, 141).addBox(-0.3361F, -0.3908F, -1.5725F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6373F, 36.4248F, -21.7023F, -0.4992F, -0.575F, 0.0031F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(145, 0).addBox(-2.5F, -1.0F, -1.0F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(190, 38).addBox(-2.5F, -1.0F, -8.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 31.6251F, -27.5594F, -0.6724F, -0.1654F, -0.2039F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(206, 61).mirror().addBox(-3.1585F, 1.7304F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -5.417F, 0.4423F, -0.7546F, 0.2765F, 0.2826F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-46.0416F, -13.308F, -1.2529F, 26.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8573F, -3.9658F, -1.4047F, 0.0115F, -0.0518F, -1.4163F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(76, 65).mirror().addBox(-31.0626F, -5.0899F, -1.263F, 28.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, 8.0342F, -7.4047F, -0.0071F, -0.0141F, -1.4625F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(-30.5745F, -4.5664F, -4.9937F, 31.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, 8.0342F, -7.4047F, -0.0084F, 0.0036F, -1.4707F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(160, 17).mirror().addBox(-1.8099F, -4.2867F, -4.9937F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, 8.0342F, -7.4047F, -0.0058F, 0.0071F, -0.9907F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(142, 57).mirror().addBox(-5.1456F, -3.1404F, -1.263F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, 8.0342F, -7.4047F, -0.0129F, -0.0092F, -0.9826F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-24.0009F, -2.5899F, -1.2529F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8573F, -3.9658F, -1.4047F, -0.0138F, -0.0512F, -0.9357F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(199, 35).mirror().addBox(-5.646F, -0.5389F, -1.169F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8573F, -3.9658F, -1.4047F, -0.0357F, -0.0588F, -0.5424F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(203, 95).mirror().addBox(11.5634F, -8.2563F, -1.492F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, 8.0342F, -7.4047F, -0.0187F, -0.0203F, -0.59F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(201, 16).mirror().addBox(14.1447F, -10.5784F, -5.2741F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, 8.0342F, -7.4047F, -0.006F, -0.0079F, -0.5983F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(86, 33).addBox(6.3529F, -5.2136F, 3.953F, 26.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, 0.0115F, 0.0518F, 1.4163F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(36, 48).addBox(-10.8787F, -1.7308F, 3.953F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0138F, 0.0512F, 0.9357F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(199, 35).addBox(-15.4401F, -5.8335F, 3.7683F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0357F, 0.0588F, 0.5424F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(76, 65).addBox(3.0626F, -5.0899F, -1.263F, 28.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0071F, 0.0141F, 1.4625F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(142, 57).addBox(-13.8544F, -3.1404F, -1.263F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0129F, 0.0092F, 0.9826F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(203, 95).addBox(-17.5634F, -8.2563F, -1.492F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0187F, 0.0203F, 0.59F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 62).addBox(-0.4255F, -4.5664F, -4.9937F, 31.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0084F, -0.0036F, 1.4707F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(160, 17).addBox(-17.1901F, -4.2867F, -4.9937F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.0058F, -0.0071F, 0.9907F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(201, 16).addBox(-20.1447F, -10.5784F, -5.2741F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, 8.0342F, -7.4047F, -0.006F, 0.0079F, 0.5983F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(207, 68).mirror().addBox(-3.1585F, 1.7304F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -10.317F, -3.8577F, -0.7546F, 0.2765F, 0.2826F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(209, 72).mirror().addBox(-2.1585F, 1.7304F, -0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -14.917F, -9.5577F, -0.7546F, 0.2765F, 0.2826F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(206, 61).addBox(-1.8415F, 1.7304F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -5.417F, 0.4423F, -0.7546F, -0.2765F, -0.2826F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(122, 36).addBox(-1.5F, -7.5F, -2.25F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -5.417F, 0.4423F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(207, 68).addBox(-1.8415F, 1.7304F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.317F, -3.8577F, -0.7546F, -0.2765F, -0.2826F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 131).addBox(-1.5F, -7.5F, -2.25F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -10.317F, -3.8577F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(209, 72).addBox(-1.8415F, 1.7304F, -0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -14.917F, -9.5577F, -0.7546F, -0.2765F, -0.2826F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(36, 51).addBox(-1.0F, -7.5F, -3.25F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -14.917F, -9.5577F, -0.7941F, 0.0F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -14.5815F, -17.0953F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(201, 106).mirror().addBox(-5.7572F, 0.2511F, -0.9792F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.3902F, -2.2171F, 0.9992F, 0.5741F, -0.3105F));

		PartDefinition cube_r182 = neck.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(160, 105).mirror().addBox(-24.4088F, -1.903F, -1.0676F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.3902F, -2.2171F, 0.7861F, 0.8936F, -0.6232F));

		PartDefinition cube_r183 = neck.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-53.7206F, -12.8871F, -1.0676F, 33.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.3902F, -2.2171F, 0.0754F, 1.1107F, -1.4486F));

		PartDefinition cube_r184 = neck.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(-44.9742F, -12.7475F, -3.0222F, 26.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0098F, -7.5171F, -0.0851F, 1.1666F, -1.595F));

		PartDefinition cube_r185 = neck.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(160, 108).mirror().addBox(-22.7952F, -2.5856F, -3.0222F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0098F, -7.5171F, 0.7892F, 0.9808F, -0.6213F));

		PartDefinition cube_r186 = neck.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(106, 171).mirror().addBox(-4.56F, -0.99F, -2.9582F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0098F, -7.5171F, 1.0351F, 0.6563F, -0.2903F));

		PartDefinition cube_r187 = neck.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(201, 106).addBox(-0.2428F, 0.2511F, -0.9792F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.3902F, -2.2171F, 0.9992F, -0.5741F, 0.3105F));

		PartDefinition cube_r188 = neck.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(160, 105).addBox(5.4088F, -1.903F, -1.0676F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.3902F, -2.2171F, 0.7861F, -0.8936F, 0.6232F));

		PartDefinition cube_r189 = neck.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(73, 0).addBox(20.7206F, -12.8871F, -1.0676F, 33.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.3902F, -2.2171F, 0.0754F, -1.1107F, 1.4486F));

		PartDefinition cube_r190 = neck.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(106, 171).addBox(-1.44F, -0.99F, -2.9582F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0098F, -7.5171F, 1.0351F, -0.6563F, 0.2903F));

		PartDefinition cube_r191 = neck.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(160, 108).addBox(3.7952F, -2.5856F, -3.0222F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0098F, -7.5171F, 0.7892F, -0.9808F, 0.6213F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(86, 30).addBox(18.9742F, -12.7475F, -3.0222F, 26.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0098F, -7.5171F, -0.0851F, -1.1666F, 1.595F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(87, 103).addBox(-1.5F, 0.0231F, -0.7745F, 4.0F, 5.0F, 17.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 1.3823F, -14.7032F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(219, 35).mirror().addBox(2.5133F, -9.3793F, 3.9343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0639F, 1.8852F, -5.384F, 1.7898F, 0.2765F, 0.6888F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(113, 107).mirror().addBox(-0.9722F, -7.9429F, 1.9343F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0639F, 1.8852F, -5.384F, 1.7838F, -0.15F, 0.5958F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(219, 35).addBox(-3.5133F, -9.3793F, 3.9343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0639F, 1.8852F, -5.384F, 1.7898F, -0.2765F, -0.6888F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(209, 136).mirror().addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.9261F, -1.8248F, 0.1939F, -0.0796F, 0.3849F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(209, 136).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.9261F, -1.8248F, 0.1939F, 0.0796F, -0.3849F));

		PartDefinition cube_r199 = neck.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(17, 195).addBox(-3.0639F, -12.9152F, -7.5074F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0639F, -0.3148F, 2.316F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r200 = neck.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(113, 107).addBox(-0.0278F, -7.9429F, 1.9343F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0639F, 1.8852F, -5.384F, 1.7838F, 0.15F, -0.5958F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(59, 190).addBox(-3.0639F, -12.3152F, -7.5074F, 0.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0639F, 1.8852F, -5.384F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(80, 68).addBox(-2.0F, -2.5165F, -22.3423F, 4.0F, 5.0F, 23.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.9823F, -15.0032F, -0.0417F, -0.1893F, -0.3415F));

		PartDefinition cube_r202 = neck2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 109).addBox(-3.2326F, -12.1106F, -12.9517F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r203 = neck2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(213, 170).mirror().addBox(-2.8944F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.1854F, 3.6315F, 1.6027F, 0.0142F, -0.4187F));

		PartDefinition cube_r204 = neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(50, 118).mirror().addBox(-0.8123F, -0.2683F, -0.8761F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 4.7744F, 1.5301F, -0.0814F, 0.2299F));

		PartDefinition cube_r205 = neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(84, 215).mirror().addBox(-0.4636F, -4.4176F, -0.8633F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 1.6744F, 1.5501F, -0.1108F, 0.2244F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(89, 216).mirror().addBox(-0.4636F, -4.8741F, -1.1039F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 1.6744F, 1.6199F, -0.1108F, 0.2244F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(48, 214).mirror().addBox(-0.4361F, -9.8134F, -1.5813F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 1.6744F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(208, 76).mirror().addBox(-2.7678F, -10.8185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.6854F, 3.6315F, 1.6046F, 0.0017F, -1.2523F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(63, 131).mirror().addBox(1.1161F, -10.6185F, 1.297F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.6854F, 3.6315F, 1.603F, -0.0105F, -0.886F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(219, 57).mirror().addBox(4.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.1854F, 3.6315F, 1.5676F, 0.4356F, 0.6108F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(173, 207).mirror().addBox(-1.4585F, -13.3405F, 3.8989F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.1854F, 3.6315F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(213, 182).mirror().addBox(-2.8944F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.3854F, -8.0685F, 1.6027F, 0.0142F, -0.4187F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(24, 213).mirror().addBox(-3.1013F, -0.3034F, -1.0748F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 5.1854F, -6.7685F, 1.6021F, -0.0613F, 0.236F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(187, 216).mirror().addBox(-2.2187F, -6.564F, -4.3083F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.5345F, -0.091F, 0.2331F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(131, 215).mirror().addBox(-2.2187F, -5.8798F, -4.1778F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.4647F, -0.091F, 0.2331F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(155, 178).mirror().addBox(-2.1167F, -13.2241F, -4.9562F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.4337F, -0.0606F, 0.2391F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(208, 204).mirror().addBox(-2.7678F, -11.2185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.6046F, 0.0017F, -1.2523F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(214, 89).mirror().addBox(1.1161F, -11.2185F, 1.297F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.603F, -0.0105F, -0.886F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(88, 203).mirror().addBox(-1.4585F, -13.3405F, 3.8989F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.3854F, -8.0685F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(219, 63).mirror().addBox(4.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.3854F, -8.0685F, 1.5676F, 0.4356F, 0.6108F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(219, 57).addBox(-5.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, 1.5676F, -0.4356F, -0.6108F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(173, 207).addBox(0.4585F, -13.3405F, 3.8989F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(89, 216).addBox(-0.5364F, -4.8741F, -1.1039F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 1.6744F, 1.6199F, 0.1108F, -0.2244F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(50, 118).addBox(-0.1877F, -0.2683F, -0.8761F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 4.7744F, 1.5301F, 0.0814F, -0.2299F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(84, 215).addBox(-0.5364F, -4.4176F, -0.8633F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 1.6744F, 1.5501F, 0.1108F, -0.2244F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(48, 214).addBox(-0.5639F, -9.8134F, -1.5813F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 1.6744F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 131).addBox(-4.1161F, -10.6185F, 1.297F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.2326F, 1.6854F, 3.6315F, 1.603F, 0.0105F, 0.886F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(208, 76).addBox(-2.2322F, -10.8185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 1.6854F, 3.6315F, 1.6046F, -0.0017F, 1.2523F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(213, 170).addBox(-2.1056F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, 1.6027F, -0.0142F, 0.4187F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(213, 182).addBox(-2.1056F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, 1.6027F, -0.0142F, 0.4187F));

		PartDefinition cube_r231 = neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(24, 213).addBox(2.1013F, -0.3034F, -1.0748F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 5.1854F, -6.7685F, 1.6021F, 0.0613F, -0.236F));

		PartDefinition cube_r232 = neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(187, 216).addBox(1.2187F, -6.564F, -4.3083F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.5345F, 0.091F, -0.2331F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(131, 215).addBox(1.2187F, -5.8798F, -4.1778F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.4647F, 0.091F, -0.2331F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(155, 178).addBox(1.1167F, -13.2241F, -4.9562F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.4337F, 0.0606F, -0.2391F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(208, 204).addBox(-2.2322F, -11.2185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.6046F, -0.0017F, 1.2523F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(214, 89).addBox(-4.1161F, -11.2185F, 1.297F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.603F, 0.0105F, 0.886F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(170, 147).addBox(-3.2326F, -12.1106F, -12.9517F, 0.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(88, 203).addBox(0.4585F, -13.3405F, 3.8989F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(219, 63).addBox(-5.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, 1.5676F, -0.4356F, -0.6108F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4165F, -22.3423F, -0.2567F, -0.0983F, -0.1999F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(211, 11).mirror().addBox(-2.1276F, -13.3292F, -1.6064F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6825F, 0.0496F, -0.4161F));

		PartDefinition cube_r241 = neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(14, 212).mirror().addBox(-0.5178F, 10.4579F, -1.6457F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.8041F, 5.2076F, 0.9094F, 1.8094F, -0.0814F, 0.2299F));

		PartDefinition cube_r242 = neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(147, 210).mirror().addBox(-0.5178F, 0.0148F, -0.7078F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.8041F, 5.2076F, 0.9094F, 1.7221F, -0.0814F, 0.2299F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(192, 216).mirror().addBox(-2.2988F, -0.4296F, -0.9172F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 5.9426F, -5.9229F, 1.6199F, -0.1108F, 0.2244F));

		PartDefinition cube_r244 = neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(215, 209).mirror().addBox(-2.2988F, 0.0031F, -0.367F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 5.9426F, -5.9229F, 1.5501F, -0.1108F, 0.2244F));

		PartDefinition cube_r245 = neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(208, 109).mirror().addBox(-4.8288F, -2.2093F, -0.9276F, 5.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.7738F, 0.6486F, -9.2363F, 1.632F, 0.0846F, -1.2511F));

		PartDefinition cube_r246 = neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(208, 209).mirror().addBox(-2.3422F, -15.9203F, -4.6251F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 2.6426F, 2.6771F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(216, 103).mirror().addBox(0.8386F, -13.9554F, 1.0517F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6582F, 0.057F, -0.8847F));

		PartDefinition cube_r248 = neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(20, 131).mirror().addBox(-1.1464F, -16.0703F, 3.6187F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6394F, -0.0509F, 0.6103F));

		PartDefinition cube_r249 = neck3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(190, 38).mirror().addBox(5.7903F, -16.8188F, 4.6187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6447F, 0.3844F, 0.6416F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(213, 42).mirror().addBox(-2.2F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6544F, 4.7525F, -23.5084F, 1.6426F, 0.0319F, -0.4177F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(29, 214).mirror().addBox(-1.779F, 9.1588F, -1.9358F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.0553F, 6.5796F, -8.0078F, 1.7288F, -0.0403F, 0.2349F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(19, 212).mirror().addBox(-1.779F, -1.2609F, -0.9521F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.0553F, 6.5796F, -8.0078F, 1.6241F, -0.0403F, 0.2349F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(182, 207).mirror().addBox(-0.6199F, -0.8565F, -1.1327F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 5.1796F, -19.6078F, 1.4572F, -0.0788F, 0.2374F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(9, 131).mirror().addBox(-0.6199F, -0.414F, -0.6009F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 5.1796F, -19.6078F, 1.4136F, -0.0788F, 0.2374F));

		PartDefinition cube_r255 = neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(140, 210).mirror().addBox(-1.039F, -15.9229F, -3.0449F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 3.6796F, -11.5078F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r256 = neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(11, 191).mirror().addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.3413F, 2.7909F, -23.3153F, 1.6232F, 0.037F, -1.1299F));

		PartDefinition cube_r257 = neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(216, 145).mirror().addBox(1.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 2.5796F, -11.5078F, 1.6306F, 0.0233F, -0.8858F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(54, 145).mirror().addBox(-0.5092F, -13.5251F, 2.3438F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, 1.1403F, -13.9242F, 1.6036F, -0.0258F, 0.6117F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(216, 17).mirror().addBox(5.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, 1.1403F, -13.9242F, 1.6066F, 0.4103F, 0.6268F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(211, 11).addBox(-2.8724F, -13.3292F, -1.6064F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6825F, -0.0496F, 0.4161F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 212).addBox(-0.4822F, 10.4579F, -1.6457F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.8041F, 5.2076F, 0.9094F, 1.8094F, 0.0814F, -0.2299F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(147, 210).addBox(-0.4822F, 0.0148F, -0.7078F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.8041F, 5.2076F, 0.9094F, 1.7221F, 0.0814F, -0.2299F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(192, 216).addBox(1.2988F, -0.4296F, -0.9172F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.3332F, 5.9426F, -5.9229F, 1.6199F, 0.1108F, -0.2244F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(215, 209).addBox(1.2988F, 0.0031F, -0.367F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3332F, 5.9426F, -5.9229F, 1.5501F, 0.1108F, -0.2244F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(208, 209).addBox(1.3422F, -15.9203F, -4.6251F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3332F, 2.6426F, 2.6771F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r266 = neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(208, 109).addBox(-0.1712F, -2.2093F, -0.9276F, 5.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.7738F, 0.6486F, -9.2363F, 1.632F, -0.0846F, 1.2511F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(216, 103).addBox(-3.8386F, -13.9554F, 1.0517F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6582F, -0.057F, 0.8847F));

		PartDefinition cube_r268 = neck3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(190, 38).addBox(-6.7903F, -16.8188F, 4.6187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6447F, -0.3844F, -0.6416F));

		PartDefinition cube_r269 = neck3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(170, 168).addBox(-3.3332F, -11.5648F, -15.6572F, 0.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r270 = neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(20, 131).addBox(0.1464F, -16.0703F, 3.6187F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6394F, 0.0509F, -0.6103F));

		PartDefinition cube_r271 = neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 82).addBox(-3.1163F, -9.2853F, -13.0446F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, 1.1403F, -13.9242F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r272 = neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(216, 17).addBox(-6.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, 1.1403F, -13.9242F, 1.6066F, -0.4103F, -0.6268F));

		PartDefinition cube_r273 = neck3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(54, 145).addBox(-0.4908F, -13.5251F, 2.3438F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, 1.1403F, -13.9242F, 1.6036F, 0.0258F, -0.6117F));

		PartDefinition cube_r274 = neck3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(216, 145).addBox(-4.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(4.9553F, 2.5796F, -11.5078F, 1.6306F, -0.0233F, 0.8858F));

		PartDefinition cube_r275 = neck3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(140, 210).addBox(0.039F, -15.9229F, -3.0449F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 3.6796F, -11.5078F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r276 = neck3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(11, 191).addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.3413F, 2.7909F, -23.3153F, 1.6232F, -0.037F, 1.1299F));

		PartDefinition cube_r277 = neck3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(9, 131).addBox(-0.3801F, -0.414F, -0.6009F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 5.1796F, -19.6078F, 1.4136F, 0.0788F, -0.2374F));

		PartDefinition cube_r278 = neck3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(182, 207).addBox(-0.3801F, -0.8565F, -1.1327F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.9553F, 5.1796F, -19.6078F, 1.4572F, 0.0788F, -0.2374F));

		PartDefinition cube_r279 = neck3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(19, 212).addBox(0.779F, -1.2609F, -0.9521F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.0553F, 6.5796F, -8.0078F, 1.6241F, 0.0403F, -0.2349F));

		PartDefinition cube_r280 = neck3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(29, 214).addBox(0.779F, 9.1588F, -1.9358F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.0553F, 6.5796F, -8.0078F, 1.7288F, 0.0403F, -0.2349F));

		PartDefinition cube_r281 = neck3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(213, 42).addBox(-2.8F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6544F, 4.7525F, -23.5084F, 1.6426F, -0.0319F, 0.4177F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(50, 24).addBox(0.25F, 0.2F, -0.35F, 3.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -0.5199F, -28.1713F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(63, 120).addBox(-1.5F, -1.7651F, -14.7846F, 3.0F, 4.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.4801F, -28.2213F, -0.1292F, -0.0659F, -0.1674F));

		PartDefinition cube_r283 = neck4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(213, 166).mirror().addBox(-2.2F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6544F, 3.5073F, -10.2717F, 1.6426F, 0.0319F, -0.4177F));

		PartDefinition cube_r284 = neck4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(202, 216).mirror().addBox(-0.4823F, 15.701F, -2.1446F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-6.3066F, 4.3372F, 3.865F, 1.7118F, -0.0362F, 0.2356F));

		PartDefinition cube_r285 = neck4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(74, 197).mirror().addBox(-0.4823F, -0.7625F, -0.5063F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-6.3066F, 4.3372F, 3.865F, 1.6071F, -0.0362F, 0.2356F));

		PartDefinition cube_r286 = neck4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(64, 208).mirror().addBox(-0.5742F, -0.852F, -1.3273F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 3.4344F, -6.3711F, 1.5254F, -0.095F, 0.2315F));

		PartDefinition cube_r287 = neck4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(131, 36).mirror().addBox(-0.5742F, -0.401F, -0.7952F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 3.4344F, -6.3711F, 1.4817F, -0.095F, 0.2315F));

		PartDefinition cube_r288 = neck4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(110, 212).mirror().addBox(-1.039F, -14.9229F, -3.0449F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 2.1344F, 1.7289F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r289 = neck4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(211, 156).mirror().addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.3413F, 1.5457F, -10.0786F, 1.6232F, 0.037F, -1.1299F));

		PartDefinition cube_r290 = neck4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(152, 217).mirror().addBox(1.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 1.3344F, 1.7289F, 1.6306F, 0.0233F, -0.8858F));

		PartDefinition cube_r291 = neck4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(112, 198).mirror().addBox(-0.5092F, -13.5251F, 2.3438F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, -0.1049F, -0.6875F, 1.6036F, -0.0258F, 0.6117F));

		PartDefinition cube_r292 = neck4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(161, 217).mirror().addBox(5.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, -0.1049F, -0.6875F, 1.6066F, 0.4103F, 0.6268F));

		PartDefinition cube_r293 = neck4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(213, 166).addBox(-2.8F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6544F, 3.5073F, -10.2717F, 1.6426F, -0.0319F, 0.4177F));

		PartDefinition cube_r294 = neck4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(202, 216).addBox(-0.5177F, 15.701F, -2.1446F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(6.3066F, 4.3372F, 3.865F, 1.7118F, 0.0362F, -0.2356F));

		PartDefinition cube_r295 = neck4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(74, 197).addBox(-0.5177F, -0.7625F, -0.5063F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(6.3066F, 4.3372F, 3.865F, 1.6071F, 0.0362F, -0.2356F));

		PartDefinition cube_r296 = neck4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(64, 208).addBox(-0.4258F, -0.852F, -1.3273F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.9553F, 3.4344F, -6.3711F, 1.5254F, 0.095F, -0.2315F));

		PartDefinition cube_r297 = neck4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(131, 36).addBox(-0.4258F, -0.401F, -0.7952F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 3.4344F, -6.3711F, 1.4817F, 0.095F, -0.2315F));

		PartDefinition cube_r298 = neck4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(110, 212).addBox(0.039F, -14.9229F, -3.0449F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 2.1344F, 1.7289F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r299 = neck4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(211, 156).addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.3413F, 1.5457F, -10.0786F, 1.6232F, -0.037F, 1.1299F));

		PartDefinition cube_r300 = neck4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(152, 217).addBox(-4.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(4.9553F, 1.3344F, 1.7289F, 1.6306F, -0.0233F, 0.8858F));

		PartDefinition cube_r301 = neck4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(161, 217).addBox(-6.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, -0.1049F, -0.6875F, 1.6066F, -0.4103F, -0.6268F));

		PartDefinition cube_r302 = neck4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(112, 198).addBox(-0.4908F, -13.5251F, 2.3438F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, -0.1049F, -0.6875F, 1.6036F, 0.0258F, -0.6117F));

		PartDefinition cube_r303 = neck4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(19, 162).addBox(-3.1163F, -9.2853F, -14.0446F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, -0.1049F, -0.6875F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1349F, -14.7846F, 0.043F, 0.0076F, -0.1744F));

		PartDefinition cube_r304 = neck5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 48).addBox(-0.25F, 0.0F, -0.15F, 3.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -2.4846F, -28.7085F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r305 = neck5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(44, 162).addBox(-2.7561F, -8.8921F, -16.6866F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7561F, -0.2854F, 1.8257F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r306 = neck5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(106, 174).mirror().addBox(-1.5F, -1.0F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5463F, 2.3426F, -10.5944F, 1.6055F, 0.004F, -0.1134F));

		PartDefinition cube_r307 = neck5.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(23, 48).mirror().addBox(-0.2939F, 14.0152F, -4.0224F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.5218F, -0.0475F, 0.2442F));

		PartDefinition cube_r308 = neck5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(57, 160).mirror().addBox(-0.1588F, 2.8433F, -1.6731F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.3638F, -0.0559F, 0.2437F));

		PartDefinition cube_r309 = neck5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(59, 183).mirror().addBox(-0.1588F, 3.3058F, -0.9795F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.3201F, -0.0559F, 0.2437F));

		PartDefinition cube_r310 = neck5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(124, 213).mirror().addBox(-0.2898F, -3.2151F, -1.8076F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.3912F, -0.0502F, 0.2414F));

		PartDefinition cube_r311 = neck5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(114, 147).mirror().addBox(-0.0323F, -13.6307F, 0.0801F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.9951F, 2.6768F, 1.2702F, 1.5602F, -0.0807F, -1.0411F));

		PartDefinition cube_r312 = neck5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(218, 98).mirror().addBox(2.3319F, -13.6307F, 0.4992F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.9951F, 2.6768F, 1.2702F, 1.5477F, -0.0781F, -0.8836F));

		PartDefinition cube_r313 = neck5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(167, 20).mirror().addBox(-0.6599F, -16.1827F, 1.921F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7561F, -0.2854F, 1.8257F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r314 = neck5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(168, 217).mirror().addBox(-0.5006F, -1.8F, -1.0023F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5946F, -3.6192F, -14.5457F, 1.5676F, 0.4356F, 0.6108F));

		PartDefinition cube_r315 = neck5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(182, 175).mirror().addBox(-1.5F, -0.5F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.494F, 1.2103F, -25.7786F, 1.5708F, 0.0F, 0.1047F));

		PartDefinition cube_r316 = neck5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(129, 175).mirror().addBox(-1.5581F, 16.6082F, -4.387F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.3891F, -0.0262F, 0.2429F));

		PartDefinition cube_r317 = neck5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(97, 203).mirror().addBox(-1.5581F, 2.7737F, -3.6944F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.3455F, -0.0262F, 0.2429F));

		PartDefinition cube_r318 = neck5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(121, 198).mirror().addBox(-1.5581F, 2.1933F, -4.3622F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.3891F, -0.0262F, 0.2429F));

		PartDefinition cube_r319 = neck5.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(41, 214).mirror().addBox(-1.5635F, -3.1142F, -4.7944F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.4504F, -0.0288F, 0.24F));

		PartDefinition cube_r320 = neck5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(218, 123).mirror().addBox(-1.7017F, -1.6396F, -0.7906F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.5809F, -0.0376F, -0.8855F));

		PartDefinition cube_r321 = neck5.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(213, 186).mirror().addBox(-4.218F, -1.6396F, -0.5629F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.5866F, -0.0355F, -1.0426F));

		PartDefinition cube_r322 = neck5.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(28, 200).mirror().addBox(-1.7315F, -12.0003F, 1.4099F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5758F, -0.4419F, -16.9584F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r323 = neck5.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(171, 111).mirror().addBox(2.4847F, -14.7053F, 2.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5758F, -0.4419F, -16.9584F, 1.5371F, 0.3682F, 0.6004F));

		PartDefinition cube_r324 = neck5.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(168, 217).addBox(-0.4994F, -1.8F, -1.0023F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5946F, -3.6192F, -14.5457F, 1.5676F, -0.4356F, -0.6108F));

		PartDefinition cube_r325 = neck5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(167, 20).addBox(-0.3401F, -16.1827F, 1.921F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7561F, -0.2854F, 1.8257F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r326 = neck5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(218, 98).addBox(-4.3319F, -13.6307F, 0.4992F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.9951F, 2.6768F, 1.2702F, 1.5477F, 0.0781F, 0.8836F));

		PartDefinition cube_r327 = neck5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(114, 147).addBox(-2.9677F, -13.6307F, 0.0801F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.9951F, 2.6768F, 1.2702F, 1.5602F, 0.0807F, 1.0411F));

		PartDefinition cube_r328 = neck5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(23, 48).addBox(-0.7061F, 14.0152F, -4.0224F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.5218F, 0.0475F, -0.2442F));

		PartDefinition cube_r329 = neck5.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(59, 183).addBox(-0.8412F, 3.3058F, -0.9795F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.3201F, 0.0559F, -0.2437F));

		PartDefinition cube_r330 = neck5.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(57, 160).addBox(-0.8412F, 2.8433F, -1.6731F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.3638F, 0.0559F, -0.2437F));

		PartDefinition cube_r331 = neck5.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(124, 213).addBox(-0.7102F, -3.2151F, -1.8076F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.3912F, 0.0502F, -0.2414F));

		PartDefinition cube_r332 = neck5.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(106, 174).addBox(-2.5F, -1.0F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5463F, 2.3426F, -10.5944F, 1.6055F, -0.004F, 0.1134F));

		PartDefinition cube_r333 = neck5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(28, 200).addBox(0.7315F, -12.0003F, 1.4099F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5758F, -0.4419F, -16.9584F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r334 = neck5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(171, 111).addBox(-3.4847F, -14.7053F, 2.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5758F, -0.4419F, -16.9584F, 1.5371F, -0.3682F, -0.6004F));

		PartDefinition cube_r335 = neck5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(165, 28).addBox(-1.5758F, -8.3002F, -12.5222F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5758F, -0.4419F, -16.9584F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(218, 123).addBox(-0.2983F, -1.6396F, -0.7906F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.5809F, 0.0376F, 0.8855F));

		PartDefinition cube_r337 = neck5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(213, 186).addBox(1.218F, -1.6396F, -0.5629F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.5866F, 0.0355F, 1.0426F));

		PartDefinition cube_r338 = neck5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(129, 175).addBox(0.5581F, 16.6082F, -4.387F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.3891F, 0.0262F, -0.2429F));

		PartDefinition cube_r339 = neck5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(97, 203).addBox(0.5581F, 2.7737F, -3.6944F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.3455F, 0.0262F, -0.2429F));

		PartDefinition cube_r340 = neck5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(41, 214).addBox(0.5635F, -3.1142F, -4.7944F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.4504F, 0.0288F, -0.24F));

		PartDefinition cube_r341 = neck5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(121, 198).addBox(0.5581F, 2.1933F, -4.3622F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.3891F, 0.0262F, -0.2429F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(182, 175).addBox(-1.5F, -0.5F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.494F, 1.2103F, -25.7786F, 1.5708F, 0.0F, -0.1047F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8846F, -28.7585F, 0.2166F, -0.057F, -0.1466F));

		PartDefinition cube_r343 = neck6.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 172).addBox(-1.3799F, -8.0831F, -11.9488F, 0.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3799F, 0.6536F, -1.4444F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck6.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(215, 162).mirror().addBox(-1.6F, -0.5F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6109F, 0.6676F, -11.7227F, 1.5277F, -0.0068F, -0.1569F));

		PartDefinition cube_r345 = neck6.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(107, 195).mirror().addBox(-1.2828F, 16.1127F, -0.8526F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.2049F, -0.0374F, 0.069F));

		PartDefinition cube_r346 = neck6.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(109, 126).mirror().addBox(-1.2828F, 2.3254F, -3.4422F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.362F, -0.0374F, 0.069F));

		PartDefinition cube_r347 = neck6.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(102, 203).mirror().addBox(-1.2828F, 2.458F, -2.7324F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.3184F, -0.0374F, 0.069F));

		PartDefinition cube_r348 = neck6.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(214, 115).mirror().addBox(-1.2856F, -2.3987F, -4.0352F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.4408F, -0.0399F, 0.066F));

		PartDefinition cube_r349 = neck6.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(218, 128).mirror().addBox(-2.688F, -1.4554F, -0.8303F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(218, 150).mirror().addBox(-1.688F, -1.4554F, -0.8303F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.5868F, -0.0511F, -1.06F));

		PartDefinition cube_r350 = neck6.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(79, 200).mirror().addBox(-1.7496F, -11.4382F, 1.0969F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3799F, 0.6536F, -1.4444F, 1.5036F, 0.0443F, 0.6108F));

		PartDefinition cube_r351 = neck6.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(2.2754F, -14.1832F, 2.0969F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3799F, 0.6536F, -1.4444F, 1.4981F, 0.3926F, 0.5859F));

		PartDefinition cube_r352 = neck6.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(79, 200).addBox(0.7496F, -11.4382F, 1.0969F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3799F, 0.6536F, -1.4444F, 1.5036F, -0.0443F, -0.6108F));

		PartDefinition cube_r353 = neck6.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(218, 150).addBox(-0.312F, -1.4554F, -0.8303F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(218, 128).addBox(0.688F, -1.4554F, -0.8303F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.5868F, 0.0511F, 1.06F));

		PartDefinition cube_r354 = neck6.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(214, 115).addBox(0.2856F, -2.3987F, -4.0352F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.4408F, 0.0399F, -0.066F));

		PartDefinition cube_r355 = neck6.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(109, 126).addBox(0.2828F, 2.3254F, -3.4422F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.362F, 0.0374F, -0.069F));

		PartDefinition cube_r356 = neck6.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(102, 203).addBox(0.2828F, 2.458F, -2.7324F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.3184F, 0.0374F, -0.069F));

		PartDefinition cube_r357 = neck6.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(107, 195).addBox(0.2828F, 16.1127F, -0.8526F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.2049F, 0.0374F, -0.069F));

		PartDefinition cube_r358 = neck6.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(95, 68).addBox(-3.2754F, -14.1832F, 2.0969F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3799F, 0.6536F, -1.4444F, 1.4981F, -0.3926F, -0.5859F));

		PartDefinition cube_r359 = neck6.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(215, 162).addBox(-1.4F, -0.5F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6109F, 0.6676F, -11.7227F, 1.5277F, 0.0068F, 0.1569F));

		PartDefinition cube_r360 = neck6.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(122, 36).addBox(-0.25F, -0.3F, -0.05F, 3.0F, 3.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.25F, -2.2886F, -14.5954F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5886F, -14.5954F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r361 = neck7.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(144, 23).addBox(-0.25F, -0.1F, -0.05F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -2.946F, -12.6159F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r362 = neck7.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(155, 179).addBox(-1.3748F, -6.8339F, -10.7857F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3748F, 0.223F, -1.2891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck7.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(23, 112).mirror().addBox(-1.2F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6057F, 0.3362F, -10.4337F, 1.5277F, -0.0068F, -0.1569F));

		PartDefinition cube_r364 = neck7.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(73, 120).mirror().addBox(-1.2878F, 16.2409F, -0.9968F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.2056F, 0.0062F, 0.069F));

		PartDefinition cube_r365 = neck7.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(9, 207).mirror().addBox(-1.2878F, 2.569F, -2.8902F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.3191F, 0.0062F, 0.069F));

		PartDefinition cube_r366 = neck7.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(117, 3).mirror().addBox(-1.2908F, -1.3077F, -3.2053F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.4414F, 0.0036F, 0.066F));

		PartDefinition cube_r367 = neck7.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 219).mirror().addBox(-2.8501F, -1.3694F, -0.9024F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(219, 192).mirror().addBox(-1.8501F, -1.3694F, -0.9024F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.5639F, -0.0382F, -1.059F));

		PartDefinition cube_r368 = neck7.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(218, 174).mirror().addBox(-0.4601F, -1.8971F, -0.5604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8819F, -3.2121F, -11.4368F, 1.4981F, 0.3926F, 0.5859F));

		PartDefinition cube_r369 = neck7.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(155, 204).mirror().addBox(-1.5749F, -10.2891F, 0.8439F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3748F, 0.223F, -1.2891F, 1.5036F, 0.0443F, 0.6108F));

		PartDefinition cube_r370 = neck7.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(218, 174).addBox(-0.5399F, -1.8971F, -0.5604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8819F, -3.2121F, -11.4368F, 1.4981F, -0.3926F, -0.5859F));

		PartDefinition cube_r371 = neck7.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(155, 204).addBox(0.5749F, -10.2891F, 0.8439F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3748F, 0.223F, -1.2891F, 1.5036F, -0.0443F, -0.6108F));

		PartDefinition cube_r372 = neck7.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(23, 112).addBox(-1.8F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6057F, 0.3362F, -10.4337F, 1.5277F, 0.0068F, 0.1569F));

		PartDefinition cube_r373 = neck7.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(219, 192).addBox(-0.1499F, -1.3694F, -0.9024F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(0, 219).addBox(0.8501F, -1.3694F, -0.9024F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.5639F, 0.0382F, 1.059F));

		PartDefinition cube_r374 = neck7.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(117, 3).addBox(0.2908F, -1.3077F, -3.2053F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.4414F, -0.0036F, -0.066F));

		PartDefinition cube_r375 = neck7.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(9, 207).addBox(0.2878F, 2.569F, -2.8902F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.3191F, -0.0062F, -0.069F));

		PartDefinition cube_r376 = neck7.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(73, 120).addBox(0.2878F, 16.2409F, -0.9968F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.2056F, -0.0062F, -0.069F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.696F, -12.7159F, 0.4743F, -0.0547F, -0.2109F));

		PartDefinition cube_r377 = neck8.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 152).addBox(-1.5F, -0.0505F, -0.0719F, 3.0F, 3.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.9567F, -10.7093F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r378 = neck8.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(184, 159).addBox(-1.2817F, -8.0394F, -7.3866F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2817F, 1.3565F, -2.967F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r379 = neck8.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(137, 194).mirror().addBox(-0.3079F, -0.5392F, -0.5248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2972F, -1.9011F, -17.3465F, 1.4923F, 0.0014F, 0.0174F));

		PartDefinition cube_r380 = neck8.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(173, 20).mirror().addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2631F, -1.0764F, -9.2247F, 1.3527F, 0.0038F, 0.017F));

		PartDefinition cube_r381 = neck8.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(69, 208).mirror().addBox(-0.5191F, 12.2856F, 2.4039F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6817F, -0.7435F, -9.367F, 0.9423F, -0.0304F, -0.0575F));

		PartDefinition cube_r382 = neck8.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(152, 23).mirror().addBox(-0.5191F, 2.0911F, -0.185F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6817F, -0.7435F, -9.367F, 1.143F, -0.0304F, -0.0575F));

		PartDefinition cube_r383 = neck8.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(67, 120).mirror().addBox(-0.5136F, -1.4537F, -0.4645F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6817F, -0.7435F, -9.367F, 1.2654F, -0.0334F, -0.06F));

		PartDefinition cube_r384 = neck8.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(219, 0).mirror().addBox(-0.0324F, -7.0777F, 1.2983F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(134, 68).mirror().addBox(0.9676F, -7.0777F, 1.2983F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.2817F, 1.6565F, -3.167F, 1.5209F, -0.2129F, -1.1822F));

		PartDefinition cube_r385 = neck8.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(218, 140).mirror().addBox(-0.3569F, -1.9677F, -1.2077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5946F, -4.7688F, -9.496F, 1.3282F, 0.5265F, 0.5042F));

		PartDefinition cube_r386 = neck8.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(164, 204).mirror().addBox(-2.2689F, -7.8321F, 1.68F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2817F, 1.3565F, -2.967F, 1.3594F, 0.1436F, 0.5972F));

		PartDefinition cube_r387 = neck8.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(197, 216).mirror().addBox(-0.562F, 10.4811F, 0.603F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5317F, -2.1498F, -17.231F, 1.1939F, -0.0054F, -0.0502F));

		PartDefinition cube_r388 = neck8.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(32, 85).mirror().addBox(-0.562F, 1.9137F, -0.3323F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5317F, -2.1498F, -17.231F, 1.2812F, -0.0054F, -0.0502F));

		PartDefinition cube_r389 = neck8.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(123, 68).mirror().addBox(-0.5573F, -1.6476F, -0.589F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5317F, -2.1498F, -17.231F, 1.4035F, -0.0081F, -0.0531F));

		PartDefinition cube_r390 = neck8.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(218, 46).mirror().addBox(-1.1299F, -4.314F, 0.8138F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(134, 175).mirror().addBox(-0.1299F, -4.314F, 0.8138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.2317F, -1.9498F, -13.631F, 1.5738F, -0.0835F, -1.1901F));

		PartDefinition cube_r391 = neck8.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(75, 91).mirror().addBox(0.2714F, -4.3394F, 1.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2317F, -1.9498F, -13.631F, 1.5031F, -0.0398F, -0.531F));

		PartDefinition cube_r392 = neck8.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(117, 215).mirror().addBox(-1.5309F, -6.403F, 1.5476F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2317F, -2.0498F, -12.231F, 1.4749F, 0.0643F, 0.6092F));

		PartDefinition cube_r393 = neck8.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(6, 171).mirror().addBox(-0.4614F, -1.096F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3084F, -5.9102F, -18.1307F, 1.4618F, 0.4985F, 0.5631F));

		PartDefinition cube_r394 = neck8.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(218, 140).addBox(-0.6431F, -1.9677F, -1.2077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5946F, -4.7688F, -9.496F, 1.3282F, -0.5265F, -0.5042F));

		PartDefinition cube_r395 = neck8.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(164, 204).addBox(1.2689F, -7.8321F, 1.68F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2817F, 1.3565F, -2.967F, 1.3594F, -0.1436F, -0.5972F));

		PartDefinition cube_r396 = neck8.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(69, 208).addBox(-0.4809F, 12.2856F, 2.4039F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6817F, -0.7435F, -9.367F, 0.9423F, 0.0304F, 0.0575F));

		PartDefinition cube_r397 = neck8.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(67, 120).addBox(-0.4864F, -1.4537F, -0.4645F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6817F, -0.7435F, -9.367F, 1.2654F, 0.0334F, 0.06F));

		PartDefinition cube_r398 = neck8.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(152, 23).addBox(-0.4809F, 2.0911F, -0.185F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6817F, -0.7435F, -9.367F, 1.143F, 0.0304F, 0.0575F));

		PartDefinition cube_r399 = neck8.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(50, 145).addBox(-2.92F, -7.1056F, 2.4176F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2817F, 1.6565F, -3.167F, 1.3821F, 0.1101F, 0.5219F));

		PartDefinition cube_r400 = neck8.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(134, 68).addBox(-2.9676F, -7.0777F, 1.2983F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(219, 0).addBox(-1.9676F, -7.0777F, 1.2983F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2817F, 1.6565F, -3.167F, 1.5209F, 0.2129F, 1.1822F));

		PartDefinition cube_r401 = neck8.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(173, 20).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2631F, -1.0764F, -9.2247F, 1.3527F, -0.0038F, -0.017F));

		PartDefinition cube_r402 = neck8.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(137, 194).addBox(-1.6921F, -0.5392F, -0.5248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2972F, -1.9011F, -17.3465F, 1.4923F, -0.0014F, -0.0174F));

		PartDefinition cube_r403 = neck8.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(197, 216).addBox(-0.438F, 10.4811F, 0.603F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5317F, -2.1498F, -17.231F, 1.1939F, 0.0054F, 0.0502F));

		PartDefinition cube_r404 = neck8.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(32, 85).addBox(-0.438F, 1.9137F, -0.3323F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5317F, -2.1498F, -17.231F, 1.2812F, 0.0054F, 0.0502F));

		PartDefinition cube_r405 = neck8.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(123, 68).addBox(-0.4427F, -1.6476F, -0.589F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5317F, -2.1498F, -17.231F, 1.4035F, 0.0081F, 0.0531F));

		PartDefinition cube_r406 = neck8.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(75, 91).addBox(-1.2714F, -4.3394F, 1.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2317F, -1.9498F, -13.631F, 1.5031F, 0.0398F, 0.531F));

		PartDefinition cube_r407 = neck8.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(218, 46).addBox(-0.8701F, -4.314F, 0.8138F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(134, 175).addBox(-1.8701F, -4.314F, 0.8138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(1.2317F, -1.9498F, -13.631F, 1.5738F, 0.0835F, 1.1901F));

		PartDefinition cube_r408 = neck8.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(145, 0).addBox(-1.2317F, -5.3624F, -4.8913F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2317F, -2.0498F, -12.231F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r409 = neck8.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(6, 171).addBox(-0.5386F, -1.096F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3084F, -5.9102F, -18.1307F, 1.4618F, -0.4985F, -0.5631F));

		PartDefinition cube_r410 = neck8.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(117, 215).addBox(0.5309F, -6.403F, 1.5476F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2317F, -2.0498F, -12.231F, 1.4749F, -0.0643F, -0.6092F));

		PartDefinition cube_r411 = neck8.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(188, 126).addBox(-1.5F, -0.15F, -0.05F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5567F, -18.7093F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8907F, -18.6933F, 0.5088F, -0.1703F, 0.0722F));

		PartDefinition cube_r412 = neck9.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(79, 197).mirror().addBox(-1.3426F, -0.607F, -1.6092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7085F, -0.5884F, -2.8026F, 1.3273F, -0.0971F, -0.3721F));

		PartDefinition cube_r413 = neck9.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(36, 183).mirror().addBox(-0.5351F, 6.6315F, 0.809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4812F, 0.4455F, -3.3293F, 0.811F, -0.0225F, -0.0647F));

		PartDefinition cube_r414 = neck9.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(175, 219).mirror().addBox(-0.5351F, 2.2157F, -0.4015F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4812F, 0.4455F, -3.3293F, 0.9855F, -0.0225F, -0.0647F));

		PartDefinition cube_r415 = neck9.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(126, 3).mirror().addBox(-0.5351F, -1.3648F, -0.8212F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4812F, 0.4455F, -3.3293F, 1.16F, -0.0225F, -0.0647F));

		PartDefinition cube_r416 = neck9.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(116, 103).mirror().addBox(-1.9385F, -0.6293F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(190, 111).mirror().addBox(-1.5385F, -0.6293F, -0.5035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8085F, -0.8884F, -2.8026F, 1.5038F, -0.2533F, -1.1783F));

		PartDefinition cube_r417 = neck9.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(-0.0784F, -0.707F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7085F, -0.5884F, -2.8026F, 1.3439F, -0.1317F, -0.5173F));

		PartDefinition cube_r418 = neck9.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(137, 111).mirror().addBox(-0.5429F, -0.6448F, 0.467F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -0.9884F, -3.8026F, 1.3228F, 0.1681F, 0.5915F));

		PartDefinition cube_r419 = neck9.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(137, 111).addBox(-0.4571F, -0.6448F, 0.467F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4085F, -0.9884F, -3.8026F, 1.3228F, -0.1681F, -0.5915F));

		PartDefinition cube_r420 = neck9.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(100, 3).addBox(-0.9216F, -0.707F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7085F, -0.5884F, -2.8026F, 1.3439F, 0.1317F, 0.5173F));

		PartDefinition cube_r421 = neck9.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(116, 103).addBox(0.9385F, -0.6293F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(190, 111).addBox(-0.4615F, -0.6293F, -0.5035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8085F, -0.8884F, -2.8026F, 1.5038F, 0.2533F, 1.1783F));

		PartDefinition cube_r422 = neck9.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(36, 183).addBox(-0.4649F, 6.6315F, 0.809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4812F, 0.4455F, -3.3293F, 0.811F, 0.0225F, 0.0647F));

		PartDefinition cube_r423 = neck9.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(175, 219).addBox(-0.4649F, 2.2157F, -0.4015F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4812F, 0.4455F, -3.3293F, 0.9855F, 0.0225F, 0.0647F));

		PartDefinition cube_r424 = neck9.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(126, 3).addBox(-0.4649F, -1.3648F, -0.8212F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4812F, 0.4455F, -3.3293F, 1.16F, 0.0225F, 0.0647F));

		PartDefinition cube_r425 = neck9.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(79, 197).addBox(-0.6574F, -0.607F, -1.6092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7085F, -0.5884F, -2.8026F, 1.3273F, 0.0971F, 0.3721F));

		PartDefinition cube_r426 = neck9.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 109).addBox(0.5F, -3.1F, 1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(85, 126).addBox(-0.5F, -0.1F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -2.3415F, -4.444F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r427 = neck9.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(210, 176).addBox(-0.5F, -0.7F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6415F, -7.444F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck9.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.6815F, -7.6565F, 0.4421F, -0.0498F, -0.0868F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(203, 129).addBox(-3.0F, -1.6F, -0.6F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.36F, -7.3784F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(209, 84).addBox(-2.5F, 0.0146F, 0.2588F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 7.4449F, -8.9027F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(204, 179).addBox(2.0F, -5.5F, -1.0F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(204, 166).addBox(-3.0F, -5.5F, -1.0F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(65, 24).addBox(-2.0F, -5.5F, -0.8F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6654F, -7.5763F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(87, 14).addBox(-3.0F, 2.3044F, -4.534F, 6.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.4163F, 0.2115F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 109).addBox(-1.0F, -2.6109F, 0.1834F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.1802F, -9.9951F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(101, 219).addBox(-1.0F, -0.1132F, 0.0209F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.4176F, -9.172F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(23, 183).addBox(-1.0F, -1.2F, -1.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8076F, -6.579F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(193, 111).addBox(-2.0F, -1.35F, -0.7F, 4.0F, 3.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -2.1013F, -5.0433F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(191, 77).addBox(-3.0F, -0.0485F, -1.7481F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6163F, -2.3885F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(19, 152).addBox(-2.0F, -1.2F, -0.9F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 5.8848F, -9.9942F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(168, 63).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(203, 124).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 7.7737F, -11.0374F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(199, 147).addBox(-3.0F, -0.3F, -0.6F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 6.7693F, -10.243F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(134, 79).addBox(-3.5F, -1.9221F, -1.9343F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 5.7901F, -5.6915F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(193, 196).addBox(-3.5F, -1.9F, -1.2F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3901F, -8.2915F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(23, 118).addBox(-3.5F, 0.9914F, 1.469F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.1163F, 0.6115F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-4.85F, 80.5804F, -217.8282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(186, 11).mirror().addBox(-4.43F, 80.5804F, -217.8282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(186, 11).addBox(2.43F, 80.5804F, -217.8282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(42, 51).addBox(2.85F, 80.5804F, -217.8282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, -81.5255F, 213.9679F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(84, 103).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(84, 103).addBox(7.2F, -1.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.35F, 3.7059F, -0.863F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(83, 102).mirror().addBox(-0.5F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 102).addBox(5.2F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.35F, 1.9059F, -5.863F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(155, 196).addBox(-4.0F, -4.8044F, -1.0841F, 8.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 3.8236F, -3.9242F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(86, 36).addBox(-4.0F, -1.5261F, -3.279F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5236F, -1.1242F, -1.3788F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 5.2068F, 0.1294F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(139, 55).mirror().addBox(-4.0F, -3.55F, -1.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(219, 50).mirror().addBox(-4.0F, -2.55F, -1.95F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(139, 55).addBox(3.0F, -3.55F, -1.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(219, 50).addBox(3.0F, -2.55F, -1.95F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.0547F, 0.9173F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(64, 183).mirror().addBox(-4.0F, -0.2397F, -0.9173F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(64, 183).addBox(3.0F, -0.2397F, -0.9173F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.7453F, 0.7173F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(-4.0F, 0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(182, 147).mirror().addBox(-4.0F, -0.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 70).addBox(3.0F, 0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(182, 147).addBox(3.0F, -0.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.571F, -0.4505F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(168, 66).mirror().addBox(-3.5F, -0.0708F, -0.0719F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(168, 66).addBox(2.5F, -0.0708F, -0.0719F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.8102F, -1.6095F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(214, 196).mirror().addBox(-3.5F, -3.5F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(214, 196).addBox(2.5F, -3.5F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 5.8911F, 1.2698F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(218, 217).mirror().addBox(-3.5F, -0.0265F, -0.0487F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(218, 217).addBox(2.5F, -0.0265F, -0.0487F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5911F, 0.7698F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(184, 59).mirror().addBox(-3.0F, -0.0438F, -0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(184, 59).addBox(2.0F, -0.0438F, -0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(76, 58).addBox(-3.0F, 0.8562F, -0.051F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.3379F, 1.826F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(203, 98).addBox(-3.0F, -3.8848F, -0.1264F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 9.438F, 0.6723F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(165, 147).addBox(-2.5F, -1.5F, -0.3F, 5.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.9203F, 1.4635F, 0.5672F, 0.0F, 0.0F));

		PartDefinition throat1 = jaw.addOrReplaceChild("throat1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.8557F, 2.3581F, 0.2531F, 0.0F, 0.0F));

		PartDefinition moveableFlesh = jaw.addOrReplaceChild("moveableFlesh", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.5489F, 25.025F));

		PartDefinition leftArm = body2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(123, 142).addBox(-3.0F, -1.0513F, -1.7832F, 6.0F, 29.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(86, 195).addBox(-3.0F, 27.9487F, -2.7832F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5F, 23.5F, -22.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r457 = leftArm.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(144, 40).addBox(-3.3125F, -0.1008F, -1.1586F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1F, 10.0487F, -2.5832F, 0.1712F, 0.7453F, 0.4211F));

		PartDefinition cube_r458 = leftArm.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(0, 24).addBox(-0.7F, -8.0F, -1.3F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 7.4487F, -0.2832F, -0.1719F, 0.7703F, -0.2444F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(142, 144).addBox(-2.5F, 0.2963F, -1.7258F, 6.0F, 20.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(178, 111).addBox(-1.5F, 1.6963F, -5.1258F, 4.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 30.9487F, 1.2168F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(69, 173).addBox(-6.0F, -0.0979F, -1.1388F, 2.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(176, 189).addBox(-4.0F, -0.0979F, -2.1388F, 6.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 170).addBox(2.0F, -0.0979F, -1.1388F, 2.0F, 15.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 21.2963F, -3.8258F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r459 = leftHand.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(11, 82).addBox(1.5F, -2.05F, -4.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 8.9021F, 3.8612F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightArm = body2.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(63, 140).addBox(-3.0F, -1.0513F, -1.7832F, 6.0F, 29.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(194, 158).addBox(-3.0F, 27.9487F, -2.7832F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.5F, 23.5F, -22.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r460 = rightArm.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(53, 58).addBox(0.3125F, -0.1008F, -1.1586F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1F, 10.0487F, -2.5832F, 0.1712F, -0.7453F, -0.4211F));

		PartDefinition cube_r461 = rightArm.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3F, -8.0F, -1.3F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 7.4487F, -0.2832F, -0.1719F, -0.7703F, 0.2444F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 48).addBox(-3.5F, 0.2963F, -1.7258F, 6.0F, 20.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(114, 175).addBox(-2.5F, 1.6963F, -5.1258F, 4.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 30.9487F, 1.2168F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(93, 171).addBox(4.0F, -0.0979F, -1.1388F, 2.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(42, 183).addBox(-2.0F, -0.0979F, -2.1388F, 6.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(101, 147).addBox(-4.0F, -0.0979F, -1.1388F, 2.0F, 15.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 21.2963F, -3.8258F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r462 = rightHand.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 82).addBox(-3.5F, -2.05F, -4.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 8.9021F, 3.8612F, 0.0F, 0.0F, -0.48F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(82, 147).addBox(-6.5F, 3.0159F, -1.677F, 5.0F, 24.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(193, 84).addBox(-6.5F, -1.9841F, -2.677F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 3.75F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r463 = leftLeg.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(182, 147).addBox(-6.5F, 0.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 27.0159F, -1.677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(129, 194).addBox(3.0F, 3.3881F, -0.1302F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(178, 20).addBox(-3.5F, 7.3881F, -0.5302F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(173, 89).addBox(-3.5F, 1.3881F, -1.5302F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 29.7159F, -0.677F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(137, 111).addBox(-7.0F, 1.0F, -7.0F, 13.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 20.9319F, 0.7163F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r464 = leftFoot.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(180, 70).addBox(-5.5F, -0.9266F, -1.0985F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.5F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition cube_r465 = leftFoot2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(169, 0).addBox(-4.8F, -2.5F, -0.5F, 11.0F, 6.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.5F, -2.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(35, 145).addBox(1.5F, 3.0159F, -1.677F, 5.0F, 24.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(32, 91).addBox(1.5F, -1.9841F, -2.677F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 3.75F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r466 = rightLeg.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(50, 120).addBox(1.5F, 0.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 27.0159F, -1.677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(193, 175).addBox(-5.0F, 3.3881F, -0.1302F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(58, 91).addBox(-2.5F, 7.3881F, -0.5302F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(76, 68).addBox(-2.5F, 1.3881F, -1.5302F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 29.7159F, -0.677F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(134, 65).addBox(-6.0F, 1.0F, -7.0F, 13.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 20.9319F, 0.7163F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r467 = rightFoot.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(180, 63).addBox(-5.5F, -0.9266F, -1.0985F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.5F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition cube_r468 = rightFoot2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(73, 3).addBox(-6.2F, -2.5F, -0.5F, 11.0F, 6.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -3.5F, -2.0F, 0.0F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 240, 240);
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