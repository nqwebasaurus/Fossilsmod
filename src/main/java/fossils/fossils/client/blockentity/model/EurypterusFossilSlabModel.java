package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EurypterusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart frontlegr;
	private final ModelPart frontlegL;
	private final ModelPart paddleL;
	private final ModelPart paddleL2;
	private final ModelPart paddleR;
	private final ModelPart paddleR2;
	private final ModelPart head;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart tail_end;
	private final ModelPart body5;
	private final ModelPart frontlegr2;
	private final ModelPart frontlegL2;
	private final ModelPart paddleL3;
	private final ModelPart paddleL4;
	private final ModelPart paddleR3;
	private final ModelPart paddleR4;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body8;
	private final ModelPart tail_end2;
	private final ModelPart body9;
	private final ModelPart body10;
	private final ModelPart body11;
	private final ModelPart tail_end3;
	private final ModelPart body17;
	private final ModelPart frontlegr4;
	private final ModelPart paddleR5;
	private final ModelPart paddleR6;
	private final ModelPart head4;
	private final ModelPart body12;
	private final ModelPart frontlegr3;
	private final ModelPart body13;
	private final ModelPart body14;
	private final ModelPart body15;
	private final ModelPart tail_end4;
	private final ModelPart body16;
	private final ModelPart tail_end5;

	public EurypterusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.frontlegr = this.body.getChild("frontlegr");
		this.frontlegL = this.body.getChild("frontlegL");
		this.paddleL = this.body.getChild("paddleL");
		this.paddleL2 = this.paddleL.getChild("paddleL2");
		this.paddleR = this.body.getChild("paddleR");
		this.paddleR2 = this.paddleR.getChild("paddleR2");
		this.head = this.body.getChild("head");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.tail_end = this.body4.getChild("tail_end");
		this.body5 = this.fossil.getChild("body5");
		this.frontlegr2 = this.body5.getChild("frontlegr2");
		this.frontlegL2 = this.body5.getChild("frontlegL2");
		this.paddleL3 = this.body5.getChild("paddleL3");
		this.paddleL4 = this.paddleL3.getChild("paddleL4");
		this.paddleR3 = this.body5.getChild("paddleR3");
		this.paddleR4 = this.paddleR3.getChild("paddleR4");
		this.head2 = this.body5.getChild("head2");
		this.head3 = this.body5.getChild("head3");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
		this.tail_end2 = this.body8.getChild("tail_end2");
		this.body9 = this.body5.getChild("body9");
		this.body10 = this.body9.getChild("body10");
		this.body11 = this.body10.getChild("body11");
		this.tail_end3 = this.body11.getChild("tail_end3");
		this.body17 = this.fossil.getChild("body17");
		this.frontlegr4 = this.body17.getChild("frontlegr4");
		this.paddleR5 = this.body17.getChild("paddleR5");
		this.paddleR6 = this.paddleR5.getChild("paddleR6");
		this.head4 = this.body17.getChild("head4");
		this.body12 = this.fossil.getChild("body12");
		this.frontlegr3 = this.body12.getChild("frontlegr3");
		this.body13 = this.body12.getChild("body13");
		this.body14 = this.body13.getChild("body14");
		this.body15 = this.body14.getChild("body15");
		this.tail_end4 = this.body15.getChild("tail_end4");
		this.body16 = this.body14.getChild("body16");
		this.tail_end5 = this.body16.getChild("tail_end5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(148, 112).addBox(21.4854F, -11.8F, 15.3911F, 24.0F, 20.0F, 43.0F, new CubeDeformation(0.003F))
				.texOffs(46, 0).addBox(21.4854F, -10.0F, 75.3911F, 7.0F, 18.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(-0.5146F, -12.0F, 0.3911F, 22.0F, 20.0F, 83.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(11.3019F, -8.0F, -51.8436F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(128, 0).addBox(-15.1429F, -12.0F, -54.299F, 15.0F, 20.0F, 55.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.3019F, -8.0F, 2.1564F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-8.1429F, -11.0F, -0.299F, 8.0F, 19.0F, 29.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(28.3019F, -8.0F, 2.1564F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 104).addBox(-33.0F, -12.0F, -15.0F, 65.0F, 20.0F, 30.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-5.0F, -8.0F, 14.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(43, 49).addBox(-5.0F, 1.0F, 0.0F, 10.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.8F, -1.0F));

		PartDefinition frontlegr = body.addOrReplaceChild("frontlegr", CubeListBuilder.create().texOffs(70, 61).addBox(-3.4962F, 0.0F, -0.4128F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2612F, 1.5F, -2.9698F, 0.0F, -0.2618F, 0.0F));

		PartDefinition frontlegL = body.addOrReplaceChild("frontlegL", CubeListBuilder.create().texOffs(69, 6).addBox(-1.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 1.5F, -2.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition paddleL = body.addOrReplaceChild("paddleL", CubeListBuilder.create().texOffs(70, 58).addBox(0.0F, 0.6F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition paddleL2 = paddleL.addOrReplaceChild("paddleL2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition paddle2L_r1 = paddleL2.addOrReplaceChild("paddle2L_r1", CubeListBuilder.create().texOffs(13, 110).addBox(-0.5F, 0.5F, -0.9F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition paddleR = body.addOrReplaceChild("paddleR", CubeListBuilder.create().texOffs(69, 3).addBox(-4.0F, 0.5F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition paddle1R_r1 = paddleR.addOrReplaceChild("paddle1R_r1", CubeListBuilder.create().texOffs(14, 25).addBox(-3.1F, 0.6F, -0.6F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition paddleR2 = paddleR.addOrReplaceChild("paddleR2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition paddle2R_r1 = paddleR2.addOrReplaceChild("paddle2R_r1", CubeListBuilder.create().texOffs(65, 75).addBox(-5.0F, 0.5F, -3.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 2.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 64).addBox(-4.5F, 0.8F, -6.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(31, 71).addBox(-5.0F, 1.1F, -8.0F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(128, 0).addBox(-4.0F, 1.1F, -1.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(128, 44).addBox(-2.2F, 1.0F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, 1.0F, 0.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(142, 26).addBox(-1.0F, 1.1F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tail_end = body4.addOrReplaceChild("tail_end", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, 1.2F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, -1.0908F, 0.0F));

		PartDefinition body5 = fossil.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 49).addBox(-6.0F, 5.4F, 0.0F, 13.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -26.0F, 9.0F, 0.0F, 2.5307F, 0.0F));

		PartDefinition frontlegr2 = body5.addOrReplaceChild("frontlegr2", CubeListBuilder.create().texOffs(59, 27).addBox(-8.0F, 5.9F, -3.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontlegL2 = body5.addOrReplaceChild("frontlegL2", CubeListBuilder.create().texOffs(35, 55).addBox(3.0F, 5.5F, -3.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition paddleL3 = body5.addOrReplaceChild("paddleL3", CubeListBuilder.create().texOffs(35, 52).addBox(0.0F, 4.8F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition paddleL4 = paddleL3.addOrReplaceChild("paddleL4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition paddle2L_r2 = paddleL4.addOrReplaceChild("paddle2L_r2", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 4.9F, -0.9F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition paddleR3 = body5.addOrReplaceChild("paddleR3", CubeListBuilder.create().texOffs(69, 0).addBox(-4.0F, 4.9F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition paddleR4 = paddleR3.addOrReplaceChild("paddleR4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head2 = body5.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(31, 58).addBox(-5.0F, 5.4F, -6.0F, 11.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-6.0F, 5.5F, -8.0F, 13.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head3 = body5.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(0, 7).addBox(-4.0F, 1.0F, -6.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(31, 65).addBox(-5.0F, 1.1F, -8.0F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.2F, 4.8F, 34.2F, 0.0F, 2.7053F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 77).addBox(-5.0F, 5.4F, 0.0F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(128, 16).addBox(-3.5F, 5.4F, 0.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 4.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(128, 50).addBox(-1.5F, 5.4F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(128, 38).addBox(-1.0F, 5.5F, 2.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.2F, 4.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail_end2 = body8.addOrReplaceChild("tail_end2", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, 5.8F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body9 = body5.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(128, 21).addBox(-3.0F, 1.0F, 0.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.0F, 4.4F, -14.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(128, 32).addBox(-1.9F, 1.1F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition body11 = body10.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(13, 104).addBox(-0.5F, 1.2F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(140, 76).addBox(-1.0F, 1.3F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition tail_end3 = body11.addOrReplaceChild("tail_end3", CubeListBuilder.create().texOffs(52, 69).addBox(-0.5F, 1.4F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body17 = fossil.addOrReplaceChild("body17", CubeListBuilder.create().texOffs(13, 19).addBox(-4.0F, 1.2F, 0.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, -21.5F, -50.0F, 0.0F, 2.5307F, 0.0F));

		PartDefinition tergite4_r1 = body17.addOrReplaceChild("tergite4_r1", CubeListBuilder.create().texOffs(128, 6).addBox(0.0F, 1.3F, -2.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition frontlegr4 = body17.addOrReplaceChild("frontlegr4", CubeListBuilder.create().texOffs(46, 27).addBox(-8.0F, 1.3F, -3.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition paddleR5 = body17.addOrReplaceChild("paddleR5", CubeListBuilder.create().texOffs(35, 49).addBox(-4.0F, 0.3F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition paddleR6 = paddleR5.addOrReplaceChild("paddleR6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head4 = body17.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 1.2F, -6.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-5.0F, 1.3F, -8.0F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body12 = fossil.addOrReplaceChild("body12", CubeListBuilder.create(), PartPose.offsetAndRotation(-29.0F, -26.0F, -22.0F, 0.0F, 1.4835F, 0.0F));

		PartDefinition tergite4_r2 = body12.addOrReplaceChild("tergite4_r2", CubeListBuilder.create().texOffs(0, 126).addBox(-6.3432F, 4.4F, 0.6696F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4891F, 1.0F, 3.04F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tergite4_r3 = body12.addOrReplaceChild("tergite4_r3", CubeListBuilder.create().texOffs(65, 69).addBox(-3.1891F, 4.3F, -0.74F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(25, 78).addBox(-3.1891F, 4.3F, 4.16F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9109F, 1.0F, 0.04F, 0.0F, -0.1745F, 0.0F));

		PartDefinition frontlegr3 = body12.addOrReplaceChild("frontlegr3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body13 = body12.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(128, 11).addBox(-3.0F, 5.4F, 0.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, 7.7F, 0.0F, -0.3054F, 0.0F));

		PartDefinition body14 = body13.addOrReplaceChild("body14", CubeListBuilder.create().texOffs(128, 26).addBox(-1.5F, 5.5F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition body15 = body14.addOrReplaceChild("body15", CubeListBuilder.create().texOffs(13, 115).addBox(-0.5F, 5.5F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(142, 32).addBox(-1.0F, 5.6F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, -0.6545F, 0.0F));

		PartDefinition tail_end4 = body15.addOrReplaceChild("tail_end4", CubeListBuilder.create().texOffs(57, 58).addBox(-0.5F, 5.8F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition body16 = body14.addOrReplaceChild("body16", CubeListBuilder.create().texOffs(128, 76).addBox(-0.5F, 1.0F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(142, 38).addBox(-1.0F, 1.1F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 4.5F, -5.6F, 0.0F, -1.4835F, 0.0F));

		PartDefinition tail_end5 = body16.addOrReplaceChild("tail_end5", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, 4.0F, 0.0F, -0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 288, 200);
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