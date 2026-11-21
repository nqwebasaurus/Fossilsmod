package fossils.fossils.client.blockentity.model.eomorphippus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EomorphippusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck6;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public EomorphippusFossilFrameModel(ModelPart root) {
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
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck2 = this.chest2.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone4 = this.neck2.getChild("bone4");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck6 = this.neck3.getChild("neck6");
		this.neck4 = this.neck6.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -24.0F, 16.1F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-2.7F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.5F, -19.8F, -13.3F, -0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -4.2F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.5F, -19.8F, -13.3F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.1F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -19.5F, 16.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.589F, 16.4842F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 26).addBox(-0.5F, 0.6014F, 3.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 22).addBox(-0.5F, 0.6014F, -1.2611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 2.9807F, -0.9704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3104F, 0.3733F, 1.5533F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 11.8341F, -1.1484F, -1.8937F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.9246F, 0.5716F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.925F, 0.475F, -0.5247F, 0.0028F, 0.0093F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 2.9807F, -0.9704F, -1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3104F, 0.3733F, 0.8552F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 11.8341F, -1.1484F, -1.5446F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.9246F, 0.5716F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 2.925F, 0.475F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4869F, 2.1826F, -0.6118F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4869F, 2.1826F, -0.6118F, -0.4363F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 20).addBox(-0.5F, 0.5737F, 8.6474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.275F, -4.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.1053F, 0.1727F, 0.006F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 39).addBox(-0.525F, 0.7148F, -0.8846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 36).addBox(-0.525F, 0.7148F, -4.5846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(24, 40).addBox(-0.5F, -0.1311F, -4.1471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3341F, -3.7576F, 0.3319F, 0.0413F, 0.0142F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3466F, -3.8819F, -0.2288F, -0.1275F, 0.0296F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -1.208F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.337F, -3.76F, 0.22F, 0.1278F, 0.0285F));

		PartDefinition cube_r9 = chest2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 45).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0007F, 0.5412F, -0.4209F, 0.2884F, -0.054F, -0.0172F));

		PartDefinition cube_r10 = chest2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 42).addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8485F, -0.2461F, 0.3753F, -0.0122F, -0.0048F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3707F, -3.5804F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 52).addBox(-0.45F, 0.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.4226F, -4.8674F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.856F, 1.0585F, -1.2043F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(-0.2F, 9.0969F, 1.3286F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0436F, -0.2403F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.3345F, 0.8567F, -1.0734F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.4226F, -4.8674F, 0.2955F, -0.0136F, 0.174F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.856F, 1.0585F, -1.7715F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(0.2F, 9.0969F, 1.3286F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0436F, -0.2403F, 0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7822F, -0.0122F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 0.9F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7082F, 1.1713F, -2.4595F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = neck2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7082F, 1.1713F, -2.4595F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.9633F, 0.2291F, -0.2214F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 11).addBox(-0.825F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.8002F, -0.0242F, 0.3322F, -0.1306F, -0.0092F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(58, 10).addBox(-0.5F, 0.0834F, -0.5594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.4889F, 0.2178F, -0.0454F));

		PartDefinition cube_r14 = neck3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(2, 55).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0102F, 0.95F, -0.2492F, 0.2182F, 0.048F, 0.0F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 53).addBox(-0.55F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, 0.6F, -1.6F, 0.0F, 0.048F, 0.0F));

		PartDefinition neck6 = neck3.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0194F, -2.9276F, -0.5094F, 0.1733F, 0.0646F));

		PartDefinition cube_r16 = neck6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 59).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1593F, 0.9273F, -0.275F, 0.1745F, 0.0F, 0.1745F));

		PartDefinition cube_r17 = neck6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(56, 57).addBox(-0.6F, -0.5F, -1.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition neck4 = neck6.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4911F, -3.0665F, 0.2114F, 0.0769F, 0.282F));

		PartDefinition cube_r18 = neck4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 20).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1F, -1.75F, 0.0F, 0.0873F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(46, 73).addBox(-0.5F, 0.5931F, -2.0175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0042F, -1.8069F, 0.2727F, 0.1261F, 0.0352F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1523F, -1.73F, -0.1132F, 0.2184F, 0.3159F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7791F, 4.6615F, -4.5745F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7791F, 4.6615F, -4.5745F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.7291F, -1.4696F, 1.6668F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(18, 53).addBox(-0.5F, 0.5F, 0.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.5149F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 75).addBox(-0.55F, 0.45F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.2256F, 0.2555F, -0.0579F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(56, 52).addBox(-0.5F, 0.45F, -0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.2409F, 0.3398F, -0.0817F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(54, 5).addBox(-0.5F, 0.3807F, -0.299F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.414F, 0.2406F, -0.1043F));

		PartDefinition cube_r19 = tail4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 7).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 1.2307F, 2.551F, 0.2367F, 0.1024F, 0.0218F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(47, 57).addBox(-0.5F, -0.2193F, 0.051F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5587F, 2.7481F, 0.3604F, 0.2457F, 0.0914F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(59, 23).addBox(-0.425F, -0.4693F, -0.624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.075F, 0.4943F, 0.2316F, 0.1231F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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