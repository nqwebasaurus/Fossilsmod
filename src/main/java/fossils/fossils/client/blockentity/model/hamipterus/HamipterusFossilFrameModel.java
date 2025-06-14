package fossils.fossils.client.blockentity.model.hamipterus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HamipterusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart tail;
	private final ModelPart body;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public HamipterusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.tail = this.main.getChild("tail");
		this.body = this.main.getChild("body");
		this.leftWing = this.body.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.body.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -14.0F, -1.1F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -10.35F, 4.6F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.65F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -10.35F, 4.6F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.9F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -10.5F, -0.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -11.9755F, 4.5829F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, 0.7F, 0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5F, -0.5918F, -1.0584F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6612F, 1.3135F, 0.2698F, 0.0829F, 0.0F, -0.3927F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.0F, -0.4F, 0.4217F, -0.1125F, 0.2359F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4924F, 6.2871F, 0.0886F, -0.1719F, 0.0302F, 0.1719F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6612F, 1.3135F, 0.2698F, 0.432F, 0.0F, 0.3927F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.4F, 0.4653F, 0.1125F, -0.2359F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4924F, 6.2871F, 0.0886F, -0.2611F, -0.0151F, -0.0859F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, 0.2337F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.2418F, 0.6533F, -0.2793F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0011F, -1.1647F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-2, 43).addBox(-1.0F, 0.7F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.444F, -2.5504F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 32).addBox(-1.0F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5F, -0.55F, -4.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftWing = body.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0453F, 0.0848F, -4.1926F, 0.6339F, 0.291F, -0.3159F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2187F, 4.7548F, -0.0313F, -1.3568F, -0.0087F, 0.3943F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4908F, 6.8928F, -1.1621F, 0.5211F, 0.0445F, -0.0123F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4272F, 4.3229F, 0.0392F, 0.0147F, -0.4282F, 2.5392F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1038F, 5.1131F, 1.4041F, 0.8222F, 0.0595F, 0.0639F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0554F, -0.0467F, 7.8438F, 0.2095F, -0.0795F, -0.0228F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0243F, 0.0142F, 6.0192F, 0.2539F, -0.0413F, -0.0169F));

		PartDefinition rightWing = body.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0453F, 0.0848F, -4.1926F, 1.1139F, -0.291F, 0.3159F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2187F, 4.7548F, -0.0313F, -1.3568F, 0.0087F, -0.3943F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4908F, 6.8928F, -1.1621F, 0.5211F, -0.0445F, 0.0123F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4272F, 4.3229F, 0.0392F, 0.1763F, -0.0623F, -1.6649F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1038F, 5.1131F, 1.4041F, 0.9948F, 0.0F, 0.0F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0554F, -0.0467F, 7.8438F, 0.2095F, 0.0795F, 0.0228F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0243F, 0.0142F, 6.0192F, 0.2539F, 0.0413F, 0.0169F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0135F, -4.4967F, -0.6305F, 0.1393F, 0.1976F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 39).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.55F, -1.9F, 0.035F, 0.0698F, 0.0024F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2064F, -1.7843F, -0.3509F, 0.0452F, -0.0025F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 41).addBox(-0.5F, 0.7F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -1.2529F, -2.7561F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 52).addBox(-0.5F, 0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.75F, -3.2F, 0.384F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.6649F, -3.3188F, 0.4966F, -0.1724F, -0.4331F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7985F, -1.6826F, 0.6458F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 68, 68);
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