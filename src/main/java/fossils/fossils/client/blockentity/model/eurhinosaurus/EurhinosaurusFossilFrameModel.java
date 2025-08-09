package fossils.fossils.client.blockentity.model.eurhinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EurhinosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ophthalmosaurus;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public EurhinosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ophthalmosaurus = this.fossil.getChild("Ophthalmosaurus");
		this.Body1 = this.Ophthalmosaurus.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Ophthalmosaurus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ophthalmosaurus = fossil.addOrReplaceChild("Ophthalmosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.6824F, -4.306F, 0.148F, 0.4044F, -0.1482F));

		PartDefinition Body1 = Ophthalmosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0817F, -16.8422F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-0.5F, 0.2F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, 4.6459F, 5.3659F, 0.1787F, 0.0487F, 0.0799F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, 4.6459F, 5.3659F, 0.1852F, -0.0011F, -0.3374F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, 0.1722F, -0.1397F, 0.0601F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(0.5F, 0.7247F, -0.3074F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 6.1324F, 1.3379F, -1.5491F, -0.2434F, 1.4809F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(0.5F, 0.65F, 0.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3557F, 0.9054F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(91, 64).mirror().addBox(0.5F, 0.65F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 2.72F, 1.657F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.5F, 2.72F, 1.657F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.1144F, -0.1301F, -0.0149F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(0.5F, 0.7F, 7.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(44, 55).mirror().addBox(0.5F, 0.7F, -0.35F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.145F, -0.0927F, -0.0304F));

		PartDefinition cube_r7 = Body10.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(0.5F, 0.7F, 0.15F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r8 = Body11.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(0.5F, 0.7F, 7.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(0.5F, 0.7F, -0.15F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(0.5F, -0.3354F, -0.1556F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(0.1F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8188F, 0.1079F, -1.5708F, 0.2094F, 1.5708F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(0.5F, -0.7648F, 1.2357F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4012F, 0.5216F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(80, 66).mirror().addBox(0.5F, 0.6352F, 0.3356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.5606F, -0.4401F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 2.5606F, -0.4401F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3555F, 3.2626F, -0.1357F, 0.3765F, 0.5988F, 0.2987F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3555F, 3.2626F, -0.1357F, 0.3765F, -0.5988F, -0.2987F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0018F, 8.7898F, 0.0174F, 0.0015F, -0.0873F));

		PartDefinition cube_r13 = Body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(0.5F, 0.75F, 6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 64).mirror().addBox(0.5F, 0.75F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r14 = Body6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 17).mirror().addBox(0.5F, 0.15F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0651F, 5.9997F, -0.0183F, 0.3054F, -0.0055F));

		PartDefinition cube_r15 = Body9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(-0.3F, 0.15F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(21, 71).mirror().addBox(-0.3F, 0.15F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2201F, -0.1538F, 0.0175F, 0.0175F, 0.0003F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0034F, 6.003F, 0.0163F, 0.2203F, -0.0816F));

		PartDefinition cube_r16 = Body7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 73).mirror().addBox(0.5F, 0.6838F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1613F, 4.9464F, 0.145F, 0.279F, -0.0875F));

		PartDefinition cube_r17 = Body8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.8F, 0.4999F, -10.9874F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.3273F, 19.9226F, 13.3979F, -0.9623F, -0.0166F, -0.1286F));

		PartDefinition cube_r18 = Body8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(-0.6F, 0.3603F, -0.0307F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.3534F, 3.2484F, -1.1694F, 0.0017F, -0.004F));

		PartDefinition cube_r19 = Body8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(76, 80).mirror().addBox(0.5F, 0.6261F, -1.9466F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8193F, 1.6953F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ophthalmosaurus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.0848F, -19.2102F, -0.2698F, 0.3325F, -0.1696F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-1.4464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.5536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 2.355F, 0.5334F, 0.4712F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 117, 117);
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