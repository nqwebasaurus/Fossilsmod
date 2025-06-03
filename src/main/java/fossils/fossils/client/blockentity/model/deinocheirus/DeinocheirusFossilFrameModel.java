package fossils.fossils.client.blockentity.model.deinocheirus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DeinocheirusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck2;
	private final ModelPart neck9;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
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

	public DeinocheirusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body2 = this.body4.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck7 = this.neck3.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck2 = this.neck8.getChild("neck2");
		this.neck9 = this.neck2.getChild("neck9");
		this.neck = this.neck9.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -41.0F, 0.0F, 1.0F, 41.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(2.4F, -46.0F, -34.0F, 1.0F, 46.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -33.4F, -33.5F, 0.0F, 0.0F, -1.6144F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(6.5F, -7.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -34.0F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.288F, 1.5877F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 1.0F, 1.0F, 1.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1F, -6.1F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.2496F, -5.0564F, -0.3905F, -0.0973F, -0.007F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(134, 9).addBox(-0.5F, 0.8F, 5.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.5F, -8.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(105, 0).addBox(-0.5F, -1.9061F, -7.5605F, 1.0F, 3.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.5F, -0.4887F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9556F, -2.9736F, -10.6848F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 120).addBox(-5.4556F, -1.4305F, -6.123F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body2 = body4.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 80).addBox(-5.4556F, -1.4305F, -7.123F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1448F, -5.6004F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(127, 0).addBox(-5.4556F, -1.4305F, -6.123F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.2F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9556F, 0.1124F, -5.8308F, -0.0913F, -0.083F, 0.0512F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 64).addBox(-0.5F, 0.9F, -9.8F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2074F, 9.7513F, -13.1243F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2074F, 9.7513F, -13.1243F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9964F, 10.1957F, -12.1282F, -0.8065F, 0.5711F, -0.7857F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2076F, 2.3638F, 14.9111F, 0.281F, -0.3263F, -0.1036F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0532F, 9.0401F, 0.7037F, 0.4367F, 0.0057F, 0.3489F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0644F, 2.0906F, 0.0136F, -0.2084F, -0.0651F, -0.2986F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0945F, 2.0376F, 1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0945F, 2.0544F, 1.7439F, 0.1249F, 0.0393F, -0.303F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9964F, 10.1957F, -12.1282F, -0.7273F, -0.5404F, 0.6359F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2076F, 2.3638F, 14.9111F, 0.3029F, 0.4935F, 0.1583F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0532F, 9.0401F, 0.7037F, 0.4367F, -0.0057F, -0.3489F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0644F, 2.0906F, 0.0136F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0945F, 2.0376F, 1.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0945F, 2.0544F, 1.7439F, 0.1249F, -0.0393F, 0.303F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4685F, -9.6561F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(139, 130).addBox(-0.5F, 1.1F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.19F, -4.1486F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(149, 112).addBox(-0.5F, 0.1583F, -0.1835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(146, 109).addBox(-0.5F, 0.1583F, -3.8835F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2F, 0.2F, -0.2705F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9054F, -3.3566F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(149, 119).addBox(-0.5F, 0.6F, 10.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(146, 116).addBox(-0.5F, 0.6F, 7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.0286F, -8.5275F, -0.6283F, 0.0F, 0.0F));

		PartDefinition neck7 = neck3.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9763F, -2.9274F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(70, 138).addBox(-0.5F, 0.6F, 5.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 134).addBox(-0.5F, 0.6F, 1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.0F, -4.4F, -0.6283F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3015F, -4.371F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 138).addBox(-0.5F, 0.6F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 134).addBox(-0.5F, 0.6F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.7F, 0.1F, -0.6283F, 0.0F, 0.0F));

		PartDefinition neck2 = neck8.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5755F, -2.8038F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(155, 56).addBox(-0.5F, 1.0F, 6.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(153, 54).addBox(-0.5F, 1.0F, 4.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.9091F, -5.1F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck9 = neck2.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1265F, -2.6012F, -0.4331F, -0.0552F, -0.1188F));

		PartDefinition cube_r16 = neck9.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(143, 19).addBox(-0.5F, 0.8F, 3.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -5.5F, -4.7F, -0.6807F, 0.0F, 0.0F));

		PartDefinition neck = neck9.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4655F, -2.9692F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(142, 77).addBox(-0.5F, 0.6F, 3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9F, -6.1F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9651F, -3.2791F, 0.3914F, 0.0334F, -0.0807F));

		PartDefinition cube_r18 = neck6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 156).addBox(-0.5F, 0.6F, -2.95F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r19 = neck6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 146).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0012F, -0.0349F, 0.0175F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5194F, -5.9931F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.2F, -0.0052F, -1.304F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2F, -0.0052F, -1.304F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.3028F, -0.9573F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4099F, 0.4787F, -1.4188F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4099F, 0.4787F, -1.4188F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(57, 64).addBox(-0.5F, -0.0164F, -0.4023F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.3217F, 8.8445F, -0.2515F, -0.1162F, 0.0744F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.1015F, -0.1488F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0118F, 11.6812F, -0.1489F, -0.0863F, 0.0129F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(71, 32).addBox(-0.5F, 0.0468F, -0.2545F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0617F, 12.577F, 0.1865F, 0.1132F, 0.1093F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.5006F, -1.0791F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4321F, 11.8672F, 0.1876F, 0.2145F, 0.0404F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(89, 48).addBox(-0.5F, 0.3185F, 0.4203F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 57).addBox(-0.5F, 0.3185F, 11.1203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0474F, 14.0963F, 0.0568F, 0.1866F, -0.1616F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(110, 63).addBox(-0.5F, 0.2408F, -0.0336F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0153F, 11.7175F, -0.1085F, 0.3352F, -0.2006F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(122, 31).addBox(-0.5F, 0.2528F, -0.3182F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0023F, 7.8935F, -0.0944F, 0.3911F, -0.0361F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(99, 31).addBox(-0.5F, 0.6F, -0.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2879F, 7.0366F, -0.2875F, 0.4205F, -0.1201F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -5.0892F, -0.4302F, -0.7847F, -0.0124F, 0.0054F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 18.727F, 0.9851F, -0.5061F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.1775F, 18.7351F, -0.9076F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.7978F, 8.0698F, -1.1083F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0174F, 3.9015F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -5.0892F, -0.4302F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 18.727F, 0.9851F, -0.6824F, 0.02F, 0.0075F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.1775F, 18.7351F, -1.1257F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.7978F, 8.0698F, -1.1519F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0174F, 3.9015F));

		return LayerDefinition.create(meshdefinition, 185, 185);
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