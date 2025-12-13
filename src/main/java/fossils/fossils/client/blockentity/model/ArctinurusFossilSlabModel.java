package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArctinurusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart antennaR;
	private final ModelPart antennaL;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart tail;
	private final ModelPart head7;
	private final ModelPart antennaR7;
	private final ModelPart antennaL7;
	private final ModelPart body35;
	private final ModelPart body36;
	private final ModelPart body37;
	private final ModelPart body38;
	private final ModelPart body39;
	private final ModelPart body40;
	private final ModelPart tail6;
	private final ModelPart head6;
	private final ModelPart antennaR6;
	private final ModelPart antennaL6;
	private final ModelPart body29;
	private final ModelPart body30;
	private final ModelPart body31;
	private final ModelPart body32;
	private final ModelPart body33;
	private final ModelPart body34;
	private final ModelPart tail5;
	private final ModelPart head5;
	private final ModelPart antennaR5;
	private final ModelPart antennaL5;
	private final ModelPart body23;
	private final ModelPart body24;
	private final ModelPart body25;
	private final ModelPart body26;
	private final ModelPart body27;
	private final ModelPart body28;
	private final ModelPart tail4;
	private final ModelPart head4;
	private final ModelPart antennaR4;
	private final ModelPart antennaL4;
	private final ModelPart body20;
	private final ModelPart body21;
	private final ModelPart body22;
	private final ModelPart head3;
	private final ModelPart antennaR3;
	private final ModelPart antennaL3;
	private final ModelPart body14;
	private final ModelPart body15;
	private final ModelPart body16;
	private final ModelPart body17;
	private final ModelPart body18;
	private final ModelPart body19;
	private final ModelPart tail3;
	private final ModelPart head2;
	private final ModelPart antennaR2;
	private final ModelPart antennaL2;
	private final ModelPart body8;
	private final ModelPart body9;
	private final ModelPart body10;
	private final ModelPart body11;
	private final ModelPart body12;
	private final ModelPart body13;
	private final ModelPart tail2;

	public ArctinurusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.head = this.body.getChild("head");
		this.antennaR = this.head.getChild("antennaR");
		this.antennaL = this.head.getChild("antennaL");
		this.body2 = this.head.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.tail = this.body7.getChild("tail");
		this.head7 = this.body.getChild("head7");
		this.antennaR7 = this.head7.getChild("antennaR7");
		this.antennaL7 = this.head7.getChild("antennaL7");
		this.body35 = this.head7.getChild("body35");
		this.body36 = this.body35.getChild("body36");
		this.body37 = this.body36.getChild("body37");
		this.body38 = this.body37.getChild("body38");
		this.body39 = this.body38.getChild("body39");
		this.body40 = this.body39.getChild("body40");
		this.tail6 = this.body40.getChild("tail6");
		this.head6 = this.body.getChild("head6");
		this.antennaR6 = this.head6.getChild("antennaR6");
		this.antennaL6 = this.head6.getChild("antennaL6");
		this.body29 = this.head6.getChild("body29");
		this.body30 = this.body29.getChild("body30");
		this.body31 = this.body30.getChild("body31");
		this.body32 = this.body31.getChild("body32");
		this.body33 = this.body32.getChild("body33");
		this.body34 = this.body33.getChild("body34");
		this.tail5 = this.body34.getChild("tail5");
		this.head5 = this.body.getChild("head5");
		this.antennaR5 = this.head5.getChild("antennaR5");
		this.antennaL5 = this.head5.getChild("antennaL5");
		this.body23 = this.head5.getChild("body23");
		this.body24 = this.body23.getChild("body24");
		this.body25 = this.body24.getChild("body25");
		this.body26 = this.body25.getChild("body26");
		this.body27 = this.body26.getChild("body27");
		this.body28 = this.body27.getChild("body28");
		this.tail4 = this.body28.getChild("tail4");
		this.head4 = this.body.getChild("head4");
		this.antennaR4 = this.head4.getChild("antennaR4");
		this.antennaL4 = this.head4.getChild("antennaL4");
		this.body20 = this.head4.getChild("body20");
		this.body21 = this.body20.getChild("body21");
		this.body22 = this.body21.getChild("body22");
		this.head3 = this.body.getChild("head3");
		this.antennaR3 = this.head3.getChild("antennaR3");
		this.antennaL3 = this.head3.getChild("antennaL3");
		this.body14 = this.head3.getChild("body14");
		this.body15 = this.body14.getChild("body15");
		this.body16 = this.body15.getChild("body16");
		this.body17 = this.body16.getChild("body17");
		this.body18 = this.body17.getChild("body18");
		this.body19 = this.body18.getChild("body19");
		this.tail3 = this.body19.getChild("tail3");
		this.head2 = this.body.getChild("head2");
		this.antennaR2 = this.head2.getChild("antennaR2");
		this.antennaL2 = this.head2.getChild("antennaL2");
		this.body8 = this.head2.getChild("body8");
		this.body9 = this.body8.getChild("body9");
		this.body10 = this.body9.getChild("body10");
		this.body11 = this.body10.getChild("body11");
		this.body12 = this.body11.getChild("body12");
		this.body13 = this.body12.getChild("body13");
		this.tail2 = this.body13.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 123).addBox(-35.0F, -2.0F, -19.0F, 45.0F, 2.0F, 50.0F, new CubeDeformation(0.004F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-25.2F, -2.0F, -39.6F, 55.0F, 2.0F, 67.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(10.0F, 0.0F, -5.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 70).addBox(0.5F, -1.0F, 0.0F, 75.0F, 2.0F, 50.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.5F, -1.0F, 31.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-12.0F, -1.5F, -7.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.0F, -1.4F, 2.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r1 = head.addOrReplaceChild("wing_r1", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r2 = head.addOrReplaceChild("wing_r2", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r3 = head.addOrReplaceChild("wing_r3", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r4 = head.addOrReplaceChild("wing_r4", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing_r5 = head.addOrReplaceChild("wing_r5", CubeListBuilder.create().texOffs(29, 53).addBox(-4.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.2618F, -0.1745F));

		PartDefinition wing_r6 = head.addOrReplaceChild("wing_r6", CubeListBuilder.create().texOffs(18, 53).addBox(-7.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.7854F, -0.1745F));

		PartDefinition wing_r7 = head.addOrReplaceChild("wing_r7", CubeListBuilder.create().texOffs(0, 3).addBox(-6.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 1.2654F, -0.1745F));

		PartDefinition wing_r8 = head.addOrReplaceChild("wing_r8", CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.25F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition antennaR = head.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(0, 42).addBox(-6.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL = head.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(23, 42).addBox(0.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body2 = head.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 9).addBox(-6.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 27).addBox(-6.51F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 37).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r10 = body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 0).addBox(-6.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r11 = body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(48, 30).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r12 = body5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 14).addBox(-6.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r13 = body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 32).addBox(-1.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(44, 47).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r14 = body6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(25, 27).addBox(-6.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r15 = body6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(30, 48).addBox(-2.0F, -2.01F, -0.49F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 2.5F));

		PartDefinition cube_r16 = body7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(41, 42).addBox(-5.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r17 = body7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(44, 1).addBox(-1.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition tail = body7.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, -1.01F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 53).addBox(-0.5F, -0.185F, 1.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.5F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 9).addBox(-4.3F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head7 = body.addOrReplaceChild("head7", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.8F, -1.4F, 39.3F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r20 = head7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r21 = head7.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r9 = head7.addOrReplaceChild("wing_r9", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r10 = head7.addOrReplaceChild("wing_r10", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r11 = head7.addOrReplaceChild("wing_r11", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r12 = head7.addOrReplaceChild("wing_r12", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing_r13 = head7.addOrReplaceChild("wing_r13", CubeListBuilder.create().texOffs(29, 53).addBox(-4.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.2618F, -0.1745F));

		PartDefinition wing_r14 = head7.addOrReplaceChild("wing_r14", CubeListBuilder.create().texOffs(18, 53).addBox(-7.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.7854F, -0.1745F));

		PartDefinition wing_r15 = head7.addOrReplaceChild("wing_r15", CubeListBuilder.create().texOffs(0, 3).addBox(-6.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 1.2654F, -0.1745F));

		PartDefinition wing_r16 = head7.addOrReplaceChild("wing_r16", CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.25F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r22 = head7.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition antennaR7 = head7.addOrReplaceChild("antennaR7", CubeListBuilder.create().texOffs(0, 42).addBox(-6.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL7 = head7.addOrReplaceChild("antennaL7", CubeListBuilder.create().texOffs(23, 42).addBox(0.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body35 = head7.addOrReplaceChild("body35", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r23 = body35.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(23, 9).addBox(-6.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r24 = body35.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body36 = body35.addOrReplaceChild("body36", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r25 = body36.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 27).addBox(-6.51F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r26 = body36.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 37).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body37 = body36.addOrReplaceChild("body37", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r27 = body37.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(23, 0).addBox(-6.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r28 = body37.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body38 = body37.addOrReplaceChild("body38", CubeListBuilder.create().texOffs(48, 30).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r29 = body38.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(27, 14).addBox(-6.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r30 = body38.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 32).addBox(-1.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body39 = body38.addOrReplaceChild("body39", CubeListBuilder.create().texOffs(44, 47).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r31 = body39.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(25, 27).addBox(-6.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r32 = body39.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body40 = body39.addOrReplaceChild("body40", CubeListBuilder.create().texOffs(30, 48).addBox(-2.0F, -2.01F, -0.49F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 2.5F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r33 = body40.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(41, 42).addBox(-5.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r34 = body40.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(44, 1).addBox(-1.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition tail6 = body40.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, -1.01F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 53).addBox(-0.5F, -0.185F, 1.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r35 = tail6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 9).addBox(-4.3F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r36 = tail6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head6 = body.addOrReplaceChild("head6", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(43.0F, -0.8F, -16.0F, 0.0F, -2.4522F, 0.0F));

		PartDefinition cube_r37 = head6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r38 = head6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r17 = head6.addOrReplaceChild("wing_r17", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r18 = head6.addOrReplaceChild("wing_r18", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r19 = head6.addOrReplaceChild("wing_r19", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r20 = head6.addOrReplaceChild("wing_r20", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition antennaR6 = head6.addOrReplaceChild("antennaR6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL6 = head6.addOrReplaceChild("antennaL6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body29 = head6.addOrReplaceChild("body29", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r39 = body29.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body30 = body29.addOrReplaceChild("body30", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r40 = body30.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(25, 37).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body31 = body30.addOrReplaceChild("body31", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r41 = body31.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body32 = body31.addOrReplaceChild("body32", CubeListBuilder.create().texOffs(48, 30).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r42 = body32.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(25, 32).addBox(-1.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body33 = body32.addOrReplaceChild("body33", CubeListBuilder.create().texOffs(44, 47).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r43 = body33.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body34 = body33.addOrReplaceChild("body34", CubeListBuilder.create().texOffs(30, 48).addBox(-2.0F, -2.01F, -0.49F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 2.5F));

		PartDefinition cube_r44 = body34.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(44, 1).addBox(-1.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition tail5 = body34.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, -1.01F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 53).addBox(-0.5F, -0.185F, 1.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.5F));

		PartDefinition cube_r45 = tail5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(-8, 70).mirror().addBox(56.2F, 12.84F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-65.0F, 1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r46 = tail5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head5 = body.addOrReplaceChild("head5", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.4F, 27.0F, 0.0F, 2.0944F, 0.0F));

		PartDefinition cube_r47 = head5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r48 = head5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r21 = head5.addOrReplaceChild("wing_r21", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r22 = head5.addOrReplaceChild("wing_r22", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r23 = head5.addOrReplaceChild("wing_r23", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r24 = head5.addOrReplaceChild("wing_r24", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing_r25 = head5.addOrReplaceChild("wing_r25", CubeListBuilder.create().texOffs(29, 53).addBox(-4.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.2618F, -0.1745F));

		PartDefinition wing_r26 = head5.addOrReplaceChild("wing_r26", CubeListBuilder.create().texOffs(18, 53).addBox(-7.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.7854F, -0.1745F));

		PartDefinition wing_r27 = head5.addOrReplaceChild("wing_r27", CubeListBuilder.create().texOffs(0, 3).addBox(-6.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 1.2654F, -0.1745F));

		PartDefinition wing_r28 = head5.addOrReplaceChild("wing_r28", CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.25F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r49 = head5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition antennaR5 = head5.addOrReplaceChild("antennaR5", CubeListBuilder.create().texOffs(0, 42).addBox(-6.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL5 = head5.addOrReplaceChild("antennaL5", CubeListBuilder.create().texOffs(23, 42).addBox(0.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body23 = head5.addOrReplaceChild("body23", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r50 = body23.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(23, 9).addBox(-6.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r51 = body23.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body24 = body23.addOrReplaceChild("body24", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r52 = body24.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 27).addBox(-6.51F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r53 = body24.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(25, 37).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body25 = body24.addOrReplaceChild("body25", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r54 = body25.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(23, 0).addBox(-6.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r55 = body25.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body26 = body25.addOrReplaceChild("body26", CubeListBuilder.create().texOffs(48, 30).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r56 = body26.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(27, 14).addBox(-6.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r57 = body26.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 32).addBox(-1.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body27 = body26.addOrReplaceChild("body27", CubeListBuilder.create().texOffs(44, 47).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r58 = body27.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(25, 27).addBox(-6.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r59 = body27.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body28 = body27.addOrReplaceChild("body28", CubeListBuilder.create().texOffs(30, 48).addBox(-2.0F, -2.01F, -0.49F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 2.5F));

		PartDefinition cube_r60 = body28.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(41, 42).addBox(-5.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r61 = body28.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(44, 1).addBox(-1.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition tail4 = body28.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, -1.01F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 53).addBox(-0.5F, -0.185F, 1.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r62 = tail4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 9).addBox(-4.3F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r63 = tail4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head4 = body.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.0F, -0.8F, 43.3F, 0.0F, 0.9512F, 0.0F));

		PartDefinition cube_r64 = head4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r65 = head4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r29 = head4.addOrReplaceChild("wing_r29", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r30 = head4.addOrReplaceChild("wing_r30", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r31 = head4.addOrReplaceChild("wing_r31", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r32 = head4.addOrReplaceChild("wing_r32", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing_r33 = head4.addOrReplaceChild("wing_r33", CubeListBuilder.create().texOffs(29, 53).addBox(-4.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.2618F, -0.1745F));

		PartDefinition wing_r34 = head4.addOrReplaceChild("wing_r34", CubeListBuilder.create().texOffs(18, 53).addBox(-7.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.7854F, -0.1745F));

		PartDefinition wing_r35 = head4.addOrReplaceChild("wing_r35", CubeListBuilder.create().texOffs(0, 3).addBox(-6.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 1.2654F, -0.1745F));

		PartDefinition wing_r36 = head4.addOrReplaceChild("wing_r36", CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.25F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r66 = head4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition antennaR4 = head4.addOrReplaceChild("antennaR4", CubeListBuilder.create().texOffs(0, 42).addBox(-6.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL4 = head4.addOrReplaceChild("antennaL4", CubeListBuilder.create().texOffs(23, 42).addBox(0.0F, -0.19F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body20 = head4.addOrReplaceChild("body20", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r67 = body20.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(23, 9).addBox(-6.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r68 = body20.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body21 = body20.addOrReplaceChild("body21", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r69 = body21.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(13, 79).addBox(-6.51F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -1.1F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r70 = body21.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(-4, 79).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -1.1F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body22 = body21.addOrReplaceChild("body22", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, -0.89F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition head3 = body.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -1.4F, -21.0F, 0.0F, 2.3998F, 0.0F));

		PartDefinition cube_r71 = head3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r72 = head3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r37 = head3.addOrReplaceChild("wing_r37", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r38 = head3.addOrReplaceChild("wing_r38", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r39 = head3.addOrReplaceChild("wing_r39", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r40 = head3.addOrReplaceChild("wing_r40", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing_r41 = head3.addOrReplaceChild("wing_r41", CubeListBuilder.create().texOffs(29, 53).addBox(-4.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.2618F, -0.1745F));

		PartDefinition wing_r42 = head3.addOrReplaceChild("wing_r42", CubeListBuilder.create().texOffs(18, 53).addBox(-7.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.7854F, -0.1745F));

		PartDefinition wing_r43 = head3.addOrReplaceChild("wing_r43", CubeListBuilder.create().texOffs(0, 3).addBox(-6.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 1.2654F, -0.1745F));

		PartDefinition wing_r44 = head3.addOrReplaceChild("wing_r44", CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.25F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r73 = head3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition antennaR3 = head3.addOrReplaceChild("antennaR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL3 = head3.addOrReplaceChild("antennaL3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body14 = head3.addOrReplaceChild("body14", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r74 = body14.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(23, 9).addBox(-6.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r75 = body14.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body15 = body14.addOrReplaceChild("body15", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r76 = body15.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 27).addBox(-6.51F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r77 = body15.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 37).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body16 = body15.addOrReplaceChild("body16", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r78 = body16.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(23, 0).addBox(-6.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r79 = body16.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body17 = body16.addOrReplaceChild("body17", CubeListBuilder.create().texOffs(48, 30).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r80 = body17.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(27, 14).addBox(-6.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r81 = body17.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(25, 32).addBox(-1.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body18 = body17.addOrReplaceChild("body18", CubeListBuilder.create().texOffs(44, 47).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r82 = body18.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(25, 27).addBox(-6.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r83 = body18.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body19 = body18.addOrReplaceChild("body19", CubeListBuilder.create().texOffs(30, 48).addBox(-2.0F, -2.01F, -0.49F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 2.5F));

		PartDefinition cube_r84 = body19.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(41, 42).addBox(-5.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r85 = body19.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(44, 1).addBox(-1.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition tail3 = body19.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, -1.01F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 53).addBox(-0.5F, -0.185F, 1.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.5F));

		PartDefinition cube_r86 = tail3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 9).addBox(-4.3F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r87 = tail3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head2 = body.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -1.26F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F))
				.texOffs(46, 24).addBox(-1.5F, -2.01F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -1.4F, 2.0F, 0.0F, -3.098F, 0.0F));

		PartDefinition cube_r88 = head2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(52, 52).addBox(0.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r89 = head2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(47, 35).addBox(-1.5F, -3.26F, -5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wing_r45 = head2.addOrReplaceChild("wing_r45", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wing_r46 = head2.addOrReplaceChild("wing_r46", CubeListBuilder.create().texOffs(23, 5).addBox(3.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -0.7854F, 0.1745F));

		PartDefinition wing_r47 = head2.addOrReplaceChild("wing_r47", CubeListBuilder.create().texOffs(0, 0).addBox(5.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, -1.25F, -5.0F, 0.0F, -1.2654F, 0.1745F));

		PartDefinition wing_r48 = head2.addOrReplaceChild("wing_r48", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.25F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing_r49 = head2.addOrReplaceChild("wing_r49", CubeListBuilder.create().texOffs(29, 53).addBox(-4.0F, -0.01F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.2618F, -0.1745F));

		PartDefinition wing_r50 = head2.addOrReplaceChild("wing_r50", CubeListBuilder.create().texOffs(18, 53).addBox(-7.4504F, -0.01F, -1.9963F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 0.7854F, -0.1745F));

		PartDefinition wing_r51 = head2.addOrReplaceChild("wing_r51", CubeListBuilder.create().texOffs(0, 3).addBox(-6.6726F, -0.01F, -5.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -1.25F, -5.0F, 0.0F, 1.2654F, -0.1745F));

		PartDefinition wing_r52 = head2.addOrReplaceChild("wing_r52", CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -0.01F, -12.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.25F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r90 = head2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 53).addBox(-2.3F, -0.49F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition antennaR2 = head2.addOrReplaceChild("antennaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition antennaL2 = head2.addOrReplaceChild("antennaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body8 = head2.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(15, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition cube_r91 = body8.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(23, 9).addBox(-6.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r92 = body8.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, -1.26F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(48, 13).addBox(-2.49F, -0.5F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r93 = body9.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 27).addBox(-6.51F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r94 = body9.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(25, 37).addBox(-1.49F, -1.15F, 0.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r95 = body10.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(23, 0).addBox(-6.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r96 = body10.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -1.06F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body11 = body10.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(48, 30).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r97 = body11.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(27, 14).addBox(-6.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r98 = body11.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(25, 32).addBox(-1.5F, -0.96F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body12 = body11.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(44, 47).addBox(-2.5F, -0.51F, 0.01F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r99 = body12.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(25, 27).addBox(-6.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r100 = body12.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.86F, 2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition body13 = body12.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(30, 48).addBox(-2.0F, -2.01F, -0.49F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 2.5F));

		PartDefinition cube_r101 = body13.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(41, 42).addBox(-5.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r102 = body13.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(44, 1).addBox(-1.5F, -0.76F, 2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition tail2 = body13.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, -1.01F, -0.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(11, 53).addBox(-0.5F, -0.185F, 1.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.5F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 9).addBox(-4.3F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -0.66F, 3.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		return LayerDefinition.create(meshdefinition, 256, 180);
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