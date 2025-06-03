package fossils.fossils.client.blockentity.model.leaellynasaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LeaellynasauraFossilModel extends SkullModelBase {
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
	private final ModelPart leftBrow;
	private final ModelPart rightBrow;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public LeaellynasauraFossilModel(ModelPart root) {
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
		this.leftBrow = this.head.getChild("leftBrow");
		this.rightBrow = this.head.getChild("rightBrow");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.3F, 0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.4F, 1.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(14, 20).mirror().addBox(-2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 39).mirror().addBox(-3.0F, -0.2F, 1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 39).addBox(1.0F, -0.2F, 1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(14, 20).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 37).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.5F, -2.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 5).mirror().addBox(-0.5F, -1.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(16, 5).addBox(3.9F, -1.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-2.2F, 0.5619F, -0.2024F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-0.4066F, -0.5312F, -0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3619F, 0.9976F, -1.3221F, -0.0494F, -0.4684F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4066F, -0.5467F, -0.3173F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3619F, 0.9976F, -0.816F, -0.0494F, -0.4684F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 9).mirror().addBox(-0.2F, -0.4007F, -0.1404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0619F, 0.4976F, -1.1713F, 0.1685F, -0.4751F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.3F, -0.2312F, 1.0637F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.5619F, -1.4024F, -0.8639F, 0.384F, -0.0873F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-0.3F, -0.5316F, -0.2566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.5619F, -1.4024F, -1.0734F, 0.384F, -0.0873F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(37, 7).mirror().addBox(-0.5F, 0.0F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 6).mirror().addBox(-0.3F, -1.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(37, 7).addBox(3.9F, 0.0F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 6).addBox(3.7F, -1.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2F, 0.5619F, -0.2024F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.2F, -0.2328F, -1.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.5F, -1.0F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 39).addBox(-0.8F, -0.2328F, -1.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -1.5F, -1.0F, 0.1063F, -0.1736F, -0.0184F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 39).addBox(-0.7F, -0.2312F, 1.0637F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.4F, 0.5619F, -1.4024F, -0.8639F, -0.384F, 0.0873F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 26).addBox(-0.7F, -0.5316F, -0.2566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4F, 0.5619F, -1.4024F, -1.0734F, -0.384F, 0.0873F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5934F, -0.5312F, -0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5F, 2.3619F, 0.9976F, -1.3221F, 0.0494F, 0.4684F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5934F, -0.5467F, -0.3173F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 2.3619F, 0.9976F, -0.816F, 0.0494F, 0.4684F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 9).addBox(-0.8F, -0.4007F, -0.1404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, 1.0619F, 0.4976F, -1.1713F, -0.1685F, 0.4751F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 0.2F, -0.2F, -1.1868F, 0.0F, 0.0F));

		PartDefinition Femur_r1 = leftLeg.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(6, 15).addBox(1.4F, 0.9226F, -1.0063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9F, -0.5954F, 0.5854F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = leftLeg.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1391F, 0.3483F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = leftLeg.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(8, 7).addBox(-0.5F, -0.0711F, 0.0174F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3272F, -0.6209F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Femur_r4 = leftLeg.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3728F, 0.0791F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 47).addBox(0.2F, -0.1466F, -0.2783F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(38, 47).addBox(-0.9F, -0.1466F, -0.3783F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1046F, 0.4854F, 1.3614F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5229F, -0.0954F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Metatarsals_r1 = leftLeg3.addOrReplaceChild("Metatarsals_r1", CubeListBuilder.create().texOffs(28, 14).addBox(1.5F, 10.0767F, 11.2776F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.5F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.5F, -2.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Pes_r1 = leftLeg4.addOrReplaceChild("Pes_r1", CubeListBuilder.create().texOffs(32, 32).addBox(1.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 0.2F, -0.2F, -1.405F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = rightLeg.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(0, 15).addBox(-2.4F, 0.9226F, -1.0063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9F, -0.5954F, 0.5854F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = rightLeg.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(51, 27).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1391F, 0.3483F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Femur_r7 = rightLeg.addOrReplaceChild("Femur_r7", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -0.0711F, 0.0174F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3272F, -0.6209F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Femur_r8 = rightLeg.addOrReplaceChild("Femur_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3728F, 0.0791F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(33, 45).addBox(-1.2F, -0.1466F, -0.2783F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(5, 47).addBox(-0.1F, -0.1466F, -0.3783F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1046F, 0.4854F, 1.3177F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.5229F, -0.0954F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Metatarsals_r2 = rightLeg3.addOrReplaceChild("Metatarsals_r2", CubeListBuilder.create().texOffs(0, 28).addBox(-3.5F, 10.0767F, 11.2776F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.5F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.5F, -2.8F, 0.3752F, 0.0F, 0.0F));

		PartDefinition Pes_r2 = rightLeg4.addOrReplaceChild("Pes_r2", CubeListBuilder.create().texOffs(28, 0).addBox(-4.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(12, 28).addBox(-0.5F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 58).addBox(0.0F, -1.1F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 58).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 58).addBox(-0.5F, -0.4477F, -0.0023F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -5.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(31, 58).addBox(-0.5F, -0.5F, -2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 41).addBox(-1.0F, 0.0F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.6F, -4.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-5.5679F, -1.1815F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -6.5F, 0.1283F, 0.3066F, -1.167F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(45, 41).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -6.5F, 0.2505F, 0.2196F, -0.7053F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -6.5F, 0.3129F, 0.1116F, -0.3314F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(47, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -4.5F, 0.2467F, 0.0886F, -0.4428F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 7).mirror().addBox(-3.5679F, -1.1815F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -4.5F, 0.1F, 0.2423F, -1.2794F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 4).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -4.5F, 0.1966F, 0.1741F, -0.8206F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 23).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.5F, -0.0324F, -0.0292F, -1.2038F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.5F, -0.041F, -0.0149F, -0.82F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(-2.5679F, -1.1815F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.5F, 0.0328F, 0.0809F, -1.4473F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.5F, 0.0649F, 0.0584F, -0.9929F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(39, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.5F, 0.082F, 0.0298F, -0.6096F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.5F, -0.041F, 0.0149F, 0.82F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(56, 23).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.5F, -0.0324F, 0.0292F, 1.2038F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(10, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -6.5F, 0.3129F, -0.1116F, 0.3314F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(45, 41).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -6.5F, 0.2505F, -0.2196F, 0.7053F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 24).addBox(1.5679F, -1.1815F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -6.5F, 0.1283F, -0.3066F, 1.167F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 4).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -4.5F, 0.1966F, -0.1741F, 0.8206F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(28, 7).addBox(1.5679F, -1.1815F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -4.5F, 0.1F, -0.2423F, 1.2794F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(47, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -4.5F, 0.2467F, -0.0886F, 0.4428F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(57, 9).addBox(1.5679F, -1.1815F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.5F, 0.0328F, -0.0809F, 1.4473F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 34).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.5F, 0.0649F, -0.0584F, 0.9929F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(39, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.5F, 0.082F, -0.0298F, 0.6096F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -7.9F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(58, 51).addBox(-0.5F, -1.5516F, 3.1228F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 6).addBox(-0.5F, -1.4516F, 1.1228F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 28).addBox(-1.0F, -1.0516F, 0.1228F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8F, -3.7F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.5F, 0.0374F, 0.0923F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.2826F, -1.9724F, -0.3622F, -0.6852F, 0.366F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(-0.5F, 0.0374F, -0.4077F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.2826F, -1.9724F, -0.6525F, -0.9616F, 0.6459F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 32).mirror().addBox(-0.5F, 0.0374F, -0.1077F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.2826F, -1.9724F, -0.8476F, -1.1688F, 0.9845F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(0.0F, -0.739F, -1.9843F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 4.1194F, -3.2516F, 1.1804F, -0.4825F, -0.8452F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-0.5F, -0.0438F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.3194F, -2.3516F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(-0.5F, 0.2F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.6194F, -1.8516F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-5.5679F, -1.1815F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8F, -2.3F, 0.1807F, 0.4186F, -1.2705F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8F, -2.3F, 0.3477F, 0.2977F, -0.8025F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(16, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8F, -2.3F, 0.4298F, 0.1505F, -0.4383F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -0.4F, 0.3629F, 0.1285F, -0.3953F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 15).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -0.4F, 0.2917F, 0.2534F, -0.7654F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-6.5679F, -1.1815F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -0.4F, 0.1502F, 0.3547F, -1.2297F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(16, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -2.3F, 0.4298F, -0.1505F, 0.4383F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 39).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -2.3F, 0.3477F, -0.2977F, 0.8025F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 22).addBox(1.5679F, -1.1815F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -2.3F, 0.1807F, -0.4186F, 1.2705F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(9, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.4F, 0.3629F, -0.1285F, 0.3953F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 15).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.4F, 0.2917F, -0.2534F, 0.7654F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(16, 11).addBox(1.5679F, -1.1815F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.4F, 0.1502F, -0.3547F, 1.2297F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(46, 20).addBox(-1.0F, -0.739F, -1.9843F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 4.1194F, -3.2516F, 1.1804F, 0.4825F, 0.8452F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(52, 34).addBox(-0.5F, -0.0438F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.3194F, -2.3516F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, 0.2F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.6F, 1.6194F, -1.8516F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.0374F, 0.0923F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2826F, -1.9724F, -0.3622F, 0.6852F, -0.366F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 15).addBox(-0.5F, 0.0374F, -0.4077F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2826F, -1.9724F, -0.6525F, 0.9616F, -0.6459F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(28, 32).addBox(-0.5F, 0.0374F, -0.1077F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2826F, -1.9724F, -0.8476F, 1.1688F, -0.9845F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(14, 15).addBox(-0.5F, 0.8F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4236F, -0.6155F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.6011F, -2.2655F, 0.577F, 0.4826F, -0.3713F));

		PartDefinition Humerus_r1 = leftArm.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(39, 22).addBox(0.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, 2.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r1 = leftArm2.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(45, 35).addBox(0.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 43).addBox(0.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r1 = leftArm3.addOrReplaceChild("Manus_r1", CubeListBuilder.create().texOffs(43, 49).addBox(-1.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, 0.1855F, 0.21F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.6011F, -2.2655F, 0.5392F, -0.3865F, 0.2675F));

		PartDefinition Humerus_r2 = rightArm.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(24, 37).addBox(-1.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r2 = rightArm2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(11, 45).addBox(-1.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 45).addBox(-1.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(-0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r2 = rightArm3.addOrReplaceChild("Manus_r2", CubeListBuilder.create().texOffs(49, 15).addBox(0.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, -0.1855F, -0.21F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.7F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r66 = neck3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 11).addBox(-0.5F, -1.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.6F, -1.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r67 = neck3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.4F, 0.4662F, 0.3539F, -0.5483F));

		PartDefinition cube_r68 = neck3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(38, 11).mirror().addBox(-1.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.4F, 0.3021F, 0.4998F, -0.9395F));

		PartDefinition cube_r69 = neck3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(26, 22).mirror().addBox(-4.5679F, -1.1815F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.4F, 0.0293F, 0.5767F, -1.4622F));

		PartDefinition cube_r70 = neck3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(26, 22).addBox(1.5679F, -1.1815F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.4F, 0.0293F, -0.5767F, 1.4622F));

		PartDefinition cube_r71 = neck3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(38, 11).addBox(0.9272F, -0.3746F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.4F, 0.3021F, -0.4998F, 0.9395F));

		PartDefinition cube_r72 = neck3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(28, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.4F, 0.4662F, -0.3539F, 0.5483F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -1.8F, -0.4539F, 0.1347F, 0.0787F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 29).addBox(-0.5F, -0.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 59).addBox(-0.5F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6F, -2.8F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r74 = neck2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3F, -2.4F, 0.2476F, 0.6899F, -1.2133F));

		PartDefinition cube_r75 = neck2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(39, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -0.5F, 0.4305F, 0.7034F, -0.9762F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(14, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -2.4F, 0.2476F, -0.6899F, 1.2133F));

		PartDefinition cube_r77 = neck2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(39, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -0.5F, 0.4305F, -0.7034F, 0.9762F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3F, -2.8F, -0.5958F, 0.2926F, -0.1931F));

		PartDefinition cube_r78 = neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 59).addBox(0.0F, -1.0F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 45).addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -2.1F, 0.2714F, 0.3154F, 0.01F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(-0.91F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 16).mirror().addBox(-0.91F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.043F, -0.3427F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-0.12F, -0.1005F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 53).mirror().addBox(-0.28F, -0.1005F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(19, 28).mirror().addBox(-0.39F, -0.1005F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1092F, -0.9361F, -1.5166F, -0.2614F, -0.014F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(56, 16).addBox(-0.09F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 38).addBox(-0.09F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.043F, -0.3427F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(34, 57).mirror().addBox(-0.8F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 31).mirror().addBox(-0.41F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5344F, -3.7171F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(24, 51).mirror().addBox(0.0F, -0.8998F, -1.8973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.7F, -1.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-0.51F, 0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1092F, -1.3361F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(-0.8F, -0.0347F, -0.0241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -1.2F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 23).mirror().addBox(0.0F, -0.0465F, -0.1276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2F, -3.7F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 31).addBox(-0.59F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.5344F, -3.7171F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(55, 48).addBox(-0.49F, 0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.1092F, -1.3361F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(19, 28).addBox(-0.61F, -0.1005F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(54, 53).addBox(-0.72F, -0.1005F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(47, 56).addBox(-0.88F, -0.1005F, -0.6209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 0.1092F, -0.9361F, -1.5166F, 0.2614F, 0.014F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 26).addBox(-0.2F, -0.0347F, -0.0241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.2F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-1.0F, -0.1633F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2F, 0.5F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-1.0F, -0.0909F, -0.16F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -0.2F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(25, 55).addBox(0.0F, -0.0909F, -0.16F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 41).addBox(-1.0F, 0.0091F, -0.0478F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.2F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(30, 55).addBox(0.0F, -0.1633F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 44).addBox(-1.0F, -0.2633F, -0.0231F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 0.5F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.1128F, -0.9085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.7F, -4.3F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 57).addBox(-1.0F, -0.0465F, -0.9276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.7F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(51, 23).addBox(-1.0F, -0.0465F, -0.1276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.2F, -3.7F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(17, 51).addBox(-1.2F, -0.5998F, -1.6973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 0.7F, -1.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(24, 51).addBox(-1.0F, -0.8998F, -1.8973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.6F, 0.7F, -1.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(34, 57).addBox(-0.2F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(52, 56).addBox(0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftBrow = head.addOrReplaceChild("leftBrow", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.3F, -2.1F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r104 = leftBrow.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 55).addBox(-0.6F, -0.6194F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 55).addBox(-0.6F, -0.8194F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 55).addBox(-0.6F, -1.0194F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0956F, 0.3931F, 0.1946F));

		PartDefinition rightBrow = head.addOrReplaceChild("rightBrow", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.3F, -2.1F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r105 = rightBrow.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(20, 55).mirror().addBox(-0.4F, -0.6194F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 55).mirror().addBox(-0.4F, -0.8194F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 55).mirror().addBox(-0.4F, -1.0194F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0956F, -0.3931F, -0.1946F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.0F, 0.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 42).addBox(-0.3F, -0.7954F, -1.8123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 0.2F, -2.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.99F, -0.7954F, -1.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(54, 13).mirror().addBox(-0.99F, -0.7954F, -0.8123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.2F, -2.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(-0.99F, -0.1015F, -0.1645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, -1.5F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(50, 49).mirror().addBox(-0.79F, -0.9556F, -2.3149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-0.99F, -0.7556F, -1.4149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(49, 53).mirror().addBox(-0.99F, -0.7556F, -1.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.3F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(43, 54).mirror().addBox(-0.99F, -0.7556F, -0.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-0.99F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 51).addBox(0.39F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, -0.1F, 0.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 39).addBox(-0.01F, -0.7954F, -1.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(54, 13).addBox(-0.01F, -0.7954F, -0.8123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.2F, -2.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(54, 6).addBox(-0.01F, -0.1015F, -0.1645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, -0.3F, -1.5F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(50, 49).addBox(-0.21F, -0.9556F, -2.3149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 0.3F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 34).addBox(-0.01F, -0.7556F, -1.4149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 53).addBox(-0.01F, -0.7556F, -1.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(43, 54).addBox(-0.01F, -0.7556F, -0.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 0.3F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 58).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 58).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 58).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.3F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(24, 37).addBox(0.0F, 1.2F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 28).addBox(0.0F, 0.5F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 15).addBox(0.0F, 0.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.1F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(16, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(10, 58).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 56).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 57).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 44).addBox(0.0F, -0.8F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, 4.9F, 11.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 15).addBox(0.0F, 4.1F, 9.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(0.0F, 3.3F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 34).addBox(0.0F, 2.6F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(28, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(39, 22).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(14, 15).addBox(0.0F, 6.5F, 15.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 11).addBox(0.0F, 5.8F, 13.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -13.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.3391F, 0.0222F, 0.0103F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 9.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(26, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(14, 15).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.2705F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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