package fossils.fossils.client.blockentity.model.monachus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MonachusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart hips;
	private final ModelPart leftarm4;
	private final ModelPart leftarm5;
	private final ModelPart leftArm6;
	private final ModelPart rightarm4;
	private final ModelPart rightarm5;
	private final ModelPart rightArm6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart bone;

	public MonachusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.hips = this.body5.getChild("hips");
		this.leftarm4 = this.hips.getChild("leftarm4");
		this.leftarm5 = this.leftarm4.getChild("leftarm5");
		this.leftArm6 = this.leftarm5.getChild("leftArm6");
		this.rightarm4 = this.hips.getChild("rightarm4");
		this.rightarm5 = this.rightarm4.getChild("rightarm5");
		this.rightArm6 = this.rightarm5.getChild("rightArm6");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.bone = this.neck2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -5.1791F, -9.1025F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 70).addBox(0.0F, -1.5912F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2146F, -2.0706F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 70).addBox(0.0F, -1.4274F, -1.0655F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2847F, -2.8863F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 9).mirror().addBox(-0.6061F, -0.9858F, -1.326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(0, 39).mirror().addBox(-0.6061F, -1.6858F, -0.926F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 2.5815F, -0.2143F, 0.3683F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-0.6061F, -1.3367F, 0.0162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, -0.6998F, -0.2143F, 0.3683F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 62).mirror().addBox(-0.6061F, -0.6428F, 0.8734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 2.2935F, -0.2143F, 0.3683F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 13).mirror().addBox(-0.6061F, -0.1304F, -0.0926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 1.5168F, -0.2143F, 0.3683F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 25).mirror().addBox(-0.6061F, -0.4878F, -0.1659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 1.8572F, -0.2143F, 0.3683F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-1.0069F, 0.037F, -0.4566F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2869F, -1.5099F, 0.0186F, 0.4945F, -0.3946F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 70).mirror().addBox(-1.9822F, -0.2248F, -0.4566F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2869F, -1.5099F, -0.1211F, 0.481F, -0.6908F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-4.6777F, -0.9629F, -0.4566F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2869F, -1.5099F, -0.3074F, 0.3942F, -1.1243F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 72).mirror().addBox(-0.7171F, 0.2848F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9649F, -3.435F, -0.0634F, 0.5854F, -0.6144F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 26).mirror().addBox(-1.7664F, 0.0895F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9649F, -3.435F, -0.2292F, 0.5469F, -0.9216F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-2.602F, -0.5893F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9649F, -3.435F, -0.4303F, 0.4147F, -1.3503F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-0.6061F, 1.1183F, -0.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 0.33F, -0.2143F, 0.3683F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(25, 30).mirror().addBox(-0.6061F, 0.0868F, -0.1407F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 0.3823F, -0.2143F, 0.3683F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 40).mirror().addBox(-0.6061F, -0.7502F, -0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 2.7211F, -0.2143F, 0.3683F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 53).mirror().addBox(-0.6061F, -0.0347F, 1.0918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 1.0892F, -0.2143F, 0.3683F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(61, 6).mirror().addBox(-0.6061F, -1.9552F, -0.2328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 1.8833F, -0.2143F, 0.3683F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-0.6004F, -0.1484F, -1.8474F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 1.4375F, 0.2747F, 0.5677F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(23, 43).mirror().addBox(-0.6061F, -0.3016F, -2.1845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4627F, 1.0449F, -1.1633F, 1.2201F, -0.2143F, 0.3683F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 48).mirror().addBox(-3.3148F, -0.963F, -0.4315F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1132F, 5.1216F, 0.196F, 0.2142F, 0.1891F, 0.1761F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-1.4148F, -0.3924F, -0.332F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 3.9479F, -2.0627F, 0.2474F, 0.1267F, 0.6004F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(71, 10).addBox(0.0069F, 0.037F, -0.4566F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2869F, -1.5099F, 0.0186F, -0.4945F, 0.3946F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 70).addBox(0.9822F, -0.2248F, -0.4566F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2869F, -1.5099F, -0.1211F, -0.481F, 0.6908F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 48).addBox(1.6777F, -0.9629F, -0.4566F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2869F, -1.5099F, -0.3074F, -0.3942F, 1.1243F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 72).addBox(-0.2829F, 0.2848F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9649F, -3.435F, -0.0634F, -0.5854F, 0.6144F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 26).addBox(0.7664F, 0.0895F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9649F, -3.435F, -0.2292F, -0.5469F, 0.9216F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(28, 72).addBox(1.602F, -0.5893F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9649F, -3.435F, -0.4303F, -0.4147F, 1.3503F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(56, 8).addBox(-0.3939F, -1.3367F, 0.0162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, -0.6998F, 0.2143F, -0.3683F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 3).addBox(-0.3939F, 1.1183F, -0.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 0.33F, 0.2143F, -0.3683F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(25, 30).addBox(-0.3939F, 0.0868F, -0.1407F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 0.3823F, 0.2143F, -0.3683F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 40).addBox(-0.3939F, -0.7502F, -0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 2.7211F, 0.2143F, -0.3683F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 13).addBox(-0.3939F, -0.1304F, -0.0926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 1.5168F, 0.2143F, -0.3683F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 53).addBox(-0.3939F, -0.0347F, 1.0918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 1.0892F, 0.2143F, -0.3683F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(57, 62).addBox(-0.3939F, -0.6428F, 0.8734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 2.2935F, 0.2143F, -0.3683F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 25).addBox(-0.3939F, -0.4878F, -0.1659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 1.8572F, 0.2143F, -0.3683F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(61, 9).addBox(-0.3939F, -0.9858F, -1.326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(0, 39).addBox(-0.3939F, -1.6858F, -0.926F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 2.5815F, 0.2143F, -0.3683F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 6).addBox(-0.3939F, -1.9552F, -0.2328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 1.8833F, 0.2143F, -0.3683F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 46).addBox(-0.3996F, -0.1484F, -1.8474F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 1.4375F, -0.2747F, -0.5677F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 43).addBox(-0.3939F, -0.3016F, -2.1845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4627F, 1.0449F, -1.1633F, 1.2201F, 0.2143F, -0.3683F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(30, 48).addBox(0.3148F, -0.963F, -0.4315F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1132F, 5.1216F, 0.196F, 0.2142F, -0.1891F, -0.1761F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 51).addBox(-0.5852F, -0.3924F, -0.332F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.851F, 3.9479F, -2.0627F, 0.2474F, -0.1267F, -0.6004F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(16, 30).addBox(-1.0F, -0.0548F, -3.106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.5823F, 0.7202F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 40).addBox(-1.0F, -0.1874F, -2.2504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 3.3823F, -2.0798F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(11, 18).addBox(-0.5F, -0.2553F, -0.0229F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -3.7706F, 0.3578F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.0389F, 0.319F, 0.1929F, -0.0285F));

		PartDefinition cube_r46 = body6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 6).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1921F, 1.0781F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(33, 72).addBox(0.0F, -1.7127F, -0.0015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.541F, -0.0173F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 28).addBox(0.0F, -1.386F, -0.1002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.541F, 2.0827F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 12).mirror().addBox(-4.7257F, -0.9445F, -0.46F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1326F, 0.4972F, -0.2029F, 0.0969F, -1.1675F));

		PartDefinition cube_r50 = body6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-2.0191F, -0.1891F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1326F, 0.4972F, -0.1495F, 0.1682F, -0.7688F));

		PartDefinition cube_r51 = body6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-1.0333F, 0.0811F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1326F, 0.4972F, -0.1007F, 0.2011F, -0.5045F));

		PartDefinition cube_r52 = body6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-1.0333F, 0.0811F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1326F, 2.4972F, -0.1396F, 0.1798F, -0.5119F));

		PartDefinition cube_r53 = body6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-2.0191F, -0.1891F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1326F, 2.4972F, -0.1812F, 0.1378F, -0.7736F));

		PartDefinition cube_r54 = body6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 4).mirror().addBox(-5.7257F, -0.9445F, -0.46F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1326F, 2.4972F, -0.2201F, 0.0567F, -1.1688F));

		PartDefinition cube_r55 = body6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 55).addBox(0.0333F, 0.0811F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1326F, 0.4972F, -0.1007F, -0.2011F, 0.5045F));

		PartDefinition cube_r56 = body6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 53).addBox(1.0191F, -0.1891F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1326F, 0.4972F, -0.1495F, -0.1682F, 0.7688F));

		PartDefinition cube_r57 = body6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-4.7951F, 0.8256F, 2.51F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.6278F, -0.9409F, -0.0113F, 0.223F, 0.1955F));

		PartDefinition cube_r58 = body6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-4.1507F, 0.5637F, 0.6097F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.6278F, -0.9409F, 0.0284F, 0.239F, 0.375F));

		PartDefinition cube_r59 = body6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0254F, 0.0054F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.6278F, -0.9409F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 0).addBox(-0.1616F, 0.6289F, 2.7248F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6278F, -0.9409F, -0.0113F, -0.223F, -0.1955F));

		PartDefinition cube_r61 = body6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 48).addBox(0.2466F, 0.2039F, 0.8403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6278F, -0.9409F, 0.0284F, -0.239F, -0.375F));

		PartDefinition cube_r62 = body6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(49, 12).addBox(1.7257F, -0.9445F, -0.46F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1326F, 0.4972F, -0.2029F, -0.0969F, 1.1675F));

		PartDefinition cube_r63 = body6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 57).addBox(0.0333F, 0.0811F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1326F, 2.4972F, -0.1396F, -0.1798F, 0.5119F));

		PartDefinition cube_r64 = body6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(72, 51).addBox(1.0191F, -0.1891F, -0.46F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1326F, 2.4972F, -0.1812F, -0.1378F, 0.7736F));

		PartDefinition cube_r65 = body6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(36, 4).addBox(1.7257F, -0.9445F, -0.46F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1326F, 2.4972F, -0.2201F, -0.0567F, 1.1688F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create().texOffs(73, 44).addBox(0.0F, -1.704F, 1.7647F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.186F, 3.9776F, -0.1591F, 0.1655F, -0.0706F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(73, 32).addBox(0.0F, -1.0269F, -0.1409F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4326F, -0.0516F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(35, 27).mirror().addBox(-6.1204F, -1.1667F, -0.6187F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4326F, 2.2484F, -0.3508F, 0.2705F, -1.1035F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-1.4812F, 0.149F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4326F, 2.2484F, -0.1061F, 0.4273F, -0.4151F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(33, 70).mirror().addBox(-2.4693F, -0.2394F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4326F, 2.2484F, -0.2179F, 0.3848F, -0.6965F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-1.4812F, 0.149F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.0047F, 0.3642F, -0.2933F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-2.4693F, -0.2394F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.1028F, 0.35F, -0.5725F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-4.0028F, 0.4087F, 1.7967F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 9).mirror().addBox(-4.1028F, 0.0086F, -0.2033F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6135F, 5.4857F, 0.9607F, 0.1366F, 0.2284F, 0.4456F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(11, 12).addBox(-1.0F, -0.9428F, 0.0083F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.1137F, -0.1185F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(36, 2).addBox(0.0028F, 0.4087F, 1.7967F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 9).addBox(-0.8972F, 0.0086F, -0.2033F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6135F, 5.4857F, 0.9607F, 0.1366F, -0.2284F, -0.4456F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(35, 25).mirror().addBox(-6.1204F, -1.1667F, -0.6187F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.234F, 0.2817F, -0.989F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(33, 70).addBox(1.4692F, -0.2394F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 2.2484F, -0.2179F, -0.3848F, 0.6965F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 71).addBox(0.4812F, 0.149F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 2.2484F, -0.1061F, -0.4273F, 0.4151F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 27).addBox(2.1204F, -1.1667F, -0.6187F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 2.2484F, -0.3508F, -0.2705F, 1.1035F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 8).addBox(0.4812F, 0.149F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.0047F, -0.3642F, 0.2933F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(70, 24).addBox(1.4692F, -0.2394F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.1028F, -0.35F, 0.5725F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 25).addBox(2.1204F, -1.1667F, -0.6187F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.234F, -0.2817F, 0.989F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -1.0F, -9.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4433F, 8.9202F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1307F, 3.6903F, 0.2233F, 0.2129F, 0.0479F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 61).addBox(0.0F, -0.9304F, -0.0509F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3704F, 2.2044F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(36, 72).addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7704F, 0.7044F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(33, 11).addBox(-0.5F, -0.1512F, 7.7474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2624F, -7.4423F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(-1.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1019F, 2.4581F, -0.3414F, 0.3187F, -0.5013F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-2.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1019F, 2.4581F, -0.4093F, 0.2222F, -0.754F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(21, 47).mirror().addBox(-5.1204F, -1.1667F, -0.6186F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1019F, 2.4581F, -0.4601F, 0.0512F, -1.1211F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(34, 35).mirror().addBox(-6.1204F, -1.1667F, -0.6186F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5019F, 0.4581F, -0.4449F, 0.0826F, -1.1201F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-1.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5019F, 0.4581F, -0.309F, 0.3353F, -0.4909F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(-2.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5019F, 0.4581F, -0.3831F, 0.246F, -0.748F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 47).addBox(2.1204F, -1.1667F, -0.6186F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1019F, 2.4581F, -0.4601F, -0.0512F, 1.1211F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(70, 67).addBox(1.4692F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1019F, 2.4581F, -0.4093F, -0.2222F, 0.754F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(65, 71).addBox(0.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1019F, 2.4581F, -0.3414F, -0.3187F, 0.5013F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 65).addBox(1.4692F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5019F, 0.4581F, -0.3831F, -0.246F, 0.748F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(60, 71).addBox(0.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5019F, 0.4581F, -0.309F, -0.3353F, 0.4909F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(34, 35).addBox(2.1204F, -1.1667F, -0.6186F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5019F, 0.4581F, -0.4449F, -0.0826F, 1.1201F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(22, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2994F, 2.8653F, -0.3452F, 0.1644F, -0.0588F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 69).addBox(0.0F, -2.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(46, 69).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-3.1204F, -1.1667F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3012F, 3.3928F, -0.3004F, 0.3637F, -1.0878F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-2.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3012F, 3.3928F, -0.1287F, 0.4505F, -0.6603F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(6, 72).mirror().addBox(-1.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3012F, 3.3928F, 0.0012F, 0.4674F, -0.3686F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-4.1204F, -1.1667F, -0.6186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4013F, 1.3928F, -0.3217F, 0.3249F, -1.095F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-2.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4013F, 1.3928F, -0.1665F, 0.4235F, -0.6763F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-1.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4013F, 1.3928F, -0.044F, 0.4512F, -0.3887F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(6, 72).addBox(0.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3012F, 3.3928F, 0.0012F, -0.4674F, 0.3686F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 6).addBox(1.4692F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3012F, 3.3928F, -0.1287F, -0.4505F, 0.6603F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 72).addBox(2.1204F, -1.1667F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3012F, 3.3928F, -0.3004F, -0.3637F, 1.0878F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(70, 71).addBox(0.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4013F, 1.3928F, -0.044F, -0.4512F, 0.3887F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(70, 69).addBox(1.4692F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4013F, 1.3928F, -0.1665F, -0.4235F, 0.6763F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 49).addBox(2.1204F, -1.1667F, -0.6186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4013F, 1.3928F, -0.3217F, -0.3249F, 1.095F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(69, 51).addBox(0.0F, -2.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1084F, 0.2603F, -0.028F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(52, 69).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 4.0F, 0.0F, -0.2182F, -0.4363F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(69, 59).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 4.0F, 0.0F, 0.2182F, 0.4363F));

		PartDefinition cube_r116 = body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(69, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(11, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(69, 55).addBox(0.0F, -2.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(0.0F, -2.1F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1436F, 0.1998F, -0.1578F));

		PartDefinition cube_r117 = body5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-0.8F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.854F, -0.1239F, 3.5213F, 0.1255F, -0.0239F, -0.2349F));

		PartDefinition cube_r118 = body5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-0.4F, 0.1F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2789F, 0.2529F, 1.3562F, 0.1283F, -0.0884F, -0.4192F));

		PartDefinition cube_r119 = body5.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(10, 56).addBox(-1.2F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.854F, -0.1239F, 3.5213F, 0.1255F, 0.0239F, 0.2349F));

		PartDefinition cube_r120 = body5.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(53, 27).addBox(-1.6F, 0.1F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2789F, 0.2529F, 1.3562F, 0.1283F, 0.0884F, 0.4192F));

		PartDefinition hips = body5.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0414F, 3.9235F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r121 = hips.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(45, 73).addBox(0.0F, -0.5986F, 3.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 69).addBox(0.0F, -1.3986F, 1.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 18).mirror().addBox(-2.5F, 0.4014F, 1.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 18).addBox(0.5F, 0.4014F, 1.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4473F, 0.1279F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r122 = hips.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(66, 6).mirror().addBox(-0.5F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9268F, 4.0661F, 2.5532F, -0.8145F, -0.2724F, -0.392F));

		PartDefinition cube_r123 = hips.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(67, 27).mirror().addBox(-0.8063F, 0.2669F, 0.2303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(25, 67).mirror().addBox(-0.8063F, 0.2669F, -0.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6973F, 0.4026F, 1.8975F, -1.4108F, 0.3176F, -0.6694F));

		PartDefinition cube_r124 = hips.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-0.3434F, -0.5F, -1.2097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2426F, 4.6548F, 3.8366F, -2.745F, 0.0986F, -1.4214F));

		PartDefinition cube_r125 = hips.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.8063F, 0.0804F, -0.2412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(20, 64).mirror().addBox(-0.8063F, 0.0804F, -0.9412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6973F, 0.4026F, 1.8975F, -2.3183F, 0.3176F, -0.6694F));

		PartDefinition cube_r126 = hips.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(10, 58).mirror().addBox(-0.8063F, -0.491F, -0.8376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6973F, 0.4026F, 1.8975F, -1.6551F, 0.3176F, -0.6694F));

		PartDefinition cube_r127 = hips.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(59, 59).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5927F, 0.9826F, 2.0331F, -1.2275F, 0.3176F, -0.6694F));

		PartDefinition cube_r128 = hips.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(47, 60).mirror().addBox(3.5392F, 11.3646F, 19.2789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.503F, -21.6212F, 2.3391F, -1.0946F, -0.1663F, 0.1795F));

		PartDefinition cube_r129 = hips.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(59, 56).mirror().addBox(3.5392F, 5.1983F, 21.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.503F, -21.6212F, 2.3391F, -1.3477F, -0.1663F, 0.1795F));

		PartDefinition cube_r130 = hips.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 40).mirror().addBox(-0.2175F, 0.734F, -2.209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3072F, 3.5845F, 2.9148F, -1.7279F, -0.1808F, -0.4119F));

		PartDefinition cube_r131 = hips.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-0.436F, 0.5676F, -0.7609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3072F, 3.5845F, 2.9148F, -1.4398F, -0.3631F, -0.3107F));

		PartDefinition cube_r132 = hips.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(33, 16).mirror().addBox(-1.281F, -1.4443F, -2.1078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3072F, 3.5845F, 2.9148F, -0.7605F, 0.2936F, 0.2456F));

		PartDefinition cube_r133 = hips.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(7, 30).mirror().addBox(-0.7163F, -0.5F, -1.3527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2426F, 4.6548F, 3.8366F, -2.7379F, -0.2073F, -1.5503F));

		PartDefinition cube_r134 = hips.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(47, 4).mirror().addBox(-0.8255F, -1.8177F, 0.0037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3072F, 3.5845F, 2.9148F, -1.2551F, -0.0046F, 0.1452F));

		PartDefinition cube_r135 = hips.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(47, 4).addBox(-0.1745F, -1.8177F, 0.0037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3072F, 3.5845F, 2.9148F, -1.2551F, 0.0046F, -0.1452F));

		PartDefinition cube_r136 = hips.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(66, 9).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(66, 6).addBox(-0.5F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9268F, 4.0661F, 2.5532F, -0.8145F, 0.2724F, 0.392F));

		PartDefinition cube_r137 = hips.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(7, 30).addBox(-0.2837F, -0.5F, -1.3527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2426F, 4.6548F, 3.8366F, -2.7379F, 0.2073F, 1.5503F));

		PartDefinition cube_r138 = hips.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(33, 16).addBox(0.281F, -1.4443F, -2.1078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3072F, 3.5845F, 2.9148F, -0.7605F, -0.2936F, -0.2456F));

		PartDefinition cube_r139 = hips.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(54, 57).addBox(-0.564F, 0.5676F, -0.7609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3072F, 3.5845F, 2.9148F, -1.4398F, 0.3631F, 0.3107F));

		PartDefinition cube_r140 = hips.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(7, 40).addBox(-0.7825F, 0.734F, -2.209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3072F, 3.5845F, 2.9148F, -1.7279F, 0.1808F, 0.4119F));

		PartDefinition cube_r141 = hips.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(59, 56).addBox(-4.5392F, 5.1983F, 21.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.503F, -21.6212F, 2.3391F, -1.3477F, 0.1663F, -0.1795F));

		PartDefinition cube_r142 = hips.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(47, 60).addBox(-4.5392F, 11.3646F, 19.2789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.503F, -21.6212F, 2.3391F, -1.0946F, 0.1663F, -0.1795F));

		PartDefinition cube_r143 = hips.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 59).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5927F, 0.9826F, 2.0331F, -1.2275F, -0.3176F, 0.6694F));

		PartDefinition cube_r144 = hips.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(10, 58).addBox(-0.1937F, -0.491F, -0.8376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6973F, 0.4026F, 1.8975F, -1.6551F, -0.3176F, 0.6694F));

		PartDefinition cube_r145 = hips.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(20, 64).addBox(-0.1937F, 0.0804F, -0.9412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(68, 18).addBox(-0.1937F, 0.0804F, -0.2412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6973F, 0.4026F, 1.8975F, -2.3183F, -0.3176F, 0.6694F));

		PartDefinition cube_r146 = hips.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(67, 27).addBox(-0.1937F, 0.2669F, 0.2303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(25, 67).addBox(-0.1937F, 0.2669F, -0.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6973F, 0.4026F, 1.8975F, -1.4108F, -0.3176F, 0.6694F));

		PartDefinition cube_r147 = hips.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(49, 8).addBox(-0.6566F, -0.5F, -1.2097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2426F, 4.6548F, 3.8366F, -2.745F, -0.0986F, 1.4214F));

		PartDefinition leftarm4 = hips.addOrReplaceChild("leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5896F, 1.6128F, 2.8807F, -1.5722F, 0.1905F, -1.136F));

		PartDefinition cube_r148 = leftarm4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(67, 30).addBox(-0.1F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.8767F, 0.4727F, 0.6684F, 0.2499F, 0.2065F, -0.6733F));

		PartDefinition cube_r149 = leftarm4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(25, 61).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(59, 12).addBox(0.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4767F, -0.4273F, 1.2684F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r150 = leftarm4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(63, 18).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0229F, 0.92F, 0.0928F, 0.7155F, 0.0014F, -0.001F));

		PartDefinition cube_r151 = leftarm4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(44, 52).addBox(-0.5F, -1.2F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0264F, 1.8106F, 1.9295F, 2.4434F, 0.0014F, -0.001F));

		PartDefinition cube_r152 = leftarm4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(49, 53).addBox(-0.011F, -0.5746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4662F, 0.9306F, 0.0291F, 0.794F, 0.0014F, -0.001F));

		PartDefinition leftarm5 = leftarm4.addOrReplaceChild("leftarm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0084F, 1.8324F, 1.6299F, 1.4787F, -0.9407F, 0.5458F));

		PartDefinition cube_r153 = leftarm5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(22, 24).addBox(-4.0F, 0.1F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3005F, 3.1979F, 0.5106F, 1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r154 = leftarm5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(36, 6).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.3005F, 0.8366F, -0.3362F, 1.5708F, -0.0349F, -1.5708F));

		PartDefinition cube_r155 = leftarm5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(58, 23).addBox(-0.9F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3005F, 0.5727F, 0.1363F, 1.5708F, 0.8465F, -1.5708F));

		PartDefinition cube_r156 = leftarm5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(24, 53).addBox(0.1F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3005F, 1.1764F, 0.0618F, 1.5708F, -0.288F, -1.5708F));

		PartDefinition cube_r157 = leftarm5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(5, 53).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.3005F, 1.6895F, 0.9201F, 1.5689F, -1.2484F, -1.5577F));

		PartDefinition cube_r158 = leftarm5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(39, 48).addBox(-0.3976F, -1.667F, -0.501F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.3014F, 4.5408F, -0.1882F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r159 = leftarm5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(27, 57).addBox(-1.0174F, -2.1408F, -0.4986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2991F, 3.2487F, 0.0241F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition leftArm6 = leftarm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2559F, 6.7147F, 0.7899F, -0.0744F, 0.001F, -0.1323F));

		PartDefinition cube_r160 = leftArm6.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm4 = hips.addOrReplaceChild("rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5896F, 1.6128F, 2.8807F, -1.1219F, -0.1138F, 0.7984F));

		PartDefinition cube_r161 = rightarm4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(35, 67).addBox(-0.9F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.8767F, 0.4727F, 0.6684F, 0.2499F, -0.2065F, 0.6733F));

		PartDefinition cube_r162 = rightarm4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(62, 29).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(59, 15).addBox(-1.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4767F, -0.4273F, 1.2684F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r163 = rightarm4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.0229F, 0.92F, 0.0928F, 0.7155F, -0.0014F, 0.001F));

		PartDefinition cube_r164 = rightarm4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -1.2F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0264F, 1.8106F, 1.9295F, 2.4434F, -0.0014F, 0.001F));

		PartDefinition cube_r165 = rightarm4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(54, 4).addBox(-0.989F, -0.5746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4662F, 0.9306F, 0.0291F, 0.794F, -0.0014F, 0.001F));

		PartDefinition rightarm5 = rightarm4.addOrReplaceChild("rightarm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0084F, 1.8324F, 1.6299F, 1.5088F, 0.5056F, -0.5013F));

		PartDefinition cube_r166 = rightarm5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(22, 27).addBox(-1.0F, 0.1F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3004F, 3.1979F, 0.5106F, 1.5708F, 0.0524F, 1.5708F));

		PartDefinition cube_r167 = rightarm5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(34, 37).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.3004F, 0.8366F, -0.3362F, 1.5708F, 0.0349F, 1.5708F));

		PartDefinition cube_r168 = rightarm5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(58, 36).addBox(-0.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3004F, 0.5727F, 0.1363F, 1.5708F, -0.8465F, 1.5708F));

		PartDefinition cube_r169 = rightarm5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(29, 53).addBox(-1.1F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3004F, 1.1764F, 0.0618F, 1.5708F, 0.288F, 1.5708F));

		PartDefinition cube_r170 = rightarm5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.3004F, 1.6895F, 0.9201F, 1.5689F, 1.2484F, 1.5577F));

		PartDefinition cube_r171 = rightarm5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 14).addBox(-0.6024F, -1.667F, -0.501F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3014F, 4.5408F, -0.1882F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r172 = rightarm5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 29).addBox(0.0174F, -2.1408F, -0.4986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.299F, 3.2487F, 0.0241F, -1.5708F, 1.2915F, -1.5708F));

		PartDefinition rightArm6 = rightarm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2559F, 6.7147F, 0.7899F, -0.0744F, -0.001F, 0.1323F));

		PartDefinition cube_r173 = rightArm6.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5F, -0.3902F, -0.0618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 73).addBox(0.0F, -0.6902F, 0.9382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.491F, 3.6799F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5F, -0.3994F, -0.0157F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 2.7985F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, -0.4244F, -0.0278F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0097F, 2.9368F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4736F, 3.1263F, -1.6057F, 0.7222F, 0.465F, -0.0618F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(45, 66).addBox(-0.1F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.8767F, 0.4727F, 0.6684F, 0.2499F, 0.2065F, -0.6733F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(65, 65).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 63).addBox(0.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4767F, -0.4273F, 1.2684F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(15, 63).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F))
				.texOffs(62, 62).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0229F, 0.92F, 0.0928F, 0.7155F, 0.0014F, -0.001F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(20, 61).addBox(-0.4995F, -0.9334F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0241F, 2.0894F, 0.4944F, 0.4013F, 0.0014F, -0.001F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(10, 61).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(0.0241F, 1.3894F, 0.5944F, 1.6667F, 0.0014F, -0.001F));

		PartDefinition cube_r179 = leftarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(54, 14).addBox(-0.0082F, -0.4326F, -0.3005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4662F, 1.8306F, 1.3291F, 1.2653F, 0.0014F, -0.001F));

		PartDefinition cube_r180 = leftarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(34, 53).addBox(-0.011F, -0.2746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4662F, 0.9306F, 0.0291F, 0.794F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2779F, 2.3818F, 2.6859F, 0.1989F, -0.2165F, 0.083F));

		PartDefinition cube_r181 = leftarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 50).addBox(-3.3F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, -0.4729F, 0.3301F, 1.5708F, 0.4276F, -1.5708F));

		PartDefinition cube_r182 = leftarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(18, 49).addBox(-1.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.1764F, -0.4729F, 0.3301F, 1.5708F, 0.384F, -1.5708F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(57, 33).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, -0.9222F, 0.7277F, 1.5708F, 0.8465F, -1.5708F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(19, 52).addBox(0.1F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.1764F, -0.3185F, 0.6531F, 1.5708F, -0.288F, -1.5708F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(51, 49).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.1764F, 1.1732F, 0.8099F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(68, 36).addBox(-1.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 33).addBox(-0.6F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.1764F, 2.7698F, 1.5861F, 1.5708F, -0.3491F, -1.5708F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(68, 48).addBox(-0.1103F, -0.1763F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3236F, 2.9954F, 0.2336F, 1.5708F, -0.8203F, -1.5708F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(65, 68).addBox(-0.0736F, 0.4232F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 68).addBox(-0.0736F, 0.1232F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3236F, 1.7954F, -0.2664F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(5, 57).addBox(-0.1736F, -0.1768F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3236F, 1.7954F, -0.2664F, 1.5708F, -0.8901F, -1.5708F));

		PartDefinition cube_r190 = leftarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(44, 56).addBox(-0.1335F, -0.5622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0321F, 3.0053F, 1.48F, 0.9696F, -0.03F, 0.0837F));

		PartDefinition cube_r191 = leftArm3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4736F, 3.1263F, -1.6057F, 0.0359F, 0.0566F, 0.8215F));

		PartDefinition cube_r192 = rightarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(20, 67).addBox(-0.9F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.8767F, 0.4727F, 0.6684F, 0.2499F, -0.2065F, 0.6733F));

		PartDefinition cube_r193 = rightarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 50).addBox(-1.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4767F, -0.4273F, 1.2684F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r194 = rightarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F))
				.texOffs(63, 44).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0229F, 0.92F, 0.0928F, 0.7155F, -0.0014F, 0.001F));

		PartDefinition cube_r195 = rightarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(35, 61).addBox(-0.5005F, -0.9334F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.0241F, 2.0894F, 0.4944F, 0.4013F, -0.0014F, 0.001F));

		PartDefinition cube_r196 = rightarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(30, 61).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-0.0241F, 1.3894F, 0.5944F, 1.6667F, -0.0014F, 0.001F));

		PartDefinition cube_r197 = rightarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(39, 54).addBox(-0.9918F, -0.4326F, -0.3005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4662F, 1.8306F, 1.3291F, 1.2653F, -0.0014F, 0.001F));

		PartDefinition cube_r198 = rightarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(54, 0).addBox(-0.989F, -0.2746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4662F, 0.9306F, 0.0291F, 0.794F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2779F, 2.3818F, 2.6859F, -0.0372F, -0.1946F, -0.1214F));

		PartDefinition cube_r199 = rightarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(7, 50).addBox(1.3F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, -0.4729F, 0.3301F, 1.5708F, -0.4276F, 1.5708F));

		PartDefinition cube_r200 = rightarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(44, 49).addBox(-0.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.1764F, -0.4729F, 0.3301F, 1.5708F, -0.384F, 1.5708F));

		PartDefinition cube_r201 = rightarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(49, 57).addBox(0.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, -0.9222F, 0.7277F, 1.5708F, -0.8465F, 1.5708F));

		PartDefinition cube_r202 = rightarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(52, 32).addBox(-1.1F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.1764F, -0.3185F, 0.6531F, 1.5708F, 0.288F, 1.5708F));

		PartDefinition cube_r203 = rightarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(14, 52).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.1764F, 1.1732F, 0.8099F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition cube_r204 = rightarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(68, 45).addBox(0.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 42).addBox(-0.4F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.1764F, 2.7698F, 1.5861F, 1.5708F, 0.3491F, 1.5708F));

		PartDefinition cube_r205 = rightarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 68).addBox(-0.8897F, -0.1763F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3236F, 2.9954F, 0.2336F, 1.5708F, 0.8203F, 1.5708F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(69, 3).addBox(-0.9264F, 0.4232F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 0).addBox(-0.9264F, 0.1232F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3236F, 1.7954F, -0.2664F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(22, 57).addBox(-0.8264F, -0.1768F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.3236F, 1.7954F, -0.2664F, 1.5708F, 0.8901F, 1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 57).addBox(-0.8665F, -0.5622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0321F, 3.0053F, 1.48F, 0.9696F, 0.03F, -0.0837F));

		PartDefinition cube_r209 = rightArm3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -2.0F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2539F, -3.7545F, 0.0715F, -0.2176F, -0.0155F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 69).addBox(0.0F, -1.4314F, -1.861F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 0.0158F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(6, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0322F, -1.3406F, 0.0633F, 0.0295F, -0.4354F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(6, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0322F, -1.3406F, 0.0633F, -0.0295F, 0.4354F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 44).addBox(-0.5F, -0.4315F, -1.8645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 0.0158F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0299F, -1.7964F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r214 = neck.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 17).addBox(0.0F, -0.3F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5181F, -1.5181F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r215 = neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.113F, -1.4187F, 0.0454F, 0.0262F, -0.523F));

		PartDefinition cube_r216 = neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(20, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.113F, -1.4187F, 0.0454F, -0.0262F, 0.523F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, -0.466F, -1.916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0049F, -0.0064F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0049F, -1.9064F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(3, 70).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4941F, -0.8334F, -1.7614F, -2.9519F, -0.1084F, -2.6283F));

		PartDefinition cube_r219 = neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(3, 70).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, -0.8334F, -1.7614F, -2.9519F, 0.1084F, 2.6283F));

		PartDefinition cube_r220 = neck3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 44).addBox(-0.5F, -0.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(44, 21).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3382F, -1.7601F, -0.2865F, -0.3294F, -0.1674F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3815F, 0.4877F, -0.6582F, 0.5877F, -0.0633F, -0.0942F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(5, 64).addBox(-0.5F, 0.3737F, -0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1913F, -3.2049F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(44, 37).addBox(-0.5F, -0.9981F, -0.1436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.7037F, -2.2654F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(64, 3).addBox(-0.5F, -0.9745F, -1.3079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5686F, -1.8303F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(63, 38).addBox(-0.6F, -0.9734F, -0.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5686F, -0.4303F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(37, 44).addBox(-0.5F, 0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2686F, -2.0303F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(67, 62).addBox(-0.5F, -0.5583F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.8002F, -4.138F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(17, 56).addBox(-1.0F, 0.0143F, -0.9705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.5546F, -3.1414F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(63, 35).addBox(-1.0F, -0.0246F, -0.2574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.9546F, -4.0414F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(51, 20).addBox(-1.5F, -0.0659F, -0.9473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 1.8546F, -3.9414F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(51, 40).addBox(-1.0F, -0.8F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6908F, -2.9268F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(51, 37).addBox(-1.0F, -1.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.1543F, -4.0838F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(51, 43).addBox(-1.0F, -0.826F, -0.1325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 3.1768F, -2.5175F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(25, 35).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.7768F, -3.6175F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(68, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.1723F, -4.0429F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(32, 50).addBox(-1.0F, -1.6F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.451F, -4.4668F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(25, 50).addBox(-1.9F, -0.2356F, -0.1878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 3.3816F, -4.4445F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(50, 29).addBox(-1.0F, -0.1597F, -0.2177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.7845F, -4.3535F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.002F, 0.0348F, -0.0756F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.002F, -1.3732F, -1.3011F, 0.6277F, -0.5964F, -0.0825F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(73, 38).addBox(0.002F, 0.0348F, -0.0756F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -1.3732F, -1.3011F, 0.6277F, 0.5964F, 0.0825F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(10, 64).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F))
				.texOffs(64, 0).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.002F, -1.172F, -0.7088F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(35, 21).addBox(-1.0F, -0.9171F, -2.8788F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.002F, -1.939F, 0.0968F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(73, 41).addBox(0.0F, 0.0013F, -0.0527F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.6078F, -1.9228F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.002F, -0.6842F, -1.2245F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(39, 73).addBox(-0.005F, -0.0226F, -0.9881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0555F, -2.4886F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(73, 35).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0555F, -1.7886F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(16, 39).addBox(0.498F, 0.1905F, -1.9242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0F, -1.4F, -1.4F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6328F, 4.1225F, -4.2599F, -0.0278F, -0.093F, -0.2528F));

		PartDefinition cube_r249 = leftCanine.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(63, 21).addBox(-0.5063F, -0.31F, -0.3418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0328F, 0.2479F, 0.1413F, 0.8675F, 0.1853F, 0.0618F));

		PartDefinition cube_r250 = leftCanine.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(15, 60).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0544F, 0.1171F, 0.0175F, 0.6057F, 0.1853F, 0.0618F));

		PartDefinition cube_r251 = leftCanine.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(50, 66).addBox(-0.5556F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0228F, 0.67F, 0.6103F, 0.9828F, 0.055F, 0.1502F));

		PartDefinition cube_r252 = leftCanine.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(52, 60).addBox(1.0143F, 2.1061F, -7.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1856F, -5.2565F, 5.7651F, 0.4311F, 0.1853F, 0.0618F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6328F, 4.1225F, -4.2599F, -0.0278F, 0.093F, 0.2528F));

		PartDefinition cube_r253 = rightCanine.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(63, 21).mirror().addBox(-0.4937F, -0.31F, -0.3418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.0328F, 0.2479F, 0.1413F, 0.8675F, -0.1853F, -0.0618F));

		PartDefinition cube_r254 = rightCanine.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0544F, 0.1171F, 0.0175F, 0.6057F, -0.1853F, -0.0618F));

		PartDefinition cube_r255 = rightCanine.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(50, 66).mirror().addBox(-0.4444F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.67F, 0.6103F, 0.9828F, -0.055F, -0.1502F));

		PartDefinition cube_r256 = rightCanine.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-2.0142F, 2.1061F, -7.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1856F, -5.2565F, 5.7651F, 0.4311F, -0.1853F, -0.0618F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.0495F, -4.4505F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(60, 65).addBox(-0.8F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0805F, -4.7815F, 4.5011F, 0.7978F, -0.1556F, -0.08F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(44, 45).addBox(-0.9F, -0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1342F, -4.2075F, 4.2284F, 0.8025F, 0.1821F, 0.2628F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(64, 53).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2044F, -5.2639F, 4.0898F, 0.7138F, 0.362F, -0.3877F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(45, 33).addBox(-0.2774F, 0.9199F, -1.7858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.3054F, -5.7797F, 3.0422F, 0.6125F, 0.5821F, -0.2279F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(35, 64).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6899F, -5.725F, 3.8624F, 0.5962F, 0.7984F, -0.8543F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(30, 44).addBox(-0.8341F, 0.1579F, -1.7858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3054F, -5.7797F, 3.0422F, 0.2035F, 0.7984F, -0.8543F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(73, 20).addBox(1.1F, -0.6751F, -1.4876F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -2.1265F, 2.0871F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 61).addBox(-0.2F, -1.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.3F, 0.4015F, -0.0163F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(43, 29).addBox(0.4F, -0.8945F, -1.8311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -1.7266F, 1.8871F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(30, 67).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.6F, -1.9325F, 1.3792F, 1.6755F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.0495F, -4.4505F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(60, 65).mirror().addBox(-0.2F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0805F, -4.7815F, 4.5011F, 0.7978F, 0.1556F, 0.08F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(44, 45).mirror().addBox(-0.1F, -0.7F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1342F, -4.2075F, 4.2284F, 0.8025F, -0.1821F, -0.2628F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2044F, -5.2639F, 4.0898F, 0.7138F, -0.362F, 0.3877F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-0.7226F, 0.9199F, -1.7858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.3054F, -5.7797F, 3.0422F, 0.6125F, -0.5821F, 0.2279F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(35, 64).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6899F, -5.725F, 3.8624F, 0.5962F, -0.7984F, 0.8543F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.1659F, 0.1579F, -1.7858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3054F, -5.7797F, 3.0422F, 0.2035F, -0.7984F, 0.8543F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-1.1F, -0.6751F, -1.4876F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.1265F, 2.0871F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.8F, -1.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.4015F, -0.0163F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 29).mirror().addBox(-1.4F, -0.8945F, -1.8311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5F, -1.7266F, 1.8871F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.9325F, 1.3792F, 1.6755F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(1.2F, 1.0328F, 2.6323F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(42, 17).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.1049F, -0.4772F, -1.9897F, 2.1538F, -0.99F, -1.6887F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(16, 35).addBox(0.3186F, 0.3729F, 0.0948F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7118F, 0.5429F, -4.7545F, 1.6676F, -1.0926F, -1.1297F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5897F, 0.4949F, -3.1762F, 0.4805F, -0.8407F, -0.2018F));

		PartDefinition cube_r280 = leftOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(47, 0).addBox(-0.8038F, -0.4348F, -1.2808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1767F, 1.654F, -5.4684F, 1.3737F, 0.1018F, 1.3068F));

		PartDefinition cube_r281 = leftOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(64, 15).addBox(-0.6738F, -0.1232F, 0.2953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 12).addBox(-0.6738F, -0.1232F, -0.3047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0366F, 0.4401F, -4.5646F, 0.2286F, 0.113F, 0.4028F));

		PartDefinition cube_r282 = leftOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(44, 41).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.6995F, 0.8633F, -4.2943F, 0.3857F, 0.113F, 0.4028F));

		PartDefinition cube_r283 = leftOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(64, 59).addBox(-0.7742F, -0.2475F, -0.6765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0366F, 0.6401F, -4.7646F, 0.2984F, 0.113F, 0.4028F));

		PartDefinition cube_r284 = leftOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(63, 41).addBox(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7F, 0.9122F, -6.1401F, 1.1907F, -0.2542F, -0.5617F));

		PartDefinition cube_r285 = leftOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(64, 56).addBox(-0.7742F, -0.236F, -0.8353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0366F, 0.6401F, -4.7646F, 0.089F, 0.113F, 0.4028F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 66).addBox(-0.7461F, 0.4368F, -0.1423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8118F, 0.9429F, -6.1545F, 0.8181F, 0.0081F, 0.4174F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-1.2F, 1.0328F, 2.6323F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(42, 17).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.1049F, -0.4772F, -1.9897F, 2.1538F, 0.99F, 1.6887F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(16, 35).mirror().addBox(-2.3186F, 0.3729F, 0.0948F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7118F, 0.5429F, -4.7545F, 1.6676F, 1.0926F, 1.1297F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(23, 39).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5897F, 0.4949F, -3.1762F, 0.4805F, 0.8407F, 0.2018F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-0.1962F, -0.4348F, -1.2808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1767F, 1.654F, -5.4684F, 1.3737F, -0.1018F, -1.3068F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-0.3262F, -0.1232F, 0.2953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 12).mirror().addBox(-0.3262F, -0.1232F, -0.3047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0366F, 0.4401F, -4.5646F, 0.2286F, -0.113F, -0.4028F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.6995F, 0.8633F, -4.2943F, 0.3857F, -0.113F, -0.4028F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-0.2258F, -0.2475F, -0.6765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0366F, 0.6401F, -4.7646F, 0.2984F, -0.113F, -0.4028F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-0.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.9122F, -6.1401F, 1.1907F, 0.2542F, 0.5617F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(-0.2258F, -0.236F, -0.8353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0366F, 0.6401F, -4.7646F, 0.089F, -0.113F, -0.4028F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.2539F, 0.4368F, -0.1423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8118F, 0.9429F, -6.1545F, 0.8181F, -0.0081F, -0.4174F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.5818F, -0.7775F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -1.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 1.3546F, -7.0224F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(10, 53).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4774F, 0.9124F, -3.1544F, -1.5475F, -0.158F, -0.0744F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(37, 58).mirror().addBox(-0.5F, -0.5052F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3316F, 0.9949F, -3.1711F, -1.5393F, -0.346F, -0.0853F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.3316F, 0.9949F, -3.1711F, -1.644F, -0.346F, -0.0853F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(58, 42).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.14F, 0.9051F, -3.7397F, -1.6F, -0.3008F, -0.1018F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(58, 45).mirror().addBox(-0.5F, -0.5163F, -0.4527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.14F, 0.9051F, -3.7397F, -1.9316F, -0.3008F, -0.1018F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(62, 32).mirror().addBox(-1.0F, -1.0215F, 0.5664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(62, 32).addBox(0.6F, -1.0215F, 0.5664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9F, 0.1354F, -2.7694F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(30, 64).addBox(1.1F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.4F, 0.9517F, -2.205F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(32, 57).mirror().addBox(-0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(32, 57).addBox(1.1F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, 1.7168F, -2.6434F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8393F, -0.8707F, -0.7936F, -0.1377F, -0.1342F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 24).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(55, 65).addBox(1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 24).addBox(1.1F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 0.82F, -1.3467F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.3543F, -0.4426F, -0.2533F, -0.067F, -0.2533F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-1.1F, -0.9179F, -0.1076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(69, 12).addBox(0.7F, -0.9179F, -0.1076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.9F, -0.9989F, -1.5019F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(15, 69).addBox(0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(15, 69).mirror().addBox(-1.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.1845F, -1.0663F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.6F, -0.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 69).addBox(1.2F, -0.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, -0.532F, -1.8564F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.6F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7488F, -4.1945F, -2.3746F, -0.3264F, 0.3211F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.3F, -0.6031F, -2.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 67).addBox(0.3F, -0.6031F, -2.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 1.8106F, -5.3257F, -2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(10, 53).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, 0.9124F, -3.1544F, -1.5475F, 0.158F, 0.0744F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(37, 58).addBox(-0.5F, -0.5052F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1316F, 0.9949F, -3.1711F, -1.5393F, 0.346F, 0.0853F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(58, 39).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1316F, 0.9949F, -3.1711F, -1.644F, 0.346F, 0.0853F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(58, 42).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.06F, 0.9051F, -3.7397F, -1.6F, 0.3008F, 0.1018F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(58, 45).addBox(-0.5F, -0.5163F, -0.4527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.06F, 0.9051F, -3.7397F, -1.9316F, 0.3008F, 0.1018F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(25, 64).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 0.8393F, -0.8707F, -0.7936F, 0.1377F, 0.1342F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(68, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.7F, 0.3543F, -0.4426F, -0.2533F, 0.067F, 0.2533F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(10, 67).addBox(-0.4F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3F, 0.7488F, -4.1945F, -2.3746F, 0.3264F, -0.3211F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2572F, 0.9281F, -4.2069F, -1.1202F, 0.0554F, -2.6677F));

		PartDefinition cube_r322 = leftCanine3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(58, 20).addBox(-0.1686F, -0.4758F, -0.7791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, 0.1917F, 0.6381F, 0.7397F, 0.1277F, 0.0092F));

		PartDefinition cube_r323 = leftCanine3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(60, 26).addBox(-0.3104F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2259F, 0.6846F, 0.3202F, 1.1838F, 0.1255F, 0.0068F));

		PartDefinition cube_r324 = leftCanine3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(59, 53).addBox(-0.2104F, -0.694F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2385F, 0.3192F, 0.6756F, 0.8151F, 0.1853F, 0.0618F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9428F, 0.9281F, -4.2069F, -1.1202F, -0.0554F, 2.6677F));

		PartDefinition cube_r325 = rightCanine3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(-0.8314F, -0.4758F, -0.7791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.275F, 0.1917F, 0.6381F, 0.7397F, -0.1277F, -0.0092F));

		PartDefinition cube_r326 = rightCanine3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(60, 26).mirror().addBox(-0.6896F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2259F, 0.6846F, 0.3202F, 1.1838F, -0.1255F, -0.0068F));

		PartDefinition cube_r327 = rightCanine3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-0.7896F, -0.694F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2385F, 0.3192F, 0.6756F, 0.8151F, -0.1853F, -0.0618F));

		PartDefinition bone = neck2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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