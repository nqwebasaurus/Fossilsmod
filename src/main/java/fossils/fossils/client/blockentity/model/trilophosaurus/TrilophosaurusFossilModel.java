package fossils.fossils.client.blockentity.model.trilophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TrilophosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart body1;
	private final ModelPart chest;
	private final ModelPart armLw;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart neckflap;
	private final ModelPart armRw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public TrilophosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.legL = this.body.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.body1 = this.body.getChild("body1");
		this.chest = this.body1.getChild("chest");
		this.armLw = this.chest.getChild("armLw");
		this.armL = this.armLw.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.armLw.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.neckflap = this.neck.getChild("neckflap");
		this.armRw = this.chest.getChild("armRw");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.1F, -6.5F, -2.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 70).addBox(-0.1069F, -1.8706F, 1.9959F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 70).addBox(-0.1069F, -2.0706F, -0.0041F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1069F, -0.253F, 6.5243F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 33).addBox(-0.1069F, -1.9288F, 0.8717F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 68).mirror().addBox(-1.5138F, 0.0712F, 2.5717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 44).mirror().addBox(-2.5138F, -0.3288F, 2.1717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 44).addBox(1.5F, -0.3288F, 2.1717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 68).addBox(0.5F, 0.0712F, 2.5717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 6).addBox(-0.5069F, 0.0712F, -0.1283F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1069F, -1.253F, 3.8243F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 5).mirror().addBox(0.0F, -0.3545F, -0.5671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4069F, 0.215F, 6.351F, -0.7069F, 0.0F, -0.4538F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(0.0F, -0.3018F, -0.5529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4069F, 0.215F, 6.351F, -0.0785F, 0.0F, -0.4538F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 21).mirror().addBox(0.0F, 1.6F, -1.0948F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4069F, 0.215F, 6.351F, -0.0087F, 0.0F, -0.4538F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(0.0F, 1.5256F, -0.6826F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4069F, 0.215F, 6.351F, -0.6545F, 0.0F, -0.4538F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 5).addBox(-1.0F, -0.3545F, -0.5671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.6069F, 0.215F, 6.351F, -0.7069F, 0.0F, 0.4538F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 15).addBox(-1.0F, -0.3018F, -0.5529F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6069F, 0.215F, 6.351F, -0.0785F, 0.0F, 0.4538F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 21).addBox(-1.0F, 1.6F, -1.0948F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6069F, 0.215F, 6.351F, -0.0087F, 0.0F, 0.4538F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 0).addBox(-1.0F, 1.5256F, -0.6826F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6069F, 0.215F, 6.351F, -0.6545F, 0.0F, 0.4538F));

		PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(13, 41).addBox(-0.5F, -0.25F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.6546F, 1.047F, 5.7137F, 1.1515F, -0.8125F, -0.7373F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 61).addBox(0.0316F, -0.1132F, -0.8333F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 61).addBox(-1.0684F, 0.0868F, -0.8333F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.45F, 0.48F, 0.3491F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.0F, -2.25F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0684F, 4.4868F, 0.3167F, -1.1091F, -0.0407F, 0.6517F));

		PartDefinition cube_r11 = legL3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 27).addBox(-0.25F, 0.02F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.75F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r12 = legL3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 34).addBox(-0.5F, 0.01F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.25F, 0.0436F, 0.4363F, 0.0F));

		PartDefinition cube_r13 = legL3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 21).addBox(-0.5F, 0.0F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.25F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r14 = legL3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 48).addBox(-0.5F, 0.02F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.75F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r15 = legL3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 34).addBox(-0.5F, 0.01F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -2.25F, 0.0611F, -0.1309F, 0.0F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(26, 41).addBox(-0.5F, -0.25F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.6546F, 1.047F, 5.7137F, 0.0F, 0.9163F, 0.0F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(54, 61).addBox(-1.0316F, -0.1132F, -0.8333F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 19).addBox(0.0684F, 0.0868F, -0.8333F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.45F, 0.48F, -0.3491F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(52, 40).addBox(-1.0F, 0.0F, -2.25F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0684F, 4.4868F, 0.3167F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r16 = legL6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 54).addBox(-0.75F, 0.02F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.75F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r17 = legL6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 6).addBox(-0.5F, 0.01F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -2.25F, 0.0436F, -0.4363F, 0.0F));

		PartDefinition cube_r18 = legL6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.0F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.25F, 0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r19 = legL6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(22, 48).addBox(-0.5F, 0.02F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.75F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r20 = legL6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 34).addBox(-0.5F, 0.01F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.25F, 0.0611F, 0.1309F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1069F, -0.853F, 3.6243F, 0.0365F, -0.2151F, -0.008F));

		PartDefinition cube_r21 = body1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(41, 70).addBox(-0.1069F, -2.056F, 0.0114F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(35, 67).addBox(-0.1069F, -2.2635F, 0.9388F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 48).addBox(-0.5069F, -0.0635F, -0.0612F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.8F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(31, 0).addBox(-2.5069F, -0.913F, 0.0127F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, -4.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(19, 27).addBox(-2.5069F, -0.9416F, -0.0711F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, -9.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-2.4307F, -1.3342F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.1253F, -0.4321F, -0.0368F, -0.0887F, -1.5255F));

		PartDefinition cube_r26 = body1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.1253F, -0.4321F, -0.0772F, -0.057F, -0.9839F));

		PartDefinition cube_r27 = body1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.1253F, -0.4321F, -0.0937F, -0.0207F, -0.5663F));

		PartDefinition cube_r28 = body1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.3253F, -2.4321F, -0.0426F, -0.0094F, -0.3401F));

		PartDefinition cube_r29 = body1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.3253F, -2.4321F, -0.0351F, -0.0259F, -0.7588F));

		PartDefinition cube_r30 = body1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(55, 19).mirror().addBox(-3.4307F, -1.3342F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.3253F, -2.4321F, -0.0167F, -0.0403F, -1.2999F));

		PartDefinition cube_r31 = body1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-4.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4253F, -4.3321F, 0.0301F, 0.0726F, -1.2817F));

		PartDefinition cube_r32 = body1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4253F, -4.3321F, 0.0632F, 0.0467F, -0.7403F));

		PartDefinition cube_r33 = body1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(54, 71).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4253F, -4.3321F, 0.0767F, 0.017F, -0.3222F));

		PartDefinition cube_r34 = body1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 17).mirror().addBox(-5.4307F, -1.3342F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4253F, -6.3321F, 0.064F, 0.1531F, -1.1732F));

		PartDefinition cube_r35 = body1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4253F, -6.3321F, 0.1337F, 0.0983F, -0.6305F));

		PartDefinition cube_r36 = body1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(71, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4253F, -6.3321F, 0.1619F, 0.0357F, -0.2153F));

		PartDefinition cube_r37 = body1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(31, 14).mirror().addBox(-5.4307F, -1.3342F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.2253F, -8.3321F, 0.0846F, 0.2013F, -1.1695F));

		PartDefinition cube_r38 = body1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.2253F, -8.3321F, 0.1764F, 0.1291F, -0.6256F));

		PartDefinition cube_r39 = body1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 71).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.2253F, -8.3321F, 0.2132F, 0.0469F, -0.2132F));

		PartDefinition cube_r40 = body1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1253F, -0.4321F, -0.0937F, 0.0207F, 0.5663F));

		PartDefinition cube_r41 = body1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(71, 64).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1253F, -0.4321F, -0.0772F, 0.057F, 0.9839F));

		PartDefinition cube_r42 = body1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 23).addBox(1.4307F, -1.3342F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1253F, -0.4321F, -0.0368F, 0.0887F, 1.5255F));

		PartDefinition cube_r43 = body1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 19).addBox(1.4307F, -1.3342F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3253F, -2.4321F, -0.0167F, 0.0403F, 1.2999F));

		PartDefinition cube_r44 = body1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(59, 71).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3253F, -2.4321F, -0.0351F, 0.0259F, 0.7588F));

		PartDefinition cube_r45 = body1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(71, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3253F, -2.4321F, -0.0426F, 0.0094F, 0.3401F));

		PartDefinition cube_r46 = body1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 71).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4253F, -4.3321F, 0.0767F, -0.017F, 0.3222F));

		PartDefinition cube_r47 = body1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 58).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4253F, -4.3321F, 0.0632F, -0.0467F, 0.7403F));

		PartDefinition cube_r48 = body1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 12).addBox(1.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4253F, -4.3321F, 0.0301F, -0.0726F, 1.2817F));

		PartDefinition cube_r49 = body1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4253F, -6.3321F, 0.1619F, -0.0357F, 0.2153F));

		PartDefinition cube_r50 = body1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(71, 45).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4253F, -6.3321F, 0.1337F, -0.0983F, 0.6305F));

		PartDefinition cube_r51 = body1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(55, 17).addBox(1.4307F, -1.3342F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4253F, -6.3321F, 0.064F, -0.1531F, 1.1732F));

		PartDefinition cube_r52 = body1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(31, 14).addBox(1.4307F, -1.3342F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2253F, -8.3321F, 0.0846F, -0.2013F, 1.1695F));

		PartDefinition cube_r53 = body1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(28, 71).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2253F, -8.3321F, 0.1764F, -0.1291F, 0.6256F));

		PartDefinition cube_r54 = body1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(23, 71).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2253F, -8.3321F, 0.2132F, -0.0469F, 0.2132F));

		PartDefinition cube_r55 = body1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5069F, -1.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -8.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 67).addBox(-0.1069F, -2.5015F, 3.9424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 70).addBox(-0.1069F, -2.1015F, 1.9424F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 54).addBox(-0.1069F, -2.0015F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body1.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4151F, -8.189F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 70).addBox(-0.1069F, -2.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 54).addBox(-0.5069F, -0.8F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3559F, -1.4791F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 55).mirror().addBox(-0.0523F, -0.2715F, -1.5559F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1138F, 2.8743F, -3.5753F, 1.1384F, -0.3538F, -0.7339F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(0.0F, -0.1942F, -1.2366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4138F, 2.1743F, -3.5753F, 0.1126F, -0.1485F, -0.3354F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(0.0F, -0.792F, -0.9764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4138F, 2.1743F, -3.5753F, 0.6362F, -0.1485F, -0.3354F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-0.5F, 0.0212F, -0.0124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(39, 63).addBox(3.3138F, 0.0212F, -0.0124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9138F, 0.3743F, -3.3753F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 27).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 27).addBox(3.3138F, -0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9138F, 2.4743F, -3.7753F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, 0.1898F, -1.543F, 0.2473F, 0.0542F, -0.3336F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(72, 29).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, 0.1898F, -1.543F, 0.205F, 0.1495F, -0.7438F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(-4.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, 0.1898F, -1.543F, 0.0986F, 0.2334F, -1.2887F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 55).addBox(-0.9477F, -0.2715F, -1.5559F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 2.8743F, -3.5753F, 1.1384F, 0.3538F, 0.7339F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(30, 67).addBox(-1.0F, -0.1942F, -1.2366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4F, 2.1743F, -3.5753F, 0.1126F, 0.1485F, 0.3354F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(25, 67).addBox(-1.0F, -0.792F, -0.9764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 2.1743F, -3.5753F, 0.6362F, 0.1485F, 0.3354F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(57, 9).addBox(1.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1898F, -1.543F, 0.0986F, -0.2334F, 1.2887F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 29).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1898F, -1.543F, 0.205F, -0.1495F, 0.7438F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1898F, -1.543F, 0.2473F, -0.0542F, 0.3336F));

		PartDefinition armLw = chest.addOrReplaceChild("armLw", CubeListBuilder.create(), PartPose.offset(2.5F, 1.5651F, -3.611F));

		PartDefinition armL = armLw.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.2182F, 0.9163F, 0.0F));

		PartDefinition cube_r72 = armL.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(57, 5).addBox(-1.2F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(65, 48).addBox(-1.2F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(63, 55).addBox(-0.7F, -1.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.0F, 0.6109F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(5, 63).addBox(-1.0F, 0.0F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 63).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0887F, 0.0726F, 4.3097F, -0.2182F, 0.2182F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(18, 59).addBox(-1.25F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.451F, 4.2046F, 0.7678F, -0.1745F, -1.2217F, 0.0F));

		PartDefinition cube_r73 = armL3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(55, 45).addBox(-0.5F, 0.02F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.0F, 0.0436F, -0.48F, 0.0F));

		PartDefinition cube_r74 = armL3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 41).addBox(-0.5F, 0.01F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r75 = armL3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.0F, 0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r76 = armL3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(56, 32).addBox(-0.25F, 0.01F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.5F, -1.0F, 0.0611F, 0.3927F, 0.0F));

		PartDefinition cube_r77 = armL3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(47, 54).addBox(-0.5F, 0.02F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.5F, 0.0F, 0.0349F, 0.7418F, 0.0F));

		PartDefinition armL4 = armLw.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2138F, 1.6F, 0.0F, -1.2206F, -1.1757F, 1.318F));

		PartDefinition cube_r78 = armL4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(9, 59).addBox(-0.8F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(65, 51).addBox(-0.8F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(64, 11).addBox(-0.3F, -1.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.0F, -0.6109F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create().texOffs(15, 63).addBox(0.0F, 0.0F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 63).addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0793F, 0.2679F, 4.2674F, -0.2838F, -0.1194F, 0.3858F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create().texOffs(27, 59).addBox(-0.75F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 4.5F, 0.75F, 0.2249F, 1.2936F, -0.3593F));

		PartDefinition cube_r79 = armL6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.02F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.0F, 0.0436F, 0.48F, 0.0F));

		PartDefinition cube_r80 = armL6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5F, 0.01F, -4.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r81 = armL6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.0F, 0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r82 = armL6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(56, 50).addBox(-0.75F, 0.01F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.5F, -1.0F, 0.0611F, -0.3927F, 0.0F));

		PartDefinition cube_r83 = armL6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 12).addBox(-0.5F, 0.02F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.5F, 0.0F, 0.0349F, -0.7418F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1849F, -2.411F, -0.4752F, -0.3931F, 0.1946F));

		PartDefinition cube_r84 = neck.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(72, 47).addBox(-0.1069F, -2.0077F, -0.9399F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2444F, 0.0024F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r85 = neck.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(44, 70).addBox(-0.1069F, -1.5612F, -0.9871F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.956F, -1.8167F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r86 = neck.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.5697F, -2.5297F, 0.2876F, 0.8736F, -1.0546F));

		PartDefinition cube_r87 = neck.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-2.9135F, -0.4067F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.0697F, -0.5297F, 0.2378F, 0.6162F, -1.1241F));

		PartDefinition cube_r88 = neck.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.0697F, -0.5297F, 0.4778F, 0.4665F, -0.6656F));

		PartDefinition cube_r89 = neck.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(66, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5697F, -2.5297F, 0.2876F, -0.8736F, 1.0546F));

		PartDefinition cube_r90 = neck.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(33, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0697F, -0.5297F, 0.4778F, -0.4665F, 0.6656F));

		PartDefinition cube_r91 = neck.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(65, 38).addBox(0.9135F, -0.4067F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0697F, -0.5297F, 0.2378F, -0.6162F, 1.1241F));

		PartDefinition cube_r92 = neck.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(29, 54).addBox(-0.5069F, -1.05F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7556F, -0.2976F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(65, 30).addBox(-0.5069F, -1.3435F, -4.6802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8444F, -2.7976F, 0.257F, -0.5522F, -0.137F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(50, 72).addBox(-0.1069F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2435F, -3.1802F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(67, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.8189F, -3.3123F, 0.1309F, 0.926F, -1.3138F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, -0.4189F, -1.6123F, 0.2764F, 0.8401F, -1.0694F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(67, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8189F, -3.3123F, 0.1309F, -0.926F, 1.3138F));

		PartDefinition cube_r97 = neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(67, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4189F, -1.6123F, 0.2764F, -0.8401F, 1.0694F));

		PartDefinition cube_r98 = neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 51).addBox(-0.1069F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9912F, -1.2551F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r99 = neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(38, 54).addBox(-0.5069F, -0.05F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3935F, 0.0198F, -0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.9935F, -3.9052F, 0.2643F, -0.5944F, -0.1504F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 40).mirror().addBox(-1.4F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(70, 40).addBox(0.6138F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2138F, 0.8869F, 0.1233F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(36, 59).addBox(-1.6F, -1.4F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.678F, -0.7578F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(67, 23).addBox(-0.6F, -0.0851F, -0.1245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.522F, -0.2578F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(18, 70).addBox(-0.6F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0F, -1.322F, -1.0578F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(25, 63).addBox(-0.6F, -0.0412F, -0.0299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.122F, -3.6078F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(69, 67).addBox(-0.6F, -0.1706F, -0.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.578F, -4.0078F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-0.6031F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 26).addBox(-0.1831F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(8, 70).addBox(-0.3862F, -0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2138F, 0.988F, -3.5328F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(0.3243F, 0.0726F, -1.2278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7138F, -0.872F, -1.4578F, 0.3578F, -0.2531F, -0.2182F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(-0.0292F, -1.05F, -0.0395F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(73, 73).mirror().addBox(0.1708F, -0.95F, 0.6605F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 70).mirror().addBox(0.0708F, -0.95F, -0.0395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6638F, 1.228F, -3.2078F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-0.1079F, -1.05F, -0.102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0638F, 1.228F, -2.0078F, 0.0F, -0.6632F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(46, 67).addBox(-0.8921F, -1.05F, -0.102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.85F, 1.228F, -2.0078F, 0.0F, 0.6632F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(73, 73).addBox(-0.1708F, -0.95F, 0.6605F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 70).addBox(-0.0708F, -0.95F, -0.0395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 63).addBox(-0.9708F, -1.05F, -0.0395F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.45F, 1.228F, -3.2078F, 0.0F, 0.384F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(41, 67).addBox(-1.3243F, 0.0726F, -1.2278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, -0.872F, -1.4578F, 0.3578F, 0.2531F, 0.2182F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(64, 59).addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7863F, -1.209F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(56, 37).addBox(-1.6F, -0.6F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(45, 59).addBox(-1.6F, -0.6F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1778F, -0.8488F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(13, 70).addBox(-0.6F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1172F, -3.4753F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(62, 26).addBox(-1.1069F, -1.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.578F, -1.4078F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(13, 37).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.578F, -1.4078F, -0.3142F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.578F, 0.1422F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r118 = lowerjaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(0.0624F, -0.775F, -0.0712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(59, 68).mirror().addBox(-0.0376F, -0.675F, 1.2288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(63, 40).mirror().addBox(-0.0376F, -0.675F, -0.1712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6138F, 0.45F, -3.7F, 0.0F, -0.3403F, 0.0F));

		PartDefinition cube_r119 = lowerjaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(3, 70).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F)).mirror(false), PartPose.offsetAndRotation(-0.2138F, 0.175F, -3.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r120 = lowerjaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(64, 67).mirror().addBox(-0.5F, -0.4145F, -2.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, 0.45F, 0.5F, -0.0873F, -0.1571F, 0.0F));

		PartDefinition cube_r121 = lowerjaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(64, 63).mirror().addBox(-0.5F, -0.75F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, 0.45F, 0.5F, 0.1222F, -0.1571F, 0.0F));

		PartDefinition cube_r122 = lowerjaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(65, 34).mirror().addBox(-0.5F, -0.3115F, -2.6829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.2138F, 0.45F, 0.5F, -0.3491F, -0.1571F, 0.0F));

		PartDefinition cube_r123 = lowerjaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(59, 68).addBox(-0.9624F, -0.675F, 1.2288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(46, 63).addBox(-1.0624F, -0.775F, -0.0712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 40).addBox(-0.9624F, -0.675F, -0.1712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.45F, -3.7F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r124 = lowerjaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(3, 70).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(0.0F, 0.175F, -3.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r125 = lowerjaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 34).addBox(-0.5F, -0.3115F, -2.6829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(1.0F, 0.45F, 0.5F, -0.3491F, 0.1571F, 0.0F));

		PartDefinition cube_r126 = lowerjaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 67).addBox(-0.5F, -0.4145F, -2.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.45F, 0.5F, -0.0873F, 0.1571F, 0.0F));

		PartDefinition cube_r127 = lowerjaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 63).addBox(-0.5F, -0.75F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.45F, 0.5F, 0.1222F, 0.1571F, 0.0F));

		PartDefinition neckflap = neck.addOrReplaceChild("neckflap", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8056F, -4.0976F, 0.2225F, 0.0F, 0.0F));

		PartDefinition armRw = chest.addOrReplaceChild("armRw", CubeListBuilder.create(), PartPose.offset(-2.5F, 1.5651F, -3.611F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5069F, -0.5034F, -0.0776F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F))
				.texOffs(71, 0).addBox(-0.1069F, -1.7034F, 0.9224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-0.1069F, -1.5034F, 2.9224F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 45).addBox(-0.1069F, -1.4034F, 4.9224F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 37).addBox(-0.1069F, -1.4034F, 6.9224F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1069F, 1.047F, 9.3243F, -0.2796F, 0.2521F, -0.0715F));

		PartDefinition cube_r128 = tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(38, 67).addBox(-0.1069F, 2.7F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 0).addBox(-0.1069F, 1.5F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-0.1069F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5966F, 0.9224F, 0.6458F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5069F, -0.3437F, -0.1137F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(53, 73).addBox(-0.1069F, -1.1437F, 0.8863F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 54).addBox(-0.1069F, -1.0437F, 2.8863F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 73).addBox(-0.1069F, -0.9437F, 4.8863F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 73).addBox(-0.1069F, -0.8437F, 6.8863F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1835F, 7.8379F, 0.0879F, 0.6526F, 0.0535F));

		PartDefinition cube_r129 = tail2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(38, 72).addBox(-0.1069F, 0.548F, 1.9135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 15).addBox(-0.1069F, -0.152F, -0.0865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7009F, 4.9803F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(71, 11).addBox(-0.1069F, 1.407F, 1.9695F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 4).addBox(-0.1069F, 0.107F, -0.0305F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6801F, 0.1845F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5069F, -0.4216F, -0.1034F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(27, 73).addBox(-0.1069F, -0.8216F, 1.8966F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 73).addBox(-0.1069F, -0.7216F, 3.8966F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 73).addBox(-0.1069F, -0.9216F, -0.1034F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0586F, 8.934F, 0.2807F, -0.7219F, -0.1883F));

		PartDefinition cube_r131 = tail3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(12, 73).addBox(-0.1069F, -0.2F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 73).addBox(-0.1069F, -0.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 73).addBox(-0.1069F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9587F, 4.4707F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(73, 8).addBox(-0.1069F, 0.37F, 1.9828F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 73).addBox(-0.1069F, -0.03F, -0.0172F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6485F, -0.1782F, 0.2094F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5069F, -0.1191F, -0.0029F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.271F, 8.8704F, 0.1594F, -0.6049F, -0.0911F));

		PartDefinition cube_r133 = tail4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 73).addBox(-0.1069F, 0.2F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 73).addBox(-0.1069F, 0.0F, 7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 73).addBox(-0.1069F, -0.2F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2297F, -4.3997F, 0.1396F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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