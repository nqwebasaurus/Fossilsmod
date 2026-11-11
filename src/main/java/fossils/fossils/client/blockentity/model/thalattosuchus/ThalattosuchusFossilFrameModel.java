package fossils.fossils.client.blockentity.model.thalattosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThalattosuchusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone3;
	private final ModelPart bone5;
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

	public ThalattosuchusFossilFrameModel(ModelPart root) {
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
		this.bone3 = this.body5.getChild("bone3");
		this.bone5 = this.body5.getChild("bone5");
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

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -20.2871F, -15.087F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 38).addBox(0.065F, 0.95F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.365F, -1.0567F, -2.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -0.3493F, -2.3944F, 0.0801F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Neck.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 2).addBox(-0.5F, -0.8766F, 2.5382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 0).addBox(-0.5F, -0.8766F, -0.1618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 0.9386F, -3.3702F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Neck.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, -3).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 2.3575F, -1.6658F, -1.5708F, 0.0524F, 1.5708F));

		PartDefinition cube_r4 = Neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -2.0766F, -0.1618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.065F, 0.9386F, -3.1702F, -1.6232F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, -0.3214F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 35).addBox(0.565F, 0.75F, 5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(18, 31).addBox(0.565F, 0.75F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5975F, -4.5511F, -0.2893F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.229F, -1.5413F, -2.1664F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.0991F, -1.5413F, -2.1664F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3239F, -0.1619F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1845F, 1.9647F, -3.6146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone4 = Body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7845F, 1.9647F, -3.6146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5684F, 2.1803F, -4.6736F, -0.6458F, 0.5672F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1684F, 2.1803F, -4.6736F, -0.733F, -0.5672F, 0.0F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(31, 31).addBox(-0.435F, 0.225F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 35).addBox(-0.435F, 0.225F, 4.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.135F, -0.7567F, 2.4341F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(19, 16).addBox(-0.435F, 0.275F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0786F, 0.0435F, -0.0034F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, 0.0067F, 0.0873F, 0.0006F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 6).addBox(0.565F, 0.65F, 7.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(0.565F, 0.65F, -0.15F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, 0.0611F, 0.0436F, 0.0027F));

		PartDefinition cube_r7 = body5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 43).addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 2.6953F, 1.2462F, -1.5708F, -0.0349F, -1.5708F));

		PartDefinition cube_r8 = body5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 45).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.065F, 0.8615F, 0.3097F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 45).addBox(0.565F, 0.65F, 0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone3 = body5.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 4.6136F, 2.2366F, 0.0352F, 0.0F, 0.0F));

		PartDefinition bone5 = body5.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5115F, 4.6136F, 2.2366F, 0.0352F, 0.0F, 0.0F));

		PartDefinition UpperLegL = body5.addOrReplaceChild("UpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1618F, 2.7F, 0.9375F, 1.1994F, 0.2163F, -0.8591F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7987F, 8.6F, -2.3093F, 0.5056F, -0.1872F, 0.0677F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2074F, 2.9146F, 0.3739F, 0.1262F, 0.1128F, 0.037F));

		PartDefinition UpperLegL2 = body5.addOrReplaceChild("UpperLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0318F, 2.7F, 0.9375F, 0.3608F, -0.3364F, 1.0609F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7987F, 8.6F, -2.3093F, 0.7238F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2074F, 2.9146F, 0.3739F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.0003F, 0.0873F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 13).addBox(-0.85F, -0.5305F, -0.1513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.415F, 1.3087F, 5.7004F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 8).addBox(0.565F, 0.725F, -0.125F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(41, 38).addBox(-0.46F, 0.2849F, 0.1121F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, 0.0052F, -0.2182F, -0.0011F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 42).addBox(-0.485F, 0.15F, -0.325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 45).addBox(-0.485F, 0.15F, 3.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0447F, -0.218F, -0.0097F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(28, 42).addBox(-0.435F, 0.147F, 0.0123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0326F, -0.1744F, -0.0057F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(47, 5).addBox(-0.435F, 0.15F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 8).addBox(-0.435F, 0.15F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, 0.0287F, -0.0038F, 0.1308F));

		PartDefinition cube_r12 = Tail3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 29).addBox(-0.45F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 1.0256F, 2.0567F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(39, 44).addBox(-0.435F, 0.15F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 47).addBox(-0.435F, 0.15F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.1513F, -0.1256F, 0.0947F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(49, 11).addBox(-0.435F, 0.6F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4999F, 4.0087F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(61, 37).addBox(-0.435F, 0.425F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1096F, 2.9801F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 81).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.065F, 0.5731F, 1.9918F, -0.4974F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6928F, 2.5703F, 0.1329F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Tail4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 48).addBox(0.565F, 0.6452F, 3.4313F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.4247F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 11).addBox(0.565F, -0.4968F, 2.0168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.4247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Tail4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 63).addBox(0.565F, -0.6199F, 1.3386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 62).addBox(0.565F, -0.6199F, -0.3615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.4247F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Tail4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(34, 5).addBox(0.565F, 1.3F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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