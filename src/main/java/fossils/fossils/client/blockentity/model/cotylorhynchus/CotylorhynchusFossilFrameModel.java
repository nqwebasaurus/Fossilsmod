package fossils.fossils.client.blockentity.model.cotylorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CotylorhynchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart bodyCentreFront;
	private final ModelPart shoulder;
	private final ModelPart legFrontL;
	private final ModelPart legFrontLLower;
	private final ModelPart legFrontLFoot;
	private final ModelPart legFrontL2;
	private final ModelPart legFrontLLower2;
	private final ModelPart legFrontLFoot2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart skullTop;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart skullJaw;
	private final ModelPart rump;
	private final ModelPart bodyBack;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart legBackL3;
	private final ModelPart legBackLLower3;
	private final ModelPart legBackLFoot3;
	private final ModelPart legBackL2;
	private final ModelPart legBackLLower2;
	private final ModelPart legBackLFoot2;

	public CotylorhynchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.bodyCentreFront = this.main.getChild("bodyCentreFront");
		this.shoulder = this.bodyCentreFront.getChild("shoulder");
		this.legFrontL = this.shoulder.getChild("legFrontL");
		this.legFrontLLower = this.legFrontL.getChild("legFrontLLower");
		this.legFrontLFoot = this.legFrontLLower.getChild("legFrontLFoot");
		this.legFrontL2 = this.shoulder.getChild("legFrontL2");
		this.legFrontLLower2 = this.legFrontL2.getChild("legFrontLLower2");
		this.legFrontLFoot2 = this.legFrontLLower2.getChild("legFrontLFoot2");
		this.neck = this.shoulder.getChild("neck");
		this.head = this.neck.getChild("head");
		this.skullTop = this.head.getChild("skullTop");
		this.leftFace = this.skullTop.getChild("leftFace");
		this.rightFace = this.skullTop.getChild("rightFace");
		this.skullJaw = this.skullTop.getChild("skullJaw");
		this.rump = this.bodyCentreFront.getChild("rump");
		this.bodyBack = this.rump.getChild("bodyBack");
		this.tail1 = this.bodyBack.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.legBackL3 = this.bodyBack.getChild("legBackL3");
		this.legBackLLower3 = this.legBackL3.getChild("legBackLLower3");
		this.legBackLFoot3 = this.legBackLLower3.getChild("legBackLFoot3");
		this.legBackL2 = this.bodyBack.getChild("legBackL2");
		this.legBackLLower2 = this.legBackL2.getChild("legBackLLower2");
		this.legBackLFoot2 = this.legBackLLower2.getChild("legBackLFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, 1.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.3F, -17.5F, -17.5F, 0.0F, 0.0611F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-9.4F, -7.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, -17.5F, -17.5F, -0.0611F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-7.9F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -17.5F, 17.3F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, 3.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.0F, -17.5F, 17.3F, 0.0F, -0.2182F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.0F, -4.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront = main.addOrReplaceChild("bodyCentreFront", CubeListBuilder.create(), PartPose.offset(0.5F, -17.4581F, 8.7919F));

		PartDefinition bodyCentreFront_r1 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r1", CubeListBuilder.create().texOffs(0, 70).addBox(-1.7F, 0.7886F, 0.1331F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 0.3839F, -5.4494F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r2 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r2", CubeListBuilder.create().texOffs(87, 7).addBox(-1.7F, 0.8505F, 0.2367F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 0.5839F, -10.4494F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r3 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r3", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5F, -0.1806F, -0.5519F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6F, -16.0999F, 0.1745F, 0.0F, 0.0F));

		PartDefinition shoulder = bodyCentreFront.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.369F, -18.517F, 0.0F, 0.0436F, 0.0F));

		PartDefinition shoulderU_r1 = shoulder.addOrReplaceChild("shoulderU_r1", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, 0.7872F, -0.429F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0461F, -4.5278F, 0.2531F, 0.0F, 0.0F));

		PartDefinition shoulderU_r2 = shoulder.addOrReplaceChild("shoulderU_r2", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -0.0926F, -0.3949F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.4461F, -8.9278F, 0.3229F, 0.0F, 0.0F));

		PartDefinition legFrontL = shoulder.addOrReplaceChild("legFrontL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.9653F, 10.6954F, -4.0368F, 0.0538F, -0.4353F, -0.0895F));

		PartDefinition legFrontLLower = legFrontL.addOrReplaceChild("legFrontLLower", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3294F, 1.2591F, 4.2973F, -0.15F, 0.1062F, -0.0407F));

		PartDefinition legFrontLFoot = legFrontLLower.addOrReplaceChild("legFrontLFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6716F, 5.9642F, 0.4576F, 0.1745F, -0.0873F, 0.0436F));

		PartDefinition legFrontL2 = shoulder.addOrReplaceChild("legFrontL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.9653F, 10.6954F, -4.0368F, -0.1797F, -1.3359F, 0.3496F));

		PartDefinition legFrontLLower2 = legFrontL2.addOrReplaceChild("legFrontLLower2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3294F, 1.2591F, 4.2973F, -0.0613F, 0.3052F, 0.3973F));

		PartDefinition legFrontLFoot2 = legFrontLLower2.addOrReplaceChild("legFrontLFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6716F, 5.9642F, 0.4576F, 0.4829F, 0.6521F, -0.4931F));

		PartDefinition neck = shoulder.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.9186F, -9.9167F, 0.0F, 0.3491F, 0.0F));

		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(87, 0).addBox(0.0F, -0.2741F, 0.1729F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5658F, -3.9073F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck_r2 = neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(107, 76).addBox(0.0F, -0.3177F, -2.5261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5658F, -2.9073F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, 0.6536F, -5.1125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition skullTop = head.addOrReplaceChild("skullTop", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -0.2F, 0.6F, 0.132F, 0.2618F, 0.0F));

		PartDefinition leftFace = skullTop.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.1F, -0.9F));

		PartDefinition rightFace = skullTop.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.5F, -1.1F, -0.9F));

		PartDefinition skullJaw = skullTop.addOrReplaceChild("skullJaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5012F, 0.8717F, -0.6978F, 0.2356F, 0.0F, 0.0F));

		PartDefinition rump = bodyCentreFront.addOrReplaceChild("rump", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1442F, 1.7994F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rump_r1 = rump.addOrReplaceChild("rump_r1", CubeListBuilder.create().texOffs(21, 68).addBox(5.0F, -0.2129F, -0.2778F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.5F, 1.597F, -0.2456F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bodyBack = rump.addOrReplaceChild("bodyBack", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.397F, 8.2544F));

		PartDefinition rump_r2 = bodyBack.addOrReplaceChild("rump_r2", CubeListBuilder.create().texOffs(56, 74).addBox(5.0F, 0.7646F, -0.2715F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.0F, -0.1F, -0.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail1 = bodyBack.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, 5.4F, 0.0F, -0.3054F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(23, 57).addBox(0.0F, 0.8053F, 0.1932F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.1633F, 8.4496F, 0.0F, 0.3054F, 0.0F));

		PartDefinition tail3_r1 = tail2.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(27, 45).addBox(-0.5F, 0.9203F, 0.0153F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3543F, 10.0111F, -0.1396F, 0.3927F, 0.0F));

		PartDefinition tail4_r1 = tail3.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(58, 19).addBox(-0.5F, -2.2F, -0.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(64, 64).addBox(-0.5F, 0.4F, -0.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7824F, 8.9393F, -0.0175F, 0.2182F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, 7.8654F, 0.0873F, 0.3054F, 0.0F));

		PartDefinition tail6_r1 = tail5.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(50, 45).addBox(-0.5F, -2.5995F, -0.514F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.0523F, 0.5977F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3477F, 8.7977F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail6_r2 = tail6.addOrReplaceChild("tail6_r2", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, 0.2844F, -0.2533F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legBackL3 = bodyBack.addOrReplaceChild("legBackL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1551F, 4.5722F, 2.5434F, 0.1026F, -0.0051F, -0.006F));

		PartDefinition legBackLLower3 = legBackL3.addOrReplaceChild("legBackLLower3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8629F, 4.5938F, -7.1683F, -0.3923F, -0.0057F, -0.1308F));

		PartDefinition legBackLFoot3 = legBackLLower3.addOrReplaceChild("legBackLFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6311F, 5.4518F, 0.7962F, 0.4726F, -0.3884F, -0.0542F));

		PartDefinition legBackL2 = bodyBack.addOrReplaceChild("legBackL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1551F, 4.5722F, 2.5434F, 0.079F, 0.9138F, 0.0752F));

		PartDefinition legBackLLower2 = legBackL2.addOrReplaceChild("legBackLLower2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8629F, 4.5938F, -7.1683F, 0.7854F, 0.0F, 0.0F));

		PartDefinition legBackLFoot2 = legBackLLower2.addOrReplaceChild("legBackLFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6311F, 5.4518F, 0.7962F, -0.4928F, 0.079F, -0.0687F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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