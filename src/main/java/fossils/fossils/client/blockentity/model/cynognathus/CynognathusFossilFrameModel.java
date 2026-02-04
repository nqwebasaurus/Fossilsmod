package fossils.fossils.client.blockentity.model.cynognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CynognathusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Rightfrontfoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Leftfrontfoot2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart bone4;
	private final ModelPart bone6;

	public CynognathusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Rightfrontfoot2 = this.Rightfrontfoot.getChild("Rightfrontfoot2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Leftfrontfoot2 = this.Leftfrontfoot.getChild("Leftfrontfoot2");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.bone2 = this.Lowerjaw1.getChild("bone2");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone5 = this.rightFace.getChild("bone5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone7 = this.Bodyfront.getChild("bone7");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.bone4 = this.Hips.getChild("bone4");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -12.0F, 10.3F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.525F, -16.0F, -10.4F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.7F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.4F, -2.5F, 20.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -11.0F, -9.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.4F, 5.2F, -0.4929F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8722F, -5.5976F, 0.2638F, 0.0F, 0.0F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(15, 19).addBox(-0.5F, 0.7F, 7.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6573F, -12.9404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0236F, -5.8422F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Belly_r2 = body.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, 0.7F, 3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly_r3 = body2.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(40, 35).addBox(-0.5F, 0.725F, 2.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 32).addBox(-0.5F, 0.725F, -1.175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2092F, -4.0323F, 0.081F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8971F, -3.4476F, 0.0F, 0.0218F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4484F, 4.5452F, -4.0856F, 0.3241F, 0.0636F, -0.3689F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 4.5888F, -0.0398F, -0.2679F, 0.0754F, 0.505F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 0.6979F, -0.0843F, -0.0225F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.3765F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4484F, 4.5452F, -4.0856F, 0.4764F, -0.2125F, 0.53F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 4.5888F, -0.0398F, -1.8418F, 0.1798F, -0.5635F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 1.4833F, 0.0843F, 0.0225F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, 0.1471F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2914F, -6.5663F, -0.2438F, 0.2327F, 0.0321F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(69, 3).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(68, 2).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.281F, -0.588F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6666F, -1.875F, -0.297F, 0.3022F, 0.0848F));

		PartDefinition Neck_r2 = Neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(42, 60).addBox(-0.6F, -0.5F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(42, 60).addBox(-0.6F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0419F, 0.6497F, -1.8749F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0477F, -1.9295F, 0.1428F, 0.0965F, 0.2761F));

		PartDefinition Neck_r3 = Neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(49, 60).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6833F, -1.7615F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0217F, -1.4733F, 0.5583F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -1.1444F, -1.399F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone2 = Lowerjaw1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.3725F, -0.2223F, -1.3661F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.3667F, -1.2203F, -0.1702F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7793F, -1.1299F, -5.1142F, 0.0F, -0.0218F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.3667F, -1.2203F, -0.1702F));

		PartDefinition bone5 = rightFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7793F, -1.1299F, -5.1142F, 0.0F, 0.0218F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7721F, 2.1121F, -4.0421F, 0.3491F, 0.0F, 0.0873F));

		PartDefinition bone7 = Bodyfront.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7721F, 2.1121F, -4.0421F, 0.3491F, 0.0F, -0.0873F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0746F, 2.6279F, -2.1439F, 0.4123F, -0.0982F, -0.2383F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1676F, 5.9336F, 0.2194F, 0.5046F, -0.1266F, 0.1772F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0742F, 4.3358F, 0.1718F, 0.1804F, 0.0156F, -0.0186F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, -0.5356F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0746F, 2.6279F, -2.1439F, 0.7178F, 0.0982F, 0.2383F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1676F, 5.9336F, 0.2194F, 1.1155F, 0.1266F, -0.1772F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0742F, 4.3358F, 0.1718F, 0.3113F, -0.0156F, 0.0186F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, -0.3611F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(37, 38).addBox(-0.5F, 0.2412F, -0.1143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3948F, -0.2011F, -0.1283F, 0.0261F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, 0.1468F, -0.4142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 3).addBox(-0.5F, 0.1468F, 3.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, 0.0061F, -0.1309F, -0.0008F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(36, 48).addBox(-0.5F, 0.1824F, -0.1784F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 50).addBox(-0.5F, 0.1824F, 2.5216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.045F, 3.8928F, 0.1633F, -0.1157F, -0.1067F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.1824F, 0.0716F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0225F, 2.9078F, 0.1371F, -0.2162F, -0.0296F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(34, 6).addBox(-0.5F, 0.1824F, -0.3784F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 9).addBox(-0.5F, 0.1824F, 3.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, 0.1183F, 0.1733F, 0.0205F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(34, 12).addBox(-0.5F, 0.1824F, -0.0784F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 15).addBox(-0.5F, 0.1824F, 3.4216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.136F, 0.173F, 0.0235F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.1824F, 0.0216F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.1053F, 0.3473F, 0.036F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6613F, 3.8627F, -1.1271F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6613F, 3.8627F, -1.1271F, 0.1298F, -0.017F, -0.0011F));

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