package fossils.fossils.client.blockentity.model.obdurodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ObdurodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart thumbToe;
	private final ModelPart thumbToe2;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart thumbToe3;
	private final ModelPart thumbToe4;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftBill;
	private final ModelPart rightBill;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ObdurodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.thumbToe = this.leftLeg3.getChild("thumbToe");
		this.thumbToe2 = this.thumbToe.getChild("thumbToe2");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.thumbToe3 = this.rightLeg3.getChild("thumbToe3");
		this.thumbToe4 = this.thumbToe3.getChild("thumbToe4");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.bone4 = this.chest.getChild("bone4");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftBill = this.head.getChild("leftBill");
		this.rightBill = this.head.getChild("rightBill");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.0906F, 12.1881F, 0.7873F, -0.0561F, -0.0669F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5F, 0.6F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.6921F, -1.7F, -1.5708F, 0.0698F, 1.5708F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5F, -3.4F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -1.6406F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7723F, 1.0161F, -1.6323F, 1.0056F, -0.7646F, -1.7481F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0226F, 5.0256F, -2.5975F, 0.9156F, 0.3475F, -0.2922F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1891F, 5.3858F, -2.3537F, -1.1714F, 1.2082F, -0.7185F));

		PartDefinition thumbToe = leftLeg3.addOrReplaceChild("thumbToe", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.8557F, -0.0179F));

		PartDefinition thumbToe2 = thumbToe.addOrReplaceChild("thumbToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9201F, 0.3151F, -0.2904F, 0.3553F, 0.1523F, 0.0829F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1015F, 2.7488F, -0.1784F, 1.9633F, -0.0915F, 0.0111F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7723F, 1.0161F, -1.6323F, 1.0151F, 0.8246F, 1.7679F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0226F, 5.0256F, -2.5975F, 0.8725F, 0.0091F, 0.4076F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1891F, 5.3858F, -2.3537F, -1.0841F, -1.2082F, 0.7185F));

		PartDefinition thumbToe3 = rightLeg3.addOrReplaceChild("thumbToe3", CubeListBuilder.create(), PartPose.offset(1.0F, 1.8557F, -0.0179F));

		PartDefinition thumbToe4 = thumbToe3.addOrReplaceChild("thumbToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9201F, 0.3151F, -0.2904F, 0.0498F, -0.1523F, -0.0829F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1015F, 2.7488F, -0.1784F, 1.6142F, 0.0915F, -0.0111F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.63F, 1.1266F, -3.0029F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.63F, 1.1266F, -3.0029F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.63F, 0.3757F, 0.3191F, -0.48F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, -0.0831F, 0.0872F, -0.0034F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 21).addBox(-0.5F, 0.9F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0504F, -4.0954F, -0.3105F, 0.0859F, -0.0156F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 38).addBox(-0.5F, 0.6255F, -3.2935F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 24).addBox(-0.5F, 0.45F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 21).addBox(-0.5F, 0.45F, -3.425F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -6.6F, 0.1922F, 0.0428F, 0.0083F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 37).addBox(-0.5F, -0.3116F, -2.769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6329F, -0.0474F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 0).addBox(1.1F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.7728F, -6.0076F, 1.5708F, -0.2356F, 1.5708F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 3).addBox(-0.5F, -4.449F, -4.6169F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.209F, -2.802F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.551F, -5.2169F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.209F, -2.802F, 0.6283F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8645F, 3.8481F, -5.8625F, 0.8306F, 0.1059F, -0.4192F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8645F, 3.8481F, -5.8625F, 0.8306F, -0.1059F, 0.4192F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5582F, 1.7379F, -3.8506F, 0.8306F, -0.1059F, 0.4192F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1015F, 5.7173F, -6.775F, 0.4348F, -0.7903F, -1.5602F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9858F, 3.2352F, 1.6846F, -0.6354F, 0.5188F, 0.9704F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5617F, 5.03F, -0.2963F, 1.726F, -0.0403F, 0.223F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0061F, 1.7111F, -0.0893F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1015F, 5.7173F, -6.775F, 0.2231F, 0.6924F, 1.5617F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9858F, 3.2352F, 1.6846F, 1.8926F, -0.3109F, -2.1659F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5617F, 5.03F, -0.2963F, -0.185F, -0.0271F, -0.2191F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0061F, 1.7111F, -0.0893F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3337F, -6.6944F, 0.8033F, 0.0303F, 0.0314F));

		PartDefinition cube_r11 = neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(69, 73).addBox(-0.5F, -0.3F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 73).addBox(-0.5F, -0.3F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2907F, -0.6886F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.4319F, 0.1279F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8734F, -2.5439F, -1.7562F, -0.119F, 0.0871F));

		PartDefinition leftBill = head.addOrReplaceChild("leftBill", CubeListBuilder.create(), PartPose.offset(0.9567F, 4.6818F, -6.1173F));

		PartDefinition rightBill = head.addOrReplaceChild("rightBill", CubeListBuilder.create(), PartPose.offset(-0.9567F, 4.6818F, -6.1173F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 4.5418F, -10.1604F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 4.5418F, -10.1604F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.33F, 0.2807F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, 0.6503F, -0.0853F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2927F, 1.7764F, -0.2716F, -0.0829F, 0.027F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, 0.1793F, -0.512F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 30).addBox(-0.5F, 0.1793F, 3.188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4227F, 4.882F, 0.2271F, -0.0871F, -0.0046F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 27).addBox(-0.5F, 0.6F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 30).addBox(-0.5F, 0.6F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4587F, 4.0098F, 0.2024F, -0.1283F, -0.0262F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0197F, 3.9622F, 0.2009F, -0.0428F, -0.0087F));

		return LayerDefinition.create(meshdefinition, 84, 84);
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