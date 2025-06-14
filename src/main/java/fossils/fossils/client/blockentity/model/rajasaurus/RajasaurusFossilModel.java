package fossils.fossils.client.blockentity.model.rajasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RajasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart bony;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public RajasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.bony = this.hips.getChild("bony");
		this.chest = this.bony.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck4 = this.chest.getChild("neck4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.0007F, -1.7064F, 0.1213F, 0.0592F, -0.1247F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 91).addBox(0.0F, -2.4069F, -0.0231F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.4F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 91).addBox(0.0F, -2.0429F, -0.0825F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 93).addBox(0.0F, -2.1121F, 0.0377F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 5).addBox(0.0F, -2.164F, 0.0594F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 91).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-0.7284F, -0.7081F, 6.8102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, 0.5596F, -0.1565F, 0.248F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 74).mirror().addBox(-0.7284F, -7.9626F, -3.8155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -1.3254F, -0.1565F, 0.248F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 96).mirror().addBox(-0.7284F, -8.1232F, 2.5259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(91, 68).mirror().addBox(-0.7284F, -8.1232F, 1.6259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.4702F, -0.1565F, 0.248F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.7284F, -7.2616F, 2.0362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.156F, -0.1565F, 0.248F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 60).mirror().addBox(-0.7284F, -6.4772F, 2.3554F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.0862F, -0.1565F, 0.248F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-1.4221F, -3.3054F, 3.7171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, 0.3316F, 0.0F, 0.2618F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.7284F, -5.915F, 1.6415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.3131F, -0.1565F, 0.248F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.7284F, -6.8193F, 1.0603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.348F, -0.1565F, 0.248F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(-1.2355F, -7.9945F, -0.2077F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, 0.6976F, 0.113F, 0.2519F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(11, 96).mirror().addBox(-1.2355F, -8.0223F, -3.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, 0.2438F, 0.113F, 0.2519F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 67).mirror().addBox(-1.2355F, -7.2885F, -3.9363F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.0006F, 0.113F, 0.2519F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-1.2355F, -5.5565F, -6.5802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.2624F, 0.113F, 0.2519F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-1.4221F, -7.1648F, -1.6892F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.1047F, 0.0F, 0.2618F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.2229F, -5.1524F, -0.9952F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.2013F, 0.0045F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(13, 60).mirror().addBox(-0.2229F, -4.6695F, -2.851F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8779F, 3.9579F, -0.6255F, -0.2188F, 0.0045F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(85, 8).mirror().addBox(0.3429F, 0.0956F, 1.3932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 52).mirror().addBox(0.3429F, -0.4044F, 0.7932F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -0.957F, -0.0226F, -0.2259F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(0.2913F, -2.4863F, 1.0459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -1.5242F, -0.0226F, -0.2259F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(1.9173F, 2.1846F, 9.2914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -1.9874F, 0.0F, 0.0349F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(1.9173F, 3.6729F, 7.7483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.199F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -1.5947F, 0.0F, 0.0349F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(1.6017F, 6.6742F, -2.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -0.3605F, 0.0895F, -0.0623F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(0.3606F, 0.4069F, -1.9322F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -0.4748F, 0.0271F, -0.2255F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(0.1771F, -0.7244F, -2.0673F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -0.0268F, 0.0045F, -0.2269F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 73).mirror().addBox(0.99F, -7.0064F, 6.3713F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -1.7609F, -0.0256F, -0.0846F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(24, 66).mirror().addBox(0.99F, -1.6847F, 5.3692F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -1.1675F, -0.0256F, -0.0846F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 84).mirror().addBox(0.2913F, -2.6696F, -0.3046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2779F, 1.6579F, -0.6255F, -1.8733F, -0.0226F, -0.2259F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 67).addBox(0.2355F, -7.2885F, -3.9363F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.0006F, -0.113F, -0.2519F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(77, 68).addBox(0.2355F, -7.9945F, -0.2077F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, 0.6976F, -0.113F, -0.2519F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(11, 96).addBox(0.2355F, -8.0223F, -3.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, 0.2438F, -0.113F, -0.2519F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(14, 74).addBox(-2.9173F, 2.1846F, 9.2914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -1.9874F, 0.0F, -0.0349F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(38, 87).addBox(-2.9173F, 3.6729F, 7.7483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.199F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -1.5947F, 0.0F, -0.0349F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 11).addBox(-2.6017F, 6.6742F, -2.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -0.3605F, -0.0895F, 0.0623F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 72).addBox(-1.3606F, 0.4069F, -1.9322F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -0.4748F, -0.0271F, 0.2255F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 59).addBox(-1.1771F, -0.7244F, -2.0673F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -0.0268F, -0.0045F, 0.2269F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(38, 73).addBox(-1.99F, -7.0064F, 6.3713F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -1.7609F, 0.0256F, 0.0846F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(24, 66).addBox(-1.99F, -1.6847F, 5.3692F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -1.1675F, 0.0256F, 0.0846F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(85, 8).addBox(-1.3429F, 0.0956F, 1.3932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 52).addBox(-1.3429F, -0.4044F, 0.7932F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -0.957F, 0.0226F, 0.2259F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(85, 16).addBox(-1.2913F, -2.4863F, 1.0459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -1.5242F, 0.0226F, 0.2259F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 84).addBox(-1.2913F, -2.6696F, -0.3046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2779F, 1.6579F, -0.6255F, -1.8733F, 0.0226F, 0.2259F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 60).addBox(-0.7771F, -4.6695F, -2.851F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.2188F, -0.0045F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(35, 66).addBox(-0.7771F, -5.1524F, -0.9952F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.2013F, -0.0045F, 0.0F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 59).addBox(0.4221F, -7.1648F, -1.6892F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.1047F, 0.0F, -0.2618F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 74).addBox(-0.2716F, -7.9626F, -3.8155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -1.3254F, 0.1565F, -0.248F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 96).addBox(-0.2716F, -8.1232F, 2.5259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(91, 68).addBox(-0.2716F, -8.1232F, 1.6259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.4702F, 0.1565F, -0.248F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(85, 0).addBox(-0.2716F, -7.2616F, 2.0362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.156F, 0.1565F, -0.248F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(24, 60).addBox(-0.2716F, -6.4772F, 2.3554F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.0862F, 0.1565F, -0.248F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 25).addBox(0.4221F, -3.3054F, 3.7171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, 0.3316F, 0.0F, -0.2618F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(94, 71).addBox(-0.2716F, -0.7081F, 6.8102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, 0.5596F, 0.1565F, -0.248F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 74).addBox(-0.2716F, -5.915F, 1.6415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.3131F, 0.1565F, -0.248F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 66).addBox(-0.2716F, -6.8193F, 1.0603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.348F, 0.1565F, -0.248F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(65, 41).addBox(0.2355F, -5.5565F, -6.5802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8779F, 3.9579F, -0.6255F, -0.2624F, -0.113F, -0.2519F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(52, 0).addBox(1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(27, 29).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 1.7336F, -0.7003F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(20, 72).addBox(-1.0F, -1.2F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.8421F, 1.7819F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 84).addBox(-1.0F, 0.9131F, 0.1292F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 4.5139F, -0.9195F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(49, 78).addBox(-1.0F, -0.2F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.7F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(54, 78).addBox(-1.0F, -4.6488F, -0.0637F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 5.2367F, -0.3815F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(44, 78).addBox(-1.0F, -0.5268F, -0.1597F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.118F, -0.5733F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(74, 58).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(78, 83).addBox(1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(68, 67).addBox(0.0F, 0.0F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(44, 67).addBox(0.0F, 1.0F, 0.4F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 10.496F, 2.2869F, 2.3533F, -0.1234F, 0.0619F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -0.6F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 24).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 0.6F, 0.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(72, 24).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.254F, 0.8969F, -1.0821F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(31, 11).addBox(-2.0F, -0.4881F, -2.6918F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2071F, -0.0649F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(52, 24).addBox(-2.0F, -0.5F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 1.7336F, -0.7003F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(29, 73).addBox(-1.0F, -1.2F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.8421F, 1.7819F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(85, 38).addBox(0.0F, 0.9131F, 0.1292F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 4.5139F, -0.9195F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(80, 44).addBox(0.0F, -0.2F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.7F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 79).addBox(0.0F, -4.6488F, -0.0637F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 5.2367F, -0.3815F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 24).addBox(0.0F, -0.5268F, -0.1597F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.118F, -0.5733F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 39).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(19, 84).addBox(-2.0F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(69, 0).addBox(-1.0F, 0.0F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(54, 67).addBox(-1.0F, 1.0F, 0.4F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 10.496F, 2.2869F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(84, 21).addBox(-1.0F, -0.6F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 67).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 0.6F, 0.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.254F, 0.8969F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(34, 52).addBox(-2.0F, -0.4881F, -2.6918F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2071F, -0.0649F, 0.7385F, 0.0312F, 0.1541F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(52, 34).addBox(-2.0F, -0.5F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -0.7016F, -0.0686F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.007F))
				.texOffs(68, 87).addBox(0.6F, 0.2984F, 0.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(0.3F, 0.2984F, 2.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 90).addBox(0.1F, 0.2984F, 4.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 10).addBox(0.9F, 0.2984F, 6.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 30).addBox(0.8F, 0.2984F, 8.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 87).mirror().addBox(-2.6F, 0.2984F, 0.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 88).mirror().addBox(-2.3F, 0.2984F, 2.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 90).mirror().addBox(-2.1F, 0.2984F, 4.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 10).mirror().addBox(-1.9F, 0.2984F, 6.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 30).mirror().addBox(-1.8F, 0.2984F, 8.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 5.0F, -0.2815F, -0.1258F, 0.0363F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(91, 76).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 8.9314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(95, 10).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 6.9314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 95).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 4.9314F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(95, 0).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 2.9314F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 91).addBox(0.0F, -0.0373F, -0.0637F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.245F, 9.8331F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(91, 71).addBox(0.0F, -0.6F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 53).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6813F, 6.407F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(63, 91).addBox(0.0F, 0.0F, 2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 91).addBox(0.0F, -1.0F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8313F, 0.7734F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(23, 30).addBox(0.0F, -2.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6016F, 0.9314F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2984F, 10.8314F, 0.0792F, -0.1305F, -0.0103F));

		PartDefinition cube_r81 = tail2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(92, 5).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(3, 92).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 0).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 97).addBox(0.0F, -0.0047F, -0.0884F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9161F, 7.7286F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(25, 98).addBox(0.0F, 0.1345F, -0.153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8815F, 5.6193F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(6, 97).addBox(0.0F, 0.3094F, -0.0916F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9544F, 3.4183F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(3, 97).addBox(0.0F, 0.3153F, 0.065F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0351F, 1.1175F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(77, 91).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4038F, -0.0679F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition cube_r90 = tail3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(71, 96).addBox(0.0F, -1.3749F, -0.0285F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2893F, 11.9594F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(63, 96).addBox(0.0F, -1.5924F, -0.0286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3417F, 9.9601F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(60, 95).addBox(0.0F, -1.7098F, -0.0287F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, 7.9608F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 68).addBox(0.0F, -1.7574F, -0.0267F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3464F, 5.9588F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 96).addBox(0.0F, -1.9077F, -0.1274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3961F, 4.0595F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 15).addBox(0.0F, -2.2527F, -0.0229F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2512F, 1.955F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(95, 98).addBox(0.0F, 2.0F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 92).addBox(0.0F, 1.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 79).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6322F, 9.1115F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(97, 43).addBox(0.0F, -0.5F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4808F, 6.8357F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(74, 96).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.712F, 4.6116F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(43, 97).addBox(0.0F, 0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 97).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5962F, 0.4321F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(92, 10).addBox(0.0F, -2.3003F, -0.0236F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3035F, -0.0444F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(46, 42).addBox(-0.5F, -0.5005F, 0.0218F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(83, 98).addBox(0.0F, -1.5005F, 0.0218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 98).addBox(0.0F, -1.3005F, 2.0218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 98).addBox(0.0F, -1.1005F, 4.0218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 98).addBox(0.0F, -0.9005F, 6.0218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1271F, 13.8336F, -0.1174F, 0.2601F, -0.0303F));

		PartDefinition cube_r101 = tail4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 99).addBox(0.0F, 4.8F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 98).addBox(0.0F, 3.8F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 95).addBox(0.0F, 2.8F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5051F, -4.7221F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 8.0218F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition cube_r102 = tail5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(31, 99).addBox(0.0F, 6.6F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 99).addBox(0.0F, 5.7F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0056F, -12.7439F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(27, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0397F, 5.984F, -0.3237F, -0.3323F, 0.109F));

		PartDefinition bony = hips.addOrReplaceChild("bony", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r103 = bony.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(74, 63).addBox(0.0F, -1.4029F, -0.8627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3392F, -5.8903F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bony.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(66, 97).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2567F, -10.1969F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bony.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(28, 98).addBox(0.0F, -1.4904F, -0.9185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2369F, -7.8426F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bony.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-8.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -10.1979F, 0.0965F, 0.0562F, -1.3676F));

		PartDefinition cube_r107 = bony.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -10.1979F, 0.1107F, 0.0151F, -0.9768F));

		PartDefinition cube_r108 = bony.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -10.1979F, 0.115F, 0.0026F, -0.497F));

		PartDefinition cube_r109 = bony.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -8.1979F, 0.1189F, 0.0147F, -0.4797F));

		PartDefinition cube_r110 = bony.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -8.1979F, 0.1085F, 0.0277F, -0.9597F));

		PartDefinition cube_r111 = bony.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-8.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -8.1979F, 0.0897F, 0.067F, -1.3508F));

		PartDefinition cube_r112 = bony.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0002F, -0.3979F, 0.1005F, 0.0478F, -0.6165F));

		PartDefinition cube_r113 = bony.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0002F, -0.3979F, 0.0769F, 0.0485F, -1.0971F));

		PartDefinition cube_r114 = bony.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(97, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0998F, -2.2979F, 0.1238F, 0.0432F, -0.5475F));

		PartDefinition cube_r115 = bony.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0998F, -2.2979F, 0.0997F, 0.0552F, -1.0279F));

		PartDefinition cube_r116 = bony.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(24, 88).mirror().addBox(-4.4912F, -1.5298F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0998F, -2.2979F, 0.071F, 0.0891F, -1.4202F));

		PartDefinition cube_r117 = bony.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(-6.4912F, -1.5298F, -0.4598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2997F, -4.1979F, 0.0811F, 0.0871F, -1.3855F));

		PartDefinition cube_r118 = bony.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(17, 88).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2997F, -4.1979F, 0.1082F, 0.0495F, -0.9937F));

		PartDefinition cube_r119 = bony.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(97, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2997F, -4.1979F, 0.1287F, 0.0342F, -0.5135F));

		PartDefinition cube_r120 = bony.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(-7.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -6.1979F, 0.0859F, 0.086F, -1.3681F));

		PartDefinition cube_r121 = bony.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -6.1979F, 0.1122F, 0.0467F, -0.9765F));

		PartDefinition cube_r122 = bony.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -6.1979F, 0.1309F, 0.0299F, -0.4965F));

		PartDefinition cube_r123 = bony.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(52, 39).addBox(2.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -10.1979F, 0.0965F, -0.0562F, 1.3676F));

		PartDefinition cube_r124 = bony.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 89).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -10.1979F, 0.1107F, -0.0151F, 0.9768F));

		PartDefinition cube_r125 = bony.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -10.1979F, 0.115F, -0.0026F, 0.497F));

		PartDefinition cube_r126 = bony.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(98, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -8.1979F, 0.1189F, -0.0147F, 0.4797F));

		PartDefinition cube_r127 = bony.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(90, 90).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -8.1979F, 0.1085F, -0.0277F, 0.9597F));

		PartDefinition cube_r128 = bony.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(65, 47).addBox(2.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -8.1979F, 0.0897F, -0.067F, 1.3508F));

		PartDefinition cube_r129 = bony.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(80, 5).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0002F, -0.3979F, 0.1005F, -0.0478F, 0.6165F));

		PartDefinition cube_r130 = bony.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(87, 36).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0002F, -0.3979F, 0.0769F, -0.0485F, 1.0971F));

		PartDefinition cube_r131 = bony.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(97, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0998F, -2.2979F, 0.1238F, -0.0432F, 0.5475F));

		PartDefinition cube_r132 = bony.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(43, 89).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0998F, -2.2979F, 0.0997F, -0.0552F, 1.0279F));

		PartDefinition cube_r133 = bony.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(24, 88).addBox(2.4912F, -1.5298F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0998F, -2.2979F, 0.071F, -0.0891F, 1.4202F));

		PartDefinition cube_r134 = bony.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 5).addBox(2.4912F, -1.5298F, -0.4598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2997F, -4.1979F, 0.0811F, -0.0871F, 1.3855F));

		PartDefinition cube_r135 = bony.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(17, 88).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2997F, -4.1979F, 0.1082F, -0.0495F, 0.9937F));

		PartDefinition cube_r136 = bony.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(97, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2997F, -4.1979F, 0.1287F, -0.0342F, 0.5135F));

		PartDefinition cube_r137 = bony.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(65, 49).addBox(2.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -6.1979F, 0.0859F, -0.086F, 1.3681F));

		PartDefinition cube_r138 = bony.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(72, 33).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -6.1979F, 0.1122F, -0.0467F, 0.9765F));

		PartDefinition cube_r139 = bony.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -6.1979F, 0.1309F, -0.0299F, 0.4965F));

		PartDefinition cube_r140 = bony.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(17, 51).addBox(-1.0F, -0.1167F, -5.8801F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r141 = bony.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(19, 98).addBox(0.0F, -1.508F, -0.0782F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -4.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bony.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, -1.5586F, -0.0804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r143 = bony.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(16, 98).addBox(0.0F, -1.3424F, 0.029F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r144 = bony.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 43).addBox(-3.0F, -2.008F, -4.9782F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1429F, -7.1539F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bony.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(23, 42).addBox(-3.0F, -3.008F, -4.9782F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0556F, -2.1547F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r146 = bony.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.108F, -0.0782F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest = bony.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -11.6F, -0.1584F, 0.1002F, 0.0721F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(97, 88).addBox(0.0F, -1.6327F, 0.0773F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4981F, -1.1935F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 84).addBox(0.0F, -1.1327F, -0.0227F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3651F, -3.0994F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(98, 6).addBox(0.0F, -1.006F, 0.0376F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1349F, -5.0994F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-5.8F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5506F, 10.3475F, -1.1558F, 0.9525F, 0.8798F, 0.9152F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8441F, 10.13F, -0.9531F, 0.4868F, 0.4663F, 0.9808F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-4.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0411F, 9.8553F, -2.0056F, 0.0017F, 0.3098F, 1.1631F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.543F, 1.0349F, -4.697F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6317F, 8.9902F, -2.3265F, -0.5032F, -0.2306F, 0.1251F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1351F, -0.5973F, 0.2691F, 0.0852F, -0.5249F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(90, 38).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1351F, -0.5973F, 0.2096F, 0.1594F, -1.0028F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(67, 14).mirror().addBox(-7.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1351F, -0.5973F, 0.1329F, 0.2272F, -1.3971F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(37, 78).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.105F)).mirror(false), PartPose.offsetAndRotation(-3.5103F, 1.0945F, 0.8568F, 1.2934F, 0.0648F, 0.0585F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.095F)).mirror(false), PartPose.offsetAndRotation(-3.6582F, 4.8128F, -2.7244F, 0.2544F, -0.2457F, -0.1968F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2352F, -6.3973F, 0.3106F, 0.3231F, -1.1718F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(97, 82).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2352F, -6.3973F, 0.4328F, 0.1857F, -0.6959F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(17, 90).mirror().addBox(-4.4912F, -1.5298F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2352F, -6.3973F, 0.1606F, 0.4162F, -1.5815F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-5.4912F, -1.5298F, -0.4598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9352F, -4.3973F, 0.153F, 0.312F, -1.4446F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9352F, -4.3973F, 0.2612F, 0.2301F, -1.0457F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(97, 80).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9352F, -4.3973F, 0.3469F, 0.1248F, -0.5696F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5352F, -2.3973F, 0.2994F, 0.1027F, -0.522F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(68, 89).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5352F, -2.3973F, 0.2287F, 0.1888F, -0.9995F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-6.4912F, -1.5298F, -0.4598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5352F, -2.3973F, 0.1391F, 0.2616F, -1.3956F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(0.2358F, -2.4026F, -2.0917F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 6.4099F, -4.8653F, 1.3186F, -0.4848F, -0.4607F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 87).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)).mirror(false), PartPose.offsetAndRotation(-2.7098F, 5.1188F, -5.7223F, 1.8858F, -0.4848F, -0.4607F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(-0.4882F, 0.1778F, -0.3804F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 4.9408F, -5.0471F, 0.5424F, -0.2457F, -0.1968F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-0.4418F, 0.583F, -0.8073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 4.9408F, -5.0471F, 0.8216F, -0.2457F, -0.1968F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-1.2166F, 0.6044F, 0.1326F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2954F, 4.5125F, -3.8242F, 1.1015F, 0.0648F, 0.0585F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(24, 90).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2352F, -6.3973F, 0.3106F, -0.3231F, 1.1718F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(97, 82).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2352F, -6.3973F, 0.4328F, -0.1857F, 0.6959F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(17, 90).addBox(2.4912F, -1.5298F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2352F, -6.3973F, 0.1606F, -0.4162F, 1.5815F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(67, 39).addBox(2.4912F, -1.5298F, -0.4598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9352F, -4.3973F, 0.153F, -0.312F, 1.4446F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 90).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9352F, -4.3973F, 0.2612F, -0.2301F, 1.0457F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(97, 80).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9352F, -4.3973F, 0.3469F, -0.1248F, 0.5696F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 14).addBox(2.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1351F, -0.5973F, 0.1329F, -0.2272F, 1.3971F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 38).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1351F, -0.5973F, 0.2096F, -0.1594F, 1.0028F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1351F, -0.5973F, 0.2691F, -0.0852F, 0.5249F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(97, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5352F, -2.3973F, 0.2994F, -0.1027F, 0.522F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(68, 89).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5352F, -2.3973F, 0.2287F, -0.1888F, 0.9995F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 31).addBox(2.4912F, -1.5298F, -0.4598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5352F, -2.3973F, 0.1391F, -0.2616F, 1.3956F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(98, 2).addBox(0.0F, -0.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6349F, -6.9994F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(67, 59).addBox(-1.2358F, -2.4026F, -2.0917F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.7F, 6.4099F, -4.8653F, 1.3186F, 0.4848F, 0.4607F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(75, 87).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)), PartPose.offsetAndRotation(2.7098F, 5.1188F, -5.7223F, 1.8858F, 0.4848F, 0.4607F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(68, 72).addBox(-0.5118F, 0.1778F, -0.3804F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.1F, 4.9408F, -5.0471F, 0.5424F, 0.2457F, 0.1968F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.095F)), PartPose.offsetAndRotation(3.6582F, 4.8128F, -2.7244F, 0.2544F, 0.2457F, 0.1968F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(77, 78).addBox(-0.5582F, 0.583F, -0.8073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.1F, 4.9408F, -5.0471F, 0.8216F, 0.2457F, 0.1968F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(37, 78).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.105F)), PartPose.offsetAndRotation(3.5103F, 1.0945F, 0.8568F, 1.2934F, -0.0648F, -0.0585F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 16).addBox(0.2166F, 0.6044F, 0.1326F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.2954F, 4.5125F, -3.8242F, 1.1015F, -0.0648F, -0.0585F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 60).addBox(-1.457F, 1.0349F, -4.697F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6317F, 8.9902F, -2.3265F, -0.5032F, 0.2306F, -0.1251F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(65, 16).addBox(-2.1317F, 1.0349F, -4.81F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6317F, 8.9902F, -2.3265F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(52, 29).addBox(-3.6317F, 0.5969F, -1.4871F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6317F, 8.9902F, -2.3265F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 35).addBox(-1.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0411F, 9.8553F, -2.0056F, 0.0017F, -0.3098F, -1.1631F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 37).addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8441F, 10.13F, -0.9531F, 0.4868F, -0.4663F, -0.9808F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(65, 22).addBox(-0.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5506F, 10.3475F, -1.1558F, 0.9525F, -0.8798F, -0.9152F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.6349F, -5.9994F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(83, 56).addBox(-0.4391F, -0.6794F, 0.0214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0451F, 7.0655F, -2.6929F, -0.4326F, 0.202F, -0.2303F));

		PartDefinition cube_r200 = leftArm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(59, 74).addBox(-0.5F, -0.9F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0609F, -0.1794F, 3.0214F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(94, 77).addBox(-1.0F, -0.8402F, 0.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 13).addBox(-1.0F, 0.1598F, 0.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6441F, -1.1321F, 4.4813F, 0.2116F, -0.0869F, 0.1515F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(87, 51).addBox(-1.0F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0696F, 0.3F, 1.4491F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(71, 83).addBox(-0.5609F, -0.6794F, 0.0214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0451F, 7.0655F, -2.6929F, -0.4326F, -0.202F, 0.2303F));

		PartDefinition cube_r201 = rightArm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(76, 16).addBox(-0.5F, -0.9F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0609F, -0.1794F, 3.0214F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(22, 95).addBox(0.0F, -0.8402F, 0.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 81).addBox(0.0F, 0.1598F, 0.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6441F, -1.1321F, 4.4813F, 0.2116F, 0.0869F, -0.1515F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(63, 87).addBox(0.0F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0696F, 0.3F, 1.4491F, 0.0F, 0.3054F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0048F, -7.8967F, 0.4422F, 0.158F, 0.0744F));

		PartDefinition cube_r202 = neck4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.0024F, -0.0388F, -0.4953F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.113F, -0.5175F, 0.2536F, -0.1867F, 0.4077F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(23, 36).mirror().addBox(0.0F, -0.2734F, -0.547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -2.4F, 0.5049F, -0.1172F, 0.3414F));

		PartDefinition cube_r204 = neck4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(80, 87).addBox(0.0024F, -0.0388F, -0.4953F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.113F, -0.5175F, 0.2536F, 0.1867F, -0.4077F));

		PartDefinition cube_r205 = neck4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(23, 36).addBox(0.0F, -0.2734F, -0.547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -2.4F, 0.5049F, 0.1172F, -0.3414F));

		PartDefinition cube_r206 = neck4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 98).addBox(-0.5F, -0.8984F, 0.0003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.092F, -0.818F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 21).addBox(-0.5F, -0.4984F, 0.0003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -2.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(62, 52).addBox(-1.0F, -0.2F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2F, -3.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -3.6F, -0.124F, 0.1732F, -0.0215F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(33, 84).addBox(-0.5F, -0.5918F, -0.685F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, 0.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3F, -2.4F, -1.079F, -0.1107F, 0.238F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -0.4F, -1.0858F, -0.1209F, 0.2814F));

		PartDefinition cube_r212 = neck3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(80, 33).addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.4F, -1.0858F, 0.1209F, -0.2814F));

		PartDefinition cube_r213 = neck3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 0).addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -2.4F, -1.079F, 0.1107F, -0.238F));

		PartDefinition cube_r214 = neck3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(83, 60).addBox(-0.5F, -0.5499F, 0.0629F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3F, -2.0F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r215 = neck3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(67, 8).addBox(-1.0F, -0.0918F, -3.6851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -0.4F, 0.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(99, 32).addBox(-0.5F, -1.0321F, 0.032F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, -0.7F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 44).addBox(-0.5F, -0.8471F, -0.0282F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9F, -2.3F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(0.0F, -0.4999F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9921F, -2.8338F, -0.7033F, -0.1302F, 0.1778F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(64, 82).mirror().addBox(0.0393F, -0.6567F, 0.0652F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0079F, -1.1338F, -1.0915F, -0.1568F, 0.1564F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(64, 82).addBox(-0.0393F, -0.6567F, 0.0652F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0079F, -1.1338F, -1.0915F, 0.1568F, -0.1564F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(91, 28).addBox(0.0F, -0.4999F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9921F, -2.8338F, -0.7033F, 0.1302F, -0.1778F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(68, 77).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4F, -3.2F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -2.5F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(22, 98).addBox(0.0F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(14, 77).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r225 = neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(0.0F, -0.1809F, -0.0036F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.4F, -0.853F, -0.2249F, 0.1352F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(91, 20).addBox(0.0F, -0.1809F, -0.0036F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.4F, -0.853F, 0.2249F, -0.1352F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5664F, -1.9233F, -0.2295F, 0.2457F, -0.0914F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(83, 92).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.5545F, -3.2846F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(92, 81).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5545F, -3.2846F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(0.0996F, -0.05F, -0.8123F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.3008F, -2.4916F, -0.1569F, -0.0808F, -0.0619F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(80, 51).addBox(-1.0996F, -0.05F, -0.8123F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 0.3008F, -2.4916F, -0.1569F, 0.0808F, 0.0619F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(27, 92).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1836F, -1.1659F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-1.0F, -0.0056F, 0.198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(92, 84).addBox(1.0F, -0.0056F, 0.198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(22, 92).mirror().addBox(-1.0F, -0.0056F, -0.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(22, 92).addBox(1.0F, -0.0056F, -0.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -0.9F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(57, 92).addBox(0.0F, -0.7881F, -1.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(17, 92).addBox(0.0F, -1.1881F, -2.7736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.4F, -5.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(84, 29).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6703F, -7.7486F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(44, 85).addBox(0.0F, -0.9773F, -0.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 2.3238F, -8.8224F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(77, 74).addBox(-2.0F, -0.0282F, 0.0027F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(33, 87).addBox(-0.5F, 0.0295F, -0.9939F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8007F, -7.1209F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(12, 87).addBox(-0.5F, 0.0295F, -0.9939F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.2074F, -6.2074F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(58, 86).addBox(-0.5F, 0.0295F, -0.4939F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.3284F, -5.7222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(86, 72).addBox(-1.0F, 0.0294F, -0.9939F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.604F, -4.761F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(34, 57).addBox(-1.0F, 0.1295F, -1.8939F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(11, 68).addBox(-2.0F, 0.0295F, 0.0061F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -2.0F, -2.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.4F, 1.3936F, -1.65F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(88, 95).addBox(0.92F, 0.0364F, -0.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(93, 65).addBox(0.92F, -0.7374F, -0.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0712F, -0.0692F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(93, 59).addBox(0.92F, 0.0626F, -0.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.0712F, -0.0692F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(83, 95).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.42F, -0.359F, 1.4655F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(12, 82).addBox(-1.0996F, -0.1014F, -2.2804F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -1.0929F, -0.8416F, -1.3611F, 0.0808F, 0.0619F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(98, 56).addBox(-0.6996F, 0.1826F, -2.8923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -1.0929F, -0.8416F, 0.5936F, 0.0808F, 0.0619F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(98, 53).addBox(0.2F, 0.2301F, -0.6166F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.7898F, -3.748F, 0.288F, 0.1222F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(96, 18).addBox(1.0F, -1.0523F, 0.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1F, 0.4626F, 1.8508F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(86, 60).addBox(1.0F, -1.0523F, -0.0859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 1.0181F, 0.0339F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(23, 78).addBox(1.0F, -0.7681F, -1.9954F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1F, -1.9936F, 1.55F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(90, 55).addBox(0.0F, -1.9955F, 0.1586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(90, 40).addBox(0.0F, -1.9955F, -0.0414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.8426F, -5.2593F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(78, 7).addBox(-0.7F, -2.2267F, -0.6644F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 0.7898F, -3.748F, 0.3142F, 0.1222F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(30, 78).addBox(-1.0996F, -1.5411F, -2.2395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -1.0929F, -0.8416F, 0.4112F, 0.116F, -0.0183F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(93, 92).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.42F, -2.1056F, 0.2776F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(32, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.42F, -1.4281F, 0.8076F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(43, 91).addBox(-0.67F, -0.8293F, 0.3171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.59F, -1.4364F, -1.1518F, 1.1185F, 0.1221F, 0.0438F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(38, 91).addBox(-0.67F, -1.3873F, -0.5612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.59F, -1.4364F, -1.1518F, 0.2284F, 0.1221F, 0.0438F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(95, 40).addBox(-0.33F, -1.2849F, -0.5889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(27, 95).addBox(-0.44F, -1.2849F, -0.5889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 91).addBox(-0.67F, -0.4853F, -0.6046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.59F, -1.4364F, -1.1518F, 0.0539F, 0.1221F, 0.0438F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(93, 62).addBox(-0.67F, -0.0224F, -0.188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.59F, -1.4364F, -1.1518F, -0.3214F, 0.1221F, 0.0438F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(12, 93).addBox(-0.67F, 0.3637F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.59F, -1.4364F, -1.1518F, 0.2022F, 0.1221F, 0.0438F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(7, 90).addBox(-0.5003F, -1.1106F, -0.3601F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8435F, -3.5163F, 0.7459F, 0.1049F, 0.0867F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(32, 96).addBox(-0.5003F, -0.1016F, -0.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -0.8435F, -3.5163F, 0.1089F, 0.1049F, 0.0867F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(47, 96).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(96, 24).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.1754F, -0.5411F, -2.5516F, 0.7197F, 0.1049F, 0.0867F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(88, 92).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2114F, -1.6973F, -3.1617F, 0.1612F, 0.1049F, 0.0867F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(96, 27).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(96, 21).addBox(-0.5F, -0.95F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0006F, -0.402F, -4.0909F, -0.1529F, 0.1049F, 0.0867F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(85, 86).addBox(-0.4949F, -0.5136F, -1.0767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6914F, -0.5421F, -5.4877F, -0.6439F, 0.0714F, 0.2003F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(93, 95).addBox(-0.4414F, 0.0898F, -0.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 85).addBox(-0.611F, 0.1898F, -1.1519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6914F, -0.5421F, -5.4877F, -0.3869F, 0.0076F, 0.2342F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(37, 83).addBox(-0.4949F, -1.1992F, -1.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6914F, -0.5421F, -5.4877F, -0.7486F, 0.0714F, 0.2003F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 44).addBox(-0.5F, -1.3628F, -1.0694F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -1.6954F, -3.732F, -1.345F, 0.0869F, 0.0876F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 12).addBox(-0.5F, -0.4072F, -1.0532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1F, -1.6954F, -3.732F, -1.3014F, 0.0869F, 0.0876F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(84, 78).addBox(-0.5F, 0.35F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -1.6954F, -3.732F, -1.0745F, 0.0869F, 0.0876F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(87, 33).addBox(-0.8183F, -1.1144F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(85, 48).addBox(-0.8183F, -0.7144F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1771F, -2.4127F, -2.5835F, -1.2781F, -0.2167F, -0.123F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(85, 82).addBox(-0.9957F, -0.6966F, -0.7584F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1771F, -2.4127F, -2.5835F, -1.237F, 0.3312F, 0.0352F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(84, 68).addBox(-0.9014F, -2.4037F, -1.1487F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1771F, -2.4127F, -2.5835F, -1.7307F, -0.1297F, -0.1295F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.4F, 1.3936F, -1.65F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-1.92F, 0.0364F, -0.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-1.92F, -0.7374F, -0.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0712F, -0.0692F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(-1.92F, 0.0626F, -0.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0712F, -0.0692F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.42F, -0.359F, 1.4655F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(12, 82).mirror().addBox(0.0996F, -0.1014F, -2.2804F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.0929F, -0.8416F, -1.3611F, -0.0808F, -0.0619F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(98, 56).mirror().addBox(0.6996F, 0.1826F, -2.8923F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.0929F, -0.8416F, 0.5936F, -0.0808F, -0.0619F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-0.2F, 0.2301F, -0.6166F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.7898F, -3.748F, 0.288F, -0.1222F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(96, 18).mirror().addBox(-2.0F, -1.0523F, 0.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4626F, 1.8508F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(-2.0F, -1.0523F, -0.0859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.0181F, 0.0339F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(23, 78).mirror().addBox(-2.0F, -0.7681F, -1.9954F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.9936F, 1.55F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-1.0F, -1.9955F, 0.1586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(90, 40).mirror().addBox(-1.0F, -1.9955F, -0.0414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.8426F, -5.2593F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-0.3F, -2.2267F, -0.6644F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.7898F, -3.748F, 0.3142F, -0.1222F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(0.0996F, -1.5411F, -2.2395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.0929F, -0.8416F, 0.4112F, -0.116F, 0.0183F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(93, 92).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.42F, -2.1056F, 0.2776F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(32, 93).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.42F, -1.4281F, 0.8076F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(43, 91).mirror().addBox(-0.33F, -0.8293F, 0.3171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.59F, -1.4364F, -1.1518F, 1.1185F, -0.1221F, -0.0438F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.33F, -1.3873F, -0.5612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.59F, -1.4364F, -1.1518F, 0.2284F, -0.1221F, -0.0438F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(95, 40).mirror().addBox(-0.67F, -1.2849F, -0.5889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 95).mirror().addBox(-0.56F, -1.2849F, -0.5889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 91).mirror().addBox(-0.33F, -0.4853F, -0.6046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.59F, -1.4364F, -1.1518F, 0.0539F, -0.1221F, -0.0438F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(93, 62).mirror().addBox(-0.33F, -0.0224F, -0.188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.59F, -1.4364F, -1.1518F, -0.3214F, -0.1221F, -0.0438F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(12, 93).mirror().addBox(-0.33F, 0.3637F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.59F, -1.4364F, -1.1518F, 0.2022F, -0.1221F, -0.0438F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(-0.4997F, -1.1106F, -0.3601F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.8435F, -3.5163F, 0.7459F, -0.1049F, -0.0867F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(32, 96).mirror().addBox(-0.4997F, -0.1016F, -0.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.8435F, -3.5163F, 0.1089F, -0.1049F, -0.0867F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(47, 96).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(96, 24).mirror().addBox(-0.5F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.1754F, -0.5411F, -2.5516F, 0.7197F, -0.1049F, -0.0867F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(88, 92).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2114F, -1.6973F, -3.1617F, 0.1612F, -0.1049F, -0.0867F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(96, 27).mirror().addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(96, 21).mirror().addBox(-0.5F, -0.95F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0006F, -0.402F, -4.0909F, -0.1529F, -0.1049F, -0.0867F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(-0.5051F, -0.5136F, -1.0767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6914F, -0.5421F, -5.4877F, -0.6439F, -0.0714F, -0.2003F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-0.5586F, 0.0898F, -0.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(51, 85).mirror().addBox(-0.389F, 0.1898F, -1.1519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6914F, -0.5421F, -5.4877F, -0.3869F, -0.0076F, -0.2342F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(37, 83).mirror().addBox(-0.5051F, -1.1992F, -1.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6914F, -0.5421F, -5.4877F, -0.7486F, -0.0714F, -0.2003F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-0.5F, -1.3628F, -1.0694F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.6954F, -3.732F, -1.345F, -0.0869F, -0.0876F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-0.5F, -0.4072F, -1.0532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.6954F, -3.732F, -1.3014F, -0.0869F, -0.0876F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(84, 78).mirror().addBox(-0.5F, 0.35F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.6954F, -3.732F, -1.0745F, -0.0869F, -0.0876F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(87, 33).mirror().addBox(-1.1817F, -1.1144F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(85, 48).mirror().addBox(-1.1817F, -0.7144F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1771F, -2.4127F, -2.5835F, -1.2781F, 0.2167F, 0.123F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-1.0043F, -0.6966F, -0.7584F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1771F, -2.4127F, -2.5835F, -1.237F, -0.3312F, -0.0352F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(84, 68).mirror().addBox(-1.0986F, -2.4037F, -1.1487F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1771F, -2.4127F, -2.5835F, -1.7307F, 0.1297F, 0.1295F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2553F, 0.6204F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(37, 94).mirror().addBox(-1.0F, -1.1135F, -1.0905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 94).mirror().addBox(-1.0F, -0.4181F, -1.6433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8F, -1.8F, 0.3403F, -0.0873F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-1.0F, -0.1F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(77, 63).addBox(0.8F, -0.1F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 0.0279F, 0.4443F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(17, 95).mirror().addBox(-1.13F, -1.1479F, -1.1616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8F, -1.8F, 0.9163F, -0.0873F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 15).mirror().addBox(-1.03F, -0.6279F, -2.0354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8F, -1.8F, 0.3229F, -0.0873F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(-1.0F, -0.4863F, -0.7153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(94, 32).mirror().addBox(-1.0F, -1.1839F, -2.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8F, -1.8F, 0.3927F, -0.0873F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(86, 64).mirror().addBox(-1.0F, -1.0206F, -1.8724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 64).addBox(0.8F, -1.0206F, -1.8724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.1F, 0.2F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-1.0F, -1.3712F, -3.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(6, 94).mirror().addBox(-1.0F, -1.3712F, -2.8637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8F, -1.8F, 0.4974F, -0.0873F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(85, 4).mirror().addBox(-1.0F, -0.0435F, -3.4494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.8F, -1.8F, 0.096F, -0.0873F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 65).addBox(0.6F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.5833F, -5.865F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 62).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 62).addBox(0.6F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.8322F, -7.852F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(-0.7F, -1.0874F, 0.6893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 59).addBox(0.7F, -1.0874F, 0.6893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -5.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(92, 87).mirror().addBox(-0.7F, -0.9476F, -1.8318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(92, 50).mirror().addBox(-1.1F, -0.9476F, -0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 87).addBox(-0.3F, -0.9476F, -1.8318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(92, 50).addBox(0.1F, -0.9476F, -0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -5.1F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-0.5F, -0.9219F, -3.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 44).mirror().addBox(-0.5F, -0.9219F, -2.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -5.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(37, 94).addBox(0.0F, -1.1135F, -1.0905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 94).addBox(0.0F, -0.4181F, -1.6433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, 1.8F, -1.8F, 0.3403F, 0.0873F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(17, 95).addBox(0.13F, -1.1479F, -1.1616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4F, 1.8F, -1.8F, 0.9163F, 0.0873F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(95, 15).addBox(0.03F, -0.6279F, -2.0354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.8F, -1.8F, 0.3229F, 0.0873F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(94, 35).addBox(0.0F, -0.4863F, -0.7153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(94, 32).addBox(0.0F, -1.1839F, -2.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 1.8F, -1.8F, 0.3927F, 0.0873F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(42, 94).addBox(0.0F, -1.3712F, -3.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(6, 94).addBox(0.0F, -1.3712F, -2.8637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 1.8F, -1.8F, 0.4974F, 0.0873F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(85, 4).addBox(0.0F, -0.0435F, -3.4494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 1.8F, -1.8F, 0.096F, 0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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