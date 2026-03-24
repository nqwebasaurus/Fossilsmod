package fossils.fossils.client.blockentity.model.nannopterygius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NannopterygiusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Nannopterygius;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart body;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart tail;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public NannopterygiusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Nannopterygius = this.fossil.getChild("Nannopterygius");
		this.Body1 = this.Nannopterygius.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.body = this.Body10.getChild("body");
		this.Body11 = this.body.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.tail = this.Body5.getChild("tail");
		this.Body6 = this.tail.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body12 = this.Body7.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body8 = this.Body14.getChild("Body8");
		this.Head = this.Nannopterygius.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Nannopterygius = fossil.addOrReplaceChild("Nannopterygius", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.7149F, 0.6123F, 0.0865F, 0.0114F, -0.1304F));

		PartDefinition Body1 = Nannopterygius.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.485F, -16.9049F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 28).addBox(-0.5F, 1.3F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.115F, 1.8299F, 0.3491F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2195F, 8.618F, 3.6917F, 0.4712F, -0.4233F, -0.3134F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2195F, 8.618F, 3.6917F, 0.6454F, -0.2842F, 0.21F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, 1.8247F, 0.0926F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.559F, 2.7681F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 60).addBox(3.3F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.8943F, 1.6885F, -1.5708F, 0.1484F, 1.5708F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 65).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.0371F, 2.2649F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 70).addBox(-1.5F, 1.75F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.241F, -0.1319F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 5.7181F, 1.5697F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 5.7181F, 1.5697F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1931F, 9.6655F, 0.1485F, 0.0432F, 0.0065F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 28).addBox(-1.5F, 1.8F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r7 = Body10.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 8).addBox(-1.5F, 1.8F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.192F, 0.0F, 0.0F));

		PartDefinition body = Body10.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.9501F, 4.013F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 67).addBox(-1.5F, 1.8F, 7.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 64).addBox(-1.5F, 1.8F, 3.65F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.9159F, -4.0104F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = body.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5143F, 3.7559F, -0.1489F, 0.0863F, -0.0129F));

		PartDefinition cube_r9 = Body11.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 8).addBox(-1.5F, 1.8F, 0.35F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0342F, 0.0026F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7939F, 7.835F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 34).addBox(-0.5F, -0.2F, -2.925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.765F, 6.6818F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 59).addBox(-1.5F, -0.1648F, 3.8357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 56).addBox(-1.5F, -0.1648F, 0.1357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.6651F, -0.4152F, -0.3142F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 5.6375F, 7.6436F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 5.6375F, 7.6436F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3565F, 7.5234F, 8.5338F, 0.6627F, -0.7198F, -0.3929F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3565F, 7.5234F, 8.5338F, 0.5158F, 0.3544F, 0.112F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1553F, 6.6221F, -0.0695F, -0.0433F, 0.0106F));

		PartDefinition cube_r12 = Body5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 32).addBox(0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 5.1043F, 2.5856F, -1.5708F, 0.0175F, 1.5708F));

		PartDefinition cube_r13 = Body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 35).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.9046F, 2.624F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 36).addBox(-1.5F, 2.85F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4693F, 0.0826F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = Body5.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.0362F, 2.7845F, -0.031F, -0.1745F, 0.0054F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 0).addBox(-1.5F, 2.85F, 3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = tail.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0917F, 3.9284F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r16 = Body6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 48).addBox(-1.5F, 2.25F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.2083F, 0.0716F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, -0.1299F, -0.3464F, 0.0443F));

		PartDefinition cube_r17 = Body9.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(3, 68).addBox(-1.5F, -0.1496F, 3.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 65).addBox(-1.5F, -0.1496F, -0.2581F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 2.6102F, 0.1506F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2172F, 4.0321F, -0.0092F, -0.3054F, 0.0028F));

		PartDefinition cube_r18 = Body7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 57).addBox(-1.5F, -0.0847F, -4.8852F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.8228F, 5.0035F, 0.096F, -0.0217F, -0.0021F));

		PartDefinition Body12 = Body7.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1503F, 5.0065F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r19 = Body12.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(4, 54).addBox(-1.5F, 1.7838F, 4.4904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 50).addBox(-1.5F, 1.7838F, -0.2096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0036F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, 5.0F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r20 = Body13.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 39).addBox(-1.55F, -0.2155F, 0.1381F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.8228F, 0.0036F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2322F, 4.9486F, -0.0567F, 0.3921F, -0.0217F));

		PartDefinition cube_r21 = Body14.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(29, 77).addBox(-1.5F, 0.7838F, -0.2096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1772F, 0.0035F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body14.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4801F, 2.6755F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(13, 57).addBox(-1.5F, 3.7284F, 11.691F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.0839F, 1.7388F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(78, 15).addBox(-1.5F, -0.1428F, 0.0852F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 10.0323F, 5.4122F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 12).addBox(-1.5F, 0.7822F, 5.5852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 8).addBox(-1.5F, 0.7822F, -0.1148F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 4.0946F, 4.0917F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 64).addBox(-1.5F, 0.3822F, -0.2148F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.0839F, 1.7388F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 84).addBox(-1.5F, 0.7261F, -0.0466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4661F, 0.2638F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Nannopterygius.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 2.5043F, -19.3344F, -0.2474F, -0.3335F, -0.0811F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.7624F, 0.3126F, 0.5149F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 107, 107);
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