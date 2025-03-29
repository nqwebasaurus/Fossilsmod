package fossils.fossils.client.blockentity.model.patagosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PatagosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart leftLeg7;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightLeg7;
	private final ModelPart rightLeg8;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart upperarmleft;
	private final ModelPart lowerarmleft;
	private final ModelPart handleft;
	private final ModelPart Leftclaw;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PatagosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg5 = this.hips.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.leftLeg7 = this.leftLeg6.getChild("leftLeg7");
		this.leftLeg8 = this.leftLeg7.getChild("leftLeg8");
		this.rightLeg5 = this.hips.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightLeg7 = this.rightLeg6.getChild("rightLeg7");
		this.rightLeg8 = this.rightLeg7.getChild("rightLeg8");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm4 = this.chest.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightArm4 = this.chest.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.upperarmleft = this.chest.getChild("upperarmleft");
		this.lowerarmleft = this.upperarmleft.getChild("lowerarmleft");
		this.handleft = this.lowerarmleft.getChild("handleft");
		this.Leftclaw = this.handleft.getChild("Leftclaw");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.head.getChild("jaw2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.8F, 15.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 34).addBox(-0.5F, -4.9F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8609F, 7.0291F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 142).addBox(-0.5F, -3.5F, -0.7F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0886F, 3.8069F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -3.5F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.9735F, -1.7146F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(0.0F, 3.9756F, -4.2645F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 129).mirror().addBox(-2.0F, -0.0244F, 0.2355F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 15).addBox(7.0F, 3.9756F, -4.2645F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(101, 129).addBox(10.0F, -0.0244F, 0.2355F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, -7.5F, -0.2F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-2.0F, 0.3F, -0.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 139).mirror().addBox(-2.0F, 0.3F, 9.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 139).addBox(10.0F, 0.3F, 9.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(14, 108).addBox(10.0F, 0.3F, -0.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(65, 69).addBox(3.0F, -0.7F, -0.9F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -5.0F, -5.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 113).mirror().addBox(-2.0F, 0.0007F, -2.1209F, 2.0F, 4.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(23, 113).addBox(10.0F, 0.0007F, -2.1209F, 2.0F, 4.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, -4.7F, -5.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(130, 26).mirror().addBox(-2.0F, -0.0968F, 0.0322F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(130, 26).addBox(10.0F, -0.0968F, 0.0322F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, -7.7F, 5.0F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(0.0F, -0.2044F, -3.2922F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -2.0F, 1.9F, -0.0698F, 0.0F, -0.2182F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 145).mirror().addBox(-0.2423F, -6.6876F, 6.5161F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 5.0F, 5.9F, -1.1345F, 0.3405F, -0.2317F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 140).mirror().addBox(-0.2423F, -3.4434F, 3.9137F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 5.0F, 5.9F, -0.8291F, 0.3405F, -0.2317F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 140).mirror().addBox(-0.2423F, -1.7712F, -0.1836F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 5.0F, 5.9F, -0.4626F, 0.3405F, -0.2317F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(35, 38).mirror().addBox(0.0F, 2.2427F, -8.7315F, 2.0F, 7.0F, 9.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -2.0F, 1.9F, 0.6807F, 0.0F, -0.2182F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(0.0F, 3.428F, -2.3689F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -2.0F, 1.9F, -0.384F, 0.0F, -0.2182F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 140).mirror().addBox(0.1252F, 7.7609F, -1.8978F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 15).mirror().addBox(0.1252F, -0.2391F, -0.8978F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.6F, -0.5F, -0.0692F, -0.0091F, -0.3488F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 140).addBox(-2.1252F, 7.7609F, -1.8978F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-2.1252F, -0.2391F, -0.8978F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 7.6F, -0.5F, -0.0692F, 0.0091F, 0.3488F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 38).addBox(-2.0F, 2.2427F, -8.7315F, 2.0F, 7.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.0F, -2.0F, 1.9F, 0.6807F, 0.0F, 0.2182F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(23, 145).addBox(-1.7577F, -6.6876F, 6.5161F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 5.0F, 5.9F, -1.1345F, -0.3405F, 0.2317F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 140).addBox(-1.7577F, -3.4434F, 3.9137F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.2F, 5.0F, 5.9F, -0.8291F, -0.3405F, 0.2317F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 140).addBox(-1.7577F, -1.7712F, -0.1836F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 5.0F, 5.9F, -0.4626F, -0.3405F, 0.2317F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 108).addBox(-2.0F, 3.428F, -2.3689F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.0F, -2.0F, 1.9F, -0.384F, 0.0F, 0.2182F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 16).addBox(-2.0F, -0.2044F, -3.2922F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, 1.9F, -0.0698F, 0.0F, 0.2182F));

		PartDefinition leftLeg5 = hips.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(58, 89).addBox(-1.6F, 0.25F, -14.0F, 4.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 3.45F, 1.2F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(111, 123).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.45F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(128, 77).addBox(-2.5F, 0.5F, 4.9F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.05F, -22.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create().texOffs(20, 95).addBox(0.4F, -0.7949F, -3.7571F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.7348F, -17.1514F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(71, 136).addBox(-2.5F, -2.8721F, 4.242F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.4773F, -7.4991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(90, 82).addBox(-2.5F, -2.6F, -4.5F, 3.0F, 3.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.8236F, -11.8529F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(85, 100).addBox(0.5F, -0.9155F, -2.7283F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.1F, 1.6054F, -12.7392F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg7 = leftLeg6.addOrReplaceChild("leftLeg7", CubeListBuilder.create().texOffs(0, 48).addBox(-5.0F, -7.3886F, -4.7567F, 9.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 121).addBox(-4.0F, -2.5F, -1.2F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1149F, -1.2669F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg7.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3537F, -1.8561F));

		PartDefinition cube_r28 = leftLeg8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(112, 41).addBox(0.1F, -4.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.1F, 0.2651F, -0.9006F, 0.0F, 0.0F, 0.192F));

		PartDefinition rightLeg5 = hips.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(34, 83).addBox(-2.4F, 0.25F, -14.0F, 4.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 3.45F, 1.2F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 118).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.45F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 12).addBox(-2.5F, 0.5F, 4.9F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.05F, -22.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create().texOffs(0, 91).addBox(-2.4F, -0.7949F, -3.7571F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.7348F, -17.1514F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(135, 60).addBox(-0.5F, -2.8721F, 4.242F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4773F, -7.4991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 64).addBox(-0.5F, -2.6F, -4.5F, 3.0F, 3.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 2.8236F, -11.8529F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(95, 41).addBox(-2.5F, -0.9155F, -2.7283F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.1F, 1.6054F, -12.7392F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg7 = rightLeg6.addOrReplaceChild("rightLeg7", CubeListBuilder.create().texOffs(38, 16).addBox(-4.0F, -7.3886F, -4.7567F, 9.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg7.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(44, 120).addBox(-3.0F, -2.5F, -1.2F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1149F, -1.2669F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg7.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3537F, -1.8561F));

		PartDefinition cube_r35 = rightLeg8.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(110, 68).addBox(-7.9F, -3.8F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.9F, 0.0651F, -0.9006F, 0.0F, 0.0F, -0.192F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -7.0F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(29, 69).addBox(-8.0F, -4.0496F, -9.0742F, 16.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 21.6059F, 1.3513F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 0).addBox(-11.0F, -3.725F, -10.7798F, 22.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 21.6059F, -7.9487F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 66).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -18.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -2.8F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.036F, -0.0376F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(18, 34).addBox(-0.5F, -5.8614F, -1.4417F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0446F, -2.4427F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(35, 57).mirror().addBox(-20.8689F, -6.2376F, -0.8345F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -1.459F, -17.6441F, -0.0697F, 0.194F, -1.3857F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-20.8689F, -6.2376F, -0.8345F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -1.459F, -15.0441F, -0.0776F, 0.1423F, -1.3696F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-19.8689F, -6.2376F, -0.8345F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.859F, -12.0441F, -0.088F, 0.0732F, -1.3882F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(-18.8689F, -6.2376F, -0.8345F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.359F, -9.0441F, -0.0983F, 0.0042F, -1.406F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-18.8689F, -6.2376F, -0.8345F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.159F, -6.0441F, -0.1085F, -0.0649F, -1.4232F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(70, 31).mirror().addBox(-16.8689F, -6.2376F, -0.8345F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.741F, -3.0441F, -0.1189F, -0.1339F, -1.457F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(35, 45).mirror().addBox(-11.8689F, -6.2376F, -0.8345F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.941F, -0.6441F, -0.1241F, -0.1685F, -1.561F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(133, 22).mirror().addBox(-7.7287F, -1.4502F, -0.8065F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.941F, 2.1559F, -0.2082F, -0.1207F, -1.1853F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 115).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.941F, 2.1559F, -0.2415F, -0.049F, -0.7977F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(95, 56).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.941F, -0.6441F, -0.1876F, -0.0925F, -1.0828F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(103, 116).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.941F, -0.6441F, -0.2118F, -0.0307F, -0.6942F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 102).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.741F, -3.0441F, -0.167F, -0.0642F, -0.9797F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 119).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.741F, -3.0441F, -0.1821F, -0.0123F, -0.5901F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(110, 37).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.159F, -6.0441F, -0.1262F, -0.0076F, -0.9462F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(128, 87).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.159F, -6.0441F, -0.1228F, 0.0245F, -0.5548F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.359F, -9.0441F, -0.0853F, 0.049F, -0.9279F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(18, 23).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.359F, -9.0441F, -0.0634F, 0.0612F, -0.5348F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(68, 57).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.859F, -12.0441F, -0.0442F, 0.1056F, -0.9073F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(38, 8).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -0.859F, -12.0441F, -0.0037F, 0.0977F, -0.5126F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(89, 82).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -1.459F, -15.0441F, 0.0565F, 0.1339F, -0.4882F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -1.459F, -15.0441F, -0.0027F, 0.1619F, -0.8843F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -1.459F, -17.6441F, 0.029F, 0.204F, -0.896F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, -1.459F, -17.6441F, 0.1019F, 0.1607F, -0.499F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(93, 115).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.941F, 2.1559F, -0.2415F, 0.049F, 0.7977F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(133, 22).addBox(3.7287F, -1.4502F, -0.8065F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.941F, 2.1559F, -0.2082F, 0.1207F, 1.1853F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(103, 116).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.941F, -0.6441F, -0.2118F, 0.0307F, 0.6942F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(95, 56).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.941F, -0.6441F, -0.1876F, 0.0925F, 1.0828F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 45).addBox(8.8689F, -6.2376F, -0.8345F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.941F, -0.6441F, -0.1241F, 0.1685F, 1.561F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 119).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.741F, -3.0441F, -0.1821F, 0.0123F, 0.5901F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(48, 102).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.741F, -3.0441F, -0.167F, 0.0642F, 0.9797F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 31).addBox(8.8689F, -6.2376F, -0.8345F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.741F, -3.0441F, -0.1189F, 0.1339F, 1.457F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(128, 87).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.159F, -6.0441F, -0.1228F, -0.0245F, 0.5548F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(110, 37).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.159F, -6.0441F, -0.1262F, 0.0076F, 0.9462F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(94, 0).addBox(8.8689F, -6.2376F, -0.8345F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.159F, -6.0441F, -0.1085F, 0.0649F, 1.4232F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(68, 55).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.359F, -9.0441F, -0.0853F, -0.049F, 0.9279F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(18, 23).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.359F, -9.0441F, -0.0634F, -0.0612F, 0.5348F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(20, 93).addBox(8.8689F, -6.2376F, -0.8345F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.359F, -9.0441F, -0.0983F, -0.0042F, 1.406F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(38, 8).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.859F, -12.0441F, -0.0037F, -0.0977F, 0.5126F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(35, 59).addBox(8.8689F, -6.2376F, -0.8345F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.859F, -12.0441F, -0.088F, -0.0732F, 1.3882F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 57).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -0.859F, -12.0441F, -0.0442F, -0.1056F, 0.9073F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(89, 82).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -1.459F, -15.0441F, 0.0565F, -0.1339F, 0.4882F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(35, 55).addBox(8.8689F, -6.2376F, -0.8345F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -1.459F, -15.0441F, -0.0776F, -0.1423F, 1.3696F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 33).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -1.459F, -15.0441F, -0.0027F, -0.1619F, 0.8843F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(35, 57).addBox(8.8689F, -6.2376F, -0.8345F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -1.459F, -17.6441F, -0.0697F, -0.194F, 1.3857F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 82).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -1.459F, -17.6441F, 0.029F, -0.204F, 0.896F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 28).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, -1.459F, -17.6441F, 0.1019F, -0.1607F, 0.499F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 69).addBox(-0.5F, -4.765F, 3.0956F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 108).addBox(-0.5F, -5.265F, 0.0956F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0446F, -10.0427F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 144).addBox(-0.5F, -5.4982F, -1.1047F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0446F, -11.9427F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(106, 144).addBox(-0.5F, -5.2987F, -1.0768F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4497F, -14.9583F, -0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(115, 0).addBox(-0.5F, -5.7755F, -1.4318F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -18.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(14, 147).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 146).addBox(-0.5F, -0.3F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 146).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7755F, -3.4318F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-21.8689F, -6.2376F, -0.8345F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1203F, 1.341F, -8.9441F, 0.008F, 0.4527F, -1.5453F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(-21.8689F, -6.2376F, -0.8345F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.741F, -5.9441F, -0.0483F, 0.3674F, -1.4496F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-21.8689F, -6.2376F, -0.8345F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.041F, -2.6441F, -0.0593F, 0.2807F, -1.4531F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(29, 83).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.041F, -2.6441F, 0.0806F, 0.2755F, -0.9536F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(94, 30).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.041F, -2.6441F, 0.1771F, 0.2072F, -0.5551F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.741F, -5.9441F, 0.1342F, 0.3463F, -0.9371F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(82, 102).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.741F, -5.9441F, 0.2536F, 0.2526F, -0.5376F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(94, 2).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1203F, 1.341F, -8.9441F, 0.2277F, 0.3948F, -1.0214F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(111, 94).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1203F, 1.341F, -8.9441F, 0.3561F, 0.2637F, -0.6296F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 64).addBox(8.8689F, -6.2376F, -0.8345F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.041F, -2.6441F, -0.0593F, -0.2807F, 1.4531F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(29, 83).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.041F, -2.6441F, 0.0806F, -0.2755F, 0.9536F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(94, 30).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.041F, -2.6441F, 0.1771F, -0.2072F, 0.5551F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 84).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.741F, -5.9441F, 0.1342F, -0.3463F, 0.9371F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 102).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.741F, -5.9441F, 0.2536F, -0.2526F, 0.5376F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(20, 91).addBox(8.8689F, -6.2376F, -0.8345F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.741F, -5.9441F, -0.0483F, -0.3674F, 1.4496F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(94, 2).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1203F, 1.341F, -8.9441F, 0.2277F, -0.3948F, 1.0214F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(111, 94).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1203F, 1.341F, -8.9441F, 0.3561F, -0.2637F, 0.6296F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(38, 27).addBox(8.8689F, -6.2376F, -0.8345F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1203F, 1.341F, -8.9441F, 0.008F, -0.4527F, 1.5453F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(135, 36).mirror().addBox(0.0F, -2.4736F, -0.1685F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 2.0559F, -1.1051F, 1.4748F, 0.0F, 0.1309F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(0.0F, -1.7446F, 0.5433F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 2.0559F, -1.1051F, 1.0036F, 0.0F, 0.1309F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(89, 69).mirror().addBox(0.0F, -1.2434F, 0.5637F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 2.0559F, -1.1051F, 0.4625F, 0.0F, 0.1309F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(72, 108).mirror().addBox(-2.0F, 0.9F, -5.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 108).addBox(16.0F, 0.9F, -5.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 1.3267F, -4.8205F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(84, 129).mirror().addBox(0.0F, -1.6771F, -5.7396F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 6.4267F, -6.3205F, 1.0626F, -0.2977F, -0.1457F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(43, 129).mirror().addBox(0.0F, -8.6162F, -3.3011F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 6.4267F, -6.3205F, 2.6858F, -0.2977F, -0.1457F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(0.0F, -8.5737F, -3.056F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 6.4267F, -6.3205F, 2.04F, -0.2977F, -0.1457F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(0.0F, -6.0752F, -6.2825F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 6.4267F, -6.3205F, 1.0102F, -0.2977F, -0.1457F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(0.0F, -1.5446F, -6.7422F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 6.4267F, -6.3205F, 0.155F, -0.2977F, -0.1457F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(1.5354F, -4.5992F, -0.5657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4919F, 12.7086F, -15.706F, 0.093F, 0.6919F, -1.228F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(94, 20).mirror().addBox(-0.8759F, -2.8126F, -1.0855F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1001F, 13.3119F, -12.5555F, 2.1349F, -0.7699F, -0.9461F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(124, 127).mirror().addBox(-0.8759F, -0.3227F, -3.8478F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1001F, 13.3119F, -12.5555F, 2.8156F, -0.7699F, -0.9461F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 130).mirror().addBox(-0.8759F, -2.2659F, -4.0226F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1001F, 13.3119F, -12.5555F, -3.1011F, -0.7699F, -0.9461F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(135, 36).addBox(-2.0F, -2.4736F, -0.1685F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 2.0559F, -1.1051F, 1.4748F, 0.0F, -0.1309F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(49, 38).addBox(-2.0F, -1.7446F, 0.5433F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(10.0F, 2.0559F, -1.1051F, 1.0036F, 0.0F, -0.1309F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(89, 69).addBox(-2.0F, -1.2434F, 0.5637F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 2.0559F, -1.1051F, 0.4625F, 0.0F, -0.1309F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(43, 129).addBox(-2.0F, -8.6162F, -3.3011F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 6.4267F, -6.3205F, 2.6858F, 0.2977F, 0.1457F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 130).addBox(-0.1241F, -2.2659F, -4.0226F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.1001F, 13.3119F, -12.5555F, -3.1011F, 0.7699F, 0.9461F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 20).addBox(-0.1241F, -2.8126F, -1.0855F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1001F, 13.3119F, -12.5555F, 2.1349F, 0.7699F, 0.9461F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(58, 83).addBox(-1.9919F, -1.4931F, -0.7089F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4919F, 12.7086F, -15.706F, 0.7215F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(99, 89).addBox(-2.5354F, -4.5992F, -0.5657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4919F, 12.7086F, -15.706F, 0.093F, -0.6919F, 1.228F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(36, 113).mirror().addBox(1.2859F, 0.2865F, -10.8819F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 95).mirror().addBox(0.2859F, 0.2865F, -7.8819F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5048F, 19.9987F, -1.206F, -0.3124F, -0.2079F, 0.0666F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(63, 108).mirror().addBox(0.2219F, 0.0154F, -0.0698F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5048F, 20.6987F, -5.606F, -0.2439F, -0.6195F, 0.2075F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(137, 70).mirror().addBox(-0.3702F, -0.0641F, -0.7889F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3048F, 20.4987F, -5.106F, -0.4172F, -0.9775F, 0.4573F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(119, 32).mirror().addBox(-0.2212F, 0.2208F, -0.6793F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3048F, 20.3987F, -5.106F, -0.276F, -0.6688F, 0.3245F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(48, 104).mirror().addBox(-0.7F, 0.0F, -1.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3947F, 20.7217F, 1.3469F, 0.6148F, -0.8839F, -0.1471F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(36, 113).addBox(-3.2859F, 0.2865F, -10.8819F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(138, 95).addBox(-3.2859F, 0.2865F, -7.8819F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5048F, 19.9987F, -1.206F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(137, 70).addBox(-0.6298F, -0.0641F, -0.7889F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3048F, 20.4987F, -5.106F, -0.4172F, 0.9775F, -0.4573F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 104).addBox(-0.3F, 0.0F, -1.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3947F, 20.7217F, 1.3469F, 0.6148F, 0.8839F, 0.1471F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(63, 108).addBox(-1.2219F, 0.0154F, -0.0698F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5048F, 20.6987F, -5.606F, -0.2439F, 0.6195F, -0.2075F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(119, 32).addBox(-0.7788F, 0.2208F, -0.6793F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3048F, 20.3987F, -5.106F, -0.276F, 0.6688F, -0.3245F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(124, 127).addBox(-0.1241F, -0.3227F, -3.8478F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1001F, 13.3119F, -12.5555F, 2.8156F, 0.7699F, 0.9461F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(58, 89).addBox(-2.0F, -8.5737F, -3.056F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(10.0F, 6.4267F, -6.3205F, 2.04F, 0.2977F, 0.1457F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(94, 4).addBox(-2.0F, -6.0752F, -6.2825F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 6.4267F, -6.3205F, 1.0102F, 0.2977F, 0.1457F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(68, 41).addBox(-2.0F, -1.5446F, -6.7422F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(10.0F, 6.4267F, -6.3205F, 0.155F, 0.2977F, 0.1457F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(84, 129).addBox(-2.0F, -1.6771F, -5.7396F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(10.0F, 6.4267F, -6.3205F, 1.0626F, 0.2977F, 0.1457F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.0783F, -0.1407F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -9.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 12.7424F, -9.5629F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftArm4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(130, 36).addBox(-36.1708F, -0.5737F, -43.3819F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0629F, -45.268F, 27.6218F, 1.1177F, -0.272F, -0.5042F));

		PartDefinition cube_r147 = leftArm4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(127, 117).addBox(-2.0F, -2.7651F, -5.8088F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3412F, 2.0064F, 1.7035F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftArm4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(38, 0).addBox(-0.9078F, -0.2367F, 0.3414F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9149F, 4.5814F, -2.9439F, 1.1346F, -0.2085F, 0.2274F));

		PartDefinition cube_r149 = leftArm4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(137, 133).addBox(-0.5F, -1.8F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5999F, 6.8661F, -1.293F, 1.5796F, -0.2085F, 0.2274F));

		PartDefinition cube_r150 = leftArm4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(138, 105).addBox(-7.4041F, -31.8297F, -61.5852F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0629F, -45.268F, 27.6218F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftArm4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(106, 111).addBox(-2.0F, -3.0F, -0.1F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3412F, 13.4172F, -0.208F, 1.5184F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 16.4601F, -0.9271F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftArm5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(139, 45).addBox(-2.1F, -2.6333F, 1.3991F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(110, 56).addBox(-1.4F, -2.6333F, -7.3009F, 3.0F, 2.0F, 9.0F, new CubeDeformation(-0.12F))
				.texOffs(94, 20).addBox(-1.9F, -0.1333F, -8.0009F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0333F, 4.0296F, -1.2954F, 1.5708F, 1.4835F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 10.9475F, -1.6938F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftArm6.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(54, 129).addBox(20.393F, -17.3728F, -88.9215F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5771F, -82.8255F, 17.7959F, 1.5708F, 0.0F, 0.3491F));

		PartDefinition cube_r154 = leftArm6.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(115, 20).addBox(-2.9041F, -17.3838F, -90.8862F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(102, 100).addBox(-8.9041F, -19.3838F, -90.8862F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(125, 94).addBox(-9.9041F, -17.3838F, -90.8862F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5771F, -82.8255F, 17.7959F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 12.7424F, -9.5629F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r155 = rightArm4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(47, 113).addBox(33.1708F, -0.5737F, -43.3819F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0629F, -45.268F, 27.6218F, 1.1177F, 0.272F, 0.5042F));

		PartDefinition cube_r156 = rightArm4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(126, 50).addBox(-2.0F, -2.7651F, -5.8088F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3412F, 2.0064F, 1.7035F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r157 = rightArm4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(18, 15).addBox(-0.0922F, -0.2367F, 0.3414F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9149F, 4.5814F, -2.9439F, 1.1346F, 0.2085F, -0.2274F));

		PartDefinition cube_r158 = rightArm4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(110, 135).addBox(-0.5F, -1.8F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5999F, 6.8661F, -1.293F, 1.5796F, 0.2085F, -0.2274F));

		PartDefinition cube_r159 = rightArm4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(138, 87).addBox(3.4041F, -31.8297F, -61.5852F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0629F, -45.268F, 27.6218F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightArm4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(111, 82).addBox(-2.0F, -3.0F, -0.1F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3412F, 13.4172F, -0.208F, 1.5184F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 16.4601F, -0.9271F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightArm5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 99).addBox(-1.9F, -2.6333F, 1.3991F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(47, 108).addBox(-1.6F, -2.6333F, -7.3009F, 3.0F, 2.0F, 9.0F, new CubeDeformation(-0.12F))
				.texOffs(94, 4).addBox(-2.1F, -0.1333F, -8.0009F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0333F, 4.0296F, -1.2954F, 1.5708F, -1.4835F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 10.9475F, -1.6938F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightArm6.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(13, 123).addBox(-21.393F, -17.3728F, -88.9215F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5771F, -82.8255F, 17.7959F, 1.5708F, 0.0F, -0.3491F));

		PartDefinition cube_r163 = rightArm6.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(115, 0).addBox(0.9041F, -17.3838F, -90.8862F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(25, 102).addBox(1.9041F, -19.3838F, -90.8862F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 123).addBox(7.9041F, -17.3838F, -90.8862F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5771F, -82.8255F, 17.7959F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(9.9F, 30.1082F, 13.023F, 0.0625F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3226F, 0.4916F, -0.4552F, 0.0F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 8.4811F, -1.6829F, 0.4351F, 0.0F, 0.0F));

		PartDefinition Leftclaw = handleft.addOrReplaceChild("Leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.98F, 1.4337F, 1.3758F, 0.3183F, 0.2122F, 0.5732F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(147, 11).addBox(-0.5F, -4.6925F, -3.656F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, -9.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r164 = neck6.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(146, 142).addBox(-0.5F, 1.0F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0925F, -7.256F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck6.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-20.8689F, -6.2376F, -0.8345F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.041F, -2.8441F, 0.0399F, 0.4666F, -1.5692F));

		PartDefinition cube_r166 = neck6.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.041F, -2.8441F, 0.262F, 0.3926F, -1.0463F));

		PartDefinition cube_r167 = neck6.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.041F, -2.8441F, 0.3856F, 0.2497F, -0.6601F));

		PartDefinition cube_r168 = neck6.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(29, 95).mirror().addBox(-10.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.641F, -6.5441F, 0.4141F, 0.5103F, -1.1542F));

		PartDefinition cube_r169 = neck6.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(85, 110).mirror().addBox(-4.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.641F, -6.5441F, 0.563F, 0.3086F, -0.7856F));

		PartDefinition cube_r170 = neck6.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(85, 108).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.041F, -2.8441F, 0.3856F, -0.2497F, 0.6601F));

		PartDefinition cube_r171 = neck6.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(94, 36).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.041F, -2.8441F, 0.262F, -0.3926F, 1.0463F));

		PartDefinition cube_r172 = neck6.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 59).addBox(8.8689F, -6.2376F, -0.8345F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.041F, -2.8441F, 0.0399F, -0.4666F, 1.5692F));

		PartDefinition cube_r173 = neck6.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(29, 95).addBox(3.7287F, -1.4502F, -0.8065F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.641F, -6.5441F, 0.4141F, -0.5103F, 1.1542F));

		PartDefinition cube_r174 = neck6.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(85, 110).addBox(0.0855F, 0.1433F, -0.7148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.641F, -6.5441F, 0.563F, -0.3086F, 0.7856F));

		PartDefinition cube_r175 = neck6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(112, 50).mirror().addBox(-12.8689F, -6.2376F, -0.8345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0203F, 0.641F, -6.5441F, 0.1071F, 0.6377F, -1.7083F));

		PartDefinition cube_r176 = neck6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(112, 50).addBox(8.8689F, -6.2376F, -0.8345F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0203F, 0.641F, -6.5441F, 0.1071F, -0.6377F, 1.7083F));

		PartDefinition cube_r177 = neck6.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -0.3786F, -0.8375F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.307F, -7.8292F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.393F, -7.3292F, 0.0252F, 0.221F, -0.0797F));

		PartDefinition cube_r178 = neck5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, -0.5012F, 0.1507F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8F, -11.6F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r179 = neck5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 153).mirror().addBox(0.3536F, 11.1326F, -0.6841F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 0.7746F, -0.2721F, 0.0714F));

		PartDefinition cube_r180 = neck5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(41, 153).mirror().addBox(1.431F, 14.3019F, 1.2864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 0.7024F, -0.2665F, 0.0906F));

		PartDefinition cube_r181 = neck5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(149, 126).mirror().addBox(-2.6581F, 8.4103F, -1.1846F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(151, 132).mirror().addBox(-2.5519F, 5.1145F, -1.0223F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(151, 141).mirror().addBox(-2.4632F, 0.8758F, -0.8326F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 1.435F, -0.4058F, -1.156F));

		PartDefinition cube_r182 = neck5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(147, 17).mirror().addBox(0.2567F, 7.3113F, -0.1265F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 41).mirror().addBox(0.2331F, 4.0099F, -0.1061F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 108).mirror().addBox(0.2325F, -0.2339F, -0.122F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 1.1806F, 0.2586F, 0.5613F));

		PartDefinition cube_r183 = neck5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(154, 53).mirror().addBox(-0.9033F, 8.3603F, -1.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(154, 73).mirror().addBox(-0.8262F, 5.0623F, -1.3022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 0).mirror().addBox(-0.7534F, 0.8209F, -1.1784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 1.1966F, -0.2121F, -0.492F));

		PartDefinition cube_r184 = neck5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(153, 60).mirror().addBox(-1.1843F, 8.4673F, -2.9745F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(153, 63).mirror().addBox(-1.1592F, 5.1692F, -2.8249F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 153).mirror().addBox(-1.1356F, 0.9278F, -2.6833F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 1.1484F, -0.0685F, -0.1511F));

		PartDefinition cube_r185 = neck5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(113, 56).mirror().addBox(1.431F, 8.8265F, 0.3032F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 0.7722F, -0.2665F, 0.0906F));

		PartDefinition cube_r186 = neck5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(52, 147).mirror().addBox(0.3536F, 5.5275F, -1.4413F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 0.8444F, -0.2721F, 0.0714F));

		PartDefinition cube_r187 = neck5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(153, 88).mirror().addBox(-0.8148F, 6.4507F, -2.1371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 0.8469F, -0.2764F, 0.0517F));

		PartDefinition cube_r188 = neck5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(57, 147).mirror().addBox(-0.8148F, 0.7556F, -2.5643F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1096F, -6.0592F, -9.9965F, 0.9168F, -0.2764F, 0.0517F));

		PartDefinition cube_r189 = neck5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(41, 153).addBox(-2.431F, 14.3019F, 1.2864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 0.7024F, 0.2665F, -0.0906F));

		PartDefinition cube_r190 = neck5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(113, 56).addBox(-2.431F, 8.8265F, 0.3032F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 0.7722F, 0.2665F, -0.0906F));

		PartDefinition cube_r191 = neck5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(153, 60).addBox(-0.8157F, 8.4673F, -2.9745F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(153, 63).addBox(-0.8408F, 5.1692F, -2.8249F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 153).addBox(-0.8644F, 0.9278F, -2.6833F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 1.1484F, 0.0685F, 0.1511F));

		PartDefinition cube_r192 = neck5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(154, 53).addBox(-0.0967F, 8.3603F, -1.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(154, 73).addBox(-0.1738F, 5.0623F, -1.3022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 0).addBox(-0.2466F, 0.8209F, -1.1784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 1.1966F, 0.2121F, 0.492F));

		PartDefinition cube_r193 = neck5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(147, 17).addBox(-1.2567F, 7.3113F, -0.1265F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(79, 41).addBox(-1.2331F, 4.0099F, -0.1061F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 108).addBox(-1.2325F, -0.2339F, -0.122F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 1.1806F, -0.2586F, -0.5613F));

		PartDefinition cube_r194 = neck5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(149, 126).addBox(0.6581F, 8.4103F, -1.1846F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(151, 132).addBox(0.5519F, 5.1145F, -1.0223F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(151, 141).addBox(0.4632F, 0.8758F, -0.8326F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 1.435F, 0.4058F, 1.156F));

		PartDefinition cube_r195 = neck5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(46, 93).addBox(-2.1096F, -1.6868F, 8.113F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 129).addBox(-2.1096F, -1.8385F, 4.815F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(137, 70).addBox(-2.1096F, -2.2821F, 1.5736F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(79, 153).addBox(-1.3536F, 11.1326F, -0.6841F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 0.7746F, 0.2721F, -0.0714F));

		PartDefinition cube_r197 = neck5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(52, 147).addBox(-1.3536F, 5.5275F, -1.4413F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 0.8444F, 0.2721F, -0.0714F));

		PartDefinition cube_r198 = neck5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(153, 88).addBox(-0.1852F, 6.4507F, -2.1371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 0.8469F, 0.2764F, -0.0517F));

		PartDefinition cube_r199 = neck5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(57, 147).addBox(-0.1852F, 0.7556F, -2.5643F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1096F, -6.0592F, -9.9965F, 0.9168F, 0.2764F, -0.0517F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, -11.1F, 0.1329F, 0.173F, 0.023F));

		PartDefinition cube_r200 = neck4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(21, 126).addBox(-1.5F, -15.0F, -2.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r201 = neck4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(26, 151).mirror().addBox(-0.0421F, 3.5112F, -0.3143F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -1.3789F, -3.4089F, 0.5033F, -0.2638F, 0.056F));

		PartDefinition cube_r202 = neck4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(147, 77).mirror().addBox(-0.0421F, -2.0565F, -0.6406F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -1.3789F, -3.4089F, 0.5731F, -0.2638F, 0.056F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(153, 70).mirror().addBox(-0.9227F, -2.2474F, -0.5878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, 0.0211F, -1.9089F, 0.7836F, -0.118F, -0.1168F));

		PartDefinition cube_r204 = neck4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(152, 45).mirror().addBox(-0.5947F, -2.2885F, 0.1743F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, 0.0211F, -1.9089F, 1.2393F, -0.7341F, -1.0486F));

		PartDefinition cube_r205 = neck4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(155, 3).mirror().addBox(0.1963F, -2.3543F, 0.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, 0.0211F, -1.9089F, 0.8509F, -0.3704F, -0.3915F));

		PartDefinition cube_r206 = neck4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-1.0246F, -3.684F, 1.4189F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, 0.0211F, -1.9089F, 0.8391F, 0.4369F, 0.4435F));

		PartDefinition cube_r207 = neck4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(11, 66).mirror().addBox(-1.0246F, -3.684F, 1.4189F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -3.8789F, -5.5089F, 0.8391F, 0.4369F, 0.4435F));

		PartDefinition cube_r208 = neck4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(155, 6).mirror().addBox(0.1963F, -2.3543F, 0.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -3.8789F, -5.5089F, 0.8509F, -0.3704F, -0.3915F));

		PartDefinition cube_r209 = neck4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 153).mirror().addBox(-0.9227F, -2.2474F, -0.5878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -3.8789F, -5.5089F, 0.7836F, -0.118F, -0.1168F));

		PartDefinition cube_r210 = neck4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(152, 115).mirror().addBox(-0.5947F, -2.2885F, 0.1743F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -3.8789F, -5.5089F, 1.2393F, -0.7341F, -1.0486F));

		PartDefinition cube_r211 = neck4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(150, 0).mirror().addBox(-1.6229F, -2.6763F, -0.9363F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -3.8789F, -5.5089F, 0.5731F, -0.2638F, 0.1782F));

		PartDefinition cube_r212 = neck4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(107, 153).mirror().addBox(-1.6229F, 1.9534F, -0.5684F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -3.8789F, -5.5089F, 0.416F, -0.2638F, 0.1782F));

		PartDefinition cube_r213 = neck4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(153, 27).mirror().addBox(-0.9281F, -2.1099F, -0.6204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -7.8789F, -9.1089F, 0.7836F, -0.118F, -0.1168F));

		PartDefinition cube_r214 = neck4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(153, 108).mirror().addBox(-0.2099F, 3.3754F, -0.1725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8737F, -9.0789F, -10.3089F, 0.416F, -0.2638F, 0.0909F));

		PartDefinition cube_r215 = neck4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(21, 151).mirror().addBox(-0.2099F, -1.2098F, -0.7678F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8737F, -9.0789F, -10.3089F, 0.5731F, -0.2638F, 0.0909F));

		PartDefinition cube_r216 = neck4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(155, 19).mirror().addBox(0.1795F, -2.2168F, 0.6731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -7.8789F, -9.1089F, 0.8509F, -0.3704F, -0.3915F));

		PartDefinition cube_r217 = neck4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(152, 121).mirror().addBox(-0.6239F, -2.1511F, 0.1576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.9737F, -7.8789F, -9.1089F, 1.2393F, -0.7341F, -1.0486F));

		PartDefinition cube_r218 = neck4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(115, 20).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0103F, -10.1684F, -8.1481F, 0.7955F, 0.4369F, 0.4435F));

		PartDefinition cube_r219 = neck4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(26, 151).addBox(-0.9579F, 3.5112F, -0.3143F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9737F, -1.3789F, -3.4089F, 0.5033F, 0.2638F, -0.056F));

		PartDefinition cube_r220 = neck4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(147, 77).addBox(-0.9579F, -2.0565F, -0.6406F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9737F, -1.3789F, -3.4089F, 0.5731F, 0.2638F, -0.056F));

		PartDefinition cube_r221 = neck4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(153, 70).addBox(-1.0773F, -2.2474F, -0.5878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, 0.0211F, -1.9089F, 0.7836F, 0.118F, 0.1168F));

		PartDefinition cube_r222 = neck4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(152, 45).addBox(-1.4053F, -2.2885F, 0.1743F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9737F, 0.0211F, -1.9089F, 1.2393F, 0.7341F, 1.0486F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(155, 3).addBox(-1.1963F, -2.3543F, 0.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, 0.0211F, -1.9089F, 0.8509F, 0.3704F, 0.3915F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 66).addBox(0.0246F, -3.684F, 1.4189F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9737F, 0.0211F, -1.9089F, 0.8391F, -0.4369F, -0.4435F));

		PartDefinition cube_r225 = neck4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(150, 39).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6397F, -0.0597F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r226 = neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(150, 64).addBox(0.0F, -1.3F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5397F, -3.6597F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(11, 66).addBox(0.0246F, -3.684F, 1.4189F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9737F, -3.8789F, -5.5089F, 0.8391F, -0.4369F, -0.4435F));

		PartDefinition cube_r228 = neck4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(155, 6).addBox(-1.1963F, -2.3543F, 0.7015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, -3.8789F, -5.5089F, 0.8509F, 0.3704F, 0.3915F));

		PartDefinition cube_r229 = neck4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(72, 153).addBox(-1.0773F, -2.2474F, -0.5878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, -3.8789F, -5.5089F, 0.7836F, 0.118F, 0.1168F));

		PartDefinition cube_r230 = neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(152, 115).addBox(-1.4053F, -2.2885F, 0.1743F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9737F, -3.8789F, -5.5089F, 1.2393F, 0.7341F, 1.0486F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(150, 0).addBox(0.6229F, -2.6763F, -0.9363F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, -3.8789F, -5.5089F, 0.5731F, 0.2638F, -0.1782F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(107, 153).addBox(0.6229F, 1.9534F, -0.5684F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, -3.8789F, -5.5089F, 0.416F, 0.2638F, -0.1782F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(153, 27).addBox(-1.0719F, -2.1099F, -0.6204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, -7.8789F, -9.1089F, 0.7836F, 0.118F, 0.1168F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(153, 108).addBox(-0.7901F, 3.3754F, -0.1725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8737F, -9.0789F, -10.3089F, 0.416F, 0.2638F, -0.0909F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(21, 151).addBox(-0.7901F, -1.2098F, -0.7678F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8737F, -9.0789F, -10.3089F, 0.5731F, 0.2638F, -0.0909F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(155, 19).addBox(-1.1795F, -2.2168F, 0.6731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9737F, -7.8789F, -9.1089F, 0.8509F, 0.3704F, 0.3915F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(152, 121).addBox(-1.3761F, -2.1511F, 0.1576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9737F, -7.8789F, -9.1089F, 1.2393F, 0.7341F, 1.0486F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(115, 20).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0103F, -10.1684F, -8.1481F, 0.7955F, -0.4369F, -0.4435F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(152, 20).addBox(-1.9737F, -4.1985F, -1.737F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9737F, -7.8789F, -9.1089F, -0.8814F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.3F, -10.3F, -0.3161F, 0.5872F, -0.1793F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(34, 126).addBox(-1.0F, -16.0F, -0.8F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(126, 152).mirror().addBox(-1.1475F, -0.9992F, -1.0825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -3.5739F, -2.6513F, 0.7137F, -0.1258F, -0.1083F));

		PartDefinition cube_r242 = neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(119, 134).mirror().addBox(-0.8785F, -2.161F, 0.755F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -3.5739F, -2.6513F, 0.7686F, 0.4659F, 0.4127F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(101, 20).mirror().addBox(-0.1908F, -1.1062F, 0.3203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -3.5739F, -2.6513F, 0.781F, -0.3962F, -0.3654F));

		PartDefinition cube_r244 = neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(63, 120).mirror().addBox(-1.121F, -1.0374F, 0.0697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -3.5739F, -2.6513F, 1.1896F, -0.794F, -1.0143F));

		PartDefinition cube_r245 = neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(36, 153).mirror().addBox(-0.4108F, 2.414F, -0.8726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7337F, -3.5739F, -3.6513F, 0.6971F, -0.2588F, 0.0654F));

		PartDefinition cube_r246 = neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(150, 102).mirror().addBox(-0.4108F, -1.1069F, -0.4756F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7337F, -3.5739F, -3.6513F, 0.54F, -0.2588F, 0.0654F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(87, 147).mirror().addBox(-0.8785F, -2.561F, 0.755F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -7.2739F, -5.5513F, 0.7686F, 0.4659F, 0.4127F));

		PartDefinition cube_r248 = neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(102, 49).mirror().addBox(-0.1908F, -1.1062F, 0.3203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -7.2739F, -5.5513F, 0.781F, -0.3962F, -0.3654F));

		PartDefinition cube_r249 = neck3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(124, 77).mirror().addBox(-1.121F, -1.0374F, 0.0697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -7.2739F, -5.5513F, 1.1896F, -0.794F, -1.0143F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(152, 129).mirror().addBox(-1.1475F, -0.9992F, -1.0825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -7.2739F, -5.5513F, 0.7137F, -0.1258F, -0.1083F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(58, 46).mirror().addBox(-1.3227F, -1.532F, -1.2678F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -7.2739F, -5.5513F, 0.5492F, -0.1195F, 0.0637F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(152, 138).mirror().addBox(-1.1475F, -0.9992F, -1.0825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -10.8739F, -8.4513F, 0.7137F, -0.1258F, -0.1083F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(125, 105).mirror().addBox(-1.121F, -1.0374F, 0.0697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -10.8739F, -8.4513F, 1.1896F, -0.794F, -1.0143F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(61, 129).mirror().addBox(-0.1908F, -1.1062F, 0.3203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -10.8739F, -8.4513F, 0.781F, -0.3962F, -0.3654F));

		PartDefinition cube_r255 = neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(-0.8785F, -2.161F, 0.755F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -10.8739F, -8.4513F, 0.7686F, 0.4659F, 0.4127F));

		PartDefinition cube_r256 = neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(98, 64).mirror().addBox(-1.3227F, -1.532F, -1.2678F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -10.8739F, -8.4513F, 0.5492F, -0.1195F, 0.0637F));

		PartDefinition cube_r257 = neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(126, 152).addBox(-0.8525F, -0.9992F, -1.0825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -3.5739F, -2.6513F, 0.7137F, 0.1258F, 0.1083F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(68, 89).addBox(-0.9337F, -2.6522F, -0.2848F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9337F, -3.5739F, -2.6513F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(119, 134).addBox(-0.1215F, -2.161F, 0.755F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9337F, -3.5739F, -2.6513F, 0.7686F, -0.4659F, -0.4127F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(101, 20).addBox(-0.8092F, -1.1062F, 0.3203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -3.5739F, -2.6513F, 0.781F, 0.3962F, 0.3654F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(63, 120).addBox(-0.879F, -1.0374F, 0.0697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9337F, -3.5739F, -2.6513F, 1.1896F, 0.794F, 1.0143F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(36, 153).addBox(-0.5892F, 2.414F, -0.8726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7337F, -3.5739F, -3.6513F, 0.6971F, 0.2588F, -0.0654F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(150, 102).addBox(-0.5892F, -1.1069F, -0.4756F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7337F, -3.5739F, -3.6513F, 0.54F, 0.2588F, -0.0654F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(82, 95).addBox(-0.9337F, -2.6522F, -0.9848F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9337F, -7.2739F, -5.5513F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(87, 147).addBox(-0.1215F, -2.561F, 0.755F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9337F, -7.2739F, -5.5513F, 0.7686F, -0.4659F, -0.4127F));

		PartDefinition cube_r266 = neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(102, 49).addBox(-0.8092F, -1.1062F, 0.3203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -7.2739F, -5.5513F, 0.781F, 0.3962F, 0.3654F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(124, 77).addBox(-0.879F, -1.0374F, 0.0697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9337F, -7.2739F, -5.5513F, 1.1896F, 0.794F, 1.0143F));

		PartDefinition cube_r268 = neck3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(152, 129).addBox(-0.8525F, -0.9992F, -1.0825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -7.2739F, -5.5513F, 0.7137F, 0.1258F, 0.1083F));

		PartDefinition cube_r269 = neck3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(58, 46).addBox(0.3227F, -1.532F, -1.2678F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -7.2739F, -5.5513F, 0.5492F, 0.1195F, -0.0637F));

		PartDefinition cube_r270 = neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(152, 138).addBox(-0.8525F, -0.9992F, -1.0825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -10.8739F, -8.4513F, 0.7137F, 0.1258F, 0.1083F));

		PartDefinition cube_r271 = neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(125, 105).addBox(-0.879F, -1.0374F, 0.0697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9337F, -10.8739F, -8.4513F, 1.1896F, 0.794F, 1.0143F));

		PartDefinition cube_r272 = neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(61, 129).addBox(-0.8092F, -1.1062F, 0.3203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -10.8739F, -8.4513F, 0.781F, 0.3962F, 0.3654F));

		PartDefinition cube_r273 = neck3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(68, 41).addBox(-0.1215F, -2.161F, 0.755F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9337F, -10.8739F, -8.4513F, 0.7686F, -0.4659F, -0.4127F));

		PartDefinition cube_r274 = neck3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(111, 123).addBox(-0.9337F, -2.6522F, -0.9848F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9337F, -10.8739F, -8.4513F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r275 = neck3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(98, 64).addBox(0.3227F, -1.532F, -1.2678F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9337F, -10.8739F, -8.4513F, 0.5492F, 0.1195F, -0.0637F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.1F, -9.3F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(125, 105).addBox(-1.0F, -0.0274F, 2.9067F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1106F, -8.0784F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 153).mirror().addBox(-1.2073F, -0.6153F, -1.3788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -1.1512F, -2.1553F, 0.8882F, -0.1052F, -0.1284F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(102, 41).mirror().addBox(-0.3428F, -1.1982F, -0.6499F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8236F, -0.5512F, -2.8553F, 0.7248F, -0.1287F, 0.0419F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(132, 60).mirror().addBox(-1.4014F, -0.6541F, -0.0452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -1.1512F, -2.1553F, 1.3044F, -0.6422F, -1.0901F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(101, 129).mirror().addBox(-0.3529F, -0.7223F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -1.1512F, -2.1553F, 0.9532F, -0.3287F, -0.4266F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-0.7206F, -1.7662F, 0.5141F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -1.1512F, -2.1553F, 0.9414F, 0.39F, 0.4846F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(7, 153).mirror().addBox(-1.2073F, -0.6153F, -1.3788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -3.1512F, -4.6553F, 0.9577F, -0.096F, -0.1354F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(152, 34).mirror().addBox(-0.7206F, -1.7662F, 0.5141F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -3.1512F, -4.6553F, 1.0073F, 0.3567F, 0.5087F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(95, 140).mirror().addBox(-0.3529F, -0.7223F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -3.1512F, -4.6553F, 1.0197F, -0.2992F, -0.4472F));

		PartDefinition cube_r285 = neck2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(62, 140).mirror().addBox(-1.4014F, -0.6541F, -0.0452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9236F, -3.1512F, -4.6553F, 1.343F, -0.5799F, -1.1122F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(148, 148).mirror().addBox(-0.3428F, -1.2982F, -0.6499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8236F, -2.5512F, -5.3553F, 0.7952F, -0.1314F, 0.0328F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 153).addBox(-0.7927F, -0.6153F, -1.3788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9236F, -1.1512F, -2.1553F, 0.8882F, 0.1052F, 0.1284F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(102, 41).addBox(-0.6572F, -1.1982F, -0.6499F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8236F, -0.5512F, -2.8553F, 0.7248F, 0.1287F, -0.0419F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(132, 60).addBox(-0.5986F, -0.6541F, -0.0452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9236F, -1.1512F, -2.1553F, 1.3044F, 0.6422F, 1.0901F));

		PartDefinition cube_r290 = neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(101, 129).addBox(-0.6471F, -0.7223F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9236F, -1.1512F, -2.1553F, 0.9532F, 0.3287F, 0.4266F));

		PartDefinition cube_r291 = neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(14, 108).addBox(-0.2794F, -1.7662F, 0.5141F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9236F, -1.1512F, -2.1553F, 0.9414F, -0.39F, -0.4846F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(48, 140).addBox(-0.9236F, -2.3846F, -0.576F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9236F, -1.1512F, -2.1553F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(7, 153).addBox(-0.7927F, -0.6153F, -1.3788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9236F, -3.1512F, -4.6553F, 0.9577F, 0.096F, 0.1354F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(152, 34).addBox(-0.2794F, -1.7662F, 0.5141F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9236F, -3.1512F, -4.6553F, 1.0073F, -0.3567F, -0.5087F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(150, 83).addBox(-0.9236F, -2.3846F, -1.176F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9236F, -3.1512F, -4.6553F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(95, 140).addBox(-0.6471F, -0.7223F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9236F, -3.1512F, -4.6553F, 1.0197F, 0.2992F, 0.4472F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(62, 140).addBox(-0.5986F, -0.6541F, -0.0452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9236F, -3.1512F, -4.6553F, 1.343F, 0.5799F, 1.1122F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(148, 148).addBox(-0.6572F, -1.2982F, -0.6499F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8236F, -2.5512F, -5.3553F, 0.7952F, 0.1314F, -0.0328F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.3106F, -6.6784F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition cube_r299 = neck.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(152, 94).mirror().addBox(-0.2924F, -1.5049F, 0.7492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -0.3812F, -0.9048F, 1.2785F, 0.1971F, 0.5835F));

		PartDefinition cube_r300 = neck.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(141, 28).mirror().addBox(0.0328F, -0.462F, -0.2356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -0.3812F, -0.9048F, 1.2978F, -0.1575F, -0.5107F));

		PartDefinition cube_r301 = neck.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(142, 0).mirror().addBox(-1.2779F, -0.4105F, -0.5272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -0.3812F, -0.9048F, 1.4828F, -0.3016F, -1.1725F));

		PartDefinition cube_r302 = neck.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(31, 153).mirror().addBox(-0.9663F, -0.6834F, -0.757F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, 0.4188F, -1.1048F, 1.0149F, -0.1373F, 0.0055F));

		PartDefinition cube_r303 = neck.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(14, 153).mirror().addBox(-0.7395F, -0.3551F, -1.5213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -0.3812F, -0.9048F, 1.2607F, -0.051F, -0.1578F));

		PartDefinition cube_r304 = neck.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(42, 34).mirror().addBox(-0.4429F, -0.1448F, 0.967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -1.1812F, -4.2048F, 1.3228F, 0.1681F, 0.5915F));

		PartDefinition cube_r305 = neck.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(153, 82).mirror().addBox(0.6216F, -0.707F, -0.4183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0085F, -0.9812F, -3.1048F, 1.3439F, -0.1317F, -0.5173F));

		PartDefinition cube_r306 = neck.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(146, 113).mirror().addBox(-1.2385F, -0.6293F, -0.5035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -1.0812F, -3.1048F, 1.5038F, -0.2533F, -1.1783F));

		PartDefinition cube_r307 = neck.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(23, 48).mirror().addBox(-0.4351F, -0.5648F, 0.0788F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7812F, 0.4527F, -3.7315F, 1.1557F, -0.1424F, -0.012F));

		PartDefinition cube_r308 = neck.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(153, 16).mirror().addBox(-1.0426F, -0.607F, -0.9092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0085F, -0.5812F, -3.2048F, 1.3124F, -0.0427F, -0.1603F));

		PartDefinition cube_r309 = neck.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(152, 94).addBox(-0.7076F, -1.5049F, 0.7492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4085F, -0.3812F, -0.9048F, 1.2785F, -0.1971F, -0.5835F));

		PartDefinition cube_r310 = neck.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(151, 48).addBox(-1.4085F, -2.3443F, -0.9113F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4085F, -0.3812F, -0.9048F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(141, 28).addBox(-1.0328F, -0.462F, -0.2356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4085F, -0.3812F, -0.9048F, 1.2978F, 0.1575F, 0.5107F));

		PartDefinition cube_r312 = neck.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(142, 0).addBox(-0.7221F, -0.4105F, -0.5272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4085F, -0.3812F, -0.9048F, 1.4828F, 0.3016F, 1.1725F));

		PartDefinition cube_r313 = neck.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(31, 153).addBox(-0.0337F, -0.6834F, -0.757F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4085F, 0.4188F, -1.1048F, 1.0149F, 0.1373F, -0.0055F));

		PartDefinition cube_r314 = neck.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(14, 153).addBox(-1.2605F, -0.3551F, -1.5213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4085F, -0.3812F, -0.9048F, 1.2607F, 0.051F, 0.1578F));

		PartDefinition cube_r315 = neck.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(42, 34).addBox(-0.5571F, -0.1448F, 0.967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4085F, -1.1812F, -4.2048F, 1.3228F, -0.1681F, -0.5915F));

		PartDefinition cube_r316 = neck.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(151, 55).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2174F, -2.7304F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r317 = neck.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(153, 82).addBox(-1.6216F, -0.707F, -0.4183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0085F, -0.9812F, -3.1048F, 1.3439F, 0.1317F, 0.5173F));

		PartDefinition cube_r318 = neck.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(146, 113).addBox(-0.7615F, -0.6293F, -0.5035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4085F, -1.0812F, -3.1048F, 1.5038F, 0.2533F, 1.1783F));

		PartDefinition cube_r319 = neck.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(23, 48).addBox(-0.5649F, -0.5648F, 0.0788F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7812F, 0.4527F, -3.7315F, 1.1557F, 0.1424F, 0.012F));

		PartDefinition cube_r320 = neck.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(153, 16).addBox(-0.9574F, -0.607F, -0.9092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0085F, -0.5812F, -3.2048F, 1.3124F, 0.0427F, 0.1603F));

		PartDefinition cube_r321 = neck.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(140, 3).addBox(-1.0F, -1.1F, -0.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(154, 30).addBox(-0.5F, -2.6967F, -5.5021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 116).addBox(-1.5F, -2.6967F, -4.5021F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.8F, -4.4F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(82, 95).mirror().addBox(-0.5F, -0.2632F, -4.3958F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.736F, -4.3498F, 0.7F, 0.0668F, 0.0562F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(82, 95).addBox(-0.5F, -0.2632F, -4.3958F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.736F, -4.3498F, 0.7F, -0.0668F, -0.0562F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(135, 142).addBox(-0.5F, -0.0879F, -3.9248F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5614F, -7.2684F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(23, 117).addBox(-0.5F, -0.0353F, -2.0337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.6614F, -5.4684F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(141, 50).addBox(-1.0F, -0.417F, -2.9622F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(141, 22).addBox(-1.0F, -2.017F, -2.9622F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.6895F, -7.1077F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(153, 135).mirror().addBox(-3.0F, -4.3395F, -1.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(153, 99).mirror().addBox(-3.21F, -4.3395F, -1.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(153, 99).addBox(1.21F, -4.3395F, -1.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(153, 135).addBox(1.0F, -4.3395F, -1.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(128, 0).addBox(-3.0F, -4.7395F, -2.0125F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(0, 134).addBox(-3.0F, -3.9395F, -0.0125F, 5.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 2.4895F, -2.7077F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(82, 89).addBox(-2.0F, -1.735F, -1.2354F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6895F, -4.3077F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(115, 12).addBox(-1.5F, 1.2F, -0.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(69, 130).addBox(-1.5F, -0.3F, -0.8F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7895F, -6.9077F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(135, 127).addBox(-2.0F, -1.2F, -2.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5614F, -0.4684F, -0.6109F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(14, 141).addBox(0.0F, -0.4995F, -4.2782F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(14, 141).mirror().addBox(-4.0F, -0.4995F, -4.2782F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 3.4F, -0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(58, 38).mirror().addBox(-1.0F, -0.0132F, -1.0087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(148, 121).mirror().addBox(-0.7F, -0.5132F, -1.9087F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(148, 121).addBox(1.7F, -0.5132F, -1.9087F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 130).addBox(-1.0F, -0.0132F, -2.0087F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 38).addBox(1.0F, -0.0132F, -1.0087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.6005F, -6.3782F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-1.0F, -1.1395F, -0.6849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(123, 116).addBox(-1.0F, -1.1395F, -1.6849F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(61, 16).addBox(1.0F, -1.1395F, -0.6849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0F, 2.9005F, -5.5782F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(126, 60).mirror().addBox(-1.0F, 0.9F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 129).mirror().addBox(-1.0F, 0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(126, 60).addBox(2.0F, 0.9F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(95, 129).addBox(2.0F, 0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, -0.4995F, -4.2782F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(130, 139).mirror().addBox(-1.0F, -1.0F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(130, 139).addBox(3.0F, -1.0F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.0F, 0.5005F, -1.2782F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw2 = head.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 3.3F, 0.1F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(68, 41).addBox(-2.0F, -1.9F, -0.3F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 9.0F, 0.1232F, 0.1299F, 0.016F));

		PartDefinition cube_r335 = tail.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -5.4112F, 0.0471F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8004F, 15.734F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r336 = tail.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -6.1492F, -0.1874F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8004F, 12.934F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r337 = tail.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(62, 147).addBox(0.0F, -0.476F, -0.6131F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9924F, 15.5938F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r338 = tail.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(120, 147).addBox(0.0F, -3.8463F, 2.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 147).addBox(0.0F, -4.7331F, -0.1881F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3924F, 10.5938F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r339 = tail.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(29, 67).addBox(0.0F, -6.7929F, -1.2023F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8004F, 10.934F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r340 = tail.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(95, 41).addBox(0.0F, -8.2F, 5.9F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(99, 141).addBox(0.0F, -8.2F, 2.9F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 142).addBox(0.0F, -8.2F, -0.1F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7F, 0.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.2F, 0.0F, 4.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 17.7F, -0.143F, 0.216F, -0.0308F));

		PartDefinition cube_r341 = tail2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, -6.3F, 23.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(125, 94).addBox(-0.5F, -6.1F, 20.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(113, 144).addBox(-0.5F, -6.0F, 17.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(145, 34).addBox(-0.5F, -5.9F, 14.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 146).addBox(-0.5F, -5.7F, 11.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 16).addBox(-0.5F, -5.5F, 8.9F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(83, 16).addBox(-0.5F, -5.4F, 5.9F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 100).addBox(-0.5F, -5.3F, 2.9F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 82).addBox(-0.5F, -5.0F, -0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(145, 148).addBox(0.0F, 5.0537F, 32.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 148).addBox(0.0F, 3.8537F, 29.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 148).addBox(0.0F, 2.9537F, 26.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 147).addBox(0.0F, 1.9537F, 23.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(0.0F, 1.2537F, 20.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 0).addBox(0.0F, 0.3537F, 17.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 34).addBox(0.0F, -0.2463F, 14.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 147).addBox(0.0F, -1.2463F, 11.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 147).addBox(0.0F, -1.9463F, 8.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0924F, -7.1062F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 29.0F, 0.0536F, -0.2179F, -0.0116F));

		PartDefinition cube_r343 = tail3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(126, 147).addBox(-0.5F, -2.8939F, 23.1305F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 148).addBox(-0.5F, -2.8939F, 20.1305F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(124, 50).addBox(-0.5F, -2.8939F, 17.1305F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(128, 22).addBox(-0.5F, -2.8939F, 14.1305F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(146, 58).addBox(-0.5F, -2.8939F, 11.1305F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(147, 28).addBox(-0.5F, -2.8939F, 8.1305F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(146, 70).addBox(-0.5F, -2.8939F, 5.1305F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(146, 133).addBox(-0.5F, -2.8939F, 2.1305F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 108).addBox(-0.5F, -2.8939F, -0.8695F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r344 = tail3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(116, 151).addBox(0.0F, 4.3F, 11.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(152, 75).addBox(0.0F, 3.0F, 8.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 152).addBox(0.0F, 1.7F, 5.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 152).addBox(0.0F, 0.1F, 2.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 152).addBox(0.0F, -1.5F, -0.9F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5642F, 13.5646F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r345 = tail3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(17, 134).addBox(0.0F, -1.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6781F, 10.4044F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r346 = tail3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(136, 148).addBox(0.0F, 7.9537F, 41.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 148).addBox(0.0F, 6.9537F, 38.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 148).addBox(0.0F, 5.9537F, 35.6111F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0924F, -36.1062F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 38).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 27.0F, 0.0542F, -0.2614F, -0.014F));

		PartDefinition cube_r347 = tail4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(20, 95).addBox(0.0F, -9.5432F, 24.6727F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 68).addBox(0.0F, -8.9584F, 22.7601F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 41).addBox(0.0F, -8.3737F, 20.8474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 121).addBox(0.0F, -7.789F, 18.9348F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 123).addBox(0.0F, -7.2042F, 17.0222F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 123).addBox(0.0F, -6.6195F, 15.1096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 12).addBox(0.0F, -6.0347F, 13.197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 129).addBox(0.0F, -5.45F, 11.2844F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 95).addBox(0.0F, -4.8652F, 9.3718F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 140).addBox(0.0F, -4.2805F, 7.4592F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 8).addBox(0.0F, -3.6958F, 5.5466F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 140).addBox(0.0F, -3.111F, 3.634F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 142).addBox(0.0F, -2.5263F, 1.7213F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 77).addBox(0.0F, -1.9415F, -0.1913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9983F, 0.2F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r348 = tail4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, 18.9F, 35.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 11).addBox(0.0F, 16.8F, 32.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 10).addBox(0.0F, 15.3F, 29.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 154).addBox(0.0F, 13.8F, 26.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 150).addBox(0.0F, 11.7F, 23.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 144).addBox(0.0F, 9.9F, 20.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 153).addBox(0.0F, 8.3F, 17.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 151).addBox(0.0F, 5.8F, 14.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5642F, -13.4354F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(48, 16).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 28.0F, -0.0264F, -0.1309F, 0.0034F));

		PartDefinition cube_r349 = tail5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(38, 16).addBox(0.0F, -9.4209F, 13.5147F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(0.0F, -8.3908F, 11.8004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(0.0F, -7.3607F, 10.086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 38).addBox(0.0F, -6.3306F, 8.3717F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 82).addBox(0.0F, -5.3006F, 6.6573F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 69).addBox(0.0F, -4.3993F, 5.1573F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 91).addBox(0.0F, -3.3692F, 3.443F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 91).addBox(0.0F, -2.3391F, 1.7286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 20).addBox(0.0F, -1.309F, 0.0143F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9894F, -0.1174F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r350 = tail5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(18, 15).addBox(0.0F, 21.5F, 41.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 15).addBox(0.0F, 20.2F, 38.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5642F, -41.4354F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(68, 16).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 19.0F, -0.0723F, -0.2611F, 0.0187F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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