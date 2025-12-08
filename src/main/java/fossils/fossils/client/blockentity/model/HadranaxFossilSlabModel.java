package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HadranaxFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart leftLeg1;
	private final ModelPart rightLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart rightLeg2;
	private final ModelPart leftAppendage1;
	private final ModelPart leftClaw1;
	private final ModelPart LeftAppendage2;
	private final ModelPart leftClaw2;
	private final ModelPart LeftAppendage3;
	private final ModelPart leftClaw3;
	private final ModelPart leftClaw4;
	private final ModelPart rightAppendage1;
	private final ModelPart rightClaw1;
	private final ModelPart RightAppendage2;
	private final ModelPart rightClaw2;
	private final ModelPart RightAppendage3;
	private final ModelPart rightClaw3;
	private final ModelPart rightClaw4;
	private final ModelPart RightAppendage4;
	private final ModelPart rightClaw5;
	private final ModelPart RightAppendage5;
	private final ModelPart rightClaw6;
	private final ModelPart rightClaw7;
	private final ModelPart body1;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart rightLeg6;
	private final ModelPart body2;
	private final ModelPart leftLeg7;
	private final ModelPart rightLeg7;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg8;
	private final ModelPart leftLeg9;
	private final ModelPart rightLeg9;
	private final ModelPart leftLeg10;
	private final ModelPart rightLeg10;
	private final ModelPart leftLeg11;
	private final ModelPart rightLeg11;
	private final ModelPart body3;
	private final ModelPart leftLeg12;
	private final ModelPart rightLeg12;
	private final ModelPart leftLeg13;
	private final ModelPart rightLeg13;
	private final ModelPart leftLeg14;
	private final ModelPart rightLeg14;
	private final ModelPart leftLeg15;
	private final ModelPart rightLeg15;
	private final ModelPart tail;
	private final ModelPart leftLeg16;
	private final ModelPart rightLeg16;
	private final ModelPart leftLeg17;
	private final ModelPart rightLeg17;

	public HadranaxFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.leftLeg1 = this.head.getChild("leftLeg1");
		this.rightLeg1 = this.head.getChild("rightLeg1");
		this.leftLeg2 = this.head.getChild("leftLeg2");
		this.rightLeg2 = this.head.getChild("rightLeg2");
		this.leftAppendage1 = this.head.getChild("leftAppendage1");
		this.leftClaw1 = this.leftAppendage1.getChild("leftClaw1");
		this.LeftAppendage2 = this.leftAppendage1.getChild("LeftAppendage2");
		this.leftClaw2 = this.LeftAppendage2.getChild("leftClaw2");
		this.LeftAppendage3 = this.LeftAppendage2.getChild("LeftAppendage3");
		this.leftClaw3 = this.LeftAppendage3.getChild("leftClaw3");
		this.leftClaw4 = this.LeftAppendage3.getChild("leftClaw4");
		this.rightAppendage1 = this.head.getChild("rightAppendage1");
		this.rightClaw1 = this.rightAppendage1.getChild("rightClaw1");
		this.RightAppendage2 = this.rightAppendage1.getChild("RightAppendage2");
		this.rightClaw2 = this.RightAppendage2.getChild("rightClaw2");
		this.RightAppendage3 = this.RightAppendage2.getChild("RightAppendage3");
		this.rightClaw3 = this.RightAppendage3.getChild("rightClaw3");
		this.rightClaw4 = this.RightAppendage3.getChild("rightClaw4");
		this.RightAppendage4 = this.rightAppendage1.getChild("RightAppendage4");
		this.rightClaw5 = this.RightAppendage4.getChild("rightClaw5");
		this.RightAppendage5 = this.RightAppendage4.getChild("RightAppendage5");
		this.rightClaw6 = this.RightAppendage5.getChild("rightClaw6");
		this.rightClaw7 = this.RightAppendage5.getChild("rightClaw7");
		this.body1 = this.head.getChild("body1");
		this.leftLeg3 = this.body1.getChild("leftLeg3");
		this.rightLeg3 = this.body1.getChild("rightLeg3");
		this.leftLeg4 = this.body1.getChild("leftLeg4");
		this.rightLeg4 = this.body1.getChild("rightLeg4");
		this.leftLeg5 = this.body1.getChild("leftLeg5");
		this.rightLeg5 = this.body1.getChild("rightLeg5");
		this.leftLeg6 = this.body1.getChild("leftLeg6");
		this.rightLeg6 = this.body1.getChild("rightLeg6");
		this.body2 = this.body1.getChild("body2");
		this.leftLeg7 = this.body2.getChild("leftLeg7");
		this.rightLeg7 = this.body2.getChild("rightLeg7");
		this.leftLeg8 = this.body2.getChild("leftLeg8");
		this.rightLeg8 = this.body2.getChild("rightLeg8");
		this.leftLeg9 = this.body2.getChild("leftLeg9");
		this.rightLeg9 = this.body2.getChild("rightLeg9");
		this.leftLeg10 = this.body2.getChild("leftLeg10");
		this.rightLeg10 = this.body2.getChild("rightLeg10");
		this.leftLeg11 = this.body2.getChild("leftLeg11");
		this.rightLeg11 = this.body2.getChild("rightLeg11");
		this.body3 = this.body2.getChild("body3");
		this.leftLeg12 = this.body3.getChild("leftLeg12");
		this.rightLeg12 = this.body3.getChild("rightLeg12");
		this.leftLeg13 = this.body3.getChild("leftLeg13");
		this.rightLeg13 = this.body3.getChild("rightLeg13");
		this.leftLeg14 = this.body3.getChild("leftLeg14");
		this.rightLeg14 = this.body3.getChild("rightLeg14");
		this.leftLeg15 = this.body3.getChild("leftLeg15");
		this.rightLeg15 = this.body3.getChild("rightLeg15");
		this.tail = this.body3.getChild("tail");
		this.leftLeg16 = this.tail.getChild("leftLeg16");
		this.rightLeg16 = this.tail.getChild("rightLeg16");
		this.leftLeg17 = this.tail.getChild("leftLeg17");
		this.rightLeg17 = this.tail.getChild("rightLeg17");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.0F, -32.0F, 12.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 24.0F, 8.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 30).addBox(-12.2963F, -2.0F, -22.1195F, 27.0F, 2.0F, 22.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-11.0F, 0.0F, 1.0F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 21.0F, 2.0F, 27.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -32.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, 1.0F, -5.75F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, -9.25F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftLeg1 = head.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.6F, -1.75F));

		PartDefinition rightLeg1 = head.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(22, 51).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.6F, -1.75F));

		PartDefinition leftLeg2 = head.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(58, 57).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.6F, -0.5F));

		PartDefinition rightLeg2 = head.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(11, 51).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.6F, -0.5F));

		PartDefinition leftAppendage1 = head.addOrReplaceChild("leftAppendage1", CubeListBuilder.create().texOffs(22, 55).addBox(0.0F, -1.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, -2.75F, 0.0F, 0.3054F, 0.0F));

		PartDefinition leftClaw1 = leftAppendage1.addOrReplaceChild("leftClaw1", CubeListBuilder.create().texOffs(15, 4).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition LeftAppendage2 = leftAppendage1.addOrReplaceChild("LeftAppendage2", CubeListBuilder.create().texOffs(11, 55).addBox(0.0F, -1.05F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftClaw2 = LeftAppendage2.addOrReplaceChild("leftClaw2", CubeListBuilder.create().texOffs(14, 17).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition LeftAppendage3 = LeftAppendage2.addOrReplaceChild("LeftAppendage3", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -1.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition leftClaw3 = LeftAppendage3.addOrReplaceChild("leftClaw3", CubeListBuilder.create().texOffs(17, 39).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition leftClaw4 = LeftAppendage3.addOrReplaceChild("leftClaw4", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -1.01F, -3.0F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition rightAppendage1 = head.addOrReplaceChild("rightAppendage1", CubeListBuilder.create().texOffs(22, 53).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, -2.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightClaw1 = rightAppendage1.addOrReplaceChild("rightClaw1", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -1.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition RightAppendage2 = rightAppendage1.addOrReplaceChild("RightAppendage2", CubeListBuilder.create().texOffs(11, 53).addBox(-4.0F, -1.05F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightClaw2 = RightAppendage2.addOrReplaceChild("rightClaw2", CubeListBuilder.create().texOffs(14, 9).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -1.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition RightAppendage3 = RightAppendage2.addOrReplaceChild("RightAppendage3", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightClaw3 = RightAppendage3.addOrReplaceChild("rightClaw3", CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -1.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightClaw4 = RightAppendage3.addOrReplaceChild("rightClaw4", CubeListBuilder.create().texOffs(0, 30).addBox(-8.0F, -1.01F, -3.0F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition RightAppendage4 = rightAppendage1.addOrReplaceChild("RightAppendage4", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.6814F, -1.0F, 12.1977F, 0.0F, -1.3875F, 0.0F));

		PartDefinition rightClaw5 = RightAppendage4.addOrReplaceChild("rightClaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.0F, -0.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition RightAppendage5 = RightAppendage4.addOrReplaceChild("RightAppendage5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 1.0F, 0.5F, 0.0F, -0.9599F, 0.0F));

		PartDefinition rightClaw6 = RightAppendage5.addOrReplaceChild("rightClaw6", CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition rightClaw7 = RightAppendage5.addOrReplaceChild("rightClaw7", CubeListBuilder.create().texOffs(0, 30).addBox(-8.0F, -1.01F, -3.0F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition body1 = head.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F, 0.95F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition leftLeg3 = body1.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(58, 55).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, 1.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition rightLeg3 = body1.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 51).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 1.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition leftLeg4 = body1.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(58, 50).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, 2.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition rightLeg4 = body1.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(22, 49).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 2.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition leftLeg5 = body1.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(58, 48).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.5F, 4.0F));

		PartDefinition rightLeg5 = body1.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(11, 49).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 4.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftLeg6 = body1.addOrReplaceChild("leftLeg6", CubeListBuilder.create().texOffs(58, 46).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, 5.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rightLeg6 = body1.addOrReplaceChild("rightLeg6", CubeListBuilder.create().texOffs(0, 49).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 5.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.9F, 0.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.75F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftLeg7 = body2.addOrReplaceChild("leftLeg7", CubeListBuilder.create().texOffs(58, 44).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.5F, 0.5F));

		PartDefinition rightLeg7 = body2.addOrReplaceChild("rightLeg7", CubeListBuilder.create().texOffs(22, 47).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 0.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition leftLeg8 = body2.addOrReplaceChild("leftLeg8", CubeListBuilder.create().texOffs(58, 42).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.5F, 2.25F));

		PartDefinition rightLeg8 = body2.addOrReplaceChild("rightLeg8", CubeListBuilder.create().texOffs(11, 47).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 2.25F, 0.0F, 0.2618F, 0.0F));

		PartDefinition leftLeg9 = body2.addOrReplaceChild("leftLeg9", CubeListBuilder.create().texOffs(58, 40).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.5F, 4.0F));

		PartDefinition rightLeg9 = body2.addOrReplaceChild("rightLeg9", CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 4.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition leftLeg10 = body2.addOrReplaceChild("leftLeg10", CubeListBuilder.create().texOffs(58, 38).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.5F, 5.75F));

		PartDefinition rightLeg10 = body2.addOrReplaceChild("rightLeg10", CubeListBuilder.create().texOffs(22, 45).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 5.75F, 0.0F, 0.2618F, 0.0F));

		PartDefinition leftLeg11 = body2.addOrReplaceChild("leftLeg11", CubeListBuilder.create().texOffs(58, 36).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.6F, 7.5F));

		PartDefinition rightLeg11 = body2.addOrReplaceChild("rightLeg11", CubeListBuilder.create().texOffs(11, 45).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 1.6F, 7.5F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, 0.95F, -0.25F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition leftLeg12 = body3.addOrReplaceChild("leftLeg12", CubeListBuilder.create().texOffs(58, 34).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, 1.25F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightLeg12 = body3.addOrReplaceChild("rightLeg12", CubeListBuilder.create().texOffs(0, 45).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 1.25F, 0.0F, 0.3054F, 0.0F));

		PartDefinition leftLeg13 = body3.addOrReplaceChild("leftLeg13", CubeListBuilder.create().texOffs(58, 32).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.6F, 2.75F));

		PartDefinition rightLeg13 = body3.addOrReplaceChild("rightLeg13", CubeListBuilder.create().texOffs(20, 30).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 1.6F, 2.75F));

		PartDefinition leftLeg14 = body3.addOrReplaceChild("leftLeg14", CubeListBuilder.create().texOffs(58, 30).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.5F, 4.25F));

		PartDefinition rightLeg14 = body3.addOrReplaceChild("rightLeg14", CubeListBuilder.create().texOffs(11, 25).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 1.5F, 4.25F));

		PartDefinition leftLeg15 = body3.addOrReplaceChild("leftLeg15", CubeListBuilder.create().texOffs(22, 57).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, 5.75F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rightLeg15 = body3.addOrReplaceChild("rightLeg15", CubeListBuilder.create().texOffs(0, 25).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.5F, 5.75F, 0.0F, 0.3054F, 0.0F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 39).addBox(-1.0F, 1.0F, -0.25F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.75F, 0.0F, -0.1745F, 0.0F));

		PartDefinition leftLeg16 = tail.addOrReplaceChild("leftLeg16", CubeListBuilder.create().texOffs(11, 57).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.6F, 0.5F));

		PartDefinition rightLeg16 = tail.addOrReplaceChild("rightLeg16", CubeListBuilder.create().texOffs(14, 22).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.6F, 0.5F));

		PartDefinition leftLeg17 = tail.addOrReplaceChild("leftLeg17", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.6F, 1.75F));

		PartDefinition rightLeg17 = tail.addOrReplaceChild("rightLeg17", CubeListBuilder.create().texOffs(14, 14).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.6F, 1.75F));

		return LayerDefinition.create(meshdefinition, 160, 70);
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