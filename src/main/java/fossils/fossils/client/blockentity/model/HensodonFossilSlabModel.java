package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HensodonFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart matrixfemale;
	private final ModelPart Female;
	private final ModelPart frontLeftFin2;
	private final ModelPart spikem2;
	private final ModelPart backRightFin2;
	private final ModelPart jaw2;
	private final ModelPart spikef2;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart display;
	private final ModelPart matrixmale;
	private final ModelPart Male;
	private final ModelPart frontLeftFin;
	private final ModelPart spikem;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;
	private final ModelPart jaw;
	private final ModelPart spikef;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HensodonFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.matrixfemale = this.fossil.getChild("matrixfemale");
		this.Female = this.matrixfemale.getChild("Female");
		this.frontLeftFin2 = this.Female.getChild("frontLeftFin2");
		this.spikem2 = this.Female.getChild("spikem2");
		this.backRightFin2 = this.Female.getChild("backRightFin2");
		this.jaw2 = this.Female.getChild("jaw2");
		this.spikef2 = this.Female.getChild("spikef2");
		this.tail4 = this.Female.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.display = this.fossil.getChild("display");
		this.matrixmale = this.fossil.getChild("matrixmale");
		this.Male = this.matrixmale.getChild("Male");
		this.frontLeftFin = this.Male.getChild("frontLeftFin");
		this.spikem = this.Male.getChild("spikem");
		this.backLeftFin = this.Male.getChild("backLeftFin");
		this.backRightFin = this.Male.getChild("backRightFin");
		this.jaw = this.Male.getChild("jaw");
		this.spikef = this.Male.getChild("spikef");
		this.tail = this.Male.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition matrixfemale = fossil.addOrReplaceChild("matrixfemale", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9404F, -0.5F, -8.9904F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r1 = matrixfemale.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 34).addBox(-8.0F, -0.5F, -6.0F, 14.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.6582F, 0.0F, 1.8552F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r2 = matrixfemale.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 26).addBox(-7.95F, -0.5F, -0.975F, 10.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0668F, 0.0F, 4.7052F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r3 = matrixfemale.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 45).addBox(-8.025F, -0.5F, -2.95F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3168F, 0.0F, -4.1448F, 0.0F, 0.2182F, 0.0F));

		PartDefinition Female = matrixfemale.addOrReplaceChild("Female", CubeListBuilder.create().texOffs(38, 2).addBox(-0.0515F, -3.1888F, -1.0443F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(50, 22).addBox(0.9485F, -0.1888F, 1.9557F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2666F, 0.3485F, -0.5379F, 1.1345F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = Female.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 83).addBox(-0.025F, -0.8F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0765F, -5.5734F, 2.2013F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Female.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 18).addBox(-0.025F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0765F, -5.0539F, 0.0265F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Female.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 23).addBox(0.5F, 0.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5765F, -2.2343F, -2.429F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Female.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 15).addBox(0.5F, 0.0F, -0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5765F, -3.1067F, -1.5422F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Female.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 67).addBox(0.5F, -2.5F, -0.7F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5765F, -2.6888F, -1.0443F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Female.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 81).addBox(0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5765F, 0.15F, -3.7017F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Female.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 22).addBox(0.03F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8985F, 2.7943F, 2.1075F, 1.4234F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Female.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 81).addBox(0.5F, -0.075F, 0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5765F, 2.933F, -0.861F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Female.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(35, 82).addBox(0.5F, -0.075F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5765F, 1.8584F, -2.5478F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Female.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.8798F, -2.4802F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Female.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 22).addBox(0.0F, 0.0F, -0.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8985F, 2.7296F, 0.3761F, 0.9004F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Female.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 14).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8985F, 2.4516F, -0.6104F, 1.0712F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Female.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 74).addBox(0.5F, -3.05F, -2.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5765F, 1.3112F, -1.0443F, 0.3491F, 0.0F, 0.0F));

		PartDefinition frontLeftFin2 = Female.addOrReplaceChild("frontLeftFin2", CubeListBuilder.create().texOffs(61, 11).addBox(-0.475F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4485F, -1.3888F, 1.2057F, 0.1855F, 0.0F, 0.0F));

		PartDefinition spikem2 = Female.addOrReplaceChild("spikem2", CubeListBuilder.create(), PartPose.offset(1.4235F, 0.3112F, 1.9557F));

		PartDefinition backRightFin2 = Female.addOrReplaceChild("backRightFin2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0765F, 2.6845F, 1.0508F, -0.5831F, -0.2201F, 0.143F));

		PartDefinition jaw2 = Female.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offset(-0.5765F, 1.5612F, -2.1443F));

		PartDefinition cube_r17 = jaw2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(51, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.975F, -0.2238F, -0.0337F, 0.3491F, 0.0F, 0.0F));

		PartDefinition spikef2 = Female.addOrReplaceChild("spikef2", CubeListBuilder.create(), PartPose.offset(-0.5765F, -2.2343F, -2.429F));

		PartDefinition cube_r18 = spikef2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 11).addBox(0.0F, -1.5F, -1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.475F, -0.3247F, 1.0655F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r19 = spikef2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 20).addBox(0.0F, -2.8F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.475F, 1.0038F, -1.4335F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r20 = spikef2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 86).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.7999F, -1.8338F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail4 = Female.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(50, 76).addBox(0.0F, -1.6205F, -0.2422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offset(-0.0765F, -0.8184F, 1.6979F));

		PartDefinition cube_r21 = tail4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 11).addBox(0.5F, -2.75F, -0.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, 3.2942F, 0.8524F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 81).addBox(0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.7942F, -0.1976F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 75).addBox(0.975F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -2.093F, 2.2632F, -0.733F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(28, 81).addBox(-0.025F, -0.355F, -0.5546F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offset(0.0F, -0.1655F, 1.5124F));

		PartDefinition cube_r24 = tail5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 87).addBox(-0.025F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.5744F, 0.9511F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 75).addBox(-0.025F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9275F, 0.7508F, -0.9163F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(57, 76).addBox(0.95F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6526F, 1.7837F, -0.0436F, 0.0F, 0.0F));

		PartDefinition display = fossil.addOrReplaceChild("display", CubeListBuilder.create().texOffs(5, 87).addBox(-6.15F, -1.1F, 10.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 87).addBox(-6.15F, -1.1F, -19.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 87).addBox(-6.15F, -1.1F, -8.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 87).addBox(-6.15F, -1.1F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 87).addBox(4.85F, -1.1F, 10.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 20).addBox(4.85F, -1.1F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 11).addBox(4.85F, -1.1F, -7.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 87).addBox(4.85F, -1.1F, -20.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(4.85F, 0.15F, -20.775F, 1.0F, 1.0F, 32.0F, new CubeDeformation(0.1F))
				.texOffs(0, 34).addBox(-6.15F, 0.15F, -19.175F, 1.0F, 1.0F, 31.0F, new CubeDeformation(0.1F))
				.texOffs(5, 8).addBox(-5.65F, 0.15F, 4.325F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 8).addBox(-5.65F, 0.15F, -12.675F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition matrixmale = fossil.addOrReplaceChild("matrixmale", CubeListBuilder.create().texOffs(0, 67).addBox(-2.3781F, -0.5F, -5.7721F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.1719F, -0.5F, 7.7971F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r26 = matrixmale.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 17).addBox(0.775F, -0.5F, -3.7F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3969F, 0.0F, -3.7721F, 0.0F, -0.8072F, 0.0F));

		PartDefinition cube_r27 = matrixmale.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 53).addBox(-8.35F, -0.5F, -1.725F, 12.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9871F, 0.0F, 5.4245F, -3.1416F, -0.0873F, 3.1416F));

		PartDefinition cube_r28 = matrixmale.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 23).addBox(-5.725F, -0.5F, -3.95F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-4.4879F, 0.0F, 1.1495F, -3.1416F, 0.5236F, 3.1416F));

		PartDefinition cube_r29 = matrixmale.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(5, 1).addBox(-7.325F, -0.5F, -8.65F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.3969F, 0.0F, -3.7721F, -3.1416F, 1.3963F, 3.1416F));

		PartDefinition cube_r30 = matrixmale.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 11).addBox(-3.65F, -0.5F, -0.875F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8781F, 0.0F, -3.7721F, 0.0F, 0.5672F, 0.0F));

		PartDefinition Male = matrixmale.addOrReplaceChild("Male", CubeListBuilder.create().texOffs(47, 67).addBox(-0.0454F, -2.6878F, -1.2119F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3597F, 0.2797F, 1.6648F, 2.0071F, 0.0F, -1.5708F));

		PartDefinition cube_r31 = Male.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 83).addBox(-0.045F, -0.8F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0704F, -5.0724F, 2.0337F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Male.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 15).addBox(0.4154F, -1.1248F, -0.9723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4546F, -4.9724F, 1.9337F, -0.6311F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Male.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(59, 83).addBox(-0.045F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0704F, -4.5529F, -0.1412F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Male.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 2).addBox(0.5F, 0.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5704F, -1.7332F, -2.5967F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Male.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 8).addBox(0.5F, 0.0F, -0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5704F, -2.6056F, -1.7098F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Male.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(25, 67).addBox(0.5F, -2.5F, -0.7F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5704F, -2.1878F, -1.2119F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Male.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 36).addBox(0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5704F, 0.6511F, -3.8693F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Male.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(13, 36).addBox(0.5F, -0.075F, 0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5704F, 3.434F, -1.0286F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Male.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(42, 83).addBox(0.5F, -0.075F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5704F, 2.3594F, -2.7154F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Male.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(41, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4546F, -0.3788F, -2.6479F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Male.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(61, 5).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8796F, 2.9526F, -0.7781F, 1.0712F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Male.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(51, 18).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9796F, -0.9378F, 0.7881F, 0.1806F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Male.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 74).addBox(0.5F, -3.05F, -2.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5704F, 1.8122F, -1.2119F, 0.3491F, 0.0F, 0.0F));

		PartDefinition frontLeftFin = Male.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4296F, -0.8878F, 1.0381F, 0.1855F, 0.3435F, 0.0631F));

		PartDefinition spikem = Male.addOrReplaceChild("spikem", CubeListBuilder.create(), PartPose.offset(1.4296F, 0.8122F, 1.7881F));

		PartDefinition cube_r44 = spikem.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(56, 88).addBox(-0.075F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4428F, -0.4579F, -5.8723F, 0.0904F, 0.0F, -0.0238F));

		PartDefinition cube_r45 = spikem.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(56, 18).addBox(-0.25F, -3.0F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.7455F, -6.2185F, 1.7514F, 0.0F, 0.0F));

		PartDefinition cube_r46 = spikem.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 15).addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.0F, -1.7455F, -6.2185F, 0.9163F, 0.0F, 0.0F));

		PartDefinition backLeftFin = Male.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9296F, 3.1855F, 0.8832F, -0.5831F, 0.0F, 0.0F));

		PartDefinition backRightFin = Male.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0704F, 3.1855F, 0.8832F, -0.5831F, -0.2201F, 0.143F));

		PartDefinition jaw = Male.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(-0.5704F, 2.0622F, -2.3119F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(26, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.975F, -0.2238F, -0.0337F, 0.3491F, 0.0F, 0.0F));

		PartDefinition spikef = Male.addOrReplaceChild("spikef", CubeListBuilder.create(), PartPose.offset(-0.5704F, -1.7332F, -2.5967F));

		PartDefinition cube_r48 = spikef.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(21, 86).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.7999F, -1.8338F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail = Male.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 75).addBox(0.0F, -1.6205F, -0.2422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offset(-0.0704F, -0.3173F, 1.5303F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 76).addBox(0.52F, -2.75F, -0.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 3.2942F, 0.8524F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 81).addBox(0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.7942F, -0.1976F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(4, 36).addBox(0.955F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -2.093F, 2.2632F, -0.733F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(54, 13).addBox(-0.045F, -0.355F, -0.5546F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(56, 67).addBox(0.905F, -3.9275F, -0.2492F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.1655F, 1.5124F));

		PartDefinition cube_r52 = tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 18).addBox(-0.045F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.5744F, 0.9511F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(47, 2).addBox(-0.045F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9275F, 0.7508F, -0.9163F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(47, 8).addBox(0.93F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6526F, 1.7837F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 95);
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