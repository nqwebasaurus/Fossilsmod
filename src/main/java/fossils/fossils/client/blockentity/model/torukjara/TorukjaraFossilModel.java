package fossils.fossils.client.blockentity.model.torukjara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TorukjaraFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart neck1;
	private final ModelPart neck5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing6;
	private final ModelPart leftwing7;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart righthand2;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing6;
	private final ModelPart rightwing7;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart leftlegwing2;
	private final ModelPart leftlegwing1;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
	private final ModelPart rightlegwing2;
	private final ModelPart rightlegwing1;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart bone;
	private final ModelPart bone3;

	public TorukjaraFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck5 = this.neck1.getChild("neck5");
		this.neck = this.neck5.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.lefthand2 = this.leftwing3.getChild("lefthand2");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing5.getChild("leftwing6");
		this.leftwing7 = this.leftwing6.getChild("leftwing7");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.righthand2 = this.rightwing3.getChild("righthand2");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing5.getChild("rightwing6");
		this.rightwing7 = this.rightwing6.getChild("rightwing7");
		this.body = this.chest1.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body1 = this.body3.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.leftleg1 = this.body1.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.rightleg1 = this.body1.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.bone2 = this.body1.getChild("bone2");
		this.bone4 = this.body1.getChild("bone4");
		this.bone = this.chest1.getChild("bone");
		this.bone3 = this.chest1.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.054F, 0.9051F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -9.6015F, -2.1671F, -0.644F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 71).addBox(-1.0765F, -3.4588F, -0.0411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(103, 36).addBox(-1.0765F, -2.9606F, -1.939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 103).addBox(-1.0765F, 0.3206F, -2.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 95).addBox(-1.0765F, -2.7806F, -0.2061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 98).addBox(-1.0765F, -3.281F, 0.1257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 66).addBox(-1.0765F, -1.2056F, -1.2494F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(95, 67).addBox(-1.0765F, -1.0328F, -2.3023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-4.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.1272F, 0.5441F, -1.4982F));

		PartDefinition cube_r9 = chest1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 7).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.394F, 0.405F, -0.9282F));

		PartDefinition cube_r10 = chest1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.4588F, 1.4537F, 0.573F, 0.1389F, -0.4328F));

		PartDefinition cube_r11 = chest1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.474F, -0.991F, -2.095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6123F, 6.5922F, 4.8659F, -0.1006F, -0.304F, 0.0302F));

		PartDefinition cube_r12 = chest1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 39).mirror().addBox(-0.1131F, -1.3595F, -0.8832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6123F, 6.5922F, 4.8659F, 0.244F, -0.1199F, -1.1673F));

		PartDefinition cube_r13 = chest1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(101, 42).mirror().addBox(-0.189F, -0.0165F, -1.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6123F, 6.5922F, 4.8659F, -0.7372F, -0.2757F, -1.268F));

		PartDefinition cube_r14 = chest1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-1.3611F, -0.7786F, -0.2332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(35, 84).mirror().addBox(-1.3611F, -0.7786F, 1.0668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6123F, 6.5922F, 4.8659F, -0.0221F, 0.0141F, 0.5671F));

		PartDefinition cube_r15 = chest1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 84).addBox(0.3611F, -0.7786F, 1.0668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(81, 9).addBox(0.3611F, -0.7786F, -0.2332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -0.0221F, -0.0141F, -0.5671F));

		PartDefinition cube_r16 = chest1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 24).addBox(-1.5765F, -1.0073F, -0.2332F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(101, 42).addBox(-0.811F, -0.0165F, -1.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -0.7372F, 0.2757F, 1.268F));

		PartDefinition cube_r18 = chest1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(101, 39).addBox(-0.8869F, -1.3595F, -0.8832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, 0.244F, 0.1199F, 1.1673F));

		PartDefinition cube_r19 = chest1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(84, 34).addBox(-0.526F, -0.991F, -2.095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5408F, 6.5922F, 4.8659F, -0.1006F, 0.304F, -0.0302F));

		PartDefinition cube_r20 = chest1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 43).addBox(-0.0357F, -1.0258F, -0.1972F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0684F, 0.1969F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r21 = chest1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(66, 60).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.573F, -0.1389F, 0.4328F));

		PartDefinition cube_r22 = chest1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 7).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.394F, -0.405F, 0.9282F));

		PartDefinition cube_r23 = chest1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(95, 79).addBox(2.2026F, -1.8494F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.4588F, 1.4537F, 0.1272F, -0.5441F, 1.4982F));

		PartDefinition cube_r24 = chest1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5357F, -0.3123F, 0.6852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 92).addBox(-0.0357F, -1.1317F, -1.5517F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4136F, -0.9512F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r26 = neck1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5357F, -0.9F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4695F, -2.9617F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition cube_r27 = neck5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(14, 92).addBox(-0.0357F, -0.9F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.777F, -2.4366F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r28 = neck5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(66, 55).addBox(-0.5357F, -0.9F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1858F, -2.7405F, 0.248F, 0.1693F, 0.0426F));

		PartDefinition cube_r29 = neck.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5357F, -0.8259F, -3.0016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1044F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r30 = neck.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(92, 57).addBox(-0.0357F, -0.5F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3475F, -1.2722F, 0.0611F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(51, 68).addBox(-0.5357F, -0.8178F, -2.9187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6289F, -3.0415F, -0.4482F, 0.057F, 0.1179F));

		PartDefinition cube_r31 = neck2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 44).addBox(0.0F, -0.1F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.3696F, -1.6769F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3558F, -2.8117F, -0.1375F, 0.2315F, 0.315F));

		PartDefinition cube_r32 = neck3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(38, 92).addBox(0.0F, -1.1F, -1.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.2966F, -1.3168F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r33 = neck3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(54, 10).addBox(-0.5357F, -0.3F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0568F, -3.9345F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r34 = neck4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 94).addBox(0.0F, -0.4F, -2.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -1.5193F, -0.3867F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = neck4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 40).addBox(-0.5357F, -0.3F, -9.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.026F, 6.5022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7431F, -3.5978F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 8).addBox(-0.5F, -2.3F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5357F, 0.7102F, -3.8777F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(91, 37).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5357F, 0.7398F, -3.6799F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5357F, 0.7398F, -3.6799F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 19).addBox(-1.0F, -1.6F, -0.525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0357F, -0.8404F, 1.0372F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(91, 86).addBox(-1.0F, -0.675F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, 1.2952F, 1.8447F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(77, 86).addBox(-0.5F, -0.225F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(68, 45).addBox(-0.5F, -0.825F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5357F, 0.3831F, 0.0583F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 55).addBox(-1.0F, -0.225F, -2.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0357F, 0.4395F, -2.6762F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(44, 29).addBox(-1.0F, -0.65F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0357F, -1.6944F, -1.8684F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 62).addBox(-1.0F, -0.275F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0357F, -4.1282F, 0.68F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 68).addBox(-1.0F, -0.7272F, -0.485F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -3.4815F, -0.3692F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 44).addBox(-0.5F, 0.0929F, -9.239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -0.363F, -4.0264F, -0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(19, 39).addBox(-0.5F, -0.4856F, -5.7996F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0357F, -0.363F, -4.0264F, -0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 92).addBox(-0.5F, 1.957F, -1.2314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -5.8138F, -17.1796F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(95, 89).addBox(-0.5F, -0.7133F, -0.521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(14, 73).addBox(-0.5F, 0.3867F, -1.521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -6.7638F, -14.0546F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 30).addBox(-0.5F, -0.15F, -2.85F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -9.1356F, -11.8277F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(77, 34).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 0.0905F, 2.1549F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(96, 40).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0297F, -0.6135F, 5.5412F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 78).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(-0.0297F, -0.1729F, 4.9972F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(53, 62).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0297F, 0.7635F, 4.174F, 2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(96, 28).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0297F, 1.2488F, 3.6838F, -2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, -0.9F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.166F)), PartPose.offsetAndRotation(-0.0297F, 1.4002F, 3.0004F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 96).addBox(-0.5F, -1.875F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(-0.0297F, 1.3089F, 2.3064F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(77, 23).addBox(-0.5F, -1.8F, -0.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.169F)), PartPose.offsetAndRotation(-0.0297F, 1.4701F, 2.0534F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(7, 86).addBox(-0.5F, -0.8313F, -1.0931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -1.5484F, 6.7234F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(74, 95).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -1.373F, 7.971F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(91, 32).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -1.4862F, 8.9646F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(105, 69).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -2.3117F, 9.511F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(105, 66).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -2.4212F, 10.2024F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 105).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -1.6387F, 10.5596F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 105).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -1.7179F, 11.2551F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -2.1635F, 13.9181F, -2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 56).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -2.0565F, 6.6401F, 2.9801F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(26, 56).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -1.8415F, 9.5321F, 3.0674F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 50).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -1.9711F, 12.229F, -3.0936F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(49, 84).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -2.1635F, 13.9181F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(26, 88).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -2.5315F, 15.5778F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 72).addBox(-0.5F, -1.175F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -1.9852F, 6.1634F, 2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(78, 60).addBox(-0.5F, -1.175F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -2.1651F, 5.0276F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(15, 47).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.1456F)), PartPose.offsetAndRotation(-0.0357F, -3.1173F, 2.9389F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(95, 93).addBox(-0.5F, -2.8F, 0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 59).addBox(-0.5F, -1.5F, -1.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -2.789F, 0.3655F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 102).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -5.3961F, -0.2376F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(102, 79).addBox(-0.5F, -0.8674F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -6.2731F, -0.6469F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(69, 102).addBox(-0.5F, -0.5675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -6.2731F, -0.6469F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(95, 75).addBox(-0.5F, 0.1014F, -0.3667F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -6.2731F, -0.6469F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(103, 17).addBox(-0.5F, -4.35F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(19, 33).addBox(-0.5F, -3.85F, -0.85F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0357F, -3.6737F, 3.7533F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(54, 91).addBox(-0.5F, -2.85F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.0357F, -4.4406F, 1.1645F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 56).addBox(-0.5F, -3.85F, -0.15F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0357F, -6.4479F, -2.0215F, -1.946F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(64, 94).addBox(-0.5F, -0.175F, 0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -7.3046F, -4.582F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(91, 16).addBox(-0.5F, -2.8F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -6.3228F, -4.7718F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(97, 60).addBox(-0.5F, -1.725F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -8.1217F, -6.5588F, -2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(42, 63).addBox(-0.5F, -0.125F, 0.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -8.6675F, -6.4343F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(9, 61).addBox(-0.5F, -2.65F, -0.425F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.0357F, -10.2748F, -6.9878F, -2.81F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(89, 95).addBox(-0.5F, -1.825F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -7.551F, -5.0914F, -2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 102).addBox(-0.5F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(-0.0357F, -6.9465F, -2.1925F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(74, 102).addBox(-0.5F, -0.825F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -6.5148F, -2.9646F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 95).addBox(-0.5F, -1.825F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -6.9907F, -4.3871F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(79, 95).addBox(-0.5F, -1.6F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0357F, -8.0104F, -5.7735F, -2.5045F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(7, 77).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -9.2027F, -5.9093F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(71, 60).addBox(-0.5F, -0.2581F, -4.2491F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.0357F, -13.6159F, -6.1513F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 72).addBox(-0.5F, -0.1741F, -2.5592F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -13.6159F, -6.1513F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(68, 19).addBox(-0.5F, -0.8669F, -2.8757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0357F, -13.6159F, -6.1513F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(77, 18).addBox(-0.5F, -1.7936F, -1.8121F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -14.4409F, -4.8013F, 2.1555F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -1.8186F, -1.829F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -15.2409F, -3.3013F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -1.8894F, -1.7719F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0357F, -15.9409F, -1.7013F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(75, 55).addBox(-0.5F, -1.8465F, -1.8384F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -16.3587F, -0.1319F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(78, 82).addBox(-0.5F, -0.6283F, 0.4821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, -15.9159F, 1.9987F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(100, 87).addBox(-0.5F, -0.8017F, -0.1216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -16.3159F, 0.5987F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(100, 76).addBox(-0.5F, 0.6013F, -0.5419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0357F, -15.9159F, 1.9987F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(100, 73).addBox(-0.5F, -0.37F, -0.9683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -15.9159F, 1.9987F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(71, 82).addBox(-0.5F, -0.3946F, -1.7242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -15.9159F, 1.9987F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(14, 68).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0357F, -14.4659F, -0.4249F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(18, 62).addBox(-0.5F, 0.805F, -2.299F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.0357F, -14.4409F, -4.8013F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 101).addBox(-0.5F, -0.425F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -12.0288F, -2.2658F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(102, 7).addBox(-0.5F, 0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F))
				.texOffs(25, 102).addBox(-0.5F, -1.85F, -1.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(102, 0).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0357F, -14.5391F, -0.0328F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(102, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -12.0791F, -2.0539F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(102, 57).addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(64, 102).addBox(-0.5F, 0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F))
				.texOffs(102, 54).addBox(-0.5F, -0.35F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -12.4125F, -1.8205F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(101, 100).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -13.5702F, -0.1529F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(59, 101).addBox(-0.5F, -0.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -13.7658F, -0.8876F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(91, 40).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0357F, -11.6544F, -1.9693F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(101, 51).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -12.0288F, -2.2658F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 48).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.0357F, -11.2929F, -2.4742F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(101, 45).addBox(-0.5F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0357F, -10.9682F, -2.8544F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 84).addBox(-0.5F, -0.825F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0357F, -9.981F, -4.2384F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.0357F, -9.6237F, -4.6596F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(50, 73).addBox(-0.5F, 0.0112F, -5.3147F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0357F, -14.4409F, -4.8013F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(75, 90).addBox(-0.5F, -2.8511F, -0.3137F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0357F, -5.8138F, -17.1796F, -1.3439F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2603F, -3.5335F, 0.2365F, -0.0006F, -0.0013F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 50).mirror().addBox(-0.5F, -1.0F, -3.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.6007F, 1.0215F, -1.5847F, 0.2018F, -0.0289F, -0.0046F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-0.422F, -1.2271F, -7.5753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 0.1452F, -0.0464F, -0.0046F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(97, 56).mirror().addBox(-0.3014F, -1.2252F, -7.866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 0.1451F, -0.0289F, -0.0046F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-0.3184F, -1.8222F, -1.8574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8237F, -0.2097F, -0.3534F, 1.8425F, -0.0289F, -0.0046F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, -1.05F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.2428F, 2.9146F, -10.2569F, 0.3675F, -0.0508F, 0.0033F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(-0.0431F, -1.4139F, -2.533F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.9893F, -7.4004F, 0.446F, -0.0508F, 0.0033F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.3194F, 1.5468F, -8.8033F, 0.6207F, -0.0513F, -0.0016F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(106, 45).mirror().addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.3231F, 1.0722F, -8.7296F, 1.9296F, -0.0818F, 0.0006F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(95, 106).mirror().addBox(-0.5F, -0.45F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.4179F, 1.2363F, -7.5515F, -3.1318F, -0.0338F, 0.0006F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(24, 97).mirror().addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.4494F, 1.1993F, -6.6184F, -1.561F, -0.0338F, 0.0006F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.4903F, 1.1132F, -5.4085F, -1.4999F, -0.0338F, 0.0006F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-0.0645F, -1.5967F, -1.0137F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.9893F, -7.4004F, 1.7116F, -0.051F, -0.0013F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1737F, 2.441F, -11.5592F, 0.2935F, -0.0518F, -0.0031F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.5F, -0.45F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(106, 23).mirror().addBox(-0.5F, -0.45F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.0708F, 3.456F, -13.8701F, 0.3763F, -0.0169F, -0.0031F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(49, 100).mirror().addBox(-0.4933F, -0.5244F, -0.301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.0668F, 3.475F, -13.4024F, -0.016F, -0.0488F, -0.0138F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(100, 67).mirror().addBox(-0.4997F, -0.5017F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0668F, 3.475F, -13.4024F, 0.1145F, -0.014F, -0.0108F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(-0.5F, -0.325F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1403F, 3.381F, -12.1833F, -0.095F, -0.0512F, 0.0018F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-0.0409F, 0.349F, -4.9733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.9893F, -7.4004F, 0.0795F, -0.0512F, 0.0018F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1955F, 3.6923F, -11.0644F, -0.2346F, -0.0513F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(47, 88).mirror().addBox(-0.5F, -0.35F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2389F, 3.3115F, -10.2182F, -1.6832F, -0.0513F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(92, 61).mirror().addBox(-0.5F, -1.6F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2731F, 2.7691F, -9.5513F, -3.1231F, -0.0513F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.5F, -0.625F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2997F, 2.952F, -9.0318F, 1.6329F, -0.0513F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(70, 90).mirror().addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.315F, 4.1776F, -8.7363F, 0.2803F, -0.0513F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-0.5F, -1.625F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.3559F, 2.2996F, -7.9359F, -2.7042F, -0.0513F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-0.3218F, -0.454F, 0.6424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 2.3922F, -0.0291F, -0.0021F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(-0.5F, -0.1831F, -0.4723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.6638F, 0.4105F, 0.3987F, -1.8401F, -0.0266F, -0.0119F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(106, 32).mirror().addBox(-0.3218F, -0.0252F, -0.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, -2.1893F, -0.0291F, -0.0021F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-0.5F, -0.7777F, -0.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6702F, 0.1799F, 0.532F, 2.7414F, -0.0266F, -0.0119F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(85, 106).mirror().addBox(-0.3218F, 0.0325F, -0.6165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 2.0431F, -0.0291F, -0.0021F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.3218F, 0.1027F, 0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 1.2577F, -0.0291F, -0.0021F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(85, 90).mirror().addBox(-0.5F, -1.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 1.4911F, -0.8141F, -1.3603F, -0.0291F, -0.0021F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(-0.1752F, -0.2367F, -4.6226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 0.1756F, -0.0029F, -0.0021F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(44, 43).mirror().addBox(-0.4004F, -0.5771F, -8.072F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, 0.2629F, -0.0466F, -0.0021F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(59, 94).mirror().addBox(-0.6613F, 0.1791F, 2.7016F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0342F, 2.2491F, -3.3105F, 0.0607F, -0.0525F, 0.005F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-0.2306F, -0.1171F, -1.1202F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0342F, 2.2491F, -3.3105F, -0.0428F, -0.2092F, -0.0047F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(90, 106).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.6745F, 1.4213F, 0.8795F, -2.8438F, -0.0291F, -0.0021F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 79).mirror().addBox(-0.5F, -0.95F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, 1.5081F, -4.4264F, 0.1452F, -0.0464F, -0.0046F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(30, 103).mirror().addBox(-0.5F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.1757F, 2.8327F, -11.5727F, 0.2802F, -0.0508F, 0.0033F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(105, 88).mirror().addBox(-0.4159F, 1.9988F, -0.7079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.8424F, 1.0893F, 0.4996F, -1.2293F, -0.064F, -0.0021F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(65, 9).addBox(0.2306F, -0.1171F, -1.1202F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0372F, 2.2491F, -3.3105F, -0.0428F, 0.2092F, 0.0047F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(59, 94).addBox(0.6613F, 0.1791F, 2.7016F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0372F, 2.2491F, -3.3105F, 0.0607F, 0.0525F, -0.005F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 43).addBox(-0.5996F, -0.5771F, -8.072F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 0.2629F, 0.0466F, 0.0021F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(7, 90).addBox(-0.8248F, -0.2367F, -4.6226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 0.1756F, 0.0029F, 0.0021F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(105, 88).addBox(-0.5841F, 1.9988F, -0.7079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, -1.2293F, 0.064F, 0.0021F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(85, 90).addBox(-0.5F, -1.15F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.5535F, 1.4911F, -0.8141F, -1.3603F, 0.0291F, 0.0021F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(84, 25).addBox(-0.6782F, 0.1027F, 0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 1.2577F, 0.0291F, 0.0021F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 106).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.603F, 1.4213F, 0.8795F, -2.8438F, 0.0291F, 0.0021F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(85, 106).addBox(-0.6782F, 0.0325F, -0.6165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 2.0431F, 0.0291F, 0.0021F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, -0.7777F, -0.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5987F, 0.1799F, 0.532F, 2.7414F, 0.0266F, 0.0119F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(106, 32).addBox(-0.6782F, -0.0252F, -0.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, -2.1893F, 0.0291F, 0.0021F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(84, 46).addBox(-0.5F, -0.1831F, -0.4723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.5924F, 0.4105F, 0.3987F, -1.8401F, 0.0266F, 0.0119F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(40, 106).addBox(-0.6782F, -0.454F, 0.6424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 2.3922F, 0.0291F, 0.0021F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(35, 74).addBox(-0.5F, -1.625F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2845F, 2.2996F, -7.9359F, -2.7042F, 0.0513F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(70, 90).addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2435F, 4.1776F, -8.7363F, 0.2803F, 0.0513F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(82, 53).addBox(-0.5F, -0.625F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2283F, 2.952F, -9.0318F, 1.6329F, 0.0513F, 0.0F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(92, 61).addBox(-0.5F, -1.6F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2016F, 2.7691F, -9.5513F, -3.1231F, 0.0513F, 0.0F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(47, 88).addBox(-0.5F, -0.35F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1674F, 3.3115F, -10.2182F, -1.6832F, 0.0513F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(100, 70).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.124F, 3.6923F, -11.0644F, -0.2346F, 0.0513F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(82, 49).addBox(-0.9591F, 0.349F, -4.9733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.7709F, 1.9893F, -7.4004F, 0.0795F, 0.0512F, -0.0018F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(82, 28).addBox(-0.5F, -0.325F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0688F, 3.381F, -12.1833F, -0.095F, 0.0512F, -0.0018F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(100, 67).addBox(-0.5003F, -0.5017F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0046F, 3.475F, -13.4024F, 0.1145F, 0.014F, 0.0108F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(49, 100).addBox(-0.5067F, -0.5244F, -0.301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(-0.0046F, 3.475F, -13.4024F, -0.016F, 0.0488F, 0.0138F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(106, 23).addBox(-0.5F, -0.45F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(40, 88).addBox(-0.5F, -0.45F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.0007F, 3.456F, -13.8701F, 0.3763F, 0.0169F, 0.0031F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(7, 82).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1023F, 2.441F, -11.5592F, 0.2935F, 0.0518F, 0.0031F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(14, 79).addBox(-0.9355F, -1.5967F, -1.0137F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.7709F, 1.9893F, -7.4004F, 1.7116F, 0.051F, 0.0013F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.4188F, 1.1132F, -5.4085F, -1.4999F, 0.0338F, -0.0006F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(24, 97).addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.378F, 1.1993F, -6.6184F, -1.561F, 0.0338F, -0.0006F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(95, 106).addBox(-0.5F, -0.45F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3465F, 1.2363F, -7.5515F, -3.1318F, 0.0338F, -0.0006F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(106, 45).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.2516F, 1.0722F, -8.7296F, 1.9296F, 0.0818F, -0.0006F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(98, 84).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.248F, 1.5468F, -8.8033F, 0.6207F, 0.0513F, 0.0016F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(75, 29).addBox(-0.9569F, -1.4139F, -2.533F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.7709F, 1.9893F, -7.4004F, 0.446F, 0.0508F, -0.0033F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.1042F, 2.8327F, -11.5727F, 0.2802F, 0.0508F, -0.0033F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.1714F, 2.9146F, -10.2569F, 0.3675F, 0.0508F, -0.0033F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(75, 50).addBox(-0.6816F, -1.8222F, -1.8574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7523F, -0.2097F, -0.3534F, 1.8425F, 0.0289F, 0.0046F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 56).addBox(-0.6986F, -1.2252F, -7.866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 0.1451F, 0.0289F, 0.0046F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(57, 78).addBox(-0.578F, -1.2271F, -7.5753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7709F, 1.0893F, 0.4996F, 0.1452F, 0.0464F, 0.0046F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(28, 79).addBox(-0.5F, -0.95F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.4623F, 1.5081F, -4.4264F, 0.1452F, 0.0464F, 0.0046F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(44, 50).addBox(-0.5F, -1.0F, -3.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.5292F, 1.0215F, -1.5847F, 0.2018F, 0.0289F, 0.0046F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3693F, -10.615F, -35.8902F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(41, 96).addBox(-0.4483F, -0.581F, 0.2136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2983F, 9.6229F, 35.4282F, 0.2269F, -0.0262F, 0.0F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(20, 104).addBox(-0.4483F, -0.7548F, 0.8202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2983F, 9.6229F, 35.4282F, -0.5585F, -0.0262F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 98).addBox(-0.4483F, -1.9281F, -0.6865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.2983F, 9.6229F, 35.4282F, -1.6493F, -0.0262F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(105, 72).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3011F, 9.3066F, 37.3224F, -2.714F, -0.0262F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(15, 104).addBox(-0.5483F, -0.2106F, -0.4364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
				.texOffs(10, 104).addBox(-0.9233F, -0.2106F, -0.4364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.2983F, 9.6229F, 35.4282F, 2.6442F, -0.0262F, 0.0F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3549F, 10.9178F, 35.2794F, 1.6755F, -0.0262F, 0.0F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(77, 39).addBox(-0.5F, -1.9F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4018F, 10.8394F, 33.4896F, -1.6144F, -0.0262F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(105, 75).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.4193F, 9.5532F, 32.8202F, 0.7854F, -0.0262F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(105, 85).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.3554F, 7.7321F, 35.2596F, 2.9234F, -0.0262F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(80, 105).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.3757F, 7.9391F, 34.4871F, 1.8326F, -0.0262F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(96, 15).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.3923F, 8.4261F, 33.8526F, 0.6545F, -0.0262F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(14, 88).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.3897F, 9.5532F, 33.9512F, -0.6981F, -0.0262F, 0.0F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(75, 105).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.4184F, 10.3524F, 32.8551F, 0.0436F, -0.0262F, 0.0F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 104).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4018F, 10.8394F, 33.4896F, -0.6545F, -0.0262F, 0.0F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(70, 105).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3261F, 8.0412F, 36.4053F, 1.2654F, -0.0262F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(103, 82).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3106F, 8.5817F, 36.9949F, 2.3998F, -0.0262F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(63, 87).addBox(-0.4996F, -0.591F, -1.1223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(56, 87).addBox(-0.4996F, -0.591F, -0.5473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5496F, 11.3488F, 35.7803F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(104, 3).addBox(-0.4996F, 0.3402F, 0.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5496F, 11.3488F, 35.7803F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(96, 100).addBox(-0.5F, -0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 104).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 11.7328F, 36.5091F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(99, 103).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.55F, 11.7223F, 36.1092F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(94, 103).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 11.6425F, 35.7172F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(89, 103).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.55F, 11.5526F, 35.3275F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(100, 93).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.55F, 11.2952F, 35.2102F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(57, 24).addBox(-0.5012F, -1.0049F, -2.7151F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0971F, 4.2453F, 22.9084F, 0.3369F, 0.0129F, -0.0835F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5012F, -0.2711F, -2.7777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0971F, 4.2453F, 22.9084F, 0.0315F, 0.0129F, -0.0835F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(10, 97).addBox(-0.7477F, -3.7201F, -9.0861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7078F, 9.6523F, 31.5377F, -0.4206F, -0.0148F, -0.0845F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(42, 57).addBox(-0.5012F, -0.5685F, -1.5798F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0971F, 4.2453F, 22.9084F, 0.1013F, 0.0129F, -0.0835F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(57, 38).addBox(-0.5012F, -0.1685F, -1.5798F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0971F, 4.2453F, 22.9084F, -0.0732F, 0.0129F, -0.0835F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(74, 9).addBox(-0.5175F, -2.1881F, 0.0328F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0971F, 4.2453F, 22.9084F, -0.1616F, 0.0331F, -0.0977F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(42, 74).addBox(-0.5175F, -2.3479F, 1.1269F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0971F, 4.2453F, 22.9084F, -0.2489F, 0.0331F, -0.0977F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(106, 13).addBox(-0.7477F, -7.9853F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, 0.9512F, -0.0336F, -0.0857F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(85, 63).addBox(-0.7477F, -1.9311F, 7.3462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F))
				.texOffs(33, 88).addBox(-0.7477F, -2.1311F, 7.3462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, 2.3039F, -0.0336F, -0.0857F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(68, 24).addBox(-0.7477F, -3.2532F, 6.0716F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, 2.0857F, -0.0336F, -0.0857F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(94, 97).addBox(-0.7234F, -0.4475F, 0.0535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, 2.8277F, -0.0339F, -0.0887F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(78, 5).addBox(-0.7234F, -0.3497F, -1.9197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, -2.7574F, -0.0339F, -0.0887F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(97, 81).addBox(-0.7234F, -0.2997F, -0.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, -3.1064F, -0.0339F, -0.0887F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(25, 29).addBox(-0.7234F, -0.7595F, -0.5109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, 2.4786F, -0.0339F, -0.0887F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 66).addBox(-0.7234F, -1.4487F, 5.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7078F, 10.0273F, 32.1627F, 2.3477F, -0.0339F, -0.0887F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(21, 79).addBox(-0.4936F, -0.2875F, -1.6751F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 25).addBox(-0.4936F, -0.6875F, -1.6751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0886F, 3.6084F, 27.9199F, -1.3337F, 0.0048F, -0.0985F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(49, 79).addBox(-0.4936F, -0.1829F, -0.0242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0886F, 3.6084F, 27.9199F, -2.5554F, 0.0048F, -0.0985F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(69, 5).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0587F, 6.0069F, 35.4767F, -0.7505F, -0.0464F, -0.0464F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(83, 0).addBox(-1.6914F, -0.341F, -0.5616F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6304F, 6.225F, 35.3979F, -2.0602F, 0.0282F, -0.0992F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(89, 29).addBox(-1.6914F, -0.3573F, -1.6063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(88, 79).addBox(-1.6914F, -0.3573F, -2.0063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6304F, 6.225F, 35.3979F, -0.7076F, 0.0282F, -0.0992F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(56, 98).addBox(-0.6914F, 0.578F, 0.3215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6304F, 6.225F, 35.3979F, -2.5838F, 0.0282F, -0.0992F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(42, 80).addBox(-0.6914F, 0.8796F, -0.1823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.6304F, 6.225F, 35.3979F, -2.1911F, 0.0282F, -0.0992F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(98, 21).addBox(-0.6914F, 0.8773F, -1.2093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6304F, 6.225F, 35.3979F, -1.5803F, 0.0282F, -0.0992F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(91, 100).addBox(-1.0914F, -0.2099F, -2.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 100).addBox(-0.6914F, -0.2099F, -2.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(99, 97).addBox(-0.6914F, -0.2099F, -2.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.6304F, 6.225F, 35.3979F, -0.7949F, 0.0282F, -0.0992F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(44, 100).addBox(-1.1F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(44, 100).addBox(-1.1F, -0.3F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(44, 100).addBox(-0.7F, -0.3F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(44, 100).addBox(-0.7F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.4382F, 4.6794F, 33.7442F, -0.6226F, 0.532F, 0.4883F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 93).addBox(-0.7F, -1.65F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.366F, 4.0882F, 32.5651F, 1.473F, 0.143F, 0.8417F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(92, 82).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.167F, 4.1079F, 32.566F, 1.3978F, 0.0048F, -0.0985F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(66, 99).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.379F, 4.2005F, 32.9488F, -1.996F, 0.2364F, 0.8427F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(99, 64).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.379F, 4.2005F, 32.9488F, 2.9782F, 0.2364F, 0.8427F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(29, 99).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1799F, 4.2202F, 32.9497F, 2.8551F, 0.0048F, -0.0985F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 99).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3982F, 4.3774F, 33.307F, -1.891F, 0.3376F, 0.6766F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(71, 99).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1992F, 4.3971F, 33.308F, -2.0318F, 0.0048F, -0.0985F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(81, 99).addBox(-0.7F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4085F, 4.4736F, 33.4821F, -0.3536F, 0.368F, 0.6653F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(86, 99).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2534F, 4.9379F, 33.4647F, -0.5047F, 0.0048F, -0.0985F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(103, 20).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3368F, 3.8583F, 31.2268F, 1.3312F, 0.2562F, 1.0488F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(88, 71).addBox(-0.7F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3146F, 3.6676F, 30.5536F, -0.1087F, 0.2562F, 1.0488F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(88, 67).addBox(-0.5F, -0.2F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 3.4145F, 29.957F, -0.2778F, 0.0048F, -0.0985F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(96, 24).addBox(-0.7F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.265F, 3.1917F, 30.0146F, -0.5192F, 1.1793F, -0.5836F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0524F, 3.1437F, 28.603F, -0.1905F, 0.0048F, -0.0985F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(84, 42).addBox(-0.9F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6986F, 6.8775F, 36.3922F, -0.6129F, 0.2721F, 0.3874F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(78, 65).addBox(-0.4936F, -0.9958F, -1.6469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0886F, 3.6084F, 27.9199F, -1.5431F, 0.0048F, -0.0985F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(48, 92).addBox(-1.0F, -0.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6792F, 10.3463F, 37.5006F, -3.0689F, 0.7666F, 0.0514F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(100, 90).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6868F, 7.4078F, 37.0648F, -2.1999F, 0.7467F, 0.2017F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(84, 86).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6832F, 8.3859F, 37.2726F, -1.2836F, 0.7467F, 0.2017F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(74, 77).addBox(-0.4752F, -0.6799F, -0.2858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0272F, 3.7373F, 25.9368F, 0.912F, 0.0346F, -0.1222F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(89, 50).addBox(-0.4752F, 0.0595F, -1.912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(0.0272F, 3.7373F, 25.9368F, 1.4356F, 0.0346F, -0.1222F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(60, 71).addBox(-0.4752F, -2.701F, -1.5069F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0272F, 3.7373F, 25.9368F, 1.1302F, 0.0346F, -0.1222F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2979F, -10.615F, -35.8902F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(41, 96).mirror().addBox(-0.5517F, -0.581F, 0.2136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 9.6229F, 35.4282F, 0.2269F, 0.0262F, 0.0F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(20, 104).mirror().addBox(-0.5517F, -0.7548F, 0.8202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 9.6229F, 35.4282F, -0.5585F, 0.0262F, 0.0F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(-0.5517F, -1.9281F, -0.6865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 9.6229F, 35.4282F, -1.6493F, 0.0262F, 0.0F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(105, 72).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3011F, 9.3066F, 37.3224F, -2.714F, 0.0262F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(15, 104).mirror().addBox(-0.4517F, -0.2106F, -0.4364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(10, 104).mirror().addBox(-0.0767F, -0.2106F, -0.4364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2983F, 9.6229F, 35.4282F, 2.6442F, 0.0262F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3549F, 10.9178F, 35.2794F, 1.6755F, 0.0262F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-0.5F, -1.9F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4018F, 10.8394F, 33.4896F, -1.6144F, 0.0262F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(105, 75).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.4193F, 9.5532F, 32.8202F, 0.7854F, 0.0262F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.3554F, 7.7321F, 35.2596F, 2.9234F, 0.0262F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(80, 105).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(-0.3757F, 7.9391F, 34.4871F, 1.8326F, 0.0262F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.3923F, 8.4261F, 33.8526F, 0.6545F, 0.0262F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(-0.3897F, 9.5532F, 33.9512F, -0.6981F, 0.0262F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(75, 105).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(-0.4184F, 10.3524F, 32.8551F, 0.0436F, 0.0262F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4018F, 10.8394F, 33.4896F, -0.6545F, 0.0262F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3261F, 8.0412F, 36.4053F, 1.2654F, 0.0262F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(103, 82).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3106F, 8.5817F, 36.9949F, 2.3998F, 0.0262F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(63, 87).mirror().addBox(-0.5004F, -0.591F, -1.1223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(56, 87).mirror().addBox(-0.5004F, -0.591F, -0.5473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5496F, 11.3488F, 35.7803F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(104, 3).mirror().addBox(-0.5004F, 0.3402F, 0.3017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5496F, 11.3488F, 35.7803F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(96, 100).mirror().addBox(-0.5F, -0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 104).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 11.7328F, 36.5091F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(99, 103).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 11.7223F, 36.1092F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(94, 103).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 11.6425F, 35.7172F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(89, 103).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 11.5526F, 35.3275F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(100, 93).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 11.2952F, 35.2102F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-0.4988F, -1.0049F, -2.7151F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.2453F, 22.9084F, 0.3369F, -0.0129F, 0.0835F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.4988F, -0.2711F, -2.7777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.2453F, 22.9084F, 0.0315F, -0.0129F, 0.0835F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.2523F, -3.7201F, -9.0861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 9.6523F, 31.5377F, -0.4206F, 0.0148F, 0.0845F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(42, 57).mirror().addBox(-0.4988F, -0.5685F, -1.5798F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.2453F, 22.9084F, 0.1013F, -0.0129F, 0.0835F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(57, 38).mirror().addBox(-0.4988F, -0.1685F, -1.5798F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.2453F, 22.9084F, -0.0732F, -0.0129F, 0.0835F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(74, 9).mirror().addBox(-0.4825F, -2.1881F, 0.0328F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.2453F, 22.9084F, -0.1616F, -0.0331F, 0.0977F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-0.4825F, -2.3479F, 1.1269F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.2453F, 22.9084F, -0.2489F, -0.0331F, 0.0977F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(106, 13).mirror().addBox(-0.2523F, -7.9853F, -0.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, 0.9512F, 0.0336F, 0.0857F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(85, 63).mirror().addBox(-0.2523F, -1.9311F, 7.3462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(33, 88).mirror().addBox(-0.2523F, -2.1311F, 7.3462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, 2.3039F, 0.0336F, 0.0857F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-0.2523F, -3.2532F, 6.0716F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, 2.0857F, 0.0336F, 0.0857F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(94, 97).mirror().addBox(-0.2766F, -0.4475F, 0.0535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, 2.8277F, 0.0339F, 0.0887F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(78, 5).mirror().addBox(-0.2766F, -0.3497F, -1.9197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, -2.7574F, 0.0339F, 0.0887F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(97, 81).mirror().addBox(-0.2766F, -0.2997F, -0.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, -3.1064F, 0.0339F, 0.0887F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(25, 29).mirror().addBox(-0.2766F, -0.7595F, -0.5109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, 2.4786F, 0.0339F, 0.0887F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.2766F, -1.4487F, 5.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7078F, 10.0273F, 32.1627F, 2.3477F, 0.0339F, 0.0887F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(-0.5064F, -0.2875F, -1.6751F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 25).mirror().addBox(-0.5064F, -0.6875F, -1.6751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 3.6084F, 27.9199F, -1.3337F, -0.0048F, 0.0985F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(49, 79).mirror().addBox(-0.5064F, -0.1829F, -0.0242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 3.6084F, 27.9199F, -2.5554F, -0.0048F, 0.0985F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0587F, 6.0069F, 35.4767F, -0.7505F, 0.0464F, 0.0464F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.3086F, -0.341F, -0.5616F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6304F, 6.225F, 35.3979F, -2.0602F, -0.0282F, 0.0992F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(89, 29).mirror().addBox(-0.3086F, -0.3573F, -1.6063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(88, 79).mirror().addBox(-0.3086F, -0.3573F, -2.0063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6304F, 6.225F, 35.3979F, -0.7076F, -0.0282F, 0.0992F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(56, 98).mirror().addBox(-0.3086F, 0.578F, 0.3215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6304F, 6.225F, 35.3979F, -2.5838F, -0.0282F, 0.0992F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(42, 80).mirror().addBox(-0.3086F, 0.8796F, -0.1823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.6304F, 6.225F, 35.3979F, -2.1911F, -0.0282F, 0.0992F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-0.3086F, 0.8773F, -1.2093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6304F, 6.225F, 35.3979F, -1.5803F, -0.0282F, 0.0992F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(91, 100).mirror().addBox(0.0914F, -0.2099F, -2.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 100).mirror().addBox(-0.3086F, -0.2099F, -2.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(99, 97).mirror().addBox(-0.3086F, -0.2099F, -2.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.6304F, 6.225F, 35.3979F, -0.7949F, -0.0282F, 0.0992F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(44, 100).mirror().addBox(0.1F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(44, 100).mirror().addBox(0.1F, -0.3F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(44, 100).mirror().addBox(-0.3F, -0.3F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(44, 100).mirror().addBox(-0.3F, -0.3F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.4382F, 4.6794F, 33.7442F, -0.6226F, -0.532F, -0.4883F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.3F, -1.65F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.366F, 4.0882F, 32.5651F, 1.473F, -0.143F, -0.8417F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.167F, 4.1079F, 32.566F, 1.3978F, -0.0048F, 0.0985F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.379F, 4.2005F, 32.9488F, -1.996F, -0.2364F, -0.8427F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(99, 64).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.379F, 4.2005F, 32.9488F, 2.9782F, -0.2364F, -0.8427F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(29, 99).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1799F, 4.2202F, 32.9497F, 2.8551F, -0.0048F, 0.0985F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3982F, 4.3774F, 33.307F, -1.891F, -0.3376F, -0.6766F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(71, 99).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1992F, 4.3971F, 33.308F, -2.0318F, -0.0048F, 0.0985F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 99).mirror().addBox(-0.3F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4085F, 4.4736F, 33.4821F, -0.3536F, -0.368F, -0.6653F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2534F, 4.9379F, 33.4647F, -0.5047F, -0.0048F, 0.0985F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3368F, 3.8583F, 31.2268F, 1.3312F, -0.2562F, -1.0488F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(88, 71).mirror().addBox(-0.3F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, 3.6676F, 30.5536F, -0.1087F, -0.2562F, -1.0488F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-0.5F, -0.2F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0858F, 3.4145F, 29.957F, -0.2778F, -0.0048F, 0.0985F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(96, 24).mirror().addBox(-0.3F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.265F, 3.1917F, 30.0146F, -0.5192F, -1.1793F, 0.5836F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, 3.1437F, 28.603F, -0.1905F, -0.0048F, 0.0985F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.1F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6986F, 6.8775F, 36.3922F, -0.6129F, -0.2721F, -0.3874F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.5064F, -0.9958F, -1.6469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0886F, 3.6084F, 27.9199F, -1.5431F, -0.0048F, 0.0985F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(0.0F, -0.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6792F, 10.3463F, 37.5006F, -3.0689F, -0.7666F, -0.0514F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(100, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6868F, 7.4078F, 37.0648F, -2.1999F, -0.7467F, -0.2017F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6832F, 8.3859F, 37.2726F, -1.2836F, -0.7467F, -0.2017F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-0.5248F, -0.6799F, -0.2858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.0272F, 3.7373F, 25.9368F, 0.912F, -0.0346F, 0.1222F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-0.5248F, 0.0595F, -1.912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-0.0272F, 3.7373F, 25.9368F, 1.4356F, -0.0346F, 0.1222F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.5248F, -2.701F, -1.5069F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.0272F, 3.7373F, 25.9368F, 1.1302F, -0.0346F, 0.1222F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5483F, 2.0289F, 1.8168F, -0.8714F, -0.4279F, -0.5707F));

		PartDefinition cube_r340 = leftwing1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(59, 16).addBox(-1.0F, -0.05F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.235F, -0.2704F, -0.882F, -1.1579F, 0.3055F, 0.131F));

		PartDefinition cube_r341 = leftwing1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(5, 101).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4803F, 0.755F, -3.3576F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition cube_r342 = leftwing1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 68).addBox(1.625F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.1373F, 0.4249F, 0.1885F));

		PartDefinition cube_r343 = leftwing1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(50, 104).addBox(0.0F, 0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.8925F, -0.548F, -0.212F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition cube_r344 = leftwing1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(56, 6).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.8782F, -0.463F, -0.417F, -1.1665F, 0.2334F, 0.0986F));

		PartDefinition cube_r345 = leftwing1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(72, 15).addBox(-0.625F, -1.025F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(31, 92).addBox(-0.625F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7468F, -1.0001F, 0.8796F, -0.7459F, 1.0228F, 0.7459F));

		PartDefinition cube_r346 = leftwing1.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(96, 48).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3159F, -0.6508F, 0.0364F, -1.1657F, -0.2415F, -0.1022F));

		PartDefinition cube_r347 = leftwing1.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(97, 0).addBox(-0.35F, -0.275F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0698F, -0.8267F, 0.461F, -0.8396F, -0.9605F, -0.6339F));

		PartDefinition cube_r348 = leftwing1.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(91, 21).addBox(0.6F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0165F, -0.4169F, -0.5284F, 0.8935F, 0.9139F, 2.5745F));

		PartDefinition cube_r349 = leftwing1.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(59, 91).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0165F, -0.4169F, -0.5284F, 1.1709F, 0.1852F, 3.0639F));

		PartDefinition cube_r350 = leftwing1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(92, 4).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0165F, -0.4169F, -0.5284F, 1.1186F, 0.5038F, 2.9112F));

		PartDefinition cube_r351 = leftwing1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(46, 96).addBox(-1.225F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1518F, 0.4374F, -2.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(0, 43).addBox(-1.3789F, -0.2386F, -0.1429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 54).addBox(-1.6789F, 13.8614F, -0.1429F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.27F, 0.6146F, -2.6512F, -2.2026F, 0.3056F, -2.9334F));

		PartDefinition cube_r352 = leftwing2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(9, 68).addBox(-0.5F, -6.8F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2051F, 7.1625F, -0.4429F, 0.0F, 0.0F, 0.0611F));

		PartDefinition cube_r353 = leftwing2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r354 = leftwing2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(90, 90).addBox(-0.5F, -2.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7153F, 11.5884F, -0.6215F, 0.0F, -1.5708F, 0.384F));

		PartDefinition cube_r355 = leftwing2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(80, 90).addBox(-1.5824F, -3.2336F, -0.5694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5364F, 15.1119F, 0.461F, 0.0F, -1.5708F, 0.2531F));

		PartDefinition cube_r356 = leftwing2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(98, 36).addBox(-1.5824F, -0.7179F, -0.5068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5364F, 15.1119F, 0.461F, 0.0F, -1.5708F, 0.3927F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(5, 43).addBox(-1.1096F, 0.6238F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(10, 43).addBox(-0.6096F, 0.6238F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.875F, 15.0329F, -0.6503F, -0.068F, 0.1227F, 0.8525F));

		PartDefinition cube_r357 = leftwing3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(81, 74).addBox(-0.4F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6096F, 0.9238F, 0.549F, 0.0F, 0.0F, -0.48F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(46, 18).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5927F, 14.8333F, 0.0314F, -0.9765F, -0.23F, -0.728F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1012F, 13.7076F, 0.917F, 1.5259F, -0.0894F, -2.415F));

		PartDefinition cube_r358 = leftwing4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, -0.55F, -9.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, 0.6981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 20).addBox(-0.3057F, -0.7945F, -0.1036F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6304F, 0.1112F, 17.265F, 0.2201F, -0.0794F, 0.6809F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(0, 33).addBox(-0.3742F, -0.7269F, -0.0153F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0369F, -0.0515F, 10.6267F, 0.2008F, 0.2885F, 0.0023F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(66, 30).addBox(0.0F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3519F, -0.2145F, 7.8393F, 0.0907F, 0.3047F, 0.0159F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6198F, 2.0289F, 1.8168F, -1.1904F, 0.1152F, 0.4109F));

		PartDefinition cube_r359 = rightwing1.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-4.0F, -0.05F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.235F, -0.2704F, -0.882F, -1.1579F, -0.3055F, -0.131F));

		PartDefinition cube_r360 = rightwing1.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(5, 101).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4803F, 0.755F, -3.3576F, -1.159F, 0.2975F, 0.1274F));

		PartDefinition cube_r361 = rightwing1.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-5.625F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.1373F, -0.4249F, -0.1885F));

		PartDefinition cube_r362 = rightwing1.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(50, 104).mirror().addBox(-1.0F, 0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8925F, -0.548F, -0.212F, -1.159F, -0.2975F, -0.1274F));

		PartDefinition cube_r363 = rightwing1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(56, 6).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.8782F, -0.463F, -0.417F, -1.1665F, -0.2334F, -0.0986F));

		PartDefinition cube_r364 = rightwing1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(72, 15).mirror().addBox(-2.375F, -1.025F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(31, 92).mirror().addBox(-1.375F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7468F, -1.0001F, 0.8796F, -0.7459F, -1.0228F, -0.7459F));

		PartDefinition cube_r365 = rightwing1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(96, 48).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3159F, -0.6508F, 0.0364F, -1.1657F, 0.2415F, 0.1022F));

		PartDefinition cube_r366 = rightwing1.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.65F, -0.275F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0698F, -0.8267F, 0.461F, -0.8396F, 0.9605F, 0.6339F));

		PartDefinition cube_r367 = rightwing1.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-2.6F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0165F, -0.4169F, -0.5284F, 0.8935F, -0.9139F, -2.5745F));

		PartDefinition cube_r368 = rightwing1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(59, 91).mirror().addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0165F, -0.4169F, -0.5284F, 1.1709F, -0.1852F, -3.0639F));

		PartDefinition cube_r369 = rightwing1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0165F, -0.4169F, -0.5284F, 1.1186F, -0.5038F, -2.9112F));

		PartDefinition cube_r370 = rightwing1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(46, 96).mirror().addBox(0.225F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1518F, 0.4374F, -2.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(0.3789F, -0.2386F, -0.1429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 54).mirror().addBox(-0.3211F, 13.8614F, -0.1429F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.27F, 0.6146F, -2.6512F, -1.8503F, -0.6716F, -2.9939F));

		PartDefinition cube_r371 = rightwing2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(9, 68).mirror().addBox(-0.5F, -6.8F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2051F, 7.1625F, -0.4429F, 0.0F, 0.0F, -0.0611F));

		PartDefinition cube_r372 = rightwing2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(26, 47).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1789F, 7.4614F, -0.4429F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r373 = rightwing2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-0.5F, -2.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7153F, 11.5884F, -0.6215F, 0.0F, 1.5708F, -0.384F));

		PartDefinition cube_r374 = rightwing2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(0.5824F, -3.2336F, -0.5694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5364F, 15.1119F, 0.461F, 0.0F, 1.5708F, -0.2531F));

		PartDefinition cube_r375 = rightwing2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(98, 36).mirror().addBox(0.5824F, -0.7179F, -0.5068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5364F, 15.1119F, 0.461F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(0.1096F, 0.6238F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(10, 43).mirror().addBox(-0.3904F, 0.6238F, 0.049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.875F, 15.0329F, -0.6503F, -0.068F, -0.1227F, -0.8525F));

		PartDefinition cube_r376 = rightwing3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-1.6F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.6096F, 0.9238F, 0.549F, 0.0F, 0.0F, 0.48F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(46, 18).mirror().addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5927F, 14.8333F, 0.0314F, -1.5921F, 0.4257F, 0.4329F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1012F, 13.7076F, 0.917F, 1.568F, 0.1F, 2.8532F));

		PartDefinition cube_r377 = rightwing4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.575F, -0.55F, -9.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3799F, -0.0164F, 8.846F, 0.0F, 0.0F, -0.6981F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-0.6943F, -0.7945F, -0.1036F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6304F, 0.1112F, 17.265F, 0.2201F, 0.0794F, -0.6809F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.6258F, -0.7269F, -0.0153F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0369F, -0.0515F, 10.6267F, 0.2008F, -0.2885F, -0.0023F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-1.0F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3519F, -0.2145F, 7.8393F, 0.0907F, -0.3047F, -0.0159F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5357F, -0.5081F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r378 = body.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(21, 73).addBox(-0.0357F, -1.0778F, -1.8744F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 2.8999F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r379 = body.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(66, 91).addBox(-0.0357F, -1.0656F, -1.5744F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4157F, 1.4999F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r380 = body.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.4844F, 0.0768F, -0.2698F));

		PartDefinition cube_r381 = body.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.3432F, 0.3084F, -0.7734F));

		PartDefinition cube_r382 = body.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 3.465F, 0.1394F, 0.4369F, -1.3198F));

		PartDefinition cube_r383 = body.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.153F, 0.5055F, -1.3661F));

		PartDefinition cube_r384 = body.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.3922F, 0.3605F, -0.8098F));

		PartDefinition cube_r385 = body.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(105, 94).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0376F, 1.465F, 0.5502F, 0.1005F, -0.3164F));

		PartDefinition cube_r386 = body.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(105, 94).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.5502F, -0.1005F, 0.3164F));

		PartDefinition cube_r387 = body.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(95, 9).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.3922F, -0.3605F, 0.8098F));

		PartDefinition cube_r388 = body.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(82, 57).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 1.465F, 0.153F, -0.5055F, 1.3661F));

		PartDefinition cube_r389 = body.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(82, 32).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.1394F, -0.4369F, 1.3198F));

		PartDefinition cube_r390 = body.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(92, 65).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.3432F, -0.3084F, 0.7734F));

		PartDefinition cube_r391 = body.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(54, 16).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0376F, 3.465F, 0.4844F, -0.0768F, 0.2698F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r392 = body2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(106, 101).mirror().addBox(-3.2026F, -1.8494F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.1261F, 0.4037F, -1.395F));

		PartDefinition cube_r393 = body2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(105, 106).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.4495F, 0.0709F, -0.3421F));

		PartDefinition cube_r394 = body2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2784F, 1.4151F, 0.3143F, 0.2863F, -0.8516F));

		PartDefinition cube_r395 = body2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(96, 19).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.3143F, -0.2863F, 0.8516F));

		PartDefinition cube_r396 = body2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(105, 106).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.4495F, -0.0709F, 0.3421F));

		PartDefinition cube_r397 = body2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(106, 101).addBox(2.2026F, -1.8494F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2784F, 1.4151F, 0.1261F, -0.4037F, 1.395F));

		PartDefinition cube_r398 = body2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(10, 94).addBox(-0.0357F, -0.9924F, -0.7182F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0024F, -0.2539F, 1.7496F, -0.0523F, 0.0012F, -0.0018F));

		PartDefinition cube_r399 = body2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(68, 35).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r400 = body3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(31, 51).addBox(-0.0357F, -0.9924F, 0.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 82).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition cube_r401 = body3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.5232F, 0.0955F, -0.424F));

		PartDefinition cube_r402 = body3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.1076F, 0.4127F, 0.3695F, 0.3433F, -0.9226F));

		PartDefinition cube_r403 = body3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-1.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.222F, 0.0945F, -1.1134F));

		PartDefinition cube_r404 = body3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.0326F, 2.4127F, 0.2759F, -0.051F, -0.5881F));

		PartDefinition cube_r405 = body3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(107, 0).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.2759F, 0.051F, 0.5881F));

		PartDefinition cube_r406 = body3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 107).addBox(0.8322F, -0.5004F, -0.5143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.0326F, 2.4127F, 0.222F, -0.0945F, 1.1134F));

		PartDefinition cube_r407 = body3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(39, 18).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.3695F, -0.3433F, 0.9226F));

		PartDefinition cube_r408 = body3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(9, 59).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.1076F, 0.4127F, 0.5232F, -0.0955F, 0.424F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, 2.0442F, -0.129F, -0.1298F, 0.0168F));

		PartDefinition cube_r409 = body1.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(85, 67).addBox(-0.003F, 0.95F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 78).addBox(0.0F, -0.05F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0357F, -0.7141F, 5.0089F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r410 = body1.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(57, 73).addBox(0.0F, -0.0402F, -0.0618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0387F, -0.8231F, 4.0579F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r411 = body1.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(31, 47).addBox(0.0009F, -1.2328F, -0.8859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, 0.0548F, 0.8255F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r412 = body1.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(28, 73).addBox(0.0009F, -0.974F, -2.5734F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0366F, 0.0548F, 3.5255F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r413 = body1.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(106, 99).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.2996F, 2.3858F, 0.2508F, 0.1423F, -0.5969F));

		PartDefinition cube_r414 = body1.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(100, 106).mirror().addBox(-0.9711F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 0.3996F, 4.3858F, 0.1885F, 0.0943F, -0.5834F));

		PartDefinition cube_r415 = body1.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(100, 106).addBox(-0.0289F, 0.103F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.3996F, 4.3858F, 0.1885F, -0.0943F, 0.5834F));

		PartDefinition cube_r416 = body1.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(106, 99).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4643F, 0.2996F, 2.3858F, 0.2508F, -0.1423F, 0.5969F));

		PartDefinition cube_r417 = body1.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5357F, -0.1F, -3.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 3.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(44, 36).addBox(-0.5357F, -0.5778F, -0.0329F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6441F, 5.9475F, -0.1947F, -0.3F, 0.0582F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(21, 88).addBox(-0.2279F, -0.2807F, -0.4086F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.27F, 1.0165F, 4.1942F, -0.0108F, 0.0608F, -0.1137F));

		PartDefinition cube_r418 = leftleg1.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(15, 101).addBox(-0.5F, 1.25F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 7.194F, 1.0519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r419 = leftleg1.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(99, 4).addBox(-0.5F, 4.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 6.366F, -0.0853F, 0.32F, 0.0219F, -0.0034F));

		PartDefinition cube_r420 = leftleg1.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(106, 29).addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3202F, 9.8157F, 1.5842F, 0.4945F, 0.0219F, -0.0034F));

		PartDefinition cube_r421 = leftleg1.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(101, 14).addBox(-0.5F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2721F, 9.0132F, 1.0943F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftleg1.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(10, 101).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 7.7813F, 0.1898F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftleg1.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(31, 95).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2721F, 5.8366F, -0.2771F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r424 = leftleg1.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(95, 11).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 3.8403F, -0.3992F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r425 = leftleg1.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(51, 96).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1991F, 11.4972F, 2.5446F, 0.8917F, 0.0609F, 0.2316F));

		PartDefinition cube_r426 = leftleg2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(39, 39).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 39).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(25, 20).addBox(-1.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7425F, 14.4622F, 1.7082F, -0.2248F, -0.1595F, -0.0806F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(21, 88).mirror().addBox(-0.7721F, -0.2807F, -0.4086F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3415F, 1.0165F, 4.1942F, -0.1417F, -0.0608F, 0.1137F));

		PartDefinition cube_r427 = rightleg1.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(15, 101).mirror().addBox(-0.5F, 1.25F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 7.194F, 1.0519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightleg1.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(99, 4).mirror().addBox(-0.5F, 4.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 6.366F, -0.0853F, 0.32F, -0.0219F, 0.0034F));

		PartDefinition cube_r429 = rightleg1.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3202F, 9.8157F, 1.5842F, 0.4945F, -0.0219F, 0.0034F));

		PartDefinition cube_r430 = rightleg1.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(101, 14).mirror().addBox(-0.5F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 9.0132F, 1.0943F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r431 = rightleg1.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 7.7813F, 0.1898F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r432 = rightleg1.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(31, 95).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 5.8366F, -0.2771F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r433 = rightleg1.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(95, 11).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 3.8403F, -0.3992F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r434 = rightleg1.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(51, 96).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, -0.5497F, -0.1292F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1991F, 11.4972F, 2.5446F, 0.7608F, -0.0609F, -0.2316F));

		PartDefinition cube_r435 = rightleg2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(39, 39).mirror().addBox(0.15F, -2.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 39).mirror().addBox(-0.95F, -2.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0191F, 1.5921F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(25, 20).mirror().addBox(-2.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7425F, 14.4622F, 1.7082F, 0.0806F, 0.1595F, 0.0806F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.2749F, 3.9153F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r436 = bone2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(96, 32).addBox(-0.5F, -0.7379F, -0.8859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, -1.9284F, -0.0693F, 0.1225F));

		PartDefinition cube_r437 = bone2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(106, 42).addBox(-0.5F, 0.4937F, -0.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, -2.4083F, -0.0693F, 0.1225F));

		PartDefinition cube_r438 = bone2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(34, 100).addBox(-0.5F, -0.9958F, -0.8962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, -1.972F, -0.0693F, 0.1225F));

		PartDefinition cube_r439 = bone2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(45, 106).addBox(-0.5F, -1.0712F, 0.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, -0.6194F, -0.0693F, 0.1225F));

		PartDefinition cube_r440 = bone2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(100, 11).addBox(-0.5F, -0.3674F, -0.5043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, 1.8241F, -0.0693F, 0.1225F));

		PartDefinition cube_r441 = bone2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(106, 48).addBox(-0.5F, -0.4832F, 0.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, -3.1065F, -0.0693F, 0.1225F));

		PartDefinition cube_r442 = bone2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(106, 26).addBox(-0.5F, -1.2003F, -0.2863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.075F, -0.2005F, 1.6481F, 2.5222F, -0.0693F, 0.1225F));

		PartDefinition cube_r443 = bone2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(106, 51).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.0691F, 1.8976F, 2.0865F, -2.4348F, -0.3222F, 0.4341F));

		PartDefinition cube_r444 = bone2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(0, 89).addBox(-0.8952F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, -1.2567F, -0.3222F, 0.4341F));

		PartDefinition cube_r445 = bone2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(105, 10).addBox(-0.8952F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, -2.7403F, -0.3222F, 0.4341F));

		PartDefinition cube_r446 = bone2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(28, 84).addBox(-0.8952F, -0.5233F, -1.9233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, 2.6703F, -0.3222F, 0.4341F));

		PartDefinition cube_r447 = bone2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(101, 33).addBox(-0.8952F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.025F, 1.1002F, 1.3661F, 2.4608F, -0.3222F, 0.4341F));

		PartDefinition cube_r448 = bone2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(96, 52).addBox(-0.9886F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 2.1233F, -0.1932F, 0.2455F));

		PartDefinition cube_r449 = bone2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(104, 103).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, -0.1745F, 0.0F));

		PartDefinition cube_r450 = bone2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(101, 30).addBox(-0.5F, -0.5728F, -0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, 2.0501F, 0.3884F, -0.0179F));

		PartDefinition cube_r451 = bone2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(101, 27).addBox(-0.5F, -0.8173F, 0.045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, -2.8804F, 0.3884F, -0.0179F));

		PartDefinition cube_r452 = bone2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(84, 21).addBox(-0.5F, -0.4202F, -0.7769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, -2.4615F, 0.3884F, -0.0179F));

		PartDefinition cube_r453 = bone2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(21, 84).addBox(-0.5F, -0.7544F, -1.577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1672F, 4.429F, -1.1353F, -1.9379F, 0.3884F, -0.0179F));

		PartDefinition cube_r454 = bone2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(89, 46).addBox(-0.8804F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.3325F, -0.1932F, 0.5073F));

		PartDefinition cube_r455 = bone2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(88, 12).addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F))
				.texOffs(84, 17).addBox(-0.5F, -0.45F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.6463F, 1.9965F, 0.6158F, -1.9346F, -0.1932F, 0.5073F));

		PartDefinition cube_r456 = bone2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(88, 75).addBox(-0.8804F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1686F, 1.3632F, 0.5289F, -1.507F, -0.1932F, 0.5073F));

		PartDefinition cube_r457 = bone2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(104, 96).addBox(-0.9F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.6487F, -0.0304F, -0.0149F));

		PartDefinition cube_r458 = bone2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(104, 63).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4244F, 1.024F, -0.2161F, -0.9977F, -0.0304F, -0.0149F));

		PartDefinition cube_r459 = bone2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(101, 24).addBox(-0.9886F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, -1.027F, -0.1932F, 0.2455F));

		PartDefinition cube_r460 = bone2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(14, 84).addBox(-0.5F, -0.3003F, -0.7645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, -0.0873F, 0.0F));

		PartDefinition cube_r461 = bone2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(106, 39).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2936F, 0.4595F, -4.2511F, 1.1694F, -0.0873F, 0.0F));

		PartDefinition cube_r462 = bone2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(35, 106).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2264F, 0.6733F, -3.4832F, -0.2705F, -0.0873F, 0.0F));

		PartDefinition cube_r463 = bone2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(30, 106).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1574F, 0.7846F, -2.694F, -0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r464 = bone2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(63, 83).addBox(-0.5F, -0.5503F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r465 = bone2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(20, 101).addBox(-0.5F, -1.0579F, -0.6747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0956F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r466 = bone2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(55, 104).addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r467 = bone2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(56, 83).addBox(-1.0136F, -0.1148F, -0.8722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5F, 0.6253F, 0.3661F, 0.1151F, -0.1412F, 0.2516F));

		PartDefinition bone4 = body1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.2749F, 3.9153F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r468 = bone4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(96, 32).mirror().addBox(-0.5F, -0.7379F, -0.8859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, -1.9284F, 0.0693F, -0.1225F));

		PartDefinition cube_r469 = bone4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-0.5F, 0.4937F, -0.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, -2.4083F, 0.0693F, -0.1225F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(34, 100).mirror().addBox(-0.5F, -0.9958F, -0.8962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, -1.972F, 0.0693F, -0.1225F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.5F, -1.0712F, 0.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, -0.6194F, 0.0693F, -0.1225F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(100, 11).mirror().addBox(-0.5F, -0.3674F, -0.5043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, 1.8241F, 0.0693F, -0.1225F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-0.5F, -0.4832F, 0.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, -3.1065F, 0.0693F, -0.1225F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(106, 26).mirror().addBox(-0.5F, -1.2003F, -0.2863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.075F, -0.2005F, 1.6481F, 2.5222F, 0.0693F, -0.1225F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(106, 51).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(1.0691F, 1.8976F, 2.0865F, -2.4348F, 0.3222F, -0.4341F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.1048F, -0.5051F, -0.0296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, -1.2567F, 0.3222F, -0.4341F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(105, 10).mirror().addBox(-0.1048F, -1.5986F, -0.7405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, -2.7403F, 0.3222F, -0.4341F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(28, 84).mirror().addBox(-0.1048F, -0.5233F, -1.9233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, 2.6703F, 0.3222F, -0.4341F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(101, 33).mirror().addBox(-0.1048F, -0.3689F, -0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.1002F, 1.3661F, 2.4608F, 0.3222F, -0.4341F));

		PartDefinition cube_r480 = bone4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-0.0114F, -0.7921F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 2.1233F, 0.1932F, -0.2455F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(104, 103).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 1.5708F, 0.1745F, 0.0F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(101, 30).mirror().addBox(-0.5F, -0.5728F, -0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, 2.0501F, -0.3884F, 0.0179F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(101, 27).mirror().addBox(-0.5F, -0.8173F, 0.045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, -2.8804F, -0.3884F, 0.0179F));

		PartDefinition cube_r484 = bone4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(84, 21).mirror().addBox(-0.5F, -0.4202F, -0.7769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, -2.4615F, -0.3884F, 0.0179F));

		PartDefinition cube_r485 = bone4.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(-0.5F, -0.7544F, -1.577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 4.429F, -1.1353F, -1.9379F, -0.3884F, 0.0179F));

		PartDefinition cube_r486 = bone4.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.1196F, -0.7235F, 0.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.3325F, 0.1932F, -0.5073F));

		PartDefinition cube_r487 = bone4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(84, 17).mirror().addBox(-0.5F, -0.45F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.6463F, 1.9965F, 0.6158F, -1.9346F, 0.1932F, -0.5073F));

		PartDefinition cube_r488 = bone4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(88, 75).mirror().addBox(-0.1196F, 0.0548F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1686F, 1.3632F, 0.5289F, -1.507F, 0.1932F, -0.5073F));

		PartDefinition cube_r489 = bone4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(104, 96).mirror().addBox(-0.1F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.6487F, 0.0304F, 0.0149F));

		PartDefinition cube_r490 = bone4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(104, 63).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.024F, -0.2161F, -0.9977F, 0.0304F, 0.0149F));

		PartDefinition cube_r491 = bone4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-0.0114F, 0.2024F, -0.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, -1.027F, 0.1932F, -0.2455F));

		PartDefinition cube_r492 = bone4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(14, 84).mirror().addBox(-0.5F, -0.3003F, -0.7645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.4014F, 0.0873F, 0.0F));

		PartDefinition cube_r493 = bone4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(106, 39).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2936F, 0.4595F, -4.2511F, 1.1694F, 0.0873F, 0.0F));

		PartDefinition cube_r494 = bone4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(35, 106).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2264F, 0.6733F, -3.4832F, -0.2705F, 0.0873F, 0.0F));

		PartDefinition cube_r495 = bone4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(30, 106).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1574F, 0.7846F, -2.694F, -0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r496 = bone4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(63, 83).mirror().addBox(-0.5F, -0.5503F, -1.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.529F, -0.8955F, -0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r497 = bone4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(20, 101).mirror().addBox(-0.5F, -1.0579F, -0.6747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.699F, -0.0956F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r498 = bone4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(-0.5F, -0.1328F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2552F, 0.5122F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r499 = bone4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(56, 83).mirror().addBox(0.0136F, -0.1148F, -0.8722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6253F, 0.3661F, 0.1151F, 0.1412F, -0.2516F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7781F, 0.5416F, 2.9737F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r500 = bone.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(55, 50).addBox(-0.3F, -1.0F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0987F, 3.7102F, -0.2631F, 2.1256F, -0.1593F, 0.488F));

		PartDefinition cube_r501 = bone.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(84, 38).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.637F, 0.3456F, -0.8471F, 0.8092F, 0.1178F, -0.4087F));

		PartDefinition cube_r502 = bone.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(41, 69).addBox(-0.5898F, -0.2749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.2387F, 0.0876F, -0.4404F));

		PartDefinition cube_r503 = bone.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(45, 103).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.223F, -1.3716F, 3.6252F, -0.1612F, 0.0851F, -0.4847F));

		PartDefinition cube_r504 = bone.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(81, 70).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1101F, -1.6666F, 1.7807F, 0.1005F, 0.0851F, -0.4847F));

		PartDefinition cube_r505 = bone.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(40, 103).addBox(-0.9F, 0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(105, 91).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.488F, -0.7795F, -1.5681F, -0.7586F, 0.1819F, -0.3831F));

		PartDefinition cube_r506 = bone.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(85, 59).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.1415F, -0.925F, 0.3394F, 0.1005F, 0.0851F, -0.4847F));

		PartDefinition cube_r507 = bone.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(85, 4).addBox(-0.5768F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3908F, -0.4928F, -0.3403F, 0.1878F, 0.0851F, -0.4847F));

		PartDefinition cube_r508 = bone.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(81, 78).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.3987F, 2.4689F, -1.8713F, 0.8501F, 0.1714F, -0.4248F));

		PartDefinition cube_r509 = bone.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(25, 105).addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.258F, 2.4098F, -2.4714F, 2.5692F, 0.1714F, -0.4248F));

		PartDefinition cube_r510 = bone.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(5, 94).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8546F, 1.4289F, -2.2592F, -3.0158F, 0.1714F, -0.4248F));

		PartDefinition cube_r511 = bone.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(81, 13).addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.3219F, 0.2775F, -2.3222F, -2.7104F, 0.1714F, -0.4248F));

		PartDefinition cube_r512 = bone.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(77, 44).addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3851F, 0.2797F, -1.9947F, -1.0087F, 0.1714F, -0.4248F));

		PartDefinition bone3 = chest1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8496F, 0.5416F, 2.9737F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r513 = bone3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-0.7F, -1.0F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0987F, 3.7102F, -0.2631F, 2.1256F, 0.1593F, -0.488F));

		PartDefinition cube_r514 = bone3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.637F, 0.3456F, -0.8471F, 0.8092F, -0.1178F, 0.4087F));

		PartDefinition cube_r515 = bone3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-0.4102F, -0.2749F, -0.9806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.2387F, -0.0876F, 0.4404F));

		PartDefinition cube_r516 = bone3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.223F, -1.3716F, 3.6252F, -0.1612F, -0.0851F, 0.4847F));

		PartDefinition cube_r517 = bone3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(81, 70).mirror().addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1101F, -1.6666F, 1.7807F, 0.1005F, -0.0851F, 0.4847F));

		PartDefinition cube_r518 = bone3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.1F, 0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false)
				.texOffs(105, 91).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.488F, -0.7795F, -1.5681F, -0.7586F, -0.1819F, 0.3831F));

		PartDefinition cube_r519 = bone3.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.1415F, -0.925F, 0.3394F, 0.1005F, -0.0851F, 0.4847F));

		PartDefinition cube_r520 = bone3.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(85, 4).mirror().addBox(-0.4232F, -0.3534F, 0.5223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.3908F, -0.4928F, -0.3403F, 0.1878F, -0.0851F, 0.4847F));

		PartDefinition cube_r521 = bone3.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(81, 78).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 2.4689F, -1.8713F, 0.8501F, -0.1714F, 0.4248F));

		PartDefinition cube_r522 = bone3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(25, 105).mirror().addBox(-0.5F, 0.1F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.258F, 2.4098F, -2.4714F, 2.5692F, -0.1714F, 0.4248F));

		PartDefinition cube_r523 = bone3.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8546F, 1.4289F, -2.2592F, -3.0158F, -0.1714F, 0.4248F));

		PartDefinition cube_r524 = bone3.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(81, 13).mirror().addBox(-0.5F, -0.775F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.3219F, 0.2775F, -2.3222F, -2.7104F, -0.1714F, 0.4248F));

		PartDefinition cube_r525 = bone3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(77, 44).mirror().addBox(-0.5F, -1.05F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, 0.2797F, -1.9947F, -1.0087F, -0.1714F, 0.4248F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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