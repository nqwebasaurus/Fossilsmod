package fossils.fossils.client.blockentity.model.dakosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DakosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart UpperArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart HandL2;
	private final ModelPart Body2;
	private final ModelPart bone;
	private final ModelPart Body3;
	private final ModelPart body5;
	private final ModelPart Body4;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart Tail;
	private final ModelPart tail5;
	private final ModelPart Tail2;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart Tail4;

	public DakosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Head = this.Neck2.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone2 = this.Body.getChild("bone2");
		this.bone4 = this.Body.getChild("bone4");
		this.UpperArmL = this.Body.getChild("UpperArmL");
		this.HandL = this.UpperArmL.getChild("HandL");
		this.UpperArmL2 = this.Body.getChild("UpperArmL2");
		this.HandL2 = this.UpperArmL2.getChild("HandL2");
		this.Body2 = this.Body.getChild("Body2");
		this.bone = this.Body2.getChild("bone");
		this.Body3 = this.bone.getChild("Body3");
		this.body5 = this.Body3.getChild("body5");
		this.Body4 = this.body5.getChild("Body4");
		this.bone3 = this.Body4.getChild("bone3");
		this.bone5 = this.Body4.getChild("bone5");
		this.UpperLegL = this.Body4.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.UpperLegL2 = this.Body4.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
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

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -18.6F, -1.0F, -0.053F, -0.1664F, 0.3099F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 34).addBox(0.065F, 0.95F, 4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 31).addBox(0.065F, 0.95F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.365F, -3.3567F, -16.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 30).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 0.082F, -15.6629F, -1.5708F, -0.0873F, 1.5708F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 32).addBox(0.065F, -1.05F, 1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.365F, -3.3567F, -16.5159F, -1.4835F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -2.6493F, -16.3944F, 0.0473F, -0.3051F, -0.0142F));

		PartDefinition cube_r4 = Neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 51).addBox(0.565F, 0.75F, 3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, -0.0829F, -0.2575F, -0.1805F));

		PartDefinition cube_r5 = Neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 38).addBox(0.565F, 0.75F, 1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3051F, -4.6331F, 0.2586F, -0.1517F, -0.1054F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.229F, -1.3663F, -1.6664F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.0991F, -1.3663F, -1.6664F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8174F, 0.8379F, 0.2007F, 0.0F, 0.0F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1845F, -0.3353F, -16.4146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone4 = Body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7845F, -0.3353F, -16.4146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.635F, 0.3933F, -15.7659F, -0.733F, 0.5672F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.235F, 0.3933F, -15.7659F, -0.8802F, -0.7494F, 0.2388F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(28, 31).addBox(-0.435F, 0.225F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.135F, -3.0567F, -11.5659F, 0.1141F, 0.2181F, 0.0058F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(27, 0).addBox(-0.435F, 0.3F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 5).addBox(-0.435F, 0.3F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0528F, 0.1307F, -0.0069F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, 0.0333F, 0.1744F, 0.0058F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 21).addBox(0.565F, 0.7F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, -0.0361F, -0.2616F, 0.0094F));

		PartDefinition cube_r7 = body5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 48).addBox(0.565F, 0.7F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 45).addBox(0.565F, 0.7F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.0918F, -0.3042F, -0.0276F));

		PartDefinition cube_r8 = Body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 2.3794F, 1.3642F, -1.5708F, -0.0873F, -1.5708F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(2, 33).addBox(-0.435F, -2.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.6547F, 0.0094F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 30).addBox(0.565F, 0.8F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = Body4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.6414F, 3.1523F, 2.3824F));

		PartDefinition bone5 = Body4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.5115F, 3.1523F, 2.3824F));

		PartDefinition UpperLegL = Body4.addOrReplaceChild("UpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7713F, 2.194F, 1.1951F, 0.1824F, -0.069F, -0.7006F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2006F, 5.8405F, -1.7879F, 0.4039F, 0.106F, -0.6168F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2926F, 3.4146F, -0.1261F, 0.1347F, 0.3724F, 0.072F));

		PartDefinition UpperLegL2 = Body4.addOrReplaceChild("UpperLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6414F, 2.194F, 1.1951F, 0.8805F, 0.069F, 0.7006F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2006F, 5.8405F, -1.7879F, 0.3747F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2926F, 3.4146F, -0.1261F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(42, 6).addBox(-0.435F, 0.3349F, -0.2129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 9).addBox(-0.435F, 0.3349F, 3.4871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, -0.0564F, -0.1307F, 0.0074F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(44, 38).addBox(-0.435F, 0.2F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(42, 12).addBox(-0.435F, 0.222F, -0.1877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 15).addBox(-0.435F, 0.222F, 3.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0148F, -0.1309F, -0.0019F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.435F, 0.2F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(41, 32).addBox(-0.435F, 0.6006F, -0.1433F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 35).addBox(-0.435F, 0.6006F, 3.5567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, -0.0061F, 0.2182F, -0.0013F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(44, 44).addBox(-0.435F, 0.2F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(0, 45).addBox(-0.435F, 0.2F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 48).addBox(-0.435F, 0.2F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0189F, 0.3926F, -0.0072F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(62, 0).addBox(-0.435F, 0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0915F, 0.3042F, -0.0275F));

		PartDefinition cube_r11 = tail9.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 26).addBox(0.565F, 0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2928F, 2.5703F, -0.0894F, 0.3043F, -0.0268F));

		PartDefinition cube_r12 = Tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 51).addBox(0.565F, 1.0475F, 3.6409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Tail4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 41).addBox(0.565F, -0.1657F, 3.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 40).addBox(0.565F, -0.1657F, 1.6585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Tail4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 57).addBox(0.565F, -0.3152F, 1.0301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 56).addBox(0.565F, -0.3152F, -0.6699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.6247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(13, 38).addBox(0.565F, 1.5F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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