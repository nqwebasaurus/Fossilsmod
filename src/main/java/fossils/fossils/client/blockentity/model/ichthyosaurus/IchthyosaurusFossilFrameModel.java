package fossils.fossils.client.blockentity.model.ichthyosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ichthyosaurus;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
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
	private final ModelPart Body12;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public IchthyosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ichthyosaurus = this.fossil.getChild("Ichthyosaurus");
		this.Body1 = this.Ichthyosaurus.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.Body2.getChild("ForelimbL2");
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
		this.Body12 = this.Body6.getChild("Body12");
		this.Body9 = this.Body12.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Ichthyosaurus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ichthyosaurus = fossil.addOrReplaceChild("Ichthyosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.1181F, 0.675F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body1 = Ichthyosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9817F, -18.3422F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 33).addBox(-1.95F, -0.5F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, 3.1945F, 5.2681F, 1.6581F, -0.0435F, -1.5746F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -0.5F, -1.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.025F, 3.1945F, 5.2681F, 1.5272F, -0.0873F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, 0.2F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3817F, 3.2672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.926F, 4.6368F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.7497F, -0.1574F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, 0.65F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0854F, 6.168F, 0.2729F, 0.3199F, -0.2448F, 0.3236F));

		PartDefinition ForelimbL2 = Body2.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0854F, 6.168F, 0.2729F, 0.6165F, 0.0121F, -0.3561F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.4181F, -0.9303F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 4.4181F, -0.9303F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.05F, 1.7758F, 7.2531F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 6).addBox(-1.55F, 0.75F, -0.225F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.1839F, -0.0858F, 0.0159F));

		PartDefinition cube_r8 = Body10.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 30).addBox(-1.525F, 0.8F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body11.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, 1.8361F, 3.3702F, -0.1487F, 0.069F, -0.0103F));

		PartDefinition cube_r10 = Body11.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 60).addBox(-1.525F, 0.85F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6582F, 3.8372F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 70).addBox(-1.5F, -0.2354F, -0.1556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(29, 61).addBox(1.6F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.469F, 1.0868F, -1.5708F, 0.2094F, 1.5708F));

		PartDefinition cube_r13 = Body4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(33, 65).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.3171F, 1.5442F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(33, 65).addBox(-1.5F, 0.7602F, 0.3357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.6742F, 0.2819F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.6742F, 0.2819F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7238F, 5.5152F, 0.4597F, 0.3923F, -0.8038F, 0.1437F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7238F, 5.5152F, 0.4597F, -0.5827F, 0.6389F, -0.6222F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, -0.0358F, 0.218F, -0.0077F));

		PartDefinition cube_r15 = Body5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(23, 46).addBox(-0.15F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4084F, 1.4225F, 6.2477F, -0.0176F, 0.1134F, -0.002F));

		PartDefinition cube_r16 = Body5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 40).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0392F, 2.9105F, -0.0175F, -0.0175F, 0.0003F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0181F, 0.2618F, 0.0047F));

		PartDefinition cube_r17 = Body6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(61, 25).addBox(-0.15F, -0.8F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 1.2028F, 3.7139F, 0.0177F, 0.1745F, 0.0031F));

		PartDefinition cube_r18 = Body6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 22).addBox(-1.5F, 0.25F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body12 = Body6.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.075F, 4.0F, -0.0183F, 0.3054F, -0.0055F));

		PartDefinition cube_r19 = Body12.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 55).addBox(-0.85F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.2475F, 4.0147F, 0.0184F, -0.3228F, -0.0058F));

		PartDefinition cube_r20 = Body12.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(58, 52).addBox(-1.5F, 0.25F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body12.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0552F, 4.0007F, -0.0186F, -0.349F, 0.0064F));

		PartDefinition cube_r21 = Body9.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 32).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9345F, 0.4587F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, -0.0096F, -0.4363F, 0.0041F));

		PartDefinition cube_r22 = Body7.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 6).addBox(-1.5F, 0.7338F, -0.0096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0338F, 4.0862F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(74, 4).addBox(-1.5F, -0.3389F, -0.6184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 9.9164F, 5.8269F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 31).addBox(-1.5F, -0.2889F, -0.2184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 7.4893F, 4.0636F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -0.1892F, -0.0676F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.4693F, 0.9703F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(83, 4).addBox(-1.5F, 0.6511F, 0.1284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.2807F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ichthyosaurus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 2.4794F, -19.3322F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.2339F, 1.1197F, 0.1833F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 106, 106);
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