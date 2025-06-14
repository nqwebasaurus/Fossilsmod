package fossils.fossils.client.blockentity.model.berthasaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BerthasauraFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public BerthasauraFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.3F, -1.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 5).addBox(-0.5F, -0.5F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(-0.5F, -0.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 48).addBox(-0.5F, -0.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 48).addBox(-0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 13).mirror().addBox(-1.7F, -0.1F, 1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(28, 13).addBox(-0.3F, -0.1F, 1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 0).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2F, -3.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -0.7F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 5.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 41).mirror().addBox(-0.5F, -0.6522F, -0.6613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.1657F, 0.626F, -0.2618F, 0.0F, -0.3665F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(-0.5F, 1.8017F, -0.8888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.1657F, 0.626F, 0.8901F, 0.0F, -0.3665F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 41).mirror().addBox(-0.5F, -0.7F, -0.4966F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.1657F, 0.626F, 0.6981F, 0.0F, -0.3665F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 32).mirror().addBox(-0.5F, -0.2184F, -0.3092F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.4657F, -1.374F, -0.5067F, -0.1383F, -0.2434F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-0.5F, -0.1077F, -0.1018F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 9).addBox(2.7F, -0.1077F, -0.1018F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6F, -0.626F, -1.1693F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 23).mirror().addBox(0.0F, -0.1363F, -1.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 39).mirror().addBox(0.0F, -0.4363F, -1.983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -1.326F, -1.2693F, 0.6807F, 0.1745F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 25).mirror().addBox(0.0F, -0.3002F, -1.9301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -1.326F, -1.2693F, 0.1396F, 0.1745F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.0429F, -1.9739F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(2.7F, -0.0429F, -1.9739F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -1.726F, 0.7307F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 11).mirror().addBox(-0.5F, -0.0381F, -1.9764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(34, 11).addBox(2.7F, -0.0381F, -1.9764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6F, -1.626F, 2.7307F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 5).mirror().addBox(-0.5F, -1.0675F, -1.9954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 5).addBox(2.7F, -1.0675F, -1.9954F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.726F, 3.2307F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 27).mirror().addBox(-0.5F, -0.2F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(27, 27).addBox(2.7F, -0.2F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6F, -0.726F, 1.3307F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 23).addBox(-1.0F, -0.1363F, -1.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 39).addBox(-1.0F, -0.4363F, -1.983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1F, -1.326F, -1.2693F, 0.6807F, -0.1745F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 25).addBox(-1.0F, -0.3002F, -1.9301F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -1.326F, -1.2693F, 0.1396F, -0.1745F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 18).addBox(-0.5F, 1.8017F, -0.8888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 1.1657F, 0.626F, 0.8901F, 0.0F, 0.3665F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 41).addBox(-0.5F, -0.6522F, -0.6613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 1.1657F, 0.626F, -0.2618F, 0.0F, 0.3665F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 41).addBox(-0.5F, -0.7F, -0.4966F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.6F, 1.1657F, 0.626F, 0.6981F, 0.0F, 0.3665F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 32).addBox(-0.5F, -0.2184F, -0.3092F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 0.4657F, -1.374F, -0.5067F, 0.1383F, 0.2434F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1F, 0.774F, -0.0693F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 43).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, -0.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(18, 30).addBox(-0.4F, 0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 28).addBox(0.6F, 0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.6F, 0.1F, 1.4835F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.3F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4F, 0.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.306F, -3.4914F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.774F, -0.0693F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 43).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5F, -0.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-0.6F, 0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 28).mirror().addBox(-1.6F, 0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6F, 0.1F, 1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, -0.3F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.5F, -0.306F, -3.4914F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3F, 0.0F, 0.5411F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -3.0F, 0.0425F, -0.2614F, 0.0173F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 49).addBox(-0.5F, -1.0F, -2.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(-0.5F, -1.0F, -4.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 50).addBox(-0.5F, -0.9F, -6.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 15).addBox(-3.0F, 4.0F, -6.2F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(0, 18).addBox(-1.0F, -0.5F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.3F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(46, 42).mirror().addBox(-2.4307F, -1.3113F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1876F, -1.3953F, 0.0243F, 0.0082F, -1.3811F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-1.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1876F, -1.3953F, 0.0252F, -0.0046F, -0.8752F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1876F, -1.3953F, 0.0417F, 0.0726F, -0.401F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-3.4307F, -1.3113F, -0.4119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5876F, -3.2953F, 0.061F, 0.1967F, -1.3774F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-1.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5876F, -3.2953F, 0.1491F, 0.1424F, -0.8666F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(48, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5876F, -3.2953F, 0.2202F, 0.146F, -0.3815F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(-4.4307F, -1.3113F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0876F, -5.2953F, 0.0893F, 0.3336F, -1.3699F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(-1.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0876F, -5.2953F, 0.2422F, 0.2481F, -0.8485F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0876F, -5.2953F, 0.3523F, 0.1966F, -0.359F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1876F, -1.3953F, 0.0417F, -0.0726F, 0.401F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 18).addBox(0.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1876F, -1.3953F, 0.0252F, 0.0046F, 0.8752F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 42).addBox(1.4307F, -1.3113F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1876F, -1.3953F, 0.0243F, -0.0082F, 1.3811F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5876F, -3.2953F, 0.2202F, -0.146F, 0.3815F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(47, 37).addBox(0.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5876F, -3.2953F, 0.1491F, -0.1424F, 0.8666F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 14).addBox(1.4307F, -1.3113F, -0.4119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5876F, -3.2953F, 0.061F, -0.1967F, 1.3774F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 35).addBox(1.4307F, -1.3113F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0876F, -5.2953F, 0.0893F, -0.3336F, 1.3699F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(48, 4).addBox(0.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0876F, -5.2953F, 0.2422F, -0.2481F, 0.8485F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(21, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0876F, -5.2953F, 0.3523F, -0.1966F, 0.359F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -5.8F, -0.0551F, -0.1382F, -0.1217F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 50).addBox(-0.5F, -0.5F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 50).addBox(-0.5F, -0.5F, -3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 23).addBox(-1.0F, -0.3F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.4F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(10, 11).mirror().addBox(0.0F, -0.7318F, -2.0321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.4622F, -2.8549F, 0.9982F, -0.4402F, -0.5841F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 21).addBox(3.5F, -0.5F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.1622F, -1.6549F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(24, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3876F, -2.9953F, 0.6073F, 0.2816F, -0.368F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 23).mirror().addBox(-4.4307F, -1.3113F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3876F, -2.9953F, 0.1515F, 0.5895F, -1.4118F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 32).mirror().addBox(-1.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3876F, -2.9953F, 0.4324F, 0.4394F, -0.8537F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5876F, -1.1953F, 0.453F, 0.2324F, -0.3375F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 33).mirror().addBox(-4.4307F, -1.3113F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5876F, -1.1953F, 0.1123F, 0.4361F, -1.3613F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 26).mirror().addBox(-1.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5876F, -1.1953F, 0.3152F, 0.326F, -0.8278F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 32).addBox(0.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3876F, -2.9953F, 0.4324F, -0.4394F, 0.8537F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(33, 23).addBox(1.4307F, -1.3113F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3876F, -2.9953F, 0.1515F, -0.5895F, 1.4118F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(24, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3876F, -2.9953F, 0.6073F, -0.2816F, 0.368F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(46, 26).addBox(0.887F, -0.4533F, -0.4119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5876F, -1.1953F, 0.3152F, -0.326F, 0.8278F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(33, 33).addBox(1.4307F, -1.3113F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5876F, -1.1953F, 0.1123F, -0.4361F, 1.3613F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 35).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5876F, -1.1953F, 0.453F, -0.2324F, 0.3375F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, -2.3323F, -2.1503F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2F, 1.2F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 11).addBox(-1.0F, -0.7318F, -2.0321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.4622F, -2.8549F, 0.9982F, 0.4402F, 0.5841F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(30, 5).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 3.7622F, -2.6549F, -1.4268F, 0.9205F, -0.9154F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(35, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.5247F, -0.0604F, 0.0349F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(44, 12).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 2.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.7622F, -2.6549F, -0.9147F, -0.8744F, 0.6677F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.5247F, 0.0604F, -0.0349F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(44, 12).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.5F, 2.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8F, -4.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = neck3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(27, 42).mirror().addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.8F, -0.7132F, -0.3751F, 0.3069F));

		PartDefinition cube_r59 = neck3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0124F, -0.4953F, 0.5954F, 0.74F, -0.584F));

		PartDefinition cube_r60 = neck3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(18, 21).mirror().addBox(-3.887F, -0.4533F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0124F, -0.4953F, 0.1123F, 0.8212F, -1.257F));

		PartDefinition cube_r61 = neck3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 42).addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.8F, -0.7132F, 0.3751F, -0.3069F));

		PartDefinition cube_r62 = neck3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(7, 35).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.8F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r63 = neck3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(18, 21).addBox(0.887F, -0.4533F, -0.4119F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0124F, -0.4953F, 0.1123F, -0.8212F, 1.257F));

		PartDefinition cube_r64 = neck3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0124F, -0.4953F, 0.5954F, -0.74F, 0.584F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.6F, -0.1336F, -0.316F, 0.0071F));

		PartDefinition cube_r65 = neck2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(17, 11).addBox(-1.0F, -0.0414F, 0.0142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6F, -1.1F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r66 = neck2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(42, 35).mirror().addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7F, -1.2F, -0.8438F, -0.2618F, 0.167F));

		PartDefinition cube_r67 = neck2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(42, 35).addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.2F, -0.8438F, 0.2618F, -0.167F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2F, -1.2F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(34, 27).addBox(-0.5F, -0.1267F, 0.2177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r69 = neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 41).mirror().addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.6F, -0.6255F, -0.1658F, 0.1433F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(22, 41).addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.6F, -0.6255F, 0.1658F, -0.1433F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 33).addBox(0.33F, -0.7F, -2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3032F))
				.texOffs(46, 15).addBox(0.06F, -0.3F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 46).addBox(0.28F, -0.3F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 9).addBox(-0.09F, 0.3F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(33, 18).addBox(-1.0F, -0.4F, -2.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(46, 9).mirror().addBox(-0.91F, 0.3F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(11, 46).mirror().addBox(-1.28F, -0.3F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 15).mirror().addBox(-1.06F, -0.3F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 33).mirror().addBox(-1.33F, -0.7F, -2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3032F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -1.8F, 0.3494F, -0.1904F, -0.1108F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.1F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(46, 45).addBox(-0.5F, -0.1053F, -0.9911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.3F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(42, 43).mirror().addBox(-1.1F, -0.22F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 6).mirror().addBox(-1.1F, -0.22F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(42, 43).addBox(0.1F, -0.22F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 6).addBox(0.1F, -0.22F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(40, 17).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(41, 3).addBox(-1.0F, 0.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(16, 47).mirror().addBox(-0.9F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(16, 47).addBox(0.7F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4F, 1.4926F, -0.7466F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(-1.04F, -0.7854F, -0.3695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 29).mirror().addBox(-1.04F, -0.7854F, -0.8695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(31, 45).mirror().addBox(-0.83F, -0.0854F, -0.0695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(38, 39).addBox(0.64F, -0.7854F, -0.3695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 29).addBox(0.64F, -0.7854F, -0.8695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F))
				.texOffs(31, 45).addBox(0.43F, -0.0854F, -0.0695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.3F, 0.2F, -0.6F, -1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.04F, -0.3731F, -0.3698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(0, 41).addBox(0.64F, -0.3731F, -0.3698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.3F, 0.3F, -0.2F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(26, 47).mirror().addBox(-1.04F, -0.5913F, -0.7211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(26, 47).addBox(0.64F, -0.5913F, -0.7211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 0.2F, -0.4F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-1.03F, -0.1236F, -0.0894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(45, 32).addBox(0.23F, -0.1236F, -0.0894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1F, -0.4F, -1.1F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-1.03F, -0.0859F, -0.0942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false)
				.texOffs(45, 28).addBox(0.23F, -0.0859F, -0.0942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-0.1F, 1.0F, -0.8F, -2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.03F, -1.2853F, -0.4927F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 32).addBox(-0.37F, -1.2853F, -0.4927F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 0.8F, -2.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(-0.7F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(39, 13).addBox(-0.3F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -2.1F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 39).mirror().addBox(-0.6F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(45, 39).addBox(0.4F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4F, 0.8F, -4.1F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(7, 43).mirror().addBox(-0.8F, -0.0166F, -0.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(7, 43).addBox(-0.2F, -0.0166F, -0.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(17, 43).mirror().addBox(-0.8F, -0.0015F, -1.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(17, 43).addBox(-0.2F, -0.0015F, -1.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(4, 47).mirror().addBox(-1.0F, 0.0191F, -1.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(4, 47).addBox(-0.8F, 0.0191F, -1.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -0.4F, -3.2F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(41, 46).mirror().addBox(-1.0F, -0.0218F, -0.812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(41, 46).addBox(-0.8F, -0.0218F, -0.812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0F, -3.7F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(42, 20).addBox(-1.0F, 0.0159F, -1.0386F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(39, 8).addBox(0.2F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 8).mirror().addBox(-1.2F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 4).mirror().addBox(-0.91F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(36, 4).addBox(0.31F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.6F, -2.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-1.0F, -0.7478F, -1.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 45).mirror().addBox(-1.0F, -0.7478F, -0.7683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 45).addBox(-0.2F, -0.7478F, -1.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 45).addBox(-0.2F, -0.7478F, -0.7683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 1.4F, -3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.0F, -0.7302F, -1.7961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false)
				.texOffs(0, 37).addBox(0.4F, -0.7302F, -1.7961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.2F, 1.1F, -1.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(12, 37).mirror().addBox(-1.0F, -0.2036F, -0.2366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(12, 37).addBox(-0.2F, -0.2036F, -0.2366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1F, 0.5F, -3.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(33, 37).mirror().addBox(-1.0F, -0.8165F, -0.2098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(33, 37).addBox(0.4F, -0.8165F, -0.2098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, 1.1F, -0.9F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-1.0F, 0.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 39).mirror().addBox(-1.0F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false)
				.texOffs(26, 38).addBox(0.4F, 0.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 39).addBox(0.4F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 23).mirror().addBox(-0.7F, -0.2036F, -0.8366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(44, 23).addBox(-0.3F, -0.2036F, -0.8366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(49, 30).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 23).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 20).addBox(0.0F, -0.9F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 4.0F, -0.0352F, 0.1308F, -0.0046F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(45, 48).addBox(0.0F, 0.8F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 48).addBox(0.0F, 0.5F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 21).addBox(0.0F, -0.6F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(10, 2).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(49, 12).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 49).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 6).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 50).addBox(0.0F, -0.6F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(39, 48).addBox(0.0F, 1.1F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 6).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.1133F, -0.3904F, 0.0433F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1463F, -0.3024F, -0.0439F));

		return LayerDefinition.create(meshdefinition, 53, 53);
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