package fossils.fossils.client.blockentity.model.estemmenosuchusuralensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EstemmenosuchusuralensisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddlebase2;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public EstemmenosuchusuralensisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body2 = this.Bodymiddle.getChild("body2");
		this.body = this.body2.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.head = this.Neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftarm = this.Bodyfront.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.Bodyfront.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddlebase2 = this.Tailmiddlebase.getChild("Tailmiddlebase2");
		this.leftLeg = this.Hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg = this.Hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1401F, 19.0216F, -0.4117F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(101, 96).addBox(0.0F, -2.8666F, 0.0589F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -0.7127F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(36, 91).addBox(0.0F, -3.4005F, -0.0005F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -2.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, -3.3146F, -0.0095F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -4.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-2.2992F, -0.1F, 1.0826F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 17).mirror().addBox(-3.6992F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(49, 6).addBox(0.2992F, -0.1F, 1.0826F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(19, 17).addBox(-0.3008F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.1674F, 0.043F, 0.0073F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -2.0563F, -0.1382F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.2503F, -5.1641F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 103).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6452F, -3.4721F, 0.0876F, -0.0014F, -0.1211F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 78).mirror().addBox(-4.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6452F, -3.4721F, 0.0842F, 0.0151F, -0.6008F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 89).mirror().addBox(-5.9113F, -2.9566F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6452F, -3.4721F, 0.0736F, 0.0282F, -1.0807F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-6.7231F, -2.6042F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8452F, -5.4721F, 0.1316F, 0.1359F, -1.076F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(-4.5063F, -0.5932F, -0.4769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8452F, -5.4721F, 0.1853F, 0.084F, -0.5958F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-1.6103F, 0.1684F, -0.5167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8452F, -5.4721F, 0.2089F, 0.0134F, -0.1204F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-3.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.0456F, -0.043F, -0.871F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.0265F, -0.0351F, -0.3907F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 89).addBox(3.9113F, -2.9566F, -0.3511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6452F, -3.4721F, 0.0736F, -0.0282F, 1.0807F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 78).addBox(1.8362F, -0.819F, -0.4629F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6452F, -3.4721F, 0.0842F, -0.0151F, 0.6008F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(74, 103).addBox(1.0073F, 0.1203F, -0.5119F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6452F, -3.4721F, 0.0876F, 0.0014F, 0.1211F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(90, 21).addBox(-0.3897F, 0.1684F, -0.5167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8452F, -5.4721F, 0.2089F, -0.0134F, 0.1204F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(71, 45).addBox(1.5063F, -0.5932F, -0.4769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8452F, -5.4721F, 0.1853F, -0.084F, 0.5958F));

		PartDefinition cube_r15 = Bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 22).addBox(3.7231F, -2.6042F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8452F, -5.4721F, 0.1316F, -0.1359F, 1.076F));

		PartDefinition cube_r16 = Bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 91).addBox(0.0F, -3.5281F, 0.179F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4811F, -2.0115F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Bodymiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 10).addBox(0.0F, -3.1281F, -0.021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -3.7841F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Bodymiddle.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 91).addBox(0.0F, -3.2204F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8936F, -5.9841F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Bodymiddle.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(90, 8).addBox(1.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.0456F, 0.043F, 0.871F));

		PartDefinition cube_r21 = Bodymiddle.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 28).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.0265F, 0.0351F, 0.3907F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.1026F, -5.9083F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(31, 95).addBox(0.0F, -3.0957F, -0.0065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(83, 94).addBox(0.0F, -3.295F, -0.1089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 94).addBox(0.0F, -3.1325F, -0.119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 17).addBox(-2.494F, -1.7014F, -4.0287F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.006F, 10.0659F, 0.5155F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 78).mirror().addBox(-4.5063F, -0.5933F, -0.4769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3574F, -1.5638F, 0.2435F, 0.123F, -0.5898F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(-1.6103F, 0.1683F, -0.5167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3574F, -1.5638F, 0.2782F, 0.0217F, -0.1192F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-6.7231F, -2.6042F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3574F, -1.5638F, 0.1653F, 0.1972F, -1.0704F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(69, 103).mirror().addBox(-4.9634F, -6.3807F, -0.1722F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1574F, -3.5638F, 0.0255F, 0.2606F, -1.696F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 64).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1574F, -3.5638F, 0.1825F, 0.2278F, -1.0667F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-4.8362F, -0.819F, -0.4628F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1574F, -3.5638F, 0.2728F, 0.1424F, -0.5859F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 35).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1574F, -3.5638F, 0.3129F, 0.0258F, -0.1184F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 33).mirror().addBox(-5.9634F, -6.3807F, -0.1722F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0324F, -5.5638F, 0.0209F, 0.2952F, -1.6973F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(76, 73).mirror().addBox(-6.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0324F, -5.5638F, 0.2F, 0.2583F, -1.0625F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(75, 40).mirror().addBox(-4.8362F, -0.819F, -0.4628F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0324F, -5.5638F, 0.3023F, 0.1616F, -0.5815F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(89, 31).mirror().addBox(-2.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0324F, -5.5638F, 0.3475F, 0.0299F, -0.1174F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(89, 31).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0324F, -5.5638F, 0.3475F, -0.0299F, 0.1174F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(75, 40).addBox(1.8363F, -0.819F, -0.4628F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0324F, -5.5638F, 0.3023F, -0.1616F, 0.5815F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(76, 73).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0324F, -5.5638F, 0.2F, -0.2583F, 1.0625F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(89, 33).addBox(3.9634F, -6.3807F, -0.1722F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0324F, -5.5638F, 0.0209F, -0.2952F, 1.6973F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(7, 78).addBox(3.7231F, -2.6042F, -0.3718F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3574F, -1.5638F, 0.1653F, -0.1972F, 1.0704F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(89, 37).addBox(-0.3897F, 0.1683F, -0.5167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3574F, -1.5638F, 0.2782F, -0.0217F, 0.1192F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 78).addBox(1.5063F, -0.5933F, -0.4769F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3574F, -1.5638F, 0.2435F, -0.123F, 0.5898F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(89, 35).addBox(0.0073F, 0.1203F, -0.5119F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1574F, -3.5638F, 0.3129F, -0.0258F, 0.1184F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(38, 21).addBox(1.8362F, -0.819F, -0.4628F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1574F, -3.5638F, 0.2728F, -0.1424F, 0.5859F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 64).addBox(3.9113F, -2.9566F, -0.3511F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1574F, -3.5638F, 0.1825F, -0.2278F, 1.0667F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(69, 103).addBox(3.9634F, -6.3807F, -0.1722F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1574F, -3.5638F, 0.0255F, -0.2606F, 1.696F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(21, 9).addBox(-0.5F, -0.0911F, -5.9758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0015F, -5.9651F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1089F, -3.4986F, 0.0322F, 0.2086F, -1.6945F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1089F, -3.4986F, 0.1568F, 0.1819F, -1.072F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1089F, -3.4986F, 0.2289F, 0.1133F, -0.5915F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1089F, -3.4986F, 0.2609F, 0.0196F, -0.1195F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(16, 79).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2089F, -1.4986F, 0.1915F, 0.0113F, -0.1206F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2089F, -1.4986F, 0.1708F, 0.0742F, -0.597F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2089F, -1.4986F, 0.1232F, 0.1205F, -1.077F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(-5.8427F, -7.3717F, -0.1148F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2089F, -1.4986F, 0.0408F, 0.1393F, -1.693F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(76, 6).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1089F, -3.4986F, 0.0322F, -0.2086F, 1.6945F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(76, 4).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1089F, -3.4986F, 0.1568F, -0.1819F, 1.072F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(76, 2).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1089F, -3.4986F, 0.2289F, -0.1133F, 0.5915F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1089F, -3.4986F, 0.2609F, -0.0196F, 0.1195F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(16, 79).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2089F, -1.4986F, 0.1915F, -0.0113F, 0.1206F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(38, 6).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2089F, -1.4986F, 0.1708F, -0.0742F, 0.597F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 75).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2089F, -1.4986F, 0.1232F, -0.1205F, 1.077F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(87, 44).addBox(3.8427F, -7.3717F, -0.1148F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2089F, -1.4986F, 0.0408F, -0.1393F, 1.693F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(101, 59).addBox(0.0F, -2.955F, 0.0365F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.347F, -4.0088F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 99).addBox(0.0F, -2.855F, -0.0635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.9F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.7001F, -5.0499F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7948F, 0.6496F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5F, -0.0056F, -6.9631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2225F, -4.9012F, 0.0129F, 0.0436F, 0.0006F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 96).addBox(0.0F, -2.9734F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3732F, -0.957F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(48, 101).addBox(0.0F, -2.648F, 0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -3.107F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 100).addBox(0.0F, -2.6954F, 0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1018F, -5.082F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.2018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(42, 44).addBox(-1.0F, 0.074F, 0.2975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 11.4633F, -7.3312F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 36).addBox(-1.0F, 0.3651F, -2.6769F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 11.5365F, -7.5234F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(62, 43).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 12.6348F, -7.31F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.3207F, 0.1648F, -0.7092F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.3653F, 0.0247F, -0.2477F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.2152F, 0.2696F, -1.1893F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-5.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.0263F, 0.313F, -1.8264F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.0255F, 0.2434F, -1.8262F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.1722F, 0.2139F, -1.1992F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.2573F, 0.1346F, -0.7182F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.2957F, 0.0259F, -0.249F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.0308F, 0.1821F, -1.7297F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.1401F, 0.1611F, -1.1098F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(76, 8).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.2045F, 0.1025F, -0.6291F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.2344F, 0.021F, -0.1551F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(76, 49).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.3207F, -0.1648F, 0.7092F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(88, 51).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.3653F, -0.0247F, 0.2477F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(76, 47).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.2152F, -0.2696F, 1.1893F));

		PartDefinition cube_r91 = Bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(10, 88).addBox(3.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.0263F, -0.313F, 1.8264F));

		PartDefinition cube_r92 = Bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(28, 76).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.0255F, -0.2434F, 1.8262F));

		PartDefinition cube_r93 = Bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(76, 16).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.1722F, -0.2139F, 1.1992F));

		PartDefinition cube_r94 = Bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 14).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.2573F, -0.1346F, 0.7182F));

		PartDefinition cube_r95 = Bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(76, 12).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.2957F, -0.0259F, 0.249F));

		PartDefinition cube_r96 = Bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(76, 10).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.0308F, -0.1821F, 1.7297F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(7, 80).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.1401F, -0.1611F, 1.1098F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(76, 8).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.2045F, -0.1025F, 0.6291F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(7, 76).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.2344F, -0.021F, 0.1551F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, -0.4905F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5512F, -5.8931F, 0.0369F, 0.0436F, 0.0016F));

		PartDefinition cube_r100 = Neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-5.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3305F, -0.4416F, 0.0309F, 0.2961F, -1.8251F));

		PartDefinition cube_r101 = Neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 78).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3305F, -0.4416F, 0.2085F, 0.2534F, -1.1911F));

		PartDefinition cube_r102 = Neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(53, 78).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3305F, -0.4416F, 0.3073F, 0.1534F, -0.7113F));

		PartDefinition cube_r103 = Neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3305F, -0.4416F, 0.3483F, 0.0204F, -0.248F));

		PartDefinition cube_r104 = Neck.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0191F, -2.4443F, 0.745F, 0.1163F, -0.4905F));

		PartDefinition cube_r105 = Neck.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 67).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0191F, -2.4443F, 0.6398F, 0.407F, -0.8878F));

		PartDefinition cube_r106 = Neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(80, 75).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0191F, -2.4443F, 0.745F, -0.1163F, 0.4905F));

		PartDefinition cube_r107 = Neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(76, 67).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0191F, -2.4443F, 0.6398F, -0.407F, 0.8878F));

		PartDefinition cube_r108 = Neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(25, 94).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4253F, -2.8983F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(20, 100).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4253F, -0.8983F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 90).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3305F, -0.4416F, 0.3483F, -0.0204F, 0.248F));

		PartDefinition cube_r111 = Neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 78).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3305F, -0.4416F, 0.3073F, -0.1534F, 0.7113F));

		PartDefinition cube_r112 = Neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(62, 78).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3305F, -0.4416F, 0.2085F, -0.2534F, 1.1911F));

		PartDefinition cube_r113 = Neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(90, 6).addBox(3.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3305F, -0.4416F, 0.0309F, -0.2961F, 1.8251F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(57, 38).addBox(-0.5F, -0.5915F, -3.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, -0.1604F, 0.0892F, 0.0121F));

		PartDefinition cube_r114 = Neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(95, 45).addBox(0.0F, -3.0F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4915F, -1.9078F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -1.6081F, 0.3052F, 0.8795F, -1.0816F));

		PartDefinition cube_r116 = Neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 82).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -1.6081F, 0.7304F, 0.6557F, -0.4824F));

		PartDefinition cube_r117 = Neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(88, 53).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -1.6081F, 0.3052F, -0.8795F, 1.0816F));

		PartDefinition cube_r118 = Neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(101, 82).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -1.6081F, 0.7304F, -0.6557F, 0.4824F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(38, 55).addBox(-0.5F, -0.989F, -3.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.409F, -2.9847F, 0.0072F, 0.0666F, 0.1592F));

		PartDefinition cube_r119 = Neck3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 103).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9735F, -1.054F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Neck3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(101, 91).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6582F, -3.0516F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Neck3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(103, 54).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4051F, -0.5682F, 1.0318F, 0.7052F, -0.4903F));

		PartDefinition cube_r122 = Neck3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(89, 27).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4051F, -0.5682F, 0.6045F, 1.0489F, -1.0327F));

		PartDefinition cube_r123 = Neck3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(62, 47).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4051F, -2.5682F, 0.2572F, 0.9213F, -1.2561F));

		PartDefinition cube_r124 = Neck3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(60, 53).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4051F, -2.5682F, 0.7303F, 0.707F, -0.6194F));

		PartDefinition cube_r125 = Neck3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(103, 54).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4051F, -0.5682F, 1.0318F, -0.7052F, 0.4903F));

		PartDefinition cube_r126 = Neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 27).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4051F, -0.5682F, 0.6045F, -1.0489F, 1.0327F));

		PartDefinition cube_r127 = Neck3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(62, 47).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4051F, -2.5682F, 0.2572F, -0.9213F, 1.2561F));

		PartDefinition cube_r128 = Neck3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 53).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4051F, -2.5682F, 0.7303F, -0.707F, 0.6194F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(47, 55).addBox(-0.5F, 0.011F, -3.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.1062F, 0.0549F, 0.1238F));

		PartDefinition cube_r129 = Neck4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(41, 67).addBox(0.0F, -1.3F, -0.6F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.011F, -2.0025F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Neck4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(41, 65).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5949F, -2.0682F, 0.4222F, 0.9008F, -1.0422F));

		PartDefinition cube_r131 = Neck4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(41, 65).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5949F, -2.0682F, 0.4222F, -0.9008F, 1.0422F));

		PartDefinition head = Neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4257F, -2.712F, 0.2619F, 0.1349F, 0.1715F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(89, 91).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.494F, 0.5182F, -9.3539F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(95, 78).addBox(-1.0F, -0.0017F, -1.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.494F, 0.147F, -8.4105F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(76, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -0.653F, -7.1855F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(33, 44).addBox(0.5F, -3.1F, -2.4F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.5F, 1.1028F, -3.2879F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 8).addBox(-1.0F, -0.4F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.8781F, -6.6473F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(75, 36).addBox(0.0F, -0.225F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, -1.1571F, -5.3148F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(9, 58).addBox(-1.0F, -1.05F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.3011F, -2.1693F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(91, 59).addBox(-1.0F, -0.0903F, -0.123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.4399F, -6.5429F, -0.4756F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(92, 3).addBox(-1.0F, -0.0903F, -0.898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.505F, -1.5209F, -5.7723F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(85, 85).addBox(-1.0F, -0.2653F, -0.848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.505F, -1.5819F, -5.0749F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(94, 42).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0F, -1.4278F, -6.549F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(55, 74).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.3975F, -5.3356F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.2504F, -2.902F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0F, -2.3099F, 0.2287F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(60, 49).addBox(-1.313F, -0.5713F, 0.958F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F))
				.texOffs(49, 86).addBox(-0.313F, -0.7111F, 0.8809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.203F, -3.1236F, -0.8588F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 65).addBox(-1.3F, -0.146F, 0.2585F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(65, 57).addBox(-1.3F, -0.146F, -0.1415F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.203F, -3.1236F, -0.8588F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(11, 45).addBox(0.5F, -1.1504F, 0.123F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, -2.7315F, -1.8883F, -0.9425F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.001F, -0.063F, 0.0302F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(72, 81).addBox(-1.7843F, -3.2249F, -3.1562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 0.466F, 0.1211F, 0.0664F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(38, 60).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7393F, -1.1893F, -5.8097F, 0.3534F, -0.2084F, -0.0731F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(79, 81).addBox(-0.85F, -0.175F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.677F, -1.1437F, -5.7223F, 0.4321F, 0.3263F, 0.1439F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 55).addBox(-0.7262F, -0.0547F, -0.7202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(95, 13).addBox(-0.7258F, -0.3445F, -0.7243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9475F, 2.5599F, -8.7395F, -0.1022F, 0.0693F, -0.0367F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(25, 80).addBox(-5.0641F, -3.063F, 2.2218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -0.3703F, 1.0874F, -0.4115F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(95, 75).addBox(-1.1878F, -3.7613F, 5.3419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -0.3069F, 0.3707F, -0.153F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(75, 28).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0377F, -1.1685F, -4.2588F, 0.3269F, 0.1681F, 0.0471F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(95, 72).addBox(0.7394F, 0.0537F, -4.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, -0.3F, 0.5384F, -0.3375F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(97, 19).addBox(-2.4032F, -5.3825F, 4.3497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -0.6044F, 0.3424F, -0.1724F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 66).addBox(-0.4584F, -5.3825F, 4.6247F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -0.5672F, 0.0873F, 0.0F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(101, 34).addBox(-1.317F, -7.2224F, 2.5287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -1.0292F, 0.1978F, -0.1798F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 33).addBox(-0.4584F, -7.2225F, 2.5746F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -1.0036F, 0.0873F, 0.0F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(59, 30).addBox(-0.4584F, -7.8658F, -1.6793F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -1.6581F, 0.0873F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(66, 34).addBox(-1.9F, -0.9F, -1.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6638F, -0.389F, -0.4651F, -0.6768F, -0.9914F, -1.2152F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 68).addBox(-1.9F, -0.9F, -1.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7086F, -1.0018F, 0.0472F, -2.6499F, -0.7578F, 0.9819F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(27, 61).addBox(-0.4584F, -6.0144F, -5.1927F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -2.2689F, 0.0873F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(83, 21).addBox(-0.9834F, -3.935F, 5.2906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.6961F, -1.0775F, -6.4148F, -0.3054F, 0.0873F, 0.0F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(68, 24).addBox(-0.3828F, -0.5363F, -2.4465F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6183F, -0.359F, -1.8001F, 2.5035F, 0.6385F, 3.0028F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(30, 86).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.58F, -2.0458F, -0.8568F, 0.016F, 0.3697F, -0.243F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(85, 6).addBox(-0.7541F, -0.7138F, -0.2721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7656F, -2.6923F, -1.9402F, 0.2689F, -0.3319F, -0.0853F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(57, 68).addBox(-0.3623F, -1.895F, 0.0267F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4807F, -2.2535F, -3.3532F, -0.9225F, 0.2798F, 0.1786F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(80, 85).addBox(-0.6358F, -1.4354F, 0.0267F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4807F, -2.2535F, -3.3532F, -0.9477F, 0.1039F, 0.0468F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 86).addBox(-0.2549F, -0.4155F, -0.5946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(85, 77).addBox(-1.0549F, -0.6155F, -0.5946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7656F, -2.6923F, -1.9402F, -0.5264F, -0.6428F, 0.2804F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(77, 100).addBox(-0.1579F, -1.124F, -0.4181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.054F)), PartPose.offsetAndRotation(0.7656F, -2.6923F, -1.9402F, 0.5141F, -0.3971F, -0.9816F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(55, 91).addBox(-0.2913F, -1.1209F, -0.7025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7656F, -2.6923F, -1.7402F, -0.424F, 0.0082F, 0.8617F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(91, 23).addBox(-0.7398F, -1.375F, -0.7025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7656F, -2.6923F, -1.7402F, -0.3921F, 0.1658F, 1.2232F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(49, 98).addBox(-0.4646F, -0.5F, -0.4484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3023F, 0.234F, -7.7617F, 0.42F, -0.2524F, -0.5333F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(98, 53).addBox(-0.5492F, -0.5F, -0.5386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3023F, 0.234F, -7.7617F, 0.4748F, -0.5283F, -0.6757F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(98, 45).addBox(-0.5867F, -0.5F, -0.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3623F, 1.437F, -8.6041F, -0.0484F, -0.568F, -0.0972F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(15, 98).addBox(-0.4364F, -0.5F, -0.4133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3623F, 1.437F, -8.6041F, -0.0422F, -0.2629F, -0.1123F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(95, 69).addBox(-0.4171F, -0.14F, -4.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, -0.2122F, 0.2692F, -0.1804F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(54, 98).addBox(-0.6537F, -0.8963F, -3.4236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, -0.0003F, 0.2011F, -0.1608F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(100, 12).addBox(-0.5F, -0.725F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 100).addBox(-0.5F, -0.725F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 9).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0613F, 1.9318F, -5.8896F, 0.5808F, 0.0989F, -0.1157F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(99, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 99).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.756F, 2.0258F, -7.0464F, 0.1202F, 0.2585F, -0.0071F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(102, 37).addBox(-0.5582F, -1.0225F, -2.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 0.046F, 0.2346F, -0.1633F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(56, 101).addBox(-0.2412F, -0.1128F, 0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 101).addBox(-0.8412F, -0.1128F, 0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6183F, -0.359F, -1.8001F, -0.4308F, 0.7134F, -1.3985F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(44, 81).addBox(-0.2412F, -1.294F, -0.7517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(81, 55).addBox(-0.8412F, -1.294F, -0.7517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6183F, -0.359F, -1.8001F, 2.929F, 0.7134F, -1.3985F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(101, 22).addBox(-0.9F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5834F, -0.0189F, -3.2008F, -2.8568F, 0.7134F, -1.3985F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(15, 101).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4538F, 0.726F, -2.5464F, -2.8742F, 0.7134F, -1.3985F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(103, 44).addBox(-1.0654F, -0.9929F, -0.1903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.7182F, -0.659F, -2.5001F, 2.3973F, 0.7067F, -1.0829F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(38, 103).addBox(0.0269F, -0.9874F, -0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.4138F, 0.6319F, -1.4441F, 2.0936F, 0.6637F, -1.5878F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0654F, -0.6035F, -0.8111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7182F, -0.659F, -2.5001F, 1.6555F, 0.7067F, -1.0829F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 101).addBox(0.0269F, -0.5293F, -0.884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.4138F, 0.6319F, -1.4441F, 1.3518F, 0.6637F, -1.5878F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(85, 100).addBox(-1.0654F, -0.0993F, -0.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.7182F, -0.659F, -2.5001F, 0.6083F, 0.7067F, -1.0829F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(101, 25).addBox(0.0269F, 0.0009F, -0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.4138F, 0.6319F, -1.4441F, 0.3046F, 0.6637F, -1.5878F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(101, 56).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5953F, -1.4633F, -1.7071F, -1.6525F, 0.7134F, -1.3985F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(101, 28).addBox(-0.2412F, -0.7159F, 0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(65, 81).addBox(-0.8412F, -0.7159F, -0.6255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6183F, -0.359F, -1.8001F, -0.8235F, 0.7134F, -1.3985F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(58, 80).addBox(-0.5982F, -0.6493F, -2.0522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6183F, -0.359F, -1.8001F, -1.7046F, 0.7381F, -1.1F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5071F, -0.0826F, -2.2406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6183F, -0.359F, -1.8001F, -1.2614F, 0.6315F, -1.112F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(85, 103).addBox(-0.9467F, 1.6072F, -0.0069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6961F, -1.1776F, -5.9148F, 0.3033F, 0.213F, -0.1173F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 100).addBox(-1.9074F, -4.9132F, -1.4097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 1.2828F, 0.0524F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 97).addBox(-0.2722F, -2.6697F, 0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 1.6087F, 0.2731F, -0.4067F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(97, 6).addBox(-0.2722F, -2.124F, 2.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 1.9577F, 0.2731F, -0.4067F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(102, 18).addBox(-1.075F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2653F, 0.355F, -8.4245F, 0.3551F, 0.2956F, -0.4033F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(100, 70).addBox(0.0575F, -2.3032F, -3.4055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 0.1486F, 0.3637F, -0.4389F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(23, 102).addBox(0.0575F, -3.3197F, -2.9364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 0.4104F, 0.3637F, -0.4389F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(29, 55).addBox(-1.8256F, 0.0002F, -0.2743F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.6961F, -1.1776F, -5.9148F, 0.1629F, 0.542F, -0.5844F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(54, 95).addBox(-0.4939F, -0.2701F, -0.4436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F))
				.texOffs(35, 100).addBox(-0.4939F, -0.5701F, -0.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(30, 100).addBox(-0.4939F, -0.5701F, -0.4436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.328F)), PartPose.offsetAndRotation(0.1274F, 0.7696F, -8.8047F, -0.8877F, 0.386F, -0.4582F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(95, 50).addBox(-0.4939F, -0.3643F, -0.6141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.337F)), PartPose.offsetAndRotation(0.1274F, 0.7696F, -8.8047F, -0.4077F, 0.386F, -0.4582F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(100, 15).addBox(-0.4939F, -0.6865F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F)), PartPose.offsetAndRotation(0.1274F, 0.7696F, -8.8047F, -0.1023F, 0.386F, -0.4582F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(101, 31).addBox(0.1465F, -0.2534F, -0.3579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(90, 100).addBox(-0.0036F, -0.2534F, -0.3579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, -0.0533F, 0.6178F, -0.2851F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(39, 94).addBox(-0.3286F, -0.1279F, -0.6152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, 0.4703F, 0.6178F, -0.2851F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(7, 90).addBox(-1.1756F, 0.2886F, 2.654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6961F, -1.1776F, -5.9148F, 0.243F, 0.3093F, -0.6385F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(50, 27).addBox(-0.3764F, -3.1977F, -1.3529F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 0.3286F, 0.2095F, -0.4168F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(85, 14).addBox(-1.0807F, -0.9283F, -0.4927F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 38).addBox(-1.0807F, -0.9283F, -2.0927F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, 0.5226F, 0.52F, -0.0678F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(83, 18).addBox(-1.1845F, -1.5924F, -0.33F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, -2.4624F, 0.7585F, -0.3946F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 83).addBox(-1.1703F, -1.4867F, -0.2678F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, -1.8722F, 0.8091F, -0.2896F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(83, 69).addBox(-1.2138F, -1.351F, -0.1481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, -1.198F, 0.8685F, -0.1336F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(82, 37).addBox(-1.1456F, -1.1847F, -0.2072F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, -0.6732F, 0.7793F, -0.0607F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(82, 34).addBox(-1.1127F, -1.0247F, -0.2741F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9654F, -1.5933F, -2.3533F, -0.0889F, 0.6881F, -0.0237F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(88, 55).addBox(4.1763F, 0.018F, -1.9153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, -1.6009F, 1.3716F, -1.608F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(21, 87).addBox(-0.5F, -1.1F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1456F, 2.1132F, -9.3351F, -0.5151F, 0.7451F, -0.5896F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(75, 32).addBox(-0.5999F, -1.7136F, -1.3471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1991F, 1.8444F, -4.7194F, 0.5167F, 0.1968F, -0.2445F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(54, 87).addBox(-0.475F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.4037F, 1.6329F, -8.385F, -0.5369F, 0.0017F, -0.3115F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(49, 95).addBox(-0.4626F, -0.3891F, -0.6125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.598F, 2.3245F, -8.6903F, -0.303F, 0.0355F, -0.2089F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(59, 87).addBox(-0.443F, -1.2348F, -0.4169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.598F, 2.3245F, -8.6903F, -0.7128F, 0.0956F, -0.3263F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(64, 73).addBox(-0.65F, -2.0F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5377F, -1.2261F, -2.4207F, -0.968F, 0.3233F, -0.2772F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(85, 46).addBox(-1.225F, -0.9F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5131F, -2.7383F, -1.6248F, -0.9146F, 0.1685F, -0.0592F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.001F, 0.063F, -0.0302F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(72, 81).mirror().addBox(0.7843F, -3.2249F, -3.1562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 0.466F, -0.1211F, -0.0664F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(38, 60).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7393F, -1.1893F, -5.8097F, 0.3534F, 0.2084F, 0.0731F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-0.15F, -0.175F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.677F, -1.1437F, -5.7223F, 0.4321F, -0.3263F, -0.1439F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(93, 55).mirror().addBox(-0.2738F, -0.0547F, -0.7202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(95, 13).mirror().addBox(-0.2742F, -0.3445F, -0.7243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9475F, 2.5599F, -8.7395F, -0.1022F, -0.0693F, 0.0367F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(4.0641F, -3.063F, 2.2218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -0.3703F, -1.0874F, 0.4115F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(0.1877F, -3.7613F, 5.3419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -0.3069F, -0.3707F, 0.153F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(75, 28).mirror().addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.0377F, -1.1685F, -4.2588F, 0.3269F, -0.1681F, -0.0471F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(95, 72).mirror().addBox(-1.7394F, 0.0537F, -4.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, -0.3F, -0.5384F, 0.3375F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(1.4032F, -5.3825F, 4.3497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -0.6044F, -0.3424F, 0.1724F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(85, 66).mirror().addBox(-1.5416F, -5.3825F, 4.6247F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -0.5672F, -0.0873F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(101, 34).mirror().addBox(0.317F, -7.2224F, 2.5287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -1.0292F, -0.1978F, 0.1798F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-1.5416F, -7.2225F, 2.5746F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -1.0036F, -0.0873F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(59, 30).mirror().addBox(-1.5416F, -7.8658F, -1.6793F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -1.6581F, -0.0873F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(66, 34).mirror().addBox(-0.1F, -0.9F, -1.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6638F, -0.389F, -0.4651F, -0.6768F, 0.9914F, 1.2152F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(48, 68).mirror().addBox(-0.1F, -0.9F, -1.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7086F, -1.0018F, 0.0472F, -2.6499F, 0.7578F, -0.9819F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(27, 61).mirror().addBox(-1.5416F, -6.0144F, -5.1927F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -2.2689F, -0.0873F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-1.0166F, -3.935F, 5.2906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.0775F, -6.4148F, -0.3054F, -0.0873F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-1.6172F, -0.5363F, -2.4465F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6183F, -0.359F, -1.8001F, 2.5035F, -0.6385F, -3.0028F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.58F, -2.0458F, -0.8568F, 0.016F, -0.3697F, 0.243F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-0.2459F, -0.7138F, -0.2721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7656F, -2.6923F, -1.9402F, 0.2689F, 0.3319F, 0.0853F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(-0.6377F, -1.895F, 0.0267F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4807F, -2.2535F, -3.3532F, -0.9225F, -0.2798F, -0.1786F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-0.3642F, -1.4354F, 0.0267F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4807F, -2.2535F, -3.3532F, -0.9477F, -0.1039F, -0.0468F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.7451F, -0.4155F, -0.5946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(85, 77).mirror().addBox(0.0549F, -0.6155F, -0.5946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7656F, -2.6923F, -1.9402F, -0.5264F, 0.6428F, -0.2804F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(77, 100).mirror().addBox(-0.8421F, -1.124F, -0.4181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.054F)).mirror(false), PartPose.offsetAndRotation(-0.7656F, -2.6923F, -1.9402F, 0.5141F, 0.3971F, 0.9816F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-0.7087F, -1.1209F, -0.7025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7656F, -2.6923F, -1.7402F, -0.424F, -0.0082F, -0.8617F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-0.2602F, -1.375F, -0.7025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7656F, -2.6923F, -1.7402F, -0.3921F, -0.1658F, -1.2232F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(49, 98).mirror().addBox(-0.5354F, -0.5F, -0.4484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3023F, 0.234F, -7.7617F, 0.42F, 0.2524F, 0.5333F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-0.4508F, -0.5F, -0.5386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3023F, 0.234F, -7.7617F, 0.4748F, 0.5283F, 0.6757F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(98, 45).mirror().addBox(-0.4133F, -0.5F, -0.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3623F, 1.437F, -8.6041F, -0.0484F, 0.568F, 0.0972F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(-0.5636F, -0.5F, -0.4133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3623F, 1.437F, -8.6041F, -0.0422F, 0.2629F, 0.1123F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-0.5829F, -0.14F, -4.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, -0.2122F, -0.2692F, 0.1804F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(54, 98).mirror().addBox(-0.3463F, -0.8963F, -3.4236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, -0.0003F, -0.2011F, 0.1608F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-0.5F, -0.725F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 100).mirror().addBox(-0.5F, -0.725F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 9).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0613F, 1.9318F, -5.8896F, 0.5808F, -0.0989F, 0.1157F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(99, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 99).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.756F, 2.0258F, -7.0464F, 0.1202F, -0.2585F, 0.0071F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(102, 37).mirror().addBox(-0.4418F, -1.0225F, -2.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 0.046F, -0.2346F, 0.1633F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(56, 101).mirror().addBox(-0.7588F, -0.1128F, 0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 101).mirror().addBox(-0.1588F, -0.1128F, 0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6183F, -0.359F, -1.8001F, -0.4308F, -0.7134F, 1.3985F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(44, 81).mirror().addBox(-0.7588F, -1.294F, -0.7517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(81, 55).mirror().addBox(-0.1588F, -1.294F, -0.7517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6183F, -0.359F, -1.8001F, 2.929F, -0.7134F, 1.3985F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(101, 22).mirror().addBox(-0.1F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5834F, -0.0189F, -3.2008F, -2.8568F, -0.7134F, 1.3985F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(15, 101).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4538F, 0.726F, -2.5464F, -2.8742F, -0.7134F, 1.3985F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(103, 44).mirror().addBox(0.0654F, -0.9929F, -0.1903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.7182F, -0.659F, -2.5001F, 2.3973F, -0.7067F, 1.0829F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(38, 103).mirror().addBox(-1.0269F, -0.9874F, -0.2942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.4138F, 0.6319F, -1.4441F, 2.0936F, -0.6637F, 1.5878F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(0.0654F, -0.6035F, -0.8111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7182F, -0.659F, -2.5001F, 1.6555F, -0.7067F, 1.0829F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-1.0269F, -0.5293F, -0.884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4138F, 0.6319F, -1.4441F, 1.3518F, -0.6637F, 1.5878F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 100).mirror().addBox(0.0654F, -0.0993F, -0.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.7182F, -0.659F, -2.5001F, 0.6083F, -0.7067F, 1.0829F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-1.0269F, 0.0009F, -0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.4138F, 0.6319F, -1.4441F, 0.3046F, -0.6637F, 1.5878F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5953F, -1.4633F, -1.7071F, -1.6525F, -0.7134F, 1.3985F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(101, 28).mirror().addBox(-0.7588F, -0.7159F, 0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(65, 81).mirror().addBox(-0.1588F, -0.7159F, -0.6255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6183F, -0.359F, -1.8001F, -0.8235F, -0.7134F, 1.3985F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(-0.4018F, -0.6493F, -2.0522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6183F, -0.359F, -1.8001F, -1.7046F, -0.7381F, 1.1F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.4929F, -0.0826F, -2.2406F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6183F, -0.359F, -1.8001F, -1.2614F, -0.6315F, 1.112F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(85, 103).mirror().addBox(-0.0533F, 1.6072F, -0.0069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.1776F, -5.9148F, 0.3033F, -0.213F, 0.1173F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(0.9074F, -4.9132F, -1.4097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 1.2828F, -0.0524F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.7278F, -2.6697F, 0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 1.6087F, -0.2731F, 0.4067F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(-0.7278F, -2.124F, 2.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 1.9577F, -0.2731F, 0.4067F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(102, 18).mirror().addBox(0.075F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2653F, 0.355F, -8.4245F, 0.3551F, -0.2956F, 0.4033F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-1.0575F, -2.3032F, -3.4055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 0.1486F, -0.3637F, 0.4389F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(23, 102).mirror().addBox(-1.0575F, -3.3197F, -2.9364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 0.4104F, -0.3637F, 0.4389F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(0.8256F, 0.0002F, -0.2743F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.1776F, -5.9148F, 0.1629F, -0.542F, 0.5844F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(-0.5061F, -0.2701F, -0.4436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F)).mirror(false)
				.texOffs(35, 100).mirror().addBox(-0.5061F, -0.5701F, -0.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(30, 100).mirror().addBox(-0.5061F, -0.5701F, -0.4436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.328F)).mirror(false), PartPose.offsetAndRotation(-0.1274F, 0.7696F, -8.8047F, -0.8877F, -0.386F, 0.4582F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(95, 50).mirror().addBox(-0.5061F, -0.3643F, -0.6141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.337F)).mirror(false), PartPose.offsetAndRotation(-0.1274F, 0.7696F, -8.8047F, -0.4077F, -0.386F, 0.4582F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(100, 15).mirror().addBox(-0.5061F, -0.6865F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F)).mirror(false), PartPose.offsetAndRotation(-0.1274F, 0.7696F, -8.8047F, -0.1023F, -0.386F, 0.4582F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(101, 31).mirror().addBox(-1.1464F, -0.2534F, -0.3579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(90, 100).mirror().addBox(-0.9964F, -0.2534F, -0.3579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, -0.0533F, -0.6178F, 0.2851F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(39, 94).mirror().addBox(-0.6714F, -0.1279F, -0.6152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, 0.4703F, -0.6178F, 0.2851F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(0.1756F, 0.2886F, 2.654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6961F, -1.1776F, -5.9148F, 0.243F, -0.3093F, 0.6385F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-0.6236F, -3.1977F, -1.3529F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 0.3286F, -0.2095F, 0.4168F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(-0.9193F, -0.9283F, -0.4927F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 38).mirror().addBox(-0.9193F, -0.9283F, -2.0927F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, 0.5226F, -0.52F, 0.0678F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-0.8155F, -1.5924F, -0.33F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, -2.4624F, -0.7585F, 0.3946F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.8297F, -1.4867F, -0.2678F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, -1.8722F, -0.8091F, 0.2896F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(83, 69).mirror().addBox(-0.7862F, -1.351F, -0.1481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, -1.198F, -0.8685F, 0.1336F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-0.8544F, -1.1847F, -0.2072F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, -0.6732F, -0.7793F, 0.0607F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(-0.8873F, -1.0247F, -0.2741F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9654F, -1.5933F, -2.3533F, -0.0889F, -0.6881F, 0.0237F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-5.1763F, 0.018F, -1.9153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, -1.6009F, -1.3716F, 1.608F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(21, 87).mirror().addBox(-0.5F, -1.1F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1456F, 2.1132F, -9.3351F, -0.5151F, -0.7451F, 0.5896F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(75, 32).mirror().addBox(-0.4001F, -1.7136F, -1.3471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1991F, 1.8444F, -4.7194F, 0.5167F, -0.1968F, 0.2445F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-0.525F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.4037F, 1.6329F, -8.385F, -0.5369F, -0.0017F, 0.3115F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(49, 95).mirror().addBox(-0.5374F, -0.3891F, -0.6125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.598F, 2.3245F, -8.6903F, -0.303F, -0.0355F, 0.2089F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(59, 87).mirror().addBox(-0.557F, -1.2348F, -0.4169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.598F, 2.3245F, -8.6903F, -0.7128F, -0.0956F, 0.3263F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(64, 73).mirror().addBox(-0.35F, -2.0F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5377F, -1.2261F, -2.4207F, -0.968F, -0.3233F, 0.2772F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(0.225F, -0.9F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5131F, -2.7383F, -1.6248F, -0.9146F, -0.1685F, 0.0592F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2582F, -0.2094F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(26, 90).mirror().addBox(-0.4633F, -1.3341F, -0.401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0405F, -3.724F, -7.0324F, -0.0302F, 0.4265F, 2.6166F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(-0.4037F, 0.0427F, -0.5664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(100, 76).mirror().addBox(-0.4037F, -0.2324F, -0.5664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0405F, -3.724F, -7.0324F, 0.4611F, 0.3126F, 2.8491F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(90, 17).mirror().addBox(-0.4633F, -1.5537F, -0.5142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.0405F, -3.724F, -7.0324F, 0.2316F, 0.4265F, 2.6166F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0922F, 0.1072F, -0.9931F, -0.868F, -0.0615F, 0.0039F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.55F, -0.925F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2516F, -3.6574F, -8.3632F, 0.8269F, -1.1617F, -1.0687F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(12, 90).mirror().addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8641F, -3.473F, -8.1381F, 0.1742F, -1.0476F, -0.493F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(16, 76).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4784F, -3.1746F, -6.6487F, -0.4378F, -0.2597F, 0.0069F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(28, 103).mirror().addBox(0.4747F, -1.8207F, -1.7963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(103, 51).mirror().addBox(0.4747F, -2.0207F, -1.7963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -1.8224F, -6.6699F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-0.325F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(44, 97).mirror().addBox(-0.325F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2147F, -3.0193F, -7.9469F, -2.9818F, 1.2783F, -3.0497F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(98, 101).mirror().addBox(-0.2093F, -1.0795F, -1.649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -1.8224F, -6.6699F, -0.3385F, -0.1898F, 0.0498F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(-0.0898F, -0.4845F, -0.9155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -2.7224F, -7.0699F, -0.4278F, 0.124F, -0.1078F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(72, 100).mirror().addBox(-0.0794F, -0.3324F, -0.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -2.7224F, -7.0699F, -0.3394F, 0.1327F, -0.067F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(39, 97).mirror().addBox(-0.2076F, -1.1878F, -0.8663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -1.8224F, -6.6699F, -0.3725F, -0.184F, 0.0355F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(97, 38).mirror().addBox(-0.4678F, 0.6557F, 0.2337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(95, 85).mirror().addBox(-0.4678F, 0.6557F, -0.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.388F, -0.0615F, 0.0039F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-0.5258F, 0.645F, -1.8158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.6079F, -0.1203F, -0.0531F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(34, 97).mirror().addBox(-0.4101F, -0.7679F, -2.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.2976F, -0.0085F, -0.0089F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(-0.3839F, -1.0197F, -4.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(96, 26).mirror().addBox(-0.3839F, -1.0197F, -3.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.1146F, -0.013F, -0.0134F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(-0.4583F, -1.1434F, -1.2274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -1.4224F, -5.3699F, -0.337F, -0.1852F, 0.029F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(96, 35).mirror().addBox(-0.4991F, -1.1627F, -0.4048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -1.4224F, -5.3699F, -0.2353F, -0.1884F, 0.0769F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-0.5013F, -0.9943F, -1.7091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9747F, -1.4224F, -5.3699F, -0.3323F, -0.1832F, 0.0843F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(96, 32).mirror().addBox(-0.7905F, -0.5203F, 1.0338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7567F, -2.1934F, -6.1938F, -0.3397F, 0.0352F, -0.0351F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-0.2227F, 0.2228F, -3.399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.3396F, 0.0311F, -0.0316F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(84, 91).mirror().addBox(-0.4048F, -1.5911F, -1.7422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(101, 79).mirror().addBox(-0.4299F, -1.6156F, -1.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6747F, -1.4224F, -5.3699F, -0.3941F, -0.1794F, -0.037F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(86, 94).mirror().addBox(-1.1024F, -1.2401F, -4.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8306F, -1.0701F, -0.8207F, -0.1747F, -0.1755F, -0.0526F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(-0.5F, -0.45F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(102, 3).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8134F, -2.5249F, -4.2778F, -0.1222F, 0.0187F, -0.0416F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(96, 23).mirror().addBox(-0.412F, -1.3925F, -2.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, 0.0067F, -0.0277F, -0.0338F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-0.3864F, 0.604F, -2.7145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.4725F, -0.0148F, -0.0154F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(-0.4423F, 0.0805F, -1.4485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1305F, -1.0701F, -0.8207F, -0.9191F, -0.0262F, 0.0151F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(98, 101).addBox(-0.7907F, -1.0795F, -1.649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9747F, -1.8224F, -6.6699F, -0.3385F, 0.1898F, -0.0498F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(100, 84).addBox(-0.675F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(44, 97).addBox(-0.675F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2147F, -3.0193F, -7.9469F, -2.9818F, -1.2783F, 3.0497F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(90, 17).addBox(-0.5367F, -1.5537F, -0.5142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.0405F, -3.724F, -7.0324F, 0.2316F, -0.4265F, -2.6166F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(100, 76).addBox(-0.5963F, -0.2324F, -0.5664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 94).addBox(-0.5963F, 0.0427F, -0.5664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.0405F, -3.724F, -7.0324F, 0.4611F, -0.3126F, -2.8491F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(26, 90).addBox(-0.5367F, -1.3341F, -0.401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0405F, -3.724F, -7.0324F, -0.0302F, -0.4265F, -2.6166F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(91, 63).addBox(-0.9102F, -0.4845F, -0.9155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9747F, -2.7224F, -7.0699F, -0.4278F, -0.124F, 0.1078F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(39, 97).addBox(-0.7924F, -1.1878F, -0.8663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9747F, -1.8224F, -6.6699F, -0.3725F, 0.184F, -0.0355F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(96, 58).addBox(-0.5417F, -1.1434F, -1.2274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9747F, -1.4224F, -5.3699F, -0.337F, 0.1852F, -0.029F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(96, 35).addBox(-0.5009F, -1.1627F, -0.4048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9747F, -1.4224F, -5.3699F, -0.2353F, 0.1884F, -0.0769F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(72, 100).addBox(-0.9206F, -0.3324F, -0.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9747F, -2.7224F, -7.0699F, -0.3394F, -0.1327F, 0.067F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(77, 60).addBox(-0.4987F, -0.9943F, -1.7091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9747F, -1.4224F, -5.3699F, -0.3323F, 0.1832F, -0.0843F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(96, 32).addBox(-0.2095F, -0.5203F, 1.0338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7567F, -2.1934F, -6.1938F, -0.3397F, -0.0352F, 0.0351F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(96, 29).addBox(-0.7773F, 0.2228F, -3.399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.3396F, -0.0311F, 0.0316F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(5, 86).addBox(-0.45F, -0.925F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2516F, -3.6574F, -8.3632F, 0.8269F, 1.1617F, 1.0687F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(12, 90).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8641F, -3.473F, -8.1381F, 0.1742F, 1.0476F, 0.493F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(16, 76).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4784F, -3.1746F, -6.6487F, -0.4378F, 0.2597F, -0.0069F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(84, 91).addBox(-0.5952F, -1.5911F, -1.7422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(101, 79).addBox(-0.5702F, -1.6156F, -1.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6747F, -1.4224F, -5.3699F, -0.3941F, 0.1794F, 0.037F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(86, 94).addBox(0.1024F, -1.2401F, -4.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8306F, -1.0701F, -0.8207F, -0.1747F, 0.1755F, 0.0526F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(102, 6).addBox(-0.5F, -0.45F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(102, 3).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8134F, -2.5249F, -4.2778F, -0.1222F, -0.0187F, 0.0416F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(20, 97).addBox(-0.6161F, -1.0197F, -4.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(96, 26).addBox(-0.6161F, -1.0197F, -3.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.1146F, 0.013F, 0.0134F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(34, 97).addBox(-0.5899F, -0.7679F, -2.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.2976F, 0.0085F, 0.0089F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(96, 23).addBox(-0.588F, -1.3925F, -2.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, 0.0067F, 0.0277F, 0.0338F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(46, 77).addBox(-0.6136F, 0.604F, -2.7145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.4725F, 0.0148F, 0.0154F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(77, 24).addBox(-0.5577F, 0.0805F, -1.4485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.9191F, 0.0262F, -0.0151F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(97, 38).addBox(-0.5322F, 0.6557F, 0.2337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(95, 85).addBox(-0.5322F, 0.6557F, -0.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.388F, 0.0615F, -0.0039F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(62, 97).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0922F, 0.1072F, -0.9931F, -0.868F, 0.0615F, -0.0039F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(78, 77).addBox(-0.4742F, 0.645F, -1.8158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1305F, -1.0701F, -0.8207F, -0.6079F, 0.1203F, 0.0531F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9311F, 9.3999F, -4.4684F, -0.0897F, 0.1478F, -0.4752F));

		PartDefinition cube_r359 = leftarm.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5F, -0.125F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0154F, 0.9335F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r360 = leftarm.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(20, 49).addBox(0.0F, 1.1933F, -0.2871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.3672F, -0.7969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r361 = leftarm.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0125F, 0.139F, -1.4061F, -2.3039F, 0.0014F, -0.001F));

		PartDefinition cube_r362 = leftarm.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(69, 14).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0011F, 4.2995F, -0.9886F, -0.8728F, 0.0011F, -0.0013F));

		PartDefinition cube_r363 = leftarm.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(18, 65).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0063F, 2.4823F, -0.1888F, 0.0435F, 0.0011F, -0.0013F));

		PartDefinition cube_r364 = leftarm.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(5, 94).addBox(-0.3F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.0085F, 2.059F, -0.2576F, 0.5531F, 0.3245F, -0.4758F));

		PartDefinition cube_r365 = leftarm.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(16, 81).addBox(-1.5F, -1.9F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0095F, 1.622F, -0.6944F, 1.0689F, 0.0014F, -0.001F));

		PartDefinition cube_r366 = leftarm.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(82, 28).addBox(-1.5016F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.515F, -0.0655F, 0.0014F, -0.001F));

		PartDefinition cube_r367 = leftarm.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(11, 52).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-0.008F, -0.8145F, 1.626F, -2.7926F, 0.0014F, -0.001F));

		PartDefinition cube_r368 = leftarm.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0095F, -0.6934F, 0.4661F, -2.0072F, 0.0014F, -0.001F));

		PartDefinition cube_r369 = leftarm.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(71, 77).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0111F, -0.4352F, -0.7661F, -1.4836F, 0.0014F, -0.001F));

		PartDefinition cube_r370 = leftarm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(63, 94).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(44, 94).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.4176F, -1.4206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r371 = leftarm.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(69, 47).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.4974F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6385F, 6.1518F, 1.1934F, -0.4879F, 0.1552F, 0.4931F));

		PartDefinition cube_r372 = leftarm2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(8, 103).addBox(0.8599F, 0.8203F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1472F, 2.0259F, 0.0332F, 1.5708F, 0.925F, -1.5708F));

		PartDefinition cube_r373 = leftarm2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(96, 81).addBox(-0.6484F, -2.0963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(96, 61).addBox(-0.6484F, -1.2963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1472F, 2.0259F, 0.0332F, 1.5708F, -0.8901F, -1.5708F));

		PartDefinition cube_r374 = leftarm2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(32, 80).addBox(-1.0132F, 0.1386F, -0.4708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1472F, 0.216F, 0.386F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r375 = leftarm2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(44, 85).addBox(-0.5576F, 0.129F, -0.4877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.9923F, 2.1718F, -0.6577F, 1.5926F, -1.5359F, -1.6013F));

		PartDefinition cube_r376 = leftarm2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(35, 87).addBox(-0.6771F, -1.5085F, -0.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9923F, 2.1718F, -0.6577F, 1.5733F, -1.2566F, -1.5818F));

		PartDefinition cube_r377 = leftarm2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(15, 95).addBox(-0.9946F, -1.5167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(94, 89).addBox(-0.9946F, -1.0167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.9923F, 2.1718F, -0.6577F, -1.5725F, -1.0996F, 1.5636F));

		PartDefinition cube_r378 = leftarm2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(40, 90).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1732F, 3.5052F, 0.4023F, 1.5683F, -1.4314F, -1.5729F));

		PartDefinition cube_r379 = leftarm2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(71, 68).addBox(-0.6F, -2.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1764F, 2.8371F, 0.0367F, 1.5672F, -1.475F, -1.5718F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4192F, 5.5545F, -0.3853F, -0.0185F, -0.0218F, -0.0237F));

		PartDefinition cube_r380 = leftArm3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(85, 11).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 1.0503F, -0.1473F, 0.6894F, -0.0002F, 0.0001F));

		PartDefinition cube_r381 = leftArm4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(9, 67).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r382 = leftArm5.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(29, 51).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9311F, 9.3999F, -4.4684F, 0.7393F, -0.1478F, 0.4752F));

		PartDefinition cube_r383 = rightarm.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(32, 71).addBox(-0.5F, -0.125F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0154F, 0.9335F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r384 = rightarm.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(42, 49).addBox(-1.0F, 1.1933F, -0.2871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.3672F, -0.7969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r385 = rightarm.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(69, 5).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0125F, 0.139F, -1.4061F, -2.3039F, -0.0014F, 0.001F));

		PartDefinition cube_r386 = rightarm.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0011F, 4.2995F, -0.9886F, -0.8728F, -0.0011F, 0.0013F));

		PartDefinition cube_r387 = rightarm.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0063F, 2.4823F, -0.1888F, 0.0435F, -0.0011F, 0.0013F));

		PartDefinition cube_r388 = rightarm.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(10, 94).addBox(-0.7F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.0085F, 2.059F, -0.2576F, 0.5531F, -0.3245F, 0.4758F));

		PartDefinition cube_r389 = rightarm.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(81, 51).addBox(-0.5F, -1.9F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0095F, 1.622F, -0.6944F, 1.0689F, -0.0014F, 0.001F));

		PartDefinition cube_r390 = rightarm.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(82, 31).addBox(-0.4984F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.515F, -0.0655F, -0.0014F, 0.001F));

		PartDefinition cube_r391 = rightarm.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(20, 55).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.008F, -0.8145F, 1.626F, -2.7926F, -0.0014F, 0.001F));

		PartDefinition cube_r392 = rightarm.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(51, 49).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0095F, -0.6934F, 0.4661F, -2.0072F, -0.0014F, 0.001F));

		PartDefinition cube_r393 = rightarm.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0111F, -0.4352F, -0.7661F, -1.4836F, -0.0014F, 0.001F));

		PartDefinition cube_r394 = rightarm.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(73, 94).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(68, 94).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.4176F, -1.4206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r395 = rightarm.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.4974F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6385F, 6.1518F, 1.1934F, -0.4006F, -0.1552F, -0.4931F));

		PartDefinition cube_r396 = rightarm2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(33, 103).addBox(-1.8599F, 0.8203F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1472F, 2.0259F, 0.0332F, 1.5708F, -0.925F, 1.5708F));

		PartDefinition cube_r397 = rightarm2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(67, 97).addBox(-0.3516F, -2.0963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(97, 64).addBox(-0.3516F, -1.2963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1472F, 2.0259F, 0.0332F, 1.5708F, 0.8901F, 1.5708F));

		PartDefinition cube_r398 = rightarm2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(53, 80).addBox(0.0132F, 0.1386F, -0.4708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1472F, 0.216F, 0.386F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r399 = rightarm2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(65, 85).addBox(-0.4424F, 0.129F, -0.4877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.9923F, 2.1718F, -0.6577F, 1.5926F, 1.5359F, 1.6013F));

		PartDefinition cube_r400 = rightarm2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(87, 40).addBox(-0.3229F, -1.5085F, -0.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9923F, 2.1718F, -0.6577F, 1.5733F, 1.2566F, 1.5818F));

		PartDefinition cube_r401 = rightarm2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(95, 16).addBox(-0.0054F, -1.5167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(0, 95).addBox(-0.0054F, -1.0167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.9923F, 2.1718F, -0.6577F, -1.5725F, 1.0996F, -1.5636F));

		PartDefinition cube_r402 = rightarm2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(64, 90).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1732F, 3.5052F, 0.4023F, 1.5683F, 1.4314F, 1.5729F));

		PartDefinition cube_r403 = rightarm2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(72, 60).addBox(-0.4F, -2.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1764F, 2.8371F, 0.0367F, 1.5672F, 1.475F, 1.5718F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4192F, 5.5545F, -0.3853F, -0.0185F, 0.0218F, 0.0237F));

		PartDefinition cube_r404 = rightArm3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(14, 85).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 1.0503F, -0.1473F, -0.096F, 0.0002F, -0.0001F));

		PartDefinition cube_r405 = rightArm4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(67, 10).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r406 = rightArm5.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5419F, 3.4055F, -7.3295F, -0.4367F, 0.0869F, -0.0076F));

		PartDefinition cube_r407 = bone.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(56, 55).addBox(-0.489F, -1.0068F, 0.192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.8607F, 0.0526F, -0.2714F));

		PartDefinition cube_r408 = bone.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(75, 85).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5504F, -5.0992F, -0.2219F, 2.1225F, 0.0526F, -0.2714F));

		PartDefinition cube_r409 = bone.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(60, 15).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8337F, -4.2926F, 1.0991F, 1.4578F, 0.0642F, -0.2689F));

		PartDefinition cube_r410 = bone.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(47, 21).addBox(2.9842F, -1.9757F, 0.0395F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4F, 4.05F, 2.1F, 1.4912F, 0.0758F, -0.266F));

		PartDefinition cube_r411 = bone.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(0, 30).addBox(-0.489F, -1.2781F, -3.6336F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.6687F, 0.0526F, -0.2714F));

		PartDefinition cube_r412 = bone.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(22, 43).addBox(-0.489F, -0.7873F, -0.6632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.5465F, 0.0526F, -0.2714F));

		PartDefinition cube_r413 = bone.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.925F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.1778F, 0.5111F, 0.9913F, 1.9305F, 0.0526F, -0.2714F));

		PartDefinition cube_r414 = bone.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(49, 10).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.6746F, 2.355F, 1.0164F, 2.1457F, 0.0758F, -0.266F));

		PartDefinition cube_r415 = bone.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(59, 25).addBox(-0.5F, -1.3F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(58, 10).addBox(-0.5F, -0.6F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7569F, 2.2427F, 2.4509F, 2.8439F, 0.0758F, -0.266F));

		PartDefinition cube_r416 = bone.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(49, 16).addBox(-2.923F, -1.0486F, -0.0182F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.1677F, 2.9F, -0.2231F, -0.3912F, -0.3507F, -0.6157F));

		PartDefinition cube_r417 = bone.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(85, 3).addBox(-1.5686F, -0.4868F, 0.041F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3833F, 5.617F, 2.6833F, -0.1805F, -0.0067F, -0.4726F));

		PartDefinition cube_r418 = bone.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 48).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0511F, 6.348F, 2.952F, -0.2732F, -0.6925F, -0.1464F));

		PartDefinition cube_r419 = bone.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(22, 38).addBox(-2.6351F, -0.585F, -2.2564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6277F, 5.4122F, 2.1429F, -0.2409F, 0.0283F, -0.4867F));

		PartDefinition cube_r420 = bone.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 24).addBox(0.4796F, -0.4546F, -2.5064F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6277F, 5.4122F, 2.1429F, -0.1925F, -0.0667F, -0.7308F));

		PartDefinition cube_r421 = bone.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(56, 20).addBox(0.1712F, -0.4855F, -1.9067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3833F, 5.617F, 2.6833F, -0.1987F, 0.1984F, -0.5492F));

		PartDefinition cube_r422 = bone.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(18, 61).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1621F, 4.6392F, -0.5706F, -0.4717F, -0.0876F, -0.4272F));

		PartDefinition cube_r423 = bone.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(74, 19).addBox(-0.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2082F, 3.4796F, -1.3211F, -0.1717F, -0.4698F, -1.3912F));

		PartDefinition cube_r424 = bone.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(71, 42).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.6916F, 3.56F, -1.43F, -0.3021F, -0.0505F, -0.5686F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5419F, 3.4055F, -7.3295F, -0.4367F, -0.0869F, 0.0076F));

		PartDefinition cube_r425 = bone4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(56, 55).mirror().addBox(-0.511F, -1.0068F, 0.192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.8607F, -0.0526F, 0.2714F));

		PartDefinition cube_r426 = bone4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5504F, -5.0992F, -0.2219F, 2.1225F, -0.0526F, 0.2714F));

		PartDefinition cube_r427 = bone4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8337F, -4.2926F, 1.0991F, 1.4578F, -0.0642F, 0.2689F));

		PartDefinition cube_r428 = bone4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-3.9842F, -1.9757F, 0.0395F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.4F, 4.05F, 2.1F, 1.4912F, -0.0758F, 0.266F));

		PartDefinition cube_r429 = bone4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.511F, -1.2781F, -3.6336F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.6687F, -0.0526F, 0.2714F));

		PartDefinition cube_r430 = bone4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(22, 43).mirror().addBox(-0.511F, -0.7873F, -0.6632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.5465F, -0.0526F, 0.2714F));

		PartDefinition cube_r431 = bone4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, -0.925F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.1778F, 0.5111F, 0.9913F, 1.9305F, -0.0526F, 0.2714F));

		PartDefinition cube_r432 = bone4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(49, 10).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.6746F, 2.355F, 1.0164F, 2.1457F, -0.0758F, 0.266F));

		PartDefinition cube_r433 = bone4.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-0.5F, -1.3F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(58, 10).mirror().addBox(-0.5F, -0.6F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7569F, 2.2427F, 2.4509F, 2.8439F, -0.0758F, 0.266F));

		PartDefinition cube_r434 = bone4.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(49, 16).mirror().addBox(-0.077F, -1.0486F, -0.0182F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.1677F, 2.9F, -0.2231F, -0.3912F, 0.3507F, 0.6157F));

		PartDefinition cube_r435 = bone4.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-0.4314F, -0.4868F, 0.041F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3833F, 5.617F, 2.6833F, -0.1805F, 0.0067F, 0.4726F));

		PartDefinition cube_r436 = bone4.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(100, 48).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0511F, 6.348F, 2.952F, -0.2732F, 0.6925F, 0.1464F));

		PartDefinition cube_r437 = bone4.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(-0.3649F, -0.585F, -2.2564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.6277F, 5.4122F, 2.1429F, -0.2409F, -0.0283F, 0.4867F));

		PartDefinition cube_r438 = bone4.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-3.4796F, -0.4546F, -2.5064F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.6277F, 5.4122F, 2.1429F, -0.1925F, 0.0667F, 0.7308F));

		PartDefinition cube_r439 = bone4.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-1.1712F, -0.4855F, -1.9067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3833F, 5.617F, 2.6833F, -0.1987F, -0.1984F, 0.5492F));

		PartDefinition cube_r440 = bone4.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1621F, 4.6392F, -0.5706F, -0.4717F, 0.0876F, 0.4272F));

		PartDefinition cube_r441 = bone4.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-2.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2082F, 3.4796F, -1.3211F, -0.1717F, 0.4698F, 1.3912F));

		PartDefinition cube_r442 = bone4.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(71, 42).mirror().addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.6916F, 3.56F, -1.43F, -0.3021F, 0.0505F, 0.5686F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(39, 30).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.2009F, 0.2281F, -0.0346F, -0.0872F, 0.003F));

		PartDefinition cube_r443 = Tailbase.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(61, 103).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1805F, 2.9792F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Tailbase.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(95, 101).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3548F, 0.9868F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(35, 38).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1525F, 3.9001F, -0.1959F, -0.2141F, 0.0422F));

		PartDefinition cube_r445 = Tailmiddlebase.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(21, 71).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5932F, 2.9622F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Tailmiddlebase.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(47, 27).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5932F, 0.9622F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Tailmiddlebase.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(46, 40).mirror().addBox(-1.3F, 0.0F, 1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0932F, -0.0378F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r448 = Tailmiddlebase.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(46, 40).addBox(-0.7F, 0.0F, 1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0932F, -0.0378F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tailmiddlebase2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase2", CubeListBuilder.create().texOffs(34, 23).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0377F, 3.8633F, -0.1529F, -0.2589F, 0.0394F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9933F, 1.9952F, -0.5011F, 0.3189F, 0.0154F, -0.0804F));

		PartDefinition cube_r449 = leftLeg.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(37, 84).addBox(-1.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r450 = leftLeg.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(37, 80).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r451 = leftLeg.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(84, 24).addBox(-1.5F, -0.0114F, -0.3769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r452 = leftLeg.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(23, 84).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r453 = leftLeg.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(70, 85).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r454 = leftLeg.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(62, 100).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r455 = leftLeg.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(90, 46).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r456 = leftLeg.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(45, 90).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r457 = leftLeg.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(65, 20).addBox(-1.0037F, -0.4141F, -2.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r458 = leftLeg.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(74, 90).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r459 = leftLeg.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(90, 73).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r460 = leftLeg.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(31, 91).addBox(-0.5F, -1.0884F, -2.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1851F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1962F, 5.6055F, -2.697F, 1.003F, 0.0356F, 0.0797F));

		PartDefinition cube_r461 = leftLeg2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.308F, 1.6586F, -0.5046F, 1.0909F, -0.0049F, -0.0015F));

		PartDefinition cube_r462 = leftLeg2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(91, 94).addBox(-0.5385F, -0.2148F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, 1.2218F, -0.0049F, -0.0015F));

		PartDefinition cube_r463 = leftLeg2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(54, 60).addBox(-1.0378F, -1.4234F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r464 = leftLeg2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(97, 3).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.7051F, 3.2689F, -1.0183F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r465 = leftLeg2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(92, 39).addBox(-0.5884F, -0.5661F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(97, 0).addBox(-0.5884F, -0.5661F, -0.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.7935F, 3.7581F, -0.8386F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r466 = leftLeg2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(96, 95).addBox(-0.5F, -0.65F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7051F, 3.9438F, -0.7516F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r467 = leftLeg2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7051F, 1.5564F, 1.7851F, 0.7853F, 0.0048F, 0.0017F));

		PartDefinition cube_r468 = leftLeg2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5542F, -0.2007F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(96, 98).addBox(-0.5542F, 0.5993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(96, 92).addBox(-0.5542F, -0.2007F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7593F, 2.8027F, 0.1078F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r469 = leftLeg2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(90, 77).addBox(-0.5542F, -0.8846F, -0.5844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.7593F, 2.8027F, 0.1078F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r470 = leftLeg2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(86, 62).addBox(-0.5378F, 0.0296F, -0.1692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r471 = leftLeg3.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(25, 65).addBox(-1.5884F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, 0.1416F, -0.008F, 0.0104F));

		PartDefinition cube_r472 = leftArm7.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(9, 63).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r473 = leftArm6.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(63, 60).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9933F, 1.9952F, -0.5011F, 0.8425F, -0.0154F, 0.0804F));

		PartDefinition cube_r474 = rightLeg.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r475 = rightLeg.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(80, 42).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r476 = rightLeg.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(84, 59).addBox(-0.5F, -0.0114F, -0.3769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r477 = rightLeg.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(58, 84).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r478 = rightLeg.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(85, 72).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r479 = rightLeg.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(100, 73).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r480 = rightLeg.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(90, 69).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r481 = rightLeg.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r482 = rightLeg.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(65, 53).addBox(-0.9963F, -0.4141F, -2.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r483 = rightLeg.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(90, 85).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightLeg.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(79, 90).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightLeg.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(50, 91).addBox(-0.5F, -1.0884F, -2.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1851F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1962F, 5.6055F, -2.697F, 1.003F, -0.0356F, -0.0797F));

		PartDefinition cube_r486 = rightLeg2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.308F, 1.6586F, -0.5046F, 1.0909F, 0.0049F, 0.0015F));

		PartDefinition cube_r487 = rightLeg2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(95, 10).addBox(-0.4615F, -0.2148F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, 1.2218F, 0.0049F, 0.0015F));

		PartDefinition cube_r488 = rightLeg2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(0, 61).addBox(-0.9622F, -1.4234F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r489 = rightLeg2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(91, 97).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.7051F, 3.2689F, -1.0183F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r490 = rightLeg2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(92, 66).addBox(-0.4116F, -0.5661F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(86, 97).addBox(-0.4116F, -0.5661F, -0.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.7935F, 3.7581F, -0.8386F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r491 = rightLeg2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(77, 97).addBox(-0.5F, -0.65F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7051F, 3.9438F, -0.7516F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r492 = rightLeg2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(60, 5).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7051F, 1.5564F, 1.7851F, 0.7853F, -0.0048F, -0.0017F));

		PartDefinition cube_r493 = rightLeg2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(92, 0).addBox(-0.4458F, -0.2007F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 41).addBox(-0.4458F, 0.5993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(72, 97).addBox(-0.4458F, -0.2007F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7593F, 2.8027F, 0.1078F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r494 = rightLeg2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(17, 91).addBox(-0.4458F, -0.8846F, -0.5844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.7593F, 2.8027F, 0.1078F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r495 = rightLeg2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(86, 81).addBox(-0.4622F, 0.0296F, -0.1692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r496 = rightLeg3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(66, 30).addBox(-1.4116F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, -0.0766F, 0.008F, -0.0104F));

		PartDefinition cube_r497 = rightArm7.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(54, 64).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4674F, -1.2429F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r498 = rightArm6.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(63, 64).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.4162F, 1.0735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7704F, 0.5397F, -1.9147F, -0.2299F, -0.2613F, 0.0896F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(102, 64).addBox(-0.5F, -0.0407F, -0.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5849F, -3.657F, -1.0079F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(91, 81).addBox(-0.5F, 0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5849F, -3.8072F, 1.2579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(21, 74).addBox(-0.5F, -0.825F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5849F, -2.7867F, 0.1586F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(74, 52).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5849F, -1.1161F, -2.2413F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(74, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5849F, -1.9335F, -2.9774F, 0.733F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(100, 67).addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(67, 100).addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(7, 82).addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5849F, -3.4192F, -2.0048F, 1.8151F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -2.0F, -2.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3847F, 2.5324F, 3.0127F, 0.2409F, -0.0784F, 0.4378F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(39, 73).addBox(-0.5F, -0.7F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8078F, 0.9498F, 4.9027F, 0.8954F, -0.0784F, 0.4378F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(38, 14).addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.4771F, 3.1895F, 0.5327F, 0.8082F, -0.0784F, 0.4378F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.625F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6483F, 1.5198F, 0.0355F, 0.2846F, -0.0784F, 0.4378F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(11, 38).addBox(-0.6249F, 0.5247F, -1.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.7209F, -0.0784F, 0.4378F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(64, 68).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9026F, 0.3613F, -1.4801F, 0.3343F, -0.2003F, 0.5534F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(0, 69).addBox(-0.4F, -1.175F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.296F, -0.4285F, -0.3826F, -0.0827F, -0.0659F, 0.0881F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(47, 60).addBox(-0.6286F, 2.3595F, -1.8384F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 1.5499F, -0.0784F, 0.4378F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(0, 46).addBox(-1.1F, -0.0628F, -1.1447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1849F, -1.7179F, -0.2526F, 0.4974F, 0.0F, 0.1222F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(53, 44).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5849F, -1.7442F, -0.5453F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7704F, 0.5397F, -1.9147F, -0.2299F, 0.2613F, -0.0896F));

		PartDefinition Hips_r25 = bone3.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(102, 64).mirror().addBox(-0.5F, -0.0407F, -0.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.657F, -1.0079F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = bone3.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(91, 81).mirror().addBox(-0.5F, 0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.8072F, 1.2579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r27 = bone3.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(21, 74).mirror().addBox(-0.5F, -0.825F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.7867F, 0.1586F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone3.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.1161F, -2.2413F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone3.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(74, 56).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.9335F, -2.9774F, 0.733F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone3.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(100, 67).mirror().addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r31 = bone3.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(67, 100).mirror().addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r32 = bone3.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4192F, -2.0048F, 1.8151F, 0.0F, 0.0F));

		PartDefinition Hips_r33 = bone3.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.5F, -2.0F, -2.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.3847F, 2.5324F, 3.0127F, 0.2409F, 0.0784F, -0.4378F));

		PartDefinition Hips_r34 = bone3.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(39, 73).mirror().addBox(-0.5F, -0.7F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.8078F, 0.9498F, 4.9027F, 0.8954F, 0.0784F, -0.4378F));

		PartDefinition Hips_r35 = bone3.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(38, 14).mirror().addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.4771F, 3.1895F, 0.5327F, 0.8082F, 0.0784F, -0.4378F));

		PartDefinition Hips_r36 = bone3.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-0.5F, -0.625F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6483F, 1.5198F, 0.0355F, 0.2846F, 0.0784F, -0.4378F));

		PartDefinition Hips_r37 = bone3.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-0.3751F, 0.5247F, -1.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.7209F, 0.0784F, -0.4378F));

		PartDefinition Hips_r38 = bone3.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9026F, 0.3613F, -1.4801F, 0.3343F, 0.2003F, -0.5534F));

		PartDefinition Hips_r39 = bone3.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.6F, -1.175F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.296F, -0.4285F, -0.3826F, -0.0827F, 0.0659F, -0.0881F));

		PartDefinition Hips_r40 = bone3.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(47, 60).mirror().addBox(-0.3714F, 2.3595F, -1.8384F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 1.5499F, 0.0784F, -0.4378F));

		PartDefinition Hips_r41 = bone3.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(0.1F, -0.0628F, -1.1447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7179F, -0.2526F, 0.4974F, 0.0F, -0.1222F));

		PartDefinition Hips_r42 = bone3.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.7442F, -0.5453F, 0.4974F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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