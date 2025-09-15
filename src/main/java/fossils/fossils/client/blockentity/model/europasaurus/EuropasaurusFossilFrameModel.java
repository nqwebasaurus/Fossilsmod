package fossils.fossils.client.blockentity.model.europasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuropasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart UpperlegL;
	private final ModelPart LowerlegL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart UpperlegL2;
	private final ModelPart LowerlegL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Shoulder;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public EuropasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.UpperlegL = this.Hips.getChild("UpperlegL");
		this.LowerlegL = this.UpperlegL.getChild("LowerlegL");
		this.FootL = this.LowerlegL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.UpperlegL2 = this.Hips.getChild("UpperlegL2");
		this.LowerlegL2 = this.UpperlegL2.getChild("LowerlegL2");
		this.FootL3 = this.LowerlegL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.bone = this.Hips.getChild("bone");
		this.bone4 = this.Hips.getChild("bone4");
		this.Body = this.Hips.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Shoulder = this.body2.getChild("Shoulder");
		this.bone2 = this.Shoulder.getChild("bone2");
		this.bone3 = this.Shoulder.getChild("bone3");
		this.UpperArmL = this.Shoulder.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.UpperArmL2 = this.Shoulder.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL2 = this.LowerArmL2.getChild("HandL2");
		this.Neck1 = this.Shoulder.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -27.0F, 10.4F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -14.4F, -0.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.2F, -21.6F, -9.9F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -6.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.2F, -21.6F, -9.9F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -7.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -21.0F, 10.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offset(0.0F, -26.4F, 11.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 13).addBox(-0.5F, 3.65F, -6.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 5.0F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9493F, 5.129F, -0.331F, -0.1239F, 0.0424F));

		PartDefinition cube_r5 = Tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1114F, -0.1216F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(-1, 35).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 43).addBox(-0.5F, -0.2F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1591F, 7.7178F, 0.056F, -0.125F, 0.0584F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(49, 62).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2973F, 7.977F, 0.2178F, -0.2559F, -0.0559F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5F, 0.0438F, -0.5732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 57).addBox(-0.5F, 0.0438F, 4.1268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1114F, 6.0005F, 0.2136F, -0.2134F, -0.0459F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(19, 53).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3263F, 4.851F, -0.0765F, -0.1305F, 0.01F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(36, 53).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0242F, 6.9181F, -0.089F, -0.028F, -0.3042F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(47, 28).addBox(-0.5F, 0.1978F, -0.3534F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 34).addBox(-0.5F, 0.1978F, 6.3466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4927F, 6.8566F, -0.21F, 0.1375F, -0.2049F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 0.1978F, 0.0466F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0085F, 6.9139F, -0.4109F, 0.2158F, -0.0322F));

		PartDefinition UpperlegL = Hips.addOrReplaceChild("UpperlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 2.162F, -0.3147F, -0.5672F, 0.0F, 0.0F));

		PartDefinition LowerlegL = UpperlegL.addOrReplaceChild("LowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.65F, 13.9802F, 1.9829F, 0.5672F, 0.0F, 0.0F));

		PartDefinition FootL = LowerlegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 7.7764F, 0.4154F, 0.3054F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 1.3F, -0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition UpperlegL2 = Hips.addOrReplaceChild("UpperlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 2.162F, -0.3147F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LowerlegL2 = UpperlegL2.addOrReplaceChild("LowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.65F, 13.9802F, 1.9829F, 0.6109F, 0.0F, 0.0F));

		PartDefinition FootL3 = LowerlegL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 7.7764F, 0.4154F, 0.3927F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.3F, -0.9F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.5F, 1.45F, 3.9F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.5F, 1.45F, 3.9F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.225F, -1.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(65, 61).addBox(-0.5F, 0.889F, 8.6148F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -6.95F, -10.6F, -0.5236F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8123F, -3.502F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 36).addBox(-0.5F, 0.889F, 1.6147F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -5.0447F, -7.0146F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Shoulder = body2.addOrReplaceChild("Shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5447F, -5.9146F, 0.0175F, 0.0436F, 0.0008F));

		PartDefinition cube_r8 = Shoulder.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 25).addBox(-0.5F, 0.6706F, -7.8366F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.1F, -0.4018F, 0.0F, 0.0F));

		PartDefinition bone2 = Shoulder.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.5F, 1.85F, -6.5F));

		PartDefinition bone3 = Shoulder.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-5.5F, 1.85F, -6.5F));

		PartDefinition UpperArmL = Shoulder.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 8.65F, -10.8F, -0.5149F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.2101F, 0.1861F, -0.5236F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 7.0103F, 0.6324F, 0.7941F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Shoulder.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 8.65F, -10.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.2101F, 0.1861F, -0.5236F, 0.0F, 0.0F));

		PartDefinition HandL2 = LowerArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 7.0103F, 0.6324F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Neck1 = Shoulder.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.685F, -6.6688F, -0.7765F, 0.2155F, 0.0314F));

		PartDefinition cube_r9 = Neck1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 67).addBox(-0.5F, 1.1819F, 0.3048F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4828F, -4.6377F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(72, 41).addBox(-0.5F, 0.6335F, -4.385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 44).addBox(-0.5F, 0.6335F, -0.685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8676F, -3.8695F, 0.0011F, 0.0436F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, 0.1243F, -10.328F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5258F, -3.6581F, -0.0891F, 0.0435F, -0.0039F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1042F, -11.3869F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 10).addBox(-0.5F, 0.1042F, -0.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0288F, -10.0435F, -0.2844F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.928F, 0.4129F, -0.0914F, 0.0403F, 0.0872F, 0.0035F));

		PartDefinition cube_r10 = Neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 36).addBox(-0.5F, 0.1F, -7.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8701F, -10.9047F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9751F, -18.4895F, 0.0978F, 0.1804F, 0.2519F));

		PartDefinition cube_r11 = Neck6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, 0.1F, -5.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0289F, -0.1923F, -0.1309F, 0.0173F, -0.0023F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7703F, -5.726F, 0.188F, -0.0036F, 0.2618F));

		PartDefinition cube_r12 = Neck7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 41).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6237F, -5.1496F, -0.1309F, 0.0173F, -0.0023F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1323F, -6.8965F, 0.4098F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.35F, -2.7436F, -2.7262F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.35F, -2.7436F, -2.7262F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2172F, 0.5427F, 0.8727F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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