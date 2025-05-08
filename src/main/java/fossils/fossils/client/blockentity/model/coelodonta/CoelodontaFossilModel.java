package fossils.fossils.client.blockentity.model.coelodonta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CoelodontaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
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

	public CoelodontaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.5258F, 15.6233F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 111).addBox(0.0F, -1.3125F, 0.0115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 112).addBox(0.0F, -1.0882F, 0.1327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, -0.7F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(111, 57).addBox(0.0F, -1.0986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -2.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 25).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.3323F, -2.9131F, -1.212F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(99, 38).mirror().addBox(0.0F, -0.6F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5598F, 6.1957F, 2.1474F, -0.1467F, -0.6728F, 0.4132F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6647F, 0.2F, 0.0F, -2.2902F, 0.9237F, 2.8013F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-5.0261F, -2.8826F, -0.458F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6323F, 5.4491F, 2.5396F, -2.6649F, -0.8159F, 1.6078F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 40).mirror().addBox(0.0115F, -0.6971F, -0.0622F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-7.5126F, 2.0352F, -2.3606F, -1.1307F, -0.7663F, 0.3695F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 40).mirror().addBox(-3.85F, -0.5F, -1.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2878F, 4.6927F, 1.2806F, -0.8012F, -0.6176F, 0.1863F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 35).mirror().addBox(-3.6267F, -0.9011F, -0.0036F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -0.7475F, 0.5446F, -1.1029F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 31).mirror().addBox(0.0242F, -0.6971F, -0.0665F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0641F, 0.6136F, -2.4271F, -1.5425F, -0.7614F, 0.8068F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-2.3159F, -0.1027F, 2.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -1.8681F, 1.0766F, -2.9847F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(108, 110).mirror().addBox(-3.9399F, -0.1027F, 0.1802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -2.541F, 0.6394F, 2.4506F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-2.7195F, -0.6563F, -2.0929F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5663F, 2.4594F, -0.3217F, -2.622F, -0.0592F, 2.2115F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-3.2036F, -0.7347F, -0.7544F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1413F, 2.7344F, 0.3033F, -2.2173F, -0.4358F, 1.9086F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 60).mirror().addBox(-3.456F, -0.7347F, -0.0761F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1413F, 2.7344F, 0.3033F, -2.0135F, -0.6422F, 1.5173F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-2.5745F, -0.3825F, -0.8126F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4278F, 7.225F, 6.4561F, 0.7931F, -0.4147F, -2.809F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.575F, -0.5F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9884F, 6.0331F, 6.3946F, -0.3492F, 1.334F, -2.4202F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(72, 102).mirror().addBox(-0.4F, -0.7F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.5939F, 5.5801F, 2.9908F, 0.2163F, -0.8967F, 0.6264F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0F, -0.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5598F, 6.1957F, 2.1474F, -2.6123F, -1.3423F, 2.9451F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(-1.975F, -0.85F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.0805F, 5.8966F, 4.0275F, 0.3414F, -0.9236F, 0.4036F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 103).mirror().addBox(-1.35F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9935F, 6.3205F, 4.7638F, -0.2461F, -0.6915F, 1.2168F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -2.2902F, -0.9237F, -2.8013F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(22, 57).addBox(4.0261F, -2.8826F, -0.458F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0324F, 5.4491F, 2.5396F, -2.6649F, 0.8159F, -1.6078F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 40).addBox(-5.0115F, -0.6971F, -0.0622F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.8479F, 2.0352F, -2.3606F, -1.1307F, 0.7663F, -0.3695F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 40).addBox(-2.15F, -0.5F, -1.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6231F, 4.6927F, 1.2806F, -0.8012F, 0.6176F, -0.1863F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 35).addBox(-0.3733F, -0.9011F, -0.0036F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -0.7475F, -0.5446F, 1.1029F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(58, 31).addBox(-4.0242F, -0.6971F, -0.0665F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3994F, 0.6136F, -2.4271F, -1.5425F, 0.7614F, -0.8068F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(111, 0).addBox(1.3159F, -0.1027F, 2.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -1.8681F, -1.0766F, 2.9847F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(108, 110).addBox(2.9399F, -0.1027F, 0.1802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -2.541F, -0.6394F, -2.4506F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(80, 65).addBox(0.7195F, -0.6563F, -2.0929F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9016F, 2.4594F, -0.3217F, -2.622F, 0.0592F, -2.2115F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 70).addBox(0.2036F, -0.7347F, -0.7544F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4766F, 2.7344F, 0.3033F, -2.2173F, 0.4358F, -1.9086F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 60).addBox(-0.544F, -0.7347F, -0.0761F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4766F, 2.7344F, 0.3033F, -2.0135F, 0.6422F, -1.5173F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 82).addBox(-0.4255F, -0.3825F, -0.8126F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7631F, 7.225F, 6.4561F, 0.7931F, 0.4147F, 2.809F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(104, 60).addBox(-1.425F, -0.5F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3237F, 6.0331F, 6.3946F, -0.3492F, -1.334F, 2.4202F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(72, 102).addBox(-1.6F, -0.7F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9292F, 5.5801F, 2.9908F, 0.2163F, 0.8967F, -0.6264F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(99, 38).addBox(-1.0F, -0.6F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8951F, 6.1957F, 2.1474F, -0.1467F, 0.6728F, -0.4132F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -0.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8951F, 6.1957F, 2.1474F, -2.6123F, 1.3423F, -2.9451F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(102, 54).addBox(-0.025F, -0.85F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4158F, 5.8966F, 4.0275F, 0.3414F, 0.9236F, -0.4036F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(56, 103).addBox(-0.65F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3288F, 6.3205F, 4.7638F, -0.2461F, 0.6915F, -1.2168F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(109, 79).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3323F, 7.2138F, 5.0383F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 95).addBox(-0.5F, -0.9538F, -2.0052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3323F, 7.7166F, 4.4719F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8F, 3.3697F, 2.0229F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 99).addBox(-1.0F, -1.9F, -0.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2944F, -0.5035F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(93, 93).addBox(-1.0F, -3.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5195F, 0.5806F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(93, 106).addBox(-2.1F, 0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2605F, 3.2575F, 0.7087F, -0.144F, 0.0507F, 0.5038F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(61, 81).addBox(-1.0F, -0.3F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5305F, 0.7896F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(21, 103).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5631F, 0.0042F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 106).addBox(-0.8F, -2.3F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, 1.672F, -0.7335F, -0.095F, -0.0442F, -0.4342F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 89).addBox(-1.0F, -5.4F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -1.0575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 103).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1395F, 0.4841F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(99, 50).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4722F, 0.0783F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(42, 95).addBox(-1.0F, 0.0F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.0889F, 0.169F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(21, 95).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.3831F, -0.8219F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(28, 93).addBox(-1.0F, -2.0F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.3936F, -0.7224F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 25).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.2727F, -2.6462F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(83, 40).addBox(-1.5F, -0.6057F, -0.0707F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9666F, -1.5055F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 79).addBox(-1.5F, -4.3498F, 0.0766F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.999F, 0.5068F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 26).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.6307F, -1.4599F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 66).addBox(-1.5F, -18.3121F, -3.541F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 25.949F, 5.3194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(101, 73).addBox(-1.0F, -0.9499F, 0.6645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8652F, -2.2822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2228F, -1.5964F, 1.0012F, 0.0102F, 0.0232F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 64).addBox(-1.5F, -0.8F, -1.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 71).addBox(0.0F, -0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.3972F, 2.01F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 31).addBox(-1.9F, -7.9918F, -1.048F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(66, 11).addBox(-2.4F, -7.235F, 0.2314F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(23, 73).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(39, 58).addBox(-1.5F, -0.1444F, -1.1179F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.4924F, -0.072F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(106, 38).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.0643F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(5, 108).addBox(-0.5F, -2.4857F, -1.2115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.8414F, 0.7936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(34, 25).addBox(-2.0F, -1.0696F, -2.9933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3511F, -0.1032F, 1.2305F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1145F, -2.7321F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 51).addBox(-2.1F, -1.8F, 0.3F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8F, 3.3697F, 2.0229F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(14, 101).addBox(-1.0F, -1.9F, -0.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2944F, -0.5035F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(94, 73).addBox(-1.0F, -3.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5195F, 0.5806F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(98, 106).addBox(1.1F, 0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.2605F, 3.2575F, 0.7087F, -0.144F, -0.0507F, -0.5038F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 81).addBox(-2.0F, -0.3F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5305F, 0.7896F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 103).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5631F, 0.0042F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(30, 106).addBox(-0.2F, -2.3F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8F, 1.672F, -0.7335F, -0.095F, 0.0442F, 0.4342F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(94, 30).addBox(-1.0F, -5.4F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -1.0575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(35, 103).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1395F, 0.4841F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(58, 99).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4722F, 0.0783F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 55).addBox(-1.0F, 0.0F, -0.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.0889F, 0.169F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 95).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.3831F, -0.8219F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(35, 93).addBox(-1.0F, -2.0F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.3936F, -0.7224F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(82, 36).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.2727F, -2.6462F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(83, 44).addBox(-1.5F, -0.6057F, -0.0707F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9666F, -1.5055F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(79, 21).addBox(-1.5F, -4.3498F, 0.0766F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.999F, 0.5068F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 63).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.6307F, -1.4599F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(66, 15).addBox(-1.5F, -18.3121F, -3.541F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 25.949F, 5.3194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(86, 101).addBox(-1.0F, -0.9499F, 0.6645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8652F, -2.2822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.2228F, -1.5964F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(44, 64).addBox(-1.5F, -0.8F, -1.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(18, 73).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.3972F, 2.01F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(33, 71).addBox(-0.1F, -7.9918F, -1.048F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 0).addBox(-0.6F, -7.235F, 0.2314F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(61, 74).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(50, 58).addBox(-1.5F, -0.1444F, -1.1179F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.4924F, -0.072F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(65, 106).addBox(-0.5F, 0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1604F, 1.0643F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(108, 26).addBox(-0.5F, -2.4857F, -1.2115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.8414F, 0.7936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(30, 34).addBox(-2.0F, -1.0696F, -2.9933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2954F, 0.2929F, 1.2305F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0304F, -2.6933F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(13, 52).addBox(-1.9F, -1.8F, 0.3F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.6F, -0.0349F, -0.0872F, 0.0031F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(46, 112).addBox(0.0F, -1.4845F, -0.6103F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6064F, -0.259F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(43, 112).addBox(0.0F, -1.3545F, -0.0038F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.331F, -2.7389F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(111, 50).addBox(0.0F, -1.4398F, -0.0023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.531F, -4.7389F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 112).addBox(0.0F, -1.3115F, -0.0418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.031F, -6.6389F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(111, 36).addBox(0.0F, -1.1402F, 0.0197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5315F, -8.7301F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 112).addBox(0.0F, -0.8904F, -0.0882F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9434F, -10.6974F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(5, 112).addBox(0.0F, -1.4057F, 0.0627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -12.6F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(105, 24).mirror().addBox(-2.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3F, -12.3F, -0.2005F, -0.0608F, -0.2906F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(81, 19).mirror().addBox(-7.1256F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.4768F, -0.2399F, -1.6006F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(96, 69).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.5279F, -0.0445F, -1.2457F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.523F, 0.0873F, -1.0194F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(96, 65).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5015F, 0.115F, -0.9648F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5133F, -0.0128F, -1.1938F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.4741F, -0.2051F, -1.5489F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.48F, 0.1426F, -0.9097F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(95, 83).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.4988F, 0.0189F, -1.1414F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.4715F, -0.1703F, -1.497F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4689F, -0.1354F, -1.4625F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(95, 81).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4842F, 0.0507F, -1.106F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4582F, 0.1701F, -0.8714F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(63, 95).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.4252F, 0.2112F, -0.8302F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.4623F, 0.0983F, -1.0694F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(48, 6).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -10.4644F, -0.465F, -0.0832F, -1.428F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.4252F, 0.2112F, -0.8128F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.4623F, 0.0983F, -1.052F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(34, 31).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -12.2644F, -0.465F, -0.0832F, -1.4105F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(105, 24).addBox(0.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3F, -12.3F, -0.2005F, 0.0608F, 0.2906F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(81, 19).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.4768F, 0.2399F, 1.6006F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 69).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.5279F, 0.0445F, 1.2457F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(96, 67).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.523F, -0.0873F, 1.0194F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 65).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5015F, -0.115F, 0.9648F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(96, 63).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5133F, 0.0128F, 1.1938F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(76, 55).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.4741F, 0.2051F, 1.5489F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(96, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.48F, -0.1426F, 0.9097F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(95, 83).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.4988F, -0.0189F, 1.1414F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(63, 55).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.4715F, 0.1703F, 1.497F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 19).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4689F, 0.1354F, 1.4625F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(95, 81).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4842F, -0.0507F, 1.106F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(95, 79).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4582F, -0.1701F, 0.8714F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(63, 95).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.4252F, -0.2112F, 0.8302F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(95, 61).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.4623F, -0.0983F, 1.0694F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(48, 6).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -10.4644F, -0.465F, 0.0832F, 1.428F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(95, 59).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.4252F, -0.2112F, 0.8128F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(94, 77).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.4623F, -0.0983F, 1.052F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(34, 31).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -12.2644F, -0.465F, 0.0832F, 1.4105F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1512F, -0.2526F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -13.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -13.5F, -0.2358F, -0.0424F, 0.0102F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(97, 2).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1048F, -0.3643F, -0.2818F, 0.3176F, -0.6879F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1048F, -0.3643F, -0.3528F, 0.2355F, -0.9465F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 4).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1048F, -0.3643F, -0.4135F, 0.0836F, -1.3233F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(33, 2).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1952F, -2.4643F, -0.4596F, 0.044F, -1.2945F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1952F, -2.4643F, -0.4115F, 0.2153F, -0.9279F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1952F, -2.4643F, -0.3453F, 0.3125F, -0.6759F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(72, 96).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2951F, -4.4643F, -0.3704F, 0.3003F, -0.666F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(96, 71).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2951F, -4.4643F, -0.432F, 0.1975F, -0.9146F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2951F, -4.4643F, -0.472F, 0.0202F, -1.2774F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 2).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1048F, -0.3643F, -0.2818F, -0.3176F, 0.6879F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(81, 96).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1048F, -0.3643F, -0.3528F, -0.2355F, 0.9465F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(33, 4).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1048F, -0.3643F, -0.4135F, -0.0836F, 1.3233F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(33, 2).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1952F, -2.4643F, -0.4596F, -0.044F, 1.2945F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(42, 99).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1952F, -2.4643F, -0.4115F, -0.2153F, 0.9279F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(98, 12).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1952F, -2.4643F, -0.3453F, -0.3125F, 0.6759F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(72, 96).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2951F, -4.4643F, -0.3704F, -0.3003F, 0.666F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(96, 71).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2951F, -4.4643F, -0.432F, -0.1975F, 0.9146F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(33, 0).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2951F, -4.4643F, -0.472F, -0.0202F, 1.2774F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(33, 6).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0157F, -0.8999F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(74, 112).addBox(0.0F, -2.6539F, -0.113F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0258F, -1.5236F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(111, 98).addBox(-0.005F, -3.4598F, 0.3083F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0258F, -1.5236F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(71, 112).addBox(-0.005F, -3.4551F, 0.1356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7742F, -2.8236F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(112, 69).addBox(0.0F, -1.6496F, -0.11F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7742F, -2.8236F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(65, 110).addBox(0.0F, -3.7048F, -0.0266F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5258F, -5.7236F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(80, 112).addBox(-0.005F, -5.4966F, 0.5266F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5258F, -5.7236F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(93, 85).addBox(-0.5F, -0.3344F, -2.011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.5978F, -7.6871F, -0.733F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6256F, -5.1478F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(15, 27).addBox(-0.01F, -7.8276F, -0.4147F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0226F, -5.5979F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(47, 106).addBox(0.0F, -3.8616F, -0.0706F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0226F, -5.5979F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(93, 110).addBox(-0.01F, -6.8642F, -0.3217F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3226F, -3.7979F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(106, 44).addBox(0.0F, -3.8892F, 0.0256F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3226F, -3.7979F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(90, 107).addBox(-0.01F, -3.7688F, -0.0149F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4774F, -1.7979F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(77, 112).addBox(0.01F, -1.935F, -0.0305F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9774F, -0.2979F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.537F, -1.6074F, -4.9715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.3912F, -0.1412F, 0.3433F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(-0.537F, 1.703F, 0.4451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.6879F, -0.1412F, 0.3433F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(76, 41).mirror().addBox(-0.537F, -0.0463F, -0.6625F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 2.2289F, -0.1412F, 0.3433F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(90, 97).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -4.7644F, -0.4749F, 0.1826F, -1.0639F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(63, 97).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -4.7644F, -0.4169F, 0.296F, -0.8209F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-7.1256F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2794F, -4.7644F, -0.5062F, -0.0086F, -1.4188F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -2.9644F, -0.4472F, 0.3022F, -0.719F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -2.9644F, -0.505F, 0.1817F, -0.9586F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5794F, -2.9644F, -0.5336F, -0.0196F, -1.3077F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.0644F, -0.5374F, -0.0447F, -1.2818F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(100, 89).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.0644F, -0.5172F, 0.1593F, -0.9349F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(99, 97).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0206F, -1.0644F, -0.465F, 0.2834F, -0.6984F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-0.5777F, 2.8093F, -2.5049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, -2.2391F, -0.1412F, 0.3433F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-0.537F, 2.4274F, -0.9277F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, -3.0681F, -0.1412F, 0.3433F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(11, 72).mirror().addBox(-0.537F, 0.1688F, -0.2002F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 2.6042F, -0.1412F, 0.3433F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(15, 40).mirror().addBox(-0.537F, -1.0828F, -4.3242F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 0.9549F, -0.1412F, 0.3433F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(-0.537F, -2.6924F, 1.1145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.3737F, -0.1412F, 0.3433F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-1.0105F, -1.9244F, -4.1641F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.1627F, 0.4258F, 0.042F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.537F, -2.8042F, -1.9545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.1905F, -0.1412F, 0.3433F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-0.537F, -2.856F, -1.166F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.0508F, -0.1412F, 0.3433F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(107, 91).mirror().addBox(-0.537F, -3.072F, -0.6361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.5308F, -0.1412F, 0.3433F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(-0.537F, -3.3391F, -2.782F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.5832F, -0.1412F, 0.3433F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(-0.537F, -2.2523F, -5.0303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 3.3007F, -3.6084F, 1.2341F, -0.1412F, 0.3433F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(95, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 13.9735F, 5.1691F, 0.0214F, 1.0566F, -0.1574F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(33, 14).mirror().addBox(-9.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 13.9735F, 5.1691F, 0.8251F, 0.7601F, 0.8221F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(38, 22).mirror().addBox(-9.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 13.9735F, 4.3191F, 0.4583F, 0.7132F, 0.6696F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(107, 84).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 13.9735F, 4.8191F, -0.0597F, 0.6664F, -0.1992F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(57, 21).mirror().addBox(-7.5973F, 1.2036F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 13.9735F, 4.8191F, 0.403F, 0.5491F, 0.5822F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(100, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 14.0735F, 4.8191F, 0.0304F, 0.3266F, -0.2263F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(33, 69).mirror().addBox(-6.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 14.0735F, 4.8191F, 0.2244F, 0.2412F, 0.4417F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 13.6735F, 3.4191F, 0.0685F, 0.1739F, -0.2867F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(70, 57).mirror().addBox(-6.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 13.6735F, 3.4191F, 0.1593F, 0.0978F, 0.3609F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(68, 19).mirror().addBox(-6.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 13.1735F, 1.8191F, 0.1318F, -0.003F, 0.2897F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(97, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 13.1735F, 1.8191F, 0.1073F, 0.0767F, -0.3518F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.7735F, 0.0191F, 0.1029F, 0.0385F, -0.1347F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-6.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.7735F, 0.0191F, 0.1054F, -0.031F, 0.5074F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(105, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 11.7735F, -1.9809F, 0.0799F, 0.1139F, -0.2152F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-6.4142F, 1.4142F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 11.7735F, -1.9809F, 0.1369F, 0.0243F, 0.5673F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-5.4142F, 1.4142F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 10.5735F, -3.5809F, 0.1821F, -0.0157F, 0.7575F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 10.5735F, -3.5809F, 0.1406F, 0.1172F, -0.0182F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(90, 97).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -4.7644F, -0.4749F, -0.1826F, 1.0639F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(63, 97).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -4.7644F, -0.4169F, -0.296F, 0.8209F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(87, 55).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2794F, -4.7644F, -0.5062F, 0.0086F, 1.4188F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(28, 97).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -2.9644F, -0.4472F, -0.3022F, 0.719F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(97, 6).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -2.9644F, -0.505F, -0.1817F, 0.9586F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(65, 5).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5794F, -2.9644F, -0.5336F, 0.0196F, 1.3077F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(49, 24).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.0644F, -0.5374F, 0.0447F, 1.2818F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(100, 89).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.0644F, -0.5172F, -0.1593F, 0.9349F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(99, 97).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0206F, -1.0644F, -0.465F, -0.2834F, 0.6984F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(61, 11).addBox(-0.4223F, 2.8093F, -2.5049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, -2.2391F, 0.1412F, -0.3433F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(86, 85).addBox(-0.463F, 2.4274F, -0.9277F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, -3.0681F, 0.1412F, -0.3433F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(60, 106).addBox(-0.463F, 1.703F, 0.4451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.6879F, 0.1412F, -0.3433F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(76, 41).addBox(-0.463F, -0.0463F, -0.6625F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 2.2289F, 0.1412F, -0.3433F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(11, 72).addBox(-0.463F, 0.1688F, -0.2002F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 2.6042F, 0.1412F, -0.3433F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(35, 99).addBox(-0.463F, -1.6074F, -4.9715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.3912F, 0.1412F, -0.3433F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(15, 40).addBox(-0.463F, -1.0828F, -4.3242F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 0.9549F, 0.1412F, -0.3433F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(7, 90).addBox(-0.463F, -2.6924F, 1.1145F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.3737F, 0.1412F, -0.3433F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(19, 17).addBox(-0.9895F, -1.9244F, -4.1641F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.1627F, -0.4258F, -0.042F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 107).addBox(-0.463F, -2.8042F, -1.9545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.1905F, 0.1412F, -0.3433F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(83, 4).addBox(-0.463F, -2.856F, -1.166F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.0508F, 0.1412F, -0.3433F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(107, 91).addBox(-0.463F, -3.072F, -0.6361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.5308F, 0.1412F, -0.3433F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(86, 90).addBox(-0.463F, -3.3391F, -2.782F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.5832F, 0.1412F, -0.3433F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(89, 68).addBox(-0.463F, -2.2523F, -5.0303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.59F, 3.3007F, -3.6084F, 1.2341F, 0.1412F, -0.3433F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(95, 99).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 13.9735F, 5.1691F, 0.0214F, -1.0566F, 0.1574F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(33, 14).addBox(1.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 13.9735F, 5.1691F, 0.8251F, -0.7601F, -0.8221F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(38, 22).addBox(1.5973F, 1.2036F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.9735F, 4.3191F, 0.4583F, -0.7132F, -0.6696F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(107, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.9735F, 4.3191F, -0.1844F, -0.8094F, 0.2287F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(107, 84).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 13.9735F, 4.8191F, -0.0597F, -0.6664F, 0.1992F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(57, 21).addBox(1.5973F, 1.2036F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 13.9735F, 4.8191F, 0.403F, -0.5491F, -0.5822F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(100, 95).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 14.0735F, 4.8191F, 0.0304F, -0.3266F, 0.2263F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(33, 69).addBox(1.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 14.0735F, 4.8191F, 0.2244F, -0.2412F, -0.4417F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(86, 99).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 13.6735F, 3.4191F, 0.0685F, -0.1739F, 0.2867F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(70, 57).addBox(1.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 13.6735F, 3.4191F, 0.1593F, -0.0978F, -0.3609F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(68, 19).addBox(1.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.1735F, 1.8191F, 0.1318F, 0.003F, -0.2897F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(97, 4).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.1735F, 1.8191F, 0.1073F, -0.0767F, 0.3518F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(106, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.7735F, 0.0191F, 0.1029F, -0.0385F, 0.1347F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(66, 23).addBox(1.5973F, 1.2036F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.7735F, 0.0191F, 0.1054F, 0.031F, -0.5074F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(105, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 11.7735F, -1.9809F, 0.0799F, -0.1139F, 0.2152F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(65, 48).addBox(1.4142F, 1.4142F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 11.7735F, -1.9809F, 0.1369F, -0.0243F, -0.5673F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(77, 17).addBox(1.4142F, 1.4142F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 10.5735F, -3.5809F, 0.1821F, 0.0157F, -0.7575F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(104, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 10.5735F, -3.5809F, 0.1406F, -0.1172F, 0.0182F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(45, 33).addBox(-0.5F, -1.0292F, 0.074F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.3821F, 0.0128F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 0.0F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.4821F, 0.5128F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.908F, 3.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.2F, -9.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9091F, 8.4669F, -4.9746F, -0.4638F, 0.0193F, -0.1295F));

		PartDefinition cube_r255 = leftarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(85, 76).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, 6.4738F, 0.4721F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 65).addBox(-1.5F, -0.4F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 7.0714F, -0.4239F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(85, 73).addBox(-1.5F, 0.1F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 5.0318F, 1.8565F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftarm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(85, 32).addBox(-1.5F, -0.9F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6F, 5.7978F, 1.1471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftarm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(58, 85).addBox(-0.5044F, -1.4094F, -1.3435F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, -1.2827F, -0.1731F, 0.1736F));

		PartDefinition cube_r260 = leftarm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(109, 14).addBox(-0.5054F, -0.5052F, -1.8951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, -1.6753F, -0.1739F, 0.1729F));

		PartDefinition cube_r261 = leftarm.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(109, 54).addBox(-0.5054F, -0.5519F, -1.8793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, -1.1343F, -0.1739F, 0.1729F));

		PartDefinition cube_r262 = leftarm.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(106, 4).addBox(0.1F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5894F, 0.3931F, -0.1931F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r263 = leftarm.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -1.5F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5894F, 1.7477F, -1.1445F, -0.1746F, 0.0014F, -0.001F));

		PartDefinition cube_r264 = leftarm.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 109).addBox(-0.5044F, 0.231F, 0.861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, -0.8028F, -0.1731F, 0.1736F));

		PartDefinition cube_r265 = leftarm.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(7, 95).addBox(-0.5044F, 0.3633F, -0.5775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5935F, 1.2309F, -1.0104F, 0.2619F, -0.1731F, 0.1736F));

		PartDefinition cube_r266 = leftarm.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(90, 3).addBox(-1.0F, -6.5475F, 0.0581F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.6F, 7.8209F, 2.2038F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r267 = leftarm.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(9, 79).addBox(-1.0F, -2.5F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 3.2083F, 0.4443F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9966F, 6.5529F, 0.6244F, -0.1238F, -0.0511F, 0.1861F));

		PartDefinition cube_r268 = leftarm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(99, 42).addBox(-0.1749F, 0.078F, -1.2076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7936F, 0.4361F, -0.5598F, 1.5708F, -1.3439F, -1.5097F));

		PartDefinition cube_r269 = leftarm2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(51, 90).addBox(-0.6306F, 4.8439F, -1.0308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7936F, 0.4361F, -0.5598F, 1.5272F, -1.4312F, -1.5097F));

		PartDefinition cube_r270 = leftarm2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(69, 73).addBox(0.0507F, 0.8724F, -1.2076F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7936F, 0.4361F, -0.5598F, 0.0F, -1.5708F, 0.0611F));

		PartDefinition cube_r271 = leftarm2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(83, 48).addBox(-0.2F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, 7.5057F, 0.0963F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r272 = leftarm2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(100, 85).addBox(1.4F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, -1.5081F, 0.1246F, -1.5708F, -0.4014F, 1.5708F));

		PartDefinition cube_r273 = leftarm2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(55, 65).addBox(0.2744F, -1.0299F, -1.4596F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.236F, 1.5425F, -0.1906F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r274 = leftarm2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(37, 82).addBox(-0.4256F, -0.3299F, -1.4596F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.236F, 0.3298F, 1.2549F, -1.5708F, -1.3003F, 1.5708F));

		PartDefinition cube_r275 = leftarm2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(74, 7).addBox(-3.2F, 0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, -2.6841F, 1.6562F, 1.5708F, -0.6981F, -1.5708F));

		PartDefinition cube_r276 = leftarm2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 77).addBox(-2.0F, 0.05F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2236F, -2.0624F, 1.2854F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition cube_r277 = leftarm2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(44, 85).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -2.5624F, 2.1514F, 1.5708F, -1.0472F, -1.5708F));

		PartDefinition cube_r278 = leftarm2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(37, 88).addBox(-1.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2236F, -0.5988F, 3.5671F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r279 = leftarm2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(65, 90).addBox(-0.2F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, -0.8158F, 2.1913F, -1.5708F, -0.6545F, 1.5708F));

		PartDefinition cube_r280 = leftarm2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(79, 81).addBox(-0.9F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 2.3915F, 1.2004F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r281 = leftarm2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(101, 26).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2236F, 5.6954F, 0.7336F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(63, 50).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5349F, 7.6017F, 0.2072F, 0.6035F, -0.0809F, -0.0328F));

		PartDefinition cube_r282 = leftArm3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(96, 110).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7627F, 1.8244F, 0.8017F, -0.3446F, 0.4024F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(53, 14).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0031F, 0.4866F, -0.3505F, 0.0791F, -0.037F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.4035F, 0.0886F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftArm5.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 35).addBox(-2.3002F, -0.4959F, -0.915F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9091F, 8.4669F, -4.9746F, 0.8452F, -0.0193F, 0.1295F));

		PartDefinition cube_r284 = rightarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 79).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6F, 6.4738F, 0.4721F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(69, 69).addBox(-1.5F, -0.4F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 7.0714F, -0.4239F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(86, 60).addBox(-1.5F, 0.1F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 5.0318F, 1.8565F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(86, 57).addBox(-1.5F, -0.9F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6F, 5.7978F, 1.1471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(72, 85).addBox(-0.4956F, -1.4094F, -1.3435F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, -1.2827F, 0.1731F, -0.1736F));

		PartDefinition cube_r289 = rightarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(109, 44).addBox(-0.4946F, -0.5052F, -1.8951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, -1.6753F, 0.1739F, -0.1729F));

		PartDefinition cube_r290 = rightarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(70, 109).addBox(-0.4946F, -0.5519F, -1.8793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, -1.1343F, 0.1739F, -0.1729F));

		PartDefinition cube_r291 = rightarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(25, 106).addBox(-1.1F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5894F, 0.3931F, -0.1931F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r292 = rightarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(94, 26).addBox(-1.0F, -1.5F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5894F, 1.7477F, -1.1445F, -0.1746F, -0.0014F, 0.001F));

		PartDefinition cube_r293 = rightarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(50, 110).addBox(-0.4956F, 0.231F, 0.861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, -0.8028F, 0.1731F, -0.1736F));

		PartDefinition cube_r294 = rightarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(95, 14).addBox(-0.4956F, 0.3633F, -0.5775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5935F, 1.2309F, -1.0104F, 0.2619F, 0.1731F, -0.1736F));

		PartDefinition cube_r295 = rightarm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(44, 90).addBox(-1.0F, -6.5475F, 0.0581F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.6F, 7.8209F, 2.2038F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r296 = rightarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(45, 79).addBox(-1.0F, -2.5F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 3.2083F, 0.4443F, 0.2705F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9966F, 6.5529F, 0.6244F, -1.3411F, -0.0806F, -0.1003F));

		PartDefinition cube_r297 = rightarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(51, 99).addBox(-0.8251F, 0.078F, -1.2076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7936F, 0.4361F, -0.5598F, 1.5708F, 1.3439F, 1.5097F));

		PartDefinition cube_r298 = rightarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(58, 90).addBox(-0.3694F, 4.8439F, -1.0308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7936F, 0.4361F, -0.5598F, 1.5272F, 1.4312F, 1.5097F));

		PartDefinition cube_r299 = rightarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(54, 74).addBox(-1.0507F, 0.8724F, -1.2076F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7936F, 0.4361F, -0.5598F, 0.0F, 1.5708F, -0.0611F));

		PartDefinition cube_r300 = rightarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(84, 10).addBox(-1.8F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, 7.5057F, 0.0963F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r301 = rightarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(100, 91).addBox(-2.4F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, -1.5081F, 0.1246F, -1.5708F, 0.4014F, -1.5708F));

		PartDefinition cube_r302 = rightarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(62, 65).addBox(-1.2744F, -1.0299F, -1.4596F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.236F, 1.5425F, -0.1906F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r303 = rightarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5744F, -0.3299F, -1.4596F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.236F, 0.3298F, 1.2549F, -1.5708F, 1.3003F, -1.5708F));

		PartDefinition cube_r304 = rightarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(76, 73).addBox(1.2F, 0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, -2.6841F, 1.6562F, 1.5708F, 0.6981F, 1.5708F));

		PartDefinition cube_r305 = rightarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(78, 0).addBox(0.0F, 0.05F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2236F, -2.0624F, 1.2854F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition cube_r306 = rightarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(51, 85).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, -2.5624F, 2.1514F, 1.5708F, 1.0472F, 1.5708F));

		PartDefinition cube_r307 = rightarm2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(89, 63).addBox(0.5F, -1.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2236F, -0.5988F, 3.5671F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r308 = rightarm2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(72, 90).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, -0.8158F, 2.1913F, -1.5708F, 0.6545F, -1.5708F));

		PartDefinition cube_r309 = rightarm2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(30, 82).addBox(-0.1F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 2.3915F, 1.2004F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r310 = rightarm2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(101, 30).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2236F, 5.6954F, 0.7336F, 1.5708F, 1.1345F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(22, 64).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5349F, 7.6017F, 0.2072F, 1.1264F, 0.0853F, 0.0202F));

		PartDefinition cube_r311 = rightArm3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(110, 101).addBox(-0.5F, -1.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7627F, 1.8244F, 0.8017F, 0.3446F, -0.4024F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(54, 0).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0031F, 0.4866F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 1.4035F, 0.0886F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightArm5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(38, 16).addBox(-1.6998F, -0.4959F, -0.915F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8008F, -6.3357F, 0.4028F, -0.0803F, -0.0342F));

		PartDefinition cube_r313 = neck2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(112, 91).addBox(0.0F, -1.5696F, -1.0657F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6529F, -1.7763F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r314 = neck2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(30, 73).addBox(0.0F, -2.956F, -0.9396F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6529F, 0.1237F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r315 = neck2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-0.8931F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1406F, -0.4017F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r316 = neck2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(107, 86).addBox(-1.1069F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1406F, -0.4017F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r317 = neck2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(28, 44).addBox(-1.0F, -0.2F, 0.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.167F, -3.6639F, 0.2267F, 0.0F, 0.0F));

		PartDefinition cube_r318 = neck.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(10, 105).addBox(0.0F, -0.4F, -1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9363F, -0.5691F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(71, 38).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3193F, -1.2078F, 1.501F, 0.0F, -3.1416F));

		PartDefinition cube_r320 = neck.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(41, 44).addBox(-1.0F, -1.1F, -0.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1935F, -2.7915F, -0.7786F, -0.0566F, 0.0664F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(70, 59).addBox(-2.0F, -0.0307F, -0.9613F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6F, -2.6F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(46, 69).addBox(-2.0F, -0.0307F, -0.9613F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6F, -2.6F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(40, 109).addBox(-0.5F, -0.094F, -2.9968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(102, 14).addBox(-1.0F, -0.094F, -1.9968F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.65F, -5.875F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(79, 102).addBox(-1.0F, 0.0279F, -1.0042F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.65F, -5.875F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(35, 110).addBox(-1.0F, -0.6221F, -1.3927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, 2.1369F, -7.9691F, 0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(110, 20).addBox(-1.0F, -0.7395F, -1.4298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.407F, -7.4333F, 1.1039F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(30, 110).addBox(-1.0F, -0.035F, -0.0327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.5F, 2.0602F, -9.4693F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(110, 33).addBox(-1.0F, -0.493F, -0.3179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.5F, 3.5542F, -8.6582F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(25, 110).addBox(-1.0F, -0.3452F, -0.4614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.8436F, -8.8164F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(20, 110).addBox(-1.0F, -0.5546F, -0.8974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 9.4748F, -22.9777F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0F, -0.5433F, -1.2985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 9.4013F, -22.3987F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(105, 34).addBox(-1.0F, -1.9408F, -0.4206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 11.6721F, -22.6298F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(23, 86).addBox(-1.0F, -2.1102F, -0.4095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 13.074F, -21.2033F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -2.1908F, -0.3766F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 14.1338F, -19.5072F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(30, 88).addBox(-1.0F, -2.2489F, -0.3381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 14.883F, -17.6529F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(88, 17).addBox(-1.0F, -2.2877F, -0.3029F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 15.3838F, -15.7166F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(52, 81).addBox(-1.0F, -0.7961F, -0.5694F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.225F, -4.9066F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -1.4531F, -2.9512F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.7433F, -6.0953F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(63, 103).addBox(-1.0F, -0.1533F, -0.9371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.7F, -5.9F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(22, 69).addBox(-2.0F, -0.0259F, -1.0099F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(0, 27).addBox(-2.0F, -0.0259F, -4.0099F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(104, 57).addBox(-1.0F, -0.0259F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.7197F, -4.9007F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(103, 101).addBox(-1.0F, -0.0259F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.766F, -4.6F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(103, 76).addBox(-1.0F, -0.0259F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(60, 39).addBox(-2.5F, 1.4606F, -4.0004F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 44).addBox(-2.5F, 1.9606F, -2.8004F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.6F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(84, 14).addBox(-1.5F, -1.0898F, -0.9811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -0.8729F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(83, 52).addBox(-1.5F, -0.6778F, -0.6669F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -1.6729F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(11, 68).addBox(-1.5F, -0.3792F, 0.1403F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 7.2104F, -0.6445F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, -2.2159F, -0.1408F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4742F, -1.1729F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(49, 26).addBox(-1.5F, -0.441F, -2.6452F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.2104F, -0.6445F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(93, 8).addBox(-1.1029F, -2.6152F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6029F, 10.3315F, -2.5344F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(105, 63).addBox(-0.8885F, -0.0135F, -0.0572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3885F, 11.1786F, -3.0114F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(61, 8).addBox(-3.5F, -0.963F, -0.9701F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.1733F, -0.9103F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(13, 48).addBox(-3.5F, 1.2605F, 0.4996F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(26, 56).addBox(-3.5F, -0.4395F, 2.0996F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.4267F, -2.6103F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(85, 29).addBox(-1.5F, -0.0213F, -0.9777F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.9752F, -3.4842F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(108, 30).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.8752F, -3.9842F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(80, 69).addBox(-1.0F, -0.0034F, -0.0131F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(17, 36).addBox(-2.2F, -0.5F, -0.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6978F, 10.1639F, -2.4225F, 1.5965F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(15, 34).addBox(-2.2F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6978F, 8.4219F, -1.664F, 1.1601F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(109, 95).addBox(-0.5F, 0.1271F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.2F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(41, 51).addBox(-2.1F, 0.8827F, -3.821F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 7.714F, -5.2298F, 1.3629F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(87, 0).addBox(-2.0F, -0.004F, -0.6934F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.3F, -3.8F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(48, 8).addBox(-2.0F, 1.096F, -0.1934F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(73, 25).addBox(-1.0F, 0.096F, -0.1934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.3F, -3.8F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(65, 44).addBox(-3.0605F, -0.1173F, -2.021F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 7.714F, -5.2298F, 1.232F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(103, 104).addBox(-0.5F, -2.7987F, -0.743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5092F, 0.2745F, 2.4045F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(79, 92).addBox(-1.2234F, -0.7726F, 0.1458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 51).addBox(-0.7234F, -0.7726F, 0.1458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7815F, 7.7145F, -3.6908F, 0.3392F, -0.5074F, 0.5544F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(92, 43).addBox(-0.6234F, -0.4726F, 0.8458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0554F, 9.549F, -4.6754F, 0.8851F, -0.7371F, 0.651F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(15, 109).addBox(0.0F, 0.0466F, -0.9371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0092F, 8.6415F, -5.198F, 1.7992F, -0.298F, -0.0681F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(45, 74).addBox(0.0F, 0.096F, -2.9934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(74, 50).addBox(0.4F, 0.096F, -2.9934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5092F, -1.5779F, -3.2682F, 1.7936F, -0.7647F, -0.1814F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(103, 109).addBox(0.0F, 0.0272F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(75, 109).addBox(0.4F, 0.0272F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5092F, -1.6149F, -3.2036F, 1.7549F, -0.7769F, -0.1298F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(102, 17).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5092F, -5.4548F, -3.6082F, 1.5223F, -0.4526F, 0.3903F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(108, 107).addBox(-0.9F, 0.0467F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0554F, 9.455F, -4.7096F, 1.6481F, -0.3656F, 0.3883F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(5, 103).addBox(-0.9818F, -1.3486F, 0.2008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(65, 85).addBox(-0.9818F, -0.3486F, -0.9992F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5092F, 13.5175F, -14.7846F, 1.5359F, 0.0524F, 0.0F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(28, 99).addBox(-0.8486F, 0.1711F, -0.7372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 99).addBox(-0.8486F, -0.5289F, -0.7372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.4092F, 4.232F, -5.61F, 0.9588F, 0.061F, -0.0744F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(95, 18).addBox(-0.8486F, -1.1398F, -0.781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-2.4092F, 4.232F, -5.61F, 0.8192F, 0.061F, -0.0744F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(72, 98).addBox(-0.8486F, 0.1172F, 0.2903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 99).addBox(-0.8486F, -0.5828F, 0.2903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F))
				.texOffs(106, 50).addBox(-0.8486F, -1.8652F, 1.2988F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.4092F, 4.232F, -5.61F, 1.3952F, 0.061F, -0.0744F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(50, 106).addBox(-0.8486F, -2.7197F, -0.9016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(55, 106).addBox(-0.8486F, -2.7197F, -0.5016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-2.4092F, 4.232F, -5.61F, 0.697F, 0.061F, -0.0744F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(35, 106).addBox(-0.8486F, -2.4133F, 0.542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4092F, 4.232F, -5.61F, 1.0897F, 0.061F, -0.0744F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(78, 30).addBox(-0.9818F, 1.5101F, -1.2065F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-2.5092F, 13.5175F, -14.7846F, 1.6668F, 0.0524F, 0.0F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(79, 59).addBox(-0.9818F, 4.39F, -1.5951F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5092F, 13.5175F, -14.7846F, 1.7541F, 0.0524F, 0.0F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(77, 11).addBox(-0.9762F, -2.8888F, -2.5524F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0092F, 10.6032F, -4.985F, 1.7939F, 0.0438F, 0.0434F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(16, 82).addBox(-0.9818F, 1.4537F, -1.2485F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5092F, 13.5175F, -14.7846F, 1.789F, 0.0524F, 0.0F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(23, 80).addBox(-0.9818F, 4.2094F, -1.9895F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.5092F, 13.5175F, -14.7846F, 1.9635F, 0.0524F, 0.0F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(61, 58).addBox(-0.9762F, -3.2404F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0092F, 10.6032F, -4.985F, 2.3088F, 0.0438F, 0.0434F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(78, 4).addBox(-0.9455F, 0.0342F, -0.0489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0554F, 9.549F, -4.6754F, 1.2905F, -0.52F, 0.9194F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(109, 47).addBox(-0.9934F, 0.0572F, -0.9246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0884F, 9.7059F, -4.6862F, 1.9524F, -0.3371F, 0.3056F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(109, 17).addBox(-0.8691F, -0.0619F, -1.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0884F, 9.7059F, -4.6862F, 2.0309F, -0.3598F, 0.4504F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(79, 98).addBox(0.0F, 0.0886F, -2.6087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-3.3092F, 1.6847F, -4.142F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(98, 34).addBox(0.0F, -0.9949F, -2.3907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.3092F, 3.2359F, -3.7501F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(98, 8).addBox(-1.0F, -0.0259F, -0.0099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0092F, 2.7982F, -3.2027F, 1.2828F, -0.103F, -0.3341F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(98, 22).addBox(-0.0605F, -0.0173F, -2.021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4092F, 6.579F, -4.4268F, 1.1626F, -0.5174F, 0.2292F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(105, 20).addBox(-0.625F, 0.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.8558F, 8.9378F, -1.516F, -0.2957F, 0.0732F, 0.2697F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(42, 105).addBox(-0.625F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.5094F, 10.9865F, -2.5094F, -0.8555F, 0.1996F, 0.1706F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(103, 104).mirror().addBox(-0.5F, -2.7987F, -0.743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5092F, 0.2745F, 2.4045F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(79, 92).mirror().addBox(0.2234F, -0.7726F, 0.1458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 51).mirror().addBox(-0.2766F, -0.7726F, 0.1458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7815F, 7.7145F, -3.6908F, 0.3392F, 0.5074F, -0.5544F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-0.3766F, -0.4726F, 0.8458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0554F, 9.549F, -4.6754F, 0.8851F, 0.7371F, -0.651F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(15, 109).mirror().addBox(-1.0F, 0.0466F, -0.9371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 8.6415F, -5.198F, 1.7992F, 0.298F, 0.0681F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-1.0F, 0.096F, -2.9934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(74, 50).mirror().addBox(-1.4F, 0.096F, -2.9934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5092F, -1.5779F, -3.2682F, 1.7936F, 0.7647F, 0.1814F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(103, 109).mirror().addBox(-1.0F, 0.0272F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(75, 109).mirror().addBox(-1.4F, 0.0272F, -0.0217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5092F, -1.6149F, -3.2036F, 1.7549F, 0.7769F, 0.1298F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(102, 17).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5092F, -5.4548F, -3.6082F, 1.5223F, 0.4526F, -0.3903F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(108, 107).mirror().addBox(-0.1F, 0.0467F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0554F, 9.455F, -4.7096F, 1.6481F, 0.3656F, -0.3883F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.0182F, -1.3486F, 0.2008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(65, 85).mirror().addBox(-0.0182F, -0.3486F, -0.9992F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 13.5175F, -14.7846F, 1.5359F, -0.0524F, 0.0F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(28, 99).mirror().addBox(-0.1514F, 0.1711F, -0.7372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 99).mirror().addBox(-0.1514F, -0.5289F, -0.7372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.4092F, 4.232F, -5.61F, 0.9588F, -0.061F, 0.0744F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-0.1514F, -1.1398F, -0.781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(2.4092F, 4.232F, -5.61F, 0.8192F, -0.061F, 0.0744F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(-0.1514F, 0.1172F, 0.2903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(21, 99).mirror().addBox(-0.1514F, -0.5828F, 0.2903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(106, 50).mirror().addBox(-0.1514F, -1.8652F, 1.2988F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.4092F, 4.232F, -5.61F, 1.3952F, -0.061F, 0.0744F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(-0.1514F, -2.7197F, -0.9016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(55, 106).mirror().addBox(-0.1514F, -2.7197F, -0.5016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(2.4092F, 4.232F, -5.61F, 0.697F, -0.061F, 0.0744F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(35, 106).mirror().addBox(-0.1514F, -2.4133F, 0.542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4092F, 4.232F, -5.61F, 1.0897F, -0.061F, 0.0744F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(78, 30).mirror().addBox(-0.0182F, 1.5101F, -1.2065F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 13.5175F, -14.7846F, 1.6668F, -0.0524F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(-0.0182F, 4.39F, -1.5951F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 13.5175F, -14.7846F, 1.7541F, -0.0524F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(77, 11).mirror().addBox(-0.0238F, -2.8888F, -2.5524F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 10.6032F, -4.985F, 1.7939F, -0.0438F, -0.0434F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(16, 82).mirror().addBox(-0.0182F, 1.4537F, -1.2485F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 13.5175F, -14.7846F, 1.789F, -0.0524F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(23, 80).mirror().addBox(-0.0182F, 4.2094F, -1.9895F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(2.5092F, 13.5175F, -14.7846F, 1.9635F, -0.0524F, 0.0F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-0.0238F, -3.2404F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0092F, 10.6032F, -4.985F, 2.3088F, -0.0438F, -0.0434F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.0545F, 0.0342F, -0.0489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0554F, 9.549F, -4.6754F, 1.2905F, 0.52F, -0.9194F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(109, 47).mirror().addBox(-0.0066F, 0.0572F, -0.9246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0884F, 9.7059F, -4.6862F, 1.9524F, 0.3371F, -0.3056F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(109, 17).mirror().addBox(-0.1309F, -0.0619F, -1.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0884F, 9.7059F, -4.6862F, 2.0309F, 0.3598F, -0.4504F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(-1.0F, 0.0886F, -2.6087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(3.3092F, 1.6847F, -4.142F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(98, 34).mirror().addBox(-1.0F, -0.9949F, -2.3907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.3092F, 3.2359F, -3.7501F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(0.0F, -0.0259F, -0.0099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.0092F, 2.7982F, -3.2027F, 1.2828F, 0.103F, 0.3341F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.9395F, -0.0173F, -2.021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4092F, 6.579F, -4.4268F, 1.1626F, 0.5174F, -0.2292F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(105, 20).mirror().addBox(-0.375F, 0.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.8558F, 8.9378F, -1.516F, -0.2957F, -0.0732F, -0.2697F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(42, 105).mirror().addBox(-0.375F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.5094F, 10.9865F, -2.5094F, -0.8555F, -0.1996F, -0.1706F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1332F, 3.5162F, 0.0623F, 0.0F, 0.0F, 0.0262F));

		PartDefinition cube_r422 = leftOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(110, 66).addBox(-0.9214F, -0.394F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.331F, 0.6959F, -1.1136F, 0.5624F, 1.3187F, -0.7453F));

		PartDefinition cube_r423 = leftOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(91, 22).addBox(-0.2465F, -0.93F, -0.2452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1189F, 0.8909F, -0.271F, 2.0799F, 1.5091F, 0.7132F));

		PartDefinition cube_r424 = leftOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(92, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0112F, -1.3845F, -0.3871F, 0.3657F, 1.2438F, -1.1648F));

		PartDefinition cube_r425 = leftOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(52, 51).addBox(-0.0523F, -1.93F, -0.0298F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0993F, -3.9685F, -0.5396F, -3.0038F, 0.9815F, 1.2615F));

		PartDefinition cube_r426 = leftOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(110, 63).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.543F, -2.533F, -0.6562F, -2.909F, 1.2865F, 1.2221F));

		PartDefinition cube_r427 = leftOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(60, 110).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0352F, -2.0427F, -0.5707F, 2.0215F, 1.2865F, 1.2221F));

		PartDefinition cube_r428 = leftOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(55, 110).addBox(-1.0522F, -0.93F, -0.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 79).addBox(-1.0522F, -2.93F, 0.9702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5139F, -1.8558F, -0.94F, 3.0687F, 1.2865F, 1.2221F));

		PartDefinition cube_r429 = leftOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(91, 35).addBox(-1.0522F, -0.93F, 0.0702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5014F, -0.6541F, -1.4358F, 0.2926F, 1.1612F, -1.2431F));

		PartDefinition cube_r430 = leftOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(21, 91).addBox(-0.14F, -0.93F, -0.249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1189F, 0.8909F, -0.271F, 2.8173F, 1.4011F, 1.4541F));

		PartDefinition cube_r431 = leftOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(86, 104).addBox(-0.075F, -0.2F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4451F, 0.8024F, -3.5077F, 1.9267F, -0.2196F, -2.2343F));

		PartDefinition cube_r432 = leftOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(110, 76).addBox(-0.05F, -0.2F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2893F, 1.5639F, -3.4221F, 1.9553F, 0.3752F, -1.3414F));

		PartDefinition cube_r433 = leftOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(30, 78).addBox(-1.1414F, -0.5F, -1.495F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.468F, 1.663F, -2.9658F, 2.324F, 0.1803F, -0.5007F));

		PartDefinition cube_r434 = leftOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(14, 93).addBox(-0.35F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7366F, 2.5568F, -2.0112F, 1.5254F, 0.348F, 2.0219F));

		PartDefinition cube_r435 = leftOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(99, 46).addBox(-1.0052F, 0.2082F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1597F, 1.2729F, -1.3898F, 0.8236F, 0.0133F, 0.5012F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1332F, 3.5162F, 0.0623F, 0.0F, 0.0F, -0.0262F));

		PartDefinition cube_r436 = rightOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(110, 66).mirror().addBox(-0.0786F, -0.394F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.331F, 0.6959F, -1.1136F, 0.5624F, -1.3187F, 0.7453F));

		PartDefinition cube_r437 = rightOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-0.7535F, -0.93F, -0.2452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 0.8909F, -0.271F, 2.0799F, -1.5091F, -0.7132F));

		PartDefinition cube_r438 = rightOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0112F, -1.3845F, -0.3871F, 0.3657F, -1.2438F, 1.1648F));

		PartDefinition cube_r439 = rightOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(52, 51).mirror().addBox(-0.9477F, -1.93F, -0.0298F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0993F, -3.9685F, -0.5396F, -3.0038F, -0.9815F, -1.2615F));

		PartDefinition cube_r440 = rightOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(110, 63).mirror().addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.543F, -2.533F, -0.6562F, -2.909F, -1.2865F, -1.2221F));

		PartDefinition cube_r441 = rightOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(60, 110).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.0352F, -2.0427F, -0.5707F, 2.0215F, -1.2865F, -1.2221F));

		PartDefinition cube_r442 = rightOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(55, 110).mirror().addBox(0.0522F, -0.93F, -0.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 79).mirror().addBox(0.0522F, -2.93F, 0.9702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5139F, -1.8558F, -0.94F, 3.0687F, -1.2865F, -1.2221F));

		PartDefinition cube_r443 = rightOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(0.0522F, -0.93F, 0.0702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5014F, -0.6541F, -1.4358F, 0.2926F, -1.1612F, 1.2431F));

		PartDefinition cube_r444 = rightOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(21, 91).mirror().addBox(-0.86F, -0.93F, -0.249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 0.8909F, -0.271F, 2.8173F, -1.4011F, -1.4541F));

		PartDefinition cube_r445 = rightOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(86, 104).mirror().addBox(-1.925F, -0.2F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4451F, 0.8024F, -3.5077F, 1.9267F, 0.2196F, 2.2343F));

		PartDefinition cube_r446 = rightOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(110, 76).mirror().addBox(-0.95F, -0.2F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2893F, 1.5639F, -3.4221F, 1.9553F, -0.3752F, 1.3414F));

		PartDefinition cube_r447 = rightOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-0.8586F, -0.5F, -1.495F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.468F, 1.663F, -2.9658F, 2.324F, -0.1803F, 0.5007F));

		PartDefinition cube_r448 = rightOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(14, 93).mirror().addBox(-0.65F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7366F, 2.5568F, -2.0112F, 1.5254F, -0.348F, -2.0219F));

		PartDefinition cube_r449 = rightOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(0.0052F, 0.2082F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1597F, 1.2729F, -1.3898F, 0.8236F, -0.0133F, -0.5012F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(108, 73).addBox(0.9F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(108, 73).mirror().addBox(-3.1F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, 2.1038F, -1.1376F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(42, 101).mirror().addBox(-1.0047F, -0.1782F, -0.173F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(42, 101).addBox(-0.8047F, -0.1782F, -0.173F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6953F, 4.2165F, -7.4278F, -2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-1.2585F, -1.128F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(85, 107).mirror().addBox(-1.2585F, -1.128F, -0.0038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6953F, 4.2165F, -7.4278F, -2.2961F, -0.1211F, 0.016F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(108, 104).mirror().addBox(-1.2585F, -1.0932F, -0.998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7302F, 5.7135F, -7.3383F, -1.8597F, -0.1211F, 0.016F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(80, 105).mirror().addBox(-1.2585F, -2.1149F, 0.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7604F, 3.3281F, -6.7766F, -2.3397F, -0.1211F, 0.016F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(-1.2585F, -1.8149F, 0.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.557F, 3.4335F, -8.4611F, -1.5805F, -0.1211F, 0.016F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(111, 3).mirror().addBox(-1.0F, -0.0879F, 0.0385F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 3).addBox(1.8F, -0.0879F, 0.0385F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.4359F, -4.5011F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(35, 60).mirror().addBox(-1.0F, -3.3879F, -1.2865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 60).addBox(1.8F, -3.3879F, -1.2865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.2F, -5.4F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-1.0F, -0.2879F, -0.0865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 102).addBox(1.2F, -0.2879F, -0.0865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 3.9122F, -3.4574F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(-2.0F, -1.9677F, -2.0732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(7, 85).addBox(2.0F, -1.9677F, -2.0732F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, 6.0551F, -2.4516F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(98, 101).mirror().addBox(-1.0F, 0.3823F, -1.7732F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(98, 101).addBox(1.2F, 0.3823F, -1.7732F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 6.1054F, -2.3026F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(75, 105).mirror().addBox(-1.0F, -2.0177F, -0.9732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 105).addBox(1.2F, -2.0177F, -0.9732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 6.2938F, -4.5074F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(105, 67).mirror().addBox(-1.0F, -2.0177F, -0.9732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(105, 67).addBox(1.2F, -2.0177F, -0.9732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.2F, 5.9982F, -6.4854F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-1.0F, -1.0177F, -1.9732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(92, 47).addBox(3.0F, -1.0177F, -1.9732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, 5.183F, -0.7284F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-1.0F, 0.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 88).addBox(3.0F, 0.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 2.2534F, -2.2823F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-1.0F, -1.9735F, -0.7785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(71, 41).addBox(3.0F, -1.9735F, -0.7785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1F, 1.2997F, -1.6765F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(15, 105).mirror().addBox(-1.0F, 0.8F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(15, 105).addBox(3.0F, 0.8F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1F, 0.869F, -1.7436F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(105, 8).mirror().addBox(-1.0F, -1.2263F, -0.3168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(105, 8).addBox(3.0F, -1.2263F, -0.3168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, 1.2997F, -1.6765F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(110, 8).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(110, 8).addBox(3.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, 3.6722F, 0.5487F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(109, 88).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(109, 88).addBox(3.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.6F, 4.5293F, 0.0337F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(93, 101).mirror().addBox(-0.5F, -1.6F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(93, 101).addBox(3.5F, -1.6F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.6F, 2.8321F, -1.0444F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(79, 87).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(79, 87).addBox(3.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.1F, 0.9F, 0.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(10, 110).addBox(0.2585F, -1.128F, -0.3038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(85, 107).addBox(0.2585F, -1.128F, -0.0038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5047F, 4.2165F, -7.4278F, -2.2961F, 0.1211F, -0.016F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(108, 104).addBox(0.2585F, -1.0932F, -0.998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4698F, 5.7135F, -7.3383F, -1.8597F, 0.1211F, -0.016F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(80, 105).addBox(0.2585F, -2.1149F, 0.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4396F, 3.3281F, -6.7766F, -2.3397F, 0.1211F, -0.016F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(70, 105).addBox(0.2585F, -1.8149F, 0.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.643F, 3.4335F, -8.4611F, -1.5805F, 0.1211F, -0.016F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 57).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(91, 26).addBox(0.0F, -0.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4726F, 1.7644F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r475 = tail.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(88, 22).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(14, 97).addBox(-0.5F, -0.5182F, -0.047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3617F, 3.8924F, 0.4115F, -0.08F, -0.0349F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0286F, 1.9011F, 0.2657F, -0.1685F, -0.0456F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0173F, 1.5755F, 0.5387F, -0.2261F, -0.1332F));

		return LayerDefinition.create(meshdefinition, 116, 116);
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