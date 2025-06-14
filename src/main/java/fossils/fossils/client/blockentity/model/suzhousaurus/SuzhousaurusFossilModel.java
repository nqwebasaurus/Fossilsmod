package fossils.fossils.client.blockentity.model.suzhousaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuzhousaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart neck5;
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
	private final ModelPart tail5;
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

	public SuzhousaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -24.5F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 57).addBox(0.0F, -3.6494F, -0.1018F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2F, -4.2F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 102).addBox(0.0F, -2.6895F, 8.9735F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 102).addBox(0.0F, -2.7895F, 6.9735F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 4).addBox(0.0F, -3.1895F, -0.0265F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5F, -2.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 66).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1F, -6.1F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(-0.2343F, 4.9137F, -3.0725F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.9751F, 0.7853F, -0.2618F, 0.0F, -0.2443F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 89).mirror().addBox(-0.2343F, -0.3059F, -0.7586F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.9751F, 0.7853F, -0.4189F, 0.0F, -0.2443F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(-0.2343F, -0.1935F, -0.5185F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.9751F, 0.7853F, -0.1047F, 0.0F, -0.2443F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0209F, 2.3978F, 0.6748F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4751F, 5.2853F, 0.4978F, 0.2406F, -0.2496F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 14).mirror().addBox(0.0209F, -0.5761F, -1.0928F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4751F, 5.2853F, 1.0737F, 0.2406F, -0.2496F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-0.5F, -1.3984F, -3.261F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.4751F, 0.7853F, 0.5585F, 0.0F, -0.1745F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-4.0F, -0.2233F, -0.0697F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 14).addBox(3.0F, -0.2233F, -0.0697F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6F, -2.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(-0.4819F, -5.7859F, -3.7751F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.9F, -6.2F, -6.3F, 2.1293F, 1.2217F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-0.4819F, -4.6846F, -3.3992F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.9F, -6.2F, -6.3F, 1.4661F, 1.2217F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.4819F, -3.1178F, -3.5055F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9F, -6.2F, -6.3F, 0.6981F, 1.2217F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 82).mirror().addBox(0.5198F, -0.3923F, -3.0294F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -9.2F, -3.8F, -0.0986F, 0.783F, -0.0696F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(0.0945F, -2.677F, -4.3422F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -6.7F, -0.8F, -0.0721F, 0.5235F, -0.0202F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 25).mirror().addBox(-0.6F, -4.1362F, -3.7206F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -4.2F, 0.5F, -0.5537F, 0.2726F, 0.4108F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(61, 71).mirror().addBox(-0.2F, -0.0529F, -0.9402F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, -5.1F, 3.0F, -0.4065F, -0.2957F, 0.5517F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 79).mirror().addBox(-0.2F, -2.0564F, -0.2095F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, -5.1F, 3.0F, -0.7994F, -0.0495F, 0.8036F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(0.029F, -0.2061F, -2.7335F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 30).mirror().addBox(1.029F, -0.2061F, -9.7335F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.8F, 7.0F, -0.3914F, -0.0343F, 0.1768F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6512F, -6.2434F, -3.403F, -0.3927F, 0.0867F, 0.1268F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 80).addBox(-0.5181F, -5.7859F, -3.7751F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.9F, -6.2F, -6.3F, 2.1293F, -1.2217F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(89, 57).addBox(-0.5181F, -4.6846F, -3.3992F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.9F, -6.2F, -6.3F, 1.4661F, -1.2217F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5181F, -3.1178F, -3.5055F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, -6.2F, -6.3F, 0.6981F, -1.2217F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 82).addBox(-1.5198F, -0.3923F, -3.0294F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -9.2F, -3.8F, -0.0986F, -0.783F, 0.0696F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 69).addBox(-1.0945F, -2.677F, -4.3422F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -6.7F, -0.8F, -0.0721F, -0.5235F, 0.0202F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 36).addBox(-0.7657F, 4.9137F, -3.0725F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4F, 5.9751F, 0.7853F, -0.2618F, 0.0F, 0.2443F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 89).addBox(-0.7657F, -0.1935F, -0.5185F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4F, 5.9751F, 0.7853F, -0.1047F, 0.0F, 0.2443F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 89).addBox(-0.7657F, -0.3059F, -0.7586F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 5.9751F, 0.7853F, -0.4189F, 0.0F, 0.2443F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0209F, 2.3978F, 0.6748F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.4751F, 5.2853F, 0.4978F, -0.2406F, 0.2496F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 14).addBox(-1.0209F, -0.5761F, -1.0928F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, 3.4751F, 5.2853F, 1.0737F, -0.2406F, 0.2496F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -1.3984F, -3.261F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 0.4751F, 0.7853F, 0.5585F, 0.0F, 0.1745F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(69, 25).addBox(-0.4F, -4.1362F, -3.7206F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, -4.2F, 0.5F, -0.5537F, -0.2726F, -0.4108F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 79).addBox(-0.8F, -2.0564F, -0.2095F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, -5.1F, 3.0F, -0.7994F, 0.0495F, -0.8036F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(78, 22).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6512F, -6.2434F, -3.403F, -0.3927F, -0.0867F, -0.1268F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(53, 30).addBox(-5.029F, -0.2061F, -9.7335F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(79, 73).addBox(-5.029F, -0.2061F, -2.7335F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.8F, 7.0F, -0.3914F, 0.0343F, -0.1768F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(61, 71).addBox(-0.8F, -0.0529F, -0.9402F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, -5.1F, 3.0F, -0.4065F, 0.2957F, -0.5517F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.0F, -7.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 73).addBox(0.0F, -3.7548F, -0.0824F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(76, 36).addBox(0.0F, -3.9264F, 4.0152F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 84).addBox(0.0F, -3.8264F, 2.0152F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 60).addBox(0.0F, -3.4264F, 0.0152F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -7.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.243F, -0.8087F, -0.2239F, 0.0175F, 0.2701F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.243F, -0.8087F, -0.2267F, -0.0041F, -0.1482F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(8, 78).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.243F, -0.8087F, -0.2137F, -0.0327F, -0.6797F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(45, 2).mirror().addBox(-12.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.243F, -0.8087F, -0.1507F, -0.1556F, -1.326F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-12.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -2.8087F, -0.129F, -0.0892F, -1.3112F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -2.8087F, -0.1565F, 0.0074F, -0.663F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -2.8087F, -0.1571F, 0.0014F, -0.1309F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(24, 72).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -2.8087F, -0.1581F, -0.0058F, 0.2879F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(54, 82).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.857F, -4.8087F, -0.0922F, -0.0291F, 0.3391F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.857F, -4.8087F, -0.0875F, 0.0068F, -0.0782F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.857F, -4.8087F, -0.0993F, 0.0474F, -0.6091F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-12.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.857F, -4.8087F, -0.1076F, -0.0227F, -1.26F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-12.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -6.8087F, -0.0969F, 0.0105F, -1.2601F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 32).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -6.8087F, -0.0706F, 0.0673F, -0.6074F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(92, 34).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -6.8087F, -0.0527F, 0.0096F, -0.078F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 82).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -6.8087F, -0.0593F, -0.0407F, 0.338F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 15).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.243F, -0.8087F, -0.2239F, -0.0175F, -0.2701F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 78).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.243F, -0.8087F, -0.2267F, 0.0041F, 0.1482F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(8, 78).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.243F, -0.8087F, -0.2137F, 0.0327F, 0.6797F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 2).addBox(3.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.243F, -0.8087F, -0.1507F, 0.1556F, 1.326F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(24, 72).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -2.8087F, -0.1581F, 0.0058F, -0.2879F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 31).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -2.8087F, -0.1571F, -0.0014F, 0.1309F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(30, 80).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -2.8087F, -0.1565F, -0.0074F, 0.663F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 71).addBox(3.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -2.8087F, -0.129F, 0.0892F, 1.3112F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 82).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.857F, -4.8087F, -0.0922F, 0.0291F, -0.3391F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 4).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.857F, -4.8087F, -0.0875F, -0.0068F, 0.0782F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(88, 55).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.857F, -4.8087F, -0.0993F, -0.0474F, 0.6091F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(73, 0).addBox(3.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.857F, -4.8087F, -0.1076F, 0.0227F, 1.26F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(73, 2).addBox(3.2497F, -6.6268F, -0.9946F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -6.8087F, -0.0969F, -0.0105F, 1.2601F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(92, 32).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -6.8087F, -0.0706F, -0.0673F, 0.6074F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(92, 34).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -6.8087F, -0.0527F, -0.0096F, 0.078F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 82).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -6.8087F, -0.0593F, 0.0407F, -0.338F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(20, 14).addBox(-5.0F, -2.0F, 3.5F, 10.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-9.0F, -2.0F, -4.5F, 18.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.3794F, -5.8779F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.5F, -8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -9.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 89).addBox(0.0F, -4.4961F, 5.6116F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 102).addBox(0.0F, -3.6961F, 3.6116F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 5).addBox(0.0F, -3.0961F, 1.6116F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 16).addBox(0.0F, -2.2961F, -0.3884F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1566F, -5.5963F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.457F, 0.4913F, -0.0181F, -0.0551F, 0.2662F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(92, 80).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.457F, 0.4913F, -0.0092F, 0.0129F, -0.1473F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(93, 1).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.457F, 0.4913F, -0.0346F, 0.0922F, -0.6744F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(-11.2497F, -6.6268F, -0.9946F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.457F, 0.4913F, -0.0836F, 0.0521F, -1.3295F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(79, 78).mirror().addBox(-10.2497F, -6.6268F, -0.9946F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -1.4087F, -0.0728F, 0.0853F, -1.3462F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -1.4087F, -0.0057F, 0.112F, -0.6889F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(24, 66).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -1.4087F, 0.0256F, 0.0156F, -0.1642F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -1.4087F, 0.0149F, -0.0666F, 0.2467F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-8.2497F, -6.6268F, -0.9946F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -5.4087F, -0.0291F, 0.2181F, -1.6013F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(60, 25).mirror().addBox(-9.2497F, -6.6268F, -0.9946F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -3.4087F, -0.0566F, 0.1351F, -1.4317F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -3.4087F, 0.0379F, 0.1415F, -0.7706F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(47, 61).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -3.4087F, 0.0778F, 0.0196F, -0.2506F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -3.4087F, 0.0646F, -0.0837F, 0.1557F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-6.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -5.4087F, 0.1114F, 0.1901F, -0.933F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -5.4087F, 0.1648F, 0.0262F, -0.4231F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -5.4087F, 0.1476F, -0.1117F, -0.0269F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-9.2441F, -0.6707F, 0.1354F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 10.688F, -5.3188F, -0.8801F, 0.4167F, 0.2968F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 27).mirror().addBox(-8.2441F, -0.6707F, -0.1646F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 10.688F, -5.3188F, -0.8707F, 0.3185F, 0.3061F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(20, 27).mirror().addBox(-6.0F, 0.0F, 0.8F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 9.488F, -5.3188F, -0.8608F, 0.0891F, 0.4459F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 10).addBox(3.2497F, -6.6268F, -0.9946F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -5.4087F, -0.0291F, -0.2181F, 1.6013F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 60).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -5.4087F, 0.1114F, -0.1901F, 0.933F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 39).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -5.4087F, 0.1648F, -0.0262F, 0.4231F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 35).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -5.4087F, 0.1476F, 0.1117F, 0.0269F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(60, 25).addBox(3.2497F, -6.6268F, -0.9946F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -3.4087F, -0.0566F, -0.1351F, 1.4317F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(62, 12).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -3.4087F, 0.0379F, -0.1415F, 0.7706F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(47, 61).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -3.4087F, 0.0778F, -0.0196F, 0.2506F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(62, 6).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -3.4087F, 0.0646F, 0.0837F, -0.1557F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(79, 78).addBox(3.2497F, -6.6268F, -0.9946F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -1.4087F, -0.0728F, -0.0853F, 1.3462F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(35, 73).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -1.4087F, -0.0057F, -0.112F, 0.6889F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(24, 66).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -1.4087F, 0.0256F, -0.0156F, 0.1642F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 53).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -1.4087F, 0.0149F, 0.0666F, -0.2467F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 29).addBox(3.2497F, -6.6268F, -0.9946F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.457F, 0.4913F, -0.0836F, -0.0521F, 1.3295F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(93, 1).addBox(3.6173F, -3.2794F, -0.9946F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.457F, 0.4913F, -0.0346F, -0.0922F, 0.6744F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 80).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.457F, 0.4913F, -0.0092F, -0.0129F, 0.1473F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(96, 30).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.457F, 0.4913F, -0.0181F, 0.0551F, -0.2662F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(9, 14).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7275F, 9.7742F, -5.7736F, 0.9171F, -1.1637F, -0.5769F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(0.2F, -2.5F, -2.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8906F, 6.6609F, -7.2092F, 1.5716F, -1.1637F, -0.5769F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-0.6F, -3.6698F, -4.527F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 3.7617F, -3.8931F, 0.5351F, -0.8906F, 0.11F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(39, 30).mirror().addBox(-1.0F, 1.4F, -4.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 30).addBox(15.0F, 1.4F, -4.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, 0.0617F, -2.8931F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(9, 14).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7275F, 9.7742F, -5.7736F, 0.9171F, 1.1637F, 0.5769F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 33).addBox(-1.2F, -2.5F, -2.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8906F, 6.6609F, -7.2092F, 1.5716F, 1.1637F, 0.5769F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(38, 27).addBox(-0.4F, -3.6698F, -4.527F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 3.7617F, -3.8931F, 0.5351F, 0.8906F, -0.11F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(72, 48).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 54).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.1874F, -5.4233F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(78, 27).addBox(0.2441F, -0.6707F, -0.1646F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 10.688F, -5.3188F, -0.8707F, -0.3185F, -0.3061F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(45, 0).addBox(0.2441F, -0.6707F, 0.1354F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 10.688F, -5.3188F, -0.8801F, -0.4167F, -0.2968F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(20, 27).addBox(0.0F, 0.0F, 0.8F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 9.488F, -5.3188F, -0.8608F, -0.0891F, -0.4459F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(17, 54).addBox(-1.0F, -0.1F, -7.8F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 0.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8906F, 7.8609F, -5.2092F, -1.5146F, 0.5834F, -0.5672F));

		PartDefinition cube_r121 = leftArm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(70, 74).addBox(-0.4F, -0.9F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6014F, 1.9074F, -0.2835F, -0.1153F, -0.3762F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(57, 89).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 87).addBox(-0.5F, 1.0F, -1.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.4F, 0.1891F, -0.0477F, -0.215F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(35, 90).addBox(-0.6F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8F, -0.6F, 0.0F, 0.0F, 0.3054F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftArm4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(88, 47).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 1.0F));

		PartDefinition cube_r123 = leftArm5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 44).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftArm6.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(44, 93).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(45, 17).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8906F, 7.8609F, -5.2092F, -2.6493F, -0.0423F, 0.4441F));

		PartDefinition cube_r125 = rightArm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(73, 45).addBox(-0.6F, -0.9F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6014F, 1.9074F, -0.2835F, 0.1153F, 0.3762F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(88, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 91).addBox(-0.5F, 1.0F, -1.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.4F, 0.7418F, 0.0873F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(90, 10).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8F, -0.6F, 0.0F, 0.0F, -0.5236F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightArm4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 88).addBox(0.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 1.0F));

		PartDefinition cube_r127 = rightArm5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, 0.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightArm6.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 17).addBox(0.0F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -6.2F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r129 = neck5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(12, 76).addBox(-1.0F, 0.1F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.1F, -5.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r130 = neck5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(52, 102).addBox(0.0F, -1.5669F, -0.0644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r131 = neck5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -0.7087F, 0.406F, 0.2918F, -0.8447F));

		PartDefinition cube_r132 = neck5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 39).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -0.7087F, 0.466F, 0.0492F, -0.4973F));

		PartDefinition cube_r133 = neck5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(38, 37).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7131F, -0.457F, -2.7087F, 0.4983F, 0.4636F, -1.0898F));

		PartDefinition cube_r134 = neck5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(95, 85).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7131F, -0.457F, -2.7087F, 0.6048F, 0.1828F, -0.7604F));

		PartDefinition cube_r135 = neck5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(38, 37).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7131F, -0.457F, -2.7087F, 0.4983F, -0.4636F, 1.0898F));

		PartDefinition cube_r136 = neck5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(95, 85).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7131F, -0.457F, -2.7087F, 0.6048F, -0.1828F, 0.7604F));

		PartDefinition cube_r137 = neck5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(15, 39).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -0.7087F, 0.466F, -0.0492F, 0.4973F));

		PartDefinition cube_r138 = neck5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 97).mirror().addBox(-0.6F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, 0.0359F, -3.8533F, 0.7628F, -0.2336F, 0.0809F));

		PartDefinition cube_r139 = neck5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(95, 36).mirror().addBox(-1.2413F, -0.7993F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.002F, -4.0567F, 1.3297F, -0.0399F, -0.161F));

		PartDefinition cube_r140 = neck5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 63).mirror().addBox(-0.3223F, -0.8253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.002F, -4.0567F, 1.3592F, -0.1231F, -0.5192F));

		PartDefinition cube_r141 = neck5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-1.3889F, -0.7582F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.002F, -4.0567F, 1.5107F, -0.2371F, -1.18F));

		PartDefinition cube_r142 = neck5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(-0.6903F, -0.7693F, 0.5316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.002F, -4.0567F, 1.3374F, 0.1583F, 0.5939F));

		PartDefinition cube_r143 = neck5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(23, 97).addBox(-0.4F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, 0.0359F, -3.8533F, 0.7628F, 0.2336F, -0.0809F));

		PartDefinition cube_r144 = neck5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 73).addBox(-0.6111F, -0.7582F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9586F, -1.002F, -4.0567F, 1.5107F, 0.2371F, 1.18F));

		PartDefinition cube_r145 = neck5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(38, 27).addBox(-0.9586F, -2.2918F, -1.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -1.002F, -4.0567F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r146 = neck5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(102, 56).addBox(-0.3097F, -0.7693F, 0.5316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -1.002F, -4.0567F, 1.3374F, -0.1583F, -0.5939F));

		PartDefinition cube_r147 = neck5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(53, 63).addBox(-0.6777F, -0.8253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -1.002F, -4.0567F, 1.3592F, 0.1231F, 0.5192F));

		PartDefinition cube_r148 = neck5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(95, 36).addBox(-0.7587F, -0.7993F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -1.002F, -4.0567F, 1.3297F, 0.0399F, 0.161F));

		PartDefinition cube_r149 = neck5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 43).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -0.7087F, 0.406F, -0.2918F, 0.8447F));

		PartDefinition cube_r150 = neck5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(71, 102).addBox(0.0F, -1.8202F, -0.0982F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -5.3F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition cube_r151 = neck4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 97).mirror().addBox(-0.6F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, 1.1359F, -0.6533F, 0.933F, -0.2837F, 0.0901F));

		PartDefinition cube_r152 = neck4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-1.2413F, -0.7993F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, 0.098F, -0.8567F, 1.3297F, -0.0399F, -0.161F));

		PartDefinition cube_r153 = neck4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(-0.3223F, -0.8253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, 0.098F, -0.8567F, 1.3592F, -0.1231F, -0.5192F));

		PartDefinition cube_r154 = neck4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(41, 90).mirror().addBox(-1.3889F, -0.7582F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, 0.098F, -0.8567F, 1.5107F, -0.2371F, -1.18F));

		PartDefinition cube_r155 = neck4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(98, 87).mirror().addBox(-0.6903F, -1.1693F, 0.5316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, 0.098F, -0.8567F, 1.3374F, 0.1583F, 0.5939F));

		PartDefinition cube_r156 = neck4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(97, 48).mirror().addBox(-0.7F, -2.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9173F, 0.7503F, -2.2057F, 0.8883F, -0.2791F, 0.0963F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-1.2413F, -0.7993F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.502F, -2.8567F, 1.3297F, -0.0399F, -0.161F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-0.3223F, -0.8253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.502F, -2.8567F, 1.3592F, -0.1231F, -0.5192F));

		PartDefinition cube_r159 = neck4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-1.3889F, -0.7582F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.502F, -2.8567F, 1.5107F, -0.2371F, -1.18F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-0.6903F, -1.1693F, 0.5316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.502F, -2.8567F, 1.3374F, 0.1583F, 0.5939F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.6F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, -0.1503F, -4.9445F, 0.8569F, -0.2092F, 0.0557F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-1.2548F, -1.0094F, -1.0752F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.2108F, -4.8315F, 1.2434F, -0.0538F, -0.1569F));

		PartDefinition cube_r163 = neck4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-0.3638F, -1.0354F, -0.0225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.2108F, -4.8315F, 1.2824F, -0.166F, -0.5082F));

		PartDefinition cube_r164 = neck4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(-1.4669F, -0.9683F, -0.0977F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.2108F, -4.8315F, 1.4757F, -0.3177F, -1.1704F));

		PartDefinition cube_r165 = neck4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-0.6394F, -1.3762F, 0.4582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.2108F, -4.8315F, 1.2636F, 0.2067F, 0.5805F));

		PartDefinition cube_r166 = neck4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(95, 57).addBox(-0.7587F, -0.7993F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, 0.098F, -0.8567F, 1.3297F, 0.0399F, 0.161F));

		PartDefinition cube_r167 = neck4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(41, 90).addBox(-0.6111F, -0.7582F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9586F, 0.098F, -0.8567F, 1.5107F, 0.2371F, 1.18F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(36, 97).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, 1.1359F, -0.6533F, 0.933F, 0.2837F, -0.0901F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(98, 87).addBox(-0.3097F, -1.1693F, 0.5316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, 0.098F, -0.8567F, 1.3374F, -0.1583F, -0.5939F));

		PartDefinition cube_r170 = neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(16, 69).addBox(-0.6777F, -0.8253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, 0.098F, -0.8567F, 1.3592F, 0.1231F, 0.5192F));

		PartDefinition cube_r171 = neck4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(24, 47).addBox(-0.9586F, -2.2918F, -1.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, 0.098F, -0.8567F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(76, 95).addBox(-0.7587F, -0.7993F, -0.9947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -2.8567F, 1.3297F, 0.0399F, 0.161F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(93, 73).addBox(-0.6111F, -0.7582F, -0.0742F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -2.8567F, 1.5107F, 0.2371F, 1.18F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(97, 48).addBox(-0.3F, -2.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9173F, 0.7503F, -2.2057F, 0.8883F, 0.2791F, -0.0963F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(98, 91).addBox(-0.3097F, -1.1693F, 0.5316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -2.8567F, 1.3374F, -0.1583F, -0.5939F));

		PartDefinition cube_r176 = neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(61, 74).addBox(-0.6777F, -0.8253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -2.8567F, 1.3592F, 0.1231F, 0.5192F));

		PartDefinition cube_r177 = neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(67, 0).addBox(-0.9586F, -2.2918F, -1.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -2.8567F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(71, 57).addBox(-0.9586F, -2.1389F, -1.2837F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -1.2108F, -4.8315F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r179 = neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(98, 95).addBox(-0.3606F, -1.3762F, 0.4582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -1.2108F, -4.8315F, 1.2636F, -0.2067F, -0.5805F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(22, 78).addBox(-0.6362F, -1.0354F, -0.0225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -1.2108F, -4.8315F, 1.2824F, 0.166F, 0.5082F));

		PartDefinition cube_r181 = neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(23, 94).addBox(-0.5331F, -0.9683F, -0.0977F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9586F, -1.2108F, -4.8315F, 1.4757F, 0.3177F, 1.1704F));

		PartDefinition cube_r182 = neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(95, 82).addBox(-0.7452F, -1.0094F, -1.0752F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -1.2108F, -4.8315F, 1.2434F, 0.0538F, 0.1569F));

		PartDefinition cube_r183 = neck4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(93, 97).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, -0.1503F, -4.9445F, 0.8569F, 0.2092F, -0.0557F));

		PartDefinition cube_r184 = neck4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.5417F, -6.8835F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.4F, -0.2705F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -6.2F, -0.0117F, -0.2615F, 0.0452F));

		PartDefinition cube_r185 = neck3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, -0.1F, 4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.6F, -8.4F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r186 = neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(53, 93).addBox(-0.9282F, -2.5259F, -1.0895F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -1.6482F, -1.4836F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(6, 98).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, -0.3157F, -2.0152F, 0.7771F, -0.1386F, 0.0353F));

		PartDefinition cube_r188 = neck3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-1.276F, -0.8624F, -1.0168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.3482F, -1.7836F, 0.9838F, -0.0924F, -0.1379F));

		PartDefinition cube_r189 = neck3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-1.8141F, -0.9021F, -0.2057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.6482F, -1.4836F, 1.3566F, -0.5564F, -1.1196F));

		PartDefinition cube_r190 = neck3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-0.5739F, -0.9693F, -0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.6482F, -1.4836F, 1.0443F, -0.2878F, -0.4543F));

		PartDefinition cube_r191 = neck3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(60, 17).mirror().addBox(-0.4575F, -1.4968F, 0.1464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.6482F, -1.4836F, 1.0316F, 0.3439F, 0.517F));

		PartDefinition cube_r192 = neck3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-1.276F, -0.8624F, -1.0168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.1482F, -4.3836F, 0.9838F, -0.0924F, -0.1379F));

		PartDefinition cube_r193 = neck3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.4146F, -0.8155F, -1.3223F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.1482F, -4.3836F, 0.7771F, -0.1386F, 0.0353F));

		PartDefinition cube_r194 = neck3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(95, 24).mirror().addBox(-1.8141F, -0.9021F, -0.2057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.4482F, -4.0836F, 1.3566F, -0.5564F, -1.1196F));

		PartDefinition cube_r195 = neck3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(88, 10).mirror().addBox(-0.5739F, -0.9693F, -0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.4482F, -4.0836F, 1.0443F, -0.2878F, -0.4543F));

		PartDefinition cube_r196 = neck3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(69, 61).mirror().addBox(-0.4575F, -1.4968F, 0.1464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.4482F, -4.0836F, 1.0316F, 0.3439F, 0.517F));

		PartDefinition cube_r197 = neck3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(60, 17).addBox(-0.5425F, -1.4968F, 0.1464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -1.6482F, -1.4836F, 1.0316F, -0.3439F, -0.517F));

		PartDefinition cube_r198 = neck3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(85, 68).addBox(-0.4261F, -0.9693F, -0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -1.6482F, -1.4836F, 1.0443F, 0.2878F, 0.4543F));

		PartDefinition cube_r199 = neck3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(95, 6).addBox(-0.1859F, -0.9021F, -0.2057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, -1.6482F, -1.4836F, 1.3566F, 0.5564F, 1.1196F));

		PartDefinition cube_r200 = neck3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 96).addBox(-0.724F, -0.8624F, -1.0168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -1.3482F, -1.7836F, 0.9838F, 0.0924F, 0.1379F));

		PartDefinition cube_r201 = neck3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(6, 98).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, -0.3157F, -2.0152F, 0.7771F, 0.1386F, -0.0353F));

		PartDefinition cube_r202 = neck3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 14).addBox(0.4146F, -0.8155F, -1.3223F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -3.1482F, -4.3836F, 0.7771F, 0.1386F, -0.0353F));

		PartDefinition cube_r203 = neck3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(88, 10).addBox(-0.4261F, -0.9693F, -0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -3.4482F, -4.0836F, 1.0443F, 0.2878F, 0.4543F));

		PartDefinition cube_r204 = neck3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(96, 9).addBox(-0.724F, -0.8624F, -1.0168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -3.1482F, -4.3836F, 0.9838F, 0.0924F, 0.1379F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(95, 24).addBox(-0.1859F, -0.9021F, -0.2057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, -3.4482F, -4.0836F, 1.3566F, 0.5564F, 1.1196F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(69, 61).addBox(-0.5425F, -1.4968F, 0.1464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -3.4482F, -4.0836F, 1.0316F, -0.3439F, -0.517F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(41, 97).addBox(-0.9282F, -2.5259F, -1.0895F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -3.4482F, -4.0836F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8908F, -5.5F, 0.0082F, -0.2187F, 0.0408F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9092F, -5.1F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(11, 98).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, -0.4335F, -1.451F, 0.7419F, -0.1372F, 0.0401F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(100, 68).mirror().addBox(-0.8603F, -0.9275F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.4825F, -1.1341F, 1.3383F, -0.5877F, -1.1097F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(29, 96).mirror().addBox(-1.2841F, -0.8877F, -1.0656F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.4825F, -1.1341F, 0.949F, -0.0972F, -0.1346F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(98, 39).mirror().addBox(-0.599F, -0.9946F, -0.3619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.4825F, -1.1341F, 1.0115F, -0.3029F, -0.4447F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-0.4286F, -1.5203F, 0.1052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -1.4825F, -1.1341F, 0.9992F, 0.361F, 0.5058F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(96, 45).mirror().addBox(-1.3866F, -0.8537F, -1.6783F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -4.0062F, -3.5256F, 0.9143F, -0.1018F, -0.1311F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(98, 60).mirror().addBox(-0.4736F, -1.3822F, -0.3406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, -2.4585F, -4.2346F, 0.7067F, -0.1358F, 0.0449F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(100, 42).mirror().addBox(-1.4369F, -0.8948F, -0.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -4.0062F, -3.5256F, 1.3193F, -0.6189F, -1.0988F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(-0.9143F, -0.9607F, -0.8971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -4.0062F, -3.5256F, 0.9783F, -0.3178F, -0.4346F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.0725F, -1.4635F, -0.4017F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -4.0062F, -3.5256F, 0.9663F, 0.3777F, 0.4939F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(29, 96).addBox(-0.7159F, -0.8877F, -1.0656F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -1.4825F, -1.1341F, 0.949F, 0.0972F, 0.1346F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(33, 99).addBox(-0.9282F, -2.4707F, -1.0948F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -1.4825F, -1.1341F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(100, 68).addBox(-0.1397F, -0.9275F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, -1.4825F, -1.1341F, 1.3383F, 0.5877F, 1.1097F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(98, 39).addBox(-0.401F, -0.9946F, -0.3619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -1.4825F, -1.1341F, 1.0115F, 0.3029F, 0.4447F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(77, 60).addBox(-0.5714F, -1.5203F, 0.1052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -1.4825F, -1.1341F, 0.9992F, -0.361F, -0.5058F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(11, 98).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, -0.4335F, -1.451F, 0.7419F, 0.1372F, -0.0401F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(96, 45).addBox(-0.6134F, -0.8537F, -1.6783F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -4.0062F, -3.5256F, 0.9143F, 0.1018F, 0.1311F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(87, 99).addBox(-0.9282F, -1.7051F, -0.8356F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -4.0062F, -3.5256F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(100, 42).addBox(0.4369F, -0.8948F, -0.4545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9282F, -4.0062F, -3.5256F, 1.3193F, 0.6189F, 1.0988F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(98, 65).addBox(-0.0857F, -0.9607F, -0.8971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -4.0062F, -3.5256F, 0.9783F, 0.3178F, 0.4346F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 78).addBox(-0.9275F, -1.4635F, -0.4017F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -4.0062F, -3.5256F, 0.9663F, -0.3777F, -0.4939F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(98, 60).addBox(-0.5264F, -1.3822F, -0.3406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, -2.4585F, -4.2346F, 0.7067F, 0.1358F, -0.0449F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5092F, -5.2F, -0.3201F, -0.1939F, 0.1097F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.3505F, -0.3013F, -0.5286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8734F, 0.0956F, -2.0718F, 1.0252F, -0.1418F, -0.0183F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(44, 100).mirror().addBox(-1.394F, 1.5374F, -0.5014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(98, 99).mirror().addBox(-1.3415F, -0.5478F, -0.4046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.4598F, -3.4584F, 1.5209F, -0.2129F, -1.1822F));

		PartDefinition cube_r233 = neck.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(96, 76).mirror().addBox(-1.4045F, 1.5791F, -1.6472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 27).mirror().addBox(-1.3913F, -0.5075F, -1.5682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.4598F, -3.4584F, 1.3555F, -0.0357F, -0.1619F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(28, 99).mirror().addBox(-0.9198F, 1.4721F, -0.8617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 99).mirror().addBox(-0.8792F, -0.6144F, -0.7926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.4598F, -3.4584F, 1.3821F, -0.1101F, -0.5219F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.1539F, 0.9667F, -0.3157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 99).mirror().addBox(-0.1597F, -1.1213F, -0.3157F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.4598F, -3.4584F, 1.3594F, 0.1436F, 0.5972F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-1.4166F, -0.3901F, -1.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -1.4598F, -3.4584F, 1.1998F, -0.1418F, -0.0183F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(96, 76).addBox(-0.5955F, 1.5791F, -1.6472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 27).addBox(-0.6087F, -0.5075F, -1.5682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -1.4598F, -3.4584F, 1.3555F, 0.0357F, 0.1619F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(83, 95).addBox(-0.6495F, -0.3013F, -0.5286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8734F, 0.0956F, -2.0718F, 1.0252F, 0.1418F, 0.0183F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(44, 100).addBox(0.394F, 1.5374F, -0.5014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(98, 99).addBox(0.3415F, -0.5478F, -0.4046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -1.4598F, -3.4584F, 1.5209F, 0.2129F, 1.1822F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(28, 99).addBox(-0.0802F, 1.4721F, -0.8617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 99).addBox(-0.1208F, -0.6144F, -0.7926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -1.4598F, -3.4584F, 1.3821F, 0.1101F, 0.5219F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(39, 78).addBox(-0.9054F, -2.4225F, 1.4178F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 80).addBox(-0.9054F, -1.2324F, -0.5529F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.4598F, -3.4584F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 60).addBox(-0.8461F, 0.9667F, -0.3157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 99).addBox(-0.8403F, -1.1213F, -0.3157F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -1.4598F, -3.4584F, 1.3594F, -0.1436F, -0.5972F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(99, 12).addBox(0.4166F, -0.3901F, -1.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -1.4598F, -3.4584F, 1.1998F, 0.1418F, 0.0183F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(77, 60).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.2F, -0.3142F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -4.5F, -0.2626F, -0.3243F, -0.3084F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(102, 24).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(102, 24).addBox(1.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 1.1511F, -0.6455F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(101, 32).mirror().addBox(-1.9F, -0.09F, 0.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 32).addBox(-0.1F, -0.09F, 0.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 57).addBox(-2.0F, -0.0791F, 0.0433F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.4F, -1.6F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-1.42F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(70, 73).addBox(0.82F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.4948F, -1.304F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 47).mirror().addBox(-1.93F, -1.6173F, -1.2874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(97, 53).mirror().addBox(-1.93F, -1.6173F, -1.6874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 47).addBox(0.13F, -1.6173F, -1.2874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(97, 53).addBox(0.13F, -1.6173F, -1.6874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.0F, -2.1F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(102, 21).mirror().addBox(-1.94F, -0.9F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 79).mirror().addBox(-2.15F, -0.9F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 98).mirror().addBox(-1.93F, -1.3F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(101, 79).addBox(0.35F, -0.9F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(102, 21).addBox(0.14F, -0.9F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 98).addBox(0.13F, -1.3F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(32, 84).addBox(-1.9F, -1.0F, -3.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(91, 40).addBox(-1.4F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(102, 50).mirror().addBox(-1.5F, -1.6711F, -0.2772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(102, 50).addBox(-0.1F, -1.6711F, -0.2772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.9486F, -6.1578F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(102, 53).mirror().addBox(-1.5F, -3.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(70, 27).mirror().addBox(-1.23F, -0.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(102, 53).addBox(-0.1F, -3.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(70, 27).addBox(-0.37F, -0.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 1.3827F, -7.6498F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(102, 47).addBox(0.9F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.7F, 0.9378F, -5.6368F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(77, 102).mirror().addBox(-1.0F, -0.0281F, -0.3419F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 98).mirror().addBox(-1.1F, -0.0281F, -0.0419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(77, 102).addBox(0.6F, -0.0281F, -0.3419F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 98).addBox(-0.3F, -0.0281F, -0.0419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 1.9F, -6.6F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(74, 102).mirror().addBox(-0.8F, -0.1636F, -0.2102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 98).mirror().addBox(-0.9F, -0.1636F, -0.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 102).addBox(0.4F, -0.1636F, -0.2102F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 98).addBox(-0.5F, -0.1636F, -0.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.3F, -7.8F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(102, 35).mirror().addBox(0.0F, -0.0073F, 0.0531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(102, 35).addBox(0.4F, -0.0073F, 0.0531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 3.2F, -9.7F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(0.0F, -0.7275F, -0.0253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(72, 98).addBox(0.4F, -0.7275F, -0.0253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 2.7F, -8.4F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(36, 102).addBox(-1.2F, -0.0579F, 0.037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7F, 2.2F, -9.6F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(24, 102).addBox(-0.5F, -0.0107F, 0.0625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.4F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(45, 4).addBox(-1.0F, -0.0212F, 0.0063F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -3.5F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(15, 47).addBox(-1.0F, -0.0532F, -0.2455F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -4.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(83, 40).addBox(-0.5F, 0.0281F, -0.0301F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -9.1F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-0.9F, 0.0534F, -1.992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 4).addBox(-0.1F, 0.0534F, -1.992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3872F, -5.1271F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(15, 41).addBox(-1.0F, -0.9562F, 0.0258F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.6741F, -2.482F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(15, 54).addBox(-1.0F, -1.02F, -0.0545F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.4741F, -3.382F, -0.288F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.0F, -0.5F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(48, 17).mirror().addBox(-1.0F, 0.0055F, 0.0278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -3.6F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(24, 68).mirror().addBox(-1.0F, 0.0068F, -0.0338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -1.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(100, 71).mirror().addBox(-1.0F, -0.0844F, -1.5561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 100).mirror().addBox(-1.0F, -0.0844F, -0.9561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(100, 71).addBox(-0.6F, -0.0844F, -1.5561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(82, 100).addBox(-0.6F, -0.0844F, -0.9561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 1.2F, -7.4F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(73, 39).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 39).addBox(1.2F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.5668F, -7.6946F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(63, 1).mirror().addBox(-0.9F, -0.1084F, -0.0438F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 1).addBox(0.3F, -0.1084F, -0.0438F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.0F, -7.4F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(101, 2).mirror().addBox(-1.0F, -0.0476F, -1.9805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(10, 69).mirror().addBox(-1.2F, -0.0476F, -0.9805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(101, 2).addBox(-0.6F, -0.0476F, -1.9805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 69).addBox(-0.4F, -0.0476F, -0.9805F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, 0.6F, -5.5F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(7, 33).mirror().addBox(-0.6F, -0.6F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 33).addBox(1.84F, -0.6F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.62F, 1.2523F, -1.7237F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.0F, -1.0125F, -1.9976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 69).addBox(-0.2F, -1.0125F, -1.9976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.6F, -3.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(16, 101).mirror().addBox(-1.0F, -1.0001F, -1.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 101).addBox(1.0F, -1.0001F, -1.0025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5F, -2.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(56, 69).addBox(1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -0.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(48, 17).addBox(0.0F, 0.0055F, 0.0278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.6F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(24, 68).addBox(0.0F, 0.0068F, -0.0338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(48, 5).addBox(-1.0F, -1.3F, -0.3F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7F, 7.1F, -0.4911F, -0.224F, 0.1395F));

		PartDefinition cube_r277 = tail.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(15, 33).addBox(0.0F, -1.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 69).addBox(0.0F, -1.7F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 12).addBox(0.0F, -1.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 102).addBox(0.0F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r278 = tail.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(56, 101).addBox(0.0F, -0.1103F, 0.2363F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6419F, 7.1801F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r279 = tail.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(59, 101).addBox(0.0F, 0.055F, -0.0117F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1419F, 5.4801F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r280 = tail.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(32, 33).addBox(0.0F, -0.0789F, -0.4028F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1571F, 1.5052F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r281 = tail.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(53, 8).addBox(0.0F, -0.0937F, -0.4226F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0419F, 3.6801F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(66, 61).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 8.6F, 0.1056F, -0.1302F, -0.0138F));

		PartDefinition cube_r282 = tail2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(41, 102).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3064F, 7.7492F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r283 = tail2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(90, 99).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7891F, 5.7675F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r284 = tail2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(49, 100).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0906F, 3.7013F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r285 = tail2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 101).addBox(0.0F, 0.3897F, 2.0363F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8419F, -1.4199F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1314F, -0.0865F, -0.0114F));

		PartDefinition cube_r286 = tail3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(10, 69).addBox(0.0F, 2.5F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 69).addBox(0.0F, 1.9F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 102).addBox(0.0F, 0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3064F, -0.1508F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(13, 66).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1223F, 0.0433F, -0.0053F));

		PartDefinition cube_r287 = tail4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(29, 33).addBox(0.0F, 3.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3064F, -8.0508F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(36, 76).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.4548F, 0.276F, -0.1325F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(91, 66).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(82, 80).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, -1.3F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition cube_r288 = leftLeg.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(24, 87).addBox(-1.0F, -0.0275F, -0.2188F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 9.8F, 0.6F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftLeg.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(79, 87).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -0.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftLeg.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.9F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(32, 44).addBox(-1.0F, -1.7F, -0.3F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(2.0F, -1.1F, -0.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(68, 83).addBox(-1.3F, -1.7F, 9.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.1F, 3.0F, -0.7243F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -0.5F, -0.2F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -1.2F, 13.7F, -1.8675F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(53, 61).addBox(-1.0F, -1.2F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 5.1F, -0.4625F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(76, 15).addBox(-1.0F, -1.2F, -0.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(9, 91).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 33).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -1.3F, -0.6939F, -0.084F, -0.1005F));

		PartDefinition cube_r291 = rightLeg.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(13, 84).addBox(-1.0F, -0.0275F, -0.2188F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8F, 0.6F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightLeg.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(32, 42).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -0.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightLeg.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(53, 30).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.9F, 0.4712F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(17, 41).addBox(-1.0F, -1.7F, -0.3F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(23, 27).addBox(-3.0F, -1.1F, -0.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(82, 4).addBox(-1.7F, -1.7F, 9.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.1F, 3.0F, -0.5559F, -0.0055F, 0.1571F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(58, 39).addBox(-3.0F, -0.5F, -0.2F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.2F, 13.7F, -1.8675F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(60, 17).addBox(-4.0F, -1.2F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, 5.1F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(15, 33).addBox(-4.0F, -1.2F, -0.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

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