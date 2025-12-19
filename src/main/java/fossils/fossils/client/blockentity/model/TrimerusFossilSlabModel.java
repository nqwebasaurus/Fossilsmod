package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TrimerusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Trimerus;
	private final ModelPart LEFTCEPHALON1;
	private final ModelPart LEFTCEPHALON2;
	private final ModelPart LEFTCEPHALON3;
	private final ModelPart RIGHTCEPHALON1;
	private final ModelPart RIGHTCEPHALON2;
	private final ModelPart RIGHTCEPHALON3;
	private final ModelPart leftAntenna;
	private final ModelPart rightAntenna;
	private final ModelPart leftLeg1;
	private final ModelPart rightLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart rightLeg2;
	private final ModelPart body1;
	private final ModelPart LEFTRIDGE1;
	private final ModelPart RIGHTRIDGE1;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg5;
	private final ModelPart body2;
	private final ModelPart LEFTRIDGE2;
	private final ModelPart RIGHTRIDGE2;
	private final ModelPart leftLeg6;
	private final ModelPart rightLeg6;
	private final ModelPart leftLeg7;
	private final ModelPart rightLeg7;
	private final ModelPart body3;
	private final ModelPart LEFTRIDGE3;
	private final ModelPart RIGHTRIDGE3;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg8;
	private final ModelPart leftLeg9;
	private final ModelPart rightLeg9;
	private final ModelPart leftLeg10;
	private final ModelPart rightLeg10;

	public TrimerusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Trimerus = this.fossil.getChild("Trimerus");
		this.LEFTCEPHALON1 = this.Trimerus.getChild("LEFTCEPHALON1");
		this.LEFTCEPHALON2 = this.LEFTCEPHALON1.getChild("LEFTCEPHALON2");
		this.LEFTCEPHALON3 = this.LEFTCEPHALON2.getChild("LEFTCEPHALON3");
		this.RIGHTCEPHALON1 = this.Trimerus.getChild("RIGHTCEPHALON1");
		this.RIGHTCEPHALON2 = this.RIGHTCEPHALON1.getChild("RIGHTCEPHALON2");
		this.RIGHTCEPHALON3 = this.RIGHTCEPHALON2.getChild("RIGHTCEPHALON3");
		this.leftAntenna = this.Trimerus.getChild("leftAntenna");
		this.rightAntenna = this.Trimerus.getChild("rightAntenna");
		this.leftLeg1 = this.Trimerus.getChild("leftLeg1");
		this.rightLeg1 = this.Trimerus.getChild("rightLeg1");
		this.leftLeg2 = this.Trimerus.getChild("leftLeg2");
		this.rightLeg2 = this.Trimerus.getChild("rightLeg2");
		this.body1 = this.Trimerus.getChild("body1");
		this.LEFTRIDGE1 = this.body1.getChild("LEFTRIDGE1");
		this.RIGHTRIDGE1 = this.body1.getChild("RIGHTRIDGE1");
		this.leftLeg3 = this.body1.getChild("leftLeg3");
		this.rightLeg3 = this.body1.getChild("rightLeg3");
		this.leftLeg4 = this.body1.getChild("leftLeg4");
		this.rightLeg4 = this.body1.getChild("rightLeg4");
		this.leftLeg5 = this.body1.getChild("leftLeg5");
		this.rightLeg5 = this.body1.getChild("rightLeg5");
		this.body2 = this.body1.getChild("body2");
		this.LEFTRIDGE2 = this.body2.getChild("LEFTRIDGE2");
		this.RIGHTRIDGE2 = this.body2.getChild("RIGHTRIDGE2");
		this.leftLeg6 = this.body2.getChild("leftLeg6");
		this.rightLeg6 = this.body2.getChild("rightLeg6");
		this.leftLeg7 = this.body2.getChild("leftLeg7");
		this.rightLeg7 = this.body2.getChild("rightLeg7");
		this.body3 = this.body2.getChild("body3");
		this.LEFTRIDGE3 = this.body3.getChild("LEFTRIDGE3");
		this.RIGHTRIDGE3 = this.body3.getChild("RIGHTRIDGE3");
		this.leftLeg8 = this.body3.getChild("leftLeg8");
		this.rightLeg8 = this.body3.getChild("rightLeg8");
		this.leftLeg9 = this.body3.getChild("leftLeg9");
		this.rightLeg9 = this.body3.getChild("rightLeg9");
		this.leftLeg10 = this.body3.getChild("leftLeg10");
		this.rightLeg10 = this.body3.getChild("rightLeg10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -0.9F, -10.0F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.02F))
				.texOffs(0, 22).addBox(-0.075F, -0.875F, -6.0F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 23.875F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 40).addBox(0.0F, -1.0F, -0.025F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.1F, -9.975F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 22).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-7.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.0044F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.0F, -3.0F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.025F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0611F));

		PartDefinition Trimerus = fossil.addOrReplaceChild("Trimerus", CubeListBuilder.create().texOffs(15, 55).addBox(-1.0F, 0.35F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.55F, -2.725F, -3.0F, 0.2175F, 0.4782F, 0.0415F));

		PartDefinition cube_r4 = Trimerus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 55).addBox(-1.5F, -0.15F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition LEFTCEPHALON1 = Trimerus.addOrReplaceChild("LEFTCEPHALON1", CubeListBuilder.create().texOffs(57, 5).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 65).addBox(-0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition LEFTCEPHALON2 = LEFTCEPHALON1.addOrReplaceChild("LEFTCEPHALON2", CubeListBuilder.create().texOffs(59, 37).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition LEFTCEPHALON3 = LEFTCEPHALON2.addOrReplaceChild("LEFTCEPHALON3", CubeListBuilder.create().texOffs(45, 37).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(30, 55).addBox(1.3F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, -0.5847F, 0.0F));

		PartDefinition RIGHTCEPHALON1 = Trimerus.addOrReplaceChild("RIGHTCEPHALON1", CubeListBuilder.create().texOffs(57, 11).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(37, 55).addBox(-0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition RIGHTCEPHALON2 = RIGHTCEPHALON1.addOrReplaceChild("RIGHTCEPHALON2", CubeListBuilder.create().texOffs(52, 37).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition RIGHTCEPHALON3 = RIGHTCEPHALON2.addOrReplaceChild("RIGHTCEPHALON3", CubeListBuilder.create().texOffs(58, 63).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(35, 63).addBox(-3.3F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.5847F, 0.0F));

		PartDefinition leftAntenna = Trimerus.addOrReplaceChild("leftAntenna", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4F, -4.15F, -0.1085F, -0.3433F, 0.0779F));

		PartDefinition rightAntenna = Trimerus.addOrReplaceChild("rightAntenna", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.15F, -0.1085F, 0.3433F, -0.0779F));

		PartDefinition leftLeg1 = Trimerus.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, -3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rightLeg1 = Trimerus.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, -3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition leftLeg2 = Trimerus.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, -1.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rightLeg2 = Trimerus.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, -1.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition body1 = Trimerus.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(45, 58).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.65F, -0.2F, -0.176F, -0.1289F, 0.0229F));

		PartDefinition LEFTRIDGE1 = body1.addOrReplaceChild("LEFTRIDGE1", CubeListBuilder.create().texOffs(57, 0).addBox(-1.1F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition RIGHTRIDGE1 = body1.addOrReplaceChild("RIGHTRIDGE1", CubeListBuilder.create().texOffs(43, 53).addBox(-2.9F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition leftLeg3 = body1.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 0.7F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightLeg3 = body1.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 0.7F, 0.0F, 0.0F, -0.48F));

		PartDefinition leftLeg4 = body1.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 2.2F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightLeg4 = body1.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 2.2F, 0.0F, 0.0F, -0.48F));

		PartDefinition leftLeg5 = body1.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 3.7F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightLeg5 = body1.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 3.7F, 0.0F, 0.0F, -0.48F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition LEFTRIDGE2 = body2.addOrReplaceChild("LEFTRIDGE2", CubeListBuilder.create().texOffs(58, 58).addBox(-0.25F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, 2.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition RIGHTRIDGE2 = body2.addOrReplaceChild("RIGHTRIDGE2", CubeListBuilder.create().texOffs(57, 17).addBox(-2.75F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.75F, 2.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition leftLeg6 = body2.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 1.2F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightLeg6 = body2.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 1.2F, 0.0F, 0.0F, -0.4363F));

		PartDefinition leftLeg7 = body2.addOrReplaceChild("leftLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 2.7F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rightLeg7 = body2.addOrReplaceChild("rightLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 2.7F, 0.0F, 0.0F, -0.3927F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 62).addBox(-0.5F, 1.0F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 63).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition LEFTRIDGE3 = body3.addOrReplaceChild("LEFTRIDGE3", CubeListBuilder.create().texOffs(60, 53).addBox(-0.2F, -0.15F, -0.2F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 0.0F, -0.2177F, -0.0615F, 0.7532F));

		PartDefinition RIGHTRIDGE3 = body3.addOrReplaceChild("RIGHTRIDGE3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, -0.2177F, 0.0615F, -0.7532F));

		PartDefinition cube_r6 = RIGHTRIDGE3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 58).addBox(-2.8F, -0.15F, -0.2F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = body3.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 0.2F, 0.0F, 0.0F, 0.5236F));

		PartDefinition rightLeg8 = body3.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 0.2F, 0.0F, 0.0F, -0.5236F));

		PartDefinition leftLeg9 = body3.addOrReplaceChild("leftLeg9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 1.7F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightLeg9 = body3.addOrReplaceChild("rightLeg9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 1.7F, 0.0F, 0.0F, -0.48F));

		PartDefinition leftLeg10 = body3.addOrReplaceChild("leftLeg10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 3.2F, 0.0F, 0.0F, 0.8727F));

		PartDefinition rightLeg10 = body3.addOrReplaceChild("rightLeg10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, 3.2F, 0.0F, 0.0F, -0.8727F));

		return LayerDefinition.create(meshdefinition, 85, 70);
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