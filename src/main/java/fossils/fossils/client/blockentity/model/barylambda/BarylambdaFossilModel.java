package fossils.fossils.client.blockentity.model.barylambda;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BarylambdaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
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
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public BarylambdaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
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
		this.head = this.neck.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.6804F, 7.0354F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 23).addBox(0.0F, -2.8986F, 1.9389F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 29).addBox(0.0F, -0.6F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5131F, -2.1582F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-0.3626F, -0.2618F, -2.135F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6601F, -2.2843F, -0.7439F, -2.373F, -0.6214F, 1.4534F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 13).mirror().addBox(-2.0029F, -0.1272F, -2.6928F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6601F, -2.2843F, -0.7439F, -0.9823F, 0.1659F, -1.2827F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(63, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7181F, 4.2136F, 2.5094F, -0.025F, 0.6581F, 0.4045F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5203F, 0.0277F, -1.0587F, 0.7846F, -1.2481F, -2.598F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-1.0F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.849F, 3.5702F, -0.3705F, -0.6936F, -0.4512F, 1.1079F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 19).mirror().addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0858F, 2.4916F, -0.7889F, -0.8406F, 0.7703F, 0.1787F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 79).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.602F, -2.0453F, -2.0371F, -2.6766F, -0.9903F, 1.617F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(-0.1838F, -0.5525F, -1.2749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2849F, 0.4553F, -1.3175F, 1.2547F, -1.3328F, -3.086F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 56).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.362F, 1.6359F, 0.1365F, 0.3234F, -0.7883F, -2.0731F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-1.2002F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2204F, 3.3438F, 2.3985F, 2.3916F, -0.9047F, 1.7321F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 56).mirror().addBox(-0.9234F, -0.5F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2204F, 3.3438F, 2.3985F, 1.909F, -1.1079F, 2.2962F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 23).mirror().addBox(-1.9F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2395F, 2.4159F, 1.177F, -2.2565F, -1.1343F, 1.3976F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 57).mirror().addBox(0.1589F, -0.2618F, -1.8452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6601F, -2.2843F, -0.7439F, -1.7003F, -0.9643F, 0.5524F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-1.0564F, -0.3682F, -1.61F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6601F, -2.2843F, -0.7439F, -1.1863F, -0.7631F, -0.1129F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.8977F, -0.1272F, -1.8628F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6601F, -2.2843F, -0.7439F, -1.02F, -0.2737F, -0.6255F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.0816F, -0.797F, -0.1733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5084F, 1.8072F, 1.6002F, 2.7613F, -0.9353F, 1.056F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.6F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5084F, 2.2072F, 1.1002F, 2.1179F, -1.3099F, 1.7531F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 6).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(63, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7181F, 4.2136F, 2.5094F, -0.025F, -0.6581F, -0.4045F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(50, 64).addBox(-1.0F, -0.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.849F, 3.5702F, -0.3705F, -0.6936F, 0.4512F, -1.1079F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(66, 19).addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0858F, 2.4916F, -0.7889F, -0.8406F, -0.7703F, -0.1787F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(6, 79).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.602F, -2.0453F, -2.0371F, -2.6766F, 0.9903F, -1.617F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 11).addBox(-0.8162F, -0.5525F, -1.2749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2849F, 0.4553F, -1.3175F, 1.2547F, 1.3328F, 3.086F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(33, 56).addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5203F, 0.0277F, -1.0587F, 0.7846F, 1.2481F, 2.598F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 56).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.362F, 1.6359F, 0.1365F, 0.3234F, 0.7883F, 2.0731F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(65, 35).addBox(-0.7998F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2204F, 3.3438F, 2.3985F, 2.3916F, 0.9047F, -1.7321F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 56).addBox(-1.0766F, -0.5F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2204F, 3.3438F, 2.3985F, 1.909F, 1.1079F, -2.2962F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(28, 23).addBox(-1.1F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2395F, 2.4159F, 1.177F, -2.2565F, 1.1343F, -1.3976F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(28, 18).addBox(-1.6374F, -0.2618F, -2.135F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6601F, -2.2843F, -0.7439F, -2.373F, 0.6214F, -1.4534F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 57).addBox(-1.1589F, -0.2618F, -1.8452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6601F, -2.2843F, -0.7439F, -1.7003F, 0.9643F, -0.5524F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(11, 33).addBox(-0.9436F, -0.3682F, -1.61F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6601F, -2.2843F, -0.7439F, -1.1863F, 0.7631F, 0.1129F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 13).addBox(0.0029F, -0.1272F, -2.6928F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6601F, -2.2843F, -0.7439F, -0.9823F, -0.1659F, 1.2827F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 33).addBox(-0.1023F, -0.1272F, -1.8628F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.6601F, -2.2843F, -0.7439F, -1.02F, 0.2737F, 0.6255F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 76).addBox(-0.9184F, -0.797F, -0.1733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5084F, 1.8072F, 1.6002F, 2.7613F, 0.9353F, -1.056F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 76).addBox(-0.4F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5084F, 2.2072F, 1.1002F, 2.1179F, 1.3099F, -1.7531F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(27, 39).addBox(-2.0381F, 1.3847F, -0.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5381F, 2.3338F, 0.6478F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -1.0986F, 0.0389F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 2.9144F, -0.0176F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(18, 44).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0493F, -0.7746F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -4.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7551F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(57, 53).addBox(-1.0F, -2.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.0955F, 0.4596F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 29).addBox(-0.5F, -4.1039F, -0.0884F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3431F, -0.1713F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8314F, 0.4255F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 10).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.7689F, -0.0779F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 39).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4124F, 1.1521F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 55).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 3.9712F, 1.3741F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(64, 64).addBox(-1.0F, -0.6F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, 4.4726F, 0.3212F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(64, 16).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.9339F, -0.4563F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(64, 59).addBox(-1.0F, -0.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 4.4726F, 0.3212F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6645F, 1.6531F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 3).addBox(-1.0F, -0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1023F, 0.2332F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(9, 48).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0255F, 0.7001F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(12, 67).addBox(0.0F, -0.1553F, -0.4766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 3.3056F, 0.4463F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(66, 42).addBox(0.0F, -2.8447F, -0.4765F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 3.3056F, 0.4463F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(15, 75).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 1.3523F, -0.4262F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(74, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.3554F, -0.3478F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -3.9201F, -0.7778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.6131F, -0.3404F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(18, 49).addBox(-0.5F, -1.0335F, 0.3502F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 1.7131F, -0.3404F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(35, 49).addBox(0.0F, -4.125F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 4.8F, -0.1797F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 5.7959F, 0.4879F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(17, 67).addBox(-0.8F, -2.5857F, -1.4115F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1936F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 48).addBox(-0.8F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(7, 52).addBox(-1.3F, -3.4F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5556F, -0.2179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.0137F, -0.5935F, -0.5149F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.0417F, 0.1521F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create().texOffs(28, 49).addBox(-0.9701F, -0.0746F, -0.5492F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4384F, -2.1058F, 0.554F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 2.9144F, -0.0176F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(45, 39).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0493F, -0.7746F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 44).addBox(-1.0F, -4.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7551F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(45, 59).addBox(0.0F, -2.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 2.0955F, 0.4596F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(40, 56).addBox(-0.5F, -4.1039F, -0.0884F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3431F, -0.1713F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8314F, 0.4255F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.7689F, -0.0779F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 29).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4124F, 1.1521F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 59).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 3.9712F, 1.3741F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 65).addBox(0.0F, -0.6F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.5F, 4.4726F, 0.3212F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 64).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.9339F, -0.4563F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(33, 65).addBox(0.0F, -0.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 4.4726F, 0.3212F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6645F, 1.6531F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 22).addBox(-1.0F, -0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1023F, 0.2332F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(48, 16).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.0255F, 0.7001F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(22, 67).addBox(-1.0F, -0.1553F, -0.4766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 3.3056F, 0.4463F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -2.8447F, -0.4765F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 3.3056F, 0.4463F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 75).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 1.3523F, -0.4262F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 75).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.3554F, -0.3478F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(69, 9).addBox(-0.5F, -3.9201F, -0.7778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6131F, -0.3404F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(23, 49).addBox(-0.5F, -1.0335F, 0.3502F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.7131F, -0.3404F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(40, 49).addBox(-1.0F, -4.125F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 4.8F, -0.1797F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 5.7959F, 0.4879F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 67).addBox(-0.2F, -2.5857F, -1.4115F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1936F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 73).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(52, 49).addBox(-0.7F, -3.4F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5556F, -0.2179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.0137F, -0.5935F, -0.5149F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.0417F, 0.1521F, 0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create().texOffs(49, 29).addBox(-1.0299F, -0.0746F, -0.5492F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4384F, -2.1058F, 0.554F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3554F, -3.3229F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 43).addBox(0.0F, -0.1F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 77).addBox(0.0F, 0.0F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2966F, -5.8386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(63, 47).mirror().addBox(-3.0842F, -1.1492F, -0.5961F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.6225F, -3.4268F, -0.4623F, 0.0983F, -1.1393F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(68, 14).mirror().addBox(-2.3106F, -0.5706F, -0.5961F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.6225F, -3.4268F, -0.4252F, 0.2112F, -0.9001F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-0.1F, 0.4F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8397F, 0.1495F, -1.5049F, -0.1246F, -0.3983F, -0.4673F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(63, 47).addBox(2.0842F, -1.1492F, -0.5961F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6225F, -3.4268F, -0.4623F, -0.0983F, 1.1393F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 14).addBox(0.3106F, -0.5706F, -0.5961F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6225F, -3.4268F, -0.4252F, -0.2112F, 0.9001F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(34, 6).addBox(-1.9F, 0.4F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8397F, 0.1495F, -1.5049F, -0.1246F, 0.3983F, 0.4673F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 18).addBox(-0.5F, -0.1513F, 8.7474F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4656F, -13.1997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.702F, -4.6624F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-2.4246F, 0.384F, -0.0544F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2206F, -0.6644F, -0.2737F, 0.3861F, -0.8552F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-3.4414F, -0.2566F, -0.0544F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2206F, -0.6644F, -0.3636F, 0.3036F, -1.1194F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-2.4881F, 0.4891F, -0.1259F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -2.5644F, -0.2545F, 0.4297F, -0.7444F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-4.5299F, -0.1715F, -0.1259F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -2.5644F, -0.3577F, 0.3503F, -1.0143F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 20).addBox(-0.5754F, 0.384F, -0.0544F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2206F, -0.6644F, -0.2737F, -0.3861F, 0.8552F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(78, 47).addBox(2.4414F, -0.2566F, -0.0544F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2206F, -0.6644F, -0.3636F, -0.3036F, 1.1194F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(50, 14).addBox(-0.5119F, 0.4891F, -0.1259F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -2.5644F, -0.2545F, -0.4297F, 0.7444F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 16).addBox(2.5299F, -0.1715F, -0.1259F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -2.5644F, -0.3577F, -0.3503F, 1.0143F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 33).addBox(0.0F, -1.6594F, 0.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -1.157F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 77).addBox(0.0F, -1.1938F, -2.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 52).addBox(0.0F, -1.5938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.596F, -3.057F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-5.471F, -0.2187F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, 0.6356F, -0.3496F, 0.3767F, -0.9597F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-2.4434F, 0.4282F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, 0.6356F, -0.2386F, 0.4531F, -0.6858F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-5.9506F, -2.339F, -0.1169F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, 0.6356F, -0.4638F, 0.2158F, -1.345F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(53, 27).addBox(2.471F, -0.2187F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, 0.6356F, -0.3496F, -0.3767F, 0.9597F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(56, 37).addBox(-0.5566F, 0.4282F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, 0.6356F, -0.2386F, -0.4531F, 0.6858F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(76, 25).addBox(4.9506F, -2.339F, -0.1169F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, 0.6356F, -0.4638F, -0.2158F, 1.345F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.6566F, -5.8266F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0456F, -0.8871F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-10.0F, 0.1F, -0.3F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5027F, 6.1007F, -2.8075F, 0.6159F, 1.3948F, 0.8936F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(17, 2).mirror().addBox(-8.6F, 0.1F, -0.3F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5027F, 6.1007F, -2.8075F, 0.356F, 1.2777F, 0.6316F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(17, 4).mirror().addBox(-6.1F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4223F, 6.0653F, -3.0943F, -0.3047F, 0.9198F, -0.0129F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(17, 6).mirror().addBox(-7.0F, 0.1F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5027F, 6.1007F, -2.8075F, 0.1539F, 1.1168F, 0.4185F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(47, 4).mirror().addBox(-3.8313F, -0.1915F, -0.228F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6511F, 5.3486F, -4.8014F, -0.3108F, 0.2503F, 0.0135F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(34, 4).mirror().addBox(-3.851F, -0.2271F, -0.3029F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8792F, 5.7718F, -3.812F, -0.2877F, 0.4631F, 0.1183F));

		PartDefinition cube_r116 = body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(59, 51).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0011F, -0.461F, -0.6394F, 0.1209F, -0.7683F));

		PartDefinition cube_r117 = body4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0011F, -0.461F, -0.6482F, -0.0368F, -0.9777F));

		PartDefinition cube_r118 = body4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(69, 25).mirror().addBox(-6.9247F, -2.3487F, -0.1126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0011F, -0.461F, -0.5966F, -0.273F, -1.3071F));

		PartDefinition cube_r119 = body4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -2.461F, -0.5995F, 0.0356F, -0.9777F));

		PartDefinition cube_r120 = body4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(58, 4).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -2.461F, -0.5756F, 0.1813F, -0.7587F));

		PartDefinition cube_r121 = body4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(78, 49).mirror().addBox(-5.9247F, -2.3487F, -0.1126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -2.461F, -0.5734F, -0.1887F, -1.3124F));

		PartDefinition cube_r122 = body4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(-5.9247F, -2.3487F, -0.1126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -4.361F, -0.5577F, -0.1296F, -1.3149F));

		PartDefinition cube_r123 = body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -4.361F, -0.5652F, 0.0862F, -0.9756F));

		PartDefinition cube_r124 = body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(54, 47).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -4.361F, -0.5302F, 0.2231F, -0.7496F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-4.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4223F, 6.0653F, -3.0943F, -0.3746F, 0.5417F, -0.0807F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(69, 25).addBox(4.9247F, -2.3487F, -0.1126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0011F, -0.461F, -0.5966F, 0.273F, 1.3071F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(59, 49).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0011F, -0.461F, -0.6482F, 0.0368F, 0.9777F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(59, 51).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0011F, -0.461F, -0.6394F, -0.1209F, 0.7683F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(59, 14).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -2.461F, -0.5995F, -0.0356F, 0.9777F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(58, 4).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -2.461F, -0.5756F, -0.1813F, 0.7587F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(78, 49).addBox(4.9247F, -2.3487F, -0.1126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -2.461F, -0.5734F, 0.1887F, 1.3124F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 78).addBox(4.9247F, -2.3487F, -0.1126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -4.361F, -0.5577F, 0.1296F, 1.3149F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(56, 35).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -4.361F, -0.5652F, -0.0862F, 0.9756F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 47).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -4.361F, -0.5302F, -0.2231F, 0.7496F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(47, 4).addBox(-0.1687F, -0.1915F, -0.228F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6511F, 5.3486F, -4.8014F, -0.3108F, -0.2503F, -0.0135F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(34, 4).addBox(-1.149F, -0.2271F, -0.3029F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8792F, 5.7718F, -3.812F, -0.2877F, -0.4631F, -0.1183F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(17, 4).addBox(-0.9F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4223F, 6.0653F, -3.0943F, -0.3047F, -0.9198F, 0.0129F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.1F, -0.3F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5027F, 6.1007F, -2.8075F, 0.6159F, -1.3948F, -0.8936F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(17, 2).addBox(-0.4F, 0.1F, -0.3F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5027F, 6.1007F, -2.8075F, 0.356F, -1.2777F, -0.6316F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(17, 6).addBox(0.0F, 0.1F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5027F, 6.1007F, -2.8075F, 0.1539F, -1.1168F, -0.4185F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(23, 0).addBox(-0.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4223F, 6.0653F, -3.0943F, -0.3746F, -0.5417F, 0.0807F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5F, -0.8389F, -0.0229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.7968F, -4.5808F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(27, 78).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6566F, -4.8266F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(24, 78).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6566F, -2.8266F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(21, 78).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6566F, -0.8266F, -0.6109F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2472F, -5.6969F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-0.4033F, -0.7894F, -0.6173F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 0.7033F, -0.1336F, 0.2823F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(15, 26).mirror().addBox(-0.4033F, -1.0328F, -3.2925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 1.1221F, -0.1336F, 0.2823F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(-0.3711F, -1.1839F, -0.5105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 2.6668F, -0.1336F, 0.2823F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.3211F, -0.9324F, -0.6849F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 2.3526F, -0.1336F, 0.2823F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(22, 33).mirror().addBox(-0.3027F, -0.7303F, -0.7822F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 2.0141F, -0.1225F, 0.282F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(-0.7969F, -0.8392F, -4.6155F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 0.906F, 0.2991F, 0.1482F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-0.3592F, -2.754F, -2.8312F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 1.5847F, -0.1336F, 0.2823F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(49, 34).addBox(-0.5967F, -0.7894F, -0.6173F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 0.7033F, 0.1336F, -0.2823F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(15, 26).addBox(-0.5967F, -1.0328F, -3.2925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 1.1221F, 0.1336F, -0.2823F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.3211F, 0.5375F, -0.7165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(70, 71).mirror().addBox(-0.3211F, 0.5375F, -1.0165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 2.9547F, -0.1336F, 0.2823F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-0.3211F, 0.7393F, -0.2088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 1.6021F, -0.1336F, 0.2823F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-0.3211F, 0.8513F, -0.444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 2.0384F, -0.1336F, 0.2823F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.3211F, 0.7528F, -0.9627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9251F, -0.4788F, 2.3983F, 2.562F, -0.1336F, 0.2823F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 72).addBox(-0.6789F, 0.5375F, -0.7165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(70, 71).addBox(-0.6789F, 0.5375F, -1.0165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 2.9547F, 0.1336F, -0.2823F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(71, 41).addBox(-0.6789F, 0.7528F, -0.9627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 2.562F, 0.1336F, -0.2823F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 67).addBox(-0.6789F, 0.8513F, -0.444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 2.0384F, 0.1336F, -0.2823F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6789F, 0.7393F, -0.2088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 1.6021F, 0.1336F, -0.2823F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(9, 38).addBox(-0.6289F, -1.1839F, -0.5105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 2.6668F, 0.1336F, -0.2823F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 38).addBox(-0.6789F, -0.9324F, -0.6849F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 2.3526F, 0.1336F, -0.2823F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(22, 33).addBox(-0.6973F, -0.7303F, -0.7822F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 2.0141F, 0.1225F, -0.282F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 2).addBox(-1.2031F, -0.8392F, -4.6155F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 0.906F, -0.2991F, -0.1482F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(31, 33).addBox(-0.6408F, -2.754F, -2.8312F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9251F, -0.4788F, 2.3983F, 1.5847F, 0.1336F, -0.2823F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(39, 18).addBox(-0.5F, -0.9853F, -3.0503F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0756F, 3.6843F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(50, 57).addBox(-0.5F, -1.908F, 8.84F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0607F, -9.7986F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 2.4498F, 1.069F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(62, 25).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(61, 39).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4925F, 1.8553F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(9, 43).addBox(-0.9995F, -1.4499F, -0.0694F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0138F, 1.5409F, -1.1624F, 0.2181F, 0.001F, -0.0014F));

		PartDefinition cube_r172 = leftarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(38, 0).addBox(-0.9995F, 0.4206F, -2.2421F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0104F, 2.2628F, 1.1264F, -1.8589F, 0.001F, -0.0014F));

		PartDefinition cube_r173 = leftarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 60).addBox(-0.5F, -2.0F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.5866F, 0.9555F, 0.2181F, 0.0013F, -0.0011F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(30, 74).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.9091F, 2.3173F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(69, 63).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 3.3108F, -0.6059F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(68, 75).addBox(-1.0F, 0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.9955F, -0.6F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 53).addBox(0.0F, -3.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 4.258F, 1.4594F, 0.5411F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.1707F, 2.2997F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(7, 64).addBox(0.6F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2236F, 0.613F, 1.2556F, 1.5708F, 1.4224F, -1.5708F));

		PartDefinition cube_r179 = leftarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(61, 29).addBox(-0.1F, -0.925F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1764F, -0.7124F, 1.3606F, 1.5708F, 0.5061F, -1.5708F));

		PartDefinition cube_r180 = leftarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(60, 22).addBox(-1.2F, -0.925F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.0125F, 1.3484F, 1.5708F, -0.0175F, -1.5708F));

		PartDefinition cube_r181 = leftarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(70, 0).addBox(-0.009F, -0.02F, -0.9596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, 3.1278F, 0.4419F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r182 = leftarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(27, 68).addBox(-1.0256F, -1.9299F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.136F, 2.9494F, 1.4468F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(73, 19).addBox(-0.6F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3236F, 5.4326F, 1.3422F, 1.5708F, -0.4974F, -1.5708F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(69, 51).addBox(-0.55F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1236F, 3.8448F, 1.1651F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(71, 16).addBox(0.3F, -2.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1764F, 3.5164F, -0.2151F, 1.5708F, -1.0996F, -1.5708F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(20, 72).addBox(-0.0103F, -1.2057F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6764F, 2.329F, -0.3382F, 1.5708F, -0.9948F, -1.5708F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(25, 72).addBox(-0.0006F, 0.001F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6764F, 5.2575F, 0.2022F, 1.5708F, -0.9076F, -1.5708F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(48, 72).addBox(-0.0006F, 0.001F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6764F, 4.337F, -0.1885F, 1.5708F, -1.1694F, -1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(40, 62).addBox(-0.0006F, -1.899F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6764F, 3.229F, -0.3382F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 5.719F, 2.1274F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftArm3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7733F, 0.2168F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftArm4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(45, 49).addBox(-1.0F, 1.8F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.8277F, 0.6069F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 2.4498F, 1.069F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 53).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(50, 61).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4925F, 1.8553F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(27, 44).addBox(-1.0005F, -1.4499F, -0.0694F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0138F, 1.5409F, -1.1624F, 0.2181F, -0.001F, 0.0014F));

		PartDefinition cube_r194 = rightarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0005F, 0.4206F, -2.2421F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0104F, 2.2628F, 1.1264F, -1.8589F, -0.001F, 0.0014F));

		PartDefinition cube_r195 = rightarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(61, 42).addBox(-0.5F, -2.0F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.5866F, 0.9555F, 0.2181F, -0.0013F, 0.0011F));

		PartDefinition cube_r196 = rightarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(42, 74).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.9091F, 2.3173F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r197 = rightarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(65, 69).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, 3.3108F, -0.6059F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(75, 69).addBox(0.0F, 0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.9955F, -0.6F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(28, 54).addBox(-1.0F, -3.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 4.258F, 1.4594F, 0.5411F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.1707F, 2.2997F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(64, 9).addBox(-1.6F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2236F, 0.613F, 1.2556F, 1.5708F, -1.4224F, 1.5708F));

		PartDefinition cube_r201 = rightarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(61, 32).addBox(-1.9F, -0.925F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1764F, -0.7124F, 1.3606F, 1.5708F, -0.5061F, 1.5708F));

		PartDefinition cube_r202 = rightarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(28, 60).addBox(-0.8F, -0.925F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1764F, -0.0125F, 1.3484F, 1.5708F, 0.0175F, 1.5708F));

		PartDefinition cube_r203 = rightarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(71, 6).addBox(-0.991F, -0.02F, -0.9596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, 3.1278F, 0.4419F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r204 = rightarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(68, 47).addBox(0.0256F, -1.9299F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.136F, 2.9494F, 1.4468F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r205 = rightarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(73, 45).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3236F, 5.4326F, 1.3422F, 1.5708F, 0.4974F, 1.5708F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(55, 69).addBox(-0.45F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1236F, 3.8448F, 1.1651F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(15, 72).addBox(-1.3F, -2.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1764F, 3.5164F, -0.2151F, 1.5708F, 1.0996F, 1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(37, 72).addBox(-0.9897F, -1.2057F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6764F, 2.329F, -0.3382F, 1.5708F, 0.9948F, 1.5708F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 34).addBox(-0.9994F, 0.001F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6764F, 5.2575F, 0.2022F, 1.5708F, 0.9076F, 1.5708F));

		PartDefinition cube_r210 = rightarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(5, 73).addBox(-0.9994F, 0.001F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6764F, 4.337F, -0.1885F, 1.5708F, 1.1694F, 1.5708F));

		PartDefinition cube_r211 = rightarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(28, 63).addBox(-0.9994F, -1.899F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6764F, 3.229F, -0.3382F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 5.719F, 2.1274F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightArm3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7733F, 0.2168F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightArm4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(50, 6).addBox(-1.0F, 1.8F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.8277F, 0.6069F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8485F, -1.6427F, -0.1083F, -0.2589F, -0.0396F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 67).mirror().addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4226F, -1.0013F, -0.9475F, 3.1179F, 0.0111F, -2.7054F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(50, 67).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4226F, -1.0013F, -0.9475F, 3.1179F, -0.0111F, 2.7054F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(57, 6).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2408F, -2.0585F, -0.4652F, -0.1237F, 0.0428F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(54, 39).addBox(-0.5F, -0.6166F, 0.5406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1701F, -2.3853F, 0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4483F, -2.254F, 0.0892F, -0.3044F, -0.313F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(75, 12).mirror().addBox(-0.7F, 0.9F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(75, 12).addBox(-0.3F, 0.9F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 5.0732F, -1.2294F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-1.5F, -1.0105F, -1.046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 0).addBox(-1.1F, -1.0105F, -1.046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, 3.1792F, 0.067F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.5F, -1.0105F, -1.996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(0, 56).addBox(-1.1F, -1.0105F, -1.996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8F, 4.172F, -0.2749F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, 0.3888F, -1.0343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 0).addBox(-0.4F, 0.3888F, -1.0343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 43).addBox(-0.7F, -0.0112F, -1.0343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.5791F, -1.9225F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-1.0F, 0.4041F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(74, 22).addBox(-0.4F, 0.4041F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(74, 63).addBox(-0.7F, 0.0041F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 3.4421F, -2.5377F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(-0.5F, -3.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 69).addBox(1.5F, -3.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 2.6886F, 1.9597F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.04F, -0.2589F, -0.2705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 60).addBox(0.04F, -0.2589F, -0.2705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 5.8035F, -2.076F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(74, 9).mirror().addBox(-1.0F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(74, 9).addBox(-0.6F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 3.6052F, -0.3356F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(50, 53).mirror().addBox(-1.0F, -0.5298F, -1.2154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(50, 53).addBox(-0.6F, -0.5298F, -1.2154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 4.6983F, -0.8698F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(75, 72).mirror().addBox(-0.9F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 72).addBox(-0.1F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.2445F, -1.4662F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(68, 31).addBox(-1.0F, -0.7339F, -1.2705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(68, 28).addBox(-1.0F, -0.7339F, -0.7705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 5.7667F, -1.4519F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(74, 3).addBox(-1.4F, 0.7428F, 2.9226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9F, 7.4036F, -4.8203F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, 0.001F, -0.9836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.857F, -0.9992F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(30, 8).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 1.741F, -0.2766F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(57, 63).addBox(-1.0F, 0.001F, -0.9836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.7086F, -1.5412F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(57, 66).addBox(-1.0F, -0.8008F, 0.0671F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0701F, 0.4656F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(48, 20).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0995F, 0.5122F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -0.0022F, -2.0083F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -0.7063F, 0.2474F, 0.8988F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7462F, 1.5418F, 0.2295F, -0.273F, -0.0597F, -0.21F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(12, 64).addBox(-1.5F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2001F, -1.08F, 0.6894F, 2.1138F, -0.28F, 0.2159F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(63, 73).addBox(-0.5F, -0.25F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.3718F, -0.6389F, -0.2224F, 0.7088F, -0.28F, 0.2159F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(58, 73).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2432F, -0.2676F, -0.0623F, 1.1888F, -0.28F, 0.2159F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(76, 15).addBox(-0.45F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1222F, -0.1821F, -0.0205F, 1.1562F, -0.1882F, 0.3499F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(52, 76).addBox(-0.45F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1222F, -0.1821F, -0.0205F, 1.1805F, -0.2361F, 0.235F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0753F, 0.5913F, -0.2312F, 1.5196F, -0.1679F, 0.423F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(14, 56).addBox(-1.45F, -0.925F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0031F, 0.666F, -1.3338F, 0.377F, 0.6368F, 1.0333F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(7, 56).addBox(-1.5F, -1.6911F, -0.5385F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2381F, 1.8333F, -1.2864F, 0.0075F, -0.0291F, 0.1975F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(68, 38).addBox(-1.5F, -0.3127F, -0.5541F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2381F, 1.8333F, -1.2864F, 0.4874F, -0.0291F, 0.1975F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(14, 60).addBox(-0.59F, -1.3925F, -2.1582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 44).addBox(-0.59F, -0.7924F, -2.1582F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7662F, 1.665F, 0.0081F, 1.491F, -0.0291F, 0.852F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7462F, 1.5418F, 0.2295F, -0.273F, 0.0597F, 0.21F));

		PartDefinition cube_r246 = rightOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(12, 64).mirror().addBox(-0.5F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, -1.08F, 0.6894F, 2.1138F, 0.28F, -0.2159F));

		PartDefinition cube_r247 = rightOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-0.5F, -0.25F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.3718F, -0.6389F, -0.2224F, 0.7088F, 0.28F, -0.2159F));

		PartDefinition cube_r248 = rightOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(58, 73).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2432F, -0.2676F, -0.0623F, 1.1888F, 0.28F, -0.2159F));

		PartDefinition cube_r249 = rightOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-0.55F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1222F, -0.1821F, -0.0205F, 1.1562F, 0.1882F, -0.3499F));

		PartDefinition cube_r250 = rightOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(52, 76).mirror().addBox(-0.55F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1222F, -0.1821F, -0.0205F, 1.1805F, 0.2361F, -0.235F));

		PartDefinition cube_r251 = rightOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(21, 60).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0753F, 0.5913F, -0.2312F, 1.5196F, 0.1679F, -0.423F));

		PartDefinition cube_r252 = rightOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-0.55F, -0.925F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0031F, 0.666F, -1.3338F, 0.377F, -0.6368F, -1.0333F));

		PartDefinition cube_r253 = rightOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(-0.5F, -1.6911F, -0.5385F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2381F, 1.8333F, -1.2864F, 0.0075F, 0.0291F, -0.1975F));

		PartDefinition cube_r254 = rightOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-0.5F, -0.3127F, -0.5541F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2381F, 1.8333F, -1.2864F, 0.4874F, 0.0291F, -0.1975F));

		PartDefinition cube_r255 = rightOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-0.41F, -1.3925F, -2.1582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 44).mirror().addBox(-0.41F, -0.7924F, -2.1582F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7662F, 1.665F, 0.0081F, 1.491F, 0.0291F, -0.852F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5919F, 1.3641F, 0.4845F, 0.7755F, 0.0202F, -0.0005F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(11, 27).mirror().addBox(0.4376F, -0.1577F, -0.6068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -0.8013F, -0.1256F, -0.1503F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(57, 76).mirror().addBox(0.1176F, 0.1888F, 2.6109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 76).mirror().addBox(0.1176F, 0.5888F, 3.0109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -2.2958F, -0.141F, -0.0422F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(76, 40).mirror().addBox(0.1176F, 2.0452F, 1.9597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -1.6849F, -0.141F, -0.0422F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(0.0821F, 2.5624F, -0.6212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -0.8027F, -0.1213F, -0.0799F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(0.0821F, 2.0309F, 0.5263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -1.1168F, -0.1213F, -0.0799F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(73, 75).mirror().addBox(0.0821F, 2.0971F, 1.3221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -1.4223F, -0.1213F, -0.0799F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(62, 76).mirror().addBox(0.0066F, 1.8683F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -0.8644F, -0.1852F, -0.1537F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(0.0066F, -0.0221F, -0.4263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9487F, 2.3956F, -0.6148F, -0.7684F, -0.1852F, -0.1537F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(-1.0F, 0.4656F, -1.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(32, 70).addBox(0.9839F, 0.4656F, -1.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0839F, 2.4669F, 1.416F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-1.0F, -0.094F, -0.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0823F, 2.0795F, 0.3789F, -0.7941F, -0.0014F, -0.0016F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(75, 30).mirror().addBox(-1.0F, 0.006F, -0.8577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0839F, 1.6871F, 1.0832F, -1.1868F, -0.0014F, -0.0016F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(76, 6).addBox(1.4839F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5839F, 1.82F, -0.3691F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-1.0F, -0.8016F, -0.1744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 66).addBox(0.9839F, -0.8016F, -0.1744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0839F, 0.0203F, -1.442F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(47, 75).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 75).addBox(1.4839F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5839F, -0.0101F, 0.0148F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(-1.0F, -0.7766F, -0.1744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 37).addBox(0.9839F, -0.7766F, -0.1744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0839F, 0.5883F, -1.3521F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(75, 27).mirror().addBox(-1.0F, -1.3516F, -0.7494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 27).addBox(0.9839F, -1.3516F, -0.7494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0839F, 1.5669F, -0.484F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(11, 27).addBox(-0.4376F, -0.1577F, -0.6068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -0.8013F, 0.1256F, 0.1503F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(57, 76).addBox(-1.1176F, 0.1888F, 2.6109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 76).addBox(-1.1176F, 0.5888F, 3.0109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -2.2958F, 0.141F, 0.0422F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(76, 40).addBox(-1.1176F, 2.0452F, 1.9597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -1.6849F, 0.141F, 0.0422F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(74, 54).addBox(-1.0821F, 2.5624F, -0.6212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -0.8027F, 0.1213F, 0.0799F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(74, 51).addBox(-1.0821F, 2.0309F, 0.5263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -1.1168F, 0.1213F, 0.0799F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(73, 75).addBox(-1.0821F, 2.0971F, 1.3221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -1.4223F, 0.1213F, 0.0799F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(62, 76).addBox(-1.0066F, 1.8683F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -0.8644F, 0.1852F, 0.1537F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(10, 72).addBox(-1.0066F, -0.0221F, -0.4263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7648F, 2.3956F, -0.6148F, -0.7684F, 0.1852F, 0.1537F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(35, 75).addBox(0.0F, -0.094F, -0.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1016F, 2.0795F, 0.3789F, -0.7941F, 0.0014F, 0.0016F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(75, 30).addBox(0.0F, 0.006F, -0.8577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.6871F, 1.0832F, -1.1868F, 0.0014F, 0.0016F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(37, 23).addBox(-0.5F, -0.2146F, -0.0949F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(43, 77).addBox(0.0F, -2.1146F, -0.0949F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2464F, 2.3845F, -0.8189F, 0.1827F, -0.0683F));

		PartDefinition cube_r282 = tail.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1146F, 1.9051F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r283 = tail.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(33, 78).addBox(0.0F, -1.4F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8854F, 1.6051F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -0.0852F, 0.0646F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1452F, 2.8656F, -0.2657F, 0.1685F, -0.0456F));

		PartDefinition cube_r284 = tail2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(78, 18).addBox(0.0F, -1.1F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0852F, 2.9646F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r285 = tail2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(18, 78).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0852F, 1.0646F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r286 = tail2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(67, 78).addBox(0.0F, -1.1F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9167F, 4.3346F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r287 = tail2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 78).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.04F, 1.5088F, 0.829F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0165F, 0.0461F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F))
				.texOffs(78, 75).addBox(0.0F, -0.7835F, 1.0461F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 78).addBox(0.0F, -0.5835F, 3.0461F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0694F, 3.9982F, -0.2946F, 0.209F, -0.0629F));

		PartDefinition cube_r288 = tail3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(70, 78).addBox(0.0F, -1.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8629F, 2.0814F, 0.8727F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(18, 39).addBox(-0.5F, -0.8162F, -0.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 79).addBox(0.0F, -1.1162F, 0.9315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8291F, 4.0039F, 0.1162F, 0.2167F, 0.0251F));

		PartDefinition cube_r289 = tail4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(73, 78).addBox(0.0F, 0.6F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0338F, -1.9226F, 0.8727F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(40, 34).addBox(-0.5F, -0.8162F, -0.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0096F, 2.8844F, 0.4013F, 0.2013F, 0.0846F));

		PartDefinition cube_r290 = tail5.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(79, 3).addBox(0.0F, 0.4F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 79).addBox(0.0F, -0.3F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2167F, 0.5862F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(41, 6).addBox(-0.5F, -0.8162F, -0.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.017F, 2.9154F, 0.3646F, 0.2865F, 0.1074F));

		return LayerDefinition.create(meshdefinition, 82, 82);
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