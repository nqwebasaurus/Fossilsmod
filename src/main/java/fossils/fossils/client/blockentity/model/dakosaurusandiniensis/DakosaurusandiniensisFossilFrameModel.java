package fossils.fossils.client.blockentity.model.dakosaurusandiniensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DakosaurusandiniensisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart UpperArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart HandL2;
	private final ModelPart Body2;
	private final ModelPart bone;
	private final ModelPart Body3;
	private final ModelPart body5;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart Body4;
	private final ModelPart Tail;
	private final ModelPart tail5;
	private final ModelPart Tail2;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart Tail4;

	public DakosaurusandiniensisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Head = this.Neck2.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone2 = this.Body.getChild("bone2");
		this.bone5 = this.Body.getChild("bone5");
		this.UpperArmL = this.Body.getChild("UpperArmL");
		this.HandL = this.UpperArmL.getChild("HandL");
		this.UpperArmL2 = this.Body.getChild("UpperArmL2");
		this.HandL2 = this.UpperArmL2.getChild("HandL2");
		this.Body2 = this.Body.getChild("Body2");
		this.bone = this.Body2.getChild("bone");
		this.Body3 = this.bone.getChild("Body3");
		this.body5 = this.Body3.getChild("body5");
		this.bone3 = this.body5.getChild("bone3");
		this.bone4 = this.body5.getChild("bone4");
		this.UpperLegL = this.body5.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.UpperLegL2 = this.body5.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
		this.Body4 = this.body5.getChild("Body4");
		this.Tail = this.Body4.getChild("Tail");
		this.tail5 = this.Tail.getChild("tail5");
		this.Tail2 = this.tail5.getChild("Tail2");
		this.tail6 = this.Tail2.getChild("tail6");
		this.Tail3 = this.tail6.getChild("Tail3");
		this.tail7 = this.Tail3.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.Tail4 = this.tail9.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -18.6F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-1, 27).addBox(0.2F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.175F, 0.0758F, -16.5654F, -1.5708F, -0.0873F, 1.5708F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 30).addBox(0.04F, -0.55F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.365F, -1.8624F, -16.7852F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 28).addBox(0.04F, 0.95F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.365F, -3.3567F, -16.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -2.6493F, -16.3944F, -0.025F, -0.1745F, 0.0043F));

		PartDefinition cube_r4 = Neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 2).addBox(0.565F, 0.75F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 0).addBox(0.565F, 0.75F, 3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, -0.2357F, -0.1736F, 0.0182F));

		PartDefinition cube_r5 = Neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 25).addBox(0.565F, 0.75F, 1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5975F, -4.5511F, 0.2779F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.904F, -1.3663F, -1.6664F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.7741F, -1.3663F, -1.6664F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8174F, 0.8379F, 0.4538F, 0.0F, 0.0F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2716F, 0.6609F, -16.4146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone5 = Body.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8716F, 0.6609F, -16.4146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5684F, 0.6902F, -17.1263F, -0.733F, 0.5672F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1684F, 0.6902F, -17.1263F, -0.733F, -0.5672F, 0.0F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(28, 25).addBox(-0.435F, 0.225F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 29).addBox(-0.435F, 0.225F, 4.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.135F, -3.0567F, -11.5659F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 20).addBox(-0.435F, 0.3F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, 0.0415F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 17).addBox(0.565F, 0.675F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 10).addBox(0.565F, 0.675F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, 0.0611F, 0.0436F, 0.0027F));

		PartDefinition cube_r7 = body5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 45).addBox(-0.2F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 2.8161F, 2.0953F, -1.5708F, 0.0087F, -1.5708F));

		PartDefinition cube_r8 = body5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 48).addBox(0.565F, -2.625F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.0F, 1.0097F, -0.0456F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 46).addBox(0.565F, -0.625F, -0.175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 1.0097F, 0.2544F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone3 = body5.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 4.0787F, 3.2184F, 0.0352F, 0.0F, 0.0F));

		PartDefinition bone4 = body5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5115F, 4.0787F, 3.2184F, 0.0352F, 0.0F, 0.0F));

		PartDefinition UpperLegL = body5.addOrReplaceChild("UpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.68F, 2.1913F, 1.7854F, 0.9422F, 0.3885F, -1.0008F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2006F, 5.8405F, -1.7879F, 0.3747F, -0.1872F, 0.0677F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2926F, 3.4146F, -0.1261F, 0.1262F, 0.1128F, 0.037F));

		PartDefinition UpperLegL2 = body5.addOrReplaceChild("UpperLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.55F, 2.1913F, 1.7854F, 0.6893F, 0.0463F, 0.7021F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2006F, 5.8405F, -1.7879F, 0.3747F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2926F, 3.4146F, -0.1261F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.1243F, 0.1732F, 0.0215F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 5).addBox(0.59F, 0.75F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 0).addBox(0.59F, 0.75F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(31, 39).addBox(-0.435F, 0.2849F, -0.0379F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, 0.0121F, 0.2176F, -0.0163F));

		PartDefinition cube_r11 = Tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 42).addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.285F, 0.7849F, 3.8121F, 0.0F, 0.1396F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 41).addBox(-0.435F, 0.15F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0179F, 0.2181F, 0.0039F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(41, 22).addBox(-0.435F, 0.147F, 0.0123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0147F, 0.0F, 0.0F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(41, 28).addBox(-0.41F, 0.1F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 30).addBox(-0.41F, 0.1F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 34).addBox(-0.46F, 0.5006F, 0.0567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, -0.006F, 0.0434F, -0.0439F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(42, 40).addBox(-0.41F, 0.1F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r12 = tail7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 43).addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.26F, 0.6F, 3.45F, 0.0F, 0.2182F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(51, 5).addBox(-0.435F, 0.6F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4999F, 4.0087F, -0.1006F, 0.2498F, -0.1534F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(23, 64).addBox(-0.435F, 0.5F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1096F, 2.9801F, -0.2464F, 0.127F, -0.0318F));

		PartDefinition cube_r13 = tail9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 80).addBox(0.565F, 0.675F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6928F, 2.5703F, 0.0456F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Tail4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 49).addBox(0.565F, 1.1811F, 1.6197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.4394F, 5.5497F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 61).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 5.4067F, 6.5718F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Tail4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 60).addBox(0.565F, 0.6347F, -0.2036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.4394F, 5.5497F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Tail4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 64).addBox(0.565F, -0.3152F, -0.0949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Tail4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 36).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 3.7683F, 2.8775F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Tail4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 32).addBox(0.565F, 1.475F, 0.825F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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