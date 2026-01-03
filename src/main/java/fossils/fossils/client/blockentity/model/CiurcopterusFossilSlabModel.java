package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CiurcopterusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ciurcopterus;
	private final ModelPart Body;
	private final ModelPart cheliceraL;
	private final ModelPart clawbaseL;
	private final ModelPart clawL;
	private final ModelPart cheliceraL2;
	private final ModelPart clawbaseL2;
	private final ModelPart clawL2;
	private final ModelPart legsL;
	private final ModelPart legL;
	private final ModelPart legL6;
	private final ModelPart legL2;
	private final ModelPart legL7;
	private final ModelPart legL3;
	private final ModelPart legL8;
	private final ModelPart legL4;
	private final ModelPart legLs;
	private final ModelPart legL10;
	private final ModelPart legLs2;
	private final ModelPart legL5;
	private final ModelPart legL9;
	private final ModelPart legsR;
	private final ModelPart opisthosoma;
	private final ModelPart TergiteA1;
	private final ModelPart TergiteA2;
	private final ModelPart TergiteA3;
	private final ModelPart TergiteA4;
	private final ModelPart TergiteA5;
	private final ModelPart TergiteA6;
	private final ModelPart Telson;

	public CiurcopterusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ciurcopterus = this.fossil.getChild("Ciurcopterus");
		this.Body = this.Ciurcopterus.getChild("Body");
		this.cheliceraL = this.Body.getChild("cheliceraL");
		this.clawbaseL = this.cheliceraL.getChild("clawbaseL");
		this.clawL = this.clawbaseL.getChild("clawL");
		this.cheliceraL2 = this.Body.getChild("cheliceraL2");
		this.clawbaseL2 = this.cheliceraL2.getChild("clawbaseL2");
		this.clawL2 = this.clawbaseL2.getChild("clawL2");
		this.legsL = this.Body.getChild("legsL");
		this.legL = this.legsL.getChild("legL");
		this.legL6 = this.legsL.getChild("legL6");
		this.legL2 = this.legsL.getChild("legL2");
		this.legL7 = this.legsL.getChild("legL7");
		this.legL3 = this.legsL.getChild("legL3");
		this.legL8 = this.legsL.getChild("legL8");
		this.legL4 = this.legsL.getChild("legL4");
		this.legLs = this.legL4.getChild("legLs");
		this.legL10 = this.legsL.getChild("legL10");
		this.legLs2 = this.legL10.getChild("legLs2");
		this.legL5 = this.legsL.getChild("legL5");
		this.legL9 = this.legsL.getChild("legL9");
		this.legsR = this.Body.getChild("legsR");
		this.opisthosoma = this.Body.getChild("opisthosoma");
		this.TergiteA1 = this.opisthosoma.getChild("TergiteA1");
		this.TergiteA2 = this.TergiteA1.getChild("TergiteA2");
		this.TergiteA3 = this.TergiteA2.getChild("TergiteA3");
		this.TergiteA4 = this.TergiteA3.getChild("TergiteA4");
		this.TergiteA5 = this.TergiteA4.getChild("TergiteA5");
		this.TergiteA6 = this.TergiteA5.getChild("TergiteA6");
		this.Telson = this.TergiteA6.getChild("Telson");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -1.0F, -15.0F, 10.0F, 1.0F, 36.0F, new CubeDeformation(0.004F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 38).addBox(-10.9788F, -1.0F, -0.2869F, 11.0F, 1.0F, 28.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(17.6F, 0.0F, -1.0F, 0.0F, -0.6458F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 38).addBox(-7.0F, -1.0F, 0.0F, 17.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -15.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Ciurcopterus = fossil.addOrReplaceChild("Ciurcopterus", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition Body = Ciurcopterus.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 8).addBox(-4.3182F, -0.0857F, -0.0949F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).addBox(-1.3182F, 0.0143F, -1.8949F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.2182F, -0.4143F, -4.9051F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 28).addBox(-3.0F, -0.17F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-3.5F, -0.27F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3182F, 0.2143F, -1.8949F, 0.0F, 0.5061F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 10).addBox(2.5F, -0.3F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 31).addBox(0.0F, -0.27F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6818F, 0.3143F, -1.8949F, 0.0F, -0.5061F, 0.0F));

		PartDefinition eyeR_r1 = Body.addOrReplaceChild("eyeR_r1", CubeListBuilder.create().texOffs(25, 31).mirror().addBox(1.5592F, -0.3F, -4.2301F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8182F, 0.1143F, -0.7949F, 0.0F, -1.0647F, 0.0F));

		PartDefinition eyeR_r2 = Body.addOrReplaceChild("eyeR_r2", CubeListBuilder.create().texOffs(25, 31).addBox(-1.5592F, -0.3F, -1.2301F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3818F, 0.1143F, -0.7949F, 0.0F, 1.0647F, 0.0F));

		PartDefinition cheliceraL = Body.addOrReplaceChild("cheliceraL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1318F, -0.6857F, -0.9949F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cheliceraL_r1 = cheliceraL.addOrReplaceChild("cheliceraL_r1", CubeListBuilder.create().texOffs(22, 4).addBox(1.0F, 0.0F, -10.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, 5.75F, 0.0F, -0.0873F, 0.0F));

		PartDefinition clawbaseL = cheliceraL.addOrReplaceChild("clawbaseL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.4F, -4.25F, 0.0F, 0.3491F, 0.0F));

		PartDefinition clawnotmovespineL_r1 = clawbaseL.addOrReplaceChild("clawnotmovespineL_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-0.0787F, 0.1F, -2.7144F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.7F, 0.0F, 0.2007F, 0.0F));

		PartDefinition crawbaseL_r1 = clawbaseL.addOrReplaceChild("crawbaseL_r1", CubeListBuilder.create().texOffs(26, 0).addBox(0.0F, 0.0F, -16.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.5F, 14.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition clawL = clawbaseL.addOrReplaceChild("clawL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 0.0F, -1.7F, 0.0F, 0.3054F, 0.0F));

		PartDefinition clawmovespineL_r1 = clawL.addOrReplaceChild("clawmovespineL_r1", CubeListBuilder.create().texOffs(19, 31).addBox(-3.1975F, 0.1F, -18.5491F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 0.5F, 15.7F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cheliceraL2 = Body.addOrReplaceChild("cheliceraL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5682F, -0.9357F, -0.2449F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cheliceraL_r2 = cheliceraL2.addOrReplaceChild("cheliceraL_r2", CubeListBuilder.create().texOffs(22, 4).mirror().addBox(-2.0F, 0.0F, -10.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.0F, 5.75F, 0.0F, 0.0873F, 0.0F));

		PartDefinition clawbaseL2 = cheliceraL2.addOrReplaceChild("clawbaseL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.5F, -4.25F, 0.0F, -1.8762F, 0.0F));

		PartDefinition clawnotmovespineL_r2 = clawbaseL2.addOrReplaceChild("clawnotmovespineL_r2", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.9213F, 0.1F, -2.7144F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.5F, -1.7F, 0.0F, -0.2007F, 0.0F));

		PartDefinition crawbaseL_r2 = clawbaseL2.addOrReplaceChild("crawbaseL_r2", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-2.0F, 0.0F, -16.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, 0.5F, 14.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition clawL2 = clawbaseL2.addOrReplaceChild("clawL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 0.0F, -1.7F, 0.0F, 0.0436F, 0.0F));

		PartDefinition clawmovespineL_r2 = clawL2.addOrReplaceChild("clawmovespineL_r2", CubeListBuilder.create().texOffs(19, 31).mirror().addBox(2.1975F, 0.1F, -18.5491F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3F, 0.5F, 15.7F, 0.0F, 0.3491F, 0.0F));

		PartDefinition legsL = Body.addOrReplaceChild("legsL", CubeListBuilder.create(), PartPose.offset(36.7818F, 1.0143F, 7.9051F));

		PartDefinition legL = legsL.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(-36.05F, -1.5F, -8.0F, 0.0F, -0.1719F, 0.0F));

		PartDefinition legL_r1 = legL.addOrReplaceChild("legL_r1", CubeListBuilder.create().texOffs(25, 14).addBox(-0.2682F, 0.1F, 0.724F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6449F, 0.6F, -1.2279F, 0.0F, 0.6632F, 0.0F));

		PartDefinition legL6 = legsL.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-39.75F, -1.6F, -7.4F, 0.0F, 0.1719F, 0.0F));

		PartDefinition legL_r2 = legL6.addOrReplaceChild("legL_r2", CubeListBuilder.create().texOffs(25, 14).mirror().addBox(-2.7318F, 0.1F, 0.724F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6449F, 0.6F, -1.2279F, 0.0F, -0.6632F, 0.0F));

		PartDefinition legL2 = legsL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(17, 26).addBox(-0.0294F, 0.1F, -0.0947F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -0.9F, -8.1F, 0.0173F, 0.2785F, 0.0015F));

		PartDefinition legL7 = legsL.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(17, 26).mirror().addBox(-5.9706F, 0.1F, -0.0947F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-38.75F, -0.9F, -7.1F, 0.0169F, -0.1912F, 0.0F));

		PartDefinition legL3 = legsL.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-35.7F, -1.5F, -7.5F, 0.0126F, 0.27F, 0.0017F));

		PartDefinition legL_r3 = legL3.addOrReplaceChild("legL_r3", CubeListBuilder.create().texOffs(0, 26).addBox(-1.6223F, 0.0F, -0.6831F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2844F, 0.6F, 0.6227F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL8 = legsL.addOrReplaceChild("legL8", CubeListBuilder.create(), PartPose.offsetAndRotation(-39.3F, -1.5F, -6.5F, 0.0122F, -0.0955F, 0.0005F));

		PartDefinition legL_r4 = legL8.addOrReplaceChild("legL_r4", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-5.3777F, 0.0F, -0.6831F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2844F, 0.6F, 0.6227F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL4 = legsL.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-36.3F, -1.5F, -5.5F, 0.0123F, 0.1827F, 0.0005F));

		PartDefinition legL5_3_r1 = legL4.addOrReplaceChild("legL5_3_r1", CubeListBuilder.create().texOffs(24, 21).addBox(-19.4203F, 0.0F, 20.9203F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.5427F, 0.7F, -9.5619F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legLs = legL4.addOrReplaceChild("legLs", CubeListBuilder.create(), PartPose.offset(3.1927F, 0.7F, 1.0381F));

		PartDefinition legL5_ptery4_r1 = legLs.addOrReplaceChild("legL5_ptery4_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-3.2809F, 0.0F, 24.3937F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 28).addBox(-7.2809F, 0.0F, 24.3937F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(18.9571F, 0.0F, -17.7925F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legL10 = legsL.addOrReplaceChild("legL10", CubeListBuilder.create(), PartPose.offsetAndRotation(-39.7F, -1.5F, -4.5F, 0.0122F, -0.1391F, 0.0F));

		PartDefinition legL5_4_r1 = legL10.addOrReplaceChild("legL5_4_r1", CubeListBuilder.create().texOffs(24, 21).mirror().addBox(15.4203F, 0.0F, 20.9203F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-27.5427F, 0.7F, -9.5619F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legLs2 = legL10.addOrReplaceChild("legLs2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9927F, 0.7F, 1.0381F, 0.0F, 1.1345F, 0.0F));

		PartDefinition legL5_ptery5_r1 = legLs2.addOrReplaceChild("legL5_ptery5_r1", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(2.2809F, 0.0F, 24.3937F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 28).mirror().addBox(3.2809F, 0.0F, 24.3937F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-18.9571F, 0.0F, -17.7925F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL5 = legsL.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-36.0F, -1.5F, -6.5F, 0.0124F, 0.2264F, 0.0011F));

		PartDefinition legR6_r1 = legL5.addOrReplaceChild("legR6_r1", CubeListBuilder.create().texOffs(15, 24).addBox(-2.1243F, 0.0F, -0.2515F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.9805F, 0.6F, 0.2783F, 0.0F, -0.3491F, 0.0F));

		PartDefinition legL9 = legsL.addOrReplaceChild("legL9", CubeListBuilder.create(), PartPose.offsetAndRotation(-39.0F, -1.5F, -5.5F, 0.0122F, -0.1391F, 0.0F));

		PartDefinition legR7_r1 = legL9.addOrReplaceChild("legR7_r1", CubeListBuilder.create().texOffs(15, 24).mirror().addBox(-4.8757F, 0.0F, -0.2515F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.9805F, 0.6F, 0.2783F, 0.0F, 0.3491F, 0.0F));

		PartDefinition legsR = Body.addOrReplaceChild("legsR", CubeListBuilder.create(), PartPose.offset(-37.4182F, 1.0143F, 7.9051F));

		PartDefinition opisthosoma = Body.addOrReplaceChild("opisthosoma", CubeListBuilder.create(), PartPose.offset(-0.3182F, 0.0143F, 3.9051F));

		PartDefinition TergiteA1 = opisthosoma.addOrReplaceChild("TergiteA1", CubeListBuilder.create().texOffs(0, 13).addBox(-5.0F, 0.0F, 0.2F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.2F));

		PartDefinition TergiteA2 = TergiteA1.addOrReplaceChild("TergiteA2", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -0.1F, 0.0F, 11.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.8F, 0.0F, 0.0873F, 0.0F));

		PartDefinition TergiteA3 = TergiteA2.addOrReplaceChild("TergiteA3", CubeListBuilder.create().texOffs(0, 4).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.6F, 0.0F, 0.0873F, 0.0F));

		PartDefinition TergiteA4 = TergiteA3.addOrReplaceChild("TergiteA4", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition TergiteA5 = TergiteA4.addOrReplaceChild("TergiteA5", CubeListBuilder.create().texOffs(9, 21).addBox(-3.0F, 0.1F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.6F, 0.0F, 0.1309F, 0.0F));

		PartDefinition TergiteA6 = TergiteA5.addOrReplaceChild("TergiteA6", CubeListBuilder.create().texOffs(17, 16).addBox(-2.5F, 0.2F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.7F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Telson = TergiteA6.addOrReplaceChild("Telson", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(9, 38).addBox(0.0F, 0.1F, 4.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 10).addBox(0.0F, 0.1F, 1.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 19).addBox(0.0F, 0.1F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 38).addBox(-2.0F, 0.1F, 4.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-3.0F, 0.1F, 1.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 34).addBox(-2.0F, 0.1F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 70);
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