package fossils.fossils.client.blockentity.model.brachytrachelopan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrachytrachelopanFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Brachytrachelopan;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg8;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Body;
	private final ModelPart Shoulders;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart Neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public BrachytrachelopanFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Brachytrachelopan = this.fossil.getChild("Brachytrachelopan");
		this.leftLeg = this.Brachytrachelopan.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg8 = this.leftLeg3.getChild("leftLeg8");
		this.rightLeg = this.Brachytrachelopan.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg8 = this.rightLeg3.getChild("rightLeg8");
		this.Tail1 = this.Brachytrachelopan.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Body = this.Brachytrachelopan.getChild("Body");
		this.Shoulders = this.Body.getChild("Shoulders");
		this.leftArm = this.Shoulders.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.Shoulders.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.Neck4 = this.Shoulders.getChild("Neck4");
		this.Neck3 = this.Neck4.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -30.0F, 2.3F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(-1.0F, -31.0F, -22.4F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(4.7F, -10.5F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(1, 1).addBox(-4.5F, -7.5F, 24.2F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -24.5F, -21.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Brachytrachelopan = fossil.addOrReplaceChild("Brachytrachelopan", CubeListBuilder.create(), PartPose.offset(1.5572F, -33.4595F, 2.5001F));

		PartDefinition Basin_r1 = Brachytrachelopan.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5572F, 1.4595F, -5.5001F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg = Brachytrachelopan.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4428F, 4.4095F, 0.8999F, 1.8762F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.6003F, -15.7619F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6175F, -9.6699F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg3.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5364F, 9.8139F));

		PartDefinition rightLeg = Brachytrachelopan.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5572F, 4.4095F, 0.8999F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6003F, -15.7619F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6175F, -9.6699F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg3.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5364F, 9.8139F));

		PartDefinition Tail1 = Brachytrachelopan.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(68, 64).addBox(-0.5F, 0.2643F, 0.5625F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5572F, 3.5595F, 4.5999F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3224F, 9.0565F, -0.0447F, 0.218F, -0.0097F));

		PartDefinition cube_r2 = Tail2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 1.0F, -0.2F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0261F, 0.3191F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(59, 18).addBox(-0.5F, 0.1237F, -0.2043F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6485F, 15.8965F, 0.0909F, 0.3923F, 0.0181F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(-1, 11).addBox(-0.5F, -0.0037F, -0.6459F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0009F, 12.0075F, 0.2778F, 0.3367F, 0.0939F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4345F, 16.7818F, 0.0915F, 0.3042F, 0.0275F));

		PartDefinition cube_r3 = Tail5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, 0.6F, -0.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5296F, -0.1754F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.9641F, 15.8472F, 0.0038F, 0.4728F, -0.1101F));

		PartDefinition cube_r4 = Tail6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 56).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0716F, -0.2595F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2973F, 13.8481F, -0.5388F, 0.3554F, -0.0352F));

		PartDefinition cube_r5 = Tail7.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1244F, -0.2267F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8244F, 16.7733F, 0.0967F, 0.7501F, 0.09F));

		PartDefinition cube_r6 = Tail8.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 34).addBox(-0.5F, 0.9F, -1.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.9F, -0.4523F, -0.3367F, 0.0939F));

		PartDefinition Body = Brachytrachelopan.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(-1.5572F, 2.8595F, -5.2001F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8F, -12.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(37, 72).addBox(-0.5F, 0.9669F, -0.0113F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.4F, -5.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Shoulders = Body.addOrReplaceChild("Shoulders", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -12.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Shoulders.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.9F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -9.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm = Shoulders.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.8412F, 12.8424F, -7.6629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 8.6489F, -0.5426F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 6.9475F, -1.1938F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm = Shoulders.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.8412F, 12.8424F, -7.6629F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 8.6489F, -0.5426F, -0.5672F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 6.9475F, -1.1938F, 0.0868F, -0.0063F, 0.0006F));

		PartDefinition Neck4 = Shoulders.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -8.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 44).addBox(0.0F, 1.1238F, -3.0383F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -6.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5F, -8.5F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 71).addBox(0.0F, 0.9F, -0.3F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5374F, -8.657F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(81, 59).addBox(-0.5F, 0.1894F, -7.5217F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9374F, -8.957F, -0.0894F, -0.2173F, 0.0193F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(64, 91).addBox(-0.5F, 0.007F, -4.8951F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1894F, -7.4217F, 0.2288F, -0.1275F, -0.0296F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.443F, -3.6951F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3468F, -2.1331F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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