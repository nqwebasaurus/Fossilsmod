package fossils.fossils.client.blockentity.model.iguanodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IguanodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
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
	private final ModelPart chest2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public IguanodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
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
		this.chest2 = this.body2.getChild("chest2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone4 = this.chest2.getChild("bone4");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.heads = this.neck8.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.leftArm = this.chest2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest2.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie3 = this.rightArm3.getChild("opposablePinkie3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -29.6089F, 5.4037F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-4.0F, 1.0F, 0.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 16).addBox(1.0F, 1.0F, 0.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 22).addBox(-0.004F, -4.5382F, -0.9676F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9995F, 7.071F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 115).addBox(0.004F, 0.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -8.6637F, -3.451F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 59).addBox(0.008F, -2.5F, -3.5F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(38, 59).addBox(0.0F, -2.5F, -3.5F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -5.8682F, -0.1823F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 81).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1501F, 2.4953F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.7508F, -2.0884F, 1.6703F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(99, 95).addBox(-0.5F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7381F, 1.9258F, -1.4913F, -1.4151F, -0.2209F, 0.2376F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(117, 50).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2905F, 4.496F, -1.657F, -0.1854F, -0.2094F, 0.2411F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(115, 15).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2751F, 4.3012F, -1.5089F, 1.1672F, -0.2094F, 0.2411F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 106).addBox(-0.0643F, -7.5889F, 0.5856F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.4098F, 7.5359F, 2.515F, 1.0363F, -0.2094F, 0.2411F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 29).addBox(-0.5F, -1.5F, -2.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0328F, 2.6987F, -6.7295F, 0.3054F, -0.3229F, 0.0F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(106, 10).addBox(-0.5F, -1.225F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3366F, -1.5463F, -5.2556F, -0.7797F, -0.1213F, 0.0493F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(113, 8).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2315F, 0.4148F, -8.3379F, 0.4627F, -0.1309F, -0.0023F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 90).addBox(-0.0039F, 0.3749F, -1.7421F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3462F, -1.7149F, -7.7883F, 0.6197F, -0.1309F, -0.0023F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 85).addBox(1.8236F, -0.1264F, -3.0602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3462F, -1.7149F, -7.7883F, 0.6649F, 0.1451F, 0.2122F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(99, 85).addBox(1.0051F, -0.1264F, -2.9207F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3462F, -1.7149F, -7.7883F, 0.6582F, -0.062F, 0.0515F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(99, 15).addBox(-0.0039F, -0.1264F, -3.0984F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(120, 36).addBox(-0.0039F, -0.1264F, -3.9984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3462F, -1.7149F, -7.7883F, 0.6634F, -0.1309F, -0.0023F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(92, 6).addBox(-0.2329F, -0.084F, -1.9567F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3462F, -2.4149F, -6.0883F, 0.3847F, -0.1304F, -0.0115F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 91).addBox(-0.4093F, 0.0078F, -1.9415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.3247F, -3.0128F, -4.5688F, 0.2561F, -0.1016F, 0.0683F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(90, 98).addBox(0.0514F, -0.3094F, 1.7326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.255F, -2.2382F, -0.7929F, -0.2771F, 0.1034F, 0.0745F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(96, 80).addBox(1.0631F, -0.3094F, 1.587F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.255F, -2.2382F, -0.7929F, -0.2762F, -0.0646F, 0.1221F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 98).addBox(-0.9818F, -0.3094F, 1.8265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.255F, -2.2382F, -0.7929F, -0.2832F, 0.2292F, 0.0378F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 74).addBox(1.0775F, -0.0984F, -0.2325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.255F, -2.2382F, -0.7929F, -0.1309F, -0.0643F, 0.1574F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(71, 17).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7492F, -2.0624F, -2.7821F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(102, 46).addBox(-0.8769F, -0.0448F, -0.1502F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.255F, -2.2382F, -0.7929F, -0.1238F, 0.192F, 0.0879F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(117, 20).addBox(-0.5F, -1.475F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.4159F, 13.7891F, 6.6739F, -2.7736F, 0.0733F, -0.0043F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 98).addBox(-0.4916F, -0.3388F, -0.1306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.5098F, 10.5692F, 5.6957F, -1.2465F, 0.0733F, -0.0043F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 97).addBox(-0.0094F, -0.0742F, -0.1191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5098F, 8.0692F, 4.2957F, -0.9461F, 0.0479F, 0.2126F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(86, 10).addBox(-0.2325F, -0.8831F, -0.2039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.7098F, 5.9859F, 0.965F, -0.7918F, 0.0041F, 0.2701F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 62).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3713F, 3.8911F, -0.6086F, -0.8006F, -0.2094F, 0.2411F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(13, 82).addBox(-0.5F, -1.8F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2508F, 3.3489F, -4.1049F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 70).addBox(1.1265F, -0.1218F, -1.9077F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.9532F, 2.4132F, -5.5614F, -0.7098F, -0.3241F, 0.0715F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(13, 75).addBox(1.1265F, -0.3921F, -0.8984F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.9532F, 2.4132F, -5.5614F, -0.7796F, -0.3241F, 0.0715F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(84, 38).addBox(-0.7629F, -0.8065F, -0.1924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.9532F, 6.8132F, -0.4614F, -0.5091F, -0.3241F, 0.0715F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 97).addBox(-0.0387F, -0.6684F, -0.4558F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9532F, 5.5132F, -2.5614F, -0.5296F, -0.3297F, 0.036F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 110).addBox(-0.5F, 0.075F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.9068F, 3.2101F, -9.5376F, -2.8013F, -0.3229F, 0.0F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 125).addBox(-0.5F, -1.575F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(110, 120).addBox(-0.5F, -0.875F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5298F, 1.437F, -11.3996F, -2.2078F, -0.3229F, 0.0F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(126, 88).addBox(-0.5F, 0.2F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.615F, 0.5587F, -11.6542F, -1.2915F, -0.3229F, 0.0F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(105, 120).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7433F, 3.4826F, -12.0374F, -1.7977F, -0.3229F, 0.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(100, 120).addBox(-0.5F, 1.95F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8456F, -0.166F, -12.3433F, 0.192F, -0.3229F, 0.0F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(110, 20).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1268F, 1.4827F, -10.195F, -0.1134F, -0.3229F, 0.0F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(48, 74).addBox(-0.7088F, -0.1053F, -3.9835F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1613F, 1.1828F, -5.6873F, 0.1484F, -0.3229F, 0.0F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(109, 107).addBox(-0.6838F, -0.9858F, 0.0597F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1613F, 1.1828F, -5.6873F, 0.7243F, -0.3229F, 0.0F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 73).addBox(-0.7088F, -1.0165F, -3.4999F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1613F, 1.1828F, -5.6873F, 0.4625F, -0.3229F, 0.0F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 62).addBox(4.0F, -0.0054F, -3.7615F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.013F, -0.6338F, 0.011F, 0.0213F, 0.204F, -0.0478F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.7508F, -2.0884F, 1.6703F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(99, 95).mirror().addBox(-0.5F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.7381F, 1.9258F, -1.4913F, -1.4151F, 0.2209F, -0.2376F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(117, 50).mirror().addBox(-0.5F, -0.6F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2905F, 4.496F, -1.657F, -0.1854F, 0.2094F, -0.2411F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(115, 15).mirror().addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2751F, 4.3012F, -1.5089F, 1.1672F, 0.2094F, -0.2411F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(76, 106).mirror().addBox(-0.9357F, -7.5889F, 0.5856F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.4098F, 7.5359F, 2.515F, 1.0363F, 0.2094F, -0.2411F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-0.5F, -1.5F, -2.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0328F, 2.6987F, -6.7295F, 0.3054F, 0.3229F, 0.0F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(106, 10).mirror().addBox(-0.5F, -1.225F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3366F, -1.5463F, -5.2556F, -0.7797F, 0.1213F, -0.0493F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(113, 8).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 0.4148F, -8.3379F, 0.4627F, 0.1309F, 0.0023F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.9961F, 0.3749F, -1.7421F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -1.7149F, -7.7883F, 0.6197F, 0.1309F, 0.0023F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-2.8236F, -0.1264F, -3.0602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -1.7149F, -7.7883F, 0.6649F, -0.1451F, -0.2122F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(99, 85).mirror().addBox(-2.0051F, -0.1264F, -2.9207F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -1.7149F, -7.7883F, 0.6582F, 0.062F, -0.0515F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(99, 15).mirror().addBox(-0.9961F, -0.1264F, -3.0984F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(120, 36).mirror().addBox(-0.9961F, -0.1264F, -3.9984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -1.7149F, -7.7883F, 0.6634F, 0.1309F, 0.0023F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-2.7671F, -0.084F, -1.9567F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.4149F, -6.0883F, 0.3847F, 0.1304F, 0.0115F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 91).mirror().addBox(-2.5907F, 0.0078F, -1.9415F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.3247F, -3.0128F, -4.5688F, 0.2561F, 0.1016F, -0.0683F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(90, 98).mirror().addBox(-1.0514F, -0.3094F, 1.7326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -2.2382F, -0.7929F, -0.2771F, -0.1034F, -0.0745F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(96, 80).mirror().addBox(-2.0631F, -0.3094F, 1.587F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -2.2382F, -0.7929F, -0.2762F, 0.0646F, -0.1221F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(-0.0182F, -0.3094F, 1.8265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -2.2382F, -0.7929F, -0.2832F, -0.2292F, -0.0378F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-2.0775F, -0.0984F, -0.2325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -2.2382F, -0.7929F, -0.1309F, 0.0643F, -0.1574F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 17).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7492F, -2.0624F, -2.7821F, -0.1731F, -0.0227F, -0.1289F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(102, 46).mirror().addBox(-1.1231F, -0.0448F, -0.1502F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -2.2382F, -0.7929F, -0.1238F, -0.192F, -0.0879F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(117, 20).mirror().addBox(-0.5F, -1.475F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.4159F, 13.7891F, 6.6739F, -2.7736F, -0.0733F, 0.0043F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(54, 98).mirror().addBox(-0.5084F, -0.3388F, -0.1306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.5098F, 10.5692F, 5.6957F, -1.2465F, -0.0733F, 0.0043F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(33, 97).mirror().addBox(-0.9906F, -0.0742F, -0.1191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5098F, 8.0692F, 4.2957F, -0.9461F, -0.0479F, -0.2126F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(86, 10).mirror().addBox(-0.7675F, -0.8831F, -0.2039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.7098F, 5.9859F, 0.965F, -0.7918F, -0.0041F, -0.2701F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3713F, 3.8911F, -0.6086F, -0.8006F, 0.2094F, -0.2411F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(13, 82).mirror().addBox(-0.5F, -1.8F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2508F, 3.3489F, -4.1049F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(-2.1265F, -0.1218F, -1.9077F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 2.4132F, -5.5614F, -0.7098F, 0.3241F, -0.0715F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(13, 75).mirror().addBox(-2.1265F, -0.3921F, -0.8984F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 2.4132F, -5.5614F, -0.7796F, 0.3241F, -0.0715F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.2371F, -0.8065F, -0.1924F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 6.8132F, -0.4614F, -0.5091F, 0.3241F, -0.0715F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(24, 97).mirror().addBox(-0.9613F, -0.6684F, -0.4558F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9532F, 5.5132F, -2.5614F, -0.5296F, 0.3297F, -0.036F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(26, 110).mirror().addBox(-0.5F, 0.075F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.9068F, 3.2101F, -9.5376F, -2.8013F, 0.3229F, 0.0F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 125).mirror().addBox(-0.5F, -1.575F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(110, 120).mirror().addBox(-0.5F, -0.875F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5298F, 1.437F, -11.3996F, -2.2078F, 0.3229F, 0.0F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(126, 88).mirror().addBox(-0.5F, 0.2F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.615F, 0.5587F, -11.6542F, -1.2915F, 0.3229F, 0.0F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(105, 120).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7433F, 3.4826F, -12.0374F, -1.7977F, 0.3229F, 0.0F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(100, 120).mirror().addBox(-0.5F, 1.95F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8456F, -0.166F, -12.3433F, 0.192F, 0.3229F, 0.0F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(110, 20).mirror().addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1268F, 1.4827F, -10.195F, -0.1134F, 0.3229F, 0.0F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(48, 74).mirror().addBox(-0.2912F, -0.1053F, -3.9835F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.1828F, -5.6873F, 0.1484F, 0.3229F, 0.0F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(109, 107).mirror().addBox(-0.3162F, -0.9858F, 0.0597F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.1828F, -5.6873F, 0.7243F, 0.3229F, 0.0F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.2912F, -1.0165F, -3.4999F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.1828F, -5.6873F, 0.4625F, 0.3229F, 0.0F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-5.0F, -0.0054F, -3.7615F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.013F, -0.6338F, 0.011F, 0.0213F, -0.204F, 0.0478F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -0.6599F, -2.0552F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(112, 75).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.6335F, 1.2011F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(81, 106).addBox(-0.5F, -12.4343F, -5.7198F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 87).addBox(-1.0F, -1.8F, -0.35F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.1263F, -0.1021F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(18, 90).addBox(-1.0F, -1.7F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1263F, -0.1021F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(38, 50).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(102, 30).addBox(-1.0F, -1.2F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.4544F, 0.6921F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(68, 85).addBox(-1.0F, -12.5937F, -5.4715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(36, 90).addBox(-1.0F, -10.674F, -6.5943F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(61, 78).addBox(-1.9F, -0.2745F, -1.1999F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.6135F, 0.0436F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(105, 71).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(108, 97).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 9.5951F, 0.0372F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -3.0F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.5756F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(99, 100).addBox(-1.0F, -1.1F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 11.0599F, -0.2537F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(95, 105).addBox(-1.9F, -15.0978F, 4.1681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(9, 89).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9F, 1.5835F, 2.8194F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(30, 71).addBox(-1.9F, -12.035F, 0.6314F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(82, 45).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 12.7056F, -1.2962F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(31, 22).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7131F, -0.2843F, 0.6021F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(67, 38).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3131F, -3.3106F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -0.6599F, -2.0552F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(112, 79).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.6335F, 1.2011F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(108, 90).addBox(-0.5F, -12.4343F, -5.7198F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4372F, 6.7917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(87, 77).addBox(-1.0F, -1.8F, -0.35F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.1263F, -0.1021F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(27, 90).addBox(-1.0F, -1.7F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1263F, -0.1021F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 52).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(60, 103).addBox(-1.0F, -1.2F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 11.4544F, 0.6921F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, -12.5937F, -5.4715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(56, 91).addBox(-1.0F, -10.674F, -6.5943F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.6652F, 4.9178F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 80).addBox(-0.1F, -0.2745F, -1.1999F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.6135F, 0.0436F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(105, 77).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(109, 102).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 9.5951F, 0.0372F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(90, 103).addBox(-0.5F, -3.0F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.5756F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 60).addBox(-1.0F, -1.1F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 11.0599F, -0.2537F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(102, 105).addBox(-0.1F, -15.0978F, 4.1681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(90, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9F, 1.5835F, 2.8194F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(39, 71).addBox(-0.1F, -12.035F, 0.6314F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(83, 61).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 12.7056F, -1.2962F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(51, 67).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9044F, -0.2259F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(13, 68).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 39).addBox(-1.0F, -0.6317F, -8.0364F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8687F, -6.0023F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(81, 113).addBox(0.01F, -4.6397F, -0.0012F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4945F, -7.093F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(34, 60).addBox(0.01F, -4.7295F, -0.1008F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -0.901F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(40, 110).addBox(0.01F, -4.7943F, -0.0073F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -3.001F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 113).addBox(0.01F, -4.781F, 0.0285F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.57F, -5.0397F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(119, 70).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.7558F, 0.2771F, 0.349F, -0.9069F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(119, 68).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.7558F, 0.4143F, 0.2619F, -0.458F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(119, 62).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.7558F, 0.2212F, 0.2798F, -0.9242F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(119, 60).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.7558F, 0.3341F, 0.2226F, -0.4773F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(119, 58).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -4.7558F, 0.2553F, 0.1818F, -0.4931F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(110, 69).mirror().addBox(-4.7749F, -0.8587F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -4.7558F, 0.1675F, 0.2098F, -0.9372F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(111, 48).mirror().addBox(-5.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -6.8558F, 0.0619F, 0.2606F, -1.3831F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(119, 56).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -6.8558F, 0.2553F, 0.1818F, -0.4931F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(119, 54).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -6.8558F, 0.1675F, 0.2098F, -0.9372F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(119, 68).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.7558F, 0.4143F, -0.2619F, 0.458F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(119, 70).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.7558F, 0.2771F, -0.349F, 0.9069F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(119, 60).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.7558F, 0.3341F, -0.2226F, 0.4773F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(119, 62).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.7558F, 0.2212F, -0.2798F, 0.9242F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(110, 69).addBox(1.7749F, -0.8587F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -4.7558F, 0.1675F, -0.2098F, 0.9372F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(119, 58).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -4.7558F, 0.2553F, -0.1818F, 0.4931F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(119, 54).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -6.8558F, 0.1675F, -0.2098F, 0.9372F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(119, 56).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -6.8558F, 0.2553F, -0.1818F, 0.4931F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(111, 48).addBox(3.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -6.8558F, 0.0619F, -0.2606F, 1.3831F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -7.8319F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6229F, -0.2045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(86, 16).addBox(0.01F, -4.3449F, 0.0356F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2944F, -1.1537F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4537F, -0.5239F, 0.4305F, 0.2696F, -0.4537F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-7.0583F, -2.3736F, -0.2407F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4537F, -0.5239F, 0.1014F, 0.449F, -1.3693F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(119, 4).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4537F, -0.5239F, 0.2886F, 0.3627F, -0.9028F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(117, 66).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.4632F, 0.2848F, -0.4448F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(117, 64).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.312F, 0.39F, -0.8943F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1538F, -2.4239F, 0.1093F, 0.4832F, -1.3657F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(116, 94).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7538F, -4.2239F, 0.4632F, 0.2848F, -0.4448F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(116, 83).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7538F, -4.2239F, 0.312F, 0.39F, -0.8943F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-11.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7538F, -4.2239F, 0.1093F, 0.4832F, -1.3657F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(119, 4).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4537F, -0.5239F, 0.2886F, -0.3627F, 0.9028F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(105, 83).addBox(3.0583F, -2.3736F, -0.2407F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4537F, -0.5239F, 0.1014F, -0.449F, 1.3693F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(119, 6).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4537F, -0.5239F, 0.4305F, -0.2696F, 0.4537F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(117, 66).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.4632F, -0.2848F, 0.4448F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(117, 64).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.312F, -0.39F, 0.8943F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(71, 27).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1538F, -2.4239F, 0.1093F, -0.4832F, 1.3657F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(116, 94).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7538F, -4.2239F, 0.4632F, -0.2848F, 0.4448F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(116, 83).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7538F, -4.2239F, 0.312F, -0.39F, 0.8943F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(71, 23).addBox(3.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7538F, -4.2239F, 0.1093F, -0.4832F, 1.3657F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 101).addBox(0.01F, -3.9967F, -0.0328F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4294F, -2.9781F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(13, 62).addBox(0.01F, -3.6561F, -0.0186F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9871F, -4.9347F, 0.2531F, 0.0F, 0.0F));

		PartDefinition chest2 = body2.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1639F, -5.5702F, -0.3395F, -0.0849F, -0.02F));

		PartDefinition cube_r160 = chest2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(90, 24).addBox(-2.5102F, 0.8747F, -5.023F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5102F, 10.9747F, 4.6031F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(101, 50).addBox(-2.0102F, 0.2057F, -2.4535F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5102F, 10.9747F, 4.6031F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4959F, 11.4491F, 5.0685F, 1.94F, -0.9235F, -1.4045F));

		PartDefinition cube_r163 = chest2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(51, 59).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.232F, 11.6076F, 4.963F, 1.3108F, -1.0001F, -0.8351F));

		PartDefinition cube_r164 = chest2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3655F, 11.5272F, 5.049F, 0.8695F, -0.8135F, -0.3663F));

		PartDefinition cube_r165 = chest2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6876F, 11.2621F, 5.4041F, 0.9372F, -0.6594F, -0.2595F));

		PartDefinition cube_r166 = chest2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(118, 28).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.5682F, 0.6364F, -0.7669F));

		PartDefinition cube_r167 = chest2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-12.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.2052F, 0.806F, -1.3073F));

		PartDefinition cube_r168 = chest2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(118, 26).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2676F, -0.5467F, 0.7897F, 0.4116F, -0.3323F));

		PartDefinition cube_r169 = chest2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.2136F, 0.827F, -1.3012F));

		PartDefinition cube_r170 = chest2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(118, 24).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.588F, 0.6514F, -0.7551F));

		PartDefinition cube_r171 = chest2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(117, 116).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.1176F, -3.1967F, 0.8122F, 0.4186F, -0.3232F));

		PartDefinition cube_r172 = chest2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-11.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.2003F, 0.7934F, -1.3108F));

		PartDefinition cube_r173 = chest2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(117, 114).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.5566F, 0.6273F, -0.7738F));

		PartDefinition cube_r174 = chest2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(93, 50).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -1.8467F, 0.7762F, 0.4073F, -0.3377F));

		PartDefinition cube_r175 = chest2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 10).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4959F, 11.4491F, 5.0685F, 1.94F, 0.9235F, 1.4045F));

		PartDefinition cube_r176 = chest2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 59).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.232F, 11.6076F, 4.963F, 1.3108F, 1.0001F, 0.8351F));

		PartDefinition cube_r177 = chest2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3655F, 11.5272F, 5.049F, 0.8695F, 0.8135F, 0.3663F));

		PartDefinition cube_r178 = chest2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6876F, 11.2621F, 5.4041F, 0.9372F, 0.6594F, 0.2595F));

		PartDefinition cube_r179 = chest2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 29).addBox(-1.0F, -1.1F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0894F, 2.309F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(118, 28).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.5682F, -0.6364F, 0.7669F));

		PartDefinition cube_r181 = chest2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(54, 8).addBox(3.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.2052F, -0.806F, 1.3073F));

		PartDefinition cube_r182 = chest2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(118, 26).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2676F, -0.5467F, 0.7897F, -0.4116F, 0.3323F));

		PartDefinition cube_r183 = chest2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(75, 8).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.2136F, -0.827F, 1.3012F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(118, 24).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.588F, -0.6514F, 0.7551F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(117, 116).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1176F, -3.1967F, 0.8122F, -0.4186F, 0.3232F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(71, 25).addBox(3.0583F, -2.3736F, -0.2407F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.2003F, -0.7934F, 1.3108F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(117, 114).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.5566F, -0.6273F, 0.7738F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(93, 50).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -1.8467F, 0.7762F, -0.4073F, 0.3377F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(42, 97).addBox(0.0F, -2.9427F, -0.0142F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9476F, -3.9669F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 120).addBox(0.0F, -3.3418F, 0.0287F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.503F, -2.6282F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(23, 120).addBox(0.0F, -3.4344F, -0.025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.5411F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1149F, 5.7022F, -1.3575F, 0.41F, 0.0038F, -0.0872F));

		PartDefinition cube_r192 = bone2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(65, 91).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7664F, 5.3437F, -1.5887F, -0.8869F, 0.3762F, 0.8375F));

		PartDefinition cube_r193 = bone2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(90, 85).addBox(-0.5F, -1.5F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7664F, 5.3437F, -1.5887F, -0.1451F, 0.3762F, 0.8375F));

		PartDefinition cube_r194 = bone2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(43, 112).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.1878F, 2.6787F, -1.8174F, 1.4409F, 0.2296F, 0.4552F));

		PartDefinition cube_r195 = bone2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(112, 60).addBox(-0.5F, 0.15F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.1878F, 4.0872F, 0.8315F, 1.4409F, 0.2296F, 0.4552F));

		PartDefinition cube_r196 = bone2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(19, 43).addBox(-1.5F, -1.4836F, -0.8712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.2294F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r197 = bone2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, 0.1F, -1.525F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8433F, 1.6112F, -0.0274F, 1.3166F, -0.0026F, 0.2156F));

		PartDefinition cube_r198 = bone2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(92, 68).addBox(-0.5F, -1.35F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8433F, 1.6112F, -0.0274F, 0.7967F, 0.0511F, 0.2185F));

		PartDefinition cube_r199 = bone2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(96, 74).addBox(-1.0854F, -2.038F, -2.6047F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.6564F, -0.7284F, 3.5817F, 1.0416F, -0.0533F, 0.0788F));

		PartDefinition cube_r200 = bone2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(92, 52).addBox(-1.0854F, -2.038F, -3.0046F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.7453F, -3.0985F, 5.4187F, 0.9107F, -0.0533F, 0.0788F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(101, 66).addBox(-0.5F, 0.225F, -0.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.2824F, -4.0706F, 4.5153F, 0.771F, -0.0533F, 0.0788F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(125, 44).addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.3608F, -5.7412F, 5.5176F, 1.8619F, -0.0533F, 0.0788F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(119, 72).addBox(-0.5F, -0.375F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.3519F, -5.6297F, 5.519F, 0.9456F, -0.0533F, 0.0788F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(12, 107).addBox(-0.5F, 0.0F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.4033F, -4.8726F, 3.4394F, 0.8147F, -0.0533F, 0.0788F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 45).addBox(-1.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.7F, 0.6395F, 0.7459F, 0.9194F, -0.0533F, 0.0788F));

		PartDefinition bone4 = chest2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1149F, 5.7022F, -1.3575F, 0.41F, -0.0038F, 0.0872F));

		PartDefinition cube_r206 = bone4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 91).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7664F, 5.3437F, -1.5887F, -0.8869F, -0.3762F, -0.8375F));

		PartDefinition cube_r207 = bone4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-0.5F, -1.5F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7664F, 5.3437F, -1.5887F, -0.1451F, -0.3762F, -0.8375F));

		PartDefinition cube_r208 = bone4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(43, 112).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1878F, 2.6787F, -1.8174F, 1.4409F, -0.2296F, -0.4552F));

		PartDefinition cube_r209 = bone4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(112, 60).mirror().addBox(-0.5F, 0.15F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.1878F, 4.0872F, 0.8315F, 1.4409F, -0.2296F, -0.4552F));

		PartDefinition cube_r210 = bone4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(19, 43).mirror().addBox(0.5F, -1.4836F, -0.8712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.2294F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.5F, 0.1F, -1.525F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8433F, 1.6112F, -0.0274F, 1.3166F, 0.0026F, -0.2156F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(-0.5F, -1.35F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8433F, 1.6112F, -0.0274F, 0.7967F, -0.0511F, -0.2185F));

		PartDefinition cube_r213 = bone4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 74).mirror().addBox(0.0854F, -2.038F, -2.6047F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.6564F, -0.7284F, 3.5817F, 1.0416F, 0.0533F, -0.0788F));

		PartDefinition cube_r214 = bone4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(0.0854F, -2.038F, -3.0046F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.7453F, -3.0985F, 5.4187F, 0.9107F, 0.0533F, -0.0788F));

		PartDefinition cube_r215 = bone4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(101, 66).mirror().addBox(-0.5F, 0.225F, -0.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.2824F, -4.0706F, 4.5153F, 0.771F, 0.0533F, -0.0788F));

		PartDefinition cube_r216 = bone4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.3608F, -5.7412F, 5.5176F, 1.8619F, 0.0533F, -0.0788F));

		PartDefinition cube_r217 = bone4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(119, 72).mirror().addBox(-0.5F, -0.375F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.3519F, -5.6297F, 5.519F, 0.9456F, 0.0533F, -0.0788F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(12, 107).mirror().addBox(-0.5F, 0.0F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.4033F, -4.8726F, 3.4394F, 0.8147F, 0.0533F, -0.0788F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(0.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6395F, 0.7459F, 0.9194F, 0.0533F, -0.0788F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2986F, -3.9226F, 0.2112F, -0.0734F, -0.0473F));

		PartDefinition cube_r220 = neck4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(126, 105).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6406F, -3.0586F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(88, 124).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3038F, -1.2927F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(74, 78).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(118, 39).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.5721F, 0.6394F, -0.7646F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-4.0583F, -2.3736F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.2068F, 0.8102F, -1.3061F));

		PartDefinition cube_r225 = neck4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(118, 34).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.7942F, 0.413F, -0.3305F));

		PartDefinition cube_r226 = neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(118, 32).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.6184F, 0.3508F, -0.3962F));

		PartDefinition cube_r227 = neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(118, 30).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.4278F, 0.5135F, -0.8436F));

		PartDefinition cube_r228 = neck4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(92, 58).mirror().addBox(-8.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.1501F, 0.6409F, -1.3439F));

		PartDefinition cube_r229 = neck4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(118, 39).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.5721F, -0.6394F, 0.7646F));

		PartDefinition cube_r230 = neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(86, 6).addBox(3.0583F, -2.3736F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.2068F, -0.8102F, 1.3061F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(118, 34).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.7942F, -0.413F, 0.3305F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(118, 32).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.6184F, -0.3508F, 0.3962F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(118, 30).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.4278F, -0.5135F, 0.8436F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(92, 58).addBox(3.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.1501F, -0.6409F, 1.3439F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9591F, -3.3577F, 0.5672F, -0.2182F, 0.0F));

		PartDefinition cube_r235 = neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(23, 126).addBox(0.0F, -1.5F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9603F, -0.6939F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(94, 66).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -0.5663F, 0.214F, 0.3406F, -1.0967F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(118, 41).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.01F, -0.5663F, 0.355F, 0.2802F, -0.6424F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(94, 66).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -0.5663F, 0.214F, -0.3406F, 1.0967F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(118, 41).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.01F, -0.5663F, 0.355F, -0.2802F, 0.6424F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(19, 107).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -4.0023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0111F, -1.4784F, 0.3491F, -0.2182F, 0.0F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(101, 126).addBox(0.0F, -1.322F, 3.96F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(90, 92).addBox(-0.5F, -0.022F, 2.96F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(106, 4).mirror().addBox(-2.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.0647F, 0.2209F, -1.3849F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(118, 43).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.1676F, 0.2352F, -0.937F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(106, 4).addBox(1.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.0647F, -0.2209F, 1.3849F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(118, 43).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.1676F, -0.2352F, 0.937F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4752F, -1.9536F, -0.4625F, -0.2094F, 0.0F));

		PartDefinition cube_r246 = neck.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(104, 126).addBox(0.0F, -0.8F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(126, 101).addBox(0.0F, -0.9F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 83).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(118, 47).mirror().addBox(-1.5156F, -0.2066F, -0.328F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6259F, -3.5344F, 0.4141F, 0.8331F, -1.0327F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(118, 45).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0259F, -1.4344F, 0.4141F, 0.8331F, -1.0327F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(118, 47).addBox(-0.4844F, -0.2066F, -0.328F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6259F, -3.5344F, 0.4141F, -0.8331F, 1.0327F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(118, 45).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0259F, -1.4344F, 0.4141F, -0.8331F, 1.0327F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0148F, -3.4133F, -0.4102F, -0.2094F, 0.0F));

		PartDefinition cube_r252 = neck5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(48, 71).addBox(0.0F, -0.5F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 29).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(48, 118).mirror().addBox(-0.9787F, -0.3537F, -0.8621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r254 = neck5.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(48, 118).addBox(-1.0213F, -0.3537F, -0.8621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8352F, -2.7326F, -0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r255 = neck6.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(57, 81).addBox(0.0F, -0.475F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2335F, -1.0467F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck6.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(119, 80).mirror().addBox(0.6656F, -0.8762F, -1.5125F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5241F, 1.1116F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r257 = neck6.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(119, 80).addBox(-2.6656F, -0.8762F, -1.5125F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5241F, 1.1116F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition cube_r258 = neck6.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(93, 44).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8436F, -2.6404F, 0.2269F, -0.1745F, 0.0F));

		PartDefinition cube_r259 = neck7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(42, 127).addBox(0.0F, 0.225F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 127).addBox(0.0F, 0.225F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5852F, -0.5172F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck7.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(113, 37).mirror().addBox(3.9728F, -1.9267F, -2.9735F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 120).mirror().addBox(2.3732F, -1.4186F, -2.2298F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3677F, 3.752F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r261 = neck7.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(113, 37).addBox(-5.9728F, -1.9267F, -2.9735F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 120).addBox(-4.3732F, -1.4186F, -2.2298F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3677F, 3.752F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition cube_r262 = neck7.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(45, 96).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8413F, -2.6151F, 0.3491F, -0.4363F, 0.0F));

		PartDefinition cube_r263 = neck8.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(114, 54).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5852F, -0.5171F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck8.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(120, 16).mirror().addBox(5.8593F, -2.5262F, -3.638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2091F, 6.3671F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r265 = neck8.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(120, 16).addBox(-7.8593F, -2.5262F, -3.638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2091F, 6.3671F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition cube_r266 = neck8.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck8.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8165F, -3.2346F, 0.1304F, 0.0114F, -0.0865F));

		PartDefinition cube_r267 = heads.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(26, 124).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.2988F, -10.8867F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r268 = heads.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(111, 44).addBox(-0.5F, -0.4F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 3.85F, -9.6607F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r269 = heads.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(5, 124).addBox(-0.8917F, -0.03F, -0.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3916F, 3.41F, -10.5726F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r270 = heads.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 124).addBox(-0.8917F, -0.0101F, -0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3916F, 2.585F, -9.9976F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r271 = heads.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(110, 123).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.8739F, -9.3348F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r272 = heads.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(105, 123).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.1396F, -5.9459F, 0.336F, 0.0F, 0.0F));

		PartDefinition cube_r273 = heads.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(100, 123).addBox(-0.5F, 0.175F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.1539F, -8.7112F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r274 = heads.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(123, 92).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.8201F, -7.7686F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r275 = heads.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(123, 82).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.004F, 0.4684F, -6.8755F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r276 = heads.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(10, 123).addBox(-0.5F, -0.05F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.121F, -5.1149F, 0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r277 = heads.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(113, 12).addBox(-1.0F, -0.525F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.1422F, -4.4925F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r278 = heads.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(103, 6).addBox(-1.5F, -0.9467F, -0.9925F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9194F, -0.3198F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r279 = heads.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0893F, -1.7766F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r280 = heads.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(95, 41).addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8243F, -2.8878F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r281 = heads.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(30, 68).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0015F, -3.5204F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r282 = heads.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(35, 107).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.2276F, -0.7855F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r283 = heads.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(26, 107).addBox(-1.5F, -0.7269F, 0.6628F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7694F, 0.1052F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r284 = heads.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(97, 10).addBox(-1.5F, -0.004F, -0.0267F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7694F, 0.1052F, -0.7941F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.8F, -0.7735F, -2.7839F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(56, 125).addBox(-0.1779F, -6.7438F, -4.769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(92, 122).addBox(-0.1779F, -6.7438F, -5.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -1.699F, 0.1096F, -0.0253F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(63, 122).addBox(-0.1252F, -8.5059F, -1.6325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -1.1322F, 0.107F, -0.0348F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(24, 102).addBox(-1.0258F, -2.1082F, -2.5667F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2252F, 2.7979F, -2.0286F, 0.3645F, 0.2614F, 0.032F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(125, 85).addBox(-0.9416F, 2.6516F, 1.8951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, -1.8368F, 0.1154F, 0.0011F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(61, 125).addBox(-1.3111F, 1.8982F, -2.8902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, -0.5802F, 0.0441F, -0.109F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(120, 12).addBox(-1.1368F, 0.5311F, -2.3748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, -0.8034F, 0.0941F, -0.0637F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(58, 122).addBox(-1.1274F, -2.1018F, -1.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.4632F, 0.1067F, -0.0515F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(53, 122).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.096F, 5.9258F, -7.9157F, 0.9486F, 0.6904F, 0.7729F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(111, 40).addBox(-2.9433F, -1.9256F, 1.0177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(111, 28).addBox(-2.5433F, -1.9256F, 1.5177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.0378F, 0.5466F, 0.704F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(45, 91).addBox(-0.3386F, -3.3552F, 2.0304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.373F, -0.0924F, -0.0081F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(69, 106).addBox(-0.1596F, -6.2827F, 3.3456F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.2458F, 0.1023F, -0.0417F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(79, 85).addBox(-0.5103F, -2.0809F, 0.8508F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.1047F, 0.1047F, 0.0F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(95, 35).addBox(-0.3344F, -3.5233F, 0.8147F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.2966F, 0.0654F, 0.0027F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(111, 24).addBox(-0.9414F, -0.7213F, -3.6345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2252F, 2.7979F, -2.0286F, 0.3546F, 0.2891F, 0.0739F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0595F, -1.4089F, -2.8096F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2252F, 2.7979F, -2.0286F, 0.1839F, 0.2399F, 0.0552F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(51, 108).addBox(-1.0827F, -1.9395F, -2.0839F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.5305F, 0.1093F, -0.0716F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(122, 49).addBox(-1.1042F, -0.6687F, -3.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.3966F, 0.1109F, -0.0939F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(68, 112).addBox(-0.2127F, -3.314F, 4.4037F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.1364F, 0.0938F, 0.003F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 110).addBox(-0.2127F, -4.0113F, 3.4568F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.0207F, 0.0938F, 0.003F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(120, 8).addBox(0.1012F, 0.3405F, 4.9644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.2247F, 0.0737F, -0.0737F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(55, 118).addBox(0.1012F, -2.2227F, 5.0006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.0022F, 0.0737F, -0.0737F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(38, 118).addBox(-0.1236F, -0.1851F, -2.1501F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8054F, 3.4772F, -3.8168F, 0.2537F, 0.0655F, 0.035F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(108, 15).addBox(-0.2132F, 0.1447F, -2.1501F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2252F, 2.7979F, -2.0286F, 0.1833F, 0.1876F, 0.0524F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(36, 122).addBox(-0.8506F, -2.1141F, -2.1357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.6417F, 0.1131F, -0.0832F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(126, 61).addBox(-0.8506F, -2.276F, -2.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F))
				.texOffs(122, 21).addBox(-0.8506F, -2.276F, -2.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.7289F, 0.1131F, -0.0832F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(122, 18).addBox(-0.8466F, 1.6944F, 1.3662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, -2.2818F, 0.1131F, -0.0832F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(16, 122).addBox(-0.8506F, 1.042F, -2.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, -0.8244F, 0.1131F, -0.0832F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(120, 121).addBox(-0.8506F, -1.1185F, -2.6441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.0308F, 0.1131F, -0.0832F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(126, 58).addBox(0.1141F, -3.6618F, -3.1844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -1.7482F, 0.0194F, 0.0757F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(126, 55).addBox(0.0386F, 0.099F, -4.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -2.8829F, 0.0768F, 0.0144F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(126, 52).addBox(0.0386F, 2.2451F, -3.4954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 2.7458F, 0.0768F, 0.0144F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(10, 126).addBox(0.0386F, 3.1229F, -2.6076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 2.4404F, 0.0768F, 0.0144F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(110, 65).addBox(0.0386F, 3.147F, 2.168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.3495F, 0.0768F, 0.0144F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 101).addBox(0.0386F, 2.1813F, 2.8215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.175F, 0.0768F, 0.0144F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(110, 50).addBox(0.0386F, 2.9676F, 2.1974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.4804F, 0.0768F, 0.0144F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(121, 109).addBox(0.0386F, 4.2867F, -3.2254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 2.8767F, 0.0768F, 0.0144F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(121, 106).addBox(0.0386F, -1.8262F, -6.3411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -2.0975F, 0.0768F, 0.0144F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(121, 103).addBox(0.0386F, -6.2038F, -3.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(121, 100).addBox(0.0386F, -6.3039F, -3.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -1.1986F, 0.0768F, 0.0144F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(16, 116).addBox(0.0386F, -5.4272F, 4.1542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.0467F, 0.0768F, 0.0144F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(33, 110).addBox(0.0386F, 2.2461F, 3.5195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.1052F, 0.0768F, 0.0144F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(115, 0).addBox(0.0386F, -6.188F, 1.9778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.3783F, 0.0768F, 0.0144F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(121, 89).addBox(-0.2331F, 3.5235F, 1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 2.0382F, 0.1324F, 0.0254F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(87, 121).addBox(-0.2331F, 1.8369F, 3.206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.4971F, 0.1324F, 0.0254F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(126, 3).addBox(-0.1081F, -4.1038F, -2.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(82, 121).addBox(-0.2331F, -4.1038F, -2.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -1.0554F, 0.1324F, 0.0254F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(125, 124).addBox(-0.2348F, 2.288F, -3.5764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -2.8749F, 0.1324F, 0.0254F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(125, 121).addBox(-0.2348F, 3.2825F, -0.0403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 2.4919F, 0.1324F, 0.0254F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(125, 118).addBox(-0.2348F, 0.8834F, 2.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 1.4447F, 0.1324F, 0.0254F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(125, 95).addBox(-0.2348F, -1.6453F, 2.427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.5721F, 0.1324F, 0.0254F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(91, 125).addBox(-0.2348F, -3.4698F, 0.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -0.4315F, 0.1324F, 0.0254F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(31, 121).addBox(-0.2348F, -3.1052F, -2.6709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -1.5659F, 0.1324F, 0.0254F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(112, 71).addBox(-0.2348F, 2.1189F, -3.444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -3.1106F, 0.1324F, 0.0254F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(26, 121).addBox(-0.2348F, -1.9131F, -3.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, -2.0459F, 0.1324F, 0.0254F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(5, 121).addBox(-0.2331F, 2.8236F, -2.9883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 3.0243F, 0.1324F, 0.0254F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(94, 60).addBox(-0.4342F, -2.7646F, 1.8654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.4193F, 0.1268F, 0.0255F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(44, 107).addBox(-0.4342F, 0.5345F, 2.3983F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.812F, 0.1268F, 0.0255F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 121).addBox(-0.4594F, -0.5F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1162F, 5.3888F, -7.2396F, 0.6854F, 0.1831F, 0.2335F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(102, 41).addBox(-0.3802F, -2.1963F, 3.9726F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0252F, 4.3979F, -3.4286F, 0.6039F, 0.0719F, 0.0495F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(120, 118).addBox(-0.459F, -0.5F, -0.832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.1162F, 5.3888F, -7.2396F, 0.7306F, 0.3691F, 0.3984F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(72, 101).addBox(-1.1933F, -1.7479F, -3.2766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.8701F, -0.0781F, -0.2147F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.8F, -0.7735F, -2.7839F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(56, 125).mirror().addBox(-0.8221F, -6.7438F, -4.769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(92, 122).mirror().addBox(-0.8221F, -6.7438F, -5.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -1.699F, -0.1096F, 0.0253F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(63, 122).mirror().addBox(-0.8748F, -8.5059F, -1.6325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -1.1322F, -0.107F, 0.0348F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(24, 102).mirror().addBox(0.0258F, -2.1082F, -2.5667F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2252F, 2.7979F, -2.0286F, 0.3645F, -0.2614F, -0.032F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(125, 85).mirror().addBox(-0.0584F, 2.6516F, 1.8951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, -1.8368F, -0.1154F, -0.0011F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(61, 125).mirror().addBox(0.3111F, 1.8982F, -2.8902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, -0.5802F, -0.0441F, 0.109F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(120, 12).mirror().addBox(0.1368F, 0.5311F, -2.3748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, -0.8034F, -0.0941F, 0.0637F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(58, 122).mirror().addBox(0.1274F, -2.1018F, -1.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.4632F, -0.1067F, 0.0515F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(53, 122).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.096F, 5.9258F, -7.9157F, 0.9486F, -0.6904F, -0.7729F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(111, 40).mirror().addBox(1.9433F, -1.9256F, 1.0177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(111, 28).mirror().addBox(1.5433F, -1.9256F, 1.5177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.0378F, -0.5466F, -0.704F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-1.6614F, -3.3552F, 2.0304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.373F, 0.0924F, 0.0081F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(69, 106).mirror().addBox(-0.8404F, -6.2827F, 3.3456F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.2458F, -0.1023F, 0.0417F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(-0.4897F, -2.0809F, 0.8508F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.1047F, -0.1047F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(95, 35).mirror().addBox(-0.6656F, -3.5233F, 0.8147F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.2966F, -0.0654F, -0.0027F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(111, 24).mirror().addBox(-0.0587F, -0.7213F, -3.6345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2252F, 2.7979F, -2.0286F, 0.3546F, -0.2891F, -0.0739F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0595F, -1.4089F, -2.8096F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.2252F, 2.7979F, -2.0286F, 0.1839F, -0.2399F, -0.0552F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(51, 108).mirror().addBox(0.0827F, -1.9395F, -2.0839F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.5305F, -0.1093F, 0.0716F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(122, 49).mirror().addBox(0.1042F, -0.6687F, -3.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.3966F, -0.1109F, 0.0939F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(68, 112).mirror().addBox(-0.7873F, -3.314F, 4.4037F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.1364F, -0.0938F, -0.003F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.7873F, -4.0113F, 3.4568F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.0207F, -0.0938F, -0.003F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(120, 8).mirror().addBox(-1.1012F, 0.3405F, 4.9644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.2247F, -0.0737F, 0.0737F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(55, 118).mirror().addBox(-1.1012F, -2.2227F, 5.0006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.0022F, -0.0737F, 0.0737F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(38, 118).mirror().addBox(0.1236F, -0.1851F, -2.1501F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8054F, 3.4772F, -3.8168F, 0.2537F, -0.0655F, -0.035F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(108, 15).mirror().addBox(0.2132F, 0.1447F, -2.1501F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2252F, 2.7979F, -2.0286F, 0.1833F, -0.1876F, -0.0524F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(36, 122).mirror().addBox(-0.1494F, -2.1141F, -2.1357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.6417F, -0.1131F, 0.0832F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(126, 61).mirror().addBox(-0.1494F, -2.276F, -2.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(122, 21).mirror().addBox(-0.1494F, -2.276F, -2.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.7289F, -0.1131F, 0.0832F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(122, 18).mirror().addBox(-0.1534F, 1.6944F, 1.3662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, -2.2818F, -0.1131F, 0.0832F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(16, 122).mirror().addBox(-0.1494F, 1.042F, -2.4966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, -0.8244F, -0.1131F, 0.0832F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(120, 121).mirror().addBox(-0.1494F, -1.1185F, -2.6441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.0308F, -0.1131F, 0.0832F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(126, 58).mirror().addBox(-1.1141F, -3.6618F, -3.1844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -1.7482F, -0.0194F, -0.0757F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(126, 55).mirror().addBox(-1.0386F, 0.099F, -4.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -2.8829F, -0.0768F, -0.0144F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-1.0386F, 2.2451F, -3.4954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 2.7458F, -0.0768F, -0.0144F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(10, 126).mirror().addBox(-1.0386F, 3.1229F, -2.6076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 2.4404F, -0.0768F, -0.0144F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(110, 65).mirror().addBox(-1.0386F, 3.147F, 2.168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.3495F, -0.0768F, -0.0144F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(81, 101).mirror().addBox(-1.0386F, 2.1813F, 2.8215F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.175F, -0.0768F, -0.0144F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(110, 50).mirror().addBox(-1.0386F, 2.9676F, 2.1974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.4804F, -0.0768F, -0.0144F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(121, 109).mirror().addBox(-1.0386F, 4.2867F, -3.2254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 2.8767F, -0.0768F, -0.0144F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(121, 106).mirror().addBox(-1.0386F, -1.8262F, -6.3411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -2.0975F, -0.0768F, -0.0144F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(121, 103).mirror().addBox(-1.0386F, -6.2038F, -3.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(121, 100).mirror().addBox(-1.0386F, -6.3039F, -3.2043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -1.1986F, -0.0768F, -0.0144F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(16, 116).mirror().addBox(-1.0386F, -5.4272F, 4.1542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.0467F, -0.0768F, -0.0144F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(33, 110).mirror().addBox(-1.0386F, 2.2461F, 3.5195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.1052F, -0.0768F, -0.0144F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-1.0386F, -6.188F, 1.9778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.3783F, -0.0768F, -0.0144F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(121, 89).mirror().addBox(-0.7669F, 3.5235F, 1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 2.0382F, -0.1324F, -0.0254F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(87, 121).mirror().addBox(-0.7669F, 1.8369F, 3.206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.4971F, -0.1324F, -0.0254F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(126, 3).mirror().addBox(-0.8919F, -4.1038F, -2.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(82, 121).mirror().addBox(-0.7669F, -4.1038F, -2.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -1.0554F, -0.1324F, -0.0254F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(125, 124).mirror().addBox(-0.7652F, 2.288F, -3.5764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -2.8749F, -0.1324F, -0.0254F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(125, 121).mirror().addBox(-0.7652F, 3.2825F, -0.0403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 2.4919F, -0.1324F, -0.0254F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(125, 118).mirror().addBox(-0.7652F, 0.8834F, 2.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 1.4447F, -0.1324F, -0.0254F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(125, 95).mirror().addBox(-0.7652F, -1.6453F, 2.427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.5721F, -0.1324F, -0.0254F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(91, 125).mirror().addBox(-0.7652F, -3.4698F, 0.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -0.4315F, -0.1324F, -0.0254F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(31, 121).mirror().addBox(-0.7652F, -3.1052F, -2.6709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -1.5659F, -0.1324F, -0.0254F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(112, 71).mirror().addBox(-0.7652F, 2.1189F, -3.444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -3.1106F, -0.1324F, -0.0254F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(26, 121).mirror().addBox(-0.7652F, -1.9131F, -3.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, -2.0459F, -0.1324F, -0.0254F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(5, 121).mirror().addBox(-0.7669F, 2.8236F, -2.9883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 3.0243F, -0.1324F, -0.0254F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.5658F, -2.7646F, 1.8654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.4193F, -0.1268F, -0.0255F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(44, 107).mirror().addBox(-0.5658F, 0.5345F, 2.3983F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.812F, -0.1268F, -0.0255F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-0.5406F, -0.5F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.1162F, 5.3888F, -7.2396F, 0.6854F, -0.1831F, -0.2335F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(102, 41).mirror().addBox(-0.6198F, -2.1963F, 3.9726F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3979F, -3.4286F, 0.6039F, -0.0719F, -0.0495F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(120, 118).mirror().addBox(-0.541F, -0.5F, -0.832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.1162F, 5.3888F, -7.2396F, 0.7306F, -0.3691F, -0.3984F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(72, 101).mirror().addBox(0.1933F, -1.7479F, -3.2766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.8701F, 0.0781F, 0.2147F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2149F, -0.8626F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(126, 78).mirror().addBox(-0.5F, 0.5285F, -0.1756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(68, 124).mirror().addBox(-0.5F, -0.1715F, -0.1756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(126, 78).addBox(0.2F, 0.5285F, -0.1756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(68, 124).addBox(0.2F, -0.1715F, -0.1756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.35F, 1.0242F, -7.9582F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(126, 67).mirror().addBox(-0.5452F, 0.3033F, -0.1568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(115, 124).mirror().addBox(-0.5452F, 0.3033F, 0.1682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.0521F, -0.0594F, 0.8029F, -0.2182F, 0.0349F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(15, 125).mirror().addBox(-0.5F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(73, 124).mirror().addBox(-0.75F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(15, 125).addBox(-0.3F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 124).addBox(-0.05F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.1F, 2.6873F, -8.0887F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(19, 112).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8109F, -0.6986F, -2.8515F, 0.367F, -0.0865F, -0.0114F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(125, 11).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.4566F, 1.0442F, -6.779F, 0.2532F, -0.0872F, -0.0038F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(12, 112).mirror().addBox(-0.3709F, -0.4078F, -2.0238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.7948F, 0.329F, -4.4241F, 0.2532F, -0.0872F, -0.0038F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(102, 25).mirror().addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.0655F, -1.2638F, -1.4539F, -1.6832F, -0.218F, -0.0097F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(125, 8).mirror().addBox(-0.0581F, -4.0417F, 0.0811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8448F, -0.171F, -4.3741F, -0.9414F, -0.218F, -0.0097F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-0.5F, -0.6F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.2785F, 0.1255F, -0.4313F, -0.8542F, -0.218F, -0.0097F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-0.0581F, -4.1486F, -0.5426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.8448F, -0.171F, -4.3741F, -1.2905F, -0.218F, -0.0097F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(58, 108).mirror().addBox(-0.5F, -1.175F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0718F, 0.2848F, -1.3575F, 0.193F, -0.218F, -0.0097F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(112, 4).mirror().addBox(-0.5F, -0.625F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2556F, 0.6003F, -0.7266F, 0.0F, -0.2182F, 0.0349F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(120, 124).mirror().addBox(-0.4476F, -1.6066F, -2.7081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6635F, 0.1521F, 0.9406F, 0.0175F, -0.2182F, 0.0349F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(124, 115).mirror().addBox(-0.5F, -0.45F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.624F, 0.4567F, 0.5058F, 0.192F, -0.2182F, 0.0349F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(124, 112).mirror().addBox(-0.5452F, 0.5974F, 0.2081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4385F, 0.0521F, -0.0594F, 1.2392F, -0.2182F, 0.0349F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(-0.2715F, -0.6517F, -2.5045F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7948F, 0.154F, -4.7241F, 0.2976F, -0.0847F, -0.0212F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(60, 118).mirror().addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2785F, -0.6086F, -2.4528F, 0.1665F, -0.0859F, -0.0152F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(83, 124).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4136F, 1.8707F, -7.3378F, 1.0221F, -0.0832F, -0.0263F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-0.5F, -0.475F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4333F, 1.1943F, -7.1977F, -0.122F, -0.0872F, -0.0038F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(124, 75).mirror().addBox(-0.5F, -0.525F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.487F, 1.6989F, -6.4279F, 0.3492F, -0.0872F, -0.0038F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(109, 111).mirror().addBox(-0.3709F, 0.2521F, -1.3267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7948F, 0.329F, -4.4241F, 0.2271F, -0.0872F, -0.0038F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(102, 111).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, 2.0046F, -6.9681F, 0.4147F, -0.0872F, -0.0038F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(124, 72).mirror().addBox(-0.5F, -0.8277F, -0.467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(124, 72).addBox(0.2F, -0.8277F, -0.467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 1.3033F, -7.8483F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(124, 64).mirror().addBox(-0.5F, -0.55F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(124, 64).addBox(0.2F, -0.55F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.35F, 1.8699F, -8.5037F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(46, 124).mirror().addBox(-0.5F, -0.85F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(46, 124).addBox(0.2F, -0.85F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.35F, 2.3533F, -8.6472F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(41, 124).mirror().addBox(-0.5F, -0.325F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(41, 124).addBox(0.25F, -0.325F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.375F, 2.2024F, -8.1474F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(95, 111).mirror().addBox(-0.5F, -0.425F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.8164F, 0.6665F, -2.6799F, 0.1922F, -0.0872F, -0.0038F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(31, 124).mirror().addBox(-0.5F, -0.85F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8146F, 0.1196F, -2.7242F, 0.1485F, -0.0872F, -0.0038F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(19, 112).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8109F, -0.6986F, -2.8515F, 0.367F, 0.0865F, 0.0114F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(125, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.4566F, 1.0442F, -6.779F, 0.2532F, 0.0872F, 0.0038F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(12, 112).addBox(-0.6291F, -0.4078F, -2.0238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.7948F, 0.329F, -4.4241F, 0.2532F, 0.0872F, 0.0038F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(102, 25).addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.0655F, -1.2638F, -1.4539F, -1.6832F, 0.218F, 0.0097F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(125, 8).addBox(-0.9419F, -4.0417F, 0.0811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8448F, -0.171F, -4.3741F, -0.9414F, 0.218F, 0.0097F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(125, 0).addBox(-0.5F, -0.6F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.2785F, 0.1255F, -0.4313F, -0.8542F, 0.218F, 0.0097F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(5, 112).addBox(-0.9419F, -4.1486F, -0.5426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.8448F, -0.171F, -4.3741F, -1.2905F, 0.218F, 0.0097F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(58, 108).addBox(-0.5F, -1.175F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0718F, 0.2848F, -1.3575F, 0.193F, 0.218F, 0.0097F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(112, 4).addBox(-0.5F, -0.625F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.2556F, 0.6003F, -0.7266F, 0.0F, 0.2182F, -0.0349F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(120, 124).addBox(-0.5524F, -1.6066F, -2.7081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6635F, 0.1521F, 0.9406F, 0.0175F, 0.2182F, -0.0349F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(124, 115).addBox(-0.5F, -0.45F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.624F, 0.4567F, 0.5058F, 0.192F, 0.2182F, -0.0349F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(126, 67).addBox(-0.4548F, 0.3033F, -0.1568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(115, 124).addBox(-0.4548F, 0.3033F, 0.1682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4385F, 0.0521F, -0.0594F, 0.8029F, 0.2182F, -0.0349F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(124, 112).addBox(-0.4548F, 0.5974F, 0.2081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4385F, 0.0521F, -0.0594F, 1.2392F, 0.2182F, -0.0349F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(74, 95).addBox(0.2715F, -0.6517F, -2.5045F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7948F, 0.154F, -4.7241F, 0.2976F, 0.0847F, 0.0212F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(60, 118).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2785F, -0.6086F, -2.4528F, 0.1665F, 0.0859F, 0.0152F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(83, 124).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4136F, 1.8707F, -7.3378F, 1.0221F, 0.0832F, 0.0263F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(78, 124).addBox(-0.5F, -0.475F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4333F, 1.1943F, -7.1977F, -0.122F, 0.0872F, 0.0038F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(124, 75).addBox(-0.5F, -0.525F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.487F, 1.6989F, -6.4279F, 0.3492F, 0.0872F, 0.0038F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(109, 111).addBox(-0.6291F, 0.2521F, -1.3267F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7948F, 0.329F, -4.4241F, 0.2271F, 0.0872F, 0.0038F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(102, 111).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5002F, 2.0046F, -6.9681F, 0.4147F, 0.0872F, 0.0038F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(95, 111).addBox(-0.5F, -0.425F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.8164F, 0.6665F, -2.6799F, 0.1922F, 0.0872F, 0.0038F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(31, 124).addBox(-0.5F, -0.85F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8146F, 0.1196F, -2.7242F, 0.1485F, 0.0872F, 0.0038F));

		PartDefinition leftArm = chest2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0821F, 10.7836F, 1.1726F, 0.5164F, -0.0048F, -0.3447F));

		PartDefinition cube_r453 = leftArm.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(5, 107).addBox(0.0F, -0.3F, 0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4737F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r454 = leftArm.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(119, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 6.9715F, 3.2213F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r455 = leftArm.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(97, 115).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 6.1105F, 1.7554F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r456 = leftArm.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(115, 85).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 6.1105F, 1.7554F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r457 = leftArm.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(60, 113).addBox(0.0419F, -16.3734F, -7.1026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8639F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r458 = leftArm.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(87, 117).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r459 = leftArm.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(116, 106).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2719F, 1.6484F, -0.1544F, -0.1036F, -0.4743F, -0.0768F));

		PartDefinition cube_r460 = leftArm.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(55, 113).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4927F, -0.7657F, -0.944F, 0.1582F, -0.4743F, -0.0768F));

		PartDefinition cube_r461 = leftArm.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(89, 112).addBox(-0.2622F, -0.0365F, 0.4192F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6167F, 3.2178F, -1.1102F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r462 = leftArm.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(50, 113).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(14, 97).addBox(-0.5909F, 1.8921F, -0.1717F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(85, 91).addBox(-0.5909F, 1.8921F, -1.6717F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2206F, 8.7967F, 4.4421F, -0.6564F, 0.5468F, -0.0034F));

		PartDefinition cube_r463 = leftArm2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(21, 116).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0909F, 1.923F, 1.2822F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r464 = leftArm2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(120, 85).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.0909F, 2.3921F, 0.3283F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r465 = leftArm2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(43, 116).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 126).addBox(-0.5F, -1.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0909F, 2.8921F, 0.3283F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(83, 68).addBox(-0.508F, -0.0675F, -1.075F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0586F, 9.8111F, -0.8535F, 0.2646F, 0.265F, 0.467F));

		PartDefinition cube_r466 = leftArm3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(33, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.008F, 2.0189F, -3.7478F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r467 = leftArm3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(101, 20).addBox(-0.5F, -0.2301F, -3.7608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.008F, -0.0193F, -0.4948F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r468 = leftArm3.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(104, 35).addBox(12.0544F, -2.3239F, -11.9897F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0365F, 0.2495F, 1.7355F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r469 = opposablePinkie.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(73, 113).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0945F, 1.4152F, -0.0127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm = chest2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0821F, 10.7836F, 1.1726F, 0.7793F, -0.1298F, 0.0329F));

		PartDefinition cube_r470 = rightArm.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(108, 85).addBox(-1.0F, -0.3F, 0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4737F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r471 = rightArm.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(77, 120).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(48, 120).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 6.9715F, 3.2213F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r472 = rightArm.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(0, 116).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 6.1105F, 1.7554F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightArm.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(112, 115).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 6.1105F, 1.7554F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r474 = rightArm.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(107, 115).addBox(-1.0419F, -16.3734F, -7.1026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8639F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r475 = rightArm.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(43, 120).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r476 = rightArm.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(116, 110).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2719F, 1.6484F, -0.1544F, -0.1036F, 0.4743F, 0.0768F));

		PartDefinition cube_r477 = rightArm.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(102, 115).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4927F, -0.7657F, -0.944F, 0.1582F, 0.4743F, 0.0768F));

		PartDefinition cube_r478 = rightArm.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(113, 32).addBox(-0.7378F, -0.0365F, 0.4192F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6167F, 3.2178F, -1.1102F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r479 = rightArm.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(115, 97).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(19, 97).addBox(-0.4091F, 1.8921F, -0.1717F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(9, 97).addBox(-0.4091F, 1.8921F, -1.6717F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2206F, 8.7967F, 4.4421F, -0.2695F, -0.2408F, -0.0074F));

		PartDefinition cube_r480 = rightArm2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(116, 102).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0909F, 1.923F, 1.2822F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r481 = rightArm2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(120, 96).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0909F, 2.3921F, 0.3283F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r482 = rightArm2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(116, 90).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 98).addBox(-0.5F, -1.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0909F, 2.8921F, 0.3283F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(84, 29).addBox(-0.492F, -0.0675F, -1.075F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0586F, 9.8111F, -0.8535F, 0.0113F, -0.3165F, -0.1985F));

		PartDefinition cube_r483 = rightArm3.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(51, 103).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.008F, 2.0189F, -3.7478F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightArm3.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(42, 102).addBox(-0.5F, -0.2301F, -3.7608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.008F, -0.0193F, -0.4948F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightArm3.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(105, 55).addBox(-13.0544F, -2.3239F, -11.9897F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie3 = rightArm3.addOrReplaceChild("opposablePinkie3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0365F, 0.2495F, 1.7355F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r486 = opposablePinkie3.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0945F, 1.4152F, -0.0127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.8209F, 0.0402F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1211F, 6.7085F, -0.2322F, 0.2125F, -0.0498F));

		PartDefinition cube_r487 = tail.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(27, 29).mirror().addBox(-3.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1791F, 1.0402F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r488 = tail.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(27, 29).addBox(0.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1791F, 1.0402F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r489 = tail.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(65, 108).addBox(0.0F, -0.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9636F, 9.4212F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(86, 106).addBox(0.0F, -0.5F, -0.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2855F, 7.2495F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(29, 114).addBox(0.0F, -0.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9511F, 4.939F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r492 = tail.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(65, 116).addBox(0.0F, -1.7F, -0.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1625F, 3.0385F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(10, 116).addBox(0.0F, -4.3635F, 0.001F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 9.1435F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r494 = tail.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(26, 114).addBox(0.0F, -4.5382F, 0.0324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7789F, 7.0783F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r495 = tail.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(113, 90).addBox(0.0F, -4.8382F, -0.0676F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6678F, 5.1167F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(13, 116).addBox(0.0F, -4.8382F, 0.0324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7924F, 2.9991F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(26, 75).addBox(0.0F, -4.9382F, 0.0324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, 0.9395F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 10).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2246F, 10.9433F, -0.0527F, -0.0022F, -0.0045F));

		PartDefinition cube_r498 = tail2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r499 = tail2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r500 = tail2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(20, 125).addBox(0.0F, -2.9892F, -0.094F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 8.0557F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(117, 118).addBox(0.0F, -3.3238F, 0.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 6.0557F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(74, 118).addBox(0.0F, -3.6228F, -0.0149F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5383F, 4.0113F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r503 = tail2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(71, 118).addBox(0.0F, -3.8228F, -0.0148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5834F, 1.987F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r504 = tail2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(84, 114).addBox(0.0F, -4.1228F, -0.0148F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r505 = tail2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(68, 118).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7281F, 7.0841F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(35, 114).addBox(0.0F, -0.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.973F, 4.5183F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(32, 114).addBox(0.0F, -0.3F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9659F, 1.957F, 0.7592F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(48, 39).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 8.7567F, 0.0263F, -0.0872F, -0.0023F));

		PartDefinition cube_r508 = tail3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 1.0F, 0.0055F, 0.052F, -0.002F));

		PartDefinition cube_r509 = tail3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(17, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 1.0F, 0.0055F, -0.052F, 0.002F));

		PartDefinition cube_r510 = tail3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(110, 126).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7227F, 6.9302F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r511 = tail3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(125, 39).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9093F, 4.6553F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r512 = tail3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(36, 125).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7624F, 2.1596F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(107, 126).addBox(0.0F, -2.0F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.608F, 7.0667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r514 = tail3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(125, 34).addBox(0.0F, -2.6707F, 0.0528F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2428F, 4.8337F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r515 = tail3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(125, 29).addBox(0.0F, -2.7707F, -0.1472F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(125, 24).addBox(0.0F, -2.8819F, -0.3259F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 50).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0144F, 7.985F, 0.1506F, -0.1726F, -0.0261F));

		PartDefinition cube_r517 = tail4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(6, 127).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 7.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(29, 127).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(3, 127).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 3.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail4.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(0, 127).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail4.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(39, 127).addBox(0.0F, 1.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 127).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9408F, 5.7591F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail4.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(127, 18).addBox(0.0F, 0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 14).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4807F, 1.3197F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(48, 49).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F))
				.texOffs(45, 127).addBox(0.0F, -1.05F, 4.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0165F, 7.9934F, 0.0613F, -0.0871F, -0.0053F));

		PartDefinition cube_r523 = tail5.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(126, 109).addBox(0.0F, -0.725F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail5.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(69, 103).addBox(0.0F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail5.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(101, 71).addBox(0.0F, 14.9F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 55).addBox(0.0F, 13.9F, 24.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 74).addBox(0.0F, 12.7F, 22.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -24.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0062F, 7.9295F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0125F, 5.9135F, -0.0704F, -0.1306F, 0.0092F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(52, 10).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0274F, 7.9174F, -0.124F, -0.1732F, 0.0215F));

		return LayerDefinition.create(meshdefinition, 133, 133);
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