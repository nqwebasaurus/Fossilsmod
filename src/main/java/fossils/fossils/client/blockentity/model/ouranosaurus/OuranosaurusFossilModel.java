package fossils.fossils.client.blockentity.model.ouranosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OuranosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone5;
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
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie4;
	private final ModelPart chest2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck6;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public OuranosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
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
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie4 = this.rightArm3.getChild("opposablePinkie4");
		this.chest2 = this.chest.getChild("chest2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone3 = this.chest2.getChild("bone3");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck7 = this.neck5.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck6 = this.neck9.getChild("neck6");
		this.heads = this.neck6.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -38.4752F, 6.0094F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-4.0F, 1.0F, 0.0F, 3.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 18).addBox(1.0F, 1.0F, 0.0F, 3.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 123).addBox(0.0F, -5.0F, -2.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -8.8597F, 8.9029F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 111).addBox(0.0F, -5.8382F, -1.5676F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2995F, 7.071F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 104).addBox(-0.004F, -11.7382F, -0.2676F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.57F, 7.8619F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 101).addBox(0.0F, -11.7382F, -0.0676F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.57F, 7.8619F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 47).addBox(0.0F, -4.6F, -4.4F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.7458F, 0.988F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 94).addBox(0.0F, -6.05F, -1.1F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.6848F, 5.1941F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 82).addBox(-0.004F, -6.15F, -0.6F, 0.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 82).addBox(0.004F, -6.15F, -0.6F, 0.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9202F, 2.2033F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0058F, -2.5266F, 3.7692F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(121, 27).addBox(-0.4072F, -2.8302F, -0.23F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -1.3363F, -0.2548F, 0.2396F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(141, 99).addBox(-0.4F, -0.2541F, 3.6478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -0.7612F, -0.2433F, 0.243F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(136, 18).addBox(-0.4F, 2.2697F, -1.5264F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, 1.0714F, -0.2433F, 0.243F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 78).addBox(-0.5F, -1.2F, -2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3623F, 7.0368F, -10.0367F, 0.3491F, -0.3229F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 112).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3944F, 0.0738F, -8.0097F, -0.1688F, -0.1213F, 0.0493F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(129, 21).addBox(-0.5F, -1.225F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5916F, 0.4918F, -6.5628F, -0.7797F, -0.1213F, 0.0493F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(135, 117).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.599F, 3.0985F, -15.7183F, 0.0077F, -0.1299F, 0.016F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(102, 106).addBox(-0.5211F, -0.29F, -10.6038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, 0.3044F, -0.1299F, 0.016F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 85).addBox(-0.5211F, -1.1404F, -8.6303F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, 0.4789F, -0.1299F, 0.016F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(95, 42).addBox(2.5381F, -1.9965F, -7.5353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, 0.5264F, 0.173F, 0.1902F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(120, 99).addBox(0.7958F, -1.9965F, -6.4623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, 0.5185F, -0.0542F, 0.0596F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(120, 94).addBox(-0.5211F, -1.9965F, -6.6084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(97, 145).addBox(-0.5211F, -1.9965F, -7.6084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, 0.5226F, -0.1299F, 0.016F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5211F, -0.6574F, -4.0705F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, 0.1735F, -0.1299F, 0.016F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 115).addBox(-0.4093F, -0.1922F, -2.2415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(43, 115).addBox(-0.4093F, -0.1922F, -1.9415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.6012F, -0.7767F, -5.8955F, -0.0985F, -0.1147F, 0.1193F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(120, 22).addBox(0.247F, -0.0017F, -0.3451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1373F, 0.092F, 0.0881F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(119, 118).addBox(0.8949F, -0.0017F, -0.4931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1372F, -0.0809F, 0.112F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(74, 119).addBox(-0.5166F, -0.0017F, -0.2079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1402F, 0.2216F, 0.0698F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(135, 95).addBox(-0.225F, -0.725F, -2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.99F, 0.8214F, 0.3311F, -0.0964F, -0.0697F, 0.1551F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 18).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4942F, -0.0243F, -4.0892F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(123, 46).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.21F, 0.4508F, -1.3399F, -0.0884F, 0.1888F, 0.0946F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(135, 91).addBox(-4.5776F, -15.1971F, 6.7816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -1.8107F, -0.0063F, -0.0495F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(106, 92).addBox(-2.5402F, -5.5543F, 12.4832F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -1.0298F, -0.074F, 0.0627F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(121, 76).addBox(-4.5776F, -17.7392F, -1.7677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -2.2906F, -0.0063F, -0.0495F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(91, 135).addBox(-4.5776F, 0.548F, 15.3894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -0.5889F, -0.0063F, -0.0495F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 119).addBox(-2.349F, -2.7872F, 12.8463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -0.8283F, -0.0463F, 0.1263F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 9).addBox(-1.3317F, -0.8305F, 6.3226F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -0.6788F, -0.1345F, 0.1449F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 94).addBox(-0.4F, -0.9795F, 1.5226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1648F, 6.274F, -4.6671F, -0.7263F, -0.2433F, 0.243F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 9).addBox(-0.5F, -0.2F, -1.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5058F, 5.387F, -5.412F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(114, 7).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.6391F, 6.8349F, -7.4508F, -0.3468F, -0.3183F, 0.0946F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(106, 86).addBox(-0.4977F, -0.1348F, -6.2567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.2082F, 10.1514F, -3.6686F, -0.7831F, -0.3183F, 0.0946F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(106, 57).addBox(-0.4977F, -0.0319F, -6.2353F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.2082F, 10.1514F, -3.6686F, -0.853F, -0.3183F, 0.0946F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(79, 0).addBox(-0.4977F, -0.6056F, 0.8187F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.2082F, 10.1514F, -3.6686F, -0.5824F, -0.3183F, 0.0946F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(29, 105).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3977F, 8.9096F, -5.7538F, -0.6086F, -0.3183F, 0.0946F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(113, 106).addBox(-0.5F, -0.7F, -1.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.3018F, 7.5483F, -12.8447F, -1.6842F, -0.3229F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(107, 123).addBox(-0.5F, -2.375F, -0.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9249F, 5.7751F, -14.7068F, -2.3824F, -0.3229F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(100, 123).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4699F, 4.5196F, -16.2651F, -1.4949F, -0.3342F, 0.0118F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(89, 145).addBox(-0.5112F, 0.0796F, -0.3723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0869F, 4.8562F, -15.1391F, -2.3676F, -0.3342F, 0.0118F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(129, 100).addBox(-0.5112F, -1.0317F, -0.5051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0869F, 4.8562F, -15.1391F, -0.0114F, -0.3342F, 0.0118F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(113, 63).addBox(-0.5F, -1.725F, -1.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.5218F, 5.8208F, -13.5021F, -0.4189F, -0.3229F, 0.0F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(88, 33).addBox(-0.7088F, -1.0858F, -0.1403F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0429F, 5.2917F, -8.3666F, 0.6193F, -0.2381F, 0.064F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 64).addBox(-0.7088F, -1.0165F, -3.4999F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2338F, 5.521F, -8.9944F, 0.0262F, -0.3229F, 0.0F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 73).addBox(4.0F, -0.0054F, -3.1615F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0058F, 0.7162F, -2.1806F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(88, 81).addBox(-0.5F, -0.2F, -2.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2499F, 1.3432F, -1.1477F, 0.3187F, 0.2055F, -0.0405F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5635F, 1.0051F, -2.2564F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0543F, 0.2086F, -0.0185F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-4.0058F, -2.5266F, 3.7692F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(121, 27).mirror().addBox(-0.5928F, -2.8302F, -0.23F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -1.3363F, 0.2548F, -0.2396F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(141, 99).mirror().addBox(-0.6F, -0.2541F, 3.6478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -0.7612F, 0.2433F, -0.243F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(136, 18).mirror().addBox(-0.6F, 2.2697F, -1.5264F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, 1.0714F, 0.2433F, -0.243F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(17, 78).mirror().addBox(-0.5F, -1.2F, -2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3623F, 7.0368F, -10.0367F, 0.3491F, 0.3229F, 0.0F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(120, 112).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3944F, 0.0738F, -8.0097F, -0.1688F, 0.1213F, -0.0493F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(129, 21).mirror().addBox(-0.5F, -1.225F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5916F, 0.4918F, -6.5628F, -0.7797F, 0.1213F, -0.0493F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(135, 117).mirror().addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.599F, 3.0985F, -15.7183F, 0.0077F, 0.1299F, -0.016F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(-0.4789F, -0.29F, -10.6038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, 0.3044F, 0.1299F, -0.016F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(-0.4789F, -1.1404F, -8.6303F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, 0.4789F, 0.1299F, -0.016F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 42).mirror().addBox(-3.5381F, -1.9965F, -7.5353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, 0.5264F, -0.173F, -0.1902F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(120, 99).mirror().addBox(-1.7958F, -1.9965F, -6.4623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, 0.5185F, 0.0542F, -0.0596F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(120, 94).mirror().addBox(-0.4789F, -1.9965F, -6.6084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(97, 145).mirror().addBox(-0.4789F, -1.9965F, -7.6084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, 0.5226F, 0.1299F, -0.016F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-2.4789F, -0.6574F, -4.0705F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, 0.1735F, 0.1299F, -0.016F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(75, 115).mirror().addBox(-2.5907F, -0.1922F, -2.2415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(43, 115).mirror().addBox(-2.5907F, -0.1922F, -1.9415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.6012F, -0.7767F, -5.8955F, -0.0985F, 0.1147F, -0.1193F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(120, 22).mirror().addBox(-1.247F, -0.0017F, -0.3451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1373F, -0.092F, -0.0881F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(119, 118).mirror().addBox(-1.8949F, -0.0017F, -0.4931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1372F, 0.0809F, -0.112F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 119).mirror().addBox(-0.4834F, -0.0017F, -0.2079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1402F, -0.2216F, -0.0698F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(135, 95).mirror().addBox(-0.775F, -0.725F, -2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 0.8214F, 0.3311F, -0.0964F, 0.0697F, -0.1551F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4942F, -0.0243F, -4.0892F, -0.1731F, -0.0227F, -0.1289F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(123, 46).mirror().addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.21F, 0.4508F, -1.3399F, -0.0884F, -0.1888F, -0.0946F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(135, 91).mirror().addBox(3.5776F, -15.1971F, 6.7816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -1.8107F, 0.0063F, 0.0495F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(106, 92).mirror().addBox(1.5402F, -5.5543F, 12.4832F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -1.0298F, 0.074F, -0.0627F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(121, 76).mirror().addBox(3.5776F, -17.7392F, -1.7677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -2.2906F, 0.0063F, 0.0495F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(91, 135).mirror().addBox(3.5776F, 0.548F, 15.3894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -0.5889F, 0.0063F, 0.0495F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(40, 119).mirror().addBox(1.349F, -2.7872F, 12.8463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -0.8283F, 0.0463F, -0.1263F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(60, 9).mirror().addBox(0.3317F, -0.8305F, 6.3226F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -0.6788F, 0.1345F, -0.1449F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(11, 94).mirror().addBox(-0.6F, -0.9795F, 1.5226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1648F, 6.274F, -4.6671F, -0.7263F, 0.2433F, -0.243F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.5F, -0.2F, -1.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5058F, 5.387F, -5.412F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(114, 7).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.6391F, 6.8349F, -7.4508F, -0.3468F, 0.3183F, -0.0946F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(106, 86).mirror().addBox(-0.5024F, -0.1348F, -6.2567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.2082F, 10.1514F, -3.6686F, -0.7831F, 0.3183F, -0.0946F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(106, 57).mirror().addBox(-0.5024F, -0.0319F, -6.2353F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.2082F, 10.1514F, -3.6686F, -0.853F, 0.3183F, -0.0946F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.5024F, -0.6056F, 0.8187F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.2082F, 10.1514F, -3.6686F, -0.5824F, 0.3183F, -0.0946F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3977F, 8.9096F, -5.7538F, -0.6086F, 0.3183F, -0.0946F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(113, 106).mirror().addBox(-0.5F, -0.7F, -1.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.3018F, 7.5483F, -12.8447F, -1.6842F, 0.3229F, 0.0F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(107, 123).mirror().addBox(-0.5F, -2.375F, -0.525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9249F, 5.7751F, -14.7068F, -2.3824F, 0.3229F, 0.0F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(100, 123).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4699F, 4.5196F, -16.2651F, -1.4949F, 0.3342F, -0.0118F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(89, 145).mirror().addBox(-0.4888F, 0.0796F, -0.3723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0869F, 4.8562F, -15.1391F, -2.3676F, 0.3342F, -0.0118F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(129, 100).mirror().addBox(-0.4888F, -1.0317F, -0.5051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0869F, 4.8562F, -15.1391F, -0.0114F, 0.3342F, -0.0118F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(113, 63).mirror().addBox(-0.5F, -1.725F, -1.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5218F, 5.8208F, -13.5021F, -0.4189F, 0.3229F, 0.0F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(-0.2912F, -1.0858F, -0.1403F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0429F, 5.2917F, -8.3666F, 0.6193F, 0.2381F, -0.064F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(89, 64).mirror().addBox(-0.2912F, -1.0165F, -3.4999F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2338F, 5.521F, -8.9944F, 0.0262F, 0.3229F, 0.0F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(-5.0F, -0.0054F, -3.1615F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0058F, 0.7162F, -2.1806F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(-0.5F, -0.2F, -2.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2499F, 1.3432F, -1.1477F, 0.3187F, -0.2055F, 0.0405F));

		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.4365F, 1.0051F, -2.2564F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0543F, -0.2086F, 0.0185F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -0.1749F, -1.0735F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(131, 108).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.3335F, 1.1011F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(136, 112).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.4552F, 0.7477F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(38, 59).addBox(-0.5F, -12.4343F, -5.7198F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.1372F, 6.6917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(53, 106).addBox(-1.0F, -1.8F, -0.35F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 93).addBox(-1.0F, -1.7F, -1.3F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(101, 79).addBox(-1.0F, -2.1F, -1.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 15.8978F, 1.3142F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(101, 72).addBox(-1.0F, -8.9937F, -6.2715F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.949F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(88, 89).addBox(-1.0F, -5.5F, -0.9F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 11.7899F, -0.7921F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 84).addBox(-1.9F, -0.0745F, -1.7999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.7901F, 1.3604F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(119, 123).addBox(-0.5F, -5.8F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(119, 129).addBox(-0.5F, 5.7F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 9.5951F, 0.0372F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(76, 93).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(86, 101).addBox(-1.0F, 3.8F, -0.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 11.0599F, -0.2538F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(43, 108).addBox(-1.0F, -2.0F, -0.8F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.6274F, -0.4469F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(97, 89).addBox(-1.0F, -7.0F, -1.2F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9F, 8.3738F, 0.1173F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(55, 73).addBox(-1.0F, -7.0F, -1.2F, 2.0F, 14.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 8.3738F, 0.1173F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(92, 8).addBox(-1.5F, -0.5444F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 18.6953F, -2.0653F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(34, 75).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0377F, -0.7796F, 0.7679F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(0, 77).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -0.1749F, -1.0735F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(136, 42).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.3335F, 1.1011F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(138, 60).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.4552F, 0.7477F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(77, 124).addBox(-0.5F, -12.4343F, -5.7198F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.1372F, 6.6917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(108, 38).addBox(-1.0F, -1.8F, -0.35F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 97).addBox(-1.0F, -1.7F, -1.3F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(102, 63).addBox(-1.0F, -2.1F, -1.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 15.8978F, 1.3142F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(102, 17).addBox(-1.0F, -8.9937F, -6.2715F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.949F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(30, 90).addBox(-1.0F, -5.5F, -0.9F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 11.7899F, -0.7921F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(86, 73).addBox(-0.1F, -0.0745F, -1.7999F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.7901F, 1.3604F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(40, 124).addBox(-0.5F, -5.8F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(129, 128).addBox(-0.5F, 5.7F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 9.5951F, 0.0372F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(81, 93).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(102, 99).addBox(-1.0F, 3.8F, -0.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 11.0599F, -0.2538F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 108).addBox(-1.0F, -2.0F, -0.8F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.6274F, -0.4469F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(5, 101).addBox(-1.0F, -7.0F, -1.2F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 8.3738F, 0.1173F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 73).addBox(-1.0F, -7.0F, -1.2F, 2.0F, 14.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 8.3738F, 0.1173F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(53, 97).addBox(-1.5F, -0.5444F, -1.1179F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 18.6953F, -2.0653F, -0.9163F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(78, 42).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0377F, -0.7796F, 0.4189F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(78, 49).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1528F, -3.283F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(52, 33).addBox(-1.0F, -0.6317F, -8.0364F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8687F, -6.0023F, -0.0613F, 0.0871F, -0.0053F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(39, 90).addBox(0.0F, -5.0F, -2.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -7.6122F, -4.7451F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(133, 137).addBox(-0.01F, 0.0F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.2018F, 1.6666F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(82, 129).addBox(0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -12.0737F, 0.0003F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(6, 129).addBox(-0.006F, -7.0F, -1.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.1506F, 1.035F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(64, 131).addBox(-0.004F, -4.8045F, 0.1992F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -0.901F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 113).addBox(0.004F, -7.0693F, -1.0073F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0732F, -1.7456F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(133, 50).addBox(0.01F, -4.9193F, 0.6177F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 131).addBox(-0.004F, -4.6693F, -0.3073F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -3.001F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(138, 108).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.6558F, -0.2109F, -0.3062F, -0.9181F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(138, 106).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.6558F, -0.3016F, -0.1319F, -0.5076F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(138, 104).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.6558F, -0.1564F, -0.2365F, -0.9327F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(138, 65).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.6558F, -0.2251F, -0.0892F, -0.516F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(137, 31).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1449F, -5.6558F, -0.1113F, -0.0242F, -0.5225F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(137, 16).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1449F, -5.6558F, -0.0779F, -0.1307F, -0.9471F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(138, 108).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.6558F, -0.2109F, 0.3062F, 0.9181F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(138, 106).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.6558F, -0.3016F, 0.1319F, 0.5076F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(138, 104).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.6558F, -0.1564F, 0.2365F, 0.9327F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(138, 65).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.6558F, -0.2251F, 0.0892F, 0.516F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(137, 31).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1449F, -5.6558F, -0.1113F, 0.0242F, 0.5225F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(137, 16).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1449F, -5.6558F, -0.0779F, 0.1307F, 0.9471F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -7.8319F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(57, 64).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6229F, -0.2045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(70, 129).addBox(-0.014F, -3.0F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -10.1094F, -1.6289F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(62, 141).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -8.7274F, -3.1833F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(59, 141).addBox(-0.006F, -4.0F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.2798F, -0.3348F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(130, 137).addBox(-0.004F, 0.0551F, -0.0644F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2722F, -1.7714F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(44, 90).addBox(0.01F, 0.0551F, -0.9644F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.3333F, -0.3727F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(75, 139).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3538F, -0.3239F, -0.0167F, -0.0455F, -0.9525F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(62, 139).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3538F, -0.3239F, -0.0205F, 0.0281F, -0.5223F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(26, 139).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, -0.0054F, 0.0368F, -0.5218F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(139, 12).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, -0.0066F, -0.0313F, -0.9528F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-4.0583F, -2.3736F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.0072F, -0.0312F, -1.3894F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(117, 138).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.8538F, -4.6239F, 0.1239F, 0.1103F, -0.5123F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(138, 110).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.8538F, -4.6239F, 0.0795F, 0.0896F, -0.9503F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(113, 22).mirror().addBox(-5.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.8538F, -4.6239F, 0.0341F, 0.1147F, -1.3883F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(75, 139).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3538F, -0.3239F, -0.0167F, 0.0455F, 0.9525F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(62, 139).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.3538F, -0.3239F, -0.0205F, -0.0281F, 0.5223F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(26, 139).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, -0.0054F, -0.0368F, 0.5218F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(139, 12).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, -0.0066F, 0.0313F, 0.9528F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 42).addBox(3.0583F, -2.3736F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.0072F, 0.0312F, 1.3894F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(117, 138).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.8538F, -4.6239F, 0.1239F, -0.1103F, 0.5123F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(138, 110).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.8538F, -4.6239F, 0.0795F, -0.0896F, 0.9503F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(113, 22).addBox(3.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.8538F, -4.6239F, 0.0341F, -0.1147F, 1.3883F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(21, 129).addBox(-0.014F, -4.0F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -8.5297F, -3.806F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(44, 141).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -8.0289F, -5.7423F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(36, 141).addBox(-0.006F, -4.0F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -4.6571F, -2.8045F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(127, 137).addBox(-0.004F, -4.9967F, -0.5328F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 75).addBox(0.01F, -4.9967F, -0.0328F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4294F, -2.9781F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(78, 141).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -7.6566F, -8.5294F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(29, 141).addBox(-0.006F, -3.5F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 68).addBox(-0.014F, -7.5F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.025F, -5.4758F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(133, 42).addBox(-0.014F, -3.1F, -0.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.3986F, -5.5192F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(108, 129).addBox(0.0F, -5.4561F, 0.0314F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9871F, -4.9347F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4771F, -5.8045F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(86, 114).addBox(-0.006F, 0.0F, -1.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -8.599F, -2.3198F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(94, 141).addBox(0.0F, -2.5F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 121).addBox(-0.014F, -7.5F, -0.9F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.869F, -2.4031F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(61, 124).addBox(-0.004F, -6.4216F, -0.0715F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5846F, -1.8784F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(139, 126).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2767F, -1.3194F, 0.2553F, 0.1818F, -0.4931F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(91, 139).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2767F, -1.3194F, 0.1675F, 0.2098F, -0.9372F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(130, 12).mirror().addBox(-6.0583F, -2.3736F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2767F, -1.3194F, 0.0619F, 0.2606F, -1.3831F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(139, 126).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.2767F, -1.3194F, 0.2553F, -0.1818F, 0.4931F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(91, 139).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.2767F, -1.3194F, 0.1675F, -0.2098F, 0.9372F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(130, 12).addBox(3.0583F, -2.3736F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.2767F, -1.3194F, 0.0619F, -0.2606F, 1.3831F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(54, 90).addBox(-1.0F, 0.0F, -10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, 5.6F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7998F, -3.5913F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(17, 69).addBox(-1.0F, 0.0855F, 0.0911F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0199F, -4.8724F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(13, 123).addBox(-0.004F, -7.845F, -1.009F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 144).addBox(0.01F, -3.045F, -1.009F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4476F, -2.1838F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(3, 129).addBox(-0.004F, -6.445F, -0.009F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1027F, -0.8792F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(37, 123).addBox(0.004F, -8.045F, -1.009F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6162F, -1.5823F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(128, 0).addBox(0.01F, -6.445F, 0.391F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1027F, -0.8792F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(124, 137).addBox(0.0F, -0.0168F, -0.3977F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9308F, -3.8772F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 112).addBox(-0.004F, -10.0168F, -0.3977F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9308F, -3.8772F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(123, 4).addBox(0.0F, -10.0168F, -1.9977F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 137).addBox(0.0F, -5.0168F, -0.9977F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4533F, -3.0246F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(44, 134).addBox(0.004F, -4.5168F, 0.0023F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1119F, -2.3853F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(20, 115).addBox(-0.004F, -8.7F, 0.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0757F, -6.9111F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(37, 111).addBox(0.0F, -8.75F, -1.0F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6635F, -6.1021F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(13, 131).addBox(0.004F, -5.4473F, -0.0044F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4092F, -3.8814F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(139, 138).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4768F, -0.0281F, 0.5295F, 0.3142F, -0.4252F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(139, 136).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4768F, -0.0281F, 0.3603F, 0.4441F, -0.8746F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(102, 70).mirror().addBox(-8.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4768F, -0.0281F, 0.126F, 0.5514F, -1.3575F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(139, 134).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5768F, -1.5281F, 0.58F, 0.3354F, -0.4091F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(139, 132).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5768F, -1.5281F, 0.3983F, 0.484F, -0.8577F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(95, 49).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5768F, -1.5281F, 0.1394F, 0.6026F, -1.3501F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(139, 130).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7768F, -3.0281F, 0.6141F, 0.3491F, -0.3977F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(139, 128).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7768F, -3.0281F, 0.4244F, 0.5102F, -0.8452F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-12.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.7768F, -3.0281F, 0.1489F, 0.6366F, -1.3446F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(139, 138).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4768F, -0.0281F, 0.5295F, -0.3142F, 0.4252F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(139, 136).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4768F, -0.0281F, 0.3603F, -0.4441F, 0.8746F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(102, 70).addBox(3.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4768F, -0.0281F, 0.126F, -0.5514F, 1.3575F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(139, 134).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5768F, -1.5281F, 0.58F, -0.3354F, 0.4091F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(139, 132).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5768F, -1.5281F, 0.3983F, -0.484F, 0.8577F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(95, 49).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.5768F, -1.5281F, 0.1394F, -0.6026F, 1.3501F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(139, 130).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.7768F, -3.0281F, 0.6141F, -0.3491F, 0.3977F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(139, 128).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.7768F, -3.0281F, 0.4244F, -0.5102F, 0.8452F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(60, 18).addBox(3.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.7768F, -3.0281F, 0.1489F, -0.6366F, 1.3446F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1336F, 20.3924F, -7.1308F, 0.8229F, 0.1298F, -0.0329F));

		PartDefinition cube_r216 = leftArm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(28, 126).addBox(0.0F, 0.1F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftArm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(49, 119).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 5.9032F, 1.1288F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftArm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(81, 18).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, -0.7172F, 0.0318F, -1.2119F, -0.4743F, -0.0768F));

		PartDefinition cube_r219 = leftArm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(13, 116).addBox(-0.5F, -2.3784F, -1.0587F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3984F, 1.6683F, -0.3971F, 0.1146F, -0.4743F, -0.0768F));

		PartDefinition cube_r220 = leftArm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(122, 13).addBox(-0.2622F, -0.0365F, -0.1808F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6168F, 3.2178F, -1.1103F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r221 = leftArm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(86, 125).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(97, 99).addBox(-0.5909F, -1.1079F, -0.0717F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(70, 104).addBox(-0.5909F, 0.8921F, -1.1717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0173F, 10.4107F, 2.5231F, -0.5947F, 0.2472F, -0.0435F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(113, 98).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3232F, 10.7932F, -0.252F, 0.0113F, 0.3165F, 0.1985F));

		PartDefinition cube_r222 = leftArm3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(75, 135).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.008F, 0.0807F, -1.0948F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftArm3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(26, 135).addBox(11.9545F, -2.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(16, 135).addBox(-0.5945F, -0.2848F, -0.2127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 0.3564F, 0.6637F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1336F, 20.3924F, -7.1308F, 0.3001F, -0.1303F, 0.0287F));

		PartDefinition cube_r224 = rightArm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(129, 112).addBox(-1.0F, 0.1F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4736F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightArm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 120).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 5.9032F, 1.1288F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightArm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(138, 7).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0059F, -0.7172F, 0.0318F, -1.2119F, 0.4743F, 0.0768F));

		PartDefinition cube_r227 = rightArm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(121, 69).addBox(-0.5F, -2.3784F, -1.0587F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3984F, 1.6683F, -0.3971F, 0.1146F, 0.4743F, 0.0768F));

		PartDefinition cube_r228 = rightArm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(114, 123).addBox(-0.7378F, -0.0365F, -0.1808F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6168F, 3.2178F, -1.1103F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r229 = rightArm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(103, 129).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 101).addBox(-0.4091F, -1.1079F, -0.0717F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(23, 108).addBox(-0.4091F, 0.8921F, -1.1717F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0173F, 10.4107F, 2.5231F, -1.0484F, -0.2041F, 0.1214F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(54, 114).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3232F, 10.7932F, -0.252F, 0.1349F, -0.2874F, -0.609F));

		PartDefinition cube_r230 = rightArm3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(136, 38).addBox(-0.5F, -0.1301F, -1.9608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, 0.0807F, -1.0948F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(136, 34).addBox(-12.9545F, -2.1239F, -11.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie4 = rightArm3.addOrReplaceChild("opposablePinkie4", CubeListBuilder.create().texOffs(21, 136).addBox(-0.4055F, -0.2848F, -0.2127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 0.3564F, 0.6637F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7092F, -4.1814F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(95, 51).addBox(-2.3511F, 0.6901F, -4.8568F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3511F, 17.1718F, -1.3255F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(28, 117).addBox(-1.8511F, 0.0777F, -2.2405F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3511F, 17.1718F, -1.3255F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(15, 87).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4959F, 17.7183F, -0.931F, 0.5252F, -1.0964F, -0.0605F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 17.7834F, -1.0412F, 0.2897F, -0.8703F, 0.0685F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3655F, 17.7762F, -0.987F, 0.2057F, -0.7133F, 0.0898F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.396F, 17.7749F, -0.9499F, 0.2716F, -0.617F, 0.0965F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(140, 71).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.3983F, 0.484F, -0.8577F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(58, 29).mirror().addBox(-14.0583F, -2.3736F, -0.2407F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.1394F, 0.6026F, -1.3501F));

		PartDefinition cube_r240 = chest2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(140, 69).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.58F, 0.3354F, -0.4091F));

		PartDefinition cube_r241 = chest2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(-16.0583F, -2.3736F, -0.2407F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.1551F, 0.6579F, -1.3409F));

		PartDefinition cube_r242 = chest2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(140, 67).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.4412F, 0.5265F, -0.8369F));

		PartDefinition cube_r243 = chest2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(140, 28).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.6355F, 0.3575F, -0.3902F));

		PartDefinition cube_r244 = chest2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(58, 25).mirror().addBox(-15.0583F, -2.3736F, -0.2407F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.1453F, 0.6239F, -1.3468F));

		PartDefinition cube_r245 = chest2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(140, 26).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.4145F, 0.5004F, -0.85F));

		PartDefinition cube_r246 = chest2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(140, 24).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.6013F, 0.344F, -0.402F));

		PartDefinition cube_r247 = chest2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4959F, 17.7183F, -0.931F, 0.5252F, 1.0964F, 0.0605F));

		PartDefinition cube_r248 = chest2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3093F, 17.7834F, -1.0412F, 0.2897F, 0.8703F, -0.0685F));

		PartDefinition cube_r249 = chest2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(57, 44).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3655F, 17.7762F, -0.987F, 0.2057F, 0.7133F, -0.0898F));

		PartDefinition cube_r250 = chest2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.396F, 17.7749F, -0.9499F, 0.2716F, 0.617F, -0.0965F));

		PartDefinition cube_r251 = chest2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(38, 66).addBox(-1.0F, -1.1F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0894F, 2.309F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(140, 71).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.3983F, -0.484F, 0.8577F));

		PartDefinition cube_r253 = chest2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(58, 29).addBox(3.0583F, -2.3736F, -0.2407F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.1394F, -0.6026F, 1.3501F));

		PartDefinition cube_r254 = chest2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(140, 69).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.58F, -0.3354F, 0.4091F));

		PartDefinition cube_r255 = chest2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(58, 23).addBox(3.0583F, -2.3736F, -0.2407F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.1551F, -0.6579F, 1.3409F));

		PartDefinition cube_r256 = chest2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(140, 67).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.4412F, -0.5265F, 0.8369F));

		PartDefinition cube_r257 = chest2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(140, 28).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.6355F, -0.3575F, 0.3902F));

		PartDefinition cube_r258 = chest2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(58, 25).addBox(3.0583F, -2.3736F, -0.2407F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.1453F, -0.6239F, 1.3468F));

		PartDefinition cube_r259 = chest2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(140, 26).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.4145F, -0.5004F, 0.85F));

		PartDefinition cube_r260 = chest2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(140, 24).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.6013F, -0.344F, 0.402F));

		PartDefinition cube_r261 = chest2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 101).addBox(0.0F, -12.0427F, -0.3142F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7049F, -3.7906F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r262 = chest2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(89, 114).addBox(-0.004F, -8.625F, 0.05F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0705F, -6.7234F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r263 = chest2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(56, 137).addBox(-0.004F, -2.0F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1041F, -4.2194F, 0.7636F, 0.0F, 0.0F));

		PartDefinition cube_r264 = chest2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(40, 105).addBox(0.004F, -7.7F, -0.1F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.124F, -7.2127F, 0.973F, 0.0F, 0.0F));

		PartDefinition cube_r265 = chest2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(144, 0).addBox(0.0F, -2.2F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 115).addBox(-0.004F, -7.7F, -2.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3646F, -6.1498F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r266 = chest2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(111, 129).addBox(0.002F, -5.9418F, 0.4287F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8049F, -2.8906F, 0.7985F, 0.0F, 0.0F));

		PartDefinition cube_r267 = chest2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(106, 137).addBox(-0.002F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2355F, -7.4981F, 0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(95, 123).addBox(0.004F, -4.4F, -2.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.6058F, -6.0413F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r269 = chest2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(133, 34).addBox(-0.004F, 0.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7258F, -4.1861F, 0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r270 = chest2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(9, 133).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3676F, -7.612F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r271 = chest2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 141).addBox(-0.004F, -4.0F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4646F, -3.565F, 0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(18, 126).addBox(0.004F, -5.8344F, -0.025F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.5585F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0002F, 9.7011F, -3.5042F, 0.1299F, 0.0151F, -0.1737F));

		PartDefinition cube_r273 = bone2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(107, 0).addBox(0.4F, 0.2F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0464F, 3.6772F, -3.2416F, 0.7276F, 0.3762F, 0.8375F));

		PartDefinition cube_r274 = bone2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 92).addBox(-1.5F, -1.4836F, -3.7712F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6467F, 2.4511F, -2.2083F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(126, 41).addBox(-1.5F, -0.5836F, 0.1288F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6467F, 2.4511F, -2.2083F, 0.2628F, 0.2296F, 0.4552F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(126, 36).addBox(-1.5F, -0.7836F, -0.7712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6467F, 2.4511F, -2.2083F, 2.0082F, 0.2296F, 0.4552F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(101, 118).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4832F, 0.5689F, -0.3979F, 1.2243F, 0.0511F, 0.2185F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(111, 24).addBox(-0.5F, -0.875F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.49F, 0.3944F, -1.0063F, 1.1371F, 0.0511F, 0.2185F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(74, 64).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8441F, -2.8738F, 1.5611F, 0.8845F, -0.0533F, 0.0788F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(106, 51).addBox(-1.0854F, -1.3471F, 2.0498F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(98, 138).addBox(-1.0854F, -3.3471F, 5.0498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3467F, -0.5774F, -0.233F, 0.5092F, -0.0533F, 0.0788F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(73, 33).addBox(-1.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3467F, -0.5774F, -0.233F, 0.9107F, -0.0533F, 0.0788F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0002F, 9.7011F, -3.5042F, 0.1299F, -0.0151F, 0.1737F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.4F, 0.2F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0464F, 3.6772F, -3.2416F, 0.7276F, -0.3762F, -0.8375F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(0.5F, -1.4836F, -3.7712F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6467F, 2.4511F, -2.2083F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(126, 41).mirror().addBox(0.5F, -0.5836F, 0.1288F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6467F, 2.4511F, -2.2083F, 0.2628F, -0.2296F, -0.4552F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(126, 36).mirror().addBox(0.5F, -0.7836F, -0.7712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6467F, 2.4511F, -2.2083F, 2.0082F, -0.2296F, -0.4552F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(101, 118).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4832F, 0.5689F, -0.3979F, 1.2243F, -0.0511F, -0.2185F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(111, 24).mirror().addBox(-0.5F, -0.875F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.3944F, -1.0063F, 1.1371F, -0.0511F, -0.2185F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8441F, -2.8738F, 1.5611F, 0.8845F, 0.0533F, -0.0788F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(106, 51).mirror().addBox(0.0854F, -1.3471F, 2.0498F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(98, 138).mirror().addBox(0.0854F, -3.3471F, 5.0498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -0.5774F, -0.233F, 0.5092F, 0.0533F, -0.0788F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(73, 33).mirror().addBox(0.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -0.5774F, -0.233F, 0.9107F, 0.0533F, -0.0788F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2986F, -3.9226F, 0.4192F, 0.0399F, 0.0178F));

		PartDefinition cube_r291 = neck4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(146, 36).addBox(-0.004F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3374F, -6.2267F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r292 = neck4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(34, 69).addBox(0.0F, -2.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9883F, -5.182F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r293 = neck4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(36, 133).addBox(-0.004F, -5.7F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2973F, -2.6815F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r294 = neck4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(26, 141).addBox(0.004F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9331F, -5.7309F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r295 = neck4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(12, 139).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5304F, -6.9346F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r296 = neck4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(18, 141).addBox(0.0F, -5.4F, 5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r297 = neck4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(126, 128).addBox(-0.004F, -6.9F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1964F, -3.0208F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r298 = neck4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(127, 12).addBox(0.0F, -7.0F, -1.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8189F, -2.2382F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r299 = neck4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(141, 22).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.469F, -4.2241F, 0.386F, 0.2483F, -0.4651F));

		PartDefinition cube_r300 = neck4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(141, 20).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.469F, -4.2241F, 0.2572F, 0.3249F, -0.9134F));

		PartDefinition cube_r301 = neck4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-11.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.469F, -4.2241F, 0.091F, 0.4019F, -1.3736F));

		PartDefinition cube_r302 = neck4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(82, 140).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.2022F, 0.2554F, -0.9292F));

		PartDefinition cube_r303 = neck4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(58, 31).mirror().addBox(-13.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.073F, 0.3163F, -1.3799F));

		PartDefinition cube_r304 = neck4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(140, 81).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.3063F, 0.2085F, -0.4832F));

		PartDefinition cube_r305 = neck4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(140, 79).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.2748F, 0.1921F, -0.4895F));

		PartDefinition cube_r306 = neck4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(140, 73).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.1807F, 0.2274F, -0.9343F));

		PartDefinition cube_r307 = neck4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-15.0583F, -2.3736F, -0.2407F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.0661F, 0.282F, -1.3819F));

		PartDefinition cube_r308 = neck4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(60, 20).addBox(3.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.469F, -4.2241F, 0.091F, -0.4019F, 1.3736F));

		PartDefinition cube_r309 = neck4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(141, 20).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.469F, -4.2241F, 0.2572F, -0.3249F, 0.9134F));

		PartDefinition cube_r310 = neck4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(141, 22).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.469F, -4.2241F, 0.386F, -0.2483F, 0.4651F));

		PartDefinition cube_r311 = neck4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(82, 140).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.2022F, -0.2554F, 0.9292F));

		PartDefinition cube_r312 = neck4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(58, 31).addBox(3.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.073F, -0.3163F, 1.3799F));

		PartDefinition cube_r313 = neck4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(140, 81).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.3063F, -0.2085F, 0.4832F));

		PartDefinition cube_r314 = neck4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(140, 79).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.2748F, -0.1921F, 0.4895F));

		PartDefinition cube_r315 = neck4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(140, 73).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.1807F, -0.2274F, 0.9343F));

		PartDefinition cube_r316 = neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(58, 27).addBox(3.0583F, -2.3736F, -0.2407F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.0661F, -0.282F, 1.3819F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9573F, -5.0679F, 0.5969F, 0.1212F, -0.0228F));

		PartDefinition cube_r317 = neck3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(146, 40).addBox(0.0F, -1.8F, 0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4374F, -3.7586F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r318 = neck3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(146, 97).addBox(0.0F, -3.8F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 7).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -4.0023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(137, 14).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -1.5663F, 0.012F, -0.0675F, -1.1249F));

		PartDefinition cube_r320 = neck3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(103, 14).mirror().addBox(-8.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -1.5663F, 0.0394F, -0.0561F, -1.5619F));

		PartDefinition cube_r321 = neck3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(140, 83).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -1.5663F, -0.0036F, -0.0038F, -0.6929F));

		PartDefinition cube_r322 = neck3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(137, 14).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -1.5663F, 0.012F, 0.0675F, 1.1249F));

		PartDefinition cube_r323 = neck3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(103, 14).addBox(3.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -1.5663F, 0.0394F, 0.0561F, 1.5619F));

		PartDefinition cube_r324 = neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(140, 83).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -1.5663F, -0.0036F, 0.0038F, 0.6929F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2389F, -3.5283F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r325 = neck2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(94, 146).addBox(0.0F, -1.3219F, 3.9599F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(28, 111).addBox(-0.5F, -0.0219F, 2.9599F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(112, 36).mirror().addBox(-2.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.042F, 0.1008F, -1.3885F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(140, 85).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.0947F, 0.1362F, -0.9505F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(112, 36).addBox(1.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.042F, -0.1008F, 1.3885F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(140, 85).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.0947F, -0.1362F, 0.9505F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4752F, -1.9536F, -0.6913F, 0.0673F, -0.0556F));

		PartDefinition cube_r330 = neck.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(108, 46).addBox(0.0F, -0.7F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 50).addBox(-0.5F, 0.2F, 1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(140, 87).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0259F, -1.4344F, 0.4141F, 0.8331F, -1.0327F));

		PartDefinition cube_r332 = neck.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(140, 87).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0259F, -1.4344F, 0.4141F, -0.8331F, 1.0327F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5432F, -1.7319F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(126, 91).addBox(0.0F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 30).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r334 = neck5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(140, 89).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r335 = neck5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(140, 89).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck7 = neck5.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8017F, -2.59F, -0.3099F, 0.1664F, -0.053F));

		PartDefinition cube_r336 = neck7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(146, 64).addBox(0.0F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 112).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r337 = neck7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(140, 121).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r338 = neck7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(140, 121).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7805F, -2.5587F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition cube_r339 = neck8.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(146, 110).addBox(0.0F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 112).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck8.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(140, 123).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r341 = neck8.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(140, 123).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8391F, -2.701F, 0.1329F, 0.173F, 0.023F));

		PartDefinition cube_r342 = neck9.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(146, 125).addBox(0.0F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 16).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck9.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(141, 18).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r344 = neck9.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(141, 18).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck6 = neck9.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8193F, -2.3991F, 0.394F, 0.0806F, 0.0335F));

		PartDefinition cube_r345 = neck6.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(136, 99).addBox(0.0F, 0.1F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5852F, -0.5171F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck6.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(112, 72).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck6.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7427F, -1.8268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r347 = heads.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(136, 51).addBox(-1.004F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.004F, 6.3183F, -13.669F, 1.3832F, 0.0F, 0.0F));

		PartDefinition cube_r348 = heads.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(133, 72).addBox(-0.909F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.091F, 5.5338F, -13.0569F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r349 = heads.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(122, 108).addBox(-1.007F, 0.0F, -2.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.007F, 4.1432F, -11.6225F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r350 = heads.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(122, 104).addBox(-1.0F, -0.05F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.9353F, -8.0628F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r351 = heads.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(117, 50).addBox(-0.5F, 0.0F, -3.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.1289F, -9.4112F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r352 = heads.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(131, 4).addBox(-0.496F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.004F, 0.8906F, -8.0803F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r353 = heads.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(116, 4).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.3288F, -6.5359F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r354 = heads.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(128, 9).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(29, 102).addBox(-1.5F, 0.0F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -1.7633F, 0.1093F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r355 = heads.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(112, 46).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9197F, -1.2702F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r356 = heads.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(122, 60).addBox(-1.0F, -0.475F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6382F, -2.8145F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r357 = heads.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(28, 122).addBox(-1.0F, -0.125F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5351F, -5.5788F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r358 = heads.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(121, 32).addBox(-1.5F, -0.004F, -0.0267F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7694F, 0.1052F, -0.6632F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.0F, -0.7735F, -2.7839F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(142, 91).addBox(-0.4585F, -1.1184F, -0.8477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2318F, -0.0803F, 2.4893F, -1.7867F, 0.107F, 0.0001F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(81, 142).addBox(-0.4585F, -1.2855F, -0.4405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2318F, -0.0803F, 2.4893F, -0.8268F, 0.107F, 0.0001F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(39, 134).addBox(-0.5F, -0.9496F, 0.2246F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1447F, 1.097F, -2.9019F, 1.5917F, 0.0268F, 0.0253F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(89, 141).addBox(-0.5F, -1.4243F, -0.3893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1447F, 1.097F, -2.9019F, 1.0855F, 0.0268F, 0.0253F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(128, 117).addBox(-0.5F, -1.3603F, -2.2242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1447F, 1.097F, -2.9019F, 0.911F, 0.0268F, 0.0253F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(101, 31).addBox(-1.115F, -2.6924F, -3.3013F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.5635F, 0.0878F, 0.0254F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(85, 25).addBox(-0.996F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.004F, 1.6641F, -5.2964F, 0.7517F, 0.051F, 0.0477F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(131, 0).addBox(-0.6495F, -0.5333F, -1.6848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0455F, 0.7414F, -2.2882F, 0.7866F, 0.4152F, 0.3679F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(122, 64).addBox(-1.0136F, -0.5522F, -0.5454F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7099F, 0.6689F, -2.1902F, 0.3812F, -0.0927F, 0.0032F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(3, 138).addBox(-0.5545F, -0.9624F, -1.1431F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(136, 46).addBox(-0.5545F, -0.9624F, -0.4431F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2318F, -0.0803F, 2.4893F, -0.1149F, 0.1023F, -0.0068F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(101, 38).addBox(-1.1202F, -0.4315F, -0.3784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, -0.122F, 0.0828F, 0.0027F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(126, 86).addBox(-1.0155F, -1.5466F, -4.013F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.3508F, 0.1238F, 0.0178F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(112, 78).addBox(-1.1202F, -1.2859F, -2.2684F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.2096F, 0.0828F, 0.0027F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(130, 75).addBox(-1.299F, -0.7409F, -4.928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.4018F, 0.05F, -0.0237F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(40, 130).addBox(-1.2635F, -3.5964F, -4.1632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 1.0084F, 0.064F, -0.0381F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(73, 145).addBox(-0.4F, -0.45F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9014F, 8.3907F, -11.0401F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(145, 103).addBox(0.0348F, -0.5677F, -2.0982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4412F, 7.3596F, -9.4982F, 0.8909F, 0.5902F, 0.7365F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(144, 14).addBox(-0.5999F, -0.5437F, -1.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4412F, 7.3596F, -9.4982F, 0.722F, 0.2591F, 0.3939F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(144, 30).addBox(-0.7785F, -0.5437F, -0.8653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4412F, 7.3596F, -9.4982F, 0.6952F, 0.0731F, 0.2329F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(110, 118).addBox(-2.332F, -2.8414F, -7.4527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.2451F, 3.1348F, -2.9691F, 0.8701F, -0.0781F, -0.2147F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(133, 68).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.625F, 5.9946F, -9.8879F, 0.9867F, 0.13F, 0.172F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(93, 56).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2244F, 6.0139F, -9.9085F, 0.7511F, -0.0693F, -0.0322F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(117, 41).addBox(-0.45F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2928F, 5.6655F, -8.2461F, 0.7027F, -0.0355F, -0.0723F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(126, 81).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.8877F, 1.7693F, -1.0119F, 0.3212F, 0.1593F, 0.1364F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(54, 122).addBox(-0.5F, -1.6F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.48F, 1.1677F, 1.3207F, 0.5203F, 0.0938F, 0.003F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(39, 140).addBox(-0.4F, -0.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4412F, 2.4251F, 2.3237F, 0.4254F, 0.0737F, -0.0737F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(70, 124).addBox(-0.2664F, -0.3519F, -4.9768F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.3839F, 0.1134F, -0.0007F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(126, 55).addBox(0.0F, -0.5609F, -0.2537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.755F, 4.0059F, -3.5531F, 0.1831F, 0.0959F, -0.0017F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(21, 142).addBox(-1.1477F, -2.5451F, -3.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.4717F, 0.0296F, 0.0182F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(130, 30).addBox(-1.1477F, -3.4636F, -4.6423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.3451F, 3.1348F, -2.0691F, 0.7509F, 0.0296F, 0.0182F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(141, 112).addBox(-0.5F, -0.0061F, -0.7172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, -2.6648F, 0.1422F, -0.0118F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(130, 18).addBox(-0.5F, -1.3691F, -0.8431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, -0.8322F, 0.1422F, -0.0118F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(121, 81).addBox(-0.5F, -1.4814F, 0.1719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, -0.0468F, 0.1422F, -0.0118F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(47, 144).addBox(-0.5F, -1.2178F, -0.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(141, 46).addBox(-0.5F, -0.9178F, -0.5892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(117, 60).addBox(-0.5F, -0.6178F, -0.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, -0.4657F, 0.1422F, -0.0118F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(115, 144).addBox(-0.5F, -0.4061F, -0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 144).addBox(-0.5F, -0.5561F, -0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, 2.6759F, 0.1422F, -0.0118F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(144, 75).addBox(-0.5F, -0.9628F, -0.9957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 144).addBox(-0.5F, -0.9628F, -1.5957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, 1.3233F, 0.1422F, -0.0118F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(133, 83).addBox(-0.5F, -0.1628F, -1.7901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.165F, 0.3551F, 1.5301F, 0.7997F, 0.1422F, -0.0118F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(116, 13).addBox(-0.4567F, 0.4847F, -0.2834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 2.0386F, 0.1149F, 0.0429F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(68, 145).addBox(-0.4567F, -1.3049F, -0.4226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, -1.7313F, 0.1149F, 0.0429F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(129, 133).addBox(-0.4567F, -0.2233F, -0.6327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, -0.5095F, 0.1149F, 0.0429F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(73, 141).addBox(-0.4567F, -0.5668F, -0.3824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 0.2759F, 0.1149F, 0.0429F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(133, 122).addBox(-0.4567F, -0.4441F, -1.3948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 1.4103F, 0.1149F, 0.0429F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(21, 145).addBox(-0.4567F, -1.4128F, -0.3265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 2.6757F, 0.1149F, 0.0429F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(133, 87).addBox(-0.4567F, -0.6703F, -0.5859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, -2.7785F, 0.1149F, 0.0429F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(68, 141).addBox(-0.4567F, -0.6147F, -0.5067F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, -1.5567F, 0.1149F, 0.0429F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(130, 144).addBox(-0.4567F, 0.0349F, -1.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(125, 144).addBox(-0.4567F, -0.4651F, -1.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, -0.9895F, 0.1149F, 0.0429F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(120, 144).addBox(-0.4567F, -1.1321F, -0.2571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 0.2322F, 0.1149F, 0.0429F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(115, 69).addBox(-0.4567F, 0.1283F, 0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 1.5848F, 0.1149F, 0.0429F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(101, 86).addBox(-0.6317F, -0.4688F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 90).addBox(-0.4567F, -0.4688F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, -1.055F, 0.1149F, 0.0429F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(130, 26).addBox(-0.4567F, -0.1537F, -1.3149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5333F, 0.9501F, -0.8944F, 3.0247F, 0.1149F, 0.0429F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(100, 24).addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6853F, 1.103F, -0.3755F, 0.4193F, 0.1268F, 0.0255F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(112, 139).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.608F, 1.567F, 0.3233F, 1.292F, 0.1268F, 0.0255F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(133, 79).addBox(-0.525F, -0.75F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4222F, -0.085F, 1.2189F, 0.6114F, 0.0851F, 0.0248F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(130, 14).addBox(-0.475F, -0.075F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6F, -0.2369F, -0.1772F, 0.2902F, 0.0965F, 0.0414F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(117, 36).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6986F, 0.4352F, -0.8903F, 0.2751F, 0.1141F, 0.0673F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.0F, -0.7735F, -2.7839F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(142, 91).mirror().addBox(-0.5415F, -1.1184F, -0.8477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2318F, -0.0803F, 2.4893F, -1.7867F, -0.107F, -0.0001F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(81, 142).mirror().addBox(-0.5415F, -1.2855F, -0.4405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2318F, -0.0803F, 2.4893F, -0.8268F, -0.107F, -0.0001F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(39, 134).mirror().addBox(-0.5F, -0.9496F, 0.2246F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.1447F, 1.097F, -2.9019F, 1.5917F, -0.0268F, -0.0253F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(89, 141).mirror().addBox(-0.5F, -1.4243F, -0.3893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.1447F, 1.097F, -2.9019F, 1.0855F, -0.0268F, -0.0253F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(128, 117).mirror().addBox(-0.5F, -1.3603F, -2.2242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.1447F, 1.097F, -2.9019F, 0.911F, -0.0268F, -0.0253F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(101, 31).mirror().addBox(0.115F, -2.6924F, -3.3013F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.5635F, -0.0878F, -0.0254F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(85, 25).mirror().addBox(-0.004F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.004F, 1.6641F, -5.2964F, 0.7517F, -0.051F, -0.0477F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(131, 0).mirror().addBox(-0.3505F, -0.5333F, -1.6848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0455F, 0.7414F, -2.2882F, 0.7866F, -0.4152F, -0.3679F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(122, 64).mirror().addBox(-0.9864F, -0.5522F, -0.5454F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7099F, 0.6689F, -2.1902F, 0.3812F, 0.0927F, -0.0032F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(3, 138).mirror().addBox(-0.4455F, -0.9624F, -1.1431F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(136, 46).mirror().addBox(-0.4455F, -0.9624F, -0.4431F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2318F, -0.0803F, 2.4893F, -0.1149F, -0.1023F, 0.0068F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(0.1202F, -0.4315F, -0.3784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, -0.122F, -0.0828F, -0.0027F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(126, 86).mirror().addBox(0.0155F, -1.5466F, -4.013F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.3508F, -0.1238F, -0.0178F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(112, 78).mirror().addBox(0.1202F, -1.2859F, -2.2684F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.2096F, -0.0828F, -0.0027F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(130, 75).mirror().addBox(0.299F, -0.7409F, -4.928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.4018F, -0.05F, 0.0237F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(40, 130).mirror().addBox(0.2635F, -3.5964F, -4.1632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 1.0084F, -0.064F, 0.0381F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 145).mirror().addBox(-0.6F, -0.45F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9014F, 8.3907F, -11.0401F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(145, 103).mirror().addBox(-1.0348F, -0.5677F, -2.0982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4412F, 7.3596F, -9.4982F, 0.8909F, -0.5902F, -0.7365F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(144, 14).mirror().addBox(-0.4001F, -0.5437F, -1.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4412F, 7.3596F, -9.4982F, 0.722F, -0.2591F, -0.3939F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(144, 30).mirror().addBox(-0.2215F, -0.5437F, -0.8653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.4412F, 7.3596F, -9.4982F, 0.6952F, -0.0731F, -0.2329F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(110, 118).mirror().addBox(1.332F, -2.8414F, -7.4527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.2451F, 3.1348F, -2.9691F, 0.8701F, 0.0781F, 0.2147F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(133, 68).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.625F, 5.9946F, -9.8879F, 0.9867F, -0.13F, -0.172F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-0.6F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2244F, 6.0139F, -9.9085F, 0.7511F, 0.0693F, 0.0322F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(117, 41).mirror().addBox(-0.55F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2928F, 5.6655F, -8.2461F, 0.7027F, 0.0355F, 0.0723F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(126, 81).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.8877F, 1.7693F, -1.0119F, 0.3212F, -0.1593F, -0.1364F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(54, 122).mirror().addBox(-0.5F, -1.6F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.1677F, 1.3207F, 0.5203F, -0.0938F, -0.003F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(39, 140).mirror().addBox(-0.6F, -0.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4412F, 2.4251F, 2.3237F, 0.4254F, -0.0737F, 0.0737F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(70, 124).mirror().addBox(0.2664F, -0.3519F, -4.9768F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.3839F, -0.1134F, 0.0007F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(126, 55).mirror().addBox(0.0F, -0.5609F, -0.2537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.755F, 4.0059F, -3.5531F, 0.1831F, -0.0959F, 0.0017F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(21, 142).mirror().addBox(0.1477F, -2.5451F, -3.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.4717F, -0.0296F, -0.0182F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(130, 30).mirror().addBox(0.1477F, -3.4636F, -4.6423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.3451F, 3.1348F, -2.0691F, 0.7509F, -0.0296F, -0.0182F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(141, 112).mirror().addBox(-0.5F, -0.0061F, -0.7172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, -2.6648F, -0.1422F, 0.0118F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(130, 18).mirror().addBox(-0.5F, -1.3691F, -0.8431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, -0.8322F, -0.1422F, 0.0118F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(121, 81).mirror().addBox(-0.5F, -1.4814F, 0.1719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, -0.0468F, -0.1422F, 0.0118F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(47, 144).mirror().addBox(-0.5F, -1.2178F, -0.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(141, 46).mirror().addBox(-0.5F, -0.9178F, -0.5892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(117, 60).mirror().addBox(-0.5F, -0.6178F, -0.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, -0.4657F, -0.1422F, 0.0118F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(115, 144).mirror().addBox(-0.5F, -0.4061F, -0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 144).mirror().addBox(-0.5F, -0.5561F, -0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, 2.6759F, -0.1422F, 0.0118F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(144, 75).mirror().addBox(-0.5F, -0.9628F, -0.9957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 144).mirror().addBox(-0.5F, -0.9628F, -1.5957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, 1.3233F, -0.1422F, 0.0118F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(133, 83).mirror().addBox(-0.5F, -0.1628F, -1.7901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.165F, 0.3551F, 1.5301F, 0.7997F, -0.1422F, 0.0118F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(116, 13).mirror().addBox(-0.5433F, 0.4847F, -0.2834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 2.0386F, -0.1149F, -0.0429F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(68, 145).mirror().addBox(-0.5433F, -1.3049F, -0.4226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, -1.7313F, -0.1149F, -0.0429F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(129, 133).mirror().addBox(-0.5433F, -0.2233F, -0.6327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, -0.5095F, -0.1149F, -0.0429F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(73, 141).mirror().addBox(-0.5433F, -0.5668F, -0.3824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 0.2759F, -0.1149F, -0.0429F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(133, 122).mirror().addBox(-0.5433F, -0.4441F, -1.3948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 1.4103F, -0.1149F, -0.0429F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(21, 145).mirror().addBox(-0.5433F, -1.4128F, -0.3265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 2.6757F, -0.1149F, -0.0429F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(133, 87).mirror().addBox(-0.5433F, -0.6703F, -0.5859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, -2.7785F, -0.1149F, -0.0429F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(68, 141).mirror().addBox(-0.5433F, -0.6147F, -0.5067F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, -1.5567F, -0.1149F, -0.0429F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(130, 144).mirror().addBox(-0.5433F, 0.0349F, -1.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(125, 144).mirror().addBox(-0.5433F, -0.4651F, -1.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, -0.9895F, -0.1149F, -0.0429F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(120, 144).mirror().addBox(-0.5433F, -1.1321F, -0.2571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 0.2322F, -0.1149F, -0.0429F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(115, 69).mirror().addBox(-0.5433F, 0.1283F, 0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 1.5848F, -0.1149F, -0.0429F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(101, 86).mirror().addBox(-0.3683F, -0.4688F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 90).mirror().addBox(-0.5433F, -0.4688F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, -1.055F, -0.1149F, -0.0429F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(130, 26).mirror().addBox(-0.5433F, -0.1537F, -1.3149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5333F, 0.9501F, -0.8944F, 3.0247F, -0.1149F, -0.0429F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(100, 24).mirror().addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6853F, 1.103F, -0.3755F, 0.4193F, -0.1268F, -0.0255F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(112, 139).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.608F, 1.567F, 0.3233F, 1.292F, -0.1268F, -0.0255F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(133, 79).mirror().addBox(-0.475F, -0.75F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.4222F, -0.085F, 1.2189F, 0.6114F, -0.0851F, -0.0248F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(130, 14).mirror().addBox(-0.525F, -0.075F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.2369F, -0.1772F, 0.2902F, -0.0965F, -0.0414F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(117, 36).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6986F, 0.4352F, -0.8903F, 0.2751F, -0.1141F, -0.0673F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(142, 94).addBox(0.1139F, 2.417F, -11.4719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(142, 94).mirror().addBox(-1.1139F, 2.417F, -11.4719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.987F, 0.1048F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(117, 134).mirror().addBox(0.0067F, -0.4536F, -0.2583F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.9955F, 2.9113F, -11.9782F, -1.3177F, -0.0087F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(81, 145).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6569F, 0.9168F, 0.1958F, 0.6632F, -0.2182F, 0.0349F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(0.2214F, -1.2094F, -6.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.2269F, -0.0523F, -0.0038F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(131, 104).mirror().addBox(0.1702F, -0.7205F, -10.8187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-1.6896F, 0.3196F, 0.3758F, 0.1657F, -0.051F, 0.0152F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(65, 118).mirror().addBox(0.2214F, -1.0473F, -9.2465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.2007F, -0.0523F, -0.0038F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(91, 131).mirror().addBox(-0.3131F, 3.2831F, -0.9771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, -1.8144F, -0.1831F, -0.0096F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(75, 131).mirror().addBox(-0.3131F, 1.1598F, -3.5753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, -0.9418F, -0.1831F, -0.0096F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(126, 123).mirror().addBox(-0.3131F, 0.2059F, -3.0831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, -0.5927F, -0.1831F, -0.0096F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(70, 136).mirror().addBox(-0.3131F, -2.8206F, -3.4014F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.2363F, -0.1831F, -0.0096F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(117, 89).mirror().addBox(-0.339F, -0.2902F, -3.737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.1758F, -0.1833F, 0.0347F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(131, 64).mirror().addBox(-0.4366F, -0.2024F, -1.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, -0.374F, -0.1833F, 0.0347F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(143, 33).mirror().addBox(-0.4366F, -0.1926F, -1.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.0187F, -0.1833F, 0.0347F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(143, 9).mirror().addBox(-0.4366F, -0.2692F, -1.1357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.2805F, -0.1833F, 0.0347F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(143, 6).mirror().addBox(-0.5452F, -0.1433F, 0.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.4594F, 0.1484F, -0.2182F, 0.0349F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(3, 143).mirror().addBox(-0.5452F, 0.3033F, 0.1682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.4594F, 0.8029F, -0.2182F, 0.0349F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(142, 140).mirror().addBox(-0.5452F, 0.5974F, 0.2081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.1521F, -0.4594F, 1.2392F, -0.2182F, 0.0349F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(84, 108).mirror().addBox(0.4574F, -1.3959F, -9.6384F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.2096F, -0.0498F, -0.0211F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(117, 140).mirror().addBox(0.4455F, -0.9094F, -5.7203F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.1223F, -0.051F, -0.0152F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(142, 118).mirror().addBox(0.0405F, -1.2019F, -0.6509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0205F, 2.9113F, -10.7782F, 0.7603F, -0.0832F, -0.0263F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(142, 115).mirror().addBox(0.1172F, -3.2331F, -11.3789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6896F, 0.3196F, 0.3758F, 0.4015F, -0.0523F, -0.0038F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(117, 84).mirror().addBox(0.1287F, -0.5185F, -11.3859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6896F, 0.3196F, 0.3758F, 0.2182F, -0.0523F, -0.0038F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(131, 60).mirror().addBox(0.2214F, -0.8756F, -8.4363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.2618F, -0.0523F, -0.0038F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(136, 57).mirror().addBox(0.0067F, -0.4415F, -0.5496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9955F, 2.9113F, -11.9782F, -0.9076F, -0.0087F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(136, 54).mirror().addBox(0.0067F, 0.2232F, -0.4899F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.9955F, 2.9113F, -11.9782F, -1.0821F, -0.0087F, 0.0F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(97, 142).mirror().addBox(-0.0183F, -0.253F, -0.7317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.9955F, 2.9113F, -11.9782F, 1.9199F, -0.1222F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(117, 55).mirror().addBox(0.2214F, -0.4166F, -6.4787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.192F, -0.0523F, -0.0038F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(26, 131).mirror().addBox(0.2214F, -0.7939F, -5.3319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7646F, 0.3196F, 0.3758F, 0.1484F, -0.0523F, -0.0038F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(52, 44).addBox(-1.2214F, -1.2094F, -6.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.2269F, 0.0523F, 0.0038F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(131, 104).addBox(-1.1702F, -0.7205F, -10.8187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.6896F, 0.3196F, 0.3758F, 0.1657F, 0.051F, -0.0152F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(65, 118).addBox(-1.2214F, -1.0473F, -9.2465F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.2007F, 0.0523F, 0.0038F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(91, 131).addBox(-0.6869F, 3.2831F, -0.9771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, -1.8144F, 0.1831F, 0.0096F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(75, 131).addBox(-0.6869F, 1.1598F, -3.5753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, -0.9418F, 0.1831F, 0.0096F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(126, 123).addBox(-0.6869F, 0.2059F, -3.0831F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, -0.5927F, 0.1831F, 0.0096F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(70, 136).addBox(-0.6869F, -2.8206F, -3.4014F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.2363F, 0.1831F, 0.0096F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(117, 89).addBox(-0.661F, -0.2902F, -3.737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.1758F, 0.1833F, -0.0347F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(131, 64).addBox(-0.5634F, -0.2024F, -1.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, -0.374F, 0.1833F, -0.0347F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(143, 33).addBox(-0.5634F, -0.1926F, -1.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.0187F, 0.1833F, -0.0347F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(143, 9).addBox(-0.5634F, -0.2692F, -1.1357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.2805F, 0.1833F, -0.0347F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(81, 145).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6569F, 0.9168F, 0.1958F, 0.6632F, 0.2182F, -0.0349F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(143, 6).addBox(-0.4548F, -0.1433F, 0.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.4594F, 0.1484F, 0.2182F, -0.0349F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(3, 143).addBox(-0.4548F, 0.3033F, 0.1682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.4594F, 0.8029F, 0.2182F, -0.0349F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(142, 140).addBox(-0.4548F, 0.5974F, 0.2081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4385F, 0.1521F, -0.4594F, 1.2392F, 0.2182F, -0.0349F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(84, 108).addBox(-0.4574F, -1.3959F, -9.6384F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.2096F, 0.0498F, 0.0211F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(117, 140).addBox(-0.4455F, -0.9094F, -5.7203F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.1223F, 0.051F, 0.0152F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(142, 118).addBox(-1.0405F, -1.2019F, -0.6509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 2.9113F, -10.7782F, 0.7603F, 0.0832F, 0.0263F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(142, 115).addBox(-1.1172F, -3.2331F, -11.3789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6896F, 0.3196F, 0.3758F, 0.4015F, 0.0523F, 0.0038F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(117, 84).addBox(-1.1287F, -0.5185F, -11.3859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6896F, 0.3196F, 0.3758F, 0.2182F, 0.0523F, 0.0038F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(131, 60).addBox(-1.2214F, -0.8756F, -8.4363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.2618F, 0.0523F, 0.0038F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(136, 57).addBox(-2.0067F, -0.4415F, -0.5496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9955F, 2.9113F, -11.9782F, -0.9076F, 0.0087F, 0.0F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(117, 134).addBox(-2.0067F, -0.4536F, -0.2583F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.9955F, 2.9113F, -11.9782F, -1.3177F, 0.0087F, 0.0F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(136, 54).addBox(-2.0067F, 0.2232F, -0.4899F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.9955F, 2.9113F, -11.9782F, -1.0821F, 0.0087F, 0.0F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(97, 142).addBox(-0.9817F, -0.253F, -0.7317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.9955F, 2.9113F, -11.9782F, 1.9199F, 0.1222F, 0.0F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(117, 55).addBox(-1.2214F, -0.4166F, -6.4787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.192F, 0.0523F, 0.0038F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(26, 131).addBox(-1.2214F, -0.7939F, -5.3319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7646F, 0.3196F, 0.3758F, 0.1484F, 0.0523F, 0.0038F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -0.8209F, 0.0402F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.88F, 8.6205F, -0.1136F, -0.0434F, 0.0049F));

		PartDefinition cube_r523 = tail.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-3.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1791F, 1.0402F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r524 = tail.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(35, 13).addBox(0.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1791F, 1.0402F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r525 = tail.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(83, 119).addBox(0.0F, -0.2F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8089F, 9.937F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r526 = tail.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(47, 128).addBox(0.0F, -1.3F, 1.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 131).addBox(0.0F, -3.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.299F, 6.8066F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(33, 139).addBox(0.0F, -1.8F, -0.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1625F, 3.0385F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(10, 111).addBox(0.0F, -9.1635F, 0.001F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 9.1436F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r529 = tail.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(93, 108).addBox(0.0F, -9.8382F, 0.0324F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7789F, 7.0783F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r530 = tail.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(59, 133).addBox(-0.004F, -5.5382F, -1.0176F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8571F, 8.1613F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r531 = tail.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(136, 126).addBox(0.0F, -4.6382F, -0.0676F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6678F, 5.1167F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r532 = tail.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(138, 0).addBox(0.004F, 0.0F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4008F, 5.7955F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r533 = tail.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(100, 129).addBox(0.01F, 0.0F, -1.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.0949F, 7.8421F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r534 = tail.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(129, 91).addBox(-0.004F, -6.7F, -1.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7526F, 5.6251F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r535 = tail.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(103, 136).addBox(0.0F, -4.6382F, 0.0324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7925F, 2.9991F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r536 = tail.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(17, 101).addBox(0.0F, -11.6382F, 0.3324F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, 0.9395F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r537 = tail.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(64, 97).addBox(-0.004F, -11.6382F, 0.0324F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, 0.9395F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 47).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1686F, 11.0409F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r538 = tail2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r539 = tail2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(35, 23).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r540 = tail2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(56, 128).addBox(0.0F, -6.2892F, -0.094F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 8.0557F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r541 = tail2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(53, 128).addBox(0.0F, -6.7238F, 0.0026F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 6.0557F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(10, 123).addBox(0.0F, -7.4228F, -0.0148F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5383F, 4.0113F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r543 = tail2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(92, 120).addBox(0.0F, -8.0228F, -0.0148F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5834F, 1.987F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r544 = tail2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(65, 141).addBox(-0.004F, -4.0228F, -1.0148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8462F, 3.457F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(136, 133).addBox(0.0F, -4.6228F, -0.0148F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r546 = tail2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(114, 131).addBox(0.0F, -2.2F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6236F, 8.3868F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r547 = tail2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(0, 124).addBox(0.0F, 4.1F, 9.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 128).addBox(0.0F, 2.8F, 7.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5199F, -6.2336F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 33).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0192F, 8.7567F, -0.0968F, -0.1303F, 0.0126F));

		PartDefinition cube_r548 = tail3.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 1.0F, 0.0055F, 0.052F, -0.002F));

		PartDefinition cube_r549 = tail3.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(57, 54).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 1.0F, 0.0055F, -0.052F, 0.002F));

		PartDefinition cube_r550 = tail3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(53, 137).addBox(0.0F, 3.7F, 9.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 140).addBox(0.0F, 3.6F, 7.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 137).addBox(0.0F, 1.7F, 5.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 133).addBox(0.0F, -0.2F, 3.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -2.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail3.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(47, 137).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6389F, 8.9052F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail3.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(137, 24).addBox(0.0F, -4.2F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.872F, 7.4913F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r553 = tail3.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(132, 91).addBox(0.0F, -5.5707F, 0.0528F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2428F, 4.8337F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r554 = tail3.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(88, 132).addBox(0.0F, -5.6707F, -0.1472F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r555 = tail3.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(85, 132).addBox(0.0F, -5.8819F, -0.3259F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.6109F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0096F, 10.9005F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r556 = tail4.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(143, 60).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r557 = tail4.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(143, 55).addBox(0.0F, -3.05F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r558 = tail4.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(8, 141).addBox(0.0F, -3.35F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 6.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r559 = tail4.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(141, 0).addBox(0.0F, -3.65F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r560 = tail4.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(0, 141).addBox(0.0F, -3.75F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail4.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(139, 140).addBox(0.0F, -4.05F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail4.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(117, 94).addBox(0.0F, 11.8F, 19.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 50).addBox(0.0F, 9.6F, 17.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 36).addBox(0.0F, 8.5F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 142).addBox(0.0F, 7.5F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -13.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r563 = tail4.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(143, 41).addBox(0.0F, 6.4F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5429F, -13.0147F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.0616F, 0.1307F, -0.008F));

		PartDefinition cube_r564 = tail5.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(142, 143).addBox(0.0F, -2.375F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r565 = tail5.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(112, 143).addBox(0.0F, -2.6F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail5.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(102, 143).addBox(0.0F, -2.55F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r567 = tail5.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(145, 143).addBox(0.0F, 14.9F, 25.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 106).addBox(0.0F, 13.9F, 23.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 145).addBox(0.0F, 12.7F, 21.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -24.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(78, 56).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0071F, 6.0019F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r568 = tail6.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(146, 48).addBox(0.0F, -2.375F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 44).addBox(0.0F, -2.375F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 145).addBox(0.0F, -2.375F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4186F, 0.9905F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r569 = tail6.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(146, 56).addBox(0.0F, 17.0F, 29.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 146).addBox(0.0F, 15.9F, 27.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5596F, -30.1161F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0125F, 5.9135F, 0.0797F, 0.174F, 0.0138F));

		PartDefinition cube_r570 = tail7.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(146, 134).addBox(0.0F, 20.9F, 35.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 131).addBox(0.0F, 19.9F, 33.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 60).addBox(0.0F, 17.8F, 31.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5722F, -36.0296F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r571 = tail7.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(146, 128).addBox(0.0F, -2.375F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 52).addBox(0.0F, -2.375F, 5.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.406F, -4.923F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 59).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0051F, 7.7751F, 0.2166F, 0.2559F, 0.0557F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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