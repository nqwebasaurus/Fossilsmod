package fossils.fossils.client.blockentity.model.hypsilophodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HypsilophodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart Head;
	private final ModelPart HeadslopeL;
	private final ModelPart HeadslopeL2;
	private final ModelPart BrowL;
	private final ModelPart Jaw;
	private final ModelPart JawslopeL;
	private final ModelPart JawslopeL2;
	private final ModelPart MasseterR;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public HypsilophodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.Head = this.neck.getChild("Head");
		this.HeadslopeL = this.Head.getChild("HeadslopeL");
		this.HeadslopeL2 = this.Head.getChild("HeadslopeL2");
		this.BrowL = this.Head.getChild("BrowL");
		this.Jaw = this.Head.getChild("Jaw");
		this.JawslopeL = this.Jaw.getChild("JawslopeL");
		this.JawslopeL2 = this.Jaw.getChild("JawslopeL2");
		this.MasseterR = this.Jaw.getChild("MasseterR");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.0F, -3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 39).addBox(-0.5F, -0.7F, 0.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(37, 28).mirror().addBox(-3.0F, -0.4F, 1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(37, 28).addBox(1.0F, -0.4F, 1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F))
				.texOffs(29, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -1.1F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3731F, 1.5722F, -0.192F, 0.0F, 0.1309F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-0.5F, -0.1759F, 3.3536F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6188F, -1.428F, -0.5934F, 0.2618F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 44).mirror().addBox(-0.5F, -0.4306F, 1.9848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6188F, -1.428F, -0.6632F, 0.2618F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 39).mirror().addBox(-0.5F, -0.756F, -0.3996F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6188F, -1.428F, -0.8029F, 0.2618F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 23).mirror().addBox(-0.5F, -0.1935F, -2.8509F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 23).addBox(3.5F, -0.1935F, -2.8509F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0F, -0.1586F, -0.5182F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.2F, 0.0891F, 2.0046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.9414F, 0.3818F, -0.576F, 0.3491F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 27).mirror().addBox(-0.2F, -0.3596F, -1.4625F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.9414F, 0.3818F, -0.7679F, 0.3491F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-2.0F, 0.657F, -0.9849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(33, 48).mirror().addBox(-2.0F, 0.657F, -1.4849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 48).addBox(2.0F, 0.657F, -0.9849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(33, 48).addBox(2.0F, 0.657F, -1.4849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1F, 1.8F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.2F, -0.9181F, -3.204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.3F, 0.2F, 0.4363F, 0.1745F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 44).mirror().addBox(-0.2F, -0.3535F, -1.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.3F, 0.2F, 0.0698F, 0.1745F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 43).addBox(-0.8F, -0.9181F, -3.204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(2.5F, -1.3F, 0.2F, 0.4363F, -0.1745F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 44).addBox(-0.8F, -0.3535F, -1.7501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -1.3F, 0.2F, 0.0698F, -0.1745F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 26).addBox(-0.8F, 0.0891F, 2.0046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1F, 0.9414F, 0.3818F, -0.576F, -0.3491F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -0.1759F, 3.3536F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0F, 0.6188F, -1.428F, -0.5934F, -0.2618F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 44).addBox(-0.5F, -0.4306F, 1.9848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.0F, 0.6188F, -1.428F, -0.6632F, -0.2618F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(37, 39).addBox(-0.5F, -0.756F, -0.3996F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0F, 0.6188F, -1.428F, -0.8029F, -0.2618F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 27).addBox(-0.8F, -0.3596F, -1.4625F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1F, 0.9414F, 0.3818F, -0.7679F, -0.3491F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 6).addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.3731F, 1.5722F, -0.192F, 0.0F, -0.1309F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 0.4F, -0.2F, -0.6558F, 0.1071F, 0.1381F));

		PartDefinition Femur_r1 = leftLeg.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(0, 19).addBox(1.4F, -0.0774F, -1.0063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, -0.5954F, 0.5854F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = leftLeg.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(38, 48).addBox(-0.5F, 1.4289F, 0.0174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 41).addBox(-0.5F, -0.0711F, 0.0174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.3272F, -0.6209F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = leftLeg.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3728F, 0.0791F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(37, 17).addBox(2.7F, -0.1466F, -0.2783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(32, 37).addBox(1.6F, -0.1466F, -0.3783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.9046F, 0.4854F, 1.0734F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 6.8229F, 0.2046F, -0.0038F, -0.0872F, -0.0871F));

		PartDefinition Metatarsals_r1 = leftLeg3.addOrReplaceChild("Metatarsals_r1", CubeListBuilder.create().texOffs(10, 0).addBox(1.5F, 10.0767F, 11.2776F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.0F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offset(0.4F, 2.5F, -2.8F));

		PartDefinition Pes_r1 = leftLeg4.addOrReplaceChild("Pes_r1", CubeListBuilder.create().texOffs(0, 19).addBox(1.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.4F, -0.2F, -0.1805F, -0.0317F, -0.1717F));

		PartDefinition Femur_r4 = rightLeg.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-2.4F, -0.0774F, -1.0063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.5954F, 0.5854F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = rightLeg.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(48, 32).addBox(-0.5F, 1.4289F, 0.0174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 8).addBox(-0.5F, -0.0711F, 0.0174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 2.3272F, -0.6209F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = rightLeg.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(12, 9).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.3728F, 0.0791F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(22, 33).addBox(-3.7F, -0.1466F, -0.2783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(27, 37).addBox(-2.6F, -0.1466F, -0.3783F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9046F, 0.4854F, 1.2043F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 6.8229F, 0.2046F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Metatarsals_r2 = rightLeg3.addOrReplaceChild("Metatarsals_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 10.0767F, 11.2776F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.0F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offset(-0.4F, 2.5F, -2.8F));

		PartDefinition Pes_r2 = rightLeg4.addOrReplaceChild("Pes_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -1.1F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(38, 54).addBox(-0.5F, -1.04F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 54).addBox(-0.5F, -1.04F, -2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 54).addBox(-0.5F, -1.04F, -4.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 8).addBox(-1.0F, -0.54F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.4F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(27, 33).mirror().addBox(-1.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2115F, -0.4987F, -0.086F, -0.1419F, -1.268F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2115F, -0.4987F, -0.1453F, -0.0801F, -0.7447F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2115F, -2.4987F, -0.0534F, -0.0296F, -0.5926F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 21).mirror().addBox(-1.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2115F, -2.4987F, -0.0315F, -0.0524F, -1.1162F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 48).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2115F, -4.4987F, -0.0436F, 0.2703F, -1.0897F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2115F, -4.4987F, 0.1005F, 0.255F, -0.5473F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2115F, -0.4987F, -0.1453F, 0.0801F, 0.7447F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 33).addBox(0.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2115F, -0.4987F, -0.086F, 0.1419F, 1.268F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 21).addBox(0.866F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2115F, -2.4987F, -0.0315F, 0.0524F, 1.1162F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2115F, -2.4987F, -0.0534F, 0.0296F, 0.5926F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 48).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2115F, -4.4987F, 0.1137F, -0.1866F, 1.054F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(53, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2115F, -4.4987F, 0.1915F, -0.1051F, 0.5309F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.9F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(55, 2).addBox(-0.5F, -0.3852F, 0.0354F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 44).addBox(-1.0F, 0.0148F, 0.0354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -2.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(18, 55).addBox(-0.5F, -0.4F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).addBox(-1.0F, -0.1F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.9F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 19).mirror().addBox(-0.5F, -0.0123F, -0.2803F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9418F, -2.7084F, -0.0357F, -0.3863F, 0.1224F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 33).mirror().addBox(-0.5F, -0.0123F, 0.0197F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9418F, -2.7084F, -0.1698F, -0.6967F, 0.1788F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(-0.8F, -1.0126F, -0.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 44).addBox(0.8F, -1.0126F, -0.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2F, -3.9F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(52, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3885F, -3.4987F, 0.4757F, 0.2486F, -0.4979F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3885F, -3.4987F, 0.2946F, 0.4501F, -1.0142F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(46, 30).mirror().addBox(-4.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3885F, -3.4987F, 0.0103F, 0.5322F, -1.6029F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 15).mirror().addBox(-4.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -1.4987F, 0.0072F, 0.3926F, -1.5519F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -1.4987F, 0.2102F, 0.3342F, -0.9942F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -1.4987F, 0.3476F, 0.1866F, -0.4733F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(0.0F, -0.6143F, -1.9596F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.646F, -4.6865F, 1.1524F, -0.5765F, -0.8865F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-0.5F, -1.2811F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 17).mirror().addBox(-0.5F, -0.9811F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0972F, -1.8216F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-0.5F, -0.0007F, 0.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6972F, -3.7216F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(37, 34).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.9972F, -3.3216F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 48).addBox(-0.5F, -1.2811F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 17).addBox(-0.5F, -0.9811F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 0.0972F, -1.8216F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(44, 37).addBox(-0.5F, -0.0007F, 0.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, 0.6972F, -3.7216F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.6143F, -1.9596F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.646F, -4.6865F, 1.1524F, 0.5765F, 0.8865F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(46, 30).addBox(2.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3885F, -3.4987F, 0.0103F, -0.5322F, 1.6029F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 0).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3885F, -3.4987F, 0.2946F, -0.4501F, 1.0142F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(52, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3885F, -3.4987F, 0.4757F, -0.2486F, 0.4979F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(47, 15).addBox(2.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -1.4987F, 0.0072F, -0.3926F, 1.5519F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(7, 48).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -1.4987F, 0.2102F, -0.3342F, 0.9942F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(53, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -1.4987F, 0.3476F, -0.1866F, 0.4733F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(37, 34).addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 0.9972F, -3.3216F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(12, 19).addBox(-0.5F, -0.0123F, -0.2803F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9418F, -2.7084F, -0.0357F, 0.3863F, -0.1224F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(7, 33).addBox(-0.5F, -0.0123F, 0.0197F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9418F, -2.7084F, -0.1698F, 0.6967F, -0.1788F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 3.0011F, -4.0655F, 0.1833F, 0.2182F, 0.0F));

		PartDefinition Humerus_r1 = leftArm.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(11, 27).addBox(0.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, 2.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r1 = leftArm2.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(29, 31).addBox(0.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 32).addBox(0.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r1 = leftArm3.addOrReplaceChild("Manus_r1", CubeListBuilder.create().texOffs(42, 16).addBox(-1.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, 0.1855F, 0.21F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 3.0011F, -4.0655F, -0.0819F, -0.236F, -0.1782F));

		PartDefinition Humerus_r2 = rightArm.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, 2.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r2 = rightArm2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(29, 11).addBox(-1.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 25).addBox(-1.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(-0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r2 = rightArm3.addOrReplaceChild("Manus_r2", CubeListBuilder.create().texOffs(40, 11).addBox(0.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, -0.1855F, -0.21F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -5.0F, 0.0275F, 0.3042F, 0.0915F));

		PartDefinition cube_r60 = neck3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 55).addBox(-0.5F, -1.0F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 3).addBox(-1.0F, -0.8F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r61 = neck3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -0.4987F, 0.6536F, 0.4287F, -0.585F));

		PartDefinition cube_r62 = neck3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(20, 15).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -0.4987F, 0.3592F, 0.69F, -1.1256F));

		PartDefinition cube_r63 = neck3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-3.2321F, -1.866F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0885F, -0.4987F, -0.1151F, 0.7571F, -1.8253F));

		PartDefinition cube_r64 = neck3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -0.4987F, 0.6536F, -0.4287F, 0.585F));

		PartDefinition cube_r65 = neck3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(20, 15).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -0.4987F, 0.3592F, -0.69F, 1.1256F));

		PartDefinition cube_r66 = neck3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(52, 34).addBox(2.2321F, -1.866F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0885F, -0.4987F, -0.1151F, -0.7571F, 1.8253F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -1.6F, -0.0814F, 0.2947F, -0.2739F));

		PartDefinition cube_r67 = neck2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.3F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 33).addBox(-0.5F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 39).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.8F, -2.2F, -0.576F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -2.4F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(46, 26).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 21).addBox(0.0F, -0.7F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head = neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.9172F, -1.7103F, -0.3227F, 0.6776F, -0.1679F));

		PartDefinition Squamosal_r1 = Head.addOrReplaceChild("Squamosal_r1", CubeListBuilder.create().texOffs(37, 51).addBox(-1.0F, -0.5369F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0001F))
				.texOffs(52, 9).mirror().addBox(-1.0F, -0.5369F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(52, 9).addBox(-0.4F, -0.5369F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0231F, -0.9791F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r1 = Head.addOrReplaceChild("Premaxillary_r1", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-0.5F, -0.29F, -0.2068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.4545F, -2.586F, 0.7688F, -0.218F, -0.0077F));

		PartDefinition Premaxillary_r2 = Head.addOrReplaceChild("Premaxillary_r2", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-0.5F, -0.3928F, 0.2948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.4545F, -2.586F, 0.5943F, -0.218F, -0.0077F));

		PartDefinition Premaxillary_r3 = Head.addOrReplaceChild("Premaxillary_r3", CubeListBuilder.create().texOffs(53, 27).addBox(-0.5F, -0.3928F, 0.2948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.4545F, -2.586F, 0.5943F, 0.218F, 0.0077F));

		PartDefinition Premaxillary_r4 = Head.addOrReplaceChild("Premaxillary_r4", CubeListBuilder.create().texOffs(52, 49).addBox(-0.5F, -0.29F, -0.2068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.4545F, -2.586F, 0.7688F, 0.218F, 0.0077F));

		PartDefinition Premaxillary_r5 = Head.addOrReplaceChild("Premaxillary_r5", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, -0.2239F, -0.8308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.5F, 1.9572F, -3.6886F, 1.4137F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r6 = Head.addOrReplaceChild("Premaxillary_r6", CubeListBuilder.create().texOffs(30, 52).addBox(-0.5F, -0.2205F, -0.778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 1.5572F, -3.4886F, 1.0996F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r7 = Head.addOrReplaceChild("Premaxillary_r7", CubeListBuilder.create().texOffs(1, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 0.0253F, -1.7938F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r8 = Head.addOrReplaceChild("Premaxillary_r8", CubeListBuilder.create().texOffs(1, 48).addBox(-0.5F, -0.2433F, -0.1778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 0.3572F, -2.5886F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r9 = Head.addOrReplaceChild("Premaxillary_r9", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.2433F, -1.7778F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 0.3572F, -2.5886F, 0.9425F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r10 = Head.addOrReplaceChild("Premaxillary_r10", CubeListBuilder.create().texOffs(16, 50).addBox(-0.5F, -0.2683F, 0.7948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.5F, 2.4572F, -4.2886F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Squamosal_r2 = Head.addOrReplaceChild("Squamosal_r2", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-0.5248F, -0.5732F, -0.6386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false), PartPose.offsetAndRotation(0.1112F, 0.2218F, -1.6077F, 0.5781F, -0.084F, -0.081F));

		PartDefinition Squamosal_r3 = Head.addOrReplaceChild("Squamosal_r3", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.4996F, -0.1574F, -0.9196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0112F, 0.0218F, -0.9077F, -0.0415F, -0.084F, -0.081F));

		PartDefinition Squamosal_r4 = Head.addOrReplaceChild("Squamosal_r4", CubeListBuilder.create().texOffs(51, 39).mirror().addBox(-0.5651F, -0.1267F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.1112F, -0.2782F, -1.6077F, 1.1104F, -0.084F, -0.081F));

		PartDefinition Squamosal_r5 = Head.addOrReplaceChild("Squamosal_r5", CubeListBuilder.create().texOffs(51, 44).mirror().addBox(-0.4812F, -0.3386F, -0.5637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 51).mirror().addBox(-0.6412F, -0.3386F, -0.5637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0112F, 0.2218F, -1.6077F, 0.7267F, -0.1145F, -0.0551F));

		PartDefinition Squamosal_r6 = Head.addOrReplaceChild("Squamosal_r6", CubeListBuilder.create().texOffs(15, 39).mirror().addBox(-0.4812F, -0.6594F, -0.9612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0112F, 0.2218F, -1.6077F, 1.0911F, -0.2322F, -0.0769F));

		PartDefinition Squamosal_r7 = Head.addOrReplaceChild("Squamosal_r7", CubeListBuilder.create().texOffs(4, 53).mirror().addBox(-0.4584F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false), PartPose.offsetAndRotation(0.0384F, 0.6028F, -1.6086F, 0.2891F, -0.0483F, -0.021F));

		PartDefinition Squamosal_r8 = Head.addOrReplaceChild("Squamosal_r8", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(-0.55F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.17F, 1.6082F, -2.7139F, 0.0825F, -0.2201F, -0.1033F));

		PartDefinition Squamosal_r9 = Head.addOrReplaceChild("Squamosal_r9", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.37F, 1.7571F, -3.2948F, 0.9861F, 0.0F, 0.0F));

		PartDefinition Squamosal_r10 = Head.addOrReplaceChild("Squamosal_r10", CubeListBuilder.create().texOffs(50, 20).addBox(-0.4752F, -0.5732F, -0.6386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.8888F, 0.2218F, -1.6077F, 0.5781F, 0.084F, 0.081F));

		PartDefinition Squamosal_r11 = Head.addOrReplaceChild("Squamosal_r11", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.63F, 1.7571F, -3.2948F, 0.9861F, 0.0F, 0.0F));

		PartDefinition Squamosal_r12 = Head.addOrReplaceChild("Squamosal_r12", CubeListBuilder.create().texOffs(25, 53).addBox(-0.45F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.83F, 1.6082F, -2.7139F, 0.0825F, 0.2201F, 0.1033F));

		PartDefinition Squamosal_r13 = Head.addOrReplaceChild("Squamosal_r13", CubeListBuilder.create().texOffs(4, 53).addBox(-0.5416F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.9616F, 0.6028F, -1.6086F, 0.2891F, 0.0483F, 0.021F));

		PartDefinition Squamosal_r14 = Head.addOrReplaceChild("Squamosal_r14", CubeListBuilder.create().texOffs(15, 39).addBox(-0.5188F, -0.6594F, -0.9612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9888F, 0.2218F, -1.6077F, 1.0911F, 0.2322F, 0.0769F));

		PartDefinition Squamosal_r15 = Head.addOrReplaceChild("Squamosal_r15", CubeListBuilder.create().texOffs(6, 38).mirror().addBox(-1.1F, -0.1961F, 0.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 51).mirror().addBox(-1.0F, 0.0039F, -0.0523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(6, 38).addBox(-0.3F, -0.1961F, 0.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 51).addBox(-0.4F, 0.0039F, -0.0523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(0.7F, -0.6231F, -0.8791F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Squamosal_r16 = Head.addOrReplaceChild("Squamosal_r16", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(-0.5F, -0.2443F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(9, 53).addBox(0.56F, -0.2443F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.03F, 0.1413F, -0.4676F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Squamosal_r17 = Head.addOrReplaceChild("Squamosal_r17", CubeListBuilder.create().texOffs(47, 50).mirror().addBox(-0.5F, -0.7556F, -0.534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 50).addBox(0.56F, -0.7556F, -0.534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.03F, 0.1413F, -0.4676F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Squamosal_r18 = Head.addOrReplaceChild("Squamosal_r18", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 52).addBox(0.66F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.03F, 1.1088F, -0.4057F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r1 = Head.addOrReplaceChild("Quadratojugal_r1", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-0.69F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.3902F, -0.0107F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r2 = Head.addOrReplaceChild("Quadratojugal_r2", CubeListBuilder.create().texOffs(26, 46).mirror().addBox(-1.0F, -0.9929F, -1.9413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(26, 46).addBox(-0.4F, -0.9929F, -1.9413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 1.3806F, 0.1304F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Squamosal_r19 = Head.addOrReplaceChild("Squamosal_r19", CubeListBuilder.create().texOffs(6, 50).mirror().addBox(-1.09F, -0.0857F, -0.0577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(6, 50).addBox(-0.31F, -0.0857F, -0.0577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.5231F, 0.0209F, -0.6807F, 0.0F, 0.0F));

		PartDefinition Squamosal_r20 = Head.addOrReplaceChild("Squamosal_r20", CubeListBuilder.create().texOffs(51, 39).addBox(-0.4349F, -0.1267F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.8888F, -0.2782F, -1.6077F, 1.1104F, 0.084F, 0.081F));

		PartDefinition Squamosal_r21 = Head.addOrReplaceChild("Squamosal_r21", CubeListBuilder.create().texOffs(42, 51).addBox(-0.3588F, -0.3386F, -0.5637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(51, 44).addBox(-0.5188F, -0.3386F, -0.5637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9888F, 0.2218F, -1.6077F, 0.7267F, 0.1145F, 0.0551F));

		PartDefinition Squamosal_r22 = Head.addOrReplaceChild("Squamosal_r22", CubeListBuilder.create().texOffs(14, 53).addBox(-0.5004F, -0.1574F, -0.9196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9888F, 0.0218F, -0.9077F, -0.0415F, 0.084F, 0.081F));

		PartDefinition Quadratojugal_r3 = Head.addOrReplaceChild("Quadratojugal_r3", CubeListBuilder.create().texOffs(50, 2).addBox(-0.31F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 1.3902F, -0.0107F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Jugal_r1 = Head.addOrReplaceChild("Jugal_r1", CubeListBuilder.create().texOffs(51, 6).addBox(-0.2F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.0306F, -1.8639F, 0.576F, 0.0F, 0.0F));

		PartDefinition Teeth_r1 = Head.addOrReplaceChild("Teeth_r1", CubeListBuilder.create().texOffs(51, 24).addBox(-0.7F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6982F, 2.4712F, -4.0765F, 0.4712F, 0.0167F, 0.0055F));

		PartDefinition Teeth_r2 = Head.addOrReplaceChild("Teeth_r2", CubeListBuilder.create().texOffs(28, 9).mirror().addBox(-0.1F, -0.5F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0001F)).mirror(false), PartPose.offsetAndRotation(0.1924F, 1.5633F, -2.295F, 0.4734F, -0.0945F, -0.0452F));

		PartDefinition Teeth_r3 = Head.addOrReplaceChild("Teeth_r3", CubeListBuilder.create().texOffs(28, 9).addBox(0.1F, -0.5F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(0.8076F, 1.5633F, -2.295F, 0.4734F, 0.0945F, 0.0452F));

		PartDefinition HeadslopeL = Head.addOrReplaceChild("HeadslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, 0.5415F, 1.1145F));

		PartDefinition AntiorbitalAirSinus_r1 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r1", CubeListBuilder.create().texOffs(7, 44).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.698F, 1.1782F, -3.8222F, 0.3573F, -0.1911F, -0.0862F));

		PartDefinition AntiorbitalAirSinus_r2 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r2", CubeListBuilder.create().texOffs(48, 47).mirror().addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-0.7396F, 0.6419F, -3.8468F, 0.4795F, -0.1911F, -0.0862F));

		PartDefinition AntiorbitalAirSinus_r3 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r3", CubeListBuilder.create().texOffs(43, 33).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7396F, 0.6419F, -3.8468F, 0.7762F, -0.1911F, -0.0862F));

		PartDefinition AntiorbitalAirSinus_r4 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r4", CubeListBuilder.create().texOffs(48, 47).addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.2604F, 0.6419F, -3.8468F, 0.4795F, 0.1911F, 0.0862F));

		PartDefinition AntiorbitalAirSinus_r5 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r5", CubeListBuilder.create().texOffs(43, 33).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2604F, 0.6419F, -3.8468F, 0.7762F, 0.1911F, 0.0862F));

		PartDefinition AntiorbitalAirSinus_r6 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r6", CubeListBuilder.create().texOffs(7, 44).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 1.1782F, -3.8222F, 0.3573F, 0.1911F, 0.0862F));

		PartDefinition HeadslopeL2 = Head.addOrReplaceChild("HeadslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5415F, 1.1145F));

		PartDefinition BrowL = Head.addOrReplaceChild("BrowL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0147F, 0.5239F, -2.5201F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Crest_r1 = BrowL.addOrReplaceChild("Crest_r1", CubeListBuilder.create().texOffs(47, 11).mirror().addBox(-0.4332F, -0.3906F, -0.6489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1778F, 0.0405F, 0.0618F, 0.8083F, -0.1621F, -0.3491F));

		PartDefinition Crest_r2 = BrowL.addOrReplaceChild("Crest_r2", CubeListBuilder.create().texOffs(47, 11).addBox(-0.5668F, -0.3906F, -0.6489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1483F, 0.0405F, 0.0618F, 0.8083F, 0.1621F, 0.3491F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4415F, 0.4145F, 0.096F, 0.0F, 0.0F));

		PartDefinition Predentary_r1 = Jaw.addOrReplaceChild("Predentary_r1", CubeListBuilder.create().texOffs(53, 30).addBox(-0.5F, -0.767F, -0.8428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.279F, -2.7209F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Angular_r1 = Jaw.addOrReplaceChild("Angular_r1", CubeListBuilder.create().texOffs(45, 7).mirror().addBox(-0.5F, -0.7759F, -1.6175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(45, 7).addBox(0.5F, -0.7759F, -1.6175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.405F, 0.4175F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Surangular_r1 = Jaw.addOrReplaceChild("Surangular_r1", CubeListBuilder.create().texOffs(11, 50).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(11, 50).addBox(0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 0.6075F, -0.9006F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Surangular_r2 = Jaw.addOrReplaceChild("Surangular_r2", CubeListBuilder.create().texOffs(49, 36).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 36).addBox(0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1987F, -1.0821F, -1.5097F, 0.0F, 0.0F));

		PartDefinition Surangular_r3 = Jaw.addOrReplaceChild("Surangular_r3", CubeListBuilder.create().texOffs(45, 21).mirror().addBox(-0.5F, -0.2312F, -1.3667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5075F, -1.4006F, 0.6619F, -0.1382F, -0.1069F));

		PartDefinition Teeth_r4 = Jaw.addOrReplaceChild("Teeth_r4", CubeListBuilder.create().texOffs(18, 27).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.5F, 1.2075F, -2.0082F, 0.6383F, 0.0F, 0.0F));

		PartDefinition Teeth_r5 = Jaw.addOrReplaceChild("Teeth_r5", CubeListBuilder.create().texOffs(40, 5).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.5F, 1.603F, -2.3299F, 0.6906F, 0.0F, 0.0F));

		PartDefinition Surangular_r4 = Jaw.addOrReplaceChild("Surangular_r4", CubeListBuilder.create().texOffs(45, 21).addBox(-0.5F, -0.2312F, -1.3667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0F, 0.5075F, -1.4006F, 0.6619F, 0.1382F, 0.1069F));

		PartDefinition JawslopeL = Jaw.addOrReplaceChild("JawslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, -0.3693F, 1.1233F));

		PartDefinition Dentary_r1 = JawslopeL.addOrReplaceChild("Dentary_r1", CubeListBuilder.create().texOffs(7, 26).mirror().addBox(-0.7572F, -0.8239F, -1.5786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6958F, 1.3653F, -1.9814F, 0.5726F, -0.0998F, -0.0982F));

		PartDefinition Dentary_r2 = JawslopeL.addOrReplaceChild("Dentary_r2", CubeListBuilder.create().texOffs(7, 26).addBox(-0.2428F, -0.8239F, -1.5786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3042F, 1.3653F, -1.9814F, 0.5726F, 0.0998F, 0.0982F));

		PartDefinition JawslopeL2 = Jaw.addOrReplaceChild("JawslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3693F, 1.1233F));

		PartDefinition MasseterR = Jaw.addOrReplaceChild("MasseterR", CubeListBuilder.create(), PartPose.offset(-0.3F, -2.1693F, 1.8233F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(54, 36).addBox(0.0F, -1.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 18).addBox(0.0F, -1.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(0.0F, -1.3F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.6F, -0.394F, -0.0806F, 0.0335F));

		PartDefinition cube_r69 = tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(19, 19).addBox(0.0F, -1.1171F, -0.6905F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9361F, 5.3026F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -1.0649F, -0.7929F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8475F, 3.4259F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(26, 19).addBox(0.0F, -0.5F, 0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 0.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(46, 53).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 55).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 53).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 28).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r72 = tail2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, 2.1306F, 4.998F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 55).addBox(0.0F, 1.3894F, 3.0978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 19).addBox(0.0F, -0.4503F, 1.215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9361F, -0.5974F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(37, 39).addBox(0.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, 0.0389F, -0.2209F, 0.0197F));

		PartDefinition cube_r73 = tail3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, 4.3787F, 10.5379F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 19).addBox(0.0F, 3.6168F, 8.686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 26).addBox(0.0F, 2.8549F, 6.8341F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9361F, -7.4974F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1269F, -0.1326F, 0.0768F));

		return LayerDefinition.create(meshdefinition, 58, 58);
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