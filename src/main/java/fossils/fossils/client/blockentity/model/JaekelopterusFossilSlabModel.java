package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JaekelopterusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart cheliceraR;
	private final ModelPart clawbaseR;
	private final ModelPart clawR;
	private final ModelPart cheliceraL;
	private final ModelPart clawbaseL;
	private final ModelPart clawL;
	private final ModelPart legsR;
	private final ModelPart legR1;
	private final ModelPart legR2;
	private final ModelPart legR3;
	private final ModelPart legR5;
	private final ModelPart legRs5;
	private final ModelPart legR4;
	private final ModelPart legsL;
	private final ModelPart legL1;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL5;
	private final ModelPart legLs5;
	private final ModelPart legL4;
	private final ModelPart opisthosoma;
	private final ModelPart tergiteA;
	private final ModelPart tergiteA2;
	private final ModelPart tergiteA3;
	private final ModelPart tergiteA4;
	private final ModelPart tergiteB;
	private final ModelPart tergiteC;
	private final ModelPart tergiteD;
	private final ModelPart tergiteD2;

	public JaekelopterusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.cheliceraR = this.body.getChild("cheliceraR");
		this.clawbaseR = this.cheliceraR.getChild("clawbaseR");
		this.clawR = this.clawbaseR.getChild("clawR");
		this.cheliceraL = this.body.getChild("cheliceraL");
		this.clawbaseL = this.cheliceraL.getChild("clawbaseL");
		this.clawL = this.clawbaseL.getChild("clawL");
		this.legsR = this.body.getChild("legsR");
		this.legR1 = this.legsR.getChild("legR1");
		this.legR2 = this.legsR.getChild("legR2");
		this.legR3 = this.legsR.getChild("legR3");
		this.legR5 = this.legsR.getChild("legR5");
		this.legRs5 = this.legR5.getChild("legRs5");
		this.legR4 = this.legsR.getChild("legR4");
		this.legsL = this.body.getChild("legsL");
		this.legL1 = this.legsL.getChild("legL1");
		this.legL2 = this.legsL.getChild("legL2");
		this.legL3 = this.legsL.getChild("legL3");
		this.legL5 = this.legsL.getChild("legL5");
		this.legLs5 = this.legL5.getChild("legLs5");
		this.legL4 = this.legsL.getChild("legL4");
		this.opisthosoma = this.body.getChild("opisthosoma");
		this.tergiteA = this.opisthosoma.getChild("tergiteA");
		this.tergiteA2 = this.tergiteA.getChild("tergiteA2");
		this.tergiteA3 = this.tergiteA2.getChild("tergiteA3");
		this.tergiteA4 = this.tergiteA3.getChild("tergiteA4");
		this.tergiteB = this.tergiteA4.getChild("tergiteB");
		this.tergiteC = this.tergiteB.getChild("tergiteC");
		this.tergiteD = this.tergiteC.getChild("tergiteD");
		this.tergiteD2 = this.tergiteD.getChild("tergiteD2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-30.0F, -2.0F, 13.0F, 30.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -33.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 42).addBox(-11.0F, -2.0F, 4.0F, 42.0F, 2.0F, 19.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(10.0F, 0.0F, -23.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 25).addBox(-6.5F, -0.1325F, 1.0F, 13.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-4.0F, -0.1325F, -5.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(-3.0F, -0.35F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.0F, -4.4F, 0.0F, -0.0349F, 0.0F));

		PartDefinition eyeR_r1 = body.addOrReplaceChild("eyeR_r1", CubeListBuilder.create().texOffs(22, 82).addBox(3.6F, -3.1F, -3.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition carapace_r1 = body.addOrReplaceChild("carapace_r1", CubeListBuilder.create().texOffs(0, 69).addBox(-3.0F, -0.1325F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.0F, 0.0F, -5.0F, 0.0F, 0.3665F, 0.0F));

		PartDefinition eyeR_r2 = body.addOrReplaceChild("eyeR_r2", CubeListBuilder.create().texOffs(82, 72).addBox(-5.6F, -3.1F, -3.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition carapace_r2 = body.addOrReplaceChild("carapace_r2", CubeListBuilder.create().texOffs(14, 70).addBox(0.0F, -0.1325F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -5.0F, 0.0F, -0.3665F, 0.0F));

		PartDefinition cheliceraR = body.addOrReplaceChild("cheliceraR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, -1.5F, -3.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cheliceraR_r1 = cheliceraR.addOrReplaceChild("cheliceraR_r1", CubeListBuilder.create().texOffs(64, 64).addBox(-2.0F, 0.3F, -14.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 5.75F, 0.0F, 0.0873F, 0.0F));

		PartDefinition clawbaseR = cheliceraR.addOrReplaceChild("clawbaseR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.5F, -8.25F, 0.0F, 1.4835F, 0.0F));

		PartDefinition clawnotmovespineR_r1 = clawbaseR.addOrReplaceChild("clawnotmovespineR_r1", CubeListBuilder.create().texOffs(0, 77).addBox(-2.0F, 0.4F, -23.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(77, 80).addBox(-1.0F, 0.3F, -22.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(33, 79).addBox(-3.0F, 0.4F, -18.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.5F, 14.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition clawR = clawbaseR.addOrReplaceChild("clawR", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.5F, -4.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition clawmoveR_r1 = clawR.addOrReplaceChild("clawmoveR_r1", CubeListBuilder.create().texOffs(70, 79).addBox(1.5F, 0.2F, -22.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(10, 78).addBox(1.5F, 0.3F, -23.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.0F, 18.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cheliceraL = body.addOrReplaceChild("cheliceraL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -1.5F, -3.5F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cheliceraR_r2 = cheliceraL.addOrReplaceChild("cheliceraR_r2", CubeListBuilder.create().texOffs(43, 64).addBox(0.0F, 0.3F, -14.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 5.75F, 0.0F, -0.0873F, 0.0F));

		PartDefinition clawbaseL = cheliceraL.addOrReplaceChild("clawbaseL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5F, -8.25F, 0.0F, -0.6981F, 0.0F));

		PartDefinition clawnotmovespineR_r2 = clawbaseL.addOrReplaceChild("clawnotmovespineR_r2", CubeListBuilder.create().texOffs(56, 64).addBox(0.0F, 0.4F, -23.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(59, 79).addBox(0.0F, 0.3F, -22.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(77, 67).addBox(0.0F, 0.4F, -18.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, 14.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition clawL = clawbaseL.addOrReplaceChild("clawL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.5F, -4.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition clawmoveR_r2 = clawL.addOrReplaceChild("clawmoveR_r2", CubeListBuilder.create().texOffs(48, 79).addBox(-2.5F, 0.2F, -22.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(23, 29).addBox(-3.5F, 0.3F, -23.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, 18.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition legsR = body.addOrReplaceChild("legsR", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition legR1 = legsR.addOrReplaceChild("legR1", CubeListBuilder.create(), PartPose.offset(-0.75F, -1.0F, -4.0F));

		PartDefinition legR1_r1 = legR1.addOrReplaceChild("legR1_r1", CubeListBuilder.create().texOffs(0, 56).addBox(-8.1318F, -0.1F, -0.076F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.9F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legR2 = legsR.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(55, 75).addBox(-12.0F, 0.8F, 0.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.1F, -3.5F));

		PartDefinition legR3 = legsR.addOrReplaceChild("legR3", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, -2.0F));

		PartDefinition legR3_r1 = legR3.addOrReplaceChild("legR3_r1", CubeListBuilder.create().texOffs(34, 77).addBox(-11.3777F, -0.2F, -0.6831F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legR5 = legsR.addOrReplaceChild("legR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -1.3F, 0.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legR5_1_r1 = legR5.addOrReplaceChild("legR5_1_r1", CubeListBuilder.create().texOffs(20, 79).addBox(-10.5F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.0F, -2.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legRs5 = legR5.addOrReplaceChild("legRs5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.25F, 1.1F, 3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition legR5_ptery2_r1 = legRs5.addOrReplaceChild("legR5_ptery2_r1", CubeListBuilder.create().texOffs(0, 83).addBox(-19.5F, 0.0F, -0.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 50).addBox(-16.5F, 0.0F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.25F, 0.0F, -5.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legR4 = legsR.addOrReplaceChild("legR4", CubeListBuilder.create(), PartPose.offset(-3.0F, -1.0F, -1.5F));

		PartDefinition legR4_r1 = legR4.addOrReplaceChild("legR4_r1", CubeListBuilder.create().texOffs(61, 77).addBox(-11.4626F, -0.2F, -0.3763F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition legsL = body.addOrReplaceChild("legsL", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition legL1 = legsL.addOrReplaceChild("legL1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, -1.0F, -4.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition legR2_r1 = legL1.addOrReplaceChild("legR2_r1", CubeListBuilder.create().texOffs(0, 54).addBox(0.1318F, -0.1F, -0.076F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.9F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL2 = legsL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(28, 75).addBox(0.0F, 0.8F, 0.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1F, -3.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL3 = legsL.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, -2.0F));

		PartDefinition legR4_r2 = legL3.addOrReplaceChild("legR4_r2", CubeListBuilder.create().texOffs(55, 73).addBox(-0.6223F, -0.2F, -0.6831F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL5 = legsL.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -1.3F, 0.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition legR5_2_r1 = legL5.addOrReplaceChild("legR5_2_r1", CubeListBuilder.create().texOffs(0, 58).addBox(4.5F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, -2.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legLs5 = legL5.addOrReplaceChild("legLs5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.25F, 1.1F, 3.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition legR5_ptery3_r1 = legLs5.addOrReplaceChild("legR5_ptery3_r1", CubeListBuilder.create().texOffs(28, 70).addBox(16.5F, 0.0F, -0.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(10.5F, 0.0F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.25F, 0.0F, -5.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legL4 = legsL.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -1.0F, -1.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition legR5_r1 = legL4.addOrReplaceChild("legR5_r1", CubeListBuilder.create().texOffs(28, 73).addBox(-0.5374F, -0.2F, -0.3763F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition opisthosoma = body.addOrReplaceChild("opisthosoma", CubeListBuilder.create().texOffs(0, 36).addBox(-7.0F, 1.87F, 0.0F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 64).addBox(-4.0F, 1.65F, -2.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 4.0F));

		PartDefinition tergiteA = opisthosoma.addOrReplaceChild("tergiteA", CubeListBuilder.create().texOffs(0, 12).addBox(-7.49F, 1.8725F, 0.0F, 15.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition tergiteA2 = tergiteA.addOrReplaceChild("tergiteA2", CubeListBuilder.create().texOffs(0, 4).addBox(-8.0F, 1.875F, 0.0F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition tergiteA3 = tergiteA2.addOrReplaceChild("tergiteA3", CubeListBuilder.create().texOffs(0, 0).addBox(-7.99F, 1.8775F, 0.0F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition tergiteA4 = tergiteA3.addOrReplaceChild("tergiteA4", CubeListBuilder.create().texOffs(0, 8).addBox(-7.5F, 1.88F, 0.0F, 15.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.1F, 0.0F, 0.0873F, 0.0F));

		PartDefinition tergiteB = tergiteA4.addOrReplaceChild("tergiteB", CubeListBuilder.create().texOffs(0, 16).addBox(-7.0F, 1.8825F, 0.0F, 14.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition tergiteC = tergiteB.addOrReplaceChild("tergiteC", CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F, 2.89F, 0.0F, 12.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition tergiteD = tergiteC.addOrReplaceChild("tergiteD", CubeListBuilder.create().texOffs(0, 64).addBox(-4.99F, 2.8925F, 0.0F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tergiteD2 = tergiteD.addOrReplaceChild("tergiteD2", CubeListBuilder.create().texOffs(77, 64).addBox(-4.5F, 2.895F, 0.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.1F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 90);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}