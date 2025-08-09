package fossils.fossils.client.blockentity.model.xinpusaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class XinpusaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Xinpusaurus;
	private final ModelPart Chest;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Hip;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RFoot;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart RFoot2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public XinpusaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Xinpusaurus = this.fossil.getChild("Xinpusaurus");
		this.Chest = this.Xinpusaurus.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone = this.Head.getChild("bone");
		this.bone2 = this.Head.getChild("bone2");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Chest.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Chest.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Hip = this.Xinpusaurus.getChild("Hip");
		this.RLeg = this.Hip.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RFoot = this.RLeg2.getChild("RFoot");
		this.RLeg3 = this.Hip.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.RFoot2 = this.RLeg4.getChild("RFoot2");
		this.Tail = this.Hip.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Xinpusaurus = fossil.addOrReplaceChild("Xinpusaurus", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5F, -2.0F, -6.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.0373F, 0.2867F, -0.4473F));

		PartDefinition Chest = Xinpusaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.275F, -6.0F, -0.0117F, 0.3515F, 0.0929F));

		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 62).addBox(-0.5F, 0.45F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 57).addBox(-0.5F, 0.45F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.275F, -6.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 55).addBox(-1.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.7557F, -2.7691F, -1.5708F, 0.0698F, -1.5708F));

		PartDefinition cube_r3 = Chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 60).addBox(-0.5F, -3.55F, 0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.275F, -6.0F, -1.501F, 0.0F, 0.0F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(64, 22).addBox(-0.5F, 0.35F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4144F, -6.1311F, -0.139F, 0.3205F, 0.1478F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, -0.2322F, 0.2618F, -0.0036F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.0106F, -0.3781F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.0106F, -0.3781F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.825F, 0.5535F, 0.48F, 0.0F, 0.0F));

		PartDefinition RArm = Chest.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 3.775F, -3.0F, 1.435F, -1.3977F, 0.2694F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 1.0F, 0.0F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RArm3 = Chest.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 3.775F, -3.0F, 1.435F, 1.3977F, -0.2694F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 1.0F, 0.0F, -0.0681F, -0.298F, 0.2284F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Hip = Xinpusaurus.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1445F, 6.9007F, 0.0484F, -0.2615F, -0.0125F));

		PartDefinition cube_r4 = Hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 53).addBox(-0.5F, -0.05F, 8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 45).addBox(-0.5F, -0.05F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 48).addBox(-0.7F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.0394F, 6.4102F, -1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r6 = Hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 52).addBox(-0.5F, -7.05F, 0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -1.6232F, 0.0F, 0.0F));

		PartDefinition RLeg = Hip.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 3.2F, 6.0F, 0.1191F, -0.9437F, 0.9242F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offset(3.1808F, 0.0F, 0.2736F));

		PartDefinition RLeg3 = Hip.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 3.2F, 6.0F, 0.1191F, 0.9437F, -0.9242F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition RFoot2 = RLeg4.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offset(-3.1808F, 0.0F, 0.2736F));

		PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7277F, 9.3996F, 0.0929F, -0.2166F, 0.0508F));

		PartDefinition cube_r7 = Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 42).addBox(-0.5F, 0.4F, 11.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(35, 31).addBox(-0.5F, 0.4F, -0.025F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(27, 45).addBox(-0.5F, 0.05F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6921F, 11.5249F, 0.0393F, 0.4796F, 0.0182F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 15).addBox(-0.5F, 0.25F, 15.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2244F, 9.9996F, 0.0839F, 0.5232F, 0.0201F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 15.9F, 0.1309F, 0.48F, 0.0F));

		PartDefinition cube_r8 = Tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.35F, -0.6F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.1396F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 93, 93);
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