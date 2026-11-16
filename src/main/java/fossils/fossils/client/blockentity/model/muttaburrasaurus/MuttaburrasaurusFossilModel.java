package fossils.fossils.client.blockentity.model.muttaburrasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MuttaburrasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
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
	private final ModelPart bone5;
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
	private final ModelPart opposablePinkie2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public MuttaburrasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
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
		this.bone5 = this.chest2.getChild("bone5");
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
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.6088F, 5.4168F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-4.0F, 1.0F, 0.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 16).addBox(1.0F, 1.0F, 0.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 116).addBox(-0.004F, -3.2382F, -0.9676F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9995F, 7.071F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 120).addBox(0.004F, 0.9F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -8.6637F, -3.451F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 10).addBox(0.008F, -1.5F, -3.5F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(69, 39).addBox(0.0F, -1.5F, -3.5F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -5.9682F, -0.1823F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 86).addBox(0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.2501F, 2.4953F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.7508F, -1.1884F, 4.1703F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(103, 29).addBox(-0.5F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5381F, 1.9258F, -1.4913F, -1.4151F, -0.2209F, 0.2376F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(87, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0324F, 2.1149F, -6.9242F, -0.0873F, -0.3229F, 0.0F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 93).addBox(-0.5F, -1.925F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3366F, -1.5463F, -5.2556F, -0.2124F, -0.1213F, 0.0493F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 93).addBox(-0.5F, -1.425F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3366F, -1.5463F, -5.2556F, -0.7797F, -0.1213F, 0.0493F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 113).addBox(-1.2066F, -0.2019F, -2.9766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.2866F, -0.1293F, 0.0206F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(113, 41).addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1027F, -2.1362F, -6.2026F, -0.2544F, -0.1293F, 0.0206F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 54).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1041F, -2.7064F, -7.7031F, 0.2256F, -0.1293F, 0.0206F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(101, 54).addBox(-1.2066F, -0.0395F, -1.0895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.0947F, -0.1293F, 0.0206F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 87).addBox(0.4594F, -0.8366F, -2.8285F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.4915F, 0.1795F, 0.1841F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 103).addBox(-0.2526F, -0.8366F, -3.3438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(46, 101).addBox(-0.2526F, -0.8366F, -2.3438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.4837F, -0.0521F, 0.0615F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(85, 101).addBox(-1.2066F, -0.8366F, -2.4142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(126, 110).addBox(-1.2066F, -0.8366F, -3.3142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.4874F, -0.1293F, 0.0206F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 69).addBox(-1.1976F, -0.9824F, 0.3324F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.2087F, -0.1304F, 0.0115F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 93).addBox(-1.4205F, -1.2791F, 1.7892F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.8618F, -2.8118F, -8.0323F, 0.0813F, -0.0882F, 0.0849F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(94, 102).addBox(0.1409F, -1.0638F, -0.3537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.255F, -1.0132F, 1.0071F, -0.0152F, 0.0806F, 0.0987F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(99, 0).addBox(0.7889F, -1.0638F, -0.4832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.255F, -1.0132F, 1.0071F, -0.0152F, -0.0939F, 0.1013F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(102, 82).addBox(-0.6207F, -1.0638F, -0.2303F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.255F, -1.0132F, 1.0071F, -0.0155F, 0.2115F, 0.0966F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 112).addBox(0.23F, -0.4987F, 0.3666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0813F, -2.4844F, -1.1583F, -0.4325F, -0.0143F, 0.1693F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 73).addBox(-1.8333F, -0.6123F, -1.4259F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0813F, -2.4844F, -1.1583F, -0.6946F, 0.0603F, 0.1163F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(84, 52).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8692F, -3.9017F, -1.8405F, -0.171F, 0.0603F, 0.1163F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 106).addBox(-1.8367F, -0.4726F, 0.2146F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0813F, -2.4844F, -1.1583F, -0.4351F, 0.2094F, 0.0254F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(120, 45).addBox(-2.5368F, -2.6231F, 7.1453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(114, 72).addBox(-2.5368F, -2.6231F, 5.5453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4167F, 5.7929F, 0.4821F, -1.2805F, -0.0666F, -0.0068F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(126, 107).addBox(-2.5368F, 5.3716F, 4.8941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4167F, 5.7929F, 0.4821F, -0.146F, -0.0666F, -0.0068F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(113, 45).addBox(-2.5368F, -1.4061F, 5.8497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4167F, 5.7929F, 0.4821F, -1.0623F, -0.0666F, -0.0068F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 64).addBox(-1.2572F, -0.4687F, 3.7993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4167F, 5.7929F, 0.4821F, -0.9586F, -0.0923F, 0.2141F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(11, 87).addBox(-0.9938F, -0.1856F, -0.0508F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4167F, 5.7929F, 0.4821F, -0.8977F, -0.1211F, 0.2719F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 109).addBox(-0.5F, -2.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9818F, 4.0884F, -2.0758F, -0.7043F, -0.201F, 0.2481F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(47, 114).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4194F, 5.1287F, -1.2474F, -0.9225F, -0.201F, 0.2481F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(61, 113).addBox(-0.5F, -0.475F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0963F, 4.0823F, -1.5235F, -0.8352F, -0.201F, 0.2481F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 77).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3343F, 3.9859F, -0.2746F, -1.2716F, -0.201F, 0.2481F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -1.125F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0963F, 4.0823F, -1.5235F, -1.0534F, -0.201F, 0.2481F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 86).addBox(-0.5F, -1.8F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2508F, 3.3489F, -4.1049F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(104, 39).addBox(-0.5755F, -0.0836F, -1.7643F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1532F, 2.4132F, -5.5614F, -0.4891F, -0.2893F, 0.0707F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 72).addBox(-0.5F, -0.5F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.368F, 5.278F, -2.4343F, -0.681F, -0.2893F, 0.0707F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(74, 63).addBox(-0.5755F, -0.7026F, -0.4015F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1532F, 2.4132F, -5.5614F, -0.777F, -0.2893F, 0.0707F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 43).addBox(-0.8837F, -1.3388F, 5.9513F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1532F, 2.4132F, -5.5614F, -0.8706F, -0.2567F, -0.0141F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 59).addBox(-0.9571F, -1.109F, 3.9648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1532F, 2.4132F, -5.5614F, -0.8244F, -0.2718F, -0.0458F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(120, 68).addBox(-0.5F, -0.7F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2068F, 2.2752F, -10.4549F, -0.8988F, -0.3229F, 0.0F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(27, 101).addBox(-0.5F, 0.175F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7518F, 1.3827F, -9.095F, 0.0175F, -0.3229F, 0.0F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 71).addBox(-0.7088F, -0.3552F, -4.9585F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1613F, 1.5828F, -5.6873F, 0.1484F, -0.3229F, 0.0F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 99).addBox(-0.7088F, -0.8165F, -1.4999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1613F, 1.5828F, -5.6873F, 0.4625F, -0.3229F, 0.0F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 60).addBox(4.0F, -1.0054F, -4.4615F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2143F, -0.1655F, 1.0004F, 0.2831F, 0.204F, -0.0478F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(58, 93).addBox(-0.5F, -1.45F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.013F, -0.6338F, 0.011F, 0.1086F, 0.204F, -0.0478F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.7508F, -1.1884F, 4.1703F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-0.5F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5381F, 1.9258F, -1.4913F, -1.4151F, 0.2209F, -0.2376F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0324F, 2.1149F, -6.9242F, -0.0873F, 0.3229F, 0.0F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(9, 93).mirror().addBox(-0.5F, -1.925F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3366F, -1.5463F, -5.2556F, -0.2124F, 0.1213F, -0.0493F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 93).mirror().addBox(-0.5F, -1.425F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3366F, -1.5463F, -5.2556F, -0.7797F, 0.1213F, -0.0493F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(88, 113).mirror().addBox(0.2066F, -0.2019F, -2.9766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.2866F, 0.1293F, -0.0206F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(113, 41).mirror().addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1027F, -2.1362F, -6.2026F, -0.2544F, 0.1293F, -0.0206F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(101, 54).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1041F, -2.7064F, -7.7031F, 0.2256F, 0.1293F, -0.0206F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(101, 54).mirror().addBox(0.2066F, -0.0395F, -1.0895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.0947F, 0.1293F, -0.0206F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.4594F, -0.8366F, -2.8285F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.4915F, -0.1795F, -0.1841F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 103).mirror().addBox(-0.7474F, -0.8366F, -3.3438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(46, 101).mirror().addBox(-0.7474F, -0.8366F, -2.3438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.4837F, 0.0521F, -0.0615F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(85, 101).mirror().addBox(0.2066F, -0.8366F, -2.4142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(126, 110).mirror().addBox(0.2066F, -0.8366F, -3.3142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.4874F, 0.1293F, -0.0206F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(93, 69).mirror().addBox(-1.8024F, -0.9824F, 0.3324F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.2087F, 0.1304F, -0.0115F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(67, 93).mirror().addBox(-1.5795F, -1.2791F, 1.7892F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, -2.8118F, -8.0323F, 0.0813F, 0.0882F, -0.0849F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 102).mirror().addBox(-1.1409F, -1.0638F, -0.3537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -1.0132F, 1.0071F, -0.0152F, -0.0806F, -0.0987F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-1.7889F, -1.0638F, -0.4832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -1.0132F, 1.0071F, -0.0152F, 0.0939F, -0.1013F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.3793F, -1.0638F, -0.2303F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.255F, -1.0132F, 1.0071F, -0.0155F, -0.2115F, -0.0966F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-1.23F, -0.4987F, 0.3666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0813F, -2.4844F, -1.1583F, -0.4325F, 0.0143F, -0.1693F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-1.1667F, -0.6123F, -1.4259F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0813F, -2.4844F, -1.1583F, -0.6946F, -0.0603F, -0.1163F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8692F, -3.9017F, -1.8405F, -0.171F, -0.0603F, -0.1163F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.1633F, -0.4726F, 0.2146F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0813F, -2.4844F, -1.1583F, -0.4351F, -0.2094F, -0.0254F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(120, 45).mirror().addBox(1.5368F, -2.6231F, 7.1453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(114, 72).mirror().addBox(1.5368F, -2.6231F, 5.5453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4167F, 5.7929F, 0.4821F, -1.2805F, 0.0666F, 0.0068F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(126, 107).mirror().addBox(1.5368F, 5.3716F, 4.8941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4167F, 5.7929F, 0.4821F, -0.146F, 0.0666F, 0.0068F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(113, 45).mirror().addBox(1.5368F, -1.4061F, 5.8497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4167F, 5.7929F, 0.4821F, -1.0623F, 0.0666F, 0.0068F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(98, 64).mirror().addBox(0.2572F, -0.4687F, 3.7993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4167F, 5.7929F, 0.4821F, -0.9586F, 0.0923F, -0.2141F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(11, 87).mirror().addBox(-0.0062F, -0.1856F, -0.0508F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4167F, 5.7929F, 0.4821F, -0.8977F, 0.1211F, -0.2719F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(74, 109).mirror().addBox(-0.5F, -2.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9818F, 4.0884F, -2.0758F, -0.7043F, 0.201F, -0.2481F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 114).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4194F, 5.1287F, -1.2474F, -0.9225F, 0.201F, -0.2481F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(61, 113).mirror().addBox(-0.5F, -0.475F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0963F, 4.0823F, -1.5235F, -0.8352F, 0.201F, -0.2481F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(98, 77).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3343F, 3.9859F, -0.2746F, -1.2716F, 0.201F, -0.2481F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -1.125F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0963F, 4.0823F, -1.5235F, -1.0534F, 0.201F, -0.2481F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(69, 86).mirror().addBox(-0.5F, -1.8F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2508F, 3.3489F, -4.1049F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(104, 39).mirror().addBox(-0.4245F, -0.0836F, -1.7643F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1532F, 2.4132F, -5.5614F, -0.4891F, 0.2893F, -0.0707F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-0.5F, -0.5F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.368F, 5.278F, -2.4343F, -0.681F, 0.2893F, -0.0707F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(74, 63).mirror().addBox(-0.4245F, -0.7026F, -0.4015F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1532F, 2.4132F, -5.5614F, -0.777F, 0.2893F, -0.0707F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.1163F, -1.3388F, 5.9513F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1532F, 2.4132F, -5.5614F, -0.8706F, 0.2567F, 0.0141F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(-0.0429F, -1.109F, 3.9648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1532F, 2.4132F, -5.5614F, -0.8244F, 0.2718F, 0.0458F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(120, 68).mirror().addBox(-0.5F, -0.7F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2068F, 2.2752F, -10.4549F, -0.8988F, 0.3229F, 0.0F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(27, 101).mirror().addBox(-0.5F, 0.175F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7518F, 1.3827F, -9.095F, 0.0175F, 0.3229F, 0.0F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(50, 71).mirror().addBox(-0.2912F, -0.3552F, -4.9585F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.5828F, -5.6873F, 0.1484F, 0.3229F, 0.0F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.2912F, -0.8165F, -1.4999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.5828F, -5.6873F, 0.4625F, 0.3229F, 0.0F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-5.0F, -1.0054F, -4.4615F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2143F, -0.1655F, 1.0004F, 0.2831F, -0.204F, 0.0478F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(58, 93).mirror().addBox(-0.5F, -1.45F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.013F, -0.6338F, 0.011F, 0.1086F, -0.204F, 0.0478F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -0.7965F, -0.0865F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(95, 113).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.7335F, 1.0011F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(21, 43).addBox(-0.5F, -12.4343F, -5.7198F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5372F, 6.5917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(63, 79).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 9.5676F, -1.667F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(58, 99).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5679F, -1.6321F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(104, 69).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.5716F, -1.51F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(104, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6083F, -1.1284F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(88, 23).addBox(-1.0F, -1.8F, -0.15F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(97, 23).addBox(-1.0F, -0.5F, -1.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(96, 90).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 99).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.1544F, 0.6921F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(88, 0).addBox(-1.0F, -11.0937F, -5.1715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.949F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(82, 37).addBox(-1.9F, -0.2745F, -0.9999F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.8494F, 1.0183F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(27, 106).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.8756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(39, 83).addBox(-0.5F, -3.0F, -0.8F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.4285F, 0.8756F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(13, 80).addBox(-1.0F, -2.0F, -2.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9F, 13.5836F, -0.7445F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(104, 34).addBox(-1.0F, 1.5F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 11.0599F, -0.2538F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 107).addBox(-1.9F, -15.0978F, 4.3681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(40, 50).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9F, 1.5835F, 2.8194F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(32, 68).addBox(-1.9F, -12.035F, 0.6314F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(84, 9).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 15.1812F, -1.3335F, -1.0036F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(31, 22).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3086F, 0.0969F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(71, 21).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -0.7965F, -0.0865F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(40, 114).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.7335F, 1.0011F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(106, 107).addBox(-0.5F, -12.4343F, -5.7198F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5372F, 6.5917F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(76, 79).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 9.5676F, -1.667F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(18, 101).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5679F, -1.6321F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(76, 104).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.5716F, -1.51F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(9, 104).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6083F, -1.1284F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(89, 77).addBox(-1.0F, -1.8F, -0.15F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(37, 97).addBox(-1.0F, -0.5F, -1.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(96, 96).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.5737F, -0.1021F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 99).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.1544F, 0.6921F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(88, 17).addBox(-1.0F, -11.0937F, -5.1715F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.949F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(26, 83).addBox(-0.1F, -0.2745F, -0.9999F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 15.8494F, 1.0183F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(106, 44).addBox(-0.5F, -5.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.8756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 83).addBox(-0.5F, -3.0F, -0.8F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.4285F, 0.8756F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(80, 70).addBox(-1.0F, -2.0F, -2.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9F, 13.5836F, -0.7445F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 104).addBox(-1.0F, 1.5F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 11.0599F, -0.2538F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(99, 107).addBox(-0.1F, -15.0978F, 4.3681F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.2475F, -3.2467F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(32, 60).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9F, 1.5835F, 2.8194F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(41, 68).addBox(-0.1F, -12.035F, 0.6314F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(84, 44).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 15.1812F, -1.3335F, -1.0036F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(67, 50).addBox(-2.0F, -1.4696F, -2.8933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3086F, 0.0969F, 0.2532F, -0.0037F, 0.0031F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(71, 28).addBox(-2.0F, -1.4F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 59).addBox(-1.0F, -0.6317F, -6.0364F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.8687F, -6.0023F, -0.0172F, 0.0426F, 0.0096F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 112).addBox(0.01F, -3.3295F, -0.1008F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -0.901F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 93).addBox(0.01F, -3.4943F, -0.0073F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5928F, -3.001F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(64, 117).addBox(0.01F, -3.481F, 0.0285F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.57F, -5.0397F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(22, 116).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -4.7558F, 0.35F, 0.2306F, -0.4737F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-4.7749F, -0.8587F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -4.7558F, 0.2322F, 0.2937F, -0.921F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(116, 64).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.7558F, 0.2212F, 0.2798F, -0.9242F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(116, 66).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -2.7558F, 0.3341F, 0.2226F, -0.4773F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(97, 29).mirror().addBox(-2.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.7558F, 0.2771F, 0.349F, -0.9069F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(116, 79).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2449F, -0.7558F, 0.4143F, 0.2619F, -0.458F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(116, 79).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.7558F, 0.4143F, -0.2619F, 0.458F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(97, 29).addBox(1.7749F, -0.8587F, -0.2407F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -0.7558F, 0.2771F, -0.349F, 0.9069F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(116, 66).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.7558F, 0.3341F, -0.2226F, 0.4773F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(116, 64).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -2.7558F, 0.2212F, -0.2798F, 0.9242F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(80, 77).addBox(1.7749F, -0.8587F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -4.7558F, 0.2322F, -0.2937F, 0.921F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(22, 116).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2449F, -4.7558F, 0.35F, -0.2306F, 0.4737F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6479F, -6.0202F, -0.0961F, 0.0434F, -0.0042F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(52, 20).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6771F, -1.9045F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(119, 93).addBox(0.01F, -3.9397F, -0.0012F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7345F, -0.8678F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-12.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.0538F, -5.9239F, 0.1217F, 0.5344F, -1.3597F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(116, 81).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.0538F, -5.9239F, 0.348F, 0.4306F, -0.8799F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(116, 83).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.0538F, -5.9239F, 0.5128F, 0.307F, -0.4303F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(73, 7).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.4537F, -4.1239F, 0.1175F, 0.5173F, -1.3618F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(116, 106).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.4537F, -4.1239F, 0.3359F, 0.4172F, -0.8849F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(116, 108).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.4537F, -4.1239F, 0.4962F, 0.2996F, -0.4353F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(116, 110).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7538F, -2.2239F, 0.4632F, 0.2848F, -0.4448F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-8.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7538F, -2.2239F, 0.1093F, 0.4832F, -1.3657F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(33, 117).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7538F, -2.2239F, 0.312F, 0.39F, -0.8943F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(115, 27).mirror().addBox(-5.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.3837F, -0.4416F, 0.1196F, 0.5258F, -1.3608F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(119, 91).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.3837F, -0.4416F, 0.3419F, 0.4239F, -0.8824F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(93, 119).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.3837F, -0.4416F, 0.5045F, 0.3033F, -0.4328F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(119, 91).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.3837F, -0.4416F, 0.3419F, -0.4239F, 0.8824F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 119).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.3837F, -0.4416F, 0.5045F, -0.3033F, 0.4328F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(115, 27).addBox(3.0583F, -2.3736F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.3837F, -0.4416F, 0.1196F, -0.5258F, 1.3608F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 22).addBox(0.01F, -3.5449F, 0.0356F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0056F, -2.8537F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(33, 117).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7538F, -2.2239F, 0.312F, -0.39F, 0.8943F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(88, 57).addBox(3.0583F, -2.3736F, -0.2407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7538F, -2.2239F, 0.1093F, -0.4832F, 1.3657F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(116, 110).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7538F, -2.2239F, 0.4632F, -0.2848F, 0.4448F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(116, 108).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.4537F, -4.1239F, 0.4962F, -0.2996F, 0.4353F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(116, 106).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.4537F, -4.1239F, 0.3359F, -0.4172F, 0.8849F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 7).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.4537F, -4.1239F, 0.1175F, -0.5173F, 1.3618F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(116, 83).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.0538F, -5.9239F, 0.5128F, -0.307F, 0.4303F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(116, 81).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.0538F, -5.9239F, 0.348F, -0.4306F, 0.8799F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(71, 35).addBox(3.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.0538F, -5.9239F, 0.1217F, -0.5344F, 1.3597F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(84, 116).addBox(0.01F, -3.5967F, -0.0328F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7294F, -4.6781F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 116).addBox(0.01F, -3.2561F, -0.0186F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2872F, -6.6347F, 0.2094F, 0.0F, 0.0F));

		PartDefinition chest2 = body2.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3205F, -6.6796F, -0.2271F, 0.0425F, -0.0098F));

		PartDefinition cube_r172 = chest2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(91, 85).addBox(-2.4278F, 0.9364F, -4.7148F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4278F, 14.8401F, 0.1907F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(105, 87).addBox(-1.9278F, 0.3548F, -2.1768F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4278F, 14.8401F, 0.1907F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(115, 17).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.0676F, -1.9467F, 0.7762F, 0.4073F, -0.3377F));

		PartDefinition cube_r175 = chest2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(115, 15).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.0676F, -1.9467F, 0.5566F, 0.6273F, -0.7738F));

		PartDefinition cube_r176 = chest2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(57, 59).mirror().addBox(-13.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.0676F, -1.9467F, 0.2003F, 0.7934F, -1.3108F));

		PartDefinition cube_r177 = chest2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(115, 19).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.5176F, -3.2967F, 0.7762F, 0.4073F, -0.3377F));

		PartDefinition cube_r178 = chest2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(115, 21).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.5176F, -3.2967F, 0.5566F, 0.6273F, -0.7738F));

		PartDefinition cube_r179 = chest2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-12.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.5176F, -3.2967F, 0.2003F, 0.7934F, -1.3108F));

		PartDefinition cube_r180 = chest2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(117, 53).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -0.6467F, 0.7538F, 0.4F, -0.3465F));

		PartDefinition cube_r181 = chest2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(57, 61).mirror().addBox(-13.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -0.6467F, 0.1925F, 0.7723F, -1.3163F));

		PartDefinition cube_r182 = chest2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(117, 55).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6676F, -0.6467F, 0.5375F, 0.6119F, -0.7849F));

		PartDefinition cube_r183 = chest2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4647F, 15.6228F, 0.9659F, 0.4881F, -0.6413F, -0.0319F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2944F, 15.6211F, 0.7489F, 0.5122F, -0.7846F, -0.0571F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4043F, 15.548F, 0.7509F, 0.8079F, -1.0355F, -0.218F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4087F, 15.5529F, 0.8517F, 1.6604F, -1.1551F, -1.0796F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4087F, 15.5529F, 0.8517F, 1.6604F, 1.1551F, 1.0796F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4043F, 15.548F, 0.7509F, 0.8079F, 1.0355F, 0.218F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(52, 30).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2944F, 15.6211F, 0.7489F, 0.5122F, 0.7846F, 0.0571F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(48, 39).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4647F, 15.6228F, 0.9659F, 0.4881F, 0.6413F, 0.0319F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -1.1F, -9.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6894F, 2.209F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(117, 55).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -0.6467F, 0.5375F, -0.6119F, 0.7849F));

		PartDefinition cube_r193 = chest2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(57, 61).addBox(3.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -0.6467F, 0.1925F, -0.7723F, 1.3163F));

		PartDefinition cube_r194 = chest2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(117, 53).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6676F, -0.6467F, 0.7538F, -0.4F, 0.3465F));

		PartDefinition cube_r195 = chest2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(67, 57).addBox(3.0583F, -2.3736F, -0.2407F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.5176F, -3.2967F, 0.2003F, -0.7934F, 1.3108F));

		PartDefinition cube_r196 = chest2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(115, 21).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.5176F, -3.2967F, 0.5566F, -0.6273F, 0.7738F));

		PartDefinition cube_r197 = chest2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(115, 19).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.5176F, -3.2967F, 0.7762F, -0.4073F, 0.3377F));

		PartDefinition cube_r198 = chest2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(57, 59).addBox(3.0583F, -2.3736F, -0.2407F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.0676F, -1.9467F, 0.2003F, -0.7934F, 1.3108F));

		PartDefinition cube_r199 = chest2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(115, 15).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.0676F, -1.9467F, 0.5566F, -0.6273F, 0.7738F));

		PartDefinition cube_r200 = chest2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(115, 17).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.0676F, -1.9467F, 0.7762F, -0.4073F, 0.3377F));

		PartDefinition cube_r201 = chest2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(61, 117).addBox(0.0F, -3.4427F, -0.0142F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3476F, -4.0669F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(120, 39).addBox(0.0F, -3.5418F, 0.0287F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.903F, -2.7282F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(120, 33).addBox(0.0F, -3.4344F, -0.025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -1.4F, 0.4102F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7929F, 10.9559F, -5.3376F, 0.41F, 0.0038F, -0.0872F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(85, 106).addBox(-0.5F, -1.1891F, -0.7708F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5779F, 4.3115F, -1.5806F, -0.8869F, 0.3762F, 1.2738F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(78, 93).addBox(-0.5F, -1.2219F, -1.8276F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5779F, 4.3115F, -1.5806F, -0.1451F, 0.3762F, 1.2738F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(40, 110).addBox(1.2692F, -3.9373F, -4.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 1.2768F, 0.3031F, 0.4118F));

		PartDefinition cube_r207 = bone2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(54, 109).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.703F, 4.4583F, -1.3914F, 0.2732F, 0.3031F, 0.4118F));

		PartDefinition cube_r208 = bone2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(9, 109).addBox(1.2692F, -2.3319F, -5.6231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 0.9713F, 0.3031F, 0.4118F));

		PartDefinition cube_r209 = bone2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(18, 106).addBox(-0.5F, -1.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.81F, 2.3321F, 0.3582F, 0.797F, 0.0346F, 0.2129F));

		PartDefinition cube_r210 = bone2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(106, 10).addBox(-0.0297F, -1.4697F, -4.3375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 1.1461F, 0.0346F, 0.2129F));

		PartDefinition cube_r211 = bone2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(105, 97).addBox(0.0907F, -1.2088F, -4.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 0.6257F, 0.088F, 0.2065F));

		PartDefinition cube_r212 = bone2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(67, 103).addBox(-0.2307F, -0.848F, -1.8783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 0.7976F, -0.0388F, 0.0869F));

		PartDefinition cube_r213 = bone2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(99, 16).addBox(-0.2307F, -0.9034F, 0.8774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 0.7366F, -0.0388F, 0.0869F));

		PartDefinition cube_r214 = bone2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(119, 101).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.3038F, -2.8925F, 5.2522F, 2.0368F, -0.0388F, 0.0869F));

		PartDefinition cube_r215 = bone2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(67, 108).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.1975F, -2.2288F, 6.4965F, -2.8501F, -0.0388F, 0.0869F));

		PartDefinition cube_r216 = bone2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(113, 37).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.1895F, -2.5596F, 7.4401F, 1.9059F, -0.0388F, 0.0869F));

		PartDefinition cube_r217 = bone2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(102, 114).addBox(-0.5F, -2.6F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.2512F, -3.3295F, 7.5783F, 0.8587F, -0.0388F, 0.0869F));

		PartDefinition cube_r218 = bone2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(124, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.3269F, -4.3245F, 7.8598F, -1.1484F, -0.0388F, 0.0869F));

		PartDefinition cube_r219 = bone2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(22, 124).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.411F, -4.9393F, 7.0756F, -2.2392F, -0.0388F, 0.0869F));

		PartDefinition cube_r220 = bone2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(123, 82).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.4779F, -5.2899F, 6.1415F, 2.7786F, -0.0388F, 0.0869F));

		PartDefinition cube_r221 = bone2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(23, 112).addBox(-0.2307F, 3.3164F, 2.9628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 1.6878F, -0.0388F, 0.0869F));

		PartDefinition cube_r222 = bone2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(36, 103).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.331F, -3.4646F, 5.8316F, 0.9896F, -0.0388F, 0.0869F));

		PartDefinition cube_r223 = bone2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 71).addBox(-0.2307F, -1.4334F, -1.9708F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.8818F, 0.1113F, 2.4261F, 0.7453F, -0.0388F, 0.0869F));

		PartDefinition bone5 = chest2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7929F, 10.9559F, -5.3376F, 0.41F, -0.0038F, 0.0872F));

		PartDefinition cube_r224 = bone5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(85, 106).mirror().addBox(-0.5F, -1.1891F, -0.7708F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5779F, 4.3115F, -1.5806F, -0.8869F, -0.3762F, -1.2738F));

		PartDefinition cube_r225 = bone5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(78, 93).mirror().addBox(-0.5F, -1.2219F, -1.8276F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5779F, 4.3115F, -1.5806F, -0.1451F, -0.3762F, -1.2738F));

		PartDefinition cube_r226 = bone5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 110).mirror().addBox(-2.2692F, -3.9373F, -4.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 1.2768F, -0.3031F, -0.4118F));

		PartDefinition cube_r227 = bone5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(54, 109).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.703F, 4.4583F, -1.3914F, 0.2732F, -0.3031F, -0.4118F));

		PartDefinition cube_r228 = bone5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(9, 109).mirror().addBox(-2.2692F, -2.3319F, -5.6231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 0.9713F, -0.3031F, -0.4118F));

		PartDefinition cube_r229 = bone5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(18, 106).mirror().addBox(-0.5F, -1.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.81F, 2.3321F, 0.3582F, 0.797F, -0.0346F, -0.2129F));

		PartDefinition cube_r230 = bone5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(106, 10).mirror().addBox(-0.9703F, -1.4697F, -4.3375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 1.1461F, -0.0346F, -0.2129F));

		PartDefinition cube_r231 = bone5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(105, 97).mirror().addBox(-1.0907F, -1.2088F, -4.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 0.6257F, -0.088F, -0.2065F));

		PartDefinition cube_r232 = bone5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 103).mirror().addBox(-0.7693F, -0.848F, -1.8783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 0.7976F, 0.0388F, -0.0869F));

		PartDefinition cube_r233 = bone5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(99, 16).mirror().addBox(-0.7693F, -0.9034F, 0.8774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 0.7366F, 0.0388F, -0.0869F));

		PartDefinition cube_r234 = bone5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(119, 101).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.3038F, -2.8925F, 5.2522F, 2.0368F, 0.0388F, -0.0869F));

		PartDefinition cube_r235 = bone5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(67, 108).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.1975F, -2.2288F, 6.4965F, -2.8501F, 0.0388F, -0.0869F));

		PartDefinition cube_r236 = bone5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(113, 37).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.1895F, -2.5596F, 7.4401F, 1.9059F, 0.0388F, -0.0869F));

		PartDefinition cube_r237 = bone5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(102, 114).mirror().addBox(-0.5F, -2.6F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.2512F, -3.3295F, 7.5783F, 0.8587F, 0.0388F, -0.0869F));

		PartDefinition cube_r238 = bone5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(124, 51).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.3269F, -4.3245F, 7.8598F, -1.1484F, 0.0388F, -0.0869F));

		PartDefinition cube_r239 = bone5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(22, 124).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.411F, -4.9393F, 7.0756F, -2.2392F, 0.0388F, -0.0869F));

		PartDefinition cube_r240 = bone5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(123, 82).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.4779F, -5.2899F, 6.1415F, 2.7786F, 0.0388F, -0.0869F));

		PartDefinition cube_r241 = bone5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(23, 112).mirror().addBox(-0.7693F, 3.3164F, 2.9628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 1.6878F, 0.0388F, -0.0869F));

		PartDefinition cube_r242 = bone5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(36, 103).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.331F, -3.4646F, 5.8316F, 0.9896F, 0.0388F, -0.0869F));

		PartDefinition cube_r243 = bone5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(-0.7693F, -1.4334F, -1.9708F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.8818F, 0.1113F, 2.4261F, 0.7453F, 0.0388F, -0.0869F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6986F, -4.0226F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(63, 123).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6406F, -3.0586F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(37, 126).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3038F, -1.2927F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(50, 79).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.6F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(80, 59).mirror().addBox(-10.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.1501F, 0.6409F, -1.3439F));

		PartDefinition cube_r248 = neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(87, 117).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.4278F, 0.5135F, -0.8436F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(94, 117).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.169F, -0.5241F, 0.6184F, 0.3508F, -0.3962F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(110, 117).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.6615F, 0.3674F, -0.381F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-9.0583F, -2.3736F, -0.2407F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.1628F, 0.6833F, -1.3361F));

		PartDefinition cube_r252 = neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(117, 117).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.269F, -2.2241F, 0.4617F, 0.5458F, -0.8264F));

		PartDefinition cube_r253 = neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(117, 117).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.4617F, -0.5458F, 0.8264F));

		PartDefinition cube_r254 = neck4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(80, 61).addBox(3.0583F, -2.3736F, -0.2407F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.1628F, -0.6833F, 1.3361F));

		PartDefinition cube_r255 = neck4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(110, 117).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.269F, -2.2241F, 0.6615F, -0.3674F, 0.381F));

		PartDefinition cube_r256 = neck4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(94, 117).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.6184F, -0.3508F, 0.3962F));

		PartDefinition cube_r257 = neck4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(87, 117).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.4278F, -0.5135F, 0.8436F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(80, 59).addBox(3.0583F, -2.3736F, -0.2407F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.169F, -0.5241F, 0.1501F, -0.6409F, 1.3439F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9591F, -3.3577F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(14, 121).addBox(0.0F, -2.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9603F, -0.6939F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(119, 99).mirror().addBox(-1.9837F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.01F, -0.6663F, 0.2906F, 0.2003F, -0.4864F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(100, 119).mirror().addBox(-3.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.01F, -0.6663F, 0.1914F, 0.2414F, -0.9318F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-7.0583F, -2.3736F, -0.2407F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.01F, -0.6663F, 0.0695F, 0.2991F, -1.381F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(119, 99).addBox(-0.0163F, -0.0346F, -0.3638F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.01F, -0.6663F, 0.2906F, -0.2003F, 0.4864F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(100, 119).addBox(1.7749F, -0.8587F, -0.2407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.01F, -0.6663F, 0.1914F, -0.2414F, 0.9318F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(71, 37).addBox(3.0583F, -2.3736F, -0.2407F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.01F, -0.6663F, 0.0695F, -0.2991F, 1.381F));

		PartDefinition cube_r266 = neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5477F, -4.0023F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0111F, -1.4784F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(112, 128).addBox(0.0F, -1.222F, 3.9599F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(95, 42).addBox(-0.5F, -0.022F, 2.9599F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.3F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(6, 118).mirror().addBox(-1.9837F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.0388F, 0.0579F, -0.9559F));

		PartDefinition cube_r269 = neck2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(112, 29).mirror().addBox(-4.7749F, -0.8587F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9011F, -1.288F, 0.0247F, 0.0064F, -1.3895F));

		PartDefinition cube_r270 = neck2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(112, 29).addBox(1.7749F, -0.8587F, -0.2407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.0247F, -0.0064F, 1.3895F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(6, 118).addBox(-0.0163F, -0.0346F, -0.3639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9011F, -1.288F, 0.0388F, -0.0579F, 0.9559F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4752F, -1.9536F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r272 = neck.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(106, 128).addBox(0.0F, -0.5F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r273 = neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(87, 128).addBox(0.0F, -0.6F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 86).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r274 = neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(112, 31).mirror().addBox(-2.9837F, -0.0346F, -0.3638F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0259F, -1.4344F, 0.3528F, 0.6711F, -1.1221F));

		PartDefinition cube_r275 = neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(22, 118).mirror().addBox(-1.5156F, -0.2066F, -0.328F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6259F, -3.5344F, 0.4141F, 0.8331F, -1.0327F));

		PartDefinition cube_r276 = neck.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(22, 118).addBox(-0.4844F, -0.2066F, -0.328F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6259F, -3.5344F, 0.4141F, -0.8331F, 1.0327F));

		PartDefinition cube_r277 = neck.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(112, 31).addBox(-0.0163F, -0.0346F, -0.3638F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0259F, -1.4344F, 0.3528F, -0.6711F, 1.1221F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0148F, -3.4133F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r278 = neck5.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(48, 129).addBox(0.0F, -0.8F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 95).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(40, 118).mirror().addBox(-0.9787F, -0.3537F, -0.8621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3111F, -1.621F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r280 = neck5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(40, 118).addBox(-1.0213F, -0.3537F, -0.8621F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3111F, -1.621F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8352F, -2.7326F, -0.3698F, 0.1757F, 0.1293F));

		PartDefinition cube_r281 = neck6.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(84, 17).addBox(0.0F, -0.875F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2335F, -1.0467F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck6.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(47, 118).mirror().addBox(0.6656F, -0.8762F, -1.5125F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5241F, 1.1116F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r283 = neck6.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(47, 118).addBox(-2.6656F, -0.8762F, -1.5125F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5241F, 1.1116F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition cube_r284 = neck6.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.8F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8436F, -2.6404F, 0.1765F, 0.4083F, 0.1747F));

		PartDefinition cube_r285 = neck7.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(45, 129).addBox(0.0F, -0.175F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 129).addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5852F, -0.5172F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r286 = neck7.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(2.3732F, -1.4186F, -2.2298F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 57).mirror().addBox(3.9728F, -1.9267F, -2.9735F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3677F, 3.752F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r287 = neck7.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(40, 57).addBox(-5.9728F, -1.9267F, -2.9735F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 21).addBox(-4.3732F, -1.4186F, -2.2298F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3677F, 3.752F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition cube_r288 = neck7.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(97, 48).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.664F, -2.6721F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r289 = neck8.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(115, 0).addBox(0.0F, -0.5F, -2.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7852F, -0.7172F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r290 = neck8.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(41, 120).mirror().addBox(5.8593F, -2.5262F, -3.6381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.0091F, 6.1671F, 0.369F, 0.8497F, -1.0933F));

		PartDefinition cube_r291 = neck8.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(41, 120).addBox(-7.8593F, -2.5262F, -3.6381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0091F, 6.1671F, 0.369F, -0.8497F, 1.0933F));

		PartDefinition cube_r292 = neck8.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(80, 86).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.2F, -3.1F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck8.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6395F, -4.464F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r293 = heads.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(40, 128).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.4085F, -9.7351F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r294 = heads.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(51, 128).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 3.2437F, -8.9745F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r295 = heads.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(128, 41).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 3.6048F, -9.4536F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r296 = heads.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(128, 38).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, 2.95F, -9.9934F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r297 = heads.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(128, 35).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.9357F, -9.3657F, -2.234F, 0.0F, 0.0F));

		PartDefinition cube_r298 = heads.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(128, 32).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.3574F, -8.612F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r299 = heads.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(31, 128).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.3574F, -8.612F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r300 = heads.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(106, 50).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0695F, 0.7964F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r301 = heads.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(124, 54).addBox(-0.5F, -1.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5093F, -4.4427F, 0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r302 = heads.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(93, 124).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1974F, -4.639F, 1.5053F, 0.0F, 0.0F));

		PartDefinition cube_r303 = heads.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(124, 101).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2573F, -7.815F, 2.7271F, 0.0F, 0.0F));

		PartDefinition cube_r304 = heads.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(41, 125).addBox(-0.8F, -0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.6195F, -7.334F, -2.3043F, 0.7692F, -0.5599F));

		PartDefinition cube_r305 = heads.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(98, 124).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6195F, -7.334F, -2.0726F, 0.0F, 0.0F));

		PartDefinition cube_r306 = heads.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(113, 68).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1382F, -6.4791F, -1.0254F, 0.0F, 0.0F));

		PartDefinition cube_r307 = heads.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(110, 119).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1164F, -5.4794F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r308 = heads.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(76, 124).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3347F, -5.3074F, 1.1126F, 0.0F, 0.0F));

		PartDefinition cube_r309 = heads.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(115, 12).addBox(-1.0F, 0.0F, -1.975F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 109).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2543F, -3.068F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r310 = heads.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(107, 65).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.669F, -2.1581F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r311 = heads.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(106, 26).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0028F, -1.2154F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r312 = heads.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(126, 75).addBox(-0.5F, -0.375F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.4661F, -0.8244F, -1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r313 = heads.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 12).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4175F, -0.3055F, -2.714F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.8F, -1.6735F, -1.8839F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(125, 118).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0253F, -0.2594F, 2.6372F, 0.3127F, 0.0834F, 0.0755F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(61, 128).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.3F, 3.6091F, -7.4818F, -2.2328F, 0.043F, 0.055F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(128, 63).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.3418F, 4.0808F, -7.8503F, 2.6977F, 0.043F, 0.055F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(118, 112).addBox(-0.4966F, -0.5513F, -0.3028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0735F, -0.3358F, 2.0351F, -0.7345F, 0.0834F, 0.0755F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(126, 72).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.0833F, -0.7775F, 1.6105F, -1.04F, 0.0897F, 0.0679F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(122, 88).addBox(-0.5016F, -0.5628F, -0.6939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.0735F, -0.3358F, 2.0351F, -0.1674F, 0.0897F, 0.0679F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(95, 36).addBox(-1.0258F, -1.7582F, -2.5667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2252F, 2.7978F, -2.0286F, 0.3781F, 0.1972F, 0.1025F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(54, 118).addBox(-0.9688F, -0.7396F, -1.2001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, -0.9802F, 0.129F, -0.0639F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(125, 127).addBox(-1.1274F, -1.8268F, -1.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7304F, 3.4772F, -3.8168F, 0.4632F, 0.1067F, -0.0515F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(122, 20).addBox(0.1367F, -0.4126F, -1.4003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3239F, 4.1716F, -6.7117F, 0.6671F, 0.6526F, 0.4465F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(110, 54).addBox(-2.9433F, -1.9256F, 1.0177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(47, 110).addBox(-2.5433F, -1.9256F, 1.5177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9752F, 4.5978F, -3.4286F, 1.0378F, 0.5466F, 0.704F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(92, 31).addBox(-0.3386F, -3.3552F, 2.0304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9752F, 4.5978F, -3.4286F, 0.373F, -0.0924F, -0.0081F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(95, 6).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2699F, 1.4498F, 1.787F, 0.2778F, 0.1023F, -0.0417F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(76, 127).addBox(-0.5F, -1.1813F, -0.327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.588F, 2.4531F, -0.8501F, -0.8973F, 0.138F, 0.0183F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(127, 60).addBox(-0.5F, -0.4296F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(127, 57).addBox(-0.5F, -0.4296F, -1.1994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.588F, 2.4531F, -0.8501F, 0.3245F, 0.138F, 0.0183F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(121, 71).addBox(-0.9149F, -3.9224F, -0.6345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3144F, 3.2495F, -1.7692F, 1.5904F, 0.2305F, -0.0348F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(103, 102).addBox(-0.9149F, -0.8826F, -2.9882F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.3144F, 3.2495F, -1.7692F, 0.1941F, 0.2305F, -0.0348F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(48, 120).addBox(-0.9585F, -1.8515F, -0.2535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, 1.999F, 0.1456F, -0.0944F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(122, 85).addBox(-0.9585F, -0.8982F, -0.8826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, 0.6028F, 0.1456F, -0.0944F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(86, 125).addBox(-0.5F, -0.5636F, -0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.344F, 2.1212F, 0.9109F, 2.7596F, 0.1241F, -0.0966F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(81, 125).addBox(-0.5F, -0.0868F, -0.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.344F, 2.1212F, 0.9109F, 1.4942F, 0.1241F, -0.0966F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(81, 122).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.242F, 2.7566F, 1.7754F, 0.3545F, 0.0938F, 0.003F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(120, 23).addBox(-0.5F, -1.9F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0389F, 3.1136F, 3.0128F, 0.565F, 0.0737F, -0.0737F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(120, 0).addBox(0.325F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6938F, 4.3414F, -6.6442F, 0.5193F, 0.114F, -0.028F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(115, 119).addBox(-0.0154F, -0.7281F, -3.2405F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3144F, 3.2495F, -1.7692F, 0.2413F, 0.2243F, -0.0067F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(108, 15).addBox(0.0F, -0.525F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3712F, 2.9672F, -1.607F, 0.2719F, 0.1823F, 0.0687F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(127, 91).addBox(-0.6815F, -0.0071F, 1.148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, -2.7647F, 0.1479F, -0.0835F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(120, 48).addBox(-0.6815F, -1.7027F, 0.4759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, 2.2532F, 0.1479F, -0.0835F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(96, 127).addBox(-0.6815F, -1.9854F, -0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, 1.8605F, 0.1479F, -0.0835F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(91, 127).addBox(-0.6815F, -1.0827F, -1.4417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, 0.5078F, 0.1479F, -0.0835F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(127, 85).addBox(-0.6815F, -0.7124F, -1.7288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-2.0823F, 3.7235F, -5.4981F, 0.0715F, 0.1479F, -0.0835F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(71, 125).addBox(-0.5F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 66).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1305F, 1.3278F, 1.1091F, 1.436F, 0.0779F, -0.006F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(93, 121).addBox(-0.5F, 0.3F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(76, 121).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(121, 74).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.1964F, 1.1776F, 0.2766F, -3.0146F, 0.0779F, -0.006F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(122, 60).addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1653F, 1.3017F, 0.6661F, 2.1778F, 0.0779F, -0.006F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(101, 127).addBox(-0.1081F, -3.9038F, -2.156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(127, 97).addBox(-0.2331F, -3.9038F, -2.156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9502F, 4.3978F, -2.9286F, -1.0554F, 0.1324F, 0.0254F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(127, 94).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.4324F, 1.6263F, -1.5786F, 1.7065F, 0.1324F, 0.0254F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(127, 12).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.3898F, 2.0679F, -1.1747F, 0.7466F, 0.1324F, 0.0254F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(16, 126).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.3092F, 1.9629F, -0.5895F, 0.1794F, 0.1324F, 0.0254F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(11, 126).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.239F, 1.5767F, -0.1357F, -0.8678F, 0.1324F, 0.0254F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(125, 124).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.2312F, 0.9792F, -0.1905F, -1.4787F, 0.1324F, 0.0254F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(125, 121).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3177F, 0.5562F, -0.9209F, -2.8749F, 0.1324F, 0.0254F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(120, 125).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(122, 57).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3504F, 1.1219F, -1.0584F, 2.361F, 0.1324F, 0.0254F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(67, 97).addBox(-0.4342F, -2.6146F, 1.8654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0252F, 4.3978F, -3.4286F, 0.4193F, 0.1268F, 0.0255F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(53, 122).addBox(-0.2284F, -0.3944F, -0.6571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3239F, 4.1716F, -6.7117F, 0.4976F, 0.1336F, 0.0936F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(105, 92).addBox(-0.5F, -0.675F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4288F, 0.4948F, 0.4914F, 0.3858F, 0.0719F, 0.0495F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(115, 9).addBox(-1.8F, -0.9F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.824F, 2.0779F, -5.5968F, 1.3411F, 1.1541F, -1.6788F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(6, 120).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.824F, 2.627F, -5.8385F, 1.5098F, 0.0867F, -1.2127F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(127, 88).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3F, 2.4799F, -6.1728F, 2.1643F, 0.0867F, -1.2127F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(66, 125).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3F, 1.9307F, -5.9312F, 2.5157F, 0.8127F, -0.4833F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(125, 44).addBox(-0.8F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.3F, 1.054F, -5.4502F, -2.3043F, 0.7692F, -0.5599F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(114, 76).addBox(-1.8F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(50, 68).addBox(-1.8F, -0.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6987F, 1.9682F, -5.4254F, 2.8428F, 0.8447F, -1.6028F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(51, 125).addBox(-0.5F, -0.55F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(125, 47).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(127, 9).addBox(-0.475F, -0.125F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-2.0066F, 1.5195F, -5.0175F, -2.6533F, 0.7692F, -0.5599F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(127, 6).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.534F, 1.0848F, -4.2618F, -1.5708F, 0.5454F, -1.5708F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(103, 124).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, 0.5352F, -4.5953F, -1.1989F, 0.4087F, -0.7947F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(125, 26).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 23).addBox(-0.8F, -0.8F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5708F, 1.0793F, -3.908F, 0.086F, 0.0171F, -1.5847F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 125).addBox(-0.8F, 0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 115).addBox(-0.8F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.3F, 0.5352F, -4.5953F, -0.014F, -0.0167F, -0.9424F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(125, 3).addBox(-0.8F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.3F, 0.5352F, -4.5953F, 0.3263F, -0.0167F, -0.9424F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(125, 0).addBox(-0.775F, -0.225F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-2.3F, 0.5352F, -4.5953F, 0.1518F, -0.0167F, -0.9424F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(32, 125).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, 0.7782F, -3.1471F, 1.276F, -0.356F, -0.8542F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(126, 104).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5469F, 2.2267F, -3.8614F, 2.0202F, -0.0921F, -2.9532F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(27, 125).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.512F, 1.3304F, -3.4194F, 1.5536F, -0.4578F, -1.5319F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(126, 78).addBox(-0.9F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.4F, -0.6556F, 0.8216F, -2.0976F, 0.8003F, -0.3954F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(41, 122).addBox(-0.1415F, -0.3944F, -1.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.3239F, 4.1716F, -6.7117F, 0.5271F, 0.3468F, 0.2167F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(106, 21).addBox(-0.2372F, -0.409F, -0.4007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3239F, 4.1716F, -6.7117F, 0.685F, -0.3124F, -0.1664F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.8F, -1.6735F, -1.8839F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(125, 118).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0253F, -0.2594F, 2.6372F, 0.3127F, -0.0834F, -0.0755F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(61, 128).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.3F, 3.6091F, -7.4818F, -2.2328F, -0.043F, -0.055F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(128, 63).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.3418F, 4.0808F, -7.8503F, 2.6977F, -0.043F, -0.055F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-0.5034F, -0.5513F, -0.3028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.0735F, -0.3358F, 2.0351F, -0.7345F, -0.0834F, -0.0755F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(126, 72).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.0833F, -0.7775F, 1.6105F, -1.04F, -0.0897F, -0.0679F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(122, 88).mirror().addBox(-0.4984F, -0.5628F, -0.6939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.0735F, -0.3358F, 2.0351F, -0.1674F, -0.0897F, -0.0679F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(95, 36).mirror().addBox(0.0258F, -1.7582F, -2.5667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2252F, 2.7978F, -2.0286F, 0.3781F, -0.1972F, -0.1025F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(54, 118).mirror().addBox(-0.0312F, -0.7396F, -1.2001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, -0.9802F, -0.129F, 0.0639F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(125, 127).mirror().addBox(0.1274F, -1.8268F, -1.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7304F, 3.4772F, -3.8168F, 0.4632F, -0.1067F, 0.0515F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(122, 20).mirror().addBox(-1.1367F, -0.4126F, -1.4003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3239F, 4.1716F, -6.7117F, 0.6671F, -0.6526F, -0.4465F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(110, 54).mirror().addBox(1.9433F, -1.9256F, 1.0177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 110).mirror().addBox(1.5433F, -1.9256F, 1.5177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9752F, 4.5978F, -3.4286F, 1.0378F, -0.5466F, -0.704F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-1.6614F, -3.3552F, 2.0304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9752F, 4.5978F, -3.4286F, 0.373F, 0.0924F, 0.0081F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2699F, 1.4498F, 1.787F, 0.2778F, -0.1023F, 0.0417F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(76, 127).mirror().addBox(-0.5F, -1.1813F, -0.327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.588F, 2.4531F, -0.8501F, -0.8973F, -0.138F, -0.0183F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(127, 60).mirror().addBox(-0.5F, -0.4296F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(127, 57).mirror().addBox(-0.5F, -0.4296F, -1.1994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.588F, 2.4531F, -0.8501F, 0.3245F, -0.138F, -0.0183F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(121, 71).mirror().addBox(-0.0851F, -3.9224F, -0.6345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.3144F, 3.2495F, -1.7692F, 1.5904F, -0.2305F, 0.0348F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(103, 102).mirror().addBox(-0.0851F, -0.8826F, -2.9882F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.3144F, 3.2495F, -1.7692F, 0.1941F, -0.2305F, 0.0348F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(48, 120).mirror().addBox(-0.0415F, -1.8515F, -0.2535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, 1.999F, -0.1456F, 0.0944F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(122, 85).mirror().addBox(-0.0415F, -0.8982F, -0.8826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, 0.6028F, -0.1456F, 0.0944F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(86, 125).mirror().addBox(-0.5F, -0.5636F, -0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.344F, 2.1212F, 0.9109F, 2.7596F, -0.1241F, 0.0966F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(81, 125).mirror().addBox(-0.5F, -0.0868F, -0.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.344F, 2.1212F, 0.9109F, 1.4942F, -0.1241F, 0.0966F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(81, 122).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.242F, 2.7566F, 1.7754F, 0.3545F, -0.0938F, -0.003F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(120, 23).mirror().addBox(-0.5F, -1.9F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0389F, 3.1136F, 3.0128F, 0.565F, -0.0737F, 0.0737F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-0.325F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6938F, 4.3414F, -6.6442F, 0.5193F, -0.114F, 0.028F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(115, 119).mirror().addBox(0.0154F, -0.7281F, -3.2405F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3144F, 3.2495F, -1.7692F, 0.2413F, -0.2243F, 0.0067F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(108, 15).mirror().addBox(0.0F, -0.525F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3712F, 2.9672F, -1.607F, 0.2719F, -0.1823F, -0.0687F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(127, 91).mirror().addBox(-0.3185F, -0.0071F, 1.148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, -2.7647F, -0.1479F, 0.0835F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(120, 48).mirror().addBox(-0.3185F, -1.7027F, 0.4759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, 2.2532F, -0.1479F, 0.0835F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(96, 127).mirror().addBox(-0.3185F, -1.9854F, -0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, 1.8605F, -0.1479F, 0.0835F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(91, 127).mirror().addBox(-0.3185F, -1.0827F, -1.4417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, 0.5078F, -0.1479F, 0.0835F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(127, 85).mirror().addBox(-0.3185F, -0.7124F, -1.7288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(2.0823F, 3.7235F, -5.4981F, 0.0715F, -0.1479F, 0.0835F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(71, 125).mirror().addBox(-0.5F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 66).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.1305F, 1.3278F, 1.1091F, 1.436F, -0.0779F, 0.006F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(93, 121).mirror().addBox(-0.5F, 0.3F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(76, 121).mirror().addBox(-0.5F, 0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(121, 74).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.1964F, 1.1776F, 0.2766F, -3.0146F, -0.0779F, 0.006F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(122, 60).mirror().addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.1653F, 1.3017F, 0.6661F, 2.1778F, -0.0779F, 0.006F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(101, 127).mirror().addBox(-0.8919F, -3.9038F, -2.156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(127, 97).mirror().addBox(-0.7669F, -3.9038F, -2.156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.9502F, 4.3978F, -2.9286F, -1.0554F, -0.1324F, -0.0254F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(127, 94).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.4324F, 1.6263F, -1.5786F, 1.7065F, -0.1324F, -0.0254F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(127, 12).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.3898F, 2.0679F, -1.1747F, 0.7466F, -0.1324F, -0.0254F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(16, 126).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.3092F, 1.9629F, -0.5895F, 0.1794F, -0.1324F, -0.0254F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(11, 126).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.239F, 1.5767F, -0.1357F, -0.8678F, -0.1324F, -0.0254F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(125, 124).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.2312F, 0.9792F, -0.1905F, -1.4787F, -0.1324F, -0.0254F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(125, 121).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3177F, 0.5562F, -0.9209F, -2.8749F, -0.1324F, -0.0254F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(120, 125).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(122, 57).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3504F, 1.1219F, -1.0584F, 2.361F, -0.1324F, -0.0254F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(-0.5658F, -2.6146F, 1.8654F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.0252F, 4.3978F, -3.4286F, 0.4193F, -0.1268F, -0.0255F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 122).mirror().addBox(-0.7716F, -0.3944F, -0.6571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3239F, 4.1716F, -6.7117F, 0.4976F, -0.1336F, -0.0936F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(105, 92).mirror().addBox(-0.5F, -0.675F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4288F, 0.4948F, 0.4914F, 0.3858F, -0.0719F, -0.0495F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(115, 9).mirror().addBox(-0.2F, -0.9F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.824F, 2.0779F, -5.5968F, 1.3411F, -1.1541F, 1.6788F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(6, 120).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.824F, 2.627F, -5.8385F, 1.5098F, -0.0867F, 1.2127F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(127, 88).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3F, 2.4799F, -6.1728F, 2.1643F, -0.0867F, 1.2127F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(66, 125).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3F, 1.9307F, -5.9312F, 2.5157F, -0.8127F, 0.4833F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-0.2F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.3F, 1.054F, -5.4502F, -2.3043F, -0.7692F, 0.5599F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(114, 76).mirror().addBox(-0.2F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(50, 68).mirror().addBox(-0.2F, -0.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6987F, 1.9682F, -5.4254F, 2.8428F, -0.8447F, 1.6028F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(51, 125).mirror().addBox(-0.5F, -0.55F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(125, 47).mirror().addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(127, 9).mirror().addBox(-0.525F, -0.125F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(2.0066F, 1.5195F, -5.0175F, -2.6533F, -0.7692F, 0.5599F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(127, 6).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.534F, 1.0848F, -4.2618F, -1.5708F, -0.5454F, 1.5708F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(103, 124).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.5352F, -4.5953F, -1.1989F, -0.4087F, 0.7947F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(125, 26).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 23).mirror().addBox(-0.2F, -0.8F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5708F, 1.0793F, -3.908F, 0.086F, -0.0171F, 1.5847F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-0.2F, 0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 115).mirror().addBox(-0.2F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.5352F, -4.5953F, -0.014F, 0.0167F, 0.9424F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(125, 3).mirror().addBox(-0.2F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.5352F, -4.5953F, 0.3263F, 0.0167F, 0.9424F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-0.225F, -0.225F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.5352F, -4.5953F, 0.1518F, 0.0167F, 0.9424F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(32, 125).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.7782F, -3.1471F, 1.276F, 0.356F, 0.8542F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(126, 104).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5469F, 2.2267F, -3.8614F, 2.0202F, 0.0921F, 2.9532F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(27, 125).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.512F, 1.3304F, -3.4194F, 1.5536F, 0.4578F, 1.5319F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(126, 78).mirror().addBox(-0.1F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.6556F, 0.8216F, -2.0976F, -0.8003F, 0.3954F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(41, 122).mirror().addBox(-0.8585F, -0.3944F, -1.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.3239F, 4.1716F, -6.7117F, 0.5271F, -0.3468F, -0.2167F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(106, 21).mirror().addBox(-0.7628F, -0.409F, -0.4007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3239F, 4.1716F, -6.7117F, 0.685F, 0.3124F, 0.1664F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.1565F, 0.9336F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(120, 119).mirror().addBox(-1.0638F, -0.4266F, 4.1746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.1924F, -0.157F, -0.0038F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(81, 112).mirror().addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-1.0222F, 1.2814F, -3.9072F, 0.2011F, -0.157F, -0.0038F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(122, 93).mirror().addBox(-0.1526F, -0.5672F, -1.1657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.6024F, -8.0475F, -0.0087F, -0.1047F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(122, 96).mirror().addBox(-0.1276F, 0.4364F, -1.2827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.6024F, -8.0475F, -1.117F, -0.1047F, 0.0F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(120, 122).mirror().addBox(-0.1276F, 0.9644F, -0.8374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.6024F, -8.0475F, -1.4573F, -0.1047F, 0.0F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(17, 123).mirror().addBox(-0.1276F, -0.12F, -1.251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.6024F, -8.0475F, -1.1606F, -0.1047F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(123, 32).mirror().addBox(-0.1276F, -0.5315F, -1.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false)
				.texOffs(56, 126).mirror().addBox(-0.1276F, -0.5315F, -2.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.6024F, -8.0475F, -0.0524F, -0.1047F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(123, 35).mirror().addBox(-0.0056F, -0.9736F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 2.6024F, -7.1475F, 0.2404F, -0.1395F, -0.0038F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(112, 102).mirror().addBox(-1.0638F, 0.0111F, 0.9323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.2273F, -0.157F, -0.0038F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(123, 38).mirror().addBox(-1.066F, -0.0103F, -0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.2186F, -0.157F, -0.0038F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(123, 41).mirror().addBox(0.0442F, -0.8636F, -1.5417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 2.6024F, -7.1475F, -0.1218F, -0.1395F, -0.0038F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(115, 49).mirror().addBox(-0.9845F, -0.4649F, 2.7291F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 87).mirror().addBox(-0.9845F, -0.4649F, 1.7291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.2373F, -0.1557F, -0.0153F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(97, 54).mirror().addBox(-0.9768F, -0.3529F, 0.7646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 129).mirror().addBox(-0.9705F, -0.353F, 0.2641F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.2991F, -0.1545F, -0.0213F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.4909F, -1.41F, -2.7533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(26, 128).mirror().addBox(-0.4909F, -1.41F, -2.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, 0.0205F, -0.131F, 0.0344F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(113, 5).mirror().addBox(-0.4909F, -0.4913F, -3.0895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, 0.0031F, -0.131F, 0.0344F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(46, 123).mirror().addBox(-0.4638F, -0.6235F, -3.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, 0.2271F, -0.1307F, -0.0095F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(58, 123).mirror().addBox(-0.4638F, -0.0847F, -1.5809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(120, 4).mirror().addBox(-0.4638F, -0.0847F, -2.3809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, -0.5932F, -0.1307F, -0.0095F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(121, 29).mirror().addBox(-0.4638F, 2.2099F, -0.6221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(98, 121).mirror().addBox(-0.4638F, 2.2099F, 0.1529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, -1.8149F, -0.1307F, -0.0095F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(113, 33).mirror().addBox(-1.0638F, -0.1103F, 0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.2884F, -0.157F, -0.0038F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(123, 63).mirror().addBox(0.0579F, -1.1648F, -0.677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 2.6024F, -7.1475F, 0.2534F, -0.1395F, -0.0038F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(16, 111).mirror().addBox(-1.0564F, -0.2394F, 2.1885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 1.5665F, -7.2799F, 0.2369F, -0.1563F, -0.0115F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(126, 29).mirror().addBox(-0.4638F, 1.6706F, -0.9595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, -1.2128F, -0.1307F, -0.0095F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(46, 126).mirror().addBox(-0.4638F, 0.896F, -0.8973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, -1.2477F, -0.1307F, -0.0095F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(127, 15).mirror().addBox(-0.4638F, 0.153F, -0.8078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, -1.335F, -0.1307F, -0.0095F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(127, 18).mirror().addBox(-0.4638F, -0.1001F, -0.6307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(21, 127).mirror().addBox(-0.4638F, -0.1001F, -1.0307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.7635F, 0.5521F, 0.3406F, -2.5567F, -0.1307F, -0.0095F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(126, 69).mirror().addBox(-0.1526F, -0.4638F, -0.6752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 2.6024F, -8.0475F, -1.2741F, -0.1047F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(16, 111).addBox(0.0564F, -0.2394F, 2.1885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.2369F, 0.1563F, 0.0115F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(123, 63).addBox(-1.0579F, -1.1648F, -0.677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.05F, 2.6024F, -7.1475F, 0.2534F, 0.1395F, 0.0038F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(113, 33).addBox(0.0638F, -0.1103F, 0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.2884F, 0.157F, 0.0038F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(98, 121).addBox(-0.5362F, 2.2099F, 0.1529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(121, 29).addBox(-0.5362F, 2.2099F, -0.6221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, -1.8149F, 0.1307F, 0.0095F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(120, 4).addBox(-0.5362F, -0.0847F, -2.3809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(58, 123).addBox(-0.5362F, -0.0847F, -1.5809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, -0.5932F, 0.1307F, 0.0095F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(21, 127).addBox(-0.5362F, -0.1001F, -1.0307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(127, 18).addBox(-0.5362F, -0.1001F, -0.6307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, -2.5567F, 0.1307F, 0.0095F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(127, 15).addBox(-0.5362F, 0.153F, -0.8078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, -1.335F, 0.1307F, 0.0095F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(46, 126).addBox(-0.5362F, 0.896F, -0.8973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, -1.2477F, 0.1307F, 0.0095F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(126, 29).addBox(-0.5362F, 1.6706F, -0.9595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, -1.2128F, 0.1307F, 0.0095F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(46, 123).addBox(-0.5362F, -0.6235F, -3.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, 0.2271F, 0.1307F, 0.0095F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(113, 5).addBox(-0.5091F, -0.4913F, -3.0895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, 0.0031F, 0.131F, -0.0344F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(26, 128).addBox(-0.5091F, -1.41F, -2.9534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(0, 128).addBox(-0.5091F, -1.41F, -2.7533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7635F, 0.5521F, 0.3406F, 0.0205F, 0.131F, -0.0344F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(14, 129).addBox(0.9705F, -0.353F, 0.2641F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 54).addBox(0.9768F, -0.3529F, 0.7646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.2991F, 0.1545F, 0.0213F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(22, 87).addBox(0.9845F, -0.4649F, 1.7291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 49).addBox(0.9845F, -0.4649F, 2.7291F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.2373F, 0.1557F, 0.0153F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(123, 41).addBox(-1.0442F, -0.8636F, -1.5417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.05F, 2.6024F, -7.1475F, -0.1218F, 0.1395F, 0.0038F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(123, 38).addBox(0.066F, -0.0103F, -0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.2186F, 0.157F, 0.0038F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(112, 102).addBox(0.0638F, 0.0111F, 0.9323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.2273F, 0.157F, 0.0038F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(123, 35).addBox(-0.9944F, -0.9736F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.05F, 2.6024F, -7.1475F, 0.2404F, 0.1395F, 0.0038F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(56, 126).addBox(-0.8724F, -0.5315F, -2.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(123, 32).addBox(-0.8724F, -0.5315F, -1.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.85F, 2.6024F, -8.0475F, -0.0524F, 0.1047F, 0.0F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(17, 123).addBox(-0.8724F, -0.12F, -1.251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.85F, 2.6024F, -8.0475F, -1.1606F, 0.1047F, 0.0F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(120, 122).addBox(-0.8724F, 0.9644F, -0.8374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.85F, 2.6024F, -8.0475F, -1.4573F, 0.1047F, 0.0F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(122, 96).addBox(-0.8724F, 0.4364F, -1.2827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.85F, 2.6024F, -8.0475F, -1.117F, 0.1047F, 0.0F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(126, 69).addBox(-0.8474F, -0.4638F, -0.6752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.85F, 2.6024F, -8.0475F, -1.2741F, 0.1047F, 0.0F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(122, 93).addBox(-0.8474F, -0.5672F, -1.1657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.85F, 2.6024F, -8.0475F, -0.0087F, 0.1047F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(81, 112).addBox(-0.5F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0222F, 1.2814F, -3.9072F, 0.2011F, 0.157F, 0.0038F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(120, 119).addBox(0.0638F, -0.4266F, 4.1746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0837F, 1.5665F, -7.2799F, 0.1924F, 0.157F, 0.0038F));

		PartDefinition leftArm = chest2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.552F, 15.2239F, -3.1186F, 1.3029F, 0.1298F, -0.0329F));

		PartDefinition cube_r494 = leftArm.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(122, 8).addBox(-0.5F, 0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 122).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 121).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0263F, 7.4709F, 2.3952F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r495 = leftArm.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(111, 80).addBox(-0.5F, -1.5F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0263F, 6.1105F, 1.7554F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r496 = leftArm.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(73, 114).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 3.2739F, 0.7787F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r497 = leftArm.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(17, 115).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r498 = leftArm.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(111, 113).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6855F, 2.2272F, -0.8712F, -0.8017F, -0.4743F, -0.0768F));

		PartDefinition cube_r499 = leftArm.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(114, 91).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4927F, -0.7657F, -0.944F, 0.0273F, -0.4743F, -0.0768F));

		PartDefinition cube_r500 = leftArm.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(68, 113).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(22, 90).addBox(-0.5909F, 0.3921F, -0.1717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(32, 90).addBox(-0.5909F, 0.3921F, -1.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0815F, 9.2296F, 3.225F, -1.6221F, 0.2408F, 0.0074F));

		PartDefinition cube_r501 = leftArm2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(26, 80).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.0909F, 0.3921F, 0.7783F, -1.2654F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(107, 59).addBox(-0.508F, -0.0675F, -0.0751F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2524F, 9.2921F, -0.8428F, 0.0113F, 0.3165F, 0.1985F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0365F, 0.2495F, 1.7355F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r502 = opposablePinkie.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(17, 119).addBox(-0.5F, -2.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0945F, 1.4152F, -0.0127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm = chest2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.552F, 15.2239F, -3.1186F, 1.5588F, -0.1181F, 0.0474F));

		PartDefinition cube_r503 = rightArm.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(122, 17).addBox(-0.5F, 0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(122, 14).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0263F, 7.4709F, 2.3952F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r504 = rightArm.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(111, 107).addBox(-0.5F, -1.5F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0263F, 6.1105F, 1.7554F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r505 = rightArm.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(114, 86).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 3.2739F, 0.7787F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r506 = rightArm.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(115, 23).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r507 = rightArm.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(7, 114).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6855F, 2.2272F, -0.8712F, -0.8017F, 0.4743F, 0.0768F));

		PartDefinition cube_r508 = rightArm.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(114, 96).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4927F, -0.7657F, -0.944F, 0.0273F, 0.4743F, 0.0768F));

		PartDefinition cube_r509 = rightArm.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(114, 58).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(27, 90).addBox(-0.4091F, 0.3921F, -0.1717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(91, 90).addBox(-0.4091F, 0.3921F, -1.2717F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0815F, 9.2296F, 3.225F, -1.3603F, -0.2408F, -0.0074F));

		PartDefinition cube_r510 = rightArm2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(90, 6).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0909F, 0.3921F, 0.7783F, -1.2654F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(107, 74).addBox(-0.492F, -0.0675F, -0.0751F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2524F, 9.2921F, -0.8428F, 0.0113F, -0.3165F, -0.1985F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0365F, 0.2495F, 1.7355F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r511 = opposablePinkie2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(22, 120).addBox(-0.5F, -2.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0945F, 1.4152F, -0.0127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.8209F, 0.0402F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1211F, 6.7085F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r512 = tail.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(27, 29).mirror().addBox(-3.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1791F, 1.0402F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r513 = tail.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(27, 29).addBox(0.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1791F, 1.0402F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r514 = tail.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(37, 108).addBox(0.0F, 0.3F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9636F, 9.4212F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r515 = tail.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(34, 108).addBox(0.0F, -0.5F, -0.1F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2855F, 7.2495F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(64, 104).addBox(0.0F, -0.4F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9511F, 4.9391F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(35, 119).addBox(0.0F, -3.3635F, 0.001F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7411F, 9.1436F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(32, 119).addBox(0.0F, -3.3132F, 0.0324F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7789F, 7.0783F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(29, 119).addBox(0.0F, -3.4382F, -0.0676F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6677F, 5.1167F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(38, 120).addBox(0.0F, -3.4382F, 0.0324F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7924F, 2.9991F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(78, 114).addBox(0.0F, -3.6382F, 0.0324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, 0.9395F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 10).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2246F, 10.9433F, 0.0088F, -0.1309F, -0.0011F));

		PartDefinition cube_r522 = tail2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r523 = tail2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r524 = tail2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(14, 115).addBox(0.0F, -3.2892F, -0.094F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 8.0557F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(119, 85).addBox(0.0F, -3.3238F, 0.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 6.0557F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r526 = tail2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(73, 119).addBox(0.0F, -3.4228F, -0.0148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5383F, 4.0113F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(70, 119).addBox(0.0F, -3.4228F, -0.0148F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5834F, 1.987F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(67, 119).addBox(0.0F, -3.5228F, -0.0149F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5918F, 0.0557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r529 = tail2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(119, 57).addBox(0.0F, 0.8F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7281F, 7.0841F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r530 = tail2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(107, 114).addBox(0.0F, 0.6F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.973F, 4.5183F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r531 = tail2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(18, 93).addBox(0.0F, 0.4F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9659F, 1.9571F, 0.7592F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(48, 49).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 8.7567F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition cube_r532 = tail3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 1.0F, 0.0055F, 0.052F, -0.002F));

		PartDefinition cube_r533 = tail3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 1.0F, 0.0055F, -0.052F, 0.002F));

		PartDefinition cube_r534 = tail3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(123, 110).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8619F, 6.2454F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r535 = tail3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(0, 116).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6958F, 3.7736F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r536 = tail3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(90, 119).addBox(0.0F, -0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0343F, 1.6306F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r537 = tail3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(108, 123).addBox(0.0F, -2.6F, -0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.608F, 7.0667F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r538 = tail3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(123, 105).addBox(0.0F, -3.2707F, 0.0528F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2428F, 4.8337F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r539 = tail3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(123, 77).addBox(0.0F, -3.0707F, -0.1472F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 3.0491F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r540 = tail3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(87, 119).addBox(0.0F, -3.1819F, -0.3259F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4778F, 1.3491F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(21, 50).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0144F, 7.985F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r541 = tail4.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(46, 97).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 7.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail4.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(109, 128).addBox(0.0F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r543 = tail4.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(8, 124).addBox(0.0F, -2.1F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 3.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r544 = tail4.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(5, 124).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.65F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail4.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(88, 31).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.792F, 9.4302F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r546 = tail4.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(84, 128).addBox(0.0F, 1.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 123).addBox(0.0F, -0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, 5.1031F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r547 = tail4.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(114, 123).addBox(0.0F, -0.3F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5424F, 2.7373F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r548 = tail4.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(111, 123).addBox(0.0F, -0.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6468F, 0.7678F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(52, 10).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0165F, 7.9934F, 0.1761F, 0.2615F, 0.0117F));

		PartDefinition cube_r549 = tail5.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(98, 82).addBox(0.0F, -1.15F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 81).addBox(0.0F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.9F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail5.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(81, 128).addBox(0.0F, -1.225F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail5.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(72, 128).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.9F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail5.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(69, 128).addBox(0.0F, 14.9187F, 27.4081F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 128).addBox(0.0F, 13.9187F, 25.4081F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 109).addBox(0.0F, 12.9187F, 23.4081F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -24.1142F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0062F, 7.9295F, 0.1745F, 0.1745F, 0.0F));

		PartDefinition cube_r553 = tail6.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(104, 74).addBox(0.0F, -1.55F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 87).addBox(0.0F, -1.45F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 101).addBox(0.0F, -1.35F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5938F, -3.0295F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r554 = tail6.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(121, 128).addBox(0.0F, 18.4187F, 31.4081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 128).addBox(0.0F, 17.1187F, 29.4081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5587F, -32.0437F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0125F, 5.9135F, 0.165F, 0.1743F, -0.0092F));

		PartDefinition cube_r555 = tail7.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(115, 128).addBox(0.0F, -1.925F, 11.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 109).addBox(0.0F, -1.725F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5812F, -8.943F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r556 = tail7.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(11, 129).addBox(0.0F, 21.9187F, 37.4081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 129).addBox(0.0F, 20.8187F, 35.4081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 129).addBox(0.0F, 19.6187F, 33.4081F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5713F, -37.9572F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(27, 39).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0273F, 7.9174F, 0.1733F, 0.3896F, -0.0504F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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