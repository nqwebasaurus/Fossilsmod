package fossils.fossils.client.blockentity.model.megacerops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegaceropsFossilModel extends SkullModelBase {
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
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
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
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public MegaceropsFossilModel(ModelPart root) {
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
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.3977F, 14.9477F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 59).addBox(0.0F, -1.1125F, 0.0115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(120, 16).addBox(0.0F, -1.1882F, 0.1327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -0.7F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(119, 63).addBox(0.0F, -1.5986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -2.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 97).mirror().addBox(-0.5F, -1.1718F, -3.0147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.736F, 0.8276F, -1.1698F, 0.1331F, -0.266F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 89).mirror().addBox(-1.2F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.7223F, 2.7236F, -0.8871F, 0.4727F, 0.1405F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(-1.5F, -0.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7162F, 6.1933F, 3.3147F, -0.2626F, -0.4687F, 1.0474F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(95, 51).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4144F, 6.6151F, 1.4164F, -2.1522F, -0.7974F, 3.0373F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 20).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2275F, 5.5527F, 0.5255F, -0.6271F, -0.8381F, 0.8423F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(117, 57).mirror().addBox(-0.7F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.412F, -2.7085F, 0.0092F, -2.5354F, 0.9575F, 2.2369F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 97).mirror().addBox(-0.3F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0494F, -2.6616F, 0.4523F, -2.7858F, 0.3446F, 1.8461F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9546F, -0.4047F, -0.3139F, -2.7025F, 0.2255F, 2.1395F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 33).mirror().addBox(-1.5F, -0.5F, 0.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8308F, -0.9284F, -0.2916F, -2.0481F, 0.2255F, 2.1395F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 64).mirror().addBox(-0.5F, -0.8F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3216F, 5.8121F, 0.4077F, -1.4861F, -1.1659F, 1.8268F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(94, 44).mirror().addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4441F, 4.0297F, -1.6417F, -0.9066F, -0.1561F, -0.6363F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-2.883F, -0.4786F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.4446F, 4.586F, 1.7349F, -0.3227F, -0.6881F, 0.8571F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(79, 36).mirror().addBox(-2.7639F, -0.5F, -1.435F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5556F, 8.7208F, 3.8944F, 0.2693F, 0.2197F, -1.9153F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-2.8032F, -0.5F, -0.7783F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5556F, 8.7208F, 3.8944F, 0.2628F, 0.026F, -1.9684F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-2.7372F, -0.5F, -0.2646F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5556F, 8.7208F, 3.8944F, 0.2678F, -0.1931F, -2.0279F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-0.0722F, -0.5F, -0.2121F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5556F, 8.7208F, 3.8944F, 0.3575F, -0.7347F, -2.2207F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(113, 31).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6518F, 6.1719F, 2.1809F, -0.1478F, -0.5134F, 0.8051F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(111, 78).mirror().addBox(-0.4455F, -0.5254F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.4446F, 4.586F, 1.7349F, -1.0061F, -1.1659F, 1.8268F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-1.0F, -0.5F, 0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6311F, 7.1529F, 4.6738F, 0.2658F, -0.151F, -2.1908F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(67, 114).mirror().addBox(2.6058F, -2.2477F, 3.7786F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9018F, 1.7129F, 1.1757F, 1.5034F, -1.3075F, 2.6323F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 12).mirror().addBox(-1.7F, -0.5F, -0.2F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5058F, -2.165F, -1.3617F, -2.0938F, 0.0353F, 1.7924F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-2.3269F, -0.9289F, -0.5257F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6155F, -1.9967F, -1.9476F, -1.9434F, -0.3776F, 0.975F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-3.0F, -0.3F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.5927F, 1.8036F, -0.7177F, -0.6841F, 0.133F, -0.9986F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(-2.4F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1085F, 3.0599F, -1.9686F, -1.0121F, -0.4096F, -0.2651F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-1.9F, -0.5F, -2.3F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.3088F, 1.0356F, -2.7089F, -1.5964F, -0.5236F, 0.2117F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(96, 26).mirror().addBox(0.1803F, 1.0134F, -0.9197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5018F, -1.0117F, -1.2324F, -2.6552F, -0.5979F, 1.6015F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(96, 26).addBox(-1.1803F, 1.0134F, -0.9197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5018F, -1.0117F, -1.2324F, -2.6552F, 0.5979F, -1.6015F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(52, 31).addBox(-2.1F, -0.5F, -2.3F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.3088F, 1.0356F, -2.7089F, -1.5964F, 0.5236F, -0.2117F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(94, 44).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4441F, 4.0297F, -1.6417F, -0.9066F, 0.1561F, 0.6363F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 58).addBox(-1.6F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.1085F, 3.0599F, -1.9686F, -1.0121F, 0.4096F, 0.2651F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(47, 37).addBox(-3.0F, -0.3F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.5927F, 1.8036F, -0.7177F, -0.6841F, -0.133F, 0.9986F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 52).addBox(0.3269F, -0.9289F, -0.5257F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.6155F, -1.9967F, -1.9476F, -1.9434F, 0.3776F, -0.975F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(117, 57).addBox(-0.3F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.412F, -2.7085F, 0.0092F, -2.5354F, -0.9575F, -2.2369F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(14, 97).addBox(-0.7F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0494F, -2.6616F, 0.4523F, -2.7858F, -0.3446F, -1.8461F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 12).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9546F, -0.4047F, -0.3139F, -2.7025F, -0.2255F, -2.1395F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(17, 33).addBox(-2.5F, -0.5F, 0.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8308F, -0.9284F, -0.2916F, -2.0481F, -0.2255F, -2.1395F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(56, 12).addBox(-3.3F, -0.5F, -0.2F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5058F, -2.165F, -1.3617F, -2.0938F, -0.0353F, -1.7924F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 114).addBox(-4.6058F, -2.2477F, 3.7786F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9018F, 1.7129F, 1.1757F, 1.5034F, 1.3075F, -2.6323F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 36).addBox(-2.2361F, -0.5F, -1.435F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5556F, 8.7208F, 3.8944F, 0.2693F, -0.2197F, 1.9153F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 60).addBox(-2.1967F, -0.5F, -0.7783F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5556F, 8.7208F, 3.8944F, 0.2628F, -0.026F, 1.9684F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(75, 8).addBox(-2.2628F, -0.5F, -0.2646F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5556F, 8.7208F, 3.8944F, 0.2678F, 0.1931F, 2.0279F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(112, 93).addBox(-1.9278F, -0.5F, -0.2121F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5556F, 8.7208F, 3.8944F, 0.3575F, 0.7347F, 2.2207F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(103, 93).addBox(-2.0F, -0.5F, 0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6311F, 7.1529F, 4.6738F, 0.2658F, 0.151F, 2.1908F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(87, 47).addBox(-1.117F, -0.4786F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.4446F, 4.586F, 1.7349F, -0.3227F, 0.6881F, -0.8571F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(95, 51).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4144F, 6.6151F, 1.4164F, -2.1522F, 0.7974F, -3.0373F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(112, 20).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2275F, 5.5527F, 0.5255F, -0.6271F, 0.8381F, -0.8423F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 64).addBox(-0.5F, -0.8F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3216F, 5.8121F, 0.4077F, -1.4861F, 1.1659F, -1.8268F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(111, 78).addBox(-1.5545F, -0.5254F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.4446F, 4.586F, 1.7349F, -1.0061F, 1.1659F, -1.8268F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(98, 47).addBox(-1.5F, -0.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7162F, 6.1933F, 3.3147F, -0.2626F, 0.4687F, -1.0474F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(113, 31).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6518F, 6.1719F, 2.1809F, -0.1478F, 0.5134F, -0.8051F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(112, 89).addBox(0.2F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.7223F, 2.7236F, -0.8871F, -0.4727F, -0.1405F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 73).addBox(-0.5F, -1.0373F, 0.029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.636F, 0.9276F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(52, 97).addBox(-0.5F, -1.1718F, -3.0147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.736F, 0.8276F, -1.1698F, -0.1331F, 0.266F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(95, 33).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.036F, 0.8276F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 6.6621F, 2.2668F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(14, 100).addBox(-1.0F, -2.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(94, 99).addBox(-1.0F, -4.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5195F, 1.1806F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(41, 60).addBox(-1.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, 5.4563F, 0.4743F, -0.0917F, 0.0507F, 0.5038F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(85, 95).addBox(-1.0F, -3.4F, 0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 43).addBox(-1.0F, -5.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(102, 0).addBox(-1.0F, -5.4F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(50, 76).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -1.2333F, -3.1068F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.5975F, -1.5021F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(79, 39).addBox(-1.5F, -2.7057F, -0.8707F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.3829F, -1.5582F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(43, 102).addBox(-1.5F, -2.9498F, -0.3234F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.999F, 1.1068F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(26, 67).addBox(-1.5F, -16.7121F, -4.541F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 25.949F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(98, 69).addBox(-1.0F, 0.2501F, 0.3645F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8652F, -1.6822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.1129F, -0.2759F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(82, 16).addBox(-1.5F, -0.8F, -1.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(71, 87).addBox(0.0F, -0.2F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.3972F, 2.01F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(29, 88).addBox(-1.9F, -7.9918F, -1.048F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(87, 71).addBox(-2.4F, -6.235F, -0.1686F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(12, 89).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(39, 71).addBox(-1.5F, -0.1444F, -1.1179F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 8.4554F, -0.6588F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 107).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.0643F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(77, 106).addBox(-0.5F, -3.9857F, -0.9115F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.8414F, 0.7936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(47, 58).addBox(-2.0F, -1.0696F, -2.9933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2954F, 0.2929F, 1.2741F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0304F, -2.6933F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(47, 52).addBox(-2.6F, -1.8F, -0.7F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 6.6621F, 2.2668F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 100).addBox(-1.0F, -2.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 26).addBox(-1.0F, -4.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5195F, 1.1806F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 98).addBox(0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.0F, 5.4563F, 0.4743F, -0.0917F, -0.0507F, -0.5038F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(96, 21).addBox(-2.0F, -3.4F, 0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 64).addBox(-1.0F, -5.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(23, 103).addBox(-2.0F, -5.4F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(37, 77).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(61, 102).addBox(-1.0F, -1.2333F, -3.1068F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.5975F, -1.5021F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 0).addBox(-1.5F, -2.7057F, -0.8707F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.3829F, -1.5582F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 102).addBox(-1.5F, -2.9498F, -0.3234F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.999F, 1.1068F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(69, 16).addBox(-1.5F, -16.7121F, -4.541F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 25.949F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(99, 38).addBox(-1.0F, 0.2501F, 0.3645F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8652F, -1.6822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.1129F, -0.2759F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(84, 11).addBox(-1.5F, -0.8F, -1.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.3972F, 2.01F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(5, 89).addBox(-0.1F, -7.9918F, -1.048F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(88, 5).addBox(-0.6F, -6.235F, -0.1686F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(89, 21).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, -0.1444F, -1.1179F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 8.4554F, -0.6588F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(24, 107).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.0643F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(106, 79).addBox(-0.5F, -3.9857F, -0.9115F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.8414F, 0.7936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, -1.0696F, -2.9933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2954F, 0.2929F, 1.2741F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0304F, -2.6933F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 54).addBox(-2.4F, -1.8F, -0.7F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.6F, 0.1251F, -0.2165F, -0.027F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(117, 117).addBox(0.0F, -2.1845F, -0.6102F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6064F, -0.259F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(114, 117).addBox(0.0F, -2.3545F, -0.0038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.331F, -2.7389F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(111, 117).addBox(0.0F, -2.6398F, -0.0023F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.531F, -4.7389F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(103, 117).addBox(0.0F, -2.6115F, -0.0418F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.031F, -6.6389F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(50, 71).addBox(0.0F, -2.6402F, 0.0197F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5315F, -8.7301F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(27, 115).addBox(0.0F, -2.7904F, -0.0882F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9434F, -10.6974F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(74, 114).addBox(0.0F, -3.2057F, 0.0627F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -12.6F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(111, 18).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.523F, 0.0873F, -0.7925F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(111, 16).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.5279F, -0.0445F, -1.0188F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.4768F, -0.2399F, -1.3737F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.4741F, -0.2051F, -1.3569F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(111, 12).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5133F, -0.0128F, -1.0018F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(111, 10).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5015F, 0.115F, -0.7728F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.4715F, -0.1703F, -1.3399F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(111, 8).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.4988F, 0.0189F, -0.9843F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(111, 2).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.48F, 0.1426F, -0.7526F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4582F, 0.1701F, -0.7492F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4842F, 0.0507F, -0.9838F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4689F, -0.1354F, -1.3403F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 48).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.465F, -0.0832F, -1.3058F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(106, 110).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.4623F, 0.0983F, -0.9473F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(110, 98).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.4252F, 0.2112F, -0.7081F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(110, 96).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.4252F, 0.2112F, -0.6906F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(110, 87).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.4623F, 0.0983F, -0.9298F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 29).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.465F, -0.0832F, -1.2884F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-2.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3F, -12.3F, -0.2005F, -0.0608F, -0.2906F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(40, 37).addBox(0.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3F, -12.3F, -0.2005F, 0.0608F, 0.2906F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(73, 29).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.4768F, 0.2399F, 1.3737F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(111, 16).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.5279F, 0.0445F, 1.0188F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(111, 18).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.523F, -0.0873F, 0.7925F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(111, 10).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5015F, -0.115F, 0.7728F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(111, 12).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5133F, 0.0128F, 1.0018F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(99, 87).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.4741F, 0.2051F, 1.3569F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(111, 2).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.48F, -0.1426F, 0.7526F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(111, 8).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.4988F, -0.0189F, 0.9843F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(72, 48).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.4715F, 0.1703F, 1.3399F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(64, 46).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4689F, 0.1354F, 1.3403F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 111).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4842F, -0.0507F, 0.9838F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(111, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4582F, -0.1701F, 0.7492F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(110, 98).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.4252F, -0.2112F, 0.7081F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(106, 110).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.4623F, -0.0983F, 0.9473F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(53, 48).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.465F, 0.0832F, 1.3058F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(110, 96).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.4252F, -0.2112F, 0.6906F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(110, 87).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.4623F, -0.0983F, 0.9298F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 29).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.465F, 0.0832F, 1.2884F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1512F, -0.2526F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -13.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -14.4F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(110, 62).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -1.5644F, -0.4582F, 0.2391F, -0.6372F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(109, 29).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -1.5644F, -0.5004F, 0.1178F, -0.8731F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(33, 12).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -1.5644F, -0.5074F, -0.078F, -1.2242F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, 0.5356F, -0.4252F, 0.2112F, -0.6732F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(108, 4).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, 0.5356F, -0.4623F, 0.0983F, -0.9124F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(33, 10).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, 0.5356F, -0.465F, -0.0832F, -1.2709F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(107, 106).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -3.5644F, -0.4458F, 0.2518F, -0.5993F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -3.5644F, -0.4916F, 0.1329F, -0.8371F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -3.5644F, -0.5044F, -0.0608F, -1.1895F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(107, 72).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -5.4644F, -0.5385F, 0.1001F, -0.8129F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(107, 70).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -5.4644F, -0.5004F, 0.2306F, -0.5826F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(33, 6).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -5.4644F, -0.5372F, -0.1076F, -1.157F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -11.3644F, -0.5555F, -0.1212F, -1.2628F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(107, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -11.3644F, -0.5603F, 0.0934F, -0.9228F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(107, 49).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -11.3644F, -0.5236F, 0.229F, -0.6958F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(33, 4).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -9.5644F, -0.5599F, -0.1381F, -1.1924F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(107, 47).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -9.5644F, -0.5701F, 0.079F, -0.8539F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(106, 85).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -9.5644F, -0.5367F, 0.2171F, -0.6288F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(33, 2).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -7.5644F, -0.5533F, -0.1127F, -1.1234F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 56).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -7.5644F, -0.5554F, 0.1006F, -0.7827F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(106, 14).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -7.5644F, -0.517F, 0.235F, -0.5546F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(108, 6).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, 0.5356F, -0.4252F, -0.2112F, 0.6732F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(108, 4).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, 0.5356F, -0.4623F, -0.0983F, 0.9124F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(33, 10).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, 0.5356F, -0.465F, 0.0832F, 1.2709F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(33, 12).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -1.5644F, -0.5074F, 0.078F, 1.2242F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(109, 29).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -1.5644F, -0.5004F, -0.1178F, 0.8731F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(110, 62).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -1.5644F, -0.4582F, -0.2391F, 0.6372F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(107, 106).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -3.5644F, -0.4458F, -0.2518F, 0.5993F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(107, 104).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -3.5644F, -0.4916F, -0.1329F, 0.8371F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(33, 8).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -3.5644F, -0.5044F, 0.0608F, 1.1895F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(107, 72).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -5.4644F, -0.5385F, -0.1001F, 0.8129F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(107, 70).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -5.4644F, -0.5004F, -0.2306F, 0.5826F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 6).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -5.4644F, -0.5372F, 0.1076F, 1.157F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(32, 50).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -11.3644F, -0.5555F, 0.1212F, 1.2628F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(107, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -11.3644F, -0.5603F, -0.0934F, 0.9228F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(107, 49).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -11.3644F, -0.5236F, -0.229F, 0.6958F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(33, 4).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -9.5644F, -0.5599F, 0.1381F, 1.1924F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(107, 47).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -9.5644F, -0.5701F, -0.079F, 0.8539F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(106, 85).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -9.5644F, -0.5367F, -0.2171F, 0.6288F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(33, 2).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -7.5644F, -0.5533F, 0.1127F, 1.1234F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(106, 56).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -7.5644F, -0.5554F, -0.1006F, 0.7827F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(106, 14).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -7.5644F, -0.517F, -0.235F, 0.5546F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.0F, -12.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(9, 102).addBox(-0.01F, -9.978F, -0.3347F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -10.1238F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(47, 115).addBox(0.0F, -2.9962F, -0.0241F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -10.1238F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(41, 115).addBox(-0.01F, -4.023F, -0.0061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5899F, -11.1238F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 115).addBox(-0.004F, -4.097F, -0.984F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6899F, -8.5238F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(38, 115).addBox(0.0F, -3.997F, -0.984F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6899F, -8.5238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 115).addBox(0.0F, -4.0727F, 0.0098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2101F, -12.5238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(120, 0).addBox(0.0F, -2.6539F, -0.113F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -0.5238F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(120, 8).addBox(-0.005F, -4.4598F, 0.3083F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -0.5238F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(14, 120).addBox(-0.005F, -4.4551F, 0.3106F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7899F, -1.9238F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(118, 24).addBox(0.0F, -2.6496F, -0.11F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7899F, -1.9238F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(56, 115).addBox(0.0F, -3.7048F, -0.0266F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4899F, -4.1238F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(119, 98).addBox(-0.005F, -5.4966F, 0.5016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4899F, -4.1238F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(13, 67).addBox(-0.5F, -1.0047F, -0.1274F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.8821F, -12.3872F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(92, 35).addBox(-0.005F, -6.4966F, 0.7016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -6.1238F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(95, 113).addBox(0.0F, -4.7048F, -0.0266F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1899F, -6.1238F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(119, 94).addBox(-0.005F, -7.4599F, 0.7086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2899F, -7.8238F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(67, 106).addBox(0.0F, -5.6541F, -0.1128F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2899F, -7.8238F, -0.5149F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -12.1F, -0.0524F, -0.0436F, 0.0023F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(89, 113).addBox(-0.015F, -6.2304F, -0.3523F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0226F, -3.4979F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(50, 115).addBox(0.01F, -4.1199F, -0.9469F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9774F, -2.7979F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(92, 113).addBox(-0.01F, -4.7032F, -0.103F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4774F, -4.0979F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(53, 115).addBox(0.0F, -3.5524F, -0.741F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3226F, -6.6979F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(103, 109).addBox(0.0F, -5.4771F, -0.6526F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5226F, -4.8979F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(29, 107).addBox(0.0F, -5.676F, -0.284F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0226F, -3.4979F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(24, 113).addBox(-0.01F, -6.133F, -0.3299F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4774F, -1.5979F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(46, 77).addBox(0.01F, -4.9319F, -0.9684F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2774F, 0.4021F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(5, 118).addBox(-0.01F, -3.0726F, -0.1407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.8774F, -0.5979F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(19, 89).addBox(0.0F, -8.577F, -0.2701F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4774F, -1.5979F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-6.8276F, 0.0726F, -0.5774F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.4735F, 5.4191F, 0.246F, 1.133F, -0.0022F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-13.4091F, 4.167F, -0.5774F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.4735F, 5.4191F, 0.9907F, 0.7224F, 0.8893F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-3.3378F, 0.1281F, -0.3823F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 14.2735F, 5.5191F, -0.0974F, 0.9797F, -0.3246F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(17, 37).mirror().addBox(-12.5886F, 2.111F, -0.3823F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 14.2735F, 5.5191F, 0.6885F, 0.7694F, 0.6615F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(33, 14).mirror().addBox(-11.5973F, 1.2036F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 14.3735F, 5.3191F, 0.4202F, 0.7188F, 0.4705F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(111, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 14.3735F, 5.3191F, -0.2165F, 0.7904F, -0.4258F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(117, 41).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 14.3735F, 4.6191F, -0.1311F, 0.6844F, -0.3669F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-11.5973F, 1.2036F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 14.3735F, 4.6191F, 0.3718F, 0.6015F, 0.4422F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-10.5973F, 1.2036F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 14.3735F, 4.8191F, 0.332F, 0.4443F, 0.4259F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(117, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 14.3735F, 4.8191F, -0.0277F, 0.5473F, -0.3033F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-9.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 14.3735F, 4.8191F, 0.2167F, 0.2254F, 0.44F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(117, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 14.3735F, 4.8191F, 0.0345F, 0.3095F, -0.225F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-9.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 14.3735F, 3.8191F, 0.1593F, 0.0978F, 0.4133F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(117, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 14.3735F, 3.8191F, 0.0685F, 0.1739F, -0.2343F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(116, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.0735F, 1.8191F, 0.0726F, 0.1569F, -0.286F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-8.5973F, 1.2036F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.0735F, 1.8191F, 0.1523F, 0.0818F, 0.3603F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(72, 50).mirror().addBox(-7.5973F, 1.2036F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.7735F, 0.0191F, 0.1726F, 0.1301F, 0.3973F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(115, 84).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.7735F, 0.0191F, 0.0593F, 0.2076F, -0.2535F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-6.4142F, 1.4142F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 13.1735F, -1.9809F, 0.225F, 0.1649F, 0.5405F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(115, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 13.1735F, -1.9809F, 0.0411F, 0.2751F, -0.2579F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(95, 14).mirror().addBox(-5.4142F, 1.4142F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.6735F, -3.9809F, 0.2956F, 0.2657F, 0.9047F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(117, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.6735F, -3.9809F, 0.0142F, 0.3946F, 0.0823F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2292F, -6.6547F, 0.2123F, 0.268F, -0.8876F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(105, 20).mirror().addBox(-0.5449F, -2.0194F, -2.3742F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 0.4432F, -0.1553F, 0.516F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(113, 112).mirror().addBox(-0.5449F, -2.8347F, -2.3312F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 0.8795F, -0.1553F, 0.516F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(18, 74).mirror().addBox(-0.5449F, -3.9954F, -1.5917F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 1.9355F, -0.1553F, 0.516F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.5449F, -3.5929F, -1.795F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 1.3595F, -0.1553F, 0.516F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(12, 105).mirror().addBox(-0.5449F, -3.6982F, -3.4218F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 1.5864F, -0.1553F, 0.516F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(77, 117).mirror().addBox(-1.4449F, 3.7472F, -0.9799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7836F, -0.7373F, 0.2049F, 3.0001F, -0.1553F, 0.516F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(100, 104).mirror().addBox(-0.5449F, 3.1472F, -2.2799F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 3.0001F, -0.1553F, 0.516F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(11, 74).mirror().addBox(-0.5449F, -1.3802F, -1.1416F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 2.4329F, -0.1553F, 0.516F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-1.5671F, 0.8442F, 1.0043F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 1.479F, -0.3358F, 1.1107F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(36, 85).mirror().addBox(0.1277F, 1.2692F, -0.08F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 1.1399F, -0.7017F, 1.1078F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(109, 27).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -4.7644F, -0.4917F, 0.0969F, -1.3804F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(109, 25).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -4.7644F, -0.4546F, 0.2167F, -1.1446F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(118, 29).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -4.7644F, -0.4921F, -0.0947F, -1.7337F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(107, 108).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -2.9644F, -0.4913F, 0.2468F, -0.923F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(108, 41).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -2.9644F, -0.5336F, 0.1178F, -1.1549F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(95, 56).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -2.9644F, -0.5386F, -0.0893F, -1.4994F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.0644F, -0.5488F, -0.0958F, -1.3508F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(108, 39).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.0644F, -0.5455F, 0.1151F, -1.0086F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(108, 37).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.0644F, -0.5038F, 0.2468F, -0.7784F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(0.1277F, 0.4456F, -2.3961F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 0.1363F, -0.7017F, 1.1078F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(32, 39).mirror().addBox(-0.5449F, -0.5667F, -6.4437F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 0.8708F, -0.1553F, 0.516F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.5449F, -2.5472F, -0.5113F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 0.9406F, -0.1553F, 0.516F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(31, 29).mirror().addBox(-2.9816F, -1.2397F, -3.5184F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 0.9267F, -0.2155F, 0.6333F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(103, 96).mirror().addBox(-0.5449F, -1.7588F, -6.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7836F, -0.7373F, 0.2049F, 1.0628F, -0.1553F, 0.516F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(109, 27).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -4.7644F, -0.4917F, -0.0969F, 1.3804F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(109, 25).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -4.7644F, -0.4546F, -0.2167F, 1.1446F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(118, 29).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -4.7644F, -0.4921F, 0.0947F, 1.7337F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(107, 108).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -2.9644F, -0.4913F, -0.2468F, 0.923F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(108, 41).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -2.9644F, -0.5336F, -0.1178F, 1.1549F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(95, 56).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -2.9644F, -0.5386F, 0.0893F, 1.4994F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(64, 44).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.0644F, -0.5488F, 0.0958F, 1.3508F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(108, 39).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.0644F, -0.5455F, -0.1151F, 1.0086F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(108, 37).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.0644F, -0.5038F, -0.2468F, 0.7784F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(77, 117).addBox(0.4449F, 3.7472F, -0.9799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7836F, -0.7373F, 0.2049F, 3.0001F, 0.1553F, -0.516F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(100, 104).addBox(-0.4551F, 3.1472F, -2.2799F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 3.0001F, 0.1553F, -0.516F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(11, 74).addBox(-0.4551F, -1.3802F, -1.1416F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 2.4329F, 0.1553F, -0.516F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(36, 92).addBox(0.5671F, 0.8442F, 1.0043F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 1.479F, 0.3358F, -1.1107F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(36, 85).addBox(-1.1278F, 1.2692F, -0.08F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 1.1399F, 0.7017F, -1.1078F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 42).addBox(-1.1278F, 0.4456F, -2.3961F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 0.1363F, 0.7017F, -1.1078F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(32, 39).addBox(-0.4551F, -0.5667F, -6.4437F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 0.8708F, 0.1553F, -0.516F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(56, 0).addBox(-0.4551F, -2.5472F, -0.5113F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 0.9406F, 0.1553F, -0.516F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(31, 29).addBox(-0.0184F, -1.2397F, -3.5184F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 0.9267F, 0.2155F, -0.6333F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(18, 74).addBox(-0.4551F, -3.9954F, -1.5917F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 1.9355F, 0.1553F, -0.516F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(105, 20).addBox(-0.4551F, -2.0194F, -2.3742F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 0.4432F, 0.1553F, -0.516F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(113, 112).addBox(-0.4551F, -2.8347F, -2.3312F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 0.8795F, 0.1553F, -0.516F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 117).addBox(-0.4551F, -3.5929F, -1.795F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 1.3595F, 0.1553F, -0.516F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(12, 105).addBox(-0.4551F, -3.6982F, -3.4218F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 1.5864F, 0.1553F, -0.516F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(103, 96).addBox(-0.4551F, -1.7588F, -6.3439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7836F, -0.7373F, 0.2049F, 1.0628F, 0.1553F, -0.516F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2292F, -6.6547F, 0.2123F, -0.268F, 0.8876F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 10).addBox(5.4091F, 4.167F, -0.5774F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.4735F, 5.4191F, 0.9907F, -0.7224F, -0.8893F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(69, 22).addBox(-0.1724F, 0.0726F, -0.5774F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.4735F, 5.4191F, 0.246F, -1.133F, 0.0022F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(17, 37).addBox(2.5886F, 2.111F, -0.3823F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 14.2735F, 5.5191F, 0.6885F, -0.7694F, -0.6615F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(86, 82).addBox(-1.6622F, 0.1281F, -0.3823F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 14.2735F, 5.5191F, -0.0974F, -0.9797F, 0.3246F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(111, 82).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 14.3735F, 5.3191F, -0.2165F, -0.7904F, 0.4258F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(33, 14).addBox(1.5973F, 1.2036F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 14.3735F, 5.3191F, 0.4202F, -0.7188F, -0.4705F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(33, 0).addBox(1.5973F, 1.2036F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 14.3735F, 4.6191F, 0.3718F, -0.6015F, -0.4422F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(117, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 14.3735F, 4.6191F, -0.1311F, -0.6844F, 0.3669F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(117, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 14.3735F, 4.8191F, -0.0277F, -0.5473F, 0.3033F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(32, 48).addBox(1.5973F, 1.2036F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 14.3735F, 4.8191F, 0.332F, -0.4443F, -0.4259F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(117, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 14.3735F, 4.8191F, 0.0345F, -0.3095F, 0.225F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(56, 8).addBox(1.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 14.3735F, 4.8191F, 0.2167F, -0.2254F, -0.44F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(117, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 14.3735F, 3.8191F, 0.0685F, -0.1739F, 0.2343F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(53, 50).addBox(1.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 14.3735F, 3.8191F, 0.1593F, -0.0978F, -0.4133F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(69, 6).addBox(1.5973F, 1.2036F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.0735F, 1.8191F, 0.1523F, -0.0818F, -0.3603F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(116, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.0735F, 1.8191F, 0.0726F, -0.1569F, 0.286F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(115, 84).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.7735F, 0.0191F, 0.0593F, -0.2076F, 0.2535F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(72, 50).addBox(1.5973F, 1.2036F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.7735F, 0.0191F, 0.1726F, -0.1301F, -0.3973F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(115, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 13.1735F, -1.9809F, 0.0411F, -0.2751F, 0.2579F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(82, 33).addBox(1.4142F, 1.4142F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 13.1735F, -1.9809F, 0.225F, -0.1649F, -0.5405F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(95, 14).addBox(1.4142F, 1.4142F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.6735F, -3.9809F, 0.2956F, -0.2657F, -0.9047F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(117, 37).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.6735F, -3.9809F, 0.0142F, -0.3946F, -0.0823F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(66, 37).addBox(-0.5F, 0.0F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.4821F, 0.5128F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(31, 17).addBox(-1.0F, -1.908F, 1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.2F, -9.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1F, 4.185F, -3.3682F, -0.2892F, 0.0193F, -0.1295F));

		PartDefinition cube_r301 = leftarm.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(11, 84).addBox(-1.5F, -1.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 10.0714F, 0.9761F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftarm.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 78).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 8.7978F, 2.5471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftarm.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(119, 43).addBox(0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5891F, -0.2255F, -0.0001F, -0.1048F, 0.0014F, -0.001F));

		PartDefinition cube_r304 = leftarm.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(70, 105).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.5857F, -1.4012F, -1.6181F, -0.6284F, 0.0014F, -0.001F));

		PartDefinition cube_r305 = leftarm.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(64, 117).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5848F, -0.955F, -2.513F, -1.1084F, 0.0014F, -0.001F));

		PartDefinition cube_r306 = leftarm.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(30, 119).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5849F, -0.1117F, -3.0504F, -0.5673F, 0.0014F, -0.001F));

		PartDefinition cube_r307 = leftarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(76, 95).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5894F, 0.3931F, -0.1931F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r308 = leftarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(46, 84).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(59, 76).addBox(0.5F, -1.5F, -2.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5894F, 1.7477F, -1.1445F, -0.1746F, 0.0014F, -0.001F));

		PartDefinition cube_r309 = leftarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(76, 89).addBox(0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5902F, 4.1054F, -2.1697F, -0.8029F, 0.0014F, -0.001F));

		PartDefinition cube_r310 = leftarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(87, 63).addBox(-1.0F, -5.5475F, -0.5419F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.6F, 7.8209F, 2.2038F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r311 = leftarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(82, 24).addBox(-1.0F, -3.9389F, -0.9208F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 5.2285F, 1.8741F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7616F, 9.6662F, 2.0035F, -0.5545F, 0.074F, 0.1081F));

		PartDefinition cube_r312 = leftarm2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 113).addBox(0.0039F, -3.3637F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7936F, 3.8361F, -0.2598F, 1.5708F, -1.3439F, -1.5097F));

		PartDefinition cube_r313 = leftarm2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(86, 100).addBox(-0.5F, -1.5F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9709F, 6.7343F, -0.1066F, 1.5272F, -1.4312F, -1.5097F));

		PartDefinition cube_r314 = leftarm2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(36, 99).addBox(-0.5492F, -2.5212F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7936F, 3.8361F, -0.2598F, 0.0F, -1.5708F, 0.0611F));

		PartDefinition cube_r315 = leftarm2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(103, 64).addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, 7.5057F, 0.0963F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r316 = leftarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(112, 100).addBox(1.4F, 0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, -1.5081F, 0.1246F, -1.5708F, -0.4014F, 1.5708F));

		PartDefinition cube_r317 = leftarm2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(29, 79).addBox(-0.0256F, -0.0299F, -1.4596F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.236F, 1.5425F, -0.1906F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r318 = leftarm2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(45, 91).addBox(-1.0256F, -1.4299F, -1.4596F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.236F, 0.3298F, 1.2549F, -1.5708F, -1.2566F, 1.5708F));

		PartDefinition cube_r319 = leftarm2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(90, 39).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, -2.6841F, 1.6562F, 1.5708F, -0.6981F, -1.5708F));

		PartDefinition cube_r320 = leftarm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(95, 75).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.5988F, 3.5671F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r321 = leftarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(86, 52).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, 2.3653F, 0.7011F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition cube_r322 = leftarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(63, 95).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 6.3598F, 0.4917F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition cube_r323 = leftarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(53, 106).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2236F, 5.6954F, 0.7336F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(54, 70).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.4F, 0.1F, 0.3853F, -0.0809F, -0.0328F));

		PartDefinition cube_r324 = leftArm3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7627F, 1.8244F, 0.8017F, -0.3446F, 0.4024F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(15, 60).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8066F, 0.5533F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 3.4019F, 0.5002F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftArm5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(47, 42).addBox(-2.8F, -0.5F, -0.9F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1F, 4.185F, -3.3682F, 0.1277F, -0.2904F, 0.18F));

		PartDefinition cube_r326 = rightarm.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(79, 84).addBox(-1.5F, -1.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 10.0714F, 0.9761F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightarm.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(18, 79).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 8.7978F, 2.5471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightarm.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(119, 60).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5891F, -0.2255F, -0.0001F, -0.1048F, -0.0014F, 0.001F));

		PartDefinition cube_r329 = rightarm.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(32, 106).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.5857F, -1.4012F, -1.6181F, -0.6284F, -0.0014F, 0.001F));

		PartDefinition cube_r330 = rightarm.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(69, 117).addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5848F, -0.955F, -2.513F, -1.1084F, -0.0014F, 0.001F));

		PartDefinition cube_r331 = rightarm.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(59, 119).addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5849F, -0.1117F, -3.0504F, -0.5673F, -0.0014F, 0.001F));

		PartDefinition cube_r332 = rightarm.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(5, 97).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5894F, 0.3931F, -0.1931F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r333 = rightarm.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(55, 84).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(77, 52).addBox(-1.5F, -1.5F, -2.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5894F, 1.7477F, -1.1445F, -0.1746F, -0.0014F, 0.001F));

		PartDefinition cube_r334 = rightarm.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(85, 89).addBox(-1.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5902F, 4.1054F, -2.1697F, -0.8029F, -0.0014F, 0.001F));

		PartDefinition cube_r335 = rightarm.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(64, 87).addBox(-1.0F, -5.5475F, -0.5419F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.6F, 7.8209F, 2.2038F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r336 = rightarm.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(22, 84).addBox(-1.0F, -3.9389F, -0.9208F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 5.2285F, 1.8741F, 0.4451F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7616F, 9.6662F, 2.0035F, -0.2491F, -0.074F, -0.1081F));

		PartDefinition cube_r337 = rightarm2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(17, 113).addBox(-1.0039F, -3.3637F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7936F, 3.8361F, -0.2598F, 1.5708F, 1.3439F, 1.5097F));

		PartDefinition cube_r338 = rightarm2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(103, 58).addBox(-0.5F, -1.5F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9709F, 6.7343F, -0.1066F, 1.5272F, 1.4312F, 1.5097F));

		PartDefinition cube_r339 = rightarm2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(99, 80).addBox(-0.4508F, -2.5212F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7936F, 3.8361F, -0.2598F, 0.0F, 1.5708F, -0.0611F));

		PartDefinition cube_r340 = rightarm2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(103, 89).addBox(-2.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, 7.5057F, 0.0963F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r341 = rightarm2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(106, 112).addBox(-2.4F, 0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, -1.5081F, 0.1246F, -1.5708F, 0.4014F, -1.5708F));

		PartDefinition cube_r342 = rightarm2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(79, 75).addBox(-0.9744F, -0.0299F, -1.4596F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.236F, 1.5425F, -0.1906F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r343 = rightarm2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(54, 91).addBox(-0.9744F, -1.4299F, -1.4596F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.236F, 0.3298F, 1.2549F, -1.5708F, 1.2566F, -1.5708F));

		PartDefinition cube_r344 = rightarm2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(90, 84).addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, -2.6841F, 1.6562F, 1.5708F, 0.6981F, 1.5708F));

		PartDefinition cube_r345 = rightarm2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(43, 97).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, -0.5988F, 3.5671F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r346 = rightarm2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(86, 75).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, 2.3653F, 0.7011F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition cube_r347 = rightarm2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(29, 96).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 6.3598F, 0.4917F, -1.5708F, 1.5184F, -1.5708F));

		PartDefinition cube_r348 = rightarm2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(60, 106).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2236F, 5.6954F, 0.7336F, 1.5708F, 1.1345F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(65, 70).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.4F, 0.1F, -0.4001F, 0.0809F, 0.0328F));

		PartDefinition cube_r349 = rightArm3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(39, 106).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7627F, 1.8244F, 0.8017F, 0.3446F, -0.4024F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(28, 60).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8066F, 0.5533F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 3.4019F, 0.5002F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightArm5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(15, 48).addBox(-2.2F, -0.5F, -0.9F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4F, -7.8F, 0.0685F, -0.3272F, 0.1064F));

		PartDefinition cube_r351 = neck2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(86, 21).addBox(0.0F, -0.856F, -2.9396F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 86).addBox(0.0F, -1.956F, -0.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6529F, -0.8763F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r352 = neck2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(17, 117).mirror().addBox(-0.8931F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1406F, -1.4017F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r353 = neck2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(17, 117).addBox(-1.1069F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1406F, -1.4017F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r354 = neck2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(32, 52).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.5F, -0.2256F, -0.2555F, 0.0579F));

		PartDefinition cube_r355 = neck.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(11, 120).addBox(0.0F, -0.8F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5354F, -2.1751F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r356 = neck.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(22, 93).addBox(0.0F, -4.1F, 2.8F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(-1.0F, -1.1F, 0.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r357 = neck.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(89, 29).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3193F, -2.2078F, 1.501F, 0.0F, -3.1416F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.671F, -3.5963F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(93, 0).addBox(-2.0F, -2.9F, -3.7F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, 1.6F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 51).addBox(-1.5F, -0.0407F, -3.8461F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.1F, -4.1F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(54, 23).addBox(-2.5F, 1.4606F, -4.0004F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(68, 82).addBox(-2.5F, 1.9606F, -2.8004F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.6F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(104, 34).addBox(-1.5F, -1.0898F, -0.9811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -0.8729F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(103, 101).addBox(-1.5F, -0.6778F, -0.6669F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -1.6729F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(69, 31).addBox(-1.5F, -0.3159F, -0.2408F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 6.4742F, -1.1729F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(62, 63).addBox(-1.5F, -3.0159F, -0.1408F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4742F, -1.1729F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(113, 34).addBox(-1.0F, -0.0265F, -2.1292F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(69, 24).addBox(-1.5F, -0.0265F, -1.1292F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.9742F, -2.3729F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(59, 115).addBox(-0.9F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 9.1627F, -3.534F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(81, 44).addBox(-3.5F, 0.1605F, 1.7996F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.4267F, -2.6103F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(104, 31).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.6097F, -3.8856F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(54, 16).addBox(-2.0F, -0.1055F, -4.066F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -1.7F, -3.8F, 1.8239F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(82, 106).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9802F, 0.5441F, -0.5583F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(102, 16).addBox(-0.9F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3403F, -0.4122F, -0.3938F, 1.3731F, -0.0299F, -0.2716F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 83).addBox(-1.3F, -0.5F, -2.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2092F, -1.7081F, -1.3703F, 2.2139F, 0.0629F, -0.0837F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(69, 0).addBox(-2.0F, -0.9321F, -3.9863F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1092F, 5.3724F, -0.3756F, 1.0322F, 0.0539F, 0.0898F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(77, 112).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0092F, -0.4215F, 1.1936F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(99, 5).addBox(-1.3F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2092F, -1.7081F, -1.3703F, 2.2F, -0.1564F, 0.2108F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(118, 51).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5092F, -4.6484F, -2.532F, 1.4376F, 0.2055F, 0.9898F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(118, 74).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.3525F, -3.8851F, -1.6917F, 1.3361F, 0.0688F, 0.2799F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(89, 109).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5092F, -4.6484F, -2.532F, 1.3407F, 0.0828F, 0.3395F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(118, 77).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5695F, -4.3165F, -2.6148F, 1.4658F, 0.2211F, 1.1228F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(76, 69).addBox(-0.4F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3092F, 3.4451F, -2.8408F, 1.33F, -0.042F, -0.1694F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(32, 111).addBox(-1.0F, -0.0407F, -0.0461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.8619F, 4.5601F, -4.2964F, 0.9604F, 0.025F, 0.0357F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(82, 110).addBox(-1.0F, -0.0407F, 0.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7038F, 6.225F, -5.4622F, 0.9966F, 0.2213F, 0.3271F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(39, 111).addBox(-0.5F, -0.767F, -0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0092F, 6.1982F, -5.2027F, 0.4882F, -0.3716F, 0.1065F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(94, 89).addBox(-0.4224F, -0.5052F, -3.0441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6092F, 6.1982F, -6.2027F, -0.1663F, 0.0785F, -0.0099F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(94, 64).addBox(-0.4224F, 0.0823F, -2.813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.6092F, 6.1982F, -6.2027F, -0.3758F, 0.0785F, -0.0099F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(95, 9).addBox(-0.3996F, 0.082F, -2.7938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.6092F, 6.1982F, -6.2027F, -0.3936F, -0.2272F, 0.1193F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(94, 94).addBox(-0.3996F, -0.5014F, -3.0253F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6092F, 6.1982F, -6.2027F, -0.1841F, -0.2272F, 0.1193F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5F, -0.767F, -1.5444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(94, 59).addBox(-0.5F, -0.167F, -1.5444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0092F, 6.1982F, -5.2027F, 0.1042F, -0.3716F, 0.1065F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(70, 110).addBox(-1.1F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9092F, 6.4122F, -5.0325F, 0.9784F, 0.1588F, 0.2307F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(116, 47).addBox(-0.7F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.0092F, 8.0956F, -2.8337F, 0.1615F, -0.0665F, 0.3873F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(82, 106).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9802F, -0.5441F, 0.5583F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(102, 16).mirror().addBox(-1.1F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3403F, -0.4122F, -0.3938F, 1.3731F, 0.0299F, 0.2716F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.7F, -0.5F, -2.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.2092F, -1.7081F, -1.3703F, 2.2139F, -0.0629F, 0.0837F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(0.0F, -0.9321F, -3.9863F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1092F, 5.3724F, -0.3756F, 1.0322F, -0.0539F, -0.0898F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(77, 112).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0092F, -0.4215F, 1.1936F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(99, 5).mirror().addBox(-0.7F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2092F, -1.7081F, -1.3703F, 2.2F, 0.1564F, -0.2108F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(118, 51).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.5092F, -4.6484F, -2.532F, 1.4376F, -0.2055F, -0.9898F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(118, 74).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.3525F, -3.8851F, -1.6917F, 1.3361F, -0.0688F, -0.2799F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(89, 109).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5092F, -4.6484F, -2.532F, 1.3407F, -0.0828F, -0.3395F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(118, 77).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5695F, -4.3165F, -2.6148F, 1.4658F, -0.2211F, -1.1228F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-0.6F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3092F, 3.4451F, -2.8408F, 1.33F, 0.042F, 0.1694F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(32, 111).mirror().addBox(0.0F, -0.0407F, -0.0461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.8619F, 4.5601F, -4.2964F, 0.9604F, -0.025F, -0.0357F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(82, 110).mirror().addBox(0.0F, -0.0407F, 0.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7038F, 6.225F, -5.4622F, 0.9966F, -0.2213F, -0.3271F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(39, 111).mirror().addBox(-0.5F, -0.767F, -0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 6.1982F, -5.2027F, 0.4882F, 0.3716F, -0.1065F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.5776F, -0.5052F, -3.0441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6092F, 6.1982F, -6.2027F, -0.1663F, -0.0785F, 0.0099F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-0.5776F, 0.0823F, -2.813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.6092F, 6.1982F, -6.2027F, -0.3758F, -0.0785F, 0.0099F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.6004F, 0.082F, -2.7938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.6092F, 6.1982F, -6.2027F, -0.3936F, 0.2272F, -0.1193F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-0.6004F, -0.5014F, -3.0253F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6092F, 6.1982F, -6.2027F, -0.1841F, 0.2272F, -0.1193F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-0.5F, -0.767F, -1.5444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 59).mirror().addBox(-0.5F, -0.167F, -1.5444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 6.1982F, -5.2027F, 0.1042F, 0.3716F, -0.1065F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(70, 110).mirror().addBox(0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9092F, 6.4122F, -5.0325F, 0.9784F, -0.1588F, -0.2307F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(116, 47).mirror().addBox(-0.3F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 8.0956F, -2.8337F, 0.1615F, 0.0665F, -0.3873F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8985F, 4.9977F, -1.6377F, 0.0F, 0.0F, 0.1571F));

		PartDefinition cube_r412 = leftOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(118, 112).addBox(-0.8834F, -0.5467F, 0.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4811F, 1.7909F, -1.471F, 0.5493F, 1.0343F, -0.5935F));

		PartDefinition cube_r413 = leftOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(98, 118).addBox(-0.8834F, -0.8864F, 0.9051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4811F, 1.7909F, -1.471F, 0.2439F, 1.0343F, -0.5935F));

		PartDefinition cube_r414 = leftOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(60, 111).addBox(-0.8834F, -0.4224F, -0.0702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4811F, 1.7909F, -1.471F, 0.3311F, 1.0343F, -0.5935F));

		PartDefinition cube_r415 = leftOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(12, 116).addBox(-0.1222F, 0.3698F, -0.0151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4811F, -0.1091F, 0.129F, 1.4098F, 1.13F, -0.4882F));

		PartDefinition cube_r416 = leftOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(82, 114).addBox(-0.1222F, 0.0977F, 0.127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4811F, -0.1091F, 0.129F, 0.9298F, 1.13F, -0.4882F));

		PartDefinition cube_r417 = leftOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(105, 43).addBox(-0.7035F, -0.8341F, 1.3861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4811F, 1.7909F, -1.471F, -0.0295F, 1.0029F, -0.7945F));

		PartDefinition cube_r418 = leftOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(46, 106).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0756F, -3.4716F, 0.7308F, 1.3742F, 1.3549F, -0.188F));

		PartDefinition cube_r419 = leftOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(104, 74).addBox(-0.5F, -0.3772F, -0.8036F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6125F, -3.1139F, 0.8318F, 0.5015F, 1.3549F, -0.188F));

		PartDefinition cube_r420 = leftOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(104, 51).addBox(-0.1222F, -0.4319F, 0.8147F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4811F, -0.1091F, 0.129F, 0.8251F, 1.13F, -0.4882F));

		PartDefinition cube_r421 = leftOrbit.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 111).addBox(-0.7035F, 0.4504F, 1.3685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4811F, 1.7909F, -1.471F, 0.8257F, 1.0029F, -0.7945F));

		PartDefinition cube_r422 = leftOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(111, 51).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1342F, 2.5099F, -3.3623F, 1.7841F, -0.1036F, -0.146F));

		PartDefinition cube_r423 = leftOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(111, 74).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7007F, 3.4139F, -3.0952F, 1.5565F, 0.5456F, 1.9167F));

		PartDefinition cube_r424 = leftOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(82, 118).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6141F, 2.0295F, -1.0382F, 1.0251F, 0.0014F, 0.3757F));

		PartDefinition cube_r425 = leftOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(46, 111).addBox(-0.9F, 0.2396F, -1.0896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.331F, 2.3959F, -2.6136F, 0.6324F, 0.0014F, 0.3757F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8985F, 4.9977F, -1.6377F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r426 = rightOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-0.1166F, -0.5467F, 0.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4811F, 1.7909F, -1.471F, 0.5493F, -1.0343F, 0.5935F));

		PartDefinition cube_r427 = rightOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(98, 118).mirror().addBox(-0.1166F, -0.8864F, 0.9051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4811F, 1.7909F, -1.471F, 0.2439F, -1.0343F, 0.5935F));

		PartDefinition cube_r428 = rightOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(60, 111).mirror().addBox(-0.1166F, -0.4224F, -0.0702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4811F, 1.7909F, -1.471F, 0.3311F, -1.0343F, 0.5935F));

		PartDefinition cube_r429 = rightOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(12, 116).mirror().addBox(-0.8778F, 0.3698F, -0.0151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4811F, -0.1091F, 0.129F, 1.4098F, -1.13F, 0.4882F));

		PartDefinition cube_r430 = rightOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(82, 114).mirror().addBox(-0.8778F, 0.0977F, 0.127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4811F, -0.1091F, 0.129F, 0.9298F, -1.13F, 0.4882F));

		PartDefinition cube_r431 = rightOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(105, 43).mirror().addBox(-0.2965F, -0.8341F, 1.3861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4811F, 1.7909F, -1.471F, -0.0295F, -1.0029F, 0.7945F));

		PartDefinition cube_r432 = rightOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(46, 106).mirror().addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0756F, -3.4716F, 0.7308F, 1.3742F, -1.3549F, 0.188F));

		PartDefinition cube_r433 = rightOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(104, 74).mirror().addBox(-0.5F, -0.3772F, -0.8036F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6125F, -3.1139F, 0.8318F, 0.5015F, -1.3549F, 0.188F));

		PartDefinition cube_r434 = rightOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(104, 51).mirror().addBox(-0.8778F, -0.4319F, 0.8147F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4811F, -0.1091F, 0.129F, 0.8251F, -1.13F, 0.4882F));

		PartDefinition cube_r435 = rightOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(53, 111).mirror().addBox(-0.2965F, 0.4504F, 1.3685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4811F, 1.7909F, -1.471F, 0.8257F, -1.0029F, 0.7945F));

		PartDefinition cube_r436 = rightOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1342F, 2.5099F, -3.3623F, 1.7841F, 0.1036F, 0.146F));

		PartDefinition cube_r437 = rightOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(111, 74).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7007F, 3.4139F, -3.0952F, 1.5565F, -0.5456F, -1.9167F));

		PartDefinition cube_r438 = rightOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(82, 118).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6141F, 2.0295F, -1.0382F, 1.0251F, -0.0014F, -0.3757F));

		PartDefinition cube_r439 = rightOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(46, 111).mirror().addBox(-0.1F, 0.2396F, -1.0896F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.331F, 2.3959F, -2.6136F, 0.6324F, -0.0014F, -0.3757F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(54, 64).addBox(0.9F, 0.9F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F))
				.texOffs(70, 97).addBox(0.9F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(54, 64).mirror().addBox(-3.1F, 0.9F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(70, 97).mirror().addBox(-3.1F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.0442F, -0.5742F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(110, 58).addBox(-1.5F, -2.1828F, -0.175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, -9.0F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(0.0F, -0.9F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5745F, 4.2255F, -8.6532F, -1.7802F, -0.1222F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(116, 108).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4943F, 5.9732F, -6.8449F, -2.1642F, -0.1222F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(119, 20).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5162F, 5.3269F, -6.6663F, -1.3788F, -0.1222F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(98, 113).mirror().addBox(-1.0F, 0.3823F, -1.7732F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(12, 110).mirror().addBox(-1.0F, -0.0177F, -1.0732F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(98, 113).addBox(1.2F, 0.3823F, -1.7732F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(12, 110).addBox(1.2F, -0.0177F, -1.0732F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.2F, 5.6054F, -2.3026F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(93, 104).mirror().addBox(-2.0F, -1.6177F, -1.9732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(93, 104).addBox(2.0F, -1.6177F, -1.9732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 5.5062F, -2.3148F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(106, 116).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(106, 116).addBox(3.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, 3.6737F, 0.7533F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(23, 100).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(23, 100).addBox(3.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, 2.1F, 0.6F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(116, 104).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(116, 104).addBox(3.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1F, 0.869F, -1.7436F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(17, 119).mirror().addBox(-1.0F, -2.7715F, -0.8343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(17, 119).addBox(3.0F, -2.7715F, -0.8343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, 1.8997F, -1.8765F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(116, 68).mirror().addBox(-1.0F, -1.9681F, -0.0171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(116, 68).addBox(3.0F, -1.9681F, -0.0171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, 1.8997F, -1.8765F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(119, 90).mirror().addBox(0.2F, 0.3694F, -3.1544F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 6.7F, -5.2F, -1.5184F, -0.1222F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(30, 115).mirror().addBox(0.0F, 0.5694F, -0.6544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 4.7F, -5.2F, -1.5184F, -0.1222F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(8, 118).mirror().addBox(-1.0F, -2.9879F, -1.6865F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 113).mirror().addBox(-1.2F, -2.9879F, -1.1865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(8, 118).addBox(1.8F, -2.9879F, -1.6865F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 113).addBox(1.0F, -2.9879F, -1.1865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 5.2F, -5.4F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(104, 9).mirror().addBox(-1.0F, -2.5177F, -1.9732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(104, 9).addBox(3.0F, -2.5177F, -1.9732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, 6.0F, -1.2F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(79, 100).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 100).addBox(3.0F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 2.2534F, -2.2823F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(64, 84).addBox(0.0F, -0.9F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3745F, 4.2255F, -8.6532F, -1.7802F, 0.1222F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(119, 90).addBox(-0.2F, 0.3694F, -3.1544F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.7F, -5.2F, -1.5184F, 0.1222F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(116, 108).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2943F, 5.9732F, -6.8449F, -2.1642F, 0.1222F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(119, 20).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3162F, 5.3269F, -6.6663F, -1.3788F, 0.1222F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(30, 115).addBox(-1.0F, 0.5694F, -0.6544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 4.7F, -5.2F, -1.5184F, 0.1222F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(75, 63).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4726F, 1.7644F, -0.841F, 0.1468F, -0.162F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(93, 16).addBox(-0.5F, -0.5182F, -0.0471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3617F, 3.8924F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0855F, 2.8481F, 0.2778F, 0.3367F, 0.0939F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0077F, 3.7226F, 0.5059F, 0.3082F, 0.1665F));

		return LayerDefinition.create(meshdefinition, 124, 124);
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