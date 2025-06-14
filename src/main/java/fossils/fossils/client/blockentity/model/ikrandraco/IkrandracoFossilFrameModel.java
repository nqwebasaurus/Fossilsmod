package fossils.fossils.client.blockentity.model.ikrandraco;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IkrandracoFossilFrameModel extends SkullModelBase {
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
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart leftWing7;
	private final ModelPart leftWing8;
	private final ModelPart leftWing9;
	private final ModelPart hand4;
	private final ModelPart leftWing10;
	private final ModelPart leftWing11;
	private final ModelPart leftWing12;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;
	private final ModelPart throat2;

	public IkrandracoFossilFrameModel(ModelPart root) {
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
		this.rightWing = this.body.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.leftWing7 = this.body.getChild("leftWing7");
		this.leftWing8 = this.leftWing7.getChild("leftWing8");
		this.leftWing9 = this.leftWing8.getChild("leftWing9");
		this.hand4 = this.leftWing9.getChild("hand4");
		this.leftWing10 = this.leftWing9.getChild("leftWing10");
		this.leftWing11 = this.leftWing10.getChild("leftWing11");
		this.leftWing12 = this.leftWing11.getChild("leftWing12");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
		this.throat2 = this.throat.getChild("throat2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -9.4833F, 7.7016F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.1838F, -0.3429F, 1.5708F, -1.5272F, -1.5708F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.8F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.5F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6841F, 0.0793F, -0.7585F, 1.1081F, 0.241F, -0.4837F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 1.5F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5443F, 5.1156F, -0.3242F, 0.6311F, -0.1125F, 0.2359F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3964F, 5.429F, 0.6618F, 0.8759F, 0.1092F, 0.0114F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6841F, 0.0793F, -0.7585F, 1.3283F, -0.4823F, 0.5938F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 1.5F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5443F, 5.1156F, -0.3242F, 0.4129F, 0.1125F, -0.2359F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3964F, 5.429F, 0.6618F, 0.7014F, -0.1092F, -0.0114F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0046F, 0.6181F, -0.1787F, -0.2148F, 0.0385F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 35).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5688F, 0.302F, 0.4712F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.6736F, -1.5152F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 19).addBox(-2.0F, 0.1F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6861F, -2.9612F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 19).addBox(-1.0F, 0.6F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.7236F, -5.6152F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightWing = body.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.193F, 2.3287F, -4.1283F, 0.1818F, -0.5924F, 2.1696F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1659F, 4.1453F, 0.9763F, -0.9F, 0.4796F, -0.1773F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5012F, 7.4876F, -0.8952F, 0.3502F, 0.021F, -0.1285F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0727F, 5.1954F, 0.0319F, 1.3389F, -0.0277F, 3.1329F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5228F, 5.7039F, 0.6545F, -1.2806F, 0.2298F, -0.0283F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5788F, 0.2961F, 8.6346F, -0.0147F, 0.1799F, 0.0338F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0105F, -0.0194F, 8.0291F, 0.3851F, 0.1285F, 0.0201F));

		PartDefinition leftWing7 = body.addOrReplaceChild("leftWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.193F, 2.3287F, -4.1283F, 0.1526F, 0.5996F, -2.2216F));

		PartDefinition leftWing8 = leftWing7.addOrReplaceChild("leftWing8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1659F, 4.1453F, 0.9763F, -0.9F, -0.4796F, 0.1773F));

		PartDefinition leftWing9 = leftWing8.addOrReplaceChild("leftWing9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5012F, 7.4876F, -0.8952F, 0.3502F, -0.021F, 0.1285F));

		PartDefinition hand4 = leftWing9.addOrReplaceChild("hand4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0727F, 5.1954F, 0.0319F, 1.4247F, -0.145F, -3.1076F));

		PartDefinition leftWing10 = leftWing9.addOrReplaceChild("leftWing10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5228F, 5.7039F, 0.6545F, -1.264F, -0.3967F, -0.0256F));

		PartDefinition leftWing11 = leftWing10.addOrReplaceChild("leftWing11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5788F, 0.2961F, 8.6346F, -0.0147F, -0.1799F, -0.0338F));

		PartDefinition leftWing12 = leftWing11.addOrReplaceChild("leftWing12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0105F, -0.0194F, 8.0291F, 0.3851F, -0.1285F, -0.0201F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1563F, -5.2673F, 0.132F, 0.1298F, 0.0172F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4538F, -4.3128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0038F, -4.1628F, 0.4749F, 0.4151F, 0.3708F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, -1).addBox(0.0F, 0.6F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.7953F, -2.8964F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4953F, -2.6964F, 0.7922F, 0.2465F, -0.0613F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.45F, -1.875F, 0.6109F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.15F, -5.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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