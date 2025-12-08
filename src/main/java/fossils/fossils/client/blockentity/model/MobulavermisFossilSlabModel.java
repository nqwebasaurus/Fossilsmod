package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MobulavermisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart Head;
	private final ModelPart leftFlipper1;
	private final ModelPart rightFlipper1;
	private final ModelPart leftFlipper2;
	private final ModelPart rightFlipper2;
	private final ModelPart leftAppendage1;
	private final ModelPart leftAppendage2;
	private final ModelPart leftAppendage3;
	private final ModelPart leftAppendageClaw1;
	private final ModelPart leftAppendageClaw2;
	private final ModelPart leftAppendageClaw3;
	private final ModelPart rightAppendage1;
	private final ModelPart rightAppendage2;
	private final ModelPart rightAppendage3;
	private final ModelPart rightAppendageClaw1;
	private final ModelPart rightAppendageClaw2;
	private final ModelPart rightAppendageClaw3;
	private final ModelPart body1;
	private final ModelPart leftFlipper3;
	private final ModelPart rightFlipper3;
	private final ModelPart leftFlipper4;
	private final ModelPart rightFlipper4;
	private final ModelPart leftFlipper5;
	private final ModelPart rightFlipper5;
	private final ModelPart body2;
	private final ModelPart leftFlipper6;
	private final ModelPart rightFlipper6;
	private final ModelPart leftFlipper7;
	private final ModelPart rightFlipper7;
	private final ModelPart leftFlipper8;
	private final ModelPart rightFlipper8;
	private final ModelPart body3;
	private final ModelPart leftFlipper9;
	private final ModelPart rightFlipper9;
	private final ModelPart leftFlipper10;
	private final ModelPart rightFlipper10;
	private final ModelPart leftFlipper11;
	private final ModelPart rightFlipper11;
	private final ModelPart leftFlipper12;
	private final ModelPart rightFlipper12;
	private final ModelPart leftFlipper13;
	private final ModelPart rightFlipper13;
	private final ModelPart tail1;
	private final ModelPart tail2;

	public MobulavermisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.Head = this.fossil.getChild("Head");
		this.leftFlipper1 = this.Head.getChild("leftFlipper1");
		this.rightFlipper1 = this.Head.getChild("rightFlipper1");
		this.leftFlipper2 = this.Head.getChild("leftFlipper2");
		this.rightFlipper2 = this.Head.getChild("rightFlipper2");
		this.leftAppendage1 = this.Head.getChild("leftAppendage1");
		this.leftAppendage2 = this.leftAppendage1.getChild("leftAppendage2");
		this.leftAppendage3 = this.leftAppendage2.getChild("leftAppendage3");
		this.leftAppendageClaw1 = this.leftAppendage3.getChild("leftAppendageClaw1");
		this.leftAppendageClaw2 = this.leftAppendage3.getChild("leftAppendageClaw2");
		this.leftAppendageClaw3 = this.leftAppendage3.getChild("leftAppendageClaw3");
		this.rightAppendage1 = this.Head.getChild("rightAppendage1");
		this.rightAppendage2 = this.rightAppendage1.getChild("rightAppendage2");
		this.rightAppendage3 = this.rightAppendage2.getChild("rightAppendage3");
		this.rightAppendageClaw1 = this.rightAppendage3.getChild("rightAppendageClaw1");
		this.rightAppendageClaw2 = this.rightAppendage3.getChild("rightAppendageClaw2");
		this.rightAppendageClaw3 = this.rightAppendage3.getChild("rightAppendageClaw3");
		this.body1 = this.Head.getChild("body1");
		this.leftFlipper3 = this.body1.getChild("leftFlipper3");
		this.rightFlipper3 = this.body1.getChild("rightFlipper3");
		this.leftFlipper4 = this.body1.getChild("leftFlipper4");
		this.rightFlipper4 = this.body1.getChild("rightFlipper4");
		this.leftFlipper5 = this.body1.getChild("leftFlipper5");
		this.rightFlipper5 = this.body1.getChild("rightFlipper5");
		this.body2 = this.body1.getChild("body2");
		this.leftFlipper6 = this.body2.getChild("leftFlipper6");
		this.rightFlipper6 = this.body2.getChild("rightFlipper6");
		this.leftFlipper7 = this.body2.getChild("leftFlipper7");
		this.rightFlipper7 = this.body2.getChild("rightFlipper7");
		this.leftFlipper8 = this.body2.getChild("leftFlipper8");
		this.rightFlipper8 = this.body2.getChild("rightFlipper8");
		this.body3 = this.body2.getChild("body3");
		this.leftFlipper9 = this.body3.getChild("leftFlipper9");
		this.rightFlipper9 = this.body3.getChild("rightFlipper9");
		this.leftFlipper10 = this.body3.getChild("leftFlipper10");
		this.rightFlipper10 = this.body3.getChild("rightFlipper10");
		this.leftFlipper11 = this.body3.getChild("leftFlipper11");
		this.rightFlipper11 = this.body3.getChild("rightFlipper11");
		this.leftFlipper12 = this.body3.getChild("leftFlipper12");
		this.rightFlipper12 = this.body3.getChild("rightFlipper12");
		this.leftFlipper13 = this.body3.getChild("leftFlipper13");
		this.rightFlipper13 = this.body3.getChild("rightFlipper13");
		this.tail1 = this.body3.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(5.5F, 22.95F, -1.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-21.0F, 0.05F, -11.0F, 35.0F, 1.0F, 33.0F, new CubeDeformation(0.01F))
				.texOffs(75, 64).addBox(-13.0F, 0.05F, -29.0F, 27.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, -5.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 35).addBox(0.0F, -1.0F, -20.0F, 24.0F, 1.0F, 20.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-21.0F, 1.05F, -11.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 35).addBox(-25.0F, -1.0F, 0.0F, 25.0F, 1.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 1.05F, 22.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -0.5F, 0.0F, 24.0F, 1.0F, 26.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-21.0F, 0.55F, 22.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition Head = fossil.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -0.01F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(24, 13).addBox(-1.0F, -0.04F, -7.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 22).addBox(0.5F, -0.025F, -6.25F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(-1.5F, -0.025F, -6.25F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -5.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 21).addBox(-0.6F, -0.475F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -7.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 19).addBox(-0.4F, -0.475F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -7.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition leftFlipper1 = Head.addOrReplaceChild("leftFlipper1", CubeListBuilder.create().texOffs(14, 66).addBox(-0.5F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, -2.5F));

		PartDefinition rightFlipper1 = Head.addOrReplaceChild("rightFlipper1", CubeListBuilder.create().texOffs(11, 60).addBox(-3.5F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, -2.5F));

		PartDefinition leftFlipper2 = Head.addOrReplaceChild("leftFlipper2", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, -1.0F));

		PartDefinition cube_r6 = leftFlipper2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, 73).addBox(0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightFlipper2 = Head.addOrReplaceChild("rightFlipper2", CubeListBuilder.create().texOffs(0, 64).addBox(-4.25F, 0.025F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, -1.0F));

		PartDefinition leftAppendage1 = Head.addOrReplaceChild("leftAppendage1", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, 0.2F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, -4.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r7 = leftAppendage1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -0.275F, -0.75F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r8 = leftAppendage1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -0.275F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.5F, -1.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftAppendage2 = leftAppendage1.addOrReplaceChild("leftAppendage2", CubeListBuilder.create().texOffs(13, 70).addBox(0.0F, 0.2F, -1.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 64).addBox(0.0F, 0.05F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.5F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r9 = leftAppendage2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 8).addBox(0.0F, -0.275F, -1.75F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r10 = leftAppendage2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 11).addBox(0.0F, -0.275F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.5F, -1.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftAppendage3 = leftAppendage2.addOrReplaceChild("leftAppendage3", CubeListBuilder.create().texOffs(15, 68).addBox(0.0F, 0.19F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -0.5F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r11 = leftAppendage3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 9).addBox(0.0F, -0.275F, -2.75F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5F, -1.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftAppendageClaw1 = leftAppendage3.addOrReplaceChild("leftAppendageClaw1", CubeListBuilder.create().texOffs(13, 52).addBox(0.0F, 0.32F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.1F, -1.0F, 0.0F, 1.0908F, 0.0F));

		PartDefinition leftAppendageClaw2 = leftAppendage3.addOrReplaceChild("leftAppendageClaw2", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, 0.23F, -3.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition leftAppendageClaw3 = leftAppendage3.addOrReplaceChild("leftAppendageClaw3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, 0.24F, -0.5F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -0.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightAppendage1 = Head.addOrReplaceChild("rightAppendage1", CubeListBuilder.create().texOffs(0, 30).addBox(-4.0F, 0.25F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, -4.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r12 = rightAppendage1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.225F, -0.75F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition rightAppendage2 = rightAppendage1.addOrReplaceChild("rightAppendage2", CubeListBuilder.create().texOffs(0, 60).addBox(-4.0F, 0.25F, -1.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 58).addBox(-4.0F, 0.14F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r13 = rightAppendage2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.225F, -1.75F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r14 = rightAppendage2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.225F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, -1.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition rightAppendage3 = rightAppendage2.addOrReplaceChild("rightAppendage3", CubeListBuilder.create().texOffs(16, 35).addBox(-4.0F, 0.24F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -0.5F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r15 = rightAppendage3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 1).addBox(-1.0F, -0.225F, -2.75F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.5F, -1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r16 = rightAppendage3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, -0.225F, -2.25F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition rightAppendageClaw1 = rightAppendage3.addOrReplaceChild("rightAppendageClaw1", CubeListBuilder.create().texOffs(13, 43).addBox(-4.0F, 0.37F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.1F, -1.0F, 0.0F, -1.0908F, 0.0F));

		PartDefinition rightAppendageClaw2 = rightAppendage3.addOrReplaceChild("rightAppendageClaw2", CubeListBuilder.create().texOffs(0, 26).addBox(-6.0F, 0.28F, -3.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition rightAppendageClaw3 = rightAppendage3.addOrReplaceChild("rightAppendageClaw3", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 0.27F, -0.5F, 10.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -0.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body1 = Head.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(13, 25).addBox(-1.5F, -0.01F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftFlipper3 = body1.addOrReplaceChild("leftFlipper3", CubeListBuilder.create().texOffs(75, 70).addBox(-0.75F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 70).mirror().addBox(-7.25F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 0.0F, 1.0F));

		PartDefinition rightFlipper3 = body1.addOrReplaceChild("rightFlipper3", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.0F, 1.0F));

		PartDefinition leftFlipper4 = body1.addOrReplaceChild("leftFlipper4", CubeListBuilder.create().texOffs(75, 67).addBox(-0.5F, 0.025F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 3.0F));

		PartDefinition rightFlipper4 = body1.addOrReplaceChild("rightFlipper4", CubeListBuilder.create().texOffs(0, 57).addBox(-4.5F, 0.025F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 3.0F));

		PartDefinition leftFlipper5 = body1.addOrReplaceChild("leftFlipper5", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 5.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightFlipper5 = body1.addOrReplaceChild("rightFlipper5", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-4.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 0.0F, 5.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(11, 18).addBox(-1.5F, -0.01F, 0.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftFlipper6 = body2.addOrReplaceChild("leftFlipper6", CubeListBuilder.create().texOffs(75, 64).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 1.0F));

		PartDefinition rightFlipper6 = body2.addOrReplaceChild("rightFlipper6", CubeListBuilder.create().texOffs(0, 51).addBox(-4.5F, 0.025F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 1.0F));

		PartDefinition leftFlipper7 = body2.addOrReplaceChild("leftFlipper7", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 3.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightFlipper7 = body2.addOrReplaceChild("rightFlipper7", CubeListBuilder.create().texOffs(0, 48).addBox(-4.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 3.0F));

		PartDefinition leftFlipper8 = body2.addOrReplaceChild("leftFlipper8", CubeListBuilder.create().texOffs(0, 70).addBox(-0.75F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 5.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightFlipper8 = body2.addOrReplaceChild("rightFlipper8", CubeListBuilder.create().texOffs(0, 45).addBox(-4.25F, 0.025F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 5.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.01F, 0.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftFlipper9 = body3.addOrReplaceChild("leftFlipper9", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 1.0F));

		PartDefinition rightFlipper9 = body3.addOrReplaceChild("rightFlipper9", CubeListBuilder.create().texOffs(10, 39).addBox(-4.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 1.0F));

		PartDefinition leftFlipper10 = body3.addOrReplaceChild("leftFlipper10", CubeListBuilder.create().texOffs(13, 49).mirror().addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, 0.0F, 3.0F));

		PartDefinition rightFlipper10 = body3.addOrReplaceChild("rightFlipper10", CubeListBuilder.create().texOffs(13, 49).addBox(-4.0F, 0.025F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 3.0F));

		PartDefinition leftFlipper11 = body3.addOrReplaceChild("leftFlipper11", CubeListBuilder.create().texOffs(13, 55).addBox(-0.75F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 5.0F));

		PartDefinition rightFlipper11 = body3.addOrReplaceChild("rightFlipper11", CubeListBuilder.create().texOffs(13, 46).addBox(-3.25F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 5.0F));

		PartDefinition leftFlipper12 = body3.addOrReplaceChild("leftFlipper12", CubeListBuilder.create().texOffs(24, 20).addBox(-0.75F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 6.5F));

		PartDefinition rightFlipper12 = body3.addOrReplaceChild("rightFlipper12", CubeListBuilder.create().texOffs(24, 18).addBox(-2.25F, 0.025F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 6.5F));

		PartDefinition leftFlipper13 = body3.addOrReplaceChild("leftFlipper13", CubeListBuilder.create().texOffs(11, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 7.5F));

		PartDefinition rightFlipper13 = body3.addOrReplaceChild("rightFlipper13", CubeListBuilder.create().texOffs(13, 14).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 7.5F));

		PartDefinition tail1 = body3.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.01F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -0.01F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 170, 95);
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