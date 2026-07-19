package fossils.fossils.client.blockentity.model.armadillosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArmadillosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail9;

	public ArmadillosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.head.getChild("crestl2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail9 = this.tail6.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -6.0F, 8.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(2.8F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.7F, -5.2F, -10.5F, 0.48F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, 0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.7F, -5.2F, -10.5F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.1F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -8.5F, 8.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0611F, 7.7618F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 27).addBox(-0.575F, 0.725F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 22).addBox(-0.575F, 0.725F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9149F, 2.043F, 1.3976F, 0.1744F, -0.0076F, 0.0866F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9149F, 2.043F, 1.3976F, 0.1744F, 0.0076F, -0.0866F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.7644F, 0.9725F, 0.7375F, 0.0528F, -0.1877F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 7.2965F, 2.6286F, 0.8226F, -0.064F, 0.0593F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.4856F, 0.473F, 1.5407F, 0.1797F, 0.1692F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.7644F, 0.9725F, 0.6247F, -0.2311F, 0.0606F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 7.2965F, 2.6286F, 0.9536F, -0.0712F, 0.0505F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.4856F, 0.473F, 1.442F, -0.0382F, 0.4338F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(43, 38).addBox(-0.5F, 0.6999F, -5.2122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1997F, -2.9826F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.7F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9192F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, 0.3F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 75).addBox(-0.5F, 0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.1949F, 0.1713F, 0.0336F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0516F, -0.2083F, -2.9595F, -0.0655F, 0.0696F, -0.013F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5457F, 0.8395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5484F, 4.082F, -4.8672F, 1.1972F, 0.1406F, -0.1814F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.2359F, 0.8519F, 0.1134F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 6.0971F, -0.3152F, 1.4366F, 0.1704F, -0.0381F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1069F, -1.9028F, -0.0524F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6516F, 4.082F, -4.8672F, 1.2013F, -0.3481F, 0.2553F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.2359F, 0.8519F, 0.1134F, 0.0F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 6.0971F, -0.3152F, 1.4395F, -0.1308F, 0.0057F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1069F, -1.9028F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7386F, 2.3731F, -3.6473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8418F, 2.3731F, -3.6473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.1928F, 0.3323F, -0.109F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 71).addBox(-0.5F, -0.5F, 2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 69).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0457F, 0.7769F, -2.9599F, 0.1528F, -0.0432F, -0.0058F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.0873F, 0.0444F, -0.0029F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 36).addBox(-0.0457F, 0.6F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(85, 36).addBox(-0.0457F, 0.6F, 2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -2.0022F, -0.0425F, 0.017F, 0.1298F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0019F, -0.0746F, -1.3769F, 0.3615F, 0.1297F, 0.1379F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2116F, -1.5158F, -3.3618F, 0.0989F, 0.0773F, 0.0698F));

		PartDefinition crestl2 = head.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3068F, -1.5158F, -3.3618F, 0.0989F, -0.0773F, -0.0698F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5261F, 0.5959F, -10.8604F, 0.1222F, 0.0173F, 0.0021F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6212F, 0.5959F, -10.8604F, 0.1222F, -0.0173F, -0.0021F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0567F, 1.2577F, 0.3125F, 0.7678F, 0.0003F, 0.0011F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 54).addBox(-0.5F, -0.5F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(26, 50).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, 0.7469F, -0.1213F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(13, 45).addBox(-0.45F, -0.3F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5438F, 4.9252F, -0.1094F, -0.1745F, 0.0038F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.525F, 0.7143F, -0.0638F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.982F, 4.7913F, -0.0386F, -0.222F, -0.0767F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1196F, 5.9509F, -0.0536F, -0.2179F, 0.0116F));

		PartDefinition cube_r9 = tail8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 34).addBox(-0.5F, -0.5F, 4.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 30).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0401F, 1.1F, -0.0996F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(47, 21).addBox(-0.4968F, 0.5015F, 0.0651F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0032F, 0.109F, 4.8057F, 0.1014F, -0.2785F, 0.0052F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 50).addBox(-0.4968F, 0.7F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 54).addBox(-0.4968F, 0.7F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1934F, 4.9757F, 0.0765F, -0.2215F, 0.0542F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(51, 0).addBox(-0.4968F, 0.7F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 4).addBox(-0.4968F, 0.7F, 4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0179F, -0.2181F, 0.0039F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 52).addBox(-0.4218F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -0.0327F, -0.3435F, -0.0631F));

		PartDefinition tail9 = tail6.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.2007F, -0.5142F, -0.0952F));

		PartDefinition cube_r10 = tail9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 12).addBox(-0.525F, -0.5F, -2.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0032F, 0.5466F, 1.4649F, -0.2182F, 0.017F, -0.0038F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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