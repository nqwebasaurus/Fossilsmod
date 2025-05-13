package fossils.fossils.client.blockentity.model.menoceras;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MenocerasFossilModel extends SkullModelBase {
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
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftMaxilla;
	private final ModelPart leftMaxilla2;
	private final ModelPart rightMaxilla;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public MenocerasFossilModel(ModelPart root) {
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
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.leftMaxilla2 = this.head.getChild("leftMaxilla2");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.head.getChild("bone2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 4.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.124F, 8.6628F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 83).addBox(0.0F, -1.4691F, -0.0309F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 0.2F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 81).addBox(0.0F, -2.0986F, 2.0389F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 83).addBox(0.0F, -1.5986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-2.2F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5332F, 0.9554F, -1.8823F, -2.8068F, -0.7232F, 1.5624F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 23).mirror().addBox(-2.9F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2745F, -1.1228F, 0.3204F, 0.0804F, -0.5055F, -1.6711F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-2.2F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2834F, -1.6323F, 0.0037F, 0.1323F, -1.0091F, -1.7442F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 80).mirror().addBox(-0.9838F, -1.5589F, 0.4533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, 2.6951F, -0.0767F, 1.1103F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(83, 2).mirror().addBox(0.4981F, -1.1473F, -0.2224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, 1.5705F, -1.0871F, 2.3897F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(0.1582F, -1.0065F, 0.4324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, 0.3082F, -0.9605F, -2.434F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(75, 42).mirror().addBox(0.0432F, -1.0065F, -0.6406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, 0.8634F, -1.34F, -3.029F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 39).mirror().addBox(-1.4065F, -1.2458F, -0.7654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, 2.3478F, -0.8949F, 1.3965F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(-1.4065F, -1.4272F, -0.731F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, 3.1332F, -0.8949F, 1.3965F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-1.7991F, -1.3521F, -0.1764F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, -1.9763F, -0.6673F, 1.0321F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-2.4379F, -2.2049F, -0.3373F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, -2.865F, -1.3149F, 1.9759F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 41).mirror().addBox(-3.0F, -0.4F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4524F, 1.139F, -0.9306F, -2.8848F, -0.5504F, 1.6235F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-1.0F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4398F, 0.2678F, -3.394F, -1.8931F, -1.1722F, 0.4151F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(58, 2).mirror().addBox(-2.5116F, 0.5884F, -0.8438F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.8674F, -1.3881F, -2.9524F, -1.2128F, -0.3322F, -1.4136F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 29).mirror().addBox(-2.2494F, 0.5884F, -0.4891F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8674F, -1.3881F, -2.9524F, -1.6397F, -0.4789F, -0.4111F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 40).mirror().addBox(-0.1F, -0.5F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.4811F, -1.2013F, -4.9517F, -2.0329F, -0.1476F, 0.7239F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 24).mirror().addBox(-0.0604F, -0.1025F, -0.068F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6573F, -2.5988F, -3.7587F, -1.688F, -0.7298F, -0.336F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(35, 41).mirror().addBox(-1.3F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1037F, -1.6205F, -1.6216F, -3.1235F, -1.1949F, 1.4381F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 72).mirror().addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3902F, -2.5087F, 0.7557F, 3.0525F, -0.6605F, 1.5642F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.0763F, 0.1246F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 85).mirror().addBox(-0.4118F, -1.6203F, -0.0383F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 3.0132F, -0.9903F, 1.617F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2954F, -1.8319F, 0.0003F, 0.4466F, -1.4074F, -2.0735F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-0.1433F, 0.4297F, -1.7495F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2869F, 3.9744F, 0.5963F, -0.6885F, 0.3896F, -0.3029F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 80).addBox(-0.0162F, -1.5589F, 0.4533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, 2.6951F, 0.0767F, -1.1103F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 2).addBox(-1.4981F, -1.1473F, -0.2224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, 1.5705F, 1.0871F, -2.3897F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 73).addBox(-2.1582F, -1.0065F, 0.4324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, 0.3082F, 0.9605F, 2.434F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 42).addBox(-2.0432F, -1.0065F, -0.6406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, 0.8634F, 1.34F, 3.029F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 39).addBox(-0.5935F, -1.2458F, -0.7654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, 2.3478F, 0.8949F, -1.3965F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 22).addBox(-0.5935F, -1.4272F, -0.731F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, 3.1332F, 0.8949F, -1.3965F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 38).addBox(-0.2009F, -1.3521F, -0.1764F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, -1.9763F, 0.6673F, -1.0321F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 58).addBox(0.4379F, -2.2049F, -0.3373F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, -2.865F, 1.3149F, -1.9759F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(22, 41).addBox(-2.0F, -0.4F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4524F, 1.139F, -0.9306F, -2.8848F, 0.5504F, -1.6235F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(22, 44).addBox(-2.8F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5332F, 0.9554F, -1.8823F, -2.8068F, 0.7232F, -1.5624F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(57, 33).addBox(-1.0F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4398F, 0.2678F, -3.394F, -1.8931F, 1.1722F, -0.4151F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(58, 2).addBox(0.5116F, 0.5884F, -0.8438F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.8674F, -1.3881F, -2.9524F, -1.2128F, 0.3322F, 1.4136F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(44, 29).addBox(0.2494F, 0.5884F, -0.4891F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8674F, -1.3881F, -2.9524F, -1.6397F, 0.4789F, 0.4111F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(46, 40).addBox(-2.9F, -0.5F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.4811F, -1.2013F, -4.9517F, -2.0329F, 0.1476F, -0.7239F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(32, 24).addBox(-2.9396F, -0.1025F, -0.068F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6573F, -2.5988F, -3.7587F, -1.688F, 0.7298F, 0.336F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(35, 41).addBox(-0.7F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1037F, -1.6205F, -1.6216F, -3.1235F, 1.1949F, -1.4381F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(59, 72).addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3902F, -2.5087F, 0.7557F, 3.0525F, 0.6605F, -1.5642F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(77, 0).addBox(-0.9237F, 0.1246F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(18, 85).addBox(-0.5882F, -1.6203F, -0.0383F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7165F, -1.6825F, 3.0132F, 0.9903F, -1.617F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 23).addBox(-0.1F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2745F, -1.1228F, 0.3204F, 0.0804F, 0.5055F, 1.6711F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 58).addBox(-0.8F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2834F, -1.6323F, 0.0037F, 0.1323F, 1.0091F, 1.7442F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 54).addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2954F, -1.8319F, 0.0003F, 0.4466F, 1.4074F, 2.0735F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(81, 27).addBox(-1.7869F, 0.4539F, -0.6617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(75, 7).addBox(-1.8567F, 0.4297F, -1.7495F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, -0.6885F, -0.3896F, 0.3029F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(53, 20).addBox(-3.2869F, 0.4297F, -1.5359F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 50).addBox(-3.2869F, 0.6092F, -0.0807F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2869F, 3.9744F, 0.5963F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(25, 2).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 4.4176F, -0.9654F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(55, 29).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(57, 75).addBox(-0.5F, -1.2653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(21, 69).addBox(-0.5F, 1.9378F, -0.29F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.1652F, -1.7822F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(68, 43).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.3942F, -1.2621F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(54, 16).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7087F, -1.8929F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(40, 69).addBox(-1.0F, -0.023F, 0.0175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.1652F, -1.7822F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5F, -0.0303F, -0.9875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6652F, -0.0822F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(75, 10).addBox(-0.8F, 2.3909F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1454F, -1.2122F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 39).addBox(-1.3F, -0.8F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(42, 63).addBox(-0.6F, -1.2938F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.2131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(8, 79).addBox(-0.6F, -0.3656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 3.8131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(21, 73).addBox(-0.5F, -0.2938F, -0.9286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3F, 0.9131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, 1.3344F, -1.035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(13, 79).addBox(-0.5F, -0.0656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 5.3548F, 0.0407F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(79, 53).addBox(-1.4F, -1.9697F, 0.0561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.4426F, -0.4072F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9611F, -0.008F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 66).addBox(-1.0F, 0.0F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0F, -0.3289F, 0.8964F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(14, 69).addBox(-1.0F, -1.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3708F, 0.5086F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -3.8F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 3.5705F, 1.322F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(11, 46).addBox(-1.5F, -0.5634F, -1.7119F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8951F, 2.0967F, 2.0682F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.8045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 4.4176F, -0.9654F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(55, 29).mirror().addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(57, 75).mirror().addBox(-0.5F, -1.2653F, -0.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.955F, -0.0575F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-0.5F, 1.9378F, -0.29F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.1652F, -1.7822F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3942F, -1.2621F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.7087F, -1.8929F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-1.0F, -0.023F, 0.0175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.1652F, -1.7822F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.5F, -0.0303F, -0.9875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6652F, -0.0822F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(75, 10).mirror().addBox(-0.2F, 2.3909F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.1454F, -1.2122F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(57, 39).mirror().addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-0.4F, -1.2938F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(8, 79).mirror().addBox(-0.4F, -0.3656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.8131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.5F, -0.2938F, -0.9286F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.9131F, 0.9596F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5F, 1.3344F, -1.035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(13, 79).mirror().addBox(-0.5F, -0.0656F, -1.035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.5131F, 0.8596F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, 5.3548F, 0.0407F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(0.4F, -1.9697F, 0.0561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.4426F, -0.4072F, 0.192F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9611F, -0.008F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-1.0F, 0.0F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3289F, 0.8964F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(14, 69).mirror().addBox(-1.0F, -1.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3708F, 0.5086F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-1.0F, -3.8F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5705F, 1.322F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(11, 46).mirror().addBox(-1.5F, -0.5634F, -1.7119F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8951F, 2.0967F, 1.8937F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.8045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.5F, -0.0088F, 0.1309F, -0.0011F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(84, 52).addBox(0.0F, -1.5582F, -0.0426F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7985F, -1.6046F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(5, 84).addBox(0.0F, -1.3244F, -1.0623F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4985F, -4.5046F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-0.6492F, -0.2081F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4545F, -3.2535F, -0.5337F, 0.0735F, -0.9155F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-4.1449F, -1.7359F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4545F, -3.2535F, -0.4781F, -0.2573F, -1.4956F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-3.5732F, -0.3691F, -0.4805F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4545F, -3.2535F, -0.5351F, -0.0604F, -1.1406F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-0.6492F, -0.2081F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6545F, -5.2535F, -0.4908F, 0.1288F, -0.9112F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-3.5732F, -0.3691F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6545F, -5.2535F, -0.506F, 0.0031F, -1.1415F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(64, 64).mirror().addBox(-6.1449F, -1.7359F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.6545F, -5.2535F, -0.4728F, -0.1877F, -1.4968F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 17).mirror().addBox(-1.7472F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.08F, -1.3797F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(64, 31).addBox(0.5732F, -0.3691F, -0.4805F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4545F, -3.2535F, -0.5351F, 0.0604F, 1.1406F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 36).addBox(3.1449F, -1.7359F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4545F, -3.2535F, -0.4781F, 0.2573F, 1.4956F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(28, 69).addBox(-0.3508F, -0.2081F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4545F, -3.2535F, -0.5337F, -0.0735F, 0.9155F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(64, 64).addBox(3.1449F, -1.7359F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6545F, -5.2535F, -0.4728F, 0.1877F, 1.4968F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(64, 29).addBox(0.5732F, -0.3691F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6545F, -5.2535F, -0.506F, -0.0031F, 1.1415F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(21, 67).addBox(-0.3508F, -0.2081F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6545F, -5.2535F, -0.4908F, -0.1288F, 0.9112F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 83).addBox(0.0F, -1.4681F, 0.1142F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2985F, -3.7046F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(79, 17).addBox(-0.2528F, -0.3231F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.08F, -1.3797F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.1512F, 6.7474F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1657F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4248F, -6.5933F, -0.1806F, 0.2577F, -0.0465F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(17, 22).mirror().addBox(-9.2F, 0.0F, -0.1F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4972F, 10.0428F, -9.2928F, 0.5858F, 1.2647F, 0.5645F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-7.6F, 0.0F, -0.1F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4972F, 10.0428F, -9.2928F, 0.2085F, 1.0626F, 0.1617F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-6.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4972F, 10.0428F, -9.2928F, 0.2501F, 0.8514F, 0.1994F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 27).mirror().addBox(-5.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4972F, 10.0428F, -9.2928F, 0.2228F, 0.5295F, 0.1445F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(80, 13).mirror().addBox(-0.6492F, -0.2081F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -0.4602F, -0.3222F, 0.333F, -0.8723F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-3.5732F, -0.3691F, -0.4805F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -0.4602F, -0.3949F, 0.2406F, -1.1278F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(54, 14).mirror().addBox(-7.1449F, -1.7359F, -0.4805F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6703F, -0.4602F, -0.4536F, 0.0734F, -1.4979F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(81, 78).mirror().addBox(-0.6492F, -0.2081F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7703F, -2.4602F, -0.286F, 0.3729F, -0.8598F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 62).mirror().addBox(-3.5732F, -0.3691F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7703F, -2.4602F, -0.3715F, 0.2879F, -1.1217F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-8.1449F, -1.7359F, -0.4804F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7703F, -2.4602F, -0.4498F, 0.1257F, -1.4975F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 5).mirror().addBox(-0.8222F, -0.2457F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -4.5602F, -0.33F, 0.3636F, -0.7736F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -4.5602F, -0.4103F, 0.2684F, -1.0303F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-9.2581F, -1.8721F, -0.3159F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -4.5602F, -0.4776F, 0.0939F, -1.3985F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(68, 37).mirror().addBox(-4.7182F, -0.5751F, -0.4368F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9703F, -6.4602F, -0.4522F, 0.2321F, -0.9905F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 22).mirror().addBox(-1.8085F, -0.1108F, -0.4368F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9703F, -6.4602F, -0.3815F, 0.3387F, -0.7411F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4972F, 10.0428F, -9.2928F, 0.2371F, 0.0853F, 0.1281F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(35, 46).mirror().addBox(-9.1184F, -2.3729F, -0.4368F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9703F, -6.4602F, -0.5027F, 0.0456F, -1.3501F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-9.2579F, -2.5396F, -0.3344F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2703F, -10.3602F, -0.5079F, -0.0073F, -1.315F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 63).mirror().addBox(-4.9117F, -0.674F, -0.3344F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2703F, -10.3602F, -0.4761F, 0.1843F, -0.9603F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 45).mirror().addBox(-2.021F, -0.1562F, -0.3344F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.2703F, -10.3602F, -0.4177F, 0.2981F, -0.7173F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(44, 36).mirror().addBox(-9.0431F, -2.5609F, -0.4087F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3703F, -8.4602F, -0.5159F, 0.0308F, -1.3169F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-4.7223F, -0.7776F, -0.4087F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3703F, -8.4602F, -0.4702F, 0.2229F, -0.961F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(79, 15).mirror().addBox(-1.8649F, -0.3053F, -0.4087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3703F, -8.4602F, -0.4019F, 0.3341F, -0.7142F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(54, 14).addBox(3.1449F, -1.7359F, -0.4805F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -0.4602F, -0.4536F, -0.0734F, 1.4979F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(64, 20).addBox(0.5732F, -0.3691F, -0.4805F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -0.4602F, -0.3949F, -0.2406F, 1.1278F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(80, 13).addBox(-0.3508F, -0.2081F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.6703F, -0.4602F, -0.3222F, -0.333F, 0.8723F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(81, 78).addBox(-0.3508F, -0.2081F, -0.4804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7703F, -2.4602F, -0.286F, -0.3729F, 0.8598F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(64, 62).addBox(0.5732F, -0.3691F, -0.4804F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7703F, -2.4602F, -0.3715F, -0.2879F, 1.1217F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(44, 0).addBox(3.1449F, -1.7359F, -0.4804F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7703F, -2.4602F, -0.4498F, -0.1257F, 1.4975F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(83, 5).addBox(-0.1778F, -0.2457F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -4.5602F, -0.33F, -0.3636F, 0.7736F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(67, 26).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -4.5602F, -0.4103F, -0.2684F, 1.0303F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(11, 38).addBox(3.2581F, -1.8721F, -0.3159F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -4.5602F, -0.4776F, -0.0939F, 1.3985F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(68, 37).addBox(1.7182F, -0.5751F, -0.4368F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9703F, -6.4602F, -0.4522F, -0.2321F, 0.9905F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(79, 22).addBox(-0.1915F, -0.1108F, -0.4368F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9703F, -6.4602F, -0.3815F, -0.3387F, 0.7411F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(17, 22).addBox(0.2F, 0.0F, -0.1F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4972F, 10.0428F, -9.2928F, 0.5858F, -1.2647F, -0.5645F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(25, 0).addBox(-0.4F, 0.0F, -0.1F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4972F, 10.0428F, -9.2928F, 0.2085F, -1.0626F, -0.1617F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 21).addBox(0.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4972F, 10.0428F, -9.2928F, 0.2501F, -0.8514F, -0.1994F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 27).addBox(0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4972F, 10.0428F, -9.2928F, 0.2228F, -0.5295F, -0.1445F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(44, 38).addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4972F, 10.0428F, -9.2928F, 0.2371F, -0.0853F, -0.1281F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(35, 46).addBox(4.1184F, -2.3729F, -0.4368F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9703F, -6.4602F, -0.5027F, -0.0456F, 1.3501F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(44, 34).addBox(4.2579F, -2.5396F, -0.3344F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2703F, -10.3602F, -0.5079F, 0.0073F, 1.315F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 63).addBox(1.9117F, -0.674F, -0.3344F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2703F, -10.3602F, -0.4761F, -0.1843F, 0.9603F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(75, 45).addBox(0.021F, -0.1562F, -0.3344F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2703F, -10.3602F, -0.4177F, -0.2981F, 0.7173F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(44, 36).addBox(4.0431F, -2.5609F, -0.4087F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3703F, -8.4602F, -0.5159F, -0.0308F, 1.3169F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(65, 14).addBox(1.7223F, -0.7776F, -0.4087F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3703F, -8.4602F, -0.4702F, -0.2229F, 0.961F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(79, 15).addBox(-0.1351F, -0.3053F, -0.4087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3703F, -8.4602F, -0.4019F, -0.3341F, 0.7142F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(83, 57).addBox(0.0F, -2.7686F, -0.0381F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2949F, -6.9528F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(73, 83).addBox(0.0F, -1.6408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -1.0528F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(70, 83).addBox(0.0F, -1.6594F, -0.0812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -2.9528F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(28, 84).addBox(0.0F, -1.8938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, -4.8528F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(58, 80).addBox(-0.001F, -3.9518F, -0.2638F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -9.0528F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 19).addBox(0.0F, -0.999F, -0.0143F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4949F, -9.0528F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 78).addBox(-0.001F, -4.0433F, -0.0481F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -10.6528F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(14, 58).addBox(0.0F, -1.1002F, 0.0233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8949F, -10.9528F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -10.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9932F, -10.7795F, -0.3835F, 0.2028F, -0.0811F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 85).addBox(-1.0F, -1.9239F, -0.6353F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1888F, -1.2421F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(73, 28).addBox(-1.001F, -4.8368F, -0.0579F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8112F, -1.8421F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(29, 78).addBox(-0.001F, -3.9966F, -0.0128F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2094F, -3.8777F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(47, 85).addBox(0.0F, -1.2891F, 0.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5094F, -3.8777F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(62, 75).addBox(0.0F, -3.3187F, 0.041F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5094F, -5.5777F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(-0.3695F, 0.0117F, 1.1548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 1.9706F, -0.2141F, 0.433F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(-0.3695F, 2.4168F, 5.5116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 2.1452F, -0.2141F, 0.433F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-5.7222F, -0.3953F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8888F, -4.7421F, -0.4935F, 0.3236F, -1.3659F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-2.7318F, 0.3227F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8888F, -4.7421F, -0.3985F, 0.4372F, -1.1115F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-1.9184F, 0.179F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -3.2421F, -0.0719F, 0.5803F, -0.6191F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(-4.8993F, -0.3237F, -0.3655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -3.2421F, -0.2353F, 0.5399F, -0.9248F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 47).mirror().addBox(-7.3834F, -2.2123F, -0.3655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.1888F, -3.2421F, -0.4324F, 0.4061F, -1.3512F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(26, 63).mirror().addBox(-7.8019F, -2.58F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6888F, -1.1421F, -0.4385F, 0.3177F, -1.4255F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6888F, -1.1421F, -0.2821F, 0.4613F, -1.0194F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6888F, -1.1421F, -0.1449F, 0.5172F, -0.7294F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.3695F, -0.3563F, 0.0246F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 1.5517F, -0.2141F, 0.433F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(75, 2).mirror().addBox(-0.3695F, -7.3218F, -1.6394F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, -0.2634F, -0.2141F, 0.433F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.3695F, -2.4136F, 2.9061F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 1.0631F, -0.2141F, 0.433F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-0.3695F, 0.5904F, 4.3415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(33, 29).mirror().addBox(-0.3695F, -0.228F, -0.1144F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 1.7437F, -0.2141F, 0.433F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(11, 31).mirror().addBox(-0.3695F, -1.1326F, 2.9215F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 1.6041F, -0.2141F, 0.433F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(17, 24).mirror().addBox(-1.2026F, -0.1188F, 0.8388F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4627F, 4.4869F, -2.4976F, 1.6572F, 0.2332F, 0.5107F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-1.8587F, -0.0125F, -0.5861F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.492F, 7.2633F, -2.3908F, 0.0367F, -0.0589F, 0.159F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-3.9F, 0.0F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4955F, 8.136F, 2.115F, 0.3445F, 0.1086F, 0.2561F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-3.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4991F, 8.1573F, 0.0771F, 0.3376F, 0.1208F, 0.3727F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(61, 47).addBox(2.7222F, -0.3953F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8888F, -4.7421F, -0.4935F, -0.3236F, 1.3659F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(58, 27).addBox(-0.2682F, 0.3227F, -0.2281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8888F, -4.7421F, -0.3985F, -0.4372F, 1.1115F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(79, 47).addBox(-0.0816F, 0.179F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -3.2421F, -0.0719F, -0.5803F, 0.6191F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(59, 70).addBox(1.8993F, -0.3237F, -0.3655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -3.2421F, -0.2353F, -0.5399F, 0.9248F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(70, 47).addBox(4.3834F, -2.2123F, -0.3655F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1888F, -3.2421F, -0.4324F, -0.4061F, 1.3512F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(26, 63).addBox(4.8019F, -2.58F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6888F, -1.1421F, -0.4385F, -0.3177F, 1.4255F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(63, 16).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6888F, -1.1421F, -0.2821F, -0.4613F, 1.0194F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(63, 18).addBox(-0.5254F, 0.1468F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6888F, -1.1421F, -0.1449F, -0.5172F, 0.7294F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 31).addBox(-0.6305F, -0.3563F, 0.0246F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 1.5517F, 0.2141F, -0.433F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(75, 2).addBox(-0.6305F, -7.3218F, -1.6394F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, -0.2634F, 0.2141F, -0.433F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(22, 31).addBox(-0.6305F, -2.4136F, 2.9061F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 1.0631F, 0.2141F, -0.433F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 80).addBox(-0.6305F, 2.4168F, 5.5116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 2.1452F, 0.2141F, -0.433F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(49, 2).addBox(-0.6305F, 0.5904F, 4.3415F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F))
				.texOffs(33, 29).addBox(-0.6305F, -0.228F, -0.1144F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 1.7437F, 0.2141F, -0.433F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(14, 65).addBox(-0.6305F, 0.0117F, 1.1548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 1.9706F, 0.2141F, -0.433F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(11, 31).addBox(-0.6305F, -1.1326F, 2.9215F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 1.6041F, 0.2141F, -0.433F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(17, 24).addBox(0.2026F, -0.1188F, 0.8388F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4627F, 4.4869F, -2.4976F, 1.6572F, -0.2332F, -0.5107F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(68, 0).addBox(-1.1413F, -0.0125F, -0.5861F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.492F, 7.2633F, -2.3908F, 0.0367F, 0.0589F, -0.159F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(57, 0).addBox(-0.1F, 0.0F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4955F, 8.136F, 2.115F, 0.3445F, -0.1086F, -0.2561F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(57, 37).addBox(-0.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4991F, 8.1573F, 0.0771F, 0.3376F, -0.1208F, -0.3727F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(26, 65).addBox(-1.792F, 0.5736F, -2.5805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.292F, 7.3633F, -0.3908F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(17, 13).addBox(-1.792F, 0.2925F, -1.0828F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.292F, 7.3633F, -0.3908F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -1.908F, 3.84F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0094F, -9.5777F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 6.3815F, -2.338F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftarm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(75, 69).addBox(-1.0F, 0.3F, -1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(12, 76).addBox(-1.0F, 0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 2.4677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(18, 57).addBox(-0.5F, -1.0F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5085F, -0.2353F, 2.3157F, 1.1955F, 0.0017F, 0.0005F));

		PartDefinition cube_r209 = leftarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -0.2F, 1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(31, 48).addBox(-0.5F, -0.2F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.0244F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r210 = leftarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(80, 38).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0039F, 5.0712F, 1.9996F, -0.3753F, 0.0005F, -0.0017F));

		PartDefinition cube_r211 = leftarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(77, 49).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 3.9332F, 1.6189F, 0.3228F, 0.0005F, -0.0017F));

		PartDefinition cube_r212 = leftarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 72).addBox(-0.01F, -0.3076F, 0.0296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5673F, 0.0378F, 0.4362F, 0.0014F, -0.001F));

		PartDefinition cube_r213 = leftarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(32, 83).addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.2754F, 1.9453F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(13, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.0712F, 1.3277F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(76, 25).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.5419F, 1.2959F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2616F, 6.7705F, 2.6352F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(80, 10).addBox(-0.4F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -0.11F, 0.6563F, 1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r217 = leftarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 30).addBox(-1.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -1.8862F, 1.8117F, 1.5708F, -0.8465F, -1.5708F));

		PartDefinition cube_r218 = leftarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(48, 61).addBox(-1.6F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.095F)), PartPose.offsetAndRotation(-0.1764F, -1.9461F, 0.4201F, 1.5708F, -0.4102F, -1.5708F));

		PartDefinition cube_r219 = leftarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(21, 61).addBox(-1.5256F, -0.8299F, -0.4596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.0702F, 1.5549F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition cube_r220 = leftarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(49, 44).addBox(-0.4335F, -4.0622F, 0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(66, 74).addBox(-0.0335F, -0.0622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 3.8419F, 0.0074F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition cube_r221 = leftarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(47, 65).addBox(0.1665F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3236F, -0.0046F, -0.6664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(54, 7).addBox(-1.2F, 0.0F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.6F, 0.8F, 1.3963F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(72, 16).addBox(-1.0F, 0.0601F, -0.6907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, 4.6494F, 0.4629F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 9).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-4.5F, 6.3815F, -2.338F));

		PartDefinition cube_r223 = rightarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-1.0F, 0.3F, -1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(12, 76).mirror().addBox(-1.0F, 0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8609F, 2.4677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(18, 57).mirror().addBox(-1.5F, -1.0F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5085F, -0.2353F, 2.3157F, 1.1955F, -0.0017F, -0.0005F));

		PartDefinition cube_r225 = rightarm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-1.5F, -0.2F, 1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(31, 48).mirror().addBox(-1.5F, -0.2F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.0244F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r226 = rightarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(80, 38).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0039F, 5.0712F, 1.9996F, -0.3753F, -0.0005F, 0.0017F));

		PartDefinition cube_r227 = rightarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 3.9332F, 1.6189F, 0.3228F, -0.0005F, 0.0017F));

		PartDefinition cube_r228 = rightarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-0.99F, -0.3076F, 0.0296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5673F, 0.0378F, 0.4362F, -0.0014F, 0.001F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2754F, 1.9453F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(13, 83).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0712F, 1.3277F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5419F, 1.2959F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2616F, 6.7705F, 2.6352F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightarm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-0.6F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.11F, 0.6563F, 1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r233 = rightarm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(76, 30).mirror().addBox(0.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -1.8862F, 1.8117F, 1.5708F, 0.8465F, 1.5708F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(48, 61).mirror().addBox(-0.4F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.095F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -1.9461F, 0.4201F, 1.5708F, 0.4102F, 1.5708F));

		PartDefinition cube_r235 = rightarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(21, 61).mirror().addBox(0.5256F, -0.8299F, -0.4596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.136F, -0.0702F, 1.5549F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r236 = rightarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-0.5665F, -4.0622F, 0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(66, 74).mirror().addBox(-0.9665F, -0.0622F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 3.8419F, 0.0074F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition cube_r237 = rightarm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(47, 65).mirror().addBox(-1.1665F, -0.1622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -0.0046F, -0.6664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(54, 7).mirror().addBox(-0.8F, 0.0F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 6.6F, 0.8F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(-1.0F, 0.0601F, -0.6907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2F, 4.6494F, 0.4629F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4459F, -6.2693F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(7, 63).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(80, 2).addBox(1.1F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1945F, -0.4167F, 0.0F, 0.1134F, 1.5708F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(80, 2).addBox(0.0F, -2.1605F, -0.0674F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5873F, -0.9213F, -0.1134F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.007F, -2.025F, -0.1174F, 0.2601F, -0.0303F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(65, 49).addBox(-0.5F, -1.1F, 2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(64, 83).addBox(1.2F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5764F, -0.1999F, 0.0F, 0.1833F, 1.5708F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(64, 83).addBox(0.0F, -1.8605F, -0.2674F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7727F, -0.5854F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(38, 53).addBox(-0.5F, -0.5932F, -2.9561F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5179F, -1.7365F, -0.1634F, 0.4312F, -0.0688F));

		PartDefinition cube_r245 = neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-0.2F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0932F, -1.9561F, 0.0F, -0.3142F, 0.0F));

		PartDefinition cube_r246 = neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(73, 19).addBox(-0.8F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0932F, -1.9561F, 0.0F, 0.3142F, 0.0F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(0.0F, -0.0041F, -0.7284F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.027F, -2.3497F, 0.2715F, -0.0973F, 0.3358F));

		PartDefinition cube_r248 = neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(73, 61).addBox(0.0F, -0.0041F, -0.7284F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.027F, -2.3497F, 0.2715F, 0.0973F, -0.3358F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2932F, -3.256F, -0.338F, 0.3095F, 0.409F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(66, 39).addBox(-0.5F, 0.4449F, -1.2056F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(33, 76).addBox(0.0F, -0.0551F, -1.0056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9344F, -3.5244F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(66, 33).addBox(-0.8F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(29, 53).addBox(-0.2F, -0.5F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5298F, -1.5129F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(19, 78).addBox(0.0F, -0.6419F, -0.6432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2298F, -0.5129F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(68, 6).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.6266F, 0.3099F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.1176F, -1.8225F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(0.5532F, 0.3674F, -0.007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.0F, -3.6F, 0.7407F, -0.3445F, 0.3538F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(-0.4282F, -0.8103F, -0.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(66, 53).mirror().addBox(-0.4282F, -0.8103F, -1.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.912F, 0.5468F, -2.7281F, 1.2294F, -0.3445F, 0.3538F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(66, 53).addBox(-0.5718F, -0.8103F, -1.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(66, 53).addBox(-0.5718F, -0.8103F, -0.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.912F, 0.5468F, -2.7281F, 1.2294F, 0.3445F, -0.3538F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(66, 53).addBox(-1.5532F, 0.3674F, -0.007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, -1.0F, -3.6F, 0.7407F, 0.3445F, -0.3538F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 53).addBox(0.0F, 0.5552F, -0.007F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -3.6F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(67, 2).addBox(-0.5F, -0.767F, -0.224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, 5.6468F, -8.1255F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(47, 53).addBox(-0.5F, -0.767F, -0.224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.1392F, -8.9958F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(42, 83).addBox(-0.5F, -0.167F, -1.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 75).addBox(-0.5F, -0.167F, -0.824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.466F, -9.5124F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(66, 66).addBox(-0.5F, -0.767F, -1.824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.1416F, -7.8347F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F, -0.067F, -3.224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.7097F, -5.9437F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(38, 2).addBox(-1.0F, 0.9861F, -2.8962F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 53).addBox(-0.5F, -0.0139F, -2.8962F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7097F, -5.9437F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(45, 8).addBox(-2.5F, -0.051F, -1.1309F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.9761F, -5.0934F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(34, 58).addBox(-2.5F, -0.0213F, 0.0528F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 2.0091F, -5.1248F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(22, 47).addBox(-2.5F, -0.5363F, -0.5683F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.4F, -4.1F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(20, 52).addBox(-1.0F, -2.296F, -2.3751F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.9016F, -0.9296F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(26, 75).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.0016F, -2.6296F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(56, 50).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.1023F, -3.2233F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(56, 54).addBox(-1.5F, -1.9552F, -0.9215F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.8703F, -1.5918F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(56, 23).addBox(-1.5F, -1.4552F, -0.9215F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.5168F, -1.9453F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(24, 85).mirror().addBox(-0.5F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 7.1641F, -5.6936F, 0.3178F, -0.1493F, -0.0489F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(38, 78).mirror().addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.4241F, -3.2541F, 0.5427F, -0.0748F, -0.045F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(24, 85).addBox(0.5F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 7.1641F, -5.6936F, 0.3178F, 0.1493F, 0.0489F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(38, 78).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.4241F, -3.2541F, 0.5427F, 0.0748F, 0.045F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.9493F, -2.1935F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(45, 76).addBox(-0.5F, -0.0341F, -0.0336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9656F, -3.9244F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -2.0287F, -2.268F, 0.9013F, 0.3074F, 0.1542F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(82, 7).addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -2.0287F, -2.268F, 0.9013F, -0.3074F, -0.1542F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(77, 34).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7007F, -1.8906F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(76, 76).addBox(-0.502F, -0.0276F, -0.0021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9204F, -3.5597F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(81, 30).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6618F, -0.7902F, -0.3665F, 0.0F, 0.0F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 7.8742F, -10.1729F));

		PartDefinition cube_r284 = leftMaxilla.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(41, 58).addBox(-0.4887F, -1.8924F, -0.0739F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7933F, -1.706F, 6.1702F, 0.7245F, 0.1937F, 0.0249F));

		PartDefinition cube_r285 = leftMaxilla.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(35, 63).addBox(-0.4887F, -0.8717F, -1.8637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5991F, -1.0805F, 5.2598F, 0.4278F, 0.1937F, 0.0249F));

		PartDefinition cube_r286 = leftMaxilla.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(27, 58).addBox(-0.4887F, -1.5924F, -0.5739F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.5412F, -1.2445F, 4.944F, 0.5849F, 0.1937F, 0.0249F));

		PartDefinition leftMaxilla2 = head.addOrReplaceChild("leftMaxilla2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.8742F, -10.1729F));

		PartDefinition cube_r287 = leftMaxilla2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(-0.5113F, -1.8924F, -0.0739F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.7933F, -1.706F, 6.1702F, 0.7245F, -0.1937F, -0.0249F));

		PartDefinition cube_r288 = leftMaxilla2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-0.5113F, -0.8717F, -1.8637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5991F, -1.0805F, 5.2598F, 0.4278F, -0.1937F, -0.0249F));

		PartDefinition cube_r289 = leftMaxilla2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(27, 58).mirror().addBox(-0.5113F, -1.5924F, -0.5739F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(-0.5412F, -1.2445F, 4.944F, 0.5849F, -0.1937F, -0.0249F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 7.8742F, -10.1729F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(0.9F, 0.4736F, 2.2991F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(61, 10).addBox(-0.8266F, -0.9292F, -0.3037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F))
				.texOffs(0, 49).addBox(-0.8266F, -0.5292F, -0.5037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.9716F, 0.5963F, -4.4114F, 0.7241F, -0.3144F, -0.4962F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(61, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6038F, -0.3525F, -3.1578F, 2.9884F, -1.2967F, 2.8064F));

		PartDefinition cube_r292 = leftOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(14, 61).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.7641F, -1.0468F, -4.6078F, 0.0435F, -0.3144F, -0.4962F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(61, 6).addBox(-0.8266F, -1.0292F, -0.4037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9716F, 0.5963F, -4.4114F, 1.143F, -0.3144F, -0.4962F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 70).addBox(-0.9F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9818F, 3.824F, -6.107F, 0.6546F, 0.2377F, 0.3915F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 65).addBox(-0.5F, -0.9F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F))
				.texOffs(28, 71).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1143F))
				.texOffs(7, 71).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0308F, 2.729F, -4.8974F, 1.4058F, 0.1122F, 0.2955F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(71, 57).addBox(0.466F, -1.0208F, 0.4173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.5309F, 4.1328F, -5.9007F, 0.8648F, 0.1122F, 0.2955F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(68, 70).addBox(0.466F, -0.9208F, 0.3173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5309F, 4.1328F, -5.9007F, 1.0044F, 0.1122F, 0.2955F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 79).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0031F, 3.7485F, -7.8423F, 2.1386F, 0.4301F, 0.0326F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(57, 58).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.11F, 4.247F, -7.4562F, 2.7459F, 0.3656F, 0.1202F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(40, 48).addBox(-0.8F, -0.7F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5812F, 2.1469F, -7.0473F, 0.9687F, -0.0925F, -0.2228F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(34, 9).addBox(-0.5F, -0.7F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1223F, 3.1594F, -7.9528F, 0.8257F, 0.2604F, 0.1432F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-0.9F, 0.4736F, 2.2991F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-0.1734F, -0.9292F, -0.3037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.1734F, -0.5292F, -0.5037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.9716F, 0.5963F, -4.4114F, 0.7241F, 0.3144F, 0.4962F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6038F, -0.3525F, -3.1578F, 2.9884F, 1.2967F, -2.8064F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.7641F, -1.0468F, -4.6078F, 0.0435F, 0.3144F, 0.4962F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(61, 6).mirror().addBox(-0.1734F, -1.0292F, -0.4037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9716F, 0.5963F, -4.4114F, 1.143F, 0.3144F, 0.4962F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.1F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9818F, 3.824F, -6.107F, 0.6546F, -0.2377F, -0.3915F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-0.5F, -0.9F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false)
				.texOffs(28, 71).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1143F)).mirror(false)
				.texOffs(7, 71).mirror().addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0308F, 2.729F, -4.8974F, 1.4058F, -0.1122F, -0.2955F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-1.466F, -1.0208F, 0.4173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.5309F, 4.1328F, -5.9007F, 0.8648F, -0.1122F, -0.2955F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(-1.466F, -0.9208F, 0.3173F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.5309F, 4.1328F, -5.9007F, 1.0044F, -0.1122F, -0.2955F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0031F, 3.7485F, -7.8423F, 2.1386F, -0.4301F, -0.0326F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.11F, 4.247F, -7.4562F, 2.7459F, -0.3656F, -0.1202F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(40, 48).mirror().addBox(-0.2F, -0.7F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5812F, 2.1469F, -7.0473F, 0.9687F, 0.0925F, 0.2228F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-0.5F, -0.7F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1223F, 3.1594F, -7.9528F, 0.8257F, -0.2604F, -0.1432F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.4593F, 5.1082F, -9.3221F));

		PartDefinition cube_r314 = bone.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(18, 82).addBox(-0.664F, -1.466F, -0.4286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0874F, 0.5683F, 0.3719F, 1.6109F, -0.116F, 0.0956F));

		PartDefinition cube_r315 = bone.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(23, 82).addBox(-0.664F, -1.2447F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0874F, 0.5683F, 0.3719F, 1.1746F, -0.116F, 0.0956F));

		PartDefinition cube_r316 = bone.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(82, 33).addBox(-0.664F, -0.6447F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0874F, 0.5683F, 0.3719F, 1.1809F, -0.0115F, 0.0952F));

		PartDefinition cube_r317 = bone.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 61).addBox(-0.5018F, -1.4913F, -0.4292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3597F, -0.4414F, -1.3268F, 0.8999F, -0.2474F, 0.0939F));

		PartDefinition cube_r318 = bone.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(78, 57).addBox(-0.5018F, -1.4317F, -0.6939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.3597F, -0.4414F, -1.3268F, 0.673F, -0.2474F, 0.0939F));

		PartDefinition cube_r319 = bone.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(82, 44).addBox(-0.5018F, -0.0952F, -0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(82, 41).addBox(-0.5018F, -0.0952F, -0.8435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4597F, -0.4414F, -1.3268F, 1.0508F, -0.4634F, 0.2371F));

		PartDefinition cube_r320 = bone.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(50, 78).addBox(-0.664F, -1.4955F, -0.5078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0874F, 0.5683F, 0.3719F, 1.0873F, -0.116F, 0.0956F));

		PartDefinition cube_r321 = bone.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(37, 82).addBox(-0.664F, -1.0094F, 0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0874F, 0.5683F, 0.3719F, 1.2618F, -0.116F, 0.0956F));

		PartDefinition cube_r322 = bone.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(8, 83).addBox(-0.664F, -0.942F, 0.3308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0874F, 0.5683F, 0.3719F, 1.8378F, -0.116F, 0.0956F));

		PartDefinition cube_r323 = bone.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(81, 24).addBox(-0.3F, -0.9382F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0407F, 0.8691F, 3.2047F, 1.6539F, 0.0871F, 0.0526F));

		PartDefinition cube_r324 = bone.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(65, 22).addBox(-0.3F, -0.4031F, -1.7681F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0407F, 0.8691F, 3.2047F, 0.8511F, 0.0871F, 0.0526F));

		PartDefinition cube_r325 = bone.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(80, 80).addBox(-0.3F, -0.5368F, -2.3416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0407F, 0.8691F, 3.2047F, 0.9383F, 0.0871F, 0.0526F));

		PartDefinition cube_r326 = bone.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(68, 10).addBox(-0.3F, 0.3565F, -2.309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0407F, 0.8691F, 3.2047F, 0.5195F, 0.0871F, 0.0526F));

		PartDefinition cube_r327 = bone.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(7, 67).addBox(-0.9F, -0.067F, -0.224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.3407F, -0.5106F, 1.0469F, 0.6843F, -0.0949F, -0.0771F));

		PartDefinition cube_r328 = bone.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(33, 67).addBox(-0.5F, -0.767F, -1.824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0593F, 0.0334F, 1.4874F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r329 = bone.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(24, 78).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0749F, 0.0828F, 0.598F, 1.7156F, -0.116F, 0.0607F));

		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.4593F, 5.1082F, -9.3221F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(18, 82).mirror().addBox(-0.336F, -1.466F, -0.4286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.5683F, 0.3719F, 1.6109F, 0.116F, -0.0956F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(23, 82).mirror().addBox(-0.336F, -1.2447F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.5683F, 0.3719F, 1.1746F, 0.116F, -0.0956F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-0.336F, -0.6447F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.5683F, 0.3719F, 1.1809F, 0.0115F, -0.0952F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-0.4982F, -1.4913F, -0.4292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3597F, -0.4414F, -1.3268F, 0.8999F, 0.2474F, -0.0939F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-0.4982F, -1.4317F, -0.6939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.3597F, -0.4414F, -1.3268F, 0.673F, 0.2474F, -0.0939F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-0.4982F, -0.0952F, -0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(82, 41).mirror().addBox(-0.4982F, -0.0952F, -0.8435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.4597F, -0.4414F, -1.3268F, 1.0508F, 0.4634F, -0.2371F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-0.336F, -1.4955F, -0.5078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.5683F, 0.3719F, 1.0873F, 0.116F, -0.0956F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(37, 82).mirror().addBox(-0.336F, -1.0094F, 0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.5683F, 0.3719F, 1.2618F, 0.116F, -0.0956F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(8, 83).mirror().addBox(-0.336F, -0.942F, 0.3308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0874F, 0.5683F, 0.3719F, 1.8378F, 0.116F, -0.0956F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(81, 24).mirror().addBox(-0.7F, -0.9382F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0407F, 0.8691F, 3.2047F, 1.6539F, -0.0871F, -0.0526F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-0.7F, -0.4031F, -1.7681F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.0407F, 0.8691F, 3.2047F, 0.8511F, -0.0871F, -0.0526F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.7F, -0.5368F, -2.3416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0407F, 0.8691F, 3.2047F, 0.9383F, -0.0871F, -0.0526F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-0.7F, 0.3565F, -2.309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.0407F, 0.8691F, 3.2047F, 0.5195F, -0.0871F, -0.0526F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-0.1F, -0.067F, -0.224F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.3407F, -0.5106F, 1.0469F, 0.6843F, 0.0949F, 0.0771F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(33, 67).mirror().addBox(-0.5F, -0.767F, -1.824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0593F, 0.0334F, 1.4874F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(24, 78).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0749F, 0.0828F, 0.598F, 1.7156F, 0.116F, -0.0607F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.2797F, -1.9798F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(0.473F, -0.7039F, -1.22F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.8771F, -2.7504F, -1.5577F, -0.0716F, 0.0122F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(37, 85).mirror().addBox(0.0471F, 0.6043F, -0.566F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5864F, -6.7388F, -1.8373F, -0.4198F, 0.0747F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(55, 80).mirror().addBox(0.473F, 1.5677F, -0.843F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.8771F, -2.7504F, -1.8195F, -0.0716F, 0.0122F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(0.0365F, -0.0377F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5864F, -6.7388F, -1.8827F, -0.2487F, 0.0129F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(47, 71).mirror().addBox(0.1F, -1.6383F, -0.9036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.8771F, -2.7504F, -1.4137F, -0.1047F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(0.1F, 1.2015F, -0.4965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.8771F, -2.7504F, -1.7802F, -0.1047F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.1F, -1.8732F, 0.1682F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.8771F, -2.7504F, -1.7628F, -0.1047F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(48, 82).mirror().addBox(-0.9F, -1.8184F, -1.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(48, 82).addBox(1.1F, -1.8184F, -1.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.8041F, -4.0972F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(0.1F, 0.9761F, 0.2991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.8771F, -2.7504F, -1.885F, -0.1047F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(7, 58).addBox(1.9F, 0.0F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, 1.5772F, 1.6606F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(52, 73).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(52, 73).addBox(1.9F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8F, 2.3992F, -0.5256F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-1.0F, -0.1187F, -1.9433F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 44).addBox(1.4F, -0.1187F, -1.9433F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 5.7064F, -0.0287F, -1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(59, 66).mirror().addBox(-1.0F, -0.0187F, 0.2567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(59, 66).addBox(1.4F, -0.0187F, 0.2567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3F, 3.3771F, 0.6148F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(-0.5F, 0.4F, -0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(45, 14).addBox(1.9F, 0.4F, -0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8F, 2.4617F, 0.2374F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(65, 79).mirror().addBox(-0.5F, 0.2F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(83, 62).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 79).addBox(2.1F, 0.2F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(83, 62).addBox(2.1F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9F, 0.7191F, 1.1103F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(70, 79).mirror().addBox(-1.1F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(70, 79).addBox(1.5F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -0.5229F, -0.3852F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, 0.9F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 61).addBox(1.4F, 0.9F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, -0.5229F, -0.2852F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(32, 80).mirror().addBox(-0.5872F, -0.5F, -1.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 19).mirror().addBox(-0.5872F, -0.5F, -0.7622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.028F, 1.1645F, -9.465F, -0.6008F, -1.1678F, -1.171F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(-0.5613F, -0.5F, -0.4344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.028F, 1.1645F, -9.465F, -0.3828F, -0.9353F, -1.4201F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(0.1155F, -0.5397F, 0.1419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.5864F, -6.7388F, -2.0906F, -0.1742F, 0.0978F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(82, 83).addBox(-0.473F, -0.7039F, -1.22F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8771F, -2.7504F, -1.5577F, 0.0716F, -0.0122F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(37, 85).addBox(-0.0471F, 0.6043F, -0.566F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5864F, -6.7388F, -1.8373F, 0.4198F, -0.0747F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(55, 80).addBox(-0.473F, 1.5677F, -0.843F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8771F, -2.7504F, -1.8195F, 0.0716F, -0.0122F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(82, 49).addBox(-1.0365F, -0.0377F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5864F, -6.7388F, -1.8827F, 0.2487F, -0.0129F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(47, 71).addBox(-1.1F, -1.6383F, -0.9036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 3.8771F, -2.7504F, -1.4137F, 0.1047F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(72, 49).addBox(-1.1F, 1.2015F, -0.4965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 3.8771F, -2.7504F, -1.7802F, 0.1047F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 74).addBox(-1.1F, -1.8732F, 0.1682F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0F, 3.8771F, -2.7504F, -1.7628F, 0.1047F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(35, 71).addBox(-1.1F, 0.9761F, 0.2991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, 3.8771F, -2.7504F, -1.885F, 0.1047F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(81, 72).addBox(-1.0F, 0.9964F, -0.061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.4771F, -7.4852F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(32, 80).addBox(-0.4128F, -0.5F, -1.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 19).addBox(-0.4128F, -0.5F, -0.7622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.172F, 1.1645F, -9.465F, -0.6008F, 1.1678F, 1.171F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(52, 69).addBox(-0.4387F, -0.5F, -0.4344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.172F, 1.1645F, -9.465F, -0.3828F, 0.9353F, 1.4201F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(40, 73).addBox(-1.1155F, -0.5397F, 0.1419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.5864F, -6.7388F, -2.0906F, 0.1742F, -0.0978F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5463F, 0.8301F, -0.6222F, -0.1782F, 0.1265F));

		PartDefinition cube_r378 = tail.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(85, 38).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5103F, 3.286F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r379 = tail.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(85, 10).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 0.786F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 40).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, 0.2739F, -0.2947F, -0.0814F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1176F, 3.895F, 0.6396F, -0.3209F, -0.2304F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 35).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1425F, 3.7909F, 0.6229F, -0.4F, -0.2727F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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